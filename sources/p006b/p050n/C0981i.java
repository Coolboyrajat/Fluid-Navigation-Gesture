package p006b.p050n;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: b.n.i */
class C0981i {
    /* renamed from: a */
    static PropertyValuesHolder m5124a(Property<?, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? PropertyValuesHolder.ofObject(property, (TypeConverter) null, path) : PropertyValuesHolder.ofFloat(new C0979h(property, path), new float[]{0.0f, 1.0f});
    }
}
