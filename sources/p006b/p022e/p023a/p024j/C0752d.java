package p006b.p022e.p023a.p024j;

import java.util.ArrayList;
import p006b.p022e.p023a.p024j.C0758f;

/* renamed from: b.e.a.j.d */
public class C0752d {

    /* renamed from: a */
    protected C0758f f2953a;

    /* renamed from: b */
    protected C0758f f2954b;

    /* renamed from: c */
    protected C0758f f2955c;

    /* renamed from: d */
    protected C0758f f2956d;

    /* renamed from: e */
    protected C0758f f2957e;

    /* renamed from: f */
    protected C0758f f2958f;

    /* renamed from: g */
    protected C0758f f2959g;

    /* renamed from: h */
    protected ArrayList<C0758f> f2960h;

    /* renamed from: i */
    protected int f2961i;

    /* renamed from: j */
    protected int f2962j;

    /* renamed from: k */
    protected float f2963k = 0.0f;

    /* renamed from: l */
    private int f2964l;

    /* renamed from: m */
    private boolean f2965m = false;

    /* renamed from: n */
    protected boolean f2966n;

    /* renamed from: o */
    protected boolean f2967o;

    /* renamed from: p */
    protected boolean f2968p;

    /* renamed from: q */
    private boolean f2969q;

    public C0752d(C0758f fVar, int i, boolean z) {
        this.f2953a = fVar;
        this.f2964l = i;
        this.f2965m = z;
    }

    /* renamed from: a */
    private static boolean m4166a(C0758f fVar, int i) {
        if (fVar.mo4388r() != 8 && fVar.f3000C[i] == C0758f.C0760b.MATCH_CONSTRAINT) {
            int[] iArr = fVar.f3036g;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m4167b() {
        int i = this.f2964l * 2;
        boolean z = false;
        C0758f fVar = this.f2953a;
        C0758f fVar2 = fVar;
        boolean z2 = false;
        while (!z2) {
            this.f2961i++;
            C0758f[] fVarArr = fVar.f3041i0;
            int i2 = this.f2964l;
            C0758f fVar3 = null;
            fVarArr[i2] = null;
            fVar.f3039h0[i2] = null;
            if (fVar.mo4388r() != 8) {
                if (this.f2954b == null) {
                    this.f2954b = fVar;
                }
                this.f2956d = fVar;
                C0758f.C0760b[] bVarArr = fVar.f3000C;
                int i3 = this.f2964l;
                if (bVarArr[i3] == C0758f.C0760b.MATCH_CONSTRAINT) {
                    int[] iArr = fVar.f3036g;
                    if (iArr[i3] == 0 || iArr[i3] == 3 || iArr[i3] == 2) {
                        this.f2962j++;
                        float[] fArr = fVar.f3037g0;
                        int i4 = this.f2964l;
                        float f = fArr[i4];
                        if (f > 0.0f) {
                            this.f2963k += fArr[i4];
                        }
                        if (m4166a(fVar, this.f2964l)) {
                            if (f < 0.0f) {
                                this.f2966n = true;
                            } else {
                                this.f2967o = true;
                            }
                            if (this.f2960h == null) {
                                this.f2960h = new ArrayList<>();
                            }
                            this.f2960h.add(fVar);
                        }
                        if (this.f2958f == null) {
                            this.f2958f = fVar;
                        }
                        C0758f fVar4 = this.f2959g;
                        if (fVar4 != null) {
                            fVar4.f3039h0[this.f2964l] = fVar;
                        }
                        this.f2959g = fVar;
                    }
                }
            }
            if (fVar2 != fVar) {
                fVar2.f3041i0[this.f2964l] = fVar;
            }
            C0753e eVar = fVar.f2998A[i + 1].f2973d;
            if (eVar != null) {
                C0758f fVar5 = eVar.f2971b;
                C0753e[] eVarArr = fVar5.f2998A;
                if (eVarArr[i].f2973d != null && eVarArr[i].f2973d.f2971b == fVar) {
                    fVar3 = fVar5;
                }
            }
            if (fVar3 == null) {
                fVar3 = fVar;
                z2 = true;
            }
            fVar2 = fVar;
            fVar = fVar3;
        }
        this.f2955c = fVar;
        this.f2957e = (this.f2964l != 0 || !this.f2965m) ? this.f2953a : this.f2955c;
        if (this.f2967o && this.f2966n) {
            z = true;
        }
        this.f2968p = z;
    }

    /* renamed from: a */
    public void mo4305a() {
        if (!this.f2969q) {
            m4167b();
        }
        this.f2969q = true;
    }
}
