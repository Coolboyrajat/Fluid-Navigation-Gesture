package p054c.p083e.p084a.p085a.p097u;

/* renamed from: c.e.a.a.u.a */
public final class C1213a {
    /* renamed from: a */
    public static float m5846a(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: a */
    public static float m5847a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: a */
    public static float m5848a(float f, float f2, float f3, float f4, float f5, float f6) {
        return m5849b(m5847a(f, f2, f3, f4), m5847a(f, f2, f5, f4), m5847a(f, f2, f5, f6), m5847a(f, f2, f3, f6));
    }

    /* renamed from: b */
    private static float m5849b(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
