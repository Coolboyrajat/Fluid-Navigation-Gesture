package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p006b.p007a.C0659f;
import p006b.p007a.C0663j;
import p006b.p026g.p035k.C0890v;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: f */
    private boolean f537f;

    /* renamed from: g */
    private View f538g;

    /* renamed from: h */
    private View f539h;

    /* renamed from: i */
    private View f540i;

    /* renamed from: j */
    Drawable f541j;

    /* renamed from: k */
    Drawable f542k;

    /* renamed from: l */
    Drawable f543l;

    /* renamed from: m */
    boolean f544m;

    /* renamed from: n */
    boolean f545n;

    /* renamed from: o */
    private int f546o;

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0890v.m4751a((View) this, (Drawable) new C0153b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0663j.ActionBar);
        this.f541j = obtainStyledAttributes.getDrawable(C0663j.ActionBar_background);
        this.f542k = obtainStyledAttributes.getDrawable(C0663j.ActionBar_backgroundStacked);
        this.f546o = obtainStyledAttributes.getDimensionPixelSize(C0663j.ActionBar_height, -1);
        if (getId() == C0659f.split_action_bar) {
            this.f544m = true;
            this.f543l = obtainStyledAttributes.getDrawable(C0663j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f544m ? this.f541j == null && this.f542k == null : this.f543l == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m590a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m591b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f541j;
        if (drawable != null && drawable.isStateful()) {
            this.f541j.setState(getDrawableState());
        }
        Drawable drawable2 = this.f542k;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f542k.setState(getDrawableState());
        }
        Drawable drawable3 = this.f543l;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f543l.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f538g;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f541j;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f542k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f543l;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f539h = findViewById(C0659f.action_bar);
        this.f540i = findViewById(C0659f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f537f || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f538g;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f544m) {
            Drawable drawable3 = this.f543l;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f541j != null) {
                if (this.f539h.getVisibility() == 0) {
                    drawable2 = this.f541j;
                    left = this.f539h.getLeft();
                    top = this.f539h.getTop();
                    right = this.f539h.getRight();
                    view = this.f539h;
                } else {
                    View view3 = this.f540i;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f541j.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f541j;
                        left = this.f540i.getLeft();
                        top = this.f540i.getTop();
                        right = this.f540i.getRight();
                        view = this.f540i;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f545n = z4;
            if (!z4 || (drawable = this.f542k) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f539h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f546o
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f539h
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f538g
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f539h
            boolean r0 = r3.m591b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f539h
        L_0x0042:
            int r0 = r3.m590a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f540i
            boolean r0 = r3.m591b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f540i
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f538g
            int r1 = r3.m590a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f541j;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f541j);
        }
        this.f541j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f539h;
            if (view != null) {
                this.f541j.setBounds(view.getLeft(), this.f539h.getTop(), this.f539h.getRight(), this.f539h.getBottom());
            }
        }
        boolean z = true;
        if (!this.f544m ? !(this.f541j == null && this.f542k == null) : this.f543l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f543l;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f543l);
        }
        this.f543l = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f544m && (drawable2 = this.f543l) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f544m ? this.f541j == null && this.f542k == null : this.f543l == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f542k;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f542k);
        }
        this.f542k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f545n && (drawable2 = this.f542k) != null) {
                drawable2.setBounds(this.f538g.getLeft(), this.f538g.getTop(), this.f538g.getRight(), this.f538g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f544m ? !(this.f541j == null && this.f542k == null) : this.f543l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C0198k0 k0Var) {
        View view = this.f538g;
        if (view != null) {
            removeView(view);
        }
        this.f538g = k0Var;
        if (k0Var != null) {
            addView(k0Var);
            ViewGroup.LayoutParams layoutParams = k0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            k0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f537f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f541j;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f542k;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f543l;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f541j && !this.f544m) || (drawable == this.f542k && this.f545n) || ((drawable == this.f543l && this.f544m) || super.verifyDrawable(drawable));
    }
}
