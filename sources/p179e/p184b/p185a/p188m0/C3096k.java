package p179e.p184b.p185a.p188m0;

import kotlin.C3256e;
import kotlin.Unit;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;
import p179e.p184b.p185a.C3059m;
import p179e.p184b.p185a.C3121p;
import p179e.p184b.p185a.C3125q;
import p179e.p184b.p185a.C3134v;

/* renamed from: e.b.a.m0.k */
public class C3096k implements C3059m {

    /* renamed from: h */
    static final /* synthetic */ C3208i[] f7852h;

    /* renamed from: i */
    public static final C3097a f7853i = new C3097a((C3366g) null);

    /* renamed from: f */
    private final C3256e f7854f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C3086f f7855g;

    /* renamed from: e.b.a.m0.k$a */
    public static final class C3097a {
        private C3097a() {
        }

        public /* synthetic */ C3097a(C3366g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final C3099l m11718a(boolean z, C3350b<? super C3059m.C3072g, Unit> bVar) {
            C3099l lVar = new C3099l(z);
            bVar.mo5146a(lVar);
            return lVar;
        }
    }

    /* renamed from: e.b.a.m0.k$b */
    static final class C3098b extends C3371l implements C3349a<C3086f> {

        /* renamed from: g */
        final /* synthetic */ C3096k f7856g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3098b(C3096k kVar) {
            super(0);
            this.f7856g = kVar;
        }

        public final C3086f invoke() {
            if (this.f7856g.f7855g.mo9195a() == null) {
                return this.f7856g.f7855g;
            }
            throw new IllegalStateException("Kodein has not been initialized");
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C3096k.class), "container", "getContainer()Lorg/kodein/di/KodeinContainer;");
        C3384y.m12259a((C3379t) uVar);
        f7852h = new C3208i[]{uVar};
    }

    public C3096k(C3086f fVar) {
        C3370k.m12227b(fVar, "_container");
        this.f7855g = fVar;
        this.f7854f = C3258g.m11969a(new C3098b(this));
    }

    private C3096k(C3099l lVar, boolean z) {
        this(new C3086f(lVar.mo9187c(), lVar.mo9203d(), lVar.mo9204e(), z));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3096k(boolean z, C3350b<? super C3059m.C3072g, Unit> bVar) {
        this(f7853i.m11718a(z, bVar), true);
        C3370k.m12227b(bVar, "init");
    }

    /* renamed from: b */
    public final C3121p mo9165b() {
        C3256e eVar = this.f7854f;
        C3208i iVar = f7852h[0];
        return (C3121p) eVar.getValue();
    }

    /* renamed from: c */
    public C3134v mo6349c() {
        return C3059m.C3067d.m11640c(this);
    }

    /* renamed from: d */
    public C3125q<?> mo6350d() {
        return C3059m.C3067d.m11639b(this);
    }

    /* renamed from: e */
    public C3059m mo6351e() {
        C3059m.C3067d.m11638a(this);
        return this;
    }
}
