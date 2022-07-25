package com.p131fb.fluid.p148ui.p149g.p151b;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.C0497t;
import com.p131fb.fluid.data.Trigger;
import com.p131fb.fluid.data.TriggerButton;
import com.p131fb.fluid.p135l.p139p.C1770f;
import com.p131fb.fluid.p135l.p143t.C1798b;
import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;
import com.p131fb.fluid.p148ui.p149g.p152c.C2408a0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2428c0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2458k;
import com.p131fb.fluid.p148ui.p149g.p152c.C2471s;
import com.p131fb.fluid.p148ui.p149g.p152c.C2472t;
import com.p131fb.fluid.p148ui.p149g.p152c.C2486x;
import com.p131fb.fluid.utils.preferences.C2521f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C3256e;
import kotlin.Unit;
import kotlin.p191a0.C3193d;
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
import p054c.p055a.p067b.p068f.C1116a;
import p054c.p079d.p080a.p081a.p082a.C1165a;
import p190io.objectbox.Box;
import p190io.objectbox.android.C3148R;

@SuppressLint({"RtlHardcoded"})
/* renamed from: com.fb.fluid.ui.g.b.m0 */
public final class C2262m0 extends C2317o {

    /* renamed from: r */
    static final /* synthetic */ C3208i[] f5944r;

    /* renamed from: i */
    private final C3256e f5945i = C3258g.m11969a(C2311n.f6003g);

    /* renamed from: j */
    private final C3256e f5946j = C3258g.m11969a(C2312o.f6004g);

    /* renamed from: k */
    private final C0497t<C2068g> f5947k = new C0497t<>();

    /* renamed from: l */
    private final C1798b<Boolean> f5948l = new C1798b<>(false);

    /* renamed from: m */
    private final Trigger f5949m;

    /* renamed from: n */
    private final int f5950n = C1165a.m5734a(72);

    /* renamed from: o */
    private final Application f5951o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final long f5952p;

    /* renamed from: q */
    private final String f5953q;

    /* renamed from: com.fb.fluid.ui.g.b.m0$a */
    static final class C2263a extends C3371l implements C3350b<C2408a0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2262m0 f5954g;

