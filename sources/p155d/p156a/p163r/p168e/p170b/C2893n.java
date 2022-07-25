package p155d.p156a.p163r.p168e.p170b;

import p155d.p156a.C2792j;
import p155d.p156a.C2793k;
import p155d.p156a.p162q.C2828f;
import p155d.p156a.p163r.p165b.C2849b;
import p155d.p156a.p163r.p167d.C2858a;

/* renamed from: d.a.r.e.b.n */
public final class C2893n<T, U> extends C2867a<T, U> {

    /* renamed from: g */
    final C2828f<? super T, ? extends U> f7518g;

    /* renamed from: d.a.r.e.b.n$a */
    static final class C2894a<T, U> extends C2858a<T, U> {

        /* renamed from: k */
        final C2828f<? super T, ? extends U> f7519k;

        C2894a(C2793k<? super U> kVar, C2828f<? super T, ? extends U> fVar) {
            super(kVar);
            this.f7519k = fVar;
        }

        /* renamed from: a */
        public int mo8964a(int i) {
            return mo8983b(i);
        }

        /* renamed from: a */
        public void mo6032a(T t) {
            if (!this.f7428i) {
                if (this.f7429j != 0) {
                    this.f7425f.mo6032a(null);
                    return;
                }
                try {
                    Object a = this.f7519k.mo6044a(t);
                    C2849b.m11138a(a, "The mapper function returned a null value.");
                    this.f7425f.mo6032a(a);
                } catch (Throwable th) {
                    mo8982a(th);
                }
            }
        }

        /* renamed from: d */
        public U mo8967d() {
            T d = this.f7427h.mo8967d();
            if (d == null) {
                return null;
            }
            U a = this.f7519k.mo6044a(d);
            C2849b.m11138a(a, "The mapper function returned a null value.");
            return a;
        }
    }

    public C2893n(C2792j<T> jVar, C2828f<? super T, ? extends U> fVar) {
        super(jVar);
        this.f7518g = fVar;
    }

    /* renamed from: b */
    public void mo5871b(C2793k<? super U> kVar) {
        this.f7444f.mo8917a(new C2894a(kVar, this.f7518g));
    }
}
