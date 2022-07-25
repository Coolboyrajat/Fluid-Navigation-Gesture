package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.h1 */
final class C3431h1 extends C3508l1<C3499j1> {

    /* renamed from: k */
    private static final AtomicIntegerFieldUpdater f8087k = AtomicIntegerFieldUpdater.newUpdater(C3431h1.class, "_invoked");
    private volatile int _invoked = 0;

    /* renamed from: j */
    private final C3350b<Throwable, Unit> f8088j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3431h1(C3499j1 j1Var, C3350b<? super Throwable, Unit> bVar) {
        super(j1Var);
        C3370k.m12227b(j1Var, "job");
        C3370k.m12227b(bVar, "handler");
        this.f8088j = bVar;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
        mo10150b((Throwable) obj);
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public void mo10150b(Throwable th) {
        if (f8087k.compareAndSet(this, 0, 1)) {
            this.f8088j.mo5146a(th);
        }
    }

    public String toString() {
        return "InvokeOnCancelling[" + C3504k0.m12634a((Object) this) + '@' + C3504k0.m12636b(this) + ']';
    }
}
