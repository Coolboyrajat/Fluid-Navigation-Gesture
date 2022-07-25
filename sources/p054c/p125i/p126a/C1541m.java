package p054c.p125i.p126a;

import java.util.concurrent.atomic.AtomicInteger;
import p155d.p156a.C2793k;
import p155d.p156a.p176u.C2962a;

/* renamed from: c.i.a.m */
final class C1541m {
    /* renamed from: a */
    public static void m6838a(C2793k<?> kVar, Throwable th, AtomicInteger atomicInteger, C1527c cVar) {
        if (!cVar.mo6026a(th)) {
            C2962a.m11431b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            kVar.onError(cVar.mo6025a());
        }
    }

    /* renamed from: a */
    public static void m6839a(C2793k<?> kVar, AtomicInteger atomicInteger, C1527c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable a = cVar.mo6025a();
            if (a != null) {
                kVar.onError(a);
            } else {
                kVar.mo6033c();
            }
        }
    }

    /* renamed from: a */
    public static <T> boolean m6840a(C2793k<? super T> kVar, T t, AtomicInteger atomicInteger, C1527c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            kVar.mo6032a(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable a = cVar.mo6025a();
                if (a != null) {
                    kVar.onError(a);
                } else {
                    kVar.mo6033c();
                }
                return true;
            }
        }
        return false;
    }
}
