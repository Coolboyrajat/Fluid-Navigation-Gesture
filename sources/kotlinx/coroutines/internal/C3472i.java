package kotlinx.coroutines.internal;

import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.internal.i */
public final class C3472i {

    /* renamed from: a */
    private static final Object f8175a = new C3487u("CONDITION_FALSE");

    static {
        new C3487u("ALREADY_REMOVED");
        new C3487u("LIST_EMPTY");
        new C3487u("REMOVE_PREPARED");
    }

    /* renamed from: a */
    public static final Object m12511a() {
        return f8175a;
    }

    /* renamed from: a */
    public static final C3473j m12512a(Object obj) {
        C3473j jVar;
        C3370k.m12227b(obj, "$this$unwrap");
        C3483q qVar = (C3483q) (!(obj instanceof C3483q) ? null : obj);
        return (qVar == null || (jVar = qVar.f8195a) == null) ? (C3473j) obj : jVar;
    }
}
