package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.o1 */
final /* synthetic */ class C3517o1 {
    /* renamed from: a */
    public static final C3523q m12662a(C3499j1 j1Var) {
        return new C3511m1(j1Var);
    }

    /* renamed from: a */
    public static /* synthetic */ C3523q m12663a(C3499j1 j1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j1Var = null;
        }
        return C3514n1.m12655a(j1Var);
    }

    /* renamed from: a */
    public static final void m12664a(C3314f fVar, CancellationException cancellationException) {
        C3370k.m12227b(fVar, "$this$cancel");
        C3499j1 j1Var = (C3499j1) fVar.get(C3499j1.f8214d);
        if (j1Var != null) {
            j1Var.mo10271a(cancellationException);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m12665a(C3314f fVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C3514n1.m12657a(fVar, cancellationException);
    }
}
