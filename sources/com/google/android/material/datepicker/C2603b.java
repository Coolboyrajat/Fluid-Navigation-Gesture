package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import p006b.p026g.p034j.C0837h;
import p006b.p026g.p035k.C0890v;
import p054c.p083e.p084a.p085a.C1178k;
import p054c.p083e.p084a.p085a.p099w.C1218c;
import p054c.p083e.p084a.p085a.p102z.C1233d;
import p054c.p083e.p084a.p085a.p102z.C1238g;

/* renamed from: com.google.android.material.datepicker.b */
final class C2603b {

    /* renamed from: a */
    private final Rect f6821a;

    /* renamed from: b */
    private final ColorStateList f6822b;

    /* renamed from: c */
    private final ColorStateList f6823c;

    /* renamed from: d */
    private final ColorStateList f6824d;

    /* renamed from: e */
    private final int f6825e;

    /* renamed from: f */
    private final C1238g f6826f;

    private C2603b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C1238g gVar, Rect rect) {
        C0837h.m4533a(rect.left);
        C0837h.m4533a(rect.top);
        C0837h.m4533a(rect.right);
        C0837h.m4533a(rect.bottom);
        this.f6821a = rect;
        this.f6822b = colorStateList2;
        this.f6823c = colorStateList;
        this.f6824d = colorStateList3;
        this.f6825e = i;
        this.f6826f = gVar;
    }

    /* renamed from: a */
    static C2603b m10257a(Context context, int i) {
        C0837h.m4536a(i != 0, (Object) "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1178k.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C1178k.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(C1178k.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(C1178k.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(C1178k.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a = C1218c.m5861a(context, obtainStyledAttributes, C1178k.MaterialCalendarItem_itemFillColor);
        ColorStateList a2 = C1218c.m5861a(context, obtainStyledAttributes, C1178k.MaterialCalendarItem_itemTextColor);
        ColorStateList a3 = C1218c.m5861a(context, obtainStyledAttributes, C1178k.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1178k.MaterialCalendarItem_itemStrokeWidth, 0);
        C1238g a4 = C1238g.m5965a(context, obtainStyledAttributes.getResourceId(C1178k.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(C1178k.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).mo5547a();
        obtainStyledAttributes.recycle();
        return new C2603b(a, a2, a3, dimensionPixelSize, a4, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo8236a() {
        return this.f6821a.bottom;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8237a(TextView textView) {
        C1233d dVar = new C1233d();
        C1233d dVar2 = new C1233d();
        dVar.setShapeAppearanceModel(this.f6826f);
        dVar2.setShapeAppearanceModel(this.f6826f);
        dVar.mo5492a(this.f6823c);
        dVar.mo5488a((float) this.f6825e, this.f6824d);
        textView.setTextColor(this.f6822b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f6822b.withAlpha(30), dVar, dVar2) : dVar;
        Rect rect = this.f6821a;
        C0890v.m4751a((View) textView, (Drawable) new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo8238b() {
        return this.f6821a.top;
    }
}
