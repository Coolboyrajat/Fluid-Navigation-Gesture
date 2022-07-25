package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.p131fb.fluid.p148ui.p149g.p152c.C2408a0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2428c0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2472t;
import com.p131fb.fluid.utils.preferences.C2527h;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p067b.p068f.C1116a;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.b.o0 */
public final class C2318o0 extends C2317o {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2527h f6011i;

    /* renamed from: j */
    private final Application f6012j;

    /* renamed from: com.fb.fluid.ui.g.b.o0$a */
    static final class C2319a extends C3371l implements C3350b<C2408a0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2318o0 f6013g;

        /* renamed from: com.fb.fluid.ui.g.b.o0$a$a */
        static final class C2320a extends C3371l implements C3350b<C2472t<Boolean>, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2319a f6014g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2320a(C2319a aVar) {
                super(1);
                this.f6014g = aVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7162a((C2472t<Boolean>) (C2472t) obj));
            }

            /* renamed from: a */
            public final boolean mo7162a(C2472t<Boolean> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f6014g.f6013g.f6011i.mo7558z();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.o0$a$b */
        static final class C2321b extends C3371l implements C3351c<C2472t<Boolean>, Boolean, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2319a f6015g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2321b(C2319a aVar) {
                super(2);
                this.f6015g = aVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7163a((C2472t<Boolean>) (C2472t) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7163a(C2472t<Boolean> tVar, boolean z) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f6015g.f6013g.f6011i.mo7537k(z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2319a(C2318o0 o0Var) {
            super(1);
            this.f6013g = o0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7161a((C2408a0) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7161a(C2408a0 a0Var) {
            C3370k.m12227b(a0Var, "$receiver");
            a0Var.mo7319a("rotate_actions");
            a0Var.mo7322a(new C2320a(this), new C2321b(this));
            C2408a0 a0Var2 = a0Var;
            C2472t.m9225a(a0Var2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_rotate_triggers), false, (Integer) null, (C3351c) null, 29, (Object) null);
            C2472t.m9231b(a0Var2, (String) null, Integer.valueOf(C3148R.string.pref_rotate_triggers), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.o0$b */
    static final class C2322b extends C3371l implements C3350b<C2408a0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2318o0 f6016g;

        /* renamed from: com.fb.fluid.ui.g.b.o0$b$a */
        static final class C2323a extends C3371l implements C3350b<C2472t<Boolean>, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2322b f6017g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2323a(C2322b bVar) {
                super(1);
                this.f6017g = bVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7165a((C2472t<Boolean>) (C2472t) obj));
            }

            /* renamed from: a */
            public final boolean mo7165a(C2472t<Boolean> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f6017g.f6016g.f6011i.mo7550r();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.o0$b$b */
        static final class C2324b extends C3371l implements C3351c<C2472t<Boolean>, Boolean, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2322b f6018g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2324b(C2322b bVar) {
                super(2);
                this.f6018g = bVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7166a((C2472t<Boolean>) (C2472t) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7166a(C2472t<Boolean> tVar, boolean z) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f6018g.f6016g.f6011i.mo7522f(z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2322b(C2318o0 o0Var) {
            super(1);
            this.f6016g = o0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7164a((C2408a0) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7164a(C2408a0 a0Var) {
            C3370k.m12227b(a0Var, "$receiver");
            a0Var.mo7319a("side_triggers_away_from_keyboard");
            a0Var.mo7322a(new C2323a(this), new C2324b(this));
            C2408a0 a0Var2 = a0Var;
            C2472t.m9225a(a0Var2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_keyboard_24px), false, (Integer) null, (C3351c) null, 29, (Object) null);
            C2472t.m9231b(a0Var2, (String) null, Integer.valueOf(C3148R.string.pref_move_side_triggers_from_keyboard), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.o0$c */
    static final class C2325c extends C3371l implements C3350b<C2408a0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2318o0 f6019g;

        /* renamed from: com.fb.fluid.ui.g.b.o0$c$a */
        static final class C2326a extends C3371l implements C3350b<C2472t<Boolean>, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2325c f6020g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2326a(C2325c cVar) {
                super(1);
                this.f6020g = cVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7168a((C2472t<Boolean>) (C2472t) obj));
            }

            /* renamed from: a */
            public final boolean mo7168a(C2472t<Boolean> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f6020g.f6019g.f6011i.mo7525g();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.o0$c$b */
        static final class C2327b extends C3371l implements C3351c<C2472t<Boolean>, Boolean, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2325c f6021g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2327b(C2325c cVar) {
                super(2);
                this.f6021g = cVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7169a((C2472t<Boolean>) (C2472t) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7169a(C2472t<Boolean> tVar, boolean z) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f6021g.f6019g.f6011i.mo7503a(z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2325c(C2318o0 o0Var) {
            super(1);
            this.f6019g = o0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7167a((C2408a0) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7167a(C2408a0 a0Var) {
            C3370k.m12227b(a0Var, "$receiver");
            a0Var.mo7319a("swipe_exit_immersive");
            a0Var.mo7322a(new C2326a(this), new C2327b(this));
            C2408a0 a0Var2 = a0Var;
            C2472t.m9225a(a0Var2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_fullscreen), false, (Integer) null, (C3351c) null, 29, (Object) null);
            C2472t.m9231b(a0Var2, (String) null, Integer.valueOf(C3148R.string.pref_swipe_to_exit_immersive), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) a0Var2, (String) null, Integer.valueOf(C3148R.string.pref_swipe_to_exit_immersive_sum), (C3349a) null, 5, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2318o0(Application application) {
        super(application);
        C3370k.m12227b(application, "app");
        this.f6012j = application;
        Context baseContext = this.f6012j.getBaseContext();
        C3370k.m12223a((Object) baseContext, "app.baseContext");
        this.f6011i = new C2527h(baseContext);
        C1116a.C1117a.m5570a(mo7159g(), C3284j.m12070b((T[]) new Object[]{new C2428c0((String) null, Integer.valueOf(C3148R.string.header_triggers), false, false, false, true, 0, (C3350b) null, 197, (C3366g) null), new C2408a0(new C2319a(this)), new C2408a0(new C2322b(this)), new C2408a0(new C2325c(this))}), (C3351c) null, (C3351c) null, 6, (Object) null);
    }
}
