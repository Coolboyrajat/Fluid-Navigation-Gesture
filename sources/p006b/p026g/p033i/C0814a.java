package p006b.p026g.p033i;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import p190io.objectbox.android.BuildConfig;

/* renamed from: b.g.i.a */
public final class C0814a {

    /* renamed from: d */
    static final C0821d f3202d = C0822e.f3234c;

    /* renamed from: e */
    private static final String f3203e = Character.toString(8206);

    /* renamed from: f */
    private static final String f3204f = Character.toString(8207);

    /* renamed from: g */
    static final C0814a f3205g = new C0814a(false, 2, f3202d);

    /* renamed from: h */
    static final C0814a f3206h = new C0814a(true, 2, f3202d);

    /* renamed from: a */
    private final boolean f3207a;

    /* renamed from: b */
    private final int f3208b;

    /* renamed from: c */
    private final C0821d f3209c;

    /* renamed from: b.g.i.a$a */
    public static final class C0815a {

        /* renamed from: a */
        private boolean f3210a;

        /* renamed from: b */
        private int f3211b;

        /* renamed from: c */
        private C0821d f3212c;

        public C0815a() {
            m4485b(C0814a.m4476a(Locale.getDefault()));
        }

        /* renamed from: a */
        private static C0814a m4484a(boolean z) {
            return z ? C0814a.f3206h : C0814a.f3205g;
        }

        /* renamed from: b */
        private void m4485b(boolean z) {
            this.f3210a = z;
            this.f3212c = C0814a.f3202d;
            this.f3211b = 2;
        }

        /* renamed from: a */
        public C0814a mo4505a() {
            return (this.f3211b == 2 && this.f3212c == C0814a.f3202d) ? m4484a(this.f3210a) : new C0814a(this.f3210a, this.f3211b, this.f3212c);
        }
    }

    /* renamed from: b.g.i.a$b */
    private static class C0816b {

        /* renamed from: f */
        private static final byte[] f3213f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f3214a;

        /* renamed from: b */
        private final boolean f3215b;

        /* renamed from: c */
        private final int f3216c;

        /* renamed from: d */
        private int f3217d;

        /* renamed from: e */
        private char f3218e;

        static {
            for (int i = 0; i < 1792; i++) {
                f3213f[i] = Character.getDirectionality(i);
            }
        }

        C0816b(CharSequence charSequence, boolean z) {
            this.f3214a = charSequence;
            this.f3215b = z;
            this.f3216c = charSequence.length();
        }

        /* renamed from: a */
        private static byte m4487a(char c) {
            return c < 1792 ? f3213f[c] : Character.getDirectionality(c);
        }

        /* renamed from: e */
        private byte m4488e() {
            char c;
            int i = this.f3217d;
            do {
                int i2 = this.f3217d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3214a;
                int i3 = i2 - 1;
                this.f3217d = i3;
                this.f3218e = charSequence.charAt(i3);
                c = this.f3218e;
                if (c == '&') {
                    return 12;
                }
            } while (c != ';');
            this.f3217d = i;
            this.f3218e = ';';
            return 13;
        }

