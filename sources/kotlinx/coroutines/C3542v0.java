package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.v0 */
final class C3542v0 extends C3421f {

    /* renamed from: f */
    private final C3539u0 f8257f;

    public C3542v0(C3539u0 u0Var) {
        C3370k.m12227b(u0Var, "handle");
        this.f8257f = u0Var;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
        mo10144a((Throwable) obj);
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public void mo10144a(Throwable th) {
        this.f8257f.mo10290a();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f8257f + ']';
    }
}
