package com.p131fb.fluid.services.p145e.p146g;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.p131fb.fluid.p135l.p139p.C1767c;
import com.p131fb.fluid.p135l.p139p.C1777m;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p077c.p078a.C1156e;
import p054c.p077c.p078a.C1157f;
import p054c.p077c.p078a.C1160g;
import p054c.p077c.p078a.C1161h;
import p054c.p077c.p078a.C1163j;
import p054c.p079d.p080a.p081a.p082a.C1165a;

@SuppressLint({"RtlHardcoded"})
/* renamed from: com.fb.fluid.services.e.g.b */
public final class C1961b extends C1960a {

    /* renamed from: c */
    private int f5441c;

    /* renamed from: d */
    private int f5442d;

    /* renamed from: e */
    private int f5443e;

    /* renamed from: f */
    private final Point f5444f = new Point(0, 0);

    /* renamed from: g */
    private final PointF f5445g = new PointF(0.0f, 0.0f);

    /* renamed from: h */
    private int f5446h = -16777216;

    /* renamed from: i */
    private float f5447i = 1.0f;

    /* renamed from: j */
    private boolean f5448j;

    /* renamed from: k */
    private boolean f5449k;

    /* renamed from: l */
    private C3349a<Unit> f5450l = C1965d.f5465g;

    /* renamed from: m */
    private C3349a<Unit> f5451m = C1964c.f5464g;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public WeakReference<Drawable> f5452n;

    /* renamed from: o */
    private final Paint f5453o = new Paint();

    /* renamed from: p */
    private final Paint f5454p = new Paint();

    /* renamed from: q */
    private final float f5455q;

    /* renamed from: r */
    private final C1163j f5456r = C1163j.m5729c();

    /* renamed from: s */
    private final C1157f f5457s;

    /* renamed from: t */
    private final C1157f f5458t;

    /* renamed from: u */
    private final C1157f f5459u;

    /* renamed from: v */
    private final C1157f f5460v;

    /* renamed from: w */
    private final C1157f f5461w;

    /* renamed from: com.fb.fluid.services.e.g.b$a */
    public static final class C1962a extends C1156e {

        /* renamed from: a */
        final /* synthetic */ C1961b f5462a;

        C1962a(C1961b bVar) {
            this.f5462a = bVar;
        }

        /* renamed from: d */
        public void mo5271d(C1157f fVar) {
            super.mo5271d(fVar);
            if (fVar != null && fVar.mo5272a() == 0.0d) {
                WeakReference b = this.f5462a.f5452n;
                if (b != null) {
                    b.clear();
                }
                this.f5462a.f5452n = null;
            }
        }
    }

    /* renamed from: com.fb.fluid.services.e.g.b$b */
    public static final class C1963b extends C1969d {

        /* renamed from: c */
        final /* synthetic */ C1961b f5463c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1963b(C1961b bVar) {
            super(0, 1, (C3366g) null);
            this.f5463c = bVar;
        }

        /* renamed from: e */
        public void mo6815e(C1157f fVar) {
            if (this.f5463c.mo6795b() != 0) {
                if (!this.f5463c.mo6805e() || !this.f5463c.mo6814n()) {
                    this.f5463c.mo6811k().invoke();
                } else {
                    this.f5463c.m8007o();
                }
            }
        }
    }

    /* renamed from: com.fb.fluid.services.e.g.b$c */
    static final class C1964c extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        public static final C1964c f5464g = new C1964c();

        C1964c() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: com.fb.fluid.services.e.g.b$d */
    static final class C1965d extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        public static final C1965d f5465g = new C1965d();

        C1965d() {
            super(0);
        }

