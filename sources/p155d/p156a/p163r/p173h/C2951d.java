package p155d.p156a.p163r.p173h;

import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.p161p.C2814a;

/* renamed from: d.a.r.h.d */
public final class C2951d {

    /* renamed from: a */
    public static final Throwable f7679a = new C2952a();

    /* renamed from: d.a.r.h.d$a */
    static final class C2952a extends Throwable {
        C2952a() {
            super("No further exceptions");
        }

        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    public static RuntimeException m11390a(Throwable th) {
        if (!(th instanceof Error)) {
            return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
        }
        throw ((Error) th);
    }

    /* renamed from: a */
    public static <T> Throwable m11391a(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f7679a;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    /* renamed from: a */
    public static <T> boolean m11392a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = atomicReference.get();
            if (th2 == f7679a) {
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
