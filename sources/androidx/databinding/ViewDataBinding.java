package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C0370b;
import androidx.databinding.C0377h;
import androidx.databinding.C0379i;
import androidx.databinding.C0381j;
import androidx.databinding.p004n.C0387a;
import androidx.lifecycle.C0481i;
import androidx.lifecycle.C0489n;
import androidx.lifecycle.C0490o;
import androidx.lifecycle.C0498u;
import androidx.lifecycle.C0499v;
import androidx.lifecycle.LiveData;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public abstract class ViewDataBinding extends C0369a {

    /* renamed from: p */
    static int f1660p = Build.VERSION.SDK_INT;

    /* renamed from: q */
    private static final int f1661q = 8;

    /* renamed from: r */
    private static final boolean f1662r = (f1660p >= 16);

    /* renamed from: s */
    private static final C0361i f1663s = new C0356d();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final ReferenceQueue<ViewDataBinding> f1664t = new ReferenceQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final View.OnAttachStateChangeListener f1665u = (Build.VERSION.SDK_INT < 19 ? null : new C0358f());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Runnable f1666b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f1667c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f1668d;

    /* renamed from: e */
    private C0366n[] f1669e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final View f1670f;

    /* renamed from: g */
    private C0370b<C0383k, ViewDataBinding, Void> f1671g;

    /* renamed from: h */
    private boolean f1672h;

    /* renamed from: i */
    private Choreographer f1673i;

    /* renamed from: j */
    private final Choreographer.FrameCallback f1674j;

    /* renamed from: k */
    private Handler f1675k;

    /* renamed from: l */
    private ViewDataBinding f1676l;

    /* renamed from: m */
    private C0490o f1677m;

    /* renamed from: n */
    private OnStartListener f1678n;

    /* renamed from: o */
    private boolean f1679o;

    static class OnStartListener implements C0489n {

        /* renamed from: f */
        final WeakReference<ViewDataBinding> f1680f;

        private OnStartListener(ViewDataBinding viewDataBinding) {
            this.f1680f = new WeakReference<>(viewDataBinding);
        }

        /* synthetic */ OnStartListener(ViewDataBinding viewDataBinding, C0353a aVar) {
            this(viewDataBinding);
        }

        @C0499v(C0481i.C0482a.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) this.f1680f.get();
            if (viewDataBinding != null) {
                viewDataBinding.mo2138b();
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$a */
    static class C0353a implements C0361i {
        C0353a() {
        }

        /* renamed from: a */
        public C0366n mo2144a(ViewDataBinding viewDataBinding, int i) {
            return new C0368p(viewDataBinding, i).mo2169a();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$b */
    static class C0354b implements C0361i {
        C0354b() {
        }

        /* renamed from: a */
        public C0366n mo2144a(ViewDataBinding viewDataBinding, int i) {
            return new C0365m(viewDataBinding, i).mo2158a();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$c */
    static class C0355c implements C0361i {
        C0355c() {
        }

        /* renamed from: a */
        public C0366n mo2144a(ViewDataBinding viewDataBinding, int i) {
            return new C0367o(viewDataBinding, i).mo2166a();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$d */
    static class C0356d implements C0361i {
        C0356d() {
        }

        /* renamed from: a */
        public C0366n mo2144a(ViewDataBinding viewDataBinding, int i) {
            return new C0363k(viewDataBinding, i).mo2151a();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$e */
    static class C0357e extends C0370b.C0371a<C0383k, ViewDataBinding, Void> {
        C0357e() {
        }

        /* renamed from: a */
        public void mo2146a(C0383k kVar, ViewDataBinding viewDataBinding, int i, Void voidR) {
            if (i != 1) {
                if (i == 2) {
                    kVar.mo2189b(viewDataBinding);
                } else if (i == 3) {
                    kVar.mo2188a(viewDataBinding);
                }
            } else if (!kVar.mo2190c(viewDataBinding)) {
                boolean unused = viewDataBinding.f1668d = true;
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$f */
    static class C0358f implements View.OnAttachStateChangeListener {
        C0358f() {
        }

        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.m1768b(view).f1666b.run();
            view.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$g */
    class C0359g implements Runnable {
        C0359g() {
        }

        public void run() {
            synchronized (this) {
                boolean unused = ViewDataBinding.this.f1667c = false;
            }
            ViewDataBinding.m1776j();
            if (Build.VERSION.SDK_INT < 19 || ViewDataBinding.this.f1670f.isAttachedToWindow()) {
                ViewDataBinding.this.mo2138b();
                return;
            }
            ViewDataBinding.this.f1670f.removeOnAttachStateChangeListener(ViewDataBinding.f1665u);
            ViewDataBinding.this.f1670f.addOnAttachStateChangeListener(ViewDataBinding.f1665u);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$h */
    class C0360h implements Choreographer.FrameCallback {
        C0360h() {
        }

        public void doFrame(long j) {
            ViewDataBinding.this.f1666b.run();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$i */
    private interface C0361i {
        /* renamed from: a */
        C0366n mo2144a(ViewDataBinding viewDataBinding, int i);
    }

    /* renamed from: androidx.databinding.ViewDataBinding$j */
    protected static class C0362j {

        /* renamed from: a */
        public final String[][] f1683a;

        /* renamed from: b */
        public final int[][] f1684b;

        /* renamed from: c */
        public final int[][] f1685c;
    }

    /* renamed from: androidx.databinding.ViewDataBinding$k */
    private static class C0363k implements C0498u, C0364l<LiveData<?>> {

        /* renamed from: a */
        final C0366n<LiveData<?>> f1686a;

        /* renamed from: b */
        C0490o f1687b;

        public C0363k(ViewDataBinding viewDataBinding, int i) {
            this.f1686a = new C0366n<>(viewDataBinding, i, this);
        }

        /* renamed from: a */
        public C0366n<LiveData<?>> mo2151a() {
            return this.f1686a;
        }

        /* renamed from: a */
        public void mo2156b(LiveData<?> liveData) {
            C0490o oVar = this.f1687b;
            if (oVar != null) {
                liveData.observe(oVar, this);
            }
        }

        /* renamed from: a */
        public void mo2153a(C0490o oVar) {
            LiveData b = this.f1686a.mo2164b();
            if (b != null) {
                if (this.f1687b != null) {
                    b.removeObserver(this);
                }
                if (oVar != null) {
                    b.observe(oVar, this);
                }
            }
            this.f1687b = oVar;
        }

        /* renamed from: a */
        public void mo2154a(Object obj) {
            ViewDataBinding a = this.f1686a.mo2161a();
            if (a != null) {
                C0366n<LiveData<?>> nVar = this.f1686a;
                a.m1769b(nVar.f1690b, (Object) nVar.mo2164b(), 0);
            }
        }

        /* renamed from: b */
        public void mo2157c(LiveData<?> liveData) {
            liveData.removeObserver(this);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$l */
    private interface C0364l<T> {
        /* renamed from: a */
        void mo2153a(C0490o oVar);

        /* renamed from: b */
        void mo2156b(T t);

        /* renamed from: c */
        void mo2157c(T t);
    }

    /* renamed from: androidx.databinding.ViewDataBinding$m */
    private static class C0365m extends C0379i.C0380a implements C0364l<C0379i> {

        /* renamed from: a */
        final C0366n<C0379i> f1688a;

        public C0365m(ViewDataBinding viewDataBinding, int i) {
            this.f1688a = new C0366n<>(viewDataBinding, i, this);
        }

        /* renamed from: a */
        public C0366n<C0379i> mo2158a() {
            return this.f1688a;
        }

        /* renamed from: a */
        public void mo2156b(C0379i iVar) {
            iVar.mo2185b(this);
        }

        /* renamed from: a */
        public void mo2153a(C0490o oVar) {
        }

        /* renamed from: b */
        public void mo2157c(C0379i iVar) {
            iVar.mo2184a(this);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$n */
    private static class C0366n<T> extends WeakReference<ViewDataBinding> {

        /* renamed from: a */
        private final C0364l<T> f1689a;

        /* renamed from: b */
        protected final int f1690b;

        /* renamed from: c */
        private T f1691c;

        public C0366n(ViewDataBinding viewDataBinding, int i, C0364l<T> lVar) {
            super(viewDataBinding, ViewDataBinding.f1664t);
            this.f1690b = i;
            this.f1689a = lVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ViewDataBinding mo2161a() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) get();
            if (viewDataBinding == null) {
                mo2165c();
            }
            return viewDataBinding;
        }

        /* renamed from: a */
        public void mo2162a(C0490o oVar) {
            this.f1689a.mo2153a(oVar);
        }

        /* renamed from: a */
        public void mo2163a(T t) {
            mo2165c();
            this.f1691c = t;
            T t2 = this.f1691c;
            if (t2 != null) {
                this.f1689a.mo2156b(t2);
            }
        }

        /* renamed from: b */
        public T mo2164b() {
            return this.f1691c;
        }

        /* renamed from: c */
        public boolean mo2165c() {
            boolean z;
            T t = this.f1691c;
            if (t != null) {
                this.f1689a.mo2157c(t);
                z = true;
            } else {
                z = false;
            }
            this.f1691c = null;
            return z;
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$o */
    private static class C0367o extends C0381j.C0382a implements C0364l<C0381j> {

        /* renamed from: a */
        final C0366n<C0381j> f1692a;

        public C0367o(ViewDataBinding viewDataBinding, int i) {
            this.f1692a = new C0366n<>(viewDataBinding, i, this);
        }

        /* renamed from: a */
        public C0366n<C0381j> mo2166a() {
            return this.f1692a;
        }

        /* renamed from: a */
        public void mo2156b(C0381j jVar) {
            jVar.mo2186a(this);
        }

        /* renamed from: a */
        public void mo2153a(C0490o oVar) {
        }

        /* renamed from: b */
        public void mo2157c(C0381j jVar) {
            jVar.mo2187b(this);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$p */
    private static class C0368p extends C0377h.C0378a implements C0364l<C0377h> {

        /* renamed from: a */
        final C0366n<C0377h> f1693a;

        public C0368p(ViewDataBinding viewDataBinding, int i) {
            this.f1693a = new C0366n<>(viewDataBinding, i, this);
        }

        /* renamed from: a */
        public C0366n<C0377h> mo2169a() {
            return this.f1693a;
        }

        /* renamed from: a */
        public void mo2156b(C0377h hVar) {
            hVar.mo2174a(this);
        }

        /* renamed from: a */
        public void mo2171a(C0377h hVar, int i) {
            ViewDataBinding a = this.f1693a.mo2161a();
            if (a != null && this.f1693a.mo2164b() == hVar) {
                a.m1769b(this.f1693a.f1690b, (Object) hVar, i);
            }
        }

        /* renamed from: a */
        public void mo2153a(C0490o oVar) {
        }

        /* renamed from: b */
        public void mo2157c(C0377h hVar) {
            hVar.mo2175b(this);
        }
    }

    static {
        new C0353a();
        new C0354b();
        new C0355c();
        new C0357e();
    }

    protected ViewDataBinding(C0374e eVar, View view, int i) {
        this.f1666b = new C0359g();
        this.f1667c = false;
        this.f1668d = false;
        this.f1669e = new C0366n[i];
        this.f1670f = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (f1662r) {
            this.f1673i = Choreographer.getInstance();
            this.f1674j = new C0360h();
        } else {
            this.f1674j = null;
            this.f1675k = new Handler(Looper.myLooper());
        }
    }

    protected ViewDataBinding(Object obj, View view, int i) {
        this(m1759a(obj), view, i);
    }

    /* renamed from: a */
    private static int m1756a(ViewGroup viewGroup, int i) {
        String str = (String) viewGroup.getChildAt(i).getTag();
        String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i2 = i + 1; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i;
                }
                if (m1764a(str2, length)) {
                    i = i2;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    protected static int m1757a(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: a */
    private static int m1758a(String str, int i, C0362j jVar, int i2) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = jVar.f1683a[i2];
        int length = strArr.length;
        while (i < length) {
            if (TextUtils.equals(subSequence, strArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    private static C0374e m1759a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof C0374e) {
            return (C0374e) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010e A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m1762a(androidx.databinding.C0374e r16, android.view.View r17, java.lang.Object[] r18, androidx.databinding.ViewDataBinding.C0362j r19, android.util.SparseIntArray r20, boolean r21) {
        /*
            r6 = r16
            r0 = r17
            r7 = r19
            r8 = r20
            androidx.databinding.ViewDataBinding r1 = m1768b((android.view.View) r17)
            if (r1 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.Object r1 = r17.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x001a
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            java.lang.String r9 = "layout"
            r2 = -1
            r11 = 1
            if (r21 == 0) goto L_0x004c
            if (r1 == 0) goto L_0x004c
            boolean r3 = r1.startsWith(r9)
            if (r3 == 0) goto L_0x004c
            r3 = 95
            int r3 = r1.lastIndexOf(r3)
            if (r3 <= 0) goto L_0x0048
            int r3 = r3 + r11
            boolean r4 = m1764a((java.lang.String) r1, (int) r3)
            if (r4 == 0) goto L_0x0048
            int r1 = m1766b((java.lang.String) r1, (int) r3)
            r3 = r18[r1]
            if (r3 != 0) goto L_0x0042
            r18[r1] = r0
        L_0x0042:
            if (r7 != 0) goto L_0x0045
            r1 = -1
        L_0x0045:
            r3 = r1
            r1 = 1
            goto L_0x004a
        L_0x0048:
            r1 = 0
            r3 = -1
        L_0x004a:
            r12 = r3
            goto L_0x006a
        L_0x004c:
            if (r1 == 0) goto L_0x0068
            java.lang.String r3 = "binding_"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x0068
            int r3 = f1661q
            int r1 = m1766b((java.lang.String) r1, (int) r3)
            r3 = r18[r1]
            if (r3 != 0) goto L_0x0062
            r18[r1] = r0
        L_0x0062:
            if (r7 != 0) goto L_0x0065
            r1 = -1
        L_0x0065:
            r12 = r1
            r1 = 1
            goto L_0x006a
        L_0x0068:
            r1 = 0
            r12 = -1
        L_0x006a:
            if (r1 != 0) goto L_0x0080
            int r1 = r17.getId()
            if (r1 <= 0) goto L_0x0080
            if (r8 == 0) goto L_0x0080
            int r1 = r8.get(r1, r2)
            if (r1 < 0) goto L_0x0080
            r2 = r18[r1]
            if (r2 != 0) goto L_0x0080
            r18[r1] = r0
        L_0x0080:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0116
            r13 = r0
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            int r14 = r13.getChildCount()
            r0 = 0
            r1 = 0
        L_0x008d:
            if (r0 >= r14) goto L_0x0116
            android.view.View r2 = r13.getChildAt(r0)
            if (r12 < 0) goto L_0x00fc
            java.lang.Object r3 = r2.getTag()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L_0x00fc
            java.lang.Object r3 = r2.getTag()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "_0"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x00fc
            boolean r4 = r3.startsWith(r9)
            if (r4 == 0) goto L_0x00fc
            r4 = 47
            int r4 = r3.indexOf(r4)
            if (r4 <= 0) goto L_0x00fc
            int r3 = m1758a((java.lang.String) r3, (int) r1, (androidx.databinding.ViewDataBinding.C0362j) r7, (int) r12)
            if (r3 < 0) goto L_0x00fc
            int r1 = r3 + 1
            int[][] r4 = r7.f1684b
            r4 = r4[r12]
            r4 = r4[r3]
            int[][] r5 = r7.f1685c
            r5 = r5[r12]
            r3 = r5[r3]
            int r5 = m1756a((android.view.ViewGroup) r13, (int) r0)
            if (r5 != r0) goto L_0x00dc
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.C0375f.m1848a((androidx.databinding.C0374e) r6, (android.view.View) r2, (int) r3)
            r18[r4] = r3
            r10 = r0
            r15 = r1
            goto L_0x00ff
        L_0x00dc:
            int r5 = r5 - r0
            int r5 = r5 + r11
            android.view.View[] r15 = new android.view.View[r5]
            r10 = 0
        L_0x00e1:
            if (r10 >= r5) goto L_0x00ef
            int r11 = r0 + r10
            android.view.View r11 = r13.getChildAt(r11)
            r15[r10] = r11
            int r10 = r10 + 1
            r11 = 1
            goto L_0x00e1
        L_0x00ef:
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.C0375f.m1850a((androidx.databinding.C0374e) r6, (android.view.View[]) r15, (int) r3)
            r18[r4] = r3
            int r5 = r5 + -1
            int r0 = r0 + r5
            r10 = r0
            r15 = r1
            r11 = 1
            goto L_0x00ff
        L_0x00fc:
            r10 = r0
            r15 = r1
            r11 = 0
        L_0x00ff:
            if (r11 != 0) goto L_0x010e
            r5 = 0
            r0 = r16
            r1 = r2
            r2 = r18
            r3 = r19
            r4 = r20
            m1762a(r0, r1, r2, r3, r4, r5)
        L_0x010e:
            r0 = 1
            int r1 = r10 + 1
            r0 = r1
            r1 = r15
            r11 = 1
            goto L_0x008d
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.m1762a(androidx.databinding.e, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$j, android.util.SparseIntArray, boolean):void");
    }

    /* renamed from: a */
    private static boolean m1764a(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: a */
    protected static Object[] m1765a(C0374e eVar, View view, int i, C0362j jVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        m1762a(eVar, view, objArr, jVar, sparseIntArray, true);
        return objArr;
    }

    /* renamed from: b */
    private static int m1766b(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            i2 = (i2 * 10) + (str.charAt(i) - '0');
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    static ViewDataBinding m1768b(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(C0387a.dataBinding);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1769b(int i, Object obj, int i2) {
        if (!this.f1679o && mo2137a(i, obj, i2)) {
            mo2142e();
        }
    }

    /* renamed from: b */
    private boolean m1770b(int i, Object obj, C0361i iVar) {
        if (obj == null) {
            return mo2139b(i);
        }
        C0366n nVar = this.f1669e[i];
        if (nVar == null) {
            mo2133a(i, obj, iVar);
            return true;
        } else if (nVar.mo2164b() == obj) {
            return false;
        } else {
            mo2139b(i);
            mo2133a(i, obj, iVar);
            return true;
        }
    }

    /* renamed from: i */
    private void mo6459i() {
        if (this.f1672h) {
            mo2142e();
        } else if (mo2141d()) {
            this.f1672h = true;
            this.f1668d = false;
            C0370b<C0383k, ViewDataBinding, Void> bVar = this.f1671g;
            if (bVar != null) {
                bVar.mo2177a(this, 1, null);
                if (this.f1668d) {
                    this.f1671g.mo2177a(this, 2, null);
                }
            }
            if (!this.f1668d) {
                mo2132a();
                C0370b<C0383k, ViewDataBinding, Void> bVar2 = this.f1671g;
                if (bVar2 != null) {
                    bVar2.mo2177a(this, 3, null);
                }
            }
            this.f1672h = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static void m1776j() {
        while (true) {
            Reference<? extends ViewDataBinding> poll = f1664t.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof C0366n) {
                ((C0366n) poll).mo2165c();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2132a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2133a(int i, Object obj, C0361i iVar) {
        if (obj != null) {
            C0366n nVar = this.f1669e[i];
            if (nVar == null) {
                nVar = iVar.mo2144a(this, i);
                this.f1669e[i] = nVar;
                C0490o oVar = this.f1677m;
                if (oVar != null) {
                    nVar.mo2162a(oVar);
                }
            }
            nVar.mo2163a(obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2134a(View view) {
        view.setTag(C0387a.dataBinding, this);
    }

    /* renamed from: a */
    public void mo2135a(C0490o oVar) {
        C0490o oVar2 = this.f1677m;
        if (oVar2 != oVar) {
            if (oVar2 != null) {
                oVar2.mo5a().mo2702b(this.f1678n);
            }
            this.f1677m = oVar;
            if (oVar != null) {
                if (this.f1678n == null) {
                    this.f1678n = new OnStartListener(this, (C0353a) null);
                }
                oVar.mo5a().mo2701a(this.f1678n);
            }
            for (C0366n nVar : this.f1669e) {
                if (nVar != null) {
                    nVar.mo2162a(oVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo2136a(int i, LiveData<?> liveData) {
        this.f1679o = true;
        try {
            return m1770b(i, (Object) liveData, f1663s);
        } finally {
            this.f1679o = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo2137a(int i, Object obj, int i2);

    /* renamed from: b */
    public void mo2138b() {
        ViewDataBinding viewDataBinding = this.f1676l;
        if (viewDataBinding == null) {
            mo6459i();
        } else {
            viewDataBinding.mo2138b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo2139b(int i) {
        C0366n nVar = this.f1669e[i];
        if (nVar != null) {
            return nVar.mo2165c();
        }
        return false;
    }

    /* renamed from: c */
    public View mo2140c() {
        return this.f1670f;
    }

    /* renamed from: d */
    public abstract boolean mo2141d();

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (f1662r == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r2.f1673i.postFrameCallback(r2.f1674j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r2.f1675k.post(r2.f1666b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2142e() {
        /*
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.f1676l
            if (r0 == 0) goto L_0x0008
            r0.mo2142e()
            goto L_0x003b
        L_0x0008:
            androidx.lifecycle.o r0 = r2.f1677m
            if (r0 == 0) goto L_0x001d
            androidx.lifecycle.i r0 = r0.mo5a()
            androidx.lifecycle.i$b r0 = r0.mo2700a()
            androidx.lifecycle.i$b r1 = androidx.lifecycle.C0481i.C0483b.STARTED
            boolean r0 = r0.mo2703a(r1)
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            monitor-enter(r2)
            boolean r0 = r2.f1667c     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0024
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            return
        L_0x0024:
            r0 = 1
            r2.f1667c = r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            boolean r0 = f1662r
            if (r0 == 0) goto L_0x0034
            android.view.Choreographer r0 = r2.f1673i
            android.view.Choreographer$FrameCallback r1 = r2.f1674j
            r0.postFrameCallback(r1)
            goto L_0x003b
        L_0x0034:
            android.os.Handler r0 = r2.f1675k
            java.lang.Runnable r1 = r2.f1666b
            r0.post(r1)
        L_0x003b:
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.mo2142e():void");
    }
}
