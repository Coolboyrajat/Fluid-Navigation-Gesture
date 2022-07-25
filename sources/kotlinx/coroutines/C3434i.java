package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p197u.p199i.p200a.C3331e;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3499j1;
import kotlinx.coroutines.internal.C3486t;

/* renamed from: kotlinx.coroutines.i */
public class C3434i<T> extends C3533s0<T> implements C3429h<T>, C3331e {

    /* renamed from: k */
    private static final AtomicIntegerFieldUpdater f8089k = AtomicIntegerFieldUpdater.newUpdater(C3434i.class, "_decision");

    /* renamed from: l */
    private static final AtomicReferenceFieldUpdater f8090l = AtomicReferenceFieldUpdater.newUpdater(C3434i.class, Object.class, "_state");
    private volatile int _decision = 0;
    private volatile Object _state = C3403b.f8065f;

    /* renamed from: i */
    private final C3314f f8091i = this.f8092j.mo10038a();

    /* renamed from: j */
    private final C3309c<T> f8092j;
    private volatile C3539u0 parentHandle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3434i(C3309c<? super T> cVar, int i) {
        super(i);
        C3370k.m12227b(cVar, "delegate");
        this.f8092j = cVar;
    }

    /* renamed from: a */
    private final C3503k m12356a(Object obj, int i) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof C3546w1)) {
                if (obj2 instanceof C3503k) {
                    C3503k kVar = (C3503k) obj2;
                    if (kVar.mo10274c()) {
                        return kVar;
                    }
                }
                m12360d(obj);
                throw null;
            }
        } while (!f8090l.compareAndSet(this, obj2, obj));
        m12361k();
        m12357a(i);
        return null;
    }

    /* renamed from: a */
    private final void m12357a(int i) {
        if (!m12363m()) {
            C3530r0.m12759a(this, i);
        }
    }

    /* renamed from: a */
    private final void m12358a(C3350b<? super Throwable, Unit> bVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + bVar + ", already has " + obj).toString());
    }

    /* renamed from: b */
    private final C3421f m12359b(C3350b<? super Throwable, Unit> bVar) {
        return bVar instanceof C3421f ? (C3421f) bVar : new C3427g1(bVar);
    }

    /* renamed from: d */
    private final void m12360d(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: k */
    private final void m12361k() {
        C3539u0 u0Var = this.parentHandle;
        if (u0Var != null) {
            u0Var.mo10290a();
            this.parentHandle = C3543v1.f8258f;
        }
    }

    /* renamed from: l */
    private final void m12362l() {
        C3499j1 j1Var;
        if (!mo10160i() && (j1Var = (C3499j1) this.f8092j.mo10038a().get(C3499j1.f8214d)) != null) {
            j1Var.start();
            C3539u0 a = C3499j1.C3500a.m12630a(j1Var, true, false, new C3506l(j1Var, this), 2, (Object) null);
            this.parentHandle = a;
            if (mo10160i()) {
                a.mo10290a();
                this.parentHandle = C3543v1.f8258f;
            }
        }
    }

    /* renamed from: m */
    private final boolean m12363m() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f8089k.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: n */
    private final boolean m12364n() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f8089k.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: a */
    public Throwable mo10152a(C3499j1 j1Var) {
        C3370k.m12227b(j1Var, "parent");
        return j1Var.mo10272d();
    }

    /* renamed from: a */
    public C3314f mo10038a() {
        return this.f8091i;
    }

    /* renamed from: a */
    public void mo10039a(Object obj) {
        m12356a(C3532s.m12768a(obj), this.f8250h);
    }

    /* renamed from: a */
    public void mo10153a(Object obj, Throwable th) {
        C3370k.m12227b(th, "cause");
        if (obj instanceof C3538u) {
            try {
                ((C3538u) obj).f8256b.mo5146a(th);
            } catch (Throwable th2) {
                C3314f a = mo10038a();
                C3404b0.m12305a(a, (Throwable) new C3544w("Exception in cancellation handler for " + this, th2));
            }
        }
    }

    /* renamed from: a */
    public void mo10146a(C3350b<? super Throwable, Unit> bVar) {
        Object obj;
        C3370k.m12227b(bVar, "handler");
        Throwable th = null;
        C3421f fVar = null;
        do {
            obj = this._state;
            if (obj instanceof C3403b) {
                if (fVar == null) {
                    fVar = m12359b(bVar);
                }
            } else if (obj instanceof C3421f) {
                m12358a(bVar, obj);
                throw null;
            } else if (!(obj instanceof C3503k)) {
                return;
            } else {
                if (((C3503k) obj).mo10313b()) {
                    try {
                        if (!(obj instanceof C3529r)) {
                            obj = null;
                        }
                        C3529r rVar = (C3529r) obj;
                        if (rVar != null) {
                            th = rVar.f8245a;
                        }
                        bVar.mo5146a(th);
                        return;
                    } catch (Throwable th2) {
                        C3404b0.m12305a(mo10038a(), (Throwable) new C3544w("Exception in cancellation handler for " + this, th2));
                        return;
                    }
                } else {
                    m12358a(bVar, obj);
                    throw null;
                }
            }
        } while (!f8090l.compareAndSet(this, obj, fVar));
    }

    /* renamed from: a */
    public void mo10147a(C3556z zVar, T t) {
        C3370k.m12227b(zVar, "$this$resumeUndispatched");
        C3309c<T> cVar = this.f8092j;
        C3556z zVar2 = null;
        if (!(cVar instanceof C3521p0)) {
            cVar = null;
        }
        C3521p0 p0Var = (C3521p0) cVar;
        if (p0Var != null) {
            zVar2 = p0Var.f8232l;
        }
        m12356a((Object) t, zVar2 == zVar ? 3 : this.f8250h);
    }

    /* renamed from: a */
    public boolean mo10154a(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof C3546w1)) {
                return false;
            }
            z = obj instanceof C3421f;
        } while (!f8090l.compareAndSet(this, obj, new C3503k(this, th, z)));
        if (z) {
            try {
                ((C3421f) obj).mo10144a(th);
            } catch (Throwable th2) {
                C3314f a = mo10038a();
                C3404b0.m12305a(a, (Throwable) new C3544w("Exception in cancellation handler for " + this, th2));
            }
        }
        m12361k();
        m12357a(0);
        return true;
    }

    /* renamed from: c */
    public <T> T mo10155c(Object obj) {
        return obj instanceof C3535t ? ((C3535t) obj).f8252a : obj instanceof C3538u ? ((C3538u) obj).f8255a : obj;
    }

    /* renamed from: c */
    public C3331e mo10046c() {
        C3309c<T> cVar = this.f8092j;
        if (!(cVar instanceof C3331e)) {
            cVar = null;
        }
        return (C3331e) cVar;
    }

    /* renamed from: d */
    public final C3309c<T> mo10156d() {
        return this.f8092j;
    }

    /* renamed from: e */
    public Object mo10157e() {
        return mo10159h();
    }

    /* renamed from: f */
    public final Object mo10158f() {
        C3499j1 j1Var;
        m12362l();
        if (m12364n()) {
            return C3326d.m12146a();
        }
        Object h = mo10159h();
        if (h instanceof C3529r) {
            throw C3486t.m12571a(((C3529r) h).f8245a, (C3309c<?>) this);
        } else if (this.f8250h != 1 || (j1Var = (C3499j1) mo10038a().get(C3499j1.f8214d)) == null || j1Var.mo10097b()) {
            return mo10155c(h);
        } else {
            CancellationException d = j1Var.mo10272d();
            mo10153a(h, (Throwable) d);
            throw C3486t.m12571a(d, (C3309c<?>) this);
        }
    }

    /* renamed from: g */
    public StackTraceElement mo10048g() {
        return null;
    }

    /* renamed from: h */
    public final Object mo10159h() {
        return this._state;
    }

    /* renamed from: i */
    public boolean mo10160i() {
        return !(mo10159h() instanceof C3546w1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo10161j() {
        return "CancellableContinuation";
    }

    public String toString() {
        return mo10161j() + '(' + C3504k0.m12635a((C3309c<?>) this.f8092j) + "){" + mo10159h() + "}@" + C3504k0.m12636b(this);
    }
}
