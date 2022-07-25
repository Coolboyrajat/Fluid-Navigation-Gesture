package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C0401d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0464a0;
import androidx.lifecycle.C0472b0;
import androidx.lifecycle.C0508z;
import com.p131fb.fluid.p135l.p140q.C1785b;
import com.p131fb.fluid.p135l.p142s.C1795a;
import java.util.HashMap;
import kotlin.C3256e;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;

/* renamed from: com.fb.fluid.ui.g.b.g0 */
public final class C2169g0 extends C2240k {

    /* renamed from: g0 */
    static final /* synthetic */ C3208i[] f5833g0;

    /* renamed from: h0 */
    public static final C2170a f5834h0 = new C2170a((C3366g) null);

    /* renamed from: e0 */
    private final C3256e f5835e0 = C3258g.m11969a(new C2171b(this));

    /* renamed from: f0 */
    private HashMap f5836f0;

    /* renamed from: com.fb.fluid.ui.g.b.g0$a */
    public static final class C2170a {
        private C2170a() {
        }

        public /* synthetic */ C2170a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2169g0 mo7024a(Bundle bundle) {
            C2169g0 g0Var = new C2169g0();
            g0Var.mo2290m(bundle);
            return g0Var;
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.g0$b */
    static final class C2171b extends C3371l implements C3349a<Integer> {

        /* renamed from: g */
        final /* synthetic */ C2169g0 f5837g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2171b(C2169g0 g0Var) {
            super(0);
            this.f5837g = g0Var;
        }

        public final int invoke() {
            Bundle z = this.f5837g.mo2314z();
            if (z != null) {
                return z.getInt("page");
            }
            return -1;
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C2169g0.class), "page", "getPage()I");
        C3384y.m12259a((C3379t) uVar);
        f5833g0 = new C3208i[]{uVar};
    }

    /* renamed from: F0 */
    private final int m8621F0() {
        C3256e eVar = this.f5835e0;
        C3208i iVar = f5833g0[0];
        return ((Number) eVar.getValue()).intValue();
    }

    /* renamed from: G0 */
    private final boolean m8622G0() {
        C1785b.C1786a aVar = C1785b.f5090a;
        Context y0 = mo2313y0();
        C3370k.m12223a((Object) y0, "requireContext()");
        return C1785b.C1786a.m7502a(aVar, y0, (String) null, (String) null, 6, (Object) null);
    }

    /* renamed from: H0 */
    private final boolean m8623H0() {
        C1795a.C1796a aVar = C1795a.f5111a;
        Context y0 = mo2313y0();
        C3370k.m12223a((Object) y0, "requireContext()");
        return aVar.mo6584a(y0);
    }

    /* renamed from: C0 */
    public void mo2351C0() {
        HashMap hashMap = this.f5836f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: E0 */
    public C2183h0 m8626E0() {
        C0401d x0 = mo2311x0();
        C3370k.m12223a((Object) x0, "requireActivity()");
        Application application = x0.getApplication();
        C3370k.m12223a((Object) application, "requireActivity().application");
        C0508z a = C0472b0.m2417a((Fragment) this, (C0464a0.C0466b) new C2199i0(application, m8621F0() == 19)).mo2674a(C2183h0.class);
        C3370k.m12223a((Object) a, "ViewModelProviders.of(th…ermissionsVM::class.java)");
        return (C2183h0) a;
    }

    /* renamed from: e */
    public View mo6945e(int i) {
        if (this.f5836f0 == null) {
            this.f5836f0 = new HashMap();
        }
        View view = (View) this.f5836f0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View T = mo2213T();
        if (T == null) {
            return null;
        }
        View findViewById = T.findViewById(i);
        this.f5836f0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo2279h0() {
        super.mo2279h0();
        mo2351C0();
    }

    /* renamed from: l0 */
    public void mo2289l0() {
        super.mo2289l0();
        if (m8621F0() != 19 || !m8622G0() || !m8623H0()) {
            m8626E0().mo7159g().mo5205c();
        } else {
            mo2311x0().finish();
        }
    }
}
