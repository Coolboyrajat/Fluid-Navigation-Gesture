package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0102q;
import androidx.core.widget.C0347h;
import java.lang.reflect.Method;
import p006b.p007a.C0663j;
import p006b.p026g.p035k.C0890v;

/* renamed from: androidx.appcompat.widget.e0 */
public class C0171e0 implements C0102q {

    /* renamed from: K */
    private static Method f901K;

    /* renamed from: L */
    private static Method f902L;

    /* renamed from: M */
    private static Method f903M;

    /* renamed from: A */
    private AdapterView.OnItemSelectedListener f904A;

    /* renamed from: B */
    final C0178g f905B;

    /* renamed from: C */
    private final C0177f f906C;

    /* renamed from: D */
    private final C0176e f907D;

    /* renamed from: E */
    private final C0174c f908E;

    /* renamed from: F */
    final Handler f909F;

    /* renamed from: G */
    private final Rect f910G;

    /* renamed from: H */
    private Rect f911H;

    /* renamed from: I */
    private boolean f912I;

    /* renamed from: J */
    PopupWindow f913J;

    /* renamed from: f */
    private Context f914f;

    /* renamed from: g */
    private ListAdapter f915g;

    /* renamed from: h */
    C0150a0 f916h;

    /* renamed from: i */
    private int f917i;

    /* renamed from: j */
    private int f918j;

    /* renamed from: k */
    private int f919k;

    /* renamed from: l */
    private int f920l;

    /* renamed from: m */
    private int f921m;

    /* renamed from: n */
    private boolean f922n;

    /* renamed from: o */
    private boolean f923o;

    /* renamed from: p */
    private boolean f924p;

    /* renamed from: q */
    private int f925q;

    /* renamed from: r */
    private boolean f926r;

    /* renamed from: s */
    private boolean f927s;

    /* renamed from: t */
    int f928t;

    /* renamed from: u */
    private View f929u;

    /* renamed from: v */
    private int f930v;

    /* renamed from: w */
    private DataSetObserver f931w;

    /* renamed from: x */
    private View f932x;

    /* renamed from: y */
    private Drawable f933y;

    /* renamed from: z */
    private AdapterView.OnItemClickListener f934z;

    /* renamed from: androidx.appcompat.widget.e0$a */
    class C0172a implements Runnable {
        C0172a() {
        }

