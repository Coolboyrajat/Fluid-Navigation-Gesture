package kotlinx.coroutines;

import kotlin.p197u.C3314f;

public interface CoroutineExceptionHandler extends C3314f.C3317b {

    /* renamed from: c */
    public static final C3392a f8053c = C3392a.f8054a;

    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$a */
    public static final class C3392a implements C3314f.C3319c<CoroutineExceptionHandler> {

        /* renamed from: a */
        static final /* synthetic */ C3392a f8054a = new C3392a();

        private C3392a() {
        }
    }

    void handleException(C3314f fVar, Throwable th);
}
