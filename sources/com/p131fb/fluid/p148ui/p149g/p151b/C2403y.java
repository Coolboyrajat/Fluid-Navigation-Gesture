package com.p131fb.fluid.p148ui.p149g.p151b;

import android.view.View;
import androidx.lifecycle.C0472b0;
import androidx.lifecycle.C0508z;
import java.util.HashMap;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.ui.g.b.y */
public final class C2403y extends C2240k {

    /* renamed from: e0 */
    private HashMap f6109e0;

    /* renamed from: C0 */
    public void mo2351C0() {
        HashMap hashMap = this.f6109e0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: E0 */
    public C2404z m9083E0() {
        C0508z a = C0472b0.m2420b(this).mo2674a(C2404z.class);
        C3370k.m12223a((Object) a, "ViewModelProviders.of(th…t(LicensesVM::class.java)");
        return (C2404z) a;
    }

    /* renamed from: e */
    public View mo6945e(int i) {
        if (this.f6109e0 == null) {
            this.f6109e0 = new HashMap();
        }
        View view = (View) this.f6109e0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View T = mo2213T();
        if (T == null) {
            return null;
        }
        View findViewById = T.findViewById(i);
        this.f6109e0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo2279h0() {
        super.mo2279h0();
        mo2351C0();
    }
}
