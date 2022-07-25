package p006b.p022e.p023a.p024j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p006b.p022e.p023a.p024j.C0753e;
import p006b.p022e.p023a.p024j.C0758f;

/* renamed from: b.e.a.j.a */
public class C0749a {
    /* renamed from: a */
    private static int m4145a(C0758f fVar) {
        if (fVar.mo4372j() == C0758f.C0760b.MATCH_CONSTRAINT) {
            int i = (int) (fVar.f3005H == 0 ? ((float) fVar.mo4370i()) * fVar.f3004G : ((float) fVar.mo4370i()) / fVar.f3004G);
            fVar.mo4383o(i);
            return i;
        } else if (fVar.mo4386q() != C0758f.C0760b.MATCH_CONSTRAINT) {
            return -1;
        } else {
            int s = (int) (fVar.f3005H == 1 ? ((float) fVar.mo4390s()) * fVar.f3004G : ((float) fVar.mo4390s()) / fVar.f3004G);
            fVar.mo4367g(s);
            return s;
        }
    }

    /* renamed from: a */
    private static int m4146a(C0758f fVar, int i) {
        C0758f fVar2;
        C0753e eVar;
        int i2 = i * 2;
        C0753e[] eVarArr = fVar.f2998A;
        C0753e eVar2 = eVarArr[i2];
        C0753e eVar3 = eVarArr[i2 + 1];
        C0753e eVar4 = eVar2.f2973d;
        if (eVar4 == null || eVar4.f2971b != (fVar2 = fVar.f3001D) || (eVar = eVar3.f2973d) == null || eVar.f2971b != fVar2) {
            return 0;
        }
        return (int) (((float) (((fVar2.mo4358d(i) - eVar2.mo4311b()) - eVar3.mo4311b()) - fVar.mo4358d(i))) * (i == 0 ? fVar.f3019V : fVar.f3020W));
    }

    /* renamed from: a */
    private static int m4147a(C0758f fVar, int i, boolean z, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int s;
        int i9;
        int i10;
        int i11;
        C0758f fVar2 = fVar;
        int i12 = i;
        boolean z2 = z;
        int i13 = 0;
        if (!fVar2.f3027b0) {
            return 0;
        }
        boolean z3 = fVar2.f3055w.f2973d != null && i12 == 1;
        if (z2) {
            i6 = fVar.mo4352c();
            i5 = fVar.mo4370i() - fVar.mo4352c();
            i4 = i12 * 2;
            i3 = i4 + 1;
        } else {
            i6 = fVar.mo4370i() - fVar.mo4352c();
            i5 = fVar.mo4352c();
            i3 = i12 * 2;
            i4 = i3 + 1;
        }
        C0753e[] eVarArr = fVar2.f2998A;
        if (eVarArr[i3].f2973d == null || eVarArr[i4].f2973d != null) {
            i7 = i3;
            i8 = 1;
        } else {
            i7 = i4;
            i4 = i3;
            i8 = -1;
        }
        int i14 = z3 ? i2 - i6 : i2;
        int b = (fVar2.f2998A[i4].mo4311b() * i8) + m4146a(fVar, i);
        int i15 = i14 + b;
        int s2 = (i12 == 0 ? fVar.mo4390s() : fVar.mo4370i()) * i8;
        Iterator<C0770o> it = fVar2.f2998A[i4].mo4313d().f3120a.iterator();
        while (it.hasNext()) {
            i13 = Math.max(i13, m4147a(((C0768m) it.next()).f3108c.f2971b, i12, z2, i15));
        }
        int i16 = 0;
        for (Iterator<C0770o> it2 = fVar2.f2998A[i7].mo4313d().f3120a.iterator(); it2.hasNext(); it2 = it2) {
            i16 = Math.max(i16, m4147a(((C0768m) it2.next()).f3108c.f2971b, i12, z2, s2 + i15));
        }
        if (z3) {
            i13 -= i6;
            s = i16 + i5;
        } else {
            s = i16 + ((i12 == 0 ? fVar.mo4390s() : fVar.mo4370i()) * i8);
        }
        int i17 = 1;
        if (i12 == 1) {
            Iterator<C0770o> it3 = fVar2.f3055w.mo4313d().f3120a.iterator();
            int i18 = 0;
            while (it3.hasNext()) {
                Iterator<C0770o> it4 = it3;
                C0768m mVar = (C0768m) it3.next();
                if (i8 == i17) {
                    i18 = Math.max(i18, m4147a(mVar.f3108c.f2971b, i12, z2, i6 + i15));
                    i11 = i7;
                } else {
                    i11 = i7;
                    i18 = Math.max(i18, m4147a(mVar.f3108c.f2971b, i12, z2, (i5 * i8) + i15));
                }
                it3 = it4;
                i7 = i11;
                i17 = 1;
            }
            i9 = i7;
            int i19 = i18;
            i10 = (fVar2.f3055w.mo4313d().f3120a.size() <= 0 || z3) ? i19 : i8 == 1 ? i19 + i6 : i19 - i5;
        } else {
            i9 = i7;
            i10 = 0;
        }
        int max = b + Math.max(i13, Math.max(s, i10));
        int i20 = i15 + s2;
        if (i8 != -1) {
            int i21 = i15;
            i15 = i20;
            i20 = i21;
        }
        if (z2) {
            C0766k.m4312a(fVar2, i12, i20);
            fVar2.mo4331a(i20, i15, i12);
        } else {
            fVar2.f3048p.mo4418a(fVar2, i12);
            fVar2.mo4360d(i20, i12);
        }
        if (fVar.mo4353c(i) == C0758f.C0760b.MATCH_CONSTRAINT && fVar2.f3004G != 0.0f) {
            fVar2.f3048p.mo4418a(fVar2, i12);
        }
        C0753e[] eVarArr2 = fVar2.f2998A;
        if (!(eVarArr2[i4].f2973d == null || eVarArr2[i9].f2973d == null)) {
            C0758f k = fVar.mo4374k();
            C0753e[] eVarArr3 = fVar2.f2998A;
            if (eVarArr3[i4].f2973d.f2971b == k && eVarArr3[i9].f2973d.f2971b == k) {
                fVar2.f3048p.mo4418a(fVar2, i12);
            }
        }
        return max;
    }

