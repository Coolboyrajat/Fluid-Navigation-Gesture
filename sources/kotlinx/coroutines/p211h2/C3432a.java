package kotlinx.coroutines.p211h2;

import kotlin.C3262k;
import kotlin.C3265l;
import kotlin.Unit;
import kotlin.p197u.C3309c;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3530r0;

/* renamed from: kotlinx.coroutines.h2.a */
public final class C3432a {
    /* renamed from: a */
    public static final <R, T> void m12353a(C3351c<? super R, ? super C3309c<? super T>, ? extends Object> cVar, R r, C3309c<? super T> cVar2) {
        C3370k.m12227b(cVar, "$this$startCoroutineCancellable");
        C3370k.m12227b(cVar2, "completion");
        try {
            C3530r0.m12756a(C3323c.m12142a(C3323c.m12143a(cVar, r, cVar2)), Unit.INSTANCE);
        } catch (Throwable th) {
            C3262k.C3263a aVar = C3262k.f7982f;
            Object a = C3265l.m11978a(th);
            C3262k.m11974a(a);
            cVar2.mo10039a(a);
        }
    }
}
