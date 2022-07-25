package p006b.p050n;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: b.n.h0 */
class C0980h0 {
    C0980h0() {
    }

    /* renamed from: a */
    public void mo4862a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C0986j.save_non_transition_alpha, (Object) null);
        }
    }

    /* renamed from: a */
    public void mo4863a(View view, float f) {
        Float f2 = (Float) view.getTag(C0986j.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: a */
    public void mo4869a(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }

    /* renamed from: a */
    public void mo4866a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo4866a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: b */
    public float mo4864b(View view) {
        Float f = (Float) view.getTag(C0986j.save_non_transition_alpha);
        float alpha = view.getAlpha();
        return f != null ? alpha / f.floatValue() : alpha;
    }

    /* renamed from: b */
    public void mo4867b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo4867b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    /* renamed from: c */
    public void mo4865c(View view) {
        if (view.getTag(C0986j.save_non_transition_alpha) == null) {
            view.setTag(C0986j.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }
}
