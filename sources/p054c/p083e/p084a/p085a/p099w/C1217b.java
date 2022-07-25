package p054c.p083e.p084a.p085a.p099w;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: c.e.a.a.w.b */
public class C1217b {
    /* renamed from: a */
    public static int m5855a(Context context, int i, String str) {
        TypedValue a = m5857a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* renamed from: a */
    public static int m5856a(View view, int i) {
        return m5855a(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* renamed from: a */
    public static TypedValue m5857a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m5858a(Context context, int i, boolean z) {
        TypedValue a = m5857a(context, i);
        return (a == null || a.type != 18) ? z : a.data != 0;
    }
}
