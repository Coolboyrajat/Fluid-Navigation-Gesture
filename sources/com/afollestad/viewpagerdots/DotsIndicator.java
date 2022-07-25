package com.afollestad.viewpagerdots;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.core.content.C0311a;
import androidx.viewpager.widget.C0649a;
import androidx.viewpager.widget.ViewPager;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;

public final class DotsIndicator extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ViewPager f4723f;

    /* renamed from: g */
    private int f4724g;

    /* renamed from: h */
    private int f4725h;

    /* renamed from: i */
    private int f4726i;

    /* renamed from: j */
    private int f4727j;

    /* renamed from: k */
    private int f4728k;

    /* renamed from: l */
    private Animator f4729l;

    /* renamed from: m */
    private Animator f4730m;

    /* renamed from: n */
    private Animator f4731n;

    /* renamed from: o */
    private Animator f4732o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f4733p;

    /* renamed from: q */
    private int f4734q;

    /* renamed from: r */
    private int f4735r;

    /* renamed from: s */
    private int f4736s;

    /* renamed from: t */
    private int f4737t;

    /* renamed from: u */
    private int f4738u;

    /* renamed from: v */
    private final C1610c f4739v;

    /* renamed from: com.afollestad.viewpagerdots.DotsIndicator$a */
    public static final class C1608a {
        private C1608a() {
        }

        public /* synthetic */ C1608a(C3366g gVar) {
            this();
        }
    }

    /* renamed from: com.afollestad.viewpagerdots.DotsIndicator$b */
    private final class C1609b implements Interpolator {
        public C1609b(DotsIndicator dotsIndicator) {
        }

        public float getInterpolation(float f) {
            return Math.abs(1.0f - f);
        }
    }

    /* renamed from: com.afollestad.viewpagerdots.DotsIndicator$c */
    public static final class C1610c implements ViewPager.C0643j {

        /* renamed from: f */
        final /* synthetic */ DotsIndicator f4740f;

        C1610c(DotsIndicator dotsIndicator) {
            this.f4740f = dotsIndicator;
        }

        /* renamed from: a */
        public void mo3741a(int i) {
        }

        /* renamed from: a */
        public void mo3742a(int i, float f, int i2) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getAdapter();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3743b(int r2) {
            /*
                r1 = this;
                com.afollestad.viewpagerdots.DotsIndicator r0 = r1.f4740f
                androidx.viewpager.widget.ViewPager r0 = r0.f4723f
                if (r0 == 0) goto L_0x0013
                androidx.viewpager.widget.a r0 = r0.getAdapter()
                if (r0 == 0) goto L_0x0013
                int r0 = r0.mo3754a()
                goto L_0x0014
            L_0x0013:
                r0 = 0
            L_0x0014:
                if (r0 > 0) goto L_0x0017
                return
            L_0x0017:
                com.afollestad.viewpagerdots.DotsIndicator r0 = r1.f4740f
                r0.m7018b(r2)
                com.afollestad.viewpagerdots.DotsIndicator r0 = r1.f4740f
                r0.f4733p = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.viewpagerdots.DotsIndicator.C1610c.mo3743b(int):void");
        }
    }

    static {
        new C1608a((C3366g) null);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DotsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3370k.m12227b(context, "context");
        this.f4724g = -1;
        this.f4725h = -1;
        this.f4726i = -1;
        this.f4733p = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1613c.DotsIndicator);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1613c.DotsIndicator_dot_width, -1);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(C1613c.DotsIndicator_dot_height, -1);
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(C1613c.DotsIndicator_dot_margin, -1);
            int i = obtainStyledAttributes.getInt(C1613c.DotsIndicator_dots_orientation, -1);
            int i2 = obtainStyledAttributes.getInt(C1613c.DotsIndicator_dots_gravity, -1);
            this.f4734q = obtainStyledAttributes.getResourceId(C1613c.DotsIndicator_dots_animator, C1611a.scale_with_alpha);
            int i3 = 0;
            this.f4735r = obtainStyledAttributes.getResourceId(C1613c.DotsIndicator_dots_animator_reverse, 0);
            this.f4736s = obtainStyledAttributes.getResourceId(C1613c.DotsIndicator_dot_drawable, C1612b.black_dot);
            this.f4737t = obtainStyledAttributes.getResourceId(C1613c.DotsIndicator_dot_drawable_unselected, this.f4736s);
            this.f4738u = obtainStyledAttributes.getColor(C1613c.DotsIndicator_dot_tint, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            C3370k.m12223a((Object) resources, "resources");
            int applyDimension = (int) (TypedValue.applyDimension(1, (float) 5, resources.getDisplayMetrics()) + 0.5f);
            this.f4725h = dimensionPixelSize < 0 ? applyDimension : dimensionPixelSize;
            this.f4726i = dimensionPixelSize2 < 0 ? applyDimension : dimensionPixelSize2;
            this.f4724g = dimensionPixelSize3 >= 0 ? dimensionPixelSize3 : applyDimension;
            Animator b = m7017b();
            C3370k.m12223a((Object) b, "createAnimatorOut()");
            this.f4729l = b;
            Animator b2 = m7017b();
            C3370k.m12223a((Object) b2, "createAnimatorOut()");
            this.f4731n = b2;
            this.f4731n.setDuration(0);
            this.f4730m = m7012a();
            this.f4732o = m7012a();
            this.f4732o.setDuration(0);
            int i4 = this.f4736s;
            this.f4727j = i4 == 0 ? C1612b.black_dot : i4;
            int i5 = this.f4737t;
            this.f4728k = i5 == 0 ? this.f4736s : i5;
            setOrientation(i == 1 ? 1 : i3);
            setGravity(i2 < 0 ? 17 : i2);
            this.f4739v = new C1610c(this);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DotsIndicator(Context context, AttributeSet attributeSet, int i, C3366g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: a */
    private final Animator m7012a() {
        if (this.f4735r == 0) {
            Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), this.f4734q);
            C3370k.m12223a((Object) loadAnimator, "loadAnimator(context, this.animatorResId)");
            loadAnimator.setInterpolator(new C1609b(this));
            return loadAnimator;
        }
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(getContext(), this.f4735r);
        C3370k.m12223a((Object) loadAnimator2, "loadAnimator(context, this.animatorReverseResId)");
        return loadAnimator2;
    }

    /* renamed from: a */
    private final void m7014a(int i) {
        int i2 = 0;
        while (i2 < i) {
            m7015a(getOrientation(), m7021d() == i2 ? this.f4727j : this.f4728k, m7021d() == i2 ? this.f4731n : this.f4732o);
            i2++;
        }
    }

    /* renamed from: a */
    private final void m7015a(int i, int i2, Animator animator) {
        if (animator.isRunning()) {
            animator.end();
            animator.cancel();
        }
        View view = new View(getContext());
        Drawable c = C0311a.m1534c(getContext(), i2);
        int i3 = this.f4738u;
        if (i3 != 0) {
            c = c != null ? C1614d.m7027a(c, i3) : null;
        }
        view.setBackground(c);
        addView(view, this.f4725h, this.f4726i);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (i == 0) {
                int i4 = this.f4724g;
                layoutParams2.leftMargin = i4;
                layoutParams2.rightMargin = i4;
            } else {
                int i5 = this.f4724g;
                layoutParams2.topMargin = i5;
                layoutParams2.bottomMargin = i5;
            }
            view.setLayoutParams(layoutParams2);
            animator.setTarget(view);
            animator.start();
            return;
        }
        throw new C3269p("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: b */
    private final Animator m7017b() {
        return AnimatorInflater.loadAnimator(getContext(), this.f4734q);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m7018b(int i) {
        if (this.f4730m.isRunning()) {
            this.f4730m.end();
            this.f4730m.cancel();
        }
        if (this.f4729l.isRunning()) {
            this.f4729l.end();
            this.f4729l.cancel();
        }
        int i2 = this.f4733p;
        View childAt = i2 >= 0 ? getChildAt(i2) : null;
        if (childAt != null) {
            childAt.setBackgroundResource(this.f4728k);
            this.f4730m.setTarget(childAt);
            this.f4730m.start();
        }
        View childAt2 = getChildAt(i);
        if (childAt2 != null) {
            childAt2.setBackgroundResource(this.f4727j);
            this.f4729l.setTarget(childAt2);
            this.f4729l.start();
        }
    }

    /* renamed from: c */
    private final void m7020c() {
        removeAllViews();
        ViewPager viewPager = this.f4723f;
        if (viewPager != null) {
            C0649a adapter = viewPager.getAdapter();
            int a = adapter != null ? adapter.mo3754a() : 0;
            if (a > 0) {
                m7014a(a);
                return;
            }
            return;
        }
        C3370k.m12221a();
        throw null;
    }

    /* renamed from: d */
    private final int m7021d() {
        ViewPager viewPager = this.f4723f;
        if (viewPager != null) {
            return viewPager.getCurrentItem();
        }
        return -1;
    }

    /* renamed from: e */
    private final void m7022e() {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            Drawable c = C0311a.m1534c(getContext(), m7021d() == i ? this.f4727j : this.f4728k);
            int i2 = this.f4738u;
            if (i2 != 0) {
                c = c != null ? C1614d.m7027a(c, i2) : null;
            }
            C3370k.m12223a((Object) childAt, "indicator");
            childAt.setBackground(c);
            i++;
        }
    }

    /* renamed from: a */
    public final void mo6201a(ViewPager viewPager) {
        this.f4723f = viewPager;
        ViewPager viewPager2 = this.f4723f;
        if (viewPager2 != null && viewPager2.getAdapter() != null) {
            this.f4733p = -1;
            m7020c();
            viewPager2.mo3695b((ViewPager.C0643j) this.f4739v);
            viewPager2.mo3685a((ViewPager.C0643j) this.f4739v);
            this.f4739v.mo3743b(viewPager2.getCurrentItem());
        }
    }

    public final void setDotTint(int i) {
        this.f4738u = i;
        m7022e();
    }

    public final void setDotTintRes(int i) {
        setDotTint(C0311a.m1528a(getContext(), i));
    }
}
