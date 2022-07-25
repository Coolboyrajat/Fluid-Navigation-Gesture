package p190io.objectbox.query;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import p190io.objectbox.Box;
import p190io.objectbox.EntityInfo;
import p190io.objectbox.Property;
import p190io.objectbox.annotation.apihint.Experimental;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.relation.RelationInfo;

@Experimental
/* renamed from: io.objectbox.query.QueryBuilder */
public class QueryBuilder<T> {
    public static final int CASE_SENSITIVE = 2;
    public static final int DESCENDING = 1;
    public static final int NULLS_LAST = 8;
    public static final int NULLS_ZERO = 16;
    public static final int UNSIGNED = 4;
    private final Box<T> box;
    private Operator combineNextWith;
    private Comparator<T> comparator;
    private List<EagerRelation> eagerRelations;
    private QueryFilter<T> filter;
    private long handle;
    private boolean hasOrder;
    private final boolean isSubQuery;
    private long lastCondition;
    private final long storeHandle;

    /* renamed from: io.objectbox.query.QueryBuilder$Operator */
    enum Operator {
        NONE,
        AND,
        OR
    }

    /* renamed from: io.objectbox.query.QueryBuilder$StringOrder */
    public enum StringOrder {
        CASE_INSENSITIVE,
        CASE_SENSITIVE
    }

    private QueryBuilder(long j, long j2) {
        this.combineNextWith = Operator.NONE;
        this.box = null;
        this.storeHandle = j;
        this.handle = j2;
        this.isSubQuery = true;
    }

    @Internal
    public QueryBuilder(Box<T> box2, long j, String str) {
        this.combineNextWith = Operator.NONE;
        this.box = box2;
        this.storeHandle = j;
        this.handle = nativeCreate(j, str);
        this.isSubQuery = false;
    }

    private void checkCombineCondition(long j) {
        Operator operator = this.combineNextWith;
        if (operator != Operator.NONE) {
            this.lastCondition = nativeCombine(this.handle, this.lastCondition, j, operator == Operator.OR);
            this.combineNextWith = Operator.NONE;
            return;
        }
        this.lastCondition = j;
    }

    private void combineOperator(Operator operator) {
        if (this.lastCondition == 0) {
            throw new IllegalStateException("No previous condition. Use operators like and() and or() only between two conditions.");
        } else if (this.combineNextWith == Operator.NONE) {
            this.combineNextWith = operator;
        } else {
            throw new IllegalStateException("Another operator is pending. Use operators like and() and or() only between two conditions.");
        }
    }

    private <TARGET> QueryBuilder<TARGET> link(RelationInfo relationInfo, EntityInfo entityInfo, EntityInfo entityInfo2, boolean z) {
        Property property = relationInfo.targetIdProperty;
        int i = property != null ? property.f7909id : 0;
        int i2 = relationInfo.targetRelationId;
        return new QueryBuilder<>(this.storeHandle, nativeLink(this.handle, this.storeHandle, entityInfo.getEntityId(), entityInfo2.getEntityId(), i, i2 != 0 ? i2 : relationInfo.relationId, z));
    }

    private native long nativeBetween(long j, int i, double d, double d2);

    private native long nativeBetween(long j, int i, long j2, long j3);

    private native long nativeBuild(long j);

    private native long nativeCombine(long j, long j2, long j3, boolean z);

    private native long nativeContains(long j, int i, String str, boolean z);

    private native long nativeCreate(long j, String str);

    private native void nativeDestroy(long j);

    private native long nativeEndsWith(long j, int i, String str, boolean z);

    private native long nativeEqual(long j, int i, long j2);

    private native long nativeEqual(long j, int i, String str, boolean z);

    private native long nativeEqual(long j, int i, byte[] bArr);

    private native long nativeGreater(long j, int i, double d);

    private native long nativeGreater(long j, int i, long j2);

    private native long nativeGreater(long j, int i, String str, boolean z);

    private native long nativeGreater(long j, int i, byte[] bArr);

    private native long nativeIn(long j, int i, int[] iArr, boolean z);

    private native long nativeIn(long j, int i, long[] jArr, boolean z);

    private native long nativeIn(long j, int i, String[] strArr, boolean z);

    private native long nativeLess(long j, int i, double d);

    private native long nativeLess(long j, int i, long j2);

    private native long nativeLess(long j, int i, String str, boolean z);

    private native long nativeLess(long j, int i, byte[] bArr);

