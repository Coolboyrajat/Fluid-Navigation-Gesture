package org.kodein.p214di.android.p215x;

import androidx.lifecycle.C0481i;
import androidx.lifecycle.C0489n;
import androidx.lifecycle.C0490o;
import androidx.lifecycle.C0499v;
import p179e.p184b.p185a.p187l0.C3047s;

/* renamed from: org.kodein.di.android.x.AndroidLifecycleScope$getRegistry$$inlined$synchronizedIfNull$lambda$1 */
public final class C3567xabb9e8bf implements C0489n {

    /* renamed from: f */
    final /* synthetic */ C3047s f8278f;

    /* renamed from: g */
    final /* synthetic */ AndroidLifecycleScope f8279g;

    /* renamed from: h */
    final /* synthetic */ C0490o f8280h;

    C3567xabb9e8bf(C3047s sVar, AndroidLifecycleScope androidLifecycleScope, C0490o oVar) {
        this.f8278f = sVar;
        this.f8279g = androidLifecycleScope;
        this.f8280h = oVar;
    }

    @C0499v(C0481i.C0482a.ON_DESTROY)
    public final void onDestroy() {
        this.f8280h.mo5a().mo2702b(this);
        this.f8278f.mo9160a();
        this.f8279g.f8275a.remove(this.f8280h);
    }
}
