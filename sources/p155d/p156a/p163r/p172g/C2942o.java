package p155d.p156a.p163r.p172g;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p155d.p156a.C2794l;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p160o.C2811c;
import p155d.p156a.p163r.p164a.C2833c;
import p155d.p156a.p163r.p165b.C2849b;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.r.g.o */
public final class C2942o extends C2794l {

    /* renamed from: b */
    private static final C2942o f7661b = new C2942o();

    /* renamed from: d.a.r.g.o$a */
    static final class C2943a implements Runnable {

        /* renamed from: f */
        private final Runnable f7662f;

        /* renamed from: g */
        private final C2945c f7663g;

        /* renamed from: h */
        private final long f7664h;

        C2943a(Runnable runnable, C2945c cVar, long j) {
            this.f7662f = runnable;
            this.f7663g = cVar;
            this.f7664h = j;
        }

        public void run() {
            if (!this.f7663g.f7672i) {
                long a = this.f7663g.mo8937a(TimeUnit.MILLISECONDS);
                long j = this.f7664h;
                if (j > a) {
                    try {
                        Thread.sleep(j - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C2962a.m11431b((Throwable) e);
                        return;
                    }
                }
                if (!this.f7663g.f7672i) {
                    this.f7662f.run();
                }
            }
        }
    }

    /* renamed from: d.a.r.g.o$b */
    static final class C2944b implements Comparable<C2944b> {

        /* renamed from: f */
        final Runnable f7665f;

        /* renamed from: g */
        final long f7666g;

        /* renamed from: h */
        final int f7667h;

        /* renamed from: i */
        volatile boolean f7668i;

        C2944b(Runnable runnable, Long l, int i) {
            this.f7665f = runnable;
            this.f7666g = l.longValue();
            this.f7667h = i;
        }

        /* renamed from: a */
        public int compareTo(C2944b bVar) {
            int a = C2849b.m11136a(this.f7666g, bVar.f7666g);
            return a == 0 ? C2849b.m11134a(this.f7667h, bVar.f7667h) : a;
        }
    }

    /* renamed from: d.a.r.g.o$c */
    static final class C2945c extends C2794l.C2797c implements C2810b {

        /* renamed from: f */
        final PriorityBlockingQueue<C2944b> f7669f = new PriorityBlockingQueue<>();

        /* renamed from: g */
        private final AtomicInteger f7670g = new AtomicInteger();

        /* renamed from: h */
        final AtomicInteger f7671h = new AtomicInteger();

        /* renamed from: i */
        volatile boolean f7672i;

        /* renamed from: d.a.r.g.o$c$a */
        final class C2946a implements Runnable {

            /* renamed from: f */
            final C2944b f7673f;

            C2946a(C2944b bVar) {
                this.f7673f = bVar;
            }

            public void run() {
                C2944b bVar = this.f7673f;
                bVar.f7668i = true;
                C2945c.this.f7669f.remove(bVar);
            }
        }

        C2945c() {
        }

        /* renamed from: a */
        public C2810b mo8938a(Runnable runnable) {
            return mo9048a(runnable, mo8937a(TimeUnit.MILLISECONDS));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2810b mo9048a(Runnable runnable, long j) {
            if (this.f7672i) {
                return C2833c.INSTANCE;
            }
            C2944b bVar = new C2944b(runnable, Long.valueOf(j), this.f7671h.incrementAndGet());
            this.f7669f.add(bVar);
            if (this.f7670g.getAndIncrement() != 0) {
                return C2811c.m11072a(new C2946a(bVar));
            }
            int i = 1;
            while (!this.f7672i) {
                C2944b poll = this.f7669f.poll();
                if (poll == null) {
                    i = this.f7670g.addAndGet(-i);
                    if (i == 0) {
                        return C2833c.INSTANCE;
                    }
                } else if (!poll.f7668i) {
                    poll.f7665f.run();
                }
            }
            this.f7669f.clear();
            return C2833c.INSTANCE;
        }

        /* renamed from: a */
        public C2810b mo8940a(Runnable runnable, long j, TimeUnit timeUnit) {
            long a = mo8937a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return mo9048a(new C2943a(runnable, this, a), a);
        }

        /* renamed from: a */
        public void mo6027a() {
            this.f7672i = true;
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7672i;
        }
    }

    C2942o() {
    }

    /* renamed from: b */
    public static C2942o m11370b() {
        return f7661b;
    }

    /* renamed from: a */
    public C2794l.C2797c mo8931a() {
        return new C2945c();
    }

    /* renamed from: a */
    public C2810b mo8932a(Runnable runnable) {
        C2962a.m11427a(runnable).run();
        return C2833c.INSTANCE;
    }

    /* renamed from: a */
    public C2810b mo8934a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C2962a.m11427a(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C2962a.m11431b((Throwable) e);
        }
        return C2833c.INSTANCE;
    }
}
