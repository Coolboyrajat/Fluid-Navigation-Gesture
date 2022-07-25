package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0168d0;
import p054c.p083e.p084a.p085a.C1178k;

/* renamed from: com.google.android.material.internal.d */
public class C2665d extends C0168d0 {

    /* renamed from: u */
    private Drawable f7062u;

    /* renamed from: v */
    private final Rect f7063v;

    /* renamed from: w */
    private final Rect f7064w;

    /* renamed from: x */
    private int f7065x;

    /* renamed from: y */
    protected boolean f7066y;

    /* renamed from: z */
    boolean f7067z;

    public C2665d(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2665d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2665d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7063v = new Rect();
        this.f7064w = new Rect();
        this.f7065x = 119;
        this.f7066y = true;
        this.f7067z = false;
        TypedArray c = C2672g.m10589c(context, attributeSet, C1178k.ForegroundLinearLayout, i, 0, new int[0]);
        this.f7065x = c.getInt(C1178k.ForegroundLinearLayout_android_foregroundGravity, this.f7065x);
        Drawable drawable = c.getDrawable(C1178k.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f7066y = c.getBoolean(C1178k.ForegroundLinearLayout_foregroundInsidePadding, true);
        c.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f7062u;
        if (drawable != null) {
            if (this.f7067z) {
                this.f7067z = false;
                Rect rect = this.f7063v;
                Rect rect2 = this.f7064w;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f7066y) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f7065x, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f7062u;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7062u;
        if (drawable != null && drawable.isStateful()) {
            this.f7062u.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f7062u;
    }

    public int getForegroundGravity() {
        return this.f7065x;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7062u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f7067z = z | this.f7067z;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f7067z = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f7062u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f7062u);
            }
            this.f7062u = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f7065x == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f7065x != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f7065x = i;
            if (this.f7065x == 119 && this.f7062u != null) {
                this.f7062u.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7062u;
    }
}
