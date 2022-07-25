package kotlinx.coroutines.p212i2;

import kotlinx.coroutines.internal.C3475k;

/* renamed from: kotlinx.coroutines.i2.e */
public class C3444e extends C3475k<C3448i> {
    public C3444e() {
        super(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        r7 = r9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.p212i2.C3448i mo10189a(kotlinx.coroutines.p212i2.C3451l r12) {
        /*
            r11 = this;
            java.lang.String r0 = "mode"
            kotlin.p205x.p207d.C3370k.m12227b(r12, r0)
        L_0x0005:
            java.lang.Object r0 = r11._cur$internal
            kotlinx.coroutines.internal.l r0 = (kotlinx.coroutines.internal.C3476l) r0
        L_0x0009:
            long r3 = r0._state$internal
            r1 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r5 = 0
            r7 = 0
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x0019
            kotlinx.coroutines.internal.u r7 = kotlinx.coroutines.internal.C3476l.f8184g
            goto L_0x0090
        L_0x0019:
            kotlinx.coroutines.internal.l$a r1 = kotlinx.coroutines.internal.C3476l.f8185h
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            r5 = 0
            long r1 = r1 >> r5
            int r8 = (int) r1
            r1 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r1 = r1 & r3
            r6 = 30
            long r1 = r1 >> r6
            int r2 = (int) r1
            int r1 = r0.f8186a
            r1 = r1 & r2
            int r2 = r0.f8186a
            r2 = r2 & r8
            if (r1 != r2) goto L_0x0039
            goto L_0x0090
        L_0x0039:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f8187b
            int r2 = r0.f8186a
            r2 = r2 & r8
            java.lang.Object r9 = r1.get(r2)
            if (r9 != 0) goto L_0x004d
            boolean r1 = r0.f8189d
            if (r1 == 0) goto L_0x0009
            goto L_0x0090
        L_0x004d:
            boolean r1 = r9 instanceof kotlinx.coroutines.internal.C3476l.C3478b
            if (r1 == 0) goto L_0x0052
            goto L_0x0090
        L_0x0052:
            r1 = r9
            kotlinx.coroutines.i2.i r1 = (kotlinx.coroutines.p212i2.C3448i) r1
            kotlinx.coroutines.i2.l r1 = r1.mo10195b()
            if (r1 != r12) goto L_0x005c
            r5 = 1
        L_0x005c:
            if (r5 != 0) goto L_0x005f
            goto L_0x0090
        L_0x005f:
            int r1 = r8 + 1
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            r10 = r1 & r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.C3476l.f8183f
            kotlinx.coroutines.internal.l$a r2 = kotlinx.coroutines.internal.C3476l.f8185h
            long r5 = r2.mo10250a((long) r3, (int) r10)
            r2 = r0
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L_0x0080
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f8187b
            int r2 = r0.f8186a
            r2 = r2 & r8
            r1.set(r2, r7)
            goto L_0x008f
        L_0x0080:
            boolean r1 = r0.f8189d
            if (r1 != 0) goto L_0x0087
            goto L_0x0009
        L_0x0087:
            r1 = r0
        L_0x0088:
            kotlinx.coroutines.internal.l r1 = r1.m12536a((int) r8, (int) r10)
            if (r1 == 0) goto L_0x008f
            goto L_0x0088
        L_0x008f:
            r7 = r9
        L_0x0090:
            kotlinx.coroutines.internal.u r1 = kotlinx.coroutines.internal.C3476l.f8184g
            if (r7 == r1) goto L_0x0097
            kotlinx.coroutines.i2.i r7 = (kotlinx.coroutines.p212i2.C3448i) r7
            return r7
        L_0x0097:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C3475k.f8181a
            kotlinx.coroutines.internal.l r2 = r0.mo10247d()
            r1.compareAndSet(r11, r0, r2)
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p212i2.C3444e.mo10189a(kotlinx.coroutines.i2.l):kotlinx.coroutines.i2.i");
    }
}
