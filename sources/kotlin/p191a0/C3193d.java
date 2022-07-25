package kotlin.p191a0;

/* renamed from: kotlin.a0.d */
public final class C3193d extends C3190b implements C3189a<Integer> {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C3193d f7941j = new C3193d(1, 0);

    /* renamed from: k */
    public static final C3194a f7942k = new C3194a((C3366g) null);

    /* renamed from: kotlin.a0.d$a */
    public static final class C3194a {
        private C3194a() {
        }

        public /* synthetic */ C3194a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final C3193d mo9910a() {
            return C3193d.f7941j;
        }
    }

    public C3193d(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: d */
    public Integer mo9908d() {
        return Integer.valueOf(mo9898b());
    }

    /* renamed from: e */
    public Integer mo9909e() {
        return Integer.valueOf(mo9897a());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3193d) {
            if (!isEmpty() || !((C3193d) obj).isEmpty()) {
                C3193d dVar = (C3193d) obj;
                if (!(mo9897a() == dVar.mo9897a() && mo9898b() == dVar.mo9898b())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo9897a() * 31) + mo9898b();
    }

    public boolean isEmpty() {
        return mo9897a() > mo9898b();
    }

    public String toString() {
        return mo9897a() + ".." + mo9898b();
    }
}
