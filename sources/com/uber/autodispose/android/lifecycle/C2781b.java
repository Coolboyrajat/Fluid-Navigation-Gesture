package com.uber.autodispose.android.lifecycle;

import androidx.lifecycle.C0481i;
import androidx.lifecycle.C0490o;
import p054c.p125i.p126a.p129r.C1553d;
import p054c.p125i.p126a.p129r.C1554e;
import p054c.p125i.p126a.p129r.C1556g;
import p054c.p125i.p126a.p129r.C1557h;
import p155d.p156a.C2786d;
import p155d.p156a.C2790h;

/* renamed from: com.uber.autodispose.android.lifecycle.b */
public final class C2781b implements C1556g<C0481i.C0482a> {

    /* renamed from: c */
    private static final C1553d<C0481i.C0482a> f7372c = C2780a.f7371a;

    /* renamed from: a */
    private final C1553d<C0481i.C0482a> f7373a;

    /* renamed from: b */
    private final LifecycleEventsObservable f7374b;

    /* renamed from: com.uber.autodispose.android.lifecycle.b$a */
    static /* synthetic */ class C2782a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7375a = new int[C0481i.C0482a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.lifecycle.i$a[] r0 = androidx.lifecycle.C0481i.C0482a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7375a = r0
                int[] r0 = f7375a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f7375a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_START     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f7375a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f7375a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f7375a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f7375a     // Catch:{ NoSuchFieldError -> 0x004b }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uber.autodispose.android.lifecycle.C2781b.C2782a.<clinit>():void");
        }
    }

    private C2781b(C0481i iVar, C1553d<C0481i.C0482a> dVar) {
        this.f7374b = new LifecycleEventsObservable(iVar);
        this.f7373a = dVar;
    }

    /* renamed from: a */
    static /* synthetic */ C0481i.C0482a m10968a(C0481i.C0482a aVar) {
        int i = C2782a.f7375a[aVar.ordinal()];
        if (i == 1) {
            return C0481i.C0482a.ON_DESTROY;
        }
        if (i == 2) {
            return C0481i.C0482a.ON_STOP;
        }
        if (i == 3) {
            return C0481i.C0482a.ON_PAUSE;
        }
        if (i == 4) {
            return C0481i.C0482a.ON_STOP;
        }
        throw new C1554e("Lifecycle has ended! Last event was " + aVar);
    }

    /* renamed from: a */
    public static C2781b m10969a(C0481i iVar) {
        return m10970a(iVar, f7372c);
    }

    /* renamed from: a */
    public static C2781b m10970a(C0481i iVar, C1553d<C0481i.C0482a> dVar) {
        return new C2781b(iVar, dVar);
    }

    /* renamed from: a */
    public static C2781b m10971a(C0490o oVar) {
        return m10969a(oVar.mo5a());
    }

    /* renamed from: a */
    public C0481i.C0482a m10973a() {
        this.f7374b.mo8895g();
        return this.f7374b.mo8896h();
    }

    /* renamed from: b */
    public C2786d mo6023b() {
        return C1557h.m6856a(this);
    }

    /* renamed from: c */
    public C1553d<C0481i.C0482a> mo6046c() {
        return this.f7373a;
    }

    /* renamed from: d */
    public C2790h<C0481i.C0482a> mo6047d() {
        return this.f7374b;
    }
}
