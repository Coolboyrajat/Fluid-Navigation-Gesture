package p006b.p022e.p023a.p024j;

import p006b.p022e.p023a.C0742e;
import p006b.p022e.p023a.p024j.C0758f;

/* renamed from: b.e.a.j.k */
public class C0766k {

    /* renamed from: a */
    static boolean[] f3107a = new boolean[3];

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e0, code lost:
        if (r6 != false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        if (r6 != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        if (r6 != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008f, code lost:
        if (r6 != false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e9, code lost:
        if (r6 != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010f, code lost:
        if (r6 != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c4, code lost:
        if (r6 != false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01cf, code lost:
        r4.mo4430a(r2, r1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m4311a(int r16, p006b.p022e.p023a.p024j.C0758f r17) {
        /*
            r0 = r17
            r17.mo4327I()
            b.e.a.j.e r1 = r0.f3051s
            b.e.a.j.m r1 = r1.mo4313d()
            b.e.a.j.e r2 = r0.f3052t
            b.e.a.j.m r2 = r2.mo4313d()
            b.e.a.j.e r3 = r0.f3053u
            b.e.a.j.m r3 = r3.mo4313d()
            b.e.a.j.e r4 = r0.f3054v
            b.e.a.j.m r4 = r4.mo4313d()
            r5 = 8
            r6 = r16 & 8
            r7 = 0
            r8 = 1
            if (r6 != r5) goto L_0x0027
            r6 = 1
            goto L_0x0028
        L_0x0027:
            r6 = 0
        L_0x0028:
            b.e.a.j.f$b[] r9 = r0.f3000C
            r9 = r9[r7]
            b.e.a.j.f$b r10 = p006b.p022e.p023a.p024j.C0758f.C0760b.MATCH_CONSTRAINT
            if (r9 != r10) goto L_0x0038
            boolean r9 = m4314a((p006b.p022e.p023a.p024j.C0758f) r0, (int) r7)
            if (r9 == 0) goto L_0x0038
            r9 = 1
            goto L_0x0039
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r10 = r1.f3113h
            r11 = 3
            r12 = 4
            r13 = 0
            r14 = -1
            r15 = 2
            if (r10 == r12) goto L_0x0181
            int r10 = r3.f3113h
            if (r10 == r12) goto L_0x0181
            b.e.a.j.f$b[] r10 = r0.f3000C
            r10 = r10[r7]
            b.e.a.j.f$b r7 = p006b.p022e.p023a.p024j.C0758f.C0760b.FIXED
            if (r10 == r7) goto L_0x00d7
            if (r9 == 0) goto L_0x0058
            int r7 = r17.mo4388r()
            if (r7 != r5) goto L_0x0058
            goto L_0x00d7
        L_0x0058:
            if (r9 == 0) goto L_0x0181
            int r7 = r17.mo4390s()
            r1.mo4432b(r8)
            r3.mo4432b(r8)
            b.e.a.j.e r9 = r0.f3051s
            b.e.a.j.e r9 = r9.f2973d
            if (r9 != 0) goto L_0x0074
            b.e.a.j.e r9 = r0.f3053u
            b.e.a.j.e r9 = r9.f2973d
            if (r9 != 0) goto L_0x0074
            if (r6 == 0) goto L_0x00f8
            goto L_0x00eb
        L_0x0074:
            b.e.a.j.e r9 = r0.f3051s
            b.e.a.j.e r9 = r9.f2973d
            if (r9 == 0) goto L_0x0083
            b.e.a.j.e r9 = r0.f3053u
            b.e.a.j.e r9 = r9.f2973d
            if (r9 != 0) goto L_0x0083
            if (r6 == 0) goto L_0x00f8
            goto L_0x00eb
        L_0x0083:
            b.e.a.j.e r9 = r0.f3051s
            b.e.a.j.e r9 = r9.f2973d
            if (r9 != 0) goto L_0x0093
            b.e.a.j.e r9 = r0.f3053u
            b.e.a.j.e r9 = r9.f2973d
            if (r9 == 0) goto L_0x0093
            if (r6 == 0) goto L_0x013a
            goto L_0x012e
        L_0x0093:
            b.e.a.j.e r9 = r0.f3051s
            b.e.a.j.e r9 = r9.f2973d
            if (r9 == 0) goto L_0x0181
            b.e.a.j.e r9 = r0.f3053u
            b.e.a.j.e r9 = r9.f2973d
            if (r9 == 0) goto L_0x0181
            if (r6 == 0) goto L_0x00af
            b.e.a.j.n r9 = r17.mo4378m()
            r9.mo4443a(r1)
            b.e.a.j.n r9 = r17.mo4378m()
            r9.mo4443a(r3)
        L_0x00af:
            float r9 = r0.f3004G
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x00c3
            r1.mo4432b(r11)
            r3.mo4432b(r11)
            r1.mo4433b(r3, r13)
            r3.mo4433b(r1, r13)
            goto L_0x0181
        L_0x00c3:
            r1.mo4432b(r15)
            r3.mo4432b(r15)
            int r9 = -r7
            float r9 = (float) r9
            r1.mo4433b(r3, r9)
            float r9 = (float) r7
            r3.mo4433b(r1, r9)
            r0.mo4383o(r7)
            goto L_0x0181
        L_0x00d7:
            b.e.a.j.e r7 = r0.f3051s
            b.e.a.j.e r7 = r7.f2973d
            if (r7 != 0) goto L_0x00fd
            b.e.a.j.e r7 = r0.f3053u
            b.e.a.j.e r7 = r7.f2973d
            if (r7 != 0) goto L_0x00fd
            r1.mo4432b(r8)
            r3.mo4432b(r8)
            if (r6 == 0) goto L_0x00f4
        L_0x00eb:
            b.e.a.j.n r7 = r17.mo4378m()
            r3.mo4431a((p006b.p022e.p023a.p024j.C0768m) r1, (int) r8, (p006b.p022e.p023a.p024j.C0769n) r7)
            goto L_0x0181
        L_0x00f4:
            int r7 = r17.mo4390s()
        L_0x00f8:
            r3.mo4430a((p006b.p022e.p023a.p024j.C0768m) r1, (int) r7)
            goto L_0x0181
        L_0x00fd:
            b.e.a.j.e r7 = r0.f3051s
            b.e.a.j.e r7 = r7.f2973d
            if (r7 == 0) goto L_0x0112
            b.e.a.j.e r7 = r0.f3053u
            b.e.a.j.e r7 = r7.f2973d
            if (r7 != 0) goto L_0x0112
            r1.mo4432b(r8)
            r3.mo4432b(r8)
            if (r6 == 0) goto L_0x00f4
            goto L_0x00eb
        L_0x0112:
            b.e.a.j.e r7 = r0.f3051s
            b.e.a.j.e r7 = r7.f2973d
            if (r7 != 0) goto L_0x013f
            b.e.a.j.e r7 = r0.f3053u
            b.e.a.j.e r7 = r7.f2973d
            if (r7 == 0) goto L_0x013f
            r1.mo4432b(r8)
            r3.mo4432b(r8)
            int r7 = r17.mo4390s()
            int r7 = -r7
            r1.mo4430a((p006b.p022e.p023a.p024j.C0768m) r3, (int) r7)
            if (r6 == 0) goto L_0x0136
        L_0x012e:
            b.e.a.j.n r7 = r17.mo4378m()
            r1.mo4431a((p006b.p022e.p023a.p024j.C0768m) r3, (int) r14, (p006b.p022e.p023a.p024j.C0769n) r7)
            goto L_0x0181
        L_0x0136:
            int r7 = r17.mo4390s()
        L_0x013a:
            int r7 = -r7
            r1.mo4430a((p006b.p022e.p023a.p024j.C0768m) r3, (int) r7)
            goto L_0x0181
        L_0x013f:
            b.e.a.j.e r7 = r0.f3051s
            b.e.a.j.e r7 = r7.f2973d
            if (r7 == 0) goto L_0x0181
            b.e.a.j.e r7 = r0.f3053u
            b.e.a.j.e r7 = r7.f2973d
            if (r7 == 0) goto L_0x0181
            r1.mo4432b(r15)
            r3.mo4432b(r15)
            if (r6 == 0) goto L_0x0170
            b.e.a.j.n r7 = r17.mo4378m()
            r7.mo4443a(r1)
            b.e.a.j.n r7 = r17.mo4378m()
            r7.mo4443a(r3)
            b.e.a.j.n r7 = r17.mo4378m()
            r1.mo4434b(r3, r14, r7)
            b.e.a.j.n r7 = r17.mo4378m()
            r3.mo4434b(r1, r8, r7)
            goto L_0x0181
        L_0x0170:
            int r7 = r17.mo4390s()
            int r7 = -r7
            float r7 = (float) r7
            r1.mo4433b(r3, r7)
            int r7 = r17.mo4390s()
            float r7 = (float) r7
            r3.mo4433b(r1, r7)
        L_0x0181:
            b.e.a.j.f$b[] r1 = r0.f3000C
            r1 = r1[r8]
            b.e.a.j.f$b r3 = p006b.p022e.p023a.p024j.C0758f.C0760b.MATCH_CONSTRAINT
            if (r1 != r3) goto L_0x0191
            boolean r1 = m4314a((p006b.p022e.p023a.p024j.C0758f) r0, (int) r8)
            if (r1 == 0) goto L_0x0191
            r1 = 1
            goto L_0x0192
        L_0x0191:
            r1 = 0
        L_0x0192:
            int r3 = r2.f3113h
            if (r3 == r12) goto L_0x0329
            int r3 = r4.f3113h
            if (r3 == r12) goto L_0x0329
            b.e.a.j.f$b[] r3 = r0.f3000C
            r3 = r3[r8]
            b.e.a.j.f$b r7 = p006b.p022e.p023a.p024j.C0758f.C0760b.FIXED
            if (r3 == r7) goto L_0x0247
            if (r1 == 0) goto L_0x01ac
            int r3 = r17.mo4388r()
            if (r3 != r5) goto L_0x01ac
            goto L_0x0247
        L_0x01ac:
            if (r1 == 0) goto L_0x0329
            int r1 = r17.mo4370i()
            r2.mo4432b(r8)
            r4.mo4432b(r8)
            b.e.a.j.e r3 = r0.f3052t
            b.e.a.j.e r3 = r3.f2973d
            if (r3 != 0) goto L_0x01d4
            b.e.a.j.e r3 = r0.f3054v
            b.e.a.j.e r3 = r3.f2973d
            if (r3 != 0) goto L_0x01d4
            if (r6 == 0) goto L_0x01cf
        L_0x01c6:
            b.e.a.j.n r0 = r17.mo4376l()
            r4.mo4431a((p006b.p022e.p023a.p024j.C0768m) r2, (int) r8, (p006b.p022e.p023a.p024j.C0769n) r0)
            goto L_0x0329
        L_0x01cf:
            r4.mo4430a((p006b.p022e.p023a.p024j.C0768m) r2, (int) r1)
            goto L_0x0329
        L_0x01d4:
            b.e.a.j.e r3 = r0.f3052t
            b.e.a.j.e r3 = r3.f2973d
            if (r3 == 0) goto L_0x01e3
            b.e.a.j.e r3 = r0.f3054v
            b.e.a.j.e r3 = r3.f2973d
            if (r3 != 0) goto L_0x01e3
            if (r6 == 0) goto L_0x01cf
            goto L_0x01c6
        L_0x01e3:
            b.e.a.j.e r3 = r0.f3052t
            b.e.a.j.e r3 = r3.f2973d
            if (r3 != 0) goto L_0x0200
            b.e.a.j.e r3 = r0.f3054v
            b.e.a.j.e r3 = r3.f2973d
            if (r3 == 0) goto L_0x0200
            if (r6 == 0) goto L_0x01fa
            b.e.a.j.n r0 = r17.mo4376l()
            r2.mo4431a((p006b.p022e.p023a.p024j.C0768m) r4, (int) r14, (p006b.p022e.p023a.p024j.C0769n) r0)
            goto L_0x0329
        L_0x01fa:
            int r0 = -r1
            r2.mo4430a((p006b.p022e.p023a.p024j.C0768m) r4, (int) r0)
            goto L_0x0329
        L_0x0200:
            b.e.a.j.e r3 = r0.f3052t
            b.e.a.j.e r3 = r3.f2973d
            if (r3 == 0) goto L_0x0329
            b.e.a.j.e r3 = r0.f3054v
            b.e.a.j.e r3 = r3.f2973d
            if (r3 == 0) goto L_0x0329
            if (r6 == 0) goto L_0x021c
            b.e.a.j.n r3 = r17.mo4376l()
            r3.mo4443a(r2)
            b.e.a.j.n r3 = r17.mo4378m()
            r3.mo4443a(r4)
        L_0x021c:
            float r3 = r0.f3004G
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x0230
            r2.mo4432b(r11)
            r4.mo4432b(r11)
            r2.mo4433b(r4, r13)
            r4.mo4433b(r2, r13)
            goto L_0x0329
        L_0x0230:
            r2.mo4432b(r15)
            r4.mo4432b(r15)
            int r3 = -r1
            float r3 = (float) r3
            r2.mo4433b(r4, r3)
            float r3 = (float) r1
            r4.mo4433b(r2, r3)
            r0.mo4367g(r1)
            int r1 = r0.f3014Q
            if (r1 <= 0) goto L_0x0329
            goto L_0x02ac
        L_0x0247:
            b.e.a.j.e r1 = r0.f3052t
            b.e.a.j.e r1 = r1.f2973d
            if (r1 != 0) goto L_0x0285
            b.e.a.j.e r1 = r0.f3054v
            b.e.a.j.e r1 = r1.f2973d
            if (r1 != 0) goto L_0x0285
            r2.mo4432b(r8)
            r4.mo4432b(r8)
            if (r6 == 0) goto L_0x0263
            b.e.a.j.n r1 = r17.mo4376l()
            r4.mo4431a((p006b.p022e.p023a.p024j.C0768m) r2, (int) r8, (p006b.p022e.p023a.p024j.C0769n) r1)
            goto L_0x026a
        L_0x0263:
            int r1 = r17.mo4370i()
            r4.mo4430a((p006b.p022e.p023a.p024j.C0768m) r2, (int) r1)
        L_0x026a:
            b.e.a.j.e r1 = r0.f3055w
            b.e.a.j.e r3 = r1.f2973d
            if (r3 == 0) goto L_0x0329
            b.e.a.j.m r1 = r1.mo4313d()
            r1.mo4432b(r8)
            b.e.a.j.e r1 = r0.f3055w
            b.e.a.j.m r1 = r1.mo4313d()
            int r0 = r0.f3014Q
            int r0 = -r0
            r2.mo4427a((int) r8, (p006b.p022e.p023a.p024j.C0768m) r1, (int) r0)
            goto L_0x0329
        L_0x0285:
            b.e.a.j.e r1 = r0.f3052t
            b.e.a.j.e r1 = r1.f2973d
            if (r1 == 0) goto L_0x02b9
            b.e.a.j.e r1 = r0.f3054v
            b.e.a.j.e r1 = r1.f2973d
            if (r1 != 0) goto L_0x02b9
            r2.mo4432b(r8)
            r4.mo4432b(r8)
            if (r6 == 0) goto L_0x02a1
            b.e.a.j.n r1 = r17.mo4376l()
            r4.mo4431a((p006b.p022e.p023a.p024j.C0768m) r2, (int) r8, (p006b.p022e.p023a.p024j.C0769n) r1)
            goto L_0x02a8
        L_0x02a1:
            int r1 = r17.mo4370i()
            r4.mo4430a((p006b.p022e.p023a.p024j.C0768m) r2, (int) r1)
        L_0x02a8:
            int r1 = r0.f3014Q
            if (r1 <= 0) goto L_0x0329
        L_0x02ac:
            b.e.a.j.e r1 = r0.f3055w
            b.e.a.j.m r1 = r1.mo4313d()
            int r0 = r0.f3014Q
            r1.mo4427a((int) r8, (p006b.p022e.p023a.p024j.C0768m) r2, (int) r0)
            goto L_0x0329
        L_0x02b9:
            b.e.a.j.e r1 = r0.f3052t
            b.e.a.j.e r1 = r1.f2973d
            if (r1 != 0) goto L_0x02e2
            b.e.a.j.e r1 = r0.f3054v
            b.e.a.j.e r1 = r1.f2973d
            if (r1 == 0) goto L_0x02e2
            r2.mo4432b(r8)
            r4.mo4432b(r8)
            if (r6 == 0) goto L_0x02d5
            b.e.a.j.n r1 = r17.mo4376l()
            r2.mo4431a((p006b.p022e.p023a.p024j.C0768m) r4, (int) r14, (p006b.p022e.p023a.p024j.C0769n) r1)
            goto L_0x02dd
        L_0x02d5:
            int r1 = r17.mo4370i()
            int r1 = -r1
            r2.mo4430a((p006b.p022e.p023a.p024j.C0768m) r4, (int) r1)
        L_0x02dd:
            int r1 = r0.f3014Q
            if (r1 <= 0) goto L_0x0329
            goto L_0x02ac
        L_0x02e2:
            b.e.a.j.e r1 = r0.f3052t
            b.e.a.j.e r1 = r1.f2973d
            if (r1 == 0) goto L_0x0329
            b.e.a.j.e r1 = r0.f3054v
            b.e.a.j.e r1 = r1.f2973d
            if (r1 == 0) goto L_0x0329
            r2.mo4432b(r15)
            r4.mo4432b(r15)
            if (r6 == 0) goto L_0x0313
            b.e.a.j.n r1 = r17.mo4376l()
            r2.mo4434b(r4, r14, r1)
            b.e.a.j.n r1 = r17.mo4376l()
            r4.mo4434b(r2, r8, r1)
            b.e.a.j.n r1 = r17.mo4376l()
            r1.mo4443a(r2)
            b.e.a.j.n r1 = r17.mo4378m()
            r1.mo4443a(r4)
            goto L_0x0324
        L_0x0313:
            int r1 = r17.mo4370i()
            int r1 = -r1
            float r1 = (float) r1
            r2.mo4433b(r4, r1)
            int r1 = r17.mo4370i()
            float r1 = (float) r1
            r4.mo4433b(r2, r1)
        L_0x0324:
            int r1 = r0.f3014Q
            if (r1 <= 0) goto L_0x0329
            goto L_0x02ac
        L_0x0329:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p023a.p024j.C0766k.m4311a(int, b.e.a.j.f):void");
    }

    /* renamed from: a */
    static void m4312a(C0758f fVar, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        fVar.f2998A[i3].mo4313d().f3111f = fVar.mo4374k().f3051s.mo4313d();
        fVar.f2998A[i3].mo4313d().f3112g = (float) i2;
        fVar.f2998A[i3].mo4313d().f3121b = 1;
        fVar.f2998A[i4].mo4313d().f3111f = fVar.f2998A[i3].mo4313d();
        fVar.f2998A[i4].mo4313d().f3112g = (float) fVar.mo4358d(i);
        fVar.f2998A[i4].mo4313d().f3121b = 1;
    }

    /* renamed from: a */
    static void m4313a(C0761g gVar, C0742e eVar, C0758f fVar) {
        if (gVar.f3000C[0] != C0758f.C0760b.WRAP_CONTENT && fVar.f3000C[0] == C0758f.C0760b.MATCH_PARENT) {
            int i = fVar.f3051s.f2974e;
            int s = gVar.mo4390s() - fVar.f3053u.f2974e;
            C0753e eVar2 = fVar.f3051s;
            eVar2.f2978i = eVar.mo4271a((Object) eVar2);
            C0753e eVar3 = fVar.f3053u;
            eVar3.f2978i = eVar.mo4271a((Object) eVar3);
            eVar.mo4275a(fVar.f3051s.f2978i, i);
            eVar.mo4275a(fVar.f3053u.f2978i, s);
            fVar.f3024a = 2;
            fVar.mo4330a(i, s);
        }
        if (gVar.f3000C[1] != C0758f.C0760b.WRAP_CONTENT && fVar.f3000C[1] == C0758f.C0760b.MATCH_PARENT) {
            int i2 = fVar.f3052t.f2974e;
            int i3 = gVar.mo4370i() - fVar.f3054v.f2974e;
            C0753e eVar4 = fVar.f3052t;
            eVar4.f2978i = eVar.mo4271a((Object) eVar4);
            C0753e eVar5 = fVar.f3054v;
            eVar5.f2978i = eVar.mo4271a((Object) eVar5);
            eVar.mo4275a(fVar.f3052t.f2978i, i2);
            eVar.mo4275a(fVar.f3054v.f2978i, i3);
            if (fVar.f3014Q > 0 || fVar.mo4388r() == 8) {
                C0753e eVar6 = fVar.f3055w;
                eVar6.f2978i = eVar.mo4271a((Object) eVar6);
                eVar.mo4275a(fVar.f3055w.f2978i, fVar.f3014Q + i2);
            }
            fVar.f3026b = 2;
            fVar.mo4363e(i2, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0039 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m4314a(p006b.p022e.p023a.p024j.C0758f r5, int r6) {
        /*
            b.e.a.j.f$b[] r0 = r5.f3000C
            r1 = r0[r6]
            b.e.a.j.f$b r2 = p006b.p022e.p023a.p024j.C0758f.C0760b.MATCH_CONSTRAINT
            r3 = 0
            if (r1 == r2) goto L_0x000a
            return r3
        L_0x000a:
            float r1 = r5.f3004G
            r2 = 0
            r4 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x001b
            if (r6 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            r5 = r0[r4]
            b.e.a.j.f$b r6 = p006b.p022e.p023a.p024j.C0758f.C0760b.MATCH_CONSTRAINT
            return r3
        L_0x001b:
            if (r6 != 0) goto L_0x002b
            int r6 = r5.f3032e
            if (r6 == 0) goto L_0x0022
            return r3
        L_0x0022:
            int r6 = r5.f3038h
            if (r6 != 0) goto L_0x002a
            int r5 = r5.f3040i
            if (r5 == 0) goto L_0x0039
        L_0x002a:
            return r3
        L_0x002b:
            int r6 = r5.f3034f
            if (r6 == 0) goto L_0x0030
            return r3
        L_0x0030:
            int r6 = r5.f3043k
            if (r6 != 0) goto L_0x003a
            int r5 = r5.f3044l
            if (r5 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            return r4
        L_0x003a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p023a.p024j.C0766k.m4314a(b.e.a.j.f, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r7.f3033e0 == 2) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r7.f3035f0 == 2) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0109  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m4315a(p006b.p022e.p023a.p024j.C0761g r24, p006b.p022e.p023a.C0742e r25, int r26, int r27, p006b.p022e.p023a.p024j.C0752d r28) {
        /*
            r0 = r25
            r1 = r26
            r2 = r28
            b.e.a.j.f r3 = r2.f2953a
            b.e.a.j.f r4 = r2.f2955c
            b.e.a.j.f r5 = r2.f2954b
            b.e.a.j.f r6 = r2.f2956d
            b.e.a.j.f r7 = r2.f2957e
            float r8 = r2.f2963k
            b.e.a.j.f r9 = r2.f2958f
            b.e.a.j.f r2 = r2.f2959g
            r9 = r24
            b.e.a.j.f$b[] r2 = r9.f3000C
            r2 = r2[r1]
            b.e.a.j.f$b r9 = p006b.p022e.p023a.p024j.C0758f.C0760b.WRAP_CONTENT
            r2 = 2
            r10 = 1
            if (r1 != 0) goto L_0x0038
            int r11 = r7.f3033e0
            if (r11 != 0) goto L_0x0028
            r11 = 1
            goto L_0x0029
        L_0x0028:
            r11 = 0
        L_0x0029:
            int r12 = r7.f3033e0
            if (r12 != r10) goto L_0x002f
            r12 = 1
            goto L_0x0030
        L_0x002f:
            r12 = 0
        L_0x0030:
            int r7 = r7.f3033e0
            if (r7 != r2) goto L_0x0036
        L_0x0034:
            r2 = 1
            goto L_0x004b
        L_0x0036:
            r2 = 0
            goto L_0x004b
        L_0x0038:
            int r11 = r7.f3035f0
            if (r11 != 0) goto L_0x003e
            r11 = 1
            goto L_0x003f
        L_0x003e:
            r11 = 0
        L_0x003f:
            int r12 = r7.f3035f0
            if (r12 != r10) goto L_0x0045
            r12 = 1
            goto L_0x0046
        L_0x0045:
            r12 = 0
        L_0x0046:
            int r7 = r7.f3035f0
            if (r7 != r2) goto L_0x0036
            goto L_0x0034
        L_0x004b:
            r14 = r3
            r10 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0053:
            r7 = 8
            if (r13 != 0) goto L_0x010c
            int r9 = r14.mo4388r()
            if (r9 == r7) goto L_0x00a1
            int r15 = r15 + 1
            if (r1 != 0) goto L_0x0066
            int r9 = r14.mo4390s()
            goto L_0x006a
        L_0x0066:
            int r9 = r14.mo4370i()
        L_0x006a:
            float r9 = (float) r9
            float r16 = r16 + r9
            if (r14 == r5) goto L_0x007a
            b.e.a.j.e[] r9 = r14.f2998A
            r9 = r9[r27]
            int r9 = r9.mo4311b()
            float r9 = (float) r9
            float r16 = r16 + r9
        L_0x007a:
            if (r14 == r6) goto L_0x0089
            b.e.a.j.e[] r9 = r14.f2998A
            int r19 = r27 + 1
            r9 = r9[r19]
            int r9 = r9.mo4311b()
            float r9 = (float) r9
            float r16 = r16 + r9
        L_0x0089:
            b.e.a.j.e[] r9 = r14.f2998A
            r9 = r9[r27]
            int r9 = r9.mo4311b()
            float r9 = (float) r9
            float r17 = r17 + r9
            b.e.a.j.e[] r9 = r14.f2998A
            int r19 = r27 + 1
            r9 = r9[r19]
            int r9 = r9.mo4311b()
            float r9 = (float) r9
            float r17 = r17 + r9
        L_0x00a1:
            b.e.a.j.e[] r9 = r14.f2998A
            r9 = r9[r27]
            int r9 = r14.mo4388r()
            if (r9 == r7) goto L_0x00df
            b.e.a.j.f$b[] r7 = r14.f3000C
            r7 = r7[r1]
            b.e.a.j.f$b r9 = p006b.p022e.p023a.p024j.C0758f.C0760b.MATCH_CONSTRAINT
            if (r7 != r9) goto L_0x00df
            int r10 = r10 + 1
            if (r1 != 0) goto L_0x00c7
            int r7 = r14.f3032e
            if (r7 == 0) goto L_0x00bd
            r7 = 0
            return r7
        L_0x00bd:
            r7 = 0
            int r9 = r14.f3038h
            if (r9 != 0) goto L_0x00c6
            int r9 = r14.f3040i
            if (r9 == 0) goto L_0x00d6
        L_0x00c6:
            return r7
        L_0x00c7:
            r7 = 0
            int r9 = r14.f3034f
            if (r9 == 0) goto L_0x00cd
            return r7
        L_0x00cd:
            int r9 = r14.f3043k
            if (r9 != 0) goto L_0x00de
            int r9 = r14.f3044l
            if (r9 == 0) goto L_0x00d6
            goto L_0x00de
        L_0x00d6:
            float r9 = r14.f3004G
            r18 = 0
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 == 0) goto L_0x00df
        L_0x00de:
            return r7
        L_0x00df:
            b.e.a.j.e[] r7 = r14.f2998A
            int r9 = r27 + 1
            r7 = r7[r9]
            b.e.a.j.e r7 = r7.f2973d
            if (r7 == 0) goto L_0x0101
            b.e.a.j.f r7 = r7.f2971b
            b.e.a.j.e[] r9 = r7.f2998A
            r20 = r7
            r7 = r9[r27]
            b.e.a.j.e r7 = r7.f2973d
            if (r7 == 0) goto L_0x0101
            r7 = r9[r27]
            b.e.a.j.e r7 = r7.f2973d
            b.e.a.j.f r7 = r7.f2971b
            if (r7 == r14) goto L_0x00fe
            goto L_0x0101
        L_0x00fe:
            r19 = r20
            goto L_0x0103
        L_0x0101:
            r19 = 0
        L_0x0103:
            if (r19 == 0) goto L_0x0109
            r14 = r19
            goto L_0x0053
        L_0x0109:
            r13 = 1
            goto L_0x0053
        L_0x010c:
            b.e.a.j.e[] r9 = r3.f2998A
            r9 = r9[r27]
            b.e.a.j.m r9 = r9.mo4313d()
            b.e.a.j.e[] r13 = r4.f2998A
            int r19 = r27 + 1
            r13 = r13[r19]
            b.e.a.j.m r13 = r13.mo4313d()
            b.e.a.j.m r7 = r9.f3109d
            if (r7 == 0) goto L_0x0382
            r21 = r3
            b.e.a.j.m r3 = r13.f3109d
            if (r3 != 0) goto L_0x012a
            goto L_0x0382
        L_0x012a:
            int r7 = r7.f3121b
            r0 = 1
            if (r7 != r0) goto L_0x0380
            int r3 = r3.f3121b
            if (r3 == r0) goto L_0x0135
            goto L_0x0380
        L_0x0135:
            if (r10 <= 0) goto L_0x013b
            if (r10 == r15) goto L_0x013b
            r0 = 0
            return r0
        L_0x013b:
            if (r2 != 0) goto L_0x0144
            if (r11 != 0) goto L_0x0144
            if (r12 == 0) goto L_0x0142
            goto L_0x0144
        L_0x0142:
            r7 = 0
            goto L_0x015d
        L_0x0144:
            if (r5 == 0) goto L_0x0150
            b.e.a.j.e[] r0 = r5.f2998A
            r0 = r0[r27]
            int r0 = r0.mo4311b()
            float r7 = (float) r0
            goto L_0x0151
        L_0x0150:
            r7 = 0
        L_0x0151:
            if (r6 == 0) goto L_0x015d
            b.e.a.j.e[] r0 = r6.f2998A
            r0 = r0[r19]
            int r0 = r0.mo4311b()
            float r0 = (float) r0
            float r7 = r7 + r0
        L_0x015d:
            b.e.a.j.m r0 = r9.f3109d
            float r0 = r0.f3112g
            b.e.a.j.m r3 = r13.f3109d
            float r3 = r3.f3112g
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x016b
            float r3 = r3 - r0
            goto L_0x016d
        L_0x016b:
            float r3 = r0 - r3
        L_0x016d:
            float r3 = r3 - r16
            r22 = 1
            if (r10 <= 0) goto L_0x0223
            if (r10 != r15) goto L_0x0223
            b.e.a.j.f r2 = r14.mo4374k()
            if (r2 == 0) goto L_0x0189
            b.e.a.j.f r2 = r14.mo4374k()
            b.e.a.j.f$b[] r2 = r2.f3000C
            r2 = r2[r1]
            b.e.a.j.f$b r5 = p006b.p022e.p023a.p024j.C0758f.C0760b.WRAP_CONTENT
            if (r2 != r5) goto L_0x0189
            r2 = 0
            return r2
        L_0x0189:
            float r3 = r3 + r16
            float r3 = r3 - r17
            r2 = r0
            r0 = r21
        L_0x0190:
            if (r0 == 0) goto L_0x0221
            b.e.a.f r5 = p006b.p022e.p023a.C0742e.f2888q
            if (r5 == 0) goto L_0x01a8
            long r6 = r5.f2930z
            long r6 = r6 - r22
            r5.f2930z = r6
            long r6 = r5.f2922r
            long r6 = r6 + r22
            r5.f2922r = r6
            long r6 = r5.f2928x
            long r6 = r6 + r22
            r5.f2928x = r6
        L_0x01a8:
            b.e.a.j.f[] r5 = r0.f3041i0
            r5 = r5[r1]
            if (r5 != 0) goto L_0x01b4
            if (r0 != r4) goto L_0x01b1
            goto L_0x01b4
        L_0x01b1:
            r13 = r25
            goto L_0x021e
        L_0x01b4:
            float r6 = (float) r10
            float r6 = r3 / r6
            r7 = 0
            int r11 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x01cd
            float[] r6 = r0.f3037g0
            r7 = r6[r1]
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x01c8
            r7 = 0
            goto L_0x01ce
        L_0x01c8:
            r6 = r6[r1]
            float r6 = r6 * r3
            float r6 = r6 / r8
        L_0x01cd:
            r7 = r6
        L_0x01ce:
            int r6 = r0.mo4388r()
            r11 = 8
            if (r6 != r11) goto L_0x01d7
            r7 = 0
        L_0x01d7:
            b.e.a.j.e[] r6 = r0.f2998A
            r6 = r6[r27]
            int r6 = r6.mo4311b()
            float r6 = (float) r6
            float r2 = r2 + r6
            b.e.a.j.e[] r6 = r0.f2998A
            r6 = r6[r27]
            b.e.a.j.m r6 = r6.mo4313d()
            b.e.a.j.m r11 = r9.f3111f
            r6.mo4429a((p006b.p022e.p023a.p024j.C0768m) r11, (float) r2)
            b.e.a.j.e[] r6 = r0.f2998A
            r6 = r6[r19]
            b.e.a.j.m r6 = r6.mo4313d()
            b.e.a.j.m r11 = r9.f3111f
            float r2 = r2 + r7
            r6.mo4429a((p006b.p022e.p023a.p024j.C0768m) r11, (float) r2)
            b.e.a.j.e[] r6 = r0.f2998A
            r6 = r6[r27]
            b.e.a.j.m r6 = r6.mo4313d()
            r13 = r25
            r6.mo4428a((p006b.p022e.p023a.C0742e) r13)
            b.e.a.j.e[] r6 = r0.f2998A
            r6 = r6[r19]
            b.e.a.j.m r6 = r6.mo4313d()
            r6.mo4428a((p006b.p022e.p023a.C0742e) r13)
            b.e.a.j.e[] r0 = r0.f2998A
            r0 = r0[r19]
            int r0 = r0.mo4311b()
            float r0 = (float) r0
            float r2 = r2 + r0
        L_0x021e:
            r0 = r5
            goto L_0x0190
        L_0x0221:
            r0 = 1
            return r0
        L_0x0223:
            r13 = r25
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x022d
            r2 = 1
            r11 = 0
            r12 = 0
        L_0x022d:
            if (r2 == 0) goto L_0x02ac
            float r3 = r3 - r7
            r2 = r21
            float r5 = r2.mo4343b((int) r1)
            float r3 = r3 * r5
            float r0 = r0 + r3
        L_0x0239:
            if (r2 == 0) goto L_0x02b3
            b.e.a.f r3 = p006b.p022e.p023a.C0742e.f2888q
            if (r3 == 0) goto L_0x0251
            long r5 = r3.f2930z
            long r5 = r5 - r22
            r3.f2930z = r5
            long r5 = r3.f2922r
            long r5 = r5 + r22
            r3.f2922r = r5
            long r5 = r3.f2928x
            long r5 = r5 + r22
            r3.f2928x = r5
        L_0x0251:
            b.e.a.j.f[] r3 = r2.f3041i0
            r3 = r3[r1]
            if (r3 != 0) goto L_0x0259
            if (r2 != r4) goto L_0x02aa
        L_0x0259:
            if (r1 != 0) goto L_0x0260
            int r5 = r2.mo4390s()
            goto L_0x0264
        L_0x0260:
            int r5 = r2.mo4370i()
        L_0x0264:
            float r5 = (float) r5
            b.e.a.j.e[] r6 = r2.f2998A
            r6 = r6[r27]
            int r6 = r6.mo4311b()
            float r6 = (float) r6
            float r0 = r0 + r6
            b.e.a.j.e[] r6 = r2.f2998A
            r6 = r6[r27]
            b.e.a.j.m r6 = r6.mo4313d()
            b.e.a.j.m r7 = r9.f3111f
            r6.mo4429a((p006b.p022e.p023a.p024j.C0768m) r7, (float) r0)
            b.e.a.j.e[] r6 = r2.f2998A
            r6 = r6[r19]
            b.e.a.j.m r6 = r6.mo4313d()
            b.e.a.j.m r7 = r9.f3111f
            float r0 = r0 + r5
            r6.mo4429a((p006b.p022e.p023a.p024j.C0768m) r7, (float) r0)
            b.e.a.j.e[] r5 = r2.f2998A
            r5 = r5[r27]
            b.e.a.j.m r5 = r5.mo4313d()
            r5.mo4428a((p006b.p022e.p023a.C0742e) r13)
            b.e.a.j.e[] r5 = r2.f2998A
            r5 = r5[r19]
            b.e.a.j.m r5 = r5.mo4313d()
            r5.mo4428a((p006b.p022e.p023a.C0742e) r13)
            b.e.a.j.e[] r2 = r2.f2998A
            r2 = r2[r19]
            int r2 = r2.mo4311b()
            float r2 = (float) r2
            float r0 = r0 + r2
        L_0x02aa:
            r2 = r3
            goto L_0x0239
        L_0x02ac:
            r2 = r21
            if (r11 != 0) goto L_0x02b6
            if (r12 == 0) goto L_0x02b3
            goto L_0x02b6
        L_0x02b3:
            r0 = 1
            goto L_0x037f
        L_0x02b6:
            if (r11 == 0) goto L_0x02ba
        L_0x02b8:
            float r3 = r3 - r7
            goto L_0x02bd
        L_0x02ba:
            if (r12 == 0) goto L_0x02bd
            goto L_0x02b8
        L_0x02bd:
            int r6 = r15 + 1
            float r6 = (float) r6
            float r6 = r3 / r6
            if (r12 == 0) goto L_0x02cf
            r7 = 1
            if (r15 <= r7) goto L_0x02cb
            int r6 = r15 + -1
            float r6 = (float) r6
            goto L_0x02cd
        L_0x02cb:
            r6 = 1073741824(0x40000000, float:2.0)
        L_0x02cd:
            float r6 = r3 / r6
        L_0x02cf:
            int r3 = r2.mo4388r()
            r7 = 8
            if (r3 == r7) goto L_0x02da
            float r3 = r0 + r6
            goto L_0x02db
        L_0x02da:
            r3 = r0
        L_0x02db:
            if (r12 == 0) goto L_0x02ea
            r7 = 1
            if (r15 <= r7) goto L_0x02ea
            b.e.a.j.e[] r3 = r5.f2998A
            r3 = r3[r27]
            int r3 = r3.mo4311b()
            float r3 = (float) r3
            float r3 = r3 + r0
        L_0x02ea:
            if (r11 == 0) goto L_0x02f8
            if (r5 == 0) goto L_0x02f8
            b.e.a.j.e[] r0 = r5.f2998A
            r0 = r0[r27]
            int r0 = r0.mo4311b()
            float r0 = (float) r0
            float r3 = r3 + r0
        L_0x02f8:
            if (r2 == 0) goto L_0x02b3
            b.e.a.f r0 = p006b.p022e.p023a.C0742e.f2888q
            if (r0 == 0) goto L_0x0310
            long r7 = r0.f2930z
            long r7 = r7 - r22
            r0.f2930z = r7
            long r7 = r0.f2922r
            long r7 = r7 + r22
            r0.f2922r = r7
            long r7 = r0.f2928x
            long r7 = r7 + r22
            r0.f2928x = r7
        L_0x0310:
            b.e.a.j.f[] r0 = r2.f3041i0
            r0 = r0[r1]
            if (r0 != 0) goto L_0x031c
            if (r2 != r4) goto L_0x0319
            goto L_0x031c
        L_0x0319:
            r7 = 8
            goto L_0x037c
        L_0x031c:
            if (r1 != 0) goto L_0x0323
            int r7 = r2.mo4390s()
            goto L_0x0327
        L_0x0323:
            int r7 = r2.mo4370i()
        L_0x0327:
            float r7 = (float) r7
            if (r2 == r5) goto L_0x0334
            b.e.a.j.e[] r8 = r2.f2998A
            r8 = r8[r27]
            int r8 = r8.mo4311b()
            float r8 = (float) r8
            float r3 = r3 + r8
        L_0x0334:
            b.e.a.j.e[] r8 = r2.f2998A
            r8 = r8[r27]
            b.e.a.j.m r8 = r8.mo4313d()
            b.e.a.j.m r10 = r9.f3111f
            r8.mo4429a((p006b.p022e.p023a.p024j.C0768m) r10, (float) r3)
            b.e.a.j.e[] r8 = r2.f2998A
            r8 = r8[r19]
            b.e.a.j.m r8 = r8.mo4313d()
            b.e.a.j.m r10 = r9.f3111f
            float r11 = r3 + r7
            r8.mo4429a((p006b.p022e.p023a.p024j.C0768m) r10, (float) r11)
            b.e.a.j.e[] r8 = r2.f2998A
            r8 = r8[r27]
            b.e.a.j.m r8 = r8.mo4313d()
            r8.mo4428a((p006b.p022e.p023a.C0742e) r13)
            b.e.a.j.e[] r8 = r2.f2998A
            r8 = r8[r19]
            b.e.a.j.m r8 = r8.mo4313d()
            r8.mo4428a((p006b.p022e.p023a.C0742e) r13)
            b.e.a.j.e[] r2 = r2.f2998A
            r2 = r2[r19]
            int r2 = r2.mo4311b()
            float r2 = (float) r2
            float r7 = r7 + r2
            float r3 = r3 + r7
            if (r0 == 0) goto L_0x0319
            int r2 = r0.mo4388r()
            r7 = 8
            if (r2 == r7) goto L_0x037c
            float r3 = r3 + r6
        L_0x037c:
            r2 = r0
            goto L_0x02f8
        L_0x037f:
            return r0
        L_0x0380:
            r0 = 0
            return r0
        L_0x0382:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p023a.p024j.C0766k.m4315a(b.e.a.j.g, b.e.a.e, int, int, b.e.a.j.d):boolean");
    }
}
