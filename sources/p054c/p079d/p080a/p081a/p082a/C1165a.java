package p054c.p079d.p080a.p081a.p082a;

import android.content.res.Resources;
import kotlin.p205x.p207d.C3370k;

/* renamed from: c.d.a.a.a.a */
public final class C1165a {
    /* renamed from: a */
    public static final float m5732a() {
        Resources system = Resources.getSystem();
        C3370k.m12223a((Object) system, "Resources.getSystem()");
        return Math.max(system.getDisplayMetrics().density, 1.0f);
    }

    /* renamed from: a */
    public static final float m5733a(float f) {
        return (float) ((int) (f * m5732a()));
    }

    /* renamed from: a */
    public static final int m5734a(int i) {
        return (int) (((float) i) * m5732a());
    }
}
