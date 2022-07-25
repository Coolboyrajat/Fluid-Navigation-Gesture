package p006b.p043k.p044a.p045a;

import android.view.animation.Interpolator;

/* renamed from: b.k.a.a.d */
abstract class C0933d implements Interpolator {

    /* renamed from: a */
    private final float[] f3408a;

    /* renamed from: b */
    private final float f3409b = (1.0f / ((float) (this.f3408a.length - 1)));

    protected C0933d(float[] fArr) {
        this.f3408a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f3408a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f3409b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f3408a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