        public void run() {
            View i = C0171e0.this.mo1316i();
            if (i != null && i.getWindowToken() != null) {
                C0171e0.this.mo403a();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$b */
    class C0173b implements AdapterView.OnItemSelectedListener {
        C0173b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0150a0 a0Var;
            if (i != -1 && (a0Var = C0171e0.this.f916h) != null) {
                a0Var.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$c */
    private class C0174c implements Runnable {
        C0174c() {
        }

        public void run() {
            C0171e0.this.mo1314h();
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$d */
    private class C0175d extends DataSetObserver {
        C0175d() {
        }

        public void onChanged() {
            if (C0171e0.this.mo413c()) {
                C0171e0.this.mo403a();
            }
        }

        public void onInvalidated() {
            C0171e0.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$e */
    private class C0176e implements AbsListView.OnScrollListener {
        C0176e() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0171e0.this.mo1320k() && C0171e0.this.f913J.getContentView() != null) {
                C0171e0 e0Var = C0171e0.this;
                e0Var.f909F.removeCallbacks(e0Var.f905B);
                C0171e0.this.f905B.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$f */
    private class C0177f implements View.OnTouchListener {
        C0177f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0171e0.this.f913J) != null && popupWindow.isShowing() && x >= 0 && x < C0171e0.this.f913J.getWidth() && y >= 0 && y < C0171e0.this.f913J.getHeight()) {
                C0171e0 e0Var = C0171e0.this;
                e0Var.f909F.postDelayed(e0Var.f905B, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0171e0 e0Var2 = C0171e0.this;
                e0Var2.f909F.removeCallbacks(e0Var2.f905B);
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$g */
    private class C0178g implements Runnable {
        C0178g() {
        }

        public void run() {
            C0150a0 a0Var = C0171e0.this.f916h;
            if (a0Var != null && C0890v.m4731B(a0Var) && C0171e0.this.f916h.getCount() > C0171e0.this.f916h.getChildCount()) {
                int childCount = C0171e0.this.f916h.getChildCount();
                C0171e0 e0Var = C0171e0.this;
                if (childCount <= e0Var.f928t) {
                    e0Var.f913J.setInputMethodMode(2);
                    C0171e0.this.mo403a();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f901K = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f903M = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f902L = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0171e0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0171e0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f917i = -2;
        this.f918j = -2;
        this.f921m = 1002;
        this.f925q = 0;
        this.f926r = false;
        this.f927s = false;
        this.f928t = Integer.MAX_VALUE;
        this.f930v = 0;
        this.f905B = new C0178g();
        this.f906C = new C0177f();
        this.f907D = new C0176e();
        this.f908E = new C0174c();
        this.f910G = new Rect();
        this.f914f = context;
        this.f909F = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0663j.ListPopupWindow, i, i2);
        this.f919k = obtainStyledAttributes.getDimensionPixelOffset(C0663j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f920l = obtainStyledAttributes.getDimensionPixelOffset(C0663j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f920l != 0) {
            this.f922n = true;
        }
        obtainStyledAttributes.recycle();
        this.f913J = new C0210o(context, attributeSet, i, i2);
        this.f913J.setInputMethodMode(1);
    }

    /* renamed from: a */
    private int m874a(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.f913J.getMaxAvailableHeight(view, i, z);
        }
        Method method = f902L;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f913J, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f913J.getMaxAvailableHeight(view, i);
    }

    /* renamed from: c */
    private void mo1359c(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f901K;
            if (method != null) {
                try {
                    method.invoke(this.f913J, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f913J.setIsClippedToScreen(z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: androidx.appcompat.widget.a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: androidx.appcompat.widget.a0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0152  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int mo1601m() {
        /*
            r12 = this;
            androidx.appcompat.widget.a0 r0 = r12.f916h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00bf
            android.content.Context r0 = r12.f914f
            androidx.appcompat.widget.e0$a r5 = new androidx.appcompat.widget.e0$a
            r5.<init>()
            boolean r5 = r12.f912I
            r5 = r5 ^ r3
            androidx.appcompat.widget.a0 r5 = r12.mo1296a(r0, r5)
            r12.f916h = r5
            android.graphics.drawable.Drawable r5 = r12.f933y
            if (r5 == 0) goto L_0x0022
            androidx.appcompat.widget.a0 r6 = r12.f916h
            r6.setSelector(r5)
        L_0x0022:
            androidx.appcompat.widget.a0 r5 = r12.f916h
            android.widget.ListAdapter r6 = r12.f915g
            r5.setAdapter(r6)
            androidx.appcompat.widget.a0 r5 = r12.f916h
            android.widget.AdapterView$OnItemClickListener r6 = r12.f934z
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.a0 r5 = r12.f916h
            r5.setFocusable(r3)
            androidx.appcompat.widget.a0 r5 = r12.f916h
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.a0 r5 = r12.f916h
            androidx.appcompat.widget.e0$b r6 = new androidx.appcompat.widget.e0$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.a0 r5 = r12.f916h
            androidx.appcompat.widget.e0$e r6 = r12.f907D
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f904A
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.a0 r6 = r12.f916h
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.a0 r5 = r12.f916h
            android.view.View r6 = r12.f929u
            if (r6 == 0) goto L_0x00b8
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f930v
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f930v
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.f918j
            if (r0 < 0) goto L_0x009c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x009e
        L_0x009c:
            r0 = 0
            r5 = 0
        L_0x009e:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            android.widget.PopupWindow r6 = r12.f913J
            r6.setContentView(r5)
            goto L_0x00dd
        L_0x00bf:
            android.widget.PopupWindow r0 = r12.f913J
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f929u
            if (r0 == 0) goto L_0x00dc
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dd
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            android.widget.PopupWindow r5 = r12.f913J
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f9
            android.graphics.Rect r6 = r12.f910G
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f910G
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f922n
            if (r7 != 0) goto L_0x00ff
            int r6 = -r6
            r12.f920l = r6
            goto L_0x00ff
        L_0x00f9:
            android.graphics.Rect r5 = r12.f910G
            r5.setEmpty()
            r5 = 0
        L_0x00ff:
            android.widget.PopupWindow r6 = r12.f913J
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r3 = 0
        L_0x010a:
            android.view.View r4 = r12.mo1316i()
            int r6 = r12.f920l
            int r3 = r12.m874a(r4, r6, r3)
            boolean r4 = r12.f926r
            if (r4 != 0) goto L_0x0163
            int r4 = r12.f917i
            if (r4 != r2) goto L_0x011d
            goto L_0x0163
        L_0x011d:
            int r4 = r12.f918j
            r6 = -2
            if (r4 == r6) goto L_0x012c
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012c
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
        L_0x012a:
            r7 = r1
            goto L_0x0145
        L_0x012c:
            android.content.Context r2 = r12.f914f
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f910G
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x012a
        L_0x0145:
            androidx.appcompat.widget.a0 r6 = r12.f916h
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo1192a(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0161
            androidx.appcompat.widget.a0 r2 = r12.f916h
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.a0 r3 = r12.f916h
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0161:
            int r1 = r1 + r0
            return r1
        L_0x0163:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0171e0.mo1601m():int");
    }

    /* renamed from: n */
    private void mo1602n() {
        View view = this.f929u;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f929u);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0150a0 mo1296a(Context context, boolean z) {
        return new C0150a0(context, z);
    }

    /* renamed from: a */
    public void mo403a() {
        int m = mo1601m();
        boolean k = mo1320k();
        C0347h.m1731a(this.f913J, this.f921m);
        boolean z = true;
        if (!this.f913J.isShowing()) {
            int i = this.f918j;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo1316i().getWidth();
            }
            int i2 = this.f917i;
            if (i2 == -1) {
                m = -1;
            } else if (i2 != -2) {
                m = i2;
            }
            this.f913J.setWidth(i);
            this.f913J.setHeight(m);
            mo1359c(true);
            this.f913J.setOutsideTouchable(!this.f927s && !this.f926r);
            this.f913J.setTouchInterceptor(this.f906C);
            if (this.f924p) {
                C0347h.m1733a(this.f913J, this.f923o);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f903M;
                if (method != null) {
                    try {
                        method.invoke(this.f913J, new Object[]{this.f911H});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                this.f913J.setEpicenterBounds(this.f911H);
            }
            C0347h.m1732a(this.f913J, mo1316i(), this.f919k, this.f920l, this.f925q);
            this.f916h.setSelection(-1);
            if (!this.f912I || this.f916h.isInTouchMode()) {
                mo1314h();
            }
            if (!this.f912I) {
                this.f909F.post(this.f908E);
            }
        } else if (C0890v.m4731B(mo1316i())) {
            int i3 = this.f918j;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo1316i().getWidth();
            }
            int i4 = this.f917i;
            if (i4 == -1) {
                if (!k) {
                    m = -1;
                }
                if (k) {
                    this.f913J.setWidth(this.f918j == -1 ? -1 : 0);
                    this.f913J.setHeight(0);
                } else {
                    this.f913J.setWidth(this.f918j == -1 ? -1 : 0);
                    this.f913J.setHeight(-1);
                }
            } else if (i4 != -2) {
                m = i4;
            }
            PopupWindow popupWindow = this.f913J;
            if (this.f927s || this.f926r) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f913J.update(mo1316i(), this.f919k, this.f920l, i3 < 0 ? -1 : i3, m < 0 ? -1 : m);
        }
    }

    /* renamed from: a */
    public void mo1297a(int i) {
        this.f919k = i;
    }

    /* renamed from: a */
    public void mo1298a(Rect rect) {
        this.f911H = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: a */
    public void mo1299a(Drawable drawable) {
        this.f913J.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo1300a(View view) {
        this.f932x = view;
    }

    /* renamed from: a */
    public void mo1301a(AdapterView.OnItemClickListener onItemClickListener) {
        this.f934z = onItemClickListener;
    }

    /* renamed from: a */
    public void mo1302a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f931w;
        if (dataSetObserver == null) {
            this.f931w = new C0175d();
        } else {
            ListAdapter listAdapter2 = this.f915g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f915g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f931w);
        }
        C0150a0 a0Var = this.f916h;
        if (a0Var != null) {
            a0Var.setAdapter(this.f915g);
        }
    }

    /* renamed from: a */
    public void mo1303a(PopupWindow.OnDismissListener onDismissListener) {
        this.f913J.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    public void mo1304a(boolean z) {
        this.f912I = z;
        this.f913J.setFocusable(z);
    }

    /* renamed from: b */
    public int mo1305b() {
        return this.f919k;
    }

    /* renamed from: b */
    public void mo1306b(int i) {
        this.f920l = i;
        this.f922n = true;
    }

    /* renamed from: b */
    public void mo1307b(boolean z) {
        this.f924p = true;
        this.f923o = z;
    }

    /* renamed from: c */
    public boolean mo413c() {
        return this.f913J.isShowing();
    }

    /* renamed from: d */
    public int mo1308d() {
        if (!this.f922n) {
            return 0;
        }
        return this.f920l;
    }

    /* renamed from: d */
    public void mo1309d(int i) {
        this.f913J.setAnimationStyle(i);
    }

    public void dismiss() {
        this.f913J.dismiss();
        mo1602n();
        this.f913J.setContentView((View) null);
        this.f916h = null;
        this.f909F.removeCallbacks(this.f905B);
    }

    /* renamed from: e */
    public Drawable mo1310e() {
        return this.f913J.getBackground();
    }

    /* renamed from: e */
    public void mo1311e(int i) {
        Drawable background = this.f913J.getBackground();
        if (background != null) {
            background.getPadding(this.f910G);
            Rect rect = this.f910G;
            this.f918j = rect.left + rect.right + i;
            return;
        }
        mo1319j(i);
    }

    /* renamed from: f */
    public void mo1312f(int i) {
        this.f925q = i;
    }

    /* renamed from: g */
    public ListView mo416g() {
        return this.f916h;
    }

    /* renamed from: g */
    public void mo1313g(int i) {
        this.f913J.setInputMethodMode(i);
    }

    /* renamed from: h */
    public void mo1314h() {
        C0150a0 a0Var = this.f916h;
        if (a0Var != null) {
            a0Var.setListSelectionHidden(true);
            a0Var.requestLayout();
        }
    }

    /* renamed from: h */
    public void mo1315h(int i) {
        this.f930v = i;
    }

    /* renamed from: i */
    public View mo1316i() {
        return this.f932x;
    }

    /* renamed from: i */
    public void mo1317i(int i) {
        C0150a0 a0Var = this.f916h;
        if (mo413c() && a0Var != null) {
            a0Var.setListSelectionHidden(false);
            a0Var.setSelection(i);
            if (a0Var.getChoiceMode() != 0) {
                a0Var.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: j */
    public int mo1318j() {
        return this.f918j;
    }

    /* renamed from: j */
    public void mo1319j(int i) {
        this.f918j = i;
    }

    /* renamed from: k */
    public boolean mo1320k() {
        return this.f913J.getInputMethodMode() == 2;
    }

    /* renamed from: l */
    public boolean mo1321l() {
        return this.f912I;
    }
}
