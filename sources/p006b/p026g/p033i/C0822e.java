package p006b.p026g.p033i;

import java.util.Locale;

/* renamed from: b.g.i.e */
public final class C0822e {

    /* renamed from: a */
    public static final C0821d f3232a = new C0827e((C0825c) null, false);

    /* renamed from: b */
    public static final C0821d f3233b = new C0827e((C0825c) null, true);

    /* renamed from: c */
    public static final C0821d f3234c = new C0827e(C0824b.f3238a, false);

    /* renamed from: d */
    public static final C0821d f3235d = new C0827e(C0824b.f3238a, true);

    /* renamed from: b.g.i.e$a */
    private static class C0823a implements C0825c {

        /* renamed from: b */
        static final C0823a f3236b = new C0823a(true);

        /* renamed from: a */
        private final boolean f3237a;

        private C0823a(boolean z) {
            this.f3237a = z;
        }

        /* renamed from: a */
        public int mo4535a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C0822e.m4510a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f3237a) {
                        return 1;
                    }
                } else if (this.f3237a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f3237a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: b.g.i.e$b */
    private static class C0824b implements C0825c {

        /* renamed from: a */
        static final C0824b f3238a = new C0824b();

        private C0824b() {
        }

        /* renamed from: a */
        public int mo4535a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C0822e.m4511b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: b.g.i.e$c */
    private interface C0825c {
        /* renamed from: a */
        int mo4535a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: b.g.i.e$d */
    private static abstract class C0826d implements C0821d {

        /* renamed from: a */
        private final C0825c f3239a;

        C0826d(C0825c cVar) {
            this.f3239a = cVar;
        }

        /* renamed from: b */
        private boolean m4515b(CharSequence charSequence, int i, int i2) {
            int a = this.f3239a.mo4535a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo4536a();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo4536a();

        /* renamed from: a */
        public boolean mo4534a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.f3239a == null ? mo4536a() : m4515b(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b.g.i.e$e */
    private static class C0827e extends C0826d {

        /* renamed from: b */
        private final boolean f3240b;

        C0827e(C0825c cVar, boolean z) {
            super(cVar);
            this.f3240b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo4536a() {
            return this.f3240b;
        }
    }

    /* renamed from: b.g.i.e$f */
    private static class C0828f extends C0826d {

        /* renamed from: b */
        static final C0828f f3241b = new C0828f();

        C0828f() {
            super((C0825c) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo4536a() {
            return C0829f.m4521b(Locale.getDefault()) == 1;
        }
    }

    static {
        new C0827e(C0823a.f3236b, false);
        C0828f fVar = C0828f.f3241b;
    }

    /* renamed from: a */
    static int m4510a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m4511b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
