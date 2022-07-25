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
/* renamed from: com.fb.fluid.services.e.g.f */
public final class C1973f extends C1960a {

    /* renamed from: c */
    private int f5479c;

    /* renamed from: d */
    private int f5480d;

    /* renamed from: e */
    private int f5481e;

    /* renamed from: f */
    private final Point f5482f = new Point(0, 0);

    /* renamed from: g */
    private final PointF f5483g = new PointF(0.0f, 0.0f);

    /* renamed from: h */
    private int f5484h = -16777216;

    /* renamed from: i */
    private float f5485i = 1.0f;

    /* renamed from: j */
    private boolean f5486j;

    /* renamed from: k */
    private boolean f5487k;

    /* renamed from: l */
    private C3349a<Unit> f5488l = C1977d.f5504g;

    /* renamed from: m */
    private C3349a<Unit> f5489m = C1976c.f5503g;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public WeakReference<Drawable> f5490n;

    /* renamed from: o */
    private final Paint f5491o = new Paint();

    /* renamed from: p */
    private final Paint f5492p = new Paint();

    /* renamed from: q */
    private final float f5493q = 0.2f;

    /* renamed from: r */
    private final float f5494r = 0.4f;

    /* renamed from: s */
    private final C1163j f5495s = C1163j.m5729c();

    /* renamed from: t */
    private final C1157f f5496t;

    /* renamed from: u */
    private final C1157f f5497u;

    /* renamed from: v */
    private final C1157f f5498v;

    /* renamed from: w */
    private final C1157f f5499w;

    /* renamed from: x */
    private final C1157f f5500x;

    /* renamed from: com.fb.fluid.services.e.g.f$a */
    public static final class C1974a extends C1156e {

        /* renamed from: a */
        final /* synthetic */ C1973f f5501a;

        C1974a(C1973f fVar) {
            this.f5501a = fVar;
        }

        /* renamed from: d */
        public void mo5271d(C1157f fVar) {
            super.mo5271d(fVar);
            if (fVar != null && fVar.mo5272a() == 0.0d) {
                WeakReference b = this.f5501a.f5490n;
                if (b != null) {
                    b.clear();
                }
                this.f5501a.f5490n = null;
            }
        }
    }

    /* renamed from: com.fb.fluid.services.e.g.f$b */
    public static final class C1975b extends C1969d {

        /* renamed from: c */
        final /* synthetic */ C1973f f5502c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1975b(C1973f fVar) {
            super(0, 1, (C3366g) null);
            this.f5502c = fVar;
        }

        /* renamed from: e */
        public void mo6815e(C1157f fVar) {
            if (this.f5502c.mo6795b() != 0) {
                if (!this.f5502c.mo6805e() || !this.f5502c.mo6825n()) {
                    this.f5502c.mo6822k().invoke();
                } else {
                    this.f5502c.m8083o();
                }
            }
        }
    }

    /* renamed from: com.fb.fluid.services.e.g.f$c */
    static final class C1976c extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        public static final C1976c f5503g = new C1976c();

        C1976c() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: com.fb.fluid.services.e.g.f$d */
    static final class C1977d extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        public static final C1977d f5504g = new C1977d();

        C1977d() {
            super(0);
        }

