package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.C0097n;
import androidx.recyclerview.widget.RecyclerView;
import p006b.p007a.C0654a;
import p006b.p007a.C0659f;
import p006b.p026g.p035k.C0882n;
import p006b.p026g.p035k.C0883o;
import p006b.p026g.p035k.C0884p;
import p006b.p026g.p035k.C0885q;
import p006b.p026g.p035k.C0890v;
import p190io.objectbox.model.PropertyFlags;

public class ActionBarOverlayLayout extends ViewGroup implements C0245x, C0884p, C0882n, C0883o {

    /* renamed from: G */
    static final int[] f559G = {C0654a.actionBarSize, 16842841};

    /* renamed from: A */
    private OverScroller f560A;

    /* renamed from: B */
    ViewPropertyAnimator f561B;

    /* renamed from: C */
    final AnimatorListenerAdapter f562C;

    /* renamed from: D */
    private final Runnable f563D;

    /* renamed from: E */
    private final Runnable f564E;

    /* renamed from: F */
    private final C0885q f565F;

    /* renamed from: f */
    private int f566f;

    /* renamed from: g */
    private int f567g;

    /* renamed from: h */
    private ContentFrameLayout f568h;

    /* renamed from: i */
    ActionBarContainer f569i;

    /* renamed from: j */
    private C0247y f570j;

    /* renamed from: k */
    private Drawable f571k;

    /* renamed from: l */
    private boolean f572l;

    /* renamed from: m */
    private boolean f573m;

    /* renamed from: n */
    private boolean f574n;

    /* renamed from: o */
    private boolean f575o;

    /* renamed from: p */
    boolean f576p;

    /* renamed from: q */
    private int f577q;

    /* renamed from: r */
    private int f578r;

    /* renamed from: s */
    private final Rect f579s;

    /* renamed from: t */
    private final Rect f580t;

    /* renamed from: u */
    private final Rect f581u;

    /* renamed from: v */
    private final Rect f582v;

    /* renamed from: w */
    private final Rect f583w;

    /* renamed from: x */
    private final Rect f584x;

    /* renamed from: y */
    private final Rect f585y;

