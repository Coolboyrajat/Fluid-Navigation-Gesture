package p190io.objectbox;

import java.io.Closeable;
import java.util.List;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.annotation.apihint.Beta;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.relation.ToMany;

@Beta
@Internal
/* renamed from: io.objectbox.Cursor */
public abstract class Cursor<T> implements Closeable {
    @Internal
    static boolean LOG_READ_NOT_CLOSED = false;
    protected static final int PUT_FLAG_COMPLETE = 2;
    protected static final int PUT_FLAG_FIRST = 1;
    @Internal
    static boolean TRACK_CREATION_STACK;
    protected final BoxStore boxStoreForEntities;
    protected boolean closed;
    private final Throwable creationThrowable;
    protected final long cursor;
    protected final EntityInfo entityInfo;
    protected final boolean readOnly;

    /* renamed from: tx */
    protected final Transaction f7906tx;

    protected Cursor(Transaction transaction, long j, EntityInfo entityInfo2, BoxStore boxStore) {
        if (transaction != null) {
            this.f7906tx = transaction;
            this.readOnly = transaction.isReadOnly();
            this.cursor = j;
            this.entityInfo = entityInfo2;
            this.boxStoreForEntities = boxStore;
            for (Property property : entityInfo2.getAllProperties()) {
                if (!property.isIdVerified()) {
                    property.verifyId(getPropertyId(property.dbName));
                }
            }
            this.creationThrowable = TRACK_CREATION_STACK ? new Throwable() : null;
            nativeSetBoxStoreForEntities(j, boxStore);
            return;
        }
        throw new IllegalArgumentException("Transaction is null");
    }

    protected static native long collect002033(long j, long j2, int i, int i2, long j3, int i3, long j4, int i4, float f, int i5, float f2, int i6, float f3, int i7, double d, int i8, double d2, int i9, double d3);

    protected static native long collect004000(long j, long j2, int i, int i2, long j3, int i3, long j4, int i4, long j5, int i5, long j6);

    protected static native long collect313311(long j, long j2, int i, int i2, String str, int i3, String str2, int i4, String str3, int i5, byte[] bArr, int i6, long j3, int i7, long j4, int i8, long j5, int i9, int i10, int i11, int i12, int i13, int i14, int i15, float f, int i16, double d);

    protected static native long collect400000(long j, long j2, int i, int i2, String str, int i3, String str2, int i4, String str3, int i5, String str4);

    protected static native long collect430000(long j, long j2, int i, int i2, String str, int i3, String str2, int i4, String str3, int i5, String str4, int i6, byte[] bArr, int i7, byte[] bArr2, int i8, byte[] bArr3);

    static native long nativeCount(long j, long j2);

    static native void nativeDeleteAll(long j);

    static native void nativeDeleteEntity(long j, long j2);

    static native void nativeDestroy(long j);

    static native Object nativeFirstEntity(long j);

    static native Object nativeGetAllEntities(long j);

    static native List nativeGetBacklinkEntities(long j, int i, int i2, long j2);

    static native Object nativeGetEntity(long j, long j2);

    static native long nativeGetKey(long j);

    static native List nativeGetRelationEntities(long j, int i, int i2, long j2, boolean z);

    static native long nativeLookupKeyUsingIndex(long j, int i, String str);

    static native void nativeModifyRelations(long j, int i, long j2, long[] jArr, boolean z);

    static native void nativeModifyRelationsSingle(long j, int i, long j2, long j3, boolean z);

    static native Object nativeNextEntity(long j);

    static native int nativePropertyId(long j, String str);

    static native long nativeRenew(long j);

    static native boolean nativeSeek(long j, long j2);

    static native void nativeSetBoxStoreForEntities(long j, Object obj);

    /* access modifiers changed from: protected */
    public <TARGET> void checkApplyToManyToDb(List<TARGET> list, Class<TARGET> cls) {
        if (list instanceof ToMany) {
            ToMany toMany = (ToMany) list;
            if (toMany.internalCheckApplyToDbRequired()) {
                Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(cls);
                try {
                    toMany.internalApplyToDb(this, relationTargetCursor);
                } finally {
                    relationTargetCursor.close();
                }
            }
        }
    }

    public synchronized void close() {
        if (!this.closed) {
            this.closed = true;
            if (this.f7906tx != null && !this.f7906tx.getStore().isClosed()) {
                nativeDestroy(this.cursor);
            }
        }
    }

    public long count(long j) {
        return nativeCount(this.cursor, j);
    }

    public void deleteAll() {
        nativeDeleteAll(this.cursor);
    }

    public void deleteEntity(long j) {
        nativeDeleteEntity(this.cursor, j);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (!this.closed) {
            if (!this.readOnly || LOG_READ_NOT_CLOSED) {
                System.err.println("Cursor was not closed.");
                if (this.creationThrowable != null) {
                    System.err.println("Cursor was initially created here:");
                    this.creationThrowable.printStackTrace();
                }
                System.err.flush();
            }
            close();
            super.finalize();
        }
    }

    public T first() {
        return nativeFirstEntity(this.cursor);
    }

    public T get(long j) {
        return nativeGetEntity(this.cursor, j);
    }

    public List<T> getAll() {
        return (List) nativeGetAllEntities(this.cursor);
    }

    /* access modifiers changed from: package-private */
    @Internal
    public List<T> getBacklinkEntities(int i, Property property, long j) {
        try {
            return nativeGetBacklinkEntities(this.cursor, i, property.getId(), j);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Please check if the given property belongs to a valid @Relation: " + property, e);
        }
    }

    public EntityInfo getEntityInfo() {
        return this.entityInfo;
    }

    /* access modifiers changed from: protected */
    public abstract long getId(T t);

    public long getKey() {
        return nativeGetKey(this.cursor);
    }

    public int getPropertyId(String str) {
        return nativePropertyId(this.cursor, str);
    }

    @Internal
    public List<T> getRelationEntities(int i, int i2, long j, boolean z) {
        return nativeGetRelationEntities(this.cursor, i, i2, j, z);
    }

    /* access modifiers changed from: protected */
    public <TARGET> Cursor<TARGET> getRelationTargetCursor(Class<TARGET> cls) {
        return this.f7906tx.createCursor(cls);
    }

    public Transaction getTx() {
        return this.f7906tx;
    }

    /* access modifiers changed from: package-private */
    @Internal
    public long internalHandle() {
        return this.cursor;
    }

    public boolean isClosed() {
        return this.closed;
    }

    public boolean isObsolete() {
        return this.f7906tx.isObsolete();
    }

    /* access modifiers changed from: package-private */
    public long lookupKeyUsingIndex(int i, String str) {
        return nativeLookupKeyUsingIndex(this.cursor, i, str);
    }

    @Internal
    public void modifyRelations(int i, long j, long[] jArr, boolean z) {
        nativeModifyRelations(this.cursor, i, j, jArr, z);
    }

    @Internal
    public void modifyRelationsSingle(int i, long j, long j2, boolean z) {
        nativeModifyRelationsSingle(this.cursor, i, j, j2, z);
    }

    public T next() {
        return nativeNextEntity(this.cursor);
    }

    public abstract long put(T t);

    public void renew() {
        nativeRenew(this.cursor);
    }

    public boolean seek(long j) {
        return nativeSeek(this.cursor, j);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cursor ");
        sb.append(Long.toString(this.cursor, 16));
        sb.append(isClosed() ? "(closed)" : BuildConfig.FLAVOR);
        return sb.toString();
    }
}
