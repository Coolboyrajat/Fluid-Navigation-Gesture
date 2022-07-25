package p179e.p184b.p185a;

import kotlin.C3256e;
import kotlin.C3269p;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p179e.p184b.p185a.C3125q;

/* renamed from: e.b.a.t */
public final class C3130t<V> implements C3137x<V> {

    /* renamed from: a */
    private final C3134v f7892a;

    /* renamed from: b */
    private final C3125q<?> f7893b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3351c<C3125q<?>, String, V> f7894c;

    /* renamed from: e.b.a.t$a */
    static final class C3131a extends C3371l implements C3349a<V> {

        /* renamed from: g */
        final /* synthetic */ C3130t f7895g;

        /* renamed from: h */
        final /* synthetic */ Object f7896h;

        /* renamed from: i */
        final /* synthetic */ C3208i f7897i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3131a(C3130t tVar, Object obj, C3208i iVar) {
            super(0);
            this.f7895g = tVar;
            this.f7896h = obj;
            this.f7897i = iVar;
        }

        public final V invoke() {
            C3125q<?> qVar;
            if (this.f7896h == null || this.f7895g.mo9242a() != C3119o.m11766a()) {
                qVar = this.f7895g.mo9242a();
            } else {
                C3125q.C3126a aVar = C3125q.f7885a;
                C2999g0 a = C3004i0.m11529a(this.f7896h);
                if (a != null) {
                    qVar = aVar.mo9235a(a, this.f7896h);
                } else {
                    throw new C3269p("null cannot be cast to non-null type org.kodein.di.TypeToken<in kotlin.Any>");
                }
            }
            return this.f7895g.f7894c.mo6125a(qVar, this.f7897i.mo6062b());
        }
    }

    public C3130t(C3134v vVar, C3125q<?> qVar, C3351c<? super C3125q<?>, ? super String, ? extends V> cVar) {
        C3370k.m12227b(qVar, "originalContext");
        C3370k.m12227b(cVar, "get");
        this.f7892a = vVar;
        this.f7893b = qVar;
        this.f7894c = cVar;
    }

    /* renamed from: a */
    public final C3125q<?> mo9242a() {
        return this.f7893b;
    }

    /* renamed from: a */
    public C3256e<V> mo9243a(Object obj, C3208i<? extends Object> iVar) {
        C3370k.m12227b(iVar, "prop");
        C3256e<V> a = C3258g.m11969a(new C3131a(this, obj, iVar));
        C3134v vVar = this.f7892a;
        if (vVar == null) {
            return a;
        }
        vVar.mo9244a();
        throw null;
    }
}
