package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.C0497t;
import com.p131fb.fluid.p135l.p139p.C1767c;
import com.p131fb.fluid.p135l.p139p.C1770f;
import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;
import com.p131fb.fluid.p148ui.p149g.p152c.C2408a0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2428c0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2439g;
import com.p131fb.fluid.p148ui.p149g.p152c.C2458k;
import com.p131fb.fluid.p148ui.p149g.p152c.C2471s;
import com.p131fb.fluid.p148ui.p149g.p152c.C2472t;
import com.p131fb.fluid.p148ui.p149g.p152c.C2477u;
import com.p131fb.fluid.p148ui.p149g.p152c.C2486x;
import com.p131fb.fluid.services.p145e.p146g.C1966c;
import com.p131fb.fluid.utils.preferences.C2527h;
import java.util.List;
import kotlin.Unit;
import kotlin.p191a0.C3193d;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p067b.p068f.C1116a;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.b.j0 */
public final class C2201j0 extends C2317o {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2527h f5871i = new C2527h(this.f5873k);

    /* renamed from: j */
    private final C0497t<C2068g> f5872j = new C0497t<>();

    /* renamed from: k */
    private final Application f5873k;

    /* renamed from: com.fb.fluid.ui.g.b.j0$a */
    static final class C2202a extends C3371l implements C3350b<C2486x<Integer>, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2201j0 f5874g;

        /* renamed from: com.fb.fluid.ui.g.b.j0$a$a */
        static final class C2203a extends C3371l implements C3350b<C2472t<Integer>, Integer> {

            /* renamed from: g */
            final /* synthetic */ C2202a f5875g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2203a(C2202a aVar) {
                super(1);
                this.f5875g = aVar;
            }

