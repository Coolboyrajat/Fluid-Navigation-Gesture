package com.p131fb.fluid.p135l;

import android.app.Application;
import android.content.pm.PackageInfo;
import com.p131fb.fluid.p135l.p139p.C1776l;
import com.p131fb.fluid.p135l.p139p.C1778n;
import com.p131fb.fluid.utils.preferences.C2527h;
import kotlin.C3256e;
import kotlin.Unit;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;

/* renamed from: com.fb.fluid.l.k */
public final class C1753k {

    /* renamed from: c */
    static final /* synthetic */ C3208i[] f5072c;

    /* renamed from: a */
    private final C3256e f5073a = C3258g.m11969a(new C1754a(this));

    /* renamed from: b */
    private final Application f5074b;

    /* renamed from: com.fb.fluid.l.k$a */
    static final class C1754a extends C3371l implements C3349a<C2527h> {

        /* renamed from: g */
        final /* synthetic */ C1753k f5075g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1754a(C1753k kVar) {
            super(0);
            this.f5075g = kVar;
        }

        public final C2527h invoke() {
            return new C2527h(this.f5075g.mo6521a());
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C1753k.class), "prefs", "getPrefs()Lcom/fb/fluid/utils/preferences/SharedPrefHelper;");
        C3384y.m12259a((C3379t) uVar);
        f5072c = new C3208i[]{uVar};
    }

    public C1753k(Application application) {
        C3370k.m12227b(application, "application");
        this.f5074b = application;
    }

    /* renamed from: a */
    private final void m7416a(long j, long j2) {
    }

    /* renamed from: b */
    private final C2527h m7417b() {
        C3256e eVar = this.f5073a;
        C3208i iVar = f5072c[0];
        return (C2527h) eVar.getValue();
    }

    /* renamed from: a */
    public final Application mo6521a() {
        return this.f5074b;
    }

    /* renamed from: a */
    public final void mo6522a(C3351c<? super Long, ? super Long, Unit> cVar) {
        PackageInfo packageInfo;
        long d = m7417b().mo7512d();
        try {
            packageInfo = this.f5074b.getPackageManager().getPackageInfo(this.f5074b.getPackageName(), 0);
        } catch (Exception unused) {
            packageInfo = null;
        }
        long a = packageInfo != null ? C1778n.m7483a(packageInfo) : -1;
        try {
            m7416a(d, a);
        } catch (Exception e) {
            C1776l.m7478a("u.n.e " + e.getMessage(), (String) null, 1, (Object) null);
        }
        m7417b().mo7501a(a);
        if (cVar != null) {
            Unit a2 = cVar.mo6125a(Long.valueOf(d), Long.valueOf(a));
        }
    }
}
