package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C0481i;

/* renamed from: androidx.savedstate.a */
public final class C0628a {

    /* renamed from: a */
    private final C0629b f2512a;

    /* renamed from: b */
    private final SavedStateRegistry f2513b = new SavedStateRegistry();

    private C0628a(C0629b bVar) {
        this.f2512a = bVar;
    }

    /* renamed from: a */
    public static C0628a m3541a(C0629b bVar) {
        return new C0628a(bVar);
    }

    /* renamed from: a */
    public SavedStateRegistry mo3633a() {
        return this.f2513b;
    }

    /* renamed from: a */
    public void mo3634a(Bundle bundle) {
        C0481i a = this.f2512a.mo5a();
        if (a.mo2700a() == C0481i.C0483b.INITIALIZED) {
            a.mo2701a(new Recreator(this.f2512a));
            this.f2513b.mo3630a(a, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: b */
    public void mo3635b(Bundle bundle) {
        this.f2513b.mo3629a(bundle);
    }
}
