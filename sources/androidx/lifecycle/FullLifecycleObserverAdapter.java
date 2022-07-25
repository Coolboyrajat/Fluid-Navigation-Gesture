package androidx.lifecycle;

import androidx.lifecycle.C0481i;

class FullLifecycleObserverAdapter implements C0488m {

    /* renamed from: f */
    private final C0477e f2011f;

    /* renamed from: g */
    private final C0488m f2012g;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    static /* synthetic */ class C0459a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2013a = new int[C0481i.C0482a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.lifecycle.i$a[] r0 = androidx.lifecycle.C0481i.C0482a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2013a = r0
                int[] r0 = f2013a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f2013a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_START     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f2013a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f2013a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f2013a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f2013a     // Catch:{ NoSuchFieldError -> 0x004b }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f2013a     // Catch:{ NoSuchFieldError -> 0x0056 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.C0459a.<clinit>():void");
        }
    }

    FullLifecycleObserverAdapter(C0477e eVar, C0488m mVar) {
        this.f2011f = eVar;
        this.f2012g = mVar;
    }

    /* renamed from: a */
    public void mo14a(C0490o oVar, C0481i.C0482a aVar) {
        switch (C0459a.f2013a[aVar.ordinal()]) {
            case 1:
                this.f2011f.mo2693a(oVar);
                break;
            case 2:
                this.f2011f.mo2696d(oVar);
                break;
            case 3:
                this.f2011f.onResume(oVar);
                break;
            case 4:
                this.f2011f.mo2694b(oVar);
                break;
            case 5:
                this.f2011f.mo2695c(oVar);
                break;
            case 6:
                this.f2011f.onDestroy(oVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C0488m mVar = this.f2012g;
        if (mVar != null) {
            mVar.mo14a(oVar, aVar);
        }
    }
}
