package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C0311a;
import androidx.core.graphics.drawable.C0328a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p006b.p025f.C0774a;
import p006b.p025f.C0775b;
import p006b.p025f.C0776c;
import p006b.p026g.p034j.C0832c;
import p006b.p026g.p034j.C0834e;
import p006b.p026g.p034j.C0836g;
import p006b.p026g.p035k.C0851d;
import p006b.p026g.p035k.C0852d0;
import p006b.p026g.p035k.C0882n;
import p006b.p026g.p035k.C0883o;
import p006b.p026g.p035k.C0885q;
import p006b.p026g.p035k.C0886r;
import p006b.p026g.p035k.C0890v;
import p006b.p039i.p040a.C0912a;

public class CoordinatorLayout extends ViewGroup implements C0882n, C0883o {

    /* renamed from: A */
    static final Class<?>[] f1362A = {Context.class, AttributeSet.class};

    /* renamed from: B */
    static final ThreadLocal<Map<String, Constructor<C0265c>>> f1363B = new ThreadLocal<>();

    /* renamed from: C */
    static final Comparator<View> f1364C;

    /* renamed from: D */
    private static final C0834e<Rect> f1365D = new C0836g(12);

    /* renamed from: z */
    static final String f1366z;

    /* renamed from: f */
    private final List<View> f1367f;

    /* renamed from: g */
    private final C0273a<View> f1368g;

    /* renamed from: h */
    private final List<View> f1369h;

    /* renamed from: i */
    private final List<View> f1370i;

    /* renamed from: j */
    private Paint f1371j;

    /* renamed from: k */
    private final int[] f1372k;

    /* renamed from: l */
    private final int[] f1373l;

    /* renamed from: m */
    private boolean f1374m;

    /* renamed from: n */
    private boolean f1375n;

    /* renamed from: o */
    private int[] f1376o;

    /* renamed from: p */
    private View f1377p;

    /* renamed from: q */
    private View f1378q;

    /* renamed from: r */
    private C0269g f1379r;

    /* renamed from: s */
    private boolean f1380s;

    /* renamed from: t */
    private C0852d0 f1381t;

    /* renamed from: u */
    private boolean f1382u;

    /* renamed from: v */
    private Drawable f1383v;

    /* renamed from: w */
    ViewGroup.OnHierarchyChangeListener f1384w;

    /* renamed from: x */
    private C0886r f1385x;

