package p006b.p022e.p023a;

import java.util.Arrays;
import java.util.HashMap;
import p006b.p022e.p023a.C0747i;
import p006b.p022e.p023a.p024j.C0753e;
import p006b.p022e.p023a.p024j.C0758f;

/* renamed from: b.e.a.e */
public class C0742e {

    /* renamed from: p */
    private static int f2887p = 1000;

    /* renamed from: q */
    public static C0744f f2888q;

    /* renamed from: a */
    int f2889a = 0;

    /* renamed from: b */
    private HashMap<String, C0747i> f2890b = null;

    /* renamed from: c */
    private C0743a f2891c;

    /* renamed from: d */
    private int f2892d = 32;

    /* renamed from: e */
    private int f2893e;

    /* renamed from: f */
    C0739b[] f2894f;

    /* renamed from: g */
    public boolean f2895g;

    /* renamed from: h */
    private boolean[] f2896h;

    /* renamed from: i */
    int f2897i;

    /* renamed from: j */
    int f2898j;

    /* renamed from: k */
    private int f2899k;

    /* renamed from: l */
    final C0740c f2900l;

    /* renamed from: m */
    private C0747i[] f2901m;

    /* renamed from: n */
    private int f2902n;

    /* renamed from: o */
    private final C0743a f2903o;

    /* renamed from: b.e.a.e$a */
    interface C0743a {
        /* renamed from: a */
        C0747i mo4249a(C0742e eVar, boolean[] zArr);

        /* renamed from: a */
        void mo4251a(C0743a aVar);

        /* renamed from: a */
        void mo4252a(C0747i iVar);

        void clear();

        C0747i getKey();
    }

    public C0742e() {
        int i = this.f2892d;
        this.f2893e = i;
        this.f2894f = null;
        this.f2895g = false;
        this.f2896h = new boolean[i];
        this.f2897i = 1;
        this.f2898j = 0;
        this.f2899k = i;
        this.f2901m = new C0747i[f2887p];
        this.f2902n = 0;
        C0739b[] bVarArr = new C0739b[i];
        this.f2894f = new C0739b[i];
        m4108j();
        this.f2900l = new C0740c();
        this.f2891c = new C0741d(this.f2900l);
        this.f2903o = new C0739b(this.f2900l);
    }

