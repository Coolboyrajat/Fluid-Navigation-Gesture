package p006b.p026g.p035k.p036e0;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: b.g.k.e0.b */
public final class C0856b {
    /* renamed from: a */
    public static int m4597a(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m4598a(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
