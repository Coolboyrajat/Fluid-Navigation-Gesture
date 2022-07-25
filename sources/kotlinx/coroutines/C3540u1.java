package kotlinx.coroutines;

import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.internal.C3471h;
import kotlinx.coroutines.internal.C3473j;

/* renamed from: kotlinx.coroutines.u1 */
public final class C3540u1 extends C3471h implements C3419e1 {
    /* renamed from: a */
    public final String mo10320a(String str) {
        C3370k.m12227b(str, "state");
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object e = mo10231e();
        if (e != null) {
            boolean z = true;
            for (C3473j jVar = (C3473j) e; !C3370k.m12225a((Object) jVar, (Object) this); jVar = jVar.mo10232f()) {
                if (jVar instanceof C3522p1) {
                    C3522p1 p1Var = (C3522p1) jVar;
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(p1Var);
                }
            }
            sb.append("]");
            String sb2 = sb.toString();
            C3370k.m12223a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: b */
    public boolean mo10141b() {
        return true;
    }

    /* renamed from: d */
    public C3540u1 mo10142d() {
        return this;
    }

    public String toString() {
        return C3498j0.m12620c() ? mo10320a("Active") : super.toString();
    }
}
