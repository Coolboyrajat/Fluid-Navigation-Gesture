package p054c.p083e.p084a.p085a.p087l;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: c.e.a.a.l.e */
public class C1183e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f3921b = new C1183e();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f3922a = new WeakHashMap<>();

    private C1183e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f3922a.containsKey(drawable)) {
            return this.f3922a.get(drawable);
        }
        return 255;
    }

    /* renamed from: a */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f3922a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
