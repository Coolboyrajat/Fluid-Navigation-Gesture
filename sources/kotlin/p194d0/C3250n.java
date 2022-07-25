package kotlin.p194d0;

import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.BuildConfig;

/* renamed from: kotlin.d0.n */
class C3250n extends C3249m {
    /* renamed from: a */
    public static String m11926a(CharSequence charSequence, int i) {
        C3370k.m12227b(charSequence, "$this$repeat");
        int i2 = 1;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return BuildConfig.FLAVOR;
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                if (1 <= i) {
                    while (true) {
                        sb.append(charSequence);
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                String sb2 = sb.toString();
                C3370k.m12223a((Object) sb2, "sb.toString()");
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = charAt;
            }
            return new String(cArr);
        }
    }

    /* renamed from: a */
    public static final String m11927a(String str, String str2, String str3, boolean z) {
        C3370k.m12227b(str, "$this$replace");
        C3370k.m12227b(str2, "oldValue");
        C3370k.m12227b(str3, "newValue");
        return C3228j.m11879a(C3251o.m11960b((CharSequence) str, new String[]{str2}, z, 0, 4, (Object) null), str3, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C3350b) null, 62, (Object) null);
    }

    /* renamed from: a */
    public static /* synthetic */ String m11928a(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m11927a(str, str2, str3, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11929a(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "$this$isBlank"
            kotlin.p205x.p207d.C3370k.m12227b(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            kotlin.a0.d r0 = kotlin.p194d0.C3251o.m11958b(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            kotlin.s.v r3 = (kotlin.p195s.C3297v) r3
            int r3 = r3.mo9906a()
            char r3 = r4.charAt(r3)
            boolean r3 = kotlin.p194d0.C3235a.m11898a((char) r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p194d0.C3250n.m11929a(java.lang.CharSequence):boolean");
    }

    /* renamed from: a */
    public static final boolean m11930a(String str, int i, String str2, int i2, int i3, boolean z) {
        C3370k.m12227b(str, "$this$regionMatches");
        C3370k.m12227b(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: a */
    public static final boolean m11931a(String str, String str2, boolean z) {
        C3370k.m12227b(str, "$this$startsWith");
        C3370k.m12227b(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m11930a(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m11932a(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m11931a(str, str2, z);
    }
}
