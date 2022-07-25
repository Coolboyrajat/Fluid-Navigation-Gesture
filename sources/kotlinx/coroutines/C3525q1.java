package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p197u.C3314f;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3499j1;
import kotlinx.coroutines.internal.C3460d;
import kotlinx.coroutines.internal.C3472i;
import kotlinx.coroutines.internal.C3473j;
import kotlinx.coroutines.internal.C3482p;
import kotlinx.coroutines.internal.C3486t;
import kotlinx.coroutines.p213j2.C3502a;

/* renamed from: kotlinx.coroutines.q1 */
public class C3525q1 implements C3499j1, C3515o, C3549x1, C3502a {

    /* renamed from: f */
    private static final AtomicReferenceFieldUpdater f8236f = AtomicReferenceFieldUpdater.newUpdater(C3525q1.class, Object.class, "_state");
    private volatile Object _state;
    public volatile C3509m parentHandle;

    /* renamed from: kotlinx.coroutines.q1$a */
    private static final class C3526a extends C3522p1<C3499j1> {

        /* renamed from: j */
        private final C3525q1 f8237j;

        /* renamed from: k */
        private final C3527b f8238k;

        /* renamed from: l */
        private final C3512n f8239l;

        /* renamed from: m */
        private final Object f8240m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3526a(C3525q1 q1Var, C3527b bVar, C3512n nVar, Object obj) {
            super(nVar.f8223j);
            C3370k.m12227b(q1Var, "parent");
            C3370k.m12227b(bVar, "state");
            C3370k.m12227b(nVar, "child");
            this.f8237j = q1Var;
            this.f8238k = bVar;
            this.f8239l = nVar;
            this.f8240m = obj;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo10150b((Throwable) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: b */
        public void mo10150b(Throwable th) {
            this.f8237j.m12694a(this.f8238k, this.f8239l, this.f8240m);
        }

        public String toString() {
            return "ChildCompletion[" + this.f8239l + ", " + this.f8240m + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.q1$b */
    private static final class C3527b implements C3419e1 {
        private volatile Object _exceptionsHolder;

        /* renamed from: f */
        private final C3540u1 f8241f;
        public volatile boolean isCompleting;
        public volatile Throwable rootCause;

        public C3527b(C3540u1 u1Var, boolean z, Throwable th) {
            C3370k.m12227b(u1Var, "list");
            this.f8241f = u1Var;
            this.isCompleting = z;
            this.rootCause = th;
        }

        /* renamed from: e */
        private final ArrayList<Throwable> m12744e() {
            return new ArrayList<>(4);
        }

        /* renamed from: a */
        public final void mo10306a(Throwable th) {
            C3370k.m12227b(th, "exception");
            Throwable th2 = this.rootCause;
            if (th2 == null) {
                this.rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList<Throwable> e = m12744e();
                        e.add(obj);
                        e.add(th);
                        this._exceptionsHolder = e;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
        }

        /* renamed from: a */
        public final boolean mo10307a() {
            return this.rootCause != null;
        }

        /* renamed from: b */
        public final List<Throwable> mo10308b(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = m12744e();
            } else if (obj instanceof Throwable) {
                ArrayList<Throwable> e = m12744e();
                e.add(obj);
                arrayList = e;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            Throwable th2 = this.rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && (!C3370k.m12225a((Object) th, (Object) th2))) {
                arrayList.add(th);
            }
            this._exceptionsHolder = C3531r1.f8247a;
            return arrayList;
        }

        /* renamed from: b */
        public boolean mo10141b() {
            return this.rootCause == null;
        }

        /* renamed from: c */
        public final boolean mo10309c() {
            return this._exceptionsHolder == C3531r1.f8247a;
        }

        /* renamed from: d */
        public C3540u1 mo10142d() {
            return this.f8241f;
        }

        public String toString() {
            return "Finishing[cancelling=" + mo10307a() + ", completing=" + this.isCompleting + ", rootCause=" + this.rootCause + ", exceptions=" + this._exceptionsHolder + ", list=" + mo10142d() + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.q1$c */
    public static final class C3528c extends C3473j.C3474a {

        /* renamed from: d */
        final /* synthetic */ C3525q1 f8242d;

        /* renamed from: e */
        final /* synthetic */ Object f8243e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3528c(C3473j jVar, C3473j jVar2, C3525q1 q1Var, Object obj) {
            super(jVar2);
            this.f8242d = q1Var;
            this.f8243e = obj;
        }

        /* renamed from: a */
        public Object mo10218b(C3473j jVar) {
            C3370k.m12227b(jVar, "affected");
            if (this.f8242d.mo10302j() == this.f8243e) {
                return null;
            }
            return C3472i.m12511a();
        }
    }

    public C3525q1(boolean z) {
        this._state = z ? C3531r1.f8249c : C3531r1.f8248b;
    }

    /* renamed from: a */
    private final int m12686a(Object obj, Object obj2, int i) {
        if (!(obj instanceof C3419e1)) {
            return 0;
        }
        return (((obj instanceof C3545w0) || (obj instanceof C3522p1)) && !(obj instanceof C3512n) && !(obj2 instanceof C3529r)) ? !m12704b((C3419e1) obj, obj2, i) ? 3 : 1 : m12706c((C3419e1) obj, obj2, i);
    }

    /* renamed from: a */
    private final Throwable m12687a(C3527b bVar, List<? extends Throwable> list) {
        T t;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (!(((Throwable) t) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) t;
            return th != null ? th : (Throwable) list.get(0);
        } else if (bVar.mo10307a()) {
            return mo10103p();
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ CancellationException m12688a(C3525q1 q1Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return q1Var.mo10292a(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: a */
    private final C3512n m12689a(C3419e1 e1Var) {
        C3512n nVar = (C3512n) (!(e1Var instanceof C3512n) ? null : e1Var);
        if (nVar != null) {
            return nVar;
        }
        C3540u1 d = e1Var.mo10142d();
        if (d != null) {
            return m12690a((C3473j) d);
        }
        return null;
    }

    /* renamed from: a */
    private final C3512n m12690a(C3473j jVar) {
        while (jVar.mo10236j()) {
            jVar = jVar.mo10234h();
        }
        while (true) {
            jVar = jVar.mo10232f();
            if (!jVar.mo10236j()) {
                if (jVar instanceof C3512n) {
                    return (C3512n) jVar;
                }
                if (jVar instanceof C3540u1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: a */
    private final C3522p1<?> m12691a(C3350b<? super Throwable, Unit> bVar, boolean z) {
        boolean z2 = true;
        C3508l1 l1Var = null;
        if (z) {
            if (bVar instanceof C3508l1) {
                l1Var = bVar;
            }
            C3508l1 l1Var2 = l1Var;
            if (l1Var2 != null) {
                if (l1Var2.f8234i != this) {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                } else if (l1Var2 != null) {
                    return l1Var2;
                }
            }
            return new C3431h1(this, bVar);
        }
        if (bVar instanceof C3522p1) {
            l1Var = bVar;
        }
        C3522p1<?> p1Var = l1Var;
        if (p1Var != null) {
            if (p1Var.f8234i != this || (p1Var instanceof C3508l1)) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (p1Var != null) {
                return p1Var;
            }
        }
        return new C3436i1(this, bVar);
    }

    /* renamed from: a */
    private final void m12692a(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set a = C3460d.m12487a(list.size());
            Throwable b = C3486t.m12578b(th);
            for (Throwable b2 : list) {
                Throwable b3 = C3486t.m12578b(b2);
                if (b3 != th && b3 != b && !(b3 instanceof CancellationException) && a.add(b3)) {
                    C3199b.m11853a(th, b3);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m12693a(C3419e1 e1Var, Object obj, int i) {
        C3509m mVar = this.parentHandle;
        if (mVar != null) {
            mVar.mo10290a();
            this.parentHandle = C3543v1.f8258f;
        }
        Throwable th = null;
        C3529r rVar = (C3529r) (!(obj instanceof C3529r) ? null : obj);
        if (rVar != null) {
            th = rVar.f8245a;
        }
        if (e1Var instanceof C3522p1) {
            try {
                ((C3522p1) e1Var).mo10150b(th);
            } catch (Throwable th2) {
                mo10100d((Throwable) new C3544w("Exception in completion handler " + e1Var + " for " + this, th2));
            }
        } else {
            C3540u1 d = e1Var.mo10142d();
            if (d != null) {
                m12703b(d, th);
            }
        }
        mo10254a(obj, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m12694a(C3527b bVar, C3512n nVar, Object obj) {
        if (mo10302j() == bVar) {
            C3512n a = m12690a((C3473j) nVar);
            if (a == null || !m12705b(bVar, a, obj)) {
                boolean a2 = m12700a(bVar, obj, 0);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: a */
    private final void m12696a(C3540u1 u1Var, Throwable th) {
        mo10301e(th);
        Object e = u1Var.mo10231e();
        if (e != null) {
            C3544w wVar = null;
            for (C3473j jVar = (C3473j) e; !C3370k.m12225a((Object) jVar, (Object) u1Var); jVar = jVar.mo10232f()) {
                if (jVar instanceof C3508l1) {
                    C3522p1 p1Var = (C3522p1) jVar;
                    try {
                        p1Var.mo10150b(th);
                    } catch (Throwable th2) {
                        if (wVar != null) {
                            C3199b.m11853a(wVar, th2);
                            if (wVar != null) {
                            }
                        }
                        wVar = new C3544w("Exception in completion handler " + p1Var + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
            if (wVar != null) {
                mo10100d((Throwable) wVar);
            }
            m12710f(th);
            return;
        }
        throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlinx.coroutines.d1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m12697a(kotlinx.coroutines.C3545w0 r3) {
        /*
            r2 = this;
            kotlinx.coroutines.u1 r0 = new kotlinx.coroutines.u1
            r0.<init>()
            boolean r1 = r3.mo10141b()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            kotlinx.coroutines.d1 r1 = new kotlinx.coroutines.d1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f8236f
            r1.compareAndSet(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C3525q1.m12697a(kotlinx.coroutines.w0):void");
    }

    /* renamed from: a */
    private final boolean m12698a(Object obj, C3540u1 u1Var, C3522p1<?> p1Var) {
        int a;
        C3528c cVar = new C3528c(p1Var, p1Var, this, obj);
        do {
            Object g = u1Var.mo10233g();
            if (g != null) {
                a = ((C3473j) g).mo10229a(p1Var, u1Var, cVar);
                if (a == 1) {
                    return true;
                }
            } else {
                throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (a != 2);
        return false;
    }

    /* renamed from: a */
    private final boolean m12699a(C3419e1 e1Var, Throwable th) {
        if (C3498j0.m12618a() && !(!(e1Var instanceof C3527b))) {
            throw new AssertionError();
        } else if (!C3498j0.m12618a() || e1Var.mo10141b()) {
            C3540u1 b = m12701b(e1Var);
            if (b == null) {
                return false;
            }
            if (!f8236f.compareAndSet(this, e1Var, new C3527b(b, false, th))) {
                return false;
            }
            m12696a(b, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private final boolean m12700a(C3527b bVar, Object obj, int i) {
        boolean a;
        Throwable a2;
        boolean z = false;
        if (!(mo10302j() == bVar)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!(!bVar.mo10309c())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (bVar.isCompleting) {
            C3529r rVar = (C3529r) (!(obj instanceof C3529r) ? null : obj);
            Throwable th = rVar != null ? rVar.f8245a : null;
            synchronized (bVar) {
                a = bVar.mo10307a();
                List<Throwable> b = bVar.mo10308b(th);
                a2 = m12687a(bVar, (List<? extends Throwable>) b);
                if (a2 != null) {
                    m12692a(a2, (List<? extends Throwable>) b);
                }
            }
            if (!(a2 == null || a2 == th)) {
                obj = new C3529r(a2, false, 2, (C3366g) null);
            }
            if (a2 != null) {
                if (m12710f(a2) || mo10299c(a2)) {
                    z = true;
                }
                if (z) {
                    if (obj != null) {
                        ((C3529r) obj).mo10313b();
                    } else {
                        throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    }
                }
            }
            if (!a) {
                mo10301e(a2);
            }
            mo10098c(obj);
            if (f8236f.compareAndSet(this, bVar, C3531r1.m12763a(obj))) {
                m12693a((C3419e1) bVar, obj, i);
                return true;
            }
            throw new IllegalArgumentException(("Unexpected state: " + this._state + ", expected: " + bVar + ", update: " + obj).toString());
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: b */
    private final C3540u1 m12701b(C3419e1 e1Var) {
        C3540u1 d = e1Var.mo10142d();
        if (d != null) {
            return d;
        }
        if (e1Var instanceof C3545w0) {
            return new C3540u1();
        }
        if (e1Var instanceof C3522p1) {
            m12702b((C3522p1<?>) (C3522p1) e1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + e1Var).toString());
    }

    /* renamed from: b */
    private final void m12702b(C3522p1<?> p1Var) {
        p1Var.mo10230a(new C3540u1());
        f8236f.compareAndSet(this, p1Var, p1Var.mo10232f());
    }

    /* renamed from: b */
    private final void m12703b(C3540u1 u1Var, Throwable th) {
        Object e = u1Var.mo10231e();
        if (e != null) {
            C3544w wVar = null;
            for (C3473j jVar = (C3473j) e; !C3370k.m12225a((Object) jVar, (Object) u1Var); jVar = jVar.mo10232f()) {
                if (jVar instanceof C3522p1) {
                    C3522p1 p1Var = (C3522p1) jVar;
                    try {
                        p1Var.mo10150b(th);
                    } catch (Throwable th2) {
                        if (wVar != null) {
                            C3199b.m11853a(wVar, th2);
                            if (wVar != null) {
                            }
                        }
                        wVar = new C3544w("Exception in completion handler " + p1Var + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
            if (wVar != null) {
                mo10100d((Throwable) wVar);
                return;
            }
            return;
        }
        throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: b */
    private final boolean m12704b(C3419e1 e1Var, Object obj, int i) {
        if (C3498j0.m12618a()) {
            if (!((e1Var instanceof C3545w0) || (e1Var instanceof C3522p1))) {
                throw new AssertionError();
            }
        }
        if (C3498j0.m12618a() && !(!(obj instanceof C3529r))) {
            throw new AssertionError();
        } else if (!f8236f.compareAndSet(this, e1Var, C3531r1.m12763a(obj))) {
            return false;
        } else {
            mo10301e((Throwable) null);
            mo10098c(obj);
            m12693a(e1Var, obj, i);
            return true;
        }
    }

    /* renamed from: b */
    private final boolean m12705b(C3527b bVar, C3512n nVar, Object obj) {
        while (C3499j1.C3500a.m12630a(nVar.f8223j, false, false, new C3526a(this, bVar, nVar, obj), 1, (Object) null) == C3543v1.f8258f) {
            nVar = m12690a((C3473j) nVar);
            if (nVar == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0054, code lost:
        if (r3 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0056, code lost:
        m12696a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0059, code lost:
        r8 = m12689a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005d, code lost:
        if (r8 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0063, code lost:
        if (m12705b(r2, r8, r9) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0065, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006b, code lost:
        if (m12700a(r2, r9, r10) == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x006d, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006e, code lost:
        return 3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m12706c(kotlinx.coroutines.C3419e1 r8, java.lang.Object r9, int r10) {
        /*
            r7 = this;
            kotlinx.coroutines.u1 r0 = r7.m12701b((kotlinx.coroutines.C3419e1) r8)
            r1 = 3
            if (r0 == 0) goto L_0x007e
            boolean r2 = r8 instanceof kotlinx.coroutines.C3525q1.C3527b
            r3 = 0
            if (r2 != 0) goto L_0x000e
            r2 = r3
            goto L_0x000f
        L_0x000e:
            r2 = r8
        L_0x000f:
            kotlinx.coroutines.q1$b r2 = (kotlinx.coroutines.C3525q1.C3527b) r2
            r4 = 0
            if (r2 == 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            kotlinx.coroutines.q1$b r2 = new kotlinx.coroutines.q1$b
            r2.<init>(r0, r4, r3)
        L_0x001a:
            monitor-enter(r2)
            boolean r5 = r2.isCompleting     // Catch:{ all -> 0x007b }
            if (r5 == 0) goto L_0x0021
            monitor-exit(r2)
            return r4
        L_0x0021:
            r4 = 1
            r2.isCompleting = r4     // Catch:{ all -> 0x007b }
            if (r2 == r8) goto L_0x0030
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f8236f     // Catch:{ all -> 0x007b }
            boolean r5 = r5.compareAndSet(r7, r8, r2)     // Catch:{ all -> 0x007b }
            if (r5 != 0) goto L_0x0030
            monitor-exit(r2)
            return r1
        L_0x0030:
            boolean r5 = r2.mo10309c()     // Catch:{ all -> 0x007b }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x006f
            boolean r5 = r2.mo10307a()     // Catch:{ all -> 0x007b }
            boolean r6 = r9 instanceof kotlinx.coroutines.C3529r     // Catch:{ all -> 0x007b }
            if (r6 != 0) goto L_0x0041
            r6 = r3
            goto L_0x0042
        L_0x0041:
            r6 = r9
        L_0x0042:
            kotlinx.coroutines.r r6 = (kotlinx.coroutines.C3529r) r6     // Catch:{ all -> 0x007b }
            if (r6 == 0) goto L_0x004b
            java.lang.Throwable r6 = r6.f8245a     // Catch:{ all -> 0x007b }
            r2.mo10306a(r6)     // Catch:{ all -> 0x007b }
        L_0x004b:
            java.lang.Throwable r6 = r2.rootCause     // Catch:{ all -> 0x007b }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x0051
            r3 = r6
        L_0x0051:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x007b }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0059
            r7.m12696a((kotlinx.coroutines.C3540u1) r0, (java.lang.Throwable) r3)
        L_0x0059:
            kotlinx.coroutines.n r8 = r7.m12689a((kotlinx.coroutines.C3419e1) r8)
            if (r8 == 0) goto L_0x0067
            boolean r8 = r7.m12705b((kotlinx.coroutines.C3525q1.C3527b) r2, (kotlinx.coroutines.C3512n) r8, (java.lang.Object) r9)
            if (r8 == 0) goto L_0x0067
            r8 = 2
            return r8
        L_0x0067:
            boolean r8 = r7.m12700a((kotlinx.coroutines.C3525q1.C3527b) r2, (java.lang.Object) r9, (int) r10)
            if (r8 == 0) goto L_0x006e
            return r4
        L_0x006e:
            return r1
        L_0x006f:
            java.lang.String r8 = "Failed requirement."
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007b }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x007b }
            r9.<init>(r8)     // Catch:{ all -> 0x007b }
            throw r9     // Catch:{ all -> 0x007b }
        L_0x007b:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C3525q1.m12706c(kotlinx.coroutines.e1, java.lang.Object, int):int");
    }

    /* renamed from: d */
    private final boolean mo10099d(Object obj) {
        int a;
        do {
            Object j = mo10302j();
            if (!(j instanceof C3419e1) || (((j instanceof C3527b) && ((C3527b) j).isCompleting) || (a = m12686a(j, (Object) new C3529r(m12708e(obj), false, 2, (C3366g) null), 0)) == 0)) {
                return false;
            }
            if (a == 1 || a == 2) {
                return true;
            }
        } while (a == 3);
        throw new IllegalStateException("unexpected result".toString());
    }

    /* renamed from: e */
    private final Throwable m12708e(Object obj) {
        if (obj != null ? obj instanceof Throwable : true) {
            return obj != null ? (Throwable) obj : mo10103p();
        }
        if (obj != null) {
            return ((C3549x1) obj).mo10300e();
        }
        throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    /* renamed from: f */
    private final Throwable m12709f(Object obj) {
        if (!(obj instanceof C3529r)) {
            obj = null;
        }
        C3529r rVar = (C3529r) obj;
        if (rVar != null) {
            return rVar.f8245a;
        }
        return null;
    }

    /* renamed from: f */
    private final boolean m12710f(Throwable th) {
        if (mo10255l()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C3509m mVar = this.parentHandle;
        return (mVar == null || mVar == C3543v1.f8258f) ? z : mVar.mo10281a(th) || z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r8 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        m12696a(((kotlinx.coroutines.C3525q1.C3527b) r2).mo10142d(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        return true;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m12711g(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r7.mo10302j()
            boolean r3 = r2 instanceof kotlinx.coroutines.C3525q1.C3527b
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x004b
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.q1$b r3 = (kotlinx.coroutines.C3525q1.C3527b) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.mo10309c()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0018
            monitor-exit(r2)
            return r4
        L_0x0018:
            r3 = r2
            kotlinx.coroutines.q1$b r3 = (kotlinx.coroutines.C3525q1.C3527b) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.mo10307a()     // Catch:{ all -> 0x0048 }
            if (r8 != 0) goto L_0x0023
            if (r3 != 0) goto L_0x0030
        L_0x0023:
            if (r1 == 0) goto L_0x0026
            goto L_0x002a
        L_0x0026:
            java.lang.Throwable r1 = r7.m12708e((java.lang.Object) r8)     // Catch:{ all -> 0x0048 }
        L_0x002a:
            r8 = r2
            kotlinx.coroutines.q1$b r8 = (kotlinx.coroutines.C3525q1.C3527b) r8     // Catch:{ all -> 0x0048 }
            r8.mo10306a(r1)     // Catch:{ all -> 0x0048 }
        L_0x0030:
            r8 = r2
            kotlinx.coroutines.q1$b r8 = (kotlinx.coroutines.C3525q1.C3527b) r8     // Catch:{ all -> 0x0048 }
            java.lang.Throwable r8 = r8.rootCause     // Catch:{ all -> 0x0048 }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r8 = r0
        L_0x003b:
            monitor-exit(r2)
            if (r8 == 0) goto L_0x0047
            kotlinx.coroutines.q1$b r2 = (kotlinx.coroutines.C3525q1.C3527b) r2
            kotlinx.coroutines.u1 r0 = r2.mo10142d()
            r7.m12696a((kotlinx.coroutines.C3540u1) r0, (java.lang.Throwable) r8)
        L_0x0047:
            return r5
        L_0x0048:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x004b:
            boolean r3 = r2 instanceof kotlinx.coroutines.C3419e1
            if (r3 == 0) goto L_0x00a2
            if (r1 == 0) goto L_0x0052
            goto L_0x0056
        L_0x0052:
            java.lang.Throwable r1 = r7.m12708e((java.lang.Object) r8)
        L_0x0056:
            r3 = r2
            kotlinx.coroutines.e1 r3 = (kotlinx.coroutines.C3419e1) r3
            boolean r6 = r3.mo10141b()
            if (r6 == 0) goto L_0x0066
            boolean r2 = r7.m12699a((kotlinx.coroutines.C3419e1) r3, (java.lang.Throwable) r1)
            if (r2 == 0) goto L_0x0002
            return r5
        L_0x0066:
            kotlinx.coroutines.r r3 = new kotlinx.coroutines.r
            r6 = 2
            r3.<init>(r1, r4, r6, r0)
            int r3 = r7.m12686a((java.lang.Object) r2, (java.lang.Object) r3, (int) r4)
            if (r3 == 0) goto L_0x0087
            if (r3 == r5) goto L_0x0086
            if (r3 == r6) goto L_0x0086
            r2 = 3
            if (r3 != r2) goto L_0x007a
            goto L_0x0002
        L_0x007a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected result"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0086:
            return r5
        L_0x0087:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Cannot happen in "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L_0x00a2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C3525q1.m12711g(java.lang.Object):boolean");
    }

    /* renamed from: h */
    private final int m12712h(Object obj) {
        if (obj instanceof C3545w0) {
            if (((C3545w0) obj).mo10141b()) {
                return 0;
            }
            if (!f8236f.compareAndSet(this, obj, C3531r1.f8249c)) {
                return -1;
            }
            mo10102n();
            return 1;
        } else if (!(obj instanceof C3415d1)) {
            return 0;
        } else {
            if (!f8236f.compareAndSet(this, obj, ((C3415d1) obj).mo10142d())) {
                return -1;
            }
            mo10102n();
            return 1;
        }
    }

    /* renamed from: i */
    private final String m12713i(Object obj) {
        if (!(obj instanceof C3527b)) {
            return obj instanceof C3419e1 ? ((C3419e1) obj).mo10141b() ? "Active" : "New" : obj instanceof C3529r ? "Cancelled" : "Completed";
        }
        C3527b bVar = (C3527b) obj;
        return bVar.mo10307a() ? "Cancelling" : bVar.isCompleting ? "Completing" : "Active";
    }

    /* renamed from: p */
    private final C3505k1 mo10103p() {
        return new C3505k1("Job was cancelled", (Throwable) null, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final CancellationException mo10292a(Throwable th, String str) {
        C3370k.m12227b(th, "$this$toCancellationException");
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException == null) {
            if (str == null) {
                str = C3504k0.m12634a((Object) th) + " was cancelled";
            }
            cancellationException = new C3505k1(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: a */
    public final C3509m mo10269a(C3515o oVar) {
        C3370k.m12227b(oVar, "child");
        C3539u0 a = C3499j1.C3500a.m12630a(this, true, false, new C3512n(this, oVar), 2, (Object) null);
        if (a != null) {
            return (C3509m) a;
        }
        throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    /* renamed from: a */
    public final C3539u0 mo10270a(boolean z, boolean z2, C3350b<? super Throwable, Unit> bVar) {
        Throwable th;
        C3370k.m12227b(bVar, "handler");
        Throwable th2 = null;
        C3522p1<?> p1Var = null;
        while (true) {
            Object j = mo10302j();
            if (j instanceof C3545w0) {
                C3545w0 w0Var = (C3545w0) j;
                if (w0Var.mo10141b()) {
                    if (p1Var == null) {
                        p1Var = m12691a(bVar, z);
                    }
                    if (f8236f.compareAndSet(this, j, p1Var)) {
                        return p1Var;
                    }
                } else {
                    m12697a(w0Var);
                }
            } else if (j instanceof C3419e1) {
                C3540u1 d = ((C3419e1) j).mo10142d();
                if (d != null) {
                    C3539u0 u0Var = C3543v1.f8258f;
                    if (!z || !(j instanceof C3527b)) {
                        th = null;
                    } else {
                        synchronized (j) {
                            th = ((C3527b) j).rootCause;
                            if (th == null || ((bVar instanceof C3512n) && !((C3527b) j).isCompleting)) {
                                if (p1Var == null) {
                                    p1Var = m12691a(bVar, z);
                                }
                                if (m12698a(j, d, p1Var)) {
                                    if (th == null) {
                                        return p1Var;
                                    }
                                    u0Var = p1Var;
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                    if (th != null) {
                        if (z2) {
                            bVar.mo5146a(th);
                        }
                        return u0Var;
                    }
                    if (p1Var == null) {
                        p1Var = m12691a(bVar, z);
                    }
                    if (m12698a(j, d, p1Var)) {
                        return p1Var;
                    }
                } else if (j != null) {
                    m12702b((C3522p1<?>) (C3522p1) j);
                } else {
                    throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>");
                }
            } else {
                if (z2) {
                    if (!(j instanceof C3529r)) {
                        j = null;
                    }
                    C3529r rVar = (C3529r) j;
                    if (rVar != null) {
                        th2 = rVar.f8245a;
                    }
                    bVar.mo5146a(th2);
                }
                return C3543v1.f8258f;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10254a(Object obj, int i) {
    }

    /* renamed from: a */
    public void mo10271a(CancellationException cancellationException) {
        mo10295a((Throwable) cancellationException);
    }

    /* renamed from: a */
    public final void mo10293a(C3499j1 j1Var) {
        if (C3498j0.m12618a()) {
            if (!(this.parentHandle == null)) {
                throw new AssertionError();
            }
        }
        if (j1Var == null) {
            this.parentHandle = C3543v1.f8258f;
            return;
        }
        j1Var.start();
        C3509m a = j1Var.mo10269a((C3515o) this);
        this.parentHandle = a;
        if (mo10303k()) {
            a.mo10290a();
            this.parentHandle = C3543v1.f8258f;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x001d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10294a(kotlinx.coroutines.C3522p1<?> r4) {
        /*
            r3 = this;
            java.lang.String r0 = "node"
            kotlin.p205x.p207d.C3370k.m12227b(r4, r0)
        L_0x0005:
            java.lang.Object r0 = r3.mo10302j()
            boolean r1 = r0 instanceof kotlinx.coroutines.C3522p1
            if (r1 == 0) goto L_0x001d
            if (r0 == r4) goto L_0x0010
            return
        L_0x0010:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f8236f
            kotlinx.coroutines.w0 r2 = kotlinx.coroutines.C3531r1.f8249c
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L_0x0005
            return
        L_0x001d:
            boolean r1 = r0 instanceof kotlinx.coroutines.C3419e1
            if (r1 == 0) goto L_0x002c
            kotlinx.coroutines.e1 r0 = (kotlinx.coroutines.C3419e1) r0
            kotlinx.coroutines.u1 r0 = r0.mo10142d()
            if (r0 == 0) goto L_0x002c
            r4.mo10237k()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C3525q1.mo10294a(kotlinx.coroutines.p1):void");
    }

    /* renamed from: a */
    public final void mo10284a(C3549x1 x1Var) {
        C3370k.m12227b(x1Var, "parentJob");
        mo10296b((Object) x1Var);
    }

    /* renamed from: a */
    public boolean mo10295a(Throwable th) {
        return mo10296b((Object) th) && mo10282h();
    }

    /* renamed from: b */
    public boolean mo10097b() {
        Object j = mo10302j();
        return (j instanceof C3419e1) && ((C3419e1) j).mo10141b();
    }

    /* renamed from: b */
    public final boolean mo10296b(Object obj) {
        if (!mo10283i() || !mo10099d(obj)) {
            return m12711g(obj);
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo10297b(Object obj, int i) {
        int a;
        do {
            a = m12686a(mo10302j(), obj, i);
            if (a == 0) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, " + "but is being completed with " + obj, m12709f(obj));
            } else if (a == 1) {
                return true;
            } else {
                if (a == 2) {
                    return false;
                }
            }
        } while (a == 3);
        throw new IllegalStateException("unexpected result".toString());
    }

    /* renamed from: b */
    public boolean mo10298b(Throwable th) {
        C3370k.m12227b(th, "cause");
        if (th instanceof CancellationException) {
            return true;
        }
        return mo10296b((Object) th) && mo10282h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo10098c(Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo10299c(Throwable th) {
        C3370k.m12227b(th, "exception");
        return false;
    }

    /* renamed from: d */
    public final CancellationException mo10272d() {
        Object j = mo10302j();
        if (j instanceof C3527b) {
            Throwable th = ((C3527b) j).rootCause;
            if (th != null) {
                CancellationException a = mo10292a(th, C3504k0.m12634a((Object) this) + " is cancelling");
                if (a != null) {
                    return a;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (j instanceof C3419e1) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (j instanceof C3529r) {
            return m12688a(this, ((C3529r) j).f8245a, (String) null, 1, (Object) null);
        } else {
            return new C3505k1(C3504k0.m12634a((Object) this) + " has completed normally", (Throwable) null, this);
        }
    }

    /* renamed from: d */
    public void mo10100d(Throwable th) {
        C3370k.m12227b(th, "exception");
        throw th;
    }

    /* renamed from: e */
    public CancellationException mo10300e() {
        Throwable th;
        Object j = mo10302j();
        CancellationException cancellationException = null;
        if (j instanceof C3527b) {
            th = ((C3527b) j).rootCause;
        } else if (j instanceof C3529r) {
            th = ((C3529r) j).f8245a;
        } else if (!(j instanceof C3419e1)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + j).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new C3505k1("Parent job is " + m12713i(j), th, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo10301e(Throwable th) {
    }

    public <R> R fold(R r, C3351c<? super R, ? super C3314f.C3317b, ? extends R> cVar) {
        C3370k.m12227b(cVar, "operation");
        return C3499j1.C3500a.m12627a(this, r, cVar);
    }

    public <E extends C3314f.C3317b> E get(C3314f.C3319c<E> cVar) {
        C3370k.m12227b(cVar, "key");
        return C3499j1.C3500a.m12628a((C3499j1) this, cVar);
    }

    public final C3314f.C3319c<?> getKey() {
        return C3499j1.f8214d;
    }

    /* renamed from: h */
    public boolean mo10282h() {
        return true;
    }

    /* renamed from: i */
    public boolean mo10283i() {
        return false;
    }

    /* renamed from: j */
    public final Object mo10302j() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C3482p)) {
                return obj;
            }
            ((C3482p) obj).mo10216a(this);
        }
    }

    /* renamed from: k */
    public final boolean mo10303k() {
        return !(mo10302j() instanceof C3419e1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo10255l() {
        return false;
    }

    /* renamed from: m */
    public String mo10101m() {
        return C3504k0.m12634a((Object) this);
    }

    public C3314f minusKey(C3314f.C3319c<?> cVar) {
        C3370k.m12227b(cVar, "key");
        return C3499j1.C3500a.m12632b(this, cVar);
    }

    /* renamed from: n */
    public void mo10102n() {
    }

    /* renamed from: o */
    public final String mo10304o() {
        return mo10101m() + '{' + m12713i(mo10302j()) + '}';
    }

    public C3314f plus(C3314f fVar) {
        C3370k.m12227b(fVar, "context");
        return C3499j1.C3500a.m12629a((C3499j1) this, fVar);
    }

    public final boolean start() {
        int h;
        do {
            h = m12712h(mo10302j());
            if (h == 0) {
                return false;
            }
        } while (h != 1);
        return true;
    }

    public String toString() {
        return mo10304o() + '@' + C3504k0.m12636b(this);
    }
}