        /* renamed from: com.fb.fluid.ui.g.b.m0$a$a */
        static final class C2264a extends C3371l implements C3350b<C2472t<Boolean>, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2263a f5955g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2264a(C2263a aVar) {
                super(1);
                this.f5955g = aVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7123a((C2472t<Boolean>) (C2472t) obj));
            }

            /* renamed from: a */
            public final boolean mo7123a(C2472t<Boolean> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f5955g.f5954g.mo7120l().mo6387f();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$a$b */
        static final class C2265b extends C3371l implements C3351c<C2472t<Boolean>, Boolean, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2263a f5956g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2265b(C2263a aVar) {
                super(2);
                this.f5956g = aVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7124a((C2472t<Boolean>) (C2472t) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7124a(C2472t<Boolean> tVar, boolean z) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f5956g.f5954g.mo7120l().mo6374a(z);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$a$c */
        static final class C2266c extends C3371l implements C3350b<Boolean, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2263a f5957g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2266c(C2263a aVar) {
                super(1);
                this.f5957g = aVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7125a(((Boolean) obj).booleanValue()));
            }

            /* renamed from: a */
            public final boolean mo7125a(boolean z) {
                this.f5957g.f5954g.mo7121m().mo6588a(Boolean.valueOf(z));
                this.f5957g.f5954g.mo7120l().mo6374a(z);
                this.f5957g.f5954g.m8817o().put(this.f5957g.f5954g.mo7120l());
                return true;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2263a(C2262m0 m0Var) {
            super(1);
            this.f5954g = m0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7122a((C2408a0) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7122a(C2408a0 a0Var) {
            C3370k.m12227b(a0Var, "$receiver");
            a0Var.mo7319a(String.valueOf(this.f5954g.f5952p));
            C2472t.m9231b(a0Var, (String) null, Integer.valueOf(C3148R.string.pref_trigger_toggle), (C3349a) null, 5, (Object) null);
            a0Var.mo7322a(new C2264a(this), new C2265b(this));
            a0Var.mo7238a(new C2266c(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.m0$b */
    static final class C2267b extends C3371l implements C3350b<C2486x<Integer>, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2262m0 f5958g;

        /* renamed from: com.fb.fluid.ui.g.b.m0$b$a */
        static final class C2268a extends C3371l implements C3349a<Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2267b f5959g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2268a(C2267b bVar) {
                super(0);
                this.f5959g = bVar;
            }

            public final boolean invoke() {
                return this.f5959g.f5958g.mo7120l().mo6387f();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$b$b */
        static final class C2269b extends C3371l implements C3350b<C2472t<Integer>, Integer> {

            /* renamed from: g */
            final /* synthetic */ C2267b f5960g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2269b(C2267b bVar) {
                super(1);
                this.f5960g = bVar;
            }

            /* renamed from: a */
            public final int mo7127a(C2472t<Integer> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f5960g.f5958g.mo7120l().mo6393k();
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Integer.valueOf(mo7127a((C2472t<Integer>) (C2472t) obj));
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$b$c */
        static final class C2270c extends C3371l implements C3351c<C2472t<Integer>, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2267b f5961g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2270c(C2267b bVar) {
                super(2);
                this.f5961g = bVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7128a((C2472t<Integer>) (C2472t) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7128a(C2472t<Integer> tVar, int i) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f5961g.f5958g.mo7120l().mo6383d(i);
                this.f5961g.f5958g.m8817o().put(this.f5961g.f5958g.mo7120l());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2267b(C2262m0 m0Var) {
            super(1);
            this.f5958g = m0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7126a((C2486x<Integer>) (C2486x) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7126a(C2486x<Integer> xVar) {
            C3370k.m12227b(xVar, "$receiver");
            xVar.mo7324a(String.valueOf(this.f5958g.f5952p));
            C2472t.m9226a((C2472t) xVar, (Boolean) null, (C3349a) new C2268a(this), 1, (Object) null);
            xVar.mo7322a((C3350b<? super C2472t<Integer>, ? extends Integer>) new C2269b(this), (C3351c<? super C2472t<Integer>, ? super Integer, Unit>) new C2270c(this));
            C2472t.m9231b(xVar, (String) null, Integer.valueOf(C3148R.string.pref_trigger_location), (C3349a) null, 5, (Object) null);
            C2486x.m9294a(xVar, new Object[0], (List) null, new C3193d(0, 100), (Boolean) null, false, false, (C3352d) null, 122, (Object) null);
            int g = this.f5958g.mo7120l().mo6388g();
            C2472t.m9228a((C2472t) xVar, (String) null, Integer.valueOf((g == 3 || g == 5) ? C3148R.string.pref_trigger_location_desc_horz : C3148R.string.pref_trigger_location_desc_vert), (C3350b) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.m0$c */
    static final class C2271c extends C3371l implements C3350b<C2408a0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2262m0 f5962g;

        /* renamed from: com.fb.fluid.ui.g.b.m0$c$a */
        static final class C2272a extends C3371l implements C3349a<Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2271c f5963g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2272a(C2271c cVar) {
                super(0);
                this.f5963g = cVar;
            }

            public final boolean invoke() {
                return this.f5963g.f5962g.mo7120l().mo6387f();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$c$b */
        static final class C2273b extends C3371l implements C3350b<C2472t<Boolean>, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2271c f5964g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2273b(C2271c cVar) {
                super(1);
                this.f5964g = cVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7130a((C2472t<Boolean>) (C2472t) obj));
            }

            /* renamed from: a */
            public final boolean mo7130a(C2472t<Boolean> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f5964g.f5962g.mo7120l().mo6391i();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$c$c */
        static final class C2274c extends C3371l implements C3351c<C2472t<Boolean>, Boolean, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2271c f5965g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2274c(C2271c cVar) {
                super(2);
                this.f5965g = cVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7131a((C2472t<Boolean>) (C2472t) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7131a(C2472t<Boolean> tVar, boolean z) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f5965g.f5962g.mo7120l().mo6378b(z);
                this.f5965g.f5962g.m8817o().put(this.f5965g.f5962g.mo7120l());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2271c(C2262m0 m0Var) {
            super(1);
            this.f5962g = m0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7129a((C2408a0) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7129a(C2408a0 a0Var) {
            C3370k.m12227b(a0Var, "$receiver");
            a0Var.mo7319a("primary");
            a0Var.mo7324a(String.valueOf(this.f5962g.f5952p));
            C2472t.m9226a((C2472t) a0Var, (Boolean) null, (C3349a) new C2272a(this), 1, (Object) null);
            C2408a0 a0Var2 = a0Var;
            C2472t.m9231b(a0Var2, (String) null, Integer.valueOf(C3148R.string.pref_quick_primary_action), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) a0Var2, (String) null, Integer.valueOf(C3148R.string.pref_quick_primary_action_sum), (C3349a) null, 5, (Object) null);
            a0Var.mo7322a(new C2273b(this), new C2274c(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.m0$d */
    static final class C2275d extends C3371l implements C3350b<C2408a0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2262m0 f5966g;

        /* renamed from: com.fb.fluid.ui.g.b.m0$d$a */
        static final class C2276a extends C3371l implements C3349a<Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2275d f5967g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2276a(C2275d dVar) {
                super(0);
                this.f5967g = dVar;
            }

            public final boolean invoke() {
                return this.f5967g.f5966g.mo7120l().mo6387f() && !this.f5967g.f5966g.mo7120l().mo6391i();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$d$b */
        static final class C2277b extends C3371l implements C3350b<C2472t<Boolean>, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2275d f5968g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2277b(C2275d dVar) {
                super(1);
                this.f5968g = dVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7133a((C2472t<Boolean>) (C2472t) obj));
            }

            /* renamed from: a */
            public final boolean mo7133a(C2472t<Boolean> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f5968g.f5966g.mo7120l().mo6392j();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$d$c */
        static final class C2278c extends C3371l implements C3351c<C2472t<Boolean>, Boolean, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2275d f5969g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2278c(C2275d dVar) {
                super(2);
                this.f5969g = dVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7134a((C2472t<Boolean>) (C2472t) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7134a(C2472t<Boolean> tVar, boolean z) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f5969g.f5966g.mo7120l().mo6381c(z);
                this.f5969g.f5966g.m8817o().put(this.f5969g.f5966g.mo7120l());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2275d(C2262m0 m0Var) {
            super(1);
            this.f5966g = m0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7132a((C2408a0) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7132a(C2408a0 a0Var) {
            C3370k.m12227b(a0Var, "$receiver");
            a0Var.mo7324a(String.valueOf(this.f5966g.f5952p), "primary");
            C2472t.m9226a((C2472t) a0Var, (Boolean) null, (C3349a) new C2276a(this), 1, (Object) null);
            C2408a0 a0Var2 = a0Var;
            C2472t.m9231b(a0Var2, (String) null, Integer.valueOf(C3148R.string.pref_quick_secondary_action), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) a0Var2, (String) null, Integer.valueOf(C3148R.string.pref_quick_secondary_action_sum), (C3349a) null, 5, (Object) null);
            a0Var.mo7322a(new C2277b(this), new C2278c(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.m0$e */
    static final class C2279e extends C3371l implements C3350b<C2458k, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2262m0 f5970g;

        /* renamed from: com.fb.fluid.ui.g.b.m0$e$a */
        static final class C2280a extends C3371l implements C3349a<Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2279e f5971g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2280a(C2279e eVar) {
                super(0);
                this.f5971g = eVar;
            }

            public final boolean invoke() {
                return this.f5971g.f5970g.mo7120l().mo6387f();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2279e(C2262m0 m0Var) {
            super(1);
            this.f5970g = m0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7135a((C2458k) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7135a(C2458k kVar) {
            C3370k.m12227b(kVar, "$receiver");
            C2472t.m9231b(kVar, (String) null, Integer.valueOf(C3148R.string.header_triggers_gestures), (C3349a) null, 5, (Object) null);
            kVar.mo7324a(String.valueOf(this.f5970g.f5952p));
            C2472t.m9226a((C2472t) kVar, (Boolean) null, (C3349a) new C2280a(this), 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.m0$f */
    static final class C2281f extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2262m0 f5972g;

        /* renamed from: h */
        final /* synthetic */ boolean f5973h;

        /* renamed from: com.fb.fluid.ui.g.b.m0$f$a */
        static final class C2282a extends C3371l implements C3349a<Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2281f f5974g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2282a(C2281f fVar) {
                super(0);
                this.f5974g = fVar;
            }

            public final boolean invoke() {
                return this.f5974g.f5972g.mo7120l().mo6387f();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$f$b */
        static final class C2283b extends C3371l implements C3349a<String> {

            /* renamed from: g */
            final /* synthetic */ C2281f f5975g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2283b(C2281f fVar) {
                super(0);
                this.f5975g = fVar;
            }

            public final String invoke() {
                return TriggerButton.Companion.mo6423a((Context) this.f5975g.f5972g.mo7117i(), this.f5975g.f5972g.mo7120l().mo6379c(), this.f5975g.f5972g.mo7120l().mo6370a());
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$f$c */
        static final class C2284c extends C3371l implements C3351c<Context, C2472t<Object>, Drawable> {

            /* renamed from: g */
            final /* synthetic */ C2281f f5976g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2284c(C2281f fVar) {
                super(2);
                this.f5976g = fVar;
            }

            /* renamed from: a */
            public final Drawable mo6125a(Context context, C2472t<Object> tVar) {
                C3370k.m12227b(context, "it");
                C3370k.m12227b(tVar, "<anonymous parameter 1>");
                return TriggerButton.C1698a.m7287a(TriggerButton.Companion, context, this.f5976g.f5972g.mo7120l().mo6379c(), this.f5976g.f5972g.mo7120l().mo6370a(), (Object) null, C1770f.m7461a(context, 16842808), false, 40, (Object) null);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$f$d */
        static final class C2285d extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2281f f5977g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2285d(C2281f fVar) {
                super(2);
                this.f5977g = fVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7138a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7138a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                this.f5977g.f5972g.mo7118j().setValue(new C2256k0("end"));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2281f(C2262m0 m0Var, boolean z) {
            super(1);
            this.f5972g = m0Var;
            this.f5973h = z;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7136a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7136a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            sVar.mo7319a("end");
            sVar.mo7324a(String.valueOf(this.f5972g.f5952p));
            C2472t.m9226a((C2472t) sVar, (Boolean) null, (C3349a) new C2282a(this), 1, (Object) null);
            C2472t.m9231b(sVar, (String) null, Integer.valueOf(this.f5973h ? C3148R.string.pref_swipe_bottom : C3148R.string.pref_swipe_right), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) sVar, (String) null, (Integer) null, (C3349a) new C2283b(this), 3, (Object) null);
            C2472t.m9225a(sVar, (Drawable) null, (Integer) null, true, (Integer) null, new C2284c(this), 11, (Object) null);
            sVar.mo7315a(new C2285d(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.m0$g */
    static final class C2286g extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2262m0 f5978g;

        /* renamed from: h */
        final /* synthetic */ boolean f5979h;

        /* renamed from: com.fb.fluid.ui.g.b.m0$g$a */
        static final class C2287a extends C3371l implements C3349a<Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2286g f5980g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2287a(C2286g gVar) {
                super(0);
                this.f5980g = gVar;
            }

            public final boolean invoke() {
                return this.f5980g.f5978g.mo7120l().mo6387f();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$g$b */
        static final class C2288b extends C3371l implements C3349a<String> {

            /* renamed from: g */
            final /* synthetic */ C2286g f5981g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2288b(C2286g gVar) {
                super(0);
                this.f5981g = gVar;
            }

            public final String invoke() {
                return TriggerButton.Companion.mo6423a((Context) this.f5981g.f5978g.mo7117i(), this.f5981g.f5978g.mo7120l().mo6382d(), this.f5981g.f5978g.mo7120l().mo6375b());
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$g$c */
        static final class C2289c extends C3371l implements C3351c<Context, C2472t<Object>, Drawable> {

            /* renamed from: g */
            final /* synthetic */ C2286g f5982g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2289c(C2286g gVar) {
                super(2);
                this.f5982g = gVar;
            }

            /* renamed from: a */
            public final Drawable mo6125a(Context context, C2472t<Object> tVar) {
                C3370k.m12227b(context, "it");
                C3370k.m12227b(tVar, "<anonymous parameter 1>");
                return TriggerButton.C1698a.m7287a(TriggerButton.Companion, context, this.f5982g.f5978g.mo7120l().mo6382d(), this.f5982g.f5978g.mo7120l().mo6375b(), (Object) null, C1770f.m7461a(context, 16842808), false, 40, (Object) null);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$g$d */
        static final class C2290d extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2286g f5983g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2290d(C2286g gVar) {
                super(2);
                this.f5983g = gVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7141a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7141a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                this.f5983g.f5978g.mo7118j().setValue(new C2256k0("start"));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2286g(C2262m0 m0Var, boolean z) {
            super(1);
            this.f5978g = m0Var;
            this.f5979h = z;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7139a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7139a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            sVar.mo7319a("start");
            sVar.mo7324a(String.valueOf(this.f5978g.f5952p));
            C2472t.m9226a((C2472t) sVar, (Boolean) null, (C3349a) new C2287a(this), 1, (Object) null);
            C2472t.m9231b(sVar, (String) null, Integer.valueOf(this.f5979h ? C3148R.string.pref_swipe_top : C3148R.string.pref_swipe_left), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) sVar, (String) null, (Integer) null, (C3349a) new C2288b(this), 3, (Object) null);
            C2472t.m9225a(sVar, (Drawable) null, (Integer) null, true, (Integer) null, new C2289c(this), 11, (Object) null);
            sVar.mo7315a(new C2290d(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.m0$h */
    static final class C2291h extends C3371l implements C3350b<C2458k, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2262m0 f5984g;

        /* renamed from: com.fb.fluid.ui.g.b.m0$h$a */
        static final class C2292a extends C3371l implements C3349a<Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2291h f5985g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2292a(C2291h hVar) {
                super(0);
                this.f5985g = hVar;
            }

            public final boolean invoke() {
                return this.f5985g.f5984g.mo7120l().mo6387f();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2291h(C2262m0 m0Var) {
            super(1);
            this.f5984g = m0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7142a((C2458k) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7142a(C2458k kVar) {
            C3370k.m12227b(kVar, "$receiver");
            C2472t.m9231b(kVar, (String) null, Integer.valueOf(C3148R.string.header_trigger), (C3349a) null, 5, (Object) null);
            kVar.mo7324a(String.valueOf(this.f5984g.f5952p));
            C2472t.m9226a((C2472t) kVar, (Boolean) null, (C3349a) new C2292a(this), 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.m0$i */
    static final class C2293i extends C3371l implements C3350b<C2486x<Integer>, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2262m0 f5986g;

        /* renamed from: com.fb.fluid.ui.g.b.m0$i$a */
        static final class C2294a extends C3371l implements C3349a<Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2293i f5987g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2294a(C2293i iVar) {
                super(0);
                this.f5987g = iVar;
            }

            public final boolean invoke() {
                return this.f5987g.f5986g.mo7120l().mo6387f();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$i$b */
        static final class C2295b extends C3371l implements C3350b<C2472t<Integer>, Integer> {

            /* renamed from: g */
            final /* synthetic */ C2293i f5988g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2295b(C2293i iVar) {
                super(1);
                this.f5988g = iVar;
            }

            /* renamed from: a */
            public final int mo7144a(C2472t<Integer> tVar) {
                C3370k.m12227b(tVar, "it");
                List<TriggerButton> e = this.f5988g.f5986g.mo7120l().mo6384e();
                ArrayList arrayList = new ArrayList();
                for (T next : e) {
                    if (((TriggerButton) next).mo6413e()) {
                        arrayList.add(next);
                    }
                }
                return arrayList.size();
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Integer.valueOf(mo7144a((C2472t<Integer>) (C2472t) obj));
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$i$c */
        static final class C2296c extends C3371l implements C3352d<C2486x<Integer>, Boolean, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2293i f5989g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2296c(C2293i iVar) {
                super(3);
                this.f5989g = iVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
                mo7145a((C2486x<Integer>) (C2486x) obj, ((Boolean) obj2).booleanValue(), ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7145a(C2486x<Integer> xVar, boolean z, int i) {
                C3370k.m12227b(xVar, "<anonymous parameter 0>");
                if (z) {
                    Trigger trigger = (Trigger) this.f5989g.f5986g.m8817o().get(this.f5989g.f5986g.f5952p);
                    List<T> b = C3292r.m12094b(trigger.mo6384e());
                    int max = Math.max(0, i - b.size());
                    for (int i2 = 0; i2 < max; i2++) {
                        TriggerButton triggerButton = new TriggerButton();
                        triggerButton.mo6416h().setTarget(trigger);
                        triggerButton.mo6411c(trigger.mo6384e().size() + i2);
                        b.add(triggerButton);
                    }
                    for (T t : b) {
                        t.mo6405a(t.mo6415g() < i);
                    }
                    this.f5989g.f5986g.m8816n().put(b);
                    this.f5989g.f5986g.m8817o().put(this.f5989g.f5986g.mo7120l());
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2293i(C2262m0 m0Var) {
            super(1);
            this.f5986g = m0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7143a((C2486x<Integer>) (C2486x) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7143a(C2486x<Integer> xVar) {
            C3370k.m12227b(xVar, "$receiver");
            xVar.mo7324a(String.valueOf(this.f5986g.f5952p));
            C2472t.m9226a((C2472t) xVar, (Boolean) null, (C3349a) new C2294a(this), 1, (Object) null);
            C2472t.m9231b(xVar, (String) null, Integer.valueOf(C3148R.string.pref_triggers_actions_count), (C3349a) null, 5, (Object) null);
            C2472t.m9229a((C2472t) xVar, (C3350b) new C2295b(this), (C3351c) null, 2, (Object) null);
            C2486x<Integer> xVar2 = xVar;
            C2486x.m9294a(xVar2, new Object[0], (List) null, new C3193d(0, 4), true, false, true, new C2296c(this), 18, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.m0$j */
    static final class C2297j extends C3371l implements C3350b<C2486x<Integer>, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2262m0 f5990g;

        /* renamed from: com.fb.fluid.ui.g.b.m0$j$a */
        static final class C2298a extends C3371l implements C3349a<Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2297j f5991g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2298a(C2297j jVar) {
                super(0);
                this.f5991g = jVar;
            }

            public final boolean invoke() {
                return this.f5991g.f5990g.mo7120l().mo6387f();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$j$b */
        static final class C2299b extends C3371l implements C3350b<C2472t<Integer>, Integer> {

            /* renamed from: g */
            final /* synthetic */ C2297j f5992g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2299b(C2297j jVar) {
                super(1);
                this.f5992g = jVar;
            }

            /* renamed from: a */
            public final int mo7147a(C2472t<Integer> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f5992g.f5990g.mo7120l().mo6395m();
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Integer.valueOf(mo7147a((C2472t<Integer>) (C2472t) obj));
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$j$c */
        static final class C2300c extends C3371l implements C3351c<C2472t<Integer>, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2297j f5993g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2300c(C2297j jVar) {
                super(2);
                this.f5993g = jVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7148a((C2472t<Integer>) (C2472t) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7148a(C2472t<Integer> tVar, int i) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f5993g.f5990g.mo7120l().mo6386f(i);
                this.f5993g.f5990g.m8817o().put(this.f5993g.f5990g.mo7120l());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2297j(C2262m0 m0Var) {
            super(1);
            this.f5990g = m0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7146a((C2486x<Integer>) (C2486x) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7146a(C2486x<Integer> xVar) {
            C3370k.m12227b(xVar, "$receiver");
            xVar.mo7324a(String.valueOf(this.f5990g.f5952p));
            C2472t.m9226a((C2472t) xVar, (Boolean) null, (C3349a) new C2298a(this), 1, (Object) null);
            xVar.mo7322a((C3350b<? super C2472t<Integer>, ? extends Integer>) new C2299b(this), (C3351c<? super C2472t<Integer>, ? super Integer, Unit>) new C2300c(this));
            C2472t.m9231b(xVar, (String) null, Integer.valueOf(C3148R.string.pref_triggers_size), (C3349a) null, 5, (Object) null);
            C2486x<Integer> xVar2 = xVar;
            C2486x.m9294a(xVar2, new Object[0], (List) null, new C3193d(15, 100), (Boolean) null, false, false, (C3352d) null, 122, (Object) null);
            C2472t.m9228a((C2472t) xVar, (String) null, Integer.valueOf(C3148R.string.pref_triggers_size_desc), (C3350b) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.m0$k */
    static final class C2301k extends C3371l implements C3350b<C2486x<Integer>, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2262m0 f5994g;

        /* renamed from: com.fb.fluid.ui.g.b.m0$k$a */
        static final class C2302a extends C3371l implements C3349a<Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2301k f5995g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2302a(C2301k kVar) {
                super(0);
                this.f5995g = kVar;
            }

            public final boolean invoke() {
                return this.f5995g.f5994g.mo7120l().mo6387f();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$k$b */
        static final class C2303b extends C3371l implements C3350b<C2472t<Integer>, Integer> {

            /* renamed from: g */
            final /* synthetic */ C2301k f5996g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2303b(C2301k kVar) {
                super(1);
                this.f5996g = kVar;
            }

            /* renamed from: a */
            public final int mo7150a(C2472t<Integer> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f5996g.f5994g.mo7120l().mo6394l();
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Integer.valueOf(mo7150a((C2472t<Integer>) (C2472t) obj));
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$k$c */
        static final class C2304c extends C3371l implements C3351c<C2472t<Integer>, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2301k f5997g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2304c(C2301k kVar) {
                super(2);
                this.f5997g = kVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7151a((C2472t<Integer>) (C2472t) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7151a(C2472t<Integer> tVar, int i) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f5997g.f5994g.mo7120l().mo6385e(i);
                this.f5997g.f5994g.m8817o().put(this.f5997g.f5994g.mo7120l());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2301k(C2262m0 m0Var) {
            super(1);
            this.f5994g = m0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7149a((C2486x<Integer>) (C2486x) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7149a(C2486x<Integer> xVar) {
            C3370k.m12227b(xVar, "$receiver");
            xVar.mo7324a(String.valueOf(this.f5994g.f5952p));
            C2472t.m9226a((C2472t) xVar, (Boolean) null, (C3349a) new C2302a(this), 1, (Object) null);
            xVar.mo7322a((C3350b<? super C2472t<Integer>, ? extends Integer>) new C2303b(this), (C3351c<? super C2472t<Integer>, ? super Integer, Unit>) new C2304c(this));
            C2486x<Integer> xVar2 = xVar;
            C2472t.m9231b(xVar2, (String) null, Integer.valueOf(C3148R.string.pref_triggers_sensitivity), (C3349a) null, 5, (Object) null);
            C2486x.m9294a(xVar2, new Object[0], (List) null, new C3193d(C1165a.m5734a(4), C1165a.m5734a(36)), (Boolean) null, false, false, (C3352d) null, 122, (Object) null);
            C2472t.m9228a((C2472t) xVar, (String) null, Integer.valueOf(C3148R.string.pref_triggers_sensitivity_desc), (C3350b) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.m0$l */
    static final class C2305l extends C3371l implements C3350b<C2486x<Integer>, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2262m0 f5998g;

        /* renamed from: com.fb.fluid.ui.g.b.m0$l$a */
        static final class C2306a extends C3371l implements C3349a<Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2305l f5999g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2306a(C2305l lVar) {
                super(0);
                this.f5999g = lVar;
            }

            public final boolean invoke() {
                return this.f5999g.f5998g.mo7120l().mo6387f();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$l$b */
        static final class C2307b extends C3371l implements C3350b<C2472t<Integer>, Integer> {

            /* renamed from: g */
            final /* synthetic */ C2305l f6000g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2307b(C2305l lVar) {
                super(1);
                this.f6000g = lVar;
            }

            /* renamed from: a */
            public final int mo7153a(C2472t<Integer> tVar) {
                C3370k.m12227b(tVar, "it");
                return 100 - this.f6000g.f5998g.mo7120l().mo6396n();
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Integer.valueOf(mo7153a((C2472t<Integer>) (C2472t) obj));
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$l$c */
        static final class C2308c extends C3371l implements C3351c<C2472t<Integer>, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2305l f6001g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2308c(C2305l lVar) {
                super(2);
                this.f6001g = lVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7154a((C2472t<Integer>) (C2472t) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7154a(C2472t<Integer> tVar, int i) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f6001g.f5998g.mo7120l().mo6389g(100 - i);
                this.f6001g.f5998g.m8817o().put(this.f6001g.f5998g.mo7120l());
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.m0$l$d */
        static final class C2309d extends C3371l implements C3350b<C2472t<Integer>, String> {

            /* renamed from: g */
            public static final C2309d f6002g = new C2309d();

            C2309d() {
                super(1);
            }

            /* renamed from: a */
            public final String mo5146a(C2472t<Integer> tVar) {
                C3370k.m12227b(tVar, "it");
                return tVar.mo7333c() + " %";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2305l(C2262m0 m0Var) {
            super(1);
            this.f5998g = m0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7152a((C2486x<Integer>) (C2486x) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7152a(C2486x<Integer> xVar) {
            C3370k.m12227b(xVar, "$receiver");
            xVar.mo7324a(String.valueOf(this.f5998g.f5952p));
            C2472t.m9226a((C2472t) xVar, (Boolean) null, (C3349a) new C2306a(this), 1, (Object) null);
            xVar.mo7322a((C3350b<? super C2472t<Integer>, ? extends Integer>) new C2307b(this), (C3351c<? super C2472t<Integer>, ? super Integer, Unit>) new C2308c(this));
            C2472t.m9231b(xVar, (String) null, Integer.valueOf(C3148R.string.pref_triggers_transparency), (C3349a) null, 5, (Object) null);
            C2486x<Integer> xVar2 = xVar;
            C2486x.m9294a(xVar2, new Object[0], (List) null, new C3193d(0, 100), (Boolean) null, false, false, (C3352d) null, 122, (Object) null);
            C2472t.m9228a((C2472t) xVar2, (String) null, (Integer) null, (C3350b) C2309d.f6002g, 3, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.m0$m */
    public static final class C2310m {
        private C2310m() {
        }

        public /* synthetic */ C2310m(C3366g gVar) {
            this();
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.m0$n */
    static final class C2311n extends C3371l implements C3349a<Box<TriggerButton>> {

        /* renamed from: g */
        public static final C2311n f6003g = new C2311n();

        C2311n() {
            super(0);
        }

        public final Box<TriggerButton> invoke() {
            return C2521f.f6389b.mo7481a().boxFor(TriggerButton.class);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.m0$o */
    static final class C2312o extends C3371l implements C3349a<Box<Trigger>> {

        /* renamed from: g */
        public static final C2312o f6004g = new C2312o();

        C2312o() {
            super(0);
        }

        public final Box<Trigger> invoke() {
            return C2521f.f6389b.mo7481a().boxFor(Trigger.class);
        }
    }

    static {
        Class<C2262m0> cls = C2262m0.class;
        C3380u uVar = new C3380u(C3384y.m12254a((Class) cls), "boxTriggerButtons", "getBoxTriggerButtons()Lio/objectbox/Box;");
        C3384y.m12259a((C3379t) uVar);
        C3380u uVar2 = new C3380u(C3384y.m12254a((Class) cls), "boxTriggers", "getBoxTriggers()Lio/objectbox/Box;");
        C3384y.m12259a((C3379t) uVar2);
        f5944r = new C3208i[]{uVar, uVar2};
        new C2310m((C3366g) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2262m0(Application application, long j, String str) {
        super(application);
        Application application2 = application;
        String str2 = str;
        C3370k.m12227b(application2, "app");
        C3370k.m12227b(str2, "title");
        this.f5951o = application2;
        this.f5952p = j;
        this.f5953q = str2;
        Trigger trigger = m8817o().get(this.f5952p);
        C3370k.m12223a((Object) trigger, "boxTriggers.get(triggerId)");
        this.f5949m = trigger;
        this.f5948l.mo6588a(Boolean.valueOf(this.f5949m.mo6387f()));
        boolean z = this.f5949m.mo6388g() == 3 || this.f5949m.mo6388g() == 5;
        C1116a<Object> g = mo7159g();
        Object[] objArr = new Object[14];
        objArr[0] = new C2428c0(this.f5953q, (Integer) null, false, false, false, true, 0, (C3350b) null, 198, (C3366g) null);
        objArr[1] = new C2408a0(new C2263a(this));
        Rect rect = null;
        objArr[2] = new C2458k((Object) null, new C2279e(this), 1, (C3366g) null);
        objArr[3] = new C2471s(new C2281f(this, z));
        objArr[4] = new C2471s(new C2286g(this, z));
        objArr[5] = new C2458k((Object) null, new C2291h(this), 1, (C3366g) null);
        objArr[6] = new C2486x(new C2293i(this));
        objArr[7] = new C2486x(new C2297j(this));
        objArr[8] = new C2486x(new C2301k(this));
        objArr[9] = new C2486x(new C2305l(this));
        objArr[10] = new C2486x(new C2267b(this));
        objArr[11] = new C2408a0(new C2271c(this));
        objArr[12] = new C2408a0(new C2275d(this));
        objArr[13] = this.f5949m.mo6388g() == 80 ? new Rect(0, this.f5950n, 0, 0) : rect;
        C1116a.C1117a.m5570a(g, C3284j.m12072c(objArr), (C3351c) null, (C3351c) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final Box<TriggerButton> m8816n() {
        C3256e eVar = this.f5945i;
        C3208i iVar = f5944r[0];
        return (Box) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final Box<Trigger> m8817o() {
        C3256e eVar = this.f5946j;
        C3208i iVar = f5944r[1];
        return (Box) eVar.getValue();
    }

    /* renamed from: i */
    public final Application mo7117i() {
        return this.f5951o;
    }

    /* renamed from: j */
    public final C0497t<C2068g> mo7118j() {
        return this.f5947k;
    }

    /* renamed from: k */
    public final int mo7119k() {
        return this.f5950n;
    }

    /* renamed from: l */
    public final Trigger mo7120l() {
        return this.f5949m;
    }

    /* renamed from: m */
    public final C1798b<Boolean> mo7121m() {
        return this.f5948l;
    }
}
