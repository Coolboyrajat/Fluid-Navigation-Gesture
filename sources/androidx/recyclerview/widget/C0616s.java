package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.s */
public abstract class C0616s extends RecyclerView.C0545r {

    /* renamed from: a */
    RecyclerView f2487a;

    /* renamed from: b */
    private Scroller f2488b;

    /* renamed from: c */
    private final RecyclerView.C0547t f2489c = new C0617a();

    /* renamed from: androidx.recyclerview.widget.s$a */
    class C0617a extends RecyclerView.C0547t {

        /* renamed from: a */
        boolean f2490a = false;

        C0617a() {
        }

        /* renamed from: a */
        public void mo3289a(RecyclerView recyclerView, int i) {
            super.mo3289a(recyclerView, i);
            if (i == 0 && this.f2490a) {
                this.f2490a = false;
                C0616s.this.mo3601a();
            }
        }

        /* renamed from: a */
        public void mo3290a(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f2490a = true;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.s$b */
    class C0618b extends C0604k {
        C0618b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo3551a(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3349a(View view, RecyclerView.C0518a0 a0Var, RecyclerView.C0555z.C0556a aVar) {
            C0616s sVar = C0616s.this;
            RecyclerView recyclerView = sVar.f2487a;
            if (recyclerView != null) {
                int[] a = sVar.mo3561a(recyclerView.getLayoutManager(), view);
                int i = a[0];
                int i2 = a[1];
                int d = mo3556d(Math.max(Math.abs(i), Math.abs(i2)));
                if (d > 0) {
                    aVar.mo3362a(i, i2, d, this.f2470j);
                }
            }
        }
    }

    /* renamed from: b */
    private void m3481b() {
        this.f2487a.removeOnScrollListener(this.f2489c);
        this.f2487a.setOnFlingListener((RecyclerView.C0545r) null);
    }

    /* renamed from: b */
    private boolean m3482b(RecyclerView.C0538o oVar, int i, int i2) {
        RecyclerView.C0555z a;
        int a2;
        if (!(oVar instanceof RecyclerView.C0555z.C0557b) || (a = mo3600a(oVar)) == null || (a2 = mo3560a(oVar, i, i2)) == -1) {
            return false;
        }
        a.mo3355c(a2);
        oVar.mo3213b(a);
        return true;
    }

    /* renamed from: c */
    private void m3483c() {
        if (this.f2487a.getOnFlingListener() == null) {
            this.f2487a.addOnScrollListener(this.f2489c);
            this.f2487a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: a */
    public abstract int mo3560a(RecyclerView.C0538o oVar, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public RecyclerView.C0555z mo3600a(RecyclerView.C0538o oVar) {
        return mo3603b(oVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3601a() {
        RecyclerView.C0538o layoutManager;
        View c;
        RecyclerView recyclerView = this.f2487a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (c = mo3562c(layoutManager)) != null) {
            int[] a = mo3561a(layoutManager, c);
            if (a[0] != 0 || a[1] != 0) {
                this.f2487a.smoothScrollBy(a[0], a[1]);
            }
        }
    }

    /* renamed from: a */
    public void mo3602a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2487a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m3481b();
            }
            this.f2487a = recyclerView;
            if (this.f2487a != null) {
                m3483c();
                this.f2488b = new Scroller(this.f2487a.getContext(), new DecelerateInterpolator());
                mo3601a();
            }
        }
    }

    /* renamed from: a */
    public boolean mo3285a(int i, int i2) {
        RecyclerView.C0538o layoutManager = this.f2487a.getLayoutManager();
        if (layoutManager == null || this.f2487a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f2487a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m3482b(layoutManager, i, i2);
    }

    /* renamed from: a */
    public abstract int[] mo3561a(RecyclerView.C0538o oVar, View view);

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: b */
    public C0604k mo3603b(RecyclerView.C0538o oVar) {
        if (!(oVar instanceof RecyclerView.C0555z.C0557b)) {
            return null;
        }
        return new C0618b(this.f2487a.getContext());
    }

    /* renamed from: b */
    public int[] mo3604b(int i, int i2) {
        this.f2488b.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return new int[]{this.f2488b.getFinalX(), this.f2488b.getFinalY()};
    }

    /* renamed from: c */
    public abstract View mo3562c(RecyclerView.C0538o oVar);
}
