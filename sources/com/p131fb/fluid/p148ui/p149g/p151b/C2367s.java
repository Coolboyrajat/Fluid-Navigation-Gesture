package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Application;
import com.p131fb.fluid.p148ui.p149g.p152c.C2408a0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2428c0;
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
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.b.s */
public final class C2367s extends C2317o {

    /* renamed from: k */
    static final /* synthetic */ C3208i[] f6067k;

    /* renamed from: i */
    private final C3256e f6068i = C3258g.m11969a(new C2371b(this));

    /* renamed from: j */
    private final Application f6069j;

    /* renamed from: com.fb.fluid.ui.g.b.s$a */
    static final class C2368a extends C3371l implements C3350b<C2408a0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2367s f6070g;

        /* renamed from: com.fb.fluid.ui.g.b.s$a$a */
        static final class C2369a extends C3371l implements C3350b<C2472t<Boolean>, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2368a f6071g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2369a(C2368a aVar) {
                super(1);
                this.f6071g = aVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7206a((C2472t<Boolean>) (C2472t) obj));
            }

            /* renamed from: a */
            public final boolean mo7206a(C2472t<Boolean> tVar) {
                C3370k.m12227b(tVar, "it");
                return this.f6071g.f6070g.m9015j().mo7534j();
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.s$a$b */
        static final class C2370b extends C3371l implements C3351c<C2472t<Boolean>, Boolean, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2368a f6072g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2370b(C2368a aVar) {
                super(2);
                this.f6072g = aVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7207a((C2472t<Boolean>) (C2472t) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7207a(C2472t<Boolean> tVar, boolean z) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f6072g.f6070g.m9015j().mo7511c(z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2368a(C2367s sVar) {
            super(1);
            this.f6070g = sVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7205a((C2408a0) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7205a(C2408a0 a0Var) {
            C3370k.m12227b(a0Var, "$receiver");
            C2472t.m9231b(a0Var, (String) null, Integer.valueOf(C3148R.string.pref_debug_triggers), (C3349a) null, 5, (Object) null);
            a0Var.mo7322a(new C2369a(this), new C2370b(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.s$b */
    static final class C2371b extends C3371l implements C3349a<C2527h> {

        /* renamed from: g */
        final /* synthetic */ C2367s f6073g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2371b(C2367s sVar) {
            super(0);
            this.f6073g = sVar;
        }

        public final C2527h invoke() {
            return new C2527h(this.f6073g.mo7204i());
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C2367s.class), "preferences", "getPreferences()Lcom/fb/fluid/utils/preferences/SharedPrefHelper;");
        C3384y.m12259a((C3379t) uVar);
        f6067k = new C3208i[]{uVar};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2367s(Application application) {
        super(application);
        C3370k.m12227b(application, "app");
        this.f6069j = application;
        C1116a.C1117a.m5570a(mo7159g(), C3284j.m12072c(new C2428c0((String) null, (Integer) null, false, false, false, true, 0, (C3350b) null, 199, (C3366g) null), new C2408a0(new C2368a(this))), (C3351c) null, (C3351c) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final C2527h m9015j() {
        C3256e eVar = this.f6068i;
        C3208i iVar = f6067k[0];
        return (C2527h) eVar.getValue();
    }

    /* renamed from: i */
    public final Application mo7204i() {
        return this.f6069j;
    }
}
