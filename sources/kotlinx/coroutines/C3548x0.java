package kotlinx.coroutines;

import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.internal.C3455a;

/* renamed from: kotlinx.coroutines.x0 */
public abstract class C3548x0 extends C3556z {

    /* renamed from: f */
    private long f8260f;

    /* renamed from: g */
    private boolean f8261g;

    /* renamed from: h */
    private C3455a<C3533s0<?>> f8262h;

    /* renamed from: a */
    public static /* synthetic */ void m12791a(C3548x0 x0Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            x0Var.mo10326b(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: c */
    private final long m12792c(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: a */
    public final void mo10324a(C3533s0<?> s0Var) {
        C3370k.m12227b(s0Var, "task");
        C3455a<C3533s0<?>> aVar = this.f8262h;
        if (aVar == null) {
            aVar = new C3455a<>();
            this.f8262h = aVar;
        }
        aVar.mo10205a(s0Var);
    }

    /* renamed from: a */
    public final void mo10325a(boolean z) {
        this.f8260f -= m12792c(z);
        if (this.f8260f <= 0) {
            if (C3498j0.m12618a()) {
                if (!(this.f8260f == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.f8261g) {
                shutdown();
            }
        }
    }

    /* renamed from: b */
    public final void mo10326b(boolean z) {
        this.f8260f += m12792c(z);
        if (!z) {
            this.f8261g = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public long mo10327h() {
        C3455a<C3533s0<?>> aVar = this.f8262h;
        return (aVar == null || aVar.mo10206a()) ? Long.MAX_VALUE : 0;
    }

    /* renamed from: i */
    public final boolean mo10328i() {
        return this.f8260f >= m12792c(true);
    }

    /* renamed from: j */
    public final boolean mo10329j() {
        C3455a<C3533s0<?>> aVar = this.f8262h;
        if (aVar != null) {
            return aVar.mo10206a();
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo10330k() {
        C3533s0 b;
        C3455a<C3533s0<?>> aVar = this.f8262h;
        if (aVar == null || (b = aVar.mo10207b()) == null) {
            return false;
        }
        b.run();
        return true;
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
    }
}