        public final void invoke() {
        }
    }

    public C1973f() {
        C1157f a = this.f5495s.mo5260a();
        C3370k.m12223a((Object) a, "springSystem.createSpring()");
        this.f5496t = a;
        C1157f a2 = this.f5495s.mo5260a();
        C3370k.m12223a((Object) a2, "springSystem.createSpring()");
        this.f5497u = a2;
        C1157f a3 = this.f5495s.mo5260a();
        C3370k.m12223a((Object) a3, "springSystem.createSpring()");
        this.f5498v = a3;
        C1157f a4 = this.f5495s.mo5260a();
        C3370k.m12223a((Object) a4, "springSystem.createSpring()");
        this.f5499w = a4;
        C1157f a5 = this.f5495s.mo5260a();
        C3370k.m12223a((Object) a5, "springSystem.createSpring()");
        this.f5500x = a5;
        C1975b bVar = new C1975b(this);
        for (C1157f fVar : C3284j.m12070b((T[]) new C1157f[]{this.f5499w, this.f5498v, this.f5497u, this.f5496t})) {
            fVar.mo5275a((C1161h) bVar);
            fVar.mo5277b(0.0d);
            fVar.mo5274a(C1160g.m5720a(7.0d, 10.0d));
        }
        C1157f fVar2 = this.f5500x;
        fVar2.mo5277b(0.0d);
        fVar2.mo5274a(C1160g.m5720a(0.0d, 20.0d));
        fVar2.mo5275a((C1161h) new C1974a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m8083o() {
        this.f5496t.mo5283e();
        this.f5497u.mo5283e();
        this.f5498v.mo5283e();
        this.f5499w.mo5283e();
        mo6819b(false);
        WeakReference<Drawable> weakReference = this.f5490n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f5490n = null;
        mo6821j().invoke();
    }

    /* renamed from: p */
    private final double m8084p() {
        int b = mo6795b();
        if (b == 3) {
            return 0.0d;
        }
        if (b == 5) {
            return (double) getWidth();
        }
        if (b == 48 || b == 80) {
            return this.f5499w.mo5272a();
        }
        return 0.0d;
    }

    /* renamed from: q */
    private final double m8085q() {
        int b = mo6795b();
        if (b == 3 || b == 5) {
            return this.f5498v.mo5272a();
        }
        if (b == 48 || b != 80) {
            return 0.0d;
        }
        return (double) getHeight();
    }

    /* renamed from: r */
    private final int m8086r() {
        return (int) C1777m.m7481a(mo6823l(), 0.5f, 1.2f, C1165a.m5733a(48.0f), C1165a.m5733a(72.0f));
    }

    /* renamed from: s */
    private final int m8087s() {
        return (int) C1777m.m7481a(mo6823l(), 0.5f, 1.2f, C1165a.m5733a(32.0f), C1165a.m5733a(48.0f));
    }

    /* renamed from: t */
    private final int m8088t() {
        return (int) C1777m.m7481a(mo6823l(), 0.5f, 1.2f, C1165a.m5733a(100.0f), C1165a.m5733a(148.0f));
    }

    /* renamed from: a */
    public Point mo6788a() {
        return this.f5482f;
    }

    /* renamed from: a */
    public void mo6789a(float f) {
        this.f5485i = f;
    }

    /* renamed from: a */
    public void mo6790a(int i) {
        this.f5481e = i;
    }

    /* renamed from: a */
    public void mo6791a(Canvas canvas) {
        float f;
        int i;
        int i2;
        int i3;
        Drawable drawable;
        C3370k.m12227b(canvas, "canvas");
        int a = (int) this.f5499w.mo5272a();
        int a2 = (int) this.f5498v.mo5272a();
        int b = mo6795b();
        if (b == 3) {
            int a3 = (int) this.f5497u.mo5272a();
            float a4 = ((float) (((int) this.f5496t.mo5272a()) - a2)) * this.f5494r;
            float a5 = C1165a.m5733a(-1.0f);
            float t = ((float) m8088t()) / 2.0f;
            float f2 = (float) a3;
            float f3 = (float) a2;
            float f4 = f3 + a4;
            List b2 = C3284j.m12070b((T[]) new PointF[]{new PointF(a5, ((float) (a2 - m8088t())) + 0.0f), new PointF(a5, ((float) (a2 - m8088t())) + t), new PointF(f2, f4 - t), new PointF(f2, f4), new PointF(f2, f4 + t), new PointF(a5, ((float) (m8088t() + a2)) - t), new PointF(a5, ((float) (a2 + m8088t())) + 0.0f)});
            C1960a.m7998a(this, canvas, this.f5491o, b2, false, 8, (Object) null);
            if (mo6824m()) {
                C1960a.m7998a(this, canvas, this.f5492p, b2, false, 8, (Object) null);
            }
            f = (float) C1777m.m7479a(this.f5500x.mo5272a(), 0.0d, 1.0d);
            i = Math.min(a3 / 2, m8087s() / 2);
            float f5 = f2 / 2.0f;
            float f6 = f3 + (a4 * 0.7f);
            WeakReference<Drawable> weakReference = this.f5490n;
            drawable = weakReference != null ? (Drawable) weakReference.get() : null;
            i3 = (int) f5;
            i2 = (int) f6;
        } else if (b == 5) {
            float width = ((float) getWidth()) - ((float) this.f5497u.mo5272a());
            float a6 = ((float) (((int) this.f5496t.mo5272a()) - a2)) * this.f5494r;
            float a7 = C1165a.m5733a(1.0f);
            float t2 = ((float) m8088t()) / 2.0f;
            float f7 = (float) a2;
            float f8 = f7 + a6;
            List b3 = C3284j.m12070b((T[]) new PointF[]{new PointF(((float) getWidth()) + a7, ((float) (a2 - m8088t())) + 0.0f), new PointF(((float) getWidth()) + a7, ((float) (a2 - m8088t())) + t2), new PointF(((float) getWidth()) - width, f8 - t2), new PointF(((float) getWidth()) - width, f8 + 0.0f), new PointF(((float) getWidth()) - width, f8 + t2), new PointF(((float) getWidth()) + a7, ((float) (m8088t() + a2)) - t2), new PointF(((float) getWidth()) + a7, ((float) (a2 + m8088t())) + 0.0f)});
            C1960a.m7998a(this, canvas, this.f5491o, b3, false, 8, (Object) null);
            if (mo6824m()) {
                C1960a.m7998a(this, canvas, this.f5492p, b3, false, 8, (Object) null);
            }
            f = (float) C1777m.m7479a(this.f5500x.mo5272a(), 0.0d, 1.0d);
            float f9 = width / ((float) 2);
            i = Math.min((int) f9, m8087s() / 2);
            float width2 = ((float) getWidth()) - f9;
            float f10 = f7 + (a6 * 0.7f);
            WeakReference<Drawable> weakReference2 = this.f5490n;
            drawable = weakReference2 != null ? (Drawable) weakReference2.get() : null;
            i3 = (int) width2;
            i2 = (int) f10;
        } else if (b == 48) {
            int a8 = (int) this.f5496t.mo5272a();
            float a9 = ((float) (((int) this.f5497u.mo5272a()) - a)) * this.f5494r;
            float a10 = C1165a.m5733a(-1.0f);
            float t3 = ((float) m8088t()) / 2.0f;
            float f11 = (float) a;
            float f12 = f11 - a9;
            float f13 = (float) a8;
            float f14 = f13 + 0.0f;
            List b4 = C3284j.m12070b((T[]) new PointF[]{new PointF(((float) (a - m8088t())) + 0.0f, a10), new PointF(((float) (a - m8088t())) + 0.0f + t3, a10), new PointF(f12 - t3, f14), new PointF(f12, f14), new PointF(f12 + t3, f14), new PointF((((float) (m8088t() + a)) + 0.0f) - t3, a10), new PointF(((float) (a + m8088t())) + 0.0f, a10)});
            int i4 = a8;
            C1960a.m7998a(this, canvas, this.f5491o, b4, false, 8, (Object) null);
            if (mo6824m()) {
                C1960a.m7998a(this, canvas, this.f5492p, b4, false, 8, (Object) null);
            }
            f = (float) C1777m.m7479a(this.f5500x.mo5272a(), 0.0d, 1.0d);
            i = Math.min(i4 / 2, m8087s() / 2);
            float f15 = f11 + (a9 * 0.7f);
            float f16 = f13 / 2.0f;
            WeakReference<Drawable> weakReference3 = this.f5490n;
            drawable = weakReference3 != null ? (Drawable) weakReference3.get() : null;
            i3 = (int) f15;
            i2 = (int) f16;
        } else if (b == 80) {
            float height = ((float) getHeight()) - ((float) this.f5496t.mo5272a());
            float a11 = ((float) (((int) this.f5497u.mo5272a()) - a)) * this.f5494r;
            float a12 = C1165a.m5733a(1.0f);
            float t4 = ((float) m8088t()) / 2.0f;
            float f17 = (float) a;
            float f18 = f17 + a11;
            List b5 = C3284j.m12070b((T[]) new PointF[]{new PointF(((float) (a - m8088t())) + 0.0f, ((float) getHeight()) + a12), new PointF(((float) (a - m8088t())) + 0.0f + t4, ((float) getHeight()) + a12), new PointF(f18 - t4, ((float) getHeight()) - height), new PointF(f18, ((float) getHeight()) - height), new PointF(f18 + t4, ((float) getHeight()) - height), new PointF((((float) (m8088t() + a)) + 0.0f) - t4, ((float) getHeight()) + a12), new PointF(((float) (a + m8088t())) + 0.0f, ((float) getHeight()) + a12)});
            C1960a.m7998a(this, canvas, this.f5491o, b5, false, 8, (Object) null);
            if (mo6824m()) {
                C1960a.m7998a(this, canvas, this.f5492p, b5, false, 8, (Object) null);
            }
            f = (float) C1777m.m7479a(this.f5500x.mo5272a(), 0.0d, 1.0d);
            float f19 = height / ((float) 2);
            i = Math.min((int) f19, m8087s() / 2);
            float f20 = f17 + (a11 * 0.7f);
            float height2 = ((float) getHeight()) - f19;
            WeakReference<Drawable> weakReference4 = this.f5490n;
            drawable = weakReference4 != null ? (Drawable) weakReference4.get() : null;
            i3 = (int) f20;
            i2 = (int) height2;
        } else {
            return;
        }
        mo6784a(canvas, drawable, i3, i2, i, f);
    }

    /* renamed from: a */
    public void mo6792a(WeakReference<Drawable> weakReference) {
        C1157f fVar;
        double d;
        if (!mo6805e()) {
            if (weakReference == null) {
                fVar = this.f5500x;
                d = 0.0d;
            } else {
                this.f5490n = weakReference;
                fVar = this.f5500x;
                d = 1.0d;
            }
            fVar.mo5279c(d);
        }
    }

    /* renamed from: a */
    public void mo6793a(C3349a<Unit> aVar) {
        C3370k.m12227b(aVar, "<set-?>");
        this.f5489m = aVar;
    }

    /* renamed from: a */
    public void mo6794a(boolean z) {
        this.f5486j = z;
    }

    /* renamed from: b */
    public int mo6795b() {
        return this.f5479c;
    }

    /* renamed from: b */
    public void mo6796b(int i) {
        this.f5484h = i;
    }

    /* renamed from: b */
    public void mo6797b(C3349a<Unit> aVar) {
        C3370k.m12227b(aVar, "<set-?>");
        this.f5488l = aVar;
    }

    /* renamed from: b */
    public void mo6819b(boolean z) {
        this.f5487k = z;
    }

    /* renamed from: c */
    public void mo6799c() {
        float f;
        float f2;
        this.f5499w.mo5279c((double) mo6786g());
        this.f5498v.mo5279c((double) mo6787h());
        PointF f3 = mo6806f();
        double d = (double) f3.y;
        double d2 = (double) f3.x;
        int b = mo6795b();
        if (b == 3) {
            float a = (float) C1777m.m7482a((int) mo6806f().x, 0, m8086r());
            f2 = a + (Math.abs(mo6806f().x - a) * this.f5493q);
        } else if (b != 5) {
            if (b != 48) {
                if (b == 80) {
                    d2 = (double) mo6806f().x;
                    float a2 = (float) C1777m.m7482a((int) mo6806f().y, getHeight() - m8086r(), getHeight());
                    f = a2 - (Math.abs(mo6806f().y - a2) * this.f5493q);
                }
                this.f5497u.mo5279c(d2);
                this.f5496t.mo5279c(d);
            }
            d2 = (double) mo6806f().x;
            float a3 = (float) C1777m.m7482a((int) mo6806f().y, 0, m8086r());
            f = a3 + (Math.abs(mo6806f().y - a3) * this.f5493q);
            d = (double) f;
            this.f5497u.mo5279c(d2);
            this.f5496t.mo5279c(d);
        } else {
            float a4 = (float) C1777m.m7482a((int) mo6806f().x, getWidth() - m8086r(), getWidth());
            f2 = a4 - (Math.abs(mo6806f().x - a4) * this.f5493q);
        }
        d2 = (double) f2;
        f = mo6806f().y;
        d = (double) f;
        this.f5497u.mo5279c(d2);
        this.f5496t.mo5279c(d);
    }

    /* renamed from: c */
    public void mo6800c(int i) {
        this.f5479c = i;
    }

    /* renamed from: d */
    public void mo6801d() {
        mo6819b(false);
        Paint paint = this.f5491o;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(mo6820i());
        Paint paint2 = this.f5492p;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(C1165a.m5733a(0.7f));
        paint2.setColor(C1767c.m7444a(C1767c.m7446a(mo6820i()) ? -1 : -12303292, 0.1f));
        this.f5499w.mo5283e();
        this.f5499w.mo5277b((double) mo6786g());
        this.f5498v.mo5283e();
        this.f5498v.mo5277b((double) mo6787h());
        this.f5497u.mo5283e();
        this.f5497u.mo5277b(m8084p());
        this.f5496t.mo5283e();
        this.f5496t.mo5277b(m8085q());
    }

    /* renamed from: d */
    public void mo6802d(int i) {
        this.f5480d = i;
    }

    public void dismiss() {
        this.f5497u.mo5279c(m8084p());
        this.f5496t.mo5279c(m8085q());
        this.f5500x.mo5279c(0.0d);
        if (mo6825n()) {
            m8083o();
        } else {
            mo6819b(true);
        }
    }

    /* renamed from: e */
    public void mo6804e(int i) {
    }

    /* renamed from: e */
    public boolean mo6805e() {
        return this.f5487k;
    }

    /* renamed from: f */
    public PointF mo6806f() {
        return this.f5483g;
    }

    public int getHeight() {
        return this.f5481e;
    }

    public int getWidth() {
        return this.f5480d;
    }

    /* renamed from: i */
    public int mo6820i() {
        return this.f5484h;
    }

    /* renamed from: j */
    public C3349a<Unit> mo6821j() {
        return this.f5489m;
    }

    /* renamed from: k */
    public C3349a<Unit> mo6822k() {
        return this.f5488l;
    }

    /* renamed from: l */
    public float mo6823l() {
        return this.f5485i;
    }

    /* renamed from: m */
    public boolean mo6824m() {
        return this.f5486j;
    }

    /* renamed from: n */
    public boolean mo6825n() {
        int b = mo6795b();
        if (b != 3) {
            if (b != 5) {
                if (b != 48) {
                    return b != 80 || ((double) Math.round(this.f5496t.mo5272a())) >= m8085q();
                }
                if (((double) Math.round(this.f5496t.mo5272a())) <= m8085q()) {
                    return true;
                }
            } else if (((double) Math.round(this.f5497u.mo5272a())) >= m8084p()) {
                return true;
            }
        } else if (((double) Math.round(this.f5497u.mo5272a())) <= m8084p()) {
            return true;
        }
    }
}
