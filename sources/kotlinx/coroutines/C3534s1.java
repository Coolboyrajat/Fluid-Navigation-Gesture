package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.p211h2.C3432a;

/* renamed from: kotlinx.coroutines.s1 */
final class C3534s1 extends C3558z1 {

    /* renamed from: i */
    private C3351c<? super C3418e0, ? super C3309c<? super Unit>, ? extends Object> f8251i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3534s1(C3314f fVar, C3351c<? super C3418e0, ? super C3309c<? super Unit>, ? extends Object> cVar) {
        super(fVar, false);
        C3370k.m12227b(fVar, "parentContext");
        C3370k.m12227b(cVar, "block");
        this.f8251i = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo10105r() {
        C3351c<? super C3418e0, ? super C3309c<? super Unit>, ? extends Object> cVar = this.f8251i;
        if (cVar != null) {
            this.f8251i = null;
            C3432a.m12353a(cVar, this, this);
            return;
        }
        throw new IllegalStateException("Already started".toString());
    }
}
