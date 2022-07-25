package kotlin.p209y;

/* renamed from: kotlin.y.c */
class C3388c extends C3387b {
    /* renamed from: a */
    public static int m12269a(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
