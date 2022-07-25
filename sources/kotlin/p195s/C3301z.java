package kotlin.p195s;

/* renamed from: kotlin.s.z */
class C3301z extends C3300y {
    /* renamed from: a */
    public static int m12116a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return i + (i / 3);
        }
        return Integer.MAX_VALUE;
    }
}
