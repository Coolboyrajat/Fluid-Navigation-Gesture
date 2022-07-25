package kotlinx.coroutines.p212i2;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3410c1;

/* renamed from: kotlinx.coroutines.i2.f */
final class C3445f extends C3410c1 implements C3449j, Executor {

    /* renamed from: j */
    private static final AtomicIntegerFieldUpdater f8132j = AtomicIntegerFieldUpdater.newUpdater(C3445f.class, "inFlightTasks");

    /* renamed from: f */
    private final ConcurrentLinkedQueue<Runnable> f8133f = new ConcurrentLinkedQueue<>();

    /* renamed from: g */
    private final C3443d f8134g;

    /* renamed from: h */
    private final int f8135h;

    /* renamed from: i */
    private final C3451l f8136i;
    private volatile int inFlightTasks = 0;

    public C3445f(C3443d dVar, int i, C3451l lVar) {
        C3370k.m12227b(dVar, "dispatcher");
        C3370k.m12227b(lVar, "taskMode");
        this.f8134g = dVar;
        this.f8135h = i;
        this.f8136i = lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0010  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m12446a(java.lang.Runnable r3, boolean r4) {
        /*
            r2 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f8132j
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.f8135h
            if (r0 > r1) goto L_0x0010
            kotlinx.coroutines.i2.d r0 = r2.f8134g
            r0.mo10188a(r3, r2, r4)
            return
        L_0x0010:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r2.f8133f
            r0.add(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = f8132j
            int r3 = r3.decrementAndGet(r2)
            int r0 = r2.f8135h
            if (r3 < r0) goto L_0x0020
            return
        L_0x0020:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r3 = r2.f8133f
            java.lang.Object r3 = r3.poll()
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            if (r3 == 0) goto L_0x002b
            goto L_0x0000
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p212i2.C3445f.m12446a(java.lang.Runnable, boolean):void");
    }

    /* renamed from: a */
    public void mo10112a(C3314f fVar, Runnable runnable) {
        C3370k.m12227b(fVar, "context");
        C3370k.m12227b(runnable, "block");
        m12446a(runnable, false);
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(Runnable runnable) {
        C3370k.m12227b(runnable, "command");
        m12446a(runnable, false);
    }

    /* renamed from: f */
    public C3451l mo10192f() {
        return this.f8136i;
    }

    /* renamed from: g */
    public void mo10193g() {
        Runnable poll = this.f8133f.poll();
        if (poll != null) {
            this.f8134g.mo10188a(poll, this, true);
            return;
        }
        f8132j.decrementAndGet(this);
        Runnable poll2 = this.f8133f.poll();
        if (poll2 != null) {
            m12446a(poll2, true);
        }
    }

    public String toString() {
        return super.toString() + "[dispatcher = " + this.f8134g + ']';
    }
}
