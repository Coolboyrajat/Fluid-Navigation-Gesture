package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.r */
public abstract class C0615r extends RecyclerView.C0532l {

    /* renamed from: g */
    boolean f2486g = true;

    /* renamed from: a */
    public final void mo3584a(RecyclerView.C0524d0 d0Var, boolean z) {
        mo3586c(d0Var, z);
        mo3153b(d0Var);
    }

    /* renamed from: a */
    public boolean mo3148a(RecyclerView.C0524d0 d0Var) {
        return !this.f2486g || d0Var.mo3070o();
    }

    /* renamed from: a */
    public abstract boolean mo3492a(RecyclerView.C0524d0 d0Var, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract boolean mo3493a(RecyclerView.C0524d0 d0Var, RecyclerView.C0524d0 d0Var2, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public boolean mo3149a(RecyclerView.C0524d0 d0Var, RecyclerView.C0524d0 d0Var2, RecyclerView.C0532l.C0535c cVar, RecyclerView.C0532l.C0535c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f2196a;
        int i4 = cVar.f2197b;
        if (d0Var2.mo3081y()) {
            int i5 = cVar.f2196a;
            i = cVar.f2197b;
            i2 = i5;
        } else {
            i2 = cVar2.f2196a;
            i = cVar2.f2197b;
        }
        return mo3493a(d0Var, d0Var2, i3, i4, i2, i);
    }

    /* renamed from: a */
    public boolean mo3150a(RecyclerView.C0524d0 d0Var, RecyclerView.C0532l.C0535c cVar, RecyclerView.C0532l.C0535c cVar2) {
        if (cVar == null || (cVar.f2196a == cVar2.f2196a && cVar.f2197b == cVar2.f2197b)) {
            return mo3495f(d0Var);
        }
        return mo3492a(d0Var, cVar.f2196a, cVar.f2197b, cVar2.f2196a, cVar2.f2197b);
    }

    /* renamed from: b */
    public final void mo3585b(RecyclerView.C0524d0 d0Var, boolean z) {
        mo3587d(d0Var, z);
    }

    /* renamed from: b */
    public boolean mo3154b(RecyclerView.C0524d0 d0Var, RecyclerView.C0532l.C0535c cVar, RecyclerView.C0532l.C0535c cVar2) {
        int i = cVar.f2196a;
        int i2 = cVar.f2197b;
        View view = d0Var.f2168f;
        int left = cVar2 == null ? view.getLeft() : cVar2.f2196a;
        int top = cVar2 == null ? view.getTop() : cVar2.f2197b;
        if (d0Var.mo3072q() || (i == left && i2 == top)) {
            return mo3496g(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo3492a(d0Var, i, i2, left, top);
    }

    /* renamed from: c */
    public void mo3586c(RecyclerView.C0524d0 d0Var, boolean z) {
    }

    /* renamed from: c */
    public boolean mo3157c(RecyclerView.C0524d0 d0Var, RecyclerView.C0532l.C0535c cVar, RecyclerView.C0532l.C0535c cVar2) {
        if (cVar.f2196a == cVar2.f2196a && cVar.f2197b == cVar2.f2197b) {
            mo3590j(d0Var);
            return false;
        }
        return mo3492a(d0Var, cVar.f2196a, cVar.f2197b, cVar2.f2196a, cVar2.f2197b);
    }

    /* renamed from: d */
    public void mo3587d(RecyclerView.C0524d0 d0Var, boolean z) {
    }

    /* renamed from: f */
    public abstract boolean mo3495f(RecyclerView.C0524d0 d0Var);

    /* renamed from: g */
    public abstract boolean mo3496g(RecyclerView.C0524d0 d0Var);

    /* renamed from: h */
    public final void mo3588h(RecyclerView.C0524d0 d0Var) {
        mo3594n(d0Var);
        mo3153b(d0Var);
    }

    /* renamed from: i */
    public final void mo3589i(RecyclerView.C0524d0 d0Var) {
        mo3595o(d0Var);
    }

    /* renamed from: j */
    public final void mo3590j(RecyclerView.C0524d0 d0Var) {
        mo3596p(d0Var);
        mo3153b(d0Var);
    }

    /* renamed from: k */
    public final void mo3591k(RecyclerView.C0524d0 d0Var) {
        mo3597q(d0Var);
    }

    /* renamed from: l */
    public final void mo3592l(RecyclerView.C0524d0 d0Var) {
        mo3598r(d0Var);
        mo3153b(d0Var);
    }

    /* renamed from: m */
    public final void mo3593m(RecyclerView.C0524d0 d0Var) {
        mo3599s(d0Var);
    }

    /* renamed from: n */
    public void mo3594n(RecyclerView.C0524d0 d0Var) {
    }

    /* renamed from: o */
    public void mo3595o(RecyclerView.C0524d0 d0Var) {
    }

    /* renamed from: p */
    public void mo3596p(RecyclerView.C0524d0 d0Var) {
    }

    /* renamed from: q */
    public void mo3597q(RecyclerView.C0524d0 d0Var) {
    }

    /* renamed from: r */
    public void mo3598r(RecyclerView.C0524d0 d0Var) {
    }

    /* renamed from: s */
    public void mo3599s(RecyclerView.C0524d0 d0Var) {
    }
}
