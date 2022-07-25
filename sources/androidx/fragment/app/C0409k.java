package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C0411l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.k */
class C0409k {

    /* renamed from: a */
    private final CopyOnWriteArrayList<C0410a> f1827a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final C0411l f1828b;

    /* renamed from: androidx.fragment.app.k$a */
    private static final class C0410a {

        /* renamed from: a */
        final C0411l.C0424l f1829a;

        /* renamed from: b */
        final boolean f1830b;
    }

    C0409k(C0411l lVar) {
        this.f1828b = lVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2436a(Fragment fragment, Context context, boolean z) {
        Fragment t = this.f1828b.mo2516t();
        if (t != null) {
            t.mo2315z0().mo2515s().mo2436a(fragment, context, true);
        }
        Iterator<C0410a> it = this.f1827a.iterator();
        while (it.hasNext()) {
            C0410a next = it.next();
            if (!z || next.f1830b) {
                next.f1829a.mo2536a(this.f1828b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2437a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment t = this.f1828b.mo2516t();
        if (t != null) {
            t.mo2315z0().mo2515s().mo2437a(fragment, bundle, true);
        }
        Iterator<C0410a> it = this.f1827a.iterator();
        while (it.hasNext()) {
            C0410a next = it.next();
            if (!z || next.f1830b) {
                next.f1829a.mo2537a(this.f1828b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2438a(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment t = this.f1828b.mo2516t();
        if (t != null) {
            t.mo2315z0().mo2515s().mo2438a(fragment, view, bundle, true);
        }
        Iterator<C0410a> it = this.f1827a.iterator();
        while (it.hasNext()) {
            C0410a next = it.next();
            if (!z || next.f1830b) {
                next.f1829a.mo2538a(this.f1828b, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2439a(Fragment fragment, boolean z) {
        Fragment t = this.f1828b.mo2516t();
        if (t != null) {
            t.mo2315z0().mo2515s().mo2439a(fragment, true);
        }
        Iterator<C0410a> it = this.f1827a.iterator();
        while (it.hasNext()) {
            C0410a next = it.next();
            if (!z || next.f1830b) {
                next.f1829a.mo2535a(this.f1828b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2440b(Fragment fragment, Context context, boolean z) {
        Fragment t = this.f1828b.mo2516t();
        if (t != null) {
            t.mo2315z0().mo2515s().mo2440b(fragment, context, true);
        }
        Iterator<C0410a> it = this.f1827a.iterator();
        while (it.hasNext()) {
            C0410a next = it.next();
            if (!z || next.f1830b) {
                next.f1829a.mo2540b(this.f1828b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2441b(Fragment fragment, Bundle bundle, boolean z) {
        Fragment t = this.f1828b.mo2516t();
        if (t != null) {
            t.mo2315z0().mo2515s().mo2441b(fragment, bundle, true);
        }
        Iterator<C0410a> it = this.f1827a.iterator();
        while (it.hasNext()) {
            C0410a next = it.next();
            if (!z || next.f1830b) {
                next.f1829a.mo2541b(this.f1828b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2442b(Fragment fragment, boolean z) {
        Fragment t = this.f1828b.mo2516t();
        if (t != null) {
            t.mo2315z0().mo2515s().mo2442b(fragment, true);
        }
        Iterator<C0410a> it = this.f1827a.iterator();
        while (it.hasNext()) {
            C0410a next = it.next();
            if (!z || next.f1830b) {
                next.f1829a.mo2539b(this.f1828b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2443c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment t = this.f1828b.mo2516t();
        if (t != null) {
            t.mo2315z0().mo2515s().mo2443c(fragment, bundle, true);
        }
        Iterator<C0410a> it = this.f1827a.iterator();
        while (it.hasNext()) {
            C0410a next = it.next();
            if (!z || next.f1830b) {
                next.f1829a.mo2543c(this.f1828b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2444c(Fragment fragment, boolean z) {
        Fragment t = this.f1828b.mo2516t();
        if (t != null) {
            t.mo2315z0().mo2515s().mo2444c(fragment, true);
        }
        Iterator<C0410a> it = this.f1827a.iterator();
        while (it.hasNext()) {
            C0410a next = it.next();
            if (!z || next.f1830b) {
                next.f1829a.mo2542c(this.f1828b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2445d(Fragment fragment, Bundle bundle, boolean z) {
        Fragment t = this.f1828b.mo2516t();
        if (t != null) {
            t.mo2315z0().mo2515s().mo2445d(fragment, bundle, true);
        }
        Iterator<C0410a> it = this.f1827a.iterator();
        while (it.hasNext()) {
            C0410a next = it.next();
            if (!z || next.f1830b) {
                next.f1829a.mo2545d(this.f1828b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2446d(Fragment fragment, boolean z) {
        Fragment t = this.f1828b.mo2516t();
        if (t != null) {
            t.mo2315z0().mo2515s().mo2446d(fragment, true);
        }
        Iterator<C0410a> it = this.f1827a.iterator();
        while (it.hasNext()) {
            C0410a next = it.next();
            if (!z || next.f1830b) {
                next.f1829a.mo2544d(this.f1828b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2447e(Fragment fragment, boolean z) {
        Fragment t = this.f1828b.mo2516t();
        if (t != null) {
            t.mo2315z0().mo2515s().mo2447e(fragment, true);
        }
        Iterator<C0410a> it = this.f1827a.iterator();
        while (it.hasNext()) {
            C0410a next = it.next();
            if (!z || next.f1830b) {
                next.f1829a.mo2546e(this.f1828b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2448f(Fragment fragment, boolean z) {
        Fragment t = this.f1828b.mo2516t();
        if (t != null) {
            t.mo2315z0().mo2515s().mo2448f(fragment, true);
        }
        Iterator<C0410a> it = this.f1827a.iterator();
        while (it.hasNext()) {
            C0410a next = it.next();
            if (!z || next.f1830b) {
                next.f1829a.mo2547f(this.f1828b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2449g(Fragment fragment, boolean z) {
        Fragment t = this.f1828b.mo2516t();
        if (t != null) {
            t.mo2315z0().mo2515s().mo2449g(fragment, true);
        }
        Iterator<C0410a> it = this.f1827a.iterator();
        while (it.hasNext()) {
            C0410a next = it.next();
            if (!z || next.f1830b) {
                next.f1829a.mo2548g(this.f1828b, fragment);
            }
        }
    }
}
