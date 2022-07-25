package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0481i;
import androidx.viewpager.widget.C0649a;

/* renamed from: androidx.fragment.app.p */
public abstract class C0434p extends C0649a {

    /* renamed from: b */
    private final C0411l f1906b;

    /* renamed from: c */
    private final int f1907c;

    /* renamed from: d */
    private C0438s f1908d = null;

    /* renamed from: e */
    private Fragment f1909e = null;

    public C0434p(C0411l lVar, int i) {
        this.f1906b = lVar;
        this.f1907c = i;
    }

    /* renamed from: a */
    private static String m2270a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    /* renamed from: a */
    public Object mo2571a(ViewGroup viewGroup, int i) {
        if (this.f1908d == null) {
            this.f1908d = this.f1906b.mo2475b();
        }
        long c = mo2580c(i);
        Fragment b = this.f1906b.mo2474b(m2270a(viewGroup.getId(), c));
        if (b != null) {
            this.f1908d.mo2593a(b);
        } else {
            b = mo2577b(i);
            this.f1908d.mo2592a(viewGroup.getId(), b, m2270a(viewGroup.getId(), c));
        }
        if (b != this.f1909e) {
            b.mo2278h(false);
            if (this.f1907c == 1) {
                this.f1908d.mo2325a(b, C0481i.C0483b.STARTED);
            } else {
                b.mo2282i(false);
            }
        }
        return b;
    }

    /* renamed from: a */
    public void mo2572a(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: a */
    public void mo2573a(ViewGroup viewGroup) {
        C0438s sVar = this.f1908d;
        if (sVar != null) {
            try {
                sVar.mo2338c();
            } catch (IllegalStateException unused) {
                this.f1908d.mo2332b();
            }
            this.f1908d = null;
        }
    }

    /* renamed from: a */
    public void mo2574a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f1908d == null) {
            this.f1908d = this.f1906b.mo2475b();
        }
        this.f1908d.mo2334b(fragment);
        if (fragment == this.f1909e) {
            this.f1909e = null;
        }
    }

    /* renamed from: a */
    public boolean mo2575a(View view, Object obj) {
        return ((Fragment) obj).mo2213T() == view;
    }

    /* renamed from: b */
    public Parcelable mo2576b() {
        return null;
    }

    /* renamed from: b */
    public abstract Fragment mo2577b(int i);

    /* renamed from: b */
    public void mo2578b(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    /* renamed from: b */
    public void mo2579b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f1909e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.mo2278h(false);
                if (this.f1907c == 1) {
                    if (this.f1908d == null) {
                        this.f1908d = this.f1906b.mo2475b();
                    }
                    this.f1908d.mo2325a(this.f1909e, C0481i.C0483b.STARTED);
                } else {
                    this.f1909e.mo2282i(false);
                }
            }
            fragment.mo2278h(true);
            if (this.f1907c == 1) {
                if (this.f1908d == null) {
                    this.f1908d = this.f1906b.mo2475b();
                }
                this.f1908d.mo2325a(fragment, C0481i.C0483b.RESUMED);
            } else {
                fragment.mo2282i(true);
            }
            this.f1909e = fragment;
        }
    }

    /* renamed from: c */
    public long mo2580c(int i) {
        return (long) i;
    }
}
