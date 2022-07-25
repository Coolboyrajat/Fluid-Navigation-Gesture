package p155d.p156a.p163r.p172g;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p155d.p156a.C2794l;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p164a.C2831a;
import p155d.p156a.p163r.p164a.C2833c;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.r.g.f */
public class C2929f extends C2794l.C2797c implements C2810b {

    /* renamed from: f */
    private final ScheduledExecutorService f7639f;

    /* renamed from: g */
    volatile boolean f7640g;

    public C2929f(ThreadFactory threadFactory) {
        this.f7639f = C2937m.m11358a(threadFactory);
    }

    /* renamed from: a */
    public C2810b mo8938a(Runnable runnable) {
        return mo8940a(runnable, 0, (TimeUnit) null);
    }

    /* renamed from: a */
    public C2810b mo8940a(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f7640g ? C2833c.INSTANCE : mo9032a(runnable, j, timeUnit, (C2831a) null);
    }

    /* renamed from: a */
    public C2935k mo9032a(Runnable runnable, long j, TimeUnit timeUnit, C2831a aVar) {
        Future future;
        C2935k kVar = new C2935k(C2962a.m11427a(runnable), aVar);
        if (aVar != null && !aVar.mo8949c(kVar)) {
            return kVar;
        }
        if (j <= 0) {
            try {
                future = this.f7639f.submit(kVar);
            } catch (RejectedExecutionException e) {
                if (aVar != null) {
                    aVar.mo8947b(kVar);
                }
                C2962a.m11431b((Throwable) e);
            }
        } else {
            future = this.f7639f.schedule(kVar, j, timeUnit);
        }
        kVar.mo9040a(future);
        return kVar;
    }

    /* renamed from: a */
    public void mo6027a() {
        if (!this.f7640g) {
            this.f7640g = true;
            this.f7639f.shutdownNow();
        }
    }

    /* renamed from: b */
    public C2810b mo9033b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a = C2962a.m11427a(runnable);
        if (j2 <= 0) {
            C2923c cVar = new C2923c(a, this.f7639f);
            if (j <= 0) {
                try {
                    future = this.f7639f.submit(cVar);
                } catch (RejectedExecutionException e) {
                    C2962a.m11431b((Throwable) e);
                    return C2833c.INSTANCE;
                }
            } else {
                future = this.f7639f.schedule(cVar, j, timeUnit);
            }
            cVar.mo9020a(future);
            return cVar;
        }
        C2933i iVar = new C2933i(a);
        iVar.mo9016a(this.f7639f.scheduleAtFixedRate(iVar, j, j2, timeUnit));
        return iVar;
    }

    /* renamed from: b */
    public C2810b mo9034b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C2934j jVar = new C2934j(C2962a.m11427a(runnable));
        if (j <= 0) {
            try {
                future = this.f7639f.submit(jVar);
            } catch (RejectedExecutionException e) {
                C2962a.m11431b((Throwable) e);
                return C2833c.INSTANCE;
            }
        } else {
            future = this.f7639f.schedule(jVar, j, timeUnit);
        }
        jVar.mo9016a(future);
        return jVar;
    }

    /* renamed from: b */
    public boolean mo6028b() {
        return this.f7640g;
    }

    /* renamed from: c */
    public void mo9035c() {
        if (!this.f7640g) {
            this.f7640g = true;
            this.f7639f.shutdown();
        }
    }
}
