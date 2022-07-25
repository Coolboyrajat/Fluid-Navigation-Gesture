package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.l */
public class C0605l extends C0616s {

    /* renamed from: d */
    private C0609o f2477d;

    /* renamed from: e */
    private C0609o f2478e;

    /* renamed from: a */
    private float m3378a(RecyclerView.C0538o oVar, C0609o oVar2) {
        int max;
        int f = oVar.mo3231f();
        if (f == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = RecyclerView.UNDEFINED_DURATION;
        for (int i3 = 0; i3 < f; i3++) {
            View f2 = oVar.mo3233f(i3);
            int m = oVar.mo3258m(f2);
            if (m != -1) {
                if (m < i) {
                    view = f2;
                    i = m;
                }
                if (m > i2) {
                    view2 = f2;
                    i2 = m;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(oVar2.mo3567a(view), oVar2.mo3567a(view2)) - Math.min(oVar2.mo3574d(view), oVar2.mo3574d(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
    }

    /* renamed from: a */
    private int m3379a(RecyclerView.C0538o oVar, View view, C0609o oVar2) {
        return (oVar2.mo3574d(view) + (oVar2.mo3570b(view) / 2)) - (oVar.mo3237g() ? oVar2.mo3577f() + (oVar2.mo3579g() / 2) : oVar2.mo3566a() / 2);
    }

    /* renamed from: a */
    private int m3380a(RecyclerView.C0538o oVar, C0609o oVar2, int i, int i2) {
        int[] b = mo3604b(i, i2);
        float a = m3378a(oVar, oVar2);
        if (a <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(b[0]) > Math.abs(b[1]) ? b[0] : b[1])) / a);
    }

    /* renamed from: b */
    private View m3381b(RecyclerView.C0538o oVar, C0609o oVar2) {
        int f = oVar.mo3231f();
        View view = null;
        if (f == 0) {
            return null;
        }
        int f2 = oVar.mo3237g() ? oVar2.mo3577f() + (oVar2.mo3579g() / 2) : oVar2.mo3566a() / 2;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < f; i2++) {
            View f3 = oVar.mo3233f(i2);
            int abs = Math.abs((oVar2.mo3574d(f3) + (oVar2.mo3570b(f3) / 2)) - f2);
            if (abs < i) {
                view = f3;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: d */
    private C0609o m3382d(RecyclerView.C0538o oVar) {
        C0609o oVar2 = this.f2478e;
        if (oVar2 == null || oVar2.f2480a != oVar) {
            this.f2478e = C0609o.m3399a(oVar);
        }
        return this.f2478e;
    }

    /* renamed from: e */
    private C0609o m3383e(RecyclerView.C0538o oVar) {
        C0609o oVar2 = this.f2477d;
        if (oVar2 == null || oVar2.f2480a != oVar) {
            this.f2477d = C0609o.m3401b(oVar);
        }
        return this.f2477d;
    }

    /* renamed from: a */
    public int mo3560a(RecyclerView.C0538o oVar, int i, int i2) {
        int k;
        View c;
        int m;
        int i3;
        PointF c2;
        int i4;
        int i5;
        if (!(oVar instanceof RecyclerView.C0555z.C0557b) || (k = oVar.mo3253k()) == 0 || (c = mo3562c(oVar)) == null || (m = oVar.mo3258m(c)) == -1 || (c2 = ((RecyclerView.C0555z.C0557b) oVar).mo2806c(i3)) == null) {
            return -1;
        }
        if (oVar.mo2804b()) {
            i4 = m3380a(oVar, m3382d(oVar), i, 0);
            if (c2.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (oVar.mo2807c()) {
            i5 = m3380a(oVar, m3383e(oVar), 0, i2);
            if (c2.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (oVar.mo2807c()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i6 = m + i4;
        if (i6 < 0) {
            i6 = 0;
        }
        return i6 >= k ? k - 1 : i6;
    }

    /* renamed from: a */
    public int[] mo3561a(RecyclerView.C0538o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.mo2804b()) {
            iArr[0] = m3379a(oVar, view, m3382d(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.mo2807c()) {
            iArr[1] = m3379a(oVar, view, m3383e(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: c */
    public View mo3562c(RecyclerView.C0538o oVar) {
        C0609o d;
        if (oVar.mo2807c()) {
            d = m3383e(oVar);
        } else if (!oVar.mo2804b()) {
            return null;
        } else {
            d = m3382d(oVar);
        }
        return m3381b(oVar, d);
    }
}
