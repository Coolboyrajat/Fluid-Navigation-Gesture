package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.n */
public final class C3512n extends C3508l1<C3525q1> implements C3509m {

    /* renamed from: j */
    public final C3515o f8223j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3512n(C3525q1 q1Var, C3515o oVar) {
        super(q1Var);
        C3370k.m12227b(q1Var, "parent");
        C3370k.m12227b(oVar, "childJob");
        this.f8223j = oVar;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
        mo10150b((Throwable) obj);
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public boolean mo10281a(Throwable th) {
        C3370k.m12227b(th, "cause");
        return ((C3525q1) this.f8234i).mo10298b(th);
    }

    /* renamed from: b */
    public void mo10150b(Throwable th) {
        this.f8223j.mo10284a((C3549x1) this.f8234i);
    }

    public String toString() {
        return "ChildHandle[" + this.f8223j + ']';
    }
}