    /* renamed from: a */
    private final int m4098a(C0743a aVar, boolean z) {
        C0744f fVar = f2888q;
        if (fVar != null) {
            fVar.f2912h++;
        }
        for (int i = 0; i < this.f2897i; i++) {
            this.f2896h[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C0744f fVar2 = f2888q;
            if (fVar2 != null) {
                fVar2.f2913i++;
            }
            i2++;
            if (i2 >= this.f2897i * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f2896h[aVar.getKey().f2935b] = true;
            }
            C0747i a = aVar.mo4249a(this, this.f2896h);
            if (a != null) {
                boolean[] zArr = this.f2896h;
                int i3 = a.f2935b;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (a != null) {
                int i4 = -1;
                float f = Float.MAX_VALUE;
                for (int i5 = 0; i5 < this.f2898j; i5++) {
                    C0739b bVar = this.f2894f[i5];
                    if (bVar.f2879a.f2940g != C0747i.C0748a.UNRESTRICTED && !bVar.f2883e && bVar.mo4258b(a)) {
                        float b = bVar.f2882d.mo4238b(a);
                        if (b < 0.0f) {
                            float f2 = (-bVar.f2880b) / b;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0739b bVar2 = this.f2894f[i4];
                    bVar2.f2879a.f2936c = -1;
                    C0744f fVar3 = f2888q;
                    if (fVar3 != null) {
                        fVar3.f2914j++;
                    }
                    bVar2.mo4264d(a);
                    C0747i iVar = bVar2.f2879a;
                    iVar.f2936c = i4;
                    iVar.mo4296c(bVar2);
                }
            }
            z2 = true;
        }
        return i2;
    }

    /* renamed from: a */
    public static C0739b m4099a(C0742e eVar, C0747i iVar, C0747i iVar2, C0747i iVar3, float f, boolean z) {
        C0739b b = eVar.mo4281b();
        if (z) {
            eVar.m4102b(b);
        }
        b.mo4246a(iVar, iVar2, iVar3, f);
        return b;
    }

    /* renamed from: a */
    private C0747i m4100a(C0747i.C0748a aVar, String str) {
        C0747i a = this.f2900l.f2885b.mo4289a();
        if (a == null) {
            a = new C0747i(aVar, str);
        } else {
            a.mo4292a();
        }
        a.mo4294a(aVar, str);
        int i = this.f2902n;
        int i2 = f2887p;
        if (i >= i2) {
            f2887p = i2 * 2;
            this.f2901m = (C0747i[]) Arrays.copyOf(this.f2901m, f2887p);
        }
        C0747i[] iVarArr = this.f2901m;
        int i3 = this.f2902n;
        this.f2902n = i3 + 1;
        iVarArr[i3] = a;
        return a;
    }

    /* renamed from: b */
    private int m4101b(C0743a aVar) {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f2898j) {
                z = false;
                break;
            }
            C0739b[] bVarArr = this.f2894f;
            if (bVarArr[i].f2879a.f2940g != C0747i.C0748a.UNRESTRICTED && bVarArr[i].f2880b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C0744f fVar = f2888q;
            if (fVar != null) {
                fVar.f2915k++;
            }
            i2++;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            float f2 = Float.MAX_VALUE;
            int i6 = 0;
            while (i3 < this.f2898j) {
                C0739b bVar = this.f2894f[i3];
                if (bVar.f2879a.f2940g != C0747i.C0748a.UNRESTRICTED && !bVar.f2883e && bVar.f2880b < f) {
                    int i7 = 1;
                    while (i7 < this.f2897i) {
                        C0747i iVar = this.f2900l.f2886c[i7];
                        float b = bVar.f2882d.mo4238b(iVar);
                        if (b > f) {
                            int i8 = i6;
                            float f3 = f2;
                            int i9 = i5;
                            int i10 = i4;
                            for (int i11 = 0; i11 < 7; i11++) {
                                float f4 = iVar.f2939f[i11] / b;
                                if ((f4 < f3 && i11 == i8) || i11 > i8) {
                                    i9 = i7;
                                    i10 = i3;
                                    f3 = f4;
                                    i8 = i11;
                                }
                            }
                            i4 = i10;
                            i5 = i9;
                            f2 = f3;
                            i6 = i8;
                        }
                        i7++;
                        f = 0.0f;
                    }
                }
                i3++;
                f = 0.0f;
            }
            if (i4 != -1) {
                C0739b bVar2 = this.f2894f[i4];
                bVar2.f2879a.f2936c = -1;
                C0744f fVar2 = f2888q;
                if (fVar2 != null) {
                    fVar2.f2914j++;
                }
                bVar2.mo4264d(this.f2900l.f2886c[i5]);
                C0747i iVar2 = bVar2.f2879a;
                iVar2.f2936c = i4;
                iVar2.mo4296c(bVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.f2897i / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return i2;
    }

    /* renamed from: b */
    private void m4102b(C0739b bVar) {
        bVar.mo4242a(this, 0);
    }

    /* renamed from: c */
    private final void m4103c(C0739b bVar) {
        C0739b[] bVarArr = this.f2894f;
        int i = this.f2898j;
        if (bVarArr[i] != null) {
            this.f2900l.f2884a.mo4291a(bVarArr[i]);
        }
        C0739b[] bVarArr2 = this.f2894f;
        int i2 = this.f2898j;
        bVarArr2[i2] = bVar;
        C0747i iVar = bVar.f2879a;
        iVar.f2936c = i2;
        this.f2898j = i2 + 1;
        iVar.mo4296c(bVar);
    }

    /* renamed from: d */
    private final void m4104d(C0739b bVar) {
        if (this.f2898j > 0) {
            bVar.f2882d.mo4233a(bVar, this.f2894f);
            if (bVar.f2882d.f2868a == 0) {
                bVar.f2883e = true;
            }
        }
    }

    /* renamed from: g */
    private void m4105g() {
        for (int i = 0; i < this.f2898j; i++) {
            C0739b bVar = this.f2894f[i];
            bVar.f2879a.f2938e = bVar.f2880b;
        }
    }

    /* renamed from: h */
    public static C0744f m4106h() {
        return f2888q;
    }

    /* renamed from: i */
    private void m4107i() {
        this.f2892d *= 2;
        this.f2894f = (C0739b[]) Arrays.copyOf(this.f2894f, this.f2892d);
        C0740c cVar = this.f2900l;
        cVar.f2886c = (C0747i[]) Arrays.copyOf(cVar.f2886c, this.f2892d);
        int i = this.f2892d;
        this.f2896h = new boolean[i];
        this.f2893e = i;
        this.f2899k = i;
        C0744f fVar = f2888q;
        if (fVar != null) {
            fVar.f2908d++;
            fVar.f2919o = Math.max(fVar.f2919o, (long) i);
            C0744f fVar2 = f2888q;
            fVar2.f2904A = fVar2.f2919o;
        }
    }

    /* renamed from: j */
    private void m4108j() {
        int i = 0;
        while (true) {
            C0739b[] bVarArr = this.f2894f;
            if (i < bVarArr.length) {
                C0739b bVar = bVarArr[i];
                if (bVar != null) {
                    this.f2900l.f2884a.mo4291a(bVar);
                }
                this.f2894f[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public C0739b mo4268a(C0747i iVar, C0747i iVar2, int i, int i2) {
        C0739b b = mo4281b();
        b.mo4244a(iVar, iVar2, i);
        if (i2 != 6) {
            b.mo4242a(this, i2);
        }
        mo4272a(b);
        return b;
    }

    /* renamed from: a */
    public C0747i mo4269a() {
        C0744f fVar = f2888q;
        if (fVar != null) {
            fVar.f2918n++;
        }
        if (this.f2897i + 1 >= this.f2893e) {
            m4107i();
        }
        C0747i a = m4100a(C0747i.C0748a.SLACK, (String) null);
        this.f2889a++;
        this.f2897i++;
        int i = this.f2889a;
        a.f2935b = i;
        this.f2900l.f2886c[i] = a;
        return a;
    }

    /* renamed from: a */
    public C0747i mo4270a(int i, String str) {
        C0744f fVar = f2888q;
        if (fVar != null) {
            fVar.f2916l++;
        }
        if (this.f2897i + 1 >= this.f2893e) {
            m4107i();
        }
        C0747i a = m4100a(C0747i.C0748a.ERROR, str);
        this.f2889a++;
        this.f2897i++;
        int i2 = this.f2889a;
        a.f2935b = i2;
        a.f2937d = i;
        this.f2900l.f2886c[i2] = a;
        this.f2891c.mo4252a(a);
        return a;
    }

    /* renamed from: a */
    public C0747i mo4271a(Object obj) {
        C0747i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f2897i + 1 >= this.f2893e) {
            m4107i();
        }
        if (obj instanceof C0753e) {
            C0753e eVar = (C0753e) obj;
            iVar = eVar.mo4314e();
            if (iVar == null) {
                eVar.mo4307a(this.f2900l);
                iVar = eVar.mo4314e();
            }
            int i = iVar.f2935b;
            if (i == -1 || i > this.f2889a || this.f2900l.f2886c[i] == null) {
                if (iVar.f2935b != -1) {
                    iVar.mo4292a();
                }
                this.f2889a++;
                this.f2897i++;
                int i2 = this.f2889a;
                iVar.f2935b = i2;
                iVar.f2940g = C0747i.C0748a.UNRESTRICTED;
                this.f2900l.f2886c[i2] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: a */
    public void mo4272a(C0739b bVar) {
        C0747i c;
        if (bVar != null) {
            C0744f fVar = f2888q;
            if (fVar != null) {
                fVar.f2910f++;
                if (bVar.f2883e) {
                    fVar.f2911g++;
                }
            }
            if (this.f2898j + 1 >= this.f2899k || this.f2897i + 1 >= this.f2893e) {
                m4107i();
            }
            boolean z = false;
            if (!bVar.f2883e) {
                m4104d(bVar);
                if (!bVar.mo4261c()) {
                    bVar.mo4250a();
                    if (bVar.mo4253a(this)) {
                        C0747i a = mo4269a();
                        bVar.f2879a = a;
                        m4103c(bVar);
                        this.f2903o.mo4251a((C0743a) bVar);
                        m4098a(this.f2903o, true);
                        if (a.f2936c == -1) {
                            if (bVar.f2879a == a && (c = bVar.mo4260c(a)) != null) {
                                C0744f fVar2 = f2888q;
                                if (fVar2 != null) {
                                    fVar2.f2914j++;
                                }
                                bVar.mo4264d(c);
                            }
                            if (!bVar.f2883e) {
                                bVar.f2879a.mo4296c(bVar);
                            }
                            this.f2898j--;
                        }
                        z = true;
                    }
                    if (!bVar.mo4257b()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z) {
                m4103c(bVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4273a(C0739b bVar, int i, int i2) {
        bVar.mo4243a(mo4270a(i2, (String) null), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4274a(C0743a aVar) {
        C0744f fVar = f2888q;
        if (fVar != null) {
            fVar.f2923s++;
            fVar.f2924t = Math.max(fVar.f2924t, (long) this.f2897i);
            C0744f fVar2 = f2888q;
            fVar2.f2925u = Math.max(fVar2.f2925u, (long) this.f2898j);
        }
        m4104d((C0739b) aVar);
        m4101b(aVar);
        m4098a(aVar, false);
        m4105g();
    }

    /* renamed from: a */
    public void mo4275a(C0747i iVar, int i) {
        C0739b bVar;
        int i2 = iVar.f2936c;
        if (i2 != -1) {
            C0739b bVar2 = this.f2894f[i2];
            if (!bVar2.f2883e) {
                if (bVar2.f2882d.f2868a == 0) {
                    bVar2.f2883e = true;
                } else {
                    bVar = mo4281b();
                    bVar.mo4259c(iVar, i);
                }
            }
            bVar2.f2880b = (float) i;
            return;
        }
        bVar = mo4281b();
        bVar.mo4254b(iVar, i);
        mo4272a(bVar);
    }

    /* renamed from: a */
    public void mo4276a(C0747i iVar, C0747i iVar2, int i, float f, C0747i iVar3, C0747i iVar4, int i2, int i3) {
        int i4 = i3;
        C0739b b = mo4281b();
        b.mo4245a(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i4 != 6) {
            b.mo4242a(this, i4);
        }
        mo4272a(b);
    }

    /* renamed from: a */
    public void mo4277a(C0747i iVar, C0747i iVar2, C0747i iVar3, C0747i iVar4, float f, int i) {
        C0739b b = mo4281b();
        b.mo4248a(iVar, iVar2, iVar3, iVar4, f);
        if (i != 6) {
            b.mo4242a(this, i);
        }
        mo4272a(b);
    }

    /* renamed from: a */
    public void mo4278a(C0747i iVar, C0747i iVar2, boolean z) {
        C0739b b = mo4281b();
        C0747i c = mo4284c();
        c.f2937d = 0;
        b.mo4247a(iVar, iVar2, c, 0);
        if (z) {
            mo4273a(b, (int) (b.f2882d.mo4238b(c) * -1.0f), 1);
        }
        mo4272a(b);
    }

    /* renamed from: a */
    public void mo4279a(C0758f fVar, C0758f fVar2, float f, int i) {
        C0758f fVar3 = fVar;
        C0758f fVar4 = fVar2;
        C0747i a = mo4271a((Object) fVar3.mo4328a(C0753e.C0757d.LEFT));
        C0747i a2 = mo4271a((Object) fVar3.mo4328a(C0753e.C0757d.TOP));
        C0747i a3 = mo4271a((Object) fVar3.mo4328a(C0753e.C0757d.RIGHT));
        C0747i a4 = mo4271a((Object) fVar3.mo4328a(C0753e.C0757d.BOTTOM));
        C0747i a5 = mo4271a((Object) fVar4.mo4328a(C0753e.C0757d.LEFT));
        C0747i a6 = mo4271a((Object) fVar4.mo4328a(C0753e.C0757d.TOP));
        C0747i a7 = mo4271a((Object) fVar4.mo4328a(C0753e.C0757d.RIGHT));
        C0747i a8 = mo4271a((Object) fVar4.mo4328a(C0753e.C0757d.BOTTOM));
        C0739b b = mo4281b();
        double d = (double) f;
        C0747i iVar = a3;
        double d2 = (double) i;
        b.mo4256b(a2, a4, a6, a8, (float) (Math.sin(d) * d2));
        mo4272a(b);
        C0739b b2 = mo4281b();
        b2.mo4256b(a, iVar, a5, a7, (float) (Math.cos(d) * d2));
        mo4272a(b2);
    }

    /* renamed from: b */
    public int mo4280b(Object obj) {
        C0747i e = ((C0753e) obj).mo4314e();
        if (e != null) {
            return (int) (e.f2938e + 0.5f);
        }
        return 0;
    }

    /* renamed from: b */
    public C0739b mo4281b() {
        C0739b a = this.f2900l.f2884a.mo4289a();
        if (a == null) {
            a = new C0739b(this.f2900l);
        } else {
            a.mo4263d();
        }
        C0747i.m4139b();
        return a;
    }

    /* renamed from: b */
    public void mo4282b(C0747i iVar, C0747i iVar2, int i, int i2) {
        C0739b b = mo4281b();
        C0747i c = mo4284c();
        c.f2937d = 0;
        b.mo4247a(iVar, iVar2, c, i);
        if (i2 != 6) {
            mo4273a(b, (int) (b.f2882d.mo4238b(c) * -1.0f), i2);
        }
        mo4272a(b);
    }

    /* renamed from: b */
    public void mo4283b(C0747i iVar, C0747i iVar2, boolean z) {
        C0739b b = mo4281b();
        C0747i c = mo4284c();
        c.f2937d = 0;
        b.mo4255b(iVar, iVar2, c, 0);
        if (z) {
            mo4273a(b, (int) (b.f2882d.mo4238b(c) * -1.0f), 1);
        }
        mo4272a(b);
    }

    /* renamed from: c */
    public C0747i mo4284c() {
        C0744f fVar = f2888q;
        if (fVar != null) {
            fVar.f2917m++;
        }
        if (this.f2897i + 1 >= this.f2893e) {
            m4107i();
        }
        C0747i a = m4100a(C0747i.C0748a.SLACK, (String) null);
        this.f2889a++;
        this.f2897i++;
        int i = this.f2889a;
        a.f2935b = i;
        this.f2900l.f2886c[i] = a;
        return a;
    }

    /* renamed from: c */
    public void mo4285c(C0747i iVar, C0747i iVar2, int i, int i2) {
        C0739b b = mo4281b();
        C0747i c = mo4284c();
        c.f2937d = 0;
        b.mo4255b(iVar, iVar2, c, i);
        if (i2 != 6) {
            mo4273a(b, (int) (b.f2882d.mo4238b(c) * -1.0f), i2);
        }
        mo4272a(b);
    }

    /* renamed from: d */
    public C0740c mo4286d() {
        return this.f2900l;
    }

    /* renamed from: e */
    public void mo4287e() {
        C0744f fVar = f2888q;
        if (fVar != null) {
            fVar.f2909e++;
        }
        if (this.f2895g) {
            C0744f fVar2 = f2888q;
            if (fVar2 != null) {
                fVar2.f2921q++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f2898j) {
                    z = true;
                    break;
                } else if (!this.f2894f[i].f2883e) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                C0744f fVar3 = f2888q;
                if (fVar3 != null) {
                    fVar3.f2920p++;
                }
                m4105g();
                return;
            }
        }
        mo4274a(this.f2891c);
    }

    /* renamed from: f */
    public void mo4288f() {
        C0740c cVar;
        int i = 0;
        while (true) {
            cVar = this.f2900l;
            C0747i[] iVarArr = cVar.f2886c;
            if (i >= iVarArr.length) {
                break;
            }
            C0747i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.mo4292a();
            }
            i++;
        }
        cVar.f2885b.mo4290a(this.f2901m, this.f2902n);
        this.f2902n = 0;
        Arrays.fill(this.f2900l.f2886c, (Object) null);
        HashMap<String, C0747i> hashMap = this.f2890b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f2889a = 0;
        this.f2891c.clear();
        this.f2897i = 1;
        for (int i2 = 0; i2 < this.f2898j; i2++) {
            this.f2894f[i2].f2881c = false;
        }
        m4108j();
        this.f2898j = 0;
    }
}