    /* renamed from: y */
    private final C0885q f1386y;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C0263a implements C0886r {
        C0263a() {
        }

        /* renamed from: a */
        public C0852d0 mo205a(View view, C0852d0 d0Var) {
            return CoordinatorLayout.this.mo1770a(d0Var);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0264b {
        C0265c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class C0265c<V extends View> {
        public C0265c() {
        }

        public C0265c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: a */
        public C0852d0 mo1819a(CoordinatorLayout coordinatorLayout, V v, C0852d0 d0Var) {
            return d0Var;
        }

        /* renamed from: a */
        public void mo1820a() {
        }

        /* renamed from: a */
        public void mo1821a(C0268f fVar) {
        }

        /* renamed from: a */
        public void mo1822a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo1823a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo1848d(coordinatorLayout, v, view);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void mo1824a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo1825a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo1824a(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo1826a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            mo1825a(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: a */
        public void mo1827a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: a */
        public void mo1828a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo1827a(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void mo1829a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: a */
        public void mo1830a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                mo1829a(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: a */
        public boolean mo1831a(CoordinatorLayout coordinatorLayout, V v) {
            return mo1845c(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: a */
        public boolean mo1832a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1833a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1834a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1835a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1836a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1837a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1838a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1839a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: b */
        public int mo1840b(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: b */
        public boolean mo1841b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1842b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        @Deprecated
        /* renamed from: b */
        public boolean mo1843b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1844b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo1843b(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        /* renamed from: c */
        public float mo1845c(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: c */
        public void mo1846c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: d */
        public Parcelable mo1847d(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: d */
        public void mo1848d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C0266d {
        Class<? extends C0265c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    private class C0267e implements ViewGroup.OnHierarchyChangeListener {
        C0267e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1384w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo1772a(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1384w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0268f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C0265c f1389a;

        /* renamed from: b */
        boolean f1390b = false;

        /* renamed from: c */
        public int f1391c = 0;

        /* renamed from: d */
        public int f1392d = 0;

        /* renamed from: e */
        public int f1393e = -1;

        /* renamed from: f */
        int f1394f = -1;

        /* renamed from: g */
        public int f1395g = 0;

        /* renamed from: h */
        public int f1396h = 0;

        /* renamed from: i */
        int f1397i;

        /* renamed from: j */
        int f1398j;

        /* renamed from: k */
        View f1399k;

        /* renamed from: l */
        View f1400l;

        /* renamed from: m */
        private boolean f1401m;

        /* renamed from: n */
        private boolean f1402n;

        /* renamed from: o */
        private boolean f1403o;

        /* renamed from: p */
        private boolean f1404p;

        /* renamed from: q */
        final Rect f1405q = new Rect();

        public C0268f(int i, int i2) {
            super(i, i2);
        }

        C0268f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0776c.CoordinatorLayout_Layout);
            this.f1391c = obtainStyledAttributes.getInteger(C0776c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f1394f = obtainStyledAttributes.getResourceId(C0776c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f1392d = obtainStyledAttributes.getInteger(C0776c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f1393e = obtainStyledAttributes.getInteger(C0776c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f1395g = obtainStyledAttributes.getInt(C0776c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f1396h = obtainStyledAttributes.getInt(C0776c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f1390b = obtainStyledAttributes.hasValue(C0776c.CoordinatorLayout_Layout_layout_behavior);
            if (this.f1390b) {
                this.f1389a = CoordinatorLayout.m1307a(context, attributeSet, obtainStyledAttributes.getString(C0776c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            C0265c cVar = this.f1389a;
            if (cVar != null) {
                cVar.mo1821a(this);
            }
        }

        public C0268f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0268f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0268f(C0268f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        private void m1384a(View view, CoordinatorLayout coordinatorLayout) {
            this.f1399k = coordinatorLayout.findViewById(this.f1394f);
            View view2 = this.f1399k;
            if (view2 != null) {
                if (view2 != coordinatorLayout) {
                    ViewParent parent = view2.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f1400l = view2;
                    return;
                } else if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f1394f) + " to anchor view " + view);
            }
            this.f1400l = null;
            this.f1399k = null;
        }

        /* renamed from: a */
        private boolean m1385a(View view, int i) {
            int a = C0851d.m4580a(((C0268f) view.getLayoutParams()).f1395g, i);
            return a != 0 && (C0851d.m4580a(this.f1396h, i) & a) == a;
        }

        /* renamed from: b */
        private boolean m1386b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f1399k.getId() != this.f1394f) {
                return false;
            }
            View view2 = this.f1399k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f1400l = null;
                    this.f1399k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f1400l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo1852a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f1394f == -1) {
                this.f1400l = null;
                this.f1399k = null;
                return null;
            }
            if (this.f1399k == null || !m1386b(view, coordinatorLayout)) {
                m1384a(view, coordinatorLayout);
            }
            return this.f1399k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1853a(int i, boolean z) {
            if (i == 0) {
                this.f1402n = z;
            } else if (i == 1) {
                this.f1403o = z;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1854a(Rect rect) {
            this.f1405q.set(rect);
        }

        /* renamed from: a */
        public void mo1855a(C0265c cVar) {
            C0265c cVar2 = this.f1389a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.mo1820a();
                }
                this.f1389a = cVar;
                this.f1390b = true;
                if (cVar != null) {
                    cVar.mo1821a(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1856a(boolean z) {
            this.f1404p = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo1857a() {
            return this.f1399k == null && this.f1394f != -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo1858a(int i) {
            if (i == 0) {
                return this.f1402n;
            }
            if (i != 1) {
                return false;
            }
            return this.f1403o;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f1389a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1859a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f1400l
                if (r4 == r0) goto L_0x001b
                int r0 = p006b.p026g.p035k.C0890v.m4791o(r2)
                boolean r0 = r1.m1385a((android.view.View) r4, (int) r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f1389a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.mo1837a((androidx.coordinatorlayout.widget.CoordinatorLayout) r2, r3, (android.view.View) r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.C0268f.mo1859a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1860b(int i) {
            mo1853a(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1861b() {
            if (this.f1389a == null) {
                this.f1401m = false;
            }
            return this.f1401m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1862b(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f1401m;
            if (z) {
                return true;
            }
            C0265c cVar = this.f1389a;
            boolean a = (cVar != null ? cVar.mo1831a(coordinatorLayout, view) : false) | z;
            this.f1401m = a;
            return a;
        }

        /* renamed from: c */
        public int mo1863c() {
            return this.f1394f;
        }

        /* renamed from: d */
        public C0265c mo1864d() {
            return this.f1389a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo1865e() {
            return this.f1404p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Rect mo1866f() {
            return this.f1405q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo1867g() {
            this.f1404p = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo1868h() {
            this.f1401m = false;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    class C0269g implements ViewTreeObserver.OnPreDrawListener {
        C0269g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo1772a(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    protected static class C0270h extends C0912a {
        public static final Parcelable.Creator<C0270h> CREATOR = new C0271a();

        /* renamed from: h */
        SparseArray<Parcelable> f1407h;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        static class C0271a implements Parcelable.ClassLoaderCreator<C0270h> {
            C0271a() {
            }

            public C0270h createFromParcel(Parcel parcel) {
                return new C0270h(parcel, (ClassLoader) null);
            }

            public C0270h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0270h(parcel, classLoader);
            }

            public C0270h[] newArray(int i) {
                return new C0270h[i];
            }
        }

        public C0270h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1407h = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f1407h.append(iArr[i], readParcelableArray[i]);
            }
        }

        public C0270h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f1407h;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f1407h.keyAt(i2);
                parcelableArr[i2] = this.f1407h.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    static class C0272i implements Comparator<View> {
        C0272i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float w = C0890v.m4799w(view);
            float w2 = C0890v.m4799w(view2);
            if (w > w2) {
                return -1;
            }
            return w < w2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            f1366z = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            f1364C = r0
            goto L_0x0021
        L_0x001f:
            f1364C = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f1362A = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f1363B = r0
            b.g.j.g r0 = new b.g.j.g
            r1 = 12
            r0.<init>(r1)
            f1365D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0774a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1367f = new ArrayList();
        this.f1368g = new C0273a<>();
        this.f1369h = new ArrayList();
        this.f1370i = new ArrayList();
        this.f1372k = new int[2];
        this.f1373l = new int[2];
        this.f1386y = new C0885q(this);
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, C0776c.CoordinatorLayout, 0, C0775b.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, C0776c.CoordinatorLayout, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C0776c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1376o = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f1376o.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f1376o;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f1383v = obtainStyledAttributes.getDrawable(C0776c.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m1327f();
        super.setOnHierarchyChangeListener(new C0267e());
    }

    /* renamed from: a */
    private static int m1306a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: a */
    static C0265c m1307a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f1366z)) {
            str = f1366z + '.' + str;
        }
        try {
            Map map = f1363B.get();
            if (map == null) {
                map = new HashMap();
                f1363B.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f1362A);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C0265c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: a */
    private static void m1308a(Rect rect) {
        rect.setEmpty();
        f1365D.mo4544a(rect);
    }

    /* renamed from: a */
    private void m1309a(View view, int i, Rect rect, Rect rect2, C0268f fVar, int i2, int i3) {
        int a = C0851d.m4580a(m1319c(fVar.f1391c), i);
        int a2 = C0851d.m4580a(m1320d(fVar.f1392d), i);
        int i4 = a & 7;
        int i5 = a & 112;
        int i6 = a2 & 7;
        int i7 = a2 & 112;
        int width = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: a */
    private void m1310a(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C0890v.m4732C(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0268f fVar = (C0268f) view.getLayoutParams();
            C0265c d = fVar.mo1864d();
            Rect d2 = m1321d();
            Rect d3 = m1321d();
            d3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (d == null || !d.mo1834a(this, view, d2)) {
                d2.set(d3);
            } else if (!d3.contains(d2)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + d2.toShortString() + " | Bounds:" + d3.toShortString());
            }
            m1308a(d3);
            if (d2.isEmpty()) {
                m1308a(d2);
                return;
            }
            int a = C0851d.m4580a(fVar.f1396h, i);
            if ((a & 48) != 48 || (i6 = (d2.top - fVar.topMargin) - fVar.f1398j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m1328f(view, i7 - i6);
                z = true;
            }
            if ((a & 80) == 80 && (height = ((getHeight() - d2.bottom) - fVar.bottomMargin) + fVar.f1398j) < (i5 = rect.bottom)) {
                m1328f(view, height - i5);
                z = true;
            }
            if (!z) {
                m1328f(view, 0);
            }
            if ((a & 3) != 3 || (i3 = (d2.left - fVar.leftMargin) - fVar.f1397i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m1325e(view, i4 - i3);
                z2 = true;
            }
            if ((a & 5) == 5 && (width = ((getWidth() - d2.right) - fVar.rightMargin) + fVar.f1397i) < (i2 = rect.right)) {
                m1325e(view, width - i2);
                z2 = true;
            }
            if (!z2) {
                m1325e(view, 0);
            }
            m1308a(d2);
        }
    }

    /* renamed from: a */
    private void m1311a(View view, View view2, int i) {
        Rect d = m1321d();
        Rect d2 = m1321d();
        try {
            mo1776a(view2, d);
            mo1775a(view, i, d, d2);
            view.layout(d2.left, d2.top, d2.right, d2.bottom);
        } finally {
            m1308a(d);
            m1308a(d2);
        }
    }

    /* renamed from: a */
    private void m1312a(C0268f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - fVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: a */
    private void m1313a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f1364C;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: a */
    private void m1314a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0265c d = ((C0268f) childAt.getLayoutParams()).mo1864d();
            if (d != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    d.mo1836a(this, childAt, obtain);
                } else {
                    d.mo1841b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0268f) getChildAt(i2).getLayoutParams()).mo1868h();
        }
        this.f1377p = null;
        this.f1374m = false;
    }

    /* renamed from: a */
    private boolean m1315a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1369h;
        m1313a(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            C0268f fVar = (C0268f) view.getLayoutParams();
            C0265c d = fVar.mo1864d();
            boolean z3 = true;
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && d != null) {
                    if (i2 == 0) {
                        z = d.mo1836a(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = d.mo1841b(this, view, motionEvent2);
                    }
                    if (z) {
                        this.f1377p = view;
                    }
                }
                boolean b = fVar.mo1861b();
                boolean b2 = fVar.mo1862b(this, view);
                if (!b2 || b) {
                    z3 = false;
                }
                if (b2 && !z3) {
                    break;
                }
                z2 = z3;
            } else if (d != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    d.mo1836a(this, view, motionEvent3);
                } else if (i2 == 1) {
                    d.mo1841b(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: b */
    private int m1316b(int i) {
        StringBuilder sb;
        int[] iArr = this.f1376o;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    /* renamed from: b */
    private C0852d0 m1317b(C0852d0 d0Var) {
        C0265c d;
        if (d0Var.mo4575e()) {
            return d0Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C0890v.m4788l(childAt) && (d = ((C0268f) childAt.getLayoutParams()).mo1864d()) != null) {
                d0Var = d.mo1819a(this, childAt, d0Var);
                if (d0Var.mo4575e()) {
                    break;
                }
            }
        }
        return d0Var;
    }

    /* renamed from: b */
    private void m1318b(View view, int i, int i2) {
        C0268f fVar = (C0268f) view.getLayoutParams();
        int a = C0851d.m4580a(m1323e(fVar.f1391c), i2);
        int i3 = a & 7;
        int i4 = a & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int b = m1316b(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            b += measuredWidth / 2;
        } else if (i3 == 5) {
            b += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: c */
    private static int m1319c(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: d */
    private static int m1320d(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static Rect m1321d() {
        Rect a = f1365D.mo4543a();
        return a == null ? new Rect() : a;
    }

    /* renamed from: d */
    private void m1322d(View view, int i) {
        C0268f fVar = (C0268f) view.getLayoutParams();
        Rect d = m1321d();
        d.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.f1381t != null && C0890v.m4788l(this) && !C0890v.m4788l(view)) {
            d.left += this.f1381t.mo4572b();
            d.top += this.f1381t.mo4574d();
            d.right -= this.f1381t.mo4573c();
            d.bottom -= this.f1381t.mo4570a();
        }
        Rect d2 = m1321d();
        C0851d.m4581a(m1320d(fVar.f1391c), view.getMeasuredWidth(), view.getMeasuredHeight(), d, d2, i);
        view.layout(d2.left, d2.top, d2.right, d2.bottom);
        m1308a(d);
        m1308a(d2);
    }

    /* renamed from: e */
    private static int m1323e(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    private void m1324e() {
        this.f1367f.clear();
        this.f1368g.mo1875a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0268f d = mo1788d(childAt);
            d.mo1852a(this, childAt);
            this.f1368g.mo1876a(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (d.mo1859a(this, childAt, childAt2)) {
                        if (!this.f1368g.mo1879b(childAt2)) {
                            this.f1368g.mo1876a(childAt2);
                        }
                        this.f1368g.mo1877a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1367f.addAll(this.f1368g.mo1878b());
        Collections.reverse(this.f1367f);
    }

    /* renamed from: e */
    private void m1325e(View view, int i) {
        C0268f fVar = (C0268f) view.getLayoutParams();
        int i2 = fVar.f1397i;
        if (i2 != i) {
            C0890v.m4775d(view, i - i2);
            fVar.f1397i = i;
        }
    }

    /* renamed from: e */
    private boolean m1326e(View view) {
        return this.f1368g.mo1882e(view);
    }

    /* renamed from: f */
    private void m1327f() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (C0890v.m4788l(this)) {
                if (this.f1385x == null) {
                    this.f1385x = new C0263a();
                }
                C0890v.m4756a((View) this, this.f1385x);
                setSystemUiVisibility(1280);
                return;
            }
            C0890v.m4756a((View) this, (C0886r) null);
        }
    }

    /* renamed from: f */
    private void m1328f(View view, int i) {
        C0268f fVar = (C0268f) view.getLayoutParams();
        int i2 = fVar.f1398j;
        if (i2 != i) {
            C0890v.m4777e(view, i - i2);
            fVar.f1398j = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0852d0 mo1770a(C0852d0 d0Var) {
        if (C0832c.m4525a(this.f1381t, d0Var)) {
            return d0Var;
        }
        this.f1381t = d0Var;
        boolean z = true;
        this.f1382u = d0Var != null && d0Var.mo4574d() > 0;
        if (this.f1382u || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C0852d0 b = m1317b(d0Var);
        requestLayout();
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1771a() {
        if (this.f1375n) {
            if (this.f1379r == null) {
                this.f1379r = new C0269g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1379r);
        }
        this.f1380s = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1772a(int i) {
        boolean z;
        int i2 = i;
        int o = C0890v.m4791o(this);
        int size = this.f1367f.size();
        Rect d = m1321d();
        Rect d2 = m1321d();
        Rect d3 = m1321d();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f1367f.get(i3);
            C0268f fVar = (C0268f) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (fVar.f1400l == this.f1367f.get(i4)) {
                        mo1781b(view, o);
                    }
                }
                mo1777a(view, true, d2);
                if (fVar.f1395g != 0 && !d2.isEmpty()) {
                    int a = C0851d.m4580a(fVar.f1395g, o);
                    int i5 = a & 112;
                    if (i5 == 48) {
                        d.top = Math.max(d.top, d2.bottom);
                    } else if (i5 == 80) {
                        d.bottom = Math.max(d.bottom, getHeight() - d2.top);
                    }
                    int i6 = a & 7;
                    if (i6 == 3) {
                        d.left = Math.max(d.left, d2.right);
                    } else if (i6 == 5) {
                        d.right = Math.max(d.right, getWidth() - d2.left);
                    }
                }
                if (fVar.f1396h != 0 && view.getVisibility() == 0) {
                    m1310a(view, d, o);
                }
                if (i2 != 2) {
                    mo1782b(view, d3);
                    if (!d3.equals(d2)) {
                        mo1786c(view, d2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.f1367f.get(i7);
                    C0268f fVar2 = (C0268f) view2.getLayoutParams();
                    C0265c d4 = fVar2.mo1864d();
                    if (d4 != null && d4.mo1837a(this, view2, view)) {
                        if (i2 != 0 || !fVar2.mo1865e()) {
                            if (i2 != 2) {
                                z = d4.mo1842b(this, view2, view);
                            } else {
                                d4.mo1846c(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                fVar2.mo1856a(z);
                            }
                        } else {
                            fVar2.mo1867g();
                        }
                    }
                }
            }
        }
        m1308a(d);
        m1308a(d2);
        m1308a(d3);
    }

    /* renamed from: a */
    public void mo1773a(View view) {
        List c = this.f1368g.mo1880c(view);
        if (c != null && !c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                View view2 = (View) c.get(i);
                C0265c d = ((C0268f) view2.getLayoutParams()).mo1864d();
                if (d != null) {
                    d.mo1842b(this, view2, view);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo755a(View view, int i) {
        this.f1386y.mo4668a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0268f fVar = (C0268f) childAt.getLayoutParams();
            if (fVar.mo1858a(i)) {
                C0265c d = fVar.mo1864d();
                if (d != null) {
                    d.mo1823a(this, childAt, view, i);
                }
                fVar.mo1860b(i);
                fVar.mo1867g();
            }
        }
        this.f1378q = null;
    }

    /* renamed from: a */
    public void mo1774a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo756a(View view, int i, int i2, int i3, int i4, int i5) {
        mo757a(view, i, i2, i3, i4, 0, this.f1373l);
    }

    /* renamed from: a */
    public void mo757a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C0265c d;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0268f fVar = (C0268f) childAt.getLayoutParams();
                if (fVar.mo1858a(i5) && (d = fVar.mo1864d()) != null) {
                    int[] iArr2 = this.f1372k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    d.mo1826a(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f1372k;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    i7 = i4 > 0 ? Math.max(i7, this.f1372k[1]) : Math.min(i7, this.f1372k[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            mo1772a(1);
        }
    }

    /* renamed from: a */
    public void mo758a(View view, int i, int i2, int[] iArr, int i3) {
        C0265c d;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i3;
            } else {
                C0268f fVar = (C0268f) childAt.getLayoutParams();
                if (fVar.mo1858a(i3) && (d = fVar.mo1864d()) != null) {
                    int[] iArr2 = this.f1372k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    d.mo1828a(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f1372k;
                    int max = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f1372k;
                    i4 = max;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo1772a(1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1775a(View view, int i, Rect rect, Rect rect2) {
        C0268f fVar = (C0268f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m1309a(view, i, rect, rect2, fVar, measuredWidth, measuredHeight);
        m1312a(fVar, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1776a(View view, Rect rect) {
        C0274b.m1416a((ViewGroup) this, view, rect);
    }

    /* renamed from: a */
    public void mo759a(View view, View view2, int i, int i2) {
        C0265c d;
        this.f1386y.mo4670a(view, view2, i, i2);
        this.f1378q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0268f fVar = (C0268f) childAt.getLayoutParams();
            if (fVar.mo1858a(i2) && (d = fVar.mo1864d()) != null) {
                d.mo1830a(this, childAt, view, view2, i, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1777a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo1776a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    public boolean mo1778a(View view, int i, int i2) {
        Rect d = m1321d();
        mo1776a(view, d);
        try {
            return d.contains(i, i2);
        } finally {
            m1308a(d);
        }
    }

    /* renamed from: b */
    public List<View> mo1779b(View view) {
        List<View> d = this.f1368g.mo1881d(view);
        this.f1370i.clear();
        if (d != null) {
            this.f1370i.addAll(d);
        }
        return this.f1370i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1780b() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m1326e(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f1380s) {
            return;
        }
        if (z) {
            mo1771a();
        } else {
            mo1784c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1781b(View view, int i) {
        C0265c d;
        View view2 = view;
        C0268f fVar = (C0268f) view.getLayoutParams();
        if (fVar.f1399k != null) {
            Rect d2 = m1321d();
            Rect d3 = m1321d();
            Rect d4 = m1321d();
            mo1776a(fVar.f1399k, d2);
            boolean z = false;
            mo1777a(view2, false, d3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m1309a(view, i, d2, d4, fVar, measuredWidth, measuredHeight);
            if (!(d4.left == d3.left && d4.top == d3.top)) {
                z = true;
            }
            m1312a(fVar, d4, measuredWidth, i2);
            int i3 = d4.left - d3.left;
            int i4 = d4.top - d3.top;
            if (i3 != 0) {
                C0890v.m4775d(view2, i3);
            }
            if (i4 != 0) {
                C0890v.m4777e(view2, i4);
            }
            if (z && (d = fVar.mo1864d()) != null) {
                d.mo1842b(this, view2, fVar.f1399k);
            }
            m1308a(d2);
            m1308a(d3);
            m1308a(d4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1782b(View view, Rect rect) {
        rect.set(((C0268f) view.getLayoutParams()).mo1866f());
    }

    /* renamed from: b */
    public boolean mo761b(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        int i4 = 0;
        boolean z = false;
        while (true) {
            if (i4 >= childCount) {
                return z;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0268f fVar = (C0268f) childAt.getLayoutParams();
                C0265c d = fVar.mo1864d();
                if (d != null) {
                    boolean b = d.mo1844b(this, childAt, view, view2, i, i2);
                    fVar.mo1853a(i3, b);
                    z |= b;
                } else {
                    fVar.mo1853a(i3, false);
                }
            }
            i4++;
        }
    }

    /* renamed from: c */
    public List<View> mo1783c(View view) {
        List c = this.f1368g.mo1880c(view);
        this.f1370i.clear();
        if (c != null) {
            this.f1370i.addAll(c);
        }
        return this.f1370i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1784c() {
        if (this.f1375n && this.f1379r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1379r);
        }
        this.f1380s = false;
    }

    /* renamed from: c */
    public void mo1785c(View view, int i) {
        C0268f fVar = (C0268f) view.getLayoutParams();
        if (!fVar.mo1857a()) {
            View view2 = fVar.f1399k;
            if (view2 != null) {
                m1311a(view, view2, i);
                return;
            }
            int i2 = fVar.f1393e;
            if (i2 >= 0) {
                m1318b(view, i2, i);
            } else {
                m1322d(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1786c(View view, Rect rect) {
        ((C0268f) view.getLayoutParams()).mo1854a(rect);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0268f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0268f mo1788d(View view) {
        C0268f fVar = (C0268f) view.getLayoutParams();
        if (!fVar.f1390b) {
            if (view instanceof C0264b) {
                C0265c behavior = ((C0264b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.mo1855a(behavior);
            } else {
                C0266d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (C0266d) cls.getAnnotation(C0266d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.mo1855a((C0265c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
            }
            fVar.f1390b = true;
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0268f fVar = (C0268f) view.getLayoutParams();
        C0265c cVar = fVar.f1389a;
        if (cVar != null) {
            float c = cVar.mo1845c(this, view);
            if (c > 0.0f) {
                if (this.f1371j == null) {
                    this.f1371j = new Paint();
                }
                this.f1371j.setColor(fVar.f1389a.mo1840b(this, view));
                this.f1371j.setAlpha(m1306a(Math.round(c * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f1371j);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1383v;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public C0268f generateDefaultLayoutParams() {
        return new C0268f(-2, -2);
    }

    public C0268f generateLayoutParams(AttributeSet attributeSet) {
        return new C0268f(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0268f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0268f ? new C0268f((C0268f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0268f((ViewGroup.MarginLayoutParams) layoutParams) : new C0268f(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        m1324e();
        return Collections.unmodifiableList(this.f1367f);
    }

    public final C0852d0 getLastWindowInsets() {
        return this.f1381t;
    }

    public int getNestedScrollAxes() {
        return this.f1386y.mo4667a();
    }

    public Drawable getStatusBarBackground() {
        return this.f1383v;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1314a(false);
        if (this.f1380s) {
            if (this.f1379r == null) {
                this.f1379r = new C0269g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1379r);
        }
        if (this.f1381t == null && C0890v.m4788l(this)) {
            C0890v.m4737H(this);
        }
        this.f1375n = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1314a(false);
        if (this.f1380s && this.f1379r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1379r);
        }
        View view = this.f1378q;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1375n = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1382u && this.f1383v != null) {
            C0852d0 d0Var = this.f1381t;
            int d = d0Var != null ? d0Var.mo4574d() : 0;
            if (d > 0) {
                this.f1383v.setBounds(0, 0, getWidth(), d);
                this.f1383v.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1314a(true);
        }
        boolean a = m1315a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1314a(true);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0265c d;
        int o = C0890v.m4791o(this);
        int size = this.f1367f.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f1367f.get(i5);
            if (view.getVisibility() != 8 && ((d = ((C0268f) view.getLayoutParams()).mo1864d()) == null || !d.mo1832a(this, view, o))) {
                mo1785c(view, o);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0117, code lost:
        if (r0.mo1833a(r30, r20, r11, r21, r23, 0) == false) goto L_0x0126;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m1324e()
            r30.mo1780b()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = p006b.p026g.p035k.C0890v.m4791o(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            b.g.k.d0 r3 = r7.f1381t
            if (r3 == 0) goto L_0x004b
            boolean r3 = p006b.p026g.p035k.C0890v.m4788l(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f1367f
            int r6 = r2.size()
            r4 = r0
            r2 = r1
            r3 = 0
            r5 = 0
        L_0x0057:
            if (r5 >= r6) goto L_0x016c
            java.util.List<android.view.View> r0 = r7.f1367f
            java.lang.Object r0 = r0.get(r5)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0071
            r22 = r5
            r29 = r6
            goto L_0x0166
        L_0x0071:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0268f) r1
            int r0 = r1.f1393e
            if (r0 < 0) goto L_0x00b8
            if (r13 == 0) goto L_0x00b8
            int r0 = r7.m1316b((int) r0)
            int r11 = r1.f1391c
            int r11 = m1323e((int) r11)
            int r11 = p006b.p026g.p035k.C0851d.m4580a(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0095
            if (r12 == 0) goto L_0x009a
        L_0x0095:
            r2 = 5
            if (r11 != r2) goto L_0x00a6
            if (r12 == 0) goto L_0x00a6
        L_0x009a:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bd
        L_0x00a6:
            if (r11 != r2) goto L_0x00aa
            if (r12 == 0) goto L_0x00af
        L_0x00aa:
            r2 = 3
            if (r11 != r2) goto L_0x00ba
            if (r12 == 0) goto L_0x00ba
        L_0x00af:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bd
        L_0x00b8:
            r22 = r2
        L_0x00ba:
            r11 = 0
            r21 = 0
        L_0x00bd:
            if (r19 == 0) goto L_0x00ef
            boolean r0 = p006b.p026g.p035k.C0890v.m4788l(r20)
            if (r0 != 0) goto L_0x00ef
            b.g.k.d0 r0 = r7.f1381t
            int r0 = r0.mo4572b()
            b.g.k.d0 r2 = r7.f1381t
            int r2 = r2.mo4573c()
            int r0 = r0 + r2
            b.g.k.d0 r2 = r7.f1381t
            int r2 = r2.mo4574d()
            b.g.k.d0 r11 = r7.f1381t
            int r11 = r11.mo4570a()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f3
        L_0x00ef:
            r11 = r31
            r23 = r32
        L_0x00f3:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.mo1864d()
            if (r0 == 0) goto L_0x011a
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r27 = r3
            r3 = r11
            r28 = r4
            r4 = r21
            r22 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo1833a((androidx.coordinatorlayout.widget.CoordinatorLayout) r1, r2, (int) r3, (int) r4, (int) r5, (int) r6)
            if (r0 != 0) goto L_0x0133
            goto L_0x0126
        L_0x011a:
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r6
            r25 = r22
            r22 = r5
        L_0x0126:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo1774a((android.view.View) r1, (int) r2, (int) r3, (int) r4, (int) r5)
        L_0x0133:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            r2 = r28
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r25
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r27
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r4 = r0
            r3 = r2
            r2 = r1
        L_0x0166:
            int r5 = r22 + 1
            r6 = r29
            goto L_0x0057
        L_0x016c:
            r1 = r2
            r11 = r3
            r2 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r3 = r31
            int r0 = android.view.View.resolveSizeAndState(r2, r3, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C0265c d;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0268f fVar = (C0268f) childAt.getLayoutParams();
                if (fVar.mo1858a(0) && (d = fVar.mo1864d()) != null) {
                    z2 |= d.mo1839a(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo1772a(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C0265c d;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0268f fVar = (C0268f) childAt.getLayoutParams();
                if (fVar.mo1858a(0) && (d = fVar.mo1864d()) != null) {
                    z |= d.mo1838a(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo758a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo756a(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo759a(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0270h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0270h hVar = (C0270h) parcelable;
        super.onRestoreInstanceState(hVar.mo4725q());
        SparseArray<Parcelable> sparseArray = hVar.f1407h;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0265c d = mo1788d(childAt).mo1864d();
            if (!(id == -1 || d == null || (parcelable2 = sparseArray.get(id)) == null)) {
                d.mo1822a(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable d;
        C0270h hVar = new C0270h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0265c d2 = ((C0268f) childAt.getLayoutParams()).mo1864d();
            if (!(id == -1 || d2 == null || (d = d2.mo1847d(this, childAt)) == null)) {
                sparseArray.append(id, d);
            }
        }
        hVar.f1407h = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo761b(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo755a(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1377p
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m1315a((android.view.MotionEvent) r1, (int) r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f1377p
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0268f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.mo1864d()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f1377p
            boolean r6 = r6.mo1841b((androidx.coordinatorlayout.widget.CoordinatorLayout) r0, r7, (android.view.MotionEvent) r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f1377p
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m1314a((boolean) r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0265c d = ((C0268f) view.getLayoutParams()).mo1864d();
        if (d == null || !d.mo1835a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f1374m) {
            m1314a(false);
            this.f1374m = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m1327f();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1384w = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1383v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1383v = drawable3;
            Drawable drawable4 = this.f1383v;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f1383v.setState(getDrawableState());
                }
                C0328a.m1617a(this.f1383v, C0890v.m4791o(this));
                this.f1383v.setVisible(getVisibility() == 0, false);
                this.f1383v.setCallback(this);
            }
            C0890v.m4736G(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0311a.m1534c(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1383v;
        if (drawable != null && drawable.isVisible() != z) {
            this.f1383v.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1383v;
    }
}
