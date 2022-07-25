package p155d.p156a;

import java.util.concurrent.TimeUnit;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p161p.C2819b;
import p155d.p156a.p163r.p164a.C2833c;
import p155d.p156a.p163r.p164a.C2835e;
import p155d.p156a.p163r.p172g.C2929f;
import p155d.p156a.p163r.p173h.C2951d;
import p155d.p156a.p176u.C2962a;
import p155d.p156a.p177v.C2963a;

/* renamed from: d.a.l */
public abstract class C2794l {

    /* renamed from: a */
    static final long f7377a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: d.a.l$a */
    static final class C2795a implements C2810b, Runnable, C2963a {

        /* renamed from: f */
        final Runnable f7378f;

        /* renamed from: g */
        final C2797c f7379g;

        /* renamed from: h */
        Thread f7380h;

        C2795a(Runnable runnable, C2797c cVar) {
            this.f7378f = runnable;
            this.f7379g = cVar;
        }

        /* renamed from: a */
        public void mo6027a() {
            if (this.f7380h == Thread.currentThread()) {
                C2797c cVar = this.f7379g;
                if (cVar instanceof C2929f) {
                    ((C2929f) cVar).mo9035c();
                    return;
                }
            }
            this.f7379g.mo6027a();
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7379g.mo6028b();
        }

        public void run() {
            this.f7380h = Thread.currentThread();
            try {
                this.f7378f.run();
            } finally {
                mo6027a();
                this.f7380h = null;
            }
        }
    }

    /* renamed from: d.a.l$b */
    static final class C2796b implements C2810b, Runnable, C2963a {

        /* renamed from: f */
        final Runnable f7381f;

        /* renamed from: g */
        final C2797c f7382g;

        /* renamed from: h */
        volatile boolean f7383h;

        C2796b(Runnable runnable, C2797c cVar) {
            this.f7381f = runnable;
            this.f7382g = cVar;
        }

        /* renamed from: a */
        public void mo6027a() {
            this.f7383h = true;
            this.f7382g.mo6027a();
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7383h;
        }

        public void run() {
            if (!this.f7383h) {
                try {
                    this.f7381f.run();
                } catch (Throwable th) {
                    C2819b.m11088b(th);
                    this.f7382g.mo6027a();
                    throw C2951d.m11390a(th);
                }
            }
        }
    }

    /* renamed from: d.a.l$c */
    public static abstract class C2797c implements C2810b {

        /* renamed from: d.a.l$c$a */
        final class C2798a implements Runnable, C2963a {

            /* renamed from: f */
            final Runnable f7384f;

            /* renamed from: g */
            final C2835e f7385g;

            /* renamed from: h */
            final long f7386h;

            /* renamed from: i */
            long f7387i;

            /* renamed from: j */
            long f7388j;

            /* renamed from: k */
            long f7389k;

            C2798a(long j, Runnable runnable, long j2, C2835e eVar, long j3) {
                this.f7384f = runnable;
                this.f7385g = eVar;
                this.f7386h = j3;
                this.f7388j = j2;
                this.f7389k = j;
            }

            public void run() {
                long j;
                this.f7384f.run();
                if (!this.f7385g.mo6028b()) {
                    long a = C2797c.this.mo8937a(TimeUnit.NANOSECONDS);
                    long j2 = C2794l.f7377a;
                    long j3 = this.f7388j;
                    if (a + j2 >= j3) {
                        long j4 = this.f7386h;
                        if (a < j3 + j4 + j2) {
                            long j5 = this.f7389k;
                            long j6 = this.f7387i + 1;
                            this.f7387i = j6;
                            j = j5 + (j6 * j4);
                            this.f7388j = a;
                            this.f7385g.mo8970a(C2797c.this.mo8940a(this, j - a, TimeUnit.NANOSECONDS));
                        }
                    }
                    long j7 = this.f7386h;
                    long j8 = a + j7;
                    long j9 = this.f7387i + 1;
                    this.f7387i = j9;
                    this.f7389k = j8 - (j7 * j9);
                    j = j8;
                    this.f7388j = a;
                    this.f7385g.mo8970a(C2797c.this.mo8940a(this, j - a, TimeUnit.NANOSECONDS));
                }
            }
        }

        /* renamed from: a */
        public long mo8937a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: a */
        public C2810b mo8938a(Runnable runnable) {
            return mo8940a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: a */
        public C2810b mo8939a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            C2835e eVar = new C2835e();
            C2835e eVar2 = new C2835e(eVar);
            Runnable a = C2962a.m11427a(runnable);
            long nanos = timeUnit2.toNanos(j2);
            long a2 = mo8937a(TimeUnit.NANOSECONDS);
            C2835e eVar3 = eVar;
            C2798a aVar = r0;
            C2798a aVar2 = new C2798a(a2 + timeUnit2.toNanos(j3), a, a2, eVar2, nanos);
            C2810b a3 = mo8940a(aVar, j3, timeUnit2);
            if (a3 == C2833c.INSTANCE) {
                return a3;
            }
            eVar3.mo8970a(a3);
            return eVar2;
        }

        /* renamed from: a */
        public abstract C2810b mo8940a(Runnable runnable, long j, TimeUnit timeUnit);
    }

    /* renamed from: a */
    public abstract C2797c mo8931a();

    /* renamed from: a */
    public C2810b mo8932a(Runnable runnable) {
        return mo8934a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    public C2810b mo8933a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C2797c a = mo8931a();
        C2796b bVar = new C2796b(C2962a.m11427a(runnable), a);
        C2810b a2 = a.mo8939a(bVar, j, j2, timeUnit);
        return a2 == C2833c.INSTANCE ? a2 : bVar;
    }

    /* renamed from: a */
    public C2810b mo8934a(Runnable runnable, long j, TimeUnit timeUnit) {
        C2797c a = mo8931a();
        C2795a aVar = new C2795a(C2962a.m11427a(runnable), a);
        a.mo8940a(aVar, j, timeUnit);
        return aVar;
    }
}
