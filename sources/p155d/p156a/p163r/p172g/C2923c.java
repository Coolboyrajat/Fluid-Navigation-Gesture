package p155d.p156a.p163r.p172g;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p165b.C2836a;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.r.g.c */
final class C2923c implements Callable<Void>, C2810b {

    /* renamed from: k */
    static final FutureTask<Void> f7612k = new FutureTask<>(C2836a.f7420b, (Object) null);

    /* renamed from: f */
    final Runnable f7613f;

    /* renamed from: g */
    final AtomicReference<Future<?>> f7614g = new AtomicReference<>();

    /* renamed from: h */
    final AtomicReference<Future<?>> f7615h = new AtomicReference<>();

    /* renamed from: i */
    final ExecutorService f7616i;

    /* renamed from: j */
    Thread f7617j;

    C2923c(Runnable runnable, ExecutorService executorService) {
        this.f7613f = runnable;
        this.f7616i = executorService;
    }

    /* renamed from: a */
    public void mo6027a() {
        Future andSet = this.f7615h.getAndSet(f7612k);
        boolean z = true;
        if (!(andSet == null || andSet == f7612k)) {
            andSet.cancel(this.f7617j != Thread.currentThread());
        }
        Future andSet2 = this.f7614g.getAndSet(f7612k);
        if (andSet2 != null && andSet2 != f7612k) {
            if (this.f7617j == Thread.currentThread()) {
                z = false;
            }
            andSet2.cancel(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9020a(Future<?> future) {
        Future future2;
        do {
            future2 = this.f7615h.get();
            if (future2 == f7612k) {
                future.cancel(this.f7617j != Thread.currentThread());
                return;
            }
        } while (!this.f7615h.compareAndSet(future2, future));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9021b(Future<?> future) {
        Future future2;
        do {
            future2 = this.f7614g.get();
            if (future2 == f7612k) {
                future.cancel(this.f7617j != Thread.currentThread());
                return;
            }
        } while (!this.f7614g.compareAndSet(future2, future));
    }

    /* renamed from: b */
    public boolean mo6028b() {
        return this.f7615h.get() == f7612k;
    }

    public Void call() {
        this.f7617j = Thread.currentThread();
        try {
            this.f7613f.run();
            mo9021b(this.f7616i.submit(this));
            this.f7617j = null;
        } catch (Throwable th) {
            this.f7617j = null;
            C2962a.m11431b(th);
        }
        return null;
    }
}
