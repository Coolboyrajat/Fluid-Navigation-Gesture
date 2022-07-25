package p190io.objectbox.relation;

import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import p190io.objectbox.Box;
import p190io.objectbox.BoxStore;
import p190io.objectbox.Cursor;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.exception.DbDetachedException;
import p190io.objectbox.internal.ReflectionCache;

/* renamed from: io.objectbox.relation.ToOne */
public class ToOne<TARGET> implements Serializable {
    private static final long serialVersionUID = 5092547044335989281L;
    private transient BoxStore boxStore;
    private boolean checkIdOfTargetForPut;
    private boolean debugRelations;
    /* access modifiers changed from: private */
    public final Object entity;
    /* access modifiers changed from: private */
    public transient Box entityBox;
    private final RelationInfo relationInfo;
    private volatile long resolvedTargetId;
    private TARGET target;
    /* access modifiers changed from: private */
    public volatile transient Box<TARGET> targetBox;
    private long targetId;
    private transient Field targetIdField;
    private final boolean virtualProperty;

    public ToOne(Object obj, RelationInfo relationInfo2) {
        if (obj == null) {
            throw new IllegalArgumentException("No source entity given (null)");
        } else if (relationInfo2 != null) {
            this.entity = obj;
            this.relationInfo = relationInfo2;
            this.virtualProperty = relationInfo2.targetIdProperty.isVirtual;
        } else {
            throw new IllegalArgumentException("No relation info given (null)");
        }
    }

    private synchronized void clearResolved() {
        this.resolvedTargetId = 0;
        this.target = null;
    }

    private void ensureBoxes(TARGET target2) {
        if (this.targetBox == null) {
            try {
                this.boxStore = (BoxStore) ReflectionCache.getInstance().getField(this.entity.getClass(), "__boxStore").get(this.entity);
                if (this.boxStore == null) {
                    if (target2 != null) {
                        this.boxStore = (BoxStore) ReflectionCache.getInstance().getField(target2.getClass(), "__boxStore").get(target2);
                    }
                    if (this.boxStore == null) {
                        throw new DbDetachedException("Cannot resolve relation for detached entities, call box.attach(entity) beforehand.");
                    }
                }
                this.debugRelations = this.boxStore.isDebugRelations();
                this.entityBox = this.boxStore.boxFor(this.relationInfo.sourceInfo.getEntityClass());
                this.targetBox = this.boxStore.boxFor(this.relationInfo.targetInfo.getEntityClass());
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private Field getTargetIdField() {
        if (this.targetIdField == null) {
            this.targetIdField = ReflectionCache.getInstance().getField(this.entity.getClass(), this.relationInfo.targetIdProperty.name);
        }
        return this.targetIdField;
    }

    /* access modifiers changed from: private */
    public synchronized void setResolvedTarget(TARGET target2, long j) {
        if (this.debugRelations) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("Setting resolved ToOne target to ");
            sb.append(target2 == null ? "null" : "non-null");
            sb.append(" for ID ");
            sb.append(j);
            printStream.println(sb.toString());
        }
        this.resolvedTargetId = j;
        this.target = target2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ToOne)) {
            return false;
        }
        ToOne toOne = (ToOne) obj;
        return this.relationInfo == toOne.relationInfo && getTargetId() == toOne.getTargetId();
    }

    public TARGET getCachedTarget() {
        return this.target;
    }

    /* access modifiers changed from: package-private */
    public Object getEntity() {
        return this.entity;
    }

    public TARGET getTarget() {
        return getTarget(getTargetId());
    }

    @Internal
    public TARGET getTarget(long j) {
        synchronized (this) {
            if (this.resolvedTargetId == j) {
                TARGET target2 = this.target;
                return target2;
            }
            ensureBoxes((Object) null);
            TARGET target3 = this.targetBox.get(j);
            setResolvedTarget(target3, j);
            return target3;
        }
    }

    public long getTargetId() {
        if (this.virtualProperty) {
            return this.targetId;
        }
        Field targetIdField2 = getTargetIdField();
        try {
            Long l = (Long) targetIdField2.get(this.entity);
            if (l != null) {
                return l.longValue();
            }
            return 0;
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("Could not access field " + targetIdField2);
        }
    }

    public int hashCode() {
        long targetId2 = getTargetId();
        return (int) (targetId2 ^ (targetId2 >>> 32));
    }

    @Internal
    public void internalPutTarget(Cursor<TARGET> cursor) {
        this.checkIdOfTargetForPut = false;
        long put = cursor.put(this.target);
        setTargetId(put);
        setResolvedTarget(this.target, put);
    }

    @Internal
    public boolean internalRequiresPutTarget() {
        return this.checkIdOfTargetForPut && this.target != null && getTargetId() == 0;
    }

    public boolean isNull() {
        return getTargetId() == 0 && this.target == null;
    }

    public boolean isResolved() {
        return this.resolvedTargetId == getTargetId();
    }

    public boolean isResolvedAndNotNull() {
        return this.resolvedTargetId != 0 && this.resolvedTargetId == getTargetId();
    }

    public void setAndPutTarget(TARGET target2) {
        ensureBoxes(target2);
        if (target2 != null) {
            long id = this.targetBox.getId(target2);
            if (id == 0) {
                setAndPutTargetAlways(target2);
                return;
            } else {
                setTargetId(id);
                setResolvedTarget(target2, id);
            }
        } else {
            setTargetId(0);
            clearResolved();
        }
        this.entityBox.put(this.entity);
    }

    public void setAndPutTargetAlways(final TARGET target2) {
        ensureBoxes(target2);
        if (target2 != null) {
            this.boxStore.runInTx(new Runnable() {
                public void run() {
                    ToOne.this.setResolvedTarget(target2, ToOne.this.targetBox.put(target2));
                    ToOne.this.entityBox.put(ToOne.this.entity);
                }
            });
            return;
        }
        setTargetId(0);
        clearResolved();
        this.entityBox.put(this.entity);
    }

    /* access modifiers changed from: package-private */
    public void setAndUpdateTargetId(long j) {
        setTargetId(j);
        ensureBoxes((Object) null);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void setTarget(TARGET target2) {
        if (target2 != null) {
            long id = this.relationInfo.targetInfo.getIdGetter().getId(target2);
            this.checkIdOfTargetForPut = id == 0;
            setTargetId(id);
            setResolvedTarget(target2, id);
            return;
        }
        setTargetId(0);
        clearResolved();
    }

    public void setTargetId(long j) {
        if (this.virtualProperty) {
            this.targetId = j;
        } else {
            try {
                getTargetIdField().set(this.entity, Long.valueOf(j));
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Could not update to-one ID in entity", e);
            }
        }
        if (j != 0) {
            this.checkIdOfTargetForPut = false;
        }
    }
}
