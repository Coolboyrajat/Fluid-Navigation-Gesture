package p006b.p019c.p020a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: b.c.a.h */
class C0721h extends Drawable {

    /* renamed from: q */
    private static final double f2794q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    static C0722a f2795r;

    /* renamed from: a */
    private final int f2796a;

    /* renamed from: b */
    private Paint f2797b;

    /* renamed from: c */
    private Paint f2798c;

    /* renamed from: d */
    private Paint f2799d;

    /* renamed from: e */
    private final RectF f2800e;

    /* renamed from: f */
    private float f2801f;

    /* renamed from: g */
    private Path f2802g;

    /* renamed from: h */
    private float f2803h;

    /* renamed from: i */
    private float f2804i;

    /* renamed from: j */
    private float f2805j;

    /* renamed from: k */
    private ColorStateList f2806k;

    /* renamed from: l */
    private boolean f2807l;

    /* renamed from: m */
    private final int f2808m;

    /* renamed from: n */
    private final int f2809n;

    /* renamed from: o */
    private boolean f2810o;

    /* renamed from: p */
    private boolean f2811p;

    /* renamed from: b.c.a.h$a */
    interface C0722a {
        /* renamed from: a */
        void mo4014a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    /* renamed from: a */
    static float m3939a(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f2794q) * ((double) f2))) : f;
    }

    /* renamed from: a */
    private void m3940a(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            float d = (float) m3945d(f);
            float d2 = (float) m3945d(f2);
            if (d > d2) {
                if (!this.f2811p) {
                    this.f2811p = true;
                }
                d = d2;
            }
            if (this.f2805j != d || this.f2803h != d2) {
                this.f2805j = d;
                this.f2803h = d2;
                this.f2804i = (float) ((int) ((d * 1.5f) + ((float) this.f2796a) + 0.5f));
                this.f2807l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    /* renamed from: a */
    private void m3941a(Canvas canvas) {
        float f = this.f2801f;
        float f2 = (-f) - this.f2804i;
        float f3 = f + ((float) this.f2796a) + (this.f2805j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f2800e.width() - f4 > 0.0f;
        boolean z2 = this.f2800e.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f2800e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f2802g, this.f2798c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f2800e.width() - f4, -this.f2801f, this.f2799d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f2800e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f2802g, this.f2798c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f2800e.width() - f4, (-this.f2801f) + this.f2804i, this.f2799d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f2800e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f2802g, this.f2798c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f2800e.height() - f4, -this.f2801f, this.f2799d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f2800e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f2802g, this.f2798c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f2800e.height() - f4, -this.f2801f, this.f2799d);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: b */
    static float m3942b(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        return z ? (float) (((double) f3) + ((1.0d - f2794q) * ((double) f2))) : f3;
    }

    /* renamed from: b */
    private void m3943b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2806k = colorStateList;
        this.f2797b.setColor(this.f2806k.getColorForState(getState(), this.f2806k.getDefaultColor()));
    }

    /* renamed from: b */
    private void m3944b(Rect rect) {
        float f = this.f2803h;
        float f2 = 1.5f * f;
        this.f2800e.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        m3946g();
    }

    /* renamed from: d */
    private int m3945d(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* renamed from: g */
    private void m3946g() {
        float f = this.f2801f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f2804i;
        rectF2.inset(-f2, -f2);
        Path path = this.f2802g;
        if (path == null) {
            this.f2802g = new Path();
        } else {
            path.reset();
        }
        this.f2802g.setFillType(Path.FillType.EVEN_ODD);
        this.f2802g.moveTo(-this.f2801f, 0.0f);
        this.f2802g.rLineTo(-this.f2804i, 0.0f);
        this.f2802g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f2802g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f2802g.close();
        float f3 = this.f2801f;
        float f4 = this.f2804i;
        Paint paint = this.f2798c;
        float f5 = f3 + f4;
        int i = this.f2808m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f2809n}, new float[]{0.0f, f3 / (f3 + f4), 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f2799d;
        float f6 = this.f2801f;
        float f7 = this.f2804i;
        int i2 = this.f2808m;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f2809n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f2799d.setAntiAlias(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList mo4051a() {
        return this.f2806k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4052a(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f2801f != f2) {
                this.f2801f = f2;
                this.f2807l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4053a(ColorStateList colorStateList) {
        m3943b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4054a(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4055a(boolean z) {
        this.f2810o = z;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo4056b() {
        return this.f2801f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4057b(float f) {
        m3940a(this.f2805j, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo4058c() {
        return this.f2803h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4059c(float f) {
        m3940a(f, this.f2803h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo4060d() {
        float f = this.f2803h;
        return (Math.max(f, this.f2801f + ((float) this.f2796a) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f2803h * 1.5f) + ((float) this.f2796a)) * 2.0f);
    }

    public void draw(Canvas canvas) {
        if (this.f2807l) {
            m3944b(getBounds());
            this.f2807l = false;
        }
        canvas.translate(0.0f, this.f2805j / 2.0f);
        m3941a(canvas);
        canvas.translate(0.0f, (-this.f2805j) / 2.0f);
        f2795r.mo4014a(canvas, this.f2800e, this.f2801f, this.f2797b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo4062e() {
        float f = this.f2803h;
        return (Math.max(f, this.f2801f + ((float) this.f2796a) + (f / 2.0f)) * 2.0f) + ((this.f2803h + ((float) this.f2796a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo4063f() {
        return this.f2805j;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m3942b(this.f2803h, this.f2801f, this.f2810o));
        int ceil2 = (int) Math.ceil((double) m3939a(this.f2803h, this.f2801f, this.f2810o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f2806k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2807l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f2806k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f2797b.getColor() == colorForState) {
            return false;
        }
        this.f2797b.setColor(colorForState);
        this.f2807l = true;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        this.f2797b.setAlpha(i);
        this.f2798c.setAlpha(i);
        this.f2799d.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2797b.setColorFilter(colorFilter);
    }
}
