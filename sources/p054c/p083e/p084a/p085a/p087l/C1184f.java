package p054c.p083e.p084a.p085a.p087l;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: c.e.a.a.l.f */
public class C1184f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f3923a = new Matrix();

    public C1184f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f3923a.set(imageView.getImageMatrix());
        return this.f3923a;
    }

    /* renamed from: a */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
