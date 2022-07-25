package p190io.objectbox;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p190io.objectbox.annotation.apihint.Beta;
import p190io.objectbox.annotation.apihint.Experimental;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.exception.DbException;
import p190io.objectbox.internal.CallWithHandle;
import p190io.objectbox.internal.IdGetter;
import p190io.objectbox.internal.ReflectionCache;
import p190io.objectbox.query.QueryBuilder;

@Beta
/* renamed from: io.objectbox.Box */
public class Box<T> {
    final ThreadLocal<Cursor<T>> activeTxCursor = new ThreadLocal<>();
    private volatile Field boxStoreField;
    private final Class<T> entityClass;
    private EntityInfo entityInfo;
    private final IdGetter<T> idGetter;
    private final BoxStore store;
    private final ThreadLocal<Cursor<T>> threadLocalReader = new ThreadLocal<>();

    Box(BoxStore boxStore, Class<T> cls) {
        this.store = boxStore;
        this.entityClass = cls;
        this.idGetter = boxStore.getEntityInfo(cls).getIdGetter();
    }

    private boolean isChanged(T t) {
        return false;
    }

    private boolean putIfChanged(T t) {
        return false;
    }

    @Beta
    public void attach(T t) {
        if (this.boxStoreField == null) {
            try {
                this.boxStoreField = ReflectionCache.getInstance().getField(this.entityClass, "__boxStore");
            } catch (Exception e) {
                throw new DbException("Entity cannot be attached - only active entities with relationships support attaching (class has no __boxStore field(?)) : " + this.entityClass, (Throwable) e);
            }
        }
        try {
            this.boxStoreField.set(t, this.store);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void closeThreadResources() {
        Cursor cursor = this.threadLocalReader.get();
        if (cursor != null) {
            cursor.close();
            this.threadLocalReader.remove();
        }
    }

    /* access modifiers changed from: package-private */
    public void commitWriter(Cursor<T> cursor) {
        if (this.activeTxCursor.get() == null) {
            cursor.close();
            cursor.getTx().commitAndClose();
        }
    }

    public long count() {
        return count(0);
    }

    public long count(long j) {
        Cursor reader = getReader();
        try {
            return reader.count(j);
        } finally {
            releaseReader(reader);
        }
    }

    public T get(long j) {
        Cursor reader = getReader();
        try {
            return reader.get(j);
        } finally {
            releaseReader(reader);
        }
    }

    public List<T> get(Iterable<Long> iterable) {
        ArrayList arrayList = new ArrayList();
        Cursor reader = getReader();
        try {
            for (Long longValue : iterable) {
                Object obj = reader.get(longValue.longValue());
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } finally {
            releaseReader(reader);
        }
    }

    public List<T> get(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        Cursor reader = getReader();
        try {
            for (long valueOf : jArr) {
                Object obj = reader.get(Long.valueOf(valueOf).longValue());
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } finally {
            releaseReader(reader);
        }
    }

    /* access modifiers changed from: package-private */
    public Cursor<T> getActiveTxCursor() {
        Transaction transaction = this.store.activeTx.get();
        if (transaction == null) {
            return null;
        }
        if (!transaction.isClosed()) {
            Cursor<T> cursor = this.activeTxCursor.get();
            if (cursor != null && !cursor.getTx().isClosed()) {
                return cursor;
            }
            Cursor<T> createCursor = transaction.createCursor(this.entityClass);
            this.activeTxCursor.set(createCursor);
            return createCursor;
        }
        throw new IllegalStateException("Active TX is closed");
    }

    public List<T> getAll() {
        Cursor reader = getReader();
        try {
            Object first = reader.first();
            if (first == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(first);
                first = reader.next();
            } while (first != null);
            releaseReader(reader);
            return arrayList;
        } finally {
            releaseReader(reader);
        }
    }

    public Class<T> getEntityClass() {
        return this.entityClass;
    }

    /* JADX INFO: finally extract failed */
    public synchronized EntityInfo getEntityInfo() {
        if (this.entityInfo == null) {
            Cursor reader = getReader();
            try {
                this.entityInfo = reader.getEntityInfo();
                releaseReader(reader);
            } catch (Throwable th) {
                releaseReader(reader);
                throw th;
            }
        }
        return this.entityInfo;
    }

    @Internal
    public long getId(T t) {
        return this.idGetter.getId(t);
    }

    public Map<Long, T> getMap(Iterable<Long> iterable) {
        HashMap hashMap = new HashMap();
        Cursor reader = getReader();
        try {
            for (Long next : iterable) {
                hashMap.put(next, reader.get(next.longValue()));
            }
            return hashMap;
        } finally {
            releaseReader(reader);
        }
    }

    /* access modifiers changed from: package-private */
    public int getPropertyId(String str) {
        Cursor reader = getReader();
        try {
            return reader.getPropertyId(str);
        } finally {
            releaseReader(reader);
        }
    }

    /* access modifiers changed from: package-private */
    public Cursor<T> getReader() {
        Cursor<T> activeTxCursor2 = getActiveTxCursor();
        if (activeTxCursor2 != null) {
            return activeTxCursor2;
        }
        Cursor<T> cursor = this.threadLocalReader.get();
        if (cursor != null) {
            Transaction transaction = cursor.f7906tx;
            if (transaction.isClosed() || !transaction.isRecycled()) {
                throw new IllegalStateException("Illegal reader TX state");
            }
            transaction.renew();
            cursor.renew();
            return cursor;
        }
        Cursor<T> createCursor = this.store.beginReadTx().createCursor(this.entityClass);
        this.threadLocalReader.set(createCursor);
        return createCursor;
    }

    public String getReaderDebugInfo() {
        Cursor reader = getReader();
        try {
            return reader + " with " + reader.getTx() + "; store's commit count: " + getStore().commitCount;
        } finally {
            releaseReader(reader);
        }
    }

    public BoxStore getStore() {
        return this.store;
    }

    /* access modifiers changed from: package-private */
    public Cursor<T> getWriter() {
        Cursor<T> activeTxCursor2 = getActiveTxCursor();
        if (activeTxCursor2 != null) {
            return activeTxCursor2;
        }
        Transaction beginTx = this.store.beginTx();
        try {
            return beginTx.createCursor(this.entityClass);
        } catch (RuntimeException e) {
            beginTx.close();
            throw e;
        }
    }

    @Internal
    public <RESULT> RESULT internalCallWithReaderHandle(CallWithHandle<RESULT> callWithHandle) {
        Cursor reader = getReader();
        try {
            return callWithHandle.call(reader.internalHandle());
        } finally {
            releaseReader(reader);
        }
    }

    @Internal
    public <RESULT> RESULT internalCallWithWriterHandle(CallWithHandle<RESULT> callWithHandle) {
        Cursor writer = getWriter();
        try {
            RESULT call = callWithHandle.call(writer.internalHandle());
            commitWriter(writer);
            return call;
        } finally {
            releaseWriter(writer);
        }
    }

    @Internal
    public List<T> internalGetBacklinkEntities(int i, Property property, long j) {
        Cursor reader = getReader();
        try {
            return reader.getBacklinkEntities(i, property, j);
        } finally {
            releaseReader(reader);
        }
    }

    @Internal
    public List<T> internalGetRelationEntities(int i, int i2, long j, boolean z) {
        Cursor reader = getReader();
        try {
            return reader.getRelationEntities(i, i2, j, z);
        } finally {
            releaseReader(reader);
        }
    }

    public boolean isEmpty() {
        return count(1) == 0;
    }

    @Experimental
    public long panicModeRemoveAll() {
        return this.store.panicModeRemoveAllObjects(getEntityInfo().getEntityId());
    }

    public long put(T t) {
        Cursor writer = getWriter();
        try {
            long put = writer.put(t);
            commitWriter(writer);
            return put;
        } finally {
            releaseWriter(writer);
        }
    }

    public void put(Collection<T> collection) {
        if (collection != null && !collection.isEmpty()) {
            Cursor writer = getWriter();
            try {
                for (T put : collection) {
                    writer.put(put);
                }
                commitWriter(writer);
            } finally {
                releaseWriter(writer);
            }
        }
    }

    public void put(T... tArr) {
        if (tArr != null && tArr.length != 0) {
            Cursor writer = getWriter();
            try {
                for (T put : tArr) {
                    writer.put(put);
                }
                commitWriter(writer);
            } finally {
                releaseWriter(writer);
            }
        }
    }

    public QueryBuilder<T> query() {
        return new QueryBuilder<>(this, this.store.internalHandle(), this.store.getDbName(this.entityClass));
    }

    /* access modifiers changed from: package-private */
    public void readTxFinished(Transaction transaction) {
        Cursor cursor = this.activeTxCursor.get();
        if (cursor != null && cursor.getTx() == transaction) {
            this.activeTxCursor.remove();
            cursor.close();
        }
    }

    /* access modifiers changed from: package-private */
    public void releaseReader(Cursor<T> cursor) {
        if (this.activeTxCursor.get() == null) {
            Transaction tx = cursor.getTx();
            if (tx.isClosed() || tx.isRecycled() || !tx.isReadOnly()) {
                throw new IllegalStateException("Illegal reader TX state");
            }
            tx.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public void releaseWriter(Cursor<T> cursor) {
        if (this.activeTxCursor.get() == null) {
            Transaction tx = cursor.getTx();
            if (!tx.isClosed()) {
                cursor.close();
                tx.abort();
                tx.close();
            }
        }
    }

    public void remove(long j) {
        Cursor writer = getWriter();
        try {
            writer.deleteEntity(j);
            commitWriter(writer);
        } finally {
            releaseWriter(writer);
        }
    }

    public void remove(T t) {
        Cursor writer = getWriter();
        try {
            writer.deleteEntity(writer.getId(t));
            commitWriter(writer);
        } finally {
            releaseWriter(writer);
        }
    }

    public void remove(Collection<T> collection) {
        if (collection != null && !collection.isEmpty()) {
            Cursor writer = getWriter();
            try {
                for (T id : collection) {
                    writer.deleteEntity(writer.getId(id));
                }
                commitWriter(writer);
            } finally {
                releaseWriter(writer);
            }
        }
    }

    public void remove(long... jArr) {
        if (jArr != null && jArr.length != 0) {
            Cursor writer = getWriter();
            try {
                for (long deleteEntity : jArr) {
                    writer.deleteEntity(deleteEntity);
                }
                commitWriter(writer);
            } finally {
                releaseWriter(writer);
            }
        }
    }

    public void remove(T... tArr) {
        if (tArr != null && tArr.length != 0) {
            Cursor writer = getWriter();
            try {
                for (T id : tArr) {
                    writer.deleteEntity(writer.getId(id));
                }
                commitWriter(writer);
            } finally {
                releaseWriter(writer);
            }
        }
    }

    public void removeAll() {
        Cursor writer = getWriter();
        try {
            writer.deleteAll();
            commitWriter(writer);
        } finally {
            releaseWriter(writer);
        }
    }

    public void removeByKeys(Collection<Long> collection) {
        if (collection != null && !collection.isEmpty()) {
            Cursor writer = getWriter();
            try {
                for (Long longValue : collection) {
                    writer.deleteEntity(longValue.longValue());
                }
                commitWriter(writer);
            } finally {
                releaseWriter(writer);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void txCommitted(Transaction transaction) {
        Cursor cursor = this.activeTxCursor.get();
        if (cursor != null) {
            this.activeTxCursor.remove();
            cursor.close();
        }
    }
}
