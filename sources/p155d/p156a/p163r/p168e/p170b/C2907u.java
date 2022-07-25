package p155d.p156a.p163r.p168e.p170b;

import p155d.p156a.C2792j;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p164a.C2835e;

/* renamed from: d.a.r.e.b.u */
public final class C2907u<T> extends C2867a<T, T> {

    /* renamed from: g */
    final C2792j<? extends T> f7555g;

    /* renamed from: d.a.r.e.b.u$a */
    static final class C2908a<T> implements C2793k<T> {

        /* renamed from: f */
        final C2793k<? super T> f7556f;

        /* renamed from: g */
        final C2792j<? extends T> f7557g;

        /* renamed from: h */
        final C2835e f7558h = new C2835e();

        /* renamed from: i */
        boolean f7559i = true;

        C2908a(C2793k<? super T> kVar, C2792j<? extends T> jVar) {
            this.f7556f = kVar;
            this.f7557g = jVar;
        }

        /* renamed from: a */
        public void mo6031a(C2810b bVar) {
            this.f7558h.mo8971b(bVar);
        }

        /* renamed from: a */
        public void mo6032a(T t) {
            if (this.f7559i) {
                this.f7559i = false;
            }
            this.f7556f.mo6032a(t);
        }

        /* renamed from: c */
        public void mo6033c() {
            if (this.f7559i) {
                this.f7559i = false;
                this.f7557g.mo8917a(this);
                return;
            }
            this.f7556f.mo6033c();
        }

        public void onError(Throwable th) {
            this.f7556f.onError(th);
        }
    }

    public C2907u(C2792j<T> jVar, C2792j<? extends T> jVar2) {
        super(jVar);
        this.f7555g = jVar2;
    }

    /* renamed from: b */
    public void mo5871b(C2793k<? super T> kVar) {
        C2908a aVar = new C2908a(kVar, this.f7555g);
        kVar.mo6031a((C2810b) aVar.f7558h);
        this.f7444f.mo8917a(aVar);
    }
}
