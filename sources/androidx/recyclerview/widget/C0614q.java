package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.q */
class C0614q {
    /* renamed from: a */
    static int m3453a(RecyclerView.C0518a0 a0Var, C0609o oVar, View view, View view2, RecyclerView.C0538o oVar2, boolean z) {
        if (oVar2.mo3231f() == 0 || a0Var.mo3025a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar2.mo3258m(view) - oVar2.mo3258m(view2)) + 1;
        }
        return Math.min(oVar.mo3579g(), oVar.mo3567a(view2) - oVar.mo3574d(view));
    }

    /* renamed from: a */
    static int m3454a(RecyclerView.C0518a0 a0Var, C0609o oVar, View view, View view2, RecyclerView.C0538o oVar2, boolean z, boolean z2) {
        if (oVar2.mo3231f() == 0 || a0Var.mo3025a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (a0Var.mo3025a() - Math.max(oVar2.mo3258m(view), oVar2.mo3258m(view2))) - 1) : Math.max(0, Math.min(oVar2.mo3258m(view), oVar2.mo3258m(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(oVar.mo3567a(view2) - oVar.mo3574d(view))) / ((float) (Math.abs(oVar2.mo3258m(view) - oVar2.mo3258m(view2)) + 1)))) + ((float) (oVar.mo3577f() - oVar.mo3574d(view))));
    }

    /* renamed from: b */
    static int m3455b(RecyclerView.C0518a0 a0Var, C0609o oVar, View view, View view2, RecyclerView.C0538o oVar2, boolean z) {
        if (oVar2.mo3231f() == 0 || a0Var.mo3025a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.mo3025a();
        }
        return (int) ((((float) (oVar.mo3567a(view2) - oVar.mo3574d(view))) / ((float) (Math.abs(oVar2.mo3258m(view) - oVar2.mo3258m(view2)) + 1))) * ((float) a0Var.mo3025a()));
    }
}
