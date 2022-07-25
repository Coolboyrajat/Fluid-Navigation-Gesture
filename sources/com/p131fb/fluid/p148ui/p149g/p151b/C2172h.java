package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.p131fb.fluid.CapacitiveKeysService;
import com.p131fb.fluid.p135l.p139p.C1770f;
import com.p131fb.fluid.p148ui.p149g.p150a.C2061a;
import com.p131fb.fluid.p148ui.p149g.p150a.C2062b;
import com.p131fb.fluid.p148ui.p149g.p152c.C2408a0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2428c0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2471s;
import com.p131fb.fluid.p148ui.p149g.p152c.C2472t;
import com.p131fb.fluid.utils.preferences.C2527h;
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
import p054c.p055a.p067b.p068f.C1116a;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.b.h */
public final class C2172h extends C2317o {

    /* renamed from: l */
    static final /* synthetic */ C3208i[] f5838l;

    /* renamed from: i */
    private final C3256e f5839i = C3258g.m11969a(new C2182e(this));
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f5840j;

    /* renamed from: k */
    private final Application f5841k;

    /* renamed from: com.fb.fluid.ui.g.b.h$a */
    static final class C2173a extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2172h f5842g;

        /* renamed from: com.fb.fluid.ui.g.b.h$a$a */
        static final class C2174a extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2173a f5843g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2174a(C2173a aVar) {
                super(2);
                this.f5843g = aVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7027a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7027a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                this.f5843g.f5842g.mo7160h().setValue(new C2061a(21));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2173a(C2172h hVar) {
            super(1);
            this.f5842g = hVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7026a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7026a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_app_backlist_24px), false, (Integer) null, (C3351c) null, 29, (Object) null);
            C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.header_app_rules), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.header_app_rules_sum), (C3349a) null, 5, (Object) null);
            sVar.mo7315a(new C2174a(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.h$b */
    static final class C2175b extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2172h f5844g;

        /* renamed from: com.fb.fluid.ui.g.b.h$b$a */
        static final class C2176a extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2175b f5845g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2176a(C2175b bVar) {
                super(2);
                this.f5845g = bVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7029a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7029a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                this.f5845g.f5844g.mo7160h().setValue(new C2062b(6));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2175b(C2172h hVar) {
            super(1);
            this.f5844g = hVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7028a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7028a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_navbar), false, (Integer) null, (C3351c) null, 29, (Object) null);
            C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.pref_block_capacitive_keys), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.pref_block_capacitive_keys_sum), (C3349a) null, 5, (Object) null);
            sVar.mo7315a(new C2176a(this));
            if (this.f5844g.mo7025i().getPackageManager().getComponentEnabledSetting(new ComponentName(this.f5844g.mo7025i(), CapacitiveKeysService.class)) == 2) {
                C2472t.m9228a((C2472t) sVar, (String) null, Integer.valueOf(C3148R.string.pref_block_capacitive_keys_desc), (C3350b) null, 5, (Object) null);
            }
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.h$c */
    static final class C2177c extends C3371l implements C3350b<C2408a0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2172h f5846g;

        /* renamed from: com.fb.fluid.ui.g.b.h$c$a */
        static final class C2178a extends C3371l implements C3350b<C2472t<Boolean>, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2177c f5847g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2178a(C2177c cVar) {
                super(1);
                this.f5847g = cVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7031a((C2472t<Boolean>) (C2472t) obj));
            }

            /* renamed from: a */
            public final boolean mo7031a(C2472t<Boolean> tVar) {
                C3370k.m12227b(tVar, "it");
                return !this.f5847g.f5846g.m8634j().mo7548p();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.h$c$b */
        static final class C2179b extends C3371l implements C3351c<C2472t<Boolean>, Boolean, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2177c f5848g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2179b(C2177c cVar) {
                super(2);
                this.f5848g = cVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7032a((C2472t<Boolean>) (C2472t) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7032a(C2472t<Boolean> tVar, boolean z) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f5848g.f5846g.m8634j().mo7519e(!z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2177c(C2172h hVar) {
            super(1);
            this.f5846g = hVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7030a((C2408a0) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7030a(C2408a0 a0Var) {
            C3370k.m12227b(a0Var, "$receiver");
            C2408a0 a0Var2 = a0Var;
            C2472t.m9225a(a0Var2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_fullscreen), false, (Integer) null, (C3351c) null, 29, (Object) null);
            C2472t.m9231b(a0Var2, (String) null, Integer.valueOf(C3148R.string.pref_ignore_policycontrol_changes), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) a0Var2, (String) null, Integer.valueOf(C3148R.string.pref_ignore_policycontrol_changes_sum), (C3349a) null, 5, (Object) null);
            a0Var.mo7322a(new C2178a(this), new C2179b(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.h$d */
    static final class C2180d extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2172h f5849g;

        /* renamed from: com.fb.fluid.ui.g.b.h$d$a */
        static final class C2181a extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2180d f5850g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2181a(C2180d dVar) {
                super(2);
                this.f5850g = dVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7034a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7034a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                if (this.f5850g.f5849g.m8634j().mo7531i()) {
                    this.f5850g.f5849g.mo7160h().setValue(new C2061a(26));
                } else if (this.f5850g.f5849g.f5840j >= 6) {
                    this.f5850g.f5849g.m8634j().mo7507b(true);
                } else {
                    C2172h hVar = this.f5850g.f5849g;
                    hVar.f5840j = hVar.f5840j + 1;
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2180d(C2172h hVar) {
            super(1);
            this.f5849g = hVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7033a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7033a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2472t.m9231b(sVar, BuildConfig.FLAVOR, (Integer) null, (C3349a) null, 6, (Object) null);
            sVar.mo7315a(new C2181a(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.h$e */
    static final class C2182e extends C3371l implements C3349a<C2527h> {

        /* renamed from: g */
        final /* synthetic */ C2172h f5851g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2182e(C2172h hVar) {
            super(0);
            this.f5851g = hVar;
        }

        public final C2527h invoke() {
            return new C2527h(this.f5851g.mo7025i());
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C2172h.class), "preferences", "getPreferences()Lcom/fb/fluid/utils/preferences/SharedPrefHelper;");
        C3384y.m12259a((C3379t) uVar);
        f5838l = new C3208i[]{uVar};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2172h(Application application) {
        super(application);
        C3370k.m12227b(application, "app");
        this.f5841k = application;
        C1116a<Object> g = mo7159g();
        Object[] objArr = new Object[5];
        objArr[0] = new C2428c0((String) null, Integer.valueOf(C3148R.string.header_advanced), false, false, false, true, 0, (C3350b) null, 197, (C3366g) null);
        objArr[1] = new C2471s(new C2173a(this));
        objArr[2] = C1770f.m7468a((Context) this.f5841k) ? null : new C2471s(new C2175b(this));
        objArr[3] = new C2408a0(new C2177c(this));
        objArr[4] = new C2471s(new C2180d(this));
        C1116a.C1117a.m5570a(g, C3284j.m12072c(objArr), (C3351c) null, (C3351c) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final C2527h m8634j() {
        C3256e eVar = this.f5839i;
        C3208i iVar = f5838l[0];
        return (C2527h) eVar.getValue();
    }

    /* renamed from: i */
    public final Application mo7025i() {
        return this.f5841k;
    }
}
