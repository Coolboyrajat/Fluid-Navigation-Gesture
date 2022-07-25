package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C2663b;
import java.util.List;
import p006b.p026g.p035k.C0890v;
import p054c.p083e.p084a.p085a.C1178k;
import p054c.p083e.p084a.p085a.p087l.C1186h;
import p054c.p083e.p084a.p085a.p102z.C1238g;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.C0264b {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final C2656d f6895A;

    /* renamed from: B */
    private final CoordinatorLayout.C0265c<ExtendedFloatingActionButton> f6896B;

    /* renamed from: C */
    private boolean f6897C;

    /* renamed from: D */
    private boolean f6898D;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final Rect f6899w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C2656d f6900x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C2656d f6901y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C2656d f6902z;

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.C0265c<T> {

        /* renamed from: a */
        private Rect f6903a;

        /* renamed from: b */
        private C2637e f6904b;

        /* renamed from: c */
        private C2637e f6905c;

        /* renamed from: d */
        private boolean f6906d;

        /* renamed from: e */
        private boolean f6907e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f6906d = false;
            this.f6907e = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1178k.ExtendedFloatingActionButton_Behavior_Layout);
            this.f6906d = obtainStyledAttributes.getBoolean(C1178k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f6907e = obtainStyledAttributes.getBoolean(C1178k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private void m10346a(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            Rect e = extendedFloatingActionButton.f6899w;
            if (e != null && e.centerX() > 0 && e.centerY() > 0) {
                CoordinatorLayout.C0268f fVar = (CoordinatorLayout.C0268f) extendedFloatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = extendedFloatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin ? e.right : extendedFloatingActionButton.getLeft() <= fVar.leftMargin ? -e.left : 0;
                if (extendedFloatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i = e.bottom;
                } else if (extendedFloatingActionButton.getTop() <= fVar.topMargin) {
                    i = -e.top;
                }
                if (i != 0) {
                    C0890v.m4777e(extendedFloatingActionButton, i);
                }
                if (i2 != 0) {
                    C0890v.m4775d(extendedFloatingActionButton, i2);
                }
            }
        }

        /* renamed from: a */
        private static boolean m10347a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0268f) {
                return ((CoordinatorLayout.C0268f) layoutParams).mo1864d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m10348a(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f6906d || this.f6907e) && ((CoordinatorLayout.C0268f) extendedFloatingActionButton.getLayoutParams()).mo1863c() == view.getId();
        }

        /* renamed from: a */
        private boolean m10349a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m10348a((View) appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f6903a == null) {
                this.f6903a = new Rect();
            }
            Rect rect = this.f6903a;
            C2663b.m10555a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo8311b(extendedFloatingActionButton);
                return true;
            }
            mo8307a(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: b */
        private boolean m10350b(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m10348a(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0268f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                mo8311b(extendedFloatingActionButton);
                return true;
            }
            mo8307a(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: a */
        public void mo1821a(CoordinatorLayout.C0268f fVar) {
            if (fVar.f1396h == 0) {
                fVar.f1396h = 80;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo8307a(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m10339a(this.f6907e ? extendedFloatingActionButton.f6901y : extendedFloatingActionButton.f6902z, this.f6907e ? this.f6905c : this.f6904b);
        }

        /* renamed from: a */
        public boolean mo1832a(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> b = coordinatorLayout.mo1779b((View) extendedFloatingActionButton);
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = b.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m10347a(view) && m10350b(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m10349a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo1785c((View) extendedFloatingActionButton, i);
            m10346a(coordinatorLayout, extendedFloatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean mo1834a(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            Rect e = extendedFloatingActionButton.f6899w;
            rect.set(extendedFloatingActionButton.getLeft() + e.left, extendedFloatingActionButton.getTop() + e.top, extendedFloatingActionButton.getRight() - e.right, extendedFloatingActionButton.getBottom() - e.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean mo1842b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m10349a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!m10347a(view)) {
                return false;
            } else {
                m10350b(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo8311b(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m10339a(this.f6907e ? extendedFloatingActionButton.f6900x : extendedFloatingActionButton.f6895A, this.f6907e ? this.f6905c : this.f6904b);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    class C2633a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f6908a;

        /* renamed from: b */
        final /* synthetic */ C2656d f6909b;

        /* renamed from: c */
        final /* synthetic */ C2637e f6910c;

        C2633a(ExtendedFloatingActionButton extendedFloatingActionButton, C2656d dVar, C2637e eVar) {
            this.f6909b = dVar;
            this.f6910c = eVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f6908a = true;
            this.f6909b.mo8467d();
        }

        public void onAnimationEnd(Animator animator) {
            this.f6909b.mo8466c();
            if (!this.f6908a) {
                this.f6909b.mo8464a(this.f6910c);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f6909b.onAnimationStart(animator);
            this.f6908a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    static class C2634b extends Property<View, Float> {
        C2634b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    static class C2635c extends Property<View, Float> {
        C2635c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    static class C2636d extends Property<View, Float> {
        C2636d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(((ExtendedFloatingActionButton) view).getShapeAppearanceModel().mo5539h().mo5482a());
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            extendedFloatingActionButton.setShapeAppearanceModel(extendedFloatingActionButton.getShapeAppearanceModel().mo5533b((float) f.intValue()));
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    public static abstract class C2637e {
    }

    static {
        new C2634b(Float.class, "width");
        new C2635c(Float.class, "height");
        new C2636d(Float.class, "cornerRadius");
    }

    /* renamed from: a */
    private int m10336a(int i) {
        return (i - 1) / 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10339a(C2656d dVar, C2637e eVar) {
        if (!dVar.mo8469f()) {
            if (!m10343c()) {
                dVar.mo8470g();
                dVar.mo8464a(eVar);
                return;
            }
            measure(0, 0);
            AnimatorSet b = dVar.mo8465b();
            b.addListener(new C2633a(this, dVar, eVar));
            for (Animator.AnimatorListener addListener : dVar.mo8468e()) {
                b.addListener(addListener);
            }
            b.start();
        }
    }

    /* renamed from: b */
    private C1238g m10340b() {
        return getShapeAppearanceModel().mo5533b((float) m10336a(getMeasuredHeight()));
    }

    /* renamed from: c */
    private boolean m10343c() {
        return C0890v.m4732C(this) && !isInEditMode();
    }

    public CoordinatorLayout.C0265c<ExtendedFloatingActionButton> getBehavior() {
        return this.f6896B;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedSize() {
        return (Math.min(C0890v.m4796t(this), C0890v.m4795s(this)) * 2) + getIconSize();
    }

    public C1186h getExtendMotionSpec() {
        return this.f6901y.mo8462a();
    }

    public C1186h getHideMotionSpec() {
        return this.f6895A.mo8462a();
    }

    public C1186h getShowMotionSpec() {
        return this.f6902z.mo8462a();
    }

    public C1186h getShrinkMotionSpec() {
        return this.f6900x.mo8462a();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6897C && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f6897C = false;
            this.f6900x.mo8470g();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f6898D) {
            setShapeAppearanceModel(m10340b());
        }
    }

    public void setCornerRadius(int i) {
        this.f6898D = i == -1;
        if (this.f6898D) {
            i = m10336a(getMeasuredHeight());
        } else if (i < 0) {
            i = 0;
        }
        super.setCornerRadius(i);
    }

    public void setExtendMotionSpec(C1186h hVar) {
        this.f6901y.mo8463a(hVar);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C1186h.m5746a(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f6897C != z) {
            C2656d dVar = z ? this.f6901y : this.f6900x;
            if (!dVar.mo8469f()) {
                dVar.mo8470g();
            }
        }
    }

    public void setHideMotionSpec(C1186h hVar) {
        this.f6895A.mo8463a(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C1186h.m5746a(getContext(), i));
    }

    public void setShapeAppearanceModel(C1238g gVar) {
        if (gVar.mo5541j()) {
            this.f6898D = true;
            gVar = m10340b();
        }
        super.setShapeAppearanceModel(gVar);
    }

    public void setShowMotionSpec(C1186h hVar) {
        this.f6902z.mo8463a(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C1186h.m5746a(getContext(), i));
    }

    public void setShrinkMotionSpec(C1186h hVar) {
        this.f6900x.mo8463a(hVar);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C1186h.m5746a(getContext(), i));
    }
}
