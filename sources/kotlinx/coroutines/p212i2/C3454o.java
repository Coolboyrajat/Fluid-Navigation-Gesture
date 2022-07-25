package kotlinx.coroutines.p212i2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: kotlinx.coroutines.i2.o */
public final class C3454o {

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f8152b;

    /* renamed from: c */
    static final AtomicIntegerFieldUpdater f8153c;

    /* renamed from: d */
    static final AtomicIntegerFieldUpdater f8154d;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final AtomicReferenceArray<C3448i> f8155a = new AtomicReferenceArray<>(PropertyFlags.ID_SELF_ASSIGNABLE);
    volatile int consumerIndex = 0;
    private volatile Object lastScheduledTask = null;
    volatile int producerIndex = 0;

    static {
        Class<C3454o> cls = C3454o.class;
        f8152b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f8153c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f8154d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
    }

    /* renamed from: a */
    private final void m12458a(C3444e eVar, C3448i iVar) {
        if (!eVar.mo10240a(iVar)) {
            throw new IllegalStateException("GlobalQueue could not be closed yet".toString());
        }
    }

    /* renamed from: a */
    private final boolean m12459a(long j, C3454o oVar, C3444e eVar) {
        C3448i iVar = (C3448i) oVar.lastScheduledTask;
        if (iVar == null || j - iVar.f8140f < C3452m.f8146a || !f8152b.compareAndSet(oVar, iVar, (Object) null)) {
            return false;
        }
        mo10200a(iVar, eVar);
        return true;
    }

