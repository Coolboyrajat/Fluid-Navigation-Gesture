package p155d.p156a.p163r.p173h;

import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p161p.C2821d;
import p155d.p156a.p163r.p164a.C2832b;
import p155d.p156a.p163r.p165b.C2849b;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.r.h.c */
public final class C2950c {
    /* renamed from: a */
    public static String m11387a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    /* renamed from: a */
    public static void m11388a(Class<?> cls) {
        C2962a.m11431b((Throwable) new C2821d(m11387a(cls.getName())));
    }

    /* renamed from: a */
    public static boolean m11389a(AtomicReference<C2810b> atomicReference, C2810b bVar, Class<?> cls) {
        C2849b.m11138a(bVar, "next is null");
        if (atomicReference.compareAndSet((Object) null, bVar)) {
            return true;
        }
        bVar.mo6027a();
        if (atomicReference.get() == C2832b.DISPOSED) {
            return false;
        }
        m11388a(cls);
        return false;
    }
}