    /* renamed from: z */
    private C0112d f586z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0109a extends AnimatorListenerAdapter {
        C0109a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f561B = null;
            actionBarOverlayLayout.f576p = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f561B = null;
            actionBarOverlayLayout.f576p = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class C0110b implements Runnable {
        C0110b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo752a();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f561B = actionBarOverlayLayout.f569i.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f562C);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class C0111c implements Runnable {
        C0111c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo752a();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f561B = actionBarOverlayLayout.f569i.animate().translationY((float) (-ActionBarOverlayLayout.this.f569i.getHeight())).setListener(ActionBarOverlayLayout.this.f562C);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0112d {
        /* renamed from: a */
        void mo257a();

        /* renamed from: a */
        void mo259a(int i);

        /* renamed from: a */
        void mo261a(boolean z);

        /* renamed from: b */
        void mo262b();

        /* renamed from: c */
        void mo263c();

        /* renamed from: d */
        void mo264d();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0113e extends ViewGroup.MarginLayoutParams {
        public C0113e(int i, int i2) {
            super(i, i2);
        }

        public C0113e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0113e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f567g = 0;
        this.f579s = new Rect();
        this.f580t = new Rect();
        this.f581u = new Rect();
        this.f582v = new Rect();
        this.f583w = new Rect();
        this.f584x = new Rect();
        this.f585y = new Rect();
        this.f562C = new C0109a();
        this.f563D = new C0110b();
        this.f564E = new C0111c();
        m599a(context);
        this.f565F = new C0885q(this);
    }

    /* renamed from: a */
    private C0247y m598a(View view) {
        if (view instanceof C0247y) {
            return (C0247y) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: a */
    private void m599a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f559G);
        boolean z = false;
        this.f566f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f571k = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f571k == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f572l = z;
        this.f560A = new OverScroller(context);
    }

    /* renamed from: a */
    private boolean m600a(float f, float f2) {
        this.f560A.fling(0, 0, 0, (int) f2, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return this.f560A.getFinalY() > this.f569i.getHeight();
    }

    /* renamed from: a */
    private boolean m601a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        C0113e eVar = (C0113e) view.getLayoutParams();
        if (!z || eVar.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            eVar.leftMargin = i4;
            z5 = true;
        }
        if (z2 && eVar.topMargin != (i3 = rect.top)) {
            eVar.topMargin = i3;
            z5 = true;
        }
        if (z4 && eVar.rightMargin != (i2 = rect.right)) {
            eVar.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || eVar.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        eVar.bottomMargin = i;
        return true;
    }

    /* renamed from: k */
    private void m602k() {
        mo752a();
        this.f564E.run();
    }

    /* renamed from: l */
    private void m603l() {
        mo752a();
        postDelayed(this.f564E, 600);
    }

    /* renamed from: m */
    private void m604m() {
        mo752a();
        postDelayed(this.f563D, 600);
    }

    /* renamed from: n */
    private void m605n() {
        mo752a();
        this.f563D.run();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo752a() {
        removeCallbacks(this.f563D);
        removeCallbacks(this.f564E);
        ViewPropertyAnimator viewPropertyAnimator = this.f561B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: a */
    public void mo753a(int i) {
        mo778j();
        if (i == 2) {
            this.f570j.mo1638l();
        } else if (i == 5) {
            this.f570j.mo1640n();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: a */
    public void mo754a(Menu menu, C0097n.C0098a aVar) {
        mo778j();
        this.f570j.mo1613a(menu, aVar);
    }

    /* renamed from: a */
    public void mo755a(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public void mo756a(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public void mo757a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo756a(view, i, i2, i3, i4, i5);
    }

    /* renamed from: a */
    public void mo758a(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* renamed from: a */
    public void mo759a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: b */
    public boolean mo760b() {
        mo778j();
        return this.f570j.mo1622b();
    }

    /* renamed from: b */
    public boolean mo761b(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* renamed from: c */
    public boolean mo762c() {
        mo778j();
        return this.f570j.mo1625c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0113e;
    }

    /* renamed from: d */
    public boolean mo764d() {
        mo778j();
        return this.f570j.mo1628d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f571k != null && !this.f572l) {
            int bottom = this.f569i.getVisibility() == 0 ? (int) (((float) this.f569i.getBottom()) + this.f569i.getTranslationY() + 0.5f) : 0;
            this.f571k.setBounds(0, bottom, getWidth(), this.f571k.getIntrinsicHeight() + bottom);
            this.f571k.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo766e() {
        mo778j();
        return this.f570j.mo1630e();
    }

    /* renamed from: f */
    public void mo767f() {
        mo778j();
        this.f570j.mo1631f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        mo778j();
        int v = C0890v.m4798v(this) & PropertyFlags.INDEX_PARTIAL_SKIP_NULL;
        boolean a = m601a((View) this.f569i, rect, true, true, false, true);
        this.f582v.set(rect);
        C0246x0.m1239a(this, this.f582v, this.f579s);
        if (!this.f583w.equals(this.f582v)) {
            this.f583w.set(this.f582v);
            a = true;
        }
        if (!this.f580t.equals(this.f579s)) {
            this.f580t.set(this.f579s);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo769g() {
        mo778j();
        return this.f570j.mo1632g();
    }

    /* access modifiers changed from: protected */
    public C0113e generateDefaultLayoutParams() {
        return new C0113e(-1, -1);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0113e(layoutParams);
    }

    public C0113e generateLayoutParams(AttributeSet attributeSet) {
        return new C0113e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f569i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f565F.mo4667a();
    }

    public CharSequence getTitle() {
        mo778j();
        return this.f570j.getTitle();
    }

    /* renamed from: h */
    public void mo776h() {
        mo778j();
        this.f570j.mo1634h();
    }

    /* renamed from: i */
    public boolean mo777i() {
        return this.f573m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo778j() {
        if (this.f568h == null) {
            this.f568h = (ContentFrameLayout) findViewById(C0659f.action_bar_activity_content);
            this.f569i = (ActionBarContainer) findViewById(C0659f.action_bar_container);
            this.f570j = m598a(findViewById(C0659f.action_bar));
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m599a(getContext());
        C0890v.m4737H(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo752a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0113e eVar = (C0113e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = eVar.leftMargin + paddingLeft;
                int i7 = eVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        mo778j();
        measureChildWithMargins(this.f569i, i, 0, i2, 0);
        C0113e eVar = (C0113e) this.f569i.getLayoutParams();
        int max = Math.max(0, this.f569i.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f569i.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f569i.getMeasuredState());
        boolean z = (C0890v.m4798v(this) & PropertyFlags.INDEX_PARTIAL_SKIP_NULL) != 0;
        if (z) {
            i3 = this.f566f;
            if (this.f574n && this.f569i.getTabContainer() != null) {
                i3 += this.f566f;
            }
        } else {
            i3 = this.f569i.getVisibility() != 8 ? this.f569i.getMeasuredHeight() : 0;
        }
        this.f581u.set(this.f579s);
        this.f584x.set(this.f582v);
        Rect rect = (this.f573m || z) ? this.f584x : this.f581u;
        rect.top += i3;
        rect.bottom += 0;
        m601a((View) this.f568h, this.f581u, true, true, true, true);
        if (!this.f585y.equals(this.f584x)) {
            this.f585y.set(this.f584x);
            this.f568h.mo919a(this.f584x);
        }
        measureChildWithMargins(this.f568h, i, 0, i2, 0);
        C0113e eVar2 = (C0113e) this.f568h.getLayoutParams();
        int max3 = Math.max(max, this.f568h.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f568h.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f568h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f575o || !z) {
            return false;
        }
        if (m600a(f, f2)) {
            m602k();
        } else {
            m605n();
        }
        this.f576p = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f577q += i2;
        setActionBarHideOffset(this.f577q);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f565F.mo4669a(view, view2, i);
        this.f577q = getActionBarHideOffset();
        mo752a();
        C0112d dVar = this.f586z;
        if (dVar != null) {
            dVar.mo262b();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f569i.getVisibility() != 0) {
            return false;
        }
        return this.f575o;
    }

    public void onStopNestedScroll(View view) {
        if (this.f575o && !this.f576p) {
            if (this.f577q <= this.f569i.getHeight()) {
                m604m();
            } else {
                m603l();
            }
        }
        C0112d dVar = this.f586z;
        if (dVar != null) {
            dVar.mo264d();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo778j();
        int i2 = this.f578r ^ i;
        this.f578r = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & PropertyFlags.INDEX_PARTIAL_SKIP_NULL) != 0) {
            z = true;
        }
        C0112d dVar = this.f586z;
        if (dVar != null) {
            dVar.mo261a(!z);
            if (z2 || !z) {
                this.f586z.mo257a();
            } else {
                this.f586z.mo263c();
            }
        }
        if ((i2 & PropertyFlags.INDEX_PARTIAL_SKIP_NULL) != 0 && this.f586z != null) {
            C0890v.m4737H(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f567g = i;
        C0112d dVar = this.f586z;
        if (dVar != null) {
            dVar.mo259a(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        mo752a();
        this.f569i.setTranslationY((float) (-Math.max(0, Math.min(i, this.f569i.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0112d dVar) {
        this.f586z = dVar;
        if (getWindowToken() != null) {
            this.f586z.mo259a(this.f567g);
            int i = this.f578r;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0890v.m4737H(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f574n = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f575o) {
            this.f575o = z;
            if (!z) {
                mo752a();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo778j();
        this.f570j.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        mo778j();
        this.f570j.setIcon(drawable);
    }

    public void setLogo(int i) {
        mo778j();
        this.f570j.mo1618b(i);
    }

    public void setOverlayMode(boolean z) {
        this.f573m = z;
        this.f572l = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo778j();
        this.f570j.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo778j();
        this.f570j.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
