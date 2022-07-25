package p190io.objectbox.kotlin;

import kotlin.Unit;
import kotlin.p192b0.C3202c;
import kotlin.p205x.C3347a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.Box;
import p190io.objectbox.BoxStore;
import p190io.objectbox.Property;
import p190io.objectbox.query.Query;
import p190io.objectbox.query.QueryBuilder;
import p190io.objectbox.relation.ToMany;

/* renamed from: io.objectbox.kotlin.ExtensionsKt */
public final class ExtensionsKt {
    public static final <T> void applyChangesToDb(ToMany<T> toMany, boolean z, C3350b<? super ToMany<T>, Unit> bVar) {
        C3370k.m12227b(toMany, "receiver$0");
        C3370k.m12227b(bVar, "body");
        if (z) {
            toMany.reset();
        }
        bVar.mo5146a(toMany);
        toMany.applyChangesToDb();
    }

    public static /* synthetic */ void applyChangesToDb$default(ToMany toMany, boolean z, C3350b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        C3370k.m12227b(toMany, "receiver$0");
        C3370k.m12227b(bVar, "body");
        if (z) {
            toMany.reset();
        }
        bVar.mo5146a(toMany);
        toMany.applyChangesToDb();
    }

    private static final <T> QueryBuilder<T> between(QueryBuilder<T> queryBuilder, Property<T> property, float f, float f2) {
        QueryBuilder<T> between = queryBuilder.between(property, (double) f, (double) f2);
        C3370k.m12223a((Object) between, "between(property, value1…ble(), value2.toDouble())");
        return between;
    }

    private static final <T> QueryBuilder<T> between(QueryBuilder<T> queryBuilder, Property<T> property, int i, int i2) {
        QueryBuilder<T> between = queryBuilder.between(property, (long) i, (long) i2);
        C3370k.m12223a((Object) between, "between(property, value1…oLong(), value2.toLong())");
        return between;
    }

    private static final <T> QueryBuilder<T> between(QueryBuilder<T> queryBuilder, Property<T> property, short s, short s2) {
        QueryBuilder<T> between = queryBuilder.between(property, (long) s, (long) s2);
        C3370k.m12223a((Object) between, "between(property, value1…oLong(), value2.toLong())");
        return between;
    }

    private static final <T> Box<T> boxFor(BoxStore boxStore) {
        C3370k.m12222a(4, "T");
        throw null;
    }

    public static final <T> Box<T> boxFor(BoxStore boxStore, C3202c<T> cVar) {
        C3370k.m12227b(boxStore, "receiver$0");
        C3370k.m12227b(cVar, "clazz");
        Box<T> boxFor = boxStore.boxFor(C3347a.m12186a(cVar));
        C3370k.m12223a((Object) boxFor, "boxFor(clazz.java)");
        return boxFor;
    }

    private static final <T> QueryBuilder<T> equal(QueryBuilder<T> queryBuilder, Property<T> property, float f, float f2) {
        QueryBuilder<T> equal = queryBuilder.equal(property, (double) f, (double) f2);
        C3370k.m12223a((Object) equal, "equal(property, value.to…(), tolerance.toDouble())");
        return equal;
    }

    private static final <T> QueryBuilder<T> equal(QueryBuilder<T> queryBuilder, Property<T> property, int i) {
        QueryBuilder<T> equal = queryBuilder.equal(property, (long) i);
        C3370k.m12223a((Object) equal, "equal(property, value.toLong())");
        return equal;
    }

    private static final <T> QueryBuilder<T> equal(QueryBuilder<T> queryBuilder, Property<T> property, short s) {
        QueryBuilder<T> equal = queryBuilder.equal(property, (long) s);
        C3370k.m12223a((Object) equal, "equal(property, value.toLong())");
        return equal;
    }

    private static final <T> QueryBuilder<T> greater(QueryBuilder<T> queryBuilder, Property<T> property, float f) {
        QueryBuilder<T> greater = queryBuilder.greater(property, (double) f);
        C3370k.m12223a((Object) greater, "greater(property, value.toDouble())");
        return greater;
    }

