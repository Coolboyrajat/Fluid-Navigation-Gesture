package p155d.p156a.p163r.p172g;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.C2794l;
import p155d.p156a.p160o.C2809a;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p164a.C2833c;

/* renamed from: d.a.r.g.d */
public final class C2924d extends C2794l {

    /* renamed from: d */
    static final C2931h f7618d;

    /* renamed from: e */
    static final C2931h f7619e;

    /* renamed from: f */
    private static final long f7620f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: g */
    private static final TimeUnit f7621g = TimeUnit.SECONDS;

    /* renamed from: h */
    static final C2927c f7622h = new C2927c(new C2931h("RxCachedThreadSchedulerShutdown"));

    /* renamed from: i */
    static final C2925a f7623i = new C2925a(0, (TimeUnit) null, f7618d);

    /* renamed from: b */
    final ThreadFactory f7624b;

    /* renamed from: c */
    final AtomicReference<C2925a> f7625c;

    /* renamed from: d.a.r.g.d$a */
    static final class C2925a implements Runnable {

        /* renamed from: f */
        private final long f7626f;

        /* renamed from: g */
        private final ConcurrentLinkedQueue<C2927c> f7627g;

        /* renamed from: h */
        final C2809a f7628h;

        /* renamed from: i */
        private final ScheduledExecutorService f7629i;

        /* renamed from: j */
        private final Future<?> f7630j;

        /* renamed from: k */
        private final ThreadFactory f7631k;

        C2925a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            this.f7626f = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f7627g = new ConcurrentLinkedQueue<>();
            this.f7628h = new C2809a();
            this.f7631k = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C2924d.f7619e);
                long j2 = this.f7626f;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f7629i = scheduledExecutorService;
            this.f7630j = scheduledFuture;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9024a() {
            if (!this.f7627g.isEmpty()) {
                long c = mo9027c();
                Iterator<C2927c> it = this.f7627g.iterator();
                while (it.hasNext()) {
                    C2927c next = it.next();
                    if (next.mo9031d() > c) {
                        return;
                    }
                    if (this.f7627g.remove(next)) {
                        this.f7628h.mo8947b(next);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9025a(C2927c cVar) {
            cVar.mo9030a(mo9027c() + this.f7626f);
            this.f7627g.offer(cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C2927c mo9026b() {
            if (this.f7628h.mo6028b()) {
                return C2924d.f7622h;
            }
            while (!this.f7627g.isEmpty()) {
                C2927c poll = this.f7627g.poll();
                if (poll != null) {
                    return poll;
                }
            }
            C2927c cVar = new C2927c(this.f7631k);
            this.f7628h.mo8949c(cVar);
            return cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo9027c() {
            return System.nanoTime();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo9028d() {
            this.f7628h.mo6027a();
            Future<?> future = this.f7630j;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f7629i;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        public void run() {
            mo9024a();
        }
    }

    /* renamed from: d.a.r.g.d$b */
    static final class C2926b extends C2794l.C2797c {

        /* renamed from: f */
        private final C2809a f7632f;

        /* renamed from: g */
        private final C2925a f7633g;

        /* renamed from: h */
        private final C2927c f7634h;

        /* renamed from: i */
        final AtomicBoolean f7635i = new AtomicBoolean();

        C2926b(C2925a aVar) {
            this.f7633g = aVar;
            this.f7632f = new C2809a();
            this.f7634h = aVar.mo9026b();
        }

        /* renamed from: a */
        public C2810b mo8940a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f7632f.mo6028b()) {
                return C2833c.INSTANCE;
            }
            return this.f7634h.mo9032a(runnable, j, timeUnit, this.f7632f);
        }

        /* renamed from: a */
        public void mo6027a() {
            if (this.f7635i.compareAndSet(false, true)) {
                this.f7632f.mo6027a();
                this.f7633g.mo9025a(this.f7634h);
            }
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7635i.get();
        }
    }

    /* renamed from: d.a.r.g.d$c */
    static final class C2927c extends C2929f {

        /* renamed from: h */
        private long f7636h = 0;

        C2927c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: a */
        public void mo9030a(long j) {
            this.f7636h = j;
        }

        /* renamed from: d */
        public long mo9031d() {
            return this.f7636h;
        }
    }

    static {
        f7622h.mo6027a();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f7618d = new C2931h("RxCachedThreadScheduler", max);
        f7619e = new C2931h("RxCachedWorkerPoolEvictor", max);
        f7623i.mo9028d();
    }

    public C2924d() {
        this(f7618d);
    }

    public C2924d(ThreadFactory threadFactory) {
        this.f7624b = threadFactory;
        this.f7625c = new AtomicReference<>(f7623i);
        mo9023b();
    }

    /* renamed from: a */
    public C2794l.C2797c mo8931a() {
        return new C2926b(this.f7625c.get());
    }

    /* renamed from: b */
    public void mo9023b() {
        C2925a aVar = new C2925a(f7620f, f7621g, this.f7624b);
        if (!this.f7625c.compareAndSet(f7623i, aVar)) {
            aVar.mo9028d();
        }
    }
}
