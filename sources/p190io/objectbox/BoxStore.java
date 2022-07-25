package p190io.objectbox;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p179e.p180a.p181a.p182a.C2977b;
import p190io.objectbox.annotation.apihint.Experimental;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.converter.PropertyConverter;
import p190io.objectbox.exception.DbException;
import p190io.objectbox.exception.DbExceptionListener;
import p190io.objectbox.exception.DbSchemaException;
import p190io.objectbox.internal.NativeLibraryLoader;
import p190io.objectbox.internal.ObjectBoxThreadPool;
import p190io.objectbox.reactive.SubscriptionBuilder;

/* renamed from: io.objectbox.BoxStore */
public class BoxStore implements Closeable {
    public static final String JNI_VERSION = "2.3.4";
    private static final String VERSION = "2.3.4-2019-03-19";
    public static Object context;
    private static BoxStore defaultStore;
    private static final Set<String> openFiles = new HashSet();
    public static Object relinker;
    final ThreadLocal<Transaction> activeTx = new ThreadLocal<>();
    private final int[] allEntityTypeIds;
    private final Map<Class, Box> boxes = new ConcurrentHashMap();
    private final String canonicalPath;
    private final C2977b<Class> classByEntityTypeId = new C2977b<>();
    private boolean closed;
    volatile int commitCount;
    private final Map<Class, String> dbNameByClass = new HashMap();
    final boolean debugRelations;
    final boolean debugTxRead;
    final boolean debugTxWrite;
    private final File directory;
    private final Map<Class, Integer> entityTypeIdByClass = new HashMap();
    private final TxCallback failedReadTxAttemptCallback;
    private final long handle;
    private int objectBrowserPort;
    private final ObjectClassPublisher objectClassPublisher;
    private final Map<Class, EntityInfo> propertiesByClass = new HashMap();
    private final int queryAttempts;
    private final ExecutorService threadPool = new ObjectBoxThreadPool(this);
    private final Set<Transaction> transactions = Collections.newSetFromMap(new WeakHashMap());
    final Object txCommitCountLock = new Object();

