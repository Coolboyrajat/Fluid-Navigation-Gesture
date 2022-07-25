package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.activity.C0010b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0474c0;
import androidx.lifecycle.C0481i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p006b.p021d.C0725b;
import p006b.p026g.p034j.C0830a;
import p006b.p026g.p034j.C0831b;
import p006b.p026g.p035k.C0887s;
import p006b.p042j.C0927a;
import p006b.p042j.C0928b;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: androidx.fragment.app.l */
public abstract class C0411l {

    /* renamed from: F */
    static boolean f1831F;

    /* renamed from: A */
    private ArrayList<Boolean> f1832A;

    /* renamed from: B */
    private ArrayList<Fragment> f1833B;

    /* renamed from: C */
    private ArrayList<C0428p> f1834C;

    /* renamed from: D */
    private C0432o f1835D;

    /* renamed from: E */
    private Runnable f1836E = new C0414c();

    /* renamed from: a */
    private final ArrayList<C0426n> f1837a = new ArrayList<>();

    /* renamed from: b */
    private boolean f1838b;

    /* renamed from: c */
    final ArrayList<Fragment> f1839c = new ArrayList<>();

    /* renamed from: d */
    final HashMap<String, C0437r> f1840d = new HashMap<>();

    /* renamed from: e */
    ArrayList<C0396a> f1841e;

    /* renamed from: f */
    private ArrayList<Fragment> f1842f;

    /* renamed from: g */
    private final C0408j f1843g = new C0408j(this);

    /* renamed from: h */
    private OnBackPressedDispatcher f1844h;

    /* renamed from: i */
    private final C0010b f1845i = new C0412a(false);

    /* renamed from: j */
    private final AtomicInteger f1846j = new AtomicInteger();

    /* renamed from: k */
    private ArrayList<C0425m> f1847k;

    /* renamed from: l */
    private HashMap<Fragment, HashSet<C0423k>> f1848l = new HashMap<>();

    /* renamed from: m */
    private final C0409k f1849m = new C0409k(this);

    /* renamed from: n */
    int f1850n = 0;

    /* renamed from: o */
    C0407i<?> f1851o;

    /* renamed from: p */
    C0403e f1852p;

    /* renamed from: q */
    private Fragment f1853q;

    /* renamed from: r */
    Fragment f1854r;

    /* renamed from: s */
    private C0406h f1855s = null;

    /* renamed from: t */
    private C0406h f1856t = new C0413b();

    /* renamed from: u */
    private boolean f1857u;

    /* renamed from: v */
    private boolean f1858v;

    /* renamed from: w */
    private boolean f1859w;

    /* renamed from: x */
    private boolean f1860x;

    /* renamed from: y */
    private boolean f1861y;

    /* renamed from: z */
    private ArrayList<C0396a> f1862z;

    /* renamed from: androidx.fragment.app.l$a */
    class C0412a extends C0010b {
        C0412a(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public void mo20a() {
            C0411l.this.mo2519v();
        }
    }

    /* renamed from: androidx.fragment.app.l$b */
    class C0413b extends C0406h {
        C0413b() {
        }

        /* renamed from: a */
        public Fragment mo2430a(ClassLoader classLoader, String str) {
            C0407i<?> iVar = C0411l.this.f1851o;
            return iVar.mo2389a(iVar.mo2432d(), str, (Bundle) null);
        }
    }

    /* renamed from: androidx.fragment.app.l$c */
    class C0414c implements Runnable {
        C0414c() {
        }

        public void run() {
            C0411l.this.mo2486c(true);
        }
    }

    /* renamed from: androidx.fragment.app.l$d */
    class C0415d implements C0423k {

        /* renamed from: a */
        final /* synthetic */ Fragment f1866a;

        C0415d(C0411l lVar, Fragment fragment) {
            this.f1866a = fragment;
        }

        public void cancel() {
            if (this.f1866a.mo2310x() != null) {
                View x = this.f1866a.mo2310x();
                this.f1866a.mo2238a((View) null);
                x.clearAnimation();
            }
            this.f1866a.mo2228a((Animator) null);
        }
    }

    /* renamed from: androidx.fragment.app.l$e */
    class C0416e implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f1867a;

        /* renamed from: b */
        final /* synthetic */ Fragment f1868b;

        /* renamed from: c */
        final /* synthetic */ C0423k f1869c;

        /* renamed from: androidx.fragment.app.l$e$a */
        class C0417a implements Runnable {
            C0417a() {
            }

            public void run() {
                if (C0416e.this.f1868b.mo2310x() != null) {
                    C0416e.this.f1868b.mo2238a((View) null);
                    C0416e eVar = C0416e.this;
                    C0411l.this.mo2477b(eVar.f1868b, eVar.f1869c);
                }
            }
        }

