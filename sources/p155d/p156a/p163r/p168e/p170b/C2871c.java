package p155d.p156a.p163r.p168e.p170b;

import java.util.concurrent.TimeUnit;
import p155d.p156a.C2792j;
import p155d.p156a.C2793k;
import p155d.p156a.C2794l;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p164a.C2832b;
import p155d.p156a.p174s.C2960c;

/* renamed from: d.a.r.e.b.c */
public final class C2871c<T> extends C2867a<T, T> {

    /* renamed from: g */
    final long f7463g;

    /* renamed from: h */
    final TimeUnit f7464h;

    /* renamed from: i */
    final C2794l f7465i;

    /* renamed from: j */
    final boolean f7466j;

    /* renamed from: d.a.r.e.b.c$a */
    static final class C2872a<T> implements C2793k<T>, C2810b {

        /* renamed from: f */
        final C2793k<? super T> f7467f;

        /* renamed from: g */
        final long f7468g;

        /* renamed from: h */
        final TimeUnit f7469h;

        /* renamed from: i */
        final C2794l.C2797c f7470i;

        /* renamed from: j */
        final boolean f7471j;

        /* renamed from: k */
        C2810b f7472k;

        /* renamed from: d.a.r.e.b.c$a$a */
        final class C2873a implements Runnable {
            C2873a() {
            }

            public void run() {
                try {
                    C2872a.this.f7467f.mo6033c();
                } finally {
                    C2872a.this.f7470i.mo6027a();
                }
            }
        }

        /* renamed from: d.a.r.e.b.c$a$b */
        final class C2874b implements Runnable {

            /* renamed from: f */
            private final Throwable f7474f;

            C2874b(Throwable th) {
                this.f7474f = th;
            }

            public void run() {
                try {
                    C2872a.this.f7467f.onError(this.f7474f);
                } finally {
                    C2872a.this.f7470i.mo6027a();
                }
            }
        }

        /* renamed from: d.a.r.e.b.c$a$c */
        final class C2875c implements Runnable {

            /* renamed from: f */
            private final T f7476f;

            C2875c(T t) {
                this.f7476f = t;
            }

            public void run() {
                C2872a.this.f7467f.mo6032a(this.f7476f);
            }
        }

        C2872a(C2793k<? super T> kVar, long j, TimeUnit timeUnit, C2794l.C2797c cVar, boolean z) {
            this.f7467f = kVar;
            this.f7468g = j;
            this.f7469h = timeUnit;
            this.f7470i = cVar;
            this.f7471j = z;
        }

        /* renamed from: a */
        public void mo6027a() {
            this.f7472k.mo6027a();
            this.f7470i.mo6027a();
        }

        /* renamed from: a */
        public void mo6031a(C2810b bVar) {
            if (C2832b.m11098a(this.f7472k, bVar)) {
                this.f7472k = bVar;
                this.f7467f.mo6031a((C2810b) this);
            }
        }

        /* renamed from: a */
        public void mo6032a(T t) {
            this.f7470i.mo8940a(new C2875c(t), this.f7468g, this.f7469h);
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7470i.mo6028b();
        }

        /* renamed from: c */
        public void mo6033c() {
            this.f7470i.mo8940a(new C2873a(), this.f7468g, this.f7469h);
        }

        public void onError(Throwable th) {
            this.f7470i.mo8940a(new C2874b(th), this.f7471j ? this.f7468g : 0, this.f7469h);
        }
    }

    public C2871c(C2792j<T> jVar, long j, TimeUnit timeUnit, C2794l lVar, boolean z) {
        super(jVar);
        this.f7463g = j;
        this.f7464h = timeUnit;
        this.f7465i = lVar;
        this.f7466j = z;
    }

    /* renamed from: b */
    public void mo5871b(C2793k<? super T> kVar) {
        this.f7444f.mo8917a(new C2872a(this.f7466j ? kVar : new C2960c(kVar), this.f7463g, this.f7464h, this.f7465i.mo8931a(), this.f7466j));
    }
}
