package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0192i;
import androidx.appcompat.widget.C0206m;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0328a;
import androidx.core.widget.C0352l;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C2643b;
import com.google.android.material.internal.C2663b;
import com.google.android.material.internal.C2678i;
import java.util.List;
import p006b.p021d.C0736g;
import p006b.p026g.p034j.C0837h;
import p006b.p026g.p035k.C0889u;
import p006b.p026g.p035k.C0890v;
import p054c.p083e.p084a.p085a.C1171d;
import p054c.p083e.p084a.p085a.C1178k;
import p054c.p083e.p084a.p085a.p086a0.C1167a;
import p054c.p083e.p084a.p085a.p087l.C1186h;
import p054c.p083e.p084a.p085a.p087l.C1189k;
import p054c.p083e.p084a.p085a.p096t.C1210a;
import p054c.p083e.p084a.p085a.p096t.C1212c;
import p054c.p083e.p084a.p085a.p101y.C1229b;
import p054c.p083e.p084a.p085a.p102z.C1238g;

@CoordinatorLayout.C0266d(Behavior.class)
public class FloatingActionButton extends C2678i implements C0889u, C0352l, C1210a {

    /* renamed from: g */
    private ColorStateList f6911g;

    /* renamed from: h */
    private PorterDuff.Mode f6912h;

    /* renamed from: i */
    private ColorStateList f6913i;

    /* renamed from: j */
    private PorterDuff.Mode f6914j;

    /* renamed from: k */
    private ColorStateList f6915k;

    /* renamed from: l */
    private int f6916l;

    /* renamed from: m */
    private int f6917m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f6918n;

    /* renamed from: o */
    private int f6919o;

    /* renamed from: p */
    boolean f6920p;

    /* renamed from: q */
    final Rect f6921q;

    /* renamed from: r */
    private final Rect f6922r;

    /* renamed from: s */
    private final C0206m f6923s;

    /* renamed from: t */
    private final C1212c f6924t;

