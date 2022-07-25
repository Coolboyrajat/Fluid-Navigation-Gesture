package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0328a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C2672g;
import com.google.android.material.internal.C2673h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p006b.p026g.p035k.C0852d0;
import p006b.p026g.p035k.C0890v;
import p006b.p039i.p040a.C0912a;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1171d;
import p054c.p083e.p084a.p085a.C1177j;
import p054c.p083e.p084a.p085a.C1178k;
import p054c.p083e.p084a.p085a.p087l.C1189k;
import p054c.p083e.p084a.p085a.p099w.C1218c;
import p054c.p083e.p084a.p085a.p102z.C1232c;
import p054c.p083e.p084a.p085a.p102z.C1233d;
import p054c.p083e.p084a.p085a.p102z.C1236e;
import p054c.p083e.p084a.p085a.p102z.C1238g;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.C0264b {

    /* renamed from: l0 */
    private static final int f6594l0 = C1177j.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: U */
    private final int f6595U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C1233d f6596V;

    /* renamed from: W */
    private Animator f6597W;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public Animator f6598a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public int f6599b0;

    /* renamed from: c0 */
    private int f6600c0;

    /* renamed from: d0 */
    private boolean f6601d0;

    /* renamed from: e0 */
    private int f6602e0;

    /* renamed from: f0 */
    private ArrayList<C2574i> f6603f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public boolean f6604g0;

    /* renamed from: h0 */
    private Behavior f6605h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public int f6606i0;

    /* renamed from: j0 */
    AnimatorListenerAdapter f6607j0;

    /* renamed from: k0 */
    C1189k<FloatingActionButton> f6608k0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final Rect f6609e = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public WeakReference<BottomAppBar> f6610f;

        /* renamed from: g */
        private final View.OnLayoutChangeListener f6611g = new C2564a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        class C2564a implements View.OnLayoutChangeListener {
            C2564a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f6610f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.mo8333b(Behavior.this.f6609e);
                if (bottomAppBar.mo7787c(Behavior.this.f6609e.height())) {
                    CoordinatorLayout.C0268f fVar = (CoordinatorLayout.C0268f) view.getLayoutParams();
                    if (fVar.bottomMargin == 0) {
                        fVar.bottomMargin = Math.max(bottomAppBar.getBottomInset(), bottomAppBar.getResources().getDimensionPixelOffset(C1171d.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - Behavior.this.f6609e.height()) / 2));
                    }
                }
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public boolean mo1832a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f6610f = new WeakReference<>(bottomAppBar);
            View f = bottomAppBar.m9932p();
            if (f != null && !C0890v.m4732C(f)) {
                ((CoordinatorLayout.C0268f) f.getLayoutParams()).f1392d = 49;
                if (f instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) f;
                    floatingActionButton.addOnLayoutChangeListener(this.f6611g);
                    bottomAppBar.m9912a(floatingActionButton);
                }
                bottomAppBar.m9935s();
            }
            coordinatorLayout.mo1785c((View) bottomAppBar, i);
            return super.mo1832a(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: a */
        public boolean mo1844b(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo1844b(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    class C2565a extends AnimatorListenerAdapter {
        C2565a() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.m9907a(bottomAppBar.f6599b0, BottomAppBar.this.f6604g0);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    class C2566b implements C1189k<FloatingActionButton> {
        C2566b() {
        }

        /* renamed from: a */
        public void mo5325a(FloatingActionButton floatingActionButton) {
            BottomAppBar.this.f6596V.mo5497b(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        /* renamed from: b */
        public void mo5326b(FloatingActionButton floatingActionButton) {
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().mo7833e() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().mo7834e(translationX);
                BottomAppBar.this.f6596V.invalidateSelf();
            }
            float f = -floatingActionButton.getTranslationY();
            if (BottomAppBar.this.getTopEdgeTreatment().mo7825a() != f) {
                BottomAppBar.this.getTopEdgeTreatment().mo7826a(f);
                BottomAppBar.this.f6596V.invalidateSelf();
            }
            BottomAppBar.this.f6596V.mo5497b(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    class C2567c implements C2673h.C2676c {
        C2567c() {
        }

        /* renamed from: a */
        public C0852d0 mo7810a(View view, C0852d0 d0Var, C2673h.C2677d dVar) {
            int unused = BottomAppBar.this.f6606i0 = d0Var.mo4570a();
            dVar.f7091d += d0Var.mo4570a();
            dVar.mo8558a(view);
            return d0Var;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    class C2568d extends AnimatorListenerAdapter {
        C2568d() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m9929m();
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m9930n();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    class C2569e extends FloatingActionButton.C2639b {

        /* renamed from: a */
        final /* synthetic */ int f6617a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e$a */
        class C2570a extends FloatingActionButton.C2639b {
            C2570a() {
            }

            /* renamed from: b */
            public void mo7814b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m9929m();
            }
        }

        C2569e(int i) {
            this.f6617a = i;
        }

        /* renamed from: a */
        public void mo7813a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m9918d(this.f6617a));
            floatingActionButton.mo8334b((FloatingActionButton.C2639b) new C2570a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    class C2571f extends AnimatorListenerAdapter {
        C2571f() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m9929m();
            Animator unused = BottomAppBar.this.f6598a0 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m9930n();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    class C2572g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f6621a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f6622b;

        /* renamed from: c */
        final /* synthetic */ int f6623c;

        /* renamed from: d */
        final /* synthetic */ boolean f6624d;

        C2572g(ActionMenuView actionMenuView, int i, boolean z) {
            this.f6622b = actionMenuView;
            this.f6623c = i;
            this.f6624d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f6621a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f6621a) {
                BottomAppBar.this.m9915b(this.f6622b, this.f6623c, this.f6624d);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h */
    class C2573h extends AnimatorListenerAdapter {
        C2573h() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f6607j0.onAnimationStart(animator);
            FloatingActionButton c = BottomAppBar.this.m9931o();
            if (c != null) {
                c.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$i */
    interface C2574i {
        /* renamed from: a */
        void mo7820a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void mo7821b(BottomAppBar bottomAppBar);
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$j */
    static class C2575j extends C0912a {
        public static final Parcelable.Creator<C2575j> CREATOR = new C2576a();

        /* renamed from: h */
        int f6627h;

        /* renamed from: i */
        boolean f6628i;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$j$a */
        static class C2576a implements Parcelable.ClassLoaderCreator<C2575j> {
            C2576a() {
            }

            public C2575j createFromParcel(Parcel parcel) {
                return new C2575j(parcel, (ClassLoader) null);
            }

            public C2575j createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2575j(parcel, classLoader);
            }

            public C2575j[] newArray(int i) {
                return new C2575j[i];
            }
        }

        public C2575j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6627h = parcel.readInt();
            this.f6628i = parcel.readInt() != 0;
        }

        public C2575j(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6627h);
            parcel.writeInt(this.f6628i ? 1 : 0);
        }
    }

    public BottomAppBar(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1169b.bottomAppBarStyle);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        super(C2672g.m10585b(context, attributeSet, i, f6594l0), attributeSet, i);
        this.f6596V = new C1233d();
        this.f6602e0 = 0;
        this.f6604g0 = true;
        this.f6607j0 = new C2565a();
        this.f6608k0 = new C2566b();
        Context context2 = getContext();
        TypedArray c = C2672g.m10589c(context2, attributeSet, C1178k.BottomAppBar, i, f6594l0, new int[0]);
        ColorStateList a = C1218c.m5861a(context2, c, C1178k.BottomAppBar_backgroundTint);
        int dimensionPixelSize = c.getDimensionPixelSize(C1178k.BottomAppBar_elevation, 0);
        this.f6599b0 = c.getInt(C1178k.BottomAppBar_fabAlignmentMode, 0);
        this.f6600c0 = c.getInt(C1178k.BottomAppBar_fabAnimationMode, 0);
        this.f6601d0 = c.getBoolean(C1178k.BottomAppBar_hideOnScroll, false);
        c.recycle();
        this.f6595U = getResources().getDimensionPixelOffset(C1171d.mtrl_bottomappbar_fabOffsetEndMode);
        C2577a aVar = new C2577a((float) c.getDimensionPixelOffset(C1178k.BottomAppBar_fabCradleMargin, 0), (float) c.getDimensionPixelOffset(C1178k.BottomAppBar_fabCradleRoundedCornerRadius, 0), (float) c.getDimensionPixelOffset(C1178k.BottomAppBar_fabCradleVerticalOffset, 0));
        C1238g.C1240b l = C1238g.m5969l();
        l.mo5546a((C1232c) aVar);
        this.f6596V.setShapeAppearanceModel(l.mo5547a());
        this.f6596V.mo5498b(2);
        this.f6596V.mo5494a(Paint.Style.FILL);
        this.f6596V.mo5491a(context2);
        setElevation((float) dimensionPixelSize);
        C0328a.m1611a((Drawable) this.f6596V, a);
        C0890v.m4751a((View) this, (Drawable) this.f6596V);
        C2673h.m10594a((View) this, (C2673h.C2676c) new C2567c());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9907a(int i, boolean z) {
        if (C0890v.m4732C(this)) {
            Animator animator = this.f6598a0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m9933q()) {
                i = 0;
                z = false;
            }
            m9908a(i, z, (List<Animator>) arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f6598a0 = animatorSet;
            this.f6598a0.addListener(new C2571f());
            this.f6598a0.start();
        }
    }

    /* renamed from: a */
    private void m9908a(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo7784a(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new C2572g(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9912a(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo8327a((Animator.AnimatorListener) this.f6607j0);
        floatingActionButton.mo8332b((Animator.AnimatorListener) new C2573h());
        floatingActionButton.mo8328a((C1189k<? extends FloatingActionButton>) this.f6608k0);
    }

    /* renamed from: b */
    private void m9914b(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m9931o(), "translationX", new float[]{m9918d(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m9915b(ActionMenuView actionMenuView, int i, boolean z) {
        actionMenuView.setTranslationX((float) mo7784a(actionMenuView, i, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public float m9918d(int i) {
        int i2 = 1;
        boolean z = C0890v.m4791o(this) == 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.f6595U;
        if (z) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    /* renamed from: e */
    private void m9921e(int i) {
        if (this.f6599b0 != i && C0890v.m4732C(this)) {
            Animator animator = this.f6597W;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f6600c0 == 1) {
                m9914b(i, (List<Animator>) arrayList);
            } else {
                mo7785a(i, (List<Animator>) arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f6597W = animatorSet;
            this.f6597W.addListener(new C2568d());
            this.f6597W.start();
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f6606i0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return m9918d(this.f6599b0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().mo7825a();
    }

    /* access modifiers changed from: private */
    public C2577a getTopEdgeTreatment() {
        return (C2577a) this.f6596V.mo5514i().mo5537f();
    }

    /* renamed from: l */
    private void m9928l() {
        Animator animator = this.f6598a0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f6597W;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m9929m() {
        ArrayList<C2574i> arrayList;
        int i = this.f6602e0 - 1;
        this.f6602e0 = i;
        if (i == 0 && (arrayList = this.f6603f0) != null) {
            Iterator<C2574i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo7820a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m9930n() {
        ArrayList<C2574i> arrayList;
        int i = this.f6602e0;
        this.f6602e0 = i + 1;
        if (i == 0 && (arrayList = this.f6603f0) != null) {
            Iterator<C2574i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo7821b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public FloatingActionButton m9931o() {
        View p = m9932p();
        if (p instanceof FloatingActionButton) {
            return (FloatingActionButton) p;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View m9932p() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.mo1783c((android.view.View) r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.m9932p():android.view.View");
    }

    /* renamed from: q */
    private boolean m9933q() {
        FloatingActionButton o = m9931o();
        return o != null && o.mo8337c();
    }

    /* renamed from: r */
    private void m9934r() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!m9933q()) {
                m9915b(actionMenuView, 0, false);
            } else {
                m9915b(actionMenuView, this.f6599b0, this.f6604g0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m9935s() {
        getTopEdgeTreatment().mo7834e(getFabTranslationX());
        View p = m9932p();
        this.f6596V.mo5497b((!this.f6604g0 || !m9933q()) ? 0.0f : 1.0f);
        if (p != null) {
            p.setTranslationY(getFabTranslationY());
            p.setTranslationX(getFabTranslationX());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo7784a(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = C0890v.m4791o(this) == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0143e) && (((Toolbar.C0143e) childAt.getLayoutParams()).f141a & 8388615) == 8388611) {
                measuredWidth = z2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = measuredWidth - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft());
        if (i != 1 || !z) {
            return 0;
        }
        return right;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7785a(int i, List<Animator> list) {
        FloatingActionButton o = m9931o();
        if (o != null && !o.mo8336b()) {
            m9930n();
            o.mo8329a((FloatingActionButton.C2639b) new C2569e(i));
        }
    }

    /* renamed from: b */
    public void mo7786b(int i) {
        getMenu().clear();
        mo1076a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo7787c(int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().mo7831d()) {
            return false;
        }
        getTopEdgeTreatment().mo7832d(f);
        this.f6596V.invalidateSelf();
        return true;
    }

    public ColorStateList getBackgroundTint() {
        return this.f6596V.mo5517j();
    }

    public Behavior getBehavior() {
        if (this.f6605h0 == null) {
            this.f6605h0 = new Behavior();
        }
        return this.f6605h0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().mo7825a();
    }

    public int getFabAlignmentMode() {
        return this.f6599b0;
    }

    public int getFabAnimationMode() {
        return this.f6600c0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().mo7827b();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().mo7829c();
    }

    public boolean getHideOnScroll() {
        return this.f6601d0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1236e.m5960a((View) this, this.f6596V);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m9928l();
            m9935s();
        }
        m9934r();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2575j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2575j jVar = (C2575j) parcelable;
        super.onRestoreInstanceState(jVar.mo4725q());
        this.f6599b0 = jVar.f6627h;
        this.f6604g0 = jVar.f6628i;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C2575j jVar = new C2575j(super.onSaveInstanceState());
        jVar.f6627h = this.f6599b0;
        jVar.f6628i = this.f6604g0;
        return jVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0328a.m1611a((Drawable) this.f6596V, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().mo7826a(f);
            this.f6596V.invalidateSelf();
            m9935s();
        }
    }

    public void setElevation(float f) {
        this.f6596V.mo5486a(f);
        getBehavior().mo7773a(this, this.f6596V.mo5513h() - this.f6596V.mo5507g());
    }

    public void setFabAlignmentMode(int i) {
        m9921e(i);
        m9907a(i, this.f6604g0);
        this.f6599b0 = i;
    }

    public void setFabAnimationMode(int i) {
        this.f6600c0 = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().mo7828b(f);
            this.f6596V.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().mo7830c(f);
            this.f6596V.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f6601d0 = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