    private static final <T> QueryBuilder<T> greater(QueryBuilder<T> queryBuilder, Property<T> property, int i) {
        QueryBuilder<T> greater = queryBuilder.greater(property, (long) i);
        C3370k.m12223a((Object) greater, "greater(property, value.toLong())");
        return greater;
    }

    private static final <T> QueryBuilder<T> greater(QueryBuilder<T> queryBuilder, Property<T> property, short s) {
        QueryBuilder<T> greater = queryBuilder.greater(property, (long) s);
        C3370k.m12223a((Object) greater, "greater(property, value.toLong())");
        return greater;
    }

    private static final <T> QueryBuilder<T> inValues(QueryBuilder<T> queryBuilder, Property<T> property, int[] iArr) {
        QueryBuilder<T> in = queryBuilder.mo9772in(property, iArr);
        C3370k.m12223a((Object) in, "`in`(property, values)");
        return in;
    }

    private static final <T> QueryBuilder<T> inValues(QueryBuilder<T> queryBuilder, Property<T> property, long[] jArr) {
        QueryBuilder<T> in = queryBuilder.mo9773in(property, jArr);
        C3370k.m12223a((Object) in, "`in`(property, values)");
        return in;
    }

    private static final <T> QueryBuilder<T> inValues(QueryBuilder<T> queryBuilder, Property<T> property, String[] strArr) {
        QueryBuilder<T> in = queryBuilder.mo9774in(property, strArr);
        C3370k.m12223a((Object) in, "`in`(property, values)");
        return in;
    }

    private static final <T> QueryBuilder<T> inValues(QueryBuilder<T> queryBuilder, Property<T> property, String[] strArr, QueryBuilder.StringOrder stringOrder) {
        QueryBuilder<T> in = queryBuilder.mo9775in(property, strArr, stringOrder);
        C3370k.m12223a((Object) in, "`in`(property, values, stringOrder)");
        return in;
    }

    private static final <T> QueryBuilder<T> less(QueryBuilder<T> queryBuilder, Property<T> property, float f) {
        QueryBuilder<T> less = queryBuilder.less(property, (double) f);
        C3370k.m12223a((Object) less, "less(property, value.toDouble())");
        return less;
    }

    private static final <T> QueryBuilder<T> less(QueryBuilder<T> queryBuilder, Property<T> property, int i) {
        QueryBuilder<T> less = queryBuilder.less(property, (long) i);
        C3370k.m12223a((Object) less, "less(property, value.toLong())");
        return less;
    }

    private static final <T> QueryBuilder<T> less(QueryBuilder<T> queryBuilder, Property<T> property, short s) {
        QueryBuilder<T> less = queryBuilder.less(property, (long) s);
        C3370k.m12223a((Object) less, "less(property, value.toLong())");
        return less;
    }

    private static final <T> QueryBuilder<T> notEqual(QueryBuilder<T> queryBuilder, Property<T> property, int i) {
        QueryBuilder<T> notEqual = queryBuilder.notEqual(property, (long) i);
        C3370k.m12223a((Object) notEqual, "notEqual(property, value.toLong())");
        return notEqual;
    }

    private static final <T> QueryBuilder<T> notEqual(QueryBuilder<T> queryBuilder, Property<T> property, short s) {
        QueryBuilder<T> notEqual = queryBuilder.notEqual(property, (long) s);
        C3370k.m12223a((Object) notEqual, "notEqual(property, value.toLong())");
        return notEqual;
    }

    public static final <T> Query<T> query(Box<T> box, C3350b<? super QueryBuilder<T>, Unit> bVar) {
        C3370k.m12227b(box, "receiver$0");
        C3370k.m12227b(bVar, "block");
        QueryBuilder<T> query = box.query();
        C3370k.m12223a((Object) query, "builder");
        bVar.mo5146a(query);
        Query<T> build = query.build();
        C3370k.m12223a((Object) build, "builder.build()");
        return build;
    }
}
