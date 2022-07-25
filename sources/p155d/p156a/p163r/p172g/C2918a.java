package p155d.p156a.p163r.p172g;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p165b.C2836a;
import p155d.p156a.p177v.C2963a;

/* renamed from: d.a.r.g.a */
abstract class C2918a extends AtomicReference<Future<?>> implements C2810b, C2963a {

    /* renamed from: h */
    protected static final FutureTask<Void> f7594h = new FutureTask<>(C2836a.f7420b, (Object) null);

    /* renamed from: i */
    protected static final FutureTask<Void> f7595i = new FutureTask<>(C2836a.f7420b, (Object) null);

    /* renamed from: f */
    protected final Runnable f7596f;

    /* renamed from: g */
    protected Thread f7597g;

    C2918a(Runnable runnable) {
        this.f7596f = runnable;
    }

    /* renamed from: a */
    public final void mo6027a() {
        FutureTask<Void> futureTask;
        Future future = (Future) get();
        if (future != f7594h && future != (futureTask = f7595i) && compareAndSet(future, futureTask) && future != null) {
            future.cancel(this.f7597g != Thread.currentThread());
        }
    }

    /* renamed from: a */
    public final void mo9016a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != f7594h) {
                if (future2 == f7595i) {
                    future.cancel(this.f7597g != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    /* renamed from: b */
    public final boolean mo6028b() {
        Future future = (Future) get();
        return future == f7594h || future == f7595i;
    }
}
