package p054c.p083e.p084a.p085a.p093q;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p006b.p026g.p027d.C0780a;
import p054c.p083e.p084a.p085a.p099w.C1217b;

/* renamed from: c.e.a.a.q.a */
public class C1207a {
    /* renamed from: a */
    public static int m5824a(int i, int i2) {
        return C0780a.m4353b(i2, i);
    }

    /* renamed from: a */
    public static int m5825a(int i, int i2, float f) {
        return m5824a(i, C0780a.m4354c(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    /* renamed from: a */
    public static int m5826a(Context context, int i, int i2) {
        TypedValue a = C1217b.m5857a(context, i);
        return a != null ? a.data : i2;
    }

    /* renamed from: a */
    public static int m5827a(Context context, int i, String str) {
        return C1217b.m5855a(context, i, str);
    }

    /* renamed from: a */
    public static int m5828a(View view, int i) {
        return C1217b.m5856a(view, i);
    }

    /* renamed from: a */
    public static int m5829a(View view, int i, int i2) {
        return m5826a(view.getContext(), i, i2);
    }

    /* renamed from: a */
    public static int m5830a(View view, int i, int i2, float f) {
        return m5825a(m5828a(view, i), m5828a(view, i2), f);
    }
}