    private native long nativeLink(long j, long j2, int i, int i2, int i3, int i4, boolean z);

    private native long nativeNotEqual(long j, int i, long j2);

    private native long nativeNotEqual(long j, int i, String str, boolean z);

    private native long nativeNotNull(long j, int i);

    private native long nativeNull(long j, int i);

    private native void nativeOrder(long j, int i, int i2);

    private native void nativeSetParameterAlias(long j, String str);

    private native long nativeStartsWith(long j, int i, String str, boolean z);

    private void verifyHandle() {
        if (this.handle == 0) {
            throw new IllegalStateException("This QueryBuilder has already been closed. Please use a new instance.");
        }
    }

    private void verifyNotSubQuery() {
        if (this.isSubQuery) {
            throw new IllegalStateException("This call is not supported on sub query builders (links)");
        }
    }

    public QueryBuilder<T> and() {
        combineOperator(Operator.AND);
        return this;
    }

    public <TARGET> QueryBuilder<TARGET> backlink(RelationInfo<TARGET, ?> relationInfo) {
        if (!relationInfo.isBacklink()) {
            EntityInfo<SOURCE> entityInfo = relationInfo.sourceInfo;
            return link(relationInfo, entityInfo, entityInfo, true);
        }
        throw new IllegalArgumentException("Double backlink: The relation is already a backlink, please use a regular link on the original relation instead.");
    }

    public QueryBuilder<T> between(Property<T> property, double d, double d2) {
        verifyHandle();
        checkCombineCondition(nativeBetween(this.handle, property.getId(), d, d2));
        return this;
    }

    public QueryBuilder<T> between(Property<T> property, long j, long j2) {
        verifyHandle();
        checkCombineCondition(nativeBetween(this.handle, property.getId(), j, j2));
        return this;
    }

    public QueryBuilder<T> between(Property<T> property, Date date, Date date2) {
        verifyHandle();
        checkCombineCondition(nativeBetween(this.handle, property.getId(), date.getTime(), date2.getTime()));
        return this;
    }

    public Query<T> build() {
        verifyNotSubQuery();
        verifyHandle();
        if (this.combineNextWith == Operator.NONE) {
            Query query = new Query(this.box, nativeBuild(this.handle), this.hasOrder, this.eagerRelations, this.filter, this.comparator);
            close();
            return query;
        }
        throw new IllegalStateException("Incomplete logic condition. Use or()/and() between two conditions only.");
    }

    public synchronized void close() {
        if (this.handle != 0) {
            if (!this.isSubQuery) {
                nativeDestroy(this.handle);
            }
            this.handle = 0;
        }
    }

    public QueryBuilder<T> contains(Property<T> property, String str) {
        verifyHandle();
        checkCombineCondition(nativeContains(this.handle, property.getId(), str, false));
        return this;
    }

    public QueryBuilder<T> contains(Property<T> property, String str, StringOrder stringOrder) {
        verifyHandle();
        checkCombineCondition(nativeContains(this.handle, property.getId(), str, stringOrder == StringOrder.CASE_SENSITIVE));
        return this;
    }

    public QueryBuilder<T> eager(int i, RelationInfo relationInfo, RelationInfo... relationInfoArr) {
        verifyNotSubQuery();
        if (this.eagerRelations == null) {
            this.eagerRelations = new ArrayList();
        }
        this.eagerRelations.add(new EagerRelation(i, relationInfo));
        if (relationInfoArr != null) {
            for (RelationInfo eagerRelation : relationInfoArr) {
                this.eagerRelations.add(new EagerRelation(i, eagerRelation));
            }
        }
        return this;
    }

    public QueryBuilder<T> eager(RelationInfo relationInfo, RelationInfo... relationInfoArr) {
        return eager(0, relationInfo, relationInfoArr);
    }

    public QueryBuilder<T> endsWith(Property<T> property, String str) {
        verifyHandle();
        checkCombineCondition(nativeEndsWith(this.handle, property.getId(), str, false));
        return this;
    }

    public QueryBuilder<T> endsWith(Property<T> property, String str, StringOrder stringOrder) {
        verifyHandle();
        checkCombineCondition(nativeEndsWith(this.handle, property.getId(), str, stringOrder == StringOrder.CASE_SENSITIVE));
        return this;
    }

    public QueryBuilder<T> equal(Property<T> property, double d, double d2) {
        return between(property, d - d2, d + d2);
    }

