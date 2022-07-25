package p054c.p055a.p056a;

/* renamed from: c.a.a.m */
public enum C1055m {
    POSITIVE(0),
    NEGATIVE(1),
    NEUTRAL(2);
    

    /* renamed from: k */
    public static final C1056a f3715k = null;

    /* renamed from: f */
    private final int f3716f;

    /* renamed from: c.a.a.m$a */
    public static final class C1056a {
        private C1056a() {
        }

        public /* synthetic */ C1056a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1055m mo5124a(int i) {
            if (i == 0) {
                return C1055m.POSITIVE;
            }
            if (i == 1) {
                return C1055m.NEGATIVE;
            }
            if (i == 2) {
                return C1055m.NEUTRAL;
            }
            throw new IndexOutOfBoundsException(i + " is not an action button index.");
        }
    }

    static {
        f3715k = new C1056a((C3366g) null);
    }

    private C1055m(int i) {
        this.f3716f = i;
    }

    /* renamed from: a */
    public final int mo5123a() {
        return this.f3716f;
    }
}
