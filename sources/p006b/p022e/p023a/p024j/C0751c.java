package p006b.p022e.p023a.p024j;

import p006b.p022e.p023a.C0742e;

/* renamed from: b.e.a.j.c */
class C0751c {
    /* renamed from: a */
    static void m4164a(C0761g gVar, C0742e eVar, int i) {
        int i2;
        C0752d[] dVarArr;
        int i3;
        if (i == 0) {
            int i4 = gVar.f3079s0;
            dVarArr = gVar.f3082v0;
            i2 = i4;
            i3 = 0;
        } else {
            i3 = 2;
            int i5 = gVar.f3080t0;
            i2 = i5;
            dVarArr = gVar.f3081u0;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            C0752d dVar = dVarArr[i6];
            dVar.mo4305a();
            if (!gVar.mo4304t(4) || !C0766k.m4315a(gVar, eVar, i, i3, dVar)) {
                m4165a(gVar, eVar, i, i3, dVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2.f3033e0 == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r2.f3035f0 == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0362 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0188  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m4165a(p006b.p022e.p023a.p024j.C0761g r36, p006b.p022e.p023a.C0742e r37, int r38, int r39, p006b.p022e.p023a.p024j.C0752d r40) {
        /*
            r0 = r36
            r9 = r37
            r1 = r40
            b.e.a.j.f r10 = r1.f2953a
            b.e.a.j.f r11 = r1.f2955c
            b.e.a.j.f r12 = r1.f2954b
            b.e.a.j.f r13 = r1.f2956d
            b.e.a.j.f r2 = r1.f2957e
            float r3 = r1.f2963k
            b.e.a.j.f r4 = r1.f2958f
            b.e.a.j.f r4 = r1.f2959g
            b.e.a.j.f$b[] r4 = r0.f3000C
            r4 = r4[r38]
            b.e.a.j.f$b r5 = p006b.p022e.p023a.p024j.C0758f.C0760b.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            r5 = 2
            if (r38 != 0) goto L_0x0038
            int r8 = r2.f3033e0
            if (r8 != 0) goto L_0x002b
            r8 = 1
            goto L_0x002c
        L_0x002b:
            r8 = 0
        L_0x002c:
            int r14 = r2.f3033e0
            if (r14 != r7) goto L_0x0032
            r14 = 1
            goto L_0x0033
        L_0x0032:
            r14 = 0
        L_0x0033:
            int r15 = r2.f3033e0
            if (r15 != r5) goto L_0x004c
            goto L_0x004a
        L_0x0038:
            int r8 = r2.f3035f0
            if (r8 != 0) goto L_0x003e
            r8 = 1
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            int r14 = r2.f3035f0
            if (r14 != r7) goto L_0x0045
            r14 = 1
            goto L_0x0046
        L_0x0045:
            r14 = 0
        L_0x0046:
            int r15 = r2.f3035f0
            if (r15 != r5) goto L_0x004c
        L_0x004a:
            r5 = 1
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r15 = r8
            r8 = r10
            r16 = r14
            r14 = r5
            r5 = 0
        L_0x0053:
            r21 = 0
            if (r5 != 0) goto L_0x0124
            b.e.a.j.e[] r7 = r8.f2998A
            r7 = r7[r39]
            if (r4 != 0) goto L_0x0063
            if (r14 == 0) goto L_0x0060
            goto L_0x0063
        L_0x0060:
            r23 = 4
            goto L_0x0065
        L_0x0063:
            r23 = 1
        L_0x0065:
            int r24 = r7.mo4311b()
            b.e.a.j.e r6 = r7.f2973d
            if (r6 == 0) goto L_0x0075
            if (r8 == r10) goto L_0x0075
            int r6 = r6.mo4311b()
            int r24 = r24 + r6
        L_0x0075:
            r6 = r24
            if (r14 == 0) goto L_0x0083
            if (r8 == r10) goto L_0x0083
            if (r8 == r12) goto L_0x0083
            r24 = r3
            r23 = r5
            r3 = 6
            goto L_0x0093
        L_0x0083:
            if (r15 == 0) goto L_0x008d
            if (r4 == 0) goto L_0x008d
            r24 = r3
            r23 = r5
            r3 = 4
            goto L_0x0093
        L_0x008d:
            r24 = r3
            r3 = r23
            r23 = r5
        L_0x0093:
            b.e.a.j.e r5 = r7.f2973d
            if (r5 == 0) goto L_0x00bc
            if (r8 != r12) goto L_0x00a6
            r25 = r15
            b.e.a.i r15 = r7.f2978i
            b.e.a.i r5 = r5.f2978i
            r26 = r2
            r2 = 5
            r9.mo4282b(r15, r5, r6, r2)
            goto L_0x00b2
        L_0x00a6:
            r26 = r2
            r25 = r15
            b.e.a.i r2 = r7.f2978i
            b.e.a.i r5 = r5.f2978i
            r15 = 6
            r9.mo4282b(r2, r5, r6, r15)
        L_0x00b2:
            b.e.a.i r2 = r7.f2978i
            b.e.a.j.e r5 = r7.f2973d
            b.e.a.i r5 = r5.f2978i
            r9.mo4268a((p006b.p022e.p023a.C0747i) r2, (p006b.p022e.p023a.C0747i) r5, (int) r6, (int) r3)
            goto L_0x00c0
        L_0x00bc:
            r26 = r2
            r25 = r15
        L_0x00c0:
            if (r4 == 0) goto L_0x00f5
            int r2 = r8.mo4388r()
            r3 = 8
            if (r2 == r3) goto L_0x00e4
            b.e.a.j.f$b[] r2 = r8.f3000C
            r2 = r2[r38]
            b.e.a.j.f$b r3 = p006b.p022e.p023a.p024j.C0758f.C0760b.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00e4
            b.e.a.j.e[] r2 = r8.f2998A
            int r3 = r39 + 1
            r3 = r2[r3]
            b.e.a.i r3 = r3.f2978i
            r2 = r2[r39]
            b.e.a.i r2 = r2.f2978i
            r5 = 5
            r6 = 0
            r9.mo4282b(r3, r2, r6, r5)
            goto L_0x00e5
        L_0x00e4:
            r6 = 0
        L_0x00e5:
            b.e.a.j.e[] r2 = r8.f2998A
            r2 = r2[r39]
            b.e.a.i r2 = r2.f2978i
            b.e.a.j.e[] r3 = r0.f2998A
            r3 = r3[r39]
            b.e.a.i r3 = r3.f2978i
            r5 = 6
            r9.mo4282b(r2, r3, r6, r5)
        L_0x00f5:
            b.e.a.j.e[] r2 = r8.f2998A
            int r3 = r39 + 1
            r2 = r2[r3]
            b.e.a.j.e r2 = r2.f2973d
            if (r2 == 0) goto L_0x0114
            b.e.a.j.f r2 = r2.f2971b
            b.e.a.j.e[] r3 = r2.f2998A
            r5 = r3[r39]
            b.e.a.j.e r5 = r5.f2973d
            if (r5 == 0) goto L_0x0114
            r3 = r3[r39]
            b.e.a.j.e r3 = r3.f2973d
            b.e.a.j.f r3 = r3.f2971b
            if (r3 == r8) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r21 = r2
        L_0x0114:
            if (r21 == 0) goto L_0x011b
            r8 = r21
            r5 = r23
            goto L_0x011c
        L_0x011b:
            r5 = 1
        L_0x011c:
            r3 = r24
            r15 = r25
            r2 = r26
            goto L_0x0053
        L_0x0124:
            r26 = r2
            r24 = r3
            r25 = r15
            if (r13 == 0) goto L_0x014c
            b.e.a.j.e[] r2 = r11.f2998A
            int r3 = r39 + 1
            r5 = r2[r3]
            b.e.a.j.e r5 = r5.f2973d
            if (r5 == 0) goto L_0x014c
            b.e.a.j.e[] r5 = r13.f2998A
            r5 = r5[r3]
            b.e.a.i r6 = r5.f2978i
            r2 = r2[r3]
            b.e.a.j.e r2 = r2.f2973d
            b.e.a.i r2 = r2.f2978i
            int r3 = r5.mo4311b()
            int r3 = -r3
            r7 = 5
            r9.mo4285c(r6, r2, r3, r7)
            goto L_0x014d
        L_0x014c:
            r7 = 5
        L_0x014d:
            if (r4 == 0) goto L_0x0167
            b.e.a.j.e[] r0 = r0.f2998A
            int r2 = r39 + 1
            r0 = r0[r2]
            b.e.a.i r0 = r0.f2978i
            b.e.a.j.e[] r3 = r11.f2998A
            r4 = r3[r2]
            b.e.a.i r4 = r4.f2978i
            r2 = r3[r2]
            int r2 = r2.mo4311b()
            r3 = 6
            r9.mo4282b(r0, r4, r2, r3)
        L_0x0167:
            java.util.ArrayList<b.e.a.j.f> r0 = r1.f2960h
            if (r0 == 0) goto L_0x0216
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0216
            boolean r4 = r1.f2966n
            if (r4 == 0) goto L_0x017e
            boolean r4 = r1.f2968p
            if (r4 != 0) goto L_0x017e
            int r4 = r1.f2962j
            float r4 = (float) r4
            goto L_0x0180
        L_0x017e:
            r4 = r24
        L_0x0180:
            r5 = 0
            r8 = r21
            r6 = 0
            r28 = 0
        L_0x0186:
            if (r6 >= r2) goto L_0x0216
            java.lang.Object r15 = r0.get(r6)
            b.e.a.j.f r15 = (p006b.p022e.p023a.p024j.C0758f) r15
            float[] r3 = r15.f3037g0
            r3 = r3[r38]
            int r23 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r23 >= 0) goto L_0x01b2
            boolean r3 = r1.f2968p
            if (r3 == 0) goto L_0x01ad
            b.e.a.j.e[] r3 = r15.f2998A
            int r15 = r39 + 1
            r15 = r3[r15]
            b.e.a.i r15 = r15.f2978i
            r3 = r3[r39]
            b.e.a.i r3 = r3.f2978i
            r5 = 0
            r7 = 4
            r9.mo4268a((p006b.p022e.p023a.C0747i) r15, (p006b.p022e.p023a.C0747i) r3, (int) r5, (int) r7)
            r7 = 6
            goto L_0x01c8
        L_0x01ad:
            r7 = 4
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            goto L_0x01b3
        L_0x01b2:
            r7 = 4
        L_0x01b3:
            int r20 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r20 != 0) goto L_0x01cd
            b.e.a.j.e[] r3 = r15.f2998A
            int r15 = r39 + 1
            r15 = r3[r15]
            b.e.a.i r15 = r15.f2978i
            r3 = r3[r39]
            b.e.a.i r3 = r3.f2978i
            r5 = 0
            r7 = 6
            r9.mo4268a((p006b.p022e.p023a.C0747i) r15, (p006b.p022e.p023a.C0747i) r3, (int) r5, (int) r7)
        L_0x01c8:
            r24 = r0
            r22 = r2
            goto L_0x020b
        L_0x01cd:
            r5 = 0
            r7 = 6
            if (r8 == 0) goto L_0x0204
            b.e.a.j.e[] r8 = r8.f2998A
            r5 = r8[r39]
            b.e.a.i r5 = r5.f2978i
            int r22 = r39 + 1
            r8 = r8[r22]
            b.e.a.i r8 = r8.f2978i
            b.e.a.j.e[] r7 = r15.f2998A
            r24 = r0
            r0 = r7[r39]
            b.e.a.i r0 = r0.f2978i
            r7 = r7[r22]
            b.e.a.i r7 = r7.f2978i
            r22 = r2
            b.e.a.b r2 = r37.mo4281b()
            r27 = r2
            r29 = r4
            r30 = r3
            r31 = r5
            r32 = r8
            r33 = r0
            r34 = r7
            r27.mo4241a((float) r28, (float) r29, (float) r30, (p006b.p022e.p023a.C0747i) r31, (p006b.p022e.p023a.C0747i) r32, (p006b.p022e.p023a.C0747i) r33, (p006b.p022e.p023a.C0747i) r34)
            r9.mo4272a((p006b.p022e.p023a.C0739b) r2)
            goto L_0x0208
        L_0x0204:
            r24 = r0
            r22 = r2
        L_0x0208:
            r28 = r3
            r8 = r15
        L_0x020b:
            int r6 = r6 + 1
            r2 = r22
            r0 = r24
            r3 = 1
            r5 = 0
            r7 = 5
            goto L_0x0186
        L_0x0216:
            if (r12 == 0) goto L_0x0276
            if (r12 == r13) goto L_0x021c
            if (r14 == 0) goto L_0x0276
        L_0x021c:
            b.e.a.j.e[] r0 = r10.f2998A
            r1 = r0[r39]
            b.e.a.j.e[] r2 = r11.f2998A
            int r3 = r39 + 1
            r2 = r2[r3]
            r4 = r0[r39]
            b.e.a.j.e r4 = r4.f2973d
            if (r4 == 0) goto L_0x0234
            r0 = r0[r39]
            b.e.a.j.e r0 = r0.f2973d
            b.e.a.i r0 = r0.f2978i
            r4 = r0
            goto L_0x0236
        L_0x0234:
            r4 = r21
        L_0x0236:
            b.e.a.j.e[] r0 = r11.f2998A
            r5 = r0[r3]
            b.e.a.j.e r5 = r5.f2973d
            if (r5 == 0) goto L_0x0246
            r0 = r0[r3]
            b.e.a.j.e r0 = r0.f2973d
            b.e.a.i r0 = r0.f2978i
            r5 = r0
            goto L_0x0248
        L_0x0246:
            r5 = r21
        L_0x0248:
            if (r12 != r13) goto L_0x0250
            b.e.a.j.e[] r0 = r12.f2998A
            r1 = r0[r39]
            r2 = r0[r3]
        L_0x0250:
            if (r4 == 0) goto L_0x0493
            if (r5 == 0) goto L_0x0493
            r0 = r26
            if (r38 != 0) goto L_0x025b
            float r0 = r0.f3019V
            goto L_0x025d
        L_0x025b:
            float r0 = r0.f3020W
        L_0x025d:
            r6 = r0
            int r3 = r1.mo4311b()
            int r7 = r2.mo4311b()
            b.e.a.i r1 = r1.f2978i
            b.e.a.i r8 = r2.f2978i
            r10 = 5
            r0 = r37
            r2 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r0.mo4276a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0493
        L_0x0276:
            if (r25 == 0) goto L_0x0366
            if (r12 == 0) goto L_0x0366
            int r0 = r1.f2962j
            if (r0 <= 0) goto L_0x0285
            int r1 = r1.f2961i
            if (r1 != r0) goto L_0x0285
            r17 = 1
            goto L_0x0287
        L_0x0285:
            r17 = 0
        L_0x0287:
            r14 = r12
            r15 = r14
        L_0x0289:
            if (r14 == 0) goto L_0x0493
            b.e.a.j.f[] r0 = r14.f3041i0
            r0 = r0[r38]
            r8 = r0
        L_0x0290:
            if (r8 == 0) goto L_0x029f
            int r0 = r8.mo4388r()
            r7 = 8
            if (r0 != r7) goto L_0x02a1
            b.e.a.j.f[] r0 = r8.f3041i0
            r8 = r0[r38]
            goto L_0x0290
        L_0x029f:
            r7 = 8
        L_0x02a1:
            if (r8 != 0) goto L_0x02ae
            if (r14 != r13) goto L_0x02a6
            goto L_0x02ae
        L_0x02a6:
            r18 = r8
            r19 = 4
            r20 = 6
            goto L_0x0359
        L_0x02ae:
            b.e.a.j.e[] r0 = r14.f2998A
            r0 = r0[r39]
            b.e.a.i r1 = r0.f2978i
            b.e.a.j.e r2 = r0.f2973d
            if (r2 == 0) goto L_0x02bb
            b.e.a.i r2 = r2.f2978i
            goto L_0x02bd
        L_0x02bb:
            r2 = r21
        L_0x02bd:
            if (r15 == r14) goto L_0x02c8
            b.e.a.j.e[] r2 = r15.f2998A
            int r3 = r39 + 1
            r2 = r2[r3]
        L_0x02c5:
            b.e.a.i r2 = r2.f2978i
            goto L_0x02db
        L_0x02c8:
            if (r14 != r12) goto L_0x02db
            if (r15 != r14) goto L_0x02db
            b.e.a.j.e[] r2 = r10.f2998A
            r3 = r2[r39]
            b.e.a.j.e r3 = r3.f2973d
            if (r3 == 0) goto L_0x02d9
            r2 = r2[r39]
            b.e.a.j.e r2 = r2.f2973d
            goto L_0x02c5
        L_0x02d9:
            r2 = r21
        L_0x02db:
            int r0 = r0.mo4311b()
            b.e.a.j.e[] r3 = r14.f2998A
            int r4 = r39 + 1
            r3 = r3[r4]
            int r3 = r3.mo4311b()
            if (r8 == 0) goto L_0x02f8
            b.e.a.j.e[] r5 = r8.f2998A
            r5 = r5[r39]
            b.e.a.i r6 = r5.f2978i
            b.e.a.j.e[] r7 = r14.f2998A
            r7 = r7[r4]
        L_0x02f5:
            b.e.a.i r7 = r7.f2978i
            goto L_0x030a
        L_0x02f8:
            b.e.a.j.e[] r5 = r11.f2998A
            r5 = r5[r4]
            b.e.a.j.e r5 = r5.f2973d
            if (r5 == 0) goto L_0x0303
            b.e.a.i r6 = r5.f2978i
            goto L_0x0305
        L_0x0303:
            r6 = r21
        L_0x0305:
            b.e.a.j.e[] r7 = r14.f2998A
            r7 = r7[r4]
            goto L_0x02f5
        L_0x030a:
            if (r5 == 0) goto L_0x0311
            int r5 = r5.mo4311b()
            int r3 = r3 + r5
        L_0x0311:
            if (r15 == 0) goto L_0x031c
            b.e.a.j.e[] r5 = r15.f2998A
            r5 = r5[r4]
            int r5 = r5.mo4311b()
            int r0 = r0 + r5
        L_0x031c:
            if (r1 == 0) goto L_0x02a6
            if (r2 == 0) goto L_0x02a6
            if (r6 == 0) goto L_0x02a6
            if (r7 == 0) goto L_0x02a6
            if (r14 != r12) goto L_0x032e
            b.e.a.j.e[] r0 = r12.f2998A
            r0 = r0[r39]
            int r0 = r0.mo4311b()
        L_0x032e:
            r5 = r0
            if (r14 != r13) goto L_0x033c
            b.e.a.j.e[] r0 = r13.f2998A
            r0 = r0[r4]
            int r0 = r0.mo4311b()
            r18 = r0
            goto L_0x033e
        L_0x033c:
            r18 = r3
        L_0x033e:
            if (r17 == 0) goto L_0x0343
            r22 = 6
            goto L_0x0345
        L_0x0343:
            r22 = 4
        L_0x0345:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r37
            r3 = r5
            r5 = r6
            r6 = r7
            r19 = 4
            r20 = 6
            r7 = r18
            r18 = r8
            r8 = r22
            r0.mo4276a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0359:
            int r0 = r14.mo4388r()
            r8 = 8
            if (r0 == r8) goto L_0x0362
            r15 = r14
        L_0x0362:
            r14 = r18
            goto L_0x0289
        L_0x0366:
            r8 = 8
            r19 = 4
            r20 = 6
            if (r16 == 0) goto L_0x0493
            if (r12 == 0) goto L_0x0493
            int r0 = r1.f2962j
            if (r0 <= 0) goto L_0x037b
            int r1 = r1.f2961i
            if (r1 != r0) goto L_0x037b
            r17 = 1
            goto L_0x037d
        L_0x037b:
            r17 = 0
        L_0x037d:
            r14 = r12
            r15 = r14
        L_0x037f:
            if (r14 == 0) goto L_0x0435
            b.e.a.j.f[] r0 = r14.f3041i0
            r0 = r0[r38]
        L_0x0385:
            if (r0 == 0) goto L_0x0392
            int r1 = r0.mo4388r()
            if (r1 != r8) goto L_0x0392
            b.e.a.j.f[] r0 = r0.f3041i0
            r0 = r0[r38]
            goto L_0x0385
        L_0x0392:
            if (r14 == r12) goto L_0x0422
            if (r14 == r13) goto L_0x0422
            if (r0 == 0) goto L_0x0422
            if (r0 != r13) goto L_0x039d
            r7 = r21
            goto L_0x039e
        L_0x039d:
            r7 = r0
        L_0x039e:
            b.e.a.j.e[] r0 = r14.f2998A
            r0 = r0[r39]
            b.e.a.i r1 = r0.f2978i
            b.e.a.j.e r2 = r0.f2973d
            if (r2 == 0) goto L_0x03aa
            b.e.a.i r2 = r2.f2978i
        L_0x03aa:
            b.e.a.j.e[] r2 = r15.f2998A
            int r3 = r39 + 1
            r2 = r2[r3]
            b.e.a.i r2 = r2.f2978i
            int r0 = r0.mo4311b()
            b.e.a.j.e[] r4 = r14.f2998A
            r4 = r4[r3]
            int r4 = r4.mo4311b()
            if (r7 == 0) goto L_0x03ce
            b.e.a.j.e[] r5 = r7.f2998A
            r5 = r5[r39]
            b.e.a.i r6 = r5.f2978i
            b.e.a.j.e r8 = r5.f2973d
            if (r8 == 0) goto L_0x03cb
            goto L_0x03df
        L_0x03cb:
            r8 = r21
            goto L_0x03e1
        L_0x03ce:
            b.e.a.j.e[] r5 = r14.f2998A
            r5 = r5[r3]
            b.e.a.j.e r5 = r5.f2973d
            if (r5 == 0) goto L_0x03d9
            b.e.a.i r6 = r5.f2978i
            goto L_0x03db
        L_0x03d9:
            r6 = r21
        L_0x03db:
            b.e.a.j.e[] r8 = r14.f2998A
            r8 = r8[r3]
        L_0x03df:
            b.e.a.i r8 = r8.f2978i
        L_0x03e1:
            if (r5 == 0) goto L_0x03e8
            int r5 = r5.mo4311b()
            int r4 = r4 + r5
        L_0x03e8:
            r18 = r4
            if (r15 == 0) goto L_0x03f5
            b.e.a.j.e[] r4 = r15.f2998A
            r3 = r4[r3]
            int r3 = r3.mo4311b()
            int r0 = r0 + r3
        L_0x03f5:
            r3 = r0
            if (r17 == 0) goto L_0x03fb
            r22 = 6
            goto L_0x03fd
        L_0x03fb:
            r22 = 4
        L_0x03fd:
            if (r1 == 0) goto L_0x0419
            if (r2 == 0) goto L_0x0419
            if (r6 == 0) goto L_0x0419
            if (r8 == 0) goto L_0x0419
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r37
            r5 = r6
            r6 = r8
            r23 = r7
            r7 = r18
            r18 = r15
            r15 = 8
            r8 = r22
            r0.mo4276a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x041f
        L_0x0419:
            r23 = r7
            r18 = r15
            r15 = 8
        L_0x041f:
            r0 = r23
            goto L_0x0426
        L_0x0422:
            r18 = r15
            r15 = 8
        L_0x0426:
            int r1 = r14.mo4388r()
            if (r1 == r15) goto L_0x042d
            goto L_0x042f
        L_0x042d:
            r14 = r18
        L_0x042f:
            r15 = r14
            r8 = 8
            r14 = r0
            goto L_0x037f
        L_0x0435:
            b.e.a.j.e[] r0 = r12.f2998A
            r0 = r0[r39]
            b.e.a.j.e[] r1 = r10.f2998A
            r1 = r1[r39]
            b.e.a.j.e r1 = r1.f2973d
            b.e.a.j.e[] r2 = r13.f2998A
            int r3 = r39 + 1
            r10 = r2[r3]
            b.e.a.j.e[] r2 = r11.f2998A
            r2 = r2[r3]
            b.e.a.j.e r14 = r2.f2973d
            if (r1 == 0) goto L_0x0482
            if (r12 == r13) goto L_0x045c
            b.e.a.i r2 = r0.f2978i
            b.e.a.i r1 = r1.f2978i
            int r0 = r0.mo4311b()
            r15 = 5
            r9.mo4268a((p006b.p022e.p023a.C0747i) r2, (p006b.p022e.p023a.C0747i) r1, (int) r0, (int) r15)
            goto L_0x0483
        L_0x045c:
            r15 = 5
            if (r14 == 0) goto L_0x0483
            b.e.a.i r2 = r0.f2978i
            b.e.a.i r3 = r1.f2978i
            int r4 = r0.mo4311b()
            r5 = 1056964608(0x3f000000, float:0.5)
            b.e.a.i r6 = r10.f2978i
            b.e.a.i r7 = r14.f2978i
            int r8 = r10.mo4311b()
            r17 = 5
            r0 = r37
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r17
            r0.mo4276a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0483
        L_0x0482:
            r15 = 5
        L_0x0483:
            if (r14 == 0) goto L_0x0493
            if (r12 == r13) goto L_0x0493
            b.e.a.i r0 = r10.f2978i
            b.e.a.i r1 = r14.f2978i
            int r2 = r10.mo4311b()
            int r2 = -r2
            r9.mo4268a((p006b.p022e.p023a.C0747i) r0, (p006b.p022e.p023a.C0747i) r1, (int) r2, (int) r15)
        L_0x0493:
            if (r25 != 0) goto L_0x0497
            if (r16 == 0) goto L_0x04f7
        L_0x0497:
            if (r12 == 0) goto L_0x04f7
            b.e.a.j.e[] r0 = r12.f2998A
            r0 = r0[r39]
            b.e.a.j.e[] r1 = r13.f2998A
            int r2 = r39 + 1
            r1 = r1[r2]
            b.e.a.j.e r3 = r0.f2973d
            if (r3 == 0) goto L_0x04aa
            b.e.a.i r3 = r3.f2978i
            goto L_0x04ac
        L_0x04aa:
            r3 = r21
        L_0x04ac:
            b.e.a.j.e r4 = r1.f2973d
            if (r4 == 0) goto L_0x04b3
            b.e.a.i r4 = r4.f2978i
            goto L_0x04b5
        L_0x04b3:
            r4 = r21
        L_0x04b5:
            if (r11 == r13) goto L_0x04c4
            b.e.a.j.e[] r4 = r11.f2998A
            r4 = r4[r2]
            b.e.a.j.e r4 = r4.f2973d
            if (r4 == 0) goto L_0x04c2
            b.e.a.i r4 = r4.f2978i
            goto L_0x04c4
        L_0x04c2:
            r4 = r21
        L_0x04c4:
            r5 = r4
            if (r12 != r13) goto L_0x04d2
            b.e.a.j.e[] r0 = r12.f2998A
            r1 = r0[r39]
            r0 = r0[r2]
            r35 = r1
            r1 = r0
            r0 = r35
        L_0x04d2:
            if (r3 == 0) goto L_0x04f7
            if (r5 == 0) goto L_0x04f7
            r4 = 1056964608(0x3f000000, float:0.5)
            int r6 = r0.mo4311b()
            if (r13 != 0) goto L_0x04df
            goto L_0x04e0
        L_0x04df:
            r11 = r13
        L_0x04e0:
            b.e.a.j.e[] r7 = r11.f2998A
            r2 = r7[r2]
            int r7 = r2.mo4311b()
            b.e.a.i r2 = r0.f2978i
            b.e.a.i r8 = r1.f2978i
            r10 = 5
            r0 = r37
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.mo4276a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x04f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p023a.p024j.C0751c.m4165a(b.e.a.j.g, b.e.a.e, int, int, b.e.a.j.d):void");
    }
}
