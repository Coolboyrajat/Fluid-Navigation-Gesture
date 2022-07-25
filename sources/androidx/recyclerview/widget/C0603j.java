package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.j */
class C0603j {

    /* renamed from: a */
    boolean f2460a = true;

    /* renamed from: b */
    int f2461b;

    /* renamed from: c */
    int f2462c;

    /* renamed from: d */
    int f2463d;

    /* renamed from: e */
    int f2464e;

    /* renamed from: f */
    int f2465f = 0;

    /* renamed from: g */
    int f2466g = 0;

    /* renamed from: h */
    boolean f2467h;

    /* renamed from: i */
    boolean f2468i;

    C0603j() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo3548a(RecyclerView.C0550v vVar) {
        View d = vVar.mo3326d(this.f2462c);
        this.f2462c += this.f2463d;
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3549a(RecyclerView.C0518a0 a0Var) {
        int i = this.f2462c;
        return i >= 0 && i < a0Var.mo3025a();
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f2461b + ", mCurrentPosition=" + this.f2462c + ", mItemDirection=" + this.f2463d + ", mLayoutDirection=" + this.f2464e + ", mStartLine=" + this.f2465f + ", mEndLine=" + this.f2466g + '}';
    }
}
