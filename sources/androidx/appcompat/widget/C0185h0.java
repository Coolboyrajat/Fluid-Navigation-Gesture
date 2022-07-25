package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.content.C0311a;
import androidx.core.graphics.drawable.C0328a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p006b.p007a.p010l.p011a.C0666a;
import p006b.p007a.p012m.C0681a;
import p006b.p021d.C0723a;
import p006b.p021d.C0728d;
import p006b.p021d.C0729e;
import p006b.p021d.C0737h;
import p006b.p051o.p052a.p053a.C1019c;
import p006b.p051o.p052a.p053a.C1029i;

/* renamed from: androidx.appcompat.widget.h0 */
public final class C0185h0 {

    /* renamed from: h */
    private static final PorterDuff.Mode f958h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    private static C0185h0 f959i;

    /* renamed from: j */
    private static final C0188c f960j = new C0188c(6);

    /* renamed from: a */
    private WeakHashMap<Context, C0737h<ColorStateList>> f961a;

    /* renamed from: b */
    private C0723a<String, C0189d> f962b;

    /* renamed from: c */
    private C0737h<String> f963c;

    /* renamed from: d */
    private final WeakHashMap<Context, C0728d<WeakReference<Drawable.ConstantState>>> f964d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f965e;

    /* renamed from: f */
    private boolean f966f;

    /* renamed from: g */
    private C0190e f967g;

    /* renamed from: androidx.appcompat.widget.h0$a */
    static class C0186a implements C0189d {
        C0186a() {
        }

        /* renamed from: a */
        public Drawable mo1378a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0666a.m3686b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$b */
    private static class C0187b implements C0189d {
        C0187b() {
        }

        /* renamed from: a */
        public Drawable mo1378a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1019c.m5267a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$c */
    private static class C0188c extends C0729e<Integer, PorterDuffColorFilter> {
        public C0188c(int i) {
            super(i);
        }

