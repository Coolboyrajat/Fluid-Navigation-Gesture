package p155d.p156a.p163r.p168e.p170b;

import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.C2792j;
import p155d.p156a.C2793k;
import p155d.p156a.C2794l;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p164a.C2832b;

/* renamed from: d.a.r.e.b.t */
public final class C2904t<T> extends C2867a<T, T> {

    /* renamed from: g */
    final C2794l f7550g;

    /* renamed from: d.a.r.e.b.t$a */
    static final class C2905a<T> extends AtomicReference<C2810b> implements C2793k<T>, C2810b {

        /* renamed from: f */
        final C2793k<? super T> f7551f;

        /* renamed from: g */
        final AtomicReference<C2810b> f7552g = new AtomicReference<>();

        C2905a(C2793k<? super T> kVar) {
            this.f7551f = kVar;
        }

        /* renamed from: a */
        public void mo6027a() {
            C2832b.m11099a(this.f7552g);
            C2832b.m11099a((AtomicReference<C2810b>) this);
        }

        /* renamed from: a */
        public void mo6031a(C2810b bVar) {
            C2832b.m11103c(this.f7552g, bVar);
        }

        /* renamed from: a */
        public void mo6032a(T t) {
            this.f7551f.mo6032a(t);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo9011b(C2810b bVar) {
            C2832b.m11103c(this, bVar);
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return C2832b.m11097a((C2810b) get());
        }

        /* renamed from: c */
        public void mo6033c() {
            this.f7551f.mo6033c();
        }

        public void onError(Throwable th) {
            this.f7551f.onError(th);
        }
    }

    /* renamed from: d.a.r.e.b.t$b */
    final class C2906b implements Runnable {

        /* renamed from: f */
        private final C2905a<T> f7553f;

        C2906b(C2905a<T> aVar) {
            this.f7553f = aVar;
        }

        public void run() {
            C2904t.this.f7444f.mo8917a(this.f7553f);
        }
    }

    public C2904t(C2792j<T> jVar, C2794l lVar) {
        super(jVar);
        this.f7550g = lVar;
    }

    /* renamed from: b */
    public void mo5871b(C2793k<? super T> kVar) {
        C2905a aVar = new C2905a(kVar);
        kVar.mo6031a((C2810b) aVar);
        aVar.mo9011b(this.f7550g.mo8932a(new C2906b(aVar)));
    }
}
