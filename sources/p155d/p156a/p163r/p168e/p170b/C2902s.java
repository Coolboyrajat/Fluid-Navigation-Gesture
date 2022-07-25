package p155d.p156a.p163r.p168e.p170b;

import p155d.p156a.C2792j;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p164a.C2832b;

/* renamed from: d.a.r.e.b.s */
public final class C2902s<T> extends C2867a<T, T> {

    /* renamed from: g */
    final long f7546g;

    /* renamed from: d.a.r.e.b.s$a */
    static final class C2903a<T> implements C2793k<T>, C2810b {

        /* renamed from: f */
        final C2793k<? super T> f7547f;

        /* renamed from: g */
        long f7548g;

        /* renamed from: h */
        C2810b f7549h;

        C2903a(C2793k<? super T> kVar, long j) {
            this.f7547f = kVar;
            this.f7548g = j;
        }

        /* renamed from: a */
        public void mo6027a() {
            this.f7549h.mo6027a();
        }

        /* renamed from: a */
        public void mo6031a(C2810b bVar) {
            if (C2832b.m11098a(this.f7549h, bVar)) {
                this.f7549h = bVar;
                this.f7547f.mo6031a((C2810b) this);
            }
        }

        /* renamed from: a */
        public void mo6032a(T t) {
            long j = this.f7548g;
            if (j != 0) {
                this.f7548g = j - 1;
            } else {
                this.f7547f.mo6032a(t);
            }
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7549h.mo6028b();
        }

        /* renamed from: c */
        public void mo6033c() {
            this.f7547f.mo6033c();
        }

        public void onError(Throwable th) {
            this.f7547f.onError(th);
        }
    }

    public C2902s(C2792j<T> jVar, long j) {
        super(jVar);
        this.f7546g = j;
    }

    /* renamed from: b */
    public void mo5871b(C2793k<? super T> kVar) {
        this.f7444f.mo8917a(new C2903a(kVar, this.f7546g));
    }
}
