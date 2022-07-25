package kotlin.p204w;

import java.io.Closeable;

/* renamed from: kotlin.w.a */
public final class C3346a {
    /* renamed from: a */
    public static final void m12185a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C3199b.m11853a(th, th2);
            }
        }
    }
}
