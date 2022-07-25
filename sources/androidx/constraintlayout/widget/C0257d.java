package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.d */
public class C0257d extends ViewGroup {

    /* renamed from: f */
    C0254c f1345f;

    /* renamed from: androidx.constraintlayout.widget.d$a */
    public static class C0258a extends ConstraintLayout.C0250a {

        /* renamed from: m0 */
        public float f1346m0;

        /* renamed from: n0 */
        public boolean f1347n0;

        /* renamed from: o0 */
        public float f1348o0;

        /* renamed from: p0 */
        public float f1349p0;

        /* renamed from: q0 */
        public float f1350q0;

        /* renamed from: r0 */
        public float f1351r0;

        /* renamed from: s0 */
        public float f1352s0;

        /* renamed from: t0 */
        public float f1353t0;

        /* renamed from: u0 */
        public float f1354u0;

        /* renamed from: v0 */
        public float f1355v0;

        /* renamed from: w0 */
        public float f1356w0;

        /* renamed from: x0 */
        public float f1357x0;

        /* renamed from: y0 */
        public float f1358y0;

        public C0258a(int i, int i2) {
            super(i, i2);
            this.f1346m0 = 1.0f;
            this.f1347n0 = false;
            this.f1348o0 = 0.0f;
            this.f1349p0 = 0.0f;
            this.f1350q0 = 0.0f;
            this.f1351r0 = 0.0f;
            this.f1352s0 = 1.0f;
            this.f1353t0 = 1.0f;
            this.f1354u0 = 0.0f;
            this.f1355v0 = 0.0f;
            this.f1356w0 = 0.0f;
            this.f1357x0 = 0.0f;
            this.f1358y0 = 0.0f;
        }

        public C0258a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            float f;
            this.f1346m0 = 1.0f;
            this.f1347n0 = false;
            this.f1348o0 = 0.0f;
            this.f1349p0 = 0.0f;
            this.f1350q0 = 0.0f;
            this.f1351r0 = 0.0f;
            this.f1352s0 = 1.0f;
            this.f1353t0 = 1.0f;
            this.f1354u0 = 0.0f;
            this.f1355v0 = 0.0f;
            this.f1356w0 = 0.0f;
            this.f1357x0 = 0.0f;
            this.f1358y0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0262h.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0262h.ConstraintSet_android_alpha) {
                    this.f1346m0 = obtainStyledAttributes.getFloat(index, this.f1346m0);
                } else if (index == C0262h.ConstraintSet_android_elevation) {
                    this.f1348o0 = obtainStyledAttributes.getFloat(index, this.f1348o0);
                    this.f1347n0 = true;
                } else if (index == C0262h.ConstraintSet_android_rotationX) {
                    this.f1350q0 = obtainStyledAttributes.getFloat(index, this.f1350q0);
                } else if (index == C0262h.ConstraintSet_android_rotationY) {
                    this.f1351r0 = obtainStyledAttributes.getFloat(index, this.f1351r0);
                } else if (index == C0262h.ConstraintSet_android_rotation) {
                    this.f1349p0 = obtainStyledAttributes.getFloat(index, this.f1349p0);
                } else if (index == C0262h.ConstraintSet_android_scaleX) {
                    this.f1352s0 = obtainStyledAttributes.getFloat(index, this.f1352s0);
                } else if (index == C0262h.ConstraintSet_android_scaleY) {
                    this.f1353t0 = obtainStyledAttributes.getFloat(index, this.f1353t0);
                } else if (index == C0262h.ConstraintSet_android_transformPivotX) {
                    this.f1354u0 = obtainStyledAttributes.getFloat(index, this.f1354u0);
                } else if (index == C0262h.ConstraintSet_android_transformPivotY) {
                    this.f1355v0 = obtainStyledAttributes.getFloat(index, this.f1355v0);
                } else {
                    if (index == C0262h.ConstraintSet_android_translationX) {
                        f = this.f1356w0;
                    } else if (index == C0262h.ConstraintSet_android_translationY) {
                        this.f1357x0 = obtainStyledAttributes.getFloat(index, this.f1357x0);
                    } else if (index == C0262h.ConstraintSet_android_translationZ) {
                        f = this.f1358y0;
                    }
                    this.f1356w0 = obtainStyledAttributes.getFloat(index, f);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public C0258a generateDefaultLayoutParams() {
        return new C0258a(-2, -2);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0250a(layoutParams);
    }

    public C0258a generateLayoutParams(AttributeSet attributeSet) {
        return new C0258a(getContext(), attributeSet);
    }

    public C0254c getConstraintSet() {
        if (this.f1345f == null) {
            this.f1345f = new C0254c();
        }
        this.f1345f.mo1749a(this);
        return this.f1345f;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