    public QueryBuilder<T> equal(Property<T> property, long j) {
        verifyHandle();
        checkCombineCondition(nativeEqual(this.handle, property.getId(), j));
        return this;
    }

    public QueryBuilder<T> equal(Property<T> property, String str) {
        verifyHandle();
        checkCombineCondition(nativeEqual(this.handle, property.getId(), str, false));
        return this;
    }

    public QueryBuilder<T> equal(Property<T> property, String str, StringOrder stringOrder) {
        verifyHandle();
        checkCombineCondition(nativeEqual(this.handle, property.getId(), str, stringOrder == StringOrder.CASE_SENSITIVE));
        return this;
    }

    public QueryBuilder<T> equal(Property<T> property, Date date) {
        verifyHandle();
        checkCombineCondition(nativeEqual(this.handle, property.getId(), date.getTime()));
        return this;
    }

    public QueryBuilder<T> equal(Property<T> property, boolean z) {
        verifyHandle();
        checkCombineCondition(nativeEqual(this.handle, property.getId(), z ? 1 : 0));
        return this;
    }

    public QueryBuilder<T> equal(Property<T> property, byte[] bArr) {
        verifyHandle();
        checkCombineCondition(nativeEqual(this.handle, property.getId(), bArr));
        return this;
    }

    public QueryBuilder<T> filter(QueryFilter<T> queryFilter) {
        verifyNotSubQuery();
        if (this.filter == null) {
            this.filter = queryFilter;
            return this;
        }
        throw new IllegalStateException("A filter was already defined, you can only assign one filter");
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        close();
        super.finalize();
    }

    public QueryBuilder<T> greater(Property<T> property, double d) {
        verifyHandle();
        checkCombineCondition(nativeGreater(this.handle, property.getId(), d));
        return this;
    }

    public QueryBuilder<T> greater(Property<T> property, long j) {
        verifyHandle();
        checkCombineCondition(nativeGreater(this.handle, property.getId(), j));
        return this;
    }

    public QueryBuilder<T> greater(Property<T> property, String str) {
        return greater(property, str, StringOrder.CASE_INSENSITIVE);
    }

    public QueryBuilder<T> greater(Property<T> property, String str, StringOrder stringOrder) {
        verifyHandle();
        checkCombineCondition(nativeGreater(this.handle, property.getId(), str, stringOrder == StringOrder.CASE_SENSITIVE));
        return this;
    }

    public QueryBuilder<T> greater(Property<T> property, Date date) {
        verifyHandle();
        checkCombineCondition(nativeGreater(this.handle, property.getId(), date.getTime()));
        return this;
    }

    public QueryBuilder<T> greater(Property<T> property, byte[] bArr) {
        verifyHandle();
        checkCombineCondition(nativeGreater(this.handle, property.getId(), bArr));
        return this;
    }

    /* renamed from: in */
    public QueryBuilder<T> mo9772in(Property<T> property, int[] iArr) {
        verifyHandle();
        checkCombineCondition(nativeIn(this.handle, property.getId(), iArr, false));
        return this;
    }

    /* renamed from: in */
    public QueryBuilder<T> mo9773in(Property<T> property, long[] jArr) {
        verifyHandle();
        checkCombineCondition(nativeIn(this.handle, property.getId(), jArr, false));
        return this;
    }

    /* renamed from: in */
    public QueryBuilder<T> mo9774in(Property<T> property, String[] strArr) {
        return mo9775in(property, strArr, StringOrder.CASE_INSENSITIVE);
    }

    /* renamed from: in */
    public QueryBuilder<T> mo9775in(Property<T> property, String[] strArr, StringOrder stringOrder) {
        verifyHandle();
        checkCombineCondition(nativeIn(this.handle, property.getId(), strArr, stringOrder == StringOrder.CASE_SENSITIVE));
        return this;
    }

    public QueryBuilder<T> isNull(Property<T> property) {
        verifyHandle();
        checkCombineCondition(nativeNull(this.handle, property.getId()));
        return this;
    }

    public QueryBuilder<T> less(Property<T> property, double d) {
        verifyHandle();
        checkCombineCondition(nativeLess(this.handle, property.getId(), d));
        return this;
    }

    public QueryBuilder<T> less(Property<T> property, long j) {
        verifyHandle();
        checkCombineCondition(nativeLess(this.handle, property.getId(), j));
        return this;
    }

    public QueryBuilder<T> less(Property<T> property, String str) {
        return less(property, str, StringOrder.CASE_INSENSITIVE);
    }

