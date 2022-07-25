package androidx.lifecycle;

import androidx.lifecycle.C0481i;
import java.util.concurrent.CancellationException;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;

public final class LifecycleCoroutineScopeImpl extends C0485k implements C0488m {

    /* renamed from: f */
    private final C0481i f2016f;

    /* renamed from: g */
    private final C3314f f2017g;

    /* renamed from: a */
    public C0481i mo2648a() {
        return this.f2016f;
    }

    /* renamed from: a */
    public void mo14a(C0490o oVar, C0481i.C0482a aVar) {
        C3370k.m12227b(oVar, "source");
        C3370k.m12227b(aVar, "event");
        if (mo2648a().mo2700a().compareTo(C0481i.C0483b.DESTROYED) <= 0) {
            mo2648a().mo2702b(this);
            C3517o1.m12665a(mo2649f(), (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: f */
    public C3314f mo2649f() {
        return this.f2017g;
    }
}
