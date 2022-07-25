package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p006b.p026g.p035k.C0875g;
import p006b.p026g.p035k.C0890v;
import p054c.p083e.p084a.p085a.C1178k;

/* renamed from: com.google.android.material.internal.c */
public class C2664c extends ViewGroup {

    /* renamed from: f */
    private int f7059f;

    /* renamed from: g */
    private int f7060g;

    /* renamed from: h */
    private boolean f7061h;

    public C2664c(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2664c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2664c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7061h = false;
        m10559a(context, attributeSet);
    }

    @TargetApi(21)
    public C2664c(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7061h = false;
        m10559a(context, attributeSet);
    }

    /* renamed from: a */
    private static int m10558a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    /* renamed from: a */
    private void m10559a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1178k.FlowLayout, 0, 0);
        this.f7059f = obtainStyledAttributes.getDimensionPixelSize(C1178k.FlowLayout_lineSpacing, 0);
        this.f7060g = obtainStyledAttributes.getDimensionPixelSize(C1178k.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public boolean mo8071a() {
        return this.f7061h;
    }

    /* access modifiers changed from: protected */
    public int getItemSpacing() {
        return this.f7060g;
    }

    /* access modifiers changed from: protected */
    public int getLineSpacing() {
        return this.f7059f;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() != 0) {
            boolean z2 = true;
            if (C0890v.m4791o(this) != 1) {
                z2 = false;
            }
            int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
            int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
            int paddingTop = getPaddingTop();
            int i7 = (i3 - i) - paddingLeft;
            int i8 = paddingRight;
            int i9 = paddingTop;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i5 = C0875g.m4689b(marginLayoutParams);
                        i6 = C0875g.m4688a(marginLayoutParams);
                    } else {
                        i6 = 0;
                        i5 = 0;
                    }
                    int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                    if (!this.f7061h && measuredWidth > i7) {
                        i9 = paddingTop + this.f7059f;
                        i8 = paddingRight;
                    }
                    int i11 = i8 + i5;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                    int measuredHeight = childAt.getMeasuredHeight() + i9;
                    if (z2) {
                        i11 = i7 - measuredWidth2;
                        measuredWidth2 = (i7 - i8) - i5;
                    }
                    childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                    i8 += i5 + i6 + childAt.getMeasuredWidth() + this.f7060g;
                    paddingTop = measuredHeight;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i5 - getPaddingRight();
        int i6 = paddingLeft;
        int i7 = paddingTop;
        int i8 = i7;
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                int i11 = i;
                int i12 = i2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i3 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                int i13 = i6;
                if (i6 + i4 + childAt.getMeasuredWidth() > paddingRight && !mo8071a()) {
                    int paddingLeft2 = getPaddingLeft();
                    i8 = this.f7059f + i7;
                    i13 = paddingLeft2;
                }
                int measuredWidth = i13 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight() + i8;
                if (measuredWidth > i9) {
                    i9 = measuredWidth;
                }
                int measuredWidth2 = i13 + i4 + i3 + childAt.getMeasuredWidth() + this.f7060g;
                if (i10 == getChildCount() - 1) {
                    i9 += i3;
                }
                i7 = measuredHeight;
                i6 = measuredWidth2;
            }
        }
        setMeasuredDimension(m10558a(size, mode, i9 + getPaddingRight()), m10558a(size2, mode2, i7 + getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.f7060g = i;
    }

    /* access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.f7059f = i;
    }

    public void setSingleLine(boolean z) {
        this.f7061h = z;
    }
}
