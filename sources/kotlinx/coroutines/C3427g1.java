package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.g1 */
final class C3427g1 extends C3421f {

    /* renamed from: f */
    private final C3350b<Throwable, Unit> f8081f;

    public C3427g1(C3350b<? super Throwable, Unit> bVar) {
        C3370k.m12227b(bVar, "handler");
        this.f8081f = bVar;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
        mo10144a((Throwable) obj);
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public void mo10144a(Throwable th) {
        this.f8081f.mo5146a(th);
    }

    public String toString() {
        return "InvokeOnCancel[" + C3504k0.m12634a((Object) this.f8081f) + '@' + C3504k0.m12636b(this) + ']';
    }
}
