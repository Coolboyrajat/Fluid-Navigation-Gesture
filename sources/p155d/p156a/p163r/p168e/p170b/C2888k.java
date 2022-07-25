package p155d.p156a.p163r.p168e.p170b;

import p155d.p156a.C2783a;
import p155d.p156a.C2785c;
import p155d.p156a.C2792j;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p166c.C2851a;

/* renamed from: d.a.r.e.b.k */
public final class C2888k<T> extends C2783a implements C2851a<T> {

    /* renamed from: a */
    final C2792j<T> f7508a;

    /* renamed from: d.a.r.e.b.k$a */
    static final class C2889a<T> implements C2793k<T>, C2810b {

        /* renamed from: f */
        final C2785c f7509f;

        /* renamed from: g */
        C2810b f7510g;

        C2889a(C2785c cVar) {
            this.f7509f = cVar;
        }

        /* renamed from: a */
        public void mo6027a() {
            this.f7510g.mo6027a();
        }

        /* renamed from: a */
        public void mo6031a(C2810b bVar) {
            this.f7510g = bVar;
            this.f7509f.mo8900a(this);
        }

        /* renamed from: a */
        public void mo6032a(T t) {
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7510g.mo6028b();
        }

        /* renamed from: c */
        public void mo6033c() {
            this.f7509f.mo6035c();
        }

        public void onError(Throwable th) {
            this.f7509f.onError(th);
        }
    }

    public C2888k(C2792j<T> jVar) {
        this.f7508a = jVar;
    }

    /* renamed from: b */
    public void mo8899b(C2785c cVar) {
        this.f7508a.mo8917a(new C2889a(cVar));
    }
}
