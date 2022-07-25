package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import p006b.p026g.p030f.C0797a;
import p006b.p026g.p033i.C0822e;
import p006b.p026g.p035k.C0890v;
import p054c.p083e.p084a.p085a.p087l.C1179a;
import p054c.p083e.p084a.p085a.p099w.C1215a;
import p054c.p083e.p084a.p085a.p099w.C1219d;
import p054c.p083e.p084a.p085a.p099w.C1223f;

/* renamed from: com.google.android.material.internal.a */
public final class C2661a {

    /* renamed from: V */
    private static final boolean f7007V = (Build.VERSION.SDK_INT < 18);

    /* renamed from: W */
    private static final Paint f7008W = null;

    /* renamed from: A */
    private boolean f7009A;

    /* renamed from: B */
    private Bitmap f7010B;

    /* renamed from: C */
    private Paint f7011C;

    /* renamed from: D */
    private float f7012D;

    /* renamed from: E */
    private float f7013E;

    /* renamed from: F */
    private float f7014F;

    /* renamed from: G */
    private float f7015G;

    /* renamed from: H */
    private int[] f7016H;

    /* renamed from: I */
    private boolean f7017I;

    /* renamed from: J */
    private final TextPaint f7018J;

    /* renamed from: K */
    private final TextPaint f7019K;

    /* renamed from: L */
    private TimeInterpolator f7020L;

    /* renamed from: M */
    private TimeInterpolator f7021M;

    /* renamed from: N */
    private float f7022N;

    /* renamed from: O */
    private float f7023O;

    /* renamed from: P */
    private float f7024P;

    /* renamed from: Q */
    private ColorStateList f7025Q;

    /* renamed from: R */
    private float f7026R;

    /* renamed from: S */
    private float f7027S;

    /* renamed from: T */
    private float f7028T;

    /* renamed from: U */
    private ColorStateList f7029U;

    /* renamed from: a */
    private final View f7030a;

    /* renamed from: b */
    private boolean f7031b;

    /* renamed from: c */
    private float f7032c;

    /* renamed from: d */
    private final Rect f7033d;

    /* renamed from: e */
    private final Rect f7034e;

    /* renamed from: f */
    private final RectF f7035f;

    /* renamed from: g */
    private int f7036g = 16;

    /* renamed from: h */
    private int f7037h = 16;

    /* renamed from: i */
    private float f7038i = 15.0f;

    /* renamed from: j */
    private float f7039j = 15.0f;

    /* renamed from: k */
    private ColorStateList f7040k;

    /* renamed from: l */
    private ColorStateList f7041l;

    /* renamed from: m */
    private float f7042m;

    /* renamed from: n */
    private float f7043n;

    /* renamed from: o */
    private float f7044o;

    /* renamed from: p */
    private float f7045p;

    /* renamed from: q */
    private float f7046q;

    /* renamed from: r */
    private float f7047r;

    /* renamed from: s */
    private Typeface f7048s;

    /* renamed from: t */
    private Typeface f7049t;

    /* renamed from: u */
    private Typeface f7050u;

    /* renamed from: v */
    private C1215a f7051v;

    /* renamed from: w */
    private C1215a f7052w;

    /* renamed from: x */
    private CharSequence f7053x;

    /* renamed from: y */
    private CharSequence f7054y;

    /* renamed from: z */
    private boolean f7055z;

    /* renamed from: com.google.android.material.internal.a$a */
    class C2662a implements C1215a.C1216a {
        C2662a() {
        }

        /* renamed from: a */
        public void mo5456a(Typeface typeface) {
            C2661a.this.mo8509a(typeface);
        }
    }

    static {
        Paint paint = f7008W;
        if (paint != null) {
            paint.setAntiAlias(true);
            f7008W.setColor(-65281);
        }
    }

    public C2661a(View view) {
        this.f7030a = view;
        this.f7018J = new TextPaint(129);
        this.f7019K = new TextPaint(this.f7018J);
        this.f7034e = new Rect();
        this.f7033d = new Rect();
        this.f7035f = new RectF();
    }

