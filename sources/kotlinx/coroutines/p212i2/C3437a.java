package kotlinx.coroutines.p212i2;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3411c2;
import kotlinx.coroutines.C3416d2;
import kotlinx.coroutines.C3498j0;
import kotlinx.coroutines.C3504k0;
import kotlinx.coroutines.internal.C3487u;

/* renamed from: kotlinx.coroutines.i2.a */
public final class C3437a implements Executor, Closeable {

    /* renamed from: n */
    private static final AtomicLongFieldUpdater f8094n = AtomicLongFieldUpdater.newUpdater(C3437a.class, "parkedWorkersStack");

    /* renamed from: o */
    static final AtomicLongFieldUpdater f8095o = AtomicLongFieldUpdater.newUpdater(C3437a.class, "controlState");

    /* renamed from: p */
    private static final AtomicIntegerFieldUpdater f8096p = AtomicIntegerFieldUpdater.newUpdater(C3437a.class, "_isTerminated");
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final int f8097q = C3490x.m12589a("kotlinx.coroutines.scheduler.spins", 1000, 1, 0, 8, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final int f8098r = (f8097q + C3490x.m12589a("kotlinx.coroutines.scheduler.yields", 0, 0, 0, 8, (Object) null));
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final int f8099s = ((int) TimeUnit.SECONDS.toNanos(1));
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final int f8100t = ((int) C3198h.m11850b(C3198h.m11848a(C3452m.f8146a / ((long) 4), 10), (long) f8099s));
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final C3487u f8101u = new C3487u("NOT_IN_STACK");
    private volatile int _isTerminated;
    volatile long controlState;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3444e f8102f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Semaphore f8103g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C3439b[] f8104h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Random f8105i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final int f8106j;

    /* renamed from: k */
    private final int f8107k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final long f8108l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final String f8109m;
    private volatile long parkedWorkersStack;

    /* renamed from: kotlinx.coroutines.i2.a$a */
    public static final class C3438a {
        private C3438a() {
        }

        public /* synthetic */ C3438a(C3366g gVar) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.i2.a$b */
    public final class C3439b extends Thread {

        /* renamed from: m */
        private static final AtomicIntegerFieldUpdater f8110m = AtomicIntegerFieldUpdater.newUpdater(C3439b.class, "terminationState");

        /* renamed from: f */
        private final C3454o f8111f;

        /* renamed from: g */
        private long f8112g;

        /* renamed from: h */
        private long f8113h;

        /* renamed from: i */
        private int f8114i;
        private volatile int indexInArray;

        /* renamed from: j */
        private int f8115j;

        /* renamed from: k */
        private int f8116k;
        private volatile Object nextParkedWorker;
        private volatile int spins;
        private volatile C3440c state;
        private volatile int terminationState;

        private C3439b() {
            setDaemon(true);
            this.f8111f = new C3454o();
            this.state = C3440c.RETIRING;
            this.terminationState = 0;
            this.nextParkedWorker = C3437a.f8101u;
            this.f8114i = C3437a.f8100t;
            this.f8115j = C3437a.this.f8105i.nextInt();
        }

        public C3439b(C3437a aVar, int i) {
            this();
            mo10174b(i);
        }

        /* renamed from: a */
        private final void m12416a(C3451l lVar) {
            if (lVar != C3451l.NON_BLOCKING) {
                C3437a.f8095o.addAndGet(C3437a.this, -2097152);
                C3440c cVar = this.state;
                if (cVar != C3440c.TERMINATED) {
                    if (C3498j0.m12618a()) {
                        if (!(cVar == C3440c.BLOCKING)) {
                            throw new AssertionError();
                        }
                    }
                    this.state = C3440c.RETIRING;
                }
            }
        }

        /* renamed from: a */
        private final void m12417a(C3451l lVar, long j) {
            if (lVar != C3451l.NON_BLOCKING) {
                C3437a.f8095o.addAndGet(C3437a.this, 2097152);
                if (mo10172a(C3440c.BLOCKING)) {
                    C3437a.this.m12410j();
                }
            } else if (C3437a.this.f8103g.availablePermits() != 0) {
                long a = C3452m.f8151f.mo10194a();
                long j2 = C3452m.f8146a;
                if (a - j >= j2 && a - this.f8113h >= j2 * ((long) 5)) {
                    this.f8113h = a;
                    C3437a.this.m12410j();
                }
            }
        }

        /* renamed from: a */
        private final boolean m12418a(long j) {
            C3437a.this.m12395b(this);
            if (!m12420k()) {
                return false;
            }
            LockSupport.parkNanos(j);
            return true;
        }

        /* renamed from: b */
        private final void m12419b(C3451l lVar) {
            this.f8112g = 0;
            this.f8116k = 0;
            if (this.state == C3440c.PARKING) {
                if (C3498j0.m12618a()) {
                    if (!(lVar == C3451l.PROBABLY_BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.state = C3440c.BLOCKING;
                this.f8114i = C3437a.f8100t;
            }
            this.spins = 0;
        }

        /* renamed from: k */
        private final boolean m12420k() {
            C3448i a = C3437a.this.f8102f.mo10189a(C3451l.PROBABLY_BLOCKING);
            if (a == null) {
                return true;
            }
            this.f8111f.mo10200a(a, C3437a.this.f8102f);
            return false;
        }

        /* renamed from: l */
        private final void m12421l() {
            mo10172a(C3440c.PARKING);
            if (m12420k()) {
                this.terminationState = 0;
                if (this.f8112g == 0) {
                    this.f8112g = System.nanoTime() + C3437a.this.f8108l;
                }
                if (m12418a(C3437a.this.f8108l) && System.nanoTime() - this.f8112g >= 0) {
                    this.f8112g = 0;
                    m12425p();
                }
            }
        }

        /* renamed from: m */
        private final void m12422m() {
            int i = this.spins;
            if (i <= C3437a.f8098r) {
                this.spins = i + 1;
                if (i >= C3437a.f8097q) {
                    Thread.yield();
                    return;
                }
                return;
            }
            if (this.f8114i < C3437a.f8099s) {
                this.f8114i = C3198h.m11849b((this.f8114i * 3) >>> 1, C3437a.f8099s);
            }
            mo10172a(C3440c.PARKING);
            m12418a((long) this.f8114i);
        }

        /* renamed from: n */
        private final C3448i m12423n() {
            C3448i iVar;
            C3448i a;
            boolean z = mo10169a(C3437a.this.f8106j * 2) == 0;
            if (z && (a = C3437a.this.f8102f.mo10189a(C3451l.NON_BLOCKING)) != null) {
                return a;
            }
            C3448i b = this.f8111f.mo10202b();
            return b != null ? b : (z || (iVar = (C3448i) C3437a.this.f8102f.mo10242c()) == null) ? m12424o() : iVar;
        }

        /* renamed from: o */
        private final C3448i m12424o() {
            int c = C3437a.this.m12406h();
            if (c < 2) {
                return null;
            }
            int i = this.f8116k;
            if (i == 0) {
                i = mo10169a(c);
            }
            int i2 = i + 1;
            if (i2 > c) {
                i2 = 1;
            }
            this.f8116k = i2;
            C3439b bVar = C3437a.this.f8104h[i2];
            if (bVar == null || bVar == this || !this.f8111f.mo10201a(bVar.f8111f, C3437a.this.f8102f)) {
                return null;
            }
            return this.f8111f.mo10202b();
        }

        /* renamed from: p */
        private final void m12425p() {
            synchronized (C3437a.this.f8104h) {
                if (!C3437a.this.isTerminated()) {
                    if (C3437a.this.m12406h() > C3437a.this.f8106j) {
                        if (m12420k()) {
                            if (f8110m.compareAndSet(this, 0, 1)) {
                                int i = this.indexInArray;
                                mo10174b(0);
                                C3437a.this.m12387a(this, i, 0);
                                int andDecrement = (int) (C3437a.f8095o.getAndDecrement(C3437a.this) & 2097151);
                                if (andDecrement != i) {
                                    C3439b bVar = C3437a.this.f8104h[andDecrement];
                                    if (bVar != null) {
                                        C3437a.this.f8104h[i] = bVar;
                                        bVar.mo10174b(i);
                                        C3437a.this.m12387a(bVar, andDecrement, i);
                                    } else {
                                        C3370k.m12221a();
                                        throw null;
                                    }
                                }
                                C3437a.this.f8104h[andDecrement] = null;
                                Unit unit = Unit.INSTANCE;
                                this.state = C3440c.TERMINATED;
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public final int mo10169a(int i) {
            int i2 = this.f8115j;
            this.f8115j = i2 ^ (i2 << 13);
            int i3 = this.f8115j;
            this.f8115j = i3 ^ (i3 >> 17);
            int i4 = this.f8115j;
            this.f8115j = i4 ^ (i4 << 5);
            int i5 = i - 1;
            return (i5 & i) == 0 ? this.f8115j & i5 : (this.f8115j & Integer.MAX_VALUE) % i;
        }

        /* renamed from: a */
        public final C3448i mo10170a() {
            if (mo10182i()) {
                return m12423n();
            }
            C3448i b = this.f8111f.mo10202b();
            return b != null ? b : C3437a.this.f8102f.mo10189a(C3451l.PROBABLY_BLOCKING);
        }

        /* renamed from: a */
        public final void mo10171a(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: a */
        public final boolean mo10172a(C3440c cVar) {
            C3370k.m12227b(cVar, "newState");
            C3440c cVar2 = this.state;
            boolean z = cVar2 == C3440c.CPU_ACQUIRED;
            if (z) {
                C3437a.this.f8103g.release();
            }
            if (cVar2 != cVar) {
                this.state = cVar;
            }
            return z;
        }

        /* renamed from: b */
        public final int mo10173b() {
            return this.indexInArray;
        }

        /* renamed from: b */
        public final void mo10174b(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(C3437a.this.f8109m);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: c */
        public final C3454o mo10175c() {
            return this.f8111f;
        }

        /* renamed from: d */
        public final Object mo10176d() {
            return this.nextParkedWorker;
        }

        /* renamed from: e */
        public final C3437a mo10177e() {
            return C3437a.this;
        }

        /* renamed from: f */
        public final void mo10178f() {
            this.f8114i = C3437a.f8100t;
            this.spins = 0;
        }

        /* renamed from: g */
        public final boolean mo10179g() {
            return this.state == C3440c.BLOCKING;
        }

        public final C3440c getState() {
            return this.state;
        }

        /* renamed from: h */
        public final boolean mo10181h() {
            return this.state == C3440c.PARKING;
        }

        /* renamed from: i */
        public final boolean mo10182i() {
            if (this.state == C3440c.CPU_ACQUIRED) {
                return true;
            }
            if (!C3437a.this.f8103g.tryAcquire()) {
                return false;
            }
            this.state = C3440c.CPU_ACQUIRED;
            return true;
        }

        /* renamed from: j */
        public final boolean mo10183j() {
            int i = this.terminationState;
            if (i == 1 || i == -1) {
                return false;
            }
            if (i == 0) {
                return f8110m.compareAndSet(this, 0, -1);
            }
            throw new IllegalStateException(("Invalid terminationState = " + i).toString());
        }

        public void run() {
            boolean z = false;
            while (!C3437a.this.isTerminated() && this.state != C3440c.TERMINATED) {
                C3448i a = mo10170a();
                if (a == null) {
                    if (this.state == C3440c.CPU_ACQUIRED) {
                        m12422m();
                    } else {
                        m12421l();
                    }
                    z = true;
                } else {
                    C3451l b = a.mo10195b();
                    if (z) {
                        m12419b(b);
                        z = false;
                    }
                    m12417a(b, a.f8140f);
                    C3437a.this.m12392a(a);
                    m12416a(b);
                }
            }
            mo10172a(C3440c.TERMINATED);
        }
    }

    /* renamed from: kotlinx.coroutines.i2.a$c */
    public enum C3440c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        RETIRING,
        TERMINATED
    }

    static {
        new C3438a((C3366g) null);
    }

    public C3437a(int i, int i2, long j, String str) {
        C3370k.m12227b(str, "schedulerName");
        this.f8106j = i;
        this.f8107k = i2;
        this.f8108l = j;
        this.f8109m = str;
        if (this.f8106j >= 1) {
            if (this.f8107k >= this.f8106j) {
                if (this.f8107k <= 2097150) {
                    if (this.f8108l > 0) {
                        this.f8102f = new C3444e();
                        this.f8103g = new Semaphore(this.f8106j, false);
                        this.parkedWorkersStack = 0;
                        this.f8104h = new C3439b[(this.f8107k + 1)];
                        this.controlState = 0;
                        this.f8105i = new Random();
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + this.f8108l + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + this.f8107k + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + this.f8107k + " should be greater than or equals to core pool size " + this.f8106j).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + this.f8106j + " should be at least 1").toString());
    }

    /* renamed from: a */
    private final int m12384a(C3439b bVar) {
        int b;
        do {
            Object d = bVar.mo10176d();
            if (d == f8101u) {
                return -1;
            }
            if (d == null) {
                return 0;
            }
            bVar = (C3439b) d;
            b = bVar.mo10173b();
        } while (b == 0);
        return b;
    }

    /* renamed from: a */
    private final int m12386a(C3448i iVar, boolean z) {
        C3439b g = m12405g();
        if (g == null || g.getState() == C3440c.TERMINATED) {
            return 1;
        }
        int i = -1;
        if (iVar.mo10195b() == C3451l.NON_BLOCKING) {
            if (g.mo10179g()) {
                i = 0;
            } else if (!g.mo10182i()) {
                return 1;
            }
        }
        if (!(z ? g.mo10175c().mo10203b(iVar, this.f8102f) : g.mo10175c().mo10200a(iVar, this.f8102f)) || g.mo10175c().mo10198a() > C3452m.f8147b) {
            return 0;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m12387a(C3439b bVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            int a = i3 == i ? i2 == 0 ? m12384a(bVar) : i2 : i3;
            if (a >= 0) {
                if (f8094n.compareAndSet(this, j, j2 | ((long) a))) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m12388a(C3437a aVar, Runnable runnable, C3449j jVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            jVar = C3447h.f8139g;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.mo10165a(runnable, jVar, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m12392a(C3448i iVar) {
        C3411c2 a;
        try {
            iVar.run();
            a = C3416d2.m12332a();
            if (a == null) {
                return;
            }
        } catch (Throwable th) {
            C3411c2 a2 = C3416d2.m12332a();
            if (a2 != null) {
                a2.mo10134c();
            }
            throw th;
        }
        a.mo10134c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m12395b(C3439b bVar) {
        long j;
        long j2;
        int b;
        if (bVar.mo10176d() == f8101u) {
            do {
                j = this.parkedWorkersStack;
                int i = (int) (2097151 & j);
                j2 = (2097152 + j) & -2097152;
                b = bVar.mo10173b();
                if (C3498j0.m12618a()) {
                    if (!(b != 0)) {
                        throw new AssertionError();
                    }
                }
                bVar.mo10171a((Object) this.f8104h[i]);
            } while (!f8094n.compareAndSet(this, j, ((long) b) | j2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007b, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        return r1;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m12402f() {
        /*
            r10 = this;
            kotlinx.coroutines.i2.a$b[] r0 = r10.f8104h
            monitor-enter(r0)
            boolean r1 = r10.isTerminated()     // Catch:{ all -> 0x007c }
            if (r1 == 0) goto L_0x000c
            r1 = -1
        L_0x000a:
            monitor-exit(r0)
            return r1
        L_0x000c:
            long r1 = r10.controlState     // Catch:{ all -> 0x007c }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r6 = (int) r5     // Catch:{ all -> 0x007c }
            r7 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r7
            r5 = 21
            long r1 = r1 >> r5
            int r2 = (int) r1     // Catch:{ all -> 0x007c }
            int r1 = r6 - r2
            int r2 = r10.f8106j     // Catch:{ all -> 0x007c }
            r5 = 0
            if (r1 < r2) goto L_0x0027
            monitor-exit(r0)
            return r5
        L_0x0027:
            int r2 = r10.f8107k     // Catch:{ all -> 0x007c }
            if (r6 >= r2) goto L_0x007a
            java.util.concurrent.Semaphore r2 = r10.f8103g     // Catch:{ all -> 0x007c }
            int r2 = r2.availablePermits()     // Catch:{ all -> 0x007c }
            if (r2 != 0) goto L_0x0034
            goto L_0x007a
        L_0x0034:
            long r6 = r10.controlState     // Catch:{ all -> 0x007c }
            long r6 = r6 & r3
            int r2 = (int) r6     // Catch:{ all -> 0x007c }
            r6 = 1
            int r2 = r2 + r6
            if (r2 <= 0) goto L_0x0044
            kotlinx.coroutines.i2.a$b[] r7 = r10.f8104h     // Catch:{ all -> 0x007c }
            r7 = r7[r2]     // Catch:{ all -> 0x007c }
            if (r7 != 0) goto L_0x0044
            r7 = 1
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            if (r7 == 0) goto L_0x006e
            kotlinx.coroutines.i2.a$b r7 = new kotlinx.coroutines.i2.a$b     // Catch:{ all -> 0x007c }
            r7.<init>(r10, r2)     // Catch:{ all -> 0x007c }
            r7.start()     // Catch:{ all -> 0x007c }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f8095o     // Catch:{ all -> 0x007c }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x007c }
            long r3 = r3 & r8
            int r4 = (int) r3     // Catch:{ all -> 0x007c }
            if (r2 != r4) goto L_0x005a
            r5 = 1
        L_0x005a:
            if (r5 == 0) goto L_0x0062
            kotlinx.coroutines.i2.a$b[] r3 = r10.f8104h     // Catch:{ all -> 0x007c }
            r3[r2] = r7     // Catch:{ all -> 0x007c }
            int r1 = r1 + r6
            goto L_0x000a
        L_0x0062:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007c }
            r2.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r2     // Catch:{ all -> 0x007c }
        L_0x006e:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007c }
            r2.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r2     // Catch:{ all -> 0x007c }
        L_0x007a:
            monitor-exit(r0)
            return r5
        L_0x007c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p212i2.C3437a.m12402f():int");
    }

    /* renamed from: g */
    private final C3439b m12405g() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C3439b)) {
            currentThread = null;
        }
        C3439b bVar = (C3439b) currentThread;
        if (bVar == null || !C3370k.m12225a((Object) bVar.mo10177e(), (Object) this)) {
            return null;
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final int m12406h() {
        return (int) (this.controlState & 2097151);
    }

    /* renamed from: i */
    private final C3439b m12408i() {
        while (true) {
            long j = this.parkedWorkersStack;
            C3439b bVar = this.f8104h[(int) (2097151 & j)];
            if (bVar == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int a = m12384a(bVar);
            if (a >= 0) {
                if (f8094n.compareAndSet(this, j, ((long) a) | j2)) {
                    bVar.mo10171a((Object) f8101u);
                    return bVar;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean isTerminated() {
        return this._isTerminated != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m12410j() {
        if (this.f8103g.availablePermits() == 0) {
            m12412k();
        } else if (!m12412k()) {
            long j = this.controlState;
            if (((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)) < this.f8106j) {
                int f = m12402f();
                if (f == 1 && this.f8106j > 1) {
                    m12402f();
                }
                if (f > 0) {
                    return;
                }
            }
            m12412k();
        }
    }

    /* renamed from: k */
    private final boolean m12412k() {
        while (true) {
            C3439b i = m12408i();
            if (i == null) {
                return false;
            }
            i.mo10178f();
            boolean h = i.mo10181h();
            LockSupport.unpark(i);
            if (h && i.mo10183j()) {
                return true;
            }
        }
    }

    /* renamed from: a */
    public final C3448i mo10163a(Runnable runnable, C3449j jVar) {
        C3370k.m12227b(runnable, "block");
        C3370k.m12227b(jVar, "taskContext");
        long a = C3452m.f8151f.mo10194a();
        if (!(runnable instanceof C3448i)) {
            return new C3450k(runnable, a, jVar);
        }
        C3448i iVar = (C3448i) runnable;
        iVar.f8140f = a;
        iVar.f8141g = jVar;
        return iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006a, code lost:
        if (r9 != null) goto L_0x0075;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10164a(long r9) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f8096p
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            kotlinx.coroutines.i2.a$b r0 = r8.m12405g()
            kotlinx.coroutines.i2.a$b[] r3 = r8.f8104h
            monitor-enter(r3)
            long r4 = r8.controlState     // Catch:{ all -> 0x00a3 }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            if (r2 > r5) goto L_0x005f
            r3 = 1
        L_0x001d:
            kotlinx.coroutines.i2.a$b[] r4 = r8.f8104h
            r4 = r4[r3]
            if (r4 == 0) goto L_0x005a
            if (r4 == r0) goto L_0x0055
        L_0x0025:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L_0x0032
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r9)
            goto L_0x0025
        L_0x0032:
            kotlinx.coroutines.i2.a$c r6 = r4.getState()
            boolean r7 = kotlinx.coroutines.C3498j0.m12618a()
            if (r7 == 0) goto L_0x004c
            kotlinx.coroutines.i2.a$c r7 = kotlinx.coroutines.p212i2.C3437a.C3440c.TERMINATED
            if (r6 != r7) goto L_0x0042
            r6 = 1
            goto L_0x0043
        L_0x0042:
            r6 = 0
        L_0x0043:
            if (r6 == 0) goto L_0x0046
            goto L_0x004c
        L_0x0046:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x004c:
            kotlinx.coroutines.i2.o r4 = r4.mo10175c()
            kotlinx.coroutines.i2.e r6 = r8.f8102f
            r4.mo10199a((kotlinx.coroutines.p212i2.C3444e) r6)
        L_0x0055:
            if (r3 == r5) goto L_0x005f
            int r3 = r3 + 1
            goto L_0x001d
        L_0x005a:
            kotlin.p205x.p207d.C3370k.m12221a()
            r9 = 0
            throw r9
        L_0x005f:
            kotlinx.coroutines.i2.e r9 = r8.f8102f
            r9.mo10239a()
        L_0x0064:
            if (r0 == 0) goto L_0x006d
            kotlinx.coroutines.i2.i r9 = r0.mo10170a()
            if (r9 == 0) goto L_0x006d
            goto L_0x0075
        L_0x006d:
            kotlinx.coroutines.i2.e r9 = r8.f8102f
            java.lang.Object r9 = r9.mo10242c()
            kotlinx.coroutines.i2.i r9 = (kotlinx.coroutines.p212i2.C3448i) r9
        L_0x0075:
            if (r9 == 0) goto L_0x007b
            r8.m12392a((kotlinx.coroutines.p212i2.C3448i) r9)
            goto L_0x0064
        L_0x007b:
            if (r0 == 0) goto L_0x0082
            kotlinx.coroutines.i2.a$c r9 = kotlinx.coroutines.p212i2.C3437a.C3440c.TERMINATED
            r0.mo10172a((kotlinx.coroutines.p212i2.C3437a.C3440c) r9)
        L_0x0082:
            boolean r9 = kotlinx.coroutines.C3498j0.m12618a()
            if (r9 == 0) goto L_0x009c
            java.util.concurrent.Semaphore r9 = r8.f8103g
            int r9 = r9.availablePermits()
            int r10 = r8.f8106j
            if (r9 != r10) goto L_0x0093
            r1 = 1
        L_0x0093:
            if (r1 == 0) goto L_0x0096
            goto L_0x009c
        L_0x0096:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x009c:
            r9 = 0
            r8.parkedWorkersStack = r9
            r8.controlState = r9
            return
        L_0x00a3:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p212i2.C3437a.mo10164a(long):void");
    }

    /* renamed from: a */
    public final void mo10165a(Runnable runnable, C3449j jVar, boolean z) {
        C3370k.m12227b(runnable, "block");
        C3370k.m12227b(jVar, "taskContext");
        C3411c2 a = C3416d2.m12332a();
        if (a != null) {
            a.mo10135d();
        }
        C3448i a2 = mo10163a(runnable, jVar);
        int a3 = m12386a(a2, z);
        if (a3 == -1) {
            return;
        }
        if (a3 == 1 && !this.f8102f.mo10240a(a2)) {
            throw new RejectedExecutionException(this.f8109m + " was terminated");
        }
        m12410j();
    }

    public void close() {
        mo10164a(10000);
    }

    public void execute(Runnable runnable) {
        C3370k.m12227b(runnable, "command");
        m12388a(this, runnable, (C3449j) null, false, 6, (Object) null);
    }

    public String toString() {
        String str;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (C3439b bVar : this.f8104h) {
            if (bVar != null) {
                int c = bVar.mo10175c().mo10204c();
                int i6 = C3441b.f8124a[bVar.getState().ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        i2++;
                        sb = new StringBuilder();
                        sb.append(String.valueOf(c));
                        str = "b";
                    } else if (i6 == 3) {
                        i++;
                        sb = new StringBuilder();
                        sb.append(String.valueOf(c));
                        str = "c";
                    } else if (i6 == 4) {
                        i4++;
                        if (c > 0) {
                            sb = new StringBuilder();
                            sb.append(String.valueOf(c));
                            str = "r";
                        }
                    } else if (i6 == 5) {
                        i5++;
                    }
                    sb.append(str);
                    arrayList.add(sb.toString());
                } else {
                    i3++;
                }
            }
        }
        long j = this.controlState;
        return this.f8109m + '@' + C3504k0.m12636b(this) + '[' + "Pool Size {" + "core = " + this.f8106j + ", " + "max = " + this.f8107k + "}, " + "Worker States {" + "CPU = " + i + ", " + "blocking = " + i2 + ", " + "parked = " + i3 + ", " + "retired = " + i4 + ", " + "terminated = " + i5 + "}, " + "running workers queues = " + arrayList + ", " + "global queue size = " + this.f8102f.mo10241b() + ", " + "Control State Workers {" + "created = " + ((int) (2097151 & j)) + ", " + "blocking = " + ((int) ((j & 4398044413952L) >> 21)) + '}' + "]";
    }
}
