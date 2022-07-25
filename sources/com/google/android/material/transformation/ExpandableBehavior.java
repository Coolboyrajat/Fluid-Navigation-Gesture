package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p006b.p026g.p035k.C0890v;
import p054c.p083e.p084a.p085a.p096t.C1211b;

public abstract class ExpandableBehavior extends CoordinatorLayout.C0265c<View> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f7306a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    class C2747a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: f */
        final /* synthetic */ View f7307f;

        /* renamed from: g */
        final /* synthetic */ int f7308g;

        /* renamed from: h */
        final /* synthetic */ C1211b f7309h;

        C2747a(View view, int i, C1211b bVar) {
            this.f7307f = view;
            this.f7308g = i;
            this.f7309h = bVar;
        }

        public boolean onPreDraw() {
            this.f7307f.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f7306a == this.f7308g) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                C1211b bVar = this.f7309h;
                expandableBehavior.mo8816a((View) bVar, this.f7307f, bVar.mo5445a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private boolean m10860a(boolean z) {
        if (!z) {
            return this.f7306a == 1;
        }
        int i = this.f7306a;
        return i == 0 || i == 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo8816a(View view, View view2, boolean z, boolean z2);

    /* renamed from: a */
    public boolean mo1832a(CoordinatorLayout coordinatorLayout, View view, int i) {
        C1211b e;
        if (C0890v.m4732C(view) || (e = mo8817e(coordinatorLayout, view)) == null || !m10860a(e.mo5445a())) {
            return false;
        }
        this.f7306a = e.mo5445a() ? 1 : 2;
        view.getViewTreeObserver().addOnPreDrawListener(new C2747a(view, this.f7306a, e));
        return false;
    }

    /* renamed from: b */
    public boolean mo1842b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C1211b bVar = (C1211b) view2;
        if (!m10860a(bVar.mo5445a())) {
            return false;
        }
        this.f7306a = bVar.mo5445a() ? 1 : 2;
        return mo8816a((View) bVar, view, bVar.mo5445a(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C1211b mo8817e(CoordinatorLayout coordinatorLayout, View view) {
        List<View> b = coordinatorLayout.mo1779b(view);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            View view2 = b.get(i);
            if (mo1837a(coordinatorLayout, view, view2)) {
                return (C1211b) view2;
            }
        }
        return null;
    }
}
