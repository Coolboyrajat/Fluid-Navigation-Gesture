package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.z1 */
class C3558z1 extends C3393a<Unit> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3558z1(C3314f fVar, boolean z) {
        super(fVar, z);
        C3370k.m12227b(fVar, "parentContext");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo10299c(Throwable th) {
        C3370k.m12227b(th, "exception");
        C3404b0.m12305a(mo10038a(), th);
        return true;
    }
}
