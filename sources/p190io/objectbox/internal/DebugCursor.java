package p190io.objectbox.internal;

import java.io.Closeable;
import p190io.objectbox.InternalAccess;
import p190io.objectbox.Transaction;
import p190io.objectbox.annotation.apihint.Beta;

@Beta
/* renamed from: io.objectbox.internal.DebugCursor */
public class DebugCursor implements Closeable {
    private boolean closed;
    private final long handle;

    /* renamed from: tx */
    private final Transaction f7929tx;

    public DebugCursor(Transaction transaction, long j) {
        this.f7929tx = transaction;
        this.handle = j;
    }

    public static DebugCursor create(Transaction transaction) {
        return new DebugCursor(transaction, nativeCreate(InternalAccess.getHandle(transaction)));
    }

    static native long nativeCreate(long j);

    static native void nativeDestroy(long j);

    static native byte[] nativeGet(long j, byte[] bArr);

    static native byte[] nativeSeekOrNext(long j, byte[] bArr);

    public synchronized void close() {
        if (!this.closed) {
            this.closed = true;
            if (this.f7929tx != null && !this.f7929tx.getStore().isClosed()) {
                nativeDestroy(this.handle);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (!this.closed) {
            close();
            super.finalize();
        }
    }

    public byte[] get(byte[] bArr) {
        return nativeGet(this.handle, bArr);
    }

    public byte[] seekOrNext(byte[] bArr) {
        return nativeSeekOrNext(this.handle, bArr);
    }
}
