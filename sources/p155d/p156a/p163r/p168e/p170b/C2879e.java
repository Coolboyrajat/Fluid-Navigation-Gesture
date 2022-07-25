package p155d.p156a.p163r.p168e.p170b;

import p155d.p156a.C2792j;
import p155d.p156a.C2793k;
import p155d.p156a.p162q.C2825c;
import p155d.p156a.p162q.C2828f;
import p155d.p156a.p163r.p167d.C2858a;

/* renamed from: d.a.r.e.b.e */
public final class C2879e<T, K> extends C2867a<T, T> {

    /* renamed from: g */
    final C2828f<? super T, K> f7485g;

    /* renamed from: h */
    final C2825c<? super K, ? super K> f7486h;

    /* renamed from: d.a.r.e.b.e$a */
    static final class C2880a<T, K> extends C2858a<T, T> {

        /* renamed from: k */
        final C2828f<? super T, K> f7487k;

        /* renamed from: l */
        final C2825c<? super K, ? super K> f7488l;

        /* renamed from: m */
        K f7489m;

        /* renamed from: n */
        boolean f7490n;

        C2880a(C2793k<? super T> kVar, C2828f<? super T, K> fVar, C2825c<? super K, ? super K> cVar) {
            super(kVar);
            this.f7487k = fVar;
            this.f7488l = cVar;
        }

        /* renamed from: a */
        public int mo8964a(int i) {
            return mo8983b(i);
        }

        /* renamed from: a */
        public void mo6032a(T t) {
            if (!this.f7428i) {
                if (this.f7429j == 0) {
                    try {
                        K a = this.f7487k.mo6044a(t);
                        if (this.f7490n) {
                            boolean a2 = this.f7488l.mo8963a(this.f7489m, a);
                            this.f7489m = a;
                            if (a2) {
                                return;
                            }
                        } else {
                            this.f7490n = true;
                            this.f7489m = a;
                        }
                    } catch (Throwable th) {
                        mo8982a(th);
                        return;
                    }
                }
                this.f7425f.mo6032a(t);
            }
        }

        /* renamed from: d */
        public T mo8967d() {
            T d;
            boolean a;
            do {
                d = this.f7427h.mo8967d();
                if (d == null) {
                    return null;
                }
                K a2 = this.f7487k.mo6044a(d);
                if (!this.f7490n) {
                    this.f7490n = true;
                    this.f7489m = a2;
                    return d;
                }
                a = this.f7488l.mo8963a(this.f7489m, a2);
                this.f7489m = a2;
            } while (a);
            return d;
        }
    }

    public C2879e(C2792j<T> jVar, C2828f<? super T, K> fVar, C2825c<? super K, ? super K> cVar) {
        super(jVar);
        this.f7485g = fVar;
        this.f7486h = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo5871b(C2793k<? super T> kVar) {
        this.f7444f.mo8917a(new C2880a(kVar, this.f7485g, this.f7486h));
    }
}
