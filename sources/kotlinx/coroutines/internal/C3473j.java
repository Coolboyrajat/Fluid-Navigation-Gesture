package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3498j0;

/* renamed from: kotlinx.coroutines.internal.j */
public class C3473j {

    /* renamed from: f */
    static final AtomicReferenceFieldUpdater f8176f;

    /* renamed from: g */
    static final AtomicReferenceFieldUpdater f8177g;

    /* renamed from: h */
    private static final AtomicReferenceFieldUpdater f8178h;
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.internal.j$a */
    public static abstract class C3474a extends C3459c<C3473j> {

        /* renamed from: b */
        public C3473j f8179b;

        /* renamed from: c */
        public final C3473j f8180c;

        public C3474a(C3473j jVar) {
            C3370k.m12227b(jVar, "newNode");
            this.f8180c = jVar;
        }

        /* renamed from: a */
        public void mo10217a(C3473j jVar, Object obj) {
            C3370k.m12227b(jVar, "affected");
            boolean z = obj == null;
            C3473j jVar2 = z ? this.f8180c : this.f8179b;
            if (jVar2 != null && C3473j.f8176f.compareAndSet(jVar, this, jVar2) && z) {
                C3473j jVar3 = this.f8180c;
                C3473j jVar4 = this.f8179b;
                if (jVar4 != null) {
                    jVar3.m12515b(jVar4);
                } else {
                    C3370k.m12221a();
                    throw null;
                }
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C3473j> cls2 = C3473j.class;
        f8176f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f8177g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f8178h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* renamed from: a */
    private final C3473j m12513a(C3473j jVar, C3482p pVar) {
        Object obj;
        while (true) {
            C3473j jVar2 = null;
            while (true) {
                obj = jVar._next;
                if (obj == pVar) {
                    return jVar;
                }
                if (obj instanceof C3482p) {
                    ((C3482p) obj).mo10216a(jVar);
                } else if (!(obj instanceof C3483q)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof C3483q) {
                        return null;
                    }
                    if (obj != this) {
                        if (obj != null) {
                            jVar2 = jVar;
                            jVar = (C3473j) obj;
                        } else {
                            throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                    } else if (obj2 == jVar) {
                        return null;
                    } else {
                        if (f8177g.compareAndSet(this, obj2, jVar) && !(jVar._prev instanceof C3483q)) {
                            return null;
                        }
                    }
                } else if (jVar2 != null) {
                    break;
                } else {
                    jVar = C3472i.m12512a(jVar._prev);
                }
            }
            jVar.m12518m();
            f8176f.compareAndSet(jVar2, jVar, ((C3483q) obj).f8195a);
            jVar = jVar2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m12515b(C3473j jVar) {
        Object obj;
        do {
            obj = jVar._prev;
            if ((obj instanceof C3483q) || mo10231e() != jVar) {
                return;
            }
        } while (!f8177g.compareAndSet(jVar, obj, this));
        if (!(mo10231e() instanceof C3483q)) {
            return;
        }
        if (obj != null) {
            jVar.m12513a((C3473j) obj, (C3482p) null);
            return;
        }
        throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: c */
    private final void m12516c(C3473j jVar) {
        mo10235i();
        jVar.m12513a(C3472i.m12512a(this._prev), (C3482p) null);
    }

    /* renamed from: l */
    private final C3473j m12517l() {
        C3473j jVar = this;
        while (!(jVar instanceof C3471h)) {
            jVar = jVar.mo10232f();
            if (C3498j0.m12618a()) {
                if (!(jVar != this)) {
                    throw new AssertionError();
                }
            }
        }
        return jVar;
    }

    /* renamed from: m */
    private final C3473j m12518m() {
        Object obj;
        C3473j jVar;
        do {
            obj = this._prev;
            if (obj instanceof C3483q) {
                return ((C3483q) obj).f8195a;
            }
            if (obj == this) {
                jVar = m12517l();
            } else if (obj != null) {
                jVar = (C3473j) obj;
            } else {
                throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f8177g.compareAndSet(this, obj, jVar.m12519n()));
        return (C3473j) obj;
    }

    /* renamed from: n */
    private final C3483q m12519n() {
        C3483q qVar = (C3483q) this._removedRef;
        if (qVar != null) {
            return qVar;
        }
        C3483q qVar2 = new C3483q(this);
        f8178h.lazySet(this, qVar2);
        return qVar2;
    }

    /* renamed from: a */
    public final int mo10229a(C3473j jVar, C3473j jVar2, C3474a aVar) {
        C3370k.m12227b(jVar, "node");
        C3370k.m12227b(jVar2, "next");
        C3370k.m12227b(aVar, "condAdd");
        f8177g.lazySet(jVar, this);
        f8176f.lazySet(jVar, jVar2);
        aVar.f8179b = jVar2;
        if (!f8176f.compareAndSet(this, jVar2, aVar)) {
            return 0;
        }
        return aVar.mo10216a(this) == null ? 1 : 2;
    }

    /* renamed from: a */
    public final boolean mo10230a(C3473j jVar) {
        C3370k.m12227b(jVar, "node");
        f8177g.lazySet(jVar, this);
        f8176f.lazySet(jVar, this);
        while (mo10231e() == this) {
            if (f8176f.compareAndSet(this, this, jVar)) {
                jVar.m12515b(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final Object mo10231e() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C3482p)) {
                return obj;
            }
            ((C3482p) obj).mo10216a(this);
        }
    }

    /* renamed from: f */
    public final C3473j mo10232f() {
        return C3472i.m12512a(mo10231e());
    }

    /* renamed from: g */
    public final Object mo10233g() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof C3483q) {
                return obj;
            }
            if (obj != null) {
                C3473j jVar = (C3473j) obj;
                if (jVar.mo10231e() == this) {
                    return obj;
                }
                m12513a(jVar, (C3482p) null);
            } else {
                throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    /* renamed from: h */
    public final C3473j mo10234h() {
        return C3472i.m12512a(mo10233g());
    }

    /* renamed from: i */
    public final void mo10235i() {
        Object e;
        C3473j m = m12518m();
        Object obj = this._next;
        if (obj != null) {
            C3473j jVar = ((C3483q) obj).f8195a;
            while (true) {
                C3473j jVar2 = null;
                while (true) {
                    Object e2 = jVar.mo10231e();
                    if (e2 instanceof C3483q) {
                        jVar.m12518m();
                        jVar = ((C3483q) e2).f8195a;
                    } else {
                        e = m.mo10231e();
                        if (e instanceof C3483q) {
                            if (jVar2 != null) {
                                break;
                            }
                            m = C3472i.m12512a(m._prev);
                        } else if (e != this) {
                            if (e != null) {
                                C3473j jVar3 = (C3473j) e;
                                if (jVar3 != jVar) {
                                    C3473j jVar4 = jVar3;
                                    jVar2 = m;
                                    m = jVar4;
                                } else {
                                    return;
                                }
                            } else {
                                throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                            }
                        } else if (f8176f.compareAndSet(m, this, jVar)) {
                            return;
                        }
                    }
                }
                m.m12518m();
                f8176f.compareAndSet(jVar2, m, ((C3483q) e).f8195a);
                m = jVar2;
            }
        } else {
            throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
        }
    }

    /* renamed from: j */
    public final boolean mo10236j() {
        return mo10231e() instanceof C3483q;
    }

    /* renamed from: k */
    public boolean mo10237k() {
        Object e;
        C3473j jVar;
        do {
            e = mo10231e();
            if ((e instanceof C3483q) || e == this) {
                return false;
            }
            if (e != null) {
                jVar = (C3473j) e;
            } else {
                throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f8176f.compareAndSet(this, e, jVar.m12519n()));
        m12516c(jVar);
        return true;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }
}
