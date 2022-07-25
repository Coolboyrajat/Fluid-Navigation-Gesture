package p006b.p050n;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.n.f0 */
class C0976f0 extends C0974e0 {

    /* renamed from: e */
    private static Method f3480e;

    /* renamed from: f */
    private static boolean f3481f;

    /* renamed from: g */
    private static Method f3482g;

    /* renamed from: h */
    private static boolean f3483h;

    C0976f0() {
    }

    /* renamed from: a */
    private void m5109a() {
        if (!f3481f) {
            try {
                f3480e = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f3480e.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e);
            }
            f3481f = true;
        }
    }

    /* renamed from: b */
    private void m5110b() {
        if (!f3483h) {
            try {
                f3482g = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                f3482g.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e);
            }
            f3483h = true;
        }
    }

    /* renamed from: a */
    public void mo4866a(View view, Matrix matrix) {
        m5109a();
        Method method = f3480e;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: b */
    public void mo4867b(View view, Matrix matrix) {
        m5110b();
        Method method = f3482g;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
