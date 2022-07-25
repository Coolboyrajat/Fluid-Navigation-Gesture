package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.C0497t;
import com.p131fb.fluid.p135l.p140q.C1783a;
import com.p131fb.fluid.p148ui.p149g.p150a.C2064c;
import com.p131fb.fluid.p148ui.p149g.p150a.C2067f;
import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;
import com.p131fb.fluid.p148ui.p149g.p152c.C2428c0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2458k;
import com.p131fb.fluid.p148ui.p149g.p152c.C2471s;
import com.p131fb.fluid.p148ui.p149g.p152c.C2472t;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p067b.p068f.C1116a;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.b.r0 */
public final class C2355r0 extends C2317o {

    /* renamed from: com.fb.fluid.ui.g.b.r0$a */
    static final class C2356a extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        public static final C2356a f6052g = new C2356a();

        C2356a() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7193a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7193a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2472t.m9228a((C2472t) sVar, (String) null, Integer.valueOf(C3148R.string.pref_pc_instructions), (C3350b) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.r0$b */
    static final class C2357b extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        public static final C2357b f6053g = new C2357b();

        C2357b() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7194a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7194a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.wss_step_1), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.wss_step_1_sum), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.r0$c */
    static final class C2358c extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ Application f6054g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2358c(Application application) {
            super(1);
            this.f6054g = application;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7195a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7195a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2472t.m9231b(sVar, (String) null, Integer.valueOf(C3148R.string.wss_step_2), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) sVar, (String) null, Integer.valueOf(C1783a.f5089a.mo6538a(this.f6054g) ? C3148R.string.wss_step_2_sum_miui : C3148R.string.wss_step_2_sum), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.r0$d */
    static final class C2359d extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2355r0 f6055g;

        /* renamed from: h */
        final /* synthetic */ Application f6056h;

        /* renamed from: com.fb.fluid.ui.g.b.r0$d$a */
        static final class C2360a extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2359d f6057g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2360a(C2359d dVar) {
                super(2);
                this.f6057g = dVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7197a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7197a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                C0497t<C2068g> h = this.f6057g.f6055g.mo7160h();
                String string = this.f6057g.f6056h.getString(C3148R.string.url_android_sdk);
                C3370k.m12223a((Object) string, "app.getString(R.string.url_android_sdk)");
                h.setValue(new C2064c(string));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2359d(C2355r0 r0Var, Application application) {
            super(1);
            this.f6055g = r0Var;
            this.f6056h = application;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7196a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7196a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.wss_step_3), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.wss_step_3_sum), (C3349a) null, 5, (Object) null);
            C2472t.m9228a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.wss_step_3_download_sdk), (C3350b) null, 5, (Object) null);
            sVar.mo7315a(new C2360a(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.r0$e */
    static final class C2361e extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2355r0 f6058g;

        /* renamed from: h */
        final /* synthetic */ Application f6059h;

        /* renamed from: com.fb.fluid.ui.g.b.r0$e$a */
        static final class C2362a extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2361e f6060g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2362a(C2361e eVar) {
                super(2);
                this.f6060g = eVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7199a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7199a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                C0497t<C2068g> h = this.f6060g.f6058g.mo7160h();
                String string = this.f6060g.f6059h.getString(C3148R.string.howto_lineage_url);
                C3370k.m12223a((Object) string, "app.getString(R.string.howto_lineage_url)");
                h.setValue(new C2064c(string));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2361e(C2355r0 r0Var, Application application) {
            super(1);
            this.f6058g = r0Var;
            this.f6059h = application;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7198a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7198a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.howto_lineage), (C3349a) null, 5, (Object) null);
            C2472t.m9228a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.howto_lineage_src), (C3350b) null, 5, (Object) null);
            C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_pref_hyperlink_24px), false, (Integer) null, (C3351c) null, 29, (Object) null);
            sVar.mo7315a(new C2362a(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.r0$f */
    static final class C2363f extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2355r0 f6061g;

        /* renamed from: h */
        final /* synthetic */ Application f6062h;

        /* renamed from: com.fb.fluid.ui.g.b.r0$f$a */
        static final class C2364a extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2363f f6063g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2364a(C2363f fVar) {
                super(2);
                this.f6063g = fVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7201a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7201a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                C0497t<C2068g> h = this.f6063g.f6061g.mo7160h();
                String string = this.f6063g.f6062h.getString(C3148R.string.howto_xda_url);
                C3370k.m12223a((Object) string, "app.getString(R.string.howto_xda_url)");
                h.setValue(new C2064c(string));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2363f(C2355r0 r0Var, Application application) {
            super(1);
            this.f6061g = r0Var;
            this.f6062h = application;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7200a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7200a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.howto_xda), (C3349a) null, 5, (Object) null);
            C2472t.m9228a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.howto_xda_src), (C3350b) null, 5, (Object) null);
            C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_pref_hyperlink_24px), false, (Integer) null, (C3351c) null, 29, (Object) null);
            sVar.mo7315a(new C2364a(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.r0$g */
    static final class C2365g extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2355r0 f6064g;

        /* renamed from: h */
        final /* synthetic */ Application f6065h;

        /* renamed from: com.fb.fluid.ui.g.b.r0$g$a */
        static final class C2366a extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2365g f6066g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2366a(C2365g gVar) {
                super(2);
                this.f6066g = gVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7203a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7203a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                Object systemService = this.f6066g.f6065h.getSystemService("clipboard");
                if (systemService != null) {
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("ADB CMD", this.f6066g.f6065h.getString(C3148R.string.adb_cmd_grant)));
                    this.f6066g.f6064g.mo7160h().setValue(new C2067f(C3148R.string.wss_step_4_toast));
                    return;
                }
                throw new C3269p("null cannot be cast to non-null type android.content.ClipboardManager");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2365g(C2355r0 r0Var, Application application) {
            super(1);
            this.f6064g = r0Var;
            this.f6065h = application;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7202a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7202a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.wss_step_4), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.adb_cmd_grant), (C3349a) null, 5, (Object) null);
            C2472t.m9228a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.wss_step_4_desc), (C3350b) null, 5, (Object) null);
            sVar.mo7315a(new C2366a(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2355r0(Application application) {
        super(application);
        C3370k.m12227b(application, "app");
        C1116a.C1117a.m5570a(mo7159g(), C3284j.m12072c(new C2428c0((String) null, Integer.valueOf(C3148R.string.perm_wss), false, false, false, true, 0, (C3350b) null, 197, (C3366g) null), new C2471s(C2356a.f6052g), new C2471s(C2357b.f6053g), new C2458k((Object) null, (C3350b) null, 3, (C3366g) null), new C2471s(new C2358c(application)), new C2458k((Object) null, (C3350b) null, 3, (C3366g) null), new C2471s(new C2359d(this, application)), new C2471s(new C2361e(this, application)), new C2471s(new C2363f(this, application)), new C2458k((Object) null, (C3350b) null, 3, (C3366g) null), new C2471s(new C2365g(this, application))), (C3351c) null, (C3351c) null, 6, (Object) null);
    }
}
