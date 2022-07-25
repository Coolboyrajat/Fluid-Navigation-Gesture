package com.p131fb.fluid.services.p145e.p146g;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
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
/* renamed from: com.fb.fluid.services.e.g.g */
public final class C1978g extends C1960a {

    /* renamed from: c */
    private int f5505c;

    /* renamed from: d */
    private int f5506d;

    /* renamed from: e */
    private int f5507e;

    /* renamed from: f */
    private final Point f5508f = new Point(0, 0);

    /* renamed from: g */
    private final PointF f5509g = new PointF(0.0f, 0.0f);

    /* renamed from: h */
    private float f5510h = 1.0f;

    /* renamed from: i */
    private boolean f5511i;

    /* renamed from: j */
    private C3349a<Unit> f5512j = C1982d.f5526g;

    /* renamed from: k */
    private C3349a<Unit> f5513k = C1981c.f5525g;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public WeakReference<Drawable> f5514l;

    /* renamed from: m */
    private final float f5515m = 0.1f;

    /* renamed from: n */
    private final float f5516n = 0.1f;

    /* renamed from: o */
    private final C1163j f5517o = C1163j.m5729c();

    /* renamed from: p */
    private final C1157f f5518p;

    /* renamed from: q */
    private final C1157f f5519q;

    /* renamed from: r */
    private final C1157f f5520r;

    /* renamed from: s */
    private final C1157f f5521s;

    /* renamed from: t */
    private final C1157f f5522t;

    /* renamed from: com.fb.fluid.services.e.g.g$a */
    public static final class C1979a extends C1156e {

        /* renamed from: a */
        final /* synthetic */ C1978g f5523a;

        C1979a(C1978g gVar) {
            this.f5523a = gVar;
        }

        /* renamed from: d */
        public void mo5271d(C1157f fVar) {
            super.mo5271d(fVar);
            if (fVar != null && fVar.mo5272a() == 0.0d) {
                WeakReference b = this.f5523a.f5514l;
                if (b != null) {
                    b.clear();
                }
                this.f5523a.f5514l = null;
            }
        }
    }

    /* renamed from: com.fb.fluid.services.e.g.g$b */
    public static final class C1980b extends C1969d {

        /* renamed from: c */
        final /* synthetic */ C1978g f5524c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1980b(C1978g gVar) {
            super(0, 1, (C3366g) null);
            this.f5524c = gVar;
        }

        /* renamed from: e */
        public void mo6815e(C1157f fVar) {
            if (this.f5524c.mo6795b() != 0) {
                if (!this.f5524c.mo6805e() || !this.f5524c.mo6830l()) {
                    this.f5524c.mo6828j().invoke();
                } else {
                    this.f5524c.m8118m();
                }
            }
        }
    }

    /* renamed from: com.fb.fluid.services.e.g.g$c */
    static final class C1981c extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        public static final C1981c f5525g = new C1981c();

        C1981c() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: com.fb.fluid.services.e.g.g$d */
    static final class C1982d extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        public static final C1982d f5526g = new C1982d();

        C1982d() {
            super(0);
        }

