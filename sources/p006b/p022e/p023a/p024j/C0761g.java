package p006b.p022e.p023a.p024j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p006b.p022e.p023a.C0742e;
import p006b.p022e.p023a.p024j.C0753e;
import p006b.p022e.p023a.p024j.C0758f;

/* renamed from: b.e.a.j.g */
public class C0761g extends C0773q {

    /* renamed from: A0 */
    public int f3066A0 = 0;

    /* renamed from: B0 */
    public int f3067B0 = 0;

    /* renamed from: C0 */
    private int f3068C0 = 7;

    /* renamed from: D0 */
    public boolean f3069D0 = false;

    /* renamed from: E0 */
    private boolean f3070E0 = false;

    /* renamed from: F0 */
    private boolean f3071F0 = false;

    /* renamed from: l0 */
    private boolean f3072l0 = false;

    /* renamed from: m0 */
    protected C0742e f3073m0 = new C0742e();

    /* renamed from: n0 */
    private C0771p f3074n0;

    /* renamed from: o0 */
    int f3075o0;

    /* renamed from: p0 */
    int f3076p0;

    /* renamed from: q0 */
    int f3077q0;

    /* renamed from: r0 */
    int f3078r0;

    /* renamed from: s0 */
    int f3079s0 = 0;

    /* renamed from: t0 */
    int f3080t0 = 0;

    /* renamed from: u0 */
    C0752d[] f3081u0 = new C0752d[4];

    /* renamed from: v0 */
    C0752d[] f3082v0 = new C0752d[4];

    /* renamed from: w0 */
    public List<C0762h> f3083w0 = new ArrayList();

    /* renamed from: x0 */
    public boolean f3084x0 = false;

    /* renamed from: y0 */
    public boolean f3085y0 = false;

    /* renamed from: z0 */
    public boolean f3086z0 = false;

    /* renamed from: V */
    private void m4269V() {
        this.f3079s0 = 0;
        this.f3080t0 = 0;
    }

