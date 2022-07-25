package p190io.objectbox.relation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import p190io.objectbox.Box;
import p190io.objectbox.BoxStore;
import p190io.objectbox.Cursor;
import p190io.objectbox.InternalAccess;
import p190io.objectbox.annotation.apihint.Beta;
import p190io.objectbox.annotation.apihint.Experimental;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.exception.DbDetachedException;
import p190io.objectbox.internal.IdGetter;
import p190io.objectbox.internal.ReflectionCache;
import p190io.objectbox.internal.ToManyGetter;
import p190io.objectbox.internal.ToOneGetter;
import p190io.objectbox.query.QueryFilter;
import p190io.objectbox.relation.ListFactory;

/* renamed from: io.objectbox.relation.ToMany */
public class ToMany<TARGET> implements List<TARGET>, Serializable {
    private static final Integer ONE = 1;
    private static final long serialVersionUID = 2367317778240689006L;
    private transient BoxStore boxStore;
    private transient Comparator<TARGET> comparator;
    private List<TARGET> entities;
    private Map<TARGET, Boolean> entitiesAdded;
    private Map<TARGET, Boolean> entitiesRemoved;
    List<TARGET> entitiesToPut;
    List<TARGET> entitiesToRemoveFromDb;
    private final Object entity;
    /* access modifiers changed from: private */
    public transient Box entityBox;
    private Map<TARGET, Integer> entityCounts;
    private ListFactory listFactory;
    /* access modifiers changed from: private */
    public final RelationInfo<Object, TARGET> relationInfo;
    private transient boolean removeFromTargetBox;
    /* access modifiers changed from: private */
    public volatile transient Box<TARGET> targetBox;

    public ToMany(Object obj, RelationInfo<? extends Object, TARGET> relationInfo2) {
        if (obj == null) {
            throw new IllegalArgumentException("No source entity given (null)");
        } else if (relationInfo2 != null) {
            this.entity = obj;
            this.relationInfo = relationInfo2;
        } else {
            throw new IllegalArgumentException("No relation info given (null)");
        }
    }

    private void addStandaloneRelations(Cursor cursor, long j, TARGET[] targetArr, IdGetter<TARGET> idGetter, boolean z) {
        int length = targetArr.length;
        long[] jArr = new long[length];
        int i = 0;
        while (i < length) {
            long id = idGetter.getId(targetArr[i]);
            if (id != 0) {
                jArr[i] = id;
                i++;
            } else {
                throw new IllegalStateException("Target entity has no ID (should have been put before)");
            }
        }
        cursor.modifyRelations(this.relationInfo.relationId, j, jArr, z);
    }