    /* renamed from: a */
    private final boolean m12460a(C3448i iVar) {
        if (mo10198a() == 127) {
            return false;
        }
        int i = this.producerIndex & 127;
        if (this.f8155a.get(i) != null) {
            return false;
        }
        this.f8155a.lazySet(i, iVar);
        f8153c.incrementAndGet(this);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: kotlinx.coroutines.i2.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m12461b(kotlinx.coroutines.p212i2.C3444e r8) {
        /*
            r7 = this;
            int r0 = r7.mo10198a()
            int r0 = r0 / 2
            r1 = 1
            int r0 = kotlin.p191a0.C3198h.m11846a((int) r0, (int) r1)
            r1 = 0
        L_0x000c:
            if (r1 >= r0) goto L_0x0043
        L_0x000e:
            int r2 = r7.consumerIndex
            int r3 = r7.producerIndex
            int r3 = r2 - r3
            r4 = 0
            if (r3 != 0) goto L_0x0018
            goto L_0x003b
        L_0x0018:
            r3 = r2 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r7.f8155a
            java.lang.Object r5 = r5.get(r3)
            kotlinx.coroutines.i2.i r5 = (kotlinx.coroutines.p212i2.C3448i) r5
            if (r5 == 0) goto L_0x000e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = f8154d
            int r6 = r2 + 1
            boolean r2 = r5.compareAndSet(r7, r2, r6)
            if (r2 == 0) goto L_0x000e
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r7.f8155a
            java.lang.Object r2 = r2.getAndSet(r3, r4)
            r4 = r2
            kotlinx.coroutines.i2.i r4 = (kotlinx.coroutines.p212i2.C3448i) r4
        L_0x003b:
            if (r4 == 0) goto L_0x0043
            r7.m12458a((kotlinx.coroutines.p212i2.C3444e) r8, (kotlinx.coroutines.p212i2.C3448i) r4)
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p212i2.C3454o.m12461b(kotlinx.coroutines.i2.e):void");
    }

    /* renamed from: a */
    public final int mo10198a() {
        return this.producerIndex - this.consumerIndex;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r0 = (kotlinx.coroutines.p212i2.C3448i) m12457a(r5).getAndSet(r2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (r0 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x000e, code lost:
        if (r0 != null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        m12458a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r0 = r5.consumerIndex;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if ((r0 - r5.producerIndex) != 0) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r2 = r0 & 127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (((kotlinx.coroutines.p212i2.C3448i) m12457a(r5).get(r2)) == null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (f8154d.compareAndSet(r5, r0, r0 + 1) == false) goto L_0x0013;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10199a(kotlinx.coroutines.p212i2.C3444e r6) {
        /*
            r5 = this;
            java.lang.String r0 = "globalQueue"
            kotlin.p205x.p207d.C3370k.m12227b(r6, r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f8152b
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r5, r1)
            kotlinx.coroutines.i2.i r0 = (kotlinx.coroutines.p212i2.C3448i) r0
            if (r0 == 0) goto L_0x0013
        L_0x0010:
            r5.m12458a((kotlinx.coroutines.p212i2.C3444e) r6, (kotlinx.coroutines.p212i2.C3448i) r0)
        L_0x0013:
            int r0 = r5.consumerIndex
            int r2 = r5.producerIndex
            int r2 = r0 - r2
            if (r2 != 0) goto L_0x001d
            r0 = r1
            goto L_0x003f
        L_0x001d:
            r2 = r0 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.f8155a
            java.lang.Object r3 = r3.get(r2)
            kotlinx.coroutines.i2.i r3 = (kotlinx.coroutines.p212i2.C3448i) r3
            if (r3 == 0) goto L_0x0013
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = f8154d
            int r4 = r0 + 1
            boolean r0 = r3.compareAndSet(r5, r0, r4)
            if (r0 == 0) goto L_0x0013
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.f8155a
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            kotlinx.coroutines.i2.i r0 = (kotlinx.coroutines.p212i2.C3448i) r0
        L_0x003f:
            if (r0 == 0) goto L_0x0042
            goto L_0x0010
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p212i2.C3454o.mo10199a(kotlinx.coroutines.i2.e):void");
    }

    /* renamed from: a */
    public final boolean mo10200a(C3448i iVar, C3444e eVar) {
        C3370k.m12227b(iVar, "task");
        C3370k.m12227b(eVar, "globalQueue");
        C3448i iVar2 = (C3448i) f8152b.getAndSet(this, iVar);
        if (iVar2 != null) {
            return mo10203b(iVar2, eVar);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: kotlinx.coroutines.i2.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo10201a(kotlinx.coroutines.p212i2.C3454o r19, kotlinx.coroutines.p212i2.C3444e r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "victim"
            kotlin.p205x.p207d.C3370k.m12227b(r1, r3)
            java.lang.String r3 = "globalQueue"
            kotlin.p205x.p207d.C3370k.m12227b(r2, r3)
            kotlinx.coroutines.i2.n r3 = kotlinx.coroutines.p212i2.C3452m.f8151f
            long r3 = r3.mo10194a()
            int r5 = r19.mo10198a()
            if (r5 != 0) goto L_0x0021
            boolean r1 = r0.m12459a(r3, r1, r2)
            return r1
        L_0x0021:
            int r5 = r5 / 2
            r6 = 1
            int r5 = kotlin.p191a0.C3198h.m11846a((int) r5, (int) r6)
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x002b:
            if (r8 >= r5) goto L_0x007c
        L_0x002d:
            int r10 = r1.consumerIndex
            int r11 = r1.producerIndex
            int r11 = r10 - r11
            r12 = 0
            if (r11 != 0) goto L_0x0037
            goto L_0x0073
        L_0x0037:
            r11 = r10 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r13 = r19.f8155a
            java.lang.Object r13 = r13.get(r11)
            kotlinx.coroutines.i2.i r13 = (kotlinx.coroutines.p212i2.C3448i) r13
            if (r13 == 0) goto L_0x002d
            long r13 = r13.f8140f
            long r13 = r3 - r13
            long r15 = kotlinx.coroutines.p212i2.C3452m.f8146a
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L_0x005a
            int r13 = r19.mo10198a()
            int r14 = kotlinx.coroutines.p212i2.C3452m.f8147b
            if (r13 <= r14) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r13 = 0
            goto L_0x005b
        L_0x005a:
            r13 = 1
        L_0x005b:
            if (r13 != 0) goto L_0x005e
            goto L_0x0073
        L_0x005e:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = f8154d
            int r14 = r10 + 1
            boolean r10 = r13.compareAndSet(r1, r10, r14)
            if (r10 == 0) goto L_0x002d
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r19.f8155a
            java.lang.Object r10 = r10.getAndSet(r11, r12)
            r12 = r10
            kotlinx.coroutines.i2.i r12 = (kotlinx.coroutines.p212i2.C3448i) r12
        L_0x0073:
            if (r12 == 0) goto L_0x007c
            r0.mo10200a((kotlinx.coroutines.p212i2.C3448i) r12, (kotlinx.coroutines.p212i2.C3444e) r2)
            int r8 = r8 + 1
            r9 = 1
            goto L_0x002b
        L_0x007c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p212i2.C3454o.mo10201a(kotlinx.coroutines.i2.o, kotlinx.coroutines.i2.e):boolean");
    }

    /* renamed from: b */
    public final C3448i mo10202b() {
        C3448i iVar = (C3448i) f8152b.getAndSet(this, (Object) null);
        if (iVar != null) {
            return iVar;
        }
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (((C3448i) this.f8155a.get(i2)) != null && f8154d.compareAndSet(this, i, i + 1)) {
                return (C3448i) this.f8155a.getAndSet(i2, (Object) null);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo10203b(C3448i iVar, C3444e eVar) {
        C3370k.m12227b(iVar, "task");
        C3370k.m12227b(eVar, "globalQueue");
        boolean z = true;
        while (!m12460a(iVar)) {
            m12461b(eVar);
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public final int mo10204c() {
        return this.lastScheduledTask != null ? mo10198a() + 1 : mo10198a();
    }
}
