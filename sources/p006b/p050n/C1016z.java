package p006b.p050n;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.n.z */
class C1016z {

    /* renamed from: a */
    private static Method f3586a;

    /* renamed from: b */
    private static boolean f3587b;

    /* renamed from: a */
    private static void m5265a() {
        if (!f3587b) {
            try {
                f3586a = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                f3586a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
            }
            f3587b = true;
        }
    }

    /* renamed from: a */
    static void m5266a(ViewGroup viewGroup, boolean z) {
        String str;
        m5265a();
        Method method = f3586a;
        if (method != null) {
            try {
                method.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
                return;
            } catch (IllegalAccessException e) {
                e = e;
                str = "Failed to invoke suppressLayout method";
            } catch (InvocationTargetException e2) {
                e = e2;
                str = "Error invoking suppressLayout method";
            }
        } else {
            return;
        }
        Log.i("ViewUtilsApi18", str, e);
    }
}
