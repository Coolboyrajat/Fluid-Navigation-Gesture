package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.C0306m;
import androidx.lifecycle.C0474c0;
import androidx.lifecycle.C0476d0;
import androidx.lifecycle.C0480h;
import androidx.lifecycle.C0481i;
import androidx.lifecycle.C0488m;
import androidx.lifecycle.C0489n;
import androidx.lifecycle.C0490o;
import androidx.lifecycle.C0491p;
import androidx.lifecycle.C0497t;
import androidx.savedstate.C0628a;
import androidx.savedstate.C0629b;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import p006b.p026g.p034j.C0830a;
import p006b.p026g.p035k.C0874f;
import p006b.p046l.p047a.C0934a;
import p190io.objectbox.model.PropertyFlags;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, C0490o, C0476d0, C0480h, C0629b {

    /* renamed from: a0 */
    static final Object f1707a0 = new Object();

    /* renamed from: A */
    int f1708A;

    /* renamed from: B */
    int f1709B;

    /* renamed from: C */
    String f1710C;

    /* renamed from: D */
    boolean f1711D;

    /* renamed from: E */
    boolean f1712E;

    /* renamed from: F */
    boolean f1713F;

    /* renamed from: G */
    boolean f1714G;

    /* renamed from: H */
    boolean f1715H;

    /* renamed from: I */
    boolean f1716I = true;

    /* renamed from: J */
    private boolean f1717J;

    /* renamed from: K */
    ViewGroup f1718K;

    /* renamed from: L */
    View f1719L;

    /* renamed from: M */
    boolean f1720M;

    /* renamed from: N */
    boolean f1721N = true;

    /* renamed from: O */
    C0393d f1722O;

    /* renamed from: P */
    boolean f1723P;

    /* renamed from: Q */
    boolean f1724Q;

    /* renamed from: R */
    float f1725R;

    /* renamed from: S */
    LayoutInflater f1726S;

    /* renamed from: T */
    boolean f1727T;

    /* renamed from: U */
    C0481i.C0483b f1728U;

    /* renamed from: V */
    C0491p f1729V;

    /* renamed from: W */
    C0457w f1730W;

    /* renamed from: X */
    C0497t<C0490o> f1731X;

    /* renamed from: Y */
    C0628a f1732Y;

    /* renamed from: Z */
    private int f1733Z;

    /* renamed from: f */
    int f1734f = 0;

    /* renamed from: g */
    Bundle f1735g;

    /* renamed from: h */
    SparseArray<Parcelable> f1736h;

    /* renamed from: i */
    Boolean f1737i;

    /* renamed from: j */
    String f1738j = UUID.randomUUID().toString();

    /* renamed from: k */
    Bundle f1739k;

    /* renamed from: l */
    Fragment f1740l;

    /* renamed from: m */
    String f1741m = null;

    /* renamed from: n */
    int f1742n;

    /* renamed from: o */
    private Boolean f1743o = null;

    /* renamed from: p */
    boolean f1744p;

    /* renamed from: q */
    boolean f1745q;

    /* renamed from: r */
    boolean f1746r;

    /* renamed from: s */
    boolean f1747s;

    /* renamed from: t */
    boolean f1748t;

    /* renamed from: u */
    boolean f1749u;

    /* renamed from: v */
    int f1750v;

    /* renamed from: w */
    C0411l f1751w;

    /* renamed from: x */
    C0407i<?> f1752x;

    /* renamed from: y */
    C0411l f1753y = new C0429m();

    /* renamed from: z */
    Fragment f1754z;

    /* renamed from: androidx.fragment.app.Fragment$a */
    class C0390a implements Runnable {
        C0390a() {
        }

        public void run() {
            Fragment.this.mo2195B0();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    class C0391b implements Runnable {
        C0391b() {
        }

        public void run() {
            Fragment.this.mo2301t();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    class C0392c extends C0403e {
        C0392c() {
        }

        /* renamed from: a */
        public View mo2318a(int i) {
            View view = Fragment.this.f1719L;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        /* renamed from: b */
        public boolean mo2319b() {
            return Fragment.this.f1719L != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    static class C0393d {

        /* renamed from: a */
        View f1759a;

        /* renamed from: b */
        Animator f1760b;

        /* renamed from: c */
        int f1761c;

        /* renamed from: d */
        int f1762d;

        /* renamed from: e */
        int f1763e;

        /* renamed from: f */
        Object f1764f = null;

        /* renamed from: g */
        Object f1765g;

        /* renamed from: h */
        Object f1766h;

        /* renamed from: i */
        Object f1767i;

        /* renamed from: j */
        Object f1768j;

        /* renamed from: k */
        Object f1769k;

        /* renamed from: l */
        Boolean f1770l;

        /* renamed from: m */
        Boolean f1771m;

        /* renamed from: n */
        C0306m f1772n;

        /* renamed from: o */
        C0306m f1773o;

        /* renamed from: p */
        boolean f1774p;

        /* renamed from: q */
        C0395f f1775q;

        /* renamed from: r */
        boolean f1776r;

        C0393d() {
            Object obj = Fragment.f1707a0;
            this.f1765g = obj;
            this.f1766h = null;
            this.f1767i = obj;
            this.f1768j = null;
            this.f1769k = obj;
            this.f1772n = null;
            this.f1773o = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    public static class C0394e extends RuntimeException {
        public C0394e(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    interface C0395f {
        /* renamed from: a */
        void mo2320a();

        /* renamed from: b */
        void mo2321b();
    }

    public Fragment() {
        new C0390a();
        this.f1728U = C0481i.C0483b.RESUMED;
        this.f1731X = new C0497t<>();
        mo6873D0();
    }

    /* renamed from: C0 */
    private C0393d mo2351C0() {
        if (this.f1722O == null) {
            this.f1722O = new C0393d();
        }
        return this.f1722O;
    }

    /* renamed from: D0 */
    private void mo6873D0() {
        this.f1729V = new C0491p(this);
        this.f1732Y = C0628a.m3541a((C0629b) this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1729V.mo2701a((C0489n) new C0488m() {
                /* renamed from: a */
                public void mo14a(C0490o oVar, C0481i.C0482a aVar) {
                    View view;
                    if (aVar == C0481i.C0482a.ON_STOP && (view = Fragment.this.f1719L) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
    }

    @Deprecated
    /* renamed from: a */
    public static Fragment m1874a(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C0406h.m2096d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mo2290m(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new C0394e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0394e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C0394e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C0394e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* renamed from: A */
    public final C0411l mo2192A() {
        if (this.f1752x != null) {
            return this.f1753y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: A0 */
    public final View mo2193A0() {
        View T = mo2213T();
        if (T != null) {
            return T;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: B */
    public Context mo2194B() {
        C0407i<?> iVar = this.f1752x;
        if (iVar == null) {
            return null;
        }
        return iVar.mo2432d();
    }

    /* renamed from: B0 */
    public void mo2195B0() {
        C0411l lVar = this.f1751w;
        if (lVar == null || lVar.f1851o == null) {
            mo2351C0().f1774p = false;
        } else if (Looper.myLooper() != this.f1751w.f1851o.mo2433e().getLooper()) {
            this.f1751w.f1851o.mo2433e().postAtFrontOfQueue(new C0391b());
        } else {
            mo2301t();
        }
    }

    /* renamed from: C */
    public Object mo2196C() {
        C0393d dVar = this.f1722O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1764f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public C0306m mo2197D() {
        C0393d dVar = this.f1722O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1772n;
    }

    /* renamed from: E */
    public Object mo2198E() {
        C0393d dVar = this.f1722O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1766h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public C0306m mo2199F() {
        C0393d dVar = this.f1722O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1773o;
    }

    /* renamed from: G */
    public final C0411l mo2200G() {
        return this.f1751w;
    }

    /* renamed from: H */
    public final Object mo2201H() {
        C0407i<?> iVar = this.f1752x;
        if (iVar == null) {
            return null;
        }
        return iVar.mo2386g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public int mo2202I() {
        C0393d dVar = this.f1722O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1762d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public int mo2203J() {
        C0393d dVar = this.f1722O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1763e;
    }

    /* renamed from: K */
    public final Fragment mo2204K() {
        return this.f1754z;
    }

    /* renamed from: L */
    public Object mo2205L() {
        C0393d dVar = this.f1722O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f1767i;
        return obj == f1707a0 ? mo2198E() : obj;
    }

    /* renamed from: M */
    public final Resources mo2206M() {
        return mo2313y0().getResources();
    }

    /* renamed from: N */
    public final boolean mo2207N() {
        return this.f1713F;
    }

    /* renamed from: O */
    public Object mo2208O() {
        C0393d dVar = this.f1722O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f1765g;
        return obj == f1707a0 ? mo2196C() : obj;
    }

    /* renamed from: P */
    public Object mo2209P() {
        C0393d dVar = this.f1722O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1768j;
    }

    /* renamed from: Q */
    public Object mo2210Q() {
        C0393d dVar = this.f1722O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f1769k;
        return obj == f1707a0 ? mo2209P() : obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public int mo2211R() {
        C0393d dVar = this.f1722O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1761c;
    }

    /* renamed from: S */
    public final Fragment mo2212S() {
        String str;
        Fragment fragment = this.f1740l;
        if (fragment != null) {
            return fragment;
        }
        C0411l lVar = this.f1751w;
        if (lVar == null || (str = this.f1741m) == null) {
            return null;
        }
        return lVar.mo2454a(str);
    }

    /* renamed from: T */
    public View mo2213T() {
        return this.f1719L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo2214U() {
        mo6873D0();
        this.f1738j = UUID.randomUUID().toString();
        this.f1744p = false;
        this.f1745q = false;
        this.f1746r = false;
        this.f1747s = false;
        this.f1748t = false;
        this.f1750v = 0;
        this.f1751w = null;
        this.f1753y = new C0429m();
        this.f1752x = null;
        this.f1708A = 0;
        this.f1709B = 0;
        this.f1710C = null;
        this.f1711D = false;
        this.f1712E = false;
    }

    /* renamed from: V */
    public final boolean mo2215V() {
        return this.f1752x != null && this.f1744p;
    }

    /* renamed from: W */
    public final boolean mo2216W() {
        return this.f1712E;
    }

    /* renamed from: X */
    public final boolean mo2217X() {
        return this.f1711D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public boolean mo2218Y() {
        C0393d dVar = this.f1722O;
        if (dVar == null) {
            return false;
        }
        return dVar.f1776r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public final boolean mo2219Z() {
        return this.f1750v > 0;
    }

    @Deprecated
    /* renamed from: a */
    public LayoutInflater mo2220a(Bundle bundle) {
        C0407i<?> iVar = this.f1752x;
        if (iVar != null) {
            LayoutInflater i = iVar.mo2387i();
            C0874f.m4687b(i, this.f1753y.mo2514r());
            return i;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: a */
    public View mo2221a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f1733Z;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* renamed from: a */
    public Animation mo2222a(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Fragment mo2223a(String str) {
        return str.equals(this.f1738j) ? this : this.f1753y.mo2483c(str);
    }

    /* renamed from: a */
    public C0481i mo5a() {
        return this.f1729V;
    }

    /* renamed from: a */
    public final String mo2224a(int i) {
        return mo2206M().getString(i);
    }

    /* renamed from: a */
    public final String mo2225a(int i, Object... objArr) {
        return mo2206M().getString(i, objArr);
    }

    /* renamed from: a */
    public void mo2226a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo2227a(int i, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2228a(Animator animator) {
        mo2351C0().f1760b = animator;
    }

    @Deprecated
    /* renamed from: a */
    public void mo2229a(Activity activity) {
        this.f1717J = true;
    }

    @Deprecated
    /* renamed from: a */
    public void mo2230a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f1717J = true;
    }

    /* renamed from: a */
    public void mo2231a(Context context) {
        this.f1717J = true;
        C0407i<?> iVar = this.f1752x;
        Activity c = iVar == null ? null : iVar.mo2431c();
        if (c != null) {
            this.f1717J = false;
            mo2229a(c);
        }
    }

    /* renamed from: a */
    public void mo2232a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f1717J = true;
        C0407i<?> iVar = this.f1752x;
        Activity c = iVar == null ? null : iVar.mo2431c();
        if (c != null) {
            this.f1717J = false;
            mo2230a(c, attributeSet, bundle);
        }
    }

    /* renamed from: a */
    public void mo2233a(@SuppressLint({"UnknownNullness"}) Intent intent) {
        mo2234a(intent, (Bundle) null);
    }

    /* renamed from: a */
    public void mo2234a(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        C0407i<?> iVar = this.f1752x;
        if (iVar != null) {
            iVar.mo2383a(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2235a(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f1753y.mo2457a(configuration);
    }

    /* renamed from: a */
    public void mo2236a(Menu menu) {
    }

    /* renamed from: a */
    public void mo2237a(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2238a(View view) {
        mo2351C0().f1759a = view;
    }

    /* renamed from: a */
    public void mo2239a(View view, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2240a(C0395f fVar) {
        mo2351C0();
        C0395f fVar2 = this.f1722O.f1775q;
        if (fVar != fVar2) {
            if (fVar == null || fVar2 == null) {
                C0393d dVar = this.f1722O;
                if (dVar.f1774p) {
                    dVar.f1775q = fVar;
                }
                if (fVar != null) {
                    fVar.mo2321b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    /* renamed from: a */
    public void mo2241a(Fragment fragment) {
    }

    /* renamed from: a */
    public void mo2242a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f1708A));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f1709B));
        printWriter.print(" mTag=");
        printWriter.println(this.f1710C);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1734f);
        printWriter.print(" mWho=");
        printWriter.print(this.f1738j);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f1750v);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1744p);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f1745q);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f1746r);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f1747s);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f1711D);
        printWriter.print(" mDetached=");
        printWriter.print(this.f1712E);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f1716I);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f1715H);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f1713F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f1721N);
        if (this.f1751w != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f1751w);
        }
        if (this.f1752x != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f1752x);
        }
        if (this.f1754z != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f1754z);
        }
        if (this.f1739k != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1739k);
        }
        if (this.f1735g != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1735g);
        }
        if (this.f1736h != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1736h);
        }
        Fragment S = mo2212S();
        if (S != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(S);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f1742n);
        }
        if (mo2202I() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(mo2202I());
        }
        if (this.f1718K != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f1718K);
        }
        if (this.f1719L != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f1719L);
        }
        if (mo2310x() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo2310x());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(mo2211R());
        }
        if (mo2194B() != null) {
            C0934a.m4996a(this).mo4785a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f1753y + ":");
        C0411l lVar = this.f1753y;
        lVar.mo2469a(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* renamed from: a */
    public void mo2243a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo2244a(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public boolean mo2245a0() {
        C0393d dVar = this.f1722O;
        if (dVar == null) {
            return false;
        }
        return dVar.f1774p;
    }

    /* renamed from: b */
    public Animator mo2246b(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2247b(int i) {
        if (this.f1722O != null || i != 0) {
            mo2351C0().f1762d = i;
        }
    }

    /* renamed from: b */
    public void mo2248b(Bundle bundle) {
        this.f1717J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2249b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1753y.mo2522y();
        this.f1749u = true;
        this.f1730W = new C0457w();
        this.f1719L = mo2221a(layoutInflater, viewGroup, bundle);
        if (this.f1719L != null) {
            this.f1730W.mo2646b();
            this.f1731X.setValue(this.f1730W);
        } else if (!this.f1730W.mo2647c()) {
            this.f1730W = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* renamed from: b */
    public void mo2250b(Menu menu) {
    }

    /* renamed from: b */
    public void mo2251b(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2252b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f1711D) {
            return false;
        }
        if (this.f1715H && this.f1716I) {
            z = true;
            mo2237a(menu, menuInflater);
        }
        return z | this.f1753y.mo2471a(menu, menuInflater);
    }

    /* renamed from: b */
    public boolean mo2253b(MenuItem menuItem) {
        return false;
    }

    /* renamed from: b0 */
    public final boolean mo2254b0() {
        return this.f1745q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2255c(int i) {
        if (this.f1722O != null || i != 0) {
            mo2351C0();
            this.f1722O.f1763e = i;
        }
    }

    /* renamed from: c */
    public void mo2256c(Bundle bundle) {
        this.f1717J = true;
        mo2286k(bundle);
        if (!this.f1753y.mo2480b(1)) {
            this.f1753y.mo2490e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2257c(Menu menu) {
        if (!this.f1711D) {
            if (this.f1715H && this.f1716I) {
                mo2236a(menu);
            }
            this.f1753y.mo2459a(menu);
        }
    }

    /* renamed from: c */
    public void mo2258c(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo2259c(MenuItem menuItem) {
        if (!this.f1711D) {
            return mo2244a(menuItem) || this.f1753y.mo2472a(menuItem);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final boolean mo2260c0() {
        Fragment K = mo2204K();
        return K != null && (K.mo2254b0() || K.mo2260c0());
    }

    /* renamed from: d */
    public LayoutInflater mo2261d(Bundle bundle) {
        return mo2220a(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2262d(int i) {
        mo2351C0().f1761c = i;
    }

    /* renamed from: d */
    public void mo2263d(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo2264d(Menu menu) {
        boolean z = false;
        if (this.f1711D) {
            return false;
        }
        if (this.f1715H && this.f1716I) {
            z = true;
            mo2250b(menu);
        }
        return z | this.f1753y.mo2481b(menu);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo2265d(MenuItem menuItem) {
        if (!this.f1711D) {
            return (this.f1715H && this.f1716I && mo2253b(menuItem)) || this.f1753y.mo2482b(menuItem);
        }
        return false;
    }

    /* renamed from: d0 */
    public final boolean mo2266d0() {
        C0411l lVar = this.f1751w;
        if (lVar == null) {
            return false;
        }
        return lVar.mo2521x();
    }

    /* renamed from: e */
    public void mo2267e(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2268e(boolean z) {
        mo2251b(z);
        this.f1753y.mo2470a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void mo2269e0() {
        this.f1753y.mo2522y();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public void mo2271f(Bundle bundle) {
        this.f1717J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2272f(boolean z) {
        mo2258c(z);
        this.f1753y.mo2479b(z);
    }

    /* renamed from: f0 */
    public void mo2273f0() {
        this.f1717J = true;
    }

    /* renamed from: g */
    public final SavedStateRegistry mo7g() {
        return this.f1732Y.mo3633a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2274g(Bundle bundle) {
        this.f1753y.mo2522y();
        this.f1734f = 2;
        this.f1717J = false;
        mo2248b(bundle);
        if (this.f1717J) {
            this.f1753y.mo2487d();
            return;
        }
        throw new C0458x("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2275g(boolean z) {
        mo2351C0().f1776r = z;
    }

    /* renamed from: g0 */
    public void mo2276g0() {
    }

    /* renamed from: h */
    public C0474c0 mo8h() {
        C0411l lVar = this.f1751w;
        if (lVar != null) {
            return lVar.mo2489e(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2277h(Bundle bundle) {
        this.f1753y.mo2522y();
        this.f1734f = 1;
        this.f1717J = false;
        this.f1732Y.mo3634a(bundle);
        mo2256c(bundle);
        this.f1727T = true;
        if (this.f1717J) {
            this.f1729V.mo2707a(C0481i.C0482a.ON_CREATE);
            return;
        }
        throw new C0458x("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* renamed from: h */
    public void mo2278h(boolean z) {
        if (this.f1716I != z) {
            this.f1716I = z;
            if (this.f1715H && mo2215V() && !mo2217X()) {
                this.f1752x.mo2388j();
            }
        }
    }

    /* renamed from: h0 */
    public void mo2279h0() {
        this.f1717J = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public LayoutInflater mo2281i(Bundle bundle) {
        this.f1726S = mo2261d(bundle);
        return this.f1726S;
    }

    @Deprecated
    /* renamed from: i */
    public void mo2282i(boolean z) {
        if (!this.f1721N && z && this.f1734f < 3 && this.f1751w != null && mo2215V() && this.f1727T) {
            this.f1751w.mo2502k(this);
        }
        this.f1721N = z;
        this.f1720M = this.f1734f < 3 && !z;
        if (this.f1735g != null) {
            this.f1737i = Boolean.valueOf(z);
        }
    }

    /* renamed from: i0 */
    public void mo2283i0() {
        this.f1717J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2284j(Bundle bundle) {
        mo2267e(bundle);
        this.f1732Y.mo3635b(bundle);
        Parcelable A = this.f1753y.mo2450A();
        if (A != null) {
            bundle.putParcelable("android:support:fragments", A);
        }
    }

    /* renamed from: j0 */
    public void mo2285j0() {
        this.f1717J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2286k(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1753y.mo2458a(parcelable);
            this.f1753y.mo2490e();
        }
    }

    /* renamed from: k0 */
    public void mo2287k0() {
        this.f1717J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo2288l(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f1736h;
        if (sparseArray != null) {
            this.f1719L.restoreHierarchyState(sparseArray);
            this.f1736h = null;
        }
        this.f1717J = false;
        mo2271f(bundle);
        if (!this.f1717J) {
            throw new C0458x("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f1719L != null) {
            this.f1730W.mo2645a(C0481i.C0482a.ON_CREATE);
        }
    }

    /* renamed from: l0 */
    public void mo2289l0() {
        this.f1717J = true;
    }

    /* renamed from: m */
    public void mo2290m(Bundle bundle) {
        if (this.f1751w == null || !mo2266d0()) {
            this.f1739k = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* renamed from: m0 */
    public void mo2291m0() {
        this.f1717J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void mo2292n0() {
        this.f1753y.mo2467a(this.f1752x, (C0403e) new C0392c(), this);
        this.f1717J = false;
        mo2231a(this.f1752x.mo2432d());
        if (!this.f1717J) {
            throw new C0458x("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void mo2293o0() {
        this.f1753y.mo2491f();
        this.f1729V.mo2707a(C0481i.C0482a.ON_DESTROY);
        this.f1734f = 0;
        this.f1717J = false;
        this.f1727T = false;
        mo2273f0();
        if (!this.f1717J) {
            throw new C0458x("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f1717J = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo2311x0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f1717J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void mo2297p0() {
        this.f1753y.mo2493g();
        if (this.f1719L != null) {
            this.f1730W.mo2645a(C0481i.C0482a.ON_DESTROY);
        }
        this.f1734f = 1;
        this.f1717J = false;
        mo2279h0();
        if (this.f1717J) {
            C0934a.m4996a(this).mo4784a();
            this.f1749u = false;
            return;
        }
        throw new C0458x("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo2298q0() {
        this.f1717J = false;
        mo2283i0();
        this.f1726S = null;
        if (!this.f1717J) {
            throw new C0458x("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.f1753y.mo2520w()) {
            this.f1753y.mo2491f();
            this.f1753y = new C0429m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public void mo2299r0() {
        onLowMemory();
        this.f1753y.mo2495h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public void mo2300s0() {
        this.f1753y.mo2497i();
        if (this.f1719L != null) {
            this.f1730W.mo2645a(C0481i.C0482a.ON_PAUSE);
        }
        this.f1729V.mo2707a(C0481i.C0482a.ON_PAUSE);
        this.f1734f = 3;
        this.f1717J = false;
        mo2285j0();
        if (!this.f1717J) {
            throw new C0458x("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo2301t() {
        C0393d dVar = this.f1722O;
        C0395f fVar = null;
        if (dVar != null) {
            dVar.f1774p = false;
            C0395f fVar2 = dVar.f1775q;
            dVar.f1775q = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.mo2320a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public void mo2302t0() {
        boolean g = this.f1751w.mo2494g(this);
        Boolean bool = this.f1743o;
        if (bool == null || bool.booleanValue() != g) {
            this.f1743o = Boolean.valueOf(g);
            mo2263d(g);
            this.f1753y.mo2499j();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(PropertyFlags.ID_SELF_ASSIGNABLE);
        C0830a.m4522a(this, sb);
        sb.append(" (");
        sb.append(this.f1738j);
        sb.append(")");
        if (this.f1708A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1708A));
        }
        if (this.f1710C != null) {
            sb.append(" ");
            sb.append(this.f1710C);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final C0401d mo2304u() {
        C0407i<?> iVar = this.f1752x;
        if (iVar == null) {
            return null;
        }
        return (C0401d) iVar.mo2431c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void mo2305u0() {
        this.f1753y.mo2522y();
        this.f1753y.mo2486c(true);
        this.f1734f = 4;
        this.f1717J = false;
        mo2287k0();
        if (this.f1717J) {
            this.f1729V.mo2707a(C0481i.C0482a.ON_RESUME);
            if (this.f1719L != null) {
                this.f1730W.mo2645a(C0481i.C0482a.ON_RESUME);
            }
            this.f1753y.mo2501k();
            return;
        }
        throw new C0458x("Fragment " + this + " did not call through to super.onResume()");
    }

    /* renamed from: v */
    public boolean mo2306v() {
        Boolean bool;
        C0393d dVar = this.f1722O;
        if (dVar == null || (bool = dVar.f1771m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void mo2307v0() {
        this.f1753y.mo2522y();
        this.f1753y.mo2486c(true);
        this.f1734f = 3;
        this.f1717J = false;
        mo2289l0();
        if (this.f1717J) {
            this.f1729V.mo2707a(C0481i.C0482a.ON_START);
            if (this.f1719L != null) {
                this.f1730W.mo2645a(C0481i.C0482a.ON_START);
            }
            this.f1753y.mo2503l();
            return;
        }
        throw new C0458x("Fragment " + this + " did not call through to super.onStart()");
    }

    /* renamed from: w */
    public boolean mo2308w() {
        Boolean bool;
        C0393d dVar = this.f1722O;
        if (dVar == null || (bool = dVar.f1770l) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void mo2309w0() {
        this.f1753y.mo2505m();
        if (this.f1719L != null) {
            this.f1730W.mo2645a(C0481i.C0482a.ON_STOP);
        }
        this.f1729V.mo2707a(C0481i.C0482a.ON_STOP);
        this.f1734f = 2;
        this.f1717J = false;
        mo2291m0();
        if (!this.f1717J) {
            throw new C0458x("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public View mo2310x() {
        C0393d dVar = this.f1722O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1759a;
    }

    /* renamed from: x0 */
    public final C0401d mo2311x0() {
        C0401d u = mo2304u();
        if (u != null) {
            return u;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public Animator mo2312y() {
        C0393d dVar = this.f1722O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1760b;
    }

    /* renamed from: y0 */
    public final Context mo2313y0() {
        Context B = mo2194B();
        if (B != null) {
            return B;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: z */
    public final Bundle mo2314z() {
        return this.f1739k;
    }

    /* renamed from: z0 */
    public final C0411l mo2315z0() {
        C0411l G = mo2200G();
        if (G != null) {
            return G;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }
}
