package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.internal.C3456a0;
import kotlinx.coroutines.internal.C3476l;
import kotlinx.coroutines.internal.C3496z;

/* renamed from: kotlinx.coroutines.y0 */
public abstract class C3551y0 extends C3557z0 implements C3513n0 {

    /* renamed from: i */
    private static final AtomicReferenceFieldUpdater f8264i;

    /* renamed from: j */
    private static final AtomicReferenceFieldUpdater f8265j;
    private volatile Object _delayed = null;
    private volatile Object _queue = null;
    /* access modifiers changed from: private */
    public volatile boolean isCompleted;

    /* renamed from: kotlinx.coroutines.y0$a */
    private final class C3552a extends C3553b {

        /* renamed from: i */
        private final C3429h<Unit> f8266i;

        /* renamed from: j */
        final /* synthetic */ C3551y0 f8267j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3552a(C3551y0 y0Var, long j, C3429h<? super Unit> hVar) {
            super(j);
            C3370k.m12227b(hVar, "cont");
            this.f8267j = y0Var;
            this.f8266i = hVar;
        }

        public void run() {
            this.f8266i.mo10147a(this.f8267j, Unit.INSTANCE);
        }

        public String toString() {
            return super.toString() + this.f8266i.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.y0$b */
    public static abstract class C3553b implements Runnable, Comparable<C3553b>, C3539u0, C3456a0 {

        /* renamed from: f */
        private Object f8268f;

        /* renamed from: g */
        private int f8269g = -1;

        /* renamed from: h */
        public long f8270h;

        public C3553b(long j) {
            this.f8270h = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0052, code lost:
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
            return r8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x004a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized int mo10339a(long r8, kotlinx.coroutines.C3551y0.C3554c r10, kotlinx.coroutines.C3551y0 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.String r0 = "delayed"
                kotlin.p205x.p207d.C3370k.m12227b(r10, r0)     // Catch:{ all -> 0x0057 }
                java.lang.String r0 = "eventLoop"
                kotlin.p205x.p207d.C3370k.m12227b(r11, r0)     // Catch:{ all -> 0x0057 }
                java.lang.Object r0 = r7.f8268f     // Catch:{ all -> 0x0057 }
                kotlinx.coroutines.internal.u r1 = kotlinx.coroutines.C3405b1.f8066a     // Catch:{ all -> 0x0057 }
                if (r0 != r1) goto L_0x0016
                r8 = 2
            L_0x0014:
                monitor-exit(r7)
                return r8
            L_0x0016:
                monitor-enter(r10)     // Catch:{ all -> 0x0057 }
                kotlinx.coroutines.internal.a0 r0 = r10.mo10261a()     // Catch:{ all -> 0x0054 }
                kotlinx.coroutines.y0$b r0 = (kotlinx.coroutines.C3551y0.C3553b) r0     // Catch:{ all -> 0x0054 }
                boolean r11 = r11.isCompleted     // Catch:{ all -> 0x0054 }
                if (r11 == 0) goto L_0x0027
                r8 = 1
                monitor-exit(r10)     // Catch:{ all -> 0x0057 }
                monitor-exit(r7)
                return r8
            L_0x0027:
                r1 = 0
                if (r0 != 0) goto L_0x002e
            L_0x002b:
                r10.f8271b = r8     // Catch:{ all -> 0x0054 }
                goto L_0x0041
            L_0x002e:
                long r3 = r0.f8270h     // Catch:{ all -> 0x0054 }
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L_0x0037
                goto L_0x0038
            L_0x0037:
                r8 = r3
            L_0x0038:
                long r3 = r10.f8271b     // Catch:{ all -> 0x0054 }
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L_0x0041
                goto L_0x002b
            L_0x0041:
                long r8 = r7.f8270h     // Catch:{ all -> 0x0054 }
                long r3 = r10.f8271b     // Catch:{ all -> 0x0054 }
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L_0x004e
                long r8 = r10.f8271b     // Catch:{ all -> 0x0054 }
                r7.f8270h = r8     // Catch:{ all -> 0x0054 }
            L_0x004e:
                r10.mo10263a(r7)     // Catch:{ all -> 0x0054 }
                monitor-exit(r10)     // Catch:{ all -> 0x0057 }
                r8 = 0
                goto L_0x0014
            L_0x0054:
                r8 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x0057 }
                throw r8     // Catch:{ all -> 0x0057 }
            L_0x0057:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C3551y0.C3553b.mo10339a(long, kotlinx.coroutines.y0$c, kotlinx.coroutines.y0):int");
        }

        /* renamed from: a */
        public int compareTo(C3553b bVar) {
            C3370k.m12227b(bVar, "other");
            int i = ((this.f8270h - bVar.f8270h) > 0 ? 1 : ((this.f8270h - bVar.f8270h) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* renamed from: a */
        public final synchronized void mo10290a() {
            Object obj = this.f8268f;
            if (obj != C3405b1.f8066a) {
                if (!(obj instanceof C3554c)) {
                    obj = null;
                }
                C3554c cVar = (C3554c) obj;
                if (cVar != null) {
                    cVar.mo10265b(this);
                }
                this.f8268f = C3405b1.f8066a;
            }
        }

        /* renamed from: a */
        public void mo10208a(int i) {
            this.f8269g = i;
        }

        /* renamed from: a */
        public void mo10209a(C3496z<?> zVar) {
            if (this.f8268f != C3405b1.f8066a) {
                this.f8268f = zVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: a */
        public final boolean mo10341a(long j) {
            return j - this.f8270h >= 0;
        }

        /* renamed from: b */
        public C3496z<?> mo10210b() {
            Object obj = this.f8268f;
            if (!(obj instanceof C3496z)) {
                obj = null;
            }
            return (C3496z) obj;
        }

        /* renamed from: c */
        public int mo10211c() {
            return this.f8269g;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f8270h + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.y0$c */
    public static final class C3554c extends C3496z<C3553b> {

        /* renamed from: b */
        public long f8271b;

        public C3554c(long j) {
            this.f8271b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C3551y0> cls2 = C3551y0.class;
        f8264i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f8265j = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* renamed from: a */
    private final boolean m12804a(C3553b bVar) {
        C3554c cVar = (C3554c) this._delayed;
        return (cVar != null ? (C3553b) cVar.mo10267d() : null) == bVar;
    }

    /* renamed from: b */
    private final boolean m12806b(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this.isCompleted) {
                return false;
            }
            if (obj == null) {
                if (f8264i.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C3476l) {
                if (obj != null) {
                    C3476l lVar = (C3476l) obj;
                    int a = lVar.mo10243a(runnable);
                    if (a == 0) {
                        return true;
                    }
                    if (a == 1) {
                        f8264i.compareAndSet(this, obj, lVar.mo10247d());
                    } else if (a == 2) {
                        return false;
                    }
                } else {
                    throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == C3405b1.f8067b) {
                return false;
            } else {
                C3476l lVar2 = new C3476l(8, true);
                if (obj != null) {
                    lVar2.mo10243a((Runnable) obj);
                    lVar2.mo10243a(runnable);
                    if (f8264i.compareAndSet(this, obj, lVar2)) {
                        return true;
                    }
                } else {
                    throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* renamed from: c */
    private final int m12807c(long j, C3553b bVar) {
        if (this.isCompleted) {
            return 1;
        }
        C3554c cVar = (C3554c) this._delayed;
        if (cVar == null) {
            f8265j.compareAndSet(this, (Object) null, new C3554c(j));
            Object obj = this._delayed;
            if (obj != null) {
                cVar = (C3554c) obj;
            } else {
                C3370k.m12221a();
                throw null;
            }
        }
        return bVar.mo10339a(j, cVar, this);
    }

    /* renamed from: q */
    private final void m12808q() {
        if (!C3498j0.m12618a() || this.isCompleted) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (f8264i.compareAndSet(this, (Object) null, C3405b1.f8067b)) {
                        return;
                    }
                } else if (obj instanceof C3476l) {
                    ((C3476l) obj).mo10244a();
                    return;
                } else if (obj != C3405b1.f8067b) {
                    C3476l lVar = new C3476l(8, true);
                    if (obj != null) {
                        lVar.mo10243a((Runnable) obj);
                        if (f8264i.compareAndSet(this, obj, lVar)) {
                            return;
                        }
                    } else {
                        throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: r */
    private final Runnable m12809r() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C3476l) {
                if (obj != null) {
                    C3476l lVar = (C3476l) obj;
                    Object e = lVar.mo10248e();
                    if (e != C3476l.f8184g) {
                        return (Runnable) e;
                    }
                    f8264i.compareAndSet(this, obj, lVar.mo10247d());
                } else {
                    throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == C3405b1.f8067b) {
                return null;
            } else {
                if (f8264i.compareAndSet(this, obj, (Object) null)) {
                    if (obj != null) {
                        return (Runnable) obj;
                    }
                    throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* renamed from: s */
    private final void m12810s() {
        C3553b bVar;
        C3411c2 a = C3416d2.m12332a();
        long e = a != null ? a.mo10136e() : System.nanoTime();
        while (true) {
            C3554c cVar = (C3554c) this._delayed;
            if (cVar != null && (bVar = (C3553b) cVar.mo10268e()) != null) {
                mo10343a(e, bVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo10111a(long j, C3429h<? super Unit> hVar) {
        C3370k.m12227b(hVar, "continuation");
        long a = C3405b1.m12306a(j);
        if (a < 4611686018427387903L) {
            C3411c2 a2 = C3416d2.m12332a();
            long e = a2 != null ? a2.mo10136e() : System.nanoTime();
            C3552a aVar = new C3552a(this, a + e, hVar);
            C3497j.m12617a(hVar, aVar);
            mo10333b(e, aVar);
        }
    }

    /* renamed from: a */
    public final void mo10332a(Runnable runnable) {
        C3370k.m12227b(runnable, "task");
        if (m12806b(runnable)) {
            mo10344m();
        } else {
            C3507l0.f8220l.mo10332a(runnable);
        }
    }

    /* renamed from: a */
    public final void mo10112a(C3314f fVar, Runnable runnable) {
        C3370k.m12227b(fVar, "context");
        C3370k.m12227b(runnable, "block");
        mo10332a(runnable);
    }

    /* renamed from: b */
    public final void mo10333b(long j, C3553b bVar) {
        C3370k.m12227b(bVar, "delayedTask");
        int c = m12807c(j, bVar);
        if (c != 0) {
            if (c == 1) {
                mo10343a(j, bVar);
            } else if (c != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m12804a(bVar)) {
            mo10344m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public long mo10327h() {
        C3553b bVar;
        if (super.mo10327h() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof C3476l)) {
                return obj == C3405b1.f8067b ? Long.MAX_VALUE : 0;
            }
            if (!((C3476l) obj).mo10246c()) {
                return 0;
            }
        }
        C3554c cVar = (C3554c) this._delayed;
        if (cVar == null || (bVar = (C3553b) cVar.mo10267d()) == null) {
            return Long.MAX_VALUE;
        }
        long j = bVar.f8270h;
        C3411c2 a = C3416d2.m12332a();
        return C3198h.m11848a(j - (a != null ? a.mo10136e() : System.nanoTime()), 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo10334n() {
        if (!mo10329j()) {
            return false;
        }
        C3554c cVar = (C3554c) this._delayed;
        if (cVar != null && !cVar.mo10266c()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            return obj instanceof C3476l ? ((C3476l) obj).mo10246c() : obj == C3405b1.f8067b;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0053  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo10335o() {
        /*
            r7 = this;
            boolean r0 = r7.mo10330k()
            if (r0 == 0) goto L_0x000b
            long r0 = r7.mo10327h()
            return r0
        L_0x000b:
            java.lang.Object r0 = r7._delayed
            kotlinx.coroutines.y0$c r0 = (kotlinx.coroutines.C3551y0.C3554c) r0
            if (r0 == 0) goto L_0x004d
            boolean r1 = r0.mo10266c()
            if (r1 != 0) goto L_0x004d
            kotlinx.coroutines.c2 r1 = kotlinx.coroutines.C3416d2.m12332a()
            if (r1 == 0) goto L_0x0022
            long r1 = r1.mo10136e()
            goto L_0x0026
        L_0x0022:
            long r1 = java.lang.System.nanoTime()
        L_0x0026:
            monitor-enter(r0)
            kotlinx.coroutines.internal.a0 r3 = r0.mo10261a()     // Catch:{ all -> 0x004a }
            r4 = 0
            if (r3 == 0) goto L_0x0044
            kotlinx.coroutines.y0$b r3 = (kotlinx.coroutines.C3551y0.C3553b) r3     // Catch:{ all -> 0x004a }
            boolean r5 = r3.mo10341a((long) r1)     // Catch:{ all -> 0x004a }
            r6 = 0
            if (r5 == 0) goto L_0x003c
            boolean r3 = r7.m12806b(r3)     // Catch:{ all -> 0x004a }
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            if (r3 == 0) goto L_0x0044
            kotlinx.coroutines.internal.a0 r3 = r0.mo10262a((int) r6)     // Catch:{ all -> 0x004a }
            r4 = r3
        L_0x0044:
            monitor-exit(r0)
            kotlinx.coroutines.y0$b r4 = (kotlinx.coroutines.C3551y0.C3553b) r4
            if (r4 == 0) goto L_0x004d
            goto L_0x0026
        L_0x004a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004d:
            java.lang.Runnable r0 = r7.m12809r()
            if (r0 == 0) goto L_0x0056
            r0.run()
        L_0x0056:
            long r0 = r7.mo10327h()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C3551y0.mo10335o():long");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo10336p() {
        this._queue = null;
        this._delayed = null;
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
        C3406b2.f8069b.mo10122b();
        this.isCompleted = true;
        m12808q();
        do {
        } while (mo10335o() <= 0);
        m12810s();
    }
}
