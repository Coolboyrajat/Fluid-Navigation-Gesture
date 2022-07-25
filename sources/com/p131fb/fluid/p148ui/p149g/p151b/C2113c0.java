package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.C0497t;
import com.p131fb.fluid.p135l.C1734c;
import com.p131fb.fluid.p135l.p140q.C1783a;
import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;
import com.p131fb.fluid.p148ui.p149g.p152c.C2408a0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2428c0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2471s;
import com.p131fb.fluid.p148ui.p149g.p152c.C2472t;
import com.p131fb.fluid.utils.preferences.C2527h;
import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p067b.p068f.C1116a;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.b.c0 */
public final class C2113c0 extends C2317o {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2527h f5746i;

    /* renamed from: j */
    private final C0497t<C2068g> f5747j = new C0497t<>();

    /* renamed from: k */
    private final Application f5748k;

    /* renamed from: com.fb.fluid.ui.g.b.c0$a */
    static final class C2114a extends C3371l implements C3350b<C2408a0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2113c0 f5749g;

        /* renamed from: com.fb.fluid.ui.g.b.c0$a$a */
        static final class C2115a extends C3371l implements C3350b<C2472t<Boolean>, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2114a f5750g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2115a(C2114a aVar) {
                super(1);
                this.f5750g = aVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo6984a((C2472t<Boolean>) (C2472t) obj));
            }

            /* renamed from: a */
            public final boolean mo6984a(C2472t<Boolean> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f5750g.f5749g.f5746i.mo7492E();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.c0$a$b */
        static final class C2116b extends C3371l implements C3351c<C2472t<Boolean>, Boolean, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2114a f5751g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2116b(C2114a aVar) {
                super(2);
                this.f5751g = aVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo6985a((C2472t<Boolean>) (C2472t) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6985a(C2472t<Boolean> tVar, boolean z) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f5751g.f5749g.f5746i.mo7542m(z);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.c0$a$c */
        static final class C2117c extends C3371l implements C3349a<Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2114a f5752g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2117c(C2114a aVar) {
                super(0);
                this.f5752g = aVar;
            }

            public final boolean invoke() {
                return this.f5752g.f5749g.f5746i.mo7543n() != 0;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2114a(C2113c0 c0Var) {
            super(1);
            this.f5749g = c0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6983a((C2408a0) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6983a(C2408a0 a0Var) {
            C3370k.m12227b(a0Var, "$receiver");
            a0Var.mo7319a("keyboard_softkeys_mode");
            a0Var.mo7322a(new C2115a(this), new C2116b(this));
            a0Var.mo7324a("hide_navbar_mode");
            C2472t.m9226a((C2472t) a0Var, (Boolean) null, (C3349a) new C2117c(this), 1, (Object) null);
            C2408a0 a0Var2 = a0Var;
            C2472t.m9225a(a0Var2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_keyboard_24px), false, (Integer) null, (C3351c) null, 29, (Object) null);
            C2472t.m9231b(a0Var2, (String) null, Integer.valueOf(C3148R.string.pref_navbar_keyboard), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) a0Var2, (String) null, Integer.valueOf(C3148R.string.pref_navbar_keyboard_sum), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.c0$b */
    static final class C2118b extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2113c0 f5753g;

        /* renamed from: com.fb.fluid.ui.g.b.c0$b$a */
        static final class C2119a extends C3371l implements C3349a<Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2118b f5754g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2119a(C2118b bVar) {
                super(0);
                this.f5754g = bVar;
            }

            public final boolean invoke() {
                return this.f5754g.f5753g.f5746i.mo7543n() == 1;
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.c0$b$b */
        static final class C2120b extends C3371l implements C3350b<C2472t<Object>, String> {

            /* renamed from: g */
            final /* synthetic */ C2118b f5755g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2120b(C2118b bVar) {
                super(1);
                this.f5755g = bVar;
            }

            /* renamed from: a */
            public final String mo5146a(C2472t<Object> tVar) {
                C3370k.m12227b(tVar, "it");
                List b = C3284j.m12070b((T[]) new Integer[]{2, 0, 1});
                return (String) C3284j.m12070b((T[]) new String[]{this.f5755g.f5753g.mo6981i().getString(C3148R.string.pref_navbar_mode_tablet), this.f5755g.f5753g.mo6981i().getString(C3148R.string.pref_navbar_mode_m), this.f5755g.f5753g.mo6981i().getString(C3148R.string.pref_navbar_mode_n)}).get(b.indexOf(Integer.valueOf(this.f5755g.f5753g.f5746i.mo7552t())));
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.c0$b$c */
        static final class C2121c extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2118b f5756g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2121c(C2118b bVar) {
                super(2);
                this.f5756g = bVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo6988a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6988a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                this.f5756g.f5753g.mo6982j().setValue(new C2159e0());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2118b(C2113c0 c0Var) {
            super(1);
            this.f5753g = c0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6986a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6986a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            sVar.mo7319a("navbar_rotation_mode");
            C2471s sVar2 = sVar;
            C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_rotationmode_24px), false, (Integer) null, (C3351c) null, 29, (Object) null);
            C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.pref_navbar_rotation_mode), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.pref_navbar_rotation_mode_sum), (C3349a) null, 5, (Object) null);
            sVar.mo7324a("hide_navbar_mode");
            C2472t.m9226a((C2472t) sVar, (Boolean) null, (C3349a) new C2119a(this), 1, (Object) null);
            C2472t.m9228a((C2472t) sVar, (String) null, (Integer) null, (C3350b) new C2120b(this), 3, (Object) null);
            sVar.mo7315a(new C2121c(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2113c0(Application application) {
        super(application);
        C3370k.m12227b(application, "app");
        this.f5748k = application;
        Context baseContext = this.f5748k.getBaseContext();
        C3370k.m12223a((Object) baseContext, "app.baseContext");
        this.f5746i = new C2527h(baseContext);
        List d = C3284j.m12074d(new C2428c0((String) null, Integer.valueOf(C3148R.string.pref_hide_navbar_mode_threebutton), false, false, false, true, 0, (C3350b) null, 197, (C3366g) null));
        C2472t[] tVarArr = new C2472t[3];
        tVarArr[0] = new C2408a0(new C2114a(this));
        tVarArr[1] = (!C1783a.f5089a.mo6545h() || !C1734c.f5038h.mo6477f()) ? new C2471s(new C2118b(this)) : null;
        tVarArr[2] = null;
        d.addAll(C3284j.m12072c(tVarArr));
        C1116a.C1117a.m5570a(mo7159g(), d, (C3351c) null, (C3351c) null, 6, (Object) null);
    }

    /* renamed from: i */
    public final Application mo6981i() {
        return this.f5748k;
    }

    /* renamed from: j */
    public final C0497t<C2068g> mo6982j() {
        return this.f5747j;
    }
}
