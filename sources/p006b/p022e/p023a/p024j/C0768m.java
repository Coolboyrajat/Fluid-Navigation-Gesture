package p006b.p022e.p023a.p024j;

import p006b.p022e.p023a.C0742e;
import p006b.p022e.p023a.C0747i;
import p006b.p022e.p023a.p024j.C0753e;

/* renamed from: b.e.a.j.m */
public class C0768m extends C0770o {

    /* renamed from: c */
    C0753e f3108c;

    /* renamed from: d */
    C0768m f3109d;

    /* renamed from: e */
    float f3110e;

    /* renamed from: f */
    C0768m f3111f;

    /* renamed from: g */
    float f3112g;

    /* renamed from: h */
    int f3113h = 0;

    /* renamed from: i */
    private C0768m f3114i;

    /* renamed from: j */
    private C0769n f3115j = null;

    /* renamed from: k */
    private int f3116k = 1;

    /* renamed from: l */
    private C0769n f3117l = null;

    /* renamed from: m */
    private int f3118m = 1;

    public C0768m(C0753e eVar) {
        this.f3108c = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo4426a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* renamed from: a */
    public void mo4427a(int i, C0768m mVar, int i2) {
        this.f3113h = i;
        this.f3109d = mVar;
        this.f3110e = (float) i2;
        this.f3109d.mo4443a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4428a(C0742e eVar) {
        C0747i e = this.f3108c.mo4314e();
        C0768m mVar = this.f3111f;
        if (mVar == null) {
            eVar.mo4275a(e, (int) (this.f3112g + 0.5f));
        } else {
            eVar.mo4268a(e, eVar.mo4271a((Object) mVar.f3108c), (int) (this.f3112g + 0.5f), 6);
        }
    }

    /* renamed from: a */
    public void mo4429a(C0768m mVar, float f) {
        if (this.f3121b == 0 || !(this.f3111f == mVar || this.f3112g == f)) {
            this.f3111f = mVar;
            this.f3112g = f;
            if (this.f3121b == 1) {
                mo4444b();
            }
            mo4442a();
        }
    }

    /* renamed from: a */
    public void mo4430a(C0768m mVar, int i) {
        this.f3109d = mVar;
        this.f3110e = (float) i;
        this.f3109d.mo4443a(this);
    }

    /* renamed from: a */
    public void mo4431a(C0768m mVar, int i, C0769n nVar) {
        this.f3109d = mVar;
        this.f3109d.mo4443a(this);
        this.f3115j = nVar;
        this.f3116k = i;
        this.f3115j.mo4443a(this);
    }

    /* renamed from: b */
    public void mo4432b(int i) {
        this.f3113h = i;
    }

    /* renamed from: b */
    public void mo4433b(C0768m mVar, float f) {
        this.f3114i = mVar;
    }

    /* renamed from: b */
    public void mo4434b(C0768m mVar, int i, C0769n nVar) {
        this.f3114i = mVar;
        this.f3117l = nVar;
        this.f3118m = i;
    }

    /* renamed from: d */
    public void mo4435d() {
        super.mo4435d();
        this.f3109d = null;
        this.f3110e = 0.0f;
        this.f3115j = null;
        this.f3116k = 1;
        this.f3117l = null;
        this.f3118m = 1;
        this.f3111f = null;
        this.f3112g = 0.0f;
        this.f3114i = null;
        this.f3113h = 0;
    }

    /* renamed from: e */
    public void mo4436e() {
        C0768m mVar;
        C0768m mVar2;
        C0768m mVar3;
        C0768m mVar4;
        C0768m mVar5;
        C0768m mVar6;
        C0768m mVar7;
        float f;
        float f2;
        float f3;
        C0768m mVar8;
        float f4;
        boolean z = true;
        if (this.f3121b != 1 && this.f3113h != 4) {
            C0769n nVar = this.f3115j;
            if (nVar != null) {
                if (nVar.f3121b == 1) {
                    this.f3110e = ((float) this.f3116k) * nVar.f3119c;
                } else {
                    return;
                }
            }
            C0769n nVar2 = this.f3117l;
            if (nVar2 != null) {
                if (nVar2.f3121b == 1) {
                    float f5 = nVar2.f3119c;
                } else {
                    return;
                }
            }
            if (this.f3113h == 1 && ((mVar8 = this.f3109d) == null || mVar8.f3121b == 1)) {
                C0768m mVar9 = this.f3109d;
                if (mVar9 == null) {
                    this.f3111f = this;
                    f4 = this.f3110e;
                } else {
                    this.f3111f = mVar9.f3111f;
                    f4 = mVar9.f3112g + this.f3110e;
                }
                this.f3112g = f4;
                mo4442a();
                return;
            }
            if (this.f3113h == 2 && (mVar4 = this.f3109d) != null && mVar4.f3121b == 1 && (mVar5 = this.f3114i) != null && (mVar6 = mVar5.f3109d) != null && mVar6.f3121b == 1) {
                if (C0742e.m4106h() != null) {
                    C0742e.m4106h().f2926v++;
                }
                this.f3111f = this.f3109d.f3111f;
                C0768m mVar10 = this.f3114i;
                mVar10.f3111f = mVar10.f3109d.f3111f;
                C0753e.C0757d dVar = this.f3108c.f2972c;
                int i = 0;
                if (!(dVar == C0753e.C0757d.RIGHT || dVar == C0753e.C0757d.BOTTOM)) {
                    z = false;
                }
                if (z) {
                    f = this.f3109d.f3112g;
                    mVar7 = this.f3114i.f3109d;
                } else {
                    f = this.f3114i.f3109d.f3112g;
                    mVar7 = this.f3109d;
                }
                float f6 = f - mVar7.f3112g;
                C0753e eVar = this.f3108c;
                C0753e.C0757d dVar2 = eVar.f2972c;
                if (dVar2 == C0753e.C0757d.LEFT || dVar2 == C0753e.C0757d.RIGHT) {
                    f3 = f6 - ((float) this.f3108c.f2971b.mo4390s());
                    f2 = this.f3108c.f2971b.f3019V;
                } else {
                    f3 = f6 - ((float) eVar.f2971b.mo4370i());
                    f2 = this.f3108c.f2971b.f3020W;
                }
                int b = this.f3108c.mo4311b();
                int b2 = this.f3114i.f3108c.mo4311b();
                if (this.f3108c.mo4316g() == this.f3114i.f3108c.mo4316g()) {
                    f2 = 0.5f;
                    b2 = 0;
                } else {
                    i = b;
                }
                float f7 = (float) i;
                float f8 = (float) b2;
                float f9 = (f3 - f7) - f8;
                if (z) {
                    C0768m mVar11 = this.f3114i;
                    mVar11.f3112g = mVar11.f3109d.f3112g + f8 + (f9 * f2);
                    this.f3112g = (this.f3109d.f3112g - f7) - (f9 * (1.0f - f2));
                } else {
                    this.f3112g = this.f3109d.f3112g + f7 + (f9 * f2);
                    C0768m mVar12 = this.f3114i;
                    mVar12.f3112g = (mVar12.f3109d.f3112g - f8) - (f9 * (1.0f - f2));
                }
            } else if (this.f3113h == 3 && (mVar = this.f3109d) != null && mVar.f3121b == 1 && (mVar2 = this.f3114i) != null && (mVar3 = mVar2.f3109d) != null && mVar3.f3121b == 1) {
                if (C0742e.m4106h() != null) {
                    C0742e.m4106h().f2927w++;
                }
                C0768m mVar13 = this.f3109d;
                this.f3111f = mVar13.f3111f;
                C0768m mVar14 = this.f3114i;
                C0768m mVar15 = mVar14.f3109d;
                mVar14.f3111f = mVar15.f3111f;
                this.f3112g = mVar13.f3112g + this.f3110e;
                mVar14.f3112g = mVar15.f3112g + mVar14.f3110e;
            } else if (this.f3113h == 5) {
                this.f3108c.f2971b.mo4299G();
                return;
            } else {
                return;
            }
            mo4442a();
            this.f3114i.mo4442a();
        }
    }

    /* renamed from: f */
    public float mo4437f() {
        return this.f3112g;
    }

    /* renamed from: g */
    public void mo4438g() {
        C0753e g = this.f3108c.mo4316g();
        if (g != null) {
            if (g.mo4316g() == this.f3108c) {
                this.f3113h = 4;
                g.mo4313d().f3113h = 4;
            }
            int b = this.f3108c.mo4311b();
            C0753e.C0757d dVar = this.f3108c.f2972c;
            if (dVar == C0753e.C0757d.RIGHT || dVar == C0753e.C0757d.BOTTOM) {
                b = -b;
            }
            mo4430a(g.mo4313d(), b);
        }
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (this.f3121b != 1) {
            sb = new StringBuilder();
            sb.append("{ ");
            sb.append(this.f3108c);
            str = " UNRESOLVED} type: ";
        } else if (this.f3111f == this) {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f3108c);
            sb.append(", RESOLVED: ");
            sb.append(this.f3112g);
            str = "]  type: ";
        } else {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f3108c);
            sb.append(", RESOLVED: ");
            sb.append(this.f3111f);
            sb.append(":");
            sb.append(this.f3112g);
            str = "] type: ";
        }
        sb.append(str);
        sb.append(mo4426a(this.f3113h));
        return sb.toString();
    }
}
