package com.p131fb.fluid.services.p145e.p146g;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.p131fb.fluid.p135l.p139p.C1767c;
import com.p131fb.fluid.p135l.p139p.C1777m;
import java.lang.ref.WeakReference;
import java.util.List;
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
/* renamed from: com.fb.fluid.services.e.g.h */
public final class C1983h extends C1960a {

    /* renamed from: A */
    private final C1157f f5527A;

    /* renamed from: c */
    private int f5528c;

    /* renamed from: d */
    private int f5529d;

    /* renamed from: e */
    private int f5530e;

    /* renamed from: f */
    private final Point f5531f = new Point(0, 0);

    /* renamed from: g */
    private final PointF f5532g = new PointF(0.0f, 0.0f);

    /* renamed from: h */
    private int f5533h = -16777216;

    /* renamed from: i */
    private float f5534i = 1.0f;

    /* renamed from: j */
    private boolean f5535j;

    /* renamed from: k */
    private boolean f5536k;

    /* renamed from: l */
    private boolean f5537l;

    /* renamed from: m */
    private C3349a<Unit> f5538m = C1987d.f5555g;

    /* renamed from: n */
    private C3349a<Unit> f5539n = C1986c.f5554g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public WeakReference<Drawable> f5540o;

    /* renamed from: p */
    private final Paint f5541p = new Paint();

    /* renamed from: q */
    private final Paint f5542q = new Paint();

    /* renamed from: r */
    private final float f5543r = 0.25f;

    /* renamed from: s */
    private final float f5544s = 0.1f;

    /* renamed from: t */
    private final C1163j f5545t = C1163j.m5729c();

    /* renamed from: u */
    private final C1157f f5546u;

    /* renamed from: v */
    private final C1157f f5547v;

    /* renamed from: w */
    private final C1157f f5548w;

    /* renamed from: x */
    private final C1157f f5549x;

    /* renamed from: y */
    private final C1157f f5550y;

    /* renamed from: z */
    private final C1157f f5551z;

    /* renamed from: com.fb.fluid.services.e.g.h$a */
    public static final class C1984a extends C1156e {

        /* renamed from: a */
        final /* synthetic */ C1983h f5552a;

        C1984a(C1983h hVar) {
            this.f5552a = hVar;
        }

        /* renamed from: d */
        public void mo5271d(C1157f fVar) {
            super.mo5271d(fVar);
            if (fVar != null && fVar.mo5272a() == 0.0d) {
                WeakReference b = this.f5552a.f5540o;
                if (b != null) {
                    b.clear();
                }
                this.f5552a.f5540o = null;
            }
        }
    }

    /* renamed from: com.fb.fluid.services.e.g.h$b */
    public static final class C1985b extends C1969d {

        /* renamed from: c */
        final /* synthetic */ C1983h f5553c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1985b(C1983h hVar) {
            super(0, 1, (C3366g) null);
            this.f5553c = hVar;
        }

        /* renamed from: e */
        public void mo6815e(C1157f fVar) {
            if (this.f5553c.mo6795b() != 0) {
                if (!this.f5553c.mo6805e() || !this.f5553c.mo6837n()) {
                    this.f5553c.mo6834k().invoke();
                } else {
                    this.f5553c.m8151o();
                }
            }
        }
    }

    /* renamed from: com.fb.fluid.services.e.g.h$c */
    static final class C1986c extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        public static final C1986c f5554g = new C1986c();

        C1986c() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: com.fb.fluid.services.e.g.h$d */
    static final class C1987d extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        public static final C1987d f5555g = new C1987d();

        C1987d() {
            super(0);
        }

