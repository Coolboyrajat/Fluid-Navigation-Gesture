package p006b.p007a.p010l.p011a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0328a;

/* renamed from: b.a.l.a.b */
class C0674b extends Drawable implements Drawable.Callback {

    /* renamed from: f */
    private C0677c f2630f;

    /* renamed from: g */
    private Rect f2631g;

    /* renamed from: h */
    private Drawable f2632h;

    /* renamed from: i */
    private Drawable f2633i;

    /* renamed from: j */
    private int f2634j = 255;

    /* renamed from: k */
    private boolean f2635k;

    /* renamed from: l */
    private int f2636l = -1;

    /* renamed from: m */
    private boolean f2637m;

    /* renamed from: n */
    private Runnable f2638n;

    /* renamed from: o */
    private long f2639o;

    /* renamed from: p */
    private long f2640p;

    /* renamed from: q */
    private C0676b f2641q;

    /* renamed from: b.a.l.a.b$a */
    class C0675a implements Runnable {
        C0675a() {
        }

        public void run() {
            C0674b.this.mo3790a(true);
            C0674b.this.invalidateSelf();
        }
    }

    /* renamed from: b.a.l.a.b$b */
    static class C0676b implements Drawable.Callback {

        /* renamed from: f */
        private Drawable.Callback f2643f;

        C0676b() {
        }

        /* renamed from: a */
        public Drawable.Callback mo3824a() {
            Drawable.Callback callback = this.f2643f;
            this.f2643f = null;
            return callback;
        }

        /* renamed from: a */
        public C0676b mo3825a(Drawable.Callback callback) {
            this.f2643f = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f2643f;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f2643f;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: b.a.l.a.b$c */
    static abstract class C0677c extends Drawable.ConstantState {

        /* renamed from: A */
        int f2644A;

        /* renamed from: B */
        int f2645B;

        /* renamed from: C */
        boolean f2646C;

        /* renamed from: D */
        ColorFilter f2647D;

        /* renamed from: E */
        boolean f2648E;

        /* renamed from: F */
        ColorStateList f2649F;

        /* renamed from: G */
        PorterDuff.Mode f2650G;

        /* renamed from: H */
        boolean f2651H;

        /* renamed from: I */
        boolean f2652I;

        /* renamed from: a */
        final C0674b f2653a;

        /* renamed from: b */
        Resources f2654b;

        /* renamed from: c */
        int f2655c = 160;

        /* renamed from: d */
        int f2656d;

        /* renamed from: e */
        int f2657e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f2658f;

        /* renamed from: g */
        Drawable[] f2659g;

        /* renamed from: h */
        int f2660h;

        /* renamed from: i */
        boolean f2661i;

        /* renamed from: j */
        boolean f2662j;

        /* renamed from: k */
        Rect f2663k;

        /* renamed from: l */
        boolean f2664l;

        /* renamed from: m */
        boolean f2665m;

        /* renamed from: n */
        int f2666n;

        /* renamed from: o */
        int f2667o;

        /* renamed from: p */
        int f2668p;

        /* renamed from: q */
        int f2669q;

        /* renamed from: r */
        boolean f2670r;

        /* renamed from: s */
        int f2671s;

        /* renamed from: t */
        boolean f2672t;

        /* renamed from: u */
        boolean f2673u;

        /* renamed from: v */
        boolean f2674v;

        /* renamed from: w */
        boolean f2675w;

        /* renamed from: x */
        boolean f2676x;

        /* renamed from: y */
        boolean f2677y;

        /* renamed from: z */
        int f2678z;

        C0677c(C0677c cVar, C0674b bVar, Resources resources) {
            this.f2661i = false;
            this.f2664l = false;
            this.f2676x = true;
            this.f2644A = 0;
            this.f2645B = 0;
            this.f2653a = bVar;
            this.f2654b = resources != null ? resources : cVar != null ? cVar.f2654b : null;
            this.f2655c = C0674b.m3720a(resources, cVar != null ? cVar.f2655c : 0);
            if (cVar != null) {
                this.f2656d = cVar.f2656d;
                this.f2657e = cVar.f2657e;
                this.f2674v = true;
                this.f2675w = true;
                this.f2661i = cVar.f2661i;
                this.f2664l = cVar.f2664l;
                this.f2676x = cVar.f2676x;
                this.f2677y = cVar.f2677y;
                this.f2678z = cVar.f2678z;
                this.f2644A = cVar.f2644A;
                this.f2645B = cVar.f2645B;
                this.f2646C = cVar.f2646C;
                this.f2647D = cVar.f2647D;
                this.f2648E = cVar.f2648E;
                this.f2649F = cVar.f2649F;
                this.f2650G = cVar.f2650G;
                this.f2651H = cVar.f2651H;
                this.f2652I = cVar.f2652I;
                if (cVar.f2655c == this.f2655c) {
                    if (cVar.f2662j) {
                        this.f2663k = new Rect(cVar.f2663k);
                        this.f2662j = true;
                    }
                    if (cVar.f2665m) {
                        this.f2666n = cVar.f2666n;
                        this.f2667o = cVar.f2667o;
                        this.f2668p = cVar.f2668p;
                        this.f2669q = cVar.f2669q;
                        this.f2665m = true;
                    }
                }
                if (cVar.f2670r) {
                    this.f2671s = cVar.f2671s;
                    this.f2670r = true;
                }
                if (cVar.f2672t) {
                    this.f2673u = cVar.f2673u;
                    this.f2672t = true;
                }
                Drawable[] drawableArr = cVar.f2659g;
                this.f2659g = new Drawable[drawableArr.length];
                this.f2660h = cVar.f2660h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f2658f;
                this.f2658f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f2660h);
                int i = this.f2660h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f2658f.put(i2, constantState);
                        } else {
                            this.f2659g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f2659g = new Drawable[10];
            this.f2660h = 0;
        }

        /* renamed from: b */
        private Drawable m3731b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f2678z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f2653a);
            return mutate;
        }

