package com.uber.autodispose.android.lifecycle;

import androidx.lifecycle.C0481i;
import androidx.lifecycle.C0489n;
import androidx.lifecycle.C0490o;
import androidx.lifecycle.C0499v;
import p054c.p125i.p126a.p127q.p128b.C1548c;
import p054c.p125i.p126a.p127q.p128b.C1549d;
import p155d.p156a.C2790h;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p178w.C2973a;

class LifecycleEventsObservable extends C2790h<C0481i.C0482a> {

    /* renamed from: f */
    private final C0481i f7364f;

    /* renamed from: g */
    private final C2973a<C0481i.C0482a> f7365g = C2973a.m11439h();

    static final class ArchLifecycleObserver extends C1549d implements C0489n {

        /* renamed from: g */
        private final C0481i f7366g;

        /* renamed from: h */
        private final C2793k<? super C0481i.C0482a> f7367h;

        /* renamed from: i */
        private final C2973a<C0481i.C0482a> f7368i;

        ArchLifecycleObserver(C0481i iVar, C2793k<? super C0481i.C0482a> kVar, C2973a<C0481i.C0482a> aVar) {
            this.f7366g = iVar;
            this.f7367h = kVar;
            this.f7368i = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo6041c() {
            this.f7366g.mo2702b(this);
        }

        /* access modifiers changed from: package-private */
        @C0499v(C0481i.C0482a.ON_ANY)
        public void onStateChange(C0490o oVar, C0481i.C0482a aVar) {
            if (!mo6028b()) {
                if (!(aVar == C0481i.C0482a.ON_CREATE && this.f7368i.mo9077g() == aVar)) {
                    this.f7368i.mo6032a(aVar);
                }
                this.f7367h.mo6032a(aVar);
            }
        }
    }

    /* renamed from: com.uber.autodispose.android.lifecycle.LifecycleEventsObservable$a */
    static /* synthetic */ class C2779a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7369a = new int[C0481i.C0483b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.lifecycle.i$b[] r0 = androidx.lifecycle.C0481i.C0483b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7369a = r0
                int[] r0 = f7369a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.C0481i.C0483b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f7369a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.C0481i.C0483b.CREATED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f7369a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.C0481i.C0483b.STARTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f7369a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.C0481i.C0483b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f7369a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.C0481i.C0483b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uber.autodispose.android.lifecycle.LifecycleEventsObservable.C2779a.<clinit>():void");
        }
    }

    LifecycleEventsObservable(C0481i iVar) {
        this.f7364f = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo5871b(C2793k<? super C0481i.C0482a> kVar) {
        ArchLifecycleObserver archLifecycleObserver = new ArchLifecycleObserver(this.f7364f, kVar, this.f7365g);
        kVar.mo6031a((C2810b) archLifecycleObserver);
        if (!C1548c.m6845a()) {
            kVar.onError(new IllegalStateException("Lifecycles can only be bound to on the main thread!"));
            return;
        }
        this.f7364f.mo2701a(archLifecycleObserver);
        if (archLifecycleObserver.mo6028b()) {
            this.f7364f.mo2702b(archLifecycleObserver);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo8895g() {
        int i = C2779a.f7369a[this.f7364f.mo2700a().ordinal()];
        this.f7365g.mo6032a(i != 1 ? i != 2 ? (i == 3 || i == 4) ? C0481i.C0482a.ON_RESUME : C0481i.C0482a.ON_DESTROY : C0481i.C0482a.ON_START : C0481i.C0482a.ON_CREATE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C0481i.C0482a mo8896h() {
        return this.f7365g.mo9077g();
    }
}
