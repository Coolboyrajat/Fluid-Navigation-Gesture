package p006b.p022e.p023a.p024j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: b.e.a.j.h */
public class C0762h {

    /* renamed from: a */
    public List<C0758f> f3087a;

    /* renamed from: b */
    int f3088b = -1;

    /* renamed from: c */
    int f3089c = -1;

    /* renamed from: d */
    public boolean f3090d = false;

    /* renamed from: e */
    public final int[] f3091e = {this.f3088b, this.f3089c};

    /* renamed from: f */
    List<C0758f> f3092f = new ArrayList();

    /* renamed from: g */
    List<C0758f> f3093g = new ArrayList();

    /* renamed from: h */
    HashSet<C0758f> f3094h = new HashSet<>();

    /* renamed from: i */
    HashSet<C0758f> f3095i = new HashSet<>();

    /* renamed from: j */
    List<C0758f> f3096j = new ArrayList();

    /* renamed from: k */
    List<C0758f> f3097k = new ArrayList();

    C0762h(List<C0758f> list) {
        this.f3087a = list;
    }

    C0762h(List<C0758f> list, boolean z) {
        this.f3087a = list;
        this.f3090d = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4291a(p006b.p022e.p023a.p024j.C0758f r7) {
        /*
            r6 = this;
            boolean r0 = r7.f3027b0
            if (r0 == 0) goto L_0x00d9
            boolean r0 = r7.mo4398y()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            b.e.a.j.e r0 = r7.f3053u
            b.e.a.j.e r0 = r0.f2973d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x001b
            b.e.a.j.e r3 = r7.f3053u
            goto L_0x001d
        L_0x001b:
            b.e.a.j.e r3 = r7.f3051s
        L_0x001d:
            b.e.a.j.e r3 = r3.f2973d
            if (r3 == 0) goto L_0x0043
            b.e.a.j.f r4 = r3.f2971b
            boolean r5 = r4.f3029c0
            if (r5 != 0) goto L_0x002a
            r6.m4291a((p006b.p022e.p023a.p024j.C0758f) r4)
        L_0x002a:
            b.e.a.j.e$d r4 = r3.f2972c
            b.e.a.j.e$d r5 = p006b.p022e.p023a.p024j.C0753e.C0757d.RIGHT
            if (r4 != r5) goto L_0x003a
            b.e.a.j.f r3 = r3.f2971b
            int r4 = r3.f3006I
            int r3 = r3.mo4390s()
            int r3 = r3 + r4
            goto L_0x0044
        L_0x003a:
            b.e.a.j.e$d r5 = p006b.p022e.p023a.p024j.C0753e.C0757d.LEFT
            if (r4 != r5) goto L_0x0043
            b.e.a.j.f r3 = r3.f2971b
            int r3 = r3.f3006I
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r0 == 0) goto L_0x004e
            b.e.a.j.e r0 = r7.f3053u
            int r0 = r0.mo4311b()
            int r3 = r3 - r0
            goto L_0x005a
        L_0x004e:
            b.e.a.j.e r0 = r7.f3051s
            int r0 = r0.mo4311b()
            int r4 = r7.mo4390s()
            int r0 = r0 + r4
            int r3 = r3 + r0
        L_0x005a:
            int r0 = r7.mo4390s()
            int r0 = r3 - r0
            r7.mo4330a(r0, r3)
            b.e.a.j.e r0 = r7.f3055w
            b.e.a.j.e r0 = r0.f2973d
            if (r0 == 0) goto L_0x0085
            b.e.a.j.f r1 = r0.f2971b
            boolean r3 = r1.f3029c0
            if (r3 != 0) goto L_0x0072
            r6.m4291a((p006b.p022e.p023a.p024j.C0758f) r1)
        L_0x0072:
            b.e.a.j.f r0 = r0.f2971b
            int r1 = r0.f3007J
            int r0 = r0.f3014Q
            int r1 = r1 + r0
            int r0 = r7.f3014Q
            int r1 = r1 - r0
            int r0 = r7.f3003F
            int r0 = r0 + r1
            r7.mo4363e(r1, r0)
            r7.f3029c0 = r2
            return
        L_0x0085:
            b.e.a.j.e r0 = r7.f3054v
            b.e.a.j.e r0 = r0.f2973d
            if (r0 == 0) goto L_0x008c
            r1 = 1
        L_0x008c:
            if (r1 == 0) goto L_0x0091
            b.e.a.j.e r0 = r7.f3054v
            goto L_0x0093
        L_0x0091:
            b.e.a.j.e r0 = r7.f3052t
        L_0x0093:
            b.e.a.j.e r0 = r0.f2973d
            if (r0 == 0) goto L_0x00b8
            b.e.a.j.f r4 = r0.f2971b
            boolean r5 = r4.f3029c0
            if (r5 != 0) goto L_0x00a0
            r6.m4291a((p006b.p022e.p023a.p024j.C0758f) r4)
        L_0x00a0:
            b.e.a.j.e$d r4 = r0.f2972c
            b.e.a.j.e$d r5 = p006b.p022e.p023a.p024j.C0753e.C0757d.BOTTOM
            if (r4 != r5) goto L_0x00b0
            b.e.a.j.f r0 = r0.f2971b
            int r3 = r0.f3007J
            int r0 = r0.mo4370i()
            int r3 = r3 + r0
            goto L_0x00b8
        L_0x00b0:
            b.e.a.j.e$d r5 = p006b.p022e.p023a.p024j.C0753e.C0757d.TOP
            if (r4 != r5) goto L_0x00b8
            b.e.a.j.f r0 = r0.f2971b
            int r3 = r0.f3007J
        L_0x00b8:
            if (r1 == 0) goto L_0x00c2
            b.e.a.j.e r0 = r7.f3054v
            int r0 = r0.mo4311b()
            int r3 = r3 - r0
            goto L_0x00ce
        L_0x00c2:
            b.e.a.j.e r0 = r7.f3052t
            int r0 = r0.mo4311b()
            int r1 = r7.mo4370i()
            int r0 = r0 + r1
            int r3 = r3 + r0
        L_0x00ce:
            int r0 = r7.mo4370i()
            int r0 = r3 - r0
            r7.mo4363e(r0, r3)
            r7.f3029c0 = r2
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p023a.p024j.C0762h.m4291a(b.e.a.j.f):void");
    }

    /* renamed from: a */
    private void m4292a(ArrayList<C0758f> arrayList, C0758f fVar) {
        if (!fVar.f3031d0) {
            arrayList.add(fVar);
            fVar.f3031d0 = true;
            if (!fVar.mo4398y()) {
                if (fVar instanceof C0765j) {
                    C0765j jVar = (C0765j) fVar;
                    int i = jVar.f3106l0;
                    for (int i2 = 0; i2 < i; i2++) {
                        m4292a(arrayList, jVar.f3105k0[i2]);
                    }
                }
                for (C0753e eVar : fVar.f2998A) {
                    C0753e eVar2 = eVar.f2973d;
                    if (eVar2 != null) {
                        C0758f fVar2 = eVar2.f2971b;
                        if (!(eVar2 == null || fVar2 == fVar.mo4374k())) {
                            m4292a(arrayList, fVar2);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C0758f> mo4416a() {
        if (!this.f3096j.isEmpty()) {
            return this.f3096j;
        }
        int size = this.f3087a.size();
        for (int i = 0; i < size; i++) {
            C0758f fVar = this.f3087a.get(i);
            if (!fVar.f3027b0) {
                m4292a((ArrayList<C0758f>) (ArrayList) this.f3096j, fVar);
            }
        }
        this.f3097k.clear();
        this.f3097k.addAll(this.f3087a);
        this.f3097k.removeAll(this.f3096j);
        return this.f3096j;
    }

    /* renamed from: a */
    public List<C0758f> mo4417a(int i) {
        if (i == 0) {
            return this.f3092f;
        }
        if (i == 1) {
            return this.f3093g;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4418a(C0758f fVar, int i) {
        HashSet<C0758f> hashSet;
        if (i == 0) {
            hashSet = this.f3094h;
        } else if (i == 1) {
            hashSet = this.f3095i;
        } else {
            return;
        }
        hashSet.add(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<C0758f> mo4419b(int i) {
        if (i == 0) {
            return this.f3094h;
        }
        if (i == 1) {
            return this.f3095i;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4420b() {
        int size = this.f3097k.size();
        for (int i = 0; i < size; i++) {
            m4291a(this.f3097k.get(i));
        }
    }
}