    BoxStore(BoxStoreBuilder boxStoreBuilder) {
        BoxStoreBuilder boxStoreBuilder2 = boxStoreBuilder;
        context = boxStoreBuilder2.context;
        relinker = boxStoreBuilder2.relinker;
        NativeLibraryLoader.ensureLoaded();
        this.directory = boxStoreBuilder2.directory;
        this.canonicalPath = getCanonicalPath(this.directory);
        verifyNotAlreadyOpen(this.canonicalPath);
        this.handle = nativeCreate(this.canonicalPath, boxStoreBuilder2.maxSizeInKByte, boxStoreBuilder2.maxReaders, boxStoreBuilder2.model);
        int i = boxStoreBuilder2.debugFlags;
        if (i != 0) {
            nativeSetDebugFlags(this.handle, i);
            this.debugTxRead = (i & 1) != 0;
            this.debugTxWrite = (i & 2) != 0;
        } else {
            this.debugTxWrite = false;
            this.debugTxRead = false;
        }
        this.debugRelations = boxStoreBuilder2.debugRelations;
        for (EntityInfo next : boxStoreBuilder2.entityInfoList) {
            try {
                this.dbNameByClass.put(next.getEntityClass(), next.getDbName());
                int nativeRegisterEntityClass = nativeRegisterEntityClass(this.handle, next.getDbName(), next.getEntityClass());
                this.entityTypeIdByClass.put(next.getEntityClass(), Integer.valueOf(nativeRegisterEntityClass));
                this.classByEntityTypeId.mo9099a((long) nativeRegisterEntityClass, next.getEntityClass());
                this.propertiesByClass.put(next.getEntityClass(), next);
                Property[] allProperties = next.getAllProperties();
                int length = allProperties.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Property property = allProperties[i2];
                        if (property.customType != null) {
                            if (property.converterClass != null) {
                                nativeRegisterCustomType(this.handle, nativeRegisterEntityClass, 0, property.dbName, property.converterClass, property.customType);
                            } else {
                                throw new RuntimeException("No converter class for custom type of " + property);
                            }
                        }
                        i2++;
                    }
                }
            } catch (RuntimeException e) {
                throw new RuntimeException("Could not setup up entity " + next.getEntityClass(), e);
            }
        }
        int b = this.classByEntityTypeId.mo9102b();
        this.allEntityTypeIds = new int[b];
        long[] a = this.classByEntityTypeId.mo9101a();
        for (int i3 = 0; i3 < b; i3++) {
            this.allEntityTypeIds[i3] = (int) a[i3];
        }
        this.objectClassPublisher = new ObjectClassPublisher(this);
        this.failedReadTxAttemptCallback = boxStoreBuilder2.failedReadTxAttemptCallback;
        int i4 = boxStoreBuilder2.queryAttempts;
        this.queryAttempts = i4 < 1 ? 1 : i4;
    }

    private void checkOpen() {
        if (this.closed) {
            throw new IllegalStateException("Store is closed");
        }
    }

    private void checkThreadTermination() {
        try {
            if (!this.threadPool.awaitTermination(1, TimeUnit.SECONDS)) {
                int activeCount = Thread.activeCount();
                System.err.println("Thread pool not terminated in time; printing stack traces...");
                Thread[] threadArr = new Thread[(activeCount + 2)];
                int enumerate = Thread.enumerate(threadArr);
                for (int i = 0; i < enumerate; i++) {
                    PrintStream printStream = System.err;
                    printStream.println("Thread: " + threadArr[i].getName());
                    Thread.dumpStack();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static synchronized boolean clearDefaultStore() {
        boolean z;
        synchronized (BoxStore.class) {
            z = defaultStore != null;
            defaultStore = null;
        }
        return z;
    }

    public static boolean deleteAllFiles(File file) {
        if (!file.exists()) {
            return true;
        }
        if (!isFileOpen(getCanonicalPath(file))) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            for (File file2 : listFiles) {
                if (!file2.delete() && file2.exists()) {
                    return false;
                }
            }
            return file.delete();
        }
        throw new IllegalStateException("Cannot delete files: store is still open");
    }

    public static boolean deleteAllFiles(File file, String str) {
        return deleteAllFiles(BoxStoreBuilder.getDbDir(file, str));
    }

    public static boolean deleteAllFiles(Object obj, String str) {
        return deleteAllFiles(BoxStoreBuilder.getAndroidDbDir(obj, str));
    }

    static String getCanonicalPath(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new DbException("Is not a directory: " + file.getAbsolutePath());
            }
        } else if (!file.mkdirs()) {
            throw new DbException("Could not create directory: " + file.getAbsolutePath());
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException e) {
            throw new DbException("Could not verify dir", (Throwable) e);
        }
    }

    public static synchronized BoxStore getDefault() {
        BoxStore boxStore;
        synchronized (BoxStore.class) {
            if (defaultStore != null) {
                boxStore = defaultStore;
            } else {
                throw new IllegalStateException("Please call buildDefault() before calling this method");
            }
        }
        return boxStore;
    }

    public static String getVersion() {
        return VERSION;
    }

    public static String getVersionNative() {
        NativeLibraryLoader.ensureLoaded();
        return nativeGetVersion();
    }

    private static boolean isFileOpen(String str) {
        boolean contains;
        synchronized (openFiles) {
            int i = 0;
            while (i < 5) {
                if (openFiles.contains(str)) {
                    i++;
                    System.gc();
                    System.runFinalization();
                    System.gc();
                    System.runFinalization();
                    try {
                        openFiles.wait(100);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            contains = openFiles.contains(str);
        }
        return contains;
    }

    public static boolean isObjectBrowserAvailable() {
        NativeLibraryLoader.ensureLoaded();
        return nativeIsObjectBrowserAvailable();
    }

    static native long nativeBeginReadTx(long j);

    static native long nativeBeginTx(long j);

    static native int nativeCleanStaleReadTransactions(long j);

    static native long nativeCreate(String str, long j, int i, byte[] bArr);

    static native void nativeDelete(long j);

    static native String nativeDiagnose(long j);

    static native void nativeDropAllData(long j);

    static native String nativeGetVersion();

    static native boolean nativeIsObjectBrowserAvailable();

    static native void nativeRegisterCustomType(long j, int i, int i2, String str, Class<? extends PropertyConverter> cls, Class cls2);

    static native int nativeRegisterEntityClass(long j, String str, Class cls);

    static native void nativeSetDbExceptionListener(long j, DbExceptionListener dbExceptionListener);

    static native void nativeSetDebugFlags(long j, int i);

    static native String nativeStartObjectBrowser(long j, String str, int i);

    static synchronized void setDefault(BoxStore boxStore) {
        synchronized (BoxStore.class) {
            if (defaultStore == null) {
                defaultStore = boxStore;
            } else {
                throw new IllegalStateException("Default store was already built before. ");
            }
        }
    }

    public static native void testUnalignedMemoryAccess();

    private static void verifyNotAlreadyOpen(String str) {
        synchronized (openFiles) {
            isFileOpen(str);
            if (!openFiles.add(str)) {
                throw new DbException("Another BoxStore is still open for this directory: " + str + ". Hint: for most apps it's recommended to keep a BoxStore for the app's life time.");
            }
        }
    }

    private void verifyObjectBrowserNotRunning() {
        if (this.objectBrowserPort != 0) {
            throw new DbException("ObjectBrowser is already running at port " + this.objectBrowserPort);
        }
    }

    @Internal
    public Transaction beginReadTx() {
        checkOpen();
        int i = this.commitCount;
        if (this.debugTxRead) {
            PrintStream printStream = System.out;
            printStream.println("Begin read TX with commit count " + i);
        }
        Transaction transaction = new Transaction(this, nativeBeginReadTx(this.handle), i);
        synchronized (this.transactions) {
            this.transactions.add(transaction);
        }
        return transaction;
    }

    @Internal
    public Transaction beginTx() {
        checkOpen();
        int i = this.commitCount;
        if (this.debugTxWrite) {
            PrintStream printStream = System.out;
            printStream.println("Begin TX with commit count " + i);
        }
        Transaction transaction = new Transaction(this, nativeBeginTx(this.handle), i);
        synchronized (this.transactions) {
            this.transactions.add(transaction);
        }
        return transaction;
    }

    public <T> Box<T> boxFor(Class<T> cls) {
        Box<T> box;
        Box<T> box2 = this.boxes.get(cls);
        if (box2 != null) {
            return box2;
        }
        if (this.dbNameByClass.containsKey(cls)) {
            synchronized (this.boxes) {
                box = this.boxes.get(cls);
                if (box == null) {
                    box = new Box<>(this, cls);
                    this.boxes.put(cls, box);
                }
            }
            return box;
        }
        throw new IllegalArgumentException(cls + " is not a known entity. Please add it and trigger generation again.");
    }

    public <T> T callInReadTx(Callable<T> callable) {
        if (this.activeTx.get() == null) {
            Transaction beginReadTx = beginReadTx();
            this.activeTx.set(beginReadTx);
            try {
                T call = callable.call();
                this.activeTx.remove();
                for (Box readTxFinished : this.boxes.values()) {
                    readTxFinished.readTxFinished(beginReadTx);
                }
                beginReadTx.close();
                return call;
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException("Callable threw exception", e2);
            } catch (Throwable th) {
                this.activeTx.remove();
                for (Box readTxFinished2 : this.boxes.values()) {
                    readTxFinished2.readTxFinished(beginReadTx);
                }
                beginReadTx.close();
                throw th;
            }
        } else {
            try {
                return callable.call();
            } catch (Exception e3) {
                throw new RuntimeException("Callable threw exception", e3);
            }
        }
    }

    @Experimental
    public <T> T callInReadTxWithRetry(Callable<T> callable, int i, int i2, boolean z) {
        int i3 = 1;
        if (i == 1) {
            return callInReadTx(callable);
        }
        if (i >= 1) {
            long j = (long) i2;
            DbException e = null;
            while (i3 <= i) {
                try {
                    return callInReadTx(callable);
                } catch (DbException e2) {
                    e = e2;
                    String diagnose = diagnose();
                    String str = i3 + " of " + i + " attempts of calling a read TX failed:";
                    if (z) {
                        System.err.println(str);
                        e.printStackTrace();
                        System.err.println(diagnose);
                        System.err.flush();
                        System.gc();
                        System.runFinalization();
                        cleanStaleReadTransactions();
                    }
                    TxCallback txCallback = this.failedReadTxAttemptCallback;
                    if (txCallback != null) {
                        txCallback.txFinished(null, new DbException(str + " \n" + diagnose, (Throwable) e));
                    }
                    try {
                        Thread.sleep(j);
                        j *= 2;
                        i3++;
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                        throw e;
                    }
                }
            }
            throw e;
        }
        throw new IllegalArgumentException("Illegal value of attempts: " + i);
    }

    public <R> R callInTx(Callable<R> callable) {
        Transaction transaction = this.activeTx.get();
        if (transaction == null) {
            Transaction beginTx = beginTx();
            this.activeTx.set(beginTx);
            try {
                R call = callable.call();
                beginTx.commit();
                return call;
            } finally {
                this.activeTx.remove();
                beginTx.close();
            }
        } else if (!transaction.isReadOnly()) {
            return callable.call();
        } else {
            throw new IllegalStateException("Cannot start a transaction while a read only transaction is active");
        }
    }

    public <R> void callInTxAsync(final Callable<R> callable, final TxCallback<R> txCallback) {
        this.threadPool.submit(new Runnable() {
            public void run() {
                try {
                    Object callInTx = BoxStore.this.callInTx(callable);
                    if (txCallback != null) {
                        txCallback.txFinished(callInTx, (Throwable) null);
                    }
                } catch (Throwable th) {
                    TxCallback txCallback = txCallback;
                    if (txCallback != null) {
                        txCallback.txFinished(null, th);
                    }
                }
            }
        });
    }

    public <R> R callInTxNoException(Callable<R> callable) {
        try {
            return callInTx(callable);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int cleanStaleReadTransactions() {
        return nativeCleanStaleReadTransactions(this.handle);
    }

    public void close() {
        boolean z;
        ArrayList<Transaction> arrayList;
        synchronized (this) {
            z = this.closed;
            if (!this.closed) {
                this.closed = true;
                synchronized (this.transactions) {
                    arrayList = new ArrayList<>(this.transactions);
                }
                for (Transaction close : arrayList) {
                    close.close();
                }
                if (this.handle != 0) {
                    nativeDelete(this.handle);
                }
                this.threadPool.shutdown();
                checkThreadTermination();
            }
        }
        if (!z) {
            synchronized (openFiles) {
                openFiles.remove(this.canonicalPath);
                openFiles.notifyAll();
            }
        }
    }

    public void closeThreadResources() {
        for (Box closeThreadResources : this.boxes.values()) {
            closeThreadResources.closeThreadResources();
        }
    }

    public boolean deleteAllFiles() {
        if (this.closed) {
            return deleteAllFiles(this.directory);
        }
        throw new IllegalStateException("Store must be closed");
    }

    public String diagnose() {
        return nativeDiagnose(this.handle);
    }

    /* access modifiers changed from: package-private */
    public void dropAllData() {
        nativeDropAllData(this.handle);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        close();
        super.finalize();
    }

    public Collection<Class> getAllEntityClasses() {
        return this.dbNameByClass.keySet();
    }

    /* access modifiers changed from: package-private */
    @Internal
    public int[] getAllEntityTypeIds() {
        return this.allEntityTypeIds;
    }

    /* access modifiers changed from: package-private */
    public String getDbName(Class cls) {
        return this.dbNameByClass.get(cls);
    }

    /* access modifiers changed from: package-private */
    @Internal
    public Class getEntityClassOrThrow(int i) {
        Class a = this.classByEntityTypeId.mo9098a((long) i);
        if (a != null) {
            return a;
        }
        throw new DbSchemaException("No entity registered for type ID " + i);
    }

    /* access modifiers changed from: package-private */
    @Internal
    public EntityInfo getEntityInfo(Class cls) {
        return this.propertiesByClass.get(cls);
    }

    /* access modifiers changed from: package-private */
    public Integer getEntityTypeId(Class cls) {
        return this.entityTypeIdByClass.get(cls);
    }

    @Internal
    public int getEntityTypeIdOrThrow(Class cls) {
        Integer num = this.entityTypeIdByClass.get(cls);
        if (num != null) {
            return num.intValue();
        }
        throw new DbSchemaException("No entity registered for " + cls);
    }

    @Experimental
    public int getObjectBrowserPort() {
        return this.objectBrowserPort;
    }

    @Internal
    public TxCallback internalFailedReadTxAttemptCallback() {
        return this.failedReadTxAttemptCallback;
    }

    /* access modifiers changed from: package-private */
    @Internal
    public long internalHandle() {
        return this.handle;
    }

    @Internal
    public int internalQueryAttempts() {
        return this.queryAttempts;
    }

    @Internal
    public Future internalScheduleThread(Runnable runnable) {
        return this.threadPool.submit(runnable);
    }

    @Internal
    public ExecutorService internalThreadPool() {
        return this.threadPool;
    }

    public boolean isClosed() {
        return this.closed;
    }

    @Internal
    public boolean isDebugRelations() {
        return this.debugRelations;
    }

    /* access modifiers changed from: package-private */
    public native long nativePanicModeRemoveAllObjects(long j, int i);

    /* access modifiers changed from: package-private */
    public long panicModeRemoveAllObjects(int i) {
        return nativePanicModeRemoveAllObjects(this.handle, i);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void runInReadTx(java.lang.Runnable r4) {
        /*
            r3 = this;
            java.lang.ThreadLocal<io.objectbox.Transaction> r0 = r3.activeTx
            java.lang.Object r0 = r0.get()
            io.objectbox.Transaction r0 = (p190io.objectbox.Transaction) r0
            if (r0 != 0) goto L_0x005d
            io.objectbox.Transaction r0 = r3.beginReadTx()
            java.lang.ThreadLocal<io.objectbox.Transaction> r1 = r3.activeTx
            r1.set(r0)
            r4.run()     // Catch:{ all -> 0x0039 }
            java.lang.ThreadLocal<io.objectbox.Transaction> r4 = r3.activeTx
            r4.remove()
            java.util.Map<java.lang.Class, io.objectbox.Box> r4 = r3.boxes
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L_0x0025:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0035
            java.lang.Object r1 = r4.next()
            io.objectbox.Box r1 = (p190io.objectbox.Box) r1
            r1.readTxFinished(r0)
            goto L_0x0025
        L_0x0035:
            r0.close()
            goto L_0x0060
        L_0x0039:
            r4 = move-exception
            java.lang.ThreadLocal<io.objectbox.Transaction> r1 = r3.activeTx
            r1.remove()
            java.util.Map<java.lang.Class, io.objectbox.Box> r1 = r3.boxes
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0049:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0059
            java.lang.Object r2 = r1.next()
            io.objectbox.Box r2 = (p190io.objectbox.Box) r2
            r2.readTxFinished(r0)
            goto L_0x0049
        L_0x0059:
            r0.close()
            throw r4
        L_0x005d:
            r4.run()
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p190io.objectbox.BoxStore.runInReadTx(java.lang.Runnable):void");
    }

    public void runInTx(Runnable runnable) {
        Transaction transaction = this.activeTx.get();
        if (transaction == null) {
            Transaction beginTx = beginTx();
            this.activeTx.set(beginTx);
            try {
                runnable.run();
                beginTx.commit();
            } finally {
                this.activeTx.remove();
                beginTx.close();
            }
        } else if (!transaction.isReadOnly()) {
            runnable.run();
        } else {
            throw new IllegalStateException("Cannot start a transaction while a read only transaction is active");
        }
    }

    public void runInTxAsync(final Runnable runnable, final TxCallback<Void> txCallback) {
        this.threadPool.submit(new Runnable() {
            public void run() {
                try {
                    BoxStore.this.runInTx(runnable);
                    if (txCallback != null) {
                        txCallback.txFinished(null, (Throwable) null);
                    }
                } catch (Throwable th) {
                    TxCallback txCallback = txCallback;
                    if (txCallback != null) {
                        txCallback.txFinished(null, th);
                    }
                }
            }
        });
    }

    public void setDbExceptionListener(DbExceptionListener dbExceptionListener) {
        nativeSetDbExceptionListener(this.handle, dbExceptionListener);
    }

    /* access modifiers changed from: package-private */
    public void setDebugFlags(int i) {
        nativeSetDebugFlags(this.handle, i);
    }

    @Experimental
    public String startObjectBrowser() {
        verifyObjectBrowserNotRunning();
        int i = 8090;
        while (i < 8100) {
            try {
                String startObjectBrowser = startObjectBrowser(i);
                if (startObjectBrowser != null) {
                    return startObjectBrowser;
                }
                i++;
            } catch (DbException e) {
                if (e.getMessage() == null || !e.getMessage().contains("port")) {
                    throw e;
                }
            }
        }
        return null;
    }

    @Experimental
    public String startObjectBrowser(int i) {
        verifyObjectBrowserNotRunning();
        String nativeStartObjectBrowser = nativeStartObjectBrowser(this.handle, (String) null, i);
        if (nativeStartObjectBrowser != null) {
            this.objectBrowserPort = i;
        }
        return nativeStartObjectBrowser;
    }

    public SubscriptionBuilder<Class> subscribe() {
        return new SubscriptionBuilder<>(this.objectClassPublisher, (Object) null, this.threadPool);
    }

    public <T> SubscriptionBuilder<Class<T>> subscribe(Class<T> cls) {
        return new SubscriptionBuilder<>(this.objectClassPublisher, cls, this.threadPool);
    }

    /* access modifiers changed from: package-private */
    public void txCommitted(Transaction transaction, int[] iArr) {
        synchronized (this.txCommitCountLock) {
            this.commitCount++;
            if (this.debugTxWrite) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append("TX committed. New commit count: ");
                sb.append(this.commitCount);
                sb.append(", entity types affected: ");
                sb.append(iArr != null ? iArr.length : 0);
                printStream.println(sb.toString());
            }
        }
        for (Box txCommitted : this.boxes.values()) {
            txCommitted.txCommitted(transaction);
        }
        if (iArr != null) {
            this.objectClassPublisher.publish(iArr);
        }
    }

    @Internal
    public void unregisterTransaction(Transaction transaction) {
        synchronized (this.transactions) {
            this.transactions.remove(transaction);
        }
    }
}