        /* renamed from: n */
        private void m3732n() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f2658f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f2659g[this.f2658f.keyAt(i)] = m3731b(this.f2658f.valueAt(i).newDrawable(this.f2654b));
                }
                this.f2658f = null;
            }
        }

        /* renamed from: a */
        public final int mo3829a(Drawable drawable) {
            int i = this.f2660h;
            if (i >= this.f2659g.length) {
                mo3831a(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f2653a);
            this.f2659g[i] = drawable;
            this.f2660h++;
            this.f2657e = drawable.getChangingConfigurations() | this.f2657e;
            mo3851k();
            this.f2663k = null;
            this.f2662j = false;
            this.f2665m = false;
            this.f2674v = false;
            return i;
        }

        /* renamed from: a */
        public final Drawable mo3830a(int i) {
            int indexOfKey;
            Drawable drawable = this.f2659g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f2658f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable b = m3731b(this.f2658f.valueAt(indexOfKey).newDrawable(this.f2654b));
            this.f2659g[i] = b;
            this.f2658f.removeAt(indexOfKey);
            if (this.f2658f.size() == 0) {
                this.f2658f = null;
            }
            return b;
        }

        /* renamed from: a */
        public void mo3831a(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f2659g, 0, drawableArr, 0, i);
            this.f2659g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3832a(Resources.Theme theme) {
            if (theme != null) {
                m3732n();
                int i = this.f2660h;
                Drawable[] drawableArr = this.f2659g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f2657e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo3833a(theme.getResources());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3833a(Resources resources) {
            if (resources != null) {
                this.f2654b = resources;
                int a = C0674b.m3720a(resources, this.f2655c);
                int i = this.f2655c;
                this.f2655c = a;
                if (i != a) {
                    this.f2665m = false;
                    this.f2662j = false;
                }
            }
        }

        /* renamed from: a */
        public final void mo3834a(boolean z) {
            this.f2664l = z;
        }

        /* renamed from: a */
        public synchronized boolean mo3835a() {
            if (this.f2674v) {
                return this.f2675w;
            }
            m3732n();
            this.f2674v = true;
            int i = this.f2660h;
            Drawable[] drawableArr = this.f2659g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f2675w = false;
                    return false;
                }
            }
            this.f2675w = true;
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo3836b() {
            this.f2665m = true;
            m3732n();
            int i = this.f2660h;
            Drawable[] drawableArr = this.f2659g;
            this.f2667o = -1;
            this.f2666n = -1;
            this.f2669q = 0;
            this.f2668p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f2666n) {
                    this.f2666n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f2667o) {
                    this.f2667o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f2668p) {
                    this.f2668p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f2669q) {
                    this.f2669q = minimumHeight;
                }
            }
        }

        /* renamed from: b */
        public final void mo3837b(int i) {
            this.f2644A = i;
        }

        /* renamed from: b */
        public final void mo3838b(boolean z) {
            this.f2661i = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo3839b(int i, int i2) {
            int i3 = this.f2660h;
            Drawable[] drawableArr = this.f2659g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f2678z = i;
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final int mo3840c() {
            return this.f2659g.length;
        }

        /* renamed from: c */
        public final void mo3841c(int i) {
            this.f2645B = i;
        }

        public boolean canApplyTheme() {
            int i = this.f2660h;
            Drawable[] drawableArr = this.f2659g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f2658f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final int mo3843d() {
            return this.f2660h;
        }

        /* renamed from: e */
        public final int mo3844e() {
            if (!this.f2665m) {
                mo3836b();
            }
            return this.f2667o;
        }

        /* renamed from: f */
        public final int mo3845f() {
            if (!this.f2665m) {
                mo3836b();
            }
            return this.f2669q;
        }

        /* renamed from: g */
        public final int mo3846g() {
            if (!this.f2665m) {
                mo3836b();
            }
            return this.f2668p;
        }

        public int getChangingConfigurations() {
            return this.f2656d | this.f2657e;
        }

        /* renamed from: h */
        public final Rect mo3848h() {
            if (this.f2661i) {
                return null;
            }
            if (this.f2663k != null || this.f2662j) {
                return this.f2663k;
            }
            m3732n();
            Rect rect = new Rect();
            int i = this.f2660h;
            Drawable[] drawableArr = this.f2659g;
            Rect rect2 = null;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect)) {
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect.left;
                    if (i3 > rect2.left) {
                        rect2.left = i3;
                    }
                    int i4 = rect.top;
                    if (i4 > rect2.top) {
                        rect2.top = i4;
                    }
                    int i5 = rect.right;
                    if (i5 > rect2.right) {
                        rect2.right = i5;
                    }
                    int i6 = rect.bottom;
                    if (i6 > rect2.bottom) {
                        rect2.bottom = i6;
                    }
                }
            }
            this.f2662j = true;
            this.f2663k = rect2;
            return rect2;
        }

        /* renamed from: i */
        public final int mo3849i() {
            if (!this.f2665m) {
                mo3836b();
            }
            return this.f2666n;
        }

        /* renamed from: j */
        public final int mo3850j() {
            if (this.f2670r) {
                return this.f2671s;
            }
            m3732n();
            int i = this.f2660h;
            Drawable[] drawableArr = this.f2659g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f2671s = opacity;
            this.f2670r = true;
            return opacity;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo3851k() {
            this.f2670r = false;
            this.f2672t = false;
        }

        /* renamed from: l */
        public final boolean mo3852l() {
            return this.f2664l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public abstract void mo3781m();
    }

    C0674b() {
    }

    /* renamed from: a */
    static int m3720a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* renamed from: a */
    private void m3721a(Drawable drawable) {
        if (this.f2641q == null) {
            this.f2641q = new C0676b();
        }
        C0676b bVar = this.f2641q;
        bVar.mo3825a(drawable.getCallback());
        drawable.setCallback(bVar);
        try {
            if (this.f2630f.f2644A <= 0 && this.f2635k) {
                drawable.setAlpha(this.f2634j);
            }
            if (this.f2630f.f2648E) {
                drawable.setColorFilter(this.f2630f.f2647D);
            } else {
                if (this.f2630f.f2651H) {
                    C0328a.m1611a(drawable, this.f2630f.f2649F);
                }
                if (this.f2630f.f2652I) {
                    C0328a.m1614a(drawable, this.f2630f.f2650G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f2630f.f2676x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f2630f.f2646C);
            }
            Rect rect = this.f2631g;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f2641q.mo3824a());
        }
    }

    /* renamed from: c */
    private boolean m3722c() {
        return isAutoMirrored() && C0328a.m1622e(this) == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0677c mo3764a() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3789a(Resources resources) {
        this.f2630f.mo3833a(resources);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3766a(C0677c cVar) {
        this.f2630f = cVar;
        int i = this.f2636l;
        if (i >= 0) {
            this.f2632h = cVar.mo3830a(i);
            Drawable drawable = this.f2632h;
            if (drawable != null) {
                m3721a(drawable);
            }
        }
        this.f2633i = null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3790a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f2635k = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f2632h
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f2639o
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f2634j
            r3.setAlpha(r9)
            goto L_0x0036
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            b.a.l.a.b$c r9 = r13.f2630f
            int r9 = r9.f2644A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f2634j
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x0039
        L_0x0036:
            r13.f2639o = r7
        L_0x0038:
            r3 = 0
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f2633i
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f2640p
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x004e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f2633i = r0
            goto L_0x0061
        L_0x004e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            b.a.l.a.b$c r4 = r13.f2630f
            int r4 = r4.f2645B
            int r3 = r3 / r4
            int r4 = r13.f2634j
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f2640p = r7
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f2638n
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p007a.p010l.p011a.C0674b.mo3790a(boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3791a(int r10) {
        /*
            r9 = this;
            int r0 = r9.f2636l
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            b.a.l.a.b$c r0 = r9.f2630f
            int r0 = r0.f2645B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f2633i
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f2632h
            if (r0 == 0) goto L_0x0029
            r9.f2633i = r0
            b.a.l.a.b$c r0 = r9.f2630f
            int r0 = r0.f2645B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f2640p = r0
            goto L_0x0035
        L_0x0029:
            r9.f2633i = r4
            r9.f2640p = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f2632h
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            b.a.l.a.b$c r0 = r9.f2630f
            int r1 = r0.f2660h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo3830a((int) r10)
            r9.f2632h = r0
            r9.f2636l = r10
            if (r0 == 0) goto L_0x005a
            b.a.l.a.b$c r10 = r9.f2630f
            int r10 = r10.f2644A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f2639o = r2
        L_0x0051:
            r9.m3721a((android.graphics.drawable.Drawable) r0)
            goto L_0x005a
        L_0x0055:
            r9.f2632h = r4
            r10 = -1
            r9.f2636l = r10
        L_0x005a:
            long r0 = r9.f2639o
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f2640p
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f2638n
            if (r0 != 0) goto L_0x0073
            b.a.l.a.b$a r0 = new b.a.l.a.b$a
            r0.<init>()
            r9.f2638n = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.mo3790a((boolean) r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p007a.p010l.p011a.C0674b.mo3791a(int):boolean");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f2630f.mo3832a(theme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo3793b() {
        return this.f2636l;
    }

    public boolean canApplyTheme() {
        return this.f2630f.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f2632h;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f2633i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f2634j;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f2630f.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f2630f.mo3835a()) {
            return null;
        }
        this.f2630f.f2656d = getChangingConfigurations();
        return this.f2630f;
    }

    public Drawable getCurrent() {
        return this.f2632h;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f2631g;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f2630f.mo3852l()) {
            return this.f2630f.mo3844e();
        }
        Drawable drawable = this.f2632h;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f2630f.mo3852l()) {
            return this.f2630f.mo3849i();
        }
        Drawable drawable = this.f2632h;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f2630f.mo3852l()) {
            return this.f2630f.mo3845f();
        }
        Drawable drawable = this.f2632h;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f2630f.mo3852l()) {
            return this.f2630f.mo3846g();
        }
        Drawable drawable = this.f2632h;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f2632h;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f2630f.mo3850j();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f2632h;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect h = this.f2630f.mo3848h();
        if (h != null) {
            rect.set(h);
            z = (h.right | ((h.left | h.top) | h.bottom)) != 0;
        } else {
            Drawable drawable = this.f2632h;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m3722c()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        C0677c cVar = this.f2630f;
        if (cVar != null) {
            cVar.mo3851k();
        }
        if (drawable == this.f2632h && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f2630f.f2646C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f2633i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f2633i = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f2632h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f2635k) {
                this.f2632h.setAlpha(this.f2634j);
            }
        }
        if (this.f2640p != 0) {
            this.f2640p = 0;
            z = true;
        }
        if (this.f2639o != 0) {
            this.f2639o = 0;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f2637m && super.mutate() == this) {
            C0677c a = mo3764a();
            a.mo3781m();
            mo3766a(a);
            this.f2637m = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2633i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f2632h;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f2630f.mo3839b(i, mo3793b());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f2633i;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f2632h;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2633i;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f2632h;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f2632h && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f2635k || this.f2634j != i) {
            this.f2635k = true;
            this.f2634j = i;
            Drawable drawable = this.f2632h;
            if (drawable == null) {
                return;
            }
            if (this.f2639o == 0) {
                drawable.setAlpha(i);
            } else {
                mo3790a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C0677c cVar = this.f2630f;
        if (cVar.f2646C != z) {
            cVar.f2646C = z;
            Drawable drawable = this.f2632h;
            if (drawable != null) {
                C0328a.m1615a(drawable, cVar.f2646C);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C0677c cVar = this.f2630f;
        cVar.f2648E = true;
        if (cVar.f2647D != colorFilter) {
            cVar.f2647D = colorFilter;
            Drawable drawable = this.f2632h;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C0677c cVar = this.f2630f;
        if (cVar.f2676x != z) {
            cVar.f2676x = z;
            Drawable drawable = this.f2632h;
            if (drawable != null) {
                drawable.setDither(cVar.f2676x);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f2632h;
        if (drawable != null) {
            C0328a.m1609a(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f2631g;
        if (rect == null) {
            this.f2631g = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f2632h;
        if (drawable != null) {
            C0328a.m1610a(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C0677c cVar = this.f2630f;
        cVar.f2651H = true;
        if (cVar.f2649F != colorStateList) {
            cVar.f2649F = colorStateList;
            C0328a.m1611a(this.f2632h, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0677c cVar = this.f2630f;
        cVar.f2652I = true;
        if (cVar.f2650G != mode) {
            cVar.f2650G = mode;
            C0328a.m1614a(this.f2632h, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f2633i;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f2632h;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f2632h && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
