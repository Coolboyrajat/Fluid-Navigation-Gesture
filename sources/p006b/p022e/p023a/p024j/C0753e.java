package p006b.p022e.p023a.p024j;

import p006b.p022e.p023a.C0740c;
import p006b.p022e.p023a.C0747i;

/* renamed from: b.e.a.j.e */
public class C0753e {

    /* renamed from: a */
    private C0768m f2970a = new C0768m(this);

    /* renamed from: b */
    final C0758f f2971b;

    /* renamed from: c */
    final C0757d f2972c;

    /* renamed from: d */
    C0753e f2973d;

    /* renamed from: e */
    public int f2974e = 0;

    /* renamed from: f */
    int f2975f = -1;

    /* renamed from: g */
    private C0756c f2976g = C0756c.NONE;

    /* renamed from: h */
    private int f2977h;

    /* renamed from: i */
    C0747i f2978i;

    /* renamed from: b.e.a.j.e$a */
    static /* synthetic */ class C0754a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2979a = new int[C0757d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                b.e.a.j.e$d[] r0 = p006b.p022e.p023a.p024j.C0753e.C0757d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2979a = r0
                int[] r0 = f2979a     // Catch:{ NoSuchFieldError -> 0x0014 }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.CENTER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f2979a     // Catch:{ NoSuchFieldError -> 0x001f }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.LEFT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f2979a     // Catch:{ NoSuchFieldError -> 0x002a }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.RIGHT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f2979a     // Catch:{ NoSuchFieldError -> 0x0035 }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.TOP     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f2979a     // Catch:{ NoSuchFieldError -> 0x0040 }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f2979a     // Catch:{ NoSuchFieldError -> 0x004b }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.BASELINE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f2979a     // Catch:{ NoSuchFieldError -> 0x0056 }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f2979a     // Catch:{ NoSuchFieldError -> 0x0062 }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f2979a     // Catch:{ NoSuchFieldError -> 0x006e }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.NONE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p023a.p024j.C0753e.C0754a.<clinit>():void");
        }
    }

    /* renamed from: b.e.a.j.e$b */
    public enum C0755b {
        RELAXED,
        STRICT
    }

    /* renamed from: b.e.a.j.e$c */
    public enum C0756c {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: b.e.a.j.e$d */
    public enum C0757d {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0753e(C0758f fVar, C0757d dVar) {
        C0755b bVar = C0755b.RELAXED;
        this.f2977h = 0;
        this.f2971b = fVar;
        this.f2972c = dVar;
    }

    /* renamed from: a */
    public int mo4306a() {
        return this.f2977h;
    }

    /* renamed from: a */
    public void mo4307a(C0740c cVar) {
        C0747i iVar = this.f2978i;
        if (iVar == null) {
            this.f2978i = new C0747i(C0747i.C0748a.UNRESTRICTED, (String) null);
        } else {
            iVar.mo4292a();
        }
    }

    /* renamed from: a */
    public boolean mo4308a(C0753e eVar) {
        if (eVar == null) {
            return false;
        }
        C0757d h = eVar.mo4317h();
        C0757d dVar = this.f2972c;
        if (h == dVar) {
            return dVar != C0757d.BASELINE || (eVar.mo4312c().mo4397x() && mo4312c().mo4397x());
        }
        switch (C0754a.f2979a[dVar.ordinal()]) {
            case 1:
                return (h == C0757d.BASELINE || h == C0757d.CENTER_X || h == C0757d.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = h == C0757d.LEFT || h == C0757d.RIGHT;
                return eVar.mo4312c() instanceof C0763i ? z || h == C0757d.CENTER_X : z;
            case 4:
            case 5:
                boolean z2 = h == C0757d.TOP || h == C0757d.BOTTOM;
                return eVar.mo4312c() instanceof C0763i ? z2 || h == C0757d.CENTER_Y : z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f2972c.name());
        }
    }

    /* renamed from: a */
    public boolean mo4309a(C0753e eVar, int i, int i2, C0756c cVar, int i3, boolean z) {
        if (eVar == null) {
            this.f2973d = null;
            this.f2974e = 0;
            this.f2975f = -1;
            this.f2976g = C0756c.NONE;
            this.f2977h = 2;
            return true;
        } else if (!z && !mo4308a(eVar)) {
            return false;
        } else {
            this.f2973d = eVar;
            if (i > 0) {
                this.f2974e = i;
            } else {
                this.f2974e = 0;
            }
            this.f2975f = i2;
            this.f2976g = cVar;
            this.f2977h = i3;
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo4310a(C0753e eVar, int i, C0756c cVar, int i2) {
        return mo4309a(eVar, i, -1, cVar, i2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r0 = r3.f2973d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo4311b() {
        /*
            r3 = this;
            b.e.a.j.f r0 = r3.f2971b
            int r0 = r0.mo4388r()
            r1 = 8
            if (r0 != r1) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            int r0 = r3.f2975f
            r2 = -1
            if (r0 <= r2) goto L_0x0020
            b.e.a.j.e r0 = r3.f2973d
            if (r0 == 0) goto L_0x0020
            b.e.a.j.f r0 = r0.f2971b
            int r0 = r0.mo4388r()
            if (r0 != r1) goto L_0x0020
            int r0 = r3.f2975f
            return r0
        L_0x0020:
            int r0 = r3.f2974e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p023a.p024j.C0753e.mo4311b():int");
    }

    /* renamed from: c */
    public C0758f mo4312c() {
        return this.f2971b;
    }

    /* renamed from: d */
    public C0768m mo4313d() {
        return this.f2970a;
    }

    /* renamed from: e */
    public C0747i mo4314e() {
        return this.f2978i;
    }

    /* renamed from: f */
    public C0756c mo4315f() {
        return this.f2976g;
    }

    /* renamed from: g */
    public C0753e mo4316g() {
        return this.f2973d;
    }

    /* renamed from: h */
    public C0757d mo4317h() {
        return this.f2972c;
    }

    /* renamed from: i */
    public boolean mo4318i() {
        return this.f2973d != null;
    }

    /* renamed from: j */
    public void mo4319j() {
        this.f2973d = null;
        this.f2974e = 0;
        this.f2975f = -1;
        this.f2976g = C0756c.STRONG;
        this.f2977h = 0;
        C0755b bVar = C0755b.RELAXED;
        this.f2970a.mo4435d();
    }

    public String toString() {
        return this.f2971b.mo4364f() + ":" + this.f2972c.toString();
    }
}
