package p054c.p125i.p126a;

import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p161p.C2821d;
import p155d.p156a.p176u.C2962a;

/* renamed from: c.i.a.g */
final class C1533g {
    /* renamed from: a */
    public static String m6823a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    /* renamed from: a */
    public static void m6824a(Class<?> cls) {
        C2962a.m11431b((Throwable) new C2821d(m6823a(cls.getName())));
    }

    /* renamed from: a */
    public static boolean m6825a(AtomicReference<C2810b> atomicReference, C2810b bVar, Class<?> cls) {
        C1536j.m6829a(bVar, "next is null");
        if (atomicReference.compareAndSet((Object) null, bVar)) {
            return true;
        }
        bVar.mo6027a();
        if (atomicReference.get() == C1528d.DISPOSED) {
            return false;
        }
        m6824a(cls);
        return false;
    }
}
