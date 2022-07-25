package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1175h;

public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: v */
    private static final int[] f7142v = {C1169b.snackbarButtonStyle};

    /* renamed from: t */
    private final AccessibilityManager f7143t;

    /* renamed from: u */
    private boolean f7144u;

    public static final class SnackbarLayout extends BaseTransientBottomBar.C2701v {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$a */
    class C2703a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ View.OnClickListener f7145f;

        C2703a(View.OnClickListener onClickListener) {
            this.f7145f = onClickListener;
        }

        public void onClick(View view) {
            this.f7145f.onClick(view);
            Snackbar.this.mo8562a(1);
        }
    }

    private Snackbar(ViewGroup viewGroup, View view, C2704a aVar) {
        super(viewGroup, view, aVar);
        this.f7143t = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: a */
    private static ViewGroup m10662a(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    public static Snackbar m10663a(View view, CharSequence charSequence, int i) {
        ViewGroup a = m10662a(view);
        if (a != null) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(a.getContext()).inflate(m10664a(a.getContext()) ? C1175h.mtrl_layout_snackbar_include : C1175h.design_layout_snackbar_include, a, false);
            Snackbar snackbar = new Snackbar(a, snackbarContentLayout, snackbarContentLayout);
            snackbar.mo8613a(charSequence);
            snackbar.mo8568d(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* renamed from: a */
    protected static boolean m10664a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f7142v);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* renamed from: a */
    public Snackbar mo8612a(int i, View.OnClickListener onClickListener) {
        mo8614a(mo8565c().getText(i), onClickListener);
        return this;
    }

    /* renamed from: a */
    public Snackbar mo8613a(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f7098c.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    /* renamed from: a */
    public Snackbar mo8614a(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f7098c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener((View.OnClickListener) null);
            this.f7144u = false;
        } else {
            this.f7144u = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new C2703a(onClickListener));
        }
        return this;
    }

    /* renamed from: b */
    public void mo8563b() {
        super.mo8563b();
    }

    /* renamed from: d */
    public int mo8567d() {
        int d = super.mo8567d();
        if (d == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f7143t.getRecommendedTimeoutMillis(d, (this.f7144u ? 4 : 0) | 1 | 2);
        } else if (!this.f7144u || !this.f7143t.isTouchExplorationEnabled()) {
            return d;
        } else {
            return -2;
        }
    }

    /* renamed from: k */
    public void mo8575k() {
        super.mo8575k();
    }
}
