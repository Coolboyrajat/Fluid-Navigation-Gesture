package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import p006b.p026g.p027d.C0780a;

/* renamed from: androidx.appcompat.widget.m0 */
class C0207m0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1033a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1034b = {-16842910};

    /* renamed from: c */
    static final int[] f1035c = {16842908};

    /* renamed from: d */
    static final int[] f1036d = {16842919};

    /* renamed from: e */
    static final int[] f1037e = {16842912};

    /* renamed from: f */
    static final int[] f1038f = new int[0];

    /* renamed from: g */
    private static final int[] f1039g = new int[1];

    static {
        new int[1][0] = 16843518;
        new int[1][0] = 16842913;
    }

    /* renamed from: a */
    public static int m1031a(Context context, int i) {
        ColorStateList c = m1035c(context, i);
        if (c != null && c.isStateful()) {
            return c.getColorForState(f1034b, c.getDefaultColor());
        }
        TypedValue a = m1033a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m1032a(context, i, a.getFloat());
    }

    /* renamed from: a */
    static int m1032a(Context context, int i, float f) {
        int b = m1034b(context, i);
        return C0780a.m4354c(b, Math.round(((float) Color.alpha(b)) * f));
    }

    /* renamed from: a */
    private static TypedValue m1033a() {
        TypedValue typedValue = f1033a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f1033a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: b */
    public static int m1034b(Context context, int i) {
        int[] iArr = f1039g;
        iArr[0] = i;
        C0217r0 a = C0217r0.m1053a(context, (AttributeSet) null, iArr);
        try {
            return a.mo1528a(0, 0);
        } finally {
            a.mo1531a();
        }
    }

    /* renamed from: c */
    public static ColorStateList m1035c(Context context, int i) {
        int[] iArr = f1039g;
        iArr[0] = i;
        C0217r0 a = C0217r0.m1053a(context, (AttributeSet) null, iArr);
        try {
            return a.mo1529a(0);
        } finally {
            a.mo1531a();
        }
    }
}
