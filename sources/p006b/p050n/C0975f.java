package p006b.p050n;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: b.n.f */
class C0975f {
    /* renamed from: a */
    static <T> ObjectAnimator m5108a(T t, Property<T, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? ObjectAnimator.ofObject(t, property, (TypeConverter) null, path) : ObjectAnimator.ofFloat(t, new C0979h(property, path), new float[]{0.0f, 1.0f});
    }
}