    /* renamed from: a */
    private static int m4148a(C0762h hVar, int i) {
        int i2 = i * 2;
        List<C0758f> a = hVar.mo4417a(i);
        int size = a.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C0758f fVar = a.get(i4);
            C0753e[] eVarArr = fVar.f2998A;
            int i5 = i2 + 1;
            i3 = Math.max(i3, m4147a(fVar, i, eVarArr[i5].f2973d == null || !(eVarArr[i2].f2973d == null || eVarArr[i5].f2973d == null), 0));
        }
        hVar.f3091e[i] = i3;
        return i3;
    }

    /* renamed from: a */
    private static void m4149a(C0753e eVar) {
        C0768m d = eVar.mo4313d();
        C0753e eVar2 = eVar.f2973d;
        if (eVar2 != null && eVar2.f2973d != eVar) {
            eVar2.mo4313d().mo4443a(d);
        }
    }

    /* renamed from: a */
    private static void m4150a(C0758f fVar, int i, int i2) {
        int i3 = i * 2;
        C0753e[] eVarArr = fVar.f2998A;
        C0753e eVar = eVarArr[i3];
        C0753e eVar2 = eVarArr[i3 + 1];
        if ((eVar.f2973d == null || eVar2.f2973d == null) ? false : true) {
            C0766k.m4312a(fVar, i, m4146a(fVar, i) + eVar.mo4311b());
        } else if (fVar.f3004G == 0.0f || fVar.mo4353c(i) != C0758f.C0760b.MATCH_CONSTRAINT) {
            int e = i2 - fVar.mo4361e(i);
            int d = e - fVar.mo4358d(i);
            fVar.mo4331a(d, e, i);
            C0766k.m4312a(fVar, i, d);
        } else {
            int a = m4145a(fVar);
            int i4 = (int) fVar.f2998A[i3].mo4313d().f3112g;
            eVar2.mo4313d().f3111f = eVar.mo4313d();
            eVar2.mo4313d().f3112g = (float) a;
            eVar2.mo4313d().f3121b = 1;
            fVar.mo4331a(i4, i4 + a, i);
        }
    }

    /* renamed from: a */
    public static void m4151a(C0761g gVar) {
        if ((gVar.mo4401M() & 32) != 32) {
            m4156b(gVar);
            return;
        }
        gVar.f3069D0 = true;
        gVar.f3084x0 = false;
        gVar.f3085y0 = false;
        gVar.f3086z0 = false;
        ArrayList<C0758f> arrayList = gVar.f3132k0;
        List<C0762h> list = gVar.f3083w0;
        boolean z = gVar.mo4372j() == C0758f.C0760b.WRAP_CONTENT;
        boolean z2 = gVar.mo4386q() == C0758f.C0760b.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (C0758f next : arrayList) {
            next.f3048p = null;
            next.f3031d0 = false;
            next.mo4298F();
        }
        for (C0758f next2 : arrayList) {
            if (next2.f3048p == null && !m4155a(next2, list, z3)) {
                m4156b(gVar);
                gVar.f3069D0 = false;
                return;
            }
        }
        int i = 0;
        int i2 = 0;
        for (C0762h next3 : list) {
            i = Math.max(i, m4148a(next3, 0));
            i2 = Math.max(i2, m4148a(next3, 1));
        }
        if (z) {
            gVar.mo4336a(C0758f.C0760b.FIXED);
            gVar.mo4383o(i);
            gVar.f3084x0 = true;
            gVar.f3085y0 = true;
            gVar.f3066A0 = i;
        }
        if (z2) {
            gVar.mo4349b(C0758f.C0760b.FIXED);
            gVar.mo4367g(i2);
            gVar.f3084x0 = true;
            gVar.f3086z0 = true;
            gVar.f3067B0 = i2;
        }
        m4153a(list, 0, gVar.mo4390s());
        m4153a(list, 1, gVar.mo4370i());
    }

    /* renamed from: a */
    private static void m4152a(C0761g gVar, C0758f fVar, C0762h hVar) {
        hVar.f3090d = false;
        gVar.f3069D0 = false;
        fVar.f3027b0 = false;
    }

    /* renamed from: a */
    public static void m4153a(List<C0762h> list, int i, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            for (C0758f next : list.get(i3).mo4419b(i)) {
                if (next.f3027b0) {
                    m4150a(next, i, i2);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m4154a(C0758f fVar, C0762h hVar, List<C0762h> list, boolean z) {
        C0753e eVar;
        C0753e eVar2;
        C0753e eVar3;
        C0758f fVar2;
        C0753e eVar4;
        C0753e eVar5;
        C0753e eVar6;
        C0753e eVar7;
        C0758f fVar3;
        C0753e eVar8;
        if (fVar == null) {
            return true;
        }
        fVar.f3029c0 = false;
        C0761g gVar = (C0761g) fVar.mo4374k();
        C0762h hVar2 = fVar.f3048p;
        if (hVar2 == null) {
            fVar.f3027b0 = true;
            hVar.f3087a.add(fVar);
            fVar.f3048p = hVar;
            if (fVar.f3051s.f2973d == null && fVar.f3053u.f2973d == null && fVar.f3052t.f2973d == null && fVar.f3054v.f2973d == null && fVar.f3055w.f2973d == null && fVar.f3058z.f2973d == null) {
                m4152a(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
            }
            if (!(fVar.f3052t.f2973d == null || fVar.f3054v.f2973d == null)) {
                C0758f.C0760b q = gVar.mo4386q();
                C0758f.C0760b bVar = C0758f.C0760b.WRAP_CONTENT;
                if (z) {
                    m4152a(gVar, fVar, hVar);
                    return false;
                } else if (!(fVar.f3052t.f2973d.f2971b == fVar.mo4374k() && fVar.f3054v.f2973d.f2971b == fVar.mo4374k())) {
                    m4152a(gVar, fVar, hVar);
                }
            }
            if (!(fVar.f3051s.f2973d == null || fVar.f3053u.f2973d == null)) {
                C0758f.C0760b j = gVar.mo4372j();
                C0758f.C0760b bVar2 = C0758f.C0760b.WRAP_CONTENT;
                if (z) {
                    m4152a(gVar, fVar, hVar);
                    return false;
                } else if (!(fVar.f3051s.f2973d.f2971b == fVar.mo4374k() && fVar.f3053u.f2973d.f2971b == fVar.mo4374k())) {
                    m4152a(gVar, fVar, hVar);
                }
            }
            if (((fVar.mo4372j() == C0758f.C0760b.MATCH_CONSTRAINT) ^ (fVar.mo4386q() == C0758f.C0760b.MATCH_CONSTRAINT)) && fVar.f3004G != 0.0f) {
                m4145a(fVar);
            } else if (fVar.mo4372j() == C0758f.C0760b.MATCH_CONSTRAINT || fVar.mo4386q() == C0758f.C0760b.MATCH_CONSTRAINT) {
                m4152a(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
            }
            if (((fVar.f3051s.f2973d == null && fVar.f3053u.f2973d == null) || (((eVar5 = fVar.f3051s.f2973d) != null && eVar5.f2971b == fVar.f3001D && fVar.f3053u.f2973d == null) || (((eVar6 = fVar.f3053u.f2973d) != null && eVar6.f2971b == fVar.f3001D && fVar.f3051s.f2973d == null) || ((eVar7 = fVar.f3051s.f2973d) != null && eVar7.f2971b == (fVar3 = fVar.f3001D) && (eVar8 = fVar.f3053u.f2973d) != null && eVar8.f2971b == fVar3)))) && fVar.f3058z.f2973d == null && !(fVar instanceof C0763i) && !(fVar instanceof C0765j)) {
                hVar.f3092f.add(fVar);
            }
            if (((fVar.f3052t.f2973d == null && fVar.f3054v.f2973d == null) || (((eVar = fVar.f3052t.f2973d) != null && eVar.f2971b == fVar.f3001D && fVar.f3054v.f2973d == null) || (((eVar2 = fVar.f3054v.f2973d) != null && eVar2.f2971b == fVar.f3001D && fVar.f3052t.f2973d == null) || ((eVar3 = fVar.f3052t.f2973d) != null && eVar3.f2971b == (fVar2 = fVar.f3001D) && (eVar4 = fVar.f3054v.f2973d) != null && eVar4.f2971b == fVar2)))) && fVar.f3058z.f2973d == null && fVar.f3055w.f2973d == null && !(fVar instanceof C0763i) && !(fVar instanceof C0765j)) {
                hVar.f3093g.add(fVar);
            }
            if (fVar instanceof C0765j) {
                m4152a(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
                C0765j jVar = (C0765j) fVar;
                for (int i = 0; i < jVar.f3106l0; i++) {
                    if (!m4154a(jVar.f3105k0[i], hVar, list, z)) {
                        return false;
                    }
                }
            }
            for (C0753e eVar9 : fVar.f2998A) {
                C0753e eVar10 = eVar9.f2973d;
                if (!(eVar10 == null || eVar10.f2971b == fVar.mo4374k())) {
                    if (eVar9.f2972c == C0753e.C0757d.CENTER) {
                        m4152a(gVar, fVar, hVar);
                        if (z) {
                            return false;
                        }
                    } else {
                        m4149a(eVar9);
                    }
                    if (!m4154a(eVar9.f2973d.f2971b, hVar, list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (hVar2 != hVar) {
            hVar.f3087a.addAll(hVar2.f3087a);
            hVar.f3092f.addAll(fVar.f3048p.f3092f);
            hVar.f3093g.addAll(fVar.f3048p.f3093g);
            if (!fVar.f3048p.f3090d) {
                hVar.f3090d = false;
            }
            list.remove(fVar.f3048p);
            for (C0758f fVar4 : fVar.f3048p.f3087a) {
                fVar4.f3048p = hVar;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m4155a(C0758f fVar, List<C0762h> list, boolean z) {
        C0762h hVar = new C0762h(new ArrayList(), true);
        list.add(hVar);
        return m4154a(fVar, hVar, list, z);
    }

    /* renamed from: b */
    private static void m4156b(C0761g gVar) {
        gVar.f3083w0.clear();
        gVar.f3083w0.add(0, new C0762h(gVar.f3132k0));
    }
}
