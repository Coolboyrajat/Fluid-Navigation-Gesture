package kotlinx.coroutines.p212i2;

import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3504k0;

/* renamed from: kotlinx.coroutines.i2.k */
public final class C3450k extends C3448i {

    /* renamed from: h */
    public final Runnable f8142h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3450k(Runnable runnable, long j, C3449j jVar) {
        super(j, jVar);
        C3370k.m12227b(runnable, "block");
        C3370k.m12227b(jVar, "taskContext");
        this.f8142h = runnable;
    }

    public void run() {
        try {
            this.f8142h.run();
        } finally {
            this.f8141g.mo10193g();
        }
    }

    public String toString() {
        return "Task[" + C3504k0.m12634a((Object) this.f8142h) + '@' + C3504k0.m12636b(this.f8142h) + ", " + this.f8140f + ", " + this.f8141g + ']';
    }
}
