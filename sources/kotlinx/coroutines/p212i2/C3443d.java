package kotlinx.coroutines.p212i2;

import java.util.concurrent.RejectedExecutionException;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3410c1;
import kotlinx.coroutines.C3507l0;
import kotlinx.coroutines.C3556z;

/* renamed from: kotlinx.coroutines.i2.d */
public class C3443d extends C3410c1 {

    /* renamed from: f */
    private C3437a f8127f;

    /* renamed from: g */
    private final int f8128g;

    /* renamed from: h */
    private final int f8129h;

    /* renamed from: i */
    private final long f8130i;

    /* renamed from: j */
    private final String f8131j;

    public C3443d(int i, int i2, long j, String str) {
        C3370k.m12227b(str, "schedulerName");
        this.f8128g = i;
        this.f8129h = i2;
        this.f8130i = j;
        this.f8131j = str;
        this.f8127f = mo10186h();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3443d(int i, int i2, String str) {
        this(i, i2, C3452m.f8150e, str);
        C3370k.m12227b(str, "schedulerName");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3443d(int i, int i2, String str, int i3, C3366g gVar) {
        this((i3 & 1) != 0 ? C3452m.f8148c : i, (i3 & 2) != 0 ? C3452m.f8149d : i2, (i3 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    /* renamed from: h */
    private final C3437a mo10186h() {
        return new C3437a(this.f8128g, this.f8129h, this.f8130i, this.f8131j);
    }

    /* renamed from: a */
    public final C3556z mo10187a(int i) {
        if (i > 0) {
            return new C3445f(this, i, C3451l.PROBABLY_BLOCKING);
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i).toString());
    }

    /* renamed from: a */
    public final void mo10188a(Runnable runnable, C3449j jVar, boolean z) {
        C3370k.m12227b(runnable, "block");
        C3370k.m12227b(jVar, "context");
        try {
            this.f8127f.mo10165a(runnable, jVar, z);
        } catch (RejectedExecutionException unused) {
            C3507l0.f8220l.mo10332a((Runnable) this.f8127f.mo10163a(runnable, jVar));
        }
    }

    /* renamed from: a */
    public void mo10112a(C3314f fVar, Runnable runnable) {
        C3370k.m12227b(fVar, "context");
        C3370k.m12227b(runnable, "block");
        try {
            C3437a.m12388a(this.f8127f, runnable, (C3449j) null, false, 6, (Object) null);
        } catch (RejectedExecutionException unused) {
            C3507l0.f8220l.mo10112a(fVar, runnable);
        }
    }
}
