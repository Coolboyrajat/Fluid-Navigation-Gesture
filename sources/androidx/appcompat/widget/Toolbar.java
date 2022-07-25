package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0026a;
import androidx.appcompat.view.menu.C0081g;
import androidx.appcompat.view.menu.C0086j;
import androidx.appcompat.view.menu.C0097n;
import androidx.appcompat.view.menu.C0106s;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p006b.p007a.C0654a;
import p006b.p007a.C0663j;
import p006b.p007a.p008k.p009a.C0664a;
import p006b.p007a.p014o.C0687c;
import p006b.p007a.p014o.C0692g;
import p006b.p026g.p035k.C0851d;
import p006b.p026g.p035k.C0875g;
import p006b.p026g.p035k.C0890v;
import p006b.p039i.p040a.C0912a;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f753A;

    /* renamed from: B */
    private int f754B;

    /* renamed from: C */
    private CharSequence f755C;

    /* renamed from: D */
    private CharSequence f756D;

    /* renamed from: E */
    private ColorStateList f757E;

    /* renamed from: F */
    private ColorStateList f758F;

    /* renamed from: G */
    private boolean f759G;

    /* renamed from: H */
    private boolean f760H;

    /* renamed from: I */
    private final ArrayList<View> f761I;

    /* renamed from: J */
    private final ArrayList<View> f762J;

    /* renamed from: K */
    private final int[] f763K;

    /* renamed from: L */
    C0144f f764L;

    /* renamed from: M */
    private final ActionMenuView.C0118e f765M;

    /* renamed from: N */
    private C0230s0 f766N;

    /* renamed from: O */
    private C0156c f767O;

    /* renamed from: P */
    private C0142d f768P;

    /* renamed from: Q */
    private C0097n.C0098a f769Q;

    /* renamed from: R */
    private C0081g.C0082a f770R;

    /* renamed from: S */
    private boolean f771S;

    /* renamed from: T */
    private final Runnable f772T;

    /* renamed from: f */
    private ActionMenuView f773f;

    /* renamed from: g */
    private TextView f774g;

    /* renamed from: h */
    private TextView f775h;

    /* renamed from: i */
    private ImageButton f776i;

    /* renamed from: j */
    private ImageView f777j;

    /* renamed from: k */
    private Drawable f778k;

    /* renamed from: l */
    private CharSequence f779l;

    /* renamed from: m */
    ImageButton f780m;

    /* renamed from: n */
    View f781n;

    /* renamed from: o */
    private Context f782o;

    /* renamed from: p */
    private int f783p;

    /* renamed from: q */
    private int f784q;

    /* renamed from: r */
    private int f785r;

    /* renamed from: s */
    int f786s;

    /* renamed from: t */
    private int f787t;

    /* renamed from: u */
    private int f788u;

    /* renamed from: v */
    private int f789v;

    /* renamed from: w */
    private int f790w;

    /* renamed from: x */
    private int f791x;

    /* renamed from: y */
    private C0196j0 f792y;

    /* renamed from: z */
    private int f793z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0139a implements ActionMenuView.C0118e {
        C0139a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C0144f fVar = Toolbar.this.f764L;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    class C0140b implements Runnable {
        C0140b() {
        }

        public void run() {
            Toolbar.this.mo1124k();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    class C0141c implements View.OnClickListener {
        C0141c() {
        }

        public void onClick(View view) {
            Toolbar.this.mo1082c();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    private class C0142d implements C0097n {

        /* renamed from: f */
        C0081g f797f;

        /* renamed from: g */
        C0086j f798g;

        C0142d() {
        }

        /* renamed from: a */
        public void mo386a(Context context, C0081g gVar) {
            C0086j jVar;
            C0081g gVar2 = this.f797f;
            if (!(gVar2 == null || (jVar = this.f798g) == null)) {
                gVar2.mo461a(jVar);
            }
            this.f797f = gVar;
        }

        /* renamed from: a */
        public void mo388a(C0081g gVar, boolean z) {
        }

        /* renamed from: a */
        public void mo391a(boolean z) {
            if (this.f798g != null) {
                C0081g gVar = this.f797f;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f797f.getItem(i) == this.f798g) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo394a(this.f797f, this.f798g);
                }
            }
        }

        /* renamed from: a */
        public boolean mo394a(C0081g gVar, C0086j jVar) {
            View view = Toolbar.this.f781n;
            if (view instanceof C0687c) {
                ((C0687c) view).mo644c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f781n);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f780m);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f781n = null;
            toolbar3.mo1075a();
            this.f798g = null;
            Toolbar.this.requestLayout();
            jVar.mo525a(false);
            return true;
        }

        /* renamed from: a */
        public boolean mo395a(C0106s sVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo410b() {
            return false;
        }

        /* renamed from: b */
        public boolean mo397b(C0081g gVar, C0086j jVar) {
            Toolbar.this.mo1085e();
            ViewParent parent = Toolbar.this.f780m.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f780m);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f780m);
            }
            Toolbar.this.f781n = jVar.getActionView();
            this.f798g = jVar;
            ViewParent parent2 = Toolbar.this.f781n.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f781n);
                }
                C0143e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f141a = 8388611 | (toolbar4.f786s & 112);
                generateDefaultLayoutParams.f800b = 2;
                toolbar4.f781n.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f781n);
            }
            Toolbar.this.mo1123j();
            Toolbar.this.requestLayout();
            jVar.mo525a(true);
            View view = Toolbar.this.f781n;
            if (view instanceof C0687c) {
                ((C0687c) view).mo643b();
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0143e extends C0026a.C0027a {

        /* renamed from: b */
        int f800b = 0;

        public C0143e(int i, int i2) {
            super(i, i2);
            this.f141a = 8388627;
        }

        public C0143e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0143e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0143e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            mo1166a(marginLayoutParams);
        }

        public C0143e(C0026a.C0027a aVar) {
            super(aVar);
        }

        public C0143e(C0143e eVar) {
            super((C0026a.C0027a) eVar);
            this.f800b = eVar.f800b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1166a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface C0144f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0145g extends C0912a {
        public static final Parcelable.Creator<C0145g> CREATOR = new C0146a();

        /* renamed from: h */
        int f801h;

        /* renamed from: i */
        boolean f802i;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        static class C0146a implements Parcelable.ClassLoaderCreator<C0145g> {
            C0146a() {
            }

            public C0145g createFromParcel(Parcel parcel) {
                return new C0145g(parcel, (ClassLoader) null);
            }

            public C0145g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0145g(parcel, classLoader);
            }

            public C0145g[] newArray(int i) {
                return new C0145g[i];
            }
        }

        public C0145g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f801h = parcel.readInt();
            this.f802i = parcel.readInt() != 0;
        }

        public C0145g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f801h);
            parcel.writeInt(this.f802i ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0654a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f754B = 8388627;
        this.f761I = new ArrayList<>();
        this.f762J = new ArrayList<>();
        this.f763K = new int[2];
        this.f765M = new C0139a();
        this.f772T = new C0140b();
        C0217r0 a = C0217r0.m1054a(getContext(), attributeSet, C0663j.Toolbar, i, 0);
        this.f784q = a.mo1544g(C0663j.Toolbar_titleTextAppearance, 0);
        this.f785r = a.mo1544g(C0663j.Toolbar_subtitleTextAppearance, 0);
        this.f754B = a.mo1540e(C0663j.Toolbar_android_gravity, this.f754B);
        this.f786s = a.mo1540e(C0663j.Toolbar_buttonGravity, 48);
        int b = a.mo1534b(C0663j.Toolbar_titleMargin, 0);
        b = a.mo1545g(C0663j.Toolbar_titleMargins) ? a.mo1534b(C0663j.Toolbar_titleMargins, b) : b;
        this.f791x = b;
        this.f790w = b;
        this.f789v = b;
        this.f788u = b;
        int b2 = a.mo1534b(C0663j.Toolbar_titleMarginStart, -1);
        if (b2 >= 0) {
            this.f788u = b2;
        }
        int b3 = a.mo1534b(C0663j.Toolbar_titleMarginEnd, -1);
        if (b3 >= 0) {
            this.f789v = b3;
        }
        int b4 = a.mo1534b(C0663j.Toolbar_titleMarginTop, -1);
        if (b4 >= 0) {
            this.f790w = b4;
        }
        int b5 = a.mo1534b(C0663j.Toolbar_titleMarginBottom, -1);
        if (b5 >= 0) {
            this.f791x = b5;
        }
        this.f787t = a.mo1536c(C0663j.Toolbar_maxButtonHeight, -1);
        int b6 = a.mo1534b(C0663j.Toolbar_contentInsetStart, (int) RecyclerView.UNDEFINED_DURATION);
        int b7 = a.mo1534b(C0663j.Toolbar_contentInsetEnd, (int) RecyclerView.UNDEFINED_DURATION);
        int c = a.mo1536c(C0663j.Toolbar_contentInsetLeft, 0);
        int c2 = a.mo1536c(C0663j.Toolbar_contentInsetRight, 0);
        m738l();
        this.f792y.mo1444a(c, c2);
        if (!(b6 == Integer.MIN_VALUE && b7 == Integer.MIN_VALUE)) {
            this.f792y.mo1447b(b6, b7);
        }
        this.f793z = a.mo1534b(C0663j.Toolbar_contentInsetStartWithNavigation, (int) RecyclerView.UNDEFINED_DURATION);
        this.f753A = a.mo1534b(C0663j.Toolbar_contentInsetEndWithActions, (int) RecyclerView.UNDEFINED_DURATION);
        this.f778k = a.mo1535b(C0663j.Toolbar_collapseIcon);
        this.f779l = a.mo1541e(C0663j.Toolbar_collapseContentDescription);
        CharSequence e = a.mo1541e(C0663j.Toolbar_title);
        if (!TextUtils.isEmpty(e)) {
            setTitle(e);
        }
        CharSequence e2 = a.mo1541e(C0663j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(e2)) {
            setSubtitle(e2);
        }
        this.f782o = getContext();
        setPopupTheme(a.mo1544g(C0663j.Toolbar_popupTheme, 0));
        Drawable b8 = a.mo1535b(C0663j.Toolbar_navigationIcon);
        if (b8 != null) {
            setNavigationIcon(b8);
        }
        CharSequence e3 = a.mo1541e(C0663j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(e3)) {
            setNavigationContentDescription(e3);
        }
        Drawable b9 = a.mo1535b(C0663j.Toolbar_logo);
        if (b9 != null) {
            setLogo(b9);
        }
        CharSequence e4 = a.mo1541e(C0663j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(e4)) {
            setLogoDescription(e4);
        }
        if (a.mo1545g(C0663j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.mo1529a(C0663j.Toolbar_titleTextColor));
        }
        if (a.mo1545g(C0663j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.mo1529a(C0663j.Toolbar_subtitleTextColor));
        }
        if (a.mo1545g(C0663j.Toolbar_menu)) {
            mo1076a(a.mo1544g(C0663j.Toolbar_menu, 0));
        }
        a.mo1531a();
    }

    /* renamed from: a */
    private int m724a(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0875g.m4689b(marginLayoutParams) + C0875g.m4688a(marginLayoutParams);
    }

    /* renamed from: a */
    private int m725a(View view, int i) {
        C0143e eVar = (C0143e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int c = mo7787c(eVar.f141a);
        if (c == 48) {
            return getPaddingTop() - i2;
        }
        if (c == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = eVar.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = eVar.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private int m726a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m727a(View view, int i, int[] iArr, int i2) {
        C0143e eVar = (C0143e) view.getLayoutParams();
        int i3 = eVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m725a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + eVar.rightMargin;
    }

    /* renamed from: a */
    private int m728a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = i2;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            View view = list.get(i5);
            C0143e eVar = (C0143e) view.getLayoutParams();
            int i7 = eVar.leftMargin - i4;
            int i8 = eVar.rightMargin - i3;
            int max = Math.max(0, i7);
            int max2 = Math.max(0, i8);
            int max3 = Math.max(0, -i7);
            int max4 = Math.max(0, -i8);
            i6 += max + view.getMeasuredWidth() + max2;
            i5++;
            i3 = max4;
            i4 = max3;
        }
        return i6;
    }

    /* renamed from: a */
    private void m729a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private void m730a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0143e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0143e) layoutParams;
        generateDefaultLayoutParams.f800b = 1;
        if (!z || this.f781n == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.f762J.add(view);
    }

    /* renamed from: a */
    private void m731a(List<View> list, int i) {
        boolean z = C0890v.m4791o(this) == 1;
        int childCount = getChildCount();
        int a = C0851d.m4580a(i, C0890v.m4791o(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0143e eVar = (C0143e) childAt.getLayoutParams();
                if (eVar.f800b == 0 && m737d(childAt) && mo7786b(eVar.f141a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0143e eVar2 = (C0143e) childAt2.getLayoutParams();
            if (eVar2.f800b == 0 && m737d(childAt2) && mo7786b(eVar2.f141a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    private int mo7786b(int i) {
        int o = C0890v.m4791o(this);
        int a = C0851d.m4580a(i, o) & 7;
        return (a == 1 || a == 3 || a == 5) ? a : o == 1 ? 5 : 3;
    }

    /* renamed from: b */
    private int m733b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: b */
    private int m734b(View view, int i, int[] iArr, int i2) {
        C0143e eVar = (C0143e) view.getLayoutParams();
        int i3 = eVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m725a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + eVar.leftMargin);
    }

    /* renamed from: c */
    private int mo7787c(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f754B & 112;
    }

    /* renamed from: c */
    private boolean m736c(View view) {
        return view.getParent() == this || this.f762J.contains(view);
    }

    /* renamed from: d */
    private boolean m737d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private MenuInflater getMenuInflater() {
        return new C0692g(getContext());
    }

    /* renamed from: l */
    private void m738l() {
        if (this.f792y == null) {
            this.f792y = new C0196j0();
        }
    }

    /* renamed from: m */
    private void m739m() {
        if (this.f777j == null) {
            this.f777j = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: n */
    private void m740n() {
        m741o();
        if (this.f773f.mo826j() == null) {
            C0081g gVar = (C0081g) this.f773f.getMenu();
            if (this.f768P == null) {
                this.f768P = new C0142d();
            }
            this.f773f.setExpandedActionViewsExclusive(true);
            gVar.mo455a((C0097n) this.f768P, this.f782o);
        }
    }

    /* renamed from: o */
    private void m741o() {
        if (this.f773f == null) {
            this.f773f = new ActionMenuView(getContext());
            this.f773f.setPopupTheme(this.f783p);
            this.f773f.setOnMenuItemClickListener(this.f765M);
            this.f773f.mo809a(this.f769Q, this.f770R);
            C0143e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f141a = 8388613 | (this.f786s & 112);
            this.f773f.setLayoutParams(generateDefaultLayoutParams);
            m730a((View) this.f773f, false);
        }
    }

    /* renamed from: p */
    private void m742p() {
        if (this.f776i == null) {
            this.f776i = new C0203l(getContext(), (AttributeSet) null, C0654a.toolbarNavigationButtonStyle);
            C0143e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f141a = 8388611 | (this.f786s & 112);
            this.f776i.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: q */
    private void m743q() {
        removeCallbacks(this.f772T);
        post(this.f772T);
    }

    /* renamed from: r */
    private boolean m744r() {
        if (!this.f771S) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m737d(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1075a() {
        for (int size = this.f762J.size() - 1; size >= 0; size--) {
            addView(this.f762J.get(size));
        }
        this.f762J.clear();
    }

    /* renamed from: a */
    public void mo1076a(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: a */
    public void mo1077a(int i, int i2) {
        m738l();
        this.f792y.mo1447b(i, i2);
    }

    /* renamed from: a */
    public void mo1078a(Context context, int i) {
        this.f785r = i;
        TextView textView = this.f775h;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public void mo1079a(C0081g gVar, C0156c cVar) {
        if (gVar != null || this.f773f != null) {
            m741o();
            C0081g j = this.f773f.mo826j();
            if (j != gVar) {
                if (j != null) {
                    j.mo474b((C0097n) this.f767O);
                    j.mo474b((C0097n) this.f768P);
                }
                if (this.f768P == null) {
                    this.f768P = new C0142d();
                }
                cVar.mo1222b(true);
                if (gVar != null) {
                    gVar.mo455a((C0097n) cVar, this.f782o);
                    gVar.mo455a((C0097n) this.f768P, this.f782o);
                } else {
                    cVar.mo386a(this.f782o, (C0081g) null);
                    this.f768P.mo386a(this.f782o, (C0081g) null);
                    cVar.mo391a(true);
                    this.f768P.mo391a(true);
                }
                this.f773f.setPopupTheme(this.f783p);
                this.f773f.setPresenter(cVar);
                this.f767O = cVar;
            }
        }
    }

    /* renamed from: b */
    public void mo1080b(Context context, int i) {
        this.f784q = i;
        TextView textView = this.f774g;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f773f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1081b() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f773f
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo825i()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.mo1081b():boolean");
    }

    /* renamed from: c */
    public void mo1082c() {
        C0142d dVar = this.f768P;
        C0086j jVar = dVar == null ? null : dVar.f798g;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0143e);
    }

    /* renamed from: d */
    public void mo1084d() {
        ActionMenuView actionMenuView = this.f773f;
        if (actionMenuView != null) {
            actionMenuView.mo811d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1085e() {
        if (this.f780m == null) {
            this.f780m = new C0203l(getContext(), (AttributeSet) null, C0654a.toolbarNavigationButtonStyle);
            this.f780m.setImageDrawable(this.f778k);
            this.f780m.setContentDescription(this.f779l);
            C0143e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f141a = 8388611 | (this.f786s & 112);
            generateDefaultLayoutParams.f800b = 2;
            this.f780m.setLayoutParams(generateDefaultLayoutParams);
            this.f780m.setOnClickListener(new C0141c());
        }
    }

    /* renamed from: f */
    public boolean mo1086f() {
        C0142d dVar = this.f768P;
        return (dVar == null || dVar.f798g == null) ? false : true;
    }

    /* renamed from: g */
    public boolean mo1087g() {
        ActionMenuView actionMenuView = this.f773f;
        return actionMenuView != null && actionMenuView.mo815f();
    }

    /* access modifiers changed from: protected */
    public C0143e generateDefaultLayoutParams() {
        return new C0143e(-2, -2);
    }

    public C0143e generateLayoutParams(AttributeSet attributeSet) {
        return new C0143e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0143e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0143e ? new C0143e((C0143e) layoutParams) : layoutParams instanceof C0026a.C0027a ? new C0143e((C0026a.C0027a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0143e((ViewGroup.MarginLayoutParams) layoutParams) : new C0143e(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f780m;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f780m;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0196j0 j0Var = this.f792y;
        if (j0Var != null) {
            return j0Var.mo1443a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f753A;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0196j0 j0Var = this.f792y;
        if (j0Var != null) {
            return j0Var.mo1446b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0196j0 j0Var = this.f792y;
        if (j0Var != null) {
            return j0Var.mo1448c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0196j0 j0Var = this.f792y;
        if (j0Var != null) {
            return j0Var.mo1449d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f793z;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo826j();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f773f
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.g r0 = r0.mo826j()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f753A
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return C0890v.m4791o(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0890v.m4791o(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f793z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f777j;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f777j;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m740n();
        return this.f773f.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f776i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f776i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C0156c getOuterActionMenuPresenter() {
        return this.f767O;
    }

    public Drawable getOverflowIcon() {
        m740n();
        return this.f773f.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f782o;
    }

    public int getPopupTheme() {
        return this.f783p;
    }

    public CharSequence getSubtitle() {
        return this.f756D;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f775h;
    }

    public CharSequence getTitle() {
        return this.f755C;
    }

    public int getTitleMarginBottom() {
        return this.f791x;
    }

    public int getTitleMarginEnd() {
        return this.f789v;
    }

    public int getTitleMarginStart() {
        return this.f788u;
    }

    public int getTitleMarginTop() {
        return this.f790w;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f774g;
    }

    public C0247y getWrapper() {
        if (this.f766N == null) {
            this.f766N = new C0230s0(this, true);
        }
        return this.f766N;
    }

    /* renamed from: h */
    public boolean mo1121h() {
        ActionMenuView actionMenuView = this.f773f;
        return actionMenuView != null && actionMenuView.mo816g();
    }

    /* renamed from: i */
    public boolean mo1122i() {
        ActionMenuView actionMenuView = this.f773f;
        return actionMenuView != null && actionMenuView.mo824h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo1123j() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0143e) childAt.getLayoutParams()).f800b == 2 || childAt == this.f773f)) {
                removeViewAt(childCount);
                this.f762J.add(childAt);
            }
        }
    }

    /* renamed from: k */
    public boolean mo1124k() {
        ActionMenuView actionMenuView = this.f773f;
        return actionMenuView != null && actionMenuView.mo827k();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f772T);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f760H = false;
        }
        if (!this.f760H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f760H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f760H = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x029c A[LOOP:0: B:106:0x029a->B:107:0x029c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02be A[LOOP:1: B:109:0x02bc->B:110:0x02be, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f8 A[LOOP:2: B:117:0x02f6->B:118:0x02f8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0222  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = p006b.p026g.p035k.C0890v.m4791o(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f763K
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p006b.p026g.p035k.C0890v.m4792p(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f776i
            boolean r13 = r0.m737d(r13)
            if (r13 == 0) goto L_0x0053
            android.widget.ImageButton r13 = r0.f776i
            if (r1 == 0) goto L_0x004e
            int r13 = r0.m734b(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0055
        L_0x004e:
            int r13 = r0.m727a(r13, r6, r11, r12)
            goto L_0x0054
        L_0x0053:
            r13 = r6
        L_0x0054:
            r14 = r10
        L_0x0055:
            android.widget.ImageButton r15 = r0.f780m
            boolean r15 = r0.m737d(r15)
            if (r15 == 0) goto L_0x006a
            android.widget.ImageButton r15 = r0.f780m
            if (r1 == 0) goto L_0x0066
            int r14 = r0.m734b(r15, r14, r11, r12)
            goto L_0x006a
        L_0x0066:
            int r13 = r0.m727a(r15, r13, r11, r12)
        L_0x006a:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f773f
            boolean r15 = r0.m737d(r15)
            if (r15 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f773f
            if (r1 == 0) goto L_0x007b
            int r13 = r0.m727a(r15, r13, r11, r12)
            goto L_0x007f
        L_0x007b:
            int r14 = r0.m734b(r15, r14, r11, r12)
        L_0x007f:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f781n
            boolean r13 = r0.m737d(r13)
            if (r13 == 0) goto L_0x00ba
            android.view.View r13 = r0.f781n
            if (r1 == 0) goto L_0x00b6
            int r10 = r0.m734b(r13, r10, r11, r12)
            goto L_0x00ba
        L_0x00b6:
            int r2 = r0.m727a(r13, r2, r11, r12)
        L_0x00ba:
            android.widget.ImageView r13 = r0.f777j
            boolean r13 = r0.m737d(r13)
            if (r13 == 0) goto L_0x00cf
            android.widget.ImageView r13 = r0.f777j
            if (r1 == 0) goto L_0x00cb
            int r10 = r0.m734b(r13, r10, r11, r12)
            goto L_0x00cf
        L_0x00cb:
            int r2 = r0.m727a(r13, r2, r11, r12)
        L_0x00cf:
            android.widget.TextView r13 = r0.f774g
            boolean r13 = r0.m737d(r13)
            android.widget.TextView r14 = r0.f775h
            boolean r14 = r0.m737d(r14)
            if (r13 == 0) goto L_0x00f6
            android.widget.TextView r15 = r0.f774g
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.C0143e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f774g
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x00f9
        L_0x00f6:
            r23 = r7
            r3 = 0
        L_0x00f9:
            if (r14 == 0) goto L_0x0113
            android.widget.TextView r7 = r0.f775h
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0143e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f775h
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x0115
        L_0x0113:
            r16 = r4
        L_0x0115:
            if (r13 != 0) goto L_0x0121
            if (r14 == 0) goto L_0x011a
            goto L_0x0121
        L_0x011a:
            r17 = r6
            r22 = r12
        L_0x011e:
            r7 = 0
            goto L_0x028c
        L_0x0121:
            if (r13 == 0) goto L_0x0126
            android.widget.TextView r4 = r0.f774g
            goto L_0x0128
        L_0x0126:
            android.widget.TextView r4 = r0.f775h
        L_0x0128:
            if (r14 == 0) goto L_0x012d
            android.widget.TextView r7 = r0.f775h
            goto L_0x012f
        L_0x012d:
            android.widget.TextView r7 = r0.f774g
        L_0x012f:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0143e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0143e) r7
            if (r13 == 0) goto L_0x0145
            android.widget.TextView r15 = r0.f774g
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x014f
        L_0x0145:
            if (r14 == 0) goto L_0x0153
            android.widget.TextView r15 = r0.f775h
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0153
        L_0x014f:
            r17 = r6
            r15 = 1
            goto L_0x0156
        L_0x0153:
            r17 = r6
            r15 = 0
        L_0x0156:
            int r6 = r0.f754B
            r6 = r6 & 112(0x70, float:1.57E-43)
            r22 = r12
            r12 = 48
            if (r6 == r12) goto L_0x019e
            r12 = 80
            if (r6 == r12) goto L_0x0190
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r24 = r2
            int r2 = r0.f790w
            r18 = r14
            int r14 = r12 + r2
            if (r6 >= r14) goto L_0x0179
            int r6 = r12 + r2
            goto L_0x018e
        L_0x0179:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f791x
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018e
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018e:
            int r8 = r8 + r6
            goto L_0x01ad
        L_0x0190:
            r24 = r2
            r18 = r14
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f791x
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01ad
        L_0x019e:
            r24 = r2
            r18 = r14
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f790w
            int r8 = r2 + r3
        L_0x01ad:
            if (r1 == 0) goto L_0x0222
            if (r15 == 0) goto L_0x01b5
            int r3 = r0.f788u
            r1 = 1
            goto L_0x01b7
        L_0x01b5:
            r1 = 1
            r3 = 0
        L_0x01b7:
            r2 = r11[r1]
            int r3 = r3 - r2
            r2 = 0
            int r4 = java.lang.Math.max(r2, r3)
            int r10 = r10 - r4
            int r3 = -r3
            int r3 = java.lang.Math.max(r2, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x01ed
            android.widget.TextView r1 = r0.f774g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0143e) r1
            android.widget.TextView r2 = r0.f774g
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f774g
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f774g
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f789v
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01ee
        L_0x01ed:
            r2 = r10
        L_0x01ee:
            if (r18 == 0) goto L_0x0216
            android.widget.TextView r1 = r0.f775h
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0143e) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f775h
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f775h
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f775h
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.f789v
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x0217
        L_0x0216:
            r3 = r10
        L_0x0217:
            if (r15 == 0) goto L_0x021e
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x021e:
            r2 = r24
            goto L_0x011e
        L_0x0222:
            if (r15 == 0) goto L_0x0227
            int r3 = r0.f788u
            goto L_0x0228
        L_0x0227:
            r3 = 0
        L_0x0228:
            r7 = 0
            r1 = r11[r7]
            int r3 = r3 - r1
            int r1 = java.lang.Math.max(r7, r3)
            int r2 = r24 + r1
            int r1 = -r3
            int r1 = java.lang.Math.max(r7, r1)
            r11[r7] = r1
            if (r13 == 0) goto L_0x025e
            android.widget.TextView r1 = r0.f774g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0143e) r1
            android.widget.TextView r3 = r0.f774g
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r4 = r0.f774g
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f774g
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.f789v
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x025f
        L_0x025e:
            r3 = r2
        L_0x025f:
            if (r18 == 0) goto L_0x0285
            android.widget.TextView r1 = r0.f775h
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0143e) r1
            int r4 = r1.topMargin
            int r8 = r8 + r4
            android.widget.TextView r4 = r0.f775h
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f775h
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f775h
            r6.layout(r2, r8, r4, r5)
            int r5 = r0.f789v
            int r4 = r4 + r5
            int r1 = r1.bottomMargin
            goto L_0x0286
        L_0x0285:
            r4 = r2
        L_0x0286:
            if (r15 == 0) goto L_0x028c
            int r2 = java.lang.Math.max(r3, r4)
        L_0x028c:
            java.util.ArrayList<android.view.View> r1 = r0.f761I
            r3 = 3
            r0.m731a((java.util.List<android.view.View>) r1, (int) r3)
            java.util.ArrayList<android.view.View> r1 = r0.f761I
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x029a:
            if (r2 >= r1) goto L_0x02ad
            java.util.ArrayList<android.view.View> r4 = r0.f761I
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.m727a(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x029a
        L_0x02ad:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.f761I
            r2 = 5
            r0.m731a((java.util.List<android.view.View>) r1, (int) r2)
            java.util.ArrayList<android.view.View> r1 = r0.f761I
            int r1 = r1.size()
            r2 = 0
        L_0x02bc:
            if (r2 >= r1) goto L_0x02cd
            java.util.ArrayList<android.view.View> r4 = r0.f761I
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m734b(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02bc
        L_0x02cd:
            java.util.ArrayList<android.view.View> r1 = r0.f761I
            r2 = 1
            r0.m731a((java.util.List<android.view.View>) r1, (int) r2)
            java.util.ArrayList<android.view.View> r1 = r0.f761I
            int r1 = r0.m728a((java.util.List<android.view.View>) r1, (int[]) r11)
            int r4 = r16 - r17
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r17 + r4
            int r2 = r1 / 2
            int r2 = r6 - r2
            int r1 = r1 + r2
            if (r2 >= r3) goto L_0x02e9
            goto L_0x02f0
        L_0x02e9:
            if (r1 <= r10) goto L_0x02ef
            int r1 = r1 - r10
            int r3 = r2 - r1
            goto L_0x02f0
        L_0x02ef:
            r3 = r2
        L_0x02f0:
            java.util.ArrayList<android.view.View> r1 = r0.f761I
            int r1 = r1.size()
        L_0x02f6:
            if (r7 >= r1) goto L_0x0307
            java.util.ArrayList<android.view.View> r2 = r0.f761I
            java.lang.Object r2 = r2.get(r7)
            android.view.View r2 = (android.view.View) r2
            int r3 = r0.m727a(r2, r3, r11, r12)
            int r7 = r7 + 1
            goto L_0x02f6
        L_0x0307:
            java.util.ArrayList<android.view.View> r1 = r0.f761I
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f763K;
        if (C0246x0.m1240a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m737d(this.f776i)) {
            m729a((View) this.f776i, i, 0, i2, 0, this.f787t);
            i5 = this.f776i.getMeasuredWidth() + m724a((View) this.f776i);
            i4 = Math.max(0, this.f776i.getMeasuredHeight() + m733b((View) this.f776i));
            i3 = View.combineMeasuredStates(0, this.f776i.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m737d(this.f780m)) {
            m729a((View) this.f780m, i, 0, i2, 0, this.f787t);
            i5 = this.f780m.getMeasuredWidth() + m724a((View) this.f780m);
            i4 = Math.max(i4, this.f780m.getMeasuredHeight() + m733b((View) this.f780m));
            i3 = View.combineMeasuredStates(i3, this.f780m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m737d(this.f773f)) {
            m729a((View) this.f773f, i, max, i2, 0, this.f787t);
            i6 = this.f773f.getMeasuredWidth() + m724a((View) this.f773f);
            i4 = Math.max(i4, this.f773f.getMeasuredHeight() + m733b((View) this.f773f));
            i3 = View.combineMeasuredStates(i3, this.f773f.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m737d(this.f781n)) {
            max2 += m726a(this.f781n, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f781n.getMeasuredHeight() + m733b(this.f781n));
            i3 = View.combineMeasuredStates(i3, this.f781n.getMeasuredState());
        }
        if (m737d(this.f777j)) {
            max2 += m726a((View) this.f777j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f777j.getMeasuredHeight() + m733b((View) this.f777j));
            i3 = View.combineMeasuredStates(i3, this.f777j.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = i4;
        int i11 = max2;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((C0143e) childAt.getLayoutParams()).f800b == 0 && m737d(childAt)) {
                i11 += m726a(childAt, i, i11, i2, 0, iArr);
                i10 = Math.max(i10, childAt.getMeasuredHeight() + m733b(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i13 = this.f790w + this.f791x;
        int i14 = this.f788u + this.f789v;
        if (m737d(this.f774g)) {
            m726a((View) this.f774g, i, i11 + i14, i2, i13, iArr);
            int measuredWidth = this.f774g.getMeasuredWidth() + m724a((View) this.f774g);
            i7 = this.f774g.getMeasuredHeight() + m733b((View) this.f774g);
            i9 = View.combineMeasuredStates(i3, this.f774g.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m737d(this.f775h)) {
            int i15 = i7 + i13;
            i8 = Math.max(i8, m726a((View) this.f775h, i, i11 + i14, i2, i15, iArr));
            i7 += this.f775h.getMeasuredHeight() + m733b((View) this.f775h);
            i9 = View.combineMeasuredStates(i9, this.f775h.getMeasuredState());
        } else {
            int i16 = i9;
        }
        int max3 = Math.max(i10, i7);
        int paddingLeft = i11 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (m744r()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0145g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0145g gVar = (C0145g) parcelable;
        super.onRestoreInstanceState(gVar.mo4725q());
        ActionMenuView actionMenuView = this.f773f;
        C0081g j = actionMenuView != null ? actionMenuView.mo826j() : null;
        int i = gVar.f801h;
        if (!(i == 0 || this.f768P == null || j == null || (findItem = j.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f802i) {
            m743q();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m738l();
        C0196j0 j0Var = this.f792y;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        j0Var.mo1445a(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0086j jVar;
        C0145g gVar = new C0145g(super.onSaveInstanceState());
        C0142d dVar = this.f768P;
        if (!(dVar == null || (jVar = dVar.f798g) == null)) {
            gVar.f801h = jVar.getItemId();
        }
        gVar.f802i = mo1122i();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f759G = false;
        }
        if (!this.f759G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f759G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f759G = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1085e();
        }
        ImageButton imageButton = this.f780m;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C0664a.m3682c(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo1085e();
            this.f780m.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f780m;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f778k);
        }
    }

    public void setCollapsible(boolean z) {
        this.f771S = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f753A) {
            this.f753A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f793z) {
            this.f793z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0664a.m3682c(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m739m();
            if (!m736c((View) this.f777j)) {
                m730a((View) this.f777j, true);
            }
        } else {
            ImageView imageView = this.f777j;
            if (imageView != null && m736c((View) imageView)) {
                removeView(this.f777j);
                this.f762J.remove(this.f777j);
            }
        }
        ImageView imageView2 = this.f777j;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m739m();
        }
        ImageView imageView = this.f777j;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m742p();
        }
        ImageButton imageButton = this.f776i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0664a.m3682c(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m742p();
            if (!m736c((View) this.f776i)) {
                m730a((View) this.f776i, true);
            }
        } else {
            ImageButton imageButton = this.f776i;
            if (imageButton != null && m736c((View) imageButton)) {
                removeView(this.f776i);
                this.f762J.remove(this.f776i);
            }
        }
        ImageButton imageButton2 = this.f776i;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m742p();
        this.f776i.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0144f fVar) {
        this.f764L = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m740n();
        this.f773f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f783p != i) {
            this.f783p = i;
            if (i == 0) {
                this.f782o = getContext();
            } else {
                this.f782o = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f775h == null) {
                Context context = getContext();
                this.f775h = new AppCompatTextView(context);
                this.f775h.setSingleLine();
                this.f775h.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f785r;
                if (i != 0) {
                    this.f775h.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f758F;
                if (colorStateList != null) {
                    this.f775h.setTextColor(colorStateList);
                }
            }
            if (!m736c((View) this.f775h)) {
                m730a((View) this.f775h, true);
            }
        } else {
            TextView textView = this.f775h;
            if (textView != null && m736c((View) textView)) {
                removeView(this.f775h);
                this.f762J.remove(this.f775h);
            }
        }
        TextView textView2 = this.f775h;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f756D = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f758F = colorStateList;
        TextView textView = this.f775h;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f774g == null) {
                Context context = getContext();
                this.f774g = new AppCompatTextView(context);
                this.f774g.setSingleLine();
                this.f774g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f784q;
                if (i != 0) {
                    this.f774g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f757E;
                if (colorStateList != null) {
                    this.f774g.setTextColor(colorStateList);
                }
            }
            if (!m736c((View) this.f774g)) {
                m730a((View) this.f774g, true);
            }
        } else {
            TextView textView = this.f774g;
            if (textView != null && m736c((View) textView)) {
                removeView(this.f774g);
                this.f762J.remove(this.f774g);
            }
        }
        TextView textView2 = this.f774g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f755C = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f791x = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f789v = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f788u = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f790w = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f757E = colorStateList;
        TextView textView = this.f774g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
