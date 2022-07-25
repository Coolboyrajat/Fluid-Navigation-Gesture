package p155d.p156a.p163r.p168e.p170b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.C2790h;
import p155d.p156a.C2793k;
import p155d.p156a.C2794l;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p164a.C2832b;
import p155d.p156a.p163r.p164a.C2833c;

/* renamed from: d.a.r.e.b.y */
public final class C2915y extends C2790h<Long> {

    /* renamed from: f */
    final C2794l f7580f;

    /* renamed from: g */
    final long f7581g;

    /* renamed from: h */
    final TimeUnit f7582h;

    /* renamed from: d.a.r.e.b.y$a */
    static final class C2916a extends AtomicReference<C2810b> implements C2810b, Runnable {

        /* renamed from: f */
        final C2793k<? super Long> f7583f;

        C2916a(C2793k<? super Long> kVar) {
            this.f7583f = kVar;
        }

        /* renamed from: a */
        public void mo6027a() {
            C2832b.m11099a((AtomicReference<C2810b>) this);
        }

        /* renamed from: a */
        public void mo9014a(C2810b bVar) {
            C2832b.m11104d(this, bVar);
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return get() == C2832b.DISPOSED;
        }

        public void run() {
            if (!mo6028b()) {
                this.f7583f.mo6032a(0L);
                lazySet(C2833c.INSTANCE);
                this.f7583f.mo6033c();
            }
        }
    }

    public C2915y(long j, TimeUnit timeUnit, C2794l lVar) {
        this.f7581g = j;
        this.f7582h = timeUnit;
        this.f7580f = lVar;
    }

    /* renamed from: b */
    public void mo5871b(C2793k<? super Long> kVar) {
        C2916a aVar = new C2916a(kVar);
        kVar.mo6031a((C2810b) aVar);
        aVar.mo9014a(this.f7580f.mo8934a(aVar, this.f7581g, this.f7582h));
    }
}
