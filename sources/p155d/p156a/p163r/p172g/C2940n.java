package p155d.p156a.p163r.p172g;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.C2794l;
import p155d.p156a.p160o.C2809a;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p164a.C2833c;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.r.g.n */
public final class C2940n extends C2794l {

    /* renamed from: c */
    static final C2931h f7655c = new C2931h("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: d */
    static final ScheduledExecutorService f7656d = Executors.newScheduledThreadPool(0);

    /* renamed from: b */
    final AtomicReference<ScheduledExecutorService> f7657b;

    /* renamed from: d.a.r.g.n$a */
    static final class C2941a extends C2794l.C2797c {

        /* renamed from: f */
        final ScheduledExecutorService f7658f;

        /* renamed from: g */
        final C2809a f7659g = new C2809a();

        /* renamed from: h */
        volatile boolean f7660h;

        C2941a(ScheduledExecutorService scheduledExecutorService) {
            this.f7658f = scheduledExecutorService;
        }

        /* renamed from: a */
        public C2810b mo8940a(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.f7660h) {
                return C2833c.INSTANCE;
            }
            C2935k kVar = new C2935k(C2962a.m11427a(runnable), this.f7659g);
            this.f7659g.mo8949c(kVar);
            if (j <= 0) {
                try {
                    future = this.f7658f.submit(kVar);
                } catch (RejectedExecutionException e) {
                    mo6027a();
                    C2962a.m11431b((Throwable) e);
                    return C2833c.INSTANCE;
                }
            } else {
                future = this.f7658f.schedule(kVar, j, timeUnit);
            }
            kVar.mo9040a(future);
            return kVar;
        }

        /* renamed from: a */
        public void mo6027a() {
            if (!this.f7660h) {
                this.f7660h = true;
                this.f7659g.mo6027a();
            }
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7660h;
        }
    }

    static {
        f7656d.shutdown();
    }

    public C2940n() {
        this(f7655c);
    }

    public C2940n(ThreadFactory threadFactory) {
        this.f7657b = new AtomicReference<>();
        this.f7657b.lazySet(m11363a(threadFactory));
    }

    /* renamed from: a */
    static ScheduledExecutorService m11363a(ThreadFactory threadFactory) {
        return C2937m.m11358a(threadFactory);
    }

    /* renamed from: a */
    public C2794l.C2797c mo8931a() {
        return new C2941a(this.f7657b.get());
    }

    /* renamed from: a */
    public C2810b mo8933a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a = C2962a.m11427a(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f7657b.get();
            C2923c cVar = new C2923c(a, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(cVar);
                } catch (RejectedExecutionException e) {
                    C2962a.m11431b((Throwable) e);
                    return C2833c.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(cVar, j, timeUnit);
            }
            cVar.mo9020a(future);
            return cVar;
        }
        C2933i iVar = new C2933i(a);
        iVar.mo9016a(this.f7657b.get().scheduleAtFixedRate(iVar, j, j2, timeUnit));
        return iVar;
    }

    /* renamed from: a */
    public C2810b mo8934a(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C2934j jVar = new C2934j(C2962a.m11427a(runnable));
        if (j <= 0) {
            try {
                future = this.f7657b.get().submit(jVar);
            } catch (RejectedExecutionException e) {
                C2962a.m11431b((Throwable) e);
                return C2833c.INSTANCE;
            }
        } else {
            future = this.f7657b.get().schedule(jVar, j, timeUnit);
        }
        jVar.mo9016a(future);
        return jVar;
    }
}