    /* renamed from: a */
    private static float m10507a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C1179a.m5735a(f, f2, f3);
    }

    /* renamed from: a */
    private static int m10508a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    private void m10509a(TextPaint textPaint) {
        textPaint.setTextSize(this.f7039j);
        textPaint.setTypeface(this.f7048s);
    }

    /* renamed from: a */
    private static boolean m10510a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: a */
    private static boolean m10511a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: b */
    private void m10512b(TextPaint textPaint) {
        textPaint.setTextSize(this.f7038i);
        textPaint.setTypeface(this.f7049t);
    }

    /* renamed from: b */
    private boolean m10513b(CharSequence charSequence) {
        boolean z = true;
        if (C0890v.m4791o(this.f7030a) != 1) {
            z = false;
        }
        return (z ? C0822e.f3235d : C0822e.f3234c).mo4534a(charSequence, 0, charSequence.length());
    }

    /* renamed from: c */
    private int m10514c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f7016H;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: c */
    private void m10515c(float f) {
        int i;
        TextPaint textPaint;
        m10519e(f);
        this.f7046q = m10507a(this.f7044o, this.f7045p, f, this.f7020L);
        this.f7047r = m10507a(this.f7042m, this.f7043n, f, this.f7020L);
        m10520f(m10507a(this.f7038i, this.f7039j, f, this.f7021M));
        if (this.f7041l != this.f7040k) {
            textPaint = this.f7018J;
            i = m10508a(m10525n(), mo8522d(), f);
        } else {
            textPaint = this.f7018J;
            i = mo8522d();
        }
        textPaint.setColor(i);
        this.f7018J.setShadowLayer(m10507a(this.f7026R, this.f7022N, f, (TimeInterpolator) null), m10507a(this.f7027S, this.f7023O, f, (TimeInterpolator) null), m10507a(this.f7028T, this.f7024P, f, (TimeInterpolator) null), m10508a(m10514c(this.f7029U), m10514c(this.f7025Q), f));
        C0890v.m4736G(this.f7030a);
    }

    /* renamed from: c */
    private boolean m10516c(Typeface typeface) {
        C1215a aVar = this.f7052w;
        if (aVar != null) {
            aVar.mo5453a();
        }
        if (this.f7048s == typeface) {
            return false;
        }
        this.f7048s = typeface;
        return true;
    }

    /* renamed from: d */
    private void m10517d(float f) {
        boolean z;
        float f2;
        boolean z2;
        if (this.f7053x != null) {
            float width = (float) this.f7034e.width();
            float width2 = (float) this.f7033d.width();
            boolean z3 = true;
            if (m10510a(f, this.f7039j)) {
                float f3 = this.f7039j;
                this.f7014F = 1.0f;
                Typeface typeface = this.f7050u;
                Typeface typeface2 = this.f7048s;
                if (typeface != typeface2) {
                    this.f7050u = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                f2 = f3;
                z = z2;
            } else {
                f2 = this.f7038i;
                Typeface typeface3 = this.f7050u;
                Typeface typeface4 = this.f7049t;
                if (typeface3 != typeface4) {
                    this.f7050u = typeface4;
                    z = true;
                } else {
                    z = false;
                }
                if (m10510a(f, this.f7038i)) {
                    this.f7014F = 1.0f;
                } else {
                    this.f7014F = f / this.f7038i;
                }
                float f4 = this.f7039j / this.f7038i;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            }
            if (width > 0.0f) {
                z = this.f7015G != f2 || this.f7017I || z;
                this.f7015G = f2;
                this.f7017I = false;
            }
            if (this.f7054y == null || z) {
                this.f7018J.setTextSize(this.f7015G);
                this.f7018J.setTypeface(this.f7050u);
                TextPaint textPaint = this.f7018J;
                if (this.f7014F == 1.0f) {
                    z3 = false;
                }
                textPaint.setLinearText(z3);
                CharSequence ellipsize = TextUtils.ellipsize(this.f7053x, this.f7018J, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f7054y)) {
                    this.f7054y = ellipsize;
                    this.f7055z = m10513b(this.f7054y);
                }
            }
        }
    }

    /* renamed from: d */
    private boolean m10518d(Typeface typeface) {
        C1215a aVar = this.f7051v;
        if (aVar != null) {
            aVar.mo5453a();
        }
        if (this.f7049t == typeface) {
            return false;
        }
        this.f7049t = typeface;
        return true;
    }

    /* renamed from: e */
    private void m10519e(float f) {
        this.f7035f.left = m10507a((float) this.f7033d.left, (float) this.f7034e.left, f, this.f7020L);
        this.f7035f.top = m10507a(this.f7042m, this.f7043n, f, this.f7020L);
        this.f7035f.right = m10507a((float) this.f7033d.right, (float) this.f7034e.right, f, this.f7020L);
        this.f7035f.bottom = m10507a((float) this.f7033d.bottom, (float) this.f7034e.bottom, f, this.f7020L);
    }

    /* renamed from: f */
    private void m10520f(float f) {
        m10517d(f);
        this.f7009A = f7007V && this.f7014F != 1.0f;
        if (this.f7009A) {
            m10524m();
        }
        C0890v.m4736G(this.f7030a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ec  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10521j() {
        /*
            r11 = this;
            float r0 = r11.f7015G
            float r1 = r11.f7039j
            r11.m10517d((float) r1)
            java.lang.CharSequence r1 = r11.f7054y
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0018
            android.text.TextPaint r4 = r11.f7018J
            int r5 = r1.length()
            float r1 = r4.measureText(r1, r2, r5)
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            int r4 = r11.f7037h
            boolean r5 = r11.f7055z
            int r4 = p006b.p026g.p035k.C0851d.m4580a(r4, r5)
            r5 = r4 & 112(0x70, float:1.57E-43)
            r6 = 80
            r7 = 48
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L_0x0053
            if (r5 == r6) goto L_0x004d
            android.text.TextPaint r5 = r11.f7018J
            float r5 = r5.descent()
            android.text.TextPaint r9 = r11.f7018J
            float r9 = r9.ascent()
            float r5 = r5 - r9
            float r5 = r5 / r8
            android.text.TextPaint r9 = r11.f7018J
            float r9 = r9.descent()
            float r5 = r5 - r9
            android.graphics.Rect r9 = r11.f7034e
            int r9 = r9.centerY()
            float r9 = (float) r9
            float r9 = r9 + r5
            r11.f7043n = r9
            goto L_0x0061
        L_0x004d:
            android.graphics.Rect r5 = r11.f7034e
            int r5 = r5.bottom
            float r5 = (float) r5
            goto L_0x005f
        L_0x0053:
            android.graphics.Rect r5 = r11.f7034e
            int r5 = r5.top
            float r5 = (float) r5
            android.text.TextPaint r9 = r11.f7018J
            float r9 = r9.ascent()
            float r5 = r5 - r9
        L_0x005f:
            r11.f7043n = r5
        L_0x0061:
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r9 = 5
            r10 = 1
            if (r4 == r10) goto L_0x0079
            if (r4 == r9) goto L_0x0073
            android.graphics.Rect r1 = r11.f7034e
            int r1 = r1.left
            float r1 = (float) r1
            r11.f7045p = r1
            goto L_0x0084
        L_0x0073:
            android.graphics.Rect r4 = r11.f7034e
            int r4 = r4.right
            float r4 = (float) r4
            goto L_0x0081
        L_0x0079:
            android.graphics.Rect r4 = r11.f7034e
            int r4 = r4.centerX()
            float r4 = (float) r4
            float r1 = r1 / r8
        L_0x0081:
            float r4 = r4 - r1
            r11.f7045p = r4
        L_0x0084:
            float r1 = r11.f7038i
            r11.m10517d((float) r1)
            java.lang.CharSequence r1 = r11.f7054y
            if (r1 == 0) goto L_0x0097
            android.text.TextPaint r3 = r11.f7018J
            int r4 = r1.length()
            float r3 = r3.measureText(r1, r2, r4)
        L_0x0097:
            int r1 = r11.f7036g
            boolean r2 = r11.f7055z
            int r1 = p006b.p026g.p035k.C0851d.m4580a(r1, r2)
            r2 = r1 & 112(0x70, float:1.57E-43)
            if (r2 == r7) goto L_0x00cb
            if (r2 == r6) goto L_0x00c5
            android.text.TextPaint r2 = r11.f7018J
            float r2 = r2.descent()
            android.text.TextPaint r4 = r11.f7018J
            float r4 = r4.ascent()
            float r2 = r2 - r4
            float r2 = r2 / r8
            android.text.TextPaint r4 = r11.f7018J
            float r4 = r4.descent()
            float r2 = r2 - r4
            android.graphics.Rect r4 = r11.f7033d
            int r4 = r4.centerY()
            float r4 = (float) r4
            float r4 = r4 + r2
            r11.f7042m = r4
            goto L_0x00d9
        L_0x00c5:
            android.graphics.Rect r2 = r11.f7033d
            int r2 = r2.bottom
            float r2 = (float) r2
            goto L_0x00d7
        L_0x00cb:
            android.graphics.Rect r2 = r11.f7033d
            int r2 = r2.top
            float r2 = (float) r2
            android.text.TextPaint r4 = r11.f7018J
            float r4 = r4.ascent()
            float r2 = r2 - r4
        L_0x00d7:
            r11.f7042m = r2
        L_0x00d9:
            r1 = r1 & r5
            if (r1 == r10) goto L_0x00ec
            if (r1 == r9) goto L_0x00e6
            android.graphics.Rect r1 = r11.f7033d
            int r1 = r1.left
            float r1 = (float) r1
        L_0x00e3:
            r11.f7044o = r1
            goto L_0x00f6
        L_0x00e6:
            android.graphics.Rect r1 = r11.f7033d
            int r1 = r1.right
            float r1 = (float) r1
            goto L_0x00f4
        L_0x00ec:
            android.graphics.Rect r1 = r11.f7033d
            int r1 = r1.centerX()
            float r1 = (float) r1
            float r3 = r3 / r8
        L_0x00f4:
            float r1 = r1 - r3
            goto L_0x00e3
        L_0x00f6:
            r11.m10523l()
            r11.m10520f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C2661a.m10521j():void");
    }

    /* renamed from: k */
    private void m10522k() {
        m10515c(this.f7032c);
    }

    /* renamed from: l */
    private void m10523l() {
        Bitmap bitmap = this.f7010B;
        if (bitmap != null) {
            bitmap.recycle();
            this.f7010B = null;
        }
    }

    /* renamed from: m */
    private void m10524m() {
        if (this.f7010B == null && !this.f7033d.isEmpty() && !TextUtils.isEmpty(this.f7054y)) {
            m10515c(0.0f);
            this.f7012D = this.f7018J.ascent();
            this.f7013E = this.f7018J.descent();
            TextPaint textPaint = this.f7018J;
            CharSequence charSequence = this.f7054y;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.f7013E - this.f7012D);
            if (round > 0 && round2 > 0) {
                this.f7010B = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.f7010B);
                CharSequence charSequence2 = this.f7054y;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.f7018J.descent(), this.f7018J);
                if (this.f7011C == null) {
                    this.f7011C = new Paint(3);
                }
            }
        }
    }

    /* renamed from: n */
    private int m10525n() {
        return m10514c(this.f7040k);
    }

    /* renamed from: a */
    public float mo8500a() {
        if (this.f7053x == null) {
            return 0.0f;
        }
        m10509a(this.f7019K);
        TextPaint textPaint = this.f7019K;
        CharSequence charSequence = this.f7053x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: a */
    public void mo8501a(float f) {
        if (this.f7038i != f) {
            this.f7038i = f;
            mo8527i();
        }
    }

    /* renamed from: a */
    public void mo8502a(int i) {
        C1219d dVar = new C1219d(this.f7030a.getContext(), i);
        ColorStateList colorStateList = dVar.f3973b;
        if (colorStateList != null) {
            this.f7041l = colorStateList;
        }
        float f = dVar.f3972a;
        if (f != 0.0f) {
            this.f7039j = f;
        }
        ColorStateList colorStateList2 = dVar.f3977f;
        if (colorStateList2 != null) {
            this.f7025Q = colorStateList2;
        }
        this.f7023O = dVar.f3978g;
        this.f7024P = dVar.f3979h;
        this.f7022N = dVar.f3980i;
        C1215a aVar = this.f7052w;
        if (aVar != null) {
            aVar.mo5453a();
        }
        this.f7052w = new C1215a(new C2662a(), dVar.mo5457a());
        dVar.mo5460a(this.f7030a.getContext(), (C1223f) this.f7052w);
        mo8527i();
    }

    /* renamed from: a */
    public void mo8503a(int i, int i2, int i3, int i4) {
        if (!m10511a(this.f7034e, i, i2, i3, i4)) {
            this.f7034e.set(i, i2, i3, i4);
            this.f7017I = true;
            mo8526h();
        }
    }

    /* renamed from: a */
    public void mo8504a(TimeInterpolator timeInterpolator) {
        this.f7020L = timeInterpolator;
        mo8527i();
    }

    /* renamed from: a */
    public void mo8505a(ColorStateList colorStateList) {
        if (this.f7041l != colorStateList) {
            this.f7041l = colorStateList;
            mo8527i();
        }
    }

    /* renamed from: a */
    public void mo8506a(Canvas canvas) {
        float f;
        int save = canvas.save();
        if (this.f7054y != null && this.f7031b) {
            float f2 = this.f7046q;
            float f3 = this.f7047r;
            boolean z = this.f7009A && this.f7010B != null;
            if (z) {
                f = this.f7012D * this.f7014F;
            } else {
                f = this.f7018J.ascent() * this.f7014F;
                this.f7018J.descent();
            }
            if (z) {
                f3 += f;
            }
            float f4 = f3;
            float f5 = this.f7014F;
            if (f5 != 1.0f) {
                canvas.scale(f5, f5, f2, f4);
            }
            if (z) {
                canvas.drawBitmap(this.f7010B, f2, f4, this.f7011C);
            } else {
                CharSequence charSequence = this.f7054y;
                canvas.drawText(charSequence, 0, charSequence.length(), f2, f4, this.f7018J);
            }
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    public void mo8507a(Rect rect) {
        mo8503a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: a */
    public void mo8508a(RectF rectF) {
        boolean b = m10513b(this.f7053x);
        Rect rect = this.f7034e;
        rectF.left = !b ? (float) rect.left : ((float) rect.right) - mo8500a();
        Rect rect2 = this.f7034e;
        rectF.top = (float) rect2.top;
        rectF.right = !b ? rectF.left + mo8500a() : (float) rect2.right;
        rectF.bottom = ((float) this.f7034e.top) + mo8520c();
    }

    /* renamed from: a */
    public void mo8509a(Typeface typeface) {
        if (m10516c(typeface)) {
            mo8527i();
        }
    }

    /* renamed from: a */
    public void mo8510a(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f7053x, charSequence)) {
            this.f7053x = charSequence;
            this.f7054y = null;
            m10523l();
            mo8527i();
        }
    }

    /* renamed from: a */
    public final boolean mo8511a(int[] iArr) {
        this.f7016H = iArr;
        if (!mo8525g()) {
            return false;
        }
        mo8527i();
        return true;
    }

    /* renamed from: b */
    public ColorStateList mo8512b() {
        return this.f7041l;
    }

    /* renamed from: b */
    public void mo8513b(float f) {
        float a = C0797a.m4438a(f, 0.0f, 1.0f);
        if (a != this.f7032c) {
            this.f7032c = a;
            m10522k();
        }
    }

    /* renamed from: b */
    public void mo8514b(int i) {
        if (this.f7037h != i) {
            this.f7037h = i;
            mo8527i();
        }
    }

    /* renamed from: b */
    public void mo8515b(int i, int i2, int i3, int i4) {
        if (!m10511a(this.f7033d, i, i2, i3, i4)) {
            this.f7033d.set(i, i2, i3, i4);
            this.f7017I = true;
            mo8526h();
        }
    }

    /* renamed from: b */
    public void mo8516b(TimeInterpolator timeInterpolator) {
        this.f7021M = timeInterpolator;
        mo8527i();
    }

    /* renamed from: b */
    public void mo8517b(ColorStateList colorStateList) {
        if (this.f7040k != colorStateList) {
            this.f7040k = colorStateList;
            mo8527i();
        }
    }

    /* renamed from: b */
    public void mo8518b(Rect rect) {
        mo8515b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: b */
    public void mo8519b(Typeface typeface) {
        boolean c = m10516c(typeface);
        boolean d = m10518d(typeface);
        if (c || d) {
            mo8527i();
        }
    }

    /* renamed from: c */
    public float mo8520c() {
        m10509a(this.f7019K);
        return -this.f7019K.ascent();
    }

    /* renamed from: c */
    public void mo8521c(int i) {
        if (this.f7036g != i) {
            this.f7036g = i;
            mo8527i();
        }
    }

    /* renamed from: d */
    public int mo8522d() {
        return m10514c(this.f7041l);
    }

    /* renamed from: e */
    public float mo8523e() {
        m10512b(this.f7019K);
        return -this.f7019K.ascent();
    }

    /* renamed from: f */
    public float mo8524f() {
        return this.f7032c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f7040k;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8525g() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f7041l
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f7040k
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C2661a.mo8525g():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo8526h() {
        this.f7031b = this.f7034e.width() > 0 && this.f7034e.height() > 0 && this.f7033d.width() > 0 && this.f7033d.height() > 0;
    }

    /* renamed from: i */
    public void mo8527i() {
        if (this.f7030a.getHeight() > 0 && this.f7030a.getWidth() > 0) {
            m10521j();
            m10522k();
        }
    }
}
