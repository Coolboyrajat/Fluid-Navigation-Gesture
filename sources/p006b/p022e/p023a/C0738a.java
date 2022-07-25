package p006b.p022e.p023a;

import java.util.Arrays;
import p006b.p022e.p023a.C0747i;
import p190io.objectbox.android.BuildConfig;

/* renamed from: b.e.a.a */
public class C0738a {

    /* renamed from: a */
    int f2868a = 0;

    /* renamed from: b */
    private final C0739b f2869b;

    /* renamed from: c */
    private final C0740c f2870c;

    /* renamed from: d */
    private int f2871d = 8;

    /* renamed from: e */
    private C0747i f2872e = null;

    /* renamed from: f */
    private int[] f2873f;

    /* renamed from: g */
    private int[] f2874g;

    /* renamed from: h */
    private float[] f2875h;

    /* renamed from: i */
    private int f2876i;

    /* renamed from: j */
    private int f2877j;

    /* renamed from: k */
    private boolean f2878k;

    C0738a(C0739b bVar, C0740c cVar) {
        int i = this.f2871d;
        this.f2873f = new int[i];
        this.f2874g = new int[i];
        this.f2875h = new float[i];
        this.f2876i = -1;
        this.f2877j = -1;
        this.f2878k = false;
        this.f2869b = bVar;
        this.f2870c = cVar;
    }

    /* renamed from: a */
    private boolean m4058a(C0747i iVar, C0742e eVar) {
        return iVar.f2943j <= 1;
    }