        public final void invoke() {
        }
    }

    public C1961b() {
        C1157f a = this.f5456r.mo5260a();
        C3370k.m12223a((Object) a, "springSystem.createSpring()");
        this.f5457s = a;
        C1157f a2 = this.f5456r.mo5260a();
        C3370k.m12223a((Object) a2, "springSystem.createSpring()");
        this.f5458t = a2;
        C1157f a3 = this.f5456r.mo5260a();
        C3370k.m12223a((Object) a3, "springSystem.createSpring()");
        this.f5459u = a3;
        C1157f a4 = this.f5456r.mo5260a();
        C3370k.m12223a((Object) a4, "springSystem.createSpring()");
        this.f5460v = a4;
        C1157f a5 = this.f5456r.mo5260a();
        C3370k.m12223a((Object) a5, "springSystem.createSpring()");
        this.f5461w = a5;
        C1963b bVar = new C1963b(this);
        for (C1157f fVar : C3284j.m12070b((T[]) new C1157f[]{this.f5460v, this.f5459u, this.f5458t, this.f5457s})) {
            fVar.mo5275a((C1161h) bVar);
            fVar.mo5277b(0.0d);
            fVar.mo5274a(C1160g.m5720a(0.0d, 10.0d));
        }
        C1157f fVar2 = this.f5461w;
        fVar2.mo5277b(0.0d);
        fVar2.mo5274a(C1160g.m5720a(0.0d, 20.0d));
        fVar2.mo5275a((C1161h) new C1962a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m8007o() {
        this.f5457s.mo5283e();
        this.f5458t.mo5283e();
        this.f5459u.mo5283e();
        this.f5460v.mo5283e();
        mo6798b(false);
        WeakReference<Drawable> weakReference = this.f5452n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f5452n = null;
        mo6810j().invoke();
    }

    /* renamed from: p */
    private final double m8008p() {
        int b = mo6795b();
        if (b == 3) {
            return 0.0d;
        }
        if (b == 5) {
            return (double) getWidth();
        }
        if (b == 48 || b == 80) {
            return this.f5460v.mo5272a();
        }
        return 0.0d;
    }

    /* renamed from: q */
    private final double m8009q() {
        int b = mo6795b();
        if (b == 3 || b == 5) {
            return this.f5459u.mo5272a();
        }
        if (b == 48 || b != 80) {
            return 0.0d;
        }
        return (double) getHeight();
    }

    /* renamed from: r */
    private final int m8010r() {
        return (int) C1777m.m7481a(mo6812l(), 0.5f, 1.2f, C1165a.m5733a(24.0f), C1165a.m5733a(36.0f));
    }

    /* renamed from: s */
    private final int m8011s() {
        return (int) C1777m.m7481a(mo6812l(), 0.5f, 1.2f, C1165a.m5733a(24.0f), C1165a.m5733a(48.0f));
    }

    /* renamed from: t */
    private final int m8012t() {
        return (int) C1777m.m7481a(mo6812l(), 0.5f, 1.2f, C1165a.m5733a(90.0f), C1165a.m5733a(164.0f));
    }

    /* renamed from: a */
    public Point mo6788a() {
        return this.f5444f;
    }

    /* renamed from: a */
    public void mo6789a(float f) {
        this.f5447i = f;
    }

    /* renamed from: a */
    public void mo6790a(int i) {
        this.f5443e = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0128, code lost:
        if (r1 != null) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x01e9, code lost:
        if (r1 != null) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x01f3, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x02d2, code lost:
        if (r1 != null) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0387, code lost:
        if (r1 != null) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0391, code lost:
        r2 = null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6791a(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            java.lang.String r0 = "canvas"
            kotlin.p205x.p207d.C3370k.m12227b(r8, r0)
            c.c.a.f r0 = r7.f5460v
            double r0 = r0.mo5272a()
            int r0 = (int) r0
            c.c.a.f r1 = r7.f5459u
            double r1 = r1.mo5272a()
            int r1 = (int) r1
            c.c.a.f r2 = r7.f5458t
            double r2 = r2.mo5272a()
            int r2 = (int) r2
            c.c.a.f r3 = r7.f5457s
            double r3 = r3.mo5272a()
            int r3 = (int) r3
            int r4 = r19.mo6795b()
            r5 = 1062836634(0x3f59999a, float:0.85)
            r11 = 1058642330(0x3f19999a, float:0.6)
            r12 = 1
            r13 = 7
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 5
            r9 = 3
            r6 = 0
            r16 = 1073741824(0x40000000, float:2.0)
            r10 = 2
            r17 = 0
            if (r4 == r9) goto L_0x02d6
            if (r4 == r15) goto L_0x01f9
            r2 = 48
            if (r4 == r2) goto L_0x012c
            r2 = 80
            if (r4 == r2) goto L_0x0049
            goto L_0x039b
        L_0x0049:
            float r2 = p054c.p079d.p080a.p081a.p082a.C1165a.m5733a((float) r14)
            int r4 = r19.m8012t()
            float r4 = (float) r4
            float r4 = r4 / r16
            int r1 = r1 - r3
            float r1 = (float) r1
            float r14 = r7.f5455q
            float r1 = r1 * r14
            android.graphics.PointF[] r13 = new android.graphics.PointF[r13]
            android.graphics.PointF r14 = new android.graphics.PointF
            int r18 = r19.m8012t()
            int r15 = r0 - r18
            float r15 = (float) r15
            float r15 = r15 + r17
            int r9 = r19.getHeight()
            float r9 = (float) r9
            float r9 = r9 + r2
            r14.<init>(r15, r9)
            r13[r6] = r14
            android.graphics.PointF r6 = new android.graphics.PointF
            int r9 = r19.m8012t()
            int r9 = r0 - r9
            float r9 = (float) r9
            float r5 = r5 * r4
            float r9 = r9 + r5
            int r14 = r19.getHeight()
            float r14 = (float) r14
            float r14 = r14 + r2
            r6.<init>(r9, r14)
            r13[r12] = r6
            android.graphics.PointF r6 = new android.graphics.PointF
            float r9 = (float) r0
            float r9 = r9 + r17
            float r4 = r4 * r11
            float r11 = r9 - r4
            float r3 = (float) r3
            float r12 = r3 + r1
            r6.<init>(r11, r12)
            r13[r10] = r6
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r9, r12)
            r3 = 3
            r13[r3] = r1
            android.graphics.PointF r1 = new android.graphics.PointF
            float r4 = r4 + r9
            r1.<init>(r4, r12)
            r3 = 4
            r13[r3] = r1
            android.graphics.PointF r1 = new android.graphics.PointF
            int r3 = r19.m8012t()
            int r3 = r3 + r0
            float r3 = (float) r3
            float r3 = r3 - r5
            int r4 = r19.getHeight()
            float r4 = (float) r4
            float r4 = r4 + r2
            r1.<init>(r3, r4)
            r3 = 5
            r13[r3] = r1
            android.graphics.PointF r1 = new android.graphics.PointF
            int r3 = r19.m8012t()
            int r0 = r0 + r3
            float r0 = (float) r0
            float r0 = r0 + r17
            int r3 = r19.getHeight()
            float r3 = (float) r3
            float r3 = r3 + r2
            r1.<init>(r0, r3)
            r0 = 6
            r13[r0] = r1
            java.util.List r11 = kotlin.p195s.C3284j.m12070b((T[]) r13)
            android.graphics.Paint r2 = r7.f5453o
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r19
            r1 = r20
            r3 = r11
            com.p131fb.fluid.services.p145e.p146g.C1960a.m7998a(r0, r1, r2, r3, r4, r5, r6)
            boolean r0 = r19.mo6813m()
            if (r0 == 0) goto L_0x00fc
            android.graphics.Paint r2 = r7.f5454p
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r19
            r1 = r20
            r3 = r11
            com.p131fb.fluid.services.p145e.p146g.C1960a.m7998a(r0, r1, r2, r3, r4, r5, r6)
        L_0x00fc:
            c.c.a.f r0 = r7.f5461w
            double r1 = r0.mo5272a()
            r3 = 0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = com.p131fb.fluid.p135l.p139p.C1777m.m7479a((double) r1, (double) r3, (double) r5)
            float r6 = (float) r0
            int r0 = r19.getHeight()
            float r0 = (float) r0
            float r0 = r0 - r12
            float r1 = (float) r10
            float r0 = r0 / r1
            int r2 = r19.m8011s()
            float r2 = (float) r2
            float r2 = r2 / r16
            float r0 = java.lang.Math.min(r0, r2)
            int r2 = r19.getHeight()
            float r2 = (float) r2
            float r2 = r2 - r12
            float r2 = r2 / r1
            float r12 = r12 + r2
            java.lang.ref.WeakReference<android.graphics.drawable.Drawable> r1 = r7.f5452n
            if (r1 == 0) goto L_0x01f3
            goto L_0x01eb
        L_0x012c:
            float r2 = p054c.p079d.p080a.p081a.p082a.C1165a.m5733a((float) r14)
            float r2 = -r2
            int r4 = r19.m8012t()
            float r4 = (float) r4
            float r4 = r4 / r16
            int r1 = r1 - r3
            float r1 = (float) r1
            float r5 = r7.f5455q
            float r1 = r1 * r5
            android.graphics.PointF[] r5 = new android.graphics.PointF[r13]
            android.graphics.PointF r9 = new android.graphics.PointF
            int r13 = r19.m8012t()
            int r13 = r0 - r13
            float r13 = (float) r13
            float r13 = r13 + r17
            r9.<init>(r13, r2)
            r5[r6] = r9
            android.graphics.PointF r6 = new android.graphics.PointF
            int r9 = r19.m8012t()
            int r9 = r0 - r9
            float r9 = (float) r9
            r13 = 1060320051(0x3f333333, float:0.7)
            float r13 = r13 * r4
            float r9 = r9 + r13
            r6.<init>(r9, r2)
            r5[r12] = r6
            android.graphics.PointF r6 = new android.graphics.PointF
            float r9 = (float) r0
            float r9 = r9 + r17
            float r4 = r4 * r11
            float r11 = r9 - r4
            float r3 = (float) r3
            float r12 = r3 + r1
            r6.<init>(r11, r12)
            r5[r10] = r6
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r9, r12)
            r3 = 3
            r5[r3] = r1
            android.graphics.PointF r1 = new android.graphics.PointF
            float r4 = r4 + r9
            r1.<init>(r4, r12)
            r3 = 4
            r5[r3] = r1
            android.graphics.PointF r1 = new android.graphics.PointF
            int r3 = r19.m8012t()
            int r3 = r3 + r0
            float r3 = (float) r3
            float r3 = r3 - r13
            r1.<init>(r3, r2)
            r3 = 5
            r5[r3] = r1
            android.graphics.PointF r1 = new android.graphics.PointF
            int r3 = r19.m8012t()
            int r0 = r0 + r3
            float r0 = (float) r0
            float r0 = r0 + r17
            r1.<init>(r0, r2)
            r0 = 6
            r5[r0] = r1
            java.util.List r10 = kotlin.p195s.C3284j.m12070b((T[]) r5)
            android.graphics.Paint r2 = r7.f5453o
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r19
            r1 = r20
            r3 = r10
            com.p131fb.fluid.services.p145e.p146g.C1960a.m7998a(r0, r1, r2, r3, r4, r5, r6)
            boolean r0 = r19.mo6813m()
            if (r0 == 0) goto L_0x01cb
            android.graphics.Paint r2 = r7.f5454p
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r19
            r1 = r20
            r3 = r10
            com.p131fb.fluid.services.p145e.p146g.C1960a.m7998a(r0, r1, r2, r3, r4, r5, r6)
        L_0x01cb:
            c.c.a.f r0 = r7.f5461w
            double r1 = r0.mo5272a()
            r3 = 0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = com.p131fb.fluid.p135l.p139p.C1777m.m7479a((double) r1, (double) r3, (double) r5)
            float r6 = (float) r0
            float r12 = r12 / r16
            int r0 = r19.m8011s()
            float r0 = (float) r0
            float r0 = r0 / r16
            float r0 = java.lang.Math.min(r12, r0)
            java.lang.ref.WeakReference<android.graphics.drawable.Drawable> r1 = r7.f5452n
            if (r1 == 0) goto L_0x01f3
        L_0x01eb:
            java.lang.Object r1 = r1.get()
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r2 = r1
            goto L_0x01f4
        L_0x01f3:
            r2 = 0
        L_0x01f4:
            int r3 = (int) r9
            int r4 = (int) r12
            int r5 = (int) r0
            goto L_0x0394
        L_0x01f9:
            float r3 = p054c.p079d.p080a.p081a.p082a.C1165a.m5733a((float) r14)
            int r4 = r19.m8012t()
            float r4 = (float) r4
            float r4 = r4 / r16
            int r0 = r0 - r2
            float r0 = (float) r0
            float r9 = r7.f5455q
            float r0 = r0 * r9
            android.graphics.PointF[] r9 = new android.graphics.PointF[r13]
            android.graphics.PointF r13 = new android.graphics.PointF
            int r14 = r19.getWidth()
            float r14 = (float) r14
            float r14 = r14 + r3
            int r15 = r19.m8012t()
            int r15 = r1 - r15
            float r15 = (float) r15
            float r15 = r15 + r17
            r13.<init>(r14, r15)
            r9[r6] = r13
            android.graphics.PointF r13 = new android.graphics.PointF
            int r14 = r19.getWidth()
            float r14 = (float) r14
            float r14 = r14 + r3
            int r15 = r19.m8012t()
            int r15 = r1 - r15
            float r15 = (float) r15
            float r5 = r5 * r4
            float r15 = r15 + r5
            r13.<init>(r14, r15)
            r9[r12] = r13
            android.graphics.PointF r12 = new android.graphics.PointF
            float r2 = (float) r2
            float r13 = r2 + r0
            float r0 = (float) r1
            float r14 = r0 + r17
            float r4 = r4 * r11
            float r0 = r14 - r4
            r12.<init>(r13, r0)
            r9[r10] = r12
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r13, r14)
            r2 = 3
            r9[r2] = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            float r4 = r4 + r14
            r0.<init>(r13, r4)
            r2 = 4
            r9[r2] = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            int r2 = r19.getWidth()
            float r2 = (float) r2
            float r2 = r2 + r3
            int r4 = r19.m8012t()
            int r4 = r4 + r1
            float r4 = (float) r4
            float r4 = r4 - r5
            r0.<init>(r2, r4)
            r2 = 5
            r9[r2] = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            int r2 = r19.getWidth()
            float r2 = (float) r2
            float r2 = r2 + r3
            int r3 = r19.m8012t()
            int r1 = r1 + r3
            float r1 = (float) r1
            float r1 = r1 + r17
            r0.<init>(r2, r1)
            r1 = 6
            r9[r1] = r0
            java.util.List r3 = kotlin.p195s.C3284j.m12070b((T[]) r9)
            android.graphics.Paint r0 = r7.f5453o
            r7.mo6783a(r8, r0, r3, r6)
            boolean r0 = r19.mo6813m()
            if (r0 == 0) goto L_0x02a2
            android.graphics.Paint r2 = r7.f5454p
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r19
            r1 = r20
            com.p131fb.fluid.services.p145e.p146g.C1960a.m7998a(r0, r1, r2, r3, r4, r5, r6)
        L_0x02a2:
            c.c.a.f r0 = r7.f5461w
            double r1 = r0.mo5272a()
            r3 = 0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = com.p131fb.fluid.p135l.p139p.C1777m.m7479a((double) r1, (double) r3, (double) r5)
            float r6 = (float) r0
            int r0 = r19.getWidth()
            float r0 = (float) r0
            int r1 = r19.getWidth()
            float r1 = (float) r1
            float r1 = r1 - r13
            float r2 = (float) r10
            float r1 = r1 / r2
            float r0 = r0 - r1
            int r1 = r19.getWidth()
            float r1 = (float) r1
            float r1 = r1 - r13
            int r1 = (int) r1
            int r1 = r1 / r10
            int r2 = r19.m8011s()
            int r2 = r2 / r10
            int r5 = java.lang.Math.min(r1, r2)
            java.lang.ref.WeakReference<android.graphics.drawable.Drawable> r1 = r7.f5452n
            if (r1 == 0) goto L_0x0391
            goto L_0x0389
        L_0x02d6:
            float r3 = p054c.p079d.p080a.p081a.p082a.C1165a.m5733a((float) r14)
            float r3 = -r3
            int r4 = r19.m8012t()
            float r4 = (float) r4
            float r4 = r4 / r16
            int r0 = r0 - r2
            float r0 = (float) r0
            float r9 = r7.f5455q
            float r0 = r0 * r9
            android.graphics.PointF[] r9 = new android.graphics.PointF[r13]
            android.graphics.PointF r13 = new android.graphics.PointF
            int r14 = r19.m8012t()
            int r14 = r1 - r14
            float r14 = (float) r14
            float r14 = r14 + r17
            r13.<init>(r3, r14)
            r9[r6] = r13
            android.graphics.PointF r13 = new android.graphics.PointF
            int r14 = r19.m8012t()
            int r14 = r1 - r14
            float r14 = (float) r14
            float r5 = r5 * r4
            float r14 = r14 + r5
            r13.<init>(r3, r14)
            r9[r12] = r13
            android.graphics.PointF r12 = new android.graphics.PointF
            float r2 = (float) r2
            float r13 = r2 + r0
            float r0 = (float) r1
            float r14 = r0 + r17
            float r4 = r4 * r11
            float r0 = r14 - r4
            r12.<init>(r13, r0)
            r9[r10] = r12
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r13, r14)
            r2 = 3
            r9[r2] = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            float r4 = r4 + r14
            r0.<init>(r13, r4)
            r2 = 4
            r9[r2] = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            int r2 = r19.m8012t()
            int r2 = r2 + r1
            float r2 = (float) r2
            float r2 = r2 - r5
            r0.<init>(r3, r2)
            r2 = 5
            r9[r2] = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            int r2 = r19.m8012t()
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r17
            r0.<init>(r3, r1)
            r1 = 6
            r9[r1] = r0
            java.util.List r3 = kotlin.p195s.C3284j.m12070b((T[]) r9)
            android.graphics.Paint r0 = r7.f5453o
            r7.mo6783a(r8, r0, r3, r6)
            boolean r0 = r19.mo6813m()
            if (r0 == 0) goto L_0x0368
            android.graphics.Paint r2 = r7.f5454p
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r19
            r1 = r20
            com.p131fb.fluid.services.p145e.p146g.C1960a.m7998a(r0, r1, r2, r3, r4, r5, r6)
        L_0x0368:
            c.c.a.f r0 = r7.f5461w
            double r1 = r0.mo5272a()
            r3 = 0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = com.p131fb.fluid.p135l.p139p.C1777m.m7479a((double) r1, (double) r3, (double) r5)
            float r6 = (float) r0
            float r0 = (float) r10
            float r0 = r13 / r0
            int r1 = (int) r13
            int r1 = r1 / r10
            int r2 = r19.m8011s()
            int r2 = r2 / r10
            int r5 = java.lang.Math.min(r1, r2)
            java.lang.ref.WeakReference<android.graphics.drawable.Drawable> r1 = r7.f5452n
            if (r1 == 0) goto L_0x0391
        L_0x0389:
            java.lang.Object r1 = r1.get()
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r2 = r1
            goto L_0x0392
        L_0x0391:
            r2 = 0
        L_0x0392:
            int r3 = (int) r0
            int r4 = (int) r14
        L_0x0394:
            r0 = r19
            r1 = r20
            r0.mo6784a(r1, r2, r3, r4, r5, r6)
        L_0x039b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.p145e.p146g.C1961b.mo6791a(android.graphics.Canvas):void");
    }

    /* renamed from: a */
    public void mo6792a(WeakReference<Drawable> weakReference) {
        C1157f fVar;
        double d;
        if (!mo6805e()) {
            if (weakReference == null) {
                fVar = this.f5461w;
                d = 0.0d;
            } else {
                this.f5452n = weakReference;
                fVar = this.f5461w;
                d = 1.0d;
            }
            fVar.mo5279c(d);
        }
    }

    /* renamed from: a */
    public void mo6793a(C3349a<Unit> aVar) {
        C3370k.m12227b(aVar, "<set-?>");
        this.f5451m = aVar;
    }

    /* renamed from: a */
    public void mo6794a(boolean z) {
        this.f5448j = z;
    }

    /* renamed from: b */
    public int mo6795b() {
        return this.f5441c;
    }

    /* renamed from: b */
    public void mo6796b(int i) {
        this.f5446h = i;
    }

    /* renamed from: b */
    public void mo6797b(C3349a<Unit> aVar) {
        C3370k.m12227b(aVar, "<set-?>");
        this.f5450l = aVar;
    }

    /* renamed from: b */
    public void mo6798b(boolean z) {
        this.f5449k = z;
    }

    /* renamed from: c */
    public void mo6799c() {
        int i;
        int i2;
        this.f5460v.mo5279c((double) mo6786g());
        this.f5459u.mo5279c((double) mo6787h());
        PointF f = mo6806f();
        double d = (double) f.y;
        double d2 = (double) f.x;
        int b = mo6795b();
        if (b == 3) {
            i = C1777m.m7482a((int) mo6806f().x, 0, m8010r());
        } else if (b != 5) {
            if (b != 48) {
                if (b == 80) {
                    d2 = (double) mo6806f().x;
                    i2 = C1777m.m7482a((int) mo6806f().y, getHeight() - m8010r(), getHeight());
                }
                this.f5458t.mo5279c(d2);
                this.f5457s.mo5279c(d);
            }
            d2 = (double) mo6806f().x;
            i2 = C1777m.m7482a((int) mo6806f().y, 0, m8010r());
            d = (double) i2;
            this.f5458t.mo5279c(d2);
            this.f5457s.mo5279c(d);
        } else {
            i = C1777m.m7482a((int) mo6806f().x, getWidth() - m8010r(), getWidth());
        }
        d2 = (double) i;
        d = (double) mo6806f().y;
        this.f5458t.mo5279c(d2);
        this.f5457s.mo5279c(d);
    }

    /* renamed from: c */
    public void mo6800c(int i) {
        this.f5441c = i;
    }

    /* renamed from: d */
    public void mo6801d() {
        mo6798b(false);
        Paint paint = this.f5453o;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(mo6809i());
        Paint paint2 = this.f5454p;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(C1165a.m5733a(0.7f));
        paint2.setColor(C1767c.m7444a(C1767c.m7446a(mo6809i()) ? -1 : -12303292, 0.1f));
        this.f5460v.mo5283e();
        this.f5460v.mo5277b((double) mo6786g());
        this.f5459u.mo5283e();
        this.f5459u.mo5277b((double) mo6787h());
        this.f5458t.mo5283e();
        this.f5458t.mo5277b(m8008p());
        this.f5457s.mo5283e();
        this.f5457s.mo5277b(m8009q());
    }

    /* renamed from: d */
    public void mo6802d(int i) {
        this.f5442d = i;
    }

    public void dismiss() {
        this.f5458t.mo5279c(m8008p());
        this.f5457s.mo5279c(m8009q());
        this.f5461w.mo5279c(0.0d);
        if (mo6814n()) {
            m8007o();
        } else {
            mo6798b(true);
        }
    }

    /* renamed from: e */
    public void mo6804e(int i) {
    }

    /* renamed from: e */
    public boolean mo6805e() {
        return this.f5449k;
    }

    /* renamed from: f */
    public PointF mo6806f() {
        return this.f5445g;
    }

    public int getHeight() {
        return this.f5443e;
    }

    public int getWidth() {
        return this.f5442d;
    }

    /* renamed from: i */
    public int mo6809i() {
        return this.f5446h;
    }

    /* renamed from: j */
    public C3349a<Unit> mo6810j() {
        return this.f5451m;
    }

    /* renamed from: k */
    public C3349a<Unit> mo6811k() {
        return this.f5450l;
    }

    /* renamed from: l */
    public float mo6812l() {
        return this.f5447i;
    }

    /* renamed from: m */
    public boolean mo6813m() {
        return this.f5448j;
    }

    /* renamed from: n */
    public boolean mo6814n() {
        int b = mo6795b();
        if (b != 3) {
            if (b != 5) {
                if (b != 48) {
                    return b != 80 || ((double) Math.round(this.f5457s.mo5272a())) >= m8009q();
                }
                if (((double) Math.round(this.f5457s.mo5272a())) <= m8009q()) {
                    return true;
                }
            } else if (((double) Math.round(this.f5458t.mo5272a())) >= m8008p()) {
                return true;
            }
        } else if (((double) Math.round(this.f5458t.mo5272a())) <= m8008p()) {
            return true;
        }
    }
}
