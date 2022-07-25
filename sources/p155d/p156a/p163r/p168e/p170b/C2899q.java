package p155d.p156a.p163r.p168e.p170b;

import java.util.concurrent.atomic.AtomicInteger;
import p155d.p156a.C2790h;
import p155d.p156a.C2792j;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p161p.C2819b;
import p155d.p156a.p162q.C2826d;
import p155d.p156a.p163r.p164a.C2835e;

/* renamed from: d.a.r.e.b.q */
public final class C2899q<T> extends C2867a<T, T> {

    /* renamed from: g */
    final C2826d f7539g;

    /* renamed from: d.a.r.e.b.q$a */
    static final class C2900a<T> extends AtomicInteger implements C2793k<T> {

        /* renamed from: f */
        final C2793k<? super T> f7540f;

        /* renamed from: g */
        final C2835e f7541g;

        /* renamed from: h */
        final C2792j<? extends T> f7542h;

        /* renamed from: i */
        final C2826d f7543i;

        C2900a(C2793k<? super T> kVar, C2826d dVar, C2835e eVar, C2792j<? extends T> jVar) {
            this.f7540f = kVar;
            this.f7541g = eVar;
            this.f7542h = jVar;
            this.f7543i = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9009a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                do {
                    this.f7542h.mo8917a(this);
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        /* renamed from: a */
        public void mo6031a(C2810b bVar) {
            this.f7541g.mo8970a(bVar);
        }

        /* renamed from: a */
        public void mo6032a(T t) {
            this.f7540f.mo6032a(t);
        }

        /* renamed from: c */
        public void mo6033c() {
            try {
                if (this.f7543i.mo6039a()) {
                    this.f7540f.mo6033c();
                } else {
                    mo9009a();
                }
            } catch (Throwable th) {
                C2819b.m11088b(th);
                this.f7540f.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.f7540f.onError(th);
        }
    }

    public C2899q(C2790h<T> hVar, C2826d dVar) {
        super(hVar);
        this.f7539g = dVar;
    }

    /* renamed from: b */
    public void mo5871b(C2793k<? super T> kVar) {
        C2835e eVar = new C2835e();
        kVar.mo6031a((C2810b) eVar);
        new C2900a(kVar, this.f7539g, eVar, this.f7444f).mo9009a();
    }
}
