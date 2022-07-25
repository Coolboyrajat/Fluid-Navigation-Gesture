package p190io.objectbox;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import p190io.objectbox.annotation.apihint.Experimental;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.ideasonly.ModelUpdate;

/* renamed from: io.objectbox.BoxStoreBuilder */
public class BoxStoreBuilder {
    public static final int DEFAULT_MAX_DB_SIZE_KBYTE = 1048576;
    public static final String DEFAULT_NAME = "objectbox";

    /* renamed from: android  reason: collision with root package name */
    private boolean f8285android;
    private File baseDirectory;
    Object context;
    int debugFlags;
    boolean debugRelations;
    File directory;
    final List<EntityInfo> entityInfoList;
    TxCallback failedReadTxAttemptCallback;
    private Factory<InputStream> initialDbFileFactory;
    int maxReaders;
    long maxSizeInKByte;
    final byte[] model;
    ModelUpdate modelUpdate;
    private String name;
    int queryAttempts;
    Object relinker;

    private BoxStoreBuilder() {
        this.maxSizeInKByte = 1048576;
        this.entityInfoList = new ArrayList();
        this.model = null;
    }

    @Internal
    public BoxStoreBuilder(byte[] bArr) {
        this.maxSizeInKByte = 1048576;
        this.entityInfoList = new ArrayList();
        this.model = bArr;
        if (bArr == null) {
            throw new IllegalArgumentException("Model may not be null");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.io.Closeable} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void checkProvisionInitialDbFile() {
        /*
            r6 = this;
            io.objectbox.Factory<java.io.InputStream> r0 = r6.initialDbFileFactory
            if (r0 == 0) goto L_0x0070
            java.io.File r0 = r6.directory
            java.lang.String r0 = p190io.objectbox.BoxStore.getCanonicalPath(r0)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "data.mdb"
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0070
            r0 = 0
            io.objectbox.Factory<java.io.InputStream> r2 = r6.initialDbFileFactory     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            java.lang.Object r2 = r2.provide()     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            if (r2 == 0) goto L_0x0050
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0045, all -> 0x0042 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0045, all -> 0x0042 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0045, all -> 0x0042 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0045, all -> 0x0042 }
            p179e.p180a.p181a.p183b.C2983b.m11467a(r3, r2)     // Catch:{ Exception -> 0x003f, all -> 0x003b }
            p179e.p180a.p181a.p183b.C2983b.m11468a(r2)
            p179e.p180a.p181a.p183b.C2983b.m11468a(r3)
            goto L_0x0070
        L_0x003b:
            r0 = move-exception
            r1 = r0
            r0 = r2
            goto L_0x0043
        L_0x003f:
            r0 = move-exception
            r1 = r0
            goto L_0x0047
        L_0x0042:
            r1 = move-exception
        L_0x0043:
            r2 = r3
            goto L_0x0069
        L_0x0045:
            r1 = move-exception
            r2 = r0
        L_0x0047:
            r0 = r3
            goto L_0x005d
        L_0x0049:
            r1 = move-exception
            goto L_0x0069
        L_0x004b:
            r1 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
            goto L_0x005d
        L_0x0050:
            io.objectbox.exception.DbException r1 = new io.objectbox.exception.DbException     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.String r3 = "Factory did not provide a resource"
            r1.<init>(r3)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            throw r1     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
        L_0x0058:
            r1 = move-exception
            r2 = r0
            goto L_0x0069
        L_0x005b:
            r1 = move-exception
            r2 = r0
        L_0x005d:
            io.objectbox.exception.DbException r3 = new io.objectbox.exception.DbException     // Catch:{ all -> 0x0065 }
            java.lang.String r4 = "Could not provision initial data file"
            r3.<init>((java.lang.String) r4, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0065 }
            throw r3     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
        L_0x0069:
            p179e.p180a.p181a.p183b.C2983b.m11468a(r0)
            p179e.p180a.p181a.p183b.C2983b.m11468a(r2)
            throw r1
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p190io.objectbox.BoxStoreBuilder.checkProvisionInitialDbFile():void");
    }

    public static BoxStoreBuilder createDebugWithoutModel() {
        return new BoxStoreBuilder();
    }

    private static String dbName(String str) {
        return str != null ? str : DEFAULT_NAME;
    }

    static File getAndroidBaseDir(Object obj) {
        return new File(getAndroidFilesDir(obj), DEFAULT_NAME);
    }

    static File getAndroidDbDir(Object obj, String str) {
        return new File(getAndroidBaseDir(obj), dbName(str));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.io.File} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File getAndroidFilesDir(java.lang.Object r4) {
        /*
            java.lang.Class r0 = r4.getClass()     // Catch:{ Exception -> 0x0040 }
            java.lang.String r1 = "getFilesDir"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0040 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch:{ Exception -> 0x0040 }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0040 }
            java.lang.Object r1 = r0.invoke(r4, r1)     // Catch:{ Exception -> 0x0040 }
            java.io.File r1 = (java.io.File) r1     // Catch:{ Exception -> 0x0040 }
            if (r1 != 0) goto L_0x0027
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ Exception -> 0x0040 }
            java.lang.String r3 = "getFilesDir() returned null - retrying once..."
            r1.println(r3)     // Catch:{ Exception -> 0x0040 }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0040 }
            java.lang.Object r4 = r0.invoke(r4, r1)     // Catch:{ Exception -> 0x0040 }
            r1 = r4
            java.io.File r1 = (java.io.File) r1     // Catch:{ Exception -> 0x0040 }
        L_0x0027:
            if (r1 == 0) goto L_0x0038
            boolean r4 = r1.exists()
            if (r4 == 0) goto L_0x0030
            return r1
        L_0x0030:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Android files dir does not exist"
            r4.<init>(r0)
            throw r4
        L_0x0038:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Android files dir is null"
            r4.<init>(r0)
            throw r4
        L_0x0040:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not init with given Android context (must be sub class of android.content.Context)"
            r0.<init>(r1, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p190io.objectbox.BoxStoreBuilder.getAndroidFilesDir(java.lang.Object):java.io.File");
    }

    private Object getApplicationContext(Object obj) {
        try {
            return obj.getClass().getMethod("getApplicationContext", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException("context must be a valid Android Context", e);
        }
    }

    static File getDbDir(File file, String str) {
        String dbName = dbName(str);
        return file != null ? new File(file, dbName) : new File(dbName);
    }

    public BoxStoreBuilder androidContext(Object obj) {
        if (obj != null) {
            this.context = getApplicationContext(obj);
            File androidBaseDir = getAndroidBaseDir(obj);
            if (!androidBaseDir.exists()) {
                androidBaseDir.mkdir();
                if (!androidBaseDir.exists()) {
                    throw new RuntimeException("Could not init Android base dir at " + androidBaseDir.getAbsolutePath());
                }
            }
            if (androidBaseDir.isDirectory()) {
                this.baseDirectory = androidBaseDir;
                this.f8285android = true;
                return this;
            }
            throw new RuntimeException("Android base dir is not a dir: " + androidBaseDir.getAbsolutePath());
        }
        throw new NullPointerException("Context may not be null");
    }

    public BoxStoreBuilder androidReLinker(Object obj) {
        if (this.context == null) {
            throw new IllegalArgumentException("Set a Context using androidContext(context) first");
        } else if (obj != null) {
            this.relinker = obj;
            return this;
        } else {
            throw new NullPointerException("ReLinkerInstance may not be null");
        }
    }

    public BoxStoreBuilder baseDirectory(File file) {
        if (this.directory == null) {
            this.baseDirectory = file;
            return this;
        }
        throw new IllegalArgumentException("Already has directory, cannot assign base directory");
    }

    public BoxStore build() {
        if (this.directory == null) {
            this.name = dbName(this.name);
            this.directory = getDbDir(this.baseDirectory, this.name);
        }
        checkProvisionInitialDbFile();
        return new BoxStore(this);
    }

    public BoxStore buildDefault() {
        BoxStore build = build();
        BoxStore.setDefault(build);
        return build;
    }

    public BoxStoreBuilder debugFlags(int i) {
        this.debugFlags = i;
        return this;
    }

    public BoxStoreBuilder debugRelations() {
        this.debugRelations = true;
        return this;
    }

    @Deprecated
    public BoxStoreBuilder debugTransactions() {
        this.debugFlags |= 3;
        return this;
    }

    public BoxStoreBuilder directory(File file) {
        if (this.name != null) {
            throw new IllegalArgumentException("Already has name, cannot assign directory");
        } else if (this.f8285android || this.baseDirectory == null) {
            this.directory = file;
            return this;
        } else {
            throw new IllegalArgumentException("Already has base directory, cannot assign directory");
        }
    }

    @Internal
    public void entity(EntityInfo entityInfo) {
        this.entityInfoList.add(entityInfo);
    }

    @Experimental
    public BoxStoreBuilder failedReadTxAttemptCallback(TxCallback txCallback) {
        this.failedReadTxAttemptCallback = txCallback;
        return this;
    }

    @Experimental
    public BoxStoreBuilder initialDbFile(Factory<InputStream> factory) {
        this.initialDbFileFactory = factory;
        return this;
    }

    @Experimental
    public BoxStoreBuilder initialDbFile(final File file) {
        return initialDbFile((Factory<InputStream>) new Factory<InputStream>() {
            public InputStream provide() {
                return new FileInputStream(file);
            }
        });
    }

    public BoxStoreBuilder maxReaders(int i) {
        this.maxReaders = i;
        return this;
    }

    public BoxStoreBuilder maxSizeInKByte(long j) {
        this.maxSizeInKByte = j;
        return this;
    }

    /* access modifiers changed from: package-private */
    public BoxStoreBuilder modelUpdate(ModelUpdate modelUpdate2) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public BoxStoreBuilder name(String str) {
        if (this.directory != null) {
            throw new IllegalArgumentException("Already has directory, cannot assign name");
        } else if (str.contains("/") || str.contains("\\")) {
            throw new IllegalArgumentException("Name may not contain (back) slashes. Use baseDirectory() or directory() to configure alternative directories");
        } else {
            this.name = str;
            return this;
        }
    }

    @Experimental
    public BoxStoreBuilder queryAttempts(int i) {
        if (i >= 1) {
            this.queryAttempts = i;
            return this;
        }
        throw new IllegalArgumentException("Query attempts must >= 1");
    }
}
