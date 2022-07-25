package p155d.p156a.p163r.p168e.p170b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.C2790h;
import p155d.p156a.C2793k;
import p155d.p156a.C2794l;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p164a.C2832b;
import p155d.p156a.p163r.p172g.C2942o;

/* renamed from: d.a.r.e.b.l */
public final class C2890l extends C2790h<Long> {

    /* renamed from: f */
    final C2794l f7511f;

    /* renamed from: g */
    final long f7512g;

    /* renamed from: h */
    final long f7513h;

    /* renamed from: i */
    final TimeUnit f7514i;

    /* renamed from: d.a.r.e.b.l$a */
    static final class C2891a extends AtomicReference<C2810b> implements C2810b, Runnable {

        /* renamed from: f */
        final C2793k<? super Long> f7515f;

        /* renamed from: g */
        long f7516g;

        C2891a(C2793k<? super Long> kVar) {
            this.f7515f = kVar;
        }

        /* renamed from: a */
        public void mo6027a() {
            C2832b.m11099a((AtomicReference<C2810b>) this);
        }

        /* renamed from: a */
        public void mo9000a(C2810b bVar) {
            C2832b.m11103c(this, bVar);
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return get() == C2832b.DISPOSED;
        }

        public void run() {
            if (get() != C2832b.DISPOSED) {
                C2793k<? super Long> kVar = this.f7515f;
                long j = this.f7516g;
                this.f7516g = 1 + j;
                kVar.mo6032a(Long.valueOf(j));
            }
        }
    }

    public C2890l(long j, long j2, TimeUnit timeUnit, C2794l lVar) {
        this.f7512g = j;
        this.f7513h = j2;
        this.f7514i = timeUnit;
        this.f7511f = lVar;
    }

    /* renamed from: b */
    public void mo5871b(C2793k<? super Long> kVar) {
        C2891a aVar = new C2891a(kVar);
        kVar.mo6031a((C2810b) aVar);
        C2794l lVar = this.f7511f;
        if (lVar instanceof C2942o) {
            C2794l.C2797c a = lVar.mo8931a();
            aVar.mo9000a(a);
            a.mo8939a(aVar, this.f7512g, this.f7513h, this.f7514i);
            return;
        }
        aVar.mo9000a(lVar.mo8933a(aVar, this.f7512g, this.f7513h, this.f7514i));
    }
}