    /* renamed from: u */
    private C2643b f6925u;

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.C0265c<T> {

        /* renamed from: a */
        private Rect f6926a;

        /* renamed from: b */
        private C2639b f6927b;

        /* renamed from: c */
        private boolean f6928c;

        public BaseBehavior() {
            this.f6928c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1178k.FloatingActionButton_Behavior_Layout);
            this.f6928c = obtainStyledAttributes.getBoolean(C1178k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private void m10387a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f6921q;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C0268f fVar = (CoordinatorLayout.C0268f) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    C0890v.m4777e(floatingActionButton, i);
                }
                if (i2 != 0) {
                    C0890v.m4775d(floatingActionButton, i2);
                }
            }
        }

        /* renamed from: a */
        private static boolean m10388a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0268f) {
                return ((CoordinatorLayout.C0268f) layoutParams).mo1864d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m10389a(View view, FloatingActionButton floatingActionButton) {
            return this.f6928c && ((CoordinatorLayout.C0268f) floatingActionButton.getLayoutParams()).mo1863c() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: a */
        private boolean m10390a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m10389a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f6926a == null) {
                this.f6926a = new Rect();
            }
            Rect rect = this.f6926a;
            C2663b.m10555a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo8330a(this.f6927b, false);
                return true;
            }
            floatingActionButton.mo8335b(this.f6927b, false);
            return true;
        }

        /* renamed from: b */
        private boolean m10391b(View view, FloatingActionButton floatingActionButton) {
            if (!m10389a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0268f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo8330a(this.f6927b, false);
                return true;
            }
            floatingActionButton.mo8335b(this.f6927b, false);
            return true;
        }

        /* renamed from: a */
        public void mo1821a(CoordinatorLayout.C0268f fVar) {
            if (fVar.f1396h == 0) {
                fVar.f1396h = 80;
            }
        }

        /* renamed from: a */
        public boolean mo1832a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> b = coordinatorLayout.mo1779b((View) floatingActionButton);
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = b.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m10388a(view) && m10391b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m10390a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo1785c((View) floatingActionButton, i);
            m10387a(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean mo1834a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f6921q;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean mo1842b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m10390a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m10388a(view)) {
                return false;
            } else {
                m10391b(view, floatingActionButton);
                return false;
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    class C2638a implements C2643b.C2652i {

        /* renamed from: a */
        final /* synthetic */ C2639b f6929a;

        C2638a(C2639b bVar) {
            this.f6929a = bVar;
        }

        /* renamed from: a */
        public void mo8398a() {
            this.f6929a.mo7814b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo8399b() {
            this.f6929a.mo7813a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class C2639b {
        /* renamed from: a */
        public void mo7813a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo7814b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    private class C2640c implements C1229b {
        C2640c() {
        }

        /* renamed from: a */
        public void mo5479a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f6921q.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f6918n, i2 + FloatingActionButton.this.f6918n, i3 + FloatingActionButton.this.f6918n, i4 + FloatingActionButton.this.f6918n);
        }

        /* renamed from: a */
        public void mo5480a(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        /* renamed from: a */
        public boolean mo5481a() {
            return FloatingActionButton.this.f6920p;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    class C2641d<T extends FloatingActionButton> implements C2643b.C2651h {

        /* renamed from: a */
        private final C1189k<T> f6932a;

        C2641d(C1189k<T> kVar) {
            this.f6932a = kVar;
        }

        /* renamed from: a */
        public void mo8400a() {
            this.f6932a.mo5325a(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo8401b() {
            this.f6932a.mo5326b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C2641d) && ((C2641d) obj).f6932a.equals(this.f6932a);
        }

        public int hashCode() {
            return this.f6932a.hashCode();
        }
    }

    /* renamed from: a */
    private int m10366a(int i) {
        int i2 = this.f6917m;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m10366a(1) : m10366a(0);
        }
        return resources.getDimensionPixelSize(i != 1 ? C1171d.design_fab_size_normal : C1171d.design_fab_size_mini);
    }

    /* renamed from: a */
    private static int m10367a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private boolean m10370a(C1238g gVar) {
        return gVar.mo5539h().mo5482a() == -1.0f;
    }

    /* renamed from: c */
    private C2643b.C2652i m10371c(C2639b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C2638a(bVar);
    }

    /* renamed from: c */
    private void m10372c(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f6921q;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: d */
    private C2643b m10373d() {
        return Build.VERSION.SDK_INT >= 21 ? new C2655c(this, new C2640c()) : new C2643b(this, new C2640c());
    }

    /* renamed from: e */
    private void m10374e() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f6913i;
            if (colorStateList == null) {
                C0328a.m1618b(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f6914j;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0192i.m961a(colorForState, mode));
        }
    }

    private C2643b getImpl() {
        if (this.f6925u == null) {
            this.f6925u = m10373d();
        }
        return this.f6925u;
    }

    /* renamed from: a */
    public void mo8327a(Animator.AnimatorListener animatorListener) {
        getImpl().mo8409a(animatorListener);
    }

    /* renamed from: a */
    public void mo8328a(C1189k<? extends FloatingActionButton> kVar) {
        getImpl().mo8415a((C2643b.C2651h) new C2641d(kVar));
    }

    /* renamed from: a */
    public void mo8329a(C2639b bVar) {
        mo8330a(bVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8330a(C2639b bVar, boolean z) {
        getImpl().mo8416a(m10371c(bVar), z);
    }

    /* renamed from: a */
    public boolean mo5445a() {
        this.f6924t.mo5449b();
        throw null;
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo8331a(Rect rect) {
        if (!C0890v.m4732C(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m10372c(rect);
        return true;
    }

    /* renamed from: b */
    public void mo8332b(Animator.AnimatorListener animatorListener) {
        getImpl().mo8421b(animatorListener);
    }

    /* renamed from: b */
    public void mo8333b(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m10372c(rect);
    }

    /* renamed from: b */
    public void mo8334b(C2639b bVar) {
        mo8335b(bVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8335b(C2639b bVar, boolean z) {
        getImpl().mo8425b(m10371c(bVar), z);
    }

    /* renamed from: b */
    public boolean mo8336b() {
        return getImpl().mo8436i();
    }

    /* renamed from: c */
    public boolean mo8337c() {
        return getImpl().mo8437j();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo8418a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.f6911g;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f6912h;
    }

    public float getCompatElevation() {
        return getImpl().mo8419b();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo8431e();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo8433f();
    }

    public Drawable getContentBackground() {
        return getImpl().mo8406a();
    }

    public int getCustomSize() {
        return this.f6917m;
    }

    public int getExpandedComponentIdHint() {
        this.f6924t.mo5446a();
        throw null;
    }

    public C1186h getHideMotionSpec() {
        return getImpl().mo8429d();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f6915k;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f6915k;
    }

    public C1238g getShapeAppearance() {
        C1238g g = getImpl().mo8434g();
        C0837h.m4534a(g);
        return g;
    }

    public C1186h getShowMotionSpec() {
        return getImpl().mo8435h();
    }

    public int getSize() {
        return this.f6916l;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m10366a(this.f6916l);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f6913i;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f6914j;
    }

    public boolean getUseCompatPadding() {
        return this.f6920p;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo8438k();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo8439l();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo8441n();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f6918n = (sizeDimension - this.f6919o) / 2;
        getImpl().mo8450w();
        int min = Math.min(m10367a(sizeDimension, i), m10367a(sizeDimension, i2));
        Rect rect = this.f6921q;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1167a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1167a aVar = (C1167a) parcelable;
        super.onRestoreInstanceState(aVar.mo4725q());
        C1212c cVar = this.f6924t;
        Bundle bundle = aVar.f3895h.get("expandableWidgetHelper");
        C0837h.m4534a(bundle);
        cVar.mo5448a(bundle);
        throw null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        C0736g<String, Bundle> gVar = new C1167a(onSaveInstanceState).f3895h;
        this.f6924t.mo5450c();
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo8331a(this.f6922r) || this.f6922r.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f6911g != colorStateList) {
            this.f6911g = colorStateList;
            getImpl().mo8410a(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f6912h != mode) {
            this.f6912h = mode;
            getImpl().mo8411a(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo8407a(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo8420b(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo8430d(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f6917m) {
            this.f6917m = i;
            getImpl().mo8451x();
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().mo8432e(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().mo8428c()) {
            getImpl().mo8417a(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f6924t.mo5447a(i);
        throw null;
    }

    public void setHideMotionSpec(C1186h hVar) {
        getImpl().mo8413a(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C1186h.m5746a(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().mo8449v();
            if (this.f6913i != null) {
                m10374e();
            }
        }
    }

    public void setImageResource(int i) {
        this.f6923s.mo1497a(i);
        m10374e();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f6915k != colorStateList) {
            this.f6915k = colorStateList;
            getImpl().mo8422b(this.f6915k);
        }
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo8443p();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo8443p();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().mo8426b(z);
    }

    public void setShapeAppearance(C1238g gVar) {
        getImpl().mo8414a(gVar, m10370a(gVar));
    }

    public void setShowMotionSpec(C1186h hVar) {
        getImpl().mo8424b(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C1186h.m5746a(getContext(), i));
    }

    public void setSize(int i) {
        this.f6917m = 0;
        if (i != this.f6916l) {
            this.f6916l = i;
            getImpl().mo8451x();
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f6913i != colorStateList) {
            this.f6913i = colorStateList;
            m10374e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f6914j != mode) {
            this.f6914j = mode;
            m10374e();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo8444q();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo8444q();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo8444q();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f6920p != z) {
            this.f6920p = z;
            getImpl().mo8440m();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }
}
