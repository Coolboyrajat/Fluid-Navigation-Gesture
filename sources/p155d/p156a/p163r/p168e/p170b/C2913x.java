package p155d.p156a.p163r.p168e.p170b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.C2792j;
import p155d.p156a.C2793k;
import p155d.p156a.C2794l;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p164a.C2832b;
import p155d.p156a.p174s.C2960c;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.r.e.b.x */
public final class C2913x<T> extends C2867a<T, T> {

    /* renamed from: g */
    final long f7570g;

    /* renamed from: h */
    final TimeUnit f7571h;

    /* renamed from: i */
    final C2794l f7572i;

    /* renamed from: d.a.r.e.b.x$a */
    static final class C2914a<T> extends AtomicReference<C2810b> implements C2793k<T>, C2810b, Runnable {

        /* renamed from: f */
        final C2793k<? super T> f7573f;

        /* renamed from: g */
        final long f7574g;

        /* renamed from: h */
        final TimeUnit f7575h;

        /* renamed from: i */
        final C2794l.C2797c f7576i;

        /* renamed from: j */
        C2810b f7577j;

        /* renamed from: k */
        volatile boolean f7578k;

        /* renamed from: l */
        boolean f7579l;

        C2914a(C2793k<? super T> kVar, long j, TimeUnit timeUnit, C2794l.C2797c cVar) {
            this.f7573f = kVar;
            this.f7574g = j;
            this.f7575h = timeUnit;
            this.f7576i = cVar;
        }

        /* renamed from: a */
        public void mo6027a() {
            this.f7577j.mo6027a();
            this.f7576i.mo6027a();
        }

        /* renamed from: a */
        public void mo6031a(C2810b bVar) {
            if (C2832b.m11098a(this.f7577j, bVar)) {
                this.f7577j = bVar;
                this.f7573f.mo6031a((C2810b) this);
            }
        }

        /* renamed from: a */
        public void mo6032a(T t) {
            if (!this.f7578k && !this.f7579l) {
                this.f7578k = true;
                this.f7573f.mo6032a(t);
                C2810b bVar = (C2810b) get();
                if (bVar != null) {
                    bVar.mo6027a();
                }
                C2832b.m11100a((AtomicReference<C2810b>) this, this.f7576i.mo8940a(this, this.f7574g, this.f7575h));
            }
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7576i.mo6028b();
        }

        /* renamed from: c */
        public void mo6033c() {
            if (!this.f7579l) {
                this.f7579l = true;
                this.f7573f.mo6033c();
                this.f7576i.mo6027a();
            }
        }

        public void onError(Throwable th) {
            if (this.f7579l) {
                C2962a.m11431b(th);
                return;
            }
            this.f7579l = true;
            this.f7573f.onError(th);
            this.f7576i.mo6027a();
        }

        public void run() {
            this.f7578k = false;
        }
    }

    public C2913x(C2792j<T> jVar, long j, TimeUnit timeUnit, C2794l lVar) {
        super(jVar);
        this.f7570g = j;
        this.f7571h = timeUnit;
        this.f7572i = lVar;
    }

    /* renamed from: b */
    public void mo5871b(C2793k<? super T> kVar) {
        this.f7444f.mo8917a(new C2914a(new C2960c(kVar), this.f7570g, this.f7571h, this.f7572i.mo8931a()));
    }
}
