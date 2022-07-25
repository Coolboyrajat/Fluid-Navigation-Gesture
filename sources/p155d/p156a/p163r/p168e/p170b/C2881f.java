package p155d.p156a.p163r.p168e.p170b;

import p155d.p156a.C2792j;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p161p.C2814a;
import p155d.p156a.p161p.C2819b;
import p155d.p156a.p162q.C2823a;
import p155d.p156a.p162q.C2827e;
import p155d.p156a.p163r.p164a.C2832b;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.r.e.b.f */
public final class C2881f<T> extends C2867a<T, T> {

    /* renamed from: g */
    final C2827e<? super T> f7491g;

    /* renamed from: h */
    final C2827e<? super Throwable> f7492h;

    /* renamed from: i */
    final C2823a f7493i;

    /* renamed from: j */
    final C2823a f7494j;

    /* renamed from: d.a.r.e.b.f$a */
    static final class C2882a<T> implements C2793k<T>, C2810b {

        /* renamed from: f */
        final C2793k<? super T> f7495f;

        /* renamed from: g */
        final C2827e<? super T> f7496g;

        /* renamed from: h */
        final C2827e<? super Throwable> f7497h;

        /* renamed from: i */
        final C2823a f7498i;

        /* renamed from: j */
        final C2823a f7499j;

        /* renamed from: k */
        C2810b f7500k;

        /* renamed from: l */
        boolean f7501l;

        C2882a(C2793k<? super T> kVar, C2827e<? super T> eVar, C2827e<? super Throwable> eVar2, C2823a aVar, C2823a aVar2) {
            this.f7495f = kVar;
            this.f7496g = eVar;
            this.f7497h = eVar2;
            this.f7498i = aVar;
            this.f7499j = aVar2;
        }

        /* renamed from: a */
        public void mo6027a() {
            this.f7500k.mo6027a();
        }

        /* renamed from: a */
        public void mo6031a(C2810b bVar) {
            if (C2832b.m11098a(this.f7500k, bVar)) {
                this.f7500k = bVar;
                this.f7495f.mo6031a((C2810b) this);
            }
        }

        /* renamed from: a */
        public void mo6032a(T t) {
            if (!this.f7501l) {
                try {
                    this.f7496g.accept(t);
                    this.f7495f.mo6032a(t);
                } catch (Throwable th) {
                    C2819b.m11088b(th);
                    this.f7500k.mo6027a();
                    onError(th);
                }
            }
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7500k.mo6028b();
        }

        /* renamed from: c */
        public void mo6033c() {
            if (!this.f7501l) {
                try {
                    this.f7498i.run();
                    this.f7501l = true;
                    this.f7495f.mo6033c();
                    try {
                        this.f7499j.run();
                    } catch (Throwable th) {
                        C2819b.m11088b(th);
                        C2962a.m11431b(th);
                    }
                } catch (Throwable th2) {
                    C2819b.m11088b(th2);
                    onError(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f7501l) {
                C2962a.m11431b(th);
                return;
            }
            this.f7501l = true;
            try {
                this.f7497h.accept(th);
            } catch (Throwable th2) {
                C2819b.m11088b(th2);
                th = new C2814a(th, th2);
            }
            this.f7495f.onError(th);
            try {
                this.f7499j.run();
            } catch (Throwable th3) {
                C2819b.m11088b(th3);
                C2962a.m11431b(th3);
            }
        }
    }

    public C2881f(C2792j<T> jVar, C2827e<? super T> eVar, C2827e<? super Throwable> eVar2, C2823a aVar, C2823a aVar2) {
        super(jVar);
        this.f7491g = eVar;
        this.f7492h = eVar2;
        this.f7493i = aVar;
        this.f7494j = aVar2;
    }

    /* renamed from: b */
    public void mo5871b(C2793k<? super T> kVar) {
        this.f7444f.mo8917a(new C2882a(kVar, this.f7491g, this.f7492h, this.f7493i, this.f7494j));
    }
}
