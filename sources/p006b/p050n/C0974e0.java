package p006b.p050n;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.n.e0 */
class C0974e0 extends C0980h0 {

    /* renamed from: a */
    private static Method f3476a;

    /* renamed from: b */
    private static boolean f3477b;

    /* renamed from: c */
    private static Method f3478c;

    /* renamed from: d */
    private static boolean f3479d;

    C0974e0() {
    }

    /* renamed from: a */
    private void m5102a() {
        if (!f3479d) {
            try {
                f3478c = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f3478c.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            f3479d = true;
        }
    }

    /* renamed from: b */
    private void m5103b() {
        if (!f3477b) {
            try {
                f3476a = View.class.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f3476a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            f3477b = true;
        }
    }

    /* renamed from: a */
    public void mo4862a(View view) {
    }

    /* renamed from: a */
    public void mo4863a(View view, float f) {
        m5103b();
        Method method = f3476a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Float.valueOf(f)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: b */
    public float mo4864b(View view) {
        m5102a();
        Method method = f3478c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return super.mo4864b(view);
    }

    /* renamed from: c */
    public void mo4865c(View view) {
    }
}
