package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3551y0;

/* renamed from: kotlinx.coroutines.z0 */
public abstract class C3557z0 extends C3548x0 {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10343a(long j, C3551y0.C3553b bVar) {
        C3370k.m12227b(bVar, "delayedTask");
        if (C3498j0.m12618a()) {
            if (!(this != C3507l0.f8220l)) {
                throw new AssertionError();
            }
        }
        C3507l0.f8220l.mo10333b(j, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract Thread mo10123l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo10344m() {
        Thread l = mo10123l();
        if (Thread.currentThread() != l) {
            C3411c2 a = C3416d2.m12332a();
            if (a != null) {
                a.mo10132a(l);
            } else {
                LockSupport.unpark(l);
            }
        }
    }
}
