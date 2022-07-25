package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0081g;
import androidx.appcompat.view.menu.C0086j;
import androidx.appcompat.view.menu.C0097n;
import androidx.appcompat.view.menu.C0099o;
import androidx.appcompat.widget.C0168d0;
import androidx.recyclerview.widget.RecyclerView;

public class ActionMenuView extends C0168d0 implements C0081g.C0083b, C0099o {

    /* renamed from: A */
    C0081g.C0082a f590A;

    /* renamed from: B */
    private boolean f591B;

    /* renamed from: C */
    private int f592C;

    /* renamed from: D */
    private int f593D;

    /* renamed from: E */
    private int f594E;

    /* renamed from: F */
    C0118e f595F;

    /* renamed from: u */
    private C0081g f596u;

    /* renamed from: v */
    private Context f597v;

    /* renamed from: w */
    private int f598w;

    /* renamed from: x */
    private boolean f599x;

    /* renamed from: y */
    private C0156c f600y;

    /* renamed from: z */
    private C0097n.C0098a f601z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0114a {
        /* renamed from: b */
        boolean mo291b();

        /* renamed from: c */
        boolean mo292c();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C0115b implements C0097n.C0098a {
        C0115b() {
        }

        /* renamed from: a */
        public void mo212a(C0081g gVar, boolean z) {
        }

        /* renamed from: a */
        public boolean mo213a(C0081g gVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0116c extends C0168d0.C0169a {
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public boolean f602c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public int f603d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public int f604e;
        @ViewDebug.ExportedProperty

        /* renamed from: f */
        public boolean f605f;
        @ViewDebug.ExportedProperty

        /* renamed from: g */
        public boolean f606g;

        /* renamed from: h */
        boolean f607h;

        public C0116c(int i, int i2) {
            super(i, i2);
            this.f602c = false;
        }

        public C0116c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0116c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0116c(C0116c cVar) {
            super(cVar);
            this.f602c = cVar.f602c;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    private class C0117d implements C0081g.C0082a {
        C0117d() {
        }

        /* renamed from: a */
        public void mo177a(C0081g gVar) {
            C0081g.C0082a aVar = ActionMenuView.this.f590A;
            if (aVar != null) {
                aVar.mo177a(gVar);
            }
        }

        /* renamed from: a */
        public boolean mo180a(C0081g gVar, MenuItem menuItem) {
            C0118e eVar = ActionMenuView.this.f595F;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0118e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f593D = (int) (56.0f * f);
        this.f594E = (int) (f * 4.0f);
        this.f597v = context;
        this.f598w = 0;
    }

    /* renamed from: a */
    static int m630a(View view, int i, int i2, int i3, int i4) {
        C0116c cVar = (C0116c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo293d();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f602c || !z2) {
            z = false;
        }
        cVar.f605f = z;
        cVar.f603d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: c */
    private void m631c(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i9 = size - paddingLeft;
        int i10 = this.f593D;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = i10 + (i12 / i11);
        int childCount = getChildCount();
        int i14 = i11;
        int i15 = 0;
        int i16 = 0;
        boolean z3 = false;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        long j = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            int i20 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z4 = childAt instanceof ActionMenuItemView;
                int i21 = i17 + 1;
                if (z4) {
                    int i22 = this.f594E;
                    i8 = i21;
                    z2 = false;
                    childAt.setPadding(i22, 0, i22, 0);
                } else {
                    i8 = i21;
                    z2 = false;
                }
                C0116c cVar = (C0116c) childAt.getLayoutParams();
                cVar.f607h = z2;
                cVar.f604e = z2 ? 1 : 0;
                cVar.f603d = z2;
                cVar.f605f = z2;
                cVar.leftMargin = z2;
                cVar.rightMargin = z2;
                cVar.f606g = z4 && ((ActionMenuItemView) childAt).mo293d();
                int a = m630a(childAt, i13, cVar.f602c ? 1 : i14, childMeasureSpec, paddingTop);
                int max = Math.max(i18, a);
                if (cVar.f605f) {
                    i19++;
                }
                if (cVar.f602c) {
                    z3 = true;
                }
                i14 -= a;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (a == 1) {
                    j |= (long) (1 << i15);
                    i16 = i16;
                } else {
                    int i23 = i16;
                }
                i18 = max;
                i17 = i8;
            }
            i15++;
            size2 = i20;
        }
        int i24 = size2;
        boolean z5 = z3 && i17 == 2;
        boolean z6 = false;
        while (true) {
            if (i19 <= 0 || i14 <= 0) {
                i5 = mode;
                i3 = i9;
                z = z6;
                i4 = i16;
            } else {
                int i25 = Integer.MAX_VALUE;
                int i26 = 0;
                int i27 = 0;
                long j2 = 0;
                while (i26 < childCount) {
                    boolean z7 = z6;
                    C0116c cVar2 = (C0116c) getChildAt(i26).getLayoutParams();
                    int i28 = i16;
                    if (cVar2.f605f) {
                        int i29 = cVar2.f603d;
                        if (i29 < i25) {
                            i25 = i29;
                            j2 = 1 << i26;
                            i27 = 1;
                        } else if (i29 == i25) {
                            j2 |= 1 << i26;
                            i27++;
                        }
                    }
                    i26++;
                    i16 = i28;
                    z6 = z7;
                }
                z = z6;
                i4 = i16;
                j |= j2;
                if (i27 > i14) {
                    i5 = mode;
                    i3 = i9;
                    break;
                }
                int i30 = i25 + 1;
                int i31 = 0;
                while (i31 < childCount) {
                    View childAt2 = getChildAt(i31);
                    C0116c cVar3 = (C0116c) childAt2.getLayoutParams();
                    int i32 = i9;
                    int i33 = mode;
                    long j3 = (long) (1 << i31);
                    if ((j2 & j3) == 0) {
                        if (cVar3.f603d == i30) {
                            j |= j3;
                        }
                        i7 = i30;
                    } else {
                        if (!z5 || !cVar3.f606g || i14 != 1) {
                            i7 = i30;
                        } else {
                            int i34 = this.f594E;
                            i7 = i30;
                            childAt2.setPadding(i34 + i13, 0, i34, 0);
                        }
                        cVar3.f603d++;
                        cVar3.f607h = true;
                        i14--;
                    }
                    i31++;
                    mode = i33;
                    i30 = i7;
                    i9 = i32;
                }
                i16 = i4;
                z6 = true;
            }
        }
        boolean z8 = !z3 && i17 == 1;
        if (i14 <= 0 || j == 0 || (i14 >= i17 - 1 && !z8 && i18 <= 1)) {
            i6 = 0;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z8) {
                i6 = 0;
                if ((j & 1) != 0 && !((C0116c) getChildAt(0).getLayoutParams()).f606g) {
                    bitCount -= 0.5f;
                }
                int i35 = childCount - 1;
                if ((j & ((long) (1 << i35))) != 0 && !((C0116c) getChildAt(i35).getLayoutParams()).f606g) {
                    bitCount -= 0.5f;
                }
            } else {
                i6 = 0;
            }
            int i36 = bitCount > 0.0f ? (int) (((float) (i14 * i13)) / bitCount) : 0;
            for (int i37 = 0; i37 < childCount; i37++) {
                if ((j & ((long) (1 << i37))) != 0) {
                    View childAt3 = getChildAt(i37);
                    C0116c cVar4 = (C0116c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f604e = i36;
                        cVar4.f607h = true;
                        if (i37 == 0 && !cVar4.f606g) {
                            cVar4.leftMargin = (-i36) / 2;
                        }
                    } else if (cVar4.f602c) {
                        cVar4.f604e = i36;
                        cVar4.f607h = true;
                        cVar4.rightMargin = (-i36) / 2;
                    } else {
                        if (i37 != 0) {
                            cVar4.leftMargin = i36 / 2;
                        }
                        if (i37 != childCount - 1) {
                            cVar4.rightMargin = i36 / 2;
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            while (i6 < childCount) {
                View childAt4 = getChildAt(i6);
                C0116c cVar5 = (C0116c) childAt4.getLayoutParams();
                if (cVar5.f607h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f603d * i13) + cVar5.f604e, 1073741824), childMeasureSpec);
                }
                i6++;
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i24);
    }

    /* renamed from: a */
    public void mo311a(C0081g gVar) {
        this.f596u = gVar;
    }

    /* renamed from: a */
    public void mo809a(C0097n.C0098a aVar, C0081g.C0082a aVar2) {
        this.f601z = aVar;
        this.f590A = aVar2;
    }

    /* renamed from: a */
    public boolean mo312a(C0086j jVar) {
        return this.f596u.mo458a((MenuItem) jVar, 0);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0116c;
    }

    /* renamed from: d */
    public void mo811d() {
        C0156c cVar = this.f600y;
        if (cVar != null) {
            cVar.mo1224c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo812d(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0114a)) {
            z = false | ((C0114a) childAt).mo291b();
        }
        return (i <= 0 || !(childAt2 instanceof C0114a)) ? z : z | ((C0114a) childAt2).mo292c();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public C0116c mo814e() {
        C0116c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f602c = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: f */
    public boolean mo815f() {
        C0156c cVar = this.f600y;
        return cVar != null && cVar.mo1226e();
    }

    /* renamed from: g */
    public boolean mo816g() {
        C0156c cVar = this.f600y;
        return cVar != null && cVar.mo1228g();
    }

    /* access modifiers changed from: protected */
    public C0116c generateDefaultLayoutParams() {
        C0116c cVar = new C0116c(-2, -2);
        cVar.f894b = 16;
        return cVar;
    }

    public C0116c generateLayoutParams(AttributeSet attributeSet) {
        return new C0116c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0116c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0116c cVar = layoutParams instanceof C0116c ? new C0116c((C0116c) layoutParams) : new C0116c(layoutParams);
        if (cVar.f894b <= 0) {
            cVar.f894b = 16;
        }
        return cVar;
    }

    public Menu getMenu() {
        if (this.f596u == null) {
            Context context = getContext();
            this.f596u = new C0081g(context);
            this.f596u.mo453a((C0081g.C0082a) new C0117d());
            this.f600y = new C0156c(context);
            this.f600y.mo1223c(true);
            C0156c cVar = this.f600y;
            C0097n.C0098a aVar = this.f601z;
            if (aVar == null) {
                aVar = new C0115b();
            }
            cVar.mo390a(aVar);
            this.f596u.mo455a((C0097n) this.f600y, this.f597v);
            this.f600y.mo1221a(this);
        }
        return this.f596u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f600y.mo1225d();
    }

    public int getPopupTheme() {
        return this.f598w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public boolean mo824h() {
        C0156c cVar = this.f600y;
        return cVar != null && cVar.mo1229h();
    }

    /* renamed from: i */
    public boolean mo825i() {
        return this.f599x;
    }

    /* renamed from: j */
    public C0081g mo826j() {
        return this.f596u;
    }

    /* renamed from: k */
    public boolean mo827k() {
        C0156c cVar = this.f600y;
        return cVar != null && cVar.mo1230i();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0156c cVar = this.f600y;
        if (cVar != null) {
            cVar.mo391a(false);
            if (this.f600y.mo1229h()) {
                this.f600y.mo1226e();
                this.f600y.mo1230i();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo811d();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.f591B) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0246x0.m1240a(this);
        int i11 = paddingRight;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0116c cVar = (C0116c) childAt.getLayoutParams();
                if (cVar.f602c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo812d(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i7 = getPaddingLeft() + cVar.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i15 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i15, i8, measuredHeight + i15);
                    i11 -= measuredWidth;
                    i12 = 1;
                } else {
                    i11 -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    boolean d = mo812d(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i10 / 2) - (measuredWidth2 / 2);
            int i17 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i5 = i11 / i18;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                C0116c cVar2 = (C0116c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f602c) {
                    int i19 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width = i19 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
                i6++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i6 < childCount) {
            View childAt4 = getChildAt(i6);
            C0116c cVar3 = (C0116c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f602c) {
                int i21 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + cVar3.rightMargin + max;
            }
            i6++;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0081g gVar;
        boolean z = this.f591B;
        this.f591B = View.MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f591B) {
            this.f592C = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f591B || (gVar = this.f596u) == null || size == this.f592C)) {
            this.f592C = size;
            gVar.mo475b(true);
        }
        int childCount = getChildCount();
        if (!this.f591B || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0116c cVar = (C0116c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m631c(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f600y.mo1222b(z);
    }

    public void setOnMenuItemClickListener(C0118e eVar) {
        this.f595F = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f600y.mo1220a(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f599x = z;
    }

    public void setPopupTheme(int i) {
        if (this.f598w != i) {
            this.f598w = i;
            if (i == 0) {
                this.f597v = getContext();
            } else {
                this.f597v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0156c cVar) {
        this.f600y = cVar;
        this.f600y.mo1221a(this);
    }
}