    /* renamed from: a */
    public final float mo4226a(C0747i iVar, boolean z) {
        if (this.f2872e == iVar) {
            this.f2872e = null;
        }
        int i = this.f2876i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f2868a) {
            if (this.f2873f[i] == iVar.f2935b) {
                if (i == this.f2876i) {
                    this.f2876i = this.f2874g[i];
                } else {
                    int[] iArr = this.f2874g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.mo4295b(this.f2869b);
                }
                iVar.f2943j--;
                this.f2868a--;
                this.f2873f[i] = -1;
                if (this.f2878k) {
                    this.f2877j = i;
                }
                return this.f2875h[i];
            }
            i2++;
            i3 = i;
            i = this.f2874g[i];
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0747i mo4227a(int i) {
        int i2 = this.f2876i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f2868a) {
            if (i3 == i) {
                return this.f2870c.f2886c[this.f2873f[i2]];
            }
            i2 = this.f2874g[i2];
            i3++;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0082 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p006b.p022e.p023a.C0747i mo4228a(p006b.p022e.p023a.C0742e r15) {
        /*
            r14 = this;
            int r0 = r14.f2876i
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000a:
            r9 = -1
            if (r0 == r9) goto L_0x0089
            int r9 = r14.f2868a
            if (r2 >= r9) goto L_0x0089
            float[] r9 = r14.f2875h
            r10 = r9[r0]
            r11 = 981668463(0x3a83126f, float:0.001)
            b.e.a.c r12 = r14.f2870c
            b.e.a.i[] r12 = r12.f2886c
            int[] r13 = r14.f2873f
            r13 = r13[r0]
            r12 = r12[r13]
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0030
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x003c
            r9[r0] = r3
            goto L_0x0036
        L_0x0030:
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x003c
            r9[r0] = r3
        L_0x0036:
            b.e.a.b r9 = r14.f2869b
            r12.mo4295b(r9)
            r10 = 0
        L_0x003c:
            r9 = 1
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x0082
            b.e.a.i$a r11 = r12.f2940g
            b.e.a.i$a r13 = p006b.p022e.p023a.C0747i.C0748a.UNRESTRICTED
            if (r11 != r13) goto L_0x0062
            if (r4 != 0) goto L_0x0051
        L_0x0049:
            boolean r4 = r14.m4058a((p006b.p022e.p023a.C0747i) r12, (p006b.p022e.p023a.C0742e) r15)
            r6 = r4
            r5 = r10
            r4 = r12
            goto L_0x0082
        L_0x0051:
            int r11 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0056
            goto L_0x0049
        L_0x0056:
            if (r6 != 0) goto L_0x0082
            boolean r11 = r14.m4058a((p006b.p022e.p023a.C0747i) r12, (p006b.p022e.p023a.C0742e) r15)
            if (r11 == 0) goto L_0x0082
            r5 = r10
            r4 = r12
            r6 = 1
            goto L_0x0082
        L_0x0062:
            if (r4 != 0) goto L_0x0082
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x0082
            if (r1 != 0) goto L_0x0072
        L_0x006a:
            boolean r1 = r14.m4058a((p006b.p022e.p023a.C0747i) r12, (p006b.p022e.p023a.C0742e) r15)
            r8 = r1
            r7 = r10
            r1 = r12
            goto L_0x0082
        L_0x0072:
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0077
            goto L_0x006a
        L_0x0077:
            if (r8 != 0) goto L_0x0082
            boolean r11 = r14.m4058a((p006b.p022e.p023a.C0747i) r12, (p006b.p022e.p023a.C0742e) r15)
            if (r11 == 0) goto L_0x0082
            r7 = r10
            r1 = r12
            r8 = 1
        L_0x0082:
            int[] r9 = r14.f2874g
            r0 = r9[r0]
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0089:
            if (r4 == 0) goto L_0x008c
            return r4
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p023a.C0738a.mo4228a(b.e.a.e):b.e.a.i");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0747i mo4229a(boolean[] zArr, C0747i iVar) {
        C0747i.C0748a aVar;
        int i = this.f2876i;
        int i2 = 0;
        C0747i iVar2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f2868a) {
            if (this.f2875h[i] < 0.0f) {
                C0747i iVar3 = this.f2870c.f2886c[this.f2873f[i]];
                if ((zArr == null || !zArr[iVar3.f2935b]) && iVar3 != iVar && ((aVar = iVar3.f2940g) == C0747i.C0748a.SLACK || aVar == C0747i.C0748a.ERROR)) {
                    float f2 = this.f2875h[i];
                    if (f2 < f) {
                        iVar2 = iVar3;
                        f = f2;
                    }
                }
            }
            i = this.f2874g[i];
            i2++;
        }
        return iVar2;
    }

    /* renamed from: a */
    public final void mo4230a() {
        int i = this.f2876i;
        int i2 = 0;
        while (i != -1 && i2 < this.f2868a) {
            C0747i iVar = this.f2870c.f2886c[this.f2873f[i]];
            if (iVar != null) {
                iVar.mo4295b(this.f2869b);
            }
            i = this.f2874g[i];
            i2++;
        }
        this.f2876i = -1;
        this.f2877j = -1;
        this.f2878k = false;
        this.f2868a = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4231a(float f) {
        int i = this.f2876i;
        int i2 = 0;
        while (i != -1 && i2 < this.f2868a) {
            float[] fArr = this.f2875h;
            fArr[i] = fArr[i] / f;
            i = this.f2874g[i];
            i2++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4232a(C0739b bVar, C0739b bVar2, boolean z) {
        int i = this.f2876i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f2868a) {
                int i3 = this.f2873f[i];
                C0747i iVar = bVar2.f2879a;
                if (i3 == iVar.f2935b) {
                    float f = this.f2875h[i];
                    mo4226a(iVar, z);
                    C0738a aVar = bVar2.f2882d;
                    int i4 = aVar.f2876i;
                    int i5 = 0;
                    while (i4 != -1 && i5 < aVar.f2868a) {
                        mo4235a(this.f2870c.f2886c[aVar.f2873f[i4]], aVar.f2875h[i4] * f, z);
                        i4 = aVar.f2874g[i4];
                        i5++;
                    }
                    bVar.f2880b += bVar2.f2880b * f;
                    if (z) {
                        bVar2.f2879a.mo4295b(bVar);
                    }
                    i = this.f2876i;
                } else {
                    i = this.f2874g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4233a(C0739b bVar, C0739b[] bVarArr) {
        int i = this.f2876i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f2868a) {
                C0747i iVar = this.f2870c.f2886c[this.f2873f[i]];
                if (iVar.f2936c != -1) {
                    float f = this.f2875h[i];
                    mo4226a(iVar, true);
                    C0739b bVar2 = bVarArr[iVar.f2936c];
                    if (!bVar2.f2883e) {
                        C0738a aVar = bVar2.f2882d;
                        int i3 = aVar.f2876i;
                        int i4 = 0;
                        while (i3 != -1 && i4 < aVar.f2868a) {
                            mo4235a(this.f2870c.f2886c[aVar.f2873f[i3]], aVar.f2875h[i3] * f, true);
                            i3 = aVar.f2874g[i3];
                            i4++;
                        }
                    }
                    bVar.f2880b += bVar2.f2880b * f;
                    bVar2.f2879a.mo4295b(bVar);
                    i = this.f2876i;
                } else {
                    i = this.f2874g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    public final void mo4234a(C0747i iVar, float f) {
        if (f == 0.0f) {
            mo4226a(iVar, true);
            return;
        }
        int i = this.f2876i;
        if (i == -1) {
            this.f2876i = 0;
            float[] fArr = this.f2875h;
            int i2 = this.f2876i;
            fArr[i2] = f;
            this.f2873f[i2] = iVar.f2935b;
            this.f2874g[i2] = -1;
            iVar.f2943j++;
            iVar.mo4293a(this.f2869b);
            this.f2868a++;
            if (!this.f2878k) {
                this.f2877j++;
                int i3 = this.f2877j;
                int[] iArr = this.f2873f;
                if (i3 >= iArr.length) {
                    this.f2878k = true;
                    this.f2877j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i != -1 && i4 < this.f2868a) {
            int[] iArr2 = this.f2873f;
            int i6 = iArr2[i];
            int i7 = iVar.f2935b;
            if (i6 == i7) {
                this.f2875h[i] = f;
                return;
            }
            if (iArr2[i] < i7) {
                i5 = i;
            }
            i = this.f2874g[i];
            i4++;
        }
        int i8 = this.f2877j;
        int i9 = i8 + 1;
        if (this.f2878k) {
            int[] iArr3 = this.f2873f;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f2873f;
        if (i8 >= iArr4.length && this.f2868a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f2873f;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.f2873f;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            this.f2871d *= 2;
            this.f2878k = false;
            this.f2877j = i8 - 1;
            this.f2875h = Arrays.copyOf(this.f2875h, this.f2871d);
            this.f2873f = Arrays.copyOf(this.f2873f, this.f2871d);
            this.f2874g = Arrays.copyOf(this.f2874g, this.f2871d);
        }
        this.f2873f[i8] = iVar.f2935b;
        this.f2875h[i8] = f;
        int[] iArr7 = this.f2874g;
        if (i5 != -1) {
            iArr7[i8] = iArr7[i5];
            iArr7[i5] = i8;
        } else {
            iArr7[i8] = this.f2876i;
            this.f2876i = i8;
        }
        iVar.f2943j++;
        iVar.mo4293a(this.f2869b);
        this.f2868a++;
        if (!this.f2878k) {
            this.f2877j++;
        }
        if (this.f2868a >= this.f2873f.length) {
            this.f2878k = true;
        }
        int i11 = this.f2877j;
        int[] iArr8 = this.f2873f;
        if (i11 >= iArr8.length) {
            this.f2878k = true;
            this.f2877j = iArr8.length - 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4235a(C0747i iVar, float f, boolean z) {
        if (f != 0.0f) {
            int i = this.f2876i;
            if (i == -1) {
                this.f2876i = 0;
                float[] fArr = this.f2875h;
                int i2 = this.f2876i;
                fArr[i2] = f;
                this.f2873f[i2] = iVar.f2935b;
                this.f2874g[i2] = -1;
                iVar.f2943j++;
                iVar.mo4293a(this.f2869b);
                this.f2868a++;
                if (!this.f2878k) {
                    this.f2877j++;
                    int i3 = this.f2877j;
                    int[] iArr = this.f2873f;
                    if (i3 >= iArr.length) {
                        this.f2878k = true;
                        this.f2877j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i != -1 && i4 < this.f2868a) {
                int[] iArr2 = this.f2873f;
                int i6 = iArr2[i];
                int i7 = iVar.f2935b;
                if (i6 == i7) {
                    float[] fArr2 = this.f2875h;
                    fArr2[i] = fArr2[i] + f;
                    if (fArr2[i] == 0.0f) {
                        if (i == this.f2876i) {
                            this.f2876i = this.f2874g[i];
                        } else {
                            int[] iArr3 = this.f2874g;
                            iArr3[i5] = iArr3[i];
                        }
                        if (z) {
                            iVar.mo4295b(this.f2869b);
                        }
                        if (this.f2878k) {
                            this.f2877j = i;
                        }
                        iVar.f2943j--;
                        this.f2868a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i7) {
                    i5 = i;
                }
                i = this.f2874g[i];
                i4++;
            }
            int i8 = this.f2877j;
            int i9 = i8 + 1;
            if (this.f2878k) {
                int[] iArr4 = this.f2873f;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.f2873f;
            if (i8 >= iArr5.length && this.f2868a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.f2873f;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.f2873f;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                this.f2871d *= 2;
                this.f2878k = false;
                this.f2877j = i8 - 1;
                this.f2875h = Arrays.copyOf(this.f2875h, this.f2871d);
                this.f2873f = Arrays.copyOf(this.f2873f, this.f2871d);
                this.f2874g = Arrays.copyOf(this.f2874g, this.f2871d);
            }
            this.f2873f[i8] = iVar.f2935b;
            this.f2875h[i8] = f;
            int[] iArr8 = this.f2874g;
            if (i5 != -1) {
                iArr8[i8] = iArr8[i5];
                iArr8[i5] = i8;
            } else {
                iArr8[i8] = this.f2876i;
                this.f2876i = i8;
            }
            iVar.f2943j++;
            iVar.mo4293a(this.f2869b);
            this.f2868a++;
            if (!this.f2878k) {
                this.f2877j++;
            }
            int i11 = this.f2877j;
            int[] iArr9 = this.f2873f;
            if (i11 >= iArr9.length) {
                this.f2878k = true;
                this.f2877j = iArr9.length - 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo4236a(C0747i iVar) {
        int i = this.f2876i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f2868a) {
            if (this.f2873f[i] == iVar.f2935b) {
                return true;
            }
            i = this.f2874g[i];
            i2++;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo4237b(int i) {
        int i2 = this.f2876i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f2868a) {
            if (i3 == i) {
                return this.f2875h[i2];
            }
            i2 = this.f2874g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final float mo4238b(C0747i iVar) {
        int i = this.f2876i;
        int i2 = 0;
        while (i != -1 && i2 < this.f2868a) {
            if (this.f2873f[i] == iVar.f2935b) {
                return this.f2875h[i];
            }
            i = this.f2874g[i];
            i2++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4239b() {
        int i = this.f2876i;
        int i2 = 0;
        while (i != -1 && i2 < this.f2868a) {
            float[] fArr = this.f2875h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f2874g[i];
            i2++;
        }
    }

    public String toString() {
        int i = this.f2876i;
        String str = BuildConfig.FLAVOR;
        int i2 = 0;
        while (i != -1 && i2 < this.f2868a) {
            str = ((str + " -> ") + this.f2875h[i] + " : ") + this.f2870c.f2886c[this.f2873f[i]];
            i = this.f2874g[i];
            i2++;
        }
        return str;
    }
}
