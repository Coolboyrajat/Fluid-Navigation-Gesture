package p190io.objectbox;

import java.io.Closeable;

/* renamed from: io.objectbox.KeyValueCursor */
public class KeyValueCursor implements Closeable {
    private static final int PUT_FLAG_COMPLETE = 2;
    private static final int PUT_FLAG_FIRST = 1;
    private static final int PUT_FLAG_INSERT_NEW = 4;
    private final long cursor;

    public KeyValueCursor(long j) {
        this.cursor = j;
    }

    static native void nativeDestroy(long j);

    static native byte[] nativeGetCurrent(long j);

    static native byte[] nativeGetEqualOrGreater(long j, long j2);

    static native byte[] nativeGetFirst(long j);

    static native long nativeGetKey(long j);

    static native void nativeGetKey(long j, long j2);

    static native byte[] nativeGetLast(long j);

    static native byte[] nativeGetLongKey(long j, long j2);

    static native byte[] nativeGetNext(long j);

    static native byte[] nativeGetPrev(long j);

    static native void nativePutLongKey(long j, long j2, byte[] bArr);

    static native boolean nativeRemoveAt(long j, long j2);

    static native boolean nativeSeek(long j, long j2);

    public void close() {
        nativeDestroy(this.cursor);
    }

    public byte[] get(long j) {
        return nativeGetLongKey(this.cursor, j);
    }

    public byte[] getCurrent() {
        return nativeGetCurrent(this.cursor);
    }

    public byte[] getEqualOrGreater(long j) {
        return nativeGetEqualOrGreater(this.cursor, j);
    }

    public byte[] getFirst() {
        return nativeGetFirst(this.cursor);
    }

    public long getKey() {
        return nativeGetKey(this.cursor);
    }

    public byte[] getLast() {
        return nativeGetLast(this.cursor);
    }

    public byte[] getNext() {
        return nativeGetNext(this.cursor);
    }

    public byte[] getPrev() {
        return nativeGetPrev(this.cursor);
    }

    public void put(long j, byte[] bArr) {
        nativePutLongKey(this.cursor, j, bArr);
    }

    public boolean removeAt(long j) {
        return nativeRemoveAt(this.cursor, j);
    }

    public boolean seek(long j) {
        return nativeSeek(this.cursor, j);
    }
}
