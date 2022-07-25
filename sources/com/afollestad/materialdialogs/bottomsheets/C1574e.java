package com.afollestad.materialdialogs.bottomsheets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p192b0.C3204e;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3368i;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3384y;

/* renamed from: com.afollestad.materialdialogs.bottomsheets.e */
public final class C1574e {

    /* renamed from: com.afollestad.materialdialogs.bottomsheets.e$a */
    static final class C1575a extends C3371l implements C3350b<View, Unit> {

        /* renamed from: g */
        final /* synthetic */ Animator f4615g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1575a(Animator animator) {
            super(1);
            this.f4615g = animator;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6060a((View) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6060a(View view) {
            C3370k.m12227b(view, "$receiver");
            this.f4615g.cancel();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.bottomsheets.e$b */
    static final /* synthetic */ class C1576b extends C3368i implements C3350b<Integer, Unit> {
        C1576b(BottomSheetBehavior bottomSheetBehavior) {
            super(1, bottomSheetBehavior);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6061a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6061a(int i) {
            ((BottomSheetBehavior) this.f8030g).mo7848c(i);
        }

        /* renamed from: b */
        public final String mo6062b() {
            return "setPeekHeight";
        }

        /* renamed from: h */
        public final C3204e mo6063h() {
            return C3384y.m12254a(BottomSheetBehavior.class);
        }

        /* renamed from: j */
        public final String mo6064j() {
            return "setPeekHeight(I)V";
        }
    }

    /* renamed from: com.afollestad.materialdialogs.bottomsheets.e$c */
    static final class C1577c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C3350b f4616a;

        C1577c(long j, C3350b bVar, C3349a aVar) {
            this.f4616a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3350b bVar = this.f4616a;
            C3370k.m12223a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                bVar.mo5146a((Integer) animatedValue);
                return;
            }
            throw new C3269p("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.afollestad.materialdialogs.bottomsheets.e$d */
    public static final class C1578d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C3349a f4617a;

        C1578d(long j, C3350b bVar, C3349a aVar) {
            this.f4617a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            C3370k.m12227b(animator, "animation");
            this.f4617a.invoke();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.bottomsheets.e$e */
    static final class C1579e extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        public static final C1579e f4618g = new C1579e();

        C1579e() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: com.afollestad.materialdialogs.bottomsheets.e$f */
    public static final class C1580f implements View.OnAttachStateChangeListener {

        /* renamed from: f */
        final /* synthetic */ View f4619f;

        /* renamed from: g */
        final /* synthetic */ C3350b f4620g;

        C1580f(T t, C3350b bVar) {
            this.f4619f = t;
            this.f4620g = bVar;
        }

        public void onViewAttachedToWindow(View view) {
            C3370k.m12227b(view, "v");
        }

        public void onViewDetachedFromWindow(View view) {
            C3370k.m12227b(view, "v");
            this.f4619f.removeOnAttachStateChangeListener(this);
            this.f4620g.mo5146a(view);
        }
    }

    /* renamed from: com.afollestad.materialdialogs.bottomsheets.e$g */
    public static final class C1581g extends BottomSheetBehavior.C2582e {

        /* renamed from: a */
        final /* synthetic */ BottomSheetBehavior f4621a;

        /* renamed from: b */
        final /* synthetic */ C3350b f4622b;

        /* renamed from: c */
        final /* synthetic */ C3349a f4623c;

        C1581g(BottomSheetBehavior<?> bottomSheetBehavior, C3350b bVar, C3349a aVar) {
            this.f4621a = bottomSheetBehavior;
            this.f4622b = bVar;
            this.f4623c = aVar;
        }

        /* renamed from: a */
        public void mo6069a(View view, float f) {
            C3350b bVar;
            float f2;
            C3370k.m12227b(view, "view");
            if (this.f4621a.mo7847c() != 5) {
                if (Float.isNaN(f)) {
                    f = 0.0f;
                }
                if (f > 0.0f) {
                    float b = ((float) this.f4621a.mo7844b()) * Math.abs(f);
                    bVar = this.f4622b;
                    f2 = ((float) this.f4621a.mo7844b()) + b;
                } else {
                    float b2 = ((float) this.f4621a.mo7844b()) * Math.abs(f);
                    bVar = this.f4622b;
                    f2 = ((float) this.f4621a.mo7844b()) - b2;
                }
                bVar.mo5146a(Integer.valueOf((int) f2));
            }
        }

        /* renamed from: a */
        public void mo6070a(View view, int i) {
            C3370k.m12227b(view, "view");
            if (i == 5) {
                this.f4623c.invoke();
            }
        }
    }

    /* renamed from: a */
    public static final Animator m6900a(int i, int i2, long j, C3350b<? super Integer, Unit> bVar, C3349a<Unit> aVar) {
        C3370k.m12227b(bVar, "onUpdate");
        C3370k.m12227b(aVar, "onEnd");
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        C3370k.m12223a((Object) ofInt, "this");
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new C1577c(j, bVar, aVar));
        ofInt.addListener(new C1578d(j, bVar, aVar));
        C3370k.m12223a((Object) ofInt, "ValueAnimator.ofInt(from…nEnd()\n        })\n      }");
        return ofInt;
    }

    /* renamed from: a */
    public static /* synthetic */ Animator m6901a(int i, int i2, long j, C3350b bVar, C3349a aVar, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            aVar = C1579e.f4618g;
        }
        return m6900a(i, i2, j, bVar, aVar);
    }

    /* renamed from: a */
    public static final <T extends View> void m6902a(T t, C3350b<? super T, Unit> bVar) {
        C3370k.m12227b(t, "$this$onDetach");
        C3370k.m12227b(bVar, "onAttached");
        t.addOnAttachStateChangeListener(new C1580f(t, bVar));
    }

    /* renamed from: a */
    public static final void m6903a(BottomSheetBehavior<?> bottomSheetBehavior, View view, int i, int i2, long j, C3349a<Unit> aVar) {
        C3370k.m12227b(bottomSheetBehavior, "$this$animatePeekHeight");
        C3370k.m12227b(view, "view");
        C3370k.m12227b(aVar, "onEnd");
        if (i2 != i) {
            if (j <= 0) {
                bottomSheetBehavior.mo7848c(i2);
                return;
            }
            Animator a = m6900a(i, i2, j, new C1576b(bottomSheetBehavior), aVar);
            m6902a(view, new C1575a(a));
            a.start();
        }
    }

    /* renamed from: a */
    public static final void m6904a(BottomSheetBehavior<?> bottomSheetBehavior, C3350b<? super Integer, Unit> bVar, C3349a<Unit> aVar) {
        C3370k.m12227b(bottomSheetBehavior, "$this$setCallbacks");
        C3370k.m12227b(bVar, "onSlide");
        C3370k.m12227b(aVar, "onHide");
        bottomSheetBehavior.mo7841a((BottomSheetBehavior.C2582e) new C1581g(bottomSheetBehavior, bVar, aVar));
    }
}
