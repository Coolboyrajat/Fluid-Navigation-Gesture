package com.afollestad.materialdialogs.color.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.C0311a;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.p060q.C1076h;
import p054c.p055a.p056a.p060q.C1077i;
import p054c.p055a.p056a.p066v.C1103e;

public final class ColorCircleView extends View {

    /* renamed from: f */
    private final Paint f4624f;

    /* renamed from: g */
    private final Paint f4625g;

    /* renamed from: h */
    private final int f4626h;

    /* renamed from: i */
    private Drawable f4627i;

    /* renamed from: j */
    private int f4628j;

    /* renamed from: k */
    private int f4629k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ColorCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3370k.m12227b(context, "context");
        this.f4624f = new Paint();
        this.f4625g = new Paint();
        this.f4626h = C1103e.f3789a.mo5163a(this, C1076h.color_circle_view_border);
        setWillNotDraw(false);
        this.f4624f.setStyle(Paint.Style.STROKE);
        this.f4624f.setAntiAlias(true);
        this.f4624f.setColor(-16777216);
        this.f4624f.setStrokeWidth((float) this.f4626h);
        this.f4625g.setStyle(Paint.Style.FILL);
        this.f4625g.setAntiAlias(true);
        this.f4625g.setColor(-12303292);
        this.f4628j = -16777216;
        this.f4629k = -12303292;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ColorCircleView(Context context, AttributeSet attributeSet, int i, C3366g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final int getBorder() {
        return this.f4629k;
    }

    public final int getColor() {
        return this.f4628j;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4627i = null;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C3370k.m12227b(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f4628j == 0) {
            if (this.f4627i == null) {
                this.f4627i = C0311a.m1534c(getContext(), C1077i.transparentgrid);
            }
            Drawable drawable = this.f4627i;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            Drawable drawable2 = this.f4627i;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
        } else {
            canvas.drawCircle(((float) getMeasuredWidth()) / 2.0f, ((float) getMeasuredHeight()) / 2.0f, (((float) getMeasuredWidth()) / 2.0f) - ((float) this.f4626h), this.f4625g);
        }
        canvas.drawCircle(((float) getMeasuredWidth()) / 2.0f, ((float) getMeasuredHeight()) / 2.0f, (((float) getMeasuredWidth()) / 2.0f) - ((float) this.f4626h), this.f4624f);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    public final void setBorder(int i) {
        this.f4629k = i;
        this.f4624f.setColor(i);
        invalidate();
    }

    public final void setColor(int i) {
        this.f4628j = i;
        this.f4625g.setColor(i);
        invalidate();
    }
}
