package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.l */
public final class C3506l extends C3508l1<C3499j1> {

    /* renamed from: j */
    public final C3434i<?> f8218j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3506l(C3499j1 j1Var, C3434i<?> iVar) {
        super(j1Var);
        C3370k.m12227b(j1Var, "parent");
        C3370k.m12227b(iVar, "child");
        this.f8218j = iVar;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
        mo10150b((Throwable) obj);
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public void mo10150b(Throwable th) {
        C3434i<?> iVar = this.f8218j;
        iVar.mo10154a(iVar.mo10152a((C3499j1) this.f8234i));
    }

    public String toString() {
        return "ChildContinuation[" + this.f8218j + ']';
    }
}
