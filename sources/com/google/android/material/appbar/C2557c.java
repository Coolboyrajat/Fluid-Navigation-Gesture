package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.appbar.c */
class C2557c<V extends View> extends CoordinatorLayout.C0265c<V> {

    /* renamed from: a */
    private C2558d f6562a;

    /* renamed from: b */
    private int f6563b = 0;

    /* renamed from: c */
    private int f6564c = 0;

    public C2557c() {
    }

    public C2557c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo7765a(int i) {
        C2558d dVar = this.f6562a;
        if (dVar != null) {
            return dVar.mo7770b(i);
        }
        this.f6563b = i;
        return false;
    }

    /* renamed from: a */
    public boolean mo1832a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo7761b(coordinatorLayout, v, i);
        if (this.f6562a == null) {
            this.f6562a = new C2558d(v);
        }
        this.f6562a.mo7771c();
        this.f6562a.mo7767a();
        int i2 = this.f6563b;
        if (i2 != 0) {
            this.f6562a.mo7770b(i2);
            this.f6563b = 0;
        }
        int i3 = this.f6564c;
        if (i3 == 0) {
            return true;
        }
        this.f6562a.mo7768a(i3);
        this.f6564c = 0;
        return true;
    }

    /* renamed from: b */
    public int mo7766b() {
        C2558d dVar = this.f6562a;
        if (dVar != null) {
            return dVar.mo7769b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7761b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo1785c((View) v, i);
    }
}
