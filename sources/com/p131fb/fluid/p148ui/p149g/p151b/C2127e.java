package com.p131fb.fluid.p148ui.p149g.p151b;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import androidx.fragment.app.C0401d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0464a0;
import androidx.lifecycle.C0472b0;
import androidx.lifecycle.C0498u;
import androidx.lifecycle.C0508z;
import androidx.recyclerview.widget.RecyclerView;
import com.p131fb.fluid.C1718g;
import com.p131fb.fluid.data.C1702a;
import com.p131fb.fluid.data.C1709d;
import com.p131fb.fluid.data.C1712e;
import com.p131fb.fluid.data.Trigger;
import com.p131fb.fluid.data.TriggerButton;
import com.p131fb.fluid.p135l.C1729a;
import com.p131fb.fluid.p135l.p139p.C1770f;
import com.p131fb.fluid.p135l.p143t.C1797a;
import com.p131fb.fluid.p135l.p143t.C1798b;
import com.p131fb.fluid.p148ui.ActivitySettings;
import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;
import com.p131fb.fluid.p148ui.p149g.p152c.C2422b0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2471s;
import com.p131fb.fluid.p148ui.p149g.p152c.C2472t;
import com.p131fb.fluid.p148ui.p149g.p152c.C2477u;
import com.p131fb.fluid.p148ui.p149g.p152c.C2479v;
import com.p131fb.fluid.p148ui.views.ExtRecyclerView;
import com.p131fb.fluid.services.p145e.C1926c;
import com.p131fb.fluid.utils.preferences.C2521f;
import com.p131fb.fluid.utils.preferences.C2527h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C3256e;
import kotlin.C3261j;
import kotlin.C3268o;
import kotlin.Unit;
import kotlin.p192b0.C3204e;
import kotlin.p192b0.C3208i;
import kotlin.p195s.C3282h;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3368i;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;
import p054c.p055a.p056a.C1039a;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.p058o.C1058a;
import p054c.p055a.p056a.p062r.C1084a;
import p054c.p055a.p067b.C1111d;
import p054c.p055a.p067b.C1114e;
import p054c.p055a.p067b.p068f.C1116a;
import p054c.p055a.p067b.p068f.C1118b;
import p054c.p079d.p080a.p081a.p082a.C1165a;
import p054c.p083e.p104c.C1271e;
import p155d.p156a.C2790h;
import p155d.p156a.p157n.p159c.C2803a;
import p155d.p156a.p160o.C2809a;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p162q.C2823a;
import p155d.p156a.p162q.C2827e;
import p155d.p156a.p162q.C2828f;
import p155d.p156a.p177v.C2964b;
import p190io.objectbox.Box;
import p190io.objectbox.android.AndroidScheduler;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.android.C3148R;
import p190io.objectbox.reactive.DataObserver;
import p190io.objectbox.reactive.DataSubscriptionList;

/* renamed from: com.fb.fluid.ui.g.b.e */
public final class C2127e extends C2240k {

    /* renamed from: p0 */
    static final /* synthetic */ C3208i[] f5766p0;

    /* renamed from: q0 */
    public static final C2128a f5767q0 = new C2128a((C3366g) null);
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public final C1798b<Boolean> f5768e0 = new C1798b<>(false);

    /* renamed from: f0 */
    private final C1798b<Boolean> f5769f0 = new C1798b<>(false);
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public final C1798b<Boolean> f5770g0 = new C1798b<>(true);

    /* renamed from: h0 */
    private final C3256e f5771h0 = C3258g.m11969a(new C2155p(this));

    /* renamed from: i0 */
    private final C3256e f5772i0 = C3258g.m11969a(new C2156q(this));
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public final List<C1926c> f5773j0 = new ArrayList();

    /* renamed from: k0 */
    private final C2809a f5774k0 = new C2809a();

    /* renamed from: l0 */
    private final DataSubscriptionList f5775l0 = new DataSubscriptionList();

    /* renamed from: m0 */
    private final C3256e f5776m0 = C3258g.m11969a(C2129b.f5779g);

    /* renamed from: n0 */
    private final C3256e f5777n0 = C3258g.m11969a(C2130c.f5780g);

    /* renamed from: o0 */
    private HashMap f5778o0;

    /* renamed from: com.fb.fluid.ui.g.b.e$a */
    public static final class C2128a {
        private C2128a() {
        }

