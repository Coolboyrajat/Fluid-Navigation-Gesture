package p155d.p156a.p163r.p168e.p170b;

import p155d.p156a.C2792j;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p161p.C2819b;
import p155d.p156a.p162q.C2830h;
import p155d.p156a.p163r.p164a.C2832b;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.r.e.b.w */
public final class C2911w<T> extends C2867a<T, T> {

    /* renamed from: g */
    final C2830h<? super T> f7565g;

    /* renamed from: d.a.r.e.b.w$a */
    static final class C2912a<T> implements C2793k<T>, C2810b {

        /* renamed from: f */
        final C2793k<? super T> f7566f;

        /* renamed from: g */
        final C2830h<? super T> f7567g;

        /* renamed from: h */
        C2810b f7568h;

        /* renamed from: i */
        boolean f7569i;

        C2912a(C2793k<? super T> kVar, C2830h<? super T> hVar) {
            this.f7566f = kVar;
            this.f7567g = hVar;
        }

        /* renamed from: a */
        public void mo6027a() {
            this.f7568h.mo6027a();
        }

        /* renamed from: a */
        public void mo6031a(C2810b bVar) {
            if (C2832b.m11098a(this.f7568h, bVar)) {
                this.f7568h = bVar;
                this.f7566f.mo6031a((C2810b) this);
            }
        }

        /* renamed from: a */
        public void mo6032a(T t) {
            if (!this.f7569i) {
                this.f7566f.mo6032a(t);
                try {
                    if (this.f7567g.mo6042a(t)) {
                        this.f7569i = true;
                        this.f7568h.mo6027a();
                        this.f7566f.mo6033c();
                    }
                } catch (Throwable th) {
                    C2819b.m11088b(th);
                    this.f7568h.mo6027a();
                    onError(th);
                }
            }
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7568h.mo6028b();
        }

        /* renamed from: c */
        public void mo6033c() {
            if (!this.f7569i) {
                this.f7569i = true;
                this.f7566f.mo6033c();
            }
        }

        public void onError(Throwable th) {
            if (!this.f7569i) {
                this.f7569i = true;
                this.f7566f.onError(th);
                return;
            }
            C2962a.m11431b(th);
        }
    }

    public C2911w(C2792j<T> jVar, C2830h<? super T> hVar) {
        super(jVar);
        this.f7565g = hVar;
    }

    /* renamed from: b */
    public void mo5871b(C2793k<? super T> kVar) {
        this.f7444f.mo8917a(new C2912a(kVar, this.f7565g));
    }
}
