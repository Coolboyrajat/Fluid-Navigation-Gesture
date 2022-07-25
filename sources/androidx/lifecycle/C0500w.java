package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.C0481i;
import androidx.lifecycle.C0504x;

/* renamed from: androidx.lifecycle.w */
public class C0500w implements C0490o {

    /* renamed from: n */
    private static final C0500w f2064n = new C0500w();

    /* renamed from: f */
    private int f2065f = 0;

    /* renamed from: g */
    private int f2066g = 0;

    /* renamed from: h */
    private boolean f2067h = true;

    /* renamed from: i */
    private boolean f2068i = true;

    /* renamed from: j */
    private Handler f2069j;

    /* renamed from: k */
    private final C0491p f2070k = new C0491p(this);

    /* renamed from: l */
    private Runnable f2071l = new C0501a();

    /* renamed from: m */
    C0504x.C0505a f2072m = new C0502b();

    /* renamed from: androidx.lifecycle.w$a */
    class C0501a implements Runnable {
        C0501a() {
        }

        public void run() {
            C0500w.this.mo2718h();
            C0500w.this.mo2719i();
        }
    }

    /* renamed from: androidx.lifecycle.w$b */
    class C0502b implements C0504x.C0505a {
        C0502b() {
        }

        /* renamed from: a */
        public void mo2721a() {
        }

        /* renamed from: b */
        public void mo2722b() {
            C0500w.this.mo2715c();
        }

        /* renamed from: c */
        public void mo2723c() {
            C0500w.this.mo2716d();
        }
    }

    /* renamed from: androidx.lifecycle.w$c */
    class C0503c extends C0475d {
        C0503c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C0504x.m2483a(activity).mo2726a(C0500w.this.f2072m);
        }

        public void onActivityPaused(Activity activity) {
            C0500w.this.mo2714b();
        }

        public void onActivityStopped(Activity activity) {
            C0500w.this.mo2717e();
        }
    }

    private C0500w() {
    }

    /* renamed from: b */
    static void m2471b(Context context) {
        f2064n.mo2713a(context);
    }

    /* renamed from: a */
    public C0481i mo5a() {
        return this.f2070k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2713a(Context context) {
        this.f2069j = new Handler();
        this.f2070k.mo2707a(C0481i.C0482a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0503c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2714b() {
        this.f2066g--;
        if (this.f2066g == 0) {
            this.f2069j.postDelayed(this.f2071l, 700);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2715c() {
        this.f2066g++;
        if (this.f2066g != 1) {
            return;
        }
        if (this.f2067h) {
            this.f2070k.mo2707a(C0481i.C0482a.ON_RESUME);
            this.f2067h = false;
            return;
        }
        this.f2069j.removeCallbacks(this.f2071l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2716d() {
        this.f2065f++;
        if (this.f2065f == 1 && this.f2068i) {
            this.f2070k.mo2707a(C0481i.C0482a.ON_START);
            this.f2068i = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2717e() {
        this.f2065f--;
        mo2719i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2718h() {
        if (this.f2066g == 0) {
            this.f2067h = true;
            this.f2070k.mo2707a(C0481i.C0482a.ON_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2719i() {
        if (this.f2065f == 0 && this.f2067h) {
            this.f2070k.mo2707a(C0481i.C0482a.ON_STOP);
            this.f2068i = true;
        }
    }
}
