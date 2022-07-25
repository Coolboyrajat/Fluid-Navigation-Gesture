package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import com.p131fb.fluid.data.Trigger;
import com.p131fb.fluid.p135l.C1738f;
import com.p131fb.fluid.p135l.p140q.C1785b;
import com.p131fb.fluid.p135l.p142s.C1795a;
import com.p131fb.fluid.p148ui.p149g.p150a.C2061a;
import com.p131fb.fluid.p148ui.p149g.p152c.C2408a0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2440g0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2458k;
import com.p131fb.fluid.p148ui.p149g.p152c.C2464n;
import com.p131fb.fluid.p148ui.p149g.p152c.C2471s;
import com.p131fb.fluid.p148ui.p149g.p152c.C2472t;
import com.p131fb.fluid.p148ui.p149g.p152c.C2477u;
import com.p131fb.fluid.utils.preferences.C2516b;
import com.p131fb.fluid.utils.preferences.C2521f;
import com.p131fb.fluid.utils.preferences.C2526g;
import com.p131fb.fluid.utils.preferences.C2527h;
import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p067b.p068f.C1116a;
import p190io.objectbox.Box;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.b.u */
public final class C2380u extends C2317o {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2527h f6081i;

    /* renamed from: j */
    private final SharedPreferences.OnSharedPreferenceChangeListener f6082j = new C2381a(this);

    /* renamed from: k */
    private final Application f6083k;

    /* renamed from: com.fb.fluid.ui.g.b.u$a */
    static final class C2381a implements SharedPreferences.OnSharedPreferenceChangeListener {

        /* renamed from: a */
        final /* synthetic */ C2380u f6084a;

        C2381a(C2380u uVar) {
            this.f6084a = uVar;
        }

        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (str != null && str.hashCode() == -1658453556 && str.equals("fluid_enabled")) {
                C2477u.m9269a(this.f6084a.mo7159g(), "fluid_enabled");
            }
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.u$b */
    static final class C2382b extends C3371l implements C3350b<C2408a0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2380u f6085g;

        /* renamed from: com.fb.fluid.ui.g.b.u$b$a */
        static final class C2383a extends C3371l implements C3350b<Boolean, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2382b f6086g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2383a(C2382b bVar) {
                super(1);
                this.f6086g = bVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7216a(((Boolean) obj).booleanValue()));
            }

