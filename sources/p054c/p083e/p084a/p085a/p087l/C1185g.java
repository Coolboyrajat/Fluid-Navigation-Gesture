package p054c.p083e.p084a.p085a.p087l;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: c.e.a.a.l.g */
public class C1185g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f3924a = new float[9];

    /* renamed from: b */
    private final float[] f3925b = new float[9];

    /* renamed from: c */
    private final Matrix f3926c = new Matrix();

    /* renamed from: a */
    public Matrix mo5307a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f3924a);
        matrix2.getValues(this.f3925b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f3925b;
            float f2 = fArr[i];
            float[] fArr2 = this.f3924a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f3926c.setValues(this.f3925b);
        return this.f3926c;
    }
}
