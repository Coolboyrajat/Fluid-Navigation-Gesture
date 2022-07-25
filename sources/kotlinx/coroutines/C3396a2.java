package kotlinx.coroutines;

import kotlin.p197u.C3314f;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.a2 */
public interface C3396a2<S> extends C3314f.C3317b {

    /* renamed from: kotlinx.coroutines.a2$a */
    public static final class C3397a {
        /* renamed from: a */
        public static <S, R> R m12293a(C3396a2<S> a2Var, R r, C3351c<? super R, ? super C3314f.C3317b, ? extends R> cVar) {
            C3370k.m12227b(cVar, "operation");
            return C3314f.C3317b.C3318a.m12135a(a2Var, r, cVar);
        }

        /* renamed from: a */
        public static <S, E extends C3314f.C3317b> E m12294a(C3396a2<S> a2Var, C3314f.C3319c<E> cVar) {
            C3370k.m12227b(cVar, "key");
            return C3314f.C3317b.C3318a.m12136a((C3314f.C3317b) a2Var, cVar);
        }

        /* renamed from: a */
        public static <S> C3314f m12295a(C3396a2<S> a2Var, C3314f fVar) {
            C3370k.m12227b(fVar, "context");
            return C3314f.C3317b.C3318a.m12137a((C3314f.C3317b) a2Var, fVar);
        }

        /* renamed from: b */
        public static <S> C3314f m12296b(C3396a2<S> a2Var, C3314f.C3319c<?> cVar) {
            C3370k.m12227b(cVar, "key");
            return C3314f.C3317b.C3318a.m12138b(a2Var, cVar);
        }
    }

    /* renamed from: a */
    S mo10106a(C3314f fVar);

    /* renamed from: a */
    void mo10107a(C3314f fVar, S s);
}
