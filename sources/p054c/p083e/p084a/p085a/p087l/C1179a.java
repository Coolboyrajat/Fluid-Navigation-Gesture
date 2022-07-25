package p054c.p083e.p084a.p085a.p087l;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p006b.p043k.p044a.p045a.C0930a;
import p006b.p043k.p044a.p045a.C0931b;
import p006b.p043k.p044a.p045a.C0932c;

/* renamed from: c.e.a.a.l.a */
public class C1179a {

    /* renamed from: a */
    public static final TimeInterpolator f3914a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f3915b = new C0931b();

    /* renamed from: c */
    public static final TimeInterpolator f3916c = new C0930a();

    /* renamed from: d */
    public static final TimeInterpolator f3917d = new C0932c();

    /* renamed from: e */
    public static final TimeInterpolator f3918e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m5735a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }
}
