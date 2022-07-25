package p179e.p184b.p185a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.C3256e;
import kotlin.C3269p;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3377r;
import kotlin.p205x.p207d.C3378s;
import kotlin.p205x.p207d.C3384y;

/* renamed from: e.b.a.i0 */
public final class C3004i0 {

    /* renamed from: a */
    static final /* synthetic */ C3208i[] f7764a;

    /* renamed from: b */
    private static final C3256e f7765b = C3258g.m11969a(C3008b.f7768g);

    /* renamed from: c */
    private static final C3256e f7766c = C3258g.m11969a(C3005a.f7767g);

    /* renamed from: e.b.a.i0$a */
    static final class C3005a extends C3371l implements C3349a<Boolean> {

        /* renamed from: g */
        public static final C3005a f7767g = new C3005a();

        /* renamed from: e.b.a.i0$a$a */
        public static final class C3006a extends C3012j0<List<? extends String>[]> {
            C3006a() {
            }
        }

        /* renamed from: e.b.a.i0$a$b */
        public static final class C3007b extends C3012j0<List<? extends String>[]> {
            C3007b() {
            }
        }

        C3005a() {
            super(0);
        }

        public final boolean invoke() {
            Type a = new C3006a().mo9124a();
            if (a != null) {
                GenericArrayType genericArrayType = (GenericArrayType) a;
                Type a2 = new C3007b().mo9124a();
                if (a2 != null) {
                    return !C3370k.m12225a((Object) genericArrayType, (Object) (GenericArrayType) a2);
                }
                throw new C3269p("null cannot be cast to non-null type java.lang.reflect.GenericArrayType");
            }
            throw new C3269p("null cannot be cast to non-null type java.lang.reflect.GenericArrayType");
        }
    }

    /* renamed from: e.b.a.i0$b */
    static final class C3008b extends C3371l implements C3349a<Boolean> {

        /* renamed from: g */
        public static final C3008b f7768g = new C3008b();

        /* renamed from: e.b.a.i0$b$a */
        public static final class C3009a extends C3012j0<List<? extends String>> {
            C3009a() {
            }
        }

        /* renamed from: e.b.a.i0$b$b */
        public static final class C3010b extends C3012j0<List<? extends String>> {
            C3010b() {
            }
        }

        C3008b() {
            super(0);
        }

        public final boolean invoke() {
            Type a = new C3009a().mo9124a();
            if (a != null) {
                ParameterizedType parameterizedType = (ParameterizedType) a;
                Type a2 = new C3010b().mo9124a();
                if (a2 != null) {
                    return !C3370k.m12225a((Object) parameterizedType, (Object) (ParameterizedType) a2);
                }
                throw new C3269p("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
            }
            throw new C3269p("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        }
    }

    static {
        Class<C3004i0> cls = C3004i0.class;
        C3378s sVar = new C3378s(C3384y.m12255a(cls, "kodein-di-core"), "_needPTWrapper", "get_needPTWrapper()Z");
        C3384y.m12258a((C3377r) sVar);
        C3378s sVar2 = new C3378s(C3384y.m12255a(cls, "kodein-di-core"), "_needGATWrapper", "get_needGATWrapper()Z");
        C3384y.m12258a((C3377r) sVar2);
        f7764a = new C3208i[]{sVar, sVar2};
    }

    /* renamed from: a */
    public static final <T> C2999g0<T> m11527a(C2995e0<T> e0Var) {
        C3370k.m12227b(e0Var, "ref");
        C2999g0<?> a = m11530a(e0Var.mo9113a());
        if (a != null) {
            return a;
        }
        throw new C3269p("null cannot be cast to non-null type org.kodein.di.TypeToken<T>");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final <T> C2999g0<? super T> m11528a(Class<T> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        C2999g0<?> a = m11530a(genericSuperclass);
        if (a != null) {
            return a;
        }
        throw new C3269p("null cannot be cast to non-null type org.kodein.di.TypeToken<in T>");
    }

    /* renamed from: a */
    public static final <T> C2999g0<? extends T> m11529a(T t) {
        C3370k.m12227b(t, "obj");
        return new C2996f(t.getClass());
    }

    /* renamed from: a */
    public static final C2999g0<?> m11530a(Type type) {
        C3370k.m12227b(type, "type");
        return type instanceof Class ? new C2996f((Class) type) : new C3139z(type);
    }

    /* renamed from: b */
    public static final Type m11533b(Type type) {
        Type a;
        C3370k.m12227b(type, "$this$javaType");
        C3135w wVar = (C3135w) (!(type instanceof C3135w) ? null : type);
        return (wVar == null || (a = wVar.mo9245a()) == null) ? type : a;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m11535c() {
        C3256e eVar = f7766c;
        C3208i iVar = f7764a[1];
        return ((Boolean) eVar.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m11536d() {
        C3256e eVar = f7765b;
        C3208i iVar = f7764a[0];
        return ((Boolean) eVar.getValue()).booleanValue();
    }
}
