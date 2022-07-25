package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.p197u.C3314f;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: kotlinx.coroutines.j1 */
public interface C3499j1 extends C3314f.C3317b {

    /* renamed from: d */
    public static final C3501b f8214d = C3501b.f8215a;

    /* renamed from: kotlinx.coroutines.j1$a */
    public static final class C3500a {
        /* renamed from: a */
        public static <R> R m12627a(C3499j1 j1Var, R r, C3351c<? super R, ? super C3314f.C3317b, ? extends R> cVar) {
            C3370k.m12227b(cVar, "operation");
            return C3314f.C3317b.C3318a.m12135a(j1Var, r, cVar);
        }

        /* renamed from: a */
        public static <E extends C3314f.C3317b> E m12628a(C3499j1 j1Var, C3314f.C3319c<E> cVar) {
            C3370k.m12227b(cVar, "key");
            return C3314f.C3317b.C3318a.m12136a((C3314f.C3317b) j1Var, cVar);
        }

        /* renamed from: a */
        public static C3314f m12629a(C3499j1 j1Var, C3314f fVar) {
            C3370k.m12227b(fVar, "context");
            return C3314f.C3317b.C3318a.m12137a((C3314f.C3317b) j1Var, fVar);
        }

        /* renamed from: a */
        public static /* synthetic */ C3539u0 m12630a(C3499j1 j1Var, boolean z, boolean z2, C3350b bVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return j1Var.mo10270a(z, z2, bVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: a */
        public static /* synthetic */ void m12631a(C3499j1 j1Var, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                j1Var.mo10271a(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static C3314f m12632b(C3499j1 j1Var, C3314f.C3319c<?> cVar) {
            C3370k.m12227b(cVar, "key");
            return C3314f.C3317b.C3318a.m12138b(j1Var, cVar);
        }
    }

    /* renamed from: kotlinx.coroutines.j1$b */
    public static final class C3501b implements C3314f.C3319c<C3499j1> {

        /* renamed from: a */
        static final /* synthetic */ C3501b f8215a = new C3501b();

        static {
            CoroutineExceptionHandler.C3392a aVar = CoroutineExceptionHandler.f8053c;
        }

        private C3501b() {
        }
    }

    /* renamed from: a */
    C3509m mo10269a(C3515o oVar);

    /* renamed from: a */
    C3539u0 mo10270a(boolean z, boolean z2, C3350b<? super Throwable, Unit> bVar);

    /* renamed from: a */
    void mo10271a(CancellationException cancellationException);

    /* renamed from: b */
    boolean mo10097b();

    /* renamed from: d */
    CancellationException mo10272d();

    boolean start();
}
