package com.p131fb.fluid.p148ui.views;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.ui.views.b */
public final class C2513b extends FrameLayout {

    /* renamed from: f */
    private C3349a<Unit> f6361f;

    /* renamed from: g */
    private C3349a<Unit> f6362g;

    /* renamed from: h */
    private C3350b<? super Canvas, Unit> f6363h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2513b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C3370k.m12227b(context, "context");
        this.f6363h = C2512a.f6360g;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2513b(Context context, AttributeSet attributeSet, int i, int i2, C3366g gVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (canvas != null) {
            this.f6363h.mo5146a(canvas);
        }
    }

    public final C3349a<Unit> getOnConfigChanged() {
        return this.f6362g;
    }

    public final C3350b<Canvas, Unit> getOnDispatchDraw() {
        return this.f6363h;
    }

    public final C3349a<Unit> getOnLayoutChanged() {
        return this.f6361f;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C3349a<Unit> aVar = this.f6362g;
        if (aVar != null) {
            Unit invoke = aVar.invoke();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C3349a<Unit> aVar = this.f6361f;
        if (aVar != null) {
            Unit invoke = aVar.invoke();
        }
    }

    public final void setOnConfigChanged(C3349a<Unit> aVar) {
        this.f6362g = aVar;
    }

    public final void setOnDispatchDraw(C3350b<? super Canvas, Unit> bVar) {
        C3370k.m12227b(bVar, "<set-?>");
        this.f6363h = bVar;
    }

    public final void setOnLayoutChanged(C3349a<Unit> aVar) {
        this.f6361f = aVar;
    }
}
