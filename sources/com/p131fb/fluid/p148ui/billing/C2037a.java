package com.p131fb.fluid.p148ui.billing;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.C0375f;
import androidx.fragment.app.C0399c;
import androidx.fragment.app.C0401d;
import androidx.lifecycle.C0472b0;
import androidx.lifecycle.C0490o;
import androidx.lifecycle.C0497t;
import androidx.lifecycle.C0508z;
import com.android.billingclient.api.C1660h;
import com.android.billingclient.api.C1668l;
import com.android.billingclient.api.C1677s;
import com.p131fb.fluid.MainAccessibilityService;
import com.p131fb.fluid.p132j.C1725e;
import com.p131fb.fluid.p135l.p139p.C1770f;
import com.p131fb.fluid.p135l.p139p.C1771g;
import com.p131fb.fluid.utils.preferences.C2527h;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.C3256e;
import kotlin.Unit;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;
import org.kodein.p214di.android.p215x.C3569a;
import p054c.p055a.p056a.C1039a;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.p062r.C1084a;
import p179e.p184b.p185a.C2995e0;
import p179e.p184b.p185a.C3004i0;
import p179e.p184b.p185a.C3059m;
import p179e.p184b.p185a.C3117n;
import p179e.p184b.p185a.C3119o;
import p179e.p184b.p185a.C3125q;
import p179e.p184b.p185a.C3134v;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.billing.a */
public final class C2037a extends C0399c implements C3117n, C2046b {

    /* renamed from: r0 */
    static final /* synthetic */ C3208i[] f5628r0;

    /* renamed from: s0 */
    public static final C2039b f5629s0 = new C2039b((C3366g) null);

    /* renamed from: m0 */
    private C0497t<Integer> f5630m0;

    /* renamed from: n0 */
    private final C3256e f5631n0 = C3569a.m12867a(this).mo9126a(this, f5628r0[0]);

    /* renamed from: o0 */
    private C2527h f5632o0;

    /* renamed from: p0 */
    private final C3256e f5633p0 = C3119o.m11767a(this, C3004i0.m11527a(new C2038a()), (Object) null).mo9243a(this, f5628r0[1]);

    /* renamed from: q0 */
    private HashMap f5634q0;

    /* renamed from: com.fb.fluid.ui.billing.a$a */
    public static final class C2038a extends C2995e0<C2048d> {
    }

    /* renamed from: com.fb.fluid.ui.billing.a$b */
    public static final class C2039b {

        /* renamed from: com.fb.fluid.ui.billing.a$b$a */
        static final class C2040a extends C3371l implements C3349a<Unit> {

            /* renamed from: g */
            public static final C2040a f5635g = new C2040a();

            C2040a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        private C2039b() {
        }

        public /* synthetic */ C2039b(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ C2037a m8351a(C2039b bVar, C0401d dVar, List list, C3349a aVar, int i, Object obj) {
            if ((i & 2) != 0) {
                list = null;
            }
            if ((i & 4) != 0) {
                aVar = C2040a.f5635g;
            }
            return bVar.mo6903a(dVar, list, aVar);
        }

        /* renamed from: a */
        public final C2037a mo6903a(C0401d dVar, List<? extends C1677s> list, C3349a<Unit> aVar) {
            C3370k.m12227b(dVar, "context");
            C3370k.m12227b(aVar, "onDismiss");
            C2037a aVar2 = new C2037a();
            aVar2.mo2353a(dVar.mo2364k(), (String) null);
            dVar.mo2364k().mo2508n();
            try {
                C2047c d = aVar2.m8334G0();
                d.mo6910a(aVar);
                if (list != null) {
                    d.mo6909a(list);
                }
            } catch (Exception unused) {
            }
            return aVar2;
        }
    }

    /* renamed from: com.fb.fluid.ui.billing.a$c */
    static final class C2041c extends C3371l implements C3350b<C1660h, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2037a f5636g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2041c(C2037a aVar) {
            super(1);
            this.f5636g = aVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6904a((C1660h) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6904a(C1660h hVar) {
            C3370k.m12227b(hVar, "it");
            Context B = this.f5636g.mo2194B();
            if (B != null) {
                C1770f.m7465a(B, (int) C3148R.string.billing_unlocked, 0, 2, (Object) null);
            }
            this.f5636g.m8332E0();
        }
    }

