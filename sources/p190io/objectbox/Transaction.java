package p190io.objectbox;

import java.io.Closeable;
import java.io.PrintStream;
import p190io.objectbox.annotation.apihint.Experimental;
import p190io.objectbox.annotation.apihint.Internal;

@Internal
/* renamed from: io.objectbox.Transaction */
public class Transaction implements Closeable {
    @Internal
    static boolean TRACK_CREATION_STACK;
    private volatile boolean closed;
    private final Throwable creationThrowable;
    private int initialCommitCount;
    private final boolean readOnly;
    private final BoxStore store;
    private final long transaction;

    public Transaction(BoxStore boxStore, long j, int i) {
        this.store = boxStore;
        this.transaction = j;
        this.initialCommitCount = i;
        this.readOnly = nativeIsReadOnly(j);
        this.creationThrowable = TRACK_CREATION_STACK ? new Throwable() : null;
    }

    private void checkOpen() {
        if (this.closed) {
            throw new IllegalStateException("Transaction is closed");
        }
    }

    static native void nativeAbort(long j);

    static native int[] nativeCommit(long j);

    static native long nativeCreateCursor(long j, String str, Class cls);

    static native long nativeCreateKeyValueCursor(long j);

    static native void nativeDestroy(long j);

    static native boolean nativeIsActive(long j);

    static native boolean nativeIsReadOnly(long j);

    static native boolean nativeIsRecycled(long j);

    static native void nativeRecycle(long j);

    static native void nativeRenew(long j);

    static native void nativeReset(long j);

    public void abort() {
        checkOpen();
        nativeAbort(this.transaction);
    }

    public synchronized void close() {
        if (!this.closed) {
            this.closed = true;
            this.store.unregisterTransaction(this);
            if (!this.store.isClosed()) {
                nativeDestroy(this.transaction);
            }
        }
    }

    public void commit() {
        checkOpen();
        this.store.txCommitted(this, nativeCommit(this.transaction));
    }

    public void commitAndClose() {
        commit();
        close();
    }

    public <T> Cursor<T> createCursor(Class<T> cls) {
        checkOpen();
        EntityInfo entityInfo = this.store.getEntityInfo(cls);
        return entityInfo.getCursorFactory().createCursor(this, nativeCreateCursor(this.transaction, entityInfo.getDbName(), cls), this.store);
    }

    public KeyValueCursor createKeyValueCursor() {
        checkOpen();
        return new KeyValueCursor(nativeCreateKeyValueCursor(this.transaction));
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (!this.closed && nativeIsActive(this.transaction)) {
            PrintStream printStream = System.err;
            printStream.println("Transaction was not finished (initial commit count: " + this.initialCommitCount + ").");
            if (this.creationThrowable != null) {
                System.err.println("Transaction was initially created here:");
                this.creationThrowable.printStackTrace();
            }
            System.err.flush();
        }
        close();
        super.finalize();
    }

    public BoxStore getStore() {
        return this.store;
    }

    /* access modifiers changed from: package-private */
    @Internal
    public long internalHandle() {
        return this.transaction;
    }

    public boolean isActive() {
        checkOpen();
        return nativeIsActive(this.transaction);
    }

    public boolean isClosed() {
        return this.closed;
    }

    public boolean isObsolete() {
        return this.initialCommitCount != this.store.commitCount;
    }

    public boolean isReadOnly() {
        return this.readOnly;
    }

    public boolean isRecycled() {
        checkOpen();
        return nativeIsRecycled(this.transaction);
    }

    public void recycle() {
        checkOpen();
        nativeRecycle(this.transaction);
    }

    public void renew() {
        checkOpen();
        this.initialCommitCount = this.store.commitCount;
        nativeRenew(this.transaction);
    }

    @Experimental
    public void reset() {
        checkOpen();
        this.initialCommitCount = this.store.commitCount;
        nativeReset(this.transaction);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TX ");
        sb.append(Long.toString(this.transaction, 16));
        sb.append(" (");
        sb.append(this.readOnly ? "read-only" : "write");
        sb.append(", initialCommitCount=");
        sb.append(this.initialCommitCount);
        sb.append(")");
        return sb.toString();
    }
}
