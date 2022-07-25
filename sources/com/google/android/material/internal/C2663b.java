package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.google.android.material.internal.b */
public class C2663b {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f7057a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f7058b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m10555a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m10557b(viewGroup, view, rect);
    }

    /* renamed from: a */
    private static void m10556a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m10556a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    /* renamed from: b */
    public static void m10557b(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f7057a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f7057a.set(matrix);
        } else {
            matrix.reset();
        }
        m10556a((ViewParent) viewGroup, view, matrix);
        RectF rectF = f7058b.get();
        if (rectF == null) {
            rectF = new RectF();
            f7058b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
