package p006b.p050n;

import android.animation.LayoutTransition;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.n.y */
class C1014y {

    /* renamed from: a */
    private static LayoutTransition f3581a;

    /* renamed from: b */
    private static Field f3582b;

    /* renamed from: c */
    private static boolean f3583c;

    /* renamed from: d */
    private static Method f3584d;

    /* renamed from: e */
    private static boolean f3585e;

    /* renamed from: b.n.y$a */
    static class C1015a extends LayoutTransition {
        C1015a() {
        }

        public boolean isChangingLayout() {
            return true;
        }
    }

    /* renamed from: a */
    private static void m5263a(LayoutTransition layoutTransition) {
        if (!f3585e) {
            try {
                f3584d = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f3584d.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f3585e = true;
        }
        Method method = f3584d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m5264a(android.view.ViewGroup r5, boolean r6) {
        /*
            android.animation.LayoutTransition r0 = f3581a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x002a
            b.n.y$a r0 = new b.n.y$a
            r0.<init>()
            f3581a = r0
            android.animation.LayoutTransition r0 = f3581a
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = f3581a
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = f3581a
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = f3581a
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = f3581a
            r4 = 4
            r0.setAnimator(r4, r3)
        L_0x002a:
            if (r6 == 0) goto L_0x004a
            android.animation.LayoutTransition r6 = r5.getLayoutTransition()
            if (r6 == 0) goto L_0x0044
            boolean r0 = r6.isRunning()
            if (r0 == 0) goto L_0x003b
            m5263a(r6)
        L_0x003b:
            android.animation.LayoutTransition r0 = f3581a
            if (r6 == r0) goto L_0x0044
            int r0 = p006b.p050n.C0986j.transition_layout_save
            r5.setTag(r0, r6)
        L_0x0044:
            android.animation.LayoutTransition r6 = f3581a
        L_0x0046:
            r5.setLayoutTransition(r6)
            goto L_0x0098
        L_0x004a:
            r5.setLayoutTransition(r3)
            boolean r6 = f3583c
            java.lang.String r0 = "ViewGroupUtilsApi14"
            if (r6 != 0) goto L_0x006a
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r4 = "mLayoutSuppressed"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r4)     // Catch:{ NoSuchFieldException -> 0x0063 }
            f3582b = r6     // Catch:{ NoSuchFieldException -> 0x0063 }
            java.lang.reflect.Field r6 = f3582b     // Catch:{ NoSuchFieldException -> 0x0063 }
            r6.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x0063 }
            goto L_0x0068
        L_0x0063:
            java.lang.String r6 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L_0x0068:
            f3583c = r1
        L_0x006a:
            java.lang.reflect.Field r6 = f3582b
            if (r6 == 0) goto L_0x0083
            boolean r6 = r6.getBoolean(r5)     // Catch:{ IllegalAccessException -> 0x007e }
            if (r6 == 0) goto L_0x007c
            java.lang.reflect.Field r1 = f3582b     // Catch:{ IllegalAccessException -> 0x007a }
            r1.setBoolean(r5, r2)     // Catch:{ IllegalAccessException -> 0x007a }
            goto L_0x007c
        L_0x007a:
            r2 = r6
            goto L_0x007e
        L_0x007c:
            r2 = r6
            goto L_0x0083
        L_0x007e:
            java.lang.String r6 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L_0x0083:
            if (r2 == 0) goto L_0x0088
            r5.requestLayout()
        L_0x0088:
            int r6 = p006b.p050n.C0986j.transition_layout_save
            java.lang.Object r6 = r5.getTag(r6)
            android.animation.LayoutTransition r6 = (android.animation.LayoutTransition) r6
            if (r6 == 0) goto L_0x0098
            int r0 = p006b.p050n.C0986j.transition_layout_save
            r5.setTag(r0, r3)
            goto L_0x0046
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p050n.C1014y.m5264a(android.view.ViewGroup, boolean):void");
    }
}
