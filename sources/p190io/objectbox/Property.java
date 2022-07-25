package p190io.objectbox;

import java.io.Serializable;
import java.util.Collection;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.converter.PropertyConverter;
import p190io.objectbox.exception.DbException;
import p190io.objectbox.query.QueryCondition;

/* renamed from: io.objectbox.Property */
public class Property<ENTITY> implements Serializable {
    private static final long serialVersionUID = 8613291105982758093L;
    public final Class<? extends PropertyConverter> converterClass;
    public final Class customType;
    public final String dbName;
    public final EntityInfo<ENTITY> entity;

    /* renamed from: id */
    public final int f7909id;
    private boolean idVerified;
    public final boolean isId;
    public final boolean isVirtual;
    public final String name;
    public final int ordinal;
    public final Class<?> type;

    public Property(EntityInfo<ENTITY> entityInfo, int i, int i2, Class<?> cls, String str) {
        this(entityInfo, i, i2, cls, str, false, str, (Class<? extends PropertyConverter>) null, (Class) null);
    }

    public Property(EntityInfo<ENTITY> entityInfo, int i, int i2, Class<?> cls, String str, boolean z) {
        this(entityInfo, i, i2, cls, str, false, z, str, (Class<? extends PropertyConverter>) null, (Class) null);
    }

    public Property(EntityInfo<ENTITY> entityInfo, int i, int i2, Class<?> cls, String str, boolean z, String str2) {
        this(entityInfo, i, i2, cls, str, z, str2, (Class<? extends PropertyConverter>) null, (Class) null);
    }

    public Property(EntityInfo<ENTITY> entityInfo, int i, int i2, Class<?> cls, String str, boolean z, String str2, Class<? extends PropertyConverter> cls2, Class cls3) {
        this(entityInfo, i, i2, cls, str, z, false, str2, cls2, cls3);
    }

    public Property(EntityInfo<ENTITY> entityInfo, int i, int i2, Class<?> cls, String str, boolean z, boolean z2, String str2, Class<? extends PropertyConverter> cls2, Class cls3) {
        this.entity = entityInfo;
        this.ordinal = i;
        this.f7909id = i2;
        this.type = cls;
        this.name = str;
        this.isId = z;
        this.isVirtual = z2;
        this.dbName = str2;
        this.converterClass = cls2;
        this.customType = cls3;
    }

    public QueryCondition between(Object obj, Object obj2) {
        return new QueryCondition.PropertyCondition(this, QueryCondition.PropertyCondition.Operation.BETWEEN, new Object[]{obj, obj2});
    }

    public QueryCondition contains(String str) {
        return new QueryCondition.PropertyCondition(this, QueryCondition.PropertyCondition.Operation.CONTAINS, (Object) str);
    }

    public QueryCondition endsWith(String str) {
        return new QueryCondition.PropertyCondition(this, QueryCondition.PropertyCondition.Operation.ENDS_WITH, (Object) str);
    }

    /* renamed from: eq */
    public QueryCondition mo9427eq(Object obj) {
        return new QueryCondition.PropertyCondition(this, QueryCondition.PropertyCondition.Operation.EQUALS, obj);
    }

    @Internal
    public int getEntityId() {
        return this.entity.getEntityId();
    }

    @Internal
    public int getId() {
        int i = this.f7909id;
        if (i > 0) {
            return i;
        }
        throw new IllegalStateException("Illegal property ID " + this.f7909id + " for " + toString());
    }

    /* renamed from: gt */
    public QueryCondition mo9430gt(Object obj) {
        return new QueryCondition.PropertyCondition(this, QueryCondition.PropertyCondition.Operation.GREATER_THAN, obj);
    }

    /* renamed from: in */
    public QueryCondition mo9431in(Collection<?> collection) {
        return mo9432in(collection.toArray());
    }

    /* renamed from: in */
    public QueryCondition mo9432in(Object... objArr) {
        return new QueryCondition.PropertyCondition(this, QueryCondition.PropertyCondition.Operation.IN, objArr);
    }

    /* access modifiers changed from: package-private */
    public boolean isIdVerified() {
        return this.idVerified;
    }

    public QueryCondition isNotNull() {
        return new QueryCondition.PropertyCondition(this, QueryCondition.PropertyCondition.Operation.IS_NOT_NULL, (Object[]) null);
    }

    public QueryCondition isNull() {
        return new QueryCondition.PropertyCondition(this, QueryCondition.PropertyCondition.Operation.IS_NULL, (Object[]) null);
    }

    /* renamed from: lt */
    public QueryCondition mo9436lt(Object obj) {
        return new QueryCondition.PropertyCondition(this, QueryCondition.PropertyCondition.Operation.LESS_THAN, obj);
    }

    public QueryCondition notEq(Object obj) {
        return new QueryCondition.PropertyCondition(this, QueryCondition.PropertyCondition.Operation.NOT_EQUALS, obj);
    }

    public QueryCondition startsWith(String str) {
        return new QueryCondition.PropertyCondition(this, QueryCondition.PropertyCondition.Operation.STARTS_WITH, (Object) str);
    }

    public String toString() {
        return "Property \"" + this.name + "\" (ID: " + this.f7909id + ")";
    }

    /* access modifiers changed from: package-private */
    public void verifyId(int i) {
        int i2 = this.f7909id;
        if (i2 <= 0) {
            throw new IllegalStateException("Illegal property ID " + this.f7909id + " for " + toString());
        } else if (i2 == i) {
            this.idVerified = true;
        } else {
            throw new DbException(toString() + " does not match ID in DB: " + i);
        }
    }
}
