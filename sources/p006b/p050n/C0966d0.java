package p006b.p050n;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;
import p006b.p026g.p035k.C0890v;

/* renamed from: b.n.d0 */
class C0966d0 {

    /* renamed from: a */
    private static final C0980h0 f3463a;

    /* renamed from: b */
    private static Field f3464b;

    /* renamed from: c */
    private static boolean f3465c;

    /* renamed from: d */
    static final Property<View, Float> f3466d = new C0967a(Float.class, "translationAlpha");

    /* renamed from: b.n.d0$a */
    static class C0967a extends Property<View, Float> {
        C0967a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C0966d0.m5070c(view));
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            C0966d0.m5064a(view, f.floatValue());
        }
    }

    /* renamed from: b.n.d0$b */
    static class C0968b extends Property<View, Rect> {
        C0968b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C0890v.m4784i(view);
        }

        /* renamed from: a */
        public void set(View view, Rect rect) {
            C0890v.m4750a(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f3463a = i >= 22 ? new C0978g0() : i >= 21 ? new C0976f0() : i >= 19 ? new C0974e0() : new C0980h0();
        new C0968b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    private static void m5062a() {
        if (!f3465c) {
            try {
                f3464b = View.class.getDeclaredField("mViewFlags");
                f3464b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f3465c = true;
        }
    }

    /* renamed from: a */
    static void m5063a(View view) {
        f3463a.mo4862a(view);
    }

    /* renamed from: a */
    static void m5064a(View view, float f) {
        f3463a.mo4863a(view, f);
    }

    /* renamed from: a */
    static void m5065a(View view, int i) {
        m5062a();
        Field field = f3464b;
        if (field != null) {
            try {
                f3464b.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    /* renamed from: a */
    static void m5066a(View view, int i, int i2, int i3, int i4) {
        f3463a.mo4869a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    static void m5067a(View view, Matrix matrix) {
        f3463a.mo4866a(view, matrix);
    }

    /* renamed from: b */
    static C0962c0 m5068b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C0949b0(view) : C0946a0.m5017c(view);
    }

    /* renamed from: b */
    static void m5069b(View view, Matrix matrix) {
        f3463a.mo4867b(view, matrix);
    }

    /* renamed from: c */
    static float m5070c(View view) {
        return f3463a.mo4864b(view);
    }

    /* renamed from: d */
    static C0991l0 m5071d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C0989k0(view) : new C0987j0(view.getWindowToken());
    }

    /* renamed from: e */
    static void m5072e(View view) {
        f3463a.mo4865c(view);
    }
}