        /* renamed from: b */
        private static int m950b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public PorterDuffColorFilter mo1379a(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo4124b(Integer.valueOf(m950b(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public PorterDuffColorFilter mo1380a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo4120a(Integer.valueOf(m950b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$d */
    private interface C0189d {
        /* renamed from: a */
        Drawable mo1378a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.h0$e */
    interface C0190e {
        /* renamed from: a */
        ColorStateList mo1381a(Context context, int i);

        /* renamed from: a */
        PorterDuff.Mode mo1382a(int i);

        /* renamed from: a */
        Drawable mo1383a(C0185h0 h0Var, Context context, int i);

        /* renamed from: a */
        boolean mo1384a(Context context, int i, Drawable drawable);

        /* renamed from: b */
        boolean mo1385b(Context context, int i, Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.h0$f */
    private static class C0191f implements C0189d {
        C0191f() {
        }

        /* renamed from: a */
        public Drawable mo1378a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1029i.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static long m924a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m925a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C0185h0.class) {
            a = f960j.mo1379a(i, mode);
            if (a == null) {
                a = new PorterDuffColorFilter(i, mode);
                f960j.mo1380a(i, mode, a);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m926a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m925a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    private Drawable m927a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList b = mo1377b(context, i);
        if (b != null) {
            if (C0249z.m1266a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable i2 = C0328a.m1626i(drawable);
            C0328a.m1611a(i2, b);
            PorterDuff.Mode a = mo1370a(i);
            if (a == null) {
                return i2;
            }
            C0328a.m1614a(i2, a);
            return i2;
        }
        C0190e eVar = this.f967g;
        if ((eVar == null || !eVar.mo1385b(context, i, drawable)) && !mo1376a(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m928a(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, b.d.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f964d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            b.d.d r0 = (p006b.p021d.C0728d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo4110b((long) r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo4107a((long) r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0185h0.m928a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public static synchronized C0185h0 m929a() {
        C0185h0 h0Var;
        synchronized (C0185h0.class) {
            if (f959i == null) {
                f959i = new C0185h0();
                m932a(f959i);
            }
            h0Var = f959i;
        }
        return h0Var;
    }

    /* renamed from: a */
    private void m930a(Context context, int i, ColorStateList colorStateList) {
        if (this.f961a == null) {
            this.f961a = new WeakHashMap<>();
        }
        C0737h hVar = this.f961a.get(context);
        if (hVar == null) {
            hVar = new C0737h();
            this.f961a.put(context, hVar);
        }
        hVar.mo4216a(i, colorStateList);
    }

    /* renamed from: a */
    static void m931a(Drawable drawable, C0213p0 p0Var, int[] iArr) {
        if (!C0249z.m1266a(drawable) || drawable.mutate() == drawable) {
            if (p0Var.f1055d || p0Var.f1054c) {
                drawable.setColorFilter(m926a(p0Var.f1055d ? p0Var.f1052a : null, p0Var.f1054c ? p0Var.f1053b : f958h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private static void m932a(C0185h0 h0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            h0Var.m933a("vector", (C0189d) new C0191f());
            h0Var.m933a("animated-vector", (C0189d) new C0187b());
            h0Var.m933a("animated-selector", (C0189d) new C0186a());
        }
    }

    /* renamed from: a */
    private void m933a(String str, C0189d dVar) {
        if (this.f962b == null) {
            this.f962b = new C0723a<>();
        }
        this.f962b.put(str, dVar);
    }

    /* renamed from: a */
    private synchronized boolean m934a(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C0728d dVar = this.f964d.get(context);
            if (dVar == null) {
                dVar = new C0728d();
                this.f964d.put(context, dVar);
            }
            dVar.mo4115c(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m935a(Drawable drawable) {
        return (drawable instanceof C1029i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: b */
    private void m936b(Context context) {
        if (!this.f966f) {
            this.f966f = true;
            Drawable a = mo1371a(context, C0681a.abc_vector_test);
            if (a == null || !m935a(a)) {
                this.f966f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: c */
    private Drawable m937c(Context context, int i) {
        if (this.f965e == null) {
            this.f965e = new TypedValue();
        }
        TypedValue typedValue = this.f965e;
        context.getResources().getValue(i, typedValue, true);
        long a = m924a(typedValue);
        Drawable a2 = m928a(context, a);
        if (a2 != null) {
            return a2;
        }
        C0190e eVar = this.f967g;
        Drawable a3 = eVar == null ? null : eVar.mo1383a(this, context, i);
        if (a3 != null) {
            a3.setChangingConfigurations(typedValue.changingConfigurations);
            m934a(context, a, a3);
        }
        return a3;
    }

    /* renamed from: d */
    private ColorStateList m938d(Context context, int i) {
        C0737h hVar;
        WeakHashMap<Context, C0737h<ColorStateList>> weakHashMap = this.f961a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.mo4214a(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m939e(android.content.Context r11, int r12) {
        /*
            r10 = this;
            b.d.a<java.lang.String, androidx.appcompat.widget.h0$d> r0 = r10.f962b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            b.d.h<java.lang.String> r0 = r10.f963c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo4214a((int) r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            b.d.a<java.lang.String, androidx.appcompat.widget.h0$d> r3 = r10.f962b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            b.d.h r0 = new b.d.h
            r0.<init>()
            r10.f963c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f965e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f965e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f965e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m924a((android.util.TypedValue) r0)
            android.graphics.drawable.Drawable r6 = r10.m928a((android.content.Context) r11, (long) r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            b.d.h<java.lang.String> r8 = r10.f963c     // Catch:{ Exception -> 0x00a2 }
            r8.mo4216a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            b.d.a<java.lang.String, androidx.appcompat.widget.h0$d> r8 = r10.f962b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.h0$d r3 = (androidx.appcompat.widget.C0185h0.C0189d) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo1378a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.m934a((android.content.Context) r11, (long) r4, (android.graphics.drawable.Drawable) r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            b.d.h<java.lang.String> r11 = r10.f963c
            r11.mo4216a(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0185h0.m939e(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PorterDuff.Mode mo1370a(int i) {
        C0190e eVar = this.f967g;
        if (eVar == null) {
            return null;
        }
        return eVar.mo1382a(i);
    }

    /* renamed from: a */
    public synchronized Drawable mo1371a(Context context, int i) {
        return mo1372a(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Drawable mo1372a(Context context, int i, boolean z) {
        Drawable e;
        m936b(context);
        e = m939e(context, i);
        if (e == null) {
            e = m937c(context, i);
        }
        if (e == null) {
            e = C0311a.m1534c(context, i);
        }
        if (e != null) {
            e = m927a(context, i, z, e);
        }
        if (e != null) {
            C0249z.m1267b(e);
        }
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Drawable mo1373a(Context context, C0244w0 w0Var, int i) {
        Drawable e = m939e(context, i);
        if (e == null) {
            e = w0Var.mo1699a(i);
        }
        if (e == null) {
            return null;
        }
        return m927a(context, i, false, e);
    }

    /* renamed from: a */
    public synchronized void mo1374a(Context context) {
        C0728d dVar = this.f964d.get(context);
        if (dVar != null) {
            dVar.mo4106a();
        }
    }

    /* renamed from: a */
    public synchronized void mo1375a(C0190e eVar) {
        this.f967g = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1376a(Context context, int i, Drawable drawable) {
        C0190e eVar = this.f967g;
        return eVar != null && eVar.mo1384a(context, i, drawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized ColorStateList mo1377b(Context context, int i) {
        ColorStateList d;
        d = m938d(context, i);
        if (d == null) {
            d = this.f967g == null ? null : this.f967g.mo1381a(context, i);
            if (d != null) {
                m930a(context, i, d);
            }
        }
        return d;
    }
}
