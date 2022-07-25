package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.k */
public class C0604k extends RecyclerView.C0555z {

    /* renamed from: i */
    protected final LinearInterpolator f2469i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f2470j = new DecelerateInterpolator();

    /* renamed from: k */
    protected PointF f2471k;

    /* renamed from: l */
    private final DisplayMetrics f2472l;

    /* renamed from: m */
    private boolean f2473m = false;

    /* renamed from: n */
    private float f2474n;

    /* renamed from: o */
    protected int f2475o = 0;

    /* renamed from: p */
    protected int f2476p = 0;

    public C0604k(Context context) {
        this.f2472l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: b */
    private int m3363b(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* renamed from: k */
    private float m3364k() {
        if (!this.f2473m) {
            this.f2474n = mo3551a(this.f2472l);
            this.f2473m = true;
        }
        return this.f2474n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo3551a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: a */
    public int mo3552a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: a */
    public int mo3553a(View view, int i) {
        RecyclerView.C0538o b = mo3352b();
        if (b == null || !b.mo2804b()) {
            return 0;
        }
        RecyclerView.C0543p pVar = (RecyclerView.C0543p) view.getLayoutParams();
        return mo3552a(b.mo3235g(view) - pVar.leftMargin, b.mo3251j(view) + pVar.rightMargin, b.getPaddingLeft(), b.mo3261o() - b.getPaddingRight(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3347a(int i, int i2, RecyclerView.C0518a0 a0Var, RecyclerView.C0555z.C0556a aVar) {
        if (mo3343a() == 0) {
            mo3360h();
            return;
        }
        this.f2475o = m3363b(this.f2475o, i);
        this.f2476p = m3363b(this.f2476p, i2);
        if (this.f2475o == 0 && this.f2476p == 0) {
            mo3554a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3349a(View view, RecyclerView.C0518a0 a0Var, RecyclerView.C0555z.C0556a aVar) {
        int a = mo3553a(view, mo3558i());
        int b = mo3555b(view, mo3559j());
        int d = mo3556d((int) Math.sqrt((double) ((a * a) + (b * b))));
        if (d > 0) {
            aVar.mo3362a(-a, -b, d, this.f2470j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3554a(RecyclerView.C0555z.C0556a aVar) {
        PointF a = mo3345a(mo3354c());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.mo3361a(mo3354c());
            mo3360h();
            return;
        }
        mo3348a(a);
        this.f2471k = a;
        this.f2475o = (int) (a.x * 10000.0f);
        this.f2476p = (int) (a.y * 10000.0f);
        aVar.mo3362a((int) (((float) this.f2475o) * 1.2f), (int) (((float) this.f2476p) * 1.2f), (int) (((float) mo3557e(10000)) * 1.2f), this.f2469i);
    }

    /* renamed from: b */
    public int mo3555b(View view, int i) {
        RecyclerView.C0538o b = mo3352b();
        if (b == null || !b.mo2807c()) {
            return 0;
        }
        RecyclerView.C0543p pVar = (RecyclerView.C0543p) view.getLayoutParams();
        return mo3552a(b.mo3254k(view) - pVar.topMargin, b.mo3232f(view) + pVar.bottomMargin, b.getPaddingTop(), b.mo3247i() - b.getPaddingBottom(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo3556d(int i) {
        return (int) Math.ceil(((double) mo3557e(i)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo3557e(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * m3364k()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo3358f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo3359g() {
        this.f2476p = 0;
        this.f2475o = 0;
        this.f2471k = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo3558i() {
        PointF pointF = this.f2471k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo3559j() {
        PointF pointF = this.f2471k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
