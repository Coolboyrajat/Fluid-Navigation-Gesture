package p179e.p184b.p185a.p187l0;

import java.util.ArrayList;
import java.util.List;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p179e.p184b.p185a.C2999g0;
import p179e.p184b.p185a.C3004i0;
import p179e.p184b.p185a.C3059m;
import p179e.p184b.p185a.C3121p;
import p179e.p184b.p185a.p187l0.C3029g;
import p179e.p184b.p185a.p187l0.C3036j;

/* renamed from: e.b.a.l0.v */
public final class C3050v<C, T> implements C3036j<C, T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3042n f7791a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3046r<Unit> f7792b;

    /* renamed from: c */
    private final C3044p<C> f7793c;

    /* renamed from: d */
    private final C2999g0<? super C> f7794d;

    /* renamed from: e */
    private final C2999g0<? extends T> f7795e;

    /* renamed from: f */
    private final boolean f7796f;

    /* renamed from: g */
    private final C3350b<C3038k<? extends C>, T> f7797g;

    /* renamed from: e.b.a.l0.v$a */
    static final class C3051a extends C3371l implements C3350b<C3121p.C3122a, C3050v<C, T>> {

        /* renamed from: g */
        final /* synthetic */ C3050v f7798g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3051a(C3050v vVar) {
            super(1);
            this.f7798g = vVar;
        }

        /* renamed from: a */
        public final C3050v<C, T> mo5146a(C3121p.C3122a aVar) {
            C3370k.m12227b(aVar, "it");
            return new C3050v(this.f7798g.mo9137b(), this.f7798g.mo9136a(), this.f7798g.mo9141f(), this.f7798g.f7791a, this.f7798g.mo9162k(), this.f7798g.mo9161j());
        }
    }

    /* renamed from: e.b.a.l0.v$b */
    static final class C3052b extends C3371l implements C3350b<Unit, T> {

        /* renamed from: g */
        final /* synthetic */ C3050v f7799g;

        /* renamed from: h */
        final /* synthetic */ C3047s f7800h;

        /* renamed from: i */
        final /* synthetic */ C3024c f7801i;

        /* renamed from: e.b.a.l0.v$b$a */
        static final class C3053a extends C3371l implements C3349a<C3043o<? extends T>> {

            /* renamed from: g */
            final /* synthetic */ C3052b f7802g;

            /* renamed from: e.b.a.l0.v$b$a$a */
            static final class C3054a extends C3371l implements C3349a<T> {

                /* renamed from: g */
                final /* synthetic */ C3053a f7803g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C3054a(C3053a aVar) {
                    super(0);
                    this.f7803g = aVar;
                }

                public final T invoke() {
                    C3350b j = this.f7803g.f7802g.f7799g.mo9161j();
                    C3024c cVar = this.f7803g.f7802g.f7801i;
                    return j.mo5146a(new C3035i(new C3023b(cVar, cVar.mo9130a())));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3053a(C3052b bVar) {
                super(0);
                this.f7802g = bVar;
            }

            public final C3043o<T> invoke() {
                return this.f7802g.f7799g.f7791a.mo9149a(new C3054a(this));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3052b(C3050v vVar, C3047s sVar, C3024c cVar) {
            super(1);
            this.f7799g = vVar;
            this.f7800h = sVar;
            this.f7801i = cVar;
        }

        /* renamed from: a */
        public final T mo5146a(Unit unit) {
            C3370k.m12227b(unit, "it");
            T a = this.f7800h.mo9159a(this.f7799g.f7792b, this.f7799g.mo9162k(), new C3053a(this));
            if (a != null) {
                return a;
            }
            throw new C3269p("null cannot be cast to non-null type T");
        }
    }

    public C3050v(C3044p<? super C> pVar, C2999g0<? super C> g0Var, C2999g0<? extends T> g0Var2, C3042n nVar, boolean z, C3350b<? super C3038k<? extends C>, ? extends T> bVar) {
        C3370k.m12227b(pVar, "scope");
        C3370k.m12227b(g0Var, "contextType");
        C3370k.m12227b(g0Var2, "createdType");
        C3370k.m12227b(bVar, "creator");
        this.f7793c = pVar;
        this.f7794d = g0Var;
        this.f7795e = g0Var2;
        this.f7796f = z;
        this.f7797g = bVar;
        this.f7791a = nVar == null ? C3055w.f7804a : nVar;
        this.f7792b = new C3046r<>(new Object(), Unit.INSTANCE);
        C3029g.C3030a.f7779a.mo9145a(new C3051a(this));
    }

    /* renamed from: a */
    private final String m11608a(List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("singleton");
        if (!list.isEmpty()) {
            sb.append(C3292r.m12086a(list, ", ", "(", ")", 0, (CharSequence) null, (C3350b) null, 56, (Object) null));
        }
        String sb2 = sb.toString();
        C3370k.m12223a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: a */
    public C2999g0<? super C> mo9136a() {
        return this.f7794d;
    }

    /* renamed from: a */
    public C3350b<Unit, T> mo9129a(C3024c<? extends C> cVar, C3059m.C3069f<? super C, ? super Unit, ? extends T> fVar) {
        C3370k.m12227b(cVar, "kodein");
        C3370k.m12227b(fVar, "key");
        return new C3052b(this, mo9137b().mo9146a(cVar.mo9130a()), cVar);
    }

    /* renamed from: b */
    public C3044p<C> mo9137b() {
        return this.f7793c;
    }

    /* renamed from: c */
    public String mo9138c() {
        return C3036j.C3037a.m11582d(this);
    }

    /* renamed from: d */
    public boolean mo9139d() {
        return C3036j.C3037a.m11584f(this);
    }

    /* renamed from: e */
    public C2999g0<Unit> mo9140e() {
        return C3036j.C3037a.m11580b(this);
    }

    /* renamed from: f */
    public C2999g0<? extends T> mo9141f() {
        return this.f7795e;
    }

    /* renamed from: g */
    public String mo9142g() {
        return C3036j.C3037a.m11581c(this);
    }

    /* renamed from: h */
    public String mo9143h() {
        ArrayList arrayList = new ArrayList(2);
        if (!C3370k.m12225a((Object) this.f7791a, (Object) C3055w.f7804a)) {
            arrayList.add("ref = " + C3004i0.m11529a(this.f7791a).mo9122a());
        }
        return m11608a((List<String>) arrayList);
    }

    /* renamed from: i */
    public String mo9144i() {
        ArrayList arrayList = new ArrayList(2);
        if (!C3370k.m12225a((Object) this.f7791a, (Object) C3055w.f7804a)) {
            arrayList.add("ref = " + C3004i0.m11529a(this.f7791a).mo9123d());
        }
        return m11608a((List<String>) arrayList);
    }

    /* renamed from: j */
    public final C3350b<C3038k<? extends C>, T> mo9161j() {
        return this.f7797g;
    }

    /* renamed from: k */
    public final boolean mo9162k() {
        return this.f7796f;
    }
}
