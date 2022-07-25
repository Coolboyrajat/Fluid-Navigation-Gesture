package kotlinx.coroutines;

import kotlin.C3260i;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3313e;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.p211h2.C3432a;
import kotlinx.coroutines.p211h2.C3433b;

/* renamed from: kotlinx.coroutines.h0 */
public enum C3430h0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: a */
    public final <R, T> void mo10148a(C3351c<? super R, ? super C3309c<? super T>, ? extends Object> cVar, R r, C3309c<? super T> cVar2) {
        C3370k.m12227b(cVar, "block");
        C3370k.m12227b(cVar2, "completion");
        int i = C3426g0.f8080b[ordinal()];
        if (i == 1) {
            C3432a.m12353a(cVar, r, cVar2);
        } else if (i == 2) {
            C3313e.m12131a(cVar, r, cVar2);
        } else if (i == 3) {
            C3433b.m12355a(cVar, r, cVar2);
        } else if (i != 4) {
            throw new C3260i();
        }
    }

    /* renamed from: a */
    public final boolean mo10149a() {
        return this == LAZY;
    }
}