    /* renamed from: com.fb.fluid.ui.billing.a$d */
    static final class C2042d extends C3371l implements C3351c<C1660h, String, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2037a f5637g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2042d(C2037a aVar) {
            super(2);
            this.f5637g = aVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
            mo6905a((C1660h) obj, (String) obj2);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6905a(C1660h hVar, String str) {
            C3370k.m12227b(hVar, "<anonymous parameter 0>");
            C3370k.m12227b(str, "<anonymous parameter 1>");
            C2037a.m8339c(this.f5637g).mo7518e(C1771g.m7472b(new Date(), 1).getTime());
            Context B = this.f5637g.mo2194B();
            if (B != null) {
                C1770f.m7465a(B, (int) C3148R.string.billing_unlocked, 0, 2, (Object) null);
            }
            this.f5637g.m8332E0();
        }
    }

    /* renamed from: com.fb.fluid.ui.billing.a$e */
    static final class C2043e extends C3371l implements C3352d<Integer, C1660h, List<C1668l>, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2037a f5638g;

        /* renamed from: h */
        final /* synthetic */ C2047c f5639h;

        /* renamed from: i */
        final /* synthetic */ C0401d f5640i;

        /* renamed from: com.fb.fluid.ui.billing.a$e$a */
        static final class C2044a extends C3371l implements C3351c<C1660h, List<? extends C1677s>, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2043e f5641g;

