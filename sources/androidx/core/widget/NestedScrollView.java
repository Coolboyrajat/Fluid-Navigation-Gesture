package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p006b.p026g.p035k.C0838a;
import p006b.p026g.p035k.C0879k;
import p006b.p026g.p035k.C0881m;
import p006b.p026g.p035k.C0883o;
import p006b.p026g.p035k.C0885q;
import p006b.p026g.p035k.C0888t;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.p036e0.C0857c;
import p006b.p026g.p035k.p036e0.C0864e;
import p190io.objectbox.model.PropertyFlags;

public class NestedScrollView extends FrameLayout implements C0883o, C0879k, C0888t {

    /* renamed from: F */
    private static final C0334a f1587F = new C0334a();

    /* renamed from: G */
    private static final int[] f1588G = {16843130};

    /* renamed from: A */
    private C0336c f1589A;

    /* renamed from: B */
    private final C0885q f1590B;

    /* renamed from: C */
    private final C0881m f1591C;

    /* renamed from: D */
    private float f1592D;

    /* renamed from: E */
    private C0335b f1593E;

    /* renamed from: f */
    private long f1594f;

    /* renamed from: g */
    private final Rect f1595g;

    /* renamed from: h */
    private OverScroller f1596h;

    /* renamed from: i */
    private EdgeEffect f1597i;

    /* renamed from: j */
    private EdgeEffect f1598j;

    /* renamed from: k */
    private int f1599k;

    /* renamed from: l */
    private boolean f1600l;

    /* renamed from: m */
    private boolean f1601m;

    /* renamed from: n */
    private View f1602n;

    /* renamed from: o */
    private boolean f1603o;

    /* renamed from: p */
    private VelocityTracker f1604p;

    /* renamed from: q */
    private boolean f1605q;

    /* renamed from: r */
    private boolean f1606r;

    /* renamed from: s */
    private int f1607s;

    /* renamed from: t */
    private int f1608t;

    /* renamed from: u */
    private int f1609u;

    /* renamed from: v */
    private int f1610v;

    /* renamed from: w */
    private final int[] f1611w;

    /* renamed from: x */
    private final int[] f1612x;

    /* renamed from: y */
    private int f1613y;

