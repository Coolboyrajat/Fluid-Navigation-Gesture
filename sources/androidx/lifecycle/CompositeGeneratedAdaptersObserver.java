package androidx.lifecycle;

import androidx.lifecycle.C0481i;

class CompositeGeneratedAdaptersObserver implements C0488m {

    /* renamed from: f */
    private final C0478f[] f2010f;

    CompositeGeneratedAdaptersObserver(C0478f[] fVarArr) {
        this.f2010f = fVarArr;
    }

    /* renamed from: a */
    public void mo14a(C0490o oVar, C0481i.C0482a aVar) {
        C0496s sVar = new C0496s();
        for (C0478f a : this.f2010f) {
            a.mo2699a(oVar, aVar, false, sVar);
        }
        for (C0478f a2 : this.f2010f) {
            a2.mo2699a(oVar, aVar, true, sVar);
        }
    }
}