        C0416e(ViewGroup viewGroup, Fragment fragment, C0423k kVar) {
            this.f1867a = viewGroup;
            this.f1868b = fragment;
            this.f1869c = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f1867a.post(new C0417a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.l$f */
    class C0418f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f1872a;

        /* renamed from: b */
        final /* synthetic */ View f1873b;

        /* renamed from: c */
        final /* synthetic */ Fragment f1874c;

        /* renamed from: d */
        final /* synthetic */ C0423k f1875d;

        C0418f(ViewGroup viewGroup, View view, Fragment fragment, C0423k kVar) {
            this.f1872a = viewGroup;
            this.f1873b = view;
            this.f1874c = fragment;
            this.f1875d = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1872a.endViewTransition(this.f1873b);
            Animator y = this.f1874c.mo2312y();
            this.f1874c.mo2228a((Animator) null);
            if (y != null && this.f1872a.indexOfChild(this.f1873b) < 0) {
                C0411l.this.mo2477b(this.f1874c, this.f1875d);
            }
        }
    }

    /* renamed from: androidx.fragment.app.l$g */
    class C0419g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f1877a;

        /* renamed from: b */
        final /* synthetic */ View f1878b;

        /* renamed from: c */
        final /* synthetic */ Fragment f1879c;

        C0419g(C0411l lVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1877a = viewGroup;
            this.f1878b = view;
            this.f1879c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1877a.endViewTransition(this.f1878b);
            animator.removeListener(this);
            Fragment fragment = this.f1879c;
            View view = fragment.f1719L;
            if (view != null && fragment.f1711D) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: androidx.fragment.app.l$h */
    private static class C0420h {

        /* renamed from: a */
        public final Animation f1880a;

        /* renamed from: b */
        public final Animator f1881b;

        C0420h(Animator animator) {
            this.f1880a = null;
            this.f1881b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C0420h(Animation animation) {
            this.f1880a = animation;
            this.f1881b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.l$i */
    public interface C0421i {
    }

    /* renamed from: androidx.fragment.app.l$j */
    private static class C0422j extends AnimationSet implements Runnable {

        /* renamed from: f */
        private final ViewGroup f1882f;

        /* renamed from: g */
        private final View f1883g;

        /* renamed from: h */
        private boolean f1884h;

        /* renamed from: i */
        private boolean f1885i;

        /* renamed from: j */
        private boolean f1886j = true;

        C0422j(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1882f = viewGroup;
            this.f1883g = view;
            addAnimation(animation);
            this.f1882f.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f1886j = true;
            if (this.f1884h) {
                return !this.f1885i;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f1884h = true;
                C0887s.m4728a(this.f1882f, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f1886j = true;
            if (this.f1884h) {
                return !this.f1885i;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f1884h = true;
                C0887s.m4728a(this.f1882f, this);
            }
            return true;
        }

        public void run() {
            if (this.f1884h || !this.f1886j) {
                this.f1882f.endViewTransition(this.f1883g);
                this.f1885i = true;
                return;
            }
            this.f1886j = false;
            this.f1882f.post(this);
        }
    }

    /* renamed from: androidx.fragment.app.l$k */
    interface C0423k {
        void cancel();
    }

    /* renamed from: androidx.fragment.app.l$l */
    public static abstract class C0424l {
        /* renamed from: a */
        public abstract void mo2535a(C0411l lVar, Fragment fragment);

        /* renamed from: a */
        public abstract void mo2536a(C0411l lVar, Fragment fragment, Context context);

        /* renamed from: a */
        public abstract void mo2537a(C0411l lVar, Fragment fragment, Bundle bundle);

        /* renamed from: a */
        public abstract void mo2538a(C0411l lVar, Fragment fragment, View view, Bundle bundle);

        /* renamed from: b */
        public abstract void mo2539b(C0411l lVar, Fragment fragment);

        /* renamed from: b */
        public abstract void mo2540b(C0411l lVar, Fragment fragment, Context context);

        /* renamed from: b */
        public abstract void mo2541b(C0411l lVar, Fragment fragment, Bundle bundle);

        /* renamed from: c */
        public abstract void mo2542c(C0411l lVar, Fragment fragment);

        /* renamed from: c */
        public abstract void mo2543c(C0411l lVar, Fragment fragment, Bundle bundle);

        /* renamed from: d */
        public abstract void mo2544d(C0411l lVar, Fragment fragment);

        /* renamed from: d */
        public abstract void mo2545d(C0411l lVar, Fragment fragment, Bundle bundle);

        /* renamed from: e */
        public abstract void mo2546e(C0411l lVar, Fragment fragment);

        /* renamed from: f */
        public abstract void mo2547f(C0411l lVar, Fragment fragment);

        /* renamed from: g */
        public abstract void mo2548g(C0411l lVar, Fragment fragment);
    }

    /* renamed from: androidx.fragment.app.l$m */
    public interface C0425m {
        /* renamed from: a */
        void mo2549a();
    }

    /* renamed from: androidx.fragment.app.l$n */
    interface C0426n {
        /* renamed from: a */
        boolean mo2331a(ArrayList<C0396a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.l$o */
    private class C0427o implements C0426n {

        /* renamed from: a */
        final String f1887a;

        /* renamed from: b */
        final int f1888b;

        /* renamed from: c */
        final int f1889c;

        C0427o(String str, int i, int i2) {
            this.f1887a = str;
            this.f1888b = i;
            this.f1889c = i2;
        }

        /* renamed from: a */
        public boolean mo2331a(ArrayList<C0396a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = C0411l.this.f1854r;
            if (fragment != null && this.f1888b < 0 && this.f1887a == null && fragment.mo2192A().mo2523z()) {
                return false;
            }
            return C0411l.this.mo2473a(arrayList, arrayList2, this.f1887a, this.f1888b, this.f1889c);
        }
    }

    /* renamed from: androidx.fragment.app.l$p */
    static class C0428p implements Fragment.C0395f {

        /* renamed from: a */
        final boolean f1891a;

        /* renamed from: b */
        final C0396a f1892b;

        /* renamed from: c */
        private int f1893c;

        C0428p(C0396a aVar, boolean z) {
            this.f1891a = z;
            this.f1892b = aVar;
        }

        /* renamed from: a */
        public void mo2320a() {
            this.f1893c--;
            if (this.f1893c == 0) {
                this.f1892b.f1777q.mo2451B();
            }
        }

        /* renamed from: b */
        public void mo2321b() {
            this.f1893c++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2550c() {
            C0396a aVar = this.f1892b;
            aVar.f1777q.mo2466a(aVar, this.f1891a, false, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2551d() {
            boolean z = this.f1893c > 0;
            C0411l lVar = this.f1892b.f1777q;
            int size = lVar.f1839c.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = lVar.f1839c.get(i);
                fragment.mo2240a((Fragment.C0395f) null);
                if (z && fragment.mo2245a0()) {
                    fragment.mo2195B0();
                }
            }
            C0396a aVar = this.f1892b;
            aVar.f1777q.mo2466a(aVar, this.f1891a, !z, true);
        }

        /* renamed from: e */
        public boolean mo2552e() {
            return this.f1893c == 0;
        }
    }

    /* renamed from: A */
    private void m2124A(Fragment fragment) {
        ViewGroup x = m2158x(fragment);
        if (x != null) {
            if (x.getTag(C0928b.visible_removing_fragment_view_tag) == null) {
                x.setTag(C0928b.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) x.getTag(C0928b.visible_removing_fragment_view_tag)).mo2247b(fragment.mo2202I());
        }
    }

    /* renamed from: C */
    private void m2125C() {
        this.f1840d.values().removeAll(Collections.singleton((Object) null));
    }

    /* renamed from: D */
    private void m2126D() {
        if (mo2521x()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: E */
    private void m2127E() {
        this.f1838b = false;
        this.f1832A.clear();
        this.f1862z.clear();
    }

    /* renamed from: F */
    private void m2128F() {
        if (this.f1861y) {
            this.f1861y = false;
            m2132J();
        }
    }

    /* renamed from: G */
    private void m2129G() {
        for (C0437r next : this.f1840d.values()) {
            if (next != null) {
                Fragment a = next.mo2586a();
                if (this.f1848l.get(a) != null) {
                    m2151q(a);
                    mo2461a(a, a.mo2211R());
                }
            }
        }
    }

    /* renamed from: H */
    private void m2130H() {
        if (this.f1834C != null) {
            while (!this.f1834C.isEmpty()) {
                this.f1834C.remove(0).mo2551d();
            }
        }
    }

    /* renamed from: I */
    private void m2131I() {
        if (this.f1847k != null) {
            for (int i = 0; i < this.f1847k.size(); i++) {
                this.f1847k.get(i).mo2549a();
            }
        }
    }

    /* renamed from: J */
    private void m2132J() {
        for (C0437r next : this.f1840d.values()) {
            if (next != null) {
                mo2502k(next.mo2586a());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (mo2509o() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (mo2494g(r3.f1853q) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.mo22a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f1845i;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2133K() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.l$n> r0 = r3.f1837a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.l$n> r1 = r3.f1837a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.b r1 = r3.f1845i     // Catch:{ all -> 0x002a }
            r1.mo22a((boolean) r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.b r0 = r3.f1845i
            int r1 = r3.mo2509o()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f1853q
            boolean r1 = r3.mo2494g(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.mo22a((boolean) r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0411l.m2133K():void");
    }

    /* renamed from: a */
    private int m2134a(ArrayList<C0396a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0725b<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0396a aVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (aVar.mo2343g() && !aVar.mo2330a(arrayList, i4 + 1, i2)) {
                if (this.f1834C == null) {
                    this.f1834C = new ArrayList<>();
                }
                C0428p pVar = new C0428p(aVar, booleanValue);
                this.f1834C.add(pVar);
                aVar.mo2327a((Fragment.C0395f) pVar);
                if (booleanValue) {
                    aVar.mo2341e();
                } else {
                    aVar.mo2336b(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                m2137a(bVar);
            }
        }
        return i3;
    }

    /* renamed from: a */
    static Fragment m2135a(View view) {
        Object tag = view.getTag(C0928b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: a */
    private void m2136a(Fragment fragment, C0420h hVar) {
        View view = fragment.f1719L;
        ViewGroup viewGroup = fragment.f1718K;
        viewGroup.startViewTransition(view);
        C0415d dVar = new C0415d(this, fragment);
        mo2462a(fragment, (C0423k) dVar);
        Animation animation = hVar.f1880a;
        if (animation != null) {
            C0422j jVar = new C0422j(animation, viewGroup, view);
            fragment.mo2238a(fragment.f1719L);
            jVar.setAnimationListener(new C0416e(viewGroup, fragment, dVar));
            fragment.f1719L.startAnimation(jVar);
            return;
        }
        Animator animator = hVar.f1881b;
        fragment.mo2228a(animator);
        animator.addListener(new C0418f(viewGroup, view, fragment, dVar));
        animator.setTarget(fragment.f1719L);
        animator.start();
    }

    /* renamed from: a */
    private void m2137a(C0725b<Fragment> bVar) {
        int i = this.f1850n;
        if (i >= 1) {
            int min = Math.min(i, 3);
            int size = this.f1839c.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.f1839c.get(i2);
                if (fragment.f1734f < min) {
                    mo2461a(fragment, min);
                    if (fragment.f1719L != null && !fragment.f1711D && fragment.f1723P) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m2138a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0831b("FragmentManager"));
        C0407i<?> iVar = this.f1851o;
        if (iVar != null) {
            try {
                iVar.mo2384a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            mo2469a("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* renamed from: a */
    private void m2139a(ArrayList<C0396a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0428p> arrayList3 = this.f1834C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0428p pVar = this.f1834C.get(i);
            if (arrayList == null || pVar.f1891a || (indexOf2 = arrayList.indexOf(pVar.f1892b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (pVar.mo2552e() || (arrayList != null && pVar.f1892b.mo2330a(arrayList, 0, arrayList.size()))) {
                    this.f1834C.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || pVar.f1891a || (indexOf = arrayList.indexOf(pVar.f1892b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        pVar.mo2551d();
                    }
                }
                i++;
            } else {
                this.f1834C.remove(i);
                i--;
                size--;
            }
            pVar.mo2550c();
            i++;
        }
    }

    /* renamed from: a */
    private static void m2140a(ArrayList<C0396a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0396a aVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                aVar.mo2335b(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.mo2336b(z);
            } else {
                aVar.mo2335b(1);
                aVar.mo2341e();
            }
            i++;
        }
    }

    /* renamed from: a */
    private boolean m2141a(String str, int i, int i2) {
        mo2486c(false);
        m2150d(true);
        Fragment fragment = this.f1854r;
        if (fragment != null && i < 0 && str == null && fragment.mo2192A().mo2523z()) {
            return true;
        }
        boolean a = mo2473a(this.f1862z, this.f1832A, str, i, i2);
        if (a) {
            this.f1838b = true;
            try {
                m2148c(this.f1862z, this.f1832A);
            } finally {
                m2127E();
            }
        }
        m2133K();
        m2128F();
        m2125C();
        return a;
    }

    /* renamed from: b */
    private static int m2142b(int i, boolean z) {
        if (i == 4097) {
            return z ? C0927a.fragment_open_enter : C0927a.fragment_open_exit;
        }
        if (i == 4099) {
            return z ? C0927a.fragment_fade_enter : C0927a.fragment_fade_exit;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? C0927a.fragment_close_enter : C0927a.fragment_close_exit;
    }

    /* renamed from: b */
    private C0420h m2143b(Fragment fragment, boolean z) {
        int b;
        int J = fragment.mo2203J();
        int I = fragment.mo2202I();
        boolean z2 = false;
        fragment.mo2247b(0);
        View a = this.f1852p.mo2318a(fragment.f1709B);
        if (!(a == null || a.getTag(C0928b.visible_removing_fragment_view_tag) == null)) {
            a.setTag(C0928b.visible_removing_fragment_view_tag, (Object) null);
        }
        ViewGroup viewGroup = fragment.f1718K;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation a2 = fragment.mo2222a(J, z, I);
        if (a2 != null) {
            return new C0420h(a2);
        }
        Animator b2 = fragment.mo2246b(J, z, I);
        if (b2 != null) {
            return new C0420h(b2);
        }
        if (I != 0) {
            boolean equals = "anim".equals(this.f1851o.mo2432d().getResources().getResourceTypeName(I));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f1851o.mo2432d(), I);
                    if (loadAnimation != null) {
                        return new C0420h(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f1851o.mo2432d(), I);
                    if (loadAnimator != null) {
                        return new C0420h(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f1851o.mo2432d(), I);
                        if (loadAnimation2 != null) {
                            return new C0420h(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (J != 0 && (b = m2142b(J, z)) >= 0) {
            return new C0420h(AnimationUtils.loadAnimation(this.f1851o.mo2432d(), b));
        }
        return null;
    }

    /* renamed from: b */
    private void m2144b(C0725b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment c = bVar.mo4089c(i);
            if (!c.f1744p) {
                View A0 = c.mo2193A0();
                c.f1725R = A0.getAlpha();
                A0.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: b */
    private void m2145b(ArrayList<C0396a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<C0396a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = arrayList3.get(i4).f1939o;
        ArrayList<Fragment> arrayList5 = this.f1833B;
        if (arrayList5 == null) {
            this.f1833B = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f1833B.addAll(this.f1839c);
        Fragment u = mo2518u();
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0396a aVar = arrayList3.get(i6);
            u = !arrayList4.get(i6).booleanValue() ? aVar.mo2324a(this.f1833B, u) : aVar.mo2333b(this.f1833B, u);
            z2 = z2 || aVar.f1931g;
        }
        this.f1833B.clear();
        if (!z) {
            C0440t.m2319a(this, arrayList, arrayList2, i, i2, false);
        }
        m2140a(arrayList, arrayList2, i, i2);
        if (z) {
            C0725b bVar = new C0725b();
            m2137a((C0725b<Fragment>) bVar);
            int a = m2134a(arrayList, arrayList2, i, i2, (C0725b<Fragment>) bVar);
            m2144b((C0725b<Fragment>) bVar);
            i3 = a;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            C0440t.m2319a(this, arrayList, arrayList2, i, i3, true);
            mo2456a(this.f1850n, true);
        }
        while (i4 < i5) {
            C0396a aVar2 = arrayList3.get(i4);
            if (arrayList4.get(i4).booleanValue() && aVar2.f1779s >= 0) {
                aVar2.f1779s = -1;
            }
            aVar2.mo2344h();
            i4++;
        }
        if (z2) {
            m2131I();
        }
    }

    /* renamed from: b */
    private boolean m2146b(ArrayList<C0396a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f1837a) {
            if (this.f1837a.isEmpty()) {
                return false;
            }
            int size = this.f1837a.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f1837a.get(i).mo2331a(arrayList, arrayList2);
            }
            this.f1837a.clear();
            this.f1851o.mo2433e().removeCallbacks(this.f1836E);
            return z;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private void m2147c(int i) {
        try {
            this.f1838b = true;
            mo2456a(i, false);
            this.f1838b = false;
            mo2486c(true);
        } catch (Throwable th) {
            this.f1838b = false;
            throw th;
        }
    }

    /* renamed from: c */
    private void m2148c(ArrayList<C0396a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m2139a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!arrayList.get(i).f1939o) {
                    if (i2 != i) {
                        m2145b(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (arrayList2.get(i).booleanValue()) {
                        while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f1939o) {
                            i2++;
                        }
                    }
                    m2145b(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m2145b(arrayList, arrayList2, i2, size);
            }
        }
    }

    /* renamed from: d */
    static int m2149d(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: d */
    private void m2150d(boolean z) {
        if (this.f1838b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f1851o == null) {
            if (this.f1860x) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f1851o.mo2433e().getLooper()) {
            if (!z) {
                m2126D();
            }
            if (this.f1862z == null) {
                this.f1862z = new ArrayList<>();
                this.f1832A = new ArrayList<>();
            }
            this.f1838b = true;
            try {
                m2139a((ArrayList<C0396a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f1838b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: q */
    private void m2151q(Fragment fragment) {
        HashSet hashSet = this.f1848l.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0423k kVar = (C0423k) it.next();
                kVar.cancel();
                hashSet.remove(kVar);
                if (hashSet.isEmpty()) {
                    m2153s(fragment);
                    this.f1848l.remove(fragment);
                }
            }
        }
    }

    /* renamed from: r */
    private void m2152r(Fragment fragment) {
        Animator animator;
        if (fragment.f1719L != null) {
            C0420h b = m2143b(fragment, !fragment.f1711D);
            if (b == null || (animator = b.f1881b) == null) {
                if (b != null) {
                    fragment.f1719L.startAnimation(b.f1880a);
                    b.f1880a.start();
                }
                fragment.f1719L.setVisibility((!fragment.f1711D || fragment.mo2218Y()) ? 0 : 8);
                if (fragment.mo2218Y()) {
                    fragment.mo2275g(false);
                }
            } else {
                animator.setTarget(fragment.f1719L);
                if (!fragment.f1711D) {
                    fragment.f1719L.setVisibility(0);
                } else if (fragment.mo2218Y()) {
                    fragment.mo2275g(false);
                } else {
                    ViewGroup viewGroup = fragment.f1718K;
                    View view = fragment.f1719L;
                    viewGroup.startViewTransition(view);
                    b.f1881b.addListener(new C0419g(this, viewGroup, view, fragment));
                }
                b.f1881b.start();
            }
        }
        if (fragment.f1744p && m2159y(fragment)) {
            this.f1857u = true;
        }
        fragment.f1724Q = false;
        fragment.mo2243a(fragment.f1711D);
    }

    /* renamed from: s */
    private void m2153s(Fragment fragment) {
        fragment.mo2297p0();
        this.f1849m.mo2449g(fragment, false);
        fragment.f1718K = null;
        fragment.f1719L = null;
        fragment.f1730W = null;
        fragment.f1731X.setValue(null);
        fragment.f1747s = false;
    }

    /* renamed from: t */
    private void m2154t(Fragment fragment) {
        if (fragment != null && mo2454a(fragment.f1738j) == fragment) {
            fragment.mo2302t0();
        }
    }

    /* renamed from: u */
    private void m2155u(Fragment fragment) {
        if (fragment.f1746r && !fragment.f1749u) {
            fragment.mo2249b(fragment.mo2281i(fragment.f1735g), (ViewGroup) null, fragment.f1735g);
            View view = fragment.f1719L;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                if (fragment.f1711D) {
                    fragment.f1719L.setVisibility(8);
                }
                fragment.mo2239a(fragment.f1719L, fragment.f1735g);
                this.f1849m.mo2438a(fragment, fragment.f1719L, fragment.f1735g, false);
            }
        }
    }

    /* renamed from: v */
    private Fragment m2156v(Fragment fragment) {
        ViewGroup viewGroup = fragment.f1718K;
        View view = fragment.f1719L;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f1839c.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f1839c.get(indexOf);
                if (fragment2.f1718K == viewGroup && fragment2.f1719L != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: w */
    private C0432o m2157w(Fragment fragment) {
        return this.f1835D.mo2560c(fragment);
    }

    /* renamed from: x */
    private ViewGroup m2158x(Fragment fragment) {
        if (this.f1852p.mo2319b()) {
            return (ViewGroup) this.f1852p.mo2318a(fragment.f1709B);
        }
        return null;
    }

    /* renamed from: y */
    private boolean m2159y(Fragment fragment) {
        return (fragment.f1715H && fragment.f1716I) || fragment.f1753y.mo2485c();
    }

    /* renamed from: z */
    private void m2160z(Fragment fragment) {
        if (mo2454a(fragment.f1738j) != null) {
            if (f1831F) {
                Log.v("FragmentManager", "Removed fragment from active set " + fragment);
            }
            for (C0437r next : this.f1840d.values()) {
                if (next != null) {
                    Fragment a = next.mo2586a();
                    if (fragment.f1738j.equals(a.f1741m)) {
                        a.f1740l = fragment;
                        a.f1741m = null;
                    }
                }
            }
            this.f1840d.put(fragment.f1738j, (Object) null);
            mo2506m(fragment);
            String str = fragment.f1741m;
            if (str != null) {
                fragment.f1740l = mo2454a(str);
            }
            fragment.mo2214U();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public Parcelable mo2450A() {
        ArrayList<String> arrayList;
        int size;
        m2130H();
        m2129G();
        mo2486c(true);
        this.f1858v = true;
        C0397b[] bVarArr = null;
        if (this.f1840d.isEmpty()) {
            return null;
        }
        ArrayList<C0435q> arrayList2 = new ArrayList<>(this.f1840d.size());
        boolean z = false;
        for (C0437r next : this.f1840d.values()) {
            if (next != null) {
                Fragment a = next.mo2586a();
                if (a.f1751w == this) {
                    C0435q b = next.mo2588b();
                    arrayList2.add(b);
                    if (f1831F) {
                        Log.v("FragmentManager", "Saved state of " + a + ": " + b.f1922r);
                    }
                    z = true;
                } else {
                    m2138a((RuntimeException) new IllegalStateException("Failure saving state: active " + a + " was removed from the FragmentManager"));
                    throw null;
                }
            }
        }
        if (!z) {
            if (f1831F) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.f1839c.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it = this.f1839c.iterator();
            while (it.hasNext()) {
                Fragment next2 = it.next();
                arrayList.add(next2.f1738j);
                if (next2.f1751w != this) {
                    m2138a((RuntimeException) new IllegalStateException("Failure saving state: active " + next2 + " was removed from the FragmentManager"));
                    throw null;
                } else if (f1831F) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next2.f1738j + "): " + next2);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<C0396a> arrayList3 = this.f1841e;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new C0397b[size];
            for (int i = 0; i < size; i++) {
                bVarArr[i] = new C0397b(this.f1841e.get(i));
                if (f1831F) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f1841e.get(i));
                }
            }
        }
        C0430n nVar = new C0430n();
        nVar.f1894f = arrayList2;
        nVar.f1895g = arrayList;
        nVar.f1896h = bVarArr;
        nVar.f1897i = this.f1846j.get();
        Fragment fragment = this.f1854r;
        if (fragment != null) {
            nVar.f1898j = fragment.f1738j;
        }
        return nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo2451B() {
        synchronized (this.f1837a) {
            boolean z = false;
            boolean z2 = this.f1834C != null && !this.f1834C.isEmpty();
            if (this.f1837a.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f1851o.mo2433e().removeCallbacks(this.f1836E);
                this.f1851o.mo2433e().post(this.f1836E);
                m2133K();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo2452a() {
        return this.f1846j.getAndIncrement();
    }

    /* renamed from: a */
    public Fragment mo2453a(int i) {
        for (int size = this.f1839c.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1839c.get(size);
            if (fragment != null && fragment.f1708A == i) {
                return fragment;
            }
        }
        for (C0437r next : this.f1840d.values()) {
            if (next != null) {
                Fragment a = next.mo2586a();
                if (a.f1708A == i) {
                    return a;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Fragment mo2454a(String str) {
        C0437r rVar = this.f1840d.get(str);
        if (rVar != null) {
            return rVar.mo2586a();
        }
        return null;
    }

    /* renamed from: a */
    public void mo2455a(int i, int i2) {
        if (i >= 0) {
            mo2468a((C0426n) new C0427o((String) null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2456a(int i, boolean z) {
        C0407i<?> iVar;
        if (this.f1851o == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f1850n) {
            this.f1850n = i;
            int size = this.f1839c.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo2498i(this.f1839c.get(i2));
            }
            for (C0437r next : this.f1840d.values()) {
                if (next != null) {
                    Fragment a = next.mo2586a();
                    if ((a.f1745q || a.f1712E) && !a.f1723P) {
                        mo2498i(a);
                    }
                }
            }
            m2132J();
            if (this.f1857u && (iVar = this.f1851o) != null && this.f1850n == 4) {
                iVar.mo2388j();
                this.f1857u = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2457a(Configuration configuration) {
        for (int i = 0; i < this.f1839c.size(); i++) {
            Fragment fragment = this.f1839c.get(i);
            if (fragment != null) {
                fragment.mo2235a(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2458a(Parcelable parcelable) {
        C0437r rVar;
        if (parcelable != null) {
            C0430n nVar = (C0430n) parcelable;
            if (nVar.f1894f != null) {
                this.f1840d.clear();
                Iterator<C0435q> it = nVar.f1894f.iterator();
                while (it.hasNext()) {
                    C0435q next = it.next();
                    if (next != null) {
                        Fragment a = this.f1835D.mo2557a(next.f1911g);
                        if (a != null) {
                            if (f1831F) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + a);
                            }
                            rVar = new C0437r(this.f1849m, a, next);
                        } else {
                            rVar = new C0437r(this.f1849m, this.f1851o.mo2432d().getClassLoader(), mo2511p(), next);
                        }
                        Fragment a2 = rVar.mo2586a();
                        a2.f1751w = this;
                        if (f1831F) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + a2.f1738j + "): " + a2);
                        }
                        this.f1840d.put(a2.f1738j, rVar);
                    }
                }
                for (Fragment next2 : this.f1835D.mo2566g()) {
                    if (!this.f1840d.containsKey(next2.f1738j)) {
                        if (f1831F) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next2 + " that was not found in the set of active Fragments " + nVar.f1894f);
                        }
                        mo2461a(next2, 1);
                        next2.f1745q = true;
                        mo2461a(next2, 0);
                    }
                }
                this.f1839c.clear();
                ArrayList<String> arrayList = nVar.f1895g;
                if (arrayList != null) {
                    Iterator<String> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        String next3 = it2.next();
                        Fragment a3 = mo2454a(next3);
                        if (a3 != null) {
                            a3.f1744p = true;
                            if (f1831F) {
                                Log.v("FragmentManager", "restoreSaveState: added (" + next3 + "): " + a3);
                            }
                            if (!this.f1839c.contains(a3)) {
                                synchronized (this.f1839c) {
                                    this.f1839c.add(a3);
                                }
                            } else {
                                throw new IllegalStateException("Already added " + a3);
                            }
                        } else {
                            m2138a((RuntimeException) new IllegalStateException("No instantiated fragment for (" + next3 + ")"));
                            throw null;
                        }
                    }
                }
                C0397b[] bVarArr = nVar.f1896h;
                if (bVarArr != null) {
                    this.f1841e = new ArrayList<>(bVarArr.length);
                    int i = 0;
                    while (true) {
                        C0397b[] bVarArr2 = nVar.f1896h;
                        if (i >= bVarArr2.length) {
                            break;
                        }
                        C0396a a4 = bVarArr2[i].mo2346a(this);
                        if (f1831F) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + a4.f1779s + "): " + a4);
                            PrintWriter printWriter = new PrintWriter(new C0831b("FragmentManager"));
                            a4.mo2329a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f1841e.add(a4);
                        i++;
                    }
                } else {
                    this.f1841e = null;
                }
                this.f1846j.set(nVar.f1897i);
                String str = nVar.f1898j;
                if (str != null) {
                    this.f1854r = mo2454a(str);
                    m2154t(this.f1854r);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2459a(Menu menu) {
        if (this.f1850n >= 1) {
            for (int i = 0; i < this.f1839c.size(); i++) {
                Fragment fragment = this.f1839c.get(i);
                if (fragment != null) {
                    fragment.mo2257c(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2460a(Fragment fragment) {
        if (f1831F) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        mo2496h(fragment);
        if (fragment.f1712E) {
            return;
        }
        if (!this.f1839c.contains(fragment)) {
            synchronized (this.f1839c) {
                this.f1839c.add(fragment);
            }
            fragment.f1744p = true;
            fragment.f1745q = false;
            if (fragment.f1719L == null) {
                fragment.f1724Q = false;
            }
            if (m2159y(fragment)) {
                this.f1857u = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: int} */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006e, code lost:
        if (r2 != 3) goto L_0x0436;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2461a(androidx.fragment.app.Fragment r12, int r13) {
        /*
            r11 = this;
            boolean r0 = r12.f1744p
            r1 = 1
            if (r0 == 0) goto L_0x0009
            boolean r0 = r12.f1712E
            if (r0 == 0) goto L_0x000c
        L_0x0009:
            if (r13 <= r1) goto L_0x000c
            r13 = 1
        L_0x000c:
            java.util.HashMap<java.lang.String, androidx.fragment.app.r> r0 = r11.f1840d
            java.lang.String r2 = r12.f1738j
            java.lang.Object r0 = r0.get(r2)
            androidx.fragment.app.r r0 = (androidx.fragment.app.C0437r) r0
            boolean r2 = r12.f1745q
            r3 = 0
            if (r2 == 0) goto L_0x0027
            boolean r2 = r12.mo2219Z()
            if (r2 == 0) goto L_0x0026
            int r13 = java.lang.Math.min(r13, r1)
            goto L_0x0027
        L_0x0026:
            r13 = 0
        L_0x0027:
            boolean r2 = r12.f1720M
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L_0x0034
            int r2 = r12.f1734f
            if (r2 >= r4) goto L_0x0034
            if (r13 <= r5) goto L_0x0034
            r13 = 2
        L_0x0034:
            androidx.lifecycle.i$b r2 = r12.f1728U
            androidx.lifecycle.i$b r6 = androidx.lifecycle.C0481i.C0483b.CREATED
            if (r2 != r6) goto L_0x003f
            int r13 = java.lang.Math.min(r13, r1)
            goto L_0x0047
        L_0x003f:
            int r2 = r2.ordinal()
            int r13 = java.lang.Math.min(r13, r2)
        L_0x0047:
            int r2 = r12.f1734f
            java.lang.String r6 = "FragmentManager"
            r7 = 0
            if (r2 > r13) goto L_0x02b5
            boolean r2 = r12.f1746r
            if (r2 == 0) goto L_0x0057
            boolean r2 = r12.f1747s
            if (r2 != 0) goto L_0x0057
            return
        L_0x0057:
            int r2 = r12.f1734f
            if (r2 >= r13) goto L_0x0066
            java.util.HashMap<androidx.fragment.app.Fragment, java.util.HashSet<androidx.fragment.app.l$k>> r2 = r11.f1848l
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0066
            r11.m2151q(r12)
        L_0x0066:
            int r2 = r12.f1734f
            if (r2 == 0) goto L_0x0072
            if (r2 == r1) goto L_0x0170
            if (r2 == r5) goto L_0x026b
            if (r2 == r4) goto L_0x028d
            goto L_0x0436
        L_0x0072:
            if (r13 <= 0) goto L_0x0170
            boolean r2 = f1831F
            if (r2 == 0) goto L_0x008c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "moveto CREATED: "
            r2.append(r8)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r6, r2)
        L_0x008c:
            if (r0 == 0) goto L_0x009b
            androidx.fragment.app.i<?> r2 = r11.f1851o
            android.content.Context r2 = r2.mo2432d()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r0.mo2587a(r2)
        L_0x009b:
            boolean r0 = r12.f1721N
            if (r0 != 0) goto L_0x00a4
            r12.f1720M = r1
            if (r13 <= r5) goto L_0x00a4
            r13 = 2
        L_0x00a4:
            androidx.fragment.app.i<?> r0 = r11.f1851o
            r12.f1752x = r0
            androidx.fragment.app.Fragment r2 = r11.f1853q
            r12.f1754z = r2
            if (r2 == 0) goto L_0x00b1
            androidx.fragment.app.l r0 = r2.f1753y
            goto L_0x00b3
        L_0x00b1:
            androidx.fragment.app.l r0 = r0.f1825i
        L_0x00b3:
            r12.f1751w = r0
            androidx.fragment.app.Fragment r0 = r12.f1740l
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            java.lang.String r8 = " declared target fragment "
            java.lang.String r9 = "Fragment "
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = r0.f1738j
            androidx.fragment.app.Fragment r0 = r11.mo2454a((java.lang.String) r0)
            androidx.fragment.app.Fragment r10 = r12.f1740l
            if (r0 != r10) goto L_0x00d9
            int r0 = r10.f1734f
            if (r0 >= r1) goto L_0x00d0
            r11.mo2461a((androidx.fragment.app.Fragment) r10, (int) r1)
        L_0x00d0:
            androidx.fragment.app.Fragment r0 = r12.f1740l
            java.lang.String r0 = r0.f1738j
            r12.f1741m = r0
            r12.f1740l = r7
            goto L_0x00f9
        L_0x00d9:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r12)
            r0.append(r8)
            androidx.fragment.app.Fragment r12 = r12.f1740l
            r0.append(r12)
            r0.append(r2)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        L_0x00f9:
            java.lang.String r0 = r12.f1741m
            if (r0 == 0) goto L_0x012b
            androidx.fragment.app.Fragment r0 = r11.mo2454a((java.lang.String) r0)
            if (r0 == 0) goto L_0x010b
            int r2 = r0.f1734f
            if (r2 >= r1) goto L_0x012b
            r11.mo2461a((androidx.fragment.app.Fragment) r0, (int) r1)
            goto L_0x012b
        L_0x010b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = r12.f1741m
            r0.append(r12)
            r0.append(r2)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        L_0x012b:
            androidx.fragment.app.k r0 = r11.f1849m
            androidx.fragment.app.i<?> r2 = r11.f1851o
            android.content.Context r2 = r2.mo2432d()
            r0.mo2440b((androidx.fragment.app.Fragment) r12, (android.content.Context) r2, (boolean) r3)
            r12.mo2292n0()
            androidx.fragment.app.Fragment r0 = r12.f1754z
            if (r0 != 0) goto L_0x0143
            androidx.fragment.app.i<?> r0 = r11.f1851o
            r0.mo2382a((androidx.fragment.app.Fragment) r12)
            goto L_0x0146
        L_0x0143:
            r0.mo2241a((androidx.fragment.app.Fragment) r12)
        L_0x0146:
            androidx.fragment.app.k r0 = r11.f1849m
            androidx.fragment.app.i<?> r2 = r11.f1851o
            android.content.Context r2 = r2.mo2432d()
            r0.mo2436a((androidx.fragment.app.Fragment) r12, (android.content.Context) r2, (boolean) r3)
            boolean r0 = r12.f1727T
            if (r0 != 0) goto L_0x0169
            androidx.fragment.app.k r0 = r11.f1849m
            android.os.Bundle r2 = r12.f1735g
            r0.mo2443c(r12, r2, r3)
            android.os.Bundle r0 = r12.f1735g
            r12.mo2277h((android.os.Bundle) r0)
            androidx.fragment.app.k r0 = r11.f1849m
            android.os.Bundle r2 = r12.f1735g
            r0.mo2441b((androidx.fragment.app.Fragment) r12, (android.os.Bundle) r2, (boolean) r3)
            goto L_0x0170
        L_0x0169:
            android.os.Bundle r0 = r12.f1735g
            r12.mo2286k(r0)
            r12.f1734f = r1
        L_0x0170:
            if (r13 <= 0) goto L_0x0175
            r11.m2155u(r12)
        L_0x0175:
            if (r13 <= r1) goto L_0x026b
            boolean r0 = f1831F
            if (r0 == 0) goto L_0x018f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "moveto ACTIVITY_CREATED: "
            r0.append(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r6, r0)
        L_0x018f:
            boolean r0 = r12.f1746r
            if (r0 != 0) goto L_0x0254
            int r0 = r12.f1709B
            if (r0 == 0) goto L_0x0205
            r2 = -1
            if (r0 == r2) goto L_0x01e6
            androidx.fragment.app.e r2 = r11.f1852p
            android.view.View r0 = r2.mo2318a(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0206
            boolean r2 = r12.f1748t
            if (r2 == 0) goto L_0x01a9
            goto L_0x0206
        L_0x01a9:
            android.content.res.Resources r13 = r12.mo2206M()     // Catch:{ NotFoundException -> 0x01b4 }
            int r0 = r12.f1709B     // Catch:{ NotFoundException -> 0x01b4 }
            java.lang.String r13 = r13.getResourceName(r0)     // Catch:{ NotFoundException -> 0x01b4 }
            goto L_0x01b6
        L_0x01b4:
            java.lang.String r13 = "unknown"
        L_0x01b6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No view found for id 0x"
            r1.append(r2)
            int r2 = r12.f1709B
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = ") for fragment "
            r1.append(r13)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            r11.m2138a((java.lang.RuntimeException) r0)
            throw r7
        L_0x01e6:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot create fragment "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = " for a container view with no id"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            r11.m2138a((java.lang.RuntimeException) r13)
            throw r7
        L_0x0205:
            r0 = r7
        L_0x0206:
            r12.f1718K = r0
            android.os.Bundle r2 = r12.f1735g
            android.view.LayoutInflater r2 = r12.mo2281i((android.os.Bundle) r2)
            android.os.Bundle r8 = r12.f1735g
            r12.mo2249b((android.view.LayoutInflater) r2, (android.view.ViewGroup) r0, (android.os.Bundle) r8)
            android.view.View r2 = r12.f1719L
            if (r2 == 0) goto L_0x0254
            r2.setSaveFromParentEnabled(r3)
            r11.mo2510o(r12)
            if (r0 == 0) goto L_0x0224
            android.view.View r2 = r12.f1719L
            r0.addView(r2)
        L_0x0224:
            boolean r0 = r12.f1711D
            if (r0 == 0) goto L_0x022f
            android.view.View r0 = r12.f1719L
            r2 = 8
            r0.setVisibility(r2)
        L_0x022f:
            android.view.View r0 = r12.f1719L
            p006b.p026g.p035k.C0890v.m4737H(r0)
            android.view.View r0 = r12.f1719L
            android.os.Bundle r2 = r12.f1735g
            r12.mo2239a((android.view.View) r0, (android.os.Bundle) r2)
            androidx.fragment.app.k r0 = r11.f1849m
            android.view.View r2 = r12.f1719L
            android.os.Bundle r8 = r12.f1735g
            r0.mo2438a(r12, r2, r8, r3)
            android.view.View r0 = r12.f1719L
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0251
            android.view.ViewGroup r0 = r12.f1718K
            if (r0 == 0) goto L_0x0251
            goto L_0x0252
        L_0x0251:
            r1 = 0
        L_0x0252:
            r12.f1723P = r1
        L_0x0254:
            android.os.Bundle r0 = r12.f1735g
            r12.mo2274g((android.os.Bundle) r0)
            androidx.fragment.app.k r0 = r11.f1849m
            android.os.Bundle r1 = r12.f1735g
            r0.mo2437a((androidx.fragment.app.Fragment) r12, (android.os.Bundle) r1, (boolean) r3)
            android.view.View r0 = r12.f1719L
            if (r0 == 0) goto L_0x0269
            android.os.Bundle r0 = r12.f1735g
            r12.mo2288l(r0)
        L_0x0269:
            r12.f1735g = r7
        L_0x026b:
            if (r13 <= r5) goto L_0x028d
            boolean r0 = f1831F
            if (r0 == 0) goto L_0x0285
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto STARTED: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r6, r0)
        L_0x0285:
            r12.mo2307v0()
            androidx.fragment.app.k r0 = r11.f1849m
            r0.mo2447e(r12, r3)
        L_0x028d:
            if (r13 <= r4) goto L_0x0436
            boolean r0 = f1831F
            if (r0 == 0) goto L_0x02a7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto RESUMED: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r6, r0)
        L_0x02a7:
            r12.mo2305u0()
            androidx.fragment.app.k r0 = r11.f1849m
            r0.mo2446d(r12, r3)
            r12.f1735g = r7
            r12.f1736h = r7
            goto L_0x0436
        L_0x02b5:
            if (r2 <= r13) goto L_0x0436
            if (r2 == r1) goto L_0x0383
            if (r2 == r5) goto L_0x0306
            if (r2 == r4) goto L_0x02e4
            r8 = 4
            if (r2 == r8) goto L_0x02c2
            goto L_0x0436
        L_0x02c2:
            if (r13 >= r8) goto L_0x02e4
            boolean r2 = f1831F
            if (r2 == 0) goto L_0x02dc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "movefrom RESUMED: "
            r2.append(r8)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r6, r2)
        L_0x02dc:
            r12.mo2300s0()
            androidx.fragment.app.k r2 = r11.f1849m
            r2.mo2444c(r12, r3)
        L_0x02e4:
            if (r13 >= r4) goto L_0x0306
            boolean r2 = f1831F
            if (r2 == 0) goto L_0x02fe
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "movefrom STARTED: "
            r2.append(r4)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r6, r2)
        L_0x02fe:
            r12.mo2309w0()
            androidx.fragment.app.k r2 = r11.f1849m
            r2.mo2448f(r12, r3)
        L_0x0306:
            if (r13 >= r5) goto L_0x0383
            boolean r2 = f1831F
            if (r2 == 0) goto L_0x0320
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "movefrom ACTIVITY_CREATED: "
            r2.append(r4)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r6, r2)
        L_0x0320:
            android.view.View r2 = r12.f1719L
            if (r2 == 0) goto L_0x0333
            androidx.fragment.app.i<?> r2 = r11.f1851o
            boolean r2 = r2.mo2385b(r12)
            if (r2 == 0) goto L_0x0333
            android.util.SparseArray<android.os.Parcelable> r2 = r12.f1736h
            if (r2 != 0) goto L_0x0333
            r0.mo2589c()
        L_0x0333:
            android.view.View r0 = r12.f1719L
            if (r0 == 0) goto L_0x0374
            android.view.ViewGroup r2 = r12.f1718K
            if (r2 == 0) goto L_0x0374
            r2.endViewTransition(r0)
            android.view.View r0 = r12.f1719L
            r0.clearAnimation()
            boolean r0 = r12.mo2260c0()
            if (r0 != 0) goto L_0x0374
            int r0 = r11.f1850n
            r2 = 0
            if (r0 <= 0) goto L_0x0365
            boolean r0 = r11.f1860x
            if (r0 != 0) goto L_0x0365
            android.view.View r0 = r12.f1719L
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0365
            float r0 = r12.f1725R
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0365
            androidx.fragment.app.l$h r0 = r11.m2143b((androidx.fragment.app.Fragment) r12, (boolean) r3)
            goto L_0x0366
        L_0x0365:
            r0 = r7
        L_0x0366:
            r12.f1725R = r2
            if (r0 == 0) goto L_0x036d
            r11.m2136a((androidx.fragment.app.Fragment) r12, (androidx.fragment.app.C0411l.C0420h) r0)
        L_0x036d:
            android.view.ViewGroup r0 = r12.f1718K
            android.view.View r2 = r12.f1719L
            r0.removeView(r2)
        L_0x0374:
            java.util.HashMap<androidx.fragment.app.Fragment, java.util.HashSet<androidx.fragment.app.l$k>> r0 = r11.f1848l
            java.lang.Object r0 = r0.get(r12)
            if (r0 != 0) goto L_0x0380
            r11.m2153s(r12)
            goto L_0x0383
        L_0x0380:
            r12.mo2262d((int) r13)
        L_0x0383:
            if (r13 >= r1) goto L_0x0436
            boolean r0 = r11.f1860x
            if (r0 == 0) goto L_0x0394
            java.util.HashMap<androidx.fragment.app.Fragment, java.util.HashSet<androidx.fragment.app.l$k>> r0 = r11.f1848l
            java.lang.Object r0 = r0.get(r12)
            if (r0 == 0) goto L_0x0394
            r11.m2151q(r12)
        L_0x0394:
            java.util.HashMap<androidx.fragment.app.Fragment, java.util.HashSet<androidx.fragment.app.l$k>> r0 = r11.f1848l
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x03a1
            r12.mo2262d((int) r13)
            goto L_0x0437
        L_0x03a1:
            boolean r0 = f1831F
            if (r0 == 0) goto L_0x03b9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "movefrom CREATED: "
            r0.append(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r6, r0)
        L_0x03b9:
            boolean r0 = r12.f1745q
            if (r0 == 0) goto L_0x03c5
            boolean r0 = r12.mo2219Z()
            if (r0 != 0) goto L_0x03c5
            r0 = 1
            goto L_0x03c6
        L_0x03c5:
            r0 = 0
        L_0x03c6:
            if (r0 != 0) goto L_0x03d4
            androidx.fragment.app.o r2 = r11.f1835D
            boolean r2 = r2.mo2565f(r12)
            if (r2 == 0) goto L_0x03d1
            goto L_0x03d4
        L_0x03d1:
            r12.f1734f = r3
            goto L_0x0407
        L_0x03d4:
            androidx.fragment.app.i<?> r2 = r11.f1851o
            boolean r4 = r2 instanceof androidx.lifecycle.C0476d0
            if (r4 == 0) goto L_0x03e1
            androidx.fragment.app.o r1 = r11.f1835D
            boolean r1 = r1.mo2567h()
            goto L_0x03f6
        L_0x03e1:
            android.content.Context r2 = r2.mo2432d()
            boolean r2 = r2 instanceof android.app.Activity
            if (r2 == 0) goto L_0x03f6
            androidx.fragment.app.i<?> r2 = r11.f1851o
            android.content.Context r2 = r2.mo2432d()
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r2 = r2.isChangingConfigurations()
            r1 = r1 ^ r2
        L_0x03f6:
            if (r0 != 0) goto L_0x03fa
            if (r1 == 0) goto L_0x03ff
        L_0x03fa:
            androidx.fragment.app.o r1 = r11.f1835D
            r1.mo2559b(r12)
        L_0x03ff:
            r12.mo2293o0()
            androidx.fragment.app.k r1 = r11.f1849m
            r1.mo2439a(r12, r3)
        L_0x0407:
            r12.mo2298q0()
            androidx.fragment.app.k r1 = r11.f1849m
            r1.mo2442b(r12, r3)
            if (r0 != 0) goto L_0x0433
            androidx.fragment.app.o r0 = r11.f1835D
            boolean r0 = r0.mo2565f(r12)
            if (r0 == 0) goto L_0x041a
            goto L_0x0433
        L_0x041a:
            r12.f1752x = r7
            r12.f1754z = r7
            r12.f1751w = r7
            java.lang.String r0 = r12.f1741m
            if (r0 == 0) goto L_0x0436
            androidx.fragment.app.Fragment r0 = r11.mo2454a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0436
            boolean r1 = r0.mo2207N()
            if (r1 == 0) goto L_0x0436
            r12.f1740l = r0
            goto L_0x0436
        L_0x0433:
            r11.m2160z(r12)
        L_0x0436:
            r1 = r13
        L_0x0437:
            int r13 = r12.f1734f
            if (r13 == r1) goto L_0x0463
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "moveToState: Fragment state for "
            r13.append(r0)
            r13.append(r12)
            java.lang.String r0 = " not updated inline; expected state "
            r13.append(r0)
            r13.append(r1)
            java.lang.String r0 = " found "
            r13.append(r0)
            int r0 = r12.f1734f
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            android.util.Log.w(r6, r13)
            r12.f1734f = r1
        L_0x0463:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0411l.mo2461a(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2462a(Fragment fragment, C0423k kVar) {
        if (this.f1848l.get(fragment) == null) {
            this.f1848l.put(fragment, new HashSet());
        }
        this.f1848l.get(fragment).add(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2463a(Fragment fragment, C0481i.C0483b bVar) {
        if (mo2454a(fragment.f1738j) == fragment && (fragment.f1752x == null || fragment.mo2200G() == this)) {
            fragment.f1728U = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2464a(Fragment fragment, boolean z) {
        ViewGroup x = m2158x(fragment);
        if (x != null && (x instanceof C0404f)) {
            ((C0404f) x).setDrawDisappearingViewsLast(!z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2465a(C0396a aVar) {
        if (this.f1841e == null) {
            this.f1841e = new ArrayList<>();
        }
        this.f1841e.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2466a(C0396a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo2336b(z3);
        } else {
            aVar.mo2341e();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0440t.m2319a(this, (ArrayList<C0396a>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            mo2456a(this.f1850n, true);
        }
        for (C0437r next : this.f1840d.values()) {
            if (next != null) {
                Fragment a = next.mo2586a();
                if (a.f1719L != null && a.f1723P && aVar.mo2339c(a.f1709B)) {
                    float f = a.f1725R;
                    if (f > 0.0f) {
                        a.f1719L.setAlpha(f);
                    }
                    if (z3) {
                        a.f1725R = 0.0f;
                    } else {
                        a.f1725R = -1.0f;
                        a.f1723P = false;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.activity.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2467a(androidx.fragment.app.C0407i<?> r3, androidx.fragment.app.C0403e r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.i<?> r0 = r2.f1851o
            if (r0 != 0) goto L_0x004a
            r2.f1851o = r3
            r2.f1852p = r4
            r2.f1853q = r5
            androidx.fragment.app.Fragment r4 = r2.f1853q
            if (r4 == 0) goto L_0x0011
            r2.m2133K()
        L_0x0011:
            boolean r4 = r3 instanceof androidx.activity.C0011c
            if (r4 == 0) goto L_0x0028
            r4 = r3
            androidx.activity.c r4 = (androidx.activity.C0011c) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.mo6f()
            r2.f1844h = r0
            if (r5 == 0) goto L_0x0021
            r4 = r5
        L_0x0021:
            androidx.activity.OnBackPressedDispatcher r0 = r2.f1844h
            androidx.activity.b r1 = r2.f1845i
            r0.mo18a(r4, r1)
        L_0x0028:
            if (r5 == 0) goto L_0x0033
            androidx.fragment.app.l r3 = r5.f1751w
            androidx.fragment.app.o r3 = r3.m2157w(r5)
        L_0x0030:
            r2.f1835D = r3
            goto L_0x0049
        L_0x0033:
            boolean r4 = r3 instanceof androidx.lifecycle.C0476d0
            if (r4 == 0) goto L_0x0042
            androidx.lifecycle.d0 r3 = (androidx.lifecycle.C0476d0) r3
            androidx.lifecycle.c0 r3 = r3.mo8h()
            androidx.fragment.app.o r3 = androidx.fragment.app.C0432o.m2258a((androidx.lifecycle.C0474c0) r3)
            goto L_0x0030
        L_0x0042:
            androidx.fragment.app.o r3 = new androidx.fragment.app.o
            r4 = 0
            r3.<init>(r4)
            goto L_0x0030
        L_0x0049:
            return
        L_0x004a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0411l.mo2467a(androidx.fragment.app.i, androidx.fragment.app.e, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2468a(C0426n nVar, boolean z) {
        if (!z) {
            if (this.f1851o != null) {
                m2126D();
            } else if (this.f1860x) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f1837a) {
            if (this.f1851o != null) {
                this.f1837a.add(nVar);
                mo2451B();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: a */
    public void mo2469a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        if (!this.f1840d.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (C0437r next : this.f1840d.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment a = next.mo2586a();
                    printWriter.println(a);
                    a.mo2242a(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = this.f1839c.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f1839c.get(i).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f1842f;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f1842f.get(i2).toString());
            }
        }
        ArrayList<C0396a> arrayList2 = this.f1841e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0396a aVar = this.f1841e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo2328a(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1846j.get());
        synchronized (this.f1837a) {
            int size4 = this.f1837a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.f1837a.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1851o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1852p);
        if (this.f1853q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1853q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1850n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1858v);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1859w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1860x);
        if (this.f1857u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1857u);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2470a(boolean z) {
        for (int size = this.f1839c.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1839c.get(size);
            if (fragment != null) {
                fragment.mo2268e(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2471a(Menu menu, MenuInflater menuInflater) {
        if (this.f1850n < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f1839c.size(); i++) {
            Fragment fragment = this.f1839c.get(i);
            if (fragment != null && fragment.mo2252b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f1842f != null) {
            for (int i2 = 0; i2 < this.f1842f.size(); i2++) {
                Fragment fragment2 = this.f1842f.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.mo2276g0();
                }
            }
        }
        this.f1842f = arrayList;
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2472a(MenuItem menuItem) {
        if (this.f1850n < 1) {
            return false;
        }
        for (int i = 0; i < this.f1839c.size(); i++) {
            Fragment fragment = this.f1839c.get(i);
            if (fragment != null && fragment.mo2259c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2473a(ArrayList<C0396a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0396a> arrayList3 = this.f1841e;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1841e.remove(size));
            arrayList2.add(true);
        } else {
            if (str != null || i >= 0) {
                i3 = this.f1841e.size() - 1;
                while (i3 >= 0) {
                    C0396a aVar = this.f1841e.get(i3);
                    if ((str != null && str.equals(aVar.mo2342f())) || (i >= 0 && i == aVar.f1779s)) {
                        break;
                    }
                    i3--;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        C0396a aVar2 = this.f1841e.get(i3);
                        if ((str == null || !str.equals(aVar2.mo2342f())) && (i < 0 || i != aVar2.f1779s)) {
                            break;
                        }
                    }
                }
            } else {
                i3 = -1;
            }
            if (i3 == this.f1841e.size() - 1) {
                return false;
            }
            for (int size2 = this.f1841e.size() - 1; size2 > i3; size2--) {
                arrayList.add(this.f1841e.remove(size2));
                arrayList2.add(true);
            }
        }
        return true;
    }

    /* renamed from: b */
    public Fragment mo2474b(String str) {
        if (str != null) {
            for (int size = this.f1839c.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f1839c.get(size);
                if (fragment != null && str.equals(fragment.f1710C)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0437r next : this.f1840d.values()) {
            if (next != null) {
                Fragment a = next.mo2586a();
                if (str.equals(a.f1710C)) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public C0438s mo2475b() {
        return new C0396a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2476b(Fragment fragment) {
        if (mo2521x()) {
            if (f1831F) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f1835D.mo2558a(fragment) && f1831F) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2477b(Fragment fragment, C0423k kVar) {
        HashSet hashSet = this.f1848l.get(fragment);
        if (hashSet != null && hashSet.remove(kVar) && hashSet.isEmpty()) {
            m2153s(fragment);
            this.f1848l.remove(fragment);
            mo2461a(fragment, fragment.mo2211R());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2478b(C0426n nVar, boolean z) {
        if (!z || (this.f1851o != null && !this.f1860x)) {
            m2150d(z);
            if (nVar.mo2331a(this.f1862z, this.f1832A)) {
                this.f1838b = true;
                try {
                    m2148c(this.f1862z, this.f1832A);
                } finally {
                    m2127E();
                }
            }
            m2133K();
            m2128F();
            m2125C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2479b(boolean z) {
        for (int size = this.f1839c.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1839c.get(size);
            if (fragment != null) {
                fragment.mo2272f(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2480b(int i) {
        return this.f1850n >= i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2481b(Menu menu) {
        if (this.f1850n < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f1839c.size(); i++) {
            Fragment fragment = this.f1839c.get(i);
            if (fragment != null && fragment.mo2264d(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2482b(MenuItem menuItem) {
        if (this.f1850n < 1) {
            return false;
        }
        for (int i = 0; i < this.f1839c.size(); i++) {
            Fragment fragment = this.f1839c.get(i);
            if (fragment != null && fragment.mo2265d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Fragment mo2483c(String str) {
        Fragment a;
        for (C0437r next : this.f1840d.values()) {
            if (next != null && (a = next.mo2586a().mo2223a(str)) != null) {
                return a;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2484c(Fragment fragment) {
        if (f1831F) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f1712E) {
            fragment.f1712E = false;
            if (fragment.f1744p) {
                return;
            }
            if (!this.f1839c.contains(fragment)) {
                if (f1831F) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                synchronized (this.f1839c) {
                    this.f1839c.add(fragment);
                }
                fragment.f1744p = true;
                if (m2159y(fragment)) {
                    this.f1857u = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo2485c() {
        boolean z = false;
        for (C0437r next : this.f1840d.values()) {
            if (next != null) {
                z = m2159y(next.mo2586a());
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo2486c(boolean z) {
        m2150d(z);
        boolean z2 = false;
        while (m2146b(this.f1862z, this.f1832A)) {
            this.f1838b = true;
            try {
                m2148c(this.f1862z, this.f1832A);
                m2127E();
                z2 = true;
            } catch (Throwable th) {
                m2127E();
                throw th;
            }
        }
        m2133K();
        m2128F();
        m2125C();
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2487d() {
        this.f1858v = false;
        this.f1859w = false;
        m2147c(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2488d(Fragment fragment) {
        if (f1831F) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f1712E) {
            fragment.f1712E = true;
            if (fragment.f1744p) {
                if (f1831F) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                synchronized (this.f1839c) {
                    this.f1839c.remove(fragment);
                }
                if (m2159y(fragment)) {
                    this.f1857u = true;
                }
                fragment.f1744p = false;
                m2124A(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0474c0 mo2489e(Fragment fragment) {
        return this.f1835D.mo2561d(fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2490e() {
        this.f1858v = false;
        this.f1859w = false;
        m2147c(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2491f() {
        this.f1860x = true;
        mo2486c(true);
        m2147c(0);
        this.f1851o = null;
        this.f1852p = null;
        this.f1853q = null;
        if (this.f1844h != null) {
            this.f1845i.mo25c();
            this.f1844h = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2492f(Fragment fragment) {
        if (f1831F) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f1711D) {
            fragment.f1711D = true;
            fragment.f1724Q = true ^ fragment.f1724Q;
            m2124A(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2493g() {
        m2147c(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo2494g(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        C0411l lVar = fragment.f1751w;
        return fragment == lVar.mo2518u() && mo2494g(lVar.f1853q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2495h() {
        for (int i = 0; i < this.f1839c.size(); i++) {
            Fragment fragment = this.f1839c.get(i);
            if (fragment != null) {
                fragment.mo2299r0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2496h(Fragment fragment) {
        if (mo2454a(fragment.f1738j) == null) {
            this.f1840d.put(fragment.f1738j, new C0437r(this.f1849m, fragment));
            if (fragment.f1714G) {
                if (fragment.f1713F) {
                    mo2476b(fragment);
                } else {
                    mo2506m(fragment);
                }
                fragment.f1714G = false;
            }
            if (f1831F) {
                Log.v("FragmentManager", "Added fragment to active set " + fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2497i() {
        m2147c(3);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        r0 = r0.f1719L;
        r1 = r4.f1718K;
        r0 = r1.indexOfChild(r0);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2498i(androidx.fragment.app.Fragment r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.HashMap<java.lang.String, androidx.fragment.app.r> r0 = r3.f1840d
            java.lang.String r1 = r4.f1738j
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x003a
            boolean r0 = f1831F
            if (r0 == 0) goto L_0x0039
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring moving "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " to state "
            r0.append(r4)
            int r4 = r3.f1850n
            r0.append(r4)
            java.lang.String r4 = "since it is not added to "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r4)
        L_0x0039:
            return
        L_0x003a:
            r3.mo2500j(r4)
            android.view.View r0 = r4.f1719L
            if (r0 == 0) goto L_0x0095
            androidx.fragment.app.Fragment r0 = r3.m2156v(r4)
            if (r0 == 0) goto L_0x005f
            android.view.View r0 = r0.f1719L
            android.view.ViewGroup r1 = r4.f1718K
            int r0 = r1.indexOfChild(r0)
            android.view.View r2 = r4.f1719L
            int r2 = r1.indexOfChild(r2)
            if (r2 >= r0) goto L_0x005f
            r1.removeViewAt(r2)
            android.view.View r2 = r4.f1719L
            r1.addView(r2, r0)
        L_0x005f:
            boolean r0 = r4.f1723P
            if (r0 == 0) goto L_0x0095
            android.view.ViewGroup r0 = r4.f1718K
            if (r0 == 0) goto L_0x0095
            float r0 = r4.f1725R
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0073
            android.view.View r2 = r4.f1719L
            r2.setAlpha(r0)
        L_0x0073:
            r4.f1725R = r1
            r0 = 0
            r4.f1723P = r0
            r0 = 1
            androidx.fragment.app.l$h r0 = r3.m2143b((androidx.fragment.app.Fragment) r4, (boolean) r0)
            if (r0 == 0) goto L_0x0095
            android.view.animation.Animation r1 = r0.f1880a
            if (r1 == 0) goto L_0x0089
            android.view.View r0 = r4.f1719L
            r0.startAnimation(r1)
            goto L_0x0095
        L_0x0089:
            android.animation.Animator r1 = r0.f1881b
            android.view.View r2 = r4.f1719L
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.f1881b
            r0.start()
        L_0x0095:
            boolean r0 = r4.f1724Q
            if (r0 == 0) goto L_0x009c
            r3.m2152r(r4)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0411l.mo2498i(androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2499j() {
        m2133K();
        m2154t(this.f1854r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2500j(Fragment fragment) {
        mo2461a(fragment, this.f1850n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2501k() {
        this.f1858v = false;
        this.f1859w = false;
        m2147c(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2502k(Fragment fragment) {
        if (!fragment.f1720M) {
            return;
        }
        if (this.f1838b) {
            this.f1861y = true;
            return;
        }
        fragment.f1720M = false;
        mo2461a(fragment, this.f1850n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo2503l() {
        this.f1858v = false;
        this.f1859w = false;
        m2147c(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo2504l(Fragment fragment) {
        if (f1831F) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f1750v);
        }
        boolean z = !fragment.mo2219Z();
        if (!fragment.f1712E || z) {
            synchronized (this.f1839c) {
                this.f1839c.remove(fragment);
            }
            if (m2159y(fragment)) {
                this.f1857u = true;
            }
            fragment.f1744p = false;
            fragment.f1745q = true;
            m2124A(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo2505m() {
        this.f1859w = true;
        m2147c(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo2506m(Fragment fragment) {
        if (mo2521x()) {
            if (f1831F) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f1835D.mo2562e(fragment) && f1831F) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo2507n(Fragment fragment) {
        if (fragment == null || (mo2454a(fragment.f1738j) == fragment && (fragment.f1752x == null || fragment.mo2200G() == this))) {
            Fragment fragment2 = this.f1854r;
            this.f1854r = fragment;
            m2154t(fragment2);
            m2154t(this.f1854r);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: n */
    public boolean mo2508n() {
        boolean c = mo2486c(true);
        m2130H();
        return c;
    }

    /* renamed from: o */
    public int mo2509o() {
        ArrayList<C0396a> arrayList = this.f1841e;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2510o(Fragment fragment) {
        fragment.f1719L.setTag(C0928b.fragment_container_view_tag, fragment);
    }

    /* renamed from: p */
    public C0406h mo2511p() {
        C0406h hVar = this.f1855s;
        if (hVar != null) {
            return hVar;
        }
        Fragment fragment = this.f1853q;
        return fragment != null ? fragment.f1751w.mo2511p() : this.f1856t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2512p(Fragment fragment) {
        if (f1831F) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f1711D) {
            fragment.f1711D = false;
            fragment.f1724Q = !fragment.f1724Q;
        }
    }

    /* renamed from: q */
    public List<Fragment> mo2513q() {
        List<Fragment> list;
        if (this.f1839c.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1839c) {
            list = (List) this.f1839c.clone();
        }
        return list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public LayoutInflater.Factory2 mo2514r() {
        return this.f1843g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0409k mo2515s() {
        return this.f1849m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public Fragment mo2516t() {
        return this.f1853q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(PropertyFlags.ID_SELF_ASSIGNABLE);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f1853q;
        if (obj == null) {
            obj = this.f1851o;
        }
        C0830a.m4522a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public Fragment mo2518u() {
        return this.f1854r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo2519v() {
        mo2486c(true);
        if (this.f1845i.mo24b()) {
            mo2523z();
        } else {
            this.f1844h.mo17a();
        }
    }

    /* renamed from: w */
    public boolean mo2520w() {
        return this.f1860x;
    }

    /* renamed from: x */
    public boolean mo2521x() {
        return this.f1858v || this.f1859w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo2522y() {
        this.f1858v = false;
        this.f1859w = false;
        int size = this.f1839c.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = this.f1839c.get(i);
            if (fragment != null) {
                fragment.mo2269e0();
            }
        }
    }

    /* renamed from: z */
    public boolean mo2523z() {
        return m2141a((String) null, -1, 0);
    }
}
