package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.lifecycle.C0481i;

/* renamed from: androidx.fragment.app.r */
class C0437r {

    /* renamed from: a */
    private final C0409k f1923a;

    /* renamed from: b */
    private final Fragment f1924b;

    C0437r(C0409k kVar, Fragment fragment) {
        this.f1923a = kVar;
        this.f1924b = fragment;
    }

    C0437r(C0409k kVar, Fragment fragment, C0435q qVar) {
        this.f1923a = kVar;
        this.f1924b = fragment;
        Fragment fragment2 = this.f1924b;
        fragment2.f1736h = null;
        fragment2.f1750v = 0;
        fragment2.f1747s = false;
        fragment2.f1744p = false;
        Fragment fragment3 = fragment2.f1740l;
        fragment2.f1741m = fragment3 != null ? fragment3.f1738j : null;
        Fragment fragment4 = this.f1924b;
        fragment4.f1740l = null;
        Bundle bundle = qVar.f1922r;
        fragment4.f1735g = bundle == null ? new Bundle() : bundle;
    }

    C0437r(C0409k kVar, ClassLoader classLoader, C0406h hVar, C0435q qVar) {
        this.f1923a = kVar;
        this.f1924b = hVar.mo2430a(classLoader, qVar.f1910f);
        Bundle bundle = qVar.f1919o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        this.f1924b.mo2290m(qVar.f1919o);
        Fragment fragment = this.f1924b;
        fragment.f1738j = qVar.f1911g;
        fragment.f1746r = qVar.f1912h;
        fragment.f1748t = true;
        fragment.f1708A = qVar.f1913i;
        fragment.f1709B = qVar.f1914j;
        fragment.f1710C = qVar.f1915k;
        fragment.f1713F = qVar.f1916l;
        fragment.f1745q = qVar.f1917m;
        fragment.f1712E = qVar.f1918n;
        fragment.f1711D = qVar.f1920p;
        fragment.f1728U = C0481i.C0483b.values()[qVar.f1921q];
        Bundle bundle2 = qVar.f1922r;
        if (bundle2 != null) {
            this.f1924b.f1735g = bundle2;
        } else {
            this.f1924b.f1735g = new Bundle();
        }
        if (C0411l.f1831F) {
            Log.v("FragmentManager", "Instantiated fragment " + this.f1924b);
        }
    }

    /* renamed from: d */
    private Bundle m2281d() {
        Bundle bundle = new Bundle();
        this.f1924b.mo2284j(bundle);
        this.f1923a.mo2445d(this.f1924b, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f1924b.f1719L != null) {
            mo2589c();
        }
        if (this.f1924b.f1736h != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f1924b.f1736h);
        }
        if (!this.f1924b.f1721N) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f1924b.f1721N);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Fragment mo2586a() {
        return this.f1924b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2587a(ClassLoader classLoader) {
        Bundle bundle = this.f1924b.f1735g;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f1924b;
            fragment.f1736h = fragment.f1735g.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f1924b;
            fragment2.f1741m = fragment2.f1735g.getString("android:target_state");
            Fragment fragment3 = this.f1924b;
            if (fragment3.f1741m != null) {
                fragment3.f1742n = fragment3.f1735g.getInt("android:target_req_state", 0);
            }
            Fragment fragment4 = this.f1924b;
            Boolean bool = fragment4.f1737i;
            if (bool != null) {
                fragment4.f1721N = bool.booleanValue();
                this.f1924b.f1737i = null;
                return;
            }
            fragment4.f1721N = fragment4.f1735g.getBoolean("android:user_visible_hint", true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0435q mo2588b() {
        C0435q qVar = new C0435q(this.f1924b);
        if (this.f1924b.f1734f <= 0 || qVar.f1922r != null) {
            qVar.f1922r = this.f1924b.f1735g;
        } else {
            qVar.f1922r = m2281d();
            if (this.f1924b.f1741m != null) {
                if (qVar.f1922r == null) {
                    qVar.f1922r = new Bundle();
                }
                qVar.f1922r.putString("android:target_state", this.f1924b.f1741m);
                int i = this.f1924b.f1742n;
                if (i != 0) {
                    qVar.f1922r.putInt("android:target_req_state", i);
                }
            }
        }
        return qVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2589c() {
        if (this.f1924b.f1719L != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f1924b.f1719L.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f1924b.f1736h = sparseArray;
            }
        }
    }
}
