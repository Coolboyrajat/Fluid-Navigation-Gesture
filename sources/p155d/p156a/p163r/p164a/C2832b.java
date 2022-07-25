package p155d.p156a.p163r.p164a;

import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p161p.C2821d;
import p155d.p156a.p163r.p165b.C2849b;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.r.a.b */
public enum C2832b implements C2810b {
    DISPOSED;

    /* renamed from: a */
    public static boolean m11097a(C2810b bVar) {
        return bVar == DISPOSED;
    }

    /* renamed from: a */
    public static boolean m11098a(C2810b bVar, C2810b bVar2) {
        if (bVar2 == null) {
            C2962a.m11431b((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (bVar == null) {
            return true;
        } else {
            bVar2.mo6027a();
            m11102c();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m11099a(AtomicReference<C2810b> atomicReference) {
        C2810b andSet;
        C2810b bVar = atomicReference.get();
        C2832b bVar2 = DISPOSED;
        if (bVar == bVar2 || (andSet = atomicReference.getAndSet(bVar2)) == bVar2) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.mo6027a();
        return true;
    }

    /* renamed from: a */
    public static boolean m11100a(AtomicReference<C2810b> atomicReference, C2810b bVar) {
        C2810b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.mo6027a();
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        return true;
    }

    /* renamed from: b */
    public static boolean m11101b(AtomicReference<C2810b> atomicReference, C2810b bVar) {
        C2810b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.mo6027a();
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        if (bVar2 == null) {
            return true;
        }
        bVar2.mo6027a();
        return true;
    }

    /* renamed from: c */
    public static void m11102c() {
        C2962a.m11431b((Throwable) new C2821d("Disposable already set!"));
    }

    /* renamed from: c */
    public static boolean m11103c(AtomicReference<C2810b> atomicReference, C2810b bVar) {
        C2849b.m11138a(bVar, "d is null");
        if (atomicReference.compareAndSet((Object) null, bVar)) {
            return true;
        }
        bVar.mo6027a();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        m11102c();
        return false;
    }

    /* renamed from: d */
    public static boolean m11104d(AtomicReference<C2810b> atomicReference, C2810b bVar) {
        if (atomicReference.compareAndSet((Object) null, bVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        bVar.mo6027a();
        return false;
    }

    /* renamed from: a */
    public void mo6027a() {
    }

    /* renamed from: b */
    public boolean mo6028b() {
        return true;
    }
}
