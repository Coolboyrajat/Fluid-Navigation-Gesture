package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p006b.p026g.p035k.C0890v;
import p054c.p083e.p084a.p085a.C1173f;
import p054c.p083e.p084a.p085a.p087l.C1179a;
import p054c.p083e.p084a.p085a.p087l.C1180b;
import p054c.p083e.p084a.p085a.p087l.C1181c;
import p054c.p083e.p084a.p085a.p087l.C1182d;
import p054c.p083e.p084a.p085a.p087l.C1183e;
import p054c.p083e.p084a.p085a.p087l.C1186h;
import p054c.p083e.p084a.p085a.p087l.C1187i;
import p054c.p083e.p084a.p085a.p087l.C1188j;
import p054c.p083e.p084a.p085a.p091p.C1195a;
import p054c.p083e.p084a.p085a.p091p.C1198c;
import p054c.p083e.p084a.p085a.p091p.C1200d;
import p054c.p083e.p084a.p085a.p097u.C1213a;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f7313c = new Rect();

    /* renamed from: d */
    private final RectF f7314d = new RectF();

    /* renamed from: e */
    private final RectF f7315e = new RectF();

    /* renamed from: f */
    private final int[] f7316f = new int[2];

    /* renamed from: g */
    private float f7317g;

    /* renamed from: h */
    private float f7318h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    class C2749a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f7319a;

        /* renamed from: b */
        final /* synthetic */ View f7320b;

        /* renamed from: c */
        final /* synthetic */ View f7321c;

        C2749a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f7319a = z;
            this.f7320b = view;
            this.f7321c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f7319a) {
                this.f7320b.setVisibility(4);
                this.f7321c.setAlpha(1.0f);
                this.f7321c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f7319a) {
                this.f7320b.setVisibility(0);
                this.f7321c.setAlpha(0.0f);
                this.f7321c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    class C2750b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f7322a;

        C2750b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f7322a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f7322a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    class C2751c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1200d f7323a;

        /* renamed from: b */
        final /* synthetic */ Drawable f7324b;

        C2751c(FabTransformationBehavior fabTransformationBehavior, C1200d dVar, Drawable drawable) {
            this.f7323a = dVar;
            this.f7324b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f7323a.setCircularRevealOverlayDrawable((Drawable) null);
        }

        public void onAnimationStart(Animator animator) {
            this.f7323a.setCircularRevealOverlayDrawable(this.f7324b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    class C2752d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1200d f7325a;

        C2752d(FabTransformationBehavior fabTransformationBehavior, C1200d dVar) {
            this.f7325a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            C1200d.C1205e revealInfo = this.f7325a.getRevealInfo();
            revealInfo.f3959c = Float.MAX_VALUE;
            this.f7325a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    protected static class C2753e {

        /* renamed from: a */
        public C1186h f7326a;

        /* renamed from: b */
        public C1188j f7327b;

        protected C2753e() {
        }
    }

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private float m10868a(View view, View view2, C1188j jVar) {
        RectF rectF = this.f7314d;
        RectF rectF2 = this.f7315e;
        m10874a(view, rectF);
        m10882b(view2, rectF2);
        rectF2.offset(-m10884c(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: a */
    private float m10869a(C2753e eVar, C1187i iVar, float f, float f2) {
        long a = iVar.mo5316a();
        long b = iVar.mo5318b();
        C1187i a2 = eVar.f7326a.mo5309a("expansion");
        return C1179a.m5735a(f, f2, iVar.mo5319c().getInterpolation(((float) (((a2.mo5316a() + a2.mo5318b()) + 17) - a)) / ((float) b)));
    }

    /* renamed from: a */
    private Pair<C1187i, C1187i> m10870a(float f, float f2, boolean z, C2753e eVar) {
        String str;
        C1186h hVar;
        C1187i iVar;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            iVar = eVar.f7326a.mo5309a("translationXLinear");
            hVar = eVar.f7326a;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            iVar = eVar.f7326a.mo5309a("translationXCurveDownwards");
            hVar = eVar.f7326a;
            str = "translationYCurveDownwards";
        } else {
            iVar = eVar.f7326a.mo5309a("translationXCurveUpwards");
            hVar = eVar.f7326a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(iVar, hVar.mo5309a(str));
    }

    /* renamed from: a */
    private ViewGroup m10871a(View view) {
        View findViewById = view.findViewById(C1173f.mtrl_child_content_container);
        return findViewById != null ? m10885c(findViewById) : ((view instanceof C2756b) || (view instanceof C2755a)) ? m10885c(((ViewGroup) view).getChildAt(0)) : m10885c(view);
    }

    /* renamed from: a */
    private void m10872a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: a */
    private void m10873a(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    /* renamed from: a */
    private void m10874a(View view, RectF rectF) {
        m10882b(view, rectF);
        rectF.offset(this.f7317g, this.f7318h);
    }

    /* renamed from: a */
    private void m10875a(View view, View view2, boolean z, C2753e eVar, List<Animator> list) {
        float c = m10884c(view, view2, eVar.f7327b);
        float d = m10887d(view, view2, eVar.f7327b);
        Pair<C1187i, C1187i> a = m10870a(c, d, z, eVar);
        C1187i iVar = (C1187i) a.first;
        C1187i iVar2 = (C1187i) a.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            c = this.f7317g;
        }
        fArr[0] = c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            d = this.f7318h;
        }
        fArr2[0] = d;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.mo5317a((Animator) ofFloat);
        iVar2.mo5317a((Animator) ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: a */
    private void m10876a(View view, View view2, boolean z, boolean z2, C2753e eVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C2753e eVar2 = eVar;
        if (view4 instanceof C1200d) {
            C1200d dVar = (C1200d) view4;
            float a = m10868a(view3, view4, eVar2.f7327b);
            float b = m10880b(view3, view4, eVar2.f7327b);
            ((FloatingActionButton) view3).mo8331a(this.f7313c);
            float width = ((float) this.f7313c.width()) / 2.0f;
            C1187i a2 = eVar2.f7326a.mo5309a("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new C1200d.C1205e(a, b, width));
                }
                if (z2) {
                    width = dVar.getRevealInfo().f3959c;
                }
                animator = C1195a.m5801a(dVar, a, b, C1213a.m5848a(a, b, 0.0f, 0.0f, f, f2));
                animator.addListener(new C2752d(this, dVar));
                m10872a(view2, a2.mo5316a(), (int) a, (int) b, width, list);
            } else {
                float f3 = dVar.getRevealInfo().f3959c;
                Animator a3 = C1195a.m5801a(dVar, a, b, width);
                int i = (int) a;
                int i2 = (int) b;
                View view5 = view2;
                m10872a(view5, a2.mo5316a(), i, i2, f3, list);
                long a4 = a2.mo5316a();
                long b2 = a2.mo5318b();
                long a5 = eVar2.f7326a.mo5308a();
                m10873a(view5, a4, b2, a5, i, i2, width, list);
                animator = a3;
            }
            a2.mo5317a(animator);
            list.add(animator);
            list2.add(C1195a.m5800a(dVar));
        }
    }

    /* renamed from: a */
    private void m10877a(View view, View view2, boolean z, boolean z2, C2753e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup a;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof C1200d) || C1198c.f3952a != 0) && (a = m10871a(view2)) != null) {
                if (z) {
                    if (!z2) {
                        C1182d.f3920a.set(a, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(a, C1182d.f3920a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(a, C1182d.f3920a, new float[]{0.0f});
                }
                eVar.f7326a.mo5309a("contentFade").mo5317a((Animator) objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    /* renamed from: a */
    private void m10878a(View view, View view2, boolean z, boolean z2, C2753e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        C2753e eVar2 = eVar;
        List<Animator> list3 = list;
        float c = m10884c(view3, view4, eVar2.f7327b);
        float d = m10887d(view3, view4, eVar2.f7327b);
        Pair<C1187i, C1187i> a = m10870a(c, d, z3, eVar2);
        C1187i iVar = (C1187i) a.first;
        C1187i iVar2 = (C1187i) a.second;
        if (z3) {
            if (!z2) {
                view4.setTranslationX(-c);
                view4.setTranslationY(-d);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            m10879a(view2, eVar, iVar, iVar2, -c, -d, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-c});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-d});
        }
        iVar.mo5317a((Animator) objectAnimator2);
        iVar2.mo5317a((Animator) objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    /* renamed from: a */
    private void m10879a(View view, C2753e eVar, C1187i iVar, C1187i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float a = m10869a(eVar, iVar, f, f3);
        float a2 = m10869a(eVar, iVar2, f2, f4);
        Rect rect = this.f7313c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f7314d;
        rectF2.set(rect);
        RectF rectF3 = this.f7315e;
        m10882b(view, rectF3);
        rectF3.offset(a, a2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: b */
    private float m10880b(View view, View view2, C1188j jVar) {
        RectF rectF = this.f7314d;
        RectF rectF2 = this.f7315e;
        m10874a(view, rectF);
        m10882b(view2, rectF2);
        rectF2.offset(0.0f, -m10887d(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: b */
    private int m10881b(View view) {
        ColorStateList g = C0890v.m4780g(view);
        if (g != null) {
            return g.getColorForState(view.getDrawableState(), g.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: b */
    private void m10882b(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f7316f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: b */
    private void m10883b(View view, View view2, boolean z, boolean z2, C2753e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof C1200d) {
            C1200d dVar = (C1200d) view2;
            int b = m10881b(view);
            int i = 16777215 & b;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(b);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, C1200d.C1204d.f3956a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, C1200d.C1204d.f3956a, new int[]{b});
            }
            objectAnimator.setEvaluator(C1181c.m5737a());
            eVar.f7326a.mo5309a("color").mo5317a((Animator) objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: c */
    private float m10884c(View view, View view2, C1188j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f7314d;
        RectF rectF2 = this.f7315e;
        m10874a(view, rectF);
        m10882b(view2, rectF2);
        int i = jVar.f3934a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f3935b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f3935b;
    }

    /* renamed from: c */
    private ViewGroup m10885c(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @TargetApi(21)
    /* renamed from: c */
    private void m10886c(View view, View view2, boolean z, boolean z2, C2753e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float k = C0890v.m4787k(view2) - C0890v.m4787k(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-k);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-k});
        }
        eVar.f7326a.mo5309a("elevation").mo5317a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: d */
    private float m10887d(View view, View view2, C1188j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f7314d;
        RectF rectF2 = this.f7315e;
        m10874a(view, rectF);
        m10882b(view2, rectF2);
        int i = jVar.f3934a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f3936c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f3936c;
    }

    /* renamed from: d */
    private void m10888d(View view, View view2, boolean z, boolean z2, C2753e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof C1200d) && (view instanceof ImageView)) {
            C1200d dVar = (C1200d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C1183e.f3921b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C1183e.f3921b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new C2750b(this, view2));
                eVar.f7326a.mo5309a("iconFade").mo5317a((Animator) objectAnimator);
                list.add(objectAnimator);
                list2.add(new C2751c(this, dVar, drawable));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C2753e mo8821a(Context context, boolean z);

    /* renamed from: a */
    public void mo1821a(CoordinatorLayout.C0268f fVar) {
        if (fVar.f1396h == 0) {
            fVar.f1396h = 80;
        }
    }

    /* renamed from: a */
    public boolean mo1837a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AnimatorSet mo8819b(View view, View view2, boolean z, boolean z2) {
        boolean z3 = z;
        C2753e a = mo8821a(view2.getContext(), z3);
        if (z3) {
            this.f7317g = view.getTranslationX();
            this.f7318h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m10886c(view, view2, z, z2, a, arrayList, arrayList2);
        }
        RectF rectF = this.f7314d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        m10878a(view3, view4, z4, z2, a, (List<Animator>) arrayList3, (List<Animator.AnimatorListener>) arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m10875a(view3, view4, z4, a, arrayList);
        boolean z5 = z2;
        C2753e eVar = a;
        m10888d(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        m10876a(view3, view4, z4, z5, eVar, width, height, (List<Animator>) arrayList, (List<Animator.AnimatorListener>) arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        m10883b(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        m10877a(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C1180b.m5736a(animatorSet, arrayList);
        animatorSet.addListener(new C2749a(this, z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }
}
