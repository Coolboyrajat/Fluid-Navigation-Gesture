package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.C2672g;
import p006b.p026g.p035k.C0890v;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1177j;
import p054c.p083e.p084a.p085a.p102z.C1233d;
import p054c.p083e.p084a.p085a.p102z.C1236e;

public class MaterialToolbar extends Toolbar {

    /* renamed from: U */
    private static final int f6547U = C1177j.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1169b.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(C2672g.m10585b(context, attributeSet, i, f6547U), attributeSet, i);
        m9838a(getContext());
    }

    /* renamed from: a */
    private void m9838a(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C1233d dVar = new C1233d();
            dVar.mo5492a(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            dVar.mo5491a(context);
            dVar.mo5486a(C0890v.m4787k(this));
            C0890v.m4751a((View) this, (Drawable) dVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1236e.m5958a(this);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C1236e.m5959a((View) this, f);
    }
}
