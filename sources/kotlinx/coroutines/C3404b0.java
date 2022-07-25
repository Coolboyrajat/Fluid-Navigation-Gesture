package kotlinx.coroutines;

import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.b0 */
public final class C3404b0 {
    /* renamed from: a */
    public static final Throwable m12304a(Throwable th, Throwable th2) {
        C3370k.m12227b(th, "originalException");
        C3370k.m12227b(th2, "thrownException");
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C3199b.m11853a(runtimeException, th);
        return runtimeException;
    }

    /* renamed from: a */
    public static final void m12305a(C3314f fVar, Throwable th) {
        C3370k.m12227b(fVar, "context");
        C3370k.m12227b(th, "exception");
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) fVar.get(CoroutineExceptionHandler.f8053c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(fVar, th);
            } else {
                C3394a0.m12289a(fVar, th);
            }
        } catch (Throwable th2) {
            C3394a0.m12289a(fVar, m12304a(th, th2));
        }
    }
}
