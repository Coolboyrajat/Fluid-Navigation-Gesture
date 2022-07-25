package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.z */
public abstract class C0508z {

    /* renamed from: f */
    private final Map<String, Object> f2083f = new HashMap();

    /* renamed from: a */
    private static void m2498a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2738a() {
        Map<String, Object> map = this.f2083f;
        if (map != null) {
            synchronized (map) {
                for (Object a : this.f2083f.values()) {
                    m2498a(a);
                }
            }
        }
        mo2564f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo2564f() {
    }
}
