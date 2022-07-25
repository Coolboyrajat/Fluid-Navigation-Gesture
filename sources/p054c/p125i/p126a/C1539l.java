package p054c.p125i.p126a;

import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.p161p.C2814a;

/* renamed from: c.i.a.l */
final class C1539l {

    /* renamed from: a */
    private static final Throwable f4582a = new C1540a();

    /* renamed from: c.i.a.l$a */
    static final class C1540a extends Throwable {
        C1540a() {
            super("No further exceptions");
        }

        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    static Throwable m6836a(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f4582a;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    /* renamed from: a */
    static boolean m6837a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = atomicReference.get();
            if (th2 == f4582a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new C2814a(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }
}
