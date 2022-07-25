package p006b.p050n;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: b.n.h */
class C0979h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f3486a;

    /* renamed from: b */
    private final PathMeasure f3487b;

    /* renamed from: c */
    private final float f3488c;

    /* renamed from: d */
    private final float[] f3489d = new float[2];

    /* renamed from: e */
    private final PointF f3490e = new PointF();

    /* renamed from: f */
    private float f3491f;

    C0979h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f3486a = property;
        this.f3487b = new PathMeasure(path, false);
        this.f3488c = this.f3487b.getLength();
    }

    /* renamed from: a */
    public void set(T t, Float f) {
        this.f3491f = f.floatValue();
        this.f3487b.getPosTan(this.f3488c * f.floatValue(), this.f3489d, (float[]) null);
        PointF pointF = this.f3490e;
        float[] fArr = this.f3489d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f3486a.set(t, pointF);
    }

    public Float get(T t) {
        return Float.valueOf(this.f3491f);
    }
}
