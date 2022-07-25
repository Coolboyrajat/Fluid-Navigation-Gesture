package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import com.p131fb.fluid.p135l.C1734c;
import com.p131fb.fluid.p148ui.p149g.p152c.C2407a;
import com.p131fb.fluid.p148ui.p149g.p152c.C2408a0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2428c0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2458k;
import com.p131fb.fluid.p148ui.p149g.p152c.C2471s;
import com.p131fb.fluid.p148ui.p149g.p152c.C2472t;
import com.p131fb.fluid.utils.preferences.C2527h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p067b.p068f.C1116a;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.b.q */
public final class C2333q extends C2317o {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2527h f6028i;

    /* renamed from: j */
    private final Application f6029j;

    /* renamed from: com.fb.fluid.ui.g.b.q$a */
    static final class C2334a extends C3371l implements C3350b<C2407a, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2333q f6030g;

        /* renamed from: com.fb.fluid.ui.g.b.q$a$a */
        static final class C2335a extends C3371l implements C3350b<C2472t<List<? extends String>>, List<? extends String>> {

            /* renamed from: g */
            final /* synthetic */ C2334a f6031g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2335a(C2334a aVar) {
                super(1);
                this.f6031g = aVar;
            }

            /* renamed from: a */
            public final List<String> mo5146a(C2472t<List<String>> tVar) {
                PackageInfo packageInfo;
                C3370k.m12227b(tVar, "it");
                List<String> y = this.f6031g.f6030g.f6028i.mo7557y();
                ArrayList arrayList = new ArrayList();
                for (T next : y) {
                    boolean z = false;
                    try {
                        packageInfo = this.f6031g.f6030g.mo7173i().getPackageManager().getPackageInfo((String) next, 0);
                    } catch (Exception unused) {
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                return arrayList;
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.q$a$b */
        static final class C2336b extends C3371l implements C3351c<C2472t<List<? extends String>>, List<? extends String>, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2334a f6032g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2336b(C2334a aVar) {
                super(2);
                this.f6032g = aVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7176a((C2472t<List<String>>) (C2472t) obj, (List<String>) (List) obj2);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7176a(C2472t<List<String>> tVar, List<String> list) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                C3370k.m12227b(list, "it");
                this.f6032g.f6030g.f6028i.mo7502a(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2334a(C2333q qVar) {
            super(1);
            this.f6030g = qVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7174a((C2407a) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7174a(C2407a aVar) {
            C3370k.m12227b(aVar, "$receiver");
            aVar.mo7323a(true);
            aVar.mo7319a("pause_selected_apps");
            C2407a aVar2 = aVar;
            C2472t.m9225a(aVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_app_backlist_24px), false, (Integer) null, (C3351c) null, 29, (Object) null);
            C2472t.m9231b(aVar2, (String) null, Integer.valueOf(C3148R.string.pref_blacklist), (C3349a) null, 5, (Object) null);
            aVar.mo7322a(new C2335a(this), new C2336b(this));
            aVar.mo7232c(true);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.q$b */
    static final class C2337b extends C3371l implements C3350b<C2408a0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2333q f6033g;

        /* renamed from: com.fb.fluid.ui.g.b.q$b$a */
        static final class C2338a extends C3371l implements C3350b<C2472t<Boolean>, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2337b f6034g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2338a(C2337b bVar) {
                super(1);
                this.f6034g = bVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7178a((C2472t<Boolean>) (C2472t) obj));
            }

            /* renamed from: a */
            public final boolean mo7178a(C2472t<Boolean> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f6034g.f6033g.f6028i.mo7556x();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.q$b$b */
        static final class C2339b extends C3371l implements C3351c<C2472t<Boolean>, Boolean, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2337b f6035g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2339b(C2337b bVar) {
                super(2);
                this.f6035g = bVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7179a((C2472t<Boolean>) (C2472t) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7179a(C2472t<Boolean> tVar, boolean z) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f6035g.f6033g.f6028i.mo7533j(z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2337b(C2333q qVar) {
            super(1);
            this.f6033g = qVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7177a((C2408a0) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7177a(C2408a0 a0Var) {
            C3370k.m12227b(a0Var, "$receiver");
            a0Var.mo7323a(true);
            a0Var.mo7319a("keyguard_softkeys_mode");
            a0Var.mo7322a(new C2338a(this), new C2339b(this));
            C2472t.m9231b(a0Var, (String) null, Integer.valueOf(C3148R.string.pref_pause_in_lockscreen), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.q$c */
    static final class C2340c extends C3371l implements C3350b<C2408a0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2333q f6036g;

        /* renamed from: com.fb.fluid.ui.g.b.q$c$a */
        static final class C2341a extends C3371l implements C3350b<C2472t<Boolean>, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2340c f6037g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2341a(C2340c cVar) {
                super(1);
                this.f6037g = cVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7181a((C2472t<Boolean>) (C2472t) obj));
            }

            /* renamed from: a */
            public final boolean mo7181a(C2472t<Boolean> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f6037g.f6036g.f6028i.mo7553u();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.q$c$b */
        static final class C2342b extends C3371l implements C3351c<C2472t<Boolean>, Boolean, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2340c f6038g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2342b(C2340c cVar) {
                super(2);
                this.f6038g = cVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7182a((C2472t<Boolean>) (C2472t) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7182a(C2472t<Boolean> tVar, boolean z) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f6038g.f6036g.f6028i.mo7524g(z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2340c(C2333q qVar) {
            super(1);
            this.f6036g = qVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7180a((C2408a0) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7180a(C2408a0 a0Var) {
            C3370k.m12227b(a0Var, "$receiver");
            a0Var.mo7323a(true);
            a0Var.mo7319a("pause_immersive_landscape");
            a0Var.mo7322a(new C2341a(this), new C2342b(this));
            C2472t.m9231b(a0Var, (String) null, Integer.valueOf(C3148R.string.pref_pause_immersivemode), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.q$d */
    static final class C2343d extends C3371l implements C3350b<C2408a0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2333q f6039g;

        /* renamed from: com.fb.fluid.ui.g.b.q$d$a */
        static final class C2344a extends C3371l implements C3350b<C2472t<Boolean>, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2343d f6040g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2344a(C2343d dVar) {
                super(1);
                this.f6040g = dVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7184a((C2472t<Boolean>) (C2472t) obj));
            }

            /* renamed from: a */
            public final boolean mo7184a(C2472t<Boolean> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f6040g.f6039g.f6028i.mo7554v();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.q$d$b */
        static final class C2345b extends C3371l implements C3351c<C2472t<Boolean>, Boolean, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2343d f6041g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2345b(C2343d dVar) {
                super(2);
                this.f6041g = dVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7185a((C2472t<Boolean>) (C2472t) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7185a(C2472t<Boolean> tVar, boolean z) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f6041g.f6039g.f6028i.mo7528h(z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2343d(C2333q qVar) {
            super(1);
            this.f6039g = qVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7183a((C2408a0) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7183a(C2408a0 a0Var) {
            C3370k.m12227b(a0Var, "$receiver");
            a0Var.mo7323a(true);
            a0Var.mo7319a("pause_in_installer");
            a0Var.mo7322a(new C2344a(this), new C2345b(this));
            C2472t.m9231b(a0Var, (String) null, Integer.valueOf(C3148R.string.pref_pause_in_installer), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.q$e */
    static final class C2346e extends C3371l implements C3350b<C2408a0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2333q f6042g;

        /* renamed from: com.fb.fluid.ui.g.b.q$e$a */
        static final class C2347a extends C3371l implements C3350b<C2472t<Boolean>, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2346e f6043g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2347a(C2346e eVar) {
                super(1);
                this.f6043g = eVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7187a((C2472t<Boolean>) (C2472t) obj));
            }

            /* renamed from: a */
            public final boolean mo7187a(C2472t<Boolean> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f6043g.f6042g.f6028i.mo7555w();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.q$e$b */
        static final class C2348b extends C3371l implements C3351c<C2472t<Boolean>, Boolean, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2346e f6044g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2348b(C2346e eVar) {
                super(2);
                this.f6044g = eVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7188a((C2472t<Boolean>) (C2472t) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7188a(C2472t<Boolean> tVar, boolean z) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f6044g.f6042g.f6028i.mo7530i(z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2346e(C2333q qVar) {
            super(1);
            this.f6042g = qVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7186a((C2408a0) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7186a(C2408a0 a0Var) {
            C3370k.m12227b(a0Var, "$receiver");
            a0Var.mo7323a(true);
            a0Var.mo7319a("pause_in_permissions");
            a0Var.mo7322a(new C2347a(this), new C2348b(this));
            C2472t.m9231b(a0Var, (String) null, Integer.valueOf(C3148R.string.pref_pause_in_permission_manager), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.q$f */
    static final class C2349f extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        public static final C2349f f6045g = new C2349f();

        C2349f() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7189a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7189a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9228a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.header_pause_recommended), (C3350b) null, 5, (Object) null);
            C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_info_24px), false, (Integer) null, (C3351c) null, 29, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2333q(Application application) {
        super(application);
        C3370k.m12227b(application, "app");
        this.f6029j = application;
        Context baseContext = this.f6029j.getBaseContext();
        C3370k.m12223a((Object) baseContext, "app.baseContext");
        this.f6028i = new C2527h(baseContext);
        C1116a<Object> g = mo7159g();
        Object[] objArr = new Object[8];
        objArr[0] = new C2428c0((String) null, Integer.valueOf(C3148R.string.header_app_rules), false, false, false, true, 0, (C3350b) null, 197, (C3366g) null);
        objArr[1] = new C2407a(new C2334a(this));
        objArr[2] = new C2408a0(new C2337b(this));
        objArr[3] = new C2408a0(new C2340c(this));
        objArr[4] = new C2408a0(new C2343d(this));
        objArr[5] = !C1734c.f5038h.mo6473b() ? null : new C2408a0(new C2346e(this));
        objArr[6] = new C2458k((Object) null, (C3350b) null, 3, (C3366g) null);
        objArr[7] = new C2471s(C2349f.f6045g);
        C1116a.C1117a.m5570a(g, C3284j.m12072c(objArr), (C3351c) null, (C3351c) null, 6, (Object) null);
    }

    /* renamed from: i */
    public final Application mo7173i() {
        return this.f6029j;
    }
}