        /* renamed from: f */
        private byte m4489f() {
            char charAt;
            do {
                int i = this.f3217d;
                if (i >= this.f3216c) {
                    return 12;
                }
                CharSequence charSequence = this.f3214a;
                this.f3217d = i + 1;
                charAt = charSequence.charAt(i);
                this.f3218e = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: g */
        private byte m4490g() {
            char charAt;
            int i = this.f3217d;
            while (true) {
                int i2 = this.f3217d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3214a;
                int i3 = i2 - 1;
                this.f3217d = i3;
                this.f3218e = charSequence.charAt(i3);
                char c = this.f3218e;
                if (c == '<') {
                    return 12;
                }
                if (c == '>') {
                    break;
                } else if (c == '\"' || c == '\'') {
                    char c2 = this.f3218e;
                    do {
                        int i4 = this.f3217d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f3214a;
                        int i5 = i4 - 1;
                        this.f3217d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f3218e = charAt;
                    } while (charAt != c2);
                }
            }
            this.f3217d = i;
            this.f3218e = '>';
            return 13;
        }

        /* renamed from: h */
        private byte m4491h() {
            char charAt;
            int i = this.f3217d;
            while (true) {
                int i2 = this.f3217d;
                if (i2 < this.f3216c) {
                    CharSequence charSequence = this.f3214a;
                    this.f3217d = i2 + 1;
                    this.f3218e = charSequence.charAt(i2);
                    char c = this.f3218e;
                    if (c == '>') {
                        return 12;
                    }
                    if (c == '\"' || c == '\'') {
                        char c2 = this.f3218e;
                        do {
                            int i3 = this.f3217d;
                            if (i3 >= this.f3216c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f3214a;
                            this.f3217d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f3218e = charAt;
                        } while (charAt != c2);
                    }
                } else {
                    this.f3217d = i;
                    this.f3218e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte mo4506a() {
            this.f3218e = this.f3214a.charAt(this.f3217d - 1);
            if (Character.isLowSurrogate(this.f3218e)) {
                int codePointBefore = Character.codePointBefore(this.f3214a, this.f3217d);
                this.f3217d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f3217d--;
            byte a = m4487a(this.f3218e);
            if (!this.f3215b) {
                return a;
            }
            char c = this.f3218e;
            return c == '>' ? m4490g() : c == ';' ? m4488e() : a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public byte mo4507b() {
            this.f3218e = this.f3214a.charAt(this.f3217d);
            if (Character.isHighSurrogate(this.f3218e)) {
                int codePointAt = Character.codePointAt(this.f3214a, this.f3217d);
                this.f3217d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f3217d++;
            byte a = m4487a(this.f3218e);
            if (!this.f3215b) {
                return a;
            }
            char c = this.f3218e;
            return c == '<' ? m4491h() : c == '&' ? m4489f() : a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo4508c() {
            this.f3217d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f3217d < this.f3216c && i == 0) {
                byte b = mo4507b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f3217d > 0) {
                switch (mo4506a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r2 = r2 - 1;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo4509d() {
            /*
                r7 = this;
                int r0 = r7.f3216c
                r7.f3217d = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f3217d
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.mo4506a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r1 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r2 = r2 + 1
                goto L_0x0007
            L_0x0025:
                if (r1 != r2) goto L_0x002b
                return r5
            L_0x0028:
                if (r1 != r2) goto L_0x002b
                return r4
            L_0x002b:
                int r2 = r2 + -1
                goto L_0x0007
            L_0x002e:
                if (r2 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r1 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r2 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r1 != 0) goto L_0x0007
            L_0x0039:
                r1 = r2
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p026g.p033i.C0814a.C0816b.mo4509d():int");
        }
    }

    C0814a(boolean z, int i, C0821d dVar) {
        this.f3207a = z;
        this.f3208b = i;
        this.f3209c = dVar;
    }

    /* renamed from: a */
    private String m4475a(CharSequence charSequence, C0821d dVar) {
        boolean a = dVar.mo4534a(charSequence, 0, charSequence.length());
        return (this.f3207a || (!a && m4480c(charSequence) != 1)) ? this.f3207a ? (!a || m4480c(charSequence) == -1) ? f3204f : BuildConfig.FLAVOR : BuildConfig.FLAVOR : f3203e;
    }

    /* renamed from: a */
    static boolean m4476a(Locale locale) {
        return C0829f.m4521b(locale) == 1;
    }

    /* renamed from: b */
    private static int m4477b(CharSequence charSequence) {
        return new C0816b(charSequence, false).mo4508c();
    }

    /* renamed from: b */
    public static C0814a m4478b() {
        return new C0815a().mo4505a();
    }

    /* renamed from: b */
    private String m4479b(CharSequence charSequence, C0821d dVar) {
        boolean a = dVar.mo4534a(charSequence, 0, charSequence.length());
        return (this.f3207a || (!a && m4477b(charSequence) != 1)) ? this.f3207a ? (!a || m4477b(charSequence) == -1) ? f3204f : BuildConfig.FLAVOR : BuildConfig.FLAVOR : f3203e;
    }

    /* renamed from: c */
    private static int m4480c(CharSequence charSequence) {
        return new C0816b(charSequence, false).mo4509d();
    }

    /* renamed from: a */
    public CharSequence mo4502a(CharSequence charSequence) {
        return mo4503a(charSequence, this.f3209c, true);
    }

    /* renamed from: a */
    public CharSequence mo4503a(CharSequence charSequence, C0821d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = dVar.mo4534a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo4504a() && z) {
            spannableStringBuilder.append(m4479b(charSequence, a ? C0822e.f3233b : C0822e.f3232a));
        }
        if (a != this.f3207a) {
            spannableStringBuilder.append(a ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(m4475a(charSequence, a ? C0822e.f3233b : C0822e.f3232a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public boolean mo4504a() {
        return (this.f3208b & 2) != 0;
    }
}
