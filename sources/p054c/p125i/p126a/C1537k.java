package p054c.p125i.p126a;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p054c.p125i.p126a.p130s.C1558a;
import p155d.p156a.C2786d;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p174s.C2958a;

/* renamed from: c.i.a.k */
final class C1537k<T> extends AtomicInteger implements C1558a<T> {

    /* renamed from: f */
    final AtomicReference<C2810b> f4576f = new AtomicReference<>();

    /* renamed from: g */
    final AtomicReference<C2810b> f4577g = new AtomicReference<>();

    /* renamed from: h */
    private final C1527c f4578h = new C1527c();

    /* renamed from: i */
    private final C2786d f4579i;

    /* renamed from: j */
    private final C2793k<? super T> f4580j;

    /* renamed from: c.i.a.k$a */
    class C1538a extends C2958a {
        C1538a() {
        }

        /* renamed from: c */
        public void mo6035c() {
            C1537k.this.f4577g.lazySet(C1528d.DISPOSED);
            C1528d.m6814a(C1537k.this.f4576f);
        }

        public void onError(Throwable th) {
            C1537k.this.f4577g.lazySet(C1528d.DISPOSED);
            C1537k.this.onError(th);
        }
    }

    C1537k(C2786d dVar, C2793k<? super T> kVar) {
        this.f4579i = dVar;
        this.f4580j = kVar;
    }

    /* renamed from: a */
    public void mo6027a() {
        C1528d.m6814a(this.f4577g);
        C1528d.m6814a(this.f4576f);
    }

    /* renamed from: a */
    public void mo6031a(C2810b bVar) {
        C1538a aVar = new C1538a();
        if (C1533g.m6825a(this.f4577g, aVar, C1537k.class)) {
            this.f4580j.mo6031a((C2810b) this);
            this.f4579i.mo8898a(aVar);
            C1533g.m6825a(this.f4576f, bVar, C1537k.class);
        }
    }

    /* renamed from: a */
    public void mo6032a(T t) {
        if (!mo6028b() && C1541m.m6840a(this.f4580j, t, (AtomicInteger) this, this.f4578h)) {
            this.f4576f.lazySet(C1528d.DISPOSED);
            C1528d.m6814a(this.f4577g);
        }
    }

    /* renamed from: b */
    public boolean mo6028b() {
        return this.f4576f.get() == C1528d.DISPOSED;
    }

    /* renamed from: c */
    public void mo6033c() {
        if (!mo6028b()) {
            this.f4576f.lazySet(C1528d.DISPOSED);
            C1528d.m6814a(this.f4577g);
            C1541m.m6839a(this.f4580j, this, this.f4578h);
        }
    }

    public void onError(Throwable th) {
        if (!mo6028b()) {
            this.f4576f.lazySet(C1528d.DISPOSED);
            C1528d.m6814a(this.f4577g);
            C1541m.m6838a((C2793k<?>) this.f4580j, th, (AtomicInteger) this, this.f4578h);
        }
    }
}
