package kotlinx.coroutines.p211h2;

import kotlin.C3262k;
import kotlin.C3265l;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p197u.p199i.p200a.C3334h;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3359b0;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3393a;
import kotlinx.coroutines.C3529r;
import kotlinx.coroutines.C3531r1;
import kotlinx.coroutines.internal.C3485s;
import kotlinx.coroutines.internal.C3491y;

/* renamed from: kotlinx.coroutines.h2.b */
public final class C3433b {
    /* renamed from: a */
    public static final <T, R> Object m12354a(C3393a<? super T> aVar, R r, C3351c<? super R, ? super C3309c<? super T>, ? extends Object> cVar) {
        Object obj;
        C3370k.m12227b(aVar, "$this$startUndispatchedOrReturn");
        C3370k.m12227b(cVar, "block");
        aVar.mo10104q();
        try {
            C3359b0.m12198a((Object) cVar, 2);
            obj = cVar.mo6125a(r, aVar);
        } catch (Throwable th) {
            obj = new C3529r(th, false, 2, (C3366g) null);
        }
        if (obj == C3326d.m12146a() || !aVar.mo10297b(obj, 4)) {
            return C3326d.m12146a();
        }
        Object j = aVar.mo10302j();
        if (!(j instanceof C3529r)) {
            return C3531r1.m12765b(j);
        }
        throw C3485s.m12567a(aVar, ((C3529r) j).f8245a);
    }

    /* renamed from: a */
    public static final <R, T> void m12355a(C3351c<? super R, ? super C3309c<? super T>, ? extends Object> cVar, R r, C3309c<? super T> cVar2) {
        Object obj;
        C3314f a;
        Object b;
        C3370k.m12227b(cVar, "$this$startCoroutineUndispatched");
        C3370k.m12227b(cVar2, "completion");
        C3334h.m12172a(cVar2);
        try {
            a = cVar2.mo10038a();
            b = C3491y.m12595b(a, (Object) null);
            C3359b0.m12198a((Object) cVar, 2);
            obj = cVar.mo6125a(r, cVar2);
            C3491y.m12594a(a, b);
            if (obj != C3326d.m12146a()) {
                C3262k.C3263a aVar = C3262k.f7982f;
                C3262k.m11974a(obj);
                cVar2.mo10039a(obj);
            }
        } catch (Throwable th) {
            C3262k.C3263a aVar2 = C3262k.f7982f;
            obj = C3265l.m11978a(th);
        }
    }
}
