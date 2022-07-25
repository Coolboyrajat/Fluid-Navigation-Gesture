package p155d.p156a.p163r.p168e.p170b;

import p155d.p156a.C2790h;
import p155d.p156a.C2792j;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p164a.C2835e;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.r.e.b.d */
public final class C2876d<T, U> extends C2790h<T> {

    /* renamed from: f */
    final C2792j<? extends T> f7478f;

    /* renamed from: g */
    final C2792j<U> f7479g;

    /* renamed from: d.a.r.e.b.d$a */
    final class C2877a implements C2793k<U> {

        /* renamed from: f */
        final C2835e f7480f;

        /* renamed from: g */
        final C2793k<? super T> f7481g;

        /* renamed from: h */
        boolean f7482h;

        /* renamed from: d.a.r.e.b.d$a$a */
        final class C2878a implements C2793k<T> {
            C2878a() {
            }

            /* renamed from: a */
            public void mo6031a(C2810b bVar) {
                C2877a.this.f7480f.mo8971b(bVar);
            }

            /* renamed from: a */
            public void mo6032a(T t) {
                C2877a.this.f7481g.mo6032a(t);
            }

            /* renamed from: c */
            public void mo6033c() {
                C2877a.this.f7481g.mo6033c();
            }

            public void onError(Throwable th) {
                C2877a.this.f7481g.onError(th);
            }
        }

        C2877a(C2835e eVar, C2793k<? super T> kVar) {
            this.f7480f = eVar;
            this.f7481g = kVar;
        }

        /* renamed from: a */
        public void mo6031a(C2810b bVar) {
            this.f7480f.mo8971b(bVar);
        }

        /* renamed from: a */
        public void mo6032a(U u) {
            mo6033c();
        }

        /* renamed from: c */
        public void mo6033c() {
            if (!this.f7482h) {
                this.f7482h = true;
                C2876d.this.f7478f.mo8917a(new C2878a());
            }
        }

        public void onError(Throwable th) {
            if (this.f7482h) {
                C2962a.m11431b(th);
                return;
            }
            this.f7482h = true;
            this.f7481g.onError(th);
        }
    }

    public C2876d(C2792j<? extends T> jVar, C2792j<U> jVar2) {
        this.f7478f = jVar;
        this.f7479g = jVar2;
    }

    /* renamed from: b */
    public void mo5871b(C2793k<? super T> kVar) {
        C2835e eVar = new C2835e();
        kVar.mo6031a((C2810b) eVar);
        this.f7479g.mo8917a(new C2877a(eVar, kVar));
    }
}
