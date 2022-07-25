package p054c.p083e.p084a.p085a.p091p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import p054c.p083e.p084a.p085a.p091p.C1200d;

/* renamed from: c.e.a.a.p.a */
public final class C1195a {

    /* renamed from: c.e.a.a.p.a$a */
    static class C1196a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1200d f3950a;

        C1196a(C1200d dVar) {
            this.f3950a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3950a.mo5405b();
        }

        public void onAnimationStart(Animator animator) {
            this.f3950a.mo5404a();
        }
    }

    /* renamed from: a */
    public static Animator.AnimatorListener m5800a(C1200d dVar) {
        return new C1196a(dVar);
    }

    /* renamed from: a */
    public static Animator m5801a(C1200d dVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, C1200d.C1203c.f3955a, C1200d.C1202b.f3953b, new C1200d.C1205e[]{new C1200d.C1205e(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C1200d.C1205e revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.f3959c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
