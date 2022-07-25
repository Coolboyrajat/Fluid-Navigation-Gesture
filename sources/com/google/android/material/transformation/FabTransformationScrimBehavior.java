package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p054c.p083e.p084a.p085a.p087l.C1180b;
import p054c.p083e.p084a.p085a.p087l.C1187i;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C1187i f7328c = new C1187i(75, 150);

    /* renamed from: d */
    private final C1187i f7329d = new C1187i(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    class C2754a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f7330a;

        /* renamed from: b */
        final /* synthetic */ View f7331b;

        C2754a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f7330a = z;
            this.f7331b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f7330a) {
                this.f7331b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f7330a) {
                this.f7331b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m10893a(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        C1187i iVar = z ? this.f7328c : this.f7329d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.mo5317a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: a */
    public boolean mo1837a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AnimatorSet mo8819b(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m10893a(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C1180b.m5736a(animatorSet, arrayList);
        animatorSet.addListener(new C2754a(this, z, view2));
        return animatorSet;
    }

    /* renamed from: b */
    public boolean mo1841b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo1841b(coordinatorLayout, view, motionEvent);
    }
}