    private void ensureBoxes() {
        if (this.targetBox == null) {
            try {
                this.boxStore = (BoxStore) ReflectionCache.getInstance().getField(this.entity.getClass(), "__boxStore").get(this.entity);
                if (this.boxStore != null) {
                    this.entityBox = this.boxStore.boxFor(this.relationInfo.sourceInfo.getEntityClass());
                    this.targetBox = this.boxStore.boxFor(this.relationInfo.targetInfo.getEntityClass());
                    return;
                }
                throw new DbDetachedException("Cannot resolve relation for detached entities, call box.attach(entity) beforehand.");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    private void ensureEntities() {
        /*
            r8 = this;
            java.util.List<TARGET> r0 = r8.entities
            if (r0 != 0) goto L_0x007d
            io.objectbox.relation.RelationInfo<java.lang.Object, TARGET> r0 = r8.relationInfo
            io.objectbox.EntityInfo<SOURCE> r0 = r0.sourceInfo
            io.objectbox.internal.IdGetter r0 = r0.getIdGetter()
            java.lang.Object r1 = r8.entity
            long r5 = r0.getId(r1)
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x002c
            monitor-enter(r8)
            java.util.List<TARGET> r0 = r8.entities     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0027
            io.objectbox.relation.ListFactory r0 = r8.getListFactory()     // Catch:{ all -> 0x0029 }
            java.util.List r0 = r0.createList()     // Catch:{ all -> 0x0029 }
            r8.entities = r0     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r8)     // Catch:{ all -> 0x0029 }
            goto L_0x007d
        L_0x0029:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0029 }
            throw r0
        L_0x002c:
            r8.ensureBoxes()
            io.objectbox.relation.RelationInfo<java.lang.Object, TARGET> r0 = r8.relationInfo
            int r4 = r0.relationId
            if (r4 == 0) goto L_0x0043
            io.objectbox.EntityInfo<SOURCE> r0 = r0.sourceInfo
            int r3 = r0.getEntityId()
            io.objectbox.Box<TARGET> r2 = r8.targetBox
            r7 = 0
        L_0x003e:
            java.util.List r0 = r2.internalGetRelationEntities(r3, r4, r5, r7)
            goto L_0x006a
        L_0x0043:
            io.objectbox.Property r0 = r0.targetIdProperty
            if (r0 == 0) goto L_0x005a
            io.objectbox.Box<TARGET> r0 = r8.targetBox
            io.objectbox.relation.RelationInfo<java.lang.Object, TARGET> r1 = r8.relationInfo
            io.objectbox.EntityInfo<TARGET> r1 = r1.targetInfo
            int r1 = r1.getEntityId()
            io.objectbox.relation.RelationInfo<java.lang.Object, TARGET> r2 = r8.relationInfo
            io.objectbox.Property r2 = r2.targetIdProperty
            java.util.List r0 = r0.internalGetBacklinkEntities(r1, r2, r5)
            goto L_0x006a
        L_0x005a:
            io.objectbox.Box<TARGET> r2 = r8.targetBox
            io.objectbox.relation.RelationInfo<java.lang.Object, TARGET> r0 = r8.relationInfo
            io.objectbox.EntityInfo<TARGET> r0 = r0.targetInfo
            int r3 = r0.getEntityId()
            io.objectbox.relation.RelationInfo<java.lang.Object, TARGET> r0 = r8.relationInfo
            int r4 = r0.targetRelationId
            r7 = 1
            goto L_0x003e
        L_0x006a:
            java.util.Comparator<TARGET> r1 = r8.comparator
            if (r1 == 0) goto L_0x0071
            java.util.Collections.sort(r0, r1)
        L_0x0071:
            monitor-enter(r8)
            java.util.List<TARGET> r1 = r8.entities     // Catch:{ all -> 0x007a }
            if (r1 != 0) goto L_0x0078
            r8.entities = r0     // Catch:{ all -> 0x007a }
        L_0x0078:
            monitor-exit(r8)     // Catch:{ all -> 0x007a }
            goto L_0x007d
        L_0x007a:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x007a }
            throw r0
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p190io.objectbox.relation.ToMany.ensureEntities():void");
    }

    private void ensureEntitiesWithTrackingLists() {
        ensureEntities();
        if (this.entitiesAdded == null) {
            synchronized (this) {
                if (this.entitiesAdded == null) {
                    this.entitiesAdded = new LinkedHashMap();
                    this.entitiesRemoved = new LinkedHashMap();
                    this.entityCounts = new HashMap();
                    for (TARGET next : this.entities) {
                        Integer put = this.entityCounts.put(next, ONE);
                        if (put != null) {
                            this.entityCounts.put(next, Integer.valueOf(put.intValue() + 1));
                        }
                    }
                }
            }
        }
    }

    private boolean prepareToManyBacklinkEntitiesForDb(long j, IdGetter<TARGET> idGetter, Map<TARGET, Boolean> map, Map<TARGET, Boolean> map2) {
        boolean z;
        List<TARGET> list;
        ToManyGetter<SOURCE> toManyGetter = this.relationInfo.backlinkToManyGetter;
        synchronized (this) {
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        for (TARGET next : map.keySet()) {
                            ToMany toMany = (ToMany) toManyGetter.getToMany(next);
                            if (toMany != null) {
                                if (toMany.getById(j) == null) {
                                    toMany.add(this.entity);
                                    list = this.entitiesToPut;
                                } else if (idGetter.getId(next) == 0) {
                                    list = this.entitiesToPut;
                                }
                                list.add(next);
                            } else {
                                throw new IllegalStateException("The ToMany property for " + this.relationInfo.targetInfo.getEntityName() + " is null");
                            }
                        }
                        map.clear();
                    }
                } finally {
                }
            }
            if (map2 != null) {
                for (TARGET next2 : map2.keySet()) {
                    ToMany toMany2 = (ToMany) toManyGetter.getToMany(next2);
                    if (toMany2.getById(j) != null) {
                        toMany2.removeById(j);
                        if (idGetter.getId(next2) != 0) {
                            (this.removeFromTargetBox ? this.entitiesToRemoveFromDb : this.entitiesToPut).add(next2);
                        }
                    }
                }
                map2.clear();
            }
            if (this.entitiesToPut.isEmpty()) {
                if (this.entitiesToRemoveFromDb.isEmpty()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    private boolean prepareToOneBacklinkEntitiesForDb(long j, IdGetter<TARGET> idGetter, Map<TARGET, Boolean> map, Map<TARGET, Boolean> map2) {
        boolean z;
        List<TARGET> list;
        ToOneGetter<SOURCE> toOneGetter = this.relationInfo.backlinkToOneGetter;
        synchronized (this) {
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        for (TARGET next : map.keySet()) {
                            ToOne<TARGET> toOne = toOneGetter.getToOne(next);
                            if (toOne != null) {
                                if (toOne.getTargetId() != j) {
                                    toOne.setTarget(this.entity);
                                    list = this.entitiesToPut;
                                } else if (idGetter.getId(next) == 0) {
                                    list = this.entitiesToPut;
                                }
                                list.add(next);
                            } else {
                                throw new IllegalStateException("The ToOne property for " + this.relationInfo.targetInfo.getEntityName() + "." + this.relationInfo.targetIdProperty.name + " is null");
                            }
                        }
                        map.clear();
                    }
                } finally {
                }
            }
            if (map2 != null) {
                for (TARGET next2 : map2.keySet()) {
                    ToOne<TARGET> toOne2 = toOneGetter.getToOne(next2);
                    if (toOne2.getTargetId() == j) {
                        toOne2.setTarget(null);
                        if (idGetter.getId(next2) != 0) {
                            (this.removeFromTargetBox ? this.entitiesToRemoveFromDb : this.entitiesToPut).add(next2);
                        }
                    }
                }
                map2.clear();
            }
            if (this.entitiesToPut.isEmpty()) {
                if (this.entitiesToRemoveFromDb.isEmpty()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    private void removeStandaloneRelations(Cursor cursor, long j, List<TARGET> list, IdGetter<TARGET> idGetter) {
        Iterator<TARGET> it = list.iterator();
        while (it.hasNext()) {
            if (idGetter.getId(it.next()) == 0) {
                it.remove();
            }
        }
        int size = list.size();
        if (size > 0) {
            long[] jArr = new long[size];
            for (int i = 0; i < size; i++) {
                jArr[i] = idGetter.getId(list.get(i));
            }
            cursor.modifyRelations(this.relationInfo.relationId, j, jArr, true);
        }
    }

    private void trackAdd(TARGET target) {
        ensureEntitiesWithTrackingLists();
        Integer put = this.entityCounts.put(target, ONE);
        if (put != null) {
            this.entityCounts.put(target, Integer.valueOf(put.intValue() + 1));
        }
        this.entitiesAdded.put(target, Boolean.TRUE);
        this.entitiesRemoved.remove(target);
    }

    private void trackAdd(Collection<? extends TARGET> collection) {
        ensureEntitiesWithTrackingLists();
        for (Object trackAdd : collection) {
            trackAdd(trackAdd);
        }
    }

    private void trackRemove(TARGET target) {
        ensureEntitiesWithTrackingLists();
        Integer remove = this.entityCounts.remove(target);
        if (remove == null) {
            return;
        }
        if (remove.intValue() == 1) {
            this.entityCounts.remove(target);
            this.entitiesAdded.remove(target);
            this.entitiesRemoved.put(target, Boolean.TRUE);
        } else if (remove.intValue() > 1) {
            this.entityCounts.put(target, Integer.valueOf(remove.intValue() - 1));
        } else {
            throw new IllegalStateException("Illegal count: " + remove);
        }
    }

    public synchronized void add(int i, TARGET target) {
        trackAdd(target);
        this.entities.add(i, target);
    }

    public synchronized boolean add(TARGET target) {
        trackAdd(target);
        return this.entities.add(target);
    }

    public synchronized boolean addAll(int i, Collection<? extends TARGET> collection) {
        trackAdd(collection);
        return this.entities.addAll(i, collection);
    }

    public synchronized boolean addAll(Collection<? extends TARGET> collection) {
        trackAdd(collection);
        return this.entities.addAll(collection);
    }

    public void applyChangesToDb() {
        if (this.relationInfo.sourceInfo.getIdGetter().getId(this.entity) != 0) {
            try {
                ensureBoxes();
                if (internalCheckApplyToDbRequired()) {
                    this.boxStore.runInTx(new Runnable() {
                        public void run() {
                            ToMany.this.internalApplyToDb(InternalAccess.getActiveTxCursor(ToMany.this.entityBox), InternalAccess.getActiveTxCursor(ToMany.this.targetBox));
                        }
                    });
                }
            } catch (DbDetachedException unused) {
                throw new IllegalStateException("The source entity was not yet persisted, use box.put() on it instead");
            }
        } else {
            throw new IllegalStateException("The source entity was not yet persisted (no ID), use box.put() on it instead");
        }
    }

    public synchronized void clear() {
        ensureEntitiesWithTrackingLists();
        List<TARGET> list = this.entities;
        if (list != null) {
            for (TARGET put : list) {
                this.entitiesRemoved.put(put, Boolean.TRUE);
            }
            list.clear();
        }
        Map<TARGET, Boolean> map = this.entitiesAdded;
        if (map != null) {
            map.clear();
        }
        Map<TARGET, Integer> map2 = this.entityCounts;
        if (map2 != null) {
            map2.clear();
        }
    }

    public boolean contains(Object obj) {
        ensureEntities();
        return this.entities.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        ensureEntities();
        return this.entities.containsAll(collection);
    }

    public TARGET get(int i) {
        ensureEntities();
        return this.entities.get(i);
    }

    public int getAddCount() {
        Map<TARGET, Boolean> map = this.entitiesAdded;
        if (map != null) {
            return map.size();
        }
        return 0;
    }

    @Beta
    public TARGET getById(long j) {
        ensureEntities();
        TARGET[] array = this.entities.toArray();
        IdGetter<TARGET> idGetter = this.relationInfo.targetInfo.getIdGetter();
        for (TARGET target : array) {
            if (idGetter.getId(target) == j) {
                return target;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Object getEntity() {
        return this.entity;
    }

    public ListFactory getListFactory() {
        if (this.listFactory == null) {
            synchronized (this) {
                if (this.listFactory == null) {
                    this.listFactory = new ListFactory.CopyOnWriteArrayListFactory();
                }
            }
        }
        return this.listFactory;
    }

    public int getRemoveCount() {
        Map<TARGET, Boolean> map = this.entitiesRemoved;
        if (map != null) {
            return map.size();
        }
        return 0;
    }

    @Beta
    public boolean hasA(QueryFilter<TARGET> queryFilter) {
        for (Object keep : toArray()) {
            if (queryFilter.keep(keep)) {
                return true;
            }
        }
        return false;
    }

    @Beta
    public boolean hasAll(QueryFilter<TARGET> queryFilter) {
        Object[] array = toArray();
        if (array.length == 0) {
            return false;
        }
        for (Object keep : array) {
            if (!queryFilter.keep(keep)) {
                return false;
            }
        }
        return true;
    }

    public boolean hasPendingDbChanges() {
        Map<TARGET, Boolean> map = this.entitiesAdded;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        Map<TARGET, Boolean> map2 = this.entitiesRemoved;
        return map2 != null && !map2.isEmpty();
    }

    public int indexOf(Object obj) {
        ensureEntities();
        return this.entities.indexOf(obj);
    }

    @Beta
    public int indexOfId(long j) {
        ensureEntities();
        Object[] array = this.entities.toArray();
        IdGetter<TARGET> idGetter = this.relationInfo.targetInfo.getIdGetter();
        int i = 0;
        for (Object id : array) {
            if (idGetter.getId(id) == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Internal
    public void internalApplyToDb(Cursor cursor, Cursor<TARGET> cursor2) {
        Object[] objArr;
        Object[] objArr2;
        ArrayList arrayList;
        Object[] array;
        Object[] objArr3;
        Cursor<TARGET> cursor3 = cursor2;
        boolean z = this.relationInfo.relationId != 0;
        IdGetter<TARGET> idGetter = this.relationInfo.targetInfo.getIdGetter();
        synchronized (this) {
            objArr = null;
            if (z) {
                for (TARGET next : this.entitiesAdded.keySet()) {
                    if (idGetter.getId(next) == 0) {
                        this.entitiesToPut.add(next);
                    }
                }
                if (this.removeFromTargetBox) {
                    this.entitiesToRemoveFromDb.addAll(this.entitiesRemoved.keySet());
                }
                if (!this.entitiesAdded.isEmpty()) {
                    objArr3 = this.entitiesAdded.keySet().toArray();
                    this.entitiesAdded.clear();
                } else {
                    objArr3 = null;
                }
                if (!this.entitiesRemoved.isEmpty()) {
                    arrayList = new ArrayList(this.entitiesRemoved.keySet());
                    this.entitiesRemoved.clear();
                } else {
                    arrayList = null;
                }
                objArr2 = objArr3;
            } else {
                arrayList = null;
                objArr2 = null;
            }
            array = this.entitiesToRemoveFromDb.isEmpty() ? null : this.entitiesToRemoveFromDb.toArray();
            this.entitiesToRemoveFromDb.clear();
            if (!this.entitiesToPut.isEmpty()) {
                objArr = this.entitiesToPut.toArray();
            }
            this.entitiesToPut.clear();
        }
        if (array != null) {
            for (Object id : array) {
                long id2 = idGetter.getId(id);
                if (id2 != 0) {
                    cursor3.deleteEntity(id2);
                }
            }
        }
        if (objArr != null) {
            for (Object put : objArr) {
                cursor3.put(put);
            }
        }
        if (z) {
            long id3 = this.relationInfo.sourceInfo.getIdGetter().getId(this.entity);
            if (id3 != 0) {
                if (arrayList != null) {
                    removeStandaloneRelations(cursor, id3, arrayList, idGetter);
                }
                if (objArr2 != null) {
                    addStandaloneRelations(cursor, id3, objArr2, idGetter, false);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Source entity has no ID (should have been put before)");
        }
    }

    @Internal
    public boolean internalCheckApplyToDbRequired() {
        if (!hasPendingDbChanges()) {
            return false;
        }
        synchronized (this) {
            if (this.entitiesToPut == null) {
                this.entitiesToPut = new ArrayList();
                this.entitiesToRemoveFromDb = new ArrayList();
            }
        }
        RelationInfo<Object, TARGET> relationInfo2 = this.relationInfo;
        if (relationInfo2.relationId != 0) {
            return true;
        }
        long id = relationInfo2.sourceInfo.getIdGetter().getId(this.entity);
        if (id != 0) {
            IdGetter<TARGET> idGetter = this.relationInfo.targetInfo.getIdGetter();
            Map<TARGET, Boolean> map = this.entitiesAdded;
            Map<TARGET, Boolean> map2 = this.entitiesRemoved;
            return this.relationInfo.targetRelationId != 0 ? prepareToManyBacklinkEntitiesForDb(id, idGetter, map, map2) : prepareToOneBacklinkEntitiesForDb(id, idGetter, map, map2);
        }
        throw new IllegalStateException("Source entity has no ID (should have been put before)");
    }

    public boolean isEmpty() {
        ensureEntities();
        return this.entities.isEmpty();
    }

    public boolean isResolved() {
        return this.entities != null;
    }

    public Iterator<TARGET> iterator() {
        ensureEntities();
        return this.entities.iterator();
    }

    public int lastIndexOf(Object obj) {
        ensureEntities();
        return this.entities.lastIndexOf(obj);
    }

    public ListIterator<TARGET> listIterator() {
        ensureEntities();
        return this.entities.listIterator();
    }

    public ListIterator<TARGET> listIterator(int i) {
        ensureEntities();
        return this.entities.listIterator(i);
    }

    public synchronized TARGET remove(int i) {
        TARGET remove;
        ensureEntitiesWithTrackingLists();
        remove = this.entities.remove(i);
        trackRemove(remove);
        return remove;
    }

    public synchronized boolean remove(Object obj) {
        boolean remove;
        ensureEntitiesWithTrackingLists();
        remove = this.entities.remove(obj);
        if (remove) {
            trackRemove(obj);
        }
        return remove;
    }

    public synchronized boolean removeAll(Collection<?> collection) {
        boolean z;
        z = false;
        for (Object remove : collection) {
            z |= remove((Object) remove);
        }
        return z;
    }

    public synchronized TARGET removeById(long j) {
        ensureEntities();
        int size = this.entities.size();
        IdGetter<TARGET> idGetter = this.relationInfo.targetInfo.getIdGetter();
        for (int i = 0; i < size; i++) {
            TARGET target = this.entities.get(i);
            if (idGetter.getId(target) == j) {
                TARGET remove = remove(i);
                if (remove == target) {
                    return target;
                }
                throw new IllegalStateException("Mismatch: " + remove + " vs. " + target);
            }
        }
        return null;
    }

    public synchronized void reset() {
        this.entities = null;
        this.entitiesAdded = null;
        this.entitiesRemoved = null;
        this.entitiesToRemoveFromDb = null;
        this.entitiesToPut = null;
        this.entityCounts = null;
    }

    public synchronized boolean retainAll(Collection<?> collection) {
        boolean z;
        ensureEntitiesWithTrackingLists();
        z = false;
        ArrayList arrayList = null;
        for (TARGET next : this.entities) {
            if (!collection.contains(next)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
                z = true;
            }
        }
        if (arrayList != null) {
            removeAll(arrayList);
        }
        return z;
    }

    public synchronized TARGET set(int i, TARGET target) {
        TARGET target2;
        ensureEntitiesWithTrackingLists();
        target2 = this.entities.set(i, target);
        trackRemove(target2);
        trackAdd(target);
        return target2;
    }

    @Experimental
    public void setComparator(Comparator<TARGET> comparator2) {
        this.comparator = comparator2;
    }

    @Experimental
    public void setListFactory(ListFactory listFactory2) {
        if (listFactory2 != null) {
            this.listFactory = listFactory2;
            return;
        }
        throw new IllegalArgumentException("ListFactory is null");
    }

    @Experimental
    public synchronized void setRemoveFromTargetBox(boolean z) {
        this.removeFromTargetBox = z;
    }

    public int size() {
        ensureEntities();
        return this.entities.size();
    }

    public void sortById() {
        ensureEntities();
        Collections.sort(this.entities, new Comparator<TARGET>() {
            IdGetter<TARGET> idGetter = ToMany.this.relationInfo.targetInfo.getIdGetter();

            public int compare(TARGET target, TARGET target2) {
                long id = this.idGetter.getId(target);
                long id2 = this.idGetter.getId(target2);
                if (id == 0) {
                    id = Long.MAX_VALUE;
                }
                if (id2 == 0) {
                    id2 = Long.MAX_VALUE;
                }
                int i = ((id - id2) > 0 ? 1 : ((id - id2) == 0 ? 0 : -1));
                if (i < 0) {
                    return -1;
                }
                return i > 0 ? 1 : 0;
            }
        });
    }

    public List<TARGET> subList(int i, int i2) {
        ensureEntities();
        return this.entities.subList(i, i2);
    }

    public Object[] toArray() {
        ensureEntities();
        return this.entities.toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        ensureEntities();
        return this.entities.toArray(tArr);
    }
}
