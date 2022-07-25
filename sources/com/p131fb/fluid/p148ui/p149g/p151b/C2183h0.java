package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.C0497t;
import com.p131fb.fluid.p135l.p140q.C1785b;
import com.p131fb.fluid.p135l.p142s.C1795a;
import com.p131fb.fluid.p148ui.p149g.p150a.C2061a;
import com.p131fb.fluid.p148ui.p149g.p150a.C2062b;
import com.p131fb.fluid.p148ui.p149g.p150a.C2067f;
import com.p131fb.fluid.p148ui.p149g.p152c.C2428c0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2458k;
import com.p131fb.fluid.p148ui.p149g.p152c.C2471s;
import com.p131fb.fluid.p148ui.p149g.p152c.C2472t;
import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p067b.p068f.C1116a;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.b.h0 */
public final class C2183h0 extends C2317o {

    /* renamed from: i */
    private final Application f5852i;

    /* renamed from: com.fb.fluid.ui.g.b.h0$a */
    static final class C2184a extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        public static final C2184a f5853g = new C2184a();

        C2184a() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7036a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7036a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2472t.m9228a((C2472t) sVar, (String) null, Integer.valueOf(C3148R.string.header_permissions_required), (C3350b) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.h0$b */
    static final class C2185b extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2183h0 f5854g;

        /* renamed from: com.fb.fluid.ui.g.b.h0$b$a */
        static final class C2186a extends C3371l implements C3351c<Context, C2472t<Object>, Drawable> {

            /* renamed from: g */
            final /* synthetic */ C2185b f5855g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2186a(C2185b bVar) {
                super(2);
                this.f5855g = bVar;
            }

            /* renamed from: a */
            public final Drawable mo6125a(Context context, C2472t<Object> tVar) {
                C3370k.m12227b(context, "context");
                C3370k.m12227b(tVar, "<anonymous parameter 1>");
                return context.getDrawable(this.f5855g.f5854g.m8659k() ? C3148R.C3149drawable.ic_menu_check_circle : C3148R.C3149drawable.ic_menu_check_circle_outline);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.h0$b$b */
        static final class C2187b extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2185b f5856g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2187b(C2185b bVar) {
                super(2);
                this.f5856g = bVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7039a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7039a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                this.f5856g.f5854g.mo7160h().setValue(new C2062b(4));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2185b(C2183h0 h0Var) {
            super(1);
            this.f5854g = h0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7037a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7037a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2472t.m9231b(sVar, (String) null, Integer.valueOf(C3148R.string.perm_display_overlays), (C3349a) null, 5, (Object) null);
            C2471s sVar2 = sVar;
            C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.perm_display_overlays_sum), (C3349a) null, 5, (Object) null);
            C2472t.m9225a(sVar2, (Drawable) null, (Integer) null, true, (Integer) null, new C2186a(this), 11, (Object) null);
            sVar.mo7315a(new C2187b(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.h0$c */
    static final class C2188c extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2183h0 f5857g;

        /* renamed from: com.fb.fluid.ui.g.b.h0$c$a */
        static final class C2189a extends C3371l implements C3351c<Context, C2472t<Object>, Drawable> {

            /* renamed from: g */
            final /* synthetic */ C2188c f5858g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2189a(C2188c cVar) {
                super(2);
                this.f5858g = cVar;
            }

            /* renamed from: a */
            public final Drawable mo6125a(Context context, C2472t<Object> tVar) {
                C3370k.m12227b(context, "context");
                C3370k.m12227b(tVar, "<anonymous parameter 1>");
                return context.getDrawable(this.f5858g.f5857g.m8658j() ? C3148R.C3149drawable.ic_menu_check_circle : C3148R.C3149drawable.ic_menu_check_circle_outline);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.h0$c$b */
        static final class C2190b extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2188c f5859g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2190b(C2188c cVar) {
                super(2);
                this.f5859g = cVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7042a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7042a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                this.f5859g.f5857g.mo7160h().setValue(new C2062b(1));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2188c(C2183h0 h0Var) {
            super(1);
            this.f5857g = h0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7040a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7040a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2472t.m9231b(sVar, (String) null, Integer.valueOf(C3148R.string.perm_accessibility), (C3349a) null, 5, (Object) null);
            C2471s sVar2 = sVar;
            C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.perm_accessibility_sum), (C3349a) null, 5, (Object) null);
            C2472t.m9225a(sVar2, (Drawable) null, (Integer) null, true, (Integer) null, new C2189a(this), 11, (Object) null);
            sVar.mo7315a(new C2190b(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.h0$d */
    static final class C2191d extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2183h0 f5860g;

        /* renamed from: com.fb.fluid.ui.g.b.h0$d$a */
        static final class C2192a extends C3371l implements C3351c<Context, C2472t<Object>, Drawable> {

            /* renamed from: g */
            final /* synthetic */ C2191d f5861g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2192a(C2191d dVar) {
                super(2);
                this.f5861g = dVar;
            }

            /* renamed from: a */
            public final Drawable mo6125a(Context context, C2472t<Object> tVar) {
                C3370k.m12227b(context, "context");
                C3370k.m12227b(tVar, "<anonymous parameter 1>");
                return context.getDrawable(this.f5861g.f5860g.m8661m() ? C3148R.C3149drawable.ic_menu_check_circle : C3148R.C3149drawable.ic_menu_check_circle_outline);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.h0$d$b */
        static final class C2193b extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2191d f5862g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2193b(C2191d dVar) {
                super(2);
                this.f5862g = dVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7045a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7045a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                this.f5862g.f5860g.mo7160h().setValue(C1795a.f5111a.mo6586c(this.f5862g.f5860g.mo7035i()) ? new C2067f(C3148R.string.toast_permission_granted) : new C2061a(20));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2191d(C2183h0 h0Var) {
            super(1);
            this.f5860g = h0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7043a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7043a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2472t.m9231b(sVar, (String) null, Integer.valueOf(C3148R.string.perm_wss), (C3349a) null, 5, (Object) null);
            C2471s sVar2 = sVar;
            C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.perm_wss_sum), (C3349a) null, 5, (Object) null);
            C2472t.m9225a(sVar2, (Drawable) null, (Integer) null, true, (Integer) null, new C2192a(this), 11, (Object) null);
            sVar.mo7315a(new C2193b(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.h0$e */
    static final class C2194e extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        public static final C2194e f5863g = new C2194e();

        C2194e() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7046a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7046a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.perm_root), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.perm_root_sum), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.h0$f */
    static final class C2195f extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2183h0 f5864g;

        /* renamed from: com.fb.fluid.ui.g.b.h0$f$a */
        static final class C2196a extends C3371l implements C3351c<Context, C2472t<Object>, Drawable> {

            /* renamed from: g */
            final /* synthetic */ C2195f f5865g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2196a(C2195f fVar) {
                super(2);
                this.f5865g = fVar;
            }

            /* renamed from: a */
            public final Drawable mo6125a(Context context, C2472t<Object> tVar) {
                C3370k.m12227b(context, "context");
                C3370k.m12227b(tVar, "<anonymous parameter 1>");
                return context.getDrawable(this.f5865g.f5864g.m8660l() ? C3148R.C3149drawable.ic_menu_check_circle : C3148R.C3149drawable.ic_menu_check_circle_outline);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.h0$f$b */
        static final class C2197b extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2195f f5866g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2197b(C2195f fVar) {
                super(2);
                this.f5866g = fVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7049a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7049a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                this.f5866g.f5864g.mo7160h().setValue(new C2062b(5));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2195f(C2183h0 h0Var) {
            super(1);
            this.f5864g = h0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7047a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7047a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2472t.m9231b(sVar, (String) null, Integer.valueOf(C3148R.string.perm_phone), (C3349a) null, 5, (Object) null);
            C2471s sVar2 = sVar;
            C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.perm_phone_sum), (C3349a) null, 5, (Object) null);
            C2472t.m9225a(sVar2, (Drawable) null, (Integer) null, true, (Integer) null, new C2196a(this), 11, (Object) null);
            sVar.mo7315a(new C2197b(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2183h0(Application application, boolean z) {
        super(application);
        Application application2 = application;
        C3370k.m12227b(application2, "app");
        this.f5852i = application2;
        new C0497t();
        C1116a<Object> g = mo7159g();
        Object[] objArr = new Object[4];
        objArr[0] = new C2428c0((String) null, Integer.valueOf(C3148R.string.header_permissions), false, false, false, true, 0, (C3350b) null, 197, (C3366g) null);
        objArr[1] = !z ? new C2458k(Integer.valueOf(C3148R.string.perm_group_required), (C3350b) null, 2, (C3366g) null) : new C2471s(C2184a.f5853g);
        objArr[2] = new C2471s(new C2185b(this));
        objArr[3] = new C2471s(new C2188c(this));
        C1116a.C1117a.m5570a(g, C3284j.m12072c(objArr), (C3351c) null, (C3351c) null, 6, (Object) null);
        List b = C3284j.m12070b((T[]) new C2472t[]{new C2458k(Integer.valueOf(C3148R.string.perm_group_recommended), (C3350b) null, 2, (C3366g) null), new C2471s(new C2191d(this)), new C2458k(Integer.valueOf(C3148R.string.perm_group_optional), (C3350b) null, 2, (C3366g) null), new C2471s(C2194e.f5863g), new C2471s(new C2195f(this))});
        if (!z) {
            mo7159g().addAll(b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final boolean m8658j() {
        return C1785b.C1786a.m7502a(C1785b.f5090a, this.f5852i, (String) null, (String) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final boolean m8659k() {
        return C1795a.f5111a.mo6584a(this.f5852i);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final boolean m8660l() {
        return C1795a.f5111a.mo6585b(this.f5852i);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final boolean m8661m() {
        return C1795a.f5111a.mo6586c(this.f5852i);
    }

    /* renamed from: i */
    public final Application mo7035i() {
        return this.f5852i;
    }
}
