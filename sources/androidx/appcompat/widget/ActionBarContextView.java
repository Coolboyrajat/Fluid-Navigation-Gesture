package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p006b.p007a.C0654a;
import p006b.p007a.C0659f;
import p006b.p007a.C0660g;
import p006b.p007a.C0663j;
import p006b.p007a.p014o.C0685b;
import p006b.p026g.p035k.C0890v;

public class ActionBarContextView extends C0148a {

    /* renamed from: n */
    private CharSequence f547n;

    /* renamed from: o */
    private CharSequence f548o;

    /* renamed from: p */
    private View f549p;

    /* renamed from: q */
    private View f550q;

    /* renamed from: r */
    private LinearLayout f551r;

    /* renamed from: s */
    private TextView f552s;

    /* renamed from: t */
    private TextView f553t;

    /* renamed from: u */
    private int f554u;

    /* renamed from: v */
    private int f555v;

    /* renamed from: w */
    private boolean f556w;

    /* renamed from: x */
    private int f557x;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class C0108a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C0685b f558f;

        C0108a(ActionBarContextView actionBarContextView, C0685b bVar) {
            this.f558f = bVar;
        }

        public void onClick(View view) {
            this.f558f.mo274a();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0654a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0217r0 a = C0217r0.m1054a(context, attributeSet, C0663j.ActionMode, i, 0);
        C0890v.m4751a((View) this, a.mo1535b(C0663j.ActionMode_background));
        this.f554u = a.mo1544g(C0663j.ActionMode_titleTextStyle, 0);
        this.f555v = a.mo1544g(C0663j.ActionMode_subtitleTextStyle, 0);
        this.f812j = a.mo1542f(C0663j.ActionMode_height, 0);
        this.f557x = a.mo1544g(C0663j.ActionMode_closeItemLayout, C0660g.abc_action_mode_close_item_material);
        a.mo1531a();
    }

    /* renamed from: e */
    private void m592e() {
        if (this.f551r == null) {
            LayoutInflater.from(getContext()).inflate(C0660g.abc_action_bar_title_item, this);
            this.f551r = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f552s = (TextView) this.f551r.findViewById(C0659f.action_bar_title);
            this.f553t = (TextView) this.f551r.findViewById(C0659f.action_bar_subtitle);
            if (this.f554u != 0) {
                this.f552s.setTextAppearance(getContext(), this.f554u);
            }
            if (this.f555v != 0) {
                this.f553t.setTextAppearance(getContext(), this.f555v);
            }
        }
        this.f552s.setText(this.f547n);
        this.f553t.setText(this.f548o);
        boolean z = !TextUtils.isEmpty(this.f547n);
        boolean z2 = !TextUtils.isEmpty(this.f548o);
        int i = 0;
        this.f553t.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.f551r;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (this.f551r.getParent() == null) {
            addView(this.f551r);
        }
    }

    /* renamed from: a */
    public void mo729a() {
        if (this.f549p == null) {
            mo732c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r0.getParent() == null) goto L_0x0015;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo730a(p006b.p007a.p014o.C0685b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f549p
            if (r0 != 0) goto L_0x001b
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f557x
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f549p = r0
        L_0x0015:
            android.view.View r0 = r3.f549p
            r3.addView(r0)
            goto L_0x0022
        L_0x001b:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0022
            goto L_0x0015
        L_0x0022:
            android.view.View r0 = r3.f549p
            int r1 = p006b.p007a.C0659f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo282c()
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.C0081g) r4
            androidx.appcompat.widget.c r0 = r3.f811i
            if (r0 == 0) goto L_0x003f
            r0.mo1224c()
        L_0x003f:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f811i = r0
            androidx.appcompat.widget.c r0 = r3.f811i
            r1 = 1
            r0.mo1223c((boolean) r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f811i
            android.content.Context r2 = r3.f809g
            r4.mo455a((androidx.appcompat.view.menu.C0097n) r1, (android.content.Context) r2)
            androidx.appcompat.widget.c r4 = r3.f811i
            androidx.appcompat.view.menu.o r4 = r4.mo396b((android.view.ViewGroup) r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f810h = r4
            androidx.appcompat.widget.ActionMenuView r4 = r3.f810h
            r1 = 0
            p006b.p026g.p035k.C0890v.m4751a((android.view.View) r4, (android.graphics.drawable.Drawable) r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f810h
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.mo730a(b.a.o.b):void");
    }

    /* renamed from: b */
    public boolean mo731b() {
        return this.f556w;
    }

    /* renamed from: c */
    public void mo732c() {
        removeAllViews();
        this.f550q = null;
        this.f810h = null;
    }

    /* renamed from: d */
    public boolean mo733d() {
        C0156c cVar = this.f811i;
        if (cVar != null) {
            return cVar.mo1230i();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f548o;
    }

    public CharSequence getTitle() {
        return this.f547n;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0156c cVar = this.f811i;
        if (cVar != null) {
            cVar.mo1226e();
            this.f811i.mo1227f();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f547n);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean a = C0246x0.m1240a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f549p;
        if (view == null || view.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f549p.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = C0148a.m771a(paddingRight, i6, a);
            i5 = C0148a.m771a(a2 + mo1185a(this.f549p, a2, paddingTop, paddingTop2, a), i7, a);
        }
        LinearLayout linearLayout = this.f551r;
        if (!(linearLayout == null || this.f550q != null || linearLayout.getVisibility() == 8)) {
            i5 += mo1185a(this.f551r, i5, paddingTop, paddingTop2, a);
        }
        int i8 = i5;
        View view2 = this.f550q;
        if (view2 != null) {
            mo1185a(view2, i8, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f810h;
        if (actionMenuView != null) {
            mo1185a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f812j;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, RecyclerView.UNDEFINED_DURATION);
            View view = this.f549p;
            if (view != null) {
                int a = mo1184a(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f549p.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f810h;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo1184a(this.f810h, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f551r;
            if (linearLayout != null && this.f550q == null) {
                if (this.f556w) {
                    this.f551r.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f551r.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f551r.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo1184a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f550q;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : RecyclerView.UNDEFINED_DURATION;
                int i7 = layoutParams.width;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = RecyclerView.UNDEFINED_DURATION;
                }
                int i8 = layoutParams.height;
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f550q.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f812j <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i) {
        this.f812j = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f550q;
        if (view2 != null) {
            removeView(view2);
        }
        this.f550q = view;
        if (!(view == null || (linearLayout = this.f551r) == null)) {
            removeView(linearLayout);
            this.f551r = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f548o = charSequence;
        m592e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f547n = charSequence;
        m592e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f556w) {
            requestLayout();
        }
        this.f556w = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
