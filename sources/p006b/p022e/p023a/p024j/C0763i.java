package p006b.p022e.p023a.p024j;

import java.util.ArrayList;
import p006b.p022e.p023a.C0742e;
import p006b.p022e.p023a.C0747i;
import p006b.p022e.p023a.p024j.C0753e;
import p006b.p022e.p023a.p024j.C0758f;

/* renamed from: b.e.a.j.i */
public class C0763i extends C0758f {

    /* renamed from: k0 */
    protected float f3098k0 = -1.0f;

    /* renamed from: l0 */
    protected int f3099l0 = -1;

    /* renamed from: m0 */
    protected int f3100m0 = -1;

    /* renamed from: n0 */
    private C0753e f3101n0 = this.f3052t;

    /* renamed from: o0 */
    private int f3102o0;

    /* renamed from: p0 */
    private boolean f3103p0;

    /* renamed from: b.e.a.j.i$a */
    static /* synthetic */ class C0764a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3104a = new int[C0753e.C0757d.values().length];

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
                f3104a = r0
                int[] r0 = f3104a     // Catch:{ NoSuchFieldError -> 0x0014 }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.LEFT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f3104a     // Catch:{ NoSuchFieldError -> 0x001f }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.RIGHT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f3104a     // Catch:{ NoSuchFieldError -> 0x002a }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.TOP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f3104a     // Catch:{ NoSuchFieldError -> 0x0035 }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f3104a     // Catch:{ NoSuchFieldError -> 0x0040 }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.BASELINE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f3104a     // Catch:{ NoSuchFieldError -> 0x004b }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.CENTER     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f3104a     // Catch:{ NoSuchFieldError -> 0x0056 }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f3104a     // Catch:{ NoSuchFieldError -> 0x0062 }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f3104a     // Catch:{ NoSuchFieldError -> 0x006e }
                b.e.a.j.e$d r1 = p006b.p022e.p023a.p024j.C0753e.C0757d.NONE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p023a.p024j.C0763i.C0764a.<clinit>():void");
        }
    }

    public C0763i() {
        this.f3102o0 = 0;
        this.f3103p0 = false;
        new C0767l();
        this.f2999B.clear();
        this.f2999B.add(this.f3101n0);
        int length = this.f2998A.length;
        for (int i = 0; i < length; i++) {
            this.f2998A[i] = this.f3101n0;
        }
    }

    /* renamed from: J */
    public int mo4421J() {
        return this.f3102o0;
    }

    /* renamed from: a */
    public C0753e mo4328a(C0753e.C0757d dVar) {
        switch (C0764a.f3104a[dVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f3102o0 == 1) {
                    return this.f3101n0;
                }
                break;
            case 3:
            case 4:
                if (this.f3102o0 == 0) {
                    return this.f3101n0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(dVar.name());
    }

    /* renamed from: a */
    public void mo4300a(int i) {
        C0753e eVar;
        C0768m mVar;
        int i2;
        C0753e eVar2;
        C0768m mVar2;
        C0768m d;
        int i3;
        C0753e eVar3;
        C0768m d2;
        C0758f k = mo4374k();
        if (k != null) {
            if (mo4421J() == 1) {
                this.f3052t.mo4313d().mo4427a(1, k.f3052t.mo4313d(), 0);
                this.f3054v.mo4313d().mo4427a(1, k.f3052t.mo4313d(), 0);
                if (this.f3099l0 != -1) {
                    this.f3051s.mo4313d().mo4427a(1, k.f3051s.mo4313d(), this.f3099l0);
                    mVar2 = this.f3053u.mo4313d();
                    eVar3 = k.f3051s;
                } else if (this.f3100m0 != -1) {
                    this.f3051s.mo4313d().mo4427a(1, k.f3053u.mo4313d(), -this.f3100m0);
                    d2 = this.f3053u.mo4313d();
                    eVar2 = k.f3053u;
                    d = eVar2.mo4313d();
                    i3 = -this.f3100m0;
                    mVar2.mo4427a(1, d, i3);
                } else if (this.f3098k0 != -1.0f && k.mo4372j() == C0758f.C0760b.FIXED) {
                    i2 = (int) (((float) k.f3002E) * this.f3098k0);
                    this.f3051s.mo4313d().mo4427a(1, k.f3051s.mo4313d(), i2);
                    mVar = this.f3053u.mo4313d();
                    eVar = k.f3051s;
                    mVar.mo4427a(1, eVar.mo4313d(), i2);
                    return;
                } else {
                    return;
                }
            } else {
                this.f3051s.mo4313d().mo4427a(1, k.f3051s.mo4313d(), 0);
                this.f3053u.mo4313d().mo4427a(1, k.f3051s.mo4313d(), 0);
                if (this.f3099l0 != -1) {
                    this.f3052t.mo4313d().mo4427a(1, k.f3052t.mo4313d(), this.f3099l0);
                    mVar2 = this.f3054v.mo4313d();
                    eVar3 = k.f3052t;
                } else if (this.f3100m0 != -1) {
                    this.f3052t.mo4313d().mo4427a(1, k.f3054v.mo4313d(), -this.f3100m0);
                    d2 = this.f3054v.mo4313d();
                    eVar2 = k.f3054v;
                    d = eVar2.mo4313d();
                    i3 = -this.f3100m0;
                    mVar2.mo4427a(1, d, i3);
                } else if (this.f3098k0 != -1.0f && k.mo4386q() == C0758f.C0760b.FIXED) {
                    i2 = (int) (((float) k.f3003F) * this.f3098k0);
                    this.f3052t.mo4313d().mo4427a(1, k.f3052t.mo4313d(), i2);
                    mVar = this.f3054v.mo4313d();
                    eVar = k.f3052t;
                    mVar.mo4427a(1, eVar.mo4313d(), i2);
                    return;
                } else {
                    return;
                }
            }
            d = eVar3.mo4313d();
            i3 = this.f3099l0;
            mVar2.mo4427a(1, d, i3);
        }
    }

    /* renamed from: a */
    public void mo4301a(C0742e eVar) {
        C0761g gVar = (C0761g) mo4374k();
        if (gVar != null) {
            C0753e a = gVar.mo4328a(C0753e.C0757d.LEFT);
            C0753e a2 = gVar.mo4328a(C0753e.C0757d.RIGHT);
            C0758f fVar = this.f3001D;
            boolean z = fVar != null && fVar.f3000C[0] == C0758f.C0760b.WRAP_CONTENT;
            if (this.f3102o0 == 0) {
                a = gVar.mo4328a(C0753e.C0757d.TOP);
                a2 = gVar.mo4328a(C0753e.C0757d.BOTTOM);
                C0758f fVar2 = this.f3001D;
                z = fVar2 != null && fVar2.f3000C[1] == C0758f.C0760b.WRAP_CONTENT;
            }
            if (this.f3099l0 != -1) {
                C0747i a3 = eVar.mo4271a((Object) this.f3101n0);
                eVar.mo4268a(a3, eVar.mo4271a((Object) a), this.f3099l0, 6);
                if (z) {
                    eVar.mo4282b(eVar.mo4271a((Object) a2), a3, 0, 5);
                }
            } else if (this.f3100m0 != -1) {
                C0747i a4 = eVar.mo4271a((Object) this.f3101n0);
                C0747i a5 = eVar.mo4271a((Object) a2);
                eVar.mo4268a(a4, a5, -this.f3100m0, 6);
                if (z) {
                    eVar.mo4282b(a4, eVar.mo4271a((Object) a), 0, 5);
                    eVar.mo4282b(a5, a4, 0, 5);
                }
            } else if (this.f3098k0 != -1.0f) {
                eVar.mo4272a(C0742e.m4099a(eVar, eVar.mo4271a((Object) this.f3101n0), eVar.mo4271a((Object) a), eVar.mo4271a((Object) a2), this.f3098k0, this.f3103p0));
            }
        }
    }

    /* renamed from: a */
    public boolean mo4302a() {
        return true;
    }

    /* renamed from: b */
    public ArrayList<C0753e> mo4344b() {
        return this.f2999B;
    }

    /* renamed from: c */
    public void mo4356c(C0742e eVar) {
        if (mo4374k() != null) {
            int b = eVar.mo4280b((Object) this.f3101n0);
            if (this.f3102o0 == 1) {
                mo4389r(b);
                mo4391s(0);
                mo4367g(mo4374k().mo4370i());
                mo4383o(0);
                return;
            }
            mo4389r(0);
            mo4391s(b);
            mo4383o(mo4374k().mo4390s());
            mo4367g(0);
        }
    }

    /* renamed from: e */
    public void mo4422e(float f) {
        if (f > -1.0f) {
            this.f3098k0 = f;
            this.f3099l0 = -1;
            this.f3100m0 = -1;
        }
    }

    /* renamed from: t */
    public void mo4304t(int i) {
        if (i > -1) {
            this.f3098k0 = -1.0f;
            this.f3099l0 = i;
            this.f3100m0 = -1;
        }
    }

    /* renamed from: u */
    public void mo4423u(int i) {
        if (i > -1) {
            this.f3098k0 = -1.0f;
            this.f3099l0 = -1;
            this.f3100m0 = i;
        }
    }

    /* renamed from: v */
    public void mo4424v(int i) {
        if (this.f3102o0 != i) {
            this.f3102o0 = i;
            this.f2999B.clear();
            this.f3101n0 = this.f3102o0 == 1 ? this.f3051s : this.f3052t;
            this.f2999B.add(this.f3101n0);
            int length = this.f2998A.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f2998A[i2] = this.f3101n0;
            }
        }
    }
}
