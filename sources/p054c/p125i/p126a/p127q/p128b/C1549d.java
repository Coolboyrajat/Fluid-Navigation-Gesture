package p054c.p125i.p126a.p127q.p128b;

import java.util.concurrent.atomic.AtomicBoolean;
import p155d.p156a.p157n.p159c.C2803a;
import p155d.p156a.p160o.C2810b;

/* renamed from: c.i.a.q.b.d */
public abstract class C1549d implements C2810b {

    /* renamed from: f */
    private final AtomicBoolean f4587f = new AtomicBoolean();

    /* renamed from: a */
    public final void mo6027a() {
        if (!this.f4587f.compareAndSet(false, true)) {
            return;
        }
        if (C1548c.m6845a()) {
            mo6041c();
        } else {
            C2803a.m11054a().mo8932a(new C1547b(this));
        }
    }

    /* renamed from: b */
    public final boolean mo6028b() {
        return this.f4587f.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo6041c();
}
