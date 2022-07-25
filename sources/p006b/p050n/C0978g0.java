package p006b.p050n;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.n.g0 */
class C0978g0 extends C0976f0 {

    /* renamed from: i */
    private static Method f3484i;

    /* renamed from: j */
    private static boolean f3485j;

    C0978g0() {
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private void m5114a() {
        if (!f3485j) {
            try {
                f3484i = View.class.getDeclaredMethod("setLeftTopRightBottom", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                f3484i.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e);
            }
            f3485j = true;
        }
    }

    /* renamed from: a */
    public void mo4869a(View view, int i, int i2, int i3, int i4) {
        m5114a();
        Method method = f3484i;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