            /* renamed from: a */
            public final boolean mo7216a(boolean z) {
                if (!z || this.f6086g.f6085g.m9042i()) {
                    return true;
                }
                this.f6086g.f6085g.mo7160h().setValue(new C2061a(19));
                return false;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2382b(C2380u uVar) {
            super(1);
            this.f6085g = uVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7215a((C2408a0) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7215a(C2408a0 a0Var) {
            C3370k.m12227b(a0Var, "$receiver");
            a0Var.mo7319a("fluid_enabled");
            a0Var.mo7317a(new C2516b(this.f6085g.f6081i, "fluid_enabled", false));
            C2472t.m9231b(a0Var, (String) null, Integer.valueOf(C3148R.string.pref_app_toggle), (C3349a) null, 5, (Object) null);
            a0Var.mo7238a(new C2383a(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.u$c */
    static final class C2384c extends C3371l implements C3350b<C2440g0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2380u f6087g;

        /* renamed from: com.fb.fluid.ui.g.b.u$c$a */
        static final class C2385a extends C3371l implements C3349a<Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2384c f6088g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2385a(C2384c cVar) {
                super(0);
                this.f6088g = cVar;
            }

            public final boolean invoke() {
                return this.f6088g.f6087g.f6081i.mo7498K();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2384c(C2380u uVar) {
            super(1);
            this.f6087g = uVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7217a((C2440g0) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7217a(C2440g0 g0Var) {
            C3370k.m12227b(g0Var, "$receiver");
            g0Var.mo7324a("fluid_enabled");
            C2472t.m9226a((C2472t) g0Var, (Boolean) null, (C3349a) new C2385a(this), 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.u$d */
    static final class C2386d extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2380u f6089g;

        /* renamed from: com.fb.fluid.ui.g.b.u$d$a */
        static final class C2387a extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2386d f6090g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2387a(C2386d dVar) {
                super(2);
                this.f6090g = dVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7219a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7219a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                this.f6090g.f6089g.mo7160h().setValue(new C2061a(15));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2386d(C2380u uVar) {
            super(1);
            this.f6089g = uVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7218a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7218a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_looknfeel_24px), false, (Integer) null, (C3351c) null, 29, (Object) null);
            C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.header_personalization), (C3349a) null, 5, (Object) null);
            sVar.mo7315a(new C2387a(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.u$e */
    static final class C2388e extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2380u f6091g;

        /* renamed from: com.fb.fluid.ui.g.b.u$e$a */
        static final class C2389a extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2388e f6092g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2389a(C2388e eVar) {
                super(2);
                this.f6092g = eVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7221a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7221a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                this.f6092g.f6091g.mo7160h().setValue(new C2061a(13));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2388e(C2380u uVar) {
            super(1);
            this.f6091g = uVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7220a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7220a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_triggers_24px), false, (Integer) null, (C3351c) null, 29, (Object) null);
            C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.header_triggers), (C3349a) null, 5, (Object) null);
            sVar.mo7315a(new C2389a(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.u$f */
    static final class C2390f extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2380u f6093g;

        /* renamed from: com.fb.fluid.ui.g.b.u$f$a */
        static final class C2391a extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2390f f6094g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2391a(C2390f fVar) {
                super(2);
                this.f6094g = fVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7223a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7223a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                this.f6094g.f6093g.mo7160h().setValue(new C2061a(2));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2390f(C2380u uVar) {
            super(1);
            this.f6093g = uVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7222a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7222a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_navbar), false, (Integer) null, (C3351c) null, 29, (Object) null);
            C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.header_navbar), (C3349a) null, 5, (Object) null);
            sVar.mo7315a(new C2391a(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.u$g */
    static final class C2392g extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2380u f6095g;

        /* renamed from: com.fb.fluid.ui.g.b.u$g$a */
        static final class C2393a extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2392g f6096g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2393a(C2392g gVar) {
                super(2);
                this.f6096g = gVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7225a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7225a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                this.f6096g.f6095g.mo7160h().setValue(new C2061a(10));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2392g(C2380u uVar) {
            super(1);
            this.f6095g = uVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7224a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7224a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_advanced), false, (Integer) null, (C3351c) null, 29, (Object) null);
            C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.header_advanced), (C3349a) null, 5, (Object) null);
            sVar.mo7315a(new C2393a(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2380u(Application application) {
        super(application);
        C3370k.m12227b(application, "app");
        this.f6083k = application;
        Context baseContext = this.f6083k.getBaseContext();
        C3370k.m12223a((Object) baseContext, "app.baseContext");
        this.f6081i = new C2527h(baseContext);
        C2526g.m9416a(this.f6082j, this.f6081i);
        if (this.f6081i.mo7498K() && !m9042i()) {
            this.f6081i.mo7515d(false);
            C1738f.f5044c.mo6483a(0, 0, 0, 0, 0);
        }
        C1116a<Object> g = mo7159g();
        Box<Trigger> boxFor = C2521f.f6389b.mo7481a().boxFor(Trigger.class);
        C3370k.m12223a((Object) boxFor, "ObjectBox.boxStore.boxFor(Trigger::class.java)");
        List<Trigger> all = boxFor.getAll();
        C3370k.m12223a((Object) all, "ObjectBox.boxStore.boxFor(Trigger::class.java).all");
        C1116a.C1117a.m5570a(g, C3284j.m12072c(new C2464n(), new C2458k((Object) null, (C3350b) null, 3, (C3366g) null), new C2408a0(new C2382b(this)), new C2458k((Object) null, (C3350b) null, 3, (C3366g) null), new C2440g0(all, new C2384c(this)), new C2458k((Object) null, (C3350b) null, 3, (C3366g) null), new C2471s(new C2386d(this)), new C2471s(new C2388e(this)), new C2471s(new C2390f(this)), new C2471s(new C2392g(this))), (C3351c) null, (C3351c) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final boolean m9042i() {
        C1785b.C1786a aVar = C1785b.f5090a;
        Context baseContext = this.f6083k.getBaseContext();
        C3370k.m12223a((Object) baseContext, "app.baseContext");
        if (C1785b.C1786a.m7502a(aVar, baseContext, (String) null, (String) null, 6, (Object) null)) {
            C1795a.C1796a aVar2 = C1795a.f5111a;
            Context baseContext2 = this.f6083k.getBaseContext();
            C3370k.m12223a((Object) baseContext2, "app.baseContext");
            if (aVar2.mo6584a(baseContext2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo2564f() {
        super.mo2564f();
        C2526g.m9417b(this.f6082j, this.f6081i);
        mo7159g().clear();
    }
}
