package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p006b.p026g.p030f.C0797a;
import p006b.p026g.p035k.C0851d;
import p006b.p026g.p035k.C0852d0;
import p006b.p026g.p035k.C0890v;

/* renamed from: com.google.android.material.appbar.b */
abstract class C2556b extends C2557c<View> {

    /* renamed from: d */
    final Rect f6558d = new Rect();

    /* renamed from: e */
    final Rect f6559e = new Rect();

    /* renamed from: f */
    private int f6560f = 0;

    /* renamed from: g */
    private int f6561g;

    public C2556b() {
    }

    public C2556b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    private static int m9851c(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo7759a(View view) {
        if (this.f6561g == 0) {
            return 0;
        }
        float b = mo7746b(view);
        int i = this.f6561g;
        return C0797a.m4439a((int) (b * ((float) i)), 0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract View mo7745a(List<View> list);

    /* renamed from: a */
    public boolean mo1833a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View a;
        C0852d0 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (a = mo7745a(coordinatorLayout.mo1779b(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C0890v.m4788l(a) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.mo4574d() + lastWindowInsets.mo4570a();
        }
        int c = size + mo7747c(a);
        int measuredHeight = a.getMeasuredHeight();
        if (mo7764e()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            c -= measuredHeight;
        }
        coordinatorLayout.mo1774a(view, i, i2, View.MeasureSpec.makeMeasureSpec(c, i5 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), i4);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract float mo7746b(View view);

    /* renamed from: b */
    public final void mo7760b(int i) {
        this.f6561g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7761b(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View a = mo7745a(coordinatorLayout.mo1779b(view));
        if (a != null) {
            CoordinatorLayout.C0268f fVar = (CoordinatorLayout.C0268f) view.getLayoutParams();
            Rect rect = this.f6558d;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, a.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            C0852d0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C0890v.m4788l(coordinatorLayout) && !C0890v.m4788l(view)) {
                rect.left += lastWindowInsets.mo4572b();
                rect.right -= lastWindowInsets.mo4573c();
            }
            Rect rect2 = this.f6559e;
            C0851d.m4581a(m9851c(fVar.f1391c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int a2 = mo7759a(a);
            view.layout(rect2.left, rect2.top - a2, rect2.right, rect2.bottom - a2);
            i2 = rect2.top - a.getBottom();
        } else {
            super.mo7761b(coordinatorLayout, view, i);
            i2 = 0;
        }
        this.f6560f = i2;
    }

    /* renamed from: c */
    public final int mo7762c() {
        return this.f6561g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo7747c(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo7763d() {
        return this.f6560f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo7764e() {
        return false;
    }
}