            /* renamed from: com.fb.fluid.ui.billing.a$e$a$a */
            static final class C2045a extends C3371l implements C3350b<C1660h, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2044a f5642g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2045a(C2044a aVar) {
                    super(1);
                    this.f5642g = aVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                    mo6908a((C1660h) obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo6908a(C1660h hVar) {
                    C3370k.m12227b(hVar, "result");
                    this.f5642g.f5641g.f5638g.mo6901o().setValue(Integer.valueOf(hVar.mo6279a() == 0 ? 0 : 8));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2044a(C2043e eVar) {
                super(2);
                this.f5641g = eVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo6907a((C1660h) obj, (List<? extends C1677s>) (List) obj2);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6907a(C1660h hVar, List<? extends C1677s> list) {
                C3370k.m12227b(hVar, "<anonymous parameter 0>");
                this.f5641g.f5639h.mo6909a(list);
                C1677s i = this.f5641g.f5639h.mo6913i();
                if (i != null) {
                    this.f5641g.f5638g.m8333F0().mo6887a(i, (C3350b<? super C1660h, Unit>) new C2045a(this));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2043e(C2037a aVar, C2047c cVar, C0401d dVar) {
            super(3);
            this.f5638g = aVar;
            this.f5639h = cVar;
            this.f5640i = dVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
            mo6906a(((Number) obj).intValue(), (C1660h) obj2, (List<C1668l>) (List) obj3);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6906a(int i, C1660h hVar, List<C1668l> list) {
            int a = hVar != null ? hVar.mo6279a() : 6;
            if (i == 0) {
                this.f5638g.m8337a(list);
                this.f5638g.m8333F0().mo6888a(C3284j.m12070b((T[]) new String[]{"fluid_pro", "fluid_day"}), "inapp", new C2044a(this));
            } else if (i != 1 && i == 2) {
                if (a == 0) {
                    this.f5638g.m8337a(list);
                } else if (a == 1) {
                    C1770f.m7465a((Context) this.f5640i, (int) C3148R.string.billing_cancelled, 0, 2, (Object) null);
                } else if (a != 7) {
                    C0401d dVar = this.f5640i;
                    String string = dVar.getString(C3148R.string.billing_error, new Object[]{Integer.valueOf(a)});
                    C3370k.m12223a((Object) string, "context.getString(R.stri…illing_error, resultCode)");
                    C1770f.m7467a((Context) dVar, string, 0, 2, (Object) null);
                }
            }
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C2037a.class), "kodein", "getKodein()Lorg/kodein/di/Kodein;");
        C3384y.m12259a((C3379t) uVar);
        C3380u uVar2 = new C3380u(C3384y.m12254a(C2037a.class), "billingHelper", "getBillingHelper()Lcom/fb/fluid/ui/billing/BillingHelper;");
        C3384y.m12259a((C3379t) uVar2);
        f5628r0 = new C3208i[]{uVar, uVar2};
    }

    public C2037a() {
        C0497t<Integer> tVar = new C0497t<>();
        tVar.setValue(8);
        this.f5630m0 = tVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public final void m8332E0() {
        try {
            mo2351C0();
            C0401d u = mo2304u();
            if (u != null) {
                C1770f.m7463a(u).mo6354h();
                u.startService(new Intent(mo2304u(), MainAccessibilityService.class).putExtra("update_ui", true));
            }
        } catch (Exception e) {
            "bg.hp.nbUI " + e.getMessage();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public final C2048d m8333F0() {
        C3256e eVar = this.f5633p0;
        C3208i iVar = f5628r0[1];
        return (C2048d) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public final C2047c m8334G0() {
        C0508z a = C0472b0.m2420b(this).mo2674a(C2047c.class);
        C3370k.m12223a((Object) a, "ViewModelProviders.of(th…logViewModel::class.java)");
        return (C2047c) a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8337a(List<C1668l> list) {
        Context B;
        if (list != null) {
            for (C1668l lVar : list) {
                int b = lVar.mo6289b();
                if (b == 1) {
                    String e = lVar.mo6292e();
                    if (e != null) {
                        int hashCode = e.hashCode();
                        if (hashCode != -866715737) {
                            if (hashCode == -866703688 && e.equals("fluid_pro")) {
                                if (!lVar.mo6294f()) {
                                    m8333F0().mo6885a(lVar, (C3350b<? super C1660h, Unit>) new C2041c(this));
                                } else {
                                    m8332E0();
                                }
                            }
                        } else if (e.equals("fluid_day")) {
                            m8333F0().mo6886a(lVar, (C3351c<? super C1660h, ? super String, Unit>) new C2042d(this));
                        }
                    }
                } else if (b == 2 && (B = mo2194B()) != null) {
                    C1770f.m7465a(B, (int) C3148R.string.billing_pending, 0, 2, (Object) null);
                }
            }
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ C2527h m8339c(C2037a aVar) {
        C2527h hVar = aVar.f5632o0;
        if (hVar != null) {
            return hVar;
        }
        C3370k.m12230d("prefHelper");
        throw null;
    }

    /* renamed from: D0 */
    public void mo6873D0() {
        HashMap hashMap = this.f5634q0;
        if (hashMap != null) {
            hashMap.clear();
        }
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
        C3256e eVar = this.f5631n0;
        C3208i iVar = f5628r0[0];
        return (C3059m) eVar.getValue();
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo2279h0() {
        super.mo2279h0();
        mo6873D0();
    }

    /* renamed from: i */
    public void mo6899i() {
        m8333F0().mo6890b();
    }

    /* renamed from: n */
    public Dialog mo2355n(Bundle bundle) {
        C0401d u = mo2304u();
        if (u != null) {
            C3370k.m12223a((Object) u, "activity ?: throw Illega…ception(\"Billing dialog\")");
            C2047c G0 = m8334G0();
            this.f5632o0 = new C2527h(u);
            C1725e eVar = (C1725e) C0375f.m1846a(LayoutInflater.from(u), (int) C3148R.layout.layout_dialog_billing, (ViewGroup) null, false);
            eVar.mo2135a((C0490o) this);
            eVar.mo6462a((C2046b) this);
            eVar.mo6463a(G0);
            m8333F0().mo6884a((C0490o) this, (C3352d<? super Integer, ? super C1660h, ? super List<C1668l>, Unit>) new C2043e(this, G0, u));
            C1041c cVar = new C1041c(u, (C1039a) null, 2, (C3366g) null);
            cVar.mo5118j();
            C3370k.m12223a((Object) eVar, "binding");
            C1084a.m5469a(cVar, (Integer) null, eVar.mo2140c(), false, true, false, false, 49, (Object) null);
            cVar.show();
            return cVar;
        }
        throw new IllegalStateException("Billing dialog");
    }

    /* renamed from: n */
    public void mo6900n() {
        C1677s j = m8334G0().mo6914j();
        if (j != null) {
            C2048d F0 = m8333F0();
            C0401d x0 = mo2311x0();
            C3370k.m12223a((Object) x0, "requireActivity()");
            F0.mo6891b(x0, j);
        }
    }

    /* renamed from: o */
    public C0497t<Integer> mo6901o() {
        return this.f5630m0;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C3370k.m12227b(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        C3349a<Unit> h = m8334G0().mo6912h();
        if (h != null) {
            Unit invoke = h.invoke();
        }
    }

    /* renamed from: s */
    public void mo6902s() {
        C1677s i = m8334G0().mo6913i();
        if (i != null) {
            C2048d F0 = m8333F0();
            C0401d x0 = mo2311x0();
            C3370k.m12223a((Object) x0, "requireActivity()");
            F0.mo6883a(x0, i);
        }
    }
}
