package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.C0481i;

/* renamed from: androidx.lifecycle.y */
public class C0506y {

    /* renamed from: a */
    private final C0491p f2077a;

    /* renamed from: b */
    private final Handler f2078b = new Handler();

    /* renamed from: c */
    private C0507a f2079c;

    /* renamed from: androidx.lifecycle.y$a */
    static class C0507a implements Runnable {

        /* renamed from: f */
        private final C0491p f2080f;

        /* renamed from: g */
        final C0481i.C0482a f2081g;

        /* renamed from: h */
        private boolean f2082h = false;

        C0507a(C0491p pVar, C0481i.C0482a aVar) {
            this.f2080f = pVar;
            this.f2081g = aVar;
        }

        public void run() {
            if (!this.f2082h) {
                this.f2080f.mo2707a(this.f2081g);
                this.f2082h = true;
            }
        }
    }

    public C0506y(C0490o oVar) {
        this.f2077a = new C0491p(oVar);
    }

    /* renamed from: a */
    private void m2493a(C0481i.C0482a aVar) {
        C0507a aVar2 = this.f2079c;
        if (aVar2 != null) {
            aVar2.run();
        }
        this.f2079c = new C0507a(this.f2077a, aVar);
        this.f2078b.postAtFrontOfQueue(this.f2079c);
    }

    /* renamed from: a */
    public C0481i mo2733a() {
        return this.f2077a;
    }

    /* renamed from: b */
    public void mo2734b() {
        m2493a(C0481i.C0482a.ON_CREATE);
    }

    /* renamed from: c */
    public void mo2735c() {
        m2493a(C0481i.C0482a.ON_STOP);
        m2493a(C0481i.C0482a.ON_DESTROY);
    }

    /* renamed from: d */
    public void mo2736d() {
        m2493a(C0481i.C0482a.ON_START);
    }
}
