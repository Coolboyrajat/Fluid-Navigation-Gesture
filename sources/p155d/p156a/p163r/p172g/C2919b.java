package p155d.p156a.p163r.p172g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.C2794l;
import p155d.p156a.p160o.C2809a;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p164a.C2833c;
import p155d.p156a.p163r.p164a.C2834d;

/* renamed from: d.a.r.g.b */
public final class C2919b extends C2794l implements C2936l {

    /* renamed from: d */
    static final C2921b f7598d = new C2921b(0, f7599e);

    /* renamed from: e */
    static final C2931h f7599e = new C2931h("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);

    /* renamed from: f */
    static final int f7600f = m11319a(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: g */
    static final C2922c f7601g = new C2922c(new C2931h("RxComputationShutdown"));

    /* renamed from: b */
    final ThreadFactory f7602b;

    /* renamed from: c */
    final AtomicReference<C2921b> f7603c;

    /* renamed from: d.a.r.g.b$a */
    static final class C2920a extends C2794l.C2797c {

        /* renamed from: f */
        private final C2834d f7604f = new C2834d();

        /* renamed from: g */
        private final C2809a f7605g = new C2809a();

        /* renamed from: h */
        private final C2834d f7606h = new C2834d();

        /* renamed from: i */
        private final C2922c f7607i;

        /* renamed from: j */
        volatile boolean f7608j;

        C2920a(C2922c cVar) {
            this.f7607i = cVar;
            this.f7606h.mo8949c(this.f7604f);
            this.f7606h.mo8949c(this.f7605g);
        }

        /* renamed from: a */
        public C2810b mo8938a(Runnable runnable) {
            if (this.f7608j) {
                return C2833c.INSTANCE;
            }
            return this.f7607i.mo9032a(runnable, 0, TimeUnit.MILLISECONDS, this.f7604f);
        }

        /* renamed from: a */
        public C2810b mo8940a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f7608j) {
                return C2833c.INSTANCE;
            }
            return this.f7607i.mo9032a(runnable, j, timeUnit, this.f7605g);
        }

        /* renamed from: a */
        public void mo6027a() {
            if (!this.f7608j) {
                this.f7608j = true;
                this.f7606h.mo6027a();
            }
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7608j;
        }
    }

    /* renamed from: d.a.r.g.b$b */
    static final class C2921b implements C2936l {

        /* renamed from: a */
        final int f7609a;

        /* renamed from: b */
        final C2922c[] f7610b;

        /* renamed from: c */
        long f7611c;

        C2921b(int i, ThreadFactory threadFactory) {
            this.f7609a = i;
            this.f7610b = new C2922c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f7610b[i2] = new C2922c(threadFactory);
            }
        }

        /* renamed from: a */
        public C2922c mo9018a() {
            int i = this.f7609a;
            if (i == 0) {
                return C2919b.f7601g;
            }
            C2922c[] cVarArr = this.f7610b;
            long j = this.f7611c;
            this.f7611c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void mo9019b() {
            for (C2922c a : this.f7610b) {
                a.mo6027a();
            }
        }
    }

    /* renamed from: d.a.r.g.b$c */
    static final class C2922c extends C2929f {
        C2922c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        f7601g.mo6027a();
        f7598d.mo9019b();
    }

    public C2919b() {
        this(f7599e);
    }

    public C2919b(ThreadFactory threadFactory) {
        this.f7602b = threadFactory;
        this.f7603c = new AtomicReference<>(f7598d);
        mo9017b();
    }

    /* renamed from: a */
    static int m11319a(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    /* renamed from: a */
    public C2794l.C2797c mo8931a() {
        return new C2920a(this.f7603c.get().mo9018a());
    }

    /* renamed from: a */
    public C2810b mo8933a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f7603c.get().mo9018a().mo9033b(runnable, j, j2, timeUnit);
    }

    /* renamed from: a */
    public C2810b mo8934a(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f7603c.get().mo9018a().mo9034b(runnable, j, timeUnit);
    }

    /* renamed from: b */
    public void mo9017b() {
        C2921b bVar = new C2921b(f7600f, this.f7602b);
        if (!this.f7603c.compareAndSet(f7598d, bVar)) {
            bVar.mo9019b();
        }
    }
}
