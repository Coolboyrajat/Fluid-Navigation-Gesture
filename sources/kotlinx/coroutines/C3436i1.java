package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.i1 */
final class C3436i1 extends C3522p1<C3499j1> {

    /* renamed from: j */
    private final C3350b<Throwable, Unit> f8093j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3436i1(C3499j1 j1Var, C3350b<? super Throwable, Unit> bVar) {
        super(j1Var);
        C3370k.m12227b(j1Var, "job");
        C3370k.m12227b(bVar, "handler");
        this.f8093j = bVar;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
        mo10150b((Throwable) obj);
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public void mo10150b(Throwable th) {
        this.f8093j.mo5146a(th);
    }

    public String toString() {
        return "InvokeOnCompletion[" + C3504k0.m12634a((Object) this) + '@' + C3504k0.m12636b(this) + ']';
    }
}
