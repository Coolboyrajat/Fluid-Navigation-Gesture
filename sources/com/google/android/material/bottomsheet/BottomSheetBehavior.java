package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p006b.p026g.p030f.C0797a;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.p036e0.C0857c;
import p006b.p026g.p035k.p036e0.C0865f;
import p006b.p039i.p040a.C0912a;
import p006b.p039i.p041b.C0923c;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1171d;
import p054c.p083e.p084a.p085a.C1177j;
import p054c.p083e.p084a.p085a.p102z.C1233d;
import p054c.p083e.p084a.p085a.p102z.C1238g;
import p190io.objectbox.BoxStoreBuilder;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.C0265c<V> {

    /* renamed from: J */
    private static final int f6634J = C1177j.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    WeakReference<V> f6635A;

    /* renamed from: B */
    WeakReference<View> f6636B;

    /* renamed from: C */
    private C2582e f6637C;

    /* renamed from: D */
    private VelocityTracker f6638D;

    /* renamed from: E */
    int f6639E;

    /* renamed from: F */
    private int f6640F;

    /* renamed from: G */
    boolean f6641G;

    /* renamed from: H */
    private Map<View, Integer> f6642H;

    /* renamed from: I */
    private final C0923c.C0926c f6643I = new C2580c();

    /* renamed from: a */
    private int f6644a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f6645b = true;

    /* renamed from: c */
    private float f6646c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f6647d;

    /* renamed from: e */
    private boolean f6648e;

    /* renamed from: f */
    private int f6649f;

    /* renamed from: g */
    private boolean f6650g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1233d f6651h;

    /* renamed from: i */
    private C1238g f6652i;

    /* renamed from: j */
    private boolean f6653j;

    /* renamed from: k */
    private ValueAnimator f6654k;

    /* renamed from: l */
    int f6655l;

    /* renamed from: m */
    int f6656m;

    /* renamed from: n */
    int f6657n;

    /* renamed from: o */
    float f6658o = 0.5f;

    /* renamed from: p */
    int f6659p;

    /* renamed from: q */
    float f6660q = -1.0f;

    /* renamed from: r */
    boolean f6661r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f6662s;

    /* renamed from: t */
    int f6663t = 4;

    /* renamed from: u */
    C0923c f6664u;

    /* renamed from: v */
    private boolean f6665v;

    /* renamed from: w */
    private int f6666w;

    /* renamed from: x */
    private boolean f6667x;

    /* renamed from: y */
    int f6668y;

    /* renamed from: z */
    int f6669z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    class C2578a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f6670f;

        /* renamed from: g */
        final /* synthetic */ int f6671g;

        C2578a(View view, int i) {
            this.f6670f = view;
            this.f6671g = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo7839a(this.f6670f, this.f6671g);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    class C2579b implements ValueAnimator.AnimatorUpdateListener {
        C2579b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f6651h != null) {
                BottomSheetBehavior.this.f6651h.mo5497b(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    class C2580c extends C0923c.C0926c {
        C2580c() {
        }

        /* renamed from: a */
        public int mo4772a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
            if (java.lang.Math.abs(r8 - r6.f6674a.f6657n) < java.lang.Math.abs(r8 - r6.f6674a.f6659p)) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
            if (java.lang.Math.abs(r8 - r6.f6674a.f6656m) < java.lang.Math.abs(r8 - r6.f6674a.f6659p)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.f6674a.f6659p)) goto L_0x0086;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo4774a(android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                r0 = 0
                r1 = 4
                r2 = 6
                r3 = 3
                int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r4 >= 0) goto L_0x0026
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.f6645b
                if (r8 == 0) goto L_0x0017
            L_0x0010:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f6656m
            L_0x0014:
                r1 = 3
                goto L_0x00d7
            L_0x0017:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f6657n
                if (r8 <= r0) goto L_0x0023
                r8 = r0
                goto L_0x008a
            L_0x0023:
                int r8 = r9.f6655l
                goto L_0x0014
            L_0x0026:
                com.google.android.material.bottomsheet.BottomSheetBehavior r4 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r4.f6661r
                if (r5 == 0) goto L_0x004f
                boolean r4 = r4.mo7843a((android.view.View) r7, (float) r9)
                if (r4 == 0) goto L_0x004f
                int r4 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r5 = r5.f6659p
                if (r4 > r5) goto L_0x0048
                float r4 = java.lang.Math.abs(r8)
                float r5 = java.lang.Math.abs(r9)
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 >= 0) goto L_0x004f
            L_0x0048:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f6669z
                r1 = 5
                goto L_0x00d7
            L_0x004f:
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x008c
                float r8 = java.lang.Math.abs(r8)
                float r9 = java.lang.Math.abs(r9)
                int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
                if (r8 <= 0) goto L_0x0060
                goto L_0x008c
            L_0x0060:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.f6645b
                if (r8 == 0) goto L_0x006d
            L_0x0068:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f6659p
                goto L_0x00d7
            L_0x006d:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f6657n
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f6659p
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0068
            L_0x0086:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f6657n
            L_0x008a:
                r1 = 6
                goto L_0x00d7
            L_0x008c:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f6645b
                if (r9 == 0) goto L_0x00af
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f6656m
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f6659p
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0068
                goto L_0x0010
            L_0x00af:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f6657n
                if (r8 >= r0) goto L_0x00c5
                int r9 = r9.f6659p
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                if (r8 >= r9) goto L_0x0086
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f6655l
                goto L_0x0014
            L_0x00c5:
                int r9 = r8 - r0
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f6659p
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0068
                goto L_0x0086
            L_0x00d7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r0 = 1
                r9.mo7840a((android.view.View) r7, (int) r1, (int) r8, (boolean) r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C2580c.mo4774a(android.view.View, float, float):void");
        }

        /* renamed from: a */
        public void mo4776a(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo7837a(i2);
        }

        /* renamed from: b */
        public int mo4777b(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f6661r ? bottomSheetBehavior.f6669z : bottomSheetBehavior.f6659p;
        }

        /* renamed from: b */
        public int mo4778b(View view, int i, int i2) {
            int c = BottomSheetBehavior.this.m9980g();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C0797a.m4439a(i, c, bottomSheetBehavior.f6661r ? bottomSheetBehavior.f6669z : bottomSheetBehavior.f6659p);
        }

        /* renamed from: b */
        public boolean mo4781b(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f6663t;
            if (i2 == 1 || bottomSheetBehavior.f6641G) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f6639E == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f6636B;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f6635A;
            return weakReference2 != null && weakReference2.get() == view;
        }

        /* renamed from: c */
        public void mo4782c(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.mo7852f(1);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    class C2581d implements C0865f {

        /* renamed from: a */
        final /* synthetic */ int f6675a;

        C2581d(int i) {
            this.f6675a = i;
        }

        /* renamed from: a */
        public boolean mo4650a(View view, C0865f.C0866a aVar) {
            BottomSheetBehavior.this.mo7851e(this.f6675a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public static abstract class C2582e {
        /* renamed from: a */
        public abstract void mo6069a(View view, float f);

        /* renamed from: a */
        public abstract void mo6070a(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    protected static class C2583f extends C0912a {
        public static final Parcelable.Creator<C2583f> CREATOR = new C2584a();

        /* renamed from: h */
        final int f6677h;

        /* renamed from: i */
        int f6678i;

        /* renamed from: j */
        boolean f6679j;

        /* renamed from: k */
        boolean f6680k;

        /* renamed from: l */
        boolean f6681l;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f$a */
        static class C2584a implements Parcelable.ClassLoaderCreator<C2583f> {
            C2584a() {
            }

            public C2583f createFromParcel(Parcel parcel) {
                return new C2583f(parcel, (ClassLoader) null);
            }

            public C2583f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2583f(parcel, classLoader);
            }

            public C2583f[] newArray(int i) {
                return new C2583f[i];
            }
        }

        public C2583f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6677h = parcel.readInt();
            this.f6678i = parcel.readInt();
            boolean z = false;
            this.f6679j = parcel.readInt() == 1;
            this.f6680k = parcel.readInt() == 1;
            this.f6681l = parcel.readInt() == 1 ? true : z;
        }

        public C2583f(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f6677h = bottomSheetBehavior.f6663t;
            this.f6678i = bottomSheetBehavior.f6647d;
            this.f6679j = bottomSheetBehavior.f6645b;
            this.f6680k = bottomSheetBehavior.f6661r;
            this.f6681l = bottomSheetBehavior.f6662s;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6677h);
            parcel.writeInt(this.f6678i);
            parcel.writeInt(this.f6679j ? 1 : 0);
            parcel.writeInt(this.f6680k ? 1 : 0);
            parcel.writeInt(this.f6681l ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    private class C2585g implements Runnable {

        /* renamed from: f */
        private final View f6682f;

        /* renamed from: g */
        private final int f6683g;

        C2585g(View view, int i) {
            this.f6682f = view;
            this.f6683g = i;
        }

        public void run() {
            C0923c cVar = BottomSheetBehavior.this.f6664u;
            if (cVar == null || !cVar.mo4760a(true)) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f6663t == 2) {
                    bottomSheetBehavior.mo7852f(this.f6683g);
                    return;
                }
                return;
            }
            C0890v.m4757a(this.f6682f, (Runnable) this);
        }
    }

    public BottomSheetBehavior() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0058, code lost:
        r9 = r9.data;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomSheetBehavior(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            r7.<init>(r8, r9)
            r0 = 0
            r7.f6644a = r0
            r1 = 1
            r7.f6645b = r1
            r2 = 1056964608(0x3f000000, float:0.5)
            r7.f6658o = r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.f6660q = r3
            r4 = 4
            r7.f6663t = r4
            com.google.android.material.bottomsheet.BottomSheetBehavior$c r4 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c
            r4.<init>()
            r7.f6643I = r4
            int[] r4 = p054c.p083e.p084a.p085a.C1178k.BottomSheetBehavior_Layout
            android.content.res.TypedArray r4 = r8.obtainStyledAttributes(r9, r4)
            int r5 = p054c.p083e.p084a.p085a.C1178k.BottomSheetBehavior_Layout_shapeAppearance
            boolean r5 = r4.hasValue(r5)
            r7.f6650g = r5
            int r5 = p054c.p083e.p084a.p085a.C1178k.BottomSheetBehavior_Layout_backgroundTint
            boolean r5 = r4.hasValue(r5)
            if (r5 == 0) goto L_0x003b
            int r6 = p054c.p083e.p084a.p085a.C1178k.BottomSheetBehavior_Layout_backgroundTint
            android.content.res.ColorStateList r6 = p054c.p083e.p084a.p085a.p099w.C1218c.m5861a((android.content.Context) r8, (android.content.res.TypedArray) r4, (int) r6)
            r7.m9968a((android.content.Context) r8, (android.util.AttributeSet) r9, (boolean) r5, (android.content.res.ColorStateList) r6)
            goto L_0x003e
        L_0x003b:
            r7.m9967a((android.content.Context) r8, (android.util.AttributeSet) r9, (boolean) r5)
        L_0x003e:
            r7.m9979f()
            int r9 = android.os.Build.VERSION.SDK_INT
            r5 = 21
            if (r9 < r5) goto L_0x004f
            int r9 = p054c.p083e.p084a.p085a.C1178k.BottomSheetBehavior_Layout_android_elevation
            float r9 = r4.getDimension(r9, r3)
            r7.f6660q = r9
        L_0x004f:
            int r9 = p054c.p083e.p084a.p085a.C1178k.BottomSheetBehavior_Layout_behavior_peekHeight
            android.util.TypedValue r9 = r4.peekValue(r9)
            r3 = -1
            if (r9 == 0) goto L_0x005d
            int r9 = r9.data
            if (r9 != r3) goto L_0x005d
            goto L_0x0063
        L_0x005d:
            int r9 = p054c.p083e.p084a.p085a.C1178k.BottomSheetBehavior_Layout_behavior_peekHeight
            int r9 = r4.getDimensionPixelSize(r9, r3)
        L_0x0063:
            r7.mo7848c((int) r9)
            int r9 = p054c.p083e.p084a.p085a.C1178k.BottomSheetBehavior_Layout_behavior_hideable
            boolean r9 = r4.getBoolean(r9, r0)
            r7.mo7846b((boolean) r9)
            int r9 = p054c.p083e.p084a.p085a.C1178k.BottomSheetBehavior_Layout_behavior_fitToContents
            boolean r9 = r4.getBoolean(r9, r1)
            r7.mo7842a((boolean) r9)
            int r9 = p054c.p083e.p084a.p085a.C1178k.BottomSheetBehavior_Layout_behavior_skipCollapsed
            boolean r9 = r4.getBoolean(r9, r0)
            r7.mo7849c((boolean) r9)
            int r9 = p054c.p083e.p084a.p085a.C1178k.BottomSheetBehavior_Layout_behavior_saveFlags
            int r9 = r4.getInt(r9, r0)
            r7.mo7850d((int) r9)
            int r9 = p054c.p083e.p084a.p085a.C1178k.BottomSheetBehavior_Layout_behavior_halfExpandedRatio
            float r9 = r4.getFloat(r9, r2)
            r7.mo7836a((float) r9)
            int r9 = p054c.p083e.p084a.p085a.C1178k.BottomSheetBehavior_Layout_behavior_expandedOffset
            int r9 = r4.getInt(r9, r0)
            r7.mo7845b((int) r9)
            r4.recycle()
            android.view.ViewConfiguration r8 = android.view.ViewConfiguration.get(r8)
            int r8 = r8.getScaledMaximumFlingVelocity()
            float r8 = (float) r8
            r7.f6646c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    private void m9967a(Context context, AttributeSet attributeSet, boolean z) {
        m9968a(context, attributeSet, z, (ColorStateList) null);
    }

    /* renamed from: a */
    private void m9968a(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f6650g) {
            this.f6652i = C1238g.m5967a(context, attributeSet, C1169b.bottomSheetStyle, f6634J).mo5547a();
            this.f6651h = new C1233d(this.f6652i);
            this.f6651h.mo5491a(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f6651h.setTint(typedValue.data);
                return;
            }
            this.f6651h.mo5492a(colorStateList);
        }
    }

    /* renamed from: a */
    private void m9969a(V v, C0857c.C0858a aVar, int i) {
        C0890v.m4754a(v, aVar, (CharSequence) null, new C2581d(i));
    }

    /* renamed from: a */
    private void m9970a(C2583f fVar) {
        int i = this.f6644a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f6647d = fVar.f6678i;
            }
            int i2 = this.f6644a;
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f6645b = fVar.f6679j;
            }
            int i3 = this.f6644a;
            if (i3 == -1 || (i3 & 4) == 4) {
                this.f6661r = fVar.f6680k;
            }
            int i4 = this.f6644a;
            if (i4 == -1 || (i4 & 8) == 8) {
                this.f6662s = fVar.f6681l;
            }
        }
    }

    /* renamed from: b */
    public static <V extends View> BottomSheetBehavior<V> m9971b(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C0268f) {
            CoordinatorLayout.C0265c d = ((CoordinatorLayout.C0268f) layoutParams).mo1864d();
            if (d instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) d;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: d */
    private void m9975d() {
        int max = this.f6648e ? Math.max(this.f6649f, this.f6669z - ((this.f6668y * 9) / 16)) : this.f6647d;
        if (this.f6645b) {
            this.f6659p = Math.max(this.f6669z - max, this.f6656m);
        } else {
            this.f6659p = this.f6669z - max;
        }
    }

    /* renamed from: d */
    private void m9976d(boolean z) {
        int i;
        WeakReference<V> weakReference = this.f6635A;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z) {
                    if (this.f6642H == null) {
                        this.f6642H = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.f6635A.get()) {
                        if (!z) {
                            Map<View, Integer> map = this.f6642H;
                            if (map != null && map.containsKey(childAt)) {
                                i = this.f6642H.get(childAt).intValue();
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.f6642H.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            i = 4;
                        }
                        C0890v.m4783h(childAt, i);
                    }
                }
                if (!z) {
                    this.f6642H = null;
                }
            }
        }
    }

    /* renamed from: e */
    private void m9977e() {
        this.f6657n = (int) (((float) this.f6669z) * (1.0f - this.f6658o));
    }

    /* renamed from: f */
    private void m9979f() {
        this.f6654k = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f6654k.setDuration(500);
        this.f6654k.addUpdateListener(new C2579b());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public int m9980g() {
        return this.f6645b ? this.f6656m : this.f6655l;
    }

    /* renamed from: g */
    private void m9981g(int i) {
        View view = (View) this.f6635A.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C0890v.m4731B(view)) {
                mo7839a(view, i);
            } else {
                view.post(new C2578a(view, i));
            }
        }
    }

    /* renamed from: h */
    private float m9982h() {
        VelocityTracker velocityTracker = this.f6638D;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f6646c);
        return this.f6638D.getYVelocity(this.f6639E);
    }

    /* renamed from: h */
    private void m9983h(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.f6653j != z) {
                this.f6653j = z;
                if (this.f6651h != null && (valueAnimator = this.f6654k) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f6654k.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.f6654k.setFloatValues(new float[]{1.0f - f, f});
                    this.f6654k.start();
                }
            }
        }
    }

    /* renamed from: i */
    private void m9984i() {
        this.f6639E = -1;
        VelocityTracker velocityTracker = this.f6638D;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6638D = null;
        }
    }

    /* renamed from: j */
    private void m9985j() {
        View view;
        C0857c.C0858a aVar;
        WeakReference<V> weakReference = this.f6635A;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C0890v.m4779f(view, 524288);
            C0890v.m4779f(view, 262144);
            C0890v.m4779f(view, BoxStoreBuilder.DEFAULT_MAX_DB_SIZE_KBYTE);
            if (this.f6661r && this.f6663t != 5) {
                m9969a(view, C0857c.C0858a.f3297h, 5);
            }
            int i = this.f6663t;
            int i2 = 6;
            if (i == 3) {
                if (this.f6645b) {
                    i2 = 4;
                }
                aVar = C0857c.C0858a.f3296g;
            } else if (i == 4) {
                if (this.f6645b) {
                    i2 = 3;
                }
                aVar = C0857c.C0858a.f3295f;
            } else if (i == 6) {
                m9969a(view, C0857c.C0858a.f3296g, 4);
                m9969a(view, C0857c.C0858a.f3295f, 3);
                return;
            } else {
                return;
            }
            m9969a(view, aVar, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo7835a(View view) {
        if (C0890v.m4733D(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View a = mo7835a(viewGroup.getChildAt(i));
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo1820a() {
        super.mo1820a();
        this.f6635A = null;
        this.f6664u = null;
    }

    /* renamed from: a */
    public void mo7836a(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f6658o = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7837a(int i) {
        C2582e eVar;
        float f;
        float f2;
        View view = (View) this.f6635A.get();
        if (view != null && (eVar = this.f6637C) != null) {
            int i2 = this.f6659p;
            if (i > i2) {
                f = (float) (i2 - i);
                f2 = (float) (this.f6669z - i2);
            } else {
                f = (float) (i2 - i);
                f2 = (float) (i2 - m9980g());
            }
            eVar.mo6069a(view, f / f2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7838a(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f6648e
            if (r4 != 0) goto L_0x0015
            r3.f6648e = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f6648e
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f6647d
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f6648e = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f6647d = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.f6635A
            if (r4 == 0) goto L_0x0042
            r3.m9975d()
            int r4 = r3.f6663t
            r0 = 4
            if (r4 != r0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.f6635A
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x003f
            int r4 = r3.f6663t
            r3.m9981g(r4)
            goto L_0x0042
        L_0x003f:
            r4.requestLayout()
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo7838a(int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7839a(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f6659p;
        } else if (i == 6) {
            int i4 = this.f6657n;
            if (!this.f6645b || i4 > (i3 = this.f6656m)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = m9980g();
        } else if (!this.f6661r || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.f6669z;
        }
        mo7840a(view, i, i2, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7840a(View view, int i, int i2, boolean z) {
        if (z ? this.f6664u.mo4767c(view.getLeft(), i2) : this.f6664u.mo4766b(view, view.getLeft(), i2)) {
            mo7852f(2);
            m9983h(i);
            C0890v.m4757a(view, (Runnable) new C2585g(view, i));
            return;
        }
        mo7852f(i);
    }

    /* renamed from: a */
    public void mo1821a(CoordinatorLayout.C0268f fVar) {
        super.mo1821a(fVar);
        this.f6635A = null;
        this.f6664u = null;
    }

    /* renamed from: a */
    public void mo1822a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C2583f fVar = (C2583f) parcelable;
        super.mo1822a(coordinatorLayout, v, fVar.mo4725q());
        m9970a(fVar);
        int i = fVar.f6677h;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.f6663t = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f6659p)) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0099, code lost:
        if (java.lang.Math.abs(r3 - r2.f6657n) < java.lang.Math.abs(r3 - r2.f6659p)) goto L_0x009b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1823a(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.m9980g()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.mo7852f(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f6636B
            if (r3 == 0) goto L_0x00a4
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x00a4
            boolean r3 = r2.f6667x
            if (r3 != 0) goto L_0x001f
            goto L_0x00a4
        L_0x001f:
            int r3 = r2.f6666w
            r5 = 6
            r6 = 4
            if (r3 <= 0) goto L_0x002b
            int r3 = r2.m9980g()
            goto L_0x009e
        L_0x002b:
            boolean r3 = r2.f6661r
            if (r3 == 0) goto L_0x003d
            float r3 = r2.m9982h()
            boolean r3 = r2.mo7843a((android.view.View) r4, (float) r3)
            if (r3 == 0) goto L_0x003d
            int r3 = r2.f6669z
            r0 = 5
            goto L_0x009e
        L_0x003d:
            int r3 = r2.f6666w
            if (r3 != 0) goto L_0x007e
            int r3 = r4.getTop()
            boolean r1 = r2.f6645b
            if (r1 == 0) goto L_0x005d
            int r5 = r2.f6656m
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f6659p
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x0082
            int r3 = r2.f6656m
            goto L_0x009e
        L_0x005d:
            int r1 = r2.f6657n
            if (r3 >= r1) goto L_0x006e
            int r6 = r2.f6659p
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L_0x009b
            int r3 = r2.f6655l
            goto L_0x009e
        L_0x006e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f6659p
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0082
            goto L_0x009b
        L_0x007e:
            boolean r3 = r2.f6645b
            if (r3 == 0) goto L_0x0086
        L_0x0082:
            int r3 = r2.f6659p
            r0 = 4
            goto L_0x009e
        L_0x0086:
            int r3 = r4.getTop()
            int r0 = r2.f6657n
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f6659p
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0082
        L_0x009b:
            int r3 = r2.f6657n
            r0 = 6
        L_0x009e:
            r5 = 0
            r2.mo7840a((android.view.View) r4, (int) r0, (int) r3, (boolean) r5)
            r2.f6667x = r5
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo1823a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    /* renamed from: a */
    public void mo1826a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* renamed from: a */
    public void mo1828a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f6636B;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v.getTop();
                int i5 = top - i2;
                if (i2 <= 0) {
                    if (i2 < 0 && !view.canScrollVertically(-1)) {
                        int i6 = this.f6659p;
                        if (i5 <= i6 || this.f6661r) {
                            iArr[1] = i2;
                            C0890v.m4777e(v, -i2);
                            mo7852f(1);
                        } else {
                            iArr[1] = top - i6;
                            C0890v.m4777e(v, -iArr[1]);
                            i4 = 4;
                        }
                    }
                    mo7837a(v.getTop());
                    this.f6666w = i2;
                    this.f6667x = true;
                } else if (i5 < m9980g()) {
                    iArr[1] = top - m9980g();
                    C0890v.m4777e(v, -iArr[1]);
                    i4 = 3;
                } else {
                    iArr[1] = i2;
                    C0890v.m4777e(v, -i2);
                    mo7852f(1);
                    mo7837a(v.getTop());
                    this.f6666w = i2;
                    this.f6667x = true;
                }
                mo7852f(i4);
                mo7837a(v.getTop());
                this.f6666w = i2;
                this.f6667x = true;
            }
        }
    }

    /* renamed from: a */
    public void mo7841a(C2582e eVar) {
        this.f6637C = eVar;
    }

    /* renamed from: a */
    public void mo7842a(boolean z) {
        if (this.f6645b != z) {
            this.f6645b = z;
            if (this.f6635A != null) {
                m9975d();
            }
            mo7852f((!this.f6645b || this.f6663t != 6) ? this.f6663t : 3);
            m9985j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7843a(View view, float f) {
        if (this.f6662s) {
            return true;
        }
        return view.getTop() >= this.f6659p && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f6659p)) / ((float) this.f6647d) > 0.5f;
    }

    /* renamed from: a */
    public boolean mo1832a(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        C1233d dVar;
        if (C0890v.m4788l(coordinatorLayout) && !C0890v.m4788l(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f6635A == null) {
            this.f6649f = coordinatorLayout.getResources().getDimensionPixelSize(C1171d.design_bottom_sheet_peek_height_min);
            this.f6635A = new WeakReference<>(v);
            if (this.f6650g && (dVar = this.f6651h) != null) {
                C0890v.m4751a((View) v, (Drawable) dVar);
            }
            C1233d dVar2 = this.f6651h;
            if (dVar2 != null) {
                float f = this.f6660q;
                if (f == -1.0f) {
                    f = C0890v.m4787k(v);
                }
                dVar2.mo5486a(f);
                this.f6653j = this.f6663t == 3;
                this.f6651h.mo5497b(this.f6653j ? 0.0f : 1.0f);
            }
            m9985j();
            if (C0890v.m4789m(v) == 0) {
                C0890v.m4783h(v, 1);
            }
        }
        if (this.f6664u == null) {
            this.f6664u = C0923c.m4953a((ViewGroup) coordinatorLayout, this.f6643I);
        }
        int top = v.getTop();
        coordinatorLayout.mo1785c((View) v, i);
        this.f6668y = coordinatorLayout.getWidth();
        this.f6669z = coordinatorLayout.getHeight();
        this.f6656m = Math.max(0, this.f6669z - v.getHeight());
        m9977e();
        m9975d();
        int i3 = this.f6663t;
        if (i3 == 3) {
            i2 = m9980g();
        } else if (i3 == 6) {
            i2 = this.f6657n;
        } else if (!this.f6661r || i3 != 5) {
            int i4 = this.f6663t;
            if (i4 == 4) {
                i2 = this.f6659p;
            } else {
                if (i4 == 1 || i4 == 2) {
                    C0890v.m4777e(v, top - v.getTop());
                }
                this.f6636B = new WeakReference<>(mo7835a((View) v));
                return true;
            }
        } else {
            i2 = this.f6669z;
        }
        C0890v.m4777e(v, i2);
        this.f6636B = new WeakReference<>(mo7835a((View) v));
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1836a(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000b
            r9.f6665v = r2
            return r1
        L_0x000b:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0014
            r9.m9984i()
        L_0x0014:
            android.view.VelocityTracker r3 = r9.f6638D
            if (r3 != 0) goto L_0x001e
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.f6638D = r3
        L_0x001e:
            android.view.VelocityTracker r3 = r9.f6638D
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L_0x0039
            if (r0 == r2) goto L_0x002e
            r11 = 3
            if (r0 == r11) goto L_0x002e
            goto L_0x007c
        L_0x002e:
            r9.f6641G = r1
            r9.f6639E = r4
            boolean r11 = r9.f6665v
            if (r11 == 0) goto L_0x007c
            r9.f6665v = r1
            return r1
        L_0x0039:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f6640F = r7
            int r7 = r9.f6663t
            if (r7 == r5) goto L_0x006b
            java.lang.ref.WeakReference<android.view.View> r7 = r9.f6636B
            if (r7 == 0) goto L_0x0054
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0055
        L_0x0054:
            r7 = r3
        L_0x0055:
            if (r7 == 0) goto L_0x006b
            int r8 = r9.f6640F
            boolean r7 = r10.mo1778a((android.view.View) r7, (int) r6, (int) r8)
            if (r7 == 0) goto L_0x006b
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f6639E = r7
            r9.f6641G = r2
        L_0x006b:
            int r7 = r9.f6639E
            if (r7 != r4) goto L_0x0079
            int r4 = r9.f6640F
            boolean r11 = r10.mo1778a((android.view.View) r11, (int) r6, (int) r4)
            if (r11 != 0) goto L_0x0079
            r11 = 1
            goto L_0x007a
        L_0x0079:
            r11 = 0
        L_0x007a:
            r9.f6665v = r11
        L_0x007c:
            boolean r11 = r9.f6665v
            if (r11 != 0) goto L_0x008b
            b.i.b.c r11 = r9.f6664u
            if (r11 == 0) goto L_0x008b
            boolean r11 = r11.mo4764b((android.view.MotionEvent) r12)
            if (r11 == 0) goto L_0x008b
            return r2
        L_0x008b:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.f6636B
            if (r11 == 0) goto L_0x0096
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0096:
            if (r0 != r5) goto L_0x00ce
            if (r3 == 0) goto L_0x00ce
            boolean r11 = r9.f6665v
            if (r11 != 0) goto L_0x00ce
            int r11 = r9.f6663t
            if (r11 == r2) goto L_0x00ce
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.mo1778a((android.view.View) r3, (int) r11, (int) r0)
            if (r10 != 0) goto L_0x00ce
            b.i.b.c r10 = r9.f6664u
            if (r10 == 0) goto L_0x00ce
            int r10 = r9.f6640F
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            b.i.b.c r11 = r9.f6664u
            int r11 = r11.mo4761b()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ce
            r1 = 1
        L_0x00ce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo1836a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public boolean mo1838a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f6636B;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.f6663t != 3 || super.mo1838a(coordinatorLayout, v, view, f, f2);
    }

    /* renamed from: b */
    public int mo7844b() {
        if (this.f6648e) {
            return -1;
        }
        return this.f6647d;
    }

    /* renamed from: b */
    public void mo7845b(int i) {
        if (i >= 0) {
            this.f6655l = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: b */
    public void mo7846b(boolean z) {
        if (this.f6661r != z) {
            this.f6661r = z;
            if (!z && this.f6663t == 5) {
                mo7851e(4);
            }
            m9985j();
        }
    }

    /* renamed from: b */
    public boolean mo1841b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f6663t == 1 && actionMasked == 0) {
            return true;
        }
        C0923c cVar = this.f6664u;
        if (cVar != null) {
            cVar.mo4756a(motionEvent);
        }
        if (actionMasked == 0) {
            m9984i();
        }
        if (this.f6638D == null) {
            this.f6638D = VelocityTracker.obtain();
        }
        this.f6638D.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f6665v && Math.abs(((float) this.f6640F) - motionEvent.getY()) > ((float) this.f6664u.mo4761b())) {
            this.f6664u.mo4757a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f6665v;
    }

    /* renamed from: b */
    public boolean mo1844b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f6666w = 0;
        this.f6667x = false;
        return (i & 2) != 0;
    }

    /* renamed from: c */
    public int mo7847c() {
        return this.f6663t;
    }

    /* renamed from: c */
    public void mo7848c(int i) {
        mo7838a(i, false);
    }

    /* renamed from: c */
    public void mo7849c(boolean z) {
        this.f6662s = z;
    }

    /* renamed from: d */
    public Parcelable mo1847d(CoordinatorLayout coordinatorLayout, V v) {
        return new C2583f(super.mo1847d(coordinatorLayout, v), this);
    }

    /* renamed from: d */
    public void mo7850d(int i) {
        this.f6644a = i;
    }

    /* renamed from: e */
    public void mo7851e(int i) {
        if (i != this.f6663t) {
            if (this.f6635A != null) {
                m9981g(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.f6661r && i == 5)) {
                this.f6663t = i;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7852f(int r3) {
        /*
            r2 = this;
            int r0 = r2.f6663t
            if (r0 != r3) goto L_0x0005
            return
        L_0x0005:
            r2.f6663t = r3
            java.lang.ref.WeakReference<V> r0 = r2.f6635A
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L_0x0015
            return
        L_0x0015:
            r1 = 6
            if (r3 == r1) goto L_0x0024
            r1 = 3
            if (r3 != r1) goto L_0x001c
            goto L_0x0024
        L_0x001c:
            r1 = 5
            if (r3 == r1) goto L_0x0022
            r1 = 4
            if (r3 != r1) goto L_0x0028
        L_0x0022:
            r1 = 0
            goto L_0x0025
        L_0x0024:
            r1 = 1
        L_0x0025:
            r2.m9976d((boolean) r1)
        L_0x0028:
            r2.m9983h(r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior$e r1 = r2.f6637C
            if (r1 == 0) goto L_0x0032
            r1.mo6070a((android.view.View) r0, (int) r3)
        L_0x0032:
            r2.m9985j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo7852f(int):void");
    }
}
