package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: kotlinx.coroutines.k */
public final class C3503k extends C3529r {

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f8216c = AtomicIntegerFieldUpdater.newUpdater(C3503k.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3503k(kotlin.p197u.C3309c<?> r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "continuation"
            kotlin.p205x.p207d.C3370k.m12227b(r3, r0)
            if (r4 == 0) goto L_0x0008
            goto L_0x0023
        L_0x0008:
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L_0x0023:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C3503k.<init>(kotlin.u.c, java.lang.Throwable, boolean):void");
    }

    /* renamed from: c */
    public final boolean mo10274c() {
        return f8216c.compareAndSet(this, 0, 1);
    }
}