    /* renamed from: z */
    private int f1614z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0334a extends C0838a {
        C0334a() {
        }

        /* renamed from: a */
        public void mo2093a(View view, C0857c cVar) {
            int scrollRange;
            super.mo2093a(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.mo4585a((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                cVar.mo4624l(true);
                if (nestedScrollView.getScrollY() > 0) {
                    cVar.mo4580a(8192);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    cVar.mo4580a((int) PropertyFlags.INDEX_HASH64);
                }
            }
        }

        /* renamed from: a */
        public boolean mo2094a(View view, int i, Bundle bundle) {
            if (super.mo2094a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo2041b(0, min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo2041b(0, max);
                return true;
            }
        }

        /* renamed from: b */
        public void mo2095b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2095b(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0864e.m4681a(accessibilityEvent, nestedScrollView.getScrollX());
            C0864e.m4683b(accessibilityEvent, nestedScrollView.getScrollRange());
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface C0335b {
        /* renamed from: a */
        void mo42a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    static class C0336c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0336c> CREATOR = new C0337a();

        /* renamed from: f */
        public int f1615f;

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        static class C0337a implements Parcelable.Creator<C0336c> {
            C0337a() {
            }

            public C0336c createFromParcel(Parcel parcel) {
                return new C0336c(parcel);
            }

            public C0336c[] newArray(int i) {
                return new C0336c[i];
            }
        }

        C0336c(Parcel parcel) {
            super(parcel);
            this.f1615f = parcel.readInt();
        }

        C0336c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1615f + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1615f);
        }
    }

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1595g = new Rect();
        this.f1600l = true;
        this.f1601m = false;
        this.f1602n = null;
        this.f1603o = false;
        this.f1606r = true;
        this.f1610v = -1;
        this.f1611w = new int[2];
        this.f1612x = new int[2];
        m1655f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1588G, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1590B = new C0885q(this);
        this.f1591C = new C0881m(this);
        setNestedScrollingEnabled(true);
        C0890v.m4752a((View) this, (C0838a) f1587F);
    }

    /* renamed from: a */
    private static int m1638a(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: a */
    private View m1639a(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private void m1640a() {
        this.f1596h.abortAnimation();
        mo2059f(1);
    }

    /* renamed from: a */
    private void m1641a(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1591C.mo4652a(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* renamed from: a */
    private void m1642a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1610v) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1599k = (int) motionEvent.getY(i);
            this.f1610v = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1604p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private void m1643a(boolean z) {
        if (z) {
            mo2043c(2, 1);
        } else {
            mo2059f(1);
        }
        this.f1614z = getScrollY();
        C0890v.m4736G(this);
    }

    /* renamed from: a */
    private boolean m1644a(Rect rect, boolean z) {
        int a = mo2029a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                mo2030a(0, a);
            }
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m1645a(View view) {
        return !m1646a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m1646a(View view, int i, int i2) {
        view.getDrawingRect(this.f1595g);
        offsetDescendantRectToMyCoords(view, this.f1595g);
        return this.f1595g.bottom + i >= getScrollY() && this.f1595g.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    private static boolean m1647a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m1647a((View) parent, view2);
    }

    /* renamed from: b */
    private void m1648b(View view) {
        view.getDrawingRect(this.f1595g);
        offsetDescendantRectToMyCoords(view, this.f1595g);
        int a = mo2029a(this.f1595g);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: b */
    private boolean m1649b() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: b */
    private boolean m1650b(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View a = m1639a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m1657g(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: c */
    private void m1651c() {
        this.f1603o = false;
        m1658h();
        mo2059f(0);
        EdgeEffect edgeEffect = this.f1597i;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f1598j.onRelease();
        }
    }

    /* renamed from: d */
    private void m1652d() {
        if (getOverScrollMode() == 2) {
            this.f1597i = null;
            this.f1598j = null;
        } else if (this.f1597i == null) {
            Context context = getContext();
            this.f1597i = new EdgeEffect(context);
            this.f1598j = new EdgeEffect(context);
        }
    }

    /* renamed from: d */
    private boolean m1653d(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* renamed from: e */
    private void m1654e() {
        VelocityTracker velocityTracker = this.f1604p;
        if (velocityTracker == null) {
            this.f1604p = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: f */
    private void m1655f() {
        this.f1596h = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1607s = viewConfiguration.getScaledTouchSlop();
        this.f1608t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1609u = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: g */
    private void m1656g() {
        if (this.f1604p == null) {
            this.f1604p = VelocityTracker.obtain();
        }
    }

    /* renamed from: g */
    private void m1657g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f1606r) {
            mo2030a(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1592D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f1592D = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f1592D;
    }

    /* renamed from: h */
    private void m1658h() {
        VelocityTracker velocityTracker = this.f1604p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1604p = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo2029a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        if (rect.bottom > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || rect.bottom >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* renamed from: a */
    public final void mo2030a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1594f > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f1596h;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY);
                m1643a(false);
            } else {
                if (!this.f1596h.isFinished()) {
                    m1640a();
                }
                scrollBy(i, i2);
            }
            this.f1594f = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: a */
    public void mo2031a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f1591C.mo4652a(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: a */
    public void mo755a(View view, int i) {
        this.f1590B.mo4668a(view, i);
        mo2059f(i);
    }

    /* renamed from: a */
    public void mo756a(View view, int i, int i2, int i3, int i4, int i5) {
        m1641a(i4, i5, (int[]) null);
    }

    /* renamed from: a */
    public void mo757a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m1641a(i4, i5, iArr);
    }

    /* renamed from: a */
    public void mo758a(View view, int i, int i2, int[] iArr, int i3) {
        mo2034a(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: a */
    public void mo759a(View view, View view2, int i, int i2) {
        this.f1590B.mo4670a(view, view2, i, i2);
        mo2043c(2, i2);
    }

    /* renamed from: a */
    public boolean mo2032a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m1646a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1657g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1595g);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1595g);
            m1657g(mo2029a(this.f1595g));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m1645a(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2033a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r7 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0053
            goto L_0x004e
        L_0x0053:
            r7 = r3
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r3 = r12.mo2051d(r5)
            if (r3 != 0) goto L_0x007e
            android.widget.OverScroller r3 = r0.f1596h
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r3
            r14 = r7
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r7, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo2033a(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: a */
    public boolean mo2034a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1591C.mo4662a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    public boolean mo2035a(KeyEvent keyEvent) {
        this.f1595g.setEmpty();
        int i = 130;
        if (!m1649b()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? mo2032a(33) : mo2042c(33);
            }
            if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? mo2032a(130) : mo2042c(130);
            }
            if (keyCode != 62) {
                return false;
            }
            if (keyEvent.isShiftPressed()) {
                i = 33;
            }
            mo2058e(i);
            return false;
        }
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public void mo2040b(int i) {
        if (getChildCount() > 0) {
            this.f1596h.fling(getScrollX(), getScrollY(), 0, i, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, 0, 0);
            m1643a(true);
        }
    }

    /* renamed from: b */
    public final void mo2041b(int i, int i2) {
        mo2030a(i - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: b */
    public boolean mo761b(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: c */
    public boolean mo2042c(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1595g;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1595g.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f1595g;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1595g;
        return m1650b(i, rect3.top, rect3.bottom);
    }

    /* renamed from: c */
    public boolean mo2043c(int i, int i2) {
        return this.f1591C.mo4658a(i, i2);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f1596h.isFinished()) {
            this.f1596h.computeScrollOffset();
            int currY = this.f1596h.getCurrY();
            int i = currY - this.f1614z;
            this.f1614z = currY;
            int[] iArr = this.f1612x;
            boolean z = false;
            iArr[1] = 0;
            mo2034a(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f1612x[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo2033a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f1612x;
                iArr2[1] = 0;
                mo2031a(0, scrollY2, 0, i3, this.f1611w, 1, iArr2);
                i2 = i3 - this.f1612x[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    m1652d();
                    if (i2 < 0) {
                        if (this.f1597i.isFinished()) {
                            edgeEffect = this.f1597i;
                        }
                    } else if (this.f1598j.isFinished()) {
                        edgeEffect = this.f1598j;
                    }
                    edgeEffect.onAbsorb((int) this.f1596h.getCurrVelocity());
                }
                m1640a();
            }
            if (!this.f1596h.isFinished()) {
                C0890v.m4736G(this);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    /* renamed from: d */
    public boolean mo2051d(int i) {
        return this.f1591C.mo4657a(i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo2035a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1591C.mo4656a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1591C.mo4655a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo2034a(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1591C.mo4659a(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1597i != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f1597i.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f1597i.setSize(width, height);
                if (this.f1597i.draw(canvas)) {
                    C0890v.m4736G(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f1598j.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f1598j.setSize(width2, height2);
                if (this.f1598j.draw(canvas)) {
                    C0890v.m4736G(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo2058e(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f1595g.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f1595g;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f1595g.top = getScrollY() - height;
            Rect rect2 = this.f1595g;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f1595g;
        int i2 = rect3.top;
        rect3.bottom = height + i2;
        return m1650b(i, i2, rect3.bottom);
    }

    /* renamed from: f */
    public void mo2059f(int i) {
        this.f1591C.mo4666c(i);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f1590B.mo4667a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return mo2051d(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1591C.mo4663b();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1601m = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1603o) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    verticalScrollFactorCompat = 0;
                } else if (verticalScrollFactorCompat > scrollRange) {
                    verticalScrollFactorCompat = scrollRange;
                }
                if (verticalScrollFactorCompat != scrollY) {
                    super.scrollTo(getScrollX(), verticalScrollFactorCompat);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f1603o) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f1610v;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f1599k) > this.f1607s && (2 & getNestedScrollAxes()) == 0) {
                                this.f1603o = true;
                                this.f1599k = y;
                                m1656g();
                                this.f1604p.addMovement(motionEvent);
                                this.f1613y = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m1642a(motionEvent);
                    }
                }
            }
            this.f1603o = false;
            this.f1610v = -1;
            m1658h();
            if (this.f1596h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C0890v.m4736G(this);
            }
            mo2059f(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m1653d((int) motionEvent.getX(), y2)) {
                this.f1603o = false;
                m1658h();
            } else {
                this.f1599k = y2;
                this.f1610v = motionEvent.getPointerId(0);
                m1654e();
                this.f1604p.addMovement(motionEvent);
                this.f1596h.computeScrollOffset();
                this.f1603o = !this.f1596h.isFinished();
                mo2043c(2, 0);
            }
        }
        return this.f1603o;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f1600l = false;
        View view = this.f1602n;
        if (view != null && m1647a(view, (View) this)) {
            m1648b(this.f1602n);
        }
        this.f1602n = null;
        if (!this.f1601m) {
            if (this.f1589A != null) {
                scrollTo(getScrollX(), this.f1589A.f1615f);
                this.f1589A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int a = m1638a(scrollY, paddingTop, i5);
            if (a != scrollY) {
                scrollTo(getScrollX(), a);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1601m = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1605q && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo2040b((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo758a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m1641a(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo759a(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i) : instance.findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !m1645a(findNextFocus)) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0336c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0336c cVar = (C0336c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f1589A = cVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0336c cVar = new C0336c(super.onSaveInstanceState());
        cVar.f1615f = getScrollY();
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0335b bVar = this.f1593E;
        if (bVar != null) {
            bVar.mo42a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m1646a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f1595g);
            offsetDescendantRectToMyCoords(findFocus, this.f1595g);
            m1657g(mo2029a(this.f1595g));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo761b(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo755a(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r10.f1596h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0210, code lost:
        if (r10.f1596h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r23.m1656g()
            int r0 = r24.getActionMasked()
            r12 = 0
            if (r0 != 0) goto L_0x0010
            r10.f1613y = r12
        L_0x0010:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            int r1 = r10.f1613y
            float r1 = (float) r1
            r2 = 0
            r13.offsetLocation(r2, r1)
            r1 = 2
            r14 = 1
            if (r0 == 0) goto L_0x0214
            r3 = -1
            if (r0 == r14) goto L_0x01cf
            if (r0 == r1) goto L_0x0082
            r1 = 3
            if (r0 == r1) goto L_0x0054
            r1 = 5
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x002f
            goto L_0x024a
        L_0x002f:
            r23.m1642a((android.view.MotionEvent) r24)
            int r0 = r10.f1610v
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f1599k = r0
            goto L_0x024a
        L_0x0041:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f1599k = r1
            int r0 = r11.getPointerId(r0)
            r10.f1610v = r0
            goto L_0x024a
        L_0x0054:
            boolean r0 = r10.f1603o
            if (r0 == 0) goto L_0x007b
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x007b
            android.widget.OverScroller r15 = r10.f1596h
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
        L_0x0078:
            p006b.p026g.p035k.C0890v.m4736G(r23)
        L_0x007b:
            r10.f1610v = r3
            r23.m1651c()
            goto L_0x024a
        L_0x0082:
            int r0 = r10.f1610v
            int r15 = r11.findPointerIndex(r0)
            if (r15 != r3) goto L_0x00a9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r10.f1610v
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x024a
        L_0x00a9:
            float r0 = r11.getY(r15)
            int r6 = (int) r0
            int r0 = r10.f1599k
            int r7 = r0 - r6
            r1 = 0
            int[] r3 = r10.f1612x
            int[] r4 = r10.f1611w
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.mo2034a((int) r1, (int) r2, (int[]) r3, (int[]) r4, (int) r5)
            if (r0 == 0) goto L_0x00cf
            int[] r0 = r10.f1612x
            r0 = r0[r14]
            int r7 = r7 - r0
            int r0 = r10.f1613y
            int[] r1 = r10.f1611w
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f1613y = r0
        L_0x00cf:
            boolean r0 = r10.f1603o
            if (r0 != 0) goto L_0x00ed
            int r0 = java.lang.Math.abs(r7)
            int r1 = r10.f1607s
            if (r0 <= r1) goto L_0x00ed
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x00e4
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x00e4:
            r10.f1603o = r14
            int r0 = r10.f1607s
            if (r7 <= 0) goto L_0x00ec
            int r7 = r7 - r0
            goto L_0x00ed
        L_0x00ec:
            int r7 = r7 + r0
        L_0x00ed:
            r16 = r7
            boolean r0 = r10.f1603o
            if (r0 == 0) goto L_0x024a
            int[] r0 = r10.f1611w
            r0 = r0[r14]
            int r6 = r6 - r0
            r10.f1599k = r6
            int r17 = r23.getScrollY()
            int r9 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x0110
            if (r0 != r14) goto L_0x010d
            if (r9 <= 0) goto L_0x010d
            goto L_0x0110
        L_0x010d:
            r18 = 0
            goto L_0x0112
        L_0x0110:
            r18 = 1
        L_0x0112:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r7 = 0
            r8 = 0
            r19 = 1
            r0 = r23
            r2 = r16
            r6 = r9
            r22 = r9
            r9 = r19
            boolean r0 = r0.mo2033a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0137
            boolean r0 = r10.mo2051d(r12)
            if (r0 != 0) goto L_0x0137
            android.view.VelocityTracker r0 = r10.f1604p
            r0.clear()
        L_0x0137:
            int r0 = r23.getScrollY()
            int r2 = r0 - r17
            int r4 = r16 - r2
            int[] r7 = r10.f1612x
            r7[r14] = r12
            r1 = 0
            r3 = 0
            int[] r5 = r10.f1611w
            r6 = 0
            r0 = r23
            r0.mo2031a((int) r1, (int) r2, (int) r3, (int) r4, (int[]) r5, (int) r6, (int[]) r7)
            int r0 = r10.f1599k
            int[] r1 = r10.f1611w
            r2 = r1[r14]
            int r0 = r0 - r2
            r10.f1599k = r0
            int r0 = r10.f1613y
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f1613y = r0
            if (r18 == 0) goto L_0x024a
            int[] r0 = r10.f1612x
            r0 = r0[r14]
            int r0 = r16 - r0
            r23.m1652d()
            int r1 = r17 + r0
            if (r1 >= 0) goto L_0x0190
            android.widget.EdgeEffect r1 = r10.f1597i
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = r11.getX(r15)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            androidx.core.widget.C0343d.m1722a(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f1598j
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01b8
            android.widget.EdgeEffect r0 = r10.f1598j
        L_0x018c:
            r0.onRelease()
            goto L_0x01b8
        L_0x0190:
            r2 = r22
            if (r1 <= r2) goto L_0x01b8
            android.widget.EdgeEffect r1 = r10.f1598j
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r11.getX(r15)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            androidx.core.widget.C0343d.m1722a(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f1597i
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01b8
            android.widget.EdgeEffect r0 = r10.f1597i
            goto L_0x018c
        L_0x01b8:
            android.widget.EdgeEffect r0 = r10.f1597i
            if (r0 == 0) goto L_0x024a
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01ca
            android.widget.EdgeEffect r0 = r10.f1598j
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x024a
        L_0x01ca:
            p006b.p026g.p035k.C0890v.m4736G(r23)
            goto L_0x024a
        L_0x01cf:
            android.view.VelocityTracker r0 = r10.f1604p
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r10.f1609u
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r10.f1610v
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r10.f1608t
            if (r1 <= r4) goto L_0x01f8
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r10.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x007b
            r10.dispatchNestedFling(r2, r1, r14)
            r10.mo2040b((int) r0)
            goto L_0x007b
        L_0x01f8:
            android.widget.OverScroller r15 = r10.f1596h
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
            goto L_0x0078
        L_0x0214:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x021b
            return r12
        L_0x021b:
            android.widget.OverScroller r0 = r10.f1596h
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r14
            r10.f1603o = r0
            if (r0 == 0) goto L_0x022f
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x022f
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x022f:
            android.widget.OverScroller r0 = r10.f1596h
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x023a
            r23.m1640a()
        L_0x023a:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f1599k = r0
            int r0 = r11.getPointerId(r12)
            r10.f1610v = r0
            r10.mo2043c(r1, r12)
        L_0x024a:
            android.view.VelocityTracker r0 = r10.f1604p
            if (r0 == 0) goto L_0x0251
            r0.addMovement(r13)
        L_0x0251:
            r13.recycle()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f1600l) {
            m1648b(view2);
        } else {
            this.f1602n = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m1644a(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m1658h();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f1600l = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int a = m1638a(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int a2 = m1638a(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (a != getScrollX() || a2 != getScrollY()) {
                super.scrollTo(a, a2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1605q) {
            this.f1605q = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f1591C.mo4653a(z);
    }

    public void setOnScrollChangeListener(C0335b bVar) {
        this.f1593E = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1606r = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo2043c(i, 0);
    }

    public void stopNestedScroll() {
        mo2059f(0);
    }
}
