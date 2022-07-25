package com.p131fb.fluid;

import android.app.Application;
import androidx.appcompat.app.C0035f;
import com.p131fb.fluid.p135l.C1753k;
import com.p131fb.fluid.p135l.p139p.C1771g;
import com.p131fb.fluid.p135l.p143t.C1798b;
import com.p131fb.fluid.p148ui.billing.BillingHelperImpl;
import com.p131fb.fluid.p148ui.billing.C2048d;
import com.p131fb.fluid.p148ui.p153h.C2493a;
import com.p131fb.fluid.p148ui.p153h.C2494b;
import com.p131fb.fluid.utils.preferences.C2521f;
import com.p131fb.fluid.utils.preferences.C2527h;
import java.util.Date;
import kotlin.C3256e;
import kotlin.Unit;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;
import p179e.p184b.p185a.C2995e0;
import p179e.p184b.p185a.C3004i0;
import p179e.p184b.p185a.C3059m;
import p179e.p184b.p185a.C3117n;
import p179e.p184b.p185a.C3125q;
import p179e.p184b.p185a.C3134v;
import p179e.p184b.p185a.p187l0.C3034h;
import p179e.p184b.p185a.p187l0.C3038k;
import p179e.p184b.p185a.p187l0.C3040m;
import p179e.p184b.p185a.p187l0.C3042n;
import p179e.p184b.p185a.p187l0.C3050v;

/* renamed from: com.fb.fluid.App */
public final class App extends Application implements C3117n {

    /* renamed from: i */
    static final /* synthetic */ C3208i[] f4900i;

    /* renamed from: f */
    private final C3059m f4901f = C3059m.C3065c.m11635a(C3059m.f7808e, false, new C1683a(this), 1, (Object) null);

    /* renamed from: g */
    private final C3256e f4902g = C3258g.m11969a(new C1690b(this));

    /* renamed from: h */
    private final C3256e f4903h = C3258g.m11969a(new C1692d(this));

    /* renamed from: com.fb.fluid.App$a */
    static final class C1683a extends C3371l implements C3350b<C3059m.C3072g, Unit> {

        /* renamed from: g */
        final /* synthetic */ App f4904g;

        /* renamed from: com.fb.fluid.App$a$a */
        public static final class C1684a extends C2995e0<C2493a> {
        }

        /* renamed from: com.fb.fluid.App$a$b */
        public static final class C1685b extends C2995e0<C2048d> {
        }

        /* renamed from: com.fb.fluid.App$a$c */
        public static final class C1686c extends C2995e0<BillingHelperImpl> {
        }

        /* renamed from: com.fb.fluid.App$a$d */
        public static final class C1687d extends C2995e0<C2494b> {
        }

        /* renamed from: com.fb.fluid.App$a$e */
        static final class C1688e extends C3371l implements C3350b<C3038k<? extends Object>, C2494b> {

            /* renamed from: g */
            final /* synthetic */ C1683a f4905g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1688e(C1683a aVar) {
                super(1);
                this.f4905g = aVar;
            }

            /* renamed from: a */
            public final C2494b mo5146a(C3038k<? extends Object> kVar) {
                C3370k.m12227b(kVar, "$receiver");
                return new C2494b(this.f4905g.f4904g);
            }
        }

        /* renamed from: com.fb.fluid.App$a$f */
        static final class C1689f extends C3371l implements C3350b<C3034h<? extends Object>, BillingHelperImpl> {

            /* renamed from: g */
            final /* synthetic */ C1683a f4906g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1689f(C1683a aVar) {
                super(1);
                this.f4906g = aVar;
            }

