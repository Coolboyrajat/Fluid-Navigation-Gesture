package kotlin.p191a0;

/* renamed from: kotlin.a0.h */
class C3198h extends C3197g {
    /* renamed from: a */
    public static int m11846a(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public static int m11847a(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* renamed from: a */
    public static long m11848a(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: b */
    public static int m11849b(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: b */
    public static long m11850b(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: c */
    public static C3190b m11851c(int i, int i2) {
        return C3190b.f7933i.mo9905a(i, i2, -1);
    }

    /* renamed from: d */
    public static C3193d m11852d(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? C3193d.f7942k.mo9910a() : new C3193d(i, i2 - 1);
    }
}
