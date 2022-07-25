package p179e.p184b.p185a.p187l0;

import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p179e.p184b.p185a.C2999g0;
import p179e.p184b.p185a.C3059m;
import p179e.p184b.p185a.p187l0.C3036j;

/* renamed from: e.b.a.l0.m */
public final class C3040m<C, T> implements C3036j<C, T> {

    /* renamed from: a */
    private final C2999g0<? super C> f7782a;

    /* renamed from: b */
    private final C2999g0<? extends T> f7783b;

    /* renamed from: c */
    private final C3350b<C3034h<? extends C>, T> f7784c;

    /* renamed from: e.b.a.l0.m$a */
    static final class C3041a extends C3371l implements C3350b<Unit, T> {

        /* renamed from: g */
        final /* synthetic */ C3040m f7785g;

        /* renamed from: h */
        final /* synthetic */ C3024c f7786h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3041a(C3040m mVar, C3024c cVar) {
            super(1);
            this.f7785g = mVar;
            this.f7786h = cVar;
        }

        /* renamed from: a */
        public final T mo5146a(Unit unit) {
            C3370k.m12227b(unit, "it");
            return this.f7785g.mo9147j().mo5146a(new C3035i(this.f7786h));
        }
    }

    public C3040m(C2999g0<? super C> g0Var, C2999g0<? extends T> g0Var2, C3350b<? super C3034h<? extends C>, ? extends T> bVar) {
        C3370k.m12227b(g0Var, "contextType");
        C3370k.m12227b(g0Var2, "createdType");
        C3370k.m12227b(bVar, "creator");
        this.f7782a = g0Var;
        this.f7783b = g0Var2;
        this.f7784c = bVar;
    }

    /* renamed from: a */
    public C2999g0<? super C> mo9136a() {
        return this.f7782a;
    }

    /* renamed from: a */
    public C3350b<Unit, T> mo9129a(C3024c<? extends C> cVar, C3059m.C3069f<? super C, ? super Unit, ? extends T> fVar) {
        C3370k.m12227b(cVar, "kodein");
        C3370k.m12227b(fVar, "key");
        return new C3041a(this, cVar);
    }

    /* renamed from: b */
    public C3044p<C> mo9137b() {
        return C3036j.C3037a.m11583e(this);
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
        return this.f7783b;
    }

    /* renamed from: g */
    public String mo9142g() {
        return C3036j.C3037a.m11581c(this);
    }

    /* renamed from: h */
    public String mo9143h() {
        return C3036j.C3037a.m11579a(this);
    }

    /* renamed from: i */
    public String mo9144i() {
        return "provider";
    }

    /* renamed from: j */
    public final C3350b<C3034h<? extends C>, T> mo9147j() {
        return this.f7784c;
    }
}
