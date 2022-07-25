package p179e.p184b.p185a;

import kotlin.C3269p;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p179e.p184b.p185a.C3059m;
import p179e.p184b.p185a.C3121p;

/* renamed from: e.b.a.o */
public final class C3119o {

    /* renamed from: e.b.a.o$a */
    static final class C3120a extends C3371l implements C3351c<C3125q<?>, String, T> {

        /* renamed from: g */
        final /* synthetic */ C3117n f7881g;

        /* renamed from: h */
        final /* synthetic */ C2999g0 f7882h;

        /* renamed from: i */
        final /* synthetic */ Object f7883i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3120a(C3117n nVar, C2999g0 g0Var, Object obj) {
            super(2);
            this.f7881g = nVar;
            this.f7882h = g0Var;
            this.f7883i = obj;
        }

        /* renamed from: a */
        public final T mo6125a(C3125q<?> qVar, String str) {
            C3370k.m12227b(qVar, "ctx");
            C3370k.m12227b(str, "<anonymous parameter 1>");
            C3121p b = this.f7881g.mo6351e().mo9165b();
            C2999g0<? super Object> a = qVar.mo9233a();
            if (a != null) {
                return C3121p.C3123b.m11774b(b, new C3059m.C3069f(a, C3002h0.m11526b(), this.f7882h, this.f7883i), qVar.getValue(), 0, 4, (Object) null).invoke();
            }
            throw new C3269p("null cannot be cast to non-null type org.kodein.di.TypeToken<in kotlin.Any?>");
        }
    }

    /* renamed from: a */
    public static final C3125q<Object> m11766a() {
        return C2998g.f7763b.mo9121a();
    }

    /* renamed from: a */
    public static final <T> C3130t<T> m11767a(C3117n nVar, C2999g0<? extends T> g0Var, Object obj) {
        C3370k.m12227b(nVar, "$this$Instance");
        C3370k.m12227b(g0Var, "type");
        return new C3130t<>(nVar.mo6349c(), nVar.mo6350d(), new C3120a(nVar, g0Var, obj));
    }
}