            /* renamed from: a */
            public final BillingHelperImpl mo5146a(C3034h<? extends Object> hVar) {
                C3370k.m12227b(hVar, "$receiver");
                return new BillingHelperImpl(this.f4906g.f4904g);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1683a(App app) {
            super(1);
            this.f4904g = app;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6356a((C3059m.C3072g) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6356a(C3059m.C3072g gVar) {
            C3370k.m12227b(gVar, "$receiver");
            gVar.mo9168a(C3004i0.m11527a(new C1684a()), (Object) null, (Boolean) null).mo9169a(new C3050v(gVar.mo9167b(), gVar.mo9166a(), C3004i0.m11527a(new C1687d()), (C3042n) null, true, new C1688e(this)));
            gVar.mo9168a(C3004i0.m11527a(new C1685b()), (Object) null, (Boolean) null).mo9169a(new C3040m(gVar.mo9166a(), C3004i0.m11527a(new C1686c()), new C1689f(this)));
        }
    }

    /* renamed from: com.fb.fluid.App$b */
    static final class C1690b extends C3371l implements C3349a<C2527h> {

        /* renamed from: g */
        final /* synthetic */ App f4907g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1690b(App app) {
            super(0);
            this.f4907g = app;
        }

        public final C2527h invoke() {
            return new C2527h(this.f4907g);
        }
    }

    /* renamed from: com.fb.fluid.App$c */
    static final class C1691c extends C3371l implements C3351c<Long, Long, Unit> {

        /* renamed from: g */
        final /* synthetic */ App f4908g;

        /* renamed from: h */
        final /* synthetic */ C3349a f4909h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1691c(App app, C3349a aVar) {
            super(2);
            this.f4908g = app;
            this.f4909h = aVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
            mo6359a(((Number) obj).longValue(), ((Number) obj2).longValue());
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6359a(long j, long j2) {
            C0035f.m115e(this.f4908g.m7204i().mo7496I());
            C3349a aVar = this.f4909h;
            if (aVar != null) {
                Unit unit = (Unit) aVar.invoke();
            }
        }
    }

    /* renamed from: com.fb.fluid.App$d */
    static final class C1692d extends C3371l implements C3349a<C1798b<Boolean>> {

        /* renamed from: g */
        final /* synthetic */ App f4910g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1692d(App app) {
            super(0);
            this.f4910g = app;
        }

        public final C1798b<Boolean> invoke() {
            return new C1798b<>(Boolean.valueOf(!this.f4910g.mo6348a()));
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(App.class), "prefHelper", "getPrefHelper()Lcom/fb/fluid/utils/preferences/SharedPrefHelper;");
        C3384y.m12259a((C3379t) uVar);
        C3380u uVar2 = new C3380u(C3384y.m12254a(App.class), "showingBillingUI", "getShowingBillingUI()Lcom/fb/fluid/utils/rx/Variable;");
        C3384y.m12259a((C3379t) uVar2);
        f4900i = new C3208i[]{uVar, uVar2};
    }

    /* renamed from: a */
    public static /* synthetic */ void m7203a(App app, C3349a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        app.mo6347a((C3349a<Unit>) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final C2527h m7204i() {
        C3256e eVar = this.f4902g;
        C3208i iVar = f4900i[0];
        return (C2527h) eVar.getValue();
    }

    /* renamed from: a */
    public final void mo6347a(C3349a<Unit> aVar) {
        new C1753k(this).mo6522a(new C1691c(this, aVar));
    }

    /* renamed from: a */
    public final boolean mo6348a() {
        return (new Date(m7204i().mo7497J()).getTime() > new Date().getTime() && new Date(m7204i().mo7497J()).getTime() < C1771g.m7472b(new Date(), 2).getTime()) || (new Date(m7204i().mo7491D()).getTime() > new Date().getTime() && new Date(m7204i().mo7491D()).getTime() < C1771g.m7472b(new Date(), 2).getTime());
    }

    /* renamed from: c */
    public C3134v mo6349c() {
        return C3117n.C3118a.m11765b(this);
    }

    /* renamed from: d */
    public C3125q<?> mo6350d() {
        return C3117n.C3118a.m11764a(this);
    }

    /* renamed from: e */
    public C3059m mo6351e() {
        return this.f4901f;
    }

    /* renamed from: f */
    public final C1798b<Boolean> mo6352f() {
        C3256e eVar = this.f4903h;
        C3208i iVar = f4900i[1];
        return (C1798b) eVar.getValue();
    }

    /* renamed from: g */
    public final boolean mo6353g() {
        return (m7204i().mo7491D() != 0 || new Date(m7204i().mo7497J()).getTime() <= new Date().getTime() || new Date(m7204i().mo7497J()).getTime() >= C1771g.m7472b(new Date(), 2).getTime()) ? false : false;
    }

    /* renamed from: h */
    public final void mo6354h() {
        mo6352f().mo6588a(Boolean.valueOf(!mo6348a()));
    }

    public void onCreate() {
        super.onCreate();
        C2521f.f6389b.mo7482a(this);
        if (!(Thread.getDefaultUncaughtExceptionHandler() instanceof C1697d)) {
            Thread.setDefaultUncaughtExceptionHandler(new C1697d(this, m7204i()));
        }
        m7203a(this, (C3349a) null, 1, (Object) null);
    }
}