    public QueryBuilder<T> less(Property<T> property, String str, StringOrder stringOrder) {
        verifyHandle();
        checkCombineCondition(nativeLess(this.handle, property.getId(), str, stringOrder == StringOrder.CASE_SENSITIVE));
        return this;
    }

    public QueryBuilder<T> less(Property<T> property, Date date) {
        verifyHandle();
        checkCombineCondition(nativeLess(this.handle, property.getId(), date.getTime()));
        return this;
    }

    public QueryBuilder<T> less(Property<T> property, byte[] bArr) {
        verifyHandle();
        checkCombineCondition(nativeLess(this.handle, property.getId(), bArr));
        return this;
    }

    public <TARGET> QueryBuilder<TARGET> link(RelationInfo<?, TARGET> relationInfo) {
        boolean isBacklink = relationInfo.isBacklink();
        return link(relationInfo, isBacklink ? relationInfo.targetInfo : relationInfo.sourceInfo, relationInfo.targetInfo, isBacklink);
    }

    public QueryBuilder<T> notEqual(Property<T> property, long j) {
        verifyHandle();
        checkCombineCondition(nativeNotEqual(this.handle, property.getId(), j));
        return this;
    }

    public QueryBuilder<T> notEqual(Property<T> property, String str) {
        verifyHandle();
        checkCombineCondition(nativeNotEqual(this.handle, property.getId(), str, false));
        return this;
    }

    public QueryBuilder<T> notEqual(Property<T> property, String str, StringOrder stringOrder) {
        verifyHandle();
        checkCombineCondition(nativeNotEqual(this.handle, property.getId(), str, stringOrder == StringOrder.CASE_SENSITIVE));
        return this;
    }

    public QueryBuilder<T> notEqual(Property<T> property, Date date) {
        verifyHandle();
        checkCombineCondition(nativeNotEqual(this.handle, property.getId(), date.getTime()));
        return this;
    }

    public QueryBuilder<T> notEqual(Property<T> property, boolean z) {
        verifyHandle();
        checkCombineCondition(nativeNotEqual(this.handle, property.getId(), z ? 1 : 0));
        return this;
    }

    public QueryBuilder<T> notIn(Property<T> property, int[] iArr) {
        verifyHandle();
        checkCombineCondition(nativeIn(this.handle, property.getId(), iArr, true));
        return this;
    }

    public QueryBuilder<T> notIn(Property<T> property, long[] jArr) {
        verifyHandle();
        checkCombineCondition(nativeIn(this.handle, property.getId(), jArr, true));
        return this;
    }

    public QueryBuilder<T> notNull(Property<T> property) {
        verifyHandle();
        checkCombineCondition(nativeNotNull(this.handle, property.getId()));
        return this;
    }

    /* renamed from: or */
    public QueryBuilder<T> mo9792or() {
        combineOperator(Operator.OR);
        return this;
    }

    public QueryBuilder<T> order(Property<T> property) {
        return order(property, 0);
    }

    public QueryBuilder<T> order(Property<T> property, int i) {
        verifyNotSubQuery();
        verifyHandle();
        if (this.combineNextWith == Operator.NONE) {
            nativeOrder(this.handle, property.getId(), i);
            this.hasOrder = true;
            return this;
        }
        throw new IllegalStateException("An operator is pending. Use operators like and() and or() only between two conditions.");
    }

    public QueryBuilder<T> orderDesc(Property<T> property) {
        return order(property, 1);
    }

    public QueryBuilder<T> parameterAlias(String str) {
        verifyHandle();
        long j = this.lastCondition;
        if (j != 0) {
            nativeSetParameterAlias(j, str);
            return this;
        }
        throw new IllegalStateException("No previous condition. Before you can assign an alias, you must first have a condition.");
    }

    public QueryBuilder<T> sort(Comparator<T> comparator2) {
        this.comparator = comparator2;
        return this;
    }

    public QueryBuilder<T> startsWith(Property<T> property, String str) {
        verifyHandle();
        checkCombineCondition(nativeStartsWith(this.handle, property.getId(), str, false));
        return this;
    }

    public QueryBuilder<T> startsWith(Property<T> property, String str, StringOrder stringOrder) {
        verifyHandle();
        checkCombineCondition(nativeStartsWith(this.handle, property.getId(), str, stringOrder == StringOrder.CASE_SENSITIVE));
        return this;
    }
}
