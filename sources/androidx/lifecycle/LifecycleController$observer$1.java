package androidx.lifecycle;

import androidx.lifecycle.C0481i;
import java.util.concurrent.CancellationException;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3499j1;

final class LifecycleController$observer$1 implements C0488m {

    /* renamed from: f */
    final /* synthetic */ C0484j f2014f;

    /* renamed from: g */
    final /* synthetic */ C3499j1 f2015g;

    /* renamed from: a */
    public final void mo14a(C0490o oVar, C0481i.C0482a aVar) {
        C3370k.m12227b(oVar, "source");
        C3370k.m12227b(aVar, "<anonymous parameter 1>");
        C0481i a = oVar.mo5a();
        C3370k.m12223a((Object) a, "source.lifecycle");
        if (a.mo2700a() != C0481i.C0483b.DESTROYED) {
            C0481i a2 = oVar.mo5a();
            C3370k.m12223a((Object) a2, "source.lifecycle");
            if (a2.mo2700a().compareTo(this.f2014f.f2047a) < 0) {
                this.f2014f.f2048b.mo2683a();
                throw null;
            } else {
                this.f2014f.f2048b.mo2684b();
                throw null;
            }
        } else {
            C0484j jVar = this.f2014f;
            C3499j1.C3500a.m12631a(this.f2015g, (CancellationException) null, 1, (Object) null);
            jVar.mo2704a();
            throw null;
        }
    }
}
