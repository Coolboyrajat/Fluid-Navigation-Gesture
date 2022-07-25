package p179e.p184b.p185a;

import java.util.Collection;
import java.util.List;
import kotlin.p205x.p207d.C3370k;

/* renamed from: e.b.a.g0 */
public interface C2999g0<T> {

    /* renamed from: e.b.a.g0$a */
    public static final class C3000a {
        /* renamed from: a */
        public static <T> boolean m11524a(C2999g0<T> g0Var, C2999g0<?> g0Var2) {
            C3370k.m12227b(g0Var2, "typeToken");
            if (C3370k.m12225a((Object) g0Var, (Object) g0Var2) || C3370k.m12225a((Object) g0Var, (Object) C3002h0.m11525a())) {
                return true;
            }
            C2999g0<T> c = g0Var.mo9117c();
            if (c == null || !C3370k.m12225a((Object) c, (Object) g0Var2.mo9117c())) {
                List<C2999g0<?>> e = g0Var2.mo9118e();
                if ((e instanceof Collection) && e.isEmpty()) {
                    return false;
                }
                for (C2999g0 a : e) {
                    if (g0Var.mo9115a((C2999g0<?>) a)) {
                        return true;
                    }
                }
                return false;
            }
            C2999g0[] b = g0Var.mo9116b();
            if (b.length == 0) {
                return true;
            }
            C2999g0[] b2 = g0Var2.mo9116b();
            int length = b.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                if (!b[i].mo9115a((C2999g0<?>) b2[i2])) {
                    return false;
                }
                i++;
                i2 = i3;
            }
            return true;
        }
    }

    /* renamed from: a */
    String mo9122a();

    /* renamed from: a */
    void mo9114a(Object obj);

    /* renamed from: a */
    boolean mo9115a(C2999g0<?> g0Var);

    /* renamed from: b */
    C2999g0<?>[] mo9116b();

    /* renamed from: c */
    C2999g0<T> mo9117c();

    /* renamed from: d */
    String mo9123d();

    /* renamed from: e */
    List<C2999g0<?>> mo9118e();
}
