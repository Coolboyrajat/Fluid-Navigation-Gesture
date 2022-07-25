package p054c.p083e.p104c.p106w.p107n;

import java.util.ArrayList;
import p054c.p083e.p104c.C1271e;
import p054c.p083e.p104c.C1294t;
import p054c.p083e.p104c.C1296u;
import p054c.p083e.p104c.p106w.C1327h;
import p054c.p083e.p104c.p110x.C1417a;
import p054c.p083e.p104c.p111y.C1418a;
import p054c.p083e.p104c.p111y.C1420b;
import p054c.p083e.p104c.p111y.C1421c;

/* renamed from: c.e.c.w.n.h */
public final class C1359h extends C1294t<Object> {

    /* renamed from: b */
    public static final C1296u f4245b = new C1360a();

    /* renamed from: a */
    private final C1271e f4246a;

    /* renamed from: c.e.c.w.n.h$a */
    static class C1360a implements C1296u {
        C1360a() {
        }

        /* renamed from: a */
        public <T> C1294t<T> mo5688a(C1271e eVar, C1417a<T> aVar) {
            if (aVar.mo5855a() == Object.class) {
                return new C1359h(eVar);
            }
            return null;
        }
    }

    /* renamed from: c.e.c.w.n.h$b */
    static /* synthetic */ class C1361b {

        /* renamed from: a */
        static final /* synthetic */ int[] f4247a = new int[C1420b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                c.e.c.y.b[] r0 = p054c.p083e.p104c.p111y.C1420b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4247a = r0
                int[] r0 = f4247a     // Catch:{ NoSuchFieldError -> 0x0014 }
                c.e.c.y.b r1 = p054c.p083e.p104c.p111y.C1420b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f4247a     // Catch:{ NoSuchFieldError -> 0x001f }
                c.e.c.y.b r1 = p054c.p083e.p104c.p111y.C1420b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f4247a     // Catch:{ NoSuchFieldError -> 0x002a }
                c.e.c.y.b r1 = p054c.p083e.p104c.p111y.C1420b.STRING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f4247a     // Catch:{ NoSuchFieldError -> 0x0035 }
                c.e.c.y.b r1 = p054c.p083e.p104c.p111y.C1420b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f4247a     // Catch:{ NoSuchFieldError -> 0x0040 }
                c.e.c.y.b r1 = p054c.p083e.p104c.p111y.C1420b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f4247a     // Catch:{ NoSuchFieldError -> 0x004b }
                c.e.c.y.b r1 = p054c.p083e.p104c.p111y.C1420b.NULL     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p054c.p083e.p104c.p106w.p107n.C1359h.C1361b.<clinit>():void");
        }
    }

    C1359h(C1271e eVar) {
        this.f4246a = eVar;
    }

    /* renamed from: a */
    public Object mo5644a(C1418a aVar) {
        switch (C1361b.f4247a[aVar.mo5789q().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.mo5775a();
                while (aVar.mo5781g()) {
                    arrayList.add(mo5644a(aVar));
                }
                aVar.mo5778d();
                return arrayList;
            case 2:
                C1327h hVar = new C1327h();
                aVar.mo5776b();
                while (aVar.mo5781g()) {
                    hVar.put(aVar.mo5786n(), mo5644a(aVar));
                }
                aVar.mo5779e();
                return hVar;
            case 3:
                return aVar.mo5788p();
            case 4:
                return Double.valueOf(aVar.mo5783k());
            case 5:
                return Boolean.valueOf(aVar.mo5782j());
            case 6:
                aVar.mo5787o();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo5646a(C1421c cVar, Object obj) {
        if (obj == null) {
            cVar.mo5807h();
            return;
        }
        C1294t<?> a = this.f4246a.mo5629a(obj.getClass());
        if (a instanceof C1359h) {
            cVar.mo5800b();
            cVar.mo5804d();
            return;
        }
        a.mo5646a(cVar, obj);
    }
}
