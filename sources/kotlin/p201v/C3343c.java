package kotlin.p201v;

/* renamed from: kotlin.v.c */
public final class C3343c {
    /* renamed from: a */
    private static final int m12181a(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: a */
    private static final int m12182a(int i, int i2, int i3) {
        return m12181a(m12181a(i, i3) - m12181a(i2, i3), i3);
    }

    /* renamed from: b */
    public static final int m12183b(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m12182a(i2, i, i3);
        }
        if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m12182a(i, i2, -i3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