    /* renamed from: d */
    private void m4270d(C0758f fVar) {
        int i = this.f3079s0 + 1;
        C0752d[] dVarArr = this.f3082v0;
        if (i >= dVarArr.length) {
            this.f3082v0 = (C0752d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.f3082v0[this.f3079s0] = new C0752d(fVar, 0, mo4404P());
        this.f3079s0++;
    }

    /* renamed from: e */
    private void m4271e(C0758f fVar) {
        int i = this.f3080t0 + 1;
        C0752d[] dVarArr = this.f3081u0;
        if (i >= dVarArr.length) {
            this.f3081u0 = (C0752d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.f3081u0[this.f3080t0] = new C0752d(fVar, 1, mo4404P());
        this.f3080t0++;
    }

    /* renamed from: D */
    public void mo4324D() {
        this.f3073m0.mo4288f();
        this.f3075o0 = 0;
        this.f3077q0 = 0;
        this.f3076p0 = 0;
        this.f3078r0 = 0;
        this.f3083w0.clear();
        this.f3069D0 = false;
        super.mo4324D();
    }

    /* JADX WARNING: type inference failed for: r8v16, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01de  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4400K() {
        /*
            r21 = this;
            r1 = r21
            int r2 = r1.f3006I
            int r3 = r1.f3007J
            int r0 = r21.mo4390s()
            r4 = 0
            int r5 = java.lang.Math.max(r4, r0)
            int r0 = r21.mo4370i()
            int r6 = java.lang.Math.max(r4, r0)
            r1.f3070E0 = r4
            r1.f3071F0 = r4
            b.e.a.j.f r0 = r1.f3001D
            if (r0 == 0) goto L_0x0046
            b.e.a.j.p r0 = r1.f3074n0
            if (r0 != 0) goto L_0x002a
            b.e.a.j.p r0 = new b.e.a.j.p
            r0.<init>(r1)
            r1.f3074n0 = r0
        L_0x002a:
            b.e.a.j.p r0 = r1.f3074n0
            r0.mo4447b(r1)
            int r0 = r1.f3075o0
            r1.mo4389r(r0)
            int r0 = r1.f3076p0
            r1.mo4391s(r0)
            r21.mo4325E()
            b.e.a.e r0 = r1.f3073m0
            b.e.a.c r0 = r0.mo4286d()
            r1.mo4334a(r0)
            goto L_0x004a
        L_0x0046:
            r1.f3006I = r4
            r1.f3007J = r4
        L_0x004a:
            int r0 = r1.f3068C0
            r7 = 32
            r8 = 8
            r9 = 1
            if (r0 == 0) goto L_0x006a
            boolean r0 = r1.mo4304t(r8)
            if (r0 != 0) goto L_0x005c
            r21.mo4407S()
        L_0x005c:
            boolean r0 = r1.mo4304t(r7)
            if (r0 != 0) goto L_0x0065
            r21.mo4406R()
        L_0x0065:
            b.e.a.e r0 = r1.f3073m0
            r0.f2895g = r9
            goto L_0x006e
        L_0x006a:
            b.e.a.e r0 = r1.f3073m0
            r0.f2895g = r4
        L_0x006e:
            b.e.a.j.f$b[] r0 = r1.f3000C
            r10 = r0[r9]
            r11 = r0[r4]
            r21.m4269V()
            java.util.List<b.e.a.j.h> r0 = r1.f3083w0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0090
            java.util.List<b.e.a.j.h> r0 = r1.f3083w0
            r0.clear()
            java.util.List<b.e.a.j.h> r0 = r1.f3083w0
            b.e.a.j.h r12 = new b.e.a.j.h
            java.util.ArrayList<b.e.a.j.f> r13 = r1.f3132k0
            r12.<init>(r13)
            r0.add(r4, r12)
        L_0x0090:
            java.util.List<b.e.a.j.h> r0 = r1.f3083w0
            int r12 = r0.size()
            java.util.ArrayList<b.e.a.j.f> r13 = r1.f3132k0
            b.e.a.j.f$b r0 = r21.mo4372j()
            b.e.a.j.f$b r14 = p006b.p022e.p023a.p024j.C0758f.C0760b.WRAP_CONTENT
            if (r0 == r14) goto L_0x00ab
            b.e.a.j.f$b r0 = r21.mo4386q()
            b.e.a.j.f$b r14 = p006b.p022e.p023a.p024j.C0758f.C0760b.WRAP_CONTENT
            if (r0 != r14) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r14 = 0
            goto L_0x00ac
        L_0x00ab:
            r14 = 1
        L_0x00ac:
            r0 = 0
            r15 = 0
        L_0x00ae:
            if (r15 >= r12) goto L_0x02ee
            boolean r8 = r1.f3069D0
            if (r8 != 0) goto L_0x02ee
            java.util.List<b.e.a.j.h> r8 = r1.f3083w0
            java.lang.Object r8 = r8.get(r15)
            b.e.a.j.h r8 = (p006b.p022e.p023a.p024j.C0762h) r8
            boolean r8 = r8.f3090d
            if (r8 == 0) goto L_0x00c4
            r19 = r12
            goto L_0x02e2
        L_0x00c4:
            boolean r8 = r1.mo4304t(r7)
            if (r8 == 0) goto L_0x00f5
            b.e.a.j.f$b r8 = r21.mo4372j()
            b.e.a.j.f$b r7 = p006b.p022e.p023a.p024j.C0758f.C0760b.FIXED
            if (r8 != r7) goto L_0x00e7
            b.e.a.j.f$b r7 = r21.mo4386q()
            b.e.a.j.f$b r8 = p006b.p022e.p023a.p024j.C0758f.C0760b.FIXED
            if (r7 != r8) goto L_0x00e7
            java.util.List<b.e.a.j.h> r7 = r1.f3083w0
            java.lang.Object r7 = r7.get(r15)
            b.e.a.j.h r7 = (p006b.p022e.p023a.p024j.C0762h) r7
            java.util.List r7 = r7.mo4416a()
            goto L_0x00f1
        L_0x00e7:
            java.util.List<b.e.a.j.h> r7 = r1.f3083w0
            java.lang.Object r7 = r7.get(r15)
            b.e.a.j.h r7 = (p006b.p022e.p023a.p024j.C0762h) r7
            java.util.List<b.e.a.j.f> r7 = r7.f3087a
        L_0x00f1:
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r1.f3132k0 = r7
        L_0x00f5:
            r21.m4269V()
            java.util.ArrayList<b.e.a.j.f> r7 = r1.f3132k0
            int r7 = r7.size()
            r8 = 0
        L_0x00ff:
            if (r8 >= r7) goto L_0x0117
            java.util.ArrayList<b.e.a.j.f> r4 = r1.f3132k0
            java.lang.Object r4 = r4.get(r8)
            b.e.a.j.f r4 = (p006b.p022e.p023a.p024j.C0758f) r4
            boolean r9 = r4 instanceof p006b.p022e.p023a.p024j.C0773q
            if (r9 == 0) goto L_0x0112
            b.e.a.j.q r4 = (p006b.p022e.p023a.p024j.C0773q) r4
            r4.mo4400K()
        L_0x0112:
            int r8 = r8 + 1
            r4 = 0
            r9 = 1
            goto L_0x00ff
        L_0x0117:
            r9 = r0
            r0 = 0
            r4 = 1
        L_0x011a:
            if (r4 == 0) goto L_0x02d1
            r17 = r4
            r8 = 1
            int r4 = r0 + 1
            b.e.a.e r0 = r1.f3073m0     // Catch:{ Exception -> 0x015e }
            r0.mo4288f()     // Catch:{ Exception -> 0x015e }
            r21.m4269V()     // Catch:{ Exception -> 0x015e }
            b.e.a.e r0 = r1.f3073m0     // Catch:{ Exception -> 0x015e }
            r1.mo4348b((p006b.p022e.p023a.C0742e) r0)     // Catch:{ Exception -> 0x015e }
            r0 = 0
        L_0x012f:
            if (r0 >= r7) goto L_0x0145
            java.util.ArrayList<b.e.a.j.f> r8 = r1.f3132k0     // Catch:{ Exception -> 0x015e }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ Exception -> 0x015e }
            b.e.a.j.f r8 = (p006b.p022e.p023a.p024j.C0758f) r8     // Catch:{ Exception -> 0x015e }
            r18 = r9
            b.e.a.e r9 = r1.f3073m0     // Catch:{ Exception -> 0x015c }
            r8.mo4348b((p006b.p022e.p023a.C0742e) r9)     // Catch:{ Exception -> 0x015c }
            int r0 = r0 + 1
            r9 = r18
            goto L_0x012f
        L_0x0145:
            r18 = r9
            b.e.a.e r0 = r1.f3073m0     // Catch:{ Exception -> 0x015c }
            boolean r8 = r1.mo4413d((p006b.p022e.p023a.C0742e) r0)     // Catch:{ Exception -> 0x015c }
            if (r8 == 0) goto L_0x0157
            b.e.a.e r0 = r1.f3073m0     // Catch:{ Exception -> 0x0155 }
            r0.mo4287e()     // Catch:{ Exception -> 0x0155 }
            goto L_0x0157
        L_0x0155:
            r0 = move-exception
            goto L_0x0163
        L_0x0157:
            r17 = r8
            r19 = r12
            goto L_0x0180
        L_0x015c:
            r0 = move-exception
            goto L_0x0161
        L_0x015e:
            r0 = move-exception
            r18 = r9
        L_0x0161:
            r8 = r17
        L_0x0163:
            r0.printStackTrace()
            java.io.PrintStream r9 = java.lang.System.out
            r17 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r19 = r12
            java.lang.String r12 = "EXCEPTION : "
            r8.append(r12)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r9.println(r0)
        L_0x0180:
            b.e.a.e r8 = r1.f3073m0
            if (r17 == 0) goto L_0x018b
            boolean[] r9 = p006b.p022e.p023a.p024j.C0766k.f3107a
            r1.mo4410a((p006b.p022e.p023a.C0742e) r8, (boolean[]) r9)
        L_0x0189:
            r9 = 2
            goto L_0x01d2
        L_0x018b:
            r1.mo4356c((p006b.p022e.p023a.C0742e) r8)
            r8 = 0
        L_0x018f:
            if (r8 >= r7) goto L_0x0189
            java.util.ArrayList<b.e.a.j.f> r9 = r1.f3132k0
            java.lang.Object r9 = r9.get(r8)
            b.e.a.j.f r9 = (p006b.p022e.p023a.p024j.C0758f) r9
            b.e.a.j.f$b[] r12 = r9.f3000C
            r16 = 0
            r12 = r12[r16]
            b.e.a.j.f$b r0 = p006b.p022e.p023a.p024j.C0758f.C0760b.MATCH_CONSTRAINT
            if (r12 != r0) goto L_0x01b4
            int r0 = r9.mo4390s()
            int r12 = r9.mo4394u()
            if (r0 >= r12) goto L_0x01b4
            boolean[] r0 = p006b.p022e.p023a.p024j.C0766k.f3107a
            r8 = 2
            r12 = 1
            r0[r8] = r12
            goto L_0x0189
        L_0x01b4:
            r12 = 1
            b.e.a.j.f$b[] r0 = r9.f3000C
            r0 = r0[r12]
            b.e.a.j.f$b r12 = p006b.p022e.p023a.p024j.C0758f.C0760b.MATCH_CONSTRAINT
            if (r0 != r12) goto L_0x01ce
            int r0 = r9.mo4370i()
            int r9 = r9.mo4392t()
            if (r0 >= r9) goto L_0x01ce
            boolean[] r0 = p006b.p022e.p023a.p024j.C0766k.f3107a
            r8 = 1
            r9 = 2
            r0[r9] = r8
            goto L_0x01d2
        L_0x01ce:
            r9 = 2
            int r8 = r8 + 1
            goto L_0x018f
        L_0x01d2:
            if (r14 == 0) goto L_0x024c
            r8 = 8
            if (r4 >= r8) goto L_0x024c
            boolean[] r0 = p006b.p022e.p023a.p024j.C0766k.f3107a
            boolean r0 = r0[r9]
            if (r0 == 0) goto L_0x024c
            r0 = 0
            r9 = 0
            r12 = 0
        L_0x01e1:
            if (r0 >= r7) goto L_0x020b
            java.util.ArrayList<b.e.a.j.f> r8 = r1.f3132k0
            java.lang.Object r8 = r8.get(r0)
            b.e.a.j.f r8 = (p006b.p022e.p023a.p024j.C0758f) r8
            r17 = r4
            int r4 = r8.f3006I
            int r20 = r8.mo4390s()
            int r4 = r4 + r20
            int r9 = java.lang.Math.max(r9, r4)
            int r4 = r8.f3007J
            int r8 = r8.mo4370i()
            int r4 = r4 + r8
            int r12 = java.lang.Math.max(r12, r4)
            int r0 = r0 + 1
            r4 = r17
            r8 = 8
            goto L_0x01e1
        L_0x020b:
            r17 = r4
            int r0 = r1.f3015R
            int r0 = java.lang.Math.max(r0, r9)
            int r4 = r1.f3016S
            int r4 = java.lang.Math.max(r4, r12)
            b.e.a.j.f$b r8 = p006b.p022e.p023a.p024j.C0758f.C0760b.WRAP_CONTENT
            if (r11 != r8) goto L_0x0231
            int r8 = r21.mo4390s()
            if (r8 >= r0) goto L_0x0231
            r1.mo4383o(r0)
            b.e.a.j.f$b[] r0 = r1.f3000C
            b.e.a.j.f$b r8 = p006b.p022e.p023a.p024j.C0758f.C0760b.WRAP_CONTENT
            r9 = 0
            r0[r9] = r8
            r0 = 1
            r18 = 1
            goto L_0x0232
        L_0x0231:
            r0 = 0
        L_0x0232:
            b.e.a.j.f$b r8 = p006b.p022e.p023a.p024j.C0758f.C0760b.WRAP_CONTENT
            if (r10 != r8) goto L_0x0249
            int r8 = r21.mo4370i()
            if (r8 >= r4) goto L_0x0249
            r1.mo4367g(r4)
            b.e.a.j.f$b[] r0 = r1.f3000C
            b.e.a.j.f$b r4 = p006b.p022e.p023a.p024j.C0758f.C0760b.WRAP_CONTENT
            r8 = 1
            r0[r8] = r4
            r0 = 1
            r9 = 1
            goto L_0x0251
        L_0x0249:
            r9 = r18
            goto L_0x0251
        L_0x024c:
            r17 = r4
            r9 = r18
            r0 = 0
        L_0x0251:
            int r4 = r1.f3015R
            int r8 = r21.mo4390s()
            int r4 = java.lang.Math.max(r4, r8)
            int r8 = r21.mo4390s()
            if (r4 <= r8) goto L_0x026d
            r1.mo4383o(r4)
            b.e.a.j.f$b[] r0 = r1.f3000C
            b.e.a.j.f$b r4 = p006b.p022e.p023a.p024j.C0758f.C0760b.FIXED
            r8 = 0
            r0[r8] = r4
            r0 = 1
            r9 = 1
        L_0x026d:
            int r4 = r1.f3016S
            int r8 = r21.mo4370i()
            int r4 = java.lang.Math.max(r4, r8)
            int r8 = r21.mo4370i()
            if (r4 <= r8) goto L_0x028a
            r1.mo4367g(r4)
            b.e.a.j.f$b[] r0 = r1.f3000C
            b.e.a.j.f$b r4 = p006b.p022e.p023a.p024j.C0758f.C0760b.FIXED
            r8 = 1
            r0[r8] = r4
            r0 = 1
            r9 = 1
            goto L_0x028b
        L_0x028a:
            r8 = 1
        L_0x028b:
            if (r9 != 0) goto L_0x02ca
            b.e.a.j.f$b[] r4 = r1.f3000C
            r12 = 0
            r4 = r4[r12]
            b.e.a.j.f$b r12 = p006b.p022e.p023a.p024j.C0758f.C0760b.WRAP_CONTENT
            if (r4 != r12) goto L_0x02ac
            if (r5 <= 0) goto L_0x02ac
            int r4 = r21.mo4390s()
            if (r4 <= r5) goto L_0x02ac
            r1.f3070E0 = r8
            b.e.a.j.f$b[] r0 = r1.f3000C
            b.e.a.j.f$b r4 = p006b.p022e.p023a.p024j.C0758f.C0760b.FIXED
            r9 = 0
            r0[r9] = r4
            r1.mo4383o(r5)
            r0 = 1
            r9 = 1
        L_0x02ac:
            b.e.a.j.f$b[] r4 = r1.f3000C
            r4 = r4[r8]
            b.e.a.j.f$b r12 = p006b.p022e.p023a.p024j.C0758f.C0760b.WRAP_CONTENT
            if (r4 != r12) goto L_0x02ca
            if (r6 <= 0) goto L_0x02ca
            int r4 = r21.mo4370i()
            if (r4 <= r6) goto L_0x02ca
            r1.f3071F0 = r8
            b.e.a.j.f$b[] r0 = r1.f3000C
            b.e.a.j.f$b r4 = p006b.p022e.p023a.p024j.C0758f.C0760b.FIXED
            r0[r8] = r4
            r1.mo4367g(r6)
            r4 = 1
            r9 = 1
            goto L_0x02cb
        L_0x02ca:
            r4 = r0
        L_0x02cb:
            r0 = r17
            r12 = r19
            goto L_0x011a
        L_0x02d1:
            r18 = r9
            r19 = r12
            java.util.List<b.e.a.j.h> r0 = r1.f3083w0
            java.lang.Object r0 = r0.get(r15)
            b.e.a.j.h r0 = (p006b.p022e.p023a.p024j.C0762h) r0
            r0.mo4420b()
            r0 = r18
        L_0x02e2:
            int r15 = r15 + 1
            r12 = r19
            r4 = 0
            r7 = 32
            r8 = 8
            r9 = 1
            goto L_0x00ae
        L_0x02ee:
            r1.f3132k0 = r13
            b.e.a.j.f r4 = r1.f3001D
            if (r4 == 0) goto L_0x0320
            int r2 = r1.f3015R
            int r3 = r21.mo4390s()
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.f3016S
            int r4 = r21.mo4370i()
            int r3 = java.lang.Math.max(r3, r4)
            b.e.a.j.p r4 = r1.f3074n0
            r4.mo4446a(r1)
            int r4 = r1.f3075o0
            int r2 = r2 + r4
            int r4 = r1.f3077q0
            int r2 = r2 + r4
            r1.mo4383o(r2)
            int r2 = r1.f3076p0
            int r3 = r3 + r2
            int r2 = r1.f3078r0
            int r3 = r3 + r2
            r1.mo4367g(r3)
            goto L_0x0324
        L_0x0320:
            r1.f3006I = r2
            r1.f3007J = r3
        L_0x0324:
            if (r0 == 0) goto L_0x032e
            b.e.a.j.f$b[] r0 = r1.f3000C
            r2 = 0
            r0[r2] = r11
            r2 = 1
            r0[r2] = r10
        L_0x032e:
            b.e.a.e r0 = r1.f3073m0
            b.e.a.c r0 = r0.mo4286d()
            r1.mo4334a(r0)
            b.e.a.j.g r0 = r21.mo4421J()
            if (r1 != r0) goto L_0x0340
            r21.mo4326H()
        L_0x0340:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p023a.p024j.C0761g.mo4400K():void");
    }

    /* renamed from: M */
    public int mo4401M() {
        return this.f3068C0;
    }

    /* renamed from: N */
    public boolean mo4402N() {
        return false;
    }

    /* renamed from: O */
    public boolean mo4403O() {
        return this.f3071F0;
    }

    /* renamed from: P */
    public boolean mo4404P() {
        return this.f3072l0;
    }

    /* renamed from: Q */
    public boolean mo4405Q() {
        return this.f3070E0;
    }

    /* renamed from: R */
    public void mo4406R() {
        if (!mo4304t(8)) {
            mo4300a(this.f3068C0);
        }
        mo4409U();
    }

    /* renamed from: S */
    public void mo4407S() {
        int size = this.f3132k0.size();
        mo4298F();
        for (int i = 0; i < size; i++) {
            this.f3132k0.get(i).mo4298F();
        }
    }

    /* renamed from: T */
    public void mo4408T() {
        mo4407S();
        mo4300a(this.f3068C0);
    }

    /* renamed from: U */
    public void mo4409U() {
        C0768m d = mo4328a(C0753e.C0757d.LEFT).mo4313d();
        C0768m d2 = mo4328a(C0753e.C0757d.TOP).mo4313d();
        d.mo4429a((C0768m) null, 0.0f);
        d2.mo4429a((C0768m) null, 0.0f);
    }

    /* renamed from: a */
    public void mo4300a(int i) {
        super.mo4300a(i);
        int size = this.f3132k0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3132k0.get(i2).mo4300a(i);
        }
    }

    /* renamed from: a */
    public void mo4410a(C0742e eVar, boolean[] zArr) {
        zArr[2] = false;
        mo4356c(eVar);
        int size = this.f3132k0.size();
        for (int i = 0; i < size; i++) {
            C0758f fVar = this.f3132k0.get(i);
            fVar.mo4356c(eVar);
            if (fVar.f3000C[0] == C0758f.C0760b.MATCH_CONSTRAINT && fVar.mo4390s() < fVar.mo4394u()) {
                zArr[2] = true;
            }
            if (fVar.f3000C[1] == C0758f.C0760b.MATCH_CONSTRAINT && fVar.mo4370i() < fVar.mo4392t()) {
                zArr[2] = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4411a(C0758f fVar, int i) {
        if (i == 0) {
            m4270d(fVar);
        } else if (i == 1) {
            m4271e(fVar);
        }
    }

    /* renamed from: c */
    public void mo4412c(boolean z) {
        this.f3072l0 = z;
    }

    /* renamed from: d */
    public boolean mo4413d(C0742e eVar) {
        mo4301a(eVar);
        int size = this.f3132k0.size();
        for (int i = 0; i < size; i++) {
            C0758f fVar = this.f3132k0.get(i);
            if (fVar instanceof C0761g) {
                C0758f.C0760b[] bVarArr = fVar.f3000C;
                C0758f.C0760b bVar = bVarArr[0];
                C0758f.C0760b bVar2 = bVarArr[1];
                if (bVar == C0758f.C0760b.WRAP_CONTENT) {
                    fVar.mo4336a(C0758f.C0760b.FIXED);
                }
                if (bVar2 == C0758f.C0760b.WRAP_CONTENT) {
                    fVar.mo4349b(C0758f.C0760b.FIXED);
                }
                fVar.mo4301a(eVar);
                if (bVar == C0758f.C0760b.WRAP_CONTENT) {
                    fVar.mo4336a(bVar);
                }
                if (bVar2 == C0758f.C0760b.WRAP_CONTENT) {
                    fVar.mo4349b(bVar2);
                }
            } else {
                C0766k.m4313a(this, eVar, fVar);
                fVar.mo4301a(eVar);
            }
        }
        if (this.f3079s0 > 0) {
            C0751c.m4164a(this, eVar, 0);
        }
        if (this.f3080t0 > 0) {
            C0751c.m4164a(this, eVar, 1);
        }
        return true;
    }

    /* renamed from: f */
    public void mo4414f(int i, int i2) {
        C0769n nVar;
        C0769n nVar2;
        if (!(this.f3000C[0] == C0758f.C0760b.WRAP_CONTENT || (nVar2 = this.f3028c) == null)) {
            nVar2.mo4440a(i);
        }
        if (this.f3000C[1] != C0758f.C0760b.WRAP_CONTENT && (nVar = this.f3030d) != null) {
            nVar.mo4440a(i2);
        }
    }

    /* renamed from: t */
    public boolean mo4304t(int i) {
        return (this.f3068C0 & i) == i;
    }

    /* renamed from: u */
    public void mo4415u(int i) {
        this.f3068C0 = i;
    }
}
