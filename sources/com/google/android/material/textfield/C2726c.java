package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p054c.p083e.p084a.p085a.p102z.C1233d;
import p054c.p083e.p084a.p085a.p102z.C1238g;

/* renamed from: com.google.android.material.textfield.c */
class C2726c extends C1233d {

    /* renamed from: A */
    private final Paint f7244A;

    /* renamed from: B */
    private final RectF f7245B;

    /* renamed from: C */
    private int f7246C;

    C2726c() {
        this((C1238g) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2726c(C1238g gVar) {
        super(gVar == null ? new C1238g() : gVar);
        this.f7244A = new Paint(1);
        m10769p();
        this.f7245B = new RectF();
    }

    /* renamed from: a */
    private void m10765a(Canvas canvas) {
        if (!m10766a(getCallback())) {
            canvas.restoreToCount(this.f7246C);
        }
    }

    /* renamed from: a */
    private boolean m10766a(Drawable.Callback callback) {
        return callback instanceof View;
    }

    /* renamed from: b */
    private void m10767b(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (m10766a(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
                return;
            }
            return;
        }
        m10768c(canvas);
    }

    /* renamed from: c */
    private void m10768c(Canvas canvas) {
        int i;
        if (Build.VERSION.SDK_INT >= 21) {
            i = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
        } else {
            i = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null, 31);
        }
        this.f7246C = i;
    }

    /* renamed from: p */
    private void m10769p() {
        this.f7244A.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f7244A.setColor(-1);
        this.f7244A.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8771a(float f, float f2, float f3, float f4) {
        RectF rectF = this.f7245B;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            this.f7245B.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8772a(RectF rectF) {
        mo8771a(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public void draw(Canvas canvas) {
        m10767b(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f7245B, this.f7244A);
        m10765a(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo8180n() {
        return !this.f7245B.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo8183o() {
        mo8771a(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
