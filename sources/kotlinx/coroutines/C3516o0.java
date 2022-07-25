package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3310d;
import kotlin.p197u.C3314f;
import kotlin.p197u.p199i.p200a.C3334h;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.o0 */
public final class C3516o0 {
    /* renamed from: a */
    public static final Object m12660a(long j, C3309c<? super Unit> cVar) {
        if (j <= 0) {
            return Unit.INSTANCE;
        }
        C3434i iVar = new C3434i(C3323c.m12142a(cVar), 1);
        m12661a(iVar.mo10038a()).mo10111a(j, iVar);
        Object f = iVar.mo10158f();
        if (f == C3326d.m12146a()) {
            C3334h.m12174c(cVar);
        }
        return f;
    }

    /* renamed from: a */
    public static final C3513n0 m12661a(C3314f fVar) {
        C3370k.m12227b(fVar, "$this$delay");
        C3314f.C3317b bVar = fVar.get(C3310d.f8000b);
        if (!(bVar instanceof C3513n0)) {
            bVar = null;
        }
        C3513n0 n0Var = (C3513n0) bVar;
        return n0Var != null ? n0Var : C3510m0.m12647a();
    }
}