        public final void invoke() {
        }
    }

    public C1983h() {
        C1157f a = this.f5545t.mo5260a();
        C3370k.m12223a((Object) a, "springSystem.createSpring()");
        this.f5546u = a;
        C1157f a2 = this.f5545t.mo5260a();
        C3370k.m12223a((Object) a2, "springSystem.createSpring()");
        this.f5547v = a2;
        C1157f a3 = this.f5545t.mo5260a();
        C3370k.m12223a((Object) a3, "springSystem.createSpring()");
        this.f5548w = a3;
        C1157f a4 = this.f5545t.mo5260a();
        C3370k.m12223a((Object) a4, "springSystem.createSpring()");
        this.f5549x = a4;
        C1157f a5 = this.f5545t.mo5260a();
        C3370k.m12223a((Object) a5, "springSystem.createSpring()");
        this.f5550y = a5;
        C1157f a6 = this.f5545t.mo5260a();
        C3370k.m12223a((Object) a6, "springSystem.createSpring()");
        this.f5551z = a6;
        C1157f a7 = this.f5545t.mo5260a();
        C3370k.m12223a((Object) a7, "springSystem.createSpring()");
        this.f5527A = a7;
        C1985b bVar = new C1985b(this);
        for (C1157f fVar : C3284j.m12070b((T[]) new C1157f[]{this.f5549x, this.f5548w, this.f5547v, this.f5546u})) {
            fVar.mo5275a((C1161h) bVar);
            fVar.mo5277b(0.0d);
            fVar.mo5274a(C1160g.m5720a(5.0d, 5.0d));
        }
        C1157f fVar2 = this.f5527A;
        fVar2.mo5277b(0.0d);
        fVar2.mo5274a(C1160g.m5720a(0.0d, 20.0d));
        fVar2.mo5275a((C1161h) new C1984a(this));
        C1157f fVar3 = this.f5550y;
        fVar3.mo5275a((C1161h) bVar);
        fVar3.mo5277b(0.0d);
        fVar3.mo5274a(C1160g.m5720a(0.0d, 5.0d));
        C1157f fVar4 = this.f5551z;
        fVar4.mo5275a((C1161h) bVar);
        fVar4.mo5277b(0.0d);
        fVar4.mo5274a(C1160g.m5720a(0.0d, 5.0d));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m8151o() {
        this.f5546u.mo5283e();
        this.f5547v.mo5283e();
        this.f5548w.mo5283e();
        this.f5549x.mo5283e();
        mo6831b(false);
        WeakReference<Drawable> weakReference = this.f5540o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f5540o = null;
        mo6833j().invoke();
    }

    /* renamed from: p */
    private final double m8152p() {
        int b = mo6795b();
        if (b == 3) {
            return 0.0d;
        }
        if (b == 5) {
            return (double) getWidth();
        }
        if (b == 48 || b == 80) {
            return this.f5549x.mo5272a();
        }
        return 0.0d;
    }

    /* renamed from: q */
    private final double m8153q() {
        int b = mo6795b();
        if (b == 3 || b == 5) {
            return this.f5548w.mo5272a();
        }
        if (b == 48 || b != 80) {
            return 0.0d;
        }
        return (double) getHeight();
    }

    /* renamed from: r */
    private final int m8154r() {
        return (int) C1777m.m7481a(mo6835l(), 0.5f, 1.2f, C1165a.m5733a(48.0f), C1165a.m5733a(102.0f));
    }

    /* renamed from: s */
    private final int m8155s() {
        return (int) (((double) C1777m.m7481a(mo6835l(), 0.5f, 1.2f, C1165a.m5733a(40.0f), C1165a.m5733a(50.0f))) * this.f5527A.mo5272a());
    }

    /* renamed from: t */
    private final int m8156t() {
        return (int) C1777m.m7481a(mo6835l(), 0.5f, 1.2f, C1165a.m5733a(156.0f), C1165a.m5733a(192.0f));
    }

    /* renamed from: a */
    public Point mo6788a() {
        return this.f5531f;
    }

    /* renamed from: a */
    public void mo6789a(float f) {
        this.f5534i = f;
    }

    /* renamed from: a */
    public void mo6790a(int i) {
        this.f5530e = i;
    }

    /* renamed from: a */
    public void mo6791a(Canvas canvas) {
        int i;
        int i2;
        int i3;
        Drawable drawable;
        Canvas canvas2;
        C1983h hVar;
        int i4;
        Drawable drawable2;
        float f;
        boolean z;
        boolean z2;
        int i5;
        int i6;
        int i7;
        boolean z3;
        Canvas canvas3;
        int i8;
        boolean z4;
        Canvas canvas4;
        Canvas canvas5 = canvas;
        C3370k.m12227b(canvas5, "canvas");
        canvas.saveLayerAlpha(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (mo6832i() >> 24) & 255);
        int a = (int) this.f5549x.mo5272a();
        int a2 = (int) this.f5548w.mo5272a();
        int b = mo6795b();
        if (b == 3) {
            Canvas canvas6 = canvas5;
            int a3 = (int) this.f5547v.mo5272a();
            float a4 = ((float) (((int) this.f5546u.mo5272a()) - a2)) * this.f5544s;
            float t = ((float) m8156t()) / 2.0f;
            float a5 = C1165a.m5733a(-1.0f);
            float s = ((float) m8155s()) / 2.0f;
            float a6 = ((float) ((int) ((!mo6805e() || !this.f5536k) ? this.f5547v : this.f5550y).mo5272a())) - ((float) m8155s());
            float f2 = (float) a2;
            f = a4 + f2;
            float f3 = (float) a3;
            float s2 = f3 - ((float) m8155s());
            float f4 = 0.8f * s;
            float f5 = 0.12f * t;
            float f6 = 1.0f * s2;
            float f7 = a6;
            List b2 = C3284j.m12070b((T[]) new PointF[]{new PointF(a5, f2 - t), new PointF(C1777m.m7480a(f6, 0.0f, f5) + a5, f), new PointF(s2, f - f4), new PointF(s2, f), new PointF(s2, f4 + f), new PointF(C1777m.m7480a(f6, 0.0f, f5) + a5, f), new PointF(a5, f2 + t)});
            float f8 = -(C1165a.m5733a(4.0f) * mo6835l());
            float a7 = C1777m.m7481a(C1777m.m7480a(f3, 0.0f, (float) m8154r()), 0.0f, (float) m8154r(), t, -(((float) m8156t()) * 0.25f));
            float f9 = a5 + s2 + (0.55f * s);
            float f10 = 0.85f * s;
            List b3 = C3284j.m12070b((T[]) new PointF[]{new PointF(f9, f + f10), new PointF(f8, f + a7), new PointF(f8, ((float) (m8156t() + a2)) + 0.0f), new PointF(f8, f2), new PointF(f8, ((float) (a2 - m8156t())) + 0.0f), new PointF(f8, f - a7), new PointF(f9, f - f10)});
            if (mo6805e() && this.f5536k) {
                b3 = b2;
            }
            if (mo6836m()) {
                z = false;
                mo6783a(canvas6, this.f5542q, b3, false);
                canvas6.drawCircle(f7 + s, f, s, this.f5542q);
            } else {
                z = false;
            }
            mo6783a(canvas6, this.f5541p, b3, z);
            Unit unit = Unit.INSTANCE;
            float f11 = f7 + s;
            canvas6.drawCircle(f11, f, s, this.f5541p);
            WeakReference<Drawable> weakReference = this.f5540o;
            drawable2 = weakReference != null ? (Drawable) weakReference.get() : null;
            i4 = (int) f11;
        } else if (b != 5) {
            if (b == 48) {
                Canvas canvas7 = canvas5;
                int a8 = (int) this.f5547v.mo5272a();
                int a9 = (int) this.f5546u.mo5272a();
                float f12 = ((float) (a8 - a)) * this.f5544s;
                float t2 = ((float) m8156t()) / 2.0f;
                float a10 = C1165a.m5733a(-2.0f);
                float s3 = ((float) m8155s()) / 2.0f;
                float f13 = (float) a;
                float f14 = f13 + f12;
                C1157f fVar = (!mo6805e() || !this.f5536k) ? this.f5546u : this.f5551z;
                float f15 = (float) a9;
                float s4 = f15 - ((float) m8155s());
                float f16 = 0.8f * s3;
                float f17 = 0.12f * t2;
                int a11 = (int) fVar.mo5272a();
                float f18 = f13 + 0.0f;
                List b4 = C3284j.m12070b((T[]) new PointF[]{new PointF(f13 - t2, a10), new PointF(f18, C1777m.m7480a(s4, 0.0f, f17) + a10), new PointF((f13 - f16) + f12, s4), new PointF(f18 + f12, s4), new PointF(f16 + f13 + f12, s4), new PointF(f18, C1777m.m7480a(s4, 0.0f, f17) + a10), new PointF(f13 + t2, a10)});
                float f19 = -(C1165a.m5733a(4.0f) * mo6835l());
                float a12 = C1777m.m7481a(C1777m.m7480a(f15, 0.0f, (float) m8154r()), 0.0f, (float) m8154r(), t2, -(((float) m8156t()) * 0.25f));
                float f20 = 0.85f * s3;
                float f21 = a10 + s4 + (0.55f * s3);
                List b5 = C3284j.m12070b((T[]) new PointF[]{new PointF(f14 + f20, f21), new PointF(f13 + a12, f19), new PointF(((float) (m8156t() + a)) + 0.0f, f19), new PointF(f18, f19), new PointF(((float) (a - m8156t())) + 0.0f, f19), new PointF(f13 - a12, f19), new PointF(f14 - f20, f21)});
                if (mo6805e() && this.f5536k) {
                    b5 = b4;
                }
                if (mo6836m()) {
                    canvas3 = canvas;
                    z3 = false;
                    mo6783a(canvas3, this.f5542q, b5, false);
                    i7 = a11;
                    canvas3.drawCircle(f14, ((float) i7) - s3, s3, this.f5542q);
                } else {
                    canvas3 = canvas;
                    i7 = a11;
                    z3 = false;
                }
                mo6783a(canvas3, this.f5541p, b5, z3);
                Unit unit2 = Unit.INSTANCE;
                float f22 = ((float) i7) - s3;
                canvas3.drawCircle(f14, f22, s3, this.f5541p);
                WeakReference<Drawable> weakReference2 = this.f5540o;
                Drawable drawable3 = weakReference2 != null ? (Drawable) weakReference2.get() : null;
                i6 = (int) f22;
                i5 = (int) (((float) m8155s()) * 0.5f);
                hVar = this;
                canvas2 = canvas;
                drawable = drawable3;
                i3 = (int) f14;
            } else if (b == 80) {
                int height = getHeight() - ((int) this.f5546u.mo5272a());
                float a13 = ((float) (((int) this.f5547v.mo5272a()) - a)) * this.f5544s;
                float t3 = ((float) m8156t()) / 2.0f;
                float a14 = C1165a.m5733a(1.0f);
                float s5 = ((float) m8155s()) / 2.0f;
                float f23 = (float) a;
                float f24 = f23 + a13;
                double a15 = (!mo6805e() || !this.f5536k) ? this.f5546u.mo5272a() : this.f5551z.mo5272a();
                float f25 = (float) height;
                float s6 = f25 - ((float) m8155s());
                float f26 = 0.8f * s5;
                float f27 = t3 * 0.12f;
                int i9 = (int) a15;
                float f28 = f23 + 0.0f;
                List b6 = C3284j.m12070b((T[]) new PointF[]{new PointF(f23 - t3, ((float) getHeight()) + a14), new PointF(f28, (((float) getHeight()) - C1777m.m7480a(s6, 0.0f, f27)) + a14), new PointF((f23 - f26) + a13, ((float) getHeight()) - s6), new PointF(f28 + a13, ((float) getHeight()) - s6), new PointF(f26 + f23 + a13, ((float) getHeight()) - s6), new PointF(f28, (((float) getHeight()) - C1777m.m7480a(s6, 0.0f, f27)) + a14), new PointF(f23 + t3, ((float) getHeight()) + a14)});
                float f29 = -(C1165a.m5733a(4.0f) * mo6835l());
                float a16 = C1777m.m7481a(C1777m.m7480a(f25, 0.0f, (float) m8154r()), 0.0f, (float) m8154r(), t3, -(((float) m8156t()) * 0.25f));
                float f30 = 0.85f * s5;
                float f31 = s5 - (0.55f * s5);
                List b7 = C3284j.m12070b((T[]) new PointF[]{new PointF(f24 + f30, (((float) getHeight()) - s6) - f31), new PointF(f23 + a16, ((float) getHeight()) - f29), new PointF(((float) (m8156t() + a)) + 0.0f, ((float) getHeight()) - f29), new PointF(f28, ((float) getHeight()) - f29), new PointF(((float) (a - m8156t())) + 0.0f, ((float) getHeight()) - f29), new PointF(f23 - a16, ((float) getHeight()) - f29), new PointF(f24 - f30, (((float) getHeight()) - s6) - f31)});
                if (mo6805e() && this.f5536k) {
                    b7 = b6;
                }
                if (mo6836m()) {
                    canvas4 = canvas;
                    z4 = false;
                    mo6783a(canvas4, this.f5542q, b7, false);
                    i8 = i9;
                    canvas4.drawCircle(f24, ((float) i8) + s5, s5, this.f5542q);
                } else {
                    canvas4 = canvas;
                    i8 = i9;
                    z4 = false;
                }
                mo6783a(canvas4, this.f5541p, b7, z4);
                Unit unit3 = Unit.INSTANCE;
                float f32 = ((float) i8) + s5;
                canvas4.drawCircle(f24, f32, s5, this.f5541p);
                WeakReference<Drawable> weakReference3 = this.f5540o;
                Drawable drawable4 = weakReference3 != null ? (Drawable) weakReference3.get() : null;
                i3 = (int) f24;
                i6 = (int) f32;
                i5 = (int) (((float) m8155s()) * 0.5f);
                hVar = this;
                canvas2 = canvas;
                drawable = drawable4;
            } else {
                return;
            }
            i2 = i6;
            i = i5;
            hVar.mo6784a(canvas2, drawable, i3, i2, i, 1.0f);
        } else {
            Canvas canvas8 = canvas5;
            int width = getWidth() - ((int) this.f5547v.mo5272a());
            float a17 = ((float) (((int) this.f5546u.mo5272a()) - a2)) * this.f5544s;
            float t4 = ((float) m8156t()) / 2.0f;
            float a18 = C1165a.m5733a(1.0f);
            float s7 = ((float) m8155s()) / 2.0f;
            int a19 = (int) ((!mo6805e() || !this.f5536k) ? this.f5547v : this.f5550y).mo5272a();
            float f33 = (float) a2;
            f = a17 + f33;
            float f34 = (float) width;
            float s8 = (f34 + 0.0f) - ((float) m8155s());
            float f35 = 0.8f * s7;
            List b8 = C3284j.m12070b((T[]) new PointF[]{new PointF(((float) getWidth()) + a18, f33 - t4), new PointF(((float) getWidth()) + a18, f), new PointF(((float) getWidth()) - s8, f - f35), new PointF(((float) getWidth()) - s8, f), new PointF(((float) getWidth()) - s8, f35 + f), new PointF(((float) getWidth()) + a18, f), new PointF(((float) getWidth()) + a18, t4 + f33)});
            float f36 = -(C1165a.m5733a(4.0f) * mo6835l());
            float a20 = C1777m.m7481a(C1777m.m7480a(f34, 0.0f, (float) m8154r()), 0.0f, (float) m8154r(), ((float) m8156t()) * 0.5f, -(((float) m8156t()) * 0.25f));
            float f37 = s7 - (0.55f * s7);
            float f38 = 0.85f * s7;
            List list = b8;
            List b9 = C3284j.m12070b((T[]) new PointF[]{new PointF((((float) getWidth()) - s8) - f37, f + f38), new PointF(((float) getWidth()) - f36, f + a20), new PointF(((float) getWidth()) - f36, ((float) (m8156t() + a2)) + 0.0f), new PointF(((float) getWidth()) - f36, f33), new PointF(((float) getWidth()) - f36, ((float) (a2 - m8156t())) + 0.0f), new PointF(((float) getWidth()) - f36, f - a20), new PointF((((float) getWidth()) - s8) - f37, f - f38)});
            if (mo6805e() && this.f5536k) {
                b9 = list;
            }
            if (mo6836m()) {
                z2 = false;
                mo6783a(canvas8, this.f5542q, b9, false);
                canvas8.drawCircle(((float) a19) + s7, f, s7, this.f5542q);
            } else {
                z2 = false;
            }
            mo6783a(canvas8, this.f5541p, b9, z2);
            Unit unit4 = Unit.INSTANCE;
            float f39 = ((float) a19) + s7;
            canvas8.drawCircle(f39, f, s7, this.f5541p);
            WeakReference<Drawable> weakReference4 = this.f5540o;
            drawable2 = weakReference4 != null ? (Drawable) weakReference4.get() : null;
            i4 = (int) f39;
        }
        int i10 = (int) f;
        hVar = this;
        canvas2 = canvas;
        drawable = drawable2;
        i3 = i4;
        i2 = i10;
        i = (int) (((float) m8155s()) * 0.5f);
        hVar.mo6784a(canvas2, drawable, i3, i2, i, 1.0f);
    }

    /* renamed from: a */
    public void mo6792a(WeakReference<Drawable> weakReference) {
        if (!mo6805e()) {
            this.f5540o = weakReference;
            this.f5536k = weakReference != null;
        }
    }

    /* renamed from: a */
    public void mo6793a(C3349a<Unit> aVar) {
        C3370k.m12227b(aVar, "<set-?>");
        this.f5539n = aVar;
    }

    /* renamed from: a */
    public void mo6794a(boolean z) {
        this.f5535j = z;
    }

    /* renamed from: b */
    public int mo6795b() {
        return this.f5528c;
    }

    /* renamed from: b */
    public void mo6796b(int i) {
        this.f5533h = i;
    }

    /* renamed from: b */
    public void mo6797b(C3349a<Unit> aVar) {
        C3370k.m12227b(aVar, "<set-?>");
        this.f5538m = aVar;
    }

    /* renamed from: b */
    public void mo6831b(boolean z) {
        this.f5537l = z;
    }

    /* renamed from: c */
    public void mo6799c() {
        float f;
        float f2;
        this.f5549x.mo5279c((double) mo6786g());
        this.f5548w.mo5279c((double) mo6787h());
        PointF f3 = mo6806f();
        double d = (double) f3.y;
        double d2 = (double) f3.x;
        int b = mo6795b();
        if (b == 3) {
            float a = (float) C1777m.m7482a((int) mo6806f().x, 0, m8154r());
            f2 = a + (Math.abs(mo6806f().x - a) * this.f5543r);
        } else if (b != 5) {
            if (b != 48) {
                if (b == 80) {
                    d2 = (double) mo6806f().x;
                    float a2 = (float) C1777m.m7482a((int) mo6806f().y, getHeight() - m8154r(), getHeight());
                    f = a2 - (Math.abs(mo6806f().y - a2) * this.f5543r);
                }
                this.f5547v.mo5279c(d2);
                this.f5546u.mo5279c(d);
                this.f5550y.mo5279c(d2);
                this.f5551z.mo5279c(d);
            }
            d2 = (double) mo6806f().x;
            float a3 = (float) C1777m.m7482a((int) mo6806f().y, 0, m8154r());
            f = a3 + (Math.abs(mo6806f().y - a3) * this.f5543r);
            d = (double) f;
            this.f5547v.mo5279c(d2);
            this.f5546u.mo5279c(d);
            this.f5550y.mo5279c(d2);
            this.f5551z.mo5279c(d);
        } else {
            float a4 = (float) C1777m.m7482a((int) mo6806f().x, getWidth() - m8154r(), getWidth());
            f2 = a4 - (Math.abs(mo6806f().x - a4) * this.f5543r);
        }
        d2 = (double) f2;
        f = mo6806f().y;
        d = (double) f;
        this.f5547v.mo5279c(d2);
        this.f5546u.mo5279c(d);
        this.f5550y.mo5279c(d2);
        this.f5551z.mo5279c(d);
    }

    /* renamed from: c */
    public void mo6800c(int i) {
        this.f5528c = i;
    }

    /* renamed from: d */
    public void mo6801d() {
        this.f5536k = false;
        mo6831b(false);
        Paint paint = this.f5541p;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(C1767c.m7445a(mo6832i(), 255));
        Paint paint2 = this.f5542q;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(C1165a.m5733a(1.2f));
        paint2.setColor(C1767c.m7444a(C1767c.m7446a(mo6832i()) ? -1 : -12303292, 0.1f));
        this.f5549x.mo5283e();
        this.f5549x.mo5277b((double) mo6786g());
        this.f5548w.mo5283e();
        this.f5548w.mo5277b((double) mo6787h());
        this.f5547v.mo5283e();
        this.f5547v.mo5277b(m8152p());
        this.f5546u.mo5283e();
        this.f5546u.mo5277b(m8153q());
        this.f5527A.mo5283e();
        this.f5527A.mo5277b(1.0d);
        this.f5550y.mo5277b(m8152p());
        this.f5550y.mo5283e();
        this.f5551z.mo5277b(m8152p());
        this.f5551z.mo5283e();
    }

    /* renamed from: d */
    public void mo6802d(int i) {
        this.f5529d = i;
    }

    public void dismiss() {
        double d;
        double d2;
        C1157f fVar;
        double q;
        this.f5527A.mo5279c(this.f5536k ? 0.0d : 1.0d);
        this.f5550y.mo5277b(this.f5547v.mo5272a());
        C1157f fVar2 = this.f5550y;
        int i = -1;
        if (!this.f5536k || !(mo6795b() == 5 || mo6795b() == 3)) {
            d = m8152p();
        } else {
            double a = this.f5547v.mo5272a();
            int a2 = C1165a.m5734a(16);
            int b = mo6795b();
            d = a + ((double) (a2 * ((b == 3 || (b != 5 && (b == 48 || b != 80))) ? 1 : -1)));
        }
        fVar2.mo5279c(d);
        this.f5551z.mo5277b(this.f5546u.mo5272a());
        C1157f fVar3 = this.f5551z;
        if (!this.f5536k || !(mo6795b() == 80 || mo6795b() == 48)) {
            d2 = m8153q();
        } else {
            double a3 = this.f5546u.mo5272a();
            int a4 = C1165a.m5734a(16);
            int b2 = mo6795b();
            if (b2 == 3 || (b2 != 5 && (b2 == 48 || b2 != 80))) {
                i = 1;
            }
            d2 = a3 + ((double) (a4 * i));
        }
        fVar3.mo5279c(d2);
        int b3 = mo6795b();
        if (b3 == 48 || b3 == 80) {
            fVar = this.f5546u;
            q = m8153q();
        } else {
            fVar = this.f5547v;
            q = m8152p();
        }
        fVar.mo5279c(q);
        if (mo6837n()) {
            m8151o();
        } else {
            mo6831b(true);
        }
    }

    /* renamed from: e */
    public void mo6804e(int i) {
    }

    /* renamed from: e */
    public boolean mo6805e() {
        return this.f5537l;
    }

    /* renamed from: f */
    public PointF mo6806f() {
        return this.f5532g;
    }

    public int getHeight() {
        return this.f5530e;
    }

    public int getWidth() {
        return this.f5529d;
    }

    /* renamed from: i */
    public int mo6832i() {
        return this.f5533h;
    }

    /* renamed from: j */
    public C3349a<Unit> mo6833j() {
        return this.f5539n;
    }

    /* renamed from: k */
    public C3349a<Unit> mo6834k() {
        return this.f5538m;
    }

    /* renamed from: l */
    public float mo6835l() {
        return this.f5534i;
    }

    /* renamed from: m */
    public boolean mo6836m() {
        return this.f5535j;
    }

    /* renamed from: n */
    public boolean mo6837n() {
        int b = mo6795b();
        if (b != 3) {
            if (b != 5) {
                if (b != 48) {
                    return b != 80 || ((double) Math.round(this.f5546u.mo5272a())) >= m8153q();
                }
                if (((double) Math.round(this.f5546u.mo5272a())) <= m8153q()) {
                    return true;
                }
            } else if (((double) Math.round(this.f5547v.mo5272a())) >= m8152p()) {
                return true;
            }
        } else if (((double) Math.round(this.f5547v.mo5272a())) <= m8152p()) {
            return true;
        }
    }
}
