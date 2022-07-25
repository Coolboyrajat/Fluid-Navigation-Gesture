package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.m1 */
public class C3511m1 extends C3525q1 implements C3523q {

    /* renamed from: g */
    private final boolean f8222g = m12648p();

    public C3511m1(C3499j1 j1Var) {
        super(true);
        mo10293a(j1Var);
    }

    /* renamed from: p */
    private final boolean m12648p() {
        C3525q1 q1Var;
        C3509m mVar = this.parentHandle;
        if (!(mVar instanceof C3512n)) {
            mVar = null;
        }
        C3512n nVar = (C3512n) mVar;
        if (!(nVar == null || (q1Var = (C3525q1) nVar.f8234i) == null)) {
            while (!q1Var.mo10282h()) {
                C3509m mVar2 = q1Var.parentHandle;
                if (!(mVar2 instanceof C3512n)) {
                    mVar2 = null;
                }
                C3512n nVar2 = (C3512n) mVar2;
                if (nVar2 != null) {
                    q1Var = (C3525q1) nVar2.f8234i;
                    if (q1Var == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo10282h() {
        return this.f8222g;
    }

    /* renamed from: i */
    public boolean mo10283i() {
        return true;
    }
}
