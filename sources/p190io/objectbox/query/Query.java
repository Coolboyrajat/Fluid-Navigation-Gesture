package p190io.objectbox.query;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p190io.objectbox.Box;
import p190io.objectbox.BoxStore;
import p190io.objectbox.InternalAccess;
import p190io.objectbox.Property;
import p190io.objectbox.internal.CallWithHandle;
import p190io.objectbox.internal.ToManyGetter;
import p190io.objectbox.internal.ToOneGetter;
import p190io.objectbox.reactive.DataSubscriptionList;
import p190io.objectbox.reactive.SubscriptionBuilder;
import p190io.objectbox.relation.RelationInfo;
import p190io.objectbox.relation.ToOne;

/* renamed from: io.objectbox.query.Query */
public class Query<T> {
    final Box<T> box;
    /* access modifiers changed from: private */
    public final Comparator<T> comparator;
    /* access modifiers changed from: private */
    public final List<EagerRelation> eagerRelations;
    /* access modifiers changed from: private */
    public final QueryFilter<T> filter;
    long handle;
    private final boolean hasOrder;
    private final int initialRetryBackOffInMs = 10;
    private final QueryPublisher<T> publisher;
    private final int queryAttempts;
    private final BoxStore store;

    Query(Box<T> box2, long j, boolean z, List<EagerRelation> list, QueryFilter<T> queryFilter, Comparator<T> comparator2) {
        this.box = box2;
        this.store = box2.getStore();
        this.queryAttempts = this.store.internalQueryAttempts();
        this.handle = j;
        this.hasOrder = z;
        this.publisher = new QueryPublisher<>(this, box2);
        this.eagerRelations = list;
        this.filter = queryFilter;
        this.comparator = comparator2;
    }

    private void ensureNoComparator() {
        if (this.comparator != null) {
            throw new UnsupportedOperationException("Does not yet work with a sorting comparator yet. At this point, only find() is supported with sorting comparators.");
        }
    }

    private void ensureNoFilterNoComparator() {
        if (this.filter == null) {
            ensureNoComparator();
            return;
        }
        throw new UnsupportedOperationException("Does not yet work with a filter yet. At this point, only find() and forEach() are supported with filters.");
    }

    /* access modifiers changed from: package-private */
    public <R> R callInReadTx(Callable<R> callable) {
        return this.store.callInReadTxWithRetry(callable, this.queryAttempts, 10, true);
    }

    public synchronized void close() {
        if (this.handle != 0) {
            nativeDestroy(this.handle);
            this.handle = 0;
        }
    }

    public long count() {
        return ((Long) this.box.internalCallWithReaderHandle(new CallWithHandle<Long>() {
            public Long call(long j) {
                Query query = Query.this;
                return Long.valueOf(query.nativeCount(query.handle, j));
            }
        })).longValue();
    }

    /* access modifiers changed from: package-private */
    public long cursorHandle() {
        return InternalAccess.getActiveTxCursorHandle(this.box);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        close();
        super.finalize();
    }

    public List<T> find() {
        return (List) callInReadTx(new Callable<List<T>>() {
            public List<T> call() {
                Query query = Query.this;
                List<T> nativeFind = query.nativeFind(query.handle, query.cursorHandle(), 0, 0);
                if (Query.this.filter != null) {
                    Iterator<T> it = nativeFind.iterator();
                    while (it.hasNext()) {
                        if (!Query.this.filter.keep(it.next())) {
                            it.remove();
                        }
                    }
                }
                Query.this.resolveEagerRelations(nativeFind);
                if (Query.this.comparator != null) {
                    Collections.sort(nativeFind, Query.this.comparator);
                }
                return nativeFind;
            }
        });
    }

    public List<T> find(long j, long j2) {
        ensureNoFilterNoComparator();
        final long j3 = j;
        final long j4 = j2;
        return (List) callInReadTx(new Callable<List<T>>() {
            public List<T> call() {
                Query query = Query.this;
                List<T> nativeFind = query.nativeFind(query.handle, query.cursorHandle(), j3, j4);
                Query.this.resolveEagerRelations(nativeFind);
                return nativeFind;
            }
        });
    }

    public T findFirst() {
        ensureNoFilterNoComparator();
        return callInReadTx(new Callable<T>() {
            public T call() {
                Query query = Query.this;
                T nativeFindFirst = query.nativeFindFirst(query.handle, query.cursorHandle());
                Query.this.resolveEagerRelation(nativeFindFirst);
                return nativeFindFirst;
            }
        });
    }

    public long[] findIds() {
        return findIds(0, 0);
    }

