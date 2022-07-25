package p054c.p083e.p084a.p085a.p100x;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: c.e.a.a.x.b */
public class C1227b {

    /* renamed from: a */
    public static final boolean f3993a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private static final int[] f3994b = {16842910, 16842919};

    /* renamed from: c */
    static final String f3995c = C1227b.class.getSimpleName();

    static {
        new int[1][0] = 16842919;
        new int[1][0] = 16842908;
        new int[1][0] = 16843623;
        new int[1][0] = 16842913;
    }

    private C1227b() {
    }

    /* renamed from: a */
    public static ColorStateList m5883a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f3994b, 0)) != 0) {
            Log.w(f3995c, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: a */
    public static boolean m5884a(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
