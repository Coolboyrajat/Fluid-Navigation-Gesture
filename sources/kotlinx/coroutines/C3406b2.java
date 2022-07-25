package kotlinx.coroutines;

import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.b2 */
public final class C3406b2 {

    /* renamed from: a */
    private static final ThreadLocal<C3548x0> f8068a = new ThreadLocal<>();

    /* renamed from: b */
    public static final C3406b2 f8069b = new C3406b2();

    private C3406b2() {
    }

    /* renamed from: a */
    public final C3548x0 mo10120a() {
        C3548x0 x0Var = f8068a.get();
        if (x0Var != null) {
            return x0Var;
        }
        C3548x0 a = C3395a1.m12290a();
        f8068a.set(a);
        return a;
    }

    /* renamed from: a */
    public final void mo10121a(C3548x0 x0Var) {
        C3370k.m12227b(x0Var, "eventLoop");
        f8068a.set(x0Var);
    }

    /* renamed from: b */
    public final void mo10122b() {
        f8068a.set((Object) null);
    }
}
