package androidx.lifecycle;

import androidx.lifecycle.C0481i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p006b.p015b.p016a.p018b.C0704a;
import p006b.p015b.p016a.p018b.C0705b;

/* renamed from: androidx.lifecycle.p */
public class C0491p extends C0481i {

    /* renamed from: a */
    private C0704a<C0489n, C0493b> f2050a = new C0704a<>();

    /* renamed from: b */
    private C0481i.C0483b f2051b;

    /* renamed from: c */
    private final WeakReference<C0490o> f2052c;

    /* renamed from: d */
    private int f2053d = 0;

    /* renamed from: e */
    private boolean f2054e = false;

    /* renamed from: f */
    private boolean f2055f = false;

    /* renamed from: g */
    private ArrayList<C0481i.C0483b> f2056g = new ArrayList<>();

    /* renamed from: androidx.lifecycle.p$a */
    static /* synthetic */ class C0492a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2057a = new int[C0481i.C0482a.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f2058b = new int[C0481i.C0483b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0086 */
        static {
            /*
                androidx.lifecycle.i$b[] r0 = androidx.lifecycle.C0481i.C0483b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2058b = r0
                r0 = 1
                int[] r1 = f2058b     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.lifecycle.i$b r2 = androidx.lifecycle.C0481i.C0483b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f2058b     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.lifecycle.i$b r3 = androidx.lifecycle.C0481i.C0483b.CREATED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f2058b     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.lifecycle.i$b r4 = androidx.lifecycle.C0481i.C0483b.STARTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f2058b     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.lifecycle.i$b r5 = androidx.lifecycle.C0481i.C0483b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 5
                int[] r5 = f2058b     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.lifecycle.i$b r6 = androidx.lifecycle.C0481i.C0483b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                androidx.lifecycle.i$a[] r5 = androidx.lifecycle.C0481i.C0482a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f2057a = r5
                int[] r5 = f2057a     // Catch:{ NoSuchFieldError -> 0x0053 }
                androidx.lifecycle.i$a r6 = androidx.lifecycle.C0481i.C0482a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = f2057a     // Catch:{ NoSuchFieldError -> 0x005d }
                androidx.lifecycle.i$a r5 = androidx.lifecycle.C0481i.C0482a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x005d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                int[] r0 = f2057a     // Catch:{ NoSuchFieldError -> 0x0067 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_START     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = f2057a     // Catch:{ NoSuchFieldError -> 0x0071 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r0 = f2057a     // Catch:{ NoSuchFieldError -> 0x007b }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x007b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = f2057a     // Catch:{ NoSuchFieldError -> 0x0086 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = f2057a     // Catch:{ NoSuchFieldError -> 0x0091 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0481i.C0482a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0491p.C0492a.<clinit>():void");
        }
    }

    /* renamed from: androidx.lifecycle.p$b */
    static class C0493b {

        /* renamed from: a */
        C0481i.C0483b f2059a;

        /* renamed from: b */
        C0488m f2060b;

        C0493b(C0489n nVar, C0481i.C0483b bVar) {
            this.f2060b = C0495r.m2463a((Object) nVar);
            this.f2059a = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2710a(C0490o oVar, C0481i.C0482a aVar) {
            C0481i.C0483b b = C0491p.m2444b(aVar);
            this.f2059a = C0491p.m2442a(this.f2059a, b);
            this.f2060b.mo14a(oVar, aVar);
            this.f2059a = b;
        }
    }

    public C0491p(C0490o oVar) {
        this.f2052c = new WeakReference<>(oVar);
        this.f2051b = C0481i.C0483b.INITIALIZED;
    }

    /* renamed from: a */
    static C0481i.C0483b m2442a(C0481i.C0483b bVar, C0481i.C0483b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: a */
    private void m2443a(C0490o oVar) {
        Iterator<Map.Entry<C0489n, C0493b>> a = this.f2050a.mo3969a();
        while (a.hasNext() && !this.f2055f) {
            Map.Entry next = a.next();
            C0493b bVar = (C0493b) next.getValue();
            while (bVar.f2059a.compareTo(this.f2051b) > 0 && !this.f2055f && this.f2050a.contains(next.getKey())) {
                C0481i.C0482a c = m2447c(bVar.f2059a);
                m2452e(m2444b(c));
                bVar.mo2710a(oVar, c);
                m2449c();
            }
        }
    }

    /* renamed from: b */
    static C0481i.C0483b m2444b(C0481i.C0482a aVar) {
        switch (C0492a.f2057a[aVar.ordinal()]) {
            case 1:
            case 2:
                return C0481i.C0483b.CREATED;
            case 3:
            case 4:
                return C0481i.C0483b.STARTED;
            case 5:
                return C0481i.C0483b.RESUMED;
            case 6:
                return C0481i.C0483b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* renamed from: b */
    private void m2445b(C0490o oVar) {
        C0705b<K, V>.d c = this.f2050a.mo3971c();
        while (c.hasNext() && !this.f2055f) {
            Map.Entry entry = (Map.Entry) c.next();
            C0493b bVar = (C0493b) entry.getValue();
            while (bVar.f2059a.compareTo(this.f2051b) < 0 && !this.f2055f && this.f2050a.contains(entry.getKey())) {
                m2452e(bVar.f2059a);
                bVar.mo2710a(oVar, m2453f(bVar.f2059a));
                m2449c();
            }
        }
    }

    /* renamed from: b */
    private boolean m2446b() {
        if (this.f2050a.size() == 0) {
            return true;
        }
        C0481i.C0483b bVar = this.f2050a.mo3970b().getValue().f2059a;
        C0481i.C0483b bVar2 = this.f2050a.mo3972d().getValue().f2059a;
        return bVar == bVar2 && this.f2051b == bVar2;
    }

    /* renamed from: c */
    private static C0481i.C0482a m2447c(C0481i.C0483b bVar) {
        int i = C0492a.f2058b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return C0481i.C0482a.ON_DESTROY;
        } else {
            if (i == 3) {
                return C0481i.C0482a.ON_STOP;
            }
            if (i == 4) {
                return C0481i.C0482a.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    private C0481i.C0483b m2448c(C0489n nVar) {
        Map.Entry<C0489n, C0493b> b = this.f2050a.mo3965b(nVar);
        C0481i.C0483b bVar = null;
        C0481i.C0483b bVar2 = b != null ? b.getValue().f2059a : null;
        if (!this.f2056g.isEmpty()) {
            ArrayList<C0481i.C0483b> arrayList = this.f2056g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return m2442a(m2442a(this.f2051b, bVar2), bVar);
    }

    /* renamed from: c */
    private void m2449c() {
        ArrayList<C0481i.C0483b> arrayList = this.f2056g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: d */
    private void m2450d() {
        C0490o oVar = (C0490o) this.f2052c.get();
        if (oVar != null) {
            while (true) {
                boolean b = m2446b();
                this.f2055f = false;
                if (!b) {
                    if (this.f2051b.compareTo(this.f2050a.mo3970b().getValue().f2059a) < 0) {
                        m2443a(oVar);
                    }
                    Map.Entry<C0489n, C0493b> d = this.f2050a.mo3972d();
                    if (!this.f2055f && d != null && this.f2051b.compareTo(d.getValue().f2059a) > 0) {
                        m2445b(oVar);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    /* renamed from: d */
    private void m2451d(C0481i.C0483b bVar) {
        if (this.f2051b != bVar) {
            this.f2051b = bVar;
            if (this.f2054e || this.f2053d != 0) {
                this.f2055f = true;
                return;
            }
            this.f2054e = true;
            m2450d();
            this.f2054e = false;
        }
    }

    /* renamed from: e */
    private void m2452e(C0481i.C0483b bVar) {
        this.f2056g.add(bVar);
    }

    /* renamed from: f */
    private static C0481i.C0482a m2453f(C0481i.C0483b bVar) {
        int i = C0492a.f2058b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C0481i.C0482a.ON_START;
            }
            if (i == 3) {
                return C0481i.C0482a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return C0481i.C0482a.ON_CREATE;
    }

    /* renamed from: a */
    public C0481i.C0483b mo2700a() {
        return this.f2051b;
    }

    /* renamed from: a */
    public void mo2707a(C0481i.C0482a aVar) {
        m2451d(m2444b(aVar));
    }

    @Deprecated
    /* renamed from: a */
    public void mo2708a(C0481i.C0483b bVar) {
        mo2709b(bVar);
    }

    /* renamed from: a */
    public void mo2701a(C0489n nVar) {
        C0490o oVar;
        C0481i.C0483b bVar = this.f2051b;
        C0481i.C0483b bVar2 = C0481i.C0483b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = C0481i.C0483b.INITIALIZED;
        }
        C0493b bVar3 = new C0493b(nVar, bVar2);
        if (this.f2050a.mo3964b(nVar, bVar3) == null && (oVar = (C0490o) this.f2052c.get()) != null) {
            boolean z = this.f2053d != 0 || this.f2054e;
            C0481i.C0483b c = m2448c(nVar);
            this.f2053d++;
            while (bVar3.f2059a.compareTo(c) < 0 && this.f2050a.contains(nVar)) {
                m2452e(bVar3.f2059a);
                bVar3.mo2710a(oVar, m2453f(bVar3.f2059a));
                m2449c();
                c = m2448c(nVar);
            }
            if (!z) {
                m2450d();
            }
            this.f2053d--;
        }
    }

    /* renamed from: b */
    public void mo2709b(C0481i.C0483b bVar) {
        m2451d(bVar);
    }

    /* renamed from: b */
    public void mo2702b(C0489n nVar) {
        this.f2050a.remove(nVar);
    }
}
