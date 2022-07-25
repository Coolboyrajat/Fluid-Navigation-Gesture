package p155d.p156a.p163r.p168e.p170b;

import p155d.p156a.C2792j;
import p155d.p156a.C2793k;
import p155d.p156a.p162q.C2830h;
import p155d.p156a.p163r.p167d.C2858a;

/* renamed from: d.a.r.e.b.i */
public final class C2885i<T> extends C2867a<T, T> {

    /* renamed from: g */
    final C2830h<? super T> f7505g;

    /* renamed from: d.a.r.e.b.i$a */
    static final class C2886a<T> extends C2858a<T, T> {

        /* renamed from: k */
        final C2830h<? super T> f7506k;

        C2886a(C2793k<? super T> kVar, C2830h<? super T> hVar) {
            super(kVar);
            this.f7506k = hVar;
        }

        /* renamed from: a */
        public int mo8964a(int i) {
            return mo8983b(i);
        }

        /* renamed from: a */
        public void mo6032a(T t) {
            if (this.f7429j == 0) {
                try {
                    if (this.f7506k.mo6042a(t)) {
                        this.f7425f.mo6032a(t);
                    }
                } catch (Throwable th) {
                    mo8982a(th);
                }
            } else {
                this.f7425f.mo6032a(null);
            }
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: d */
        public T mo8967d() {
            /*
                r2 = this;
            L_0x0000:
                d.a.r.c.c<T> r0 = r2.f7427h
                java.lang.Object r0 = r0.mo8967d()
                if (r0 == 0) goto L_0x0010
                d.a.q.h<? super T> r1 = r2.f7506k
                boolean r1 = r1.mo6042a(r0)
                if (r1 == 0) goto L_0x0000
            L_0x0010:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p155d.p156a.p163r.p168e.p170b.C2885i.C2886a.mo8967d():java.lang.Object");
        }
    }

    public C2885i(C2792j<T> jVar, C2830h<? super T> hVar) {
        super(jVar);
        this.f7505g = hVar;
    }

    /* renamed from: b */
    public void mo5871b(C2793k<? super T> kVar) {
        this.f7444f.mo8917a(new C2886a(kVar, this.f7505g));
    }
}