        public /* synthetic */ C2128a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2127e mo6995a(Bundle bundle) {
            C2127e eVar = new C2127e();
            eVar.mo2290m(bundle);
            return eVar;
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$b */
    static final class C2129b extends C3371l implements C3349a<Box<TriggerButton>> {

        /* renamed from: g */
        public static final C2129b f5779g = new C2129b();

        C2129b() {
            super(0);
        }

        public final Box<TriggerButton> invoke() {
            return C2521f.f6389b.mo7481a().boxFor(TriggerButton.class);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$c */
    static final class C2130c extends C3371l implements C3349a<Box<Trigger>> {

        /* renamed from: g */
        public static final C2130c f5780g = new C2130c();

        C2130c() {
            super(0);
        }

        public final Box<Trigger> invoke() {
            return C2521f.f6389b.mo7481a().boxFor(Trigger.class);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$d */
    static final class C2131d<T> implements C0498u<C2068g> {

        /* renamed from: a */
        final /* synthetic */ C2262m0 f5781a;

        /* renamed from: b */
        final /* synthetic */ C2127e f5782b;

        /* renamed from: com.fb.fluid.ui.g.b.e$d$a */
        static final class C2132a extends C3371l implements C3349a<Unit> {

            /* renamed from: g */
            final /* synthetic */ C2131d f5783g;

            /* renamed from: h */
            final /* synthetic */ C2068g f5784h;

            /* renamed from: com.fb.fluid.ui.g.b.e$d$a$a */
            static final class C2133a extends C3371l implements C3351c<Integer, Intent, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2132a f5785g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2133a(C2132a aVar) {
                    super(2);
                    this.f5785g = aVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    mo6997a(((Number) obj).intValue(), (Intent) obj2);
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo6997a(int i, Intent intent) {
                    String str;
                    int intExtra = intent != null ? intent.getIntExtra("action_type", -2) : -2;
                    if (intent == null || (str = intent.getStringExtra("action_data")) == null) {
                        str = BuildConfig.FLAVOR;
                    }
                    if (intExtra != -2) {
                        C1702a aVar = null;
                        if (C3370k.m12225a((Object) ((C2256k0) this.f5785g.f5784h).mo7105a(), (Object) "start")) {
                            if (this.f5785g.f5783g.f5781a.mo7120l().mo6382d() == 15) {
                                C1729a.C1730a aVar2 = C1729a.f5027a;
                                Application i2 = this.f5785g.f5783g.f5781a.mo7117i();
                                try {
                                    aVar = (C1702a) new C1271e().mo5634a(this.f5785g.f5783g.f5781a.mo7120l().mo6375b(), C1702a.class);
                                } catch (Exception unused) {
                                }
                                aVar2.mo6467a((Context) i2, aVar);
                            }
                            this.f5785g.f5783g.f5781a.mo7120l().mo6376b(intExtra);
                            this.f5785g.f5783g.f5781a.mo7120l().mo6377b(str);
                        } else if (C3370k.m12225a((Object) ((C2256k0) this.f5785g.f5784h).mo7105a(), (Object) "end")) {
                            if (this.f5785g.f5783g.f5781a.mo7120l().mo6379c() == 15) {
                                C1729a.C1730a aVar3 = C1729a.f5027a;
                                Application i3 = this.f5785g.f5783g.f5781a.mo7117i();
                                try {
                                    aVar = (C1702a) new C1271e().mo5634a(this.f5785g.f5783g.f5781a.mo7120l().mo6370a(), C1702a.class);
                                } catch (Exception unused2) {
                                }
                                aVar3.mo6467a((Context) i3, aVar);
                            }
                            this.f5785g.f5783g.f5781a.mo7120l().mo6371a(intExtra);
                            this.f5785g.f5783g.f5781a.mo7120l().mo6373a(str);
                        }
                    }
                    this.f5785g.f5783g.f5782b.m8541G0().put(this.f5785g.f5783g.f5781a.mo7120l());
                    C2477u.m9269a(this.f5785g.f5783g.f5781a.mo7159g(), ((C2256k0) this.f5785g.f5784h).mo7105a());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2132a(C2131d dVar, C2068g gVar) {
                super(0);
                this.f5783g = dVar;
                this.f5784h = gVar;
            }

            public final void invoke() {
                ActivitySettings.C1993b bVar = ActivitySettings.f5563E;
                C0401d x0 = this.f5783g.f5782b.mo2311x0();
                C3370k.m12223a((Object) x0, "requireActivity()");
                bVar.mo6841a(x0, 24, 4400, new C3261j[]{C3268o.m11989a("type", 0), C3268o.m11989a("res_title", Integer.valueOf(C3148R.string.tab_actions))}, new C2133a(this));
            }
        }

        C2131d(C2262m0 m0Var, C2127e eVar) {
            this.f5781a = m0Var;
            this.f5782b = eVar;
        }

        /* renamed from: a */
        public final void mo2154a(C2068g gVar) {
            C2256k0 k0Var = (C2256k0) (!(gVar instanceof C2256k0) ? null : gVar);
            if (k0Var != null) {
                k0Var.mo6943a(new C2132a(this, gVar));
            }
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$e */
    static final class C2134e implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ ExtRecyclerView f5786a;

        C2134e(ExtRecyclerView extRecyclerView) {
            this.f5786a = extRecyclerView;
        }

        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ExtRecyclerView extRecyclerView = this.f5786a;
            C3370k.m12223a((Object) windowInsets, "windowInsets");
            extRecyclerView.setPadding(extRecyclerView.getPaddingLeft(), windowInsets.getSystemWindowInsetTop(), extRecyclerView.getPaddingRight(), windowInsets.getSystemWindowInsetBottom());
            return windowInsets;
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$f */
    static final class C2135f<T> implements DataObserver<List<Trigger>> {

        /* renamed from: a */
        final /* synthetic */ C2127e f5787a;

        C2135f(C2127e eVar) {
            this.f5787a = eVar;
        }

        /* renamed from: a */
        public final void onData(List<Trigger> list) {
            for (C1926c cVar : this.f5787a.f5773j0) {
                cVar.mo6728a(this.f5787a.mo6873D0().mo7558z());
                C3370k.m12223a((Object) list, "triggers");
                Trigger trigger = (Trigger) C3292r.m12102f(list);
                if (trigger == null) {
                    trigger = new Trigger();
                }
                cVar.mo6729b(trigger);
                cVar.mo6710n();
            }
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$g */
    static final class C2136g<T> implements DataObserver<List<TriggerButton>> {

        /* renamed from: a */
        final /* synthetic */ C2127e f5788a;

        /* renamed from: com.fb.fluid.ui.g.b.e$g$a */
        static final class C2137a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C2136g f5789f;

            /* renamed from: g */
            final /* synthetic */ List f5790g;

            C2137a(C2136g gVar, List list) {
                this.f5789f = gVar;
                this.f5790g = list;
            }

            public final void run() {
                List list = this.f5790g;
                C3370k.m12223a((Object) list, "buttons");
                int i = 0;
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        TriggerButton triggerButton = (TriggerButton) next;
                        triggerButton.mo6411c(i);
                        this.f5789f.f5788a.m8540F0().put(triggerButton);
                        i = i2;
                    } else {
                        C3282h.m12055c();
                        throw null;
                    }
                }
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.e$g$b */
        static final /* synthetic */ class C2138b extends C3368i implements C3351c<Trigger, TriggerButton, Unit> {
            C2138b(C2127e eVar) {
                super(2, eVar);
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7002a((Trigger) obj, (TriggerButton) obj2);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7002a(Trigger trigger, TriggerButton triggerButton) {
                C3370k.m12227b(trigger, "p1");
                C3370k.m12227b(triggerButton, "p2");
                ((C2127e) this.f8030g).m8546a(trigger, triggerButton);
            }

            /* renamed from: b */
            public final String mo6062b() {
                return "showActionButtonDialog";
            }

            /* renamed from: h */
            public final C3204e mo6063h() {
                return C3384y.m12254a(C2127e.class);
            }

            /* renamed from: j */
            public final String mo6064j() {
                return "showActionButtonDialog(Lcom/fb/fluid/data/Trigger;Lcom/fb/fluid/data/TriggerButton;)V";
            }
        }

        C2136g(C2127e eVar) {
            this.f5788a = eVar;
        }

        /* renamed from: a */
        public final void onData(List<TriggerButton> list) {
            T t;
            T t2;
            boolean z;
            int i;
            boolean z2;
            C3370k.m12223a((Object) list, "buttons");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                TriggerButton triggerButton = (TriggerButton) t;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    i = 0;
                    for (TriggerButton g : list) {
                        if ((triggerButton.mo6415g() == g.mo6415g()) && (i = i + 1) < 0) {
                            C3282h.m12052b();
                            throw null;
                        }
                    }
                } else {
                    i = 0;
                }
                if (i > 1) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            if (t != null) {
                C2521f.f6389b.mo7481a().runInTx(new C2137a(this, list));
                return;
            }
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it2.next();
                if (((TriggerButton) t2).mo6415g() < 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            TriggerButton triggerButton2 = (TriggerButton) t2;
            if (triggerButton2 != null) {
                triggerButton2.mo6411c(0);
                this.f5788a.m8540F0().put(triggerButton2);
                return;
            }
            Trigger trigger = (Trigger) this.f5788a.m8541G0().get(this.f5788a.m8543I0());
            if (trigger != null) {
                List<C1926c> e = this.f5788a.f5773j0;
                for (C1926c d : e) {
                    d.mo6699d();
                }
                e.clear();
                for (TriggerButton g2 : list) {
                    C0401d x0 = this.f5788a.mo2311x0();
                    C3370k.m12223a((Object) x0, "requireActivity()");
                    C1926c cVar = new C1926c(x0);
                    cVar.mo6729b(trigger);
                    cVar.mo6726a(g2.mo6415g());
                    cVar.mo6727a((C3351c<? super Trigger, ? super TriggerButton, Unit>) new C2138b(this.f5788a));
                    this.f5788a.f5770g0.mo6588a(true);
                    this.f5788a.f5773j0.add(cVar);
                }
            }
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$h */
    static final class C2139h implements C2823a {

        /* renamed from: a */
        final /* synthetic */ C2127e f5791a;

        C2139h(C2127e eVar) {
            this.f5791a = eVar;
        }

        public final void run() {
            this.f5791a.mo6873D0().mo7506b(-1);
            for (C1926c d : this.f5791a.f5773j0) {
                d.mo6699d();
            }
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$i */
    static final class C2140i<T> implements C2827e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C2127e f5792a;

        C2140i(C2127e eVar) {
            this.f5792a = eVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C2527h D0 = this.f5792a.mo6873D0();
            C3370k.m12223a((Object) bool, "it");
            D0.mo7506b(bool.booleanValue() ? this.f5792a.m8543I0() : -1);
            for (C1926c cVar : this.f5792a.f5773j0) {
                if (bool.booleanValue()) {
                    cVar.mo6698c();
                } else {
                    cVar.mo6709m();
                }
            }
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$j */
    static final class C2141j extends C3371l implements C3350b<C1114e, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1116a f5793g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2141j(C2127e eVar, TriggerButton triggerButton, C1116a aVar) {
            super(1);
            this.f5793g = aVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7004a((C1114e) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7004a(C1114e eVar) {
            C3370k.m12227b(eVar, "$receiver");
            eVar.mo5190a((C1116a<?>) this.f5793g);
            C2479v.m9274a(eVar, (C3350b) null, 1, (Object) null);
            C2422b0.m9117a(eVar, (C3351c) null, 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$k */
    static final class C2142k extends C3371l implements C3350b<C1041c, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2127e f5794g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2142k(C2127e eVar, TriggerButton triggerButton, C1116a aVar) {
            super(1);
            this.f5794g = eVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7005a((C1041c) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7005a(C1041c cVar) {
            C3370k.m12227b(cVar, "it");
            this.f5794g.f5768e0.mo6588a(false);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$l */
    static final class C2143l extends C3371l implements C3350b<C1041c, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2127e f5795g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2143l(C2127e eVar, TriggerButton triggerButton, C1116a aVar) {
            super(1);
            this.f5795g = eVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7006a((C1041c) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7006a(C1041c cVar) {
            C3370k.m12227b(cVar, "it");
            this.f5795g.f5768e0.mo6588a(true);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$m */
    static final class C2144m extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2127e f5796g;

        /* renamed from: h */
        final /* synthetic */ TriggerButton f5797h;

        /* renamed from: i */
        final /* synthetic */ C3349a f5798i;

        /* renamed from: com.fb.fluid.ui.g.b.e$m$a */
        static final class C2145a extends C3371l implements C3349a<String> {

            /* renamed from: g */
            final /* synthetic */ C2144m f5799g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2145a(C2144m mVar) {
                super(0);
                this.f5799g = mVar;
            }

            public final String invoke() {
                Context B = this.f5799g.f5796g.mo2194B();
                if (B == null) {
                    return null;
                }
                TriggerButton triggerButton = this.f5799g.f5797h;
                C3370k.m12223a((Object) B, "it");
                return TriggerButton.m7264a(triggerButton, B, false, 2, (Object) null);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.e$m$b */
        static final class C2146b extends C3371l implements C3351c<Context, C2472t<Object>, Drawable> {

            /* renamed from: g */
            final /* synthetic */ C2144m f5800g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2146b(C2144m mVar) {
                super(2);
                this.f5800g = mVar;
            }

            /* renamed from: a */
            public final Drawable mo6125a(Context context, C2472t<Object> tVar) {
                C3370k.m12227b(context, "it");
                C3370k.m12227b(tVar, "<anonymous parameter 1>");
                return TriggerButton.m7263a(this.f5800g.f5797h, context, false, (Object) null, C1770f.m7461a(context, 16842808), false, 22, (Object) null);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.e$m$c */
        static final class C2147c extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2144m f5801g;

            /* renamed from: com.fb.fluid.ui.g.b.e$m$c$a */
            static final class C2148a extends C3371l implements C3351c<Integer, Intent, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2147c f5802g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2148a(C2147c cVar) {
                    super(2);
                    this.f5802g = cVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    mo7010a(((Number) obj).intValue(), (Intent) obj2);
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo7010a(int i, Intent intent) {
                    String str;
                    C1702a aVar;
                    if (this.f5802g.f5801g.f5797h.mo6412d() == 15) {
                        C1729a.C1730a aVar2 = C1729a.f5027a;
                        C0401d x0 = this.f5802g.f5801g.f5796g.mo2311x0();
                        C3370k.m12223a((Object) x0, "requireActivity()");
                        try {
                            aVar = (C1702a) new C1271e().mo5634a(this.f5802g.f5801g.f5797h.mo6400a(), C1702a.class);
                        } catch (Exception unused) {
                            aVar = null;
                        }
                        aVar2.mo6467a((Context) x0, aVar);
                    }
                    int intExtra = intent != null ? intent.getIntExtra("action_type", -2) : -2;
                    if (intent == null || (str = intent.getStringExtra("action_data")) == null) {
                        str = BuildConfig.FLAVOR;
                    }
                    if (intExtra != -2) {
                        this.f5802g.f5801g.f5797h.mo6407b(intExtra);
                        this.f5802g.f5801g.f5797h.mo6404a(str);
                    }
                    this.f5802g.f5801g.f5798i.invoke();
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2147c(C2144m mVar) {
                super(2);
                this.f5801g = mVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7009a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7009a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                ActivitySettings.C1993b bVar = ActivitySettings.f5563E;
                C0401d x0 = this.f5801g.f5796g.mo2311x0();
                C3370k.m12223a((Object) x0, "requireActivity()");
                bVar.mo6841a(x0, 24, 4400, new C3261j[]{C3268o.m11989a("type", 0), C3268o.m11989a("res_title", Integer.valueOf(C3148R.string.tab_actions))}, new C2148a(this));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2144m(C2127e eVar, TriggerButton triggerButton, C3349a aVar) {
            super(1);
            this.f5796g = eVar;
            this.f5797h = triggerButton;
            this.f5798i = aVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7007a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7007a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2472t.m9231b(sVar, (String) null, Integer.valueOf(C3148R.string.pref_button_action_swipe), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) sVar, (String) null, (Integer) null, (C3349a) new C2145a(this), 3, (Object) null);
            C2472t.m9225a(sVar, (Drawable) null, (Integer) null, true, (Integer) null, new C2146b(this), 11, (Object) null);
            sVar.mo7315a(new C2147c(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$n */
    static final class C2149n extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2127e f5803g;

        /* renamed from: h */
        final /* synthetic */ TriggerButton f5804h;

        /* renamed from: i */
        final /* synthetic */ C3349a f5805i;

        /* renamed from: com.fb.fluid.ui.g.b.e$n$a */
        static final class C2150a extends C3371l implements C3349a<String> {

            /* renamed from: g */
            final /* synthetic */ C2149n f5806g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2150a(C2149n nVar) {
                super(0);
                this.f5806g = nVar;
            }

            public final String invoke() {
                C2149n nVar = this.f5806g;
                TriggerButton triggerButton = nVar.f5804h;
                Context y0 = nVar.f5803g.mo2313y0();
                C3370k.m12223a((Object) y0, "requireContext()");
                return triggerButton.mo6401a(y0, true);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.e$n$b */
        static final class C2151b extends C3371l implements C3351c<Context, C2472t<Object>, Drawable> {

            /* renamed from: g */
            final /* synthetic */ C2149n f5807g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2151b(C2149n nVar) {
                super(2);
                this.f5807g = nVar;
            }

            /* renamed from: a */
            public final Drawable mo6125a(Context context, C2472t<Object> tVar) {
                C3370k.m12227b(context, "it");
                C3370k.m12227b(tVar, "<anonymous parameter 1>");
                return TriggerButton.m7263a(this.f5807g.f5804h, context, true, (Object) null, C1770f.m7461a(context, 16842808), false, 20, (Object) null);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.e$n$c */
        static final class C2152c extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2149n f5808g;

            /* renamed from: com.fb.fluid.ui.g.b.e$n$c$a */
            static final class C2153a extends C3371l implements C3351c<Integer, Intent, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2152c f5809g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2153a(C2152c cVar) {
                    super(2);
                    this.f5809g = cVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    mo7014a(((Number) obj).intValue(), (Intent) obj2);
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo7014a(int i, Intent intent) {
                    String str;
                    C1702a aVar;
                    if (this.f5809g.f5808g.f5804h.mo6410c() == 15) {
                        C1729a.C1730a aVar2 = C1729a.f5027a;
                        C0401d x0 = this.f5809g.f5808g.f5803g.mo2311x0();
                        C3370k.m12223a((Object) x0, "requireActivity()");
                        try {
                            aVar = (C1702a) new C1271e().mo5634a(this.f5809g.f5808g.f5804h.mo6406b(), C1702a.class);
                        } catch (Exception unused) {
                            aVar = null;
                        }
                        aVar2.mo6467a((Context) x0, aVar);
                    }
                    int intExtra = intent != null ? intent.getIntExtra("action_type", -2) : -2;
                    if (intent == null || (str = intent.getStringExtra("action_data")) == null) {
                        str = BuildConfig.FLAVOR;
                    }
                    if (intExtra != -2) {
                        this.f5809g.f5808g.f5804h.mo6402a(intExtra);
                        this.f5809g.f5808g.f5804h.mo6408b(str);
                    }
                    this.f5809g.f5808g.f5805i.invoke();
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2152c(C2149n nVar) {
                super(2);
                this.f5808g = nVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7013a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7013a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                ActivitySettings.C1993b bVar = ActivitySettings.f5563E;
                C0401d x0 = this.f5808g.f5803g.mo2311x0();
                C3370k.m12223a((Object) x0, "requireActivity()");
                bVar.mo6841a(x0, 24, 4400, new C3261j[]{C3268o.m11989a("type", 0), C3268o.m11989a("res_title", Integer.valueOf(C3148R.string.tab_actions))}, new C2153a(this));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2149n(C2127e eVar, TriggerButton triggerButton, C3349a aVar) {
            super(1);
            this.f5803g = eVar;
            this.f5804h = triggerButton;
            this.f5805i = aVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7011a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7011a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2472t.m9231b(sVar, (String) null, Integer.valueOf(C3148R.string.pref_button_action_swipe_hold), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) sVar, (String) null, (Integer) null, (C3349a) new C2150a(this), 3, (Object) null);
            C2472t.m9225a(sVar, (Drawable) null, (Integer) null, true, (Integer) null, new C2151b(this), 11, (Object) null);
            sVar.mo7315a(new C2152c(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$o */
    static final class C2154o extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        final /* synthetic */ C2127e f5810g;

        /* renamed from: h */
        final /* synthetic */ TriggerButton f5811h;

        /* renamed from: i */
        final /* synthetic */ Trigger f5812i;

        /* renamed from: j */
        final /* synthetic */ C1116a f5813j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2154o(C2127e eVar, TriggerButton triggerButton, Trigger trigger, C1116a aVar) {
            super(0);
            this.f5810g = eVar;
            this.f5811h = triggerButton;
            this.f5812i = trigger;
            this.f5813j = aVar;
        }

        public final void invoke() {
            this.f5810g.m8540F0().put(this.f5811h);
            this.f5810g.m8541G0().put(this.f5812i);
            this.f5813j.mo5205c();
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$p */
    static final class C2155p extends C3371l implements C3349a<String> {

        /* renamed from: g */
        final /* synthetic */ C2127e f5814g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2155p(C2127e eVar) {
            super(0);
            this.f5814g = eVar;
        }

        public final String invoke() {
            String str;
            Bundle z = this.f5814g.mo2314z();
            if (z == null || (str = z.getString("title")) == null) {
                try {
                    str = this.f5814g.mo2224a((int) C3148R.string.app_name);
                } catch (Exception unused) {
                    str = null;
                }
            }
            return str != null ? str : BuildConfig.FLAVOR;
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$q */
    static final class C2156q extends C3371l implements C3349a<Long> {

        /* renamed from: g */
        final /* synthetic */ C2127e f5815g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2156q(C2127e eVar) {
            super(0);
            this.f5815g = eVar;
        }

        public final long invoke() {
            Bundle z = this.f5815g.mo2314z();
            if (z != null) {
                return z.getLong("trigger_id");
            }
            return -1;
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$r */
    static final class C2157r<T, R> implements C2828f<T, R> {

        /* renamed from: a */
        public static final C2157r f5816a = new C2157r();

        C2157r() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
            return Boolean.valueOf(mo7015a((Boolean) obj));
        }

        /* renamed from: a */
        public final boolean mo7015a(Boolean bool) {
            C3370k.m12227b(bool, "it");
            return !bool.booleanValue();
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.e$s */
    static final class C2158s<T, R> implements C2828f<Object[], R> {

        /* renamed from: a */
        public static final C2158s f5817a = new C2158s();

        C2158s() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
            return Boolean.valueOf(mo7016a((Object[]) obj));
        }

        /* renamed from: a */
        public final boolean mo7016a(Object[] objArr) {
            C3370k.m12227b(objArr, "it");
            return !C3280f.m12022b((T[]) objArr, false);
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C2127e.class), "title", "getTitle()Ljava/lang/String;");
        C3384y.m12259a((C3379t) uVar);
        C3380u uVar2 = new C3380u(C3384y.m12254a(C2127e.class), "triggerId", "getTriggerId()J");
        C3384y.m12259a((C3379t) uVar2);
        C3380u uVar3 = new C3380u(C3384y.m12254a(C2127e.class), "boxTriggerButtons", "getBoxTriggerButtons()Lio/objectbox/Box;");
        C3384y.m12259a((C3379t) uVar3);
        C3380u uVar4 = new C3380u(C3384y.m12254a(C2127e.class), "boxTriggers", "getBoxTriggers()Lio/objectbox/Box;");
        C3384y.m12259a((C3379t) uVar4);
        f5766p0 = new C3208i[]{uVar, uVar2, uVar3, uVar4};
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public final Box<TriggerButton> m8540F0() {
        C3256e eVar = this.f5776m0;
        C3208i iVar = f5766p0[2];
        return (Box) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public final Box<Trigger> m8541G0() {
        C3256e eVar = this.f5777n0;
        C3208i iVar = f5766p0[3];
        return (Box) eVar.getValue();
    }

    /* renamed from: H0 */
    private final String m8542H0() {
        C3256e eVar = this.f5771h0;
        C3208i iVar = f5766p0[0];
        return (String) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: I0 */
    public final long m8543I0() {
        C3256e eVar = this.f5772i0;
        C3208i iVar = f5766p0[1];
        return ((Number) eVar.getValue()).longValue();
    }

    /* renamed from: J0 */
    private final C2790h<Boolean> m8544J0() {
        C2790h<Boolean> a = C2790h.m10990a(C3284j.m12070b((T[]) new C2790h[]{m8555E0().mo7121m().mo6587a().mo8901a(), this.f5769f0.mo6587a().mo8901a(), this.f5768e0.mo6587a().mo8924b(C2157r.f5816a).mo8901a(), this.f5770g0.mo6587a()}), C2158s.f5817a);
        C3370k.m12223a((Object) a, "Observable.combineLatest…) { !it.contains(false) }");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8546a(Trigger trigger, TriggerButton triggerButton) {
        TriggerButton triggerButton2 = triggerButton;
        if (!this.f5768e0.mo6589b().booleanValue()) {
            C1116a<Object> a = C1118b.m5571a(new Object[0]);
            C2154o oVar = new C2154o(this, triggerButton2, trigger, a);
            a.mo5202a((IT[]) new Object[]{new C2471s(new C2144m(this, triggerButton2, oVar)), new C2471s(new C2149n(this, triggerButton2, oVar))});
            C0401d x0 = mo2311x0();
            C3370k.m12223a((Object) x0, "requireActivity()");
            C1041c cVar = new C1041c(x0, (C1039a) null, 2, (C3366g) null);
            C1041c.m5351a(cVar, (Integer) null, mo2225a((int) C3148R.string.header_action, Integer.valueOf(triggerButton.mo6415g() + 1)), 1, (Object) null);
            RecyclerView recyclerView = new RecyclerView(mo2313y0());
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), C1165a.m5734a(16));
            C1111d.m5549a(recyclerView, new C2141j(this, triggerButton2, a));
            C1084a.m5469a(cVar, (Integer) null, recyclerView, false, false, false, false, 57, (Object) null);
            C1058a.m5386a(cVar, (C3350b<? super C1041c, Unit>) new C2142k(this, triggerButton2, a));
            C1058a.m5389c(cVar, new C2143l(this, triggerButton2, a));
            cVar.show();
        }
    }

    /* renamed from: C0 */
    public void mo2351C0() {
        HashMap hashMap = this.f5778o0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: E0 */
    public C2262m0 m8555E0() {
        C0401d x0 = mo2311x0();
        C3370k.m12223a((Object) x0, "requireActivity()");
        Application application = x0.getApplication();
        C3370k.m12223a((Object) application, "requireActivity().application");
        C0508z a = C0472b0.m2417a((Fragment) this, (C0464a0.C0466b) new C2160f(application, m8543I0(), m8542H0())).mo2674a(C2262m0.class);
        C3370k.m12223a((Object) a, "ViewModelProviders.of(th…et(TriggerVM::class.java)");
        return (C2262m0) a;
    }

    @SuppressLint({"AutoDispose"})
    /* renamed from: b */
    public void mo2248b(Bundle bundle) {
        super.mo2248b(bundle);
        C2262m0 E0 = m8555E0();
        E0.mo7118j().observe(this, new C2131d(E0, this));
        if (m8541G0().get(m8543I0()).mo6388g() == 80) {
            ExtRecyclerView extRecyclerView = (ExtRecyclerView) mo6945e(C1718g.recycler_view);
            extRecyclerView.setVerticalFadingEdgeEnabled(true);
            extRecyclerView.setTopFadingEdgeStr(0.0f);
            extRecyclerView.setFadingEdgeLength(E0.mo7119k());
            extRecyclerView.setClipToPadding(true);
            extRecyclerView.setOnApplyWindowInsetsListener(new C2134e(extRecyclerView));
        }
        m8541G0().query().equal(C1712e.f4969j, m8543I0()).build().subscribe(this.f5775l0).mo9819on(AndroidScheduler.mainThread()).observer(new C2135f(this));
        m8540F0().query().equal(C1709d.f4961r, m8543I0()).equal(C1709d.f4956m, true).order(C1709d.f4954k).build().subscribe(this.f5775l0).mo9819on(AndroidScheduler.mainThread()).observer(new C2136g(this));
        C2810b b = m8544J0().mo8923b(C2964b.m11437b()).mo8907a(C2803a.m11054a()).mo8909a((C2823a) new C2139h(this)).mo8927b(new C2140i(this));
        C3370k.m12223a((Object) b, "triggersHighlightedState…er() }\n\n                }");
        C1797a.m7558a(b, this.f5774k0);
    }

    /* renamed from: e */
    public View mo6945e(int i) {
        if (this.f5778o0 == null) {
            this.f5778o0 = new HashMap();
        }
        View view = (View) this.f5778o0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View T = mo2213T();
        if (T == null) {
            return null;
        }
        View findViewById = T.findViewById(i);
        this.f5778o0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: f0 */
    public void mo2273f0() {
        super.mo2273f0();
        this.f5774k0.mo8948c();
        this.f5775l0.cancel();
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo2279h0() {
        super.mo2279h0();
        mo2351C0();
    }

    /* renamed from: j0 */
    public void mo2285j0() {
        super.mo2285j0();
        this.f5769f0.mo6588a(false);
    }

    /* renamed from: k0 */
    public void mo2287k0() {
        super.mo2287k0();
        this.f5769f0.mo6588a(true);
    }
}
