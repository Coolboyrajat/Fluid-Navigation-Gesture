package com.p131fb.fluid.p148ui.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.ui.views.ExtRecyclerView */
public final class ExtRecyclerView extends RecyclerView {

    /* renamed from: f */
    private float f6290f;

    /* renamed from: g */
    private float f6291g;

    /* renamed from: h */
    private float f6292h;

    /* renamed from: i */
    private float f6293i;

    public ExtRecyclerView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (C3366g) null);
    }

    public ExtRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C3366g) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExtRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C3370k.m12227b(context, "context");
        this.f6290f = 1.0f;
        this.f6291g = 1.0f;
        this.f6292h = 1.0f;
        this.f6293i = 1.0f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExtRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, C3366g gVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final float getBottomFadingEdgeStr() {
        return this.f6291g;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        return this.f6291g;
    }

    public final float getLeftFadingEdgeStr() {
        return this.f6292h;
    }

    /* access modifiers changed from: protected */
    public float getLeftFadingEdgeStrength() {
        return this.f6292h;
    }

    public final float getRightFadingEdgeStr() {
        return this.f6293i;
    }

    /* access modifiers changed from: protected */
    public float getRightFadingEdgeStrength() {
        return this.f6293i;
    }

    public final float getTopFadingEdgeStr() {
        return this.f6290f;
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        return this.f6290f;
    }

    public final void setBottomFadingEdgeStr(float f) {
        this.f6291g = f;
    }

    public final void setLeftFadingEdgeStr(float f) {
        this.f6292h = f;
    }

    public final void setRightFadingEdgeStr(float f) {
        this.f6293i = f;
    }

    public final void setTopFadingEdgeStr(float f) {
        this.f6290f = f;
    }
}
