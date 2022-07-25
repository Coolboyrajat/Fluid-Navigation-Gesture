package p006b.p026g.p031g;

import android.os.Build;
import android.os.Trace;

/* renamed from: b.g.g.a */
public final class C0798a {
    /* renamed from: a */
    public static void m4440a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static void m4441a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