    public long[] findIds(long j, long j2) {
        final long j3 = j;
        final long j4 = j2;
        return (long[]) this.box.internalCallWithReaderHandle(new CallWithHandle<long[]>() {
            public long[] call(long j) {
                Query query = Query.this;
                return query.nativeFindIds(query.handle, j, j3, j4);
            }
        });
    }

    public LazyList<T> findLazy() {
        ensureNoFilterNoComparator();
        return new LazyList<>(this.box, findIds(), false);
    }

    public LazyList<T> findLazyCached() {
        ensureNoFilterNoComparator();
        return new LazyList<>(this.box, findIds(), true);
    }

    public T findUnique() {
        ensureNoFilterNoComparator();
        return callInReadTx(new Callable<T>() {
            public T call() {
                Query query = Query.this;
                T nativeFindUnique = query.nativeFindUnique(query.handle, query.cursorHandle());
                Query.this.resolveEagerRelation(nativeFindUnique);
                return nativeFindUnique;
            }
        });
    }

    public void forEach(final QueryConsumer<T> queryConsumer) {
        ensureNoComparator();
        this.box.getStore().runInReadTx(new Runnable() {
            public void run() {
                Query query = Query.this;
                int i = 0;
                LazyList lazyList = new LazyList(query.box, query.findIds(), false);
                int size = lazyList.size();
                while (i < size) {
                    Object obj = lazyList.get(i);
                    if (obj != null) {
                        if (Query.this.filter == null || Query.this.filter.keep(obj)) {
                            if (Query.this.eagerRelations != null) {
                                Query.this.resolveEagerRelationForNonNullEagerRelations(obj, i);
                            }
                            try {
                                queryConsumer.accept(obj);
                            } catch (BreakForEach unused) {
                                return;
                            }
                        }
                        i++;
                    } else {
                        throw new IllegalStateException("Internal error: data object was null");
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public native long nativeCount(long j, long j2);

    /* access modifiers changed from: package-private */
    public native void nativeDestroy(long j);

    /* access modifiers changed from: package-private */
    public native List nativeFind(long j, long j2, long j3, long j4);

    /* access modifiers changed from: package-private */
    public native Object nativeFindFirst(long j, long j2);

    /* access modifiers changed from: package-private */
    public native long[] nativeFindIds(long j, long j2, long j3, long j4);

    /* access modifiers changed from: package-private */
    public native Object nativeFindUnique(long j, long j2);

    /* access modifiers changed from: package-private */
    public native long nativeRemove(long j, long j2);

    /* access modifiers changed from: package-private */
    public native void nativeSetParameter(long j, int i, int i2, String str, double d);

    /* access modifiers changed from: package-private */
    public native void nativeSetParameter(long j, int i, int i2, String str, long j2);

    /* access modifiers changed from: package-private */
    public native void nativeSetParameter(long j, int i, int i2, String str, String str2);

    /* access modifiers changed from: package-private */
    public native void nativeSetParameter(long j, int i, int i2, String str, byte[] bArr);

    /* access modifiers changed from: package-private */
    public native void nativeSetParameters(long j, int i, int i2, String str, double d, double d2);

    /* access modifiers changed from: package-private */
    public native void nativeSetParameters(long j, int i, int i2, String str, long j2, long j3);

    /* access modifiers changed from: package-private */
    public native void nativeSetParameters(long j, int i, int i2, String str, int[] iArr);

    /* access modifiers changed from: package-private */
    public native void nativeSetParameters(long j, int i, int i2, String str, long[] jArr);

    /* access modifiers changed from: package-private */
    public native void nativeSetParameters(long j, int i, int i2, String str, String[] strArr);

    public PropertyQuery property(Property property) {
        return new PropertyQuery(this, property);
    }

    public void publish() {
        this.publisher.publish();
    }

    public long remove() {
        return ((Long) this.box.internalCallWithWriterHandle(new CallWithHandle<Long>() {
            public Long call(long j) {
                Query query = Query.this;
                return Long.valueOf(query.nativeRemove(query.handle, j));
            }
        })).longValue();
    }

    /* access modifiers changed from: package-private */
    public void resolveEagerRelation(Object obj) {
        List<EagerRelation> list = this.eagerRelations;
        if (list != null && obj != null) {
            for (EagerRelation resolveEagerRelation : list) {
                resolveEagerRelation(obj, resolveEagerRelation);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void resolveEagerRelation(Object obj, EagerRelation eagerRelation) {
        if (this.eagerRelations != null) {
            RelationInfo relationInfo = eagerRelation.relationInfo;
            ToOneGetter<TARGET> toOneGetter = relationInfo.toOneGetter;
            if (toOneGetter != null) {
                ToOne<TARGET> toOne = toOneGetter.getToOne(obj);
                if (toOne != null) {
                    toOne.getTarget();
                    return;
                }
                return;
            }
            ToManyGetter<TARGET> toManyGetter = relationInfo.toManyGetter;
            if (toManyGetter != null) {
                List<TARGET> toMany = toManyGetter.getToMany(obj);
                if (toMany != null) {
                    toMany.size();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Relation info without relation getter: " + relationInfo);
        }
    }

    /* access modifiers changed from: package-private */
    public void resolveEagerRelationForNonNullEagerRelations(Object obj, int i) {
        for (EagerRelation next : this.eagerRelations) {
            int i2 = next.limit;
            if (i2 == 0 || i < i2) {
                resolveEagerRelation(obj, next);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void resolveEagerRelations(List list) {
        if (this.eagerRelations != null) {
            int i = 0;
            for (Object resolveEagerRelationForNonNullEagerRelations : list) {
                resolveEagerRelationForNonNullEagerRelations(resolveEagerRelationForNonNullEagerRelations, i);
                i++;
            }
        }
    }

    public Query<T> setParameter(Property property, double d) {
        nativeSetParameter(this.handle, property.getEntityId(), property.getId(), (String) null, d);
        return this;
    }

    public Query<T> setParameter(Property property, long j) {
        nativeSetParameter(this.handle, property.getEntityId(), property.getId(), (String) null, j);
        return this;
    }

    public Query<T> setParameter(Property property, String str) {
        nativeSetParameter(this.handle, property.getEntityId(), property.getId(), (String) null, str);
        return this;
    }

    public Query<T> setParameter(Property property, Date date) {
        return setParameter(property, date.getTime());
    }

    public Query<T> setParameter(Property property, boolean z) {
        return setParameter(property, z ? 1 : 0);
    }

    public Query<T> setParameter(Property property, byte[] bArr) {
        nativeSetParameter(this.handle, property.getEntityId(), property.getId(), (String) null, bArr);
        return this;
    }

    public Query<T> setParameter(String str, double d) {
        nativeSetParameter(this.handle, 0, 0, str, d);
        return this;
    }

    public Query<T> setParameter(String str, long j) {
        nativeSetParameter(this.handle, 0, 0, str, j);
        return this;
    }

    public Query<T> setParameter(String str, String str2) {
        nativeSetParameter(this.handle, 0, 0, str, str2);
        return this;
    }

    public Query<T> setParameter(String str, Date date) {
        return setParameter(str, date.getTime());
    }

    public Query<T> setParameter(String str, boolean z) {
        return setParameter(str, z ? 1 : 0);
    }

    public Query<T> setParameter(String str, byte[] bArr) {
        nativeSetParameter(this.handle, 0, 0, str, bArr);
        return this;
    }

    public Query<T> setParameters(Property property, double d, double d2) {
        nativeSetParameters(this.handle, property.getEntityId(), property.getId(), (String) null, d, d2);
        return this;
    }

    public Query<T> setParameters(Property property, long j, long j2) {
        nativeSetParameters(this.handle, property.getEntityId(), property.getId(), (String) null, j, j2);
        return this;
    }

    public Query<T> setParameters(Property property, int[] iArr) {
        nativeSetParameters(this.handle, property.getEntityId(), property.getId(), (String) null, iArr);
        return this;
    }

    public Query<T> setParameters(Property property, long[] jArr) {
        nativeSetParameters(this.handle, property.getEntityId(), property.getId(), (String) null, jArr);
        return this;
    }

    public Query<T> setParameters(Property property, String[] strArr) {
        nativeSetParameters(this.handle, property.getEntityId(), property.getId(), (String) null, strArr);
        return this;
    }

    public Query<T> setParameters(String str, double d, double d2) {
        nativeSetParameters(this.handle, 0, 0, str, d, d2);
        return this;
    }

    public Query<T> setParameters(String str, long j, long j2) {
        nativeSetParameters(this.handle, 0, 0, str, j, j2);
        return this;
    }

    public Query<T> setParameters(String str, int[] iArr) {
        nativeSetParameters(this.handle, 0, 0, str, iArr);
        return this;
    }

    public Query<T> setParameters(String str, long[] jArr) {
        nativeSetParameters(this.handle, 0, 0, str, jArr);
        return this;
    }

    public Query<T> setParameters(String str, String[] strArr) {
        nativeSetParameters(this.handle, 0, 0, str, strArr);
        return this;
    }

    public SubscriptionBuilder<List<T>> subscribe() {
        return new SubscriptionBuilder<>(this.publisher, (Object) null, this.box.getStore().internalThreadPool());
    }

    public SubscriptionBuilder<List<T>> subscribe(DataSubscriptionList dataSubscriptionList) {
        SubscriptionBuilder<List<T>> subscribe = subscribe();
        subscribe.dataSubscriptionList(dataSubscriptionList);
        return subscribe;
    }
}
