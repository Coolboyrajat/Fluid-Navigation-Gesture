package kotlinx.coroutines.internal;

import kotlinx.coroutines.C3537t1;

/* renamed from: kotlinx.coroutines.internal.m */
public final class C3479m {

    /* renamed from: a */
    private static final boolean f8191a = C3488v.m12585a("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: b */
    public static final C3537t1 f8192b;

    static {
        C3479m mVar = new C3479m();
        f8192b = mVar.m12553a();
    }

    private C3479m() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        r2 = kotlinx.coroutines.internal.C3480n.m12554a(r4, r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.C3537t1 m12553a() {
        /*
            r8 = this;
            r0 = 2
            r1 = 0
            boolean r2 = f8191a     // Catch:{ all -> 0x007c }
            if (r2 == 0) goto L_0x0018
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r2 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            kotlinx.coroutines.internal.g r3 = kotlinx.coroutines.internal.C3470g.f8174a     // Catch:{ all -> 0x007c }
            java.lang.ClassLoader r4 = r2.getClassLoader()     // Catch:{ all -> 0x007c }
            java.lang.String r5 = "clz.classLoader"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r4, (java.lang.String) r5)     // Catch:{ all -> 0x007c }
            java.util.List r2 = r3.mo10227a(r2, r4)     // Catch:{ all -> 0x007c }
            goto L_0x0038
        L_0x0018:
            r2 = 1
            kotlinx.coroutines.internal.MainDispatcherFactory[] r2 = new kotlinx.coroutines.internal.MainDispatcherFactory[r2]     // Catch:{ all -> 0x007c }
            r3 = 0
            kotlinx.coroutines.android.AndroidDispatcherFactory r4 = new kotlinx.coroutines.android.AndroidDispatcherFactory     // Catch:{ all -> 0x007c }
            r4.<init>()     // Catch:{ all -> 0x007c }
            r2[r3] = r4     // Catch:{ all -> 0x007c }
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ all -> 0x007c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x007c }
            java.lang.String r3 = "ServiceLoader.load(\n    …             ).iterator()"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r2, (java.lang.String) r3)     // Catch:{ all -> 0x007c }
            kotlin.c0.d r2 = kotlin.p193c0.C3225h.m11875a(r2)     // Catch:{ all -> 0x007c }
            java.util.List r2 = kotlin.p193c0.C3228j.m11886d(r2)     // Catch:{ all -> 0x007c }
        L_0x0038:
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x007c }
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x007c }
            if (r4 != 0) goto L_0x0044
            r4 = r1
            goto L_0x006b
        L_0x0044:
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x007c }
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x007c }
            if (r5 != 0) goto L_0x004f
            goto L_0x006b
        L_0x004f:
            r5 = r4
            kotlinx.coroutines.internal.MainDispatcherFactory r5 = (kotlinx.coroutines.internal.MainDispatcherFactory) r5     // Catch:{ all -> 0x007c }
            int r5 = r5.getLoadPriority()     // Catch:{ all -> 0x007c }
        L_0x0056:
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x007c }
            r7 = r6
            kotlinx.coroutines.internal.MainDispatcherFactory r7 = (kotlinx.coroutines.internal.MainDispatcherFactory) r7     // Catch:{ all -> 0x007c }
            int r7 = r7.getLoadPriority()     // Catch:{ all -> 0x007c }
            if (r5 >= r7) goto L_0x0065
            r4 = r6
            r5 = r7
        L_0x0065:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x007c }
            if (r6 != 0) goto L_0x0056
        L_0x006b:
            kotlinx.coroutines.internal.MainDispatcherFactory r4 = (kotlinx.coroutines.internal.MainDispatcherFactory) r4     // Catch:{ all -> 0x007c }
            if (r4 == 0) goto L_0x0076
            kotlinx.coroutines.t1 r2 = kotlinx.coroutines.internal.C3480n.m12554a(r4, r2)     // Catch:{ all -> 0x007c }
            if (r2 == 0) goto L_0x0076
            goto L_0x0083
        L_0x0076:
            kotlinx.coroutines.internal.o r2 = new kotlinx.coroutines.internal.o     // Catch:{ all -> 0x007c }
            r2.<init>(r1, r1, r0, r1)     // Catch:{ all -> 0x007c }
            goto L_0x0083
        L_0x007c:
            r2 = move-exception
            kotlinx.coroutines.internal.o r3 = new kotlinx.coroutines.internal.o
            r3.<init>(r2, r1, r0, r1)
            r2 = r3
        L_0x0083:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C3479m.m12553a():kotlinx.coroutines.t1");
    }
}
