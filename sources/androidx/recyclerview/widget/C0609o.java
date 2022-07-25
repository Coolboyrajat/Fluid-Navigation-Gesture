package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.o */
public abstract class C0609o {

    /* renamed from: a */
    protected final RecyclerView.C0538o f2480a;

    /* renamed from: b */
    private int f2481b;

    /* renamed from: c */
    final Rect f2482c;

    /* renamed from: androidx.recyclerview.widget.o$a */
    static class C0610a extends C0609o {
        C0610a(RecyclerView.C0538o oVar) {
            super(oVar, (C0610a) null);
        }

        /* renamed from: a */
        public int mo3566a() {
            return this.f2480a.mo3261o();
        }

        /* renamed from: a */
        public int mo3567a(View view) {
            return this.f2480a.mo3251j(view) + ((RecyclerView.C0543p) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: a */
        public void mo3568a(int i) {
            this.f2480a.mo3236g(i);
        }

        /* renamed from: b */
        public int mo3569b() {
            return this.f2480a.mo3261o() - this.f2480a.getPaddingRight();
        }

        /* renamed from: b */
        public int mo3570b(View view) {
            RecyclerView.C0543p pVar = (RecyclerView.C0543p) view.getLayoutParams();
            return this.f2480a.mo3248i(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: c */
        public int mo3571c() {
            return this.f2480a.getPaddingRight();
        }

        /* renamed from: c */
        public int mo3572c(View view) {
            RecyclerView.C0543p pVar = (RecyclerView.C0543p) view.getLayoutParams();
            return this.f2480a.mo3244h(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: d */
        public int mo3573d() {
            return this.f2480a.mo3263p();
        }

        /* renamed from: d */
        public int mo3574d(View view) {
            return this.f2480a.mo3235g(view) - ((RecyclerView.C0543p) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: e */
        public int mo3575e() {
            return this.f2480a.mo3250j();
        }

        /* renamed from: e */
        public int mo3576e(View view) {
            this.f2480a.mo3184a(view, true, this.f2482c);
            return this.f2482c.right;
        }

        /* renamed from: f */
        public int mo3577f() {
            return this.f2480a.getPaddingLeft();
        }

        /* renamed from: f */
        public int mo3578f(View view) {
            this.f2480a.mo3184a(view, true, this.f2482c);
            return this.f2482c.left;
        }

        /* renamed from: g */
        public int mo3579g() {
            return (this.f2480a.mo3261o() - this.f2480a.getPaddingLeft()) - this.f2480a.getPaddingRight();
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$b */
    static class C0611b extends C0609o {
        C0611b(RecyclerView.C0538o oVar) {
            super(oVar, (C0610a) null);
        }

        /* renamed from: a */
        public int mo3566a() {
            return this.f2480a.mo3247i();
        }

        /* renamed from: a */
        public int mo3567a(View view) {
            return this.f2480a.mo3232f(view) + ((RecyclerView.C0543p) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: a */
        public void mo3568a(int i) {
            this.f2480a.mo3246h(i);
        }

        /* renamed from: b */
        public int mo3569b() {
            return this.f2480a.mo3247i() - this.f2480a.getPaddingBottom();
        }

        /* renamed from: b */
        public int mo3570b(View view) {
            RecyclerView.C0543p pVar = (RecyclerView.C0543p) view.getLayoutParams();
            return this.f2480a.mo3244h(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: c */
        public int mo3571c() {
            return this.f2480a.getPaddingBottom();
        }

        /* renamed from: c */
        public int mo3572c(View view) {
            RecyclerView.C0543p pVar = (RecyclerView.C0543p) view.getLayoutParams();
            return this.f2480a.mo3248i(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: d */
        public int mo3573d() {
            return this.f2480a.mo3250j();
        }

        /* renamed from: d */
        public int mo3574d(View view) {
            return this.f2480a.mo3254k(view) - ((RecyclerView.C0543p) view.getLayoutParams()).topMargin;
        }

        /* renamed from: e */
        public int mo3575e() {
            return this.f2480a.mo3263p();
        }

        /* renamed from: e */
        public int mo3576e(View view) {
            this.f2480a.mo3184a(view, true, this.f2482c);
            return this.f2482c.bottom;
        }

        /* renamed from: f */
        public int mo3577f() {
            return this.f2480a.getPaddingTop();
        }

        /* renamed from: f */
        public int mo3578f(View view) {
            this.f2480a.mo3184a(view, true, this.f2482c);
            return this.f2482c.top;
        }

        /* renamed from: g */
        public int mo3579g() {
            return (this.f2480a.mo3247i() - this.f2480a.getPaddingTop()) - this.f2480a.getPaddingBottom();
        }
    }

    private C0609o(RecyclerView.C0538o oVar) {
        this.f2481b = RecyclerView.UNDEFINED_DURATION;
        this.f2482c = new Rect();
        this.f2480a = oVar;
    }

    /* synthetic */ C0609o(RecyclerView.C0538o oVar, C0610a aVar) {
        this(oVar);
    }

    /* renamed from: a */
    public static C0609o m3399a(RecyclerView.C0538o oVar) {
        return new C0610a(oVar);
    }

    /* renamed from: a */
    public static C0609o m3400a(RecyclerView.C0538o oVar, int i) {
        if (i == 0) {
            return m3399a(oVar);
        }
        if (i == 1) {
            return m3401b(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public static C0609o m3401b(RecyclerView.C0538o oVar) {
        return new C0611b(oVar);
    }

    /* renamed from: a */
    public abstract int mo3566a();

    /* renamed from: a */
    public abstract int mo3567a(View view);

    /* renamed from: a */
    public abstract void mo3568a(int i);

    /* renamed from: b */
    public abstract int mo3569b();

    /* renamed from: b */
    public abstract int mo3570b(View view);

    /* renamed from: c */
    public abstract int mo3571c();

    /* renamed from: c */
    public abstract int mo3572c(View view);

    /* renamed from: d */
    public abstract int mo3573d();

    /* renamed from: d */
    public abstract int mo3574d(View view);

    /* renamed from: e */
    public abstract int mo3575e();

    /* renamed from: e */
    public abstract int mo3576e(View view);

    /* renamed from: f */
    public abstract int mo3577f();

    /* renamed from: f */
    public abstract int mo3578f(View view);

    /* renamed from: g */
    public abstract int mo3579g();

    /* renamed from: h */
    public int mo3580h() {
        if (Integer.MIN_VALUE == this.f2481b) {
            return 0;
        }
        return mo3579g() - this.f2481b;
    }

    /* renamed from: i */
    public void mo3581i() {
        this.f2481b = mo3579g();
    }
}
