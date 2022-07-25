package kotlinx.coroutines;

import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3499j1;

/* renamed from: kotlinx.coroutines.p1 */
public abstract class C3522p1<J extends C3499j1> extends C3541v implements C3539u0, C3419e1 {

    /* renamed from: i */
    public final J f8234i;

    public C3522p1(J j) {
        C3370k.m12227b(j, "job");
        this.f8234i = j;
    }

    /* renamed from: a */
    public void mo10290a() {
        J j = this.f8234i;
        if (j != null) {
            ((C3525q1) j).mo10294a((C3522p1<?>) this);
            return;
        }
        throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
    }

    /* renamed from: b */
    public boolean mo10141b() {
        return true;
    }

    /* renamed from: d */
    public C3540u1 mo10142d() {
        return null;
    }
}
