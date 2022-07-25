package kotlinx.coroutines;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

/* renamed from: kotlinx.coroutines.a0 */
public final class C3394a0 {

    /* renamed from: a */
    private static final List<CoroutineExceptionHandler> f8057a;

    static {
        Iterator it = Arrays.asList(new CoroutineExceptionHandler[]{new AndroidExceptionPreHandler()}).iterator();
        C3370k.m12223a((Object) it, "ServiceLoader.load(\n    ….classLoader\n).iterator()");
        f8057a = C3228j.m11886d(C3225h.m11875a(it));
    }

    /* renamed from: a */
    public static final void m12289a(C3314f fVar, Throwable th) {
        C3370k.m12227b(fVar, "context");
        C3370k.m12227b(th, "exception");
        for (CoroutineExceptionHandler handleException : f8057a) {
            try {
                handleException.handleException(fVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                C3370k.m12223a((Object) currentThread, "currentThread");
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C3404b0.m12304a(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        C3370k.m12223a((Object) currentThread2, "currentThread");
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
