package p155d.p156a.p161p;

import p155d.p156a.p163r.p173h.C2951d;

/* renamed from: d.a.p.b */
public final class C2819b {
    /* renamed from: a */
    public static RuntimeException m11087a(Throwable th) {
        throw C2951d.m11390a(th);
    }

    /* renamed from: b */
    public static void m11088b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
