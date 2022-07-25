package com.p131fb.fluid.p148ui.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.p131fb.fluid.p135l.p139p.C1767c;
import java.util.ArrayList;
import java.util.List;
import kotlin.p205x.p207d.C3370k;
import p054c.p079d.p080a.p081a.p082a.C1165a;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.views.c */
public final class C2514c extends View {

    /* renamed from: f */
    private boolean f6364f;

    /* renamed from: g */
    private int f6365g;

    /* renamed from: h */
    private float f6366h;

    /* renamed from: i */
    private float f6367i;

    /* renamed from: j */
    private float f6368j;

    /* renamed from: k */
    private float f6369k;

    /* renamed from: l */
    private int f6370l;

    /* renamed from: m */
    private int f6371m;

    /* renamed from: n */
    private final Paint f6372n;

    /* renamed from: o */
    private final List<RectF> f6373o;

    /* renamed from: p */
    private final Paint f6374p;

    /* renamed from: q */
    private final Paint f6375q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2514c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C3370k.m12227b(context, "context");
        this.f6366h = C1165a.m5733a(1.0f);
        this.f6367i = C1165a.m5733a(4.0f);
        this.f6368j = C1165a.m5733a(2.0f);
        this.f6369k = C1165a.m5733a(2.0f);
        this.f6371m = 1;
        this.f6372n = new Paint();
        this.f6373o = new ArrayList();
        this.f6374p = new Paint();
        this.f6375q = new Paint();
        mo7421b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2514c(Context context, AttributeSet attributeSet, int i, int i2, C3366g gVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: a */
    public final void mo7420a() {
        RectF rectF;
        float f;
        this.f6373o.clear();
        boolean z = getHeight() < getWidth();
        int max = Math.max(this.f6371m, 1);
        float f2 = (float) 2;
        float max2 = ((float) (Math.max(getWidth(), getHeight()) / max)) - (this.f6366h / f2);
        float min = !this.f6364f ? Math.min(C1165a.m5733a(8.0f), this.f6367i) : this.f6367i;
        for (int i = 0; i < max; i++) {
            float f3 = 0.0f;
            if (z) {
                float f4 = this.f6366h;
                rectF.offset((((float) i) * max2) + f4, f4);
            } else {
                rectF = new RectF(0.0f, 0.0f, min, max2);
                float f5 = this.f6366h;
                rectF.offset(f5, (((float) i) * max2) + f5);
            }
            float f6 = rectF.left;
            float f7 = this.f6366h;
            rectF.left = f6 + f7;
            rectF.top += f7;
            rectF.right -= f7 * f2;
            rectF.bottom -= f7 * f2;
            int i2 = this.f6365g;
            if (!z) {
                f3 = (i2 & 5) == 5 ? (this.f6367i - rectF.width()) - (this.f6366h * ((float) 3)) : 0.0f;
            } else if ((i2 & 80) == 80) {
                f = (this.f6367i - rectF.height()) - (this.f6366h * ((float) 3));
                rectF.offset(f3, f);
                this.f6373o.add(rectF);
            }
            f = 0.0f;
            rectF.offset(f3, f);
            this.f6373o.add(rectF);
        }
    }

    /* renamed from: b */
    public final void mo7421b() {
        int i;
        Paint paint = this.f6372n;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Context context = getContext();
        C3370k.m12223a((Object) context, "context");
        paint.setColor(C1767c.m7444a(context.getResources().getColor(C3148R.C3150color.colorAccent), 0.5f));
        Paint paint2 = this.f6374p;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(C1767c.m7444a(-1, ((float) this.f6370l) / 100.0f));
        Paint paint3 = this.f6375q;
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(this.f6368j);
        if (this.f6364f) {
            Context context2 = getContext();
            C3370k.m12223a((Object) context2, "context");
            i = context2.getResources().getColor(C3148R.C3150color.colorAccent);
        } else {
            i = C1767c.m7444a(-12303292, (((float) this.f6370l) * 0.7f) / ((float) 100));
        }
        paint3.setColor(i);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        for (RectF rectF : this.f6373o) {
            if (this.f6364f && canvas != null) {
                float f = this.f6369k;
                canvas.drawRoundRect(rectF, f, f, this.f6372n);
            }
            if (canvas != null) {
                float f2 = this.f6369k;
                canvas.drawRoundRect(rectF, f2, f2, this.f6374p);
            }
            if (!(this.f6368j == 0.0f || canvas == null)) {
                float f3 = this.f6369k;
                canvas.drawRoundRect(rectF, f3, f3, this.f6375q);
            }
        }
    }

    public final boolean getDebug() {
        return this.f6364f;
    }

    public final int getGravity() {
        return this.f6365g;
    }

    public final float getIndicatorMargin() {
        return this.f6366h;
    }

    public final float getIndicatorSensitivity() {
        return this.f6367i;
    }

    public final float getIndicatorStrokeWidth() {
        return this.f6368j;
    }

    public final float getRadius() {
        return this.f6369k;
    }

    public final int getTransparency() {
        return this.f6370l;
    }

    public final int getTriggerCount() {
        return this.f6371m;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo7420a();
    }

    public final void setDebug(boolean z) {
        this.f6364f = z;
        mo7421b();
        mo7420a();
    }

    public final void setGravity(int i) {
        this.f6365g = i;
    }

    public final void setIndicatorMargin(float f) {
        this.f6366h = f;
    }

    public final void setIndicatorSensitivity(float f) {
        this.f6367i = f;
    }

    public final void setIndicatorStrokeWidth(float f) {
        this.f6368j = f;
    }

    public final void setRadius(float f) {
        this.f6369k = f;
    }

    public final void setTransparency(int i) {
        this.f6370l = i;
    }

    public final void setTriggerCount(int i) {
        this.f6371m = i;
    }
}
