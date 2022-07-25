package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p054c.p083e.p084a.p085a.p087l.C1179a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.C0265c<V> {

    /* renamed from: a */
    private int f6573a = 0;

    /* renamed from: b */
    private int f6574b = 2;

    /* renamed from: c */
    private int f6575c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ViewPropertyAnimator f6576d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    class C2560a extends AnimatorListenerAdapter {
        C2560a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f6576d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m9875a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f6576d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C2560a());
    }

    /* renamed from: a */
    public void mo7772a(V v) {
        if (this.f6574b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f6576d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f6574b = 1;
            m9875a(v, this.f6573a + this.f6575c, 175, C1179a.f3916c);
        }
    }

    /* renamed from: a */
    public void mo7773a(V v, int i) {
        this.f6575c = i;
        if (this.f6574b == 1) {
            v.setTranslationY((float) (this.f6573a + this.f6575c));
        }
    }

    /* renamed from: a */
    public void mo1824a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            mo7772a(v);
        } else if (i2 < 0) {
            mo7774b(v);
        }
    }

    /* renamed from: a */
    public boolean mo1832a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f6573a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo1832a(coordinatorLayout, v, i);
    }

    /* renamed from: b */
    public void mo7774b(V v) {
        if (this.f6574b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f6576d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f6574b = 2;
            m9875a(v, 0, 225, C1179a.f3917d);
        }
    }

    /* renamed from: b */
    public boolean mo1843b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }
}
