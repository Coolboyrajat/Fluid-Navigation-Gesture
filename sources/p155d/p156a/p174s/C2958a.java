package p155d.p156a.p174s;

import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.C2785c;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p164a.C2832b;
import p155d.p156a.p163r.p173h.C2950c;

/* renamed from: d.a.s.a */
public abstract class C2958a implements C2785c, C2810b {

    /* renamed from: f */
    final AtomicReference<C2810b> f7689f = new AtomicReference<>();

    /* renamed from: a */
    public final void mo6027a() {
        C2832b.m11099a(this.f7689f);
    }

    /* renamed from: a */
    public final void mo8900a(C2810b bVar) {
        if (C2950c.m11389a(this.f7689f, bVar, getClass())) {
            mo9067d();
        }
    }

    /* renamed from: b */
    public final boolean mo6028b() {
        return this.f7689f.get() == C2832b.DISPOSED;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo9067d() {
    }
}
