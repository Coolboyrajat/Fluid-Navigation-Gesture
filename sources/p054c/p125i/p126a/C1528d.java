package p054c.p125i.p126a;

import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.p160o.C2810b;

/* renamed from: c.i.a.d */
enum C1528d implements C2810b {
    DISPOSED;

    /* renamed from: a */
    static boolean m6814a(AtomicReference<C2810b> atomicReference) {
        C2810b andSet;
        C2810b bVar = atomicReference.get();
        C1528d dVar = DISPOSED;
        if (bVar == dVar || (andSet = atomicReference.getAndSet(dVar)) == dVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.mo6027a();
        return true;
    }

    /* renamed from: a */
    public void mo6027a() {
    }

    /* renamed from: b */
    public boolean mo6028b() {
        return true;
    }
}
