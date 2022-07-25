package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p006b.p026g.p035k.C0890v;

/* renamed from: androidx.core.widget.a */
public abstract class C0338a implements View.OnTouchListener {

    /* renamed from: w */
    private static final int f1616w = ViewConfiguration.getTapTimeout();

    /* renamed from: f */
    final C0339a f1617f = new C0339a();

    /* renamed from: g */
    private final Interpolator f1618g = new AccelerateInterpolator();

    /* renamed from: h */
    final View f1619h;

    /* renamed from: i */
    private Runnable f1620i;

    /* renamed from: j */
    private float[] f1621j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f1622k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: l */
    private int f1623l;

    /* renamed from: m */
    private int f1624m;

    /* renamed from: n */
    private float[] f1625n = {0.0f, 0.0f};

    /* renamed from: o */
    private float[] f1626o = {0.0f, 0.0f};

    /* renamed from: p */
    private float[] f1627p = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: q */
    private boolean f1628q;

    /* renamed from: r */
    boolean f1629r;

    /* renamed from: s */
    boolean f1630s;

    /* renamed from: t */
    boolean f1631t;

    /* renamed from: u */
    private boolean f1632u;

    /* renamed from: v */
    private boolean f1633v;

    /* renamed from: androidx.core.widget.a$a */
    private static class C0339a {

        /* renamed from: a */
        private int f1634a;

        /* renamed from: b */
        private int f1635b;

        /* renamed from: c */
        private float f1636c;

        /* renamed from: d */
        private float f1637d;

        /* renamed from: e */
        private long f1638e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f1639f = 0;

        /* renamed from: g */
        private int f1640g = 0;

        /* renamed from: h */
        private int f1641h = 0;

        /* renamed from: i */
        private long f1642i = -1;

        /* renamed from: j */
        private float f1643j;

        /* renamed from: k */
        private int f1644k;

        C0339a() {
        }

