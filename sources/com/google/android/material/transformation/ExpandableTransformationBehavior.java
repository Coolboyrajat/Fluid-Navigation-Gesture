package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AnimatorSet f7311b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    class C2748a extends AnimatorListenerAdapter {
        C2748a() {
        }

        public void onAnimationEnd(Animator animator) {
            AnimatorSet unused = ExpandableTransformationBehavior.this.f7311b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo8816a(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f7311b != null;
        if (z3) {
            this.f7311b.cancel();
        }
        this.f7311b = mo8819b(view, view2, z, z3);
        this.f7311b.addListener(new C2748a());
        this.f7311b.start();
        if (!z2) {
            this.f7311b.end();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AnimatorSet mo8819b(View view, View view2, boolean z, boolean z2);
}
