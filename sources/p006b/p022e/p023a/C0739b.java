package p006b.p022e.p023a;

import p006b.p022e.p023a.C0742e;
import p006b.p022e.p023a.C0747i;

/* renamed from: b.e.a.b */
public class C0739b implements C0742e.C0743a {

    /* renamed from: a */
    C0747i f2879a = null;

    /* renamed from: b */
    float f2880b = 0.0f;

    /* renamed from: c */
    boolean f2881c;

    /* renamed from: d */
    public final C0738a f2882d;

    /* renamed from: e */
    boolean f2883e = false;

    public C0739b(C0740c cVar) {
        this.f2882d = new C0738a(this, cVar);
    }

    /* renamed from: a */
    public C0739b mo4241a(float f, float f2, float f3, C0747i iVar, C0747i iVar2, C0747i iVar3, C0747i iVar4) {
        this.f2880b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f2882d.mo4234a(iVar, 1.0f);
            this.f2882d.mo4234a(iVar2, -1.0f);
            this.f2882d.mo4234a(iVar4, 1.0f);
            this.f2882d.mo4234a(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f2882d.mo4234a(iVar, 1.0f);
            this.f2882d.mo4234a(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f2882d.mo4234a(iVar3, 1.0f);
            this.f2882d.mo4234a(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f2882d.mo4234a(iVar, 1.0f);
            this.f2882d.mo4234a(iVar2, -1.0f);
            this.f2882d.mo4234a(iVar4, f4);
            this.f2882d.mo4234a(iVar3, -f4);
        }
        return this;
    }

    /* renamed from: a */
    public C0739b mo4242a(C0742e eVar, int i) {
        this.f2882d.mo4234a(eVar.mo4270a(i, "ep"), 1.0f);
        this.f2882d.mo4234a(eVar.mo4270a(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0739b mo4243a(C0747i iVar, int i) {
        this.f2882d.mo4234a(iVar, (float) i);
        return this;
    }

    /* renamed from: a */
    public C0739b mo4244a(C0747i iVar, C0747i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2880b = (float) i;
        }
        if (!z) {
            this.f2882d.mo4234a(iVar, -1.0f);
            this.f2882d.mo4234a(iVar2, 1.0f);
        } else {
            this.f2882d.mo4234a(iVar, 1.0f);
            this.f2882d.mo4234a(iVar2, -1.0f);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0739b mo4245a(C0747i iVar, C0747i iVar2, int i, float f, C0747i iVar3, C0747i iVar4, int i2) {
        float f2;
        if (iVar2 == iVar3) {
            this.f2882d.mo4234a(iVar, 1.0f);
            this.f2882d.mo4234a(iVar4, 1.0f);
            this.f2882d.mo4234a(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f2882d.mo4234a(iVar, 1.0f);
            this.f2882d.mo4234a(iVar2, -1.0f);
            this.f2882d.mo4234a(iVar3, -1.0f);
            this.f2882d.mo4234a(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                f2 = (float) ((-i) + i2);
            }
            return this;
        } else if (f <= 0.0f) {
            this.f2882d.mo4234a(iVar, -1.0f);
            this.f2882d.mo4234a(iVar2, 1.0f);
            f2 = (float) i;
        } else if (f >= 1.0f) {
            this.f2882d.mo4234a(iVar3, -1.0f);
            this.f2882d.mo4234a(iVar4, 1.0f);
            f2 = (float) i2;
        } else {
            float f3 = 1.0f - f;
            this.f2882d.mo4234a(iVar, f3 * 1.0f);
            this.f2882d.mo4234a(iVar2, f3 * -1.0f);
            this.f2882d.mo4234a(iVar3, -1.0f * f);
            this.f2882d.mo4234a(iVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                f2 = (((float) (-i)) * f3) + (((float) i2) * f);
            }
            return this;
        }
        this.f2880b = f2;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0739b mo4246a(C0747i iVar, C0747i iVar2, C0747i iVar3, float f) {
        this.f2882d.mo4234a(iVar, -1.0f);
        this.f2882d.mo4234a(iVar2, 1.0f - f);
        this.f2882d.mo4234a(iVar3, f);
        return this;
    }

    /* renamed from: a */
    public C0739b mo4247a(C0747i iVar, C0747i iVar2, C0747i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2880b = (float) i;
        }
        if (!z) {
            this.f2882d.mo4234a(iVar, -1.0f);
            this.f2882d.mo4234a(iVar2, 1.0f);
            this.f2882d.mo4234a(iVar3, 1.0f);
        } else {
            this.f2882d.mo4234a(iVar, 1.0f);
            this.f2882d.mo4234a(iVar2, -1.0f);
            this.f2882d.mo4234a(iVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public C0739b mo4248a(C0747i iVar, C0747i iVar2, C0747i iVar3, C0747i iVar4, float f) {
        this.f2882d.mo4234a(iVar, -1.0f);
        this.f2882d.mo4234a(iVar2, 1.0f);
        this.f2882d.mo4234a(iVar3, f);
        this.f2882d.mo4234a(iVar4, -f);
        return this;
    }

    /* renamed from: a */
    public C0747i mo4249a(C0742e eVar, boolean[] zArr) {
        return this.f2882d.mo4229a(zArr, (C0747i) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4250a() {
        float f = this.f2880b;
        if (f < 0.0f) {
            this.f2880b = f * -1.0f;
            this.f2882d.mo4239b();
        }
    }

    /* renamed from: a */
    public void mo4251a(C0742e.C0743a aVar) {
        if (aVar instanceof C0739b) {
            C0739b bVar = (C0739b) aVar;
            this.f2879a = null;
            this.f2882d.mo4230a();
            int i = 0;
            while (true) {
                C0738a aVar2 = bVar.f2882d;
                if (i < aVar2.f2868a) {
                    this.f2882d.mo4235a(aVar2.mo4227a(i), bVar.f2882d.mo4237b(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4252a(C0747i iVar) {
        int i = iVar.f2937d;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f2882d.mo4234a(iVar, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4253a(C0742e eVar) {
        boolean z;
        C0747i a = this.f2882d.mo4228a(eVar);
        if (a == null) {
            z = true;
        } else {
            mo4264d(a);
            z = false;
        }
        if (this.f2882d.f2868a == 0) {
            this.f2883e = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0739b mo4254b(C0747i iVar, int i) {
        this.f2879a = iVar;
        float f = (float) i;
        iVar.f2938e = f;
        this.f2880b = f;
        this.f2883e = true;
        return this;
    }

    /* renamed from: b */
    public C0739b mo4255b(C0747i iVar, C0747i iVar2, C0747i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2880b = (float) i;
        }
        if (!z) {
            this.f2882d.mo4234a(iVar, -1.0f);
            this.f2882d.mo4234a(iVar2, 1.0f);
            this.f2882d.mo4234a(iVar3, -1.0f);
        } else {
            this.f2882d.mo4234a(iVar, 1.0f);
            this.f2882d.mo4234a(iVar2, -1.0f);
            this.f2882d.mo4234a(iVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public C0739b mo4256b(C0747i iVar, C0747i iVar2, C0747i iVar3, C0747i iVar4, float f) {
        this.f2882d.mo4234a(iVar3, 0.5f);
        this.f2882d.mo4234a(iVar4, 0.5f);
        this.f2882d.mo4234a(iVar, -0.5f);
        this.f2882d.mo4234a(iVar2, -0.5f);
        this.f2880b = -f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4257b() {
        C0747i iVar = this.f2879a;
        return iVar != null && (iVar.f2940g == C0747i.C0748a.UNRESTRICTED || this.f2880b >= 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4258b(C0747i iVar) {
        return this.f2882d.mo4236a(iVar);
    }

    /* renamed from: c */
    public C0739b mo4259c(C0747i iVar, int i) {
        C0738a aVar;
        float f;
        if (i < 0) {
            this.f2880b = (float) (i * -1);
            aVar = this.f2882d;
            f = 1.0f;
        } else {
            this.f2880b = (float) i;
            aVar = this.f2882d;
            f = -1.0f;
        }
        aVar.mo4234a(iVar, f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0747i mo4260c(C0747i iVar) {
        return this.f2882d.mo4229a((boolean[]) null, iVar);
    }

    /* renamed from: c */
    public boolean mo4261c() {
        return this.f2879a == null && this.f2880b == 0.0f && this.f2882d.f2868a == 0;
    }

    public void clear() {
        this.f2882d.mo4230a();
        this.f2879a = null;
        this.f2880b = 0.0f;
    }

    /* renamed from: d */
    public void mo4263d() {
        this.f2879a = null;
        this.f2882d.mo4230a();
        this.f2880b = 0.0f;
        this.f2883e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4264d(C0747i iVar) {
        C0747i iVar2 = this.f2879a;
        if (iVar2 != null) {
            this.f2882d.mo4234a(iVar2, -1.0f);
            this.f2879a = null;
        }
        float a = this.f2882d.mo4226a(iVar, true) * -1.0f;
        this.f2879a = iVar;
        if (a != 1.0f) {
            this.f2880b /= a;
            this.f2882d.mo4231a(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo4265e() {
        /*
            r10 = this;
            b.e.a.i r0 = r10.f2879a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L_0x0021
        L_0x0014:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            b.e.a.i r1 = r10.f2879a
            r0.append(r1)
        L_0x0021:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f2880b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0052
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f2880b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            b.e.a.a r5 = r10.f2882d
            int r5 = r5.f2868a
        L_0x0057:
            if (r2 >= r5) goto L_0x00d0
            b.e.a.a r6 = r10.f2882d
            b.e.a.i r6 = r6.mo4227a((int) r2)
            if (r6 != 0) goto L_0x0062
            goto L_0x00cd
        L_0x0062:
            b.e.a.a r7 = r10.f2882d
            float r7 = r7.mo4237b((int) r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x006d
            goto L_0x00cd
        L_0x006d:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0084
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L_0x00a0
        L_0x0084:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 <= 0) goto L_0x0098
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00a9
        L_0x0098:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        L_0x00a0:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
        L_0x00a9:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00b5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00c2
        L_0x00b5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x00c2:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        L_0x00cd:
            int r2 = r2 + 1
            goto L_0x0057
        L_0x00d0:
            if (r1 != 0) goto L_0x00e3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00e3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p023a.C0739b.mo4265e():java.lang.String");
    }

    public C0747i getKey() {
        return this.f2879a;
    }

    public String toString() {
        return mo4265e();
    }
}
