package kotlinx.coroutines.internal;

import kotlin.C3269p;
import kotlin.p197u.C3314f;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlinx.coroutines.C3396a2;

/* renamed from: kotlinx.coroutines.internal.y */
public final class C3491y {

    /* renamed from: a */
    private static final C3487u f8200a = new C3487u("ZERO");

    /* renamed from: b */
    private static final C3351c<Object, C3314f.C3317b, Object> f8201b = C3492a.f8205g;

    /* renamed from: c */
    private static final C3351c<C3396a2<?>, C3314f.C3317b, C3396a2<?>> f8202c = C3493b.f8206g;

    /* renamed from: d */
    private static final C3351c<C3458b0, C3314f.C3317b, C3458b0> f8203d = C3495d.f8208g;

    /* renamed from: e */
    private static final C3351c<C3458b0, C3314f.C3317b, C3458b0> f8204e = C3494c.f8207g;

    /* renamed from: kotlinx.coroutines.internal.y$a */
    static final class C3492a extends C3371l implements C3351c<Object, C3314f.C3317b, Object> {

        /* renamed from: g */
        public static final C3492a f8205g = new C3492a();

        C3492a() {
            super(2);
        }

        /* renamed from: a */
        public final Object mo6125a(Object obj, C3314f.C3317b bVar) {
            C3370k.m12227b(bVar, "element");
            if (!(bVar instanceof C3396a2)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.y$b */
    static final class C3493b extends C3371l implements C3351c<C3396a2<?>, C3314f.C3317b, C3396a2<?>> {

        /* renamed from: g */
        public static final C3493b f8206g = new C3493b();

        C3493b() {
            super(2);
        }

        /* renamed from: a */
        public final C3396a2<?> mo6125a(C3396a2<?> a2Var, C3314f.C3317b bVar) {
            C3370k.m12227b(bVar, "element");
            if (a2Var != null) {
                return a2Var;
            }
            if (!(bVar instanceof C3396a2)) {
                bVar = null;
            }
            return (C3396a2) bVar;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.y$c */
    static final class C3494c extends C3371l implements C3351c<C3458b0, C3314f.C3317b, C3458b0> {

        /* renamed from: g */
        public static final C3494c f8207g = new C3494c();

        C3494c() {
            super(2);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
            C3458b0 b0Var = (C3458b0) obj;
            mo10259a(b0Var, (C3314f.C3317b) obj2);
            return b0Var;
        }

        /* renamed from: a */
        public final C3458b0 mo10259a(C3458b0 b0Var, C3314f.C3317b bVar) {
            C3370k.m12227b(b0Var, "state");
            C3370k.m12227b(bVar, "element");
            if (bVar instanceof C3396a2) {
                ((C3396a2) bVar).mo10107a(b0Var.mo10212a(), b0Var.mo10215c());
            }
            return b0Var;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.y$d */
    static final class C3495d extends C3371l implements C3351c<C3458b0, C3314f.C3317b, C3458b0> {

        /* renamed from: g */
        public static final C3495d f8208g = new C3495d();

        C3495d() {
            super(2);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
            C3458b0 b0Var = (C3458b0) obj;
            mo10260a(b0Var, (C3314f.C3317b) obj2);
            return b0Var;
        }

        /* renamed from: a */
        public final C3458b0 mo10260a(C3458b0 b0Var, C3314f.C3317b bVar) {
            C3370k.m12227b(b0Var, "state");
            C3370k.m12227b(bVar, "element");
            if (bVar instanceof C3396a2) {
                b0Var.mo10213a(((C3396a2) bVar).mo10106a(b0Var.mo10212a()));
            }
            return b0Var;
        }
    }

    /* renamed from: a */
    public static final Object m12593a(C3314f fVar) {
        C3370k.m12227b(fVar, "context");
        Object fold = fVar.fold(0, f8201b);
        if (fold != null) {
            return fold;
        }
        C3370k.m12221a();
        throw null;
    }

    /* renamed from: a */
    public static final void m12594a(C3314f fVar, Object obj) {
        C3370k.m12227b(fVar, "context");
        if (obj != f8200a) {
            if (obj instanceof C3458b0) {
                ((C3458b0) obj).mo10214b();
                fVar.fold(obj, f8204e);
                return;
            }
            Object fold = fVar.fold(null, f8202c);
            if (fold != null) {
                ((C3396a2) fold).mo10107a(fVar, obj);
                return;
            }
            throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    /* renamed from: b */
    public static final Object m12595b(C3314f fVar, Object obj) {
        C3370k.m12227b(fVar, "context");
        if (obj == null) {
            obj = m12593a(fVar);
        }
        if (obj == 0) {
            return f8200a;
        }
        if (obj instanceof Integer) {
            return fVar.fold(new C3458b0(fVar, ((Number) obj).intValue()), f8203d);
        }
        if (obj != null) {
            return ((C3396a2) obj).mo10106a(fVar);
        }
        throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }
}
