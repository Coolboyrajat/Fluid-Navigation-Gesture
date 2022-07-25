package androidx.activity;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0488m;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements C0488m {

    /* renamed from: g */
    private static int f10g;

    /* renamed from: h */
    private static Field f11h;

    /* renamed from: i */
    private static Field f12i;

    /* renamed from: j */
    private static Field f13j;

    /* renamed from: f */
    private Activity f14f;

    ImmLeaksCleaner(Activity activity) {
        this.f14f = activity;
    }

    /* renamed from: a */
    private static void m16a() {
        try {
            f10g = 2;
            f12i = InputMethodManager.class.getDeclaredField("mServedView");
            f12i.setAccessible(true);
            f13j = InputMethodManager.class.getDeclaredField("mNextServedView");
            f13j.setAccessible(true);
            f11h = InputMethodManager.class.getDeclaredField("mH");
            f11h.setAccessible(true);
            f10g = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0044 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14a(androidx.lifecycle.C0490o r3, androidx.lifecycle.C0481i.C0482a r4) {
        /*
            r2 = this;
            androidx.lifecycle.i$a r3 = androidx.lifecycle.C0481i.C0482a.ON_DESTROY
            if (r4 == r3) goto L_0x0005
            return
        L_0x0005:
            int r3 = f10g
            if (r3 != 0) goto L_0x000c
            m16a()
        L_0x000c:
            int r3 = f10g
            r4 = 1
            if (r3 != r4) goto L_0x004e
            android.app.Activity r3 = r2.f14f
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = f11h     // Catch:{ IllegalAccessException -> 0x004e }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x004e }
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = f12i     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            if (r0 != 0) goto L_0x0031
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0031:
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0039
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0039:
            java.lang.reflect.Field r0 = f13j     // Catch:{ IllegalAccessException -> 0x0044 }
            r1 = 0
            r0.set(r3, r1)     // Catch:{ IllegalAccessException -> 0x0044 }
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            r3.isActive()
            goto L_0x004e
        L_0x0044:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r3 = move-exception
            goto L_0x004c
        L_0x0048:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x004a:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x004c:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            throw r3
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.mo14a(androidx.lifecycle.o, androidx.lifecycle.i$a):void");
    }
}
