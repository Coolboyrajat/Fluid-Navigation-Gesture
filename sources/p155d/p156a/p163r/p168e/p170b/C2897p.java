package p155d.p156a.p163r.p168e.p170b;

import java.util.concurrent.atomic.AtomicInteger;
import p155d.p156a.C2790h;
import p155d.p156a.C2792j;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p164a.C2835e;

/* renamed from: d.a.r.e.b.p */
public final class C2897p<T> extends C2867a<T, T> {

    /* renamed from: g */
    final long f7534g;

    /* renamed from: d.a.r.e.b.p$a */
    static final class C2898a<T> extends AtomicInteger implements C2793k<T> {

        /* renamed from: f */
        final C2793k<? super T> f7535f;

        /* renamed from: g */
        final C2835e f7536g;

        /* renamed from: h */
        final C2792j<? extends T> f7537h;

        /* renamed from: i */
        long f7538i;

        C2898a(C2793k<? super T> kVar, long j, C2835e eVar, C2792j<? extends T> jVar) {
            this.f7535f = kVar;
            this.f7536g = eVar;
            this.f7537h = jVar;
            this.f7538i = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9008a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f7536g.mo6028b()) {
                    this.f7537h.mo8917a(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo6031a(C2810b bVar) {
            this.f7536g.mo8970a(bVar);
        }

        /* renamed from: a */
        public void mo6032a(T t) {
            this.f7535f.mo6032a(t);
        }

        /* renamed from: c */
        public void mo6033c() {
            long j = this.f7538i;
            if (j != Long.MAX_VALUE) {
                this.f7538i = j - 1;
            }
            if (j != 0) {
                mo9008a();
            } else {
                this.f7535f.mo6033c();
            }
        }

        public void onError(Throwable th) {
            this.f7535f.onError(th);
        }
    }

    public C2897p(C2790h<T> hVar, long j) {
        super(hVar);
        this.f7534g = j;
    }

    /* renamed from: b */
    public void mo5871b(C2793k<? super T> kVar) {
        C2835e eVar = new C2835e();
        kVar.mo6031a((C2810b) eVar);
        long j = this.f7534g;
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j - 1;
        }
        new C2898a(kVar, j2, eVar, this.f7444f).mo9008a();
    }
}
