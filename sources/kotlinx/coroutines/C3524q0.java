package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.internal.C3484r;

/* renamed from: kotlinx.coroutines.q0 */
final class C3524q0<T> extends C3484r<T> {

    /* renamed from: j */
    private static final AtomicIntegerFieldUpdater f8235j = AtomicIntegerFieldUpdater.newUpdater(C3524q0.class, "_decision");
    private volatile int _decision = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3524q0(C3314f fVar, C3309c<? super T> cVar) {
        super(fVar, cVar);
        C3370k.m12227b(fVar, "context");
        C3370k.m12227b(cVar, "uCont");
    }

    /* renamed from: t */
    private final boolean m12681t() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f8235j.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: u */
    private final boolean m12682u() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f8235j.compareAndSet(this, 0, 1));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10254a(Object obj, int i) {
        if (!m12681t()) {
            super.mo10254a(obj, i);
        }
    }

    /* renamed from: p */
    public int mo10103p() {
        return 1;
    }

    /* renamed from: s */
    public final Object mo10291s() {
        if (m12682u()) {
            return C3326d.m12146a();
        }
        Object b = C3531r1.m12765b(mo10302j());
        if (!(b instanceof C3529r)) {
            return b;
        }
        throw ((C3529r) b).f8245a;
    }
}
