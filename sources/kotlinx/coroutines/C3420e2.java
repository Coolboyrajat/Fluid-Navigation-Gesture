package kotlinx.coroutines;

import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.e2 */
public final class C3420e2 extends C3556z {

    /* renamed from: f */
    public static final C3420e2 f8077f = new C3420e2();

    private C3420e2() {
    }

    /* renamed from: a */
    public void mo10112a(C3314f fVar, Runnable runnable) {
        C3370k.m12227b(fVar, "context");
        C3370k.m12227b(runnable, "block");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public boolean mo10113b(C3314f fVar) {
        C3370k.m12227b(fVar, "context");
        return false;
    }

    public String toString() {
        return "Unconfined";
    }
}
