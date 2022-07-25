package p006b.p019c.p020a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: b.c.a.g */
class C0720g extends Drawable {

    /* renamed from: a */
    private float f2783a;

    /* renamed from: b */
    private final Paint f2784b;

    /* renamed from: c */
    private final RectF f2785c;

    /* renamed from: d */
    private final Rect f2786d;

    /* renamed from: e */
    private float f2787e;

    /* renamed from: f */
    private boolean f2788f;

    /* renamed from: g */
    private boolean f2789g;

    /* renamed from: h */
    private ColorStateList f2790h;

    /* renamed from: i */
    private PorterDuffColorFilter f2791i;

    /* renamed from: j */
    private ColorStateList f2792j;

    /* renamed from: k */
    private PorterDuff.Mode f2793k;

    /* renamed from: a */
    private PorterDuffColorFilter m3930a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: a */
    private void m3931a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f2785c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f2786d.set(rect);
        if (this.f2788f) {
            float b = C0721h.m3942b(this.f2787e, this.f2783a, this.f2789g);
            this.f2786d.inset((int) Math.ceil((double) C0721h.m3939a(this.f2787e, this.f2783a, this.f2789g)), (int) Math.ceil((double) b));
            this.f2785c.set(this.f2786d);
        }
    }

    /* renamed from: b */
    private void m3932b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2790h = colorStateList;
        this.f2784b.setColor(this.f2790h.getColorForState(getState(), this.f2790h.getDefaultColor()));
    }

    /* renamed from: a */
    public ColorStateList mo4035a() {
        return this.f2790h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4036a(float f) {
        if (f != this.f2783a) {
            this.f2783a = f;
            m3931a((Rect) null);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4037a(float f, boolean z, boolean z2) {
        if (f != this.f2787e || this.f2788f != z || this.f2789g != z2) {
            this.f2787e = f;
            this.f2788f = z;
            this.f2789g = z2;
            m3931a((Rect) null);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo4038a(ColorStateList colorStateList) {
        m3932b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo4039b() {
        return this.f2787e;
    }

    /* renamed from: c */
    public float mo4040c() {
        return this.f2783a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f2784b;
        if (this.f2791i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f2791i);
            z = true;
        }
        RectF rectF = this.f2785c;
        float f = this.f2783a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f2786d, this.f2783a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f2790h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f2792j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f2790h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p019c.p020a.C0720g.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m3931a(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f2790h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f2784b.getColor();
        if (z) {
            this.f2784b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f2792j;
        if (colorStateList2 == null || (mode = this.f2793k) == null) {
            return z;
        }
        this.f2791i = m3930a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i) {
        this.f2784b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2784b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2792j = colorStateList;
        this.f2791i = m3930a(this.f2792j, this.f2793k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f2793k = mode;
        this.f2791i = m3930a(this.f2792j, this.f2793k);
        invalidateSelf();
    }
}