        public final void invoke() {
        }
    }

    public C1978g() {
        C1157f a = this.f5517o.mo5260a();
        C3370k.m12223a((Object) a, "springSystem.createSpring()");
        this.f5518p = a;
        C1157f a2 = this.f5517o.mo5260a();
        C3370k.m12223a((Object) a2, "springSystem.createSpring()");
        this.f5519q = a2;
        C1157f a3 = this.f5517o.mo5260a();
        C3370k.m12223a((Object) a3, "springSystem.createSpring()");
        this.f5520r = a3;
        C1157f a4 = this.f5517o.mo5260a();
        C3370k.m12223a((Object) a4, "springSystem.createSpring()");
        this.f5521s = a4;
        C1157f a5 = this.f5517o.mo5260a();
        C3370k.m12223a((Object) a5, "springSystem.createSpring()");
        this.f5522t = a5;
        C1980b bVar = new C1980b(this);
        for (C1157f fVar : C3284j.m12070b((T[]) new C1157f[]{this.f5521s, this.f5520r, this.f5519q, this.f5518p})) {
            fVar.mo5275a((C1161h) bVar);
            fVar.mo5277b(0.0d);
            fVar.mo5274a(C1160g.m5720a(7.0d, 10.0d));
        }
        C1157f fVar2 = this.f5522t;
        fVar2.mo5277b(0.0d);
        fVar2.mo5274a(C1160g.m5720a(0.0d, 60.0d));
        fVar2.mo5275a((C1161h) new C1979a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m8118m() {
        this.f5518p.mo5283e();
        this.f5519q.mo5283e();
        this.f5520r.mo5283e();
        this.f5521s.mo5283e();
        mo6826b(false);
        WeakReference<Drawable> weakReference = this.f5514l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f5514l = null;
        mo6827i().invoke();
    }

    /* renamed from: n */
    private final double m8119n() {
        int b = mo6795b();
        if (b == 3) {
            return 0.0d;
        }
        if (b == 5) {
            return (double) getWidth();
        }
        if (b == 48 || b == 80) {
            return this.f5521s.mo5272a();
        }
        return 0.0d;
    }

    /* renamed from: o */
    private final double m8120o() {
        int b = mo6795b();
        if (b == 3 || b == 5) {
            return this.f5520r.mo5272a();
        }
        if (b == 48 || b != 80) {
            return 0.0d;
        }
        return (double) getHeight();
    }

    /* renamed from: p */
    private final int m8121p() {
        return (int) C1777m.m7481a(mo6829k(), 0.5f, 1.2f, C1165a.m5733a(48.0f), C1165a.m5733a(72.0f));
    }

    /* renamed from: q */
    private final int m8122q() {
        return (int) C1777m.m7481a(mo6829k(), 0.5f, 1.2f, C1165a.m5733a(24.0f), C1165a.m5733a(64.0f));
    }

    /* renamed from: r */
    private final int m8123r() {
        return (int) C1777m.m7481a(mo6829k(), 0.5f, 1.2f, C1165a.m5733a(100.0f), C1165a.m5733a(148.0f));
    }

    /* renamed from: a */
    public Point mo6788a() {
        return this.f5508f;
    }

    /* renamed from: a */
    public void mo6789a(float f) {
        this.f5510h = f;
    }

    /* renamed from: a */
    public void mo6790a(int i) {
        this.f5507e = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00ea, code lost:
        if (r0 != null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00f4, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x008d, code lost:
        if (r0 != null) goto L_0x00ec;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6791a(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r7 = r18
            r1 = r19
            java.lang.String r0 = "canvas"
            kotlin.p205x.p207d.C3370k.m12227b(r1, r0)
            c.c.a.f r0 = r7.f5521s
            double r2 = r0.mo5272a()
            int r0 = (int) r2
            c.c.a.f r2 = r7.f5520r
            double r2 = r2.mo5272a()
            int r2 = (int) r2
            int r3 = r18.mo6795b()
            r4 = 3
            r5 = 0
            r6 = 1050253722(0x3e99999a, float:0.3)
            r8 = 1094713344(0x41400000, float:12.0)
            r9 = 0
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r3 == r4) goto L_0x016e
            r4 = 5
            if (r3 == r4) goto L_0x00f7
            r4 = 48
            if (r3 == r4) goto L_0x0090
            r4 = 80
            if (r3 == r4) goto L_0x0034
            goto L_0x01e6
        L_0x0034:
            c.c.a.f r3 = r7.f5519q
            double r3 = r3.mo5272a()
            int r3 = (int) r3
            c.c.a.f r4 = r7.f5518p
            double r11 = r4.mo5272a()
            int r4 = (int) r11
            int r3 = r3 - r0
            float r3 = (float) r3
            float r11 = r7.f5516n
            float r3 = r3 * r11
            int r11 = r18.m8123r()
            int r11 = r11 / 2
            float r11 = (float) r11
            float r11 = -r11
            int r12 = r18.m8123r()
            int r12 = r12 / 2
            float r12 = (float) r12
            float r11 = com.p131fb.fluid.p135l.p139p.C1777m.m7480a((float) r3, (float) r11, (float) r12)
            int r12 = r18.m8123r()
            int r12 = r12 / 2
            float r12 = (float) r12
            float r8 = com.p131fb.fluid.p135l.p139p.C1777m.m7481a(r11, r9, r12, r9, r8)
            c.c.a.f r9 = r7.f5522t
            double r11 = r9.mo5272a()
            r13 = 0
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = com.p131fb.fluid.p135l.p139p.C1777m.m7479a((double) r11, (double) r13, (double) r15)
            float r9 = (float) r11
            float r0 = (float) r0
            float r3 = r3 + r0
            int r11 = r18.m8122q()
            int r11 = r11 / 2
            int r4 = r4 + r11
            float r6 = r6 * r9
            int r6 = com.p131fb.fluid.p135l.p139p.C1767c.m7444a((int) r10, (float) r6)
            r1.drawColor(r6)
            float r2 = (float) r2
            r1.rotate(r8, r0, r2)
            java.lang.ref.WeakReference<android.graphics.drawable.Drawable> r0 = r7.f5514l
            if (r0 == 0) goto L_0x00f4
            goto L_0x00ec
        L_0x0090:
            c.c.a.f r3 = r7.f5519q
            double r3 = r3.mo5272a()
            int r3 = (int) r3
            c.c.a.f r4 = r7.f5518p
            double r11 = r4.mo5272a()
            int r4 = (int) r11
            int r3 = r3 - r0
            float r3 = (float) r3
            float r11 = r7.f5516n
            float r3 = r3 * r11
            int r11 = r18.m8123r()
            int r11 = r11 / 2
            float r11 = (float) r11
            float r11 = -r11
            int r12 = r18.m8123r()
            int r12 = r12 / 2
            float r12 = (float) r12
            float r11 = com.p131fb.fluid.p135l.p139p.C1777m.m7480a((float) r3, (float) r11, (float) r12)
            int r12 = r18.m8123r()
            int r12 = r12 / 2
            float r12 = (float) r12
            float r8 = com.p131fb.fluid.p135l.p139p.C1777m.m7481a(r11, r9, r12, r9, r8)
            float r8 = -r8
            c.c.a.f r9 = r7.f5522t
            double r11 = r9.mo5272a()
            r13 = 0
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = com.p131fb.fluid.p135l.p139p.C1777m.m7479a((double) r11, (double) r13, (double) r15)
            float r9 = (float) r11
            float r0 = (float) r0
            float r3 = r3 + r0
            int r11 = r18.m8122q()
            int r11 = r11 / 2
            int r4 = r4 - r11
            float r6 = r6 * r9
            int r6 = com.p131fb.fluid.p135l.p139p.C1767c.m7444a((int) r10, (float) r6)
            r1.drawColor(r6)
            float r2 = (float) r2
            r1.rotate(r8, r0, r2)
            java.lang.ref.WeakReference<android.graphics.drawable.Drawable> r0 = r7.f5514l
            if (r0 == 0) goto L_0x00f4
        L_0x00ec:
            java.lang.Object r0 = r0.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r2 = r0
            goto L_0x00f5
        L_0x00f4:
            r2 = r5
        L_0x00f5:
            int r3 = (int) r3
            goto L_0x0163
        L_0x00f7:
            c.c.a.f r3 = r7.f5519q
            double r3 = r3.mo5272a()
            int r3 = (int) r3
            c.c.a.f r4 = r7.f5518p
            double r11 = r4.mo5272a()
            int r4 = (int) r11
            int r4 = r4 - r2
            float r4 = (float) r4
            float r11 = r7.f5516n
            float r4 = r4 * r11
            int r11 = r18.m8123r()
            int r11 = r11 / 2
            float r11 = (float) r11
            float r11 = -r11
            int r12 = r18.m8123r()
            int r12 = r12 / 2
            float r12 = (float) r12
            float r11 = com.p131fb.fluid.p135l.p139p.C1777m.m7480a((float) r4, (float) r11, (float) r12)
            int r12 = r18.m8123r()
            int r12 = r12 / 2
            float r12 = (float) r12
            float r8 = com.p131fb.fluid.p135l.p139p.C1777m.m7481a(r11, r9, r12, r9, r8)
            float r8 = -r8
            c.c.a.f r9 = r7.f5522t
            double r11 = r9.mo5272a()
            r13 = 0
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = com.p131fb.fluid.p135l.p139p.C1777m.m7479a((double) r11, (double) r13, (double) r15)
            float r9 = (float) r11
            int r11 = r18.m8122q()
            int r11 = r11 / 2
            int r3 = r3 + r11
            float r2 = (float) r2
            float r4 = r4 + r2
            int r11 = r18.m8122q()
            float r11 = (float) r11
            float r4 = r4 - r11
            float r6 = r6 * r9
            int r6 = com.p131fb.fluid.p135l.p139p.C1767c.m7444a((int) r10, (float) r6)
            r1.drawColor(r6)
            float r0 = (float) r0
            r1.rotate(r8, r0, r2)
            java.lang.ref.WeakReference<android.graphics.drawable.Drawable> r0 = r7.f5514l
            if (r0 == 0) goto L_0x0161
            java.lang.Object r0 = r0.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r2 = r0
            goto L_0x0162
        L_0x0161:
            r2 = r5
        L_0x0162:
            int r4 = (int) r4
        L_0x0163:
            int r5 = r18.m8122q()
            r0 = r18
            r1 = r19
            r6 = r9
            goto L_0x01e3
        L_0x016e:
            c.c.a.f r3 = r7.f5519q
            double r3 = r3.mo5272a()
            int r3 = (int) r3
            c.c.a.f r4 = r7.f5518p
            double r11 = r4.mo5272a()
            int r4 = (int) r11
            int r4 = r4 - r2
            float r4 = (float) r4
            float r11 = r7.f5516n
            float r4 = r4 * r11
            c.c.a.f r11 = r7.f5522t
            double r12 = r11.mo5272a()
            r14 = 0
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = com.p131fb.fluid.p135l.p139p.C1777m.m7479a((double) r12, (double) r14, (double) r16)
            float r11 = (float) r11
            int r12 = r18.m8122q()
            int r12 = r12 / 2
            int r3 = r3 - r12
            float r2 = (float) r2
            float r12 = r2 + r4
            int r13 = r18.m8122q()
            float r13 = (float) r13
            float r12 = r12 - r13
            int r13 = r18.m8123r()
            int r13 = r13 / 2
            float r13 = (float) r13
            float r13 = -r13
            int r14 = r18.m8123r()
            int r14 = r14 / 2
            float r14 = (float) r14
            float r4 = com.p131fb.fluid.p135l.p139p.C1777m.m7480a((float) r4, (float) r13, (float) r14)
            int r13 = r18.m8123r()
            int r13 = r13 / 2
            float r13 = (float) r13
            float r4 = com.p131fb.fluid.p135l.p139p.C1777m.m7481a(r4, r9, r13, r9, r8)
            float r6 = r6 * r11
            int r6 = com.p131fb.fluid.p135l.p139p.C1767c.m7444a((int) r10, (float) r6)
            r1.drawColor(r6)
            float r0 = (float) r0
            r1.rotate(r4, r0, r2)
            java.lang.ref.WeakReference<android.graphics.drawable.Drawable> r0 = r7.f5514l
            if (r0 == 0) goto L_0x01d8
            java.lang.Object r0 = r0.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r2 = r0
            goto L_0x01d9
        L_0x01d8:
            r2 = r5
        L_0x01d9:
            int r4 = (int) r12
            int r5 = r18.m8122q()
            r0 = r18
            r1 = r19
            r6 = r11
        L_0x01e3:
            r0.mo6784a(r1, r2, r3, r4, r5, r6)
        L_0x01e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.p145e.p146g.C1978g.mo6791a(android.graphics.Canvas):void");
    }

    /* renamed from: a */
    public void mo6792a(WeakReference<Drawable> weakReference) {
        C1157f fVar;
        double d;
        if (!mo6805e()) {
            if (weakReference == null) {
                fVar = this.f5522t;
                d = 0.0d;
            } else {
                Drawable drawable = (Drawable) weakReference.get();
                if (drawable != null && (drawable instanceof GradientDrawable)) {
                    drawable.setTint(-1);
                }
                this.f5514l = weakReference;
                fVar = this.f5522t;
                d = 1.0d;
            }
            fVar.mo5279c(d);
        }
    }

    /* renamed from: a */
    public void mo6793a(C3349a<Unit> aVar) {
        C3370k.m12227b(aVar, "<set-?>");
        this.f5513k = aVar;
    }

    /* renamed from: a */
    public void mo6794a(boolean z) {
    }

    /* renamed from: b */
    public int mo6795b() {
        return this.f5505c;
    }

    /* renamed from: b */
    public void mo6796b(int i) {
    }

    /* renamed from: b */
    public void mo6797b(C3349a<Unit> aVar) {
        C3370k.m12227b(aVar, "<set-?>");
        this.f5512j = aVar;
    }

    /* renamed from: b */
    public void mo6826b(boolean z) {
        this.f5511i = z;
    }

    /* renamed from: c */
    public void mo6799c() {
        float f;
        float f2;
        this.f5521s.mo5279c((double) mo6786g());
        this.f5520r.mo5279c((double) mo6787h());
        PointF f3 = mo6806f();
        double d = (double) f3.y;
        double d2 = (double) f3.x;
        int b = mo6795b();
        if (b == 3) {
            float a = (float) C1777m.m7482a((int) mo6806f().x, 0, m8121p());
            f2 = a + (Math.abs(mo6806f().x - a) * this.f5515m);
        } else if (b != 5) {
            if (b != 48) {
                if (b == 80) {
                    d2 = (double) mo6806f().x;
                    float a2 = (float) C1777m.m7482a((int) mo6806f().y, getHeight() - m8121p(), getHeight());
                    f = a2 - (Math.abs(mo6806f().y - a2) * this.f5515m);
                }
                this.f5519q.mo5279c(d2);
                this.f5518p.mo5279c(d);
            }
            d2 = (double) mo6806f().x;
            float a3 = (float) C1777m.m7482a((int) mo6806f().y, 0, m8121p());
            f = a3 + (Math.abs(mo6806f().y - a3) * this.f5515m);
            d = (double) f;
            this.f5519q.mo5279c(d2);
            this.f5518p.mo5279c(d);
        } else {
            float a4 = (float) C1777m.m7482a((int) mo6806f().x, getWidth() - m8121p(), getWidth());
            f2 = a4 - (Math.abs(mo6806f().x - a4) * this.f5515m);
        }
        d2 = (double) f2;
        f = mo6806f().y;
        d = (double) f;
        this.f5519q.mo5279c(d2);
        this.f5518p.mo5279c(d);
    }

    /* renamed from: c */
    public void mo6800c(int i) {
        this.f5505c = i;
    }

    /* renamed from: d */
    public void mo6801d() {
        mo6826b(false);
        this.f5521s.mo5283e();
        this.f5521s.mo5277b((double) mo6786g());
        this.f5520r.mo5283e();
        this.f5520r.mo5277b((double) mo6787h());
        this.f5519q.mo5283e();
        this.f5519q.mo5277b(m8119n());
        this.f5518p.mo5283e();
        this.f5518p.mo5277b(m8120o());
    }

    /* renamed from: d */
    public void mo6802d(int i) {
        this.f5506d = i;
    }

    public void dismiss() {
        this.f5519q.mo5279c(m8119n());
        this.f5518p.mo5279c(m8120o());
        this.f5522t.mo5279c(0.0d);
        if (mo6830l()) {
            m8118m();
        } else {
            mo6826b(true);
        }
    }

    /* renamed from: e */
    public void mo6804e(int i) {
    }

    /* renamed from: e */
    public boolean mo6805e() {
        return this.f5511i;
    }

    /* renamed from: f */
    public PointF mo6806f() {
        return this.f5509g;
    }

    public int getHeight() {
        return this.f5507e;
    }

    public int getWidth() {
        return this.f5506d;
    }

    /* renamed from: i */
    public C3349a<Unit> mo6827i() {
        return this.f5513k;
    }

    /* renamed from: j */
    public C3349a<Unit> mo6828j() {
        return this.f5512j;
    }

    /* renamed from: k */
    public float mo6829k() {
        return this.f5510h;
    }

    /* renamed from: l */
    public boolean mo6830l() {
        int b = mo6795b();
        if (b != 3) {
            if (b != 5) {
                if (b != 48) {
                    return b != 80 || ((double) Math.round(this.f5518p.mo5272a())) >= m8120o();
                }
                if (((double) Math.round(this.f5518p.mo5272a())) <= m8120o()) {
                    return true;
                }
            } else if (((double) Math.round(this.f5519q.mo5272a())) >= m8119n()) {
                return true;
            }
        } else if (((double) Math.round(this.f5519q.mo5272a())) <= m8119n()) {
            return true;
        }
    }
}