        /* renamed from: a */
        private float m1705a(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        private float m1706a(long j) {
            if (j < this.f1638e) {
                return 0.0f;
            }
            long j2 = this.f1642i;
            if (j2 < 0 || j < j2) {
                return C0338a.m1683a(((float) (j - this.f1638e)) / ((float) this.f1634a), 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f1643j;
            return (1.0f - f) + (f * C0338a.m1683a(((float) j3) / ((float) this.f1644k), 0.0f, 1.0f));
        }

        /* renamed from: a */
        public void mo2116a() {
            if (this.f1639f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = m1705a(m1706a(currentAnimationTimeMillis));
                this.f1639f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f1639f)) * a;
                this.f1640g = (int) (this.f1636c * f);
                this.f1641h = (int) (f * this.f1637d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: a */
        public void mo2117a(float f, float f2) {
            this.f1636c = f;
            this.f1637d = f2;
        }

        /* renamed from: a */
        public void mo2118a(int i) {
            this.f1635b = i;
        }

        /* renamed from: b */
        public int mo2119b() {
            return this.f1640g;
        }

        /* renamed from: b */
        public void mo2120b(int i) {
            this.f1634a = i;
        }

        /* renamed from: c */
        public int mo2121c() {
            return this.f1641h;
        }

        /* renamed from: d */
        public int mo2122d() {
            float f = this.f1636c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public int mo2123e() {
            float f = this.f1637d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public boolean mo2124f() {
            return this.f1642i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1642i + ((long) this.f1644k);
        }

        /* renamed from: g */
        public void mo2125g() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1644k = C0338a.m1686a((int) (currentAnimationTimeMillis - this.f1638e), 0, this.f1635b);
            this.f1643j = m1706a(currentAnimationTimeMillis);
            this.f1642i = currentAnimationTimeMillis;
        }

        /* renamed from: h */
        public void mo2126h() {
            this.f1638e = AnimationUtils.currentAnimationTimeMillis();
            this.f1642i = -1;
            this.f1639f = this.f1638e;
            this.f1643j = 0.5f;
            this.f1640g = 0;
            this.f1641h = 0;
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    private class C0340b implements Runnable {
        C0340b() {
        }

        public void run() {
            C0338a aVar = C0338a.this;
            if (aVar.f1631t) {
                if (aVar.f1629r) {
                    aVar.f1629r = false;
                    aVar.f1617f.mo2126h();
                }
                C0339a aVar2 = C0338a.this.f1617f;
                if (aVar2.mo2124f() || !C0338a.this.mo2106b()) {
                    C0338a.this.f1631t = false;
                    return;
                }
                C0338a aVar3 = C0338a.this;
                if (aVar3.f1630s) {
                    aVar3.f1630s = false;
                    aVar3.mo2102a();
                }
                aVar2.mo2116a();
                C0338a.this.mo2103a(aVar2.mo2119b(), aVar2.mo2121c());
                C0890v.m4757a(C0338a.this.f1619h, (Runnable) this);
            }
        }
    }

    public C0338a(View view) {
        this.f1619h = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo2105b(f2, f2);
        float f3 = (float) ((int) ((f * 315.0f) + 0.5f));
        mo2108c(f3, f3);
        mo2111d(1);
        mo2100a(Float.MAX_VALUE, Float.MAX_VALUE);
        mo2110d(0.2f, 0.2f);
        mo2112e(1.0f, 1.0f);
        mo2109c(f1616w);
        mo2114f(500);
        mo2113e(500);
    }

    /* renamed from: a */
    static float m1683a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    private float m1684a(float f, float f2, float f3, float f4) {
        float f5;
        float a = m1683a(f * f2, 0.0f, f3);
        float f6 = m1689f(f2 - f4, a) - m1689f(f4, a);
        if (f6 < 0.0f) {
            f5 = -this.f1618g.getInterpolation(-f6);
        } else if (f6 <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f1618g.getInterpolation(f6);
        }
        return m1683a(f5, -1.0f, 1.0f);
    }

    /* renamed from: a */
    private float m1685a(int i, float f, float f2, float f3) {
        float a = m1684a(this.f1621j[i], f2, this.f1622k[i], f);
        int i2 = (a > 0.0f ? 1 : (a == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f1625n[i];
        float f5 = this.f1626o[i];
        float f6 = this.f1627p[i];
        float f7 = f4 * f3;
        return i2 > 0 ? m1683a(a * f7, f5, f6) : -m1683a((-a) * f7, f5, f6);
    }

    /* renamed from: a */
    static int m1686a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: c */
    private void m1687c() {
        if (this.f1629r) {
            this.f1631t = false;
        } else {
            this.f1617f.mo2125g();
        }
    }

    /* renamed from: d */
    private void m1688d() {
        int i;
        if (this.f1620i == null) {
            this.f1620i = new C0340b();
        }
        this.f1631t = true;
        this.f1629r = true;
        if (this.f1628q || (i = this.f1624m) <= 0) {
            this.f1620i.run();
        } else {
            C0890v.m4758a(this.f1619h, this.f1620i, (long) i);
        }
        this.f1628q = true;
    }

    /* renamed from: f */
    private float m1689f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f1623l;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.f1631t || this.f1623l != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: a */
    public C0338a mo2100a(float f, float f2) {
        float[] fArr = this.f1622k;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: a */
    public C0338a mo2101a(boolean z) {
        if (this.f1632u && !z) {
            m1687c();
        }
        this.f1632u = z;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2102a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1619h.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    public abstract void mo2103a(int i, int i2);

    /* renamed from: a */
    public abstract boolean mo2104a(int i);

    /* renamed from: b */
    public C0338a mo2105b(float f, float f2) {
        float[] fArr = this.f1627p;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2106b() {
        C0339a aVar = this.f1617f;
        int e = aVar.mo2123e();
        int d = aVar.mo2122d();
        return (e != 0 && mo2107b(e)) || (d != 0 && mo2104a(d));
    }

    /* renamed from: b */
    public abstract boolean mo2107b(int i);

    /* renamed from: c */
    public C0338a mo2108c(float f, float f2) {
        float[] fArr = this.f1626o;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public C0338a mo2109c(int i) {
        this.f1624m = i;
        return this;
    }

    /* renamed from: d */
    public C0338a mo2110d(float f, float f2) {
        float[] fArr = this.f1621j;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: d */
    public C0338a mo2111d(int i) {
        this.f1623l = i;
        return this;
    }

    /* renamed from: e */
    public C0338a mo2112e(float f, float f2) {
        float[] fArr = this.f1625n;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: e */
    public C0338a mo2113e(int i) {
        this.f1617f.mo2118a(i);
        return this;
    }

    /* renamed from: f */
    public C0338a mo2114f(int i) {
        this.f1617f.mo2120b(i);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f1632u
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m1687c()
            goto L_0x0058
        L_0x001a:
            r5.f1630s = r2
            r5.f1628q = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1619h
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m1685a((int) r1, (float) r0, (float) r3, (float) r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1619h
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m1685a((int) r2, (float) r7, (float) r6, (float) r3)
            androidx.core.widget.a$a r7 = r5.f1617f
            r7.mo2117a(r0, r6)
            boolean r6 = r5.f1631t
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo2106b()
            if (r6 == 0) goto L_0x0058
            r5.m1688d()
        L_0x0058:
            boolean r6 = r5.f1633v
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f1631t
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C0338a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
