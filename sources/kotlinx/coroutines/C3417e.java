package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3310d;
import kotlin.p197u.C3314f;
import kotlin.p197u.C3320g;
import kotlin.p197u.p199i.p200a.C3334h;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.internal.C3484r;
import kotlinx.coroutines.internal.C3491y;
import kotlinx.coroutines.p211h2.C3432a;
import kotlinx.coroutines.p211h2.C3433b;

/* renamed from: kotlinx.coroutines.e */
final /* synthetic */ class C3417e {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static final <T> Object m12333a(C3314f fVar, C3351c<? super C3418e0, ? super C3309c<? super T>, ? extends Object> cVar, C3309c<? super T> cVar2) {
        Object obj;
        C3314f a = cVar2.mo10038a();
        C3314f plus = a.plus(fVar);
        C3428g2.m12346a(plus);
        if (plus == a) {
            C3484r rVar = new C3484r(plus, cVar2);
            obj = C3433b.m12354a(rVar, rVar, cVar);
        } else if (C3370k.m12225a((Object) (C3310d) plus.get(C3310d.f8000b), (Object) (C3310d) a.get(C3310d.f8000b))) {
            C3424f2 f2Var = new C3424f2(plus, cVar2);
            Object b = C3491y.m12595b(plus, (Object) null);
            try {
                Object a2 = C3433b.m12354a(f2Var, f2Var, cVar);
                C3491y.m12594a(plus, b);
                obj = a2;
            } catch (Throwable th) {
                C3491y.m12594a(plus, b);
                throw th;
            }
        } else {
            C3524q0 q0Var = new C3524q0(plus, cVar2);
            q0Var.mo10104q();
            C3432a.m12353a(cVar, q0Var, q0Var);
            obj = q0Var.mo10291s();
        }
        if (obj == C3326d.m12146a()) {
            C3334h.m12174c(cVar2);
        }
        return obj;
    }

    /* renamed from: a */
    public static final C3499j1 m12334a(C3418e0 e0Var, C3314f fVar, C3430h0 h0Var, C3351c<? super C3418e0, ? super C3309c<? super Unit>, ? extends Object> cVar) {
        C3370k.m12227b(e0Var, "$this$launch");
        C3370k.m12227b(fVar, "context");
        C3370k.m12227b(h0Var, "start");
        C3370k.m12227b(cVar, "block");
        C3314f a = C3550y.m12802a(e0Var, fVar);
        C3393a s1Var = h0Var.mo10149a() ? new C3534s1(a, cVar) : new C3558z1(a, true);
        s1Var.mo10096a(h0Var, s1Var, cVar);
        return s1Var;
    }

    /* renamed from: a */
    public static /* synthetic */ C3499j1 m12335a(C3418e0 e0Var, C3314f fVar, C3430h0 h0Var, C3351c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C3320g.f8003f;
        }
        if ((i & 2) != 0) {
            h0Var = C3430h0.DEFAULT;
        }
        return C3412d.m12327a(e0Var, fVar, h0Var, cVar);
    }
}
