package p054c.p083e.p084a.p085a.p088m;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: c.e.a.a.m.a */
public class C1190a {
    /* renamed from: a */
    public static int m5765a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f, f2, f3, f4, i) : canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