            /* renamed from: a */
            public final int mo7061a(C2472t<Integer> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f5875g.f5874g.f5871i.mo7489B();
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Integer.valueOf(mo7061a((C2472t<Integer>) (C2472t) obj));
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.j0$a$b */
        static final class C2204b extends C3371l implements C3351c<C2472t<Integer>, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2202a f5876g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2204b(C2202a aVar) {
                super(2);
                this.f5876g = aVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7062a((C2472t<Integer>) (C2472t) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7062a(C2472t<Integer> tVar, int i) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f5876g.f5874g.f5871i.mo7532j(i);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.j0$a$c */
        static final class C2205c extends C3371l implements C3350b<C2472t<Integer>, String> {

            /* renamed from: g */
            public static final C2205c f5877g = new C2205c();

            C2205c() {
                super(1);
            }

            /* renamed from: a */
            public final String mo5146a(C2472t<Integer> tVar) {
                C3370k.m12227b(tVar, "it");
                return tVar.mo7333c() + " %";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2202a(C2201j0 j0Var) {
            super(1);
            this.f5874g = j0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7060a((C2486x<Integer>) (C2486x) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7060a(C2486x<Integer> xVar) {
            C3370k.m12227b(xVar, "$receiver");
            C2472t.m9225a(xVar, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.empty), false, (Integer) null, (C3351c) null, 29, (Object) null);
            xVar.mo7319a("scale_vert");
            xVar.mo7322a((C3350b<? super C2472t<Integer>, ? extends Integer>) new C2203a(this), (C3351c<? super C2472t<Integer>, ? super Integer, Unit>) new C2204b(this));
            C2472t.m9231b(xVar, (String) null, Integer.valueOf(C3148R.string.pref_scale_bottom), (C3349a) null, 5, (Object) null);
            C2486x<Integer> xVar2 = xVar;
            C2486x.m9294a(xVar2, new Object[0], (List) null, new C3193d(50, 150), (Boolean) null, false, false, (C3352d) null, 122, (Object) null);
            C2472t.m9228a((C2472t) xVar2, (String) null, (Integer) null, (C3350b) C2205c.f5877g, 3, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.j0$b */
    static final class C2206b extends C3371l implements C3350b<C2458k, Unit> {

        /* renamed from: g */
        public static final C2206b f5878g = new C2206b();

        C2206b() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7064a((C2458k) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7064a(C2458k kVar) {
            C3370k.m12227b(kVar, "$receiver");
            C2472t.m9231b(kVar, (String) null, Integer.valueOf(C3148R.string.header_sound_vibration), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.j0$c */
    static final class C2207c extends C3371l implements C3350b<C2486x<Integer>, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2201j0 f5879g;

        /* renamed from: com.fb.fluid.ui.g.b.j0$c$a */
        static final class C2208a extends C3371l implements C3351c<Context, C2472t<Integer>, Drawable> {

            /* renamed from: g */
            public static final C2208a f5880g = new C2208a();

            C2208a() {
                super(2);
            }

            /* renamed from: a */
            public final Drawable mo6125a(Context context, C2472t<Integer> tVar) {
                C3370k.m12227b(context, "context");
                C3370k.m12227b(tVar, "item");
                Integer c = tVar.mo7333c();
                return context.getDrawable((c != null && c.intValue() == 0) ? C3148R.C3149drawable.ic_main_vol_off_24dp : C3148R.C3149drawable.ic_main_volume_24dp);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.j0$c$b */
        static final class C2209b extends C3371l implements C3350b<C2472t<Integer>, Integer> {

            /* renamed from: g */
            final /* synthetic */ C2207c f5881g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2209b(C2207c cVar) {
                super(1);
                this.f5881g = cVar;
            }

            /* renamed from: a */
            public final int mo7067a(C2472t<Integer> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f5881g.f5879g.f5871i.mo7494G();
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Integer.valueOf(mo7067a((C2472t<Integer>) (C2472t) obj));
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.j0$c$c */
        static final class C2210c extends C3371l implements C3351c<C2472t<Integer>, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2207c f5882g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2210c(C2207c cVar) {
                super(2);
                this.f5882g = cVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7068a((C2472t<Integer>) (C2472t) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7068a(C2472t<Integer> tVar, int i) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f5882g.f5879g.f5871i.mo7536k(i);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2207c(C2201j0 j0Var) {
            super(1);
            this.f5879g = j0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7065a((C2486x<Integer>) (C2486x) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7065a(C2486x<Integer> xVar) {
            C3370k.m12227b(xVar, "$receiver");
            C2472t.m9225a(xVar, (Drawable) null, (Integer) null, false, (Integer) null, C2208a.f5880g, 15, (Object) null);
            xVar.mo7319a("sound_feedback_level");
            xVar.mo7322a((C3350b<? super C2472t<Integer>, ? extends Integer>) new C2209b(this), (C3351c<? super C2472t<Integer>, ? super Integer, Unit>) new C2210c(this));
            C2472t.m9231b(xVar, (String) null, Integer.valueOf(C3148R.string.pref_sound), (C3349a) null, 5, (Object) null);
            C2486x<Integer> xVar2 = xVar;
            C2486x.m9294a(xVar2, new Object[0], C3292r.m12104g(new C3193d(0, 7)), (C3193d) null, (Boolean) null, true, false, (C3352d) null, 108, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.j0$d */
    static final class C2211d extends C3371l implements C3350b<C2408a0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2201j0 f5883g;

        /* renamed from: com.fb.fluid.ui.g.b.j0$d$a */
        static final class C2212a extends C3371l implements C3350b<C2472t<Boolean>, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2211d f5884g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2212a(C2211d dVar) {
                super(1);
                this.f5884g = dVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7070a((C2472t<Boolean>) (C2472t) obj));
            }

            /* renamed from: a */
            public final boolean mo7070a(C2472t<Boolean> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f5884g.f5883g.f5871i.mo7495H();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.j0$d$b */
        static final class C2213b extends C3371l implements C3351c<C2472t<Boolean>, Boolean, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2211d f5885g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2213b(C2211d dVar) {
                super(2);
                this.f5885g = dVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7071a((C2472t<Boolean>) (C2472t) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7071a(C2472t<Boolean> tVar, boolean z) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f5885g.f5883g.f5871i.mo7546o(z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2211d(C2201j0 j0Var) {
            super(1);
            this.f5883g = j0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7069a((C2408a0) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7069a(C2408a0 a0Var) {
            C3370k.m12227b(a0Var, "$receiver");
            C2472t.m9225a(a0Var, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_vibration_24dp), false, (Integer) null, (C3351c) null, 29, (Object) null);
            a0Var.mo7319a("system_haptic_feedback");
            a0Var.mo7322a(new C2212a(this), new C2213b(this));
            C2472t.m9231b(a0Var, (String) null, Integer.valueOf(C3148R.string.pref_system_hapticfeedback), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.j0$e */
    static final class C2214e extends C3371l implements C3350b<C2486x<Integer>, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2201j0 f5886g;

        /* renamed from: com.fb.fluid.ui.g.b.j0$e$a */
        static final class C2215a extends C3371l implements C3350b<C2472t<Integer>, Integer> {

            /* renamed from: g */
            final /* synthetic */ C2214e f5887g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2215a(C2214e eVar) {
                super(1);
                this.f5887g = eVar;
            }

            /* renamed from: a */
            public final int mo7073a(C2472t<Integer> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f5887g.f5886g.f5871i.mo7541m();
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Integer.valueOf(mo7073a((C2472t<Integer>) (C2472t) obj));
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.j0$e$b */
        static final class C2216b extends C3371l implements C3351c<C2472t<Integer>, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2214e f5888g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2216b(C2214e eVar) {
                super(2);
                this.f5888g = eVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7074a((C2472t<Integer>) (C2472t) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7074a(C2472t<Integer> tVar, int i) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f5888g.f5886g.f5871i.mo7517e(i);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.j0$e$c */
        static final class C2217c extends C3371l implements C3349a<Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2214e f5889g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2217c(C2214e eVar) {
                super(0);
                this.f5889g = eVar;
            }

            public final boolean invoke() {
                return !this.f5889g.f5886g.f5871i.mo7495H();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2214e(C2201j0 j0Var) {
            super(1);
            this.f5886g = j0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7072a((C2486x<Integer>) (C2486x) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7072a(C2486x<Integer> xVar) {
            C3370k.m12227b(xVar, "$receiver");
            C2472t.m9225a(xVar, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.empty), false, (Integer) null, (C3351c) null, 29, (Object) null);
            xVar.mo7319a("haptic_feedback_level");
            xVar.mo7322a((C3350b<? super C2472t<Integer>, ? extends Integer>) new C2215a(this), (C3351c<? super C2472t<Integer>, ? super Integer, Unit>) new C2216b(this));
            C2472t.m9231b(xVar, (String) null, Integer.valueOf(C3148R.string.pref_vibration), (C3349a) null, 5, (Object) null);
            C2472t.m9226a((C2472t) xVar, (Boolean) null, (C3349a) new C2217c(this), 1, (Object) null);
            xVar.mo7324a("system_haptic_feedback");
            C2486x<Integer> xVar2 = xVar;
            C2486x.m9294a(xVar2, new Object[0], C3292r.m12104g(new C3193d(0, 16)), (C3193d) null, (Boolean) null, false, false, (C3352d) null, 124, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.j0$f */
    static final class C2218f extends C3371l implements C3350b<C2458k, Unit> {

        /* renamed from: g */
        public static final C2218f f5890g = new C2218f();

        C2218f() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7075a((C2458k) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7075a(C2458k kVar) {
            C3370k.m12227b(kVar, "$receiver");
            C2472t.m9231b(kVar, (String) null, Integer.valueOf(C3148R.string.header_animation), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.j0$g */
    static final class C2219g extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2201j0 f5891g;

        /* renamed from: com.fb.fluid.ui.g.b.j0$g$a */
        static final class C2220a extends C3371l implements C3349a<String> {

            /* renamed from: g */
            final /* synthetic */ C2219g f5892g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2220a(C2219g gVar) {
                super(0);
                this.f5892g = gVar;
            }

            public final String invoke() {
                return this.f5892g.f5891g.mo7058i().getString(C1966c.f5466a.mo6816a(this.f5892g.f5891g.f5871i.mo7504b()));
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.j0$g$b */
        static final class C2221b extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2219g f5893g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2221b(C2219g gVar) {
                super(2);
                this.f5893g = gVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7077a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7077a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                this.f5893g.f5891g.mo7059j().setValue(new C2198i("anim_sides"));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2219g(C2201j0 j0Var) {
            super(1);
            this.f5891g = j0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7076a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7076a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_looknfeel_24px), false, (Integer) null, (C3351c) null, 29, (Object) null);
            sVar.mo7319a("anim_sides");
            C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.pref_anim_sides), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) sVar, (String) null, (Integer) null, (C3349a) new C2220a(this), 3, (Object) null);
            sVar.mo7315a(new C2221b(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.j0$h */
    static final class C2222h extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2201j0 f5894g;

        /* renamed from: com.fb.fluid.ui.g.b.j0$h$a */
        static final class C2223a extends C3371l implements C3349a<String> {

            /* renamed from: g */
            final /* synthetic */ C2222h f5895g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2223a(C2222h hVar) {
                super(0);
                this.f5895g = hVar;
            }

            public final String invoke() {
                return this.f5895g.f5894g.mo7058i().getString(C1966c.f5466a.mo6816a(this.f5895g.f5894g.f5871i.mo7508c()));
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.j0$h$b */
        static final class C2224b extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2222h f5896g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2224b(C2222h hVar) {
                super(2);
                this.f5896g = hVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7079a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7079a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                this.f5896g.f5894g.mo7059j().setValue(new C2198i("anim_bottom"));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2222h(C2201j0 j0Var) {
            super(1);
            this.f5894g = j0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7078a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7078a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.empty), false, (Integer) null, (C3351c) null, 29, (Object) null);
            sVar.mo7319a("anim_bottom");
            C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.pref_anim_bottom), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) sVar, (String) null, (Integer) null, (C3349a) new C2223a(this), 3, (Object) null);
            sVar.mo7315a(new C2224b(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.j0$i */
    static final class C2225i extends C3371l implements C3350b<C2458k, Unit> {

        /* renamed from: g */
        public static final C2225i f5897g = new C2225i();

        C2225i() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7080a((C2458k) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7080a(C2458k kVar) {
            C3370k.m12227b(kVar, "$receiver");
            C2472t.m9231b(kVar, (String) null, Integer.valueOf(C3148R.string.header_theme), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.j0$j */
    static final class C2226j extends C3371l implements C3350b<C2439g, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2201j0 f5898g;

        /* renamed from: com.fb.fluid.ui.g.b.j0$j$a */
        static final class C2227a extends C3371l implements C3350b<C2472t<Integer>, Integer> {

            /* renamed from: g */
            final /* synthetic */ C2226j f5899g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2227a(C2226j jVar) {
                super(1);
                this.f5899g = jVar;
            }

            /* renamed from: a */
            public final int mo7082a(C2472t<Integer> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f5899g.f5898g.f5871i.mo7520f();
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Integer.valueOf(mo7082a((C2472t<Integer>) (C2472t) obj));
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.j0$j$b */
        static final class C2228b extends C3371l implements C3351c<C2472t<Integer>, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2226j f5900g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2228b(C2226j jVar) {
                super(2);
                this.f5900g = jVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7083a((C2472t<Integer>) (C2472t) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7083a(C2472t<Integer> tVar, int i) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f5900g.f5898g.f5871i.mo7513d(i);
                if (C1767c.m7446a(i) && C1767c.m7446a(this.f5900g.f5898g.f5871i.mo7516e())) {
                    this.f5900g.f5898g.f5871i.mo7509c(C1767c.m7447b(C1767c.m7446a(i) ? -1 : -12303292, 0.9f));
                    C2477u.m9269a(this.f5900g.f5898g.mo7159g(), "accent_color");
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2226j(C2201j0 j0Var) {
            super(1);
            this.f5898g = j0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7081a((C2439g) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7081a(C2439g gVar) {
            C3370k.m12227b(gVar, "$receiver");
            C2472t.m9225a(gVar, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_colors_24dp), false, (Integer) null, (C3351c) null, 29, (Object) null);
            gVar.mo7319a("primary_color");
            gVar.mo7322a(new C2227a(this), new C2228b(this));
            C2472t.m9231b(gVar, (String) null, Integer.valueOf(C3148R.string.pref_color_primary), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.j0$k */
    static final class C2229k extends C3371l implements C3350b<C2439g, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2201j0 f5901g;

        /* renamed from: com.fb.fluid.ui.g.b.j0$k$a */
        static final class C2230a extends C3371l implements C3350b<C2472t<Integer>, Integer> {

            /* renamed from: g */
            final /* synthetic */ C2229k f5902g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2230a(C2229k kVar) {
                super(1);
                this.f5902g = kVar;
            }

            /* renamed from: a */
            public final int mo7085a(C2472t<Integer> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f5902g.f5901g.f5871i.mo7516e();
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Integer.valueOf(mo7085a((C2472t<Integer>) (C2472t) obj));
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.j0$k$b */
        static final class C2231b extends C3371l implements C3351c<C2472t<Integer>, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2229k f5903g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2231b(C2229k kVar) {
                super(2);
                this.f5903g = kVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7086a((C2472t<Integer>) (C2472t) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7086a(C2472t<Integer> tVar, int i) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f5903g.f5901g.f5871i.mo7509c(i);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2229k(C2201j0 j0Var) {
            super(1);
            this.f5901g = j0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7084a((C2439g) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7084a(C2439g gVar) {
            C3370k.m12227b(gVar, "$receiver");
            C2472t.m9225a(gVar, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.empty), false, (Integer) null, (C3351c) null, 29, (Object) null);
            gVar.mo7319a("accent_color");
            gVar.mo7322a(new C2230a(this), new C2231b(this));
            C2472t.m9231b(gVar, (String) null, Integer.valueOf(C3148R.string.pref_color_accent), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.j0$l */
    static final class C2232l extends C3371l implements C3350b<C2408a0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2201j0 f5904g;

        /* renamed from: com.fb.fluid.ui.g.b.j0$l$a */
        static final class C2233a extends C3371l implements C3350b<C2472t<Boolean>, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2232l f5905g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2233a(C2232l lVar) {
                super(1);
                this.f5905g = lVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7088a((C2472t<Boolean>) (C2472t) obj));
            }

            /* renamed from: a */
            public final boolean mo7088a(C2472t<Boolean> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f5905g.f5904g.f5871i.mo7493F();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.j0$l$b */
        static final class C2234b extends C3371l implements C3351c<C2472t<Boolean>, Boolean, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2232l f5906g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2234b(C2232l lVar) {
                super(2);
                this.f5906g = lVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7089a((C2472t<Boolean>) (C2472t) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7089a(C2472t<Boolean> tVar, boolean z) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f5906g.f5904g.f5871i.mo7544n(z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2232l(C2201j0 j0Var) {
            super(1);
            this.f5904g = j0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7087a((C2408a0) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7087a(C2408a0 a0Var) {
            C3370k.m12227b(a0Var, "$receiver");
            C2472t.m9231b(a0Var, (String) null, Integer.valueOf(C3148R.string.pref_color_outline), (C3349a) null, 5, (Object) null);
            a0Var.mo7322a(new C2233a(this), new C2234b(this));
            C2472t.m9225a(a0Var, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.empty), false, (Integer) null, (C3351c) null, 29, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.j0$m */
    static final class C2235m extends C3371l implements C3350b<C2458k, Unit> {

        /* renamed from: g */
        public static final C2235m f5907g = new C2235m();

        C2235m() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7090a((C2458k) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7090a(C2458k kVar) {
            C3370k.m12227b(kVar, "$receiver");
            C2472t.m9231b(kVar, (String) null, Integer.valueOf(C3148R.string.header_scale), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.j0$n */
    static final class C2236n extends C3371l implements C3350b<C2486x<Integer>, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2201j0 f5908g;

        /* renamed from: com.fb.fluid.ui.g.b.j0$n$a */
        static final class C2237a extends C3371l implements C3350b<C2472t<Integer>, Integer> {

            /* renamed from: g */
            final /* synthetic */ C2236n f5909g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2237a(C2236n nVar) {
                super(1);
                this.f5909g = nVar;
            }

            /* renamed from: a */
            public final int mo7092a(C2472t<Integer> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f5909g.f5908g.f5871i.mo7488A();
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Integer.valueOf(mo7092a((C2472t<Integer>) (C2472t) obj));
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.j0$n$b */
        static final class C2238b extends C3371l implements C3351c<C2472t<Integer>, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2236n f5910g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2238b(C2236n nVar) {
                super(2);
                this.f5910g = nVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7093a((C2472t<Integer>) (C2472t) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7093a(C2472t<Integer> tVar, int i) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f5910g.f5908g.f5871i.mo7529i(i);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.j0$n$c */
        static final class C2239c extends C3371l implements C3350b<C2472t<Integer>, String> {

            /* renamed from: g */
            public static final C2239c f5911g = new C2239c();

            C2239c() {
                super(1);
            }

            /* renamed from: a */
            public final String mo5146a(C2472t<Integer> tVar) {
                C3370k.m12227b(tVar, "it");
                return tVar.mo7333c() + " %";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2236n(C2201j0 j0Var) {
            super(1);
            this.f5908g = j0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7091a((C2486x<Integer>) (C2486x) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7091a(C2486x<Integer> xVar) {
            C3370k.m12227b(xVar, "$receiver");
            C2472t.m9225a(xVar, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_scale_24dp), false, (Integer) null, (C3351c) null, 29, (Object) null);
            xVar.mo7319a("scale_hoz");
            xVar.mo7322a((C3350b<? super C2472t<Integer>, ? extends Integer>) new C2237a(this), (C3351c<? super C2472t<Integer>, ? super Integer, Unit>) new C2238b(this));
            C2472t.m9231b(xVar, (String) null, Integer.valueOf(C3148R.string.pref_scale_sides), (C3349a) null, 5, (Object) null);
            C2486x<Integer> xVar2 = xVar;
            C2486x.m9294a(xVar2, new Object[0], (List) null, new C3193d(50, 150), (Boolean) null, false, false, (C3352d) null, 122, (Object) null);
            C2472t.m9228a((C2472t) xVar2, (String) null, (Integer) null, (C3350b) C2239c.f5911g, 3, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2201j0(Application application) {
        super(application);
        C3370k.m12227b(application, "app");
        this.f5873k = application;
        boolean b = C1770f.m7470b(this.f5873k);
        C1116a<Object> g = mo7159g();
        Object[] objArr = new Object[15];
        objArr[0] = new C2428c0((String) null, Integer.valueOf(C3148R.string.header_personalization), false, false, false, true, 0, (C3350b) null, 197, (C3366g) null);
        C2486x xVar = null;
        objArr[1] = new C2458k((Object) null, C2218f.f5890g, 1, (C3366g) null);
        objArr[2] = new C2471s(new C2219g(this));
        objArr[3] = new C2471s(new C2222h(this));
        objArr[4] = new C2458k((Object) null, C2225i.f5897g, 1, (C3366g) null);
        objArr[5] = new C2439g((int[]) null, (int[][]) null, new C2226j(this), 3, (C3366g) null);
        objArr[6] = new C2439g((int[]) null, (int[][]) null, new C2229k(this), 3, (C3366g) null);
        objArr[7] = new C2408a0(new C2232l(this));
        objArr[8] = new C2458k((Object) null, C2235m.f5907g, 1, (C3366g) null);
        objArr[9] = new C2486x(new C2236n(this));
        objArr[10] = new C2486x(new C2202a(this));
        objArr[11] = new C2458k((Object) null, C2206b.f5878g, 1, (C3366g) null);
        objArr[12] = new C2486x(new C2207c(this));
        objArr[13] = !b ? null : new C2408a0(new C2211d(this));
        objArr[14] = b ? new C2486x(new C2214e(this)) : xVar;
        C1116a.C1117a.m5570a(g, C3284j.m12072c(objArr), (C3351c) null, (C3351c) null, 6, (Object) null);
    }

    /* renamed from: i */
    public final Application mo7058i() {
        return this.f5873k;
    }

    /* renamed from: j */
    public final C0497t<C2068g> mo7059j() {
        return this.f5872j;
    }
}
