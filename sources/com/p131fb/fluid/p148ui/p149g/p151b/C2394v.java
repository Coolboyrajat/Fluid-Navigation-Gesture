package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0401d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0464a0;
import androidx.lifecycle.C0472b0;
import androidx.lifecycle.C0498u;
import androidx.lifecycle.C0508z;
import com.p131fb.fluid.C1718g;
import com.p131fb.fluid.p135l.p139p.C1770f;
import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;
import java.util.HashMap;
import kotlin.C3256e;
import kotlin.Unit;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;

/* renamed from: com.fb.fluid.ui.g.b.v */
public final class C2394v extends C2240k {

    /* renamed from: g0 */
    static final /* synthetic */ C3208i[] f6097g0;

    /* renamed from: e0 */
    private final C3256e f6098e0 = C3258g.m11969a(new C2397b(this));

    /* renamed from: f0 */
    private HashMap f6099f0;

    /* renamed from: com.fb.fluid.ui.g.b.v$a */
    static final class C2395a<T> implements C0498u<C2068g> {

        /* renamed from: a */
        final /* synthetic */ C2394v f6100a;

        /* renamed from: com.fb.fluid.ui.g.b.v$a$a */
        static final class C2396a extends C3371l implements C3349a<Unit> {

            /* renamed from: g */
            final /* synthetic */ C2395a f6101g;

            /* renamed from: h */
            final /* synthetic */ C2068g f6102h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2396a(C2395a aVar, C2068g gVar) {
                super(0);
                this.f6101g = aVar;
                this.f6102h = gVar;
            }

            public final void invoke() {
            }
        }

        C2395a(C2394v vVar) {
            this.f6100a = vVar;
        }

        /* renamed from: a */
        public final void mo2154a(C2068g gVar) {
            gVar.mo6943a(new C2396a(this, gVar));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.v$b */
    static final class C2397b extends C3371l implements C3349a<Integer> {

        /* renamed from: g */
        final /* synthetic */ C2394v f6103g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2397b(C2394v vVar) {
            super(0);
            this.f6103g = vVar;
        }

        public final int invoke() {
            Bundle z = this.f6103g.mo2314z();
            if (z != null) {
                return z.getInt("page");
            }
            return -1;
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C2394v.class), "page", "getPage()I");
        C3384y.m12259a((C3379t) uVar);
        f6097g0 = new C3208i[]{uVar};
    }

    /* renamed from: F0 */
    private final int m9066F0() {
        C3256e eVar = this.f6098e0;
        C3208i iVar = f6097g0[0];
        return ((Number) eVar.getValue()).intValue();
    }

    /* renamed from: C0 */
    public void mo2351C0() {
        HashMap hashMap = this.f6099f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: E0 */
    public C2398w m9069E0() {
        C0401d x0 = mo2311x0();
        C3370k.m12223a((Object) x0, "requireActivity()");
        Application application = x0.getApplication();
        C3370k.m12223a((Object) application, "requireActivity().application");
        C0508z a = C0472b0.m2417a((Fragment) this, (C0464a0.C0466b) new C2402x(application, m9066F0())).mo2674a(C2398w.class);
        C3370k.m12223a((Object) a, "ViewModelProviders.of(th….get(IntroVM::class.java)");
        return (C2398w) a;
    }

    /* renamed from: b */
    public void mo2248b(Bundle bundle) {
        super.mo2248b(bundle);
        Context y0 = mo2313y0();
        C3370k.m12223a((Object) y0, "requireContext()");
        ((ConstraintLayout) mo6945e(C1718g.layout_root)).setBackgroundColor(C1770f.m7461a(y0, 16842801));
        mo6944E0().mo7227i().observe(this, new C2395a(this));
    }

    /* renamed from: e */
    public View mo6945e(int i) {
        if (this.f6099f0 == null) {
            this.f6099f0 = new HashMap();
        }
        View view = (View) this.f6099f0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View T = mo2213T();
        if (T == null) {
            return null;
        }
        View findViewById = T.findViewById(i);
        this.f6099f0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo2279h0() {
        super.mo2279h0();
        mo2351C0();
    }
}
