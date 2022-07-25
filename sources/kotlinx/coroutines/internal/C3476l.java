package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C3498j0;

/* renamed from: kotlinx.coroutines.internal.l */
public final class C3476l<E> {

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater f8182e;

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f8183f;

    /* renamed from: g */
    public static final C3487u f8184g = new C3487u("REMOVE_FROZEN");

    /* renamed from: h */
    public static final C3477a f8185h = new C3477a((C3366g) null);
    private volatile Object _next = null;
    public volatile /* synthetic */ long _state$internal = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f8186a;

    /* renamed from: b */
    public /* synthetic */ AtomicReferenceArray f8187b;

    /* renamed from: c */
    private final int f8188c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final boolean f8189d;

    /* renamed from: kotlinx.coroutines.internal.l$a */
    public static final class C3477a {
        private C3477a() {
        }

        public /* synthetic */ C3477a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final int mo10249a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: a */
        public final long mo10250a(long j, int i) {
            return mo10251a(j, 1073741823) | (((long) i) << 0);
        }

        /* renamed from: a */
        public final long mo10251a(long j, long j2) {
            return j & (~j2);
        }

        /* renamed from: b */
        public final long mo10252b(long j, int i) {
            return mo10251a(j, 1152921503533105152L) | (((long) i) << 30);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.l$b */
    public static final class C3478b {

        /* renamed from: a */
        public final int f8190a;

        public C3478b(int i) {
            this.f8190a = i;
        }
    }

    static {
        Class<C3476l> cls = C3476l.class;
        f8182e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f8183f = AtomicLongFieldUpdater.newUpdater(cls, "_state$internal");
    }

    public C3476l(int i, boolean z) {
        this.f8188c = i;
        this.f8189d = z;
        int i2 = this.f8188c;
        this.f8186a = i2 - 1;
        this.f8187b = new AtomicReferenceArray(i2);
        boolean z2 = false;
        if (this.f8186a <= 1073741823) {
            if (!((this.f8188c & this.f8186a) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C3476l<E> m12536a(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state$internal;
            boolean z = false;
            i3 = (int) ((1073741823 & j) >> 0);
            if (C3498j0.m12618a()) {
                if (i3 == i) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j) != 0) {
                return mo10247d();
            }
        } while (!f8183f.compareAndSet(this, j, f8185h.mo10250a(j, i2)));
        this.f8187b.set(this.f8186a & i3, (Object) null);
        return null;
    }

    /* renamed from: a */
    private final C3476l<E> m12537a(int i, E e) {
        Object obj = this.f8187b.get(this.f8186a & i);
        if (!(obj instanceof C3478b) || ((C3478b) obj).f8190a != i) {
            return null;
        }
        this.f8187b.set(i & this.f8186a, e);
        return this;
    }

    /* renamed from: a */
    private final C3476l<E> m12538a(long j) {
        C3476l<E> lVar = new C3476l<>(this.f8188c * 2, this.f8189d);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f8186a;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f8187b.get(i3 & i);
                if (obj == null) {
                    obj = new C3478b(i);
                }
                lVar.f8187b.set(lVar.f8186a & i, obj);
                i++;
            } else {
                lVar._state$internal = f8185h.mo10251a(j, 1152921504606846976L);
                return lVar;
            }
        }
    }

    /* renamed from: b */
    private final C3476l<E> m12540b(long j) {
        while (true) {
            C3476l<E> lVar = (C3476l) this._next;
            if (lVar != null) {
                return lVar;
            }
            f8182e.compareAndSet(this, (Object) null, m12538a(j));
        }
    }

    /* renamed from: f */
    private final long m12542f() {
        long j;
        long j2;
        do {
            j = this._state$internal;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f8183f.compareAndSet(this, j, j2));
        return j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c A[LOOP:1: B:20:0x006c->B:23:0x007e, LOOP_START, PHI: r1 
      PHI: (r1v7 kotlinx.coroutines.internal.l) = (r1v6 kotlinx.coroutines.internal.l), (r1v9 kotlinx.coroutines.internal.l) binds: [B:19:0x0064, B:23:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo10243a(E r13) {
        /*
            r12 = this;
            java.lang.String r0 = "element"
            kotlin.p205x.p207d.C3370k.m12227b(r13, r0)
        L_0x0005:
            long r3 = r12._state$internal
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r3
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0017
            kotlinx.coroutines.internal.l$a r13 = f8185h
            int r13 = r13.mo10249a(r3)
            return r13
        L_0x0017:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r3
            r9 = 0
            long r0 = r0 >> r9
            int r1 = (int) r0
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r0 = 30
            long r5 = r5 >> r0
            int r0 = (int) r5
            int r10 = r12.f8186a
            int r2 = r0 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L_0x0033
            return r6
        L_0x0033:
            boolean r2 = r12.f8189d
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L_0x0051
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.f8187b
            r11 = r0 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x0051
            int r2 = r12.f8188c
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L_0x0050
            int r0 = r0 - r1
            r0 = r0 & r5
            int r1 = r2 >> 1
            if (r0 <= r1) goto L_0x0005
        L_0x0050:
            return r6
        L_0x0051:
            int r1 = r0 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f8183f
            kotlinx.coroutines.internal.l$a r5 = f8185h
            long r5 = r5.mo10252b(r3, r1)
            r1 = r2
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L_0x0005
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r12.f8187b
            r2 = r0 & r10
            r1.set(r2, r13)
            r1 = r12
        L_0x006c:
            long r2 = r1._state$internal
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r2 = r2 & r4
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0076
            goto L_0x0081
        L_0x0076:
            kotlinx.coroutines.internal.l r1 = r1.mo10247d()
            kotlinx.coroutines.internal.l r1 = r1.m12537a((int) r0, r13)
            if (r1 == 0) goto L_0x0081
            goto L_0x006c
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C3476l.mo10243a(java.lang.Object):int");
    }

    /* renamed from: a */
    public final boolean mo10244a() {
        long j;
        do {
            j = this._state$internal;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f8183f.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: b */
    public final int mo10245b() {
        long j = this._state$internal;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    /* renamed from: c */
    public final boolean mo10246c() {
        long j = this._state$internal;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: d */
    public final C3476l<E> mo10247d() {
        return m12540b(m12542f());
    }

    /* renamed from: e */
    public final Object mo10248e() {
        Object obj;
        while (true) {
            long j = this._state$internal;
            if ((1152921504606846976L & j) == 0) {
                int i = (int) ((1073741823 & j) >> 0);
                if ((this.f8186a & ((int) ((1152921503533105152L & j) >> 30))) != (this.f8186a & i)) {
                    obj = this.f8187b.get(this.f8186a & i);
                    if (obj != null) {
                        if (!(obj instanceof C3478b)) {
                            int i2 = (i + 1) & 1073741823;
                            if (!f8183f.compareAndSet(this, j, f8185h.mo10250a(j, i2))) {
                                if (this.f8189d) {
                                    C3476l lVar = this;
                                    do {
                                        lVar = lVar.m12536a(i, i2);
                                    } while (lVar != null);
                                    break;
                                }
                            } else {
                                this.f8187b.set(this.f8186a & i, (Object) null);
                                break;
                            }
                        } else {
                            return null;
                        }
                    } else if (this.f8189d) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return f8184g;
            }
        }
        return obj;
    }
}
