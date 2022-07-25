package kotlin.p194d0;

import kotlin.p191a0.C3193d;

/* renamed from: kotlin.d0.a */
class C3235a {
    /* renamed from: a */
    public static final int m11896a(char c, int i) {
        return Character.digit(c, i);
    }

    /* renamed from: a */
    public static final int m11897a(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C3193d(2, 36));
    }

    /* renamed from: a */
    public static final boolean m11898a(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
