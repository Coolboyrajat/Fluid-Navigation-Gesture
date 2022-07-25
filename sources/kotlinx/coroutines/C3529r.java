package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.r */
public class C3529r {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f8244b = AtomicIntegerFieldUpdater.newUpdater(C3529r.class, "_handled");
    private volatile int _handled;

    /* renamed from: a */
    public final Throwable f8245a;

    public C3529r(Throwable th, boolean z) {
        C3370k.m12227b(th, "cause");
        this.f8245a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3529r(Throwable th, boolean z, int i, C3366g gVar) {
        this(th, (i & 2) != 0 ? false : z);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: a */
    public final boolean mo10312a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean mo10313b() {
        return f8244b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C3504k0.m12634a((Object) this) + '[' + this.f8245a + ']';
    }
}
