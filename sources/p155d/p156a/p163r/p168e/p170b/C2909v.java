package p155d.p156a.p163r.p168e.p170b;

import p155d.p156a.C2792j;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p164a.C2832b;
import p155d.p156a.p163r.p164a.C2833c;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.r.e.b.v */
public final class C2909v<T> extends C2867a<T, T> {

    /* renamed from: g */
    final long f7560g;

    /* renamed from: d.a.r.e.b.v$a */
    static final class C2910a<T> implements C2793k<T>, C2810b {

        /* renamed from: f */
        final C2793k<? super T> f7561f;

        /* renamed from: g */
        boolean f7562g;

        /* renamed from: h */
        C2810b f7563h;

        /* renamed from: i */
        long f7564i;

        C2910a(C2793k<? super T> kVar, long j) {
            this.f7561f = kVar;
            this.f7564i = j;
        }

        /* renamed from: a */
        public void mo6027a() {
            this.f7563h.mo6027a();
        }

        /* renamed from: a */
        public void mo6031a(C2810b bVar) {
            if (C2832b.m11098a(this.f7563h, bVar)) {
                this.f7563h = bVar;
                if (this.f7564i == 0) {
                    this.f7562g = true;
                    bVar.mo6027a();
                    C2833c.m11108a((C2793k<?>) this.f7561f);
                    return;
                }
                this.f7561f.mo6031a((C2810b) this);
            }
        }

        /* renamed from: a */
        public void mo6032a(T t) {
            if (!this.f7562g) {
                long j = this.f7564i;
                this.f7564i = j - 1;
                if (j > 0) {
                    boolean z = this.f7564i == 0;
                    this.f7561f.mo6032a(t);
                    if (z) {
                        mo6033c();
                    }
                }
            }
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7563h.mo6028b();
        }

        /* renamed from: c */
        public void mo6033c() {
            if (!this.f7562g) {
                this.f7562g = true;
                this.f7563h.mo6027a();
                this.f7561f.mo6033c();
            }
        }

        public void onError(Throwable th) {
            if (this.f7562g) {
                C2962a.m11431b(th);
                return;
            }
            this.f7562g = true;
            this.f7563h.mo6027a();
            this.f7561f.onError(th);
        }
    }

    public C2909v(C2792j<T> jVar, long j) {
        super(jVar);
        this.f7560g = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo5871b(C2793k<? super T> kVar) {
        this.f7444f.mo8917a(new C2910a(kVar, this.f7560g));
    }
}
