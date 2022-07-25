package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.internal.C3476l;

/* renamed from: kotlinx.coroutines.internal.k */
public class C3475k<E> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8181a = AtomicReferenceFieldUpdater.newUpdater(C3475k.class, Object.class, "_cur$internal");
    public volatile /* synthetic */ Object _cur$internal;

    public C3475k(boolean z) {
        this._cur$internal = new C3476l(8, z);
    }

    /* renamed from: a */
    public final void mo10239a() {
        while (true) {
            C3476l lVar = (C3476l) this._cur$internal;
            if (!lVar.mo10244a()) {
                f8181a.compareAndSet(this, lVar, lVar.mo10247d());
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo10240a(E e) {
        C3370k.m12227b(e, "element");
        while (true) {
            C3476l lVar = (C3476l) this._cur$internal;
            int a = lVar.mo10243a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                f8181a.compareAndSet(this, lVar, lVar.mo10247d());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final int mo10241b() {
        return ((C3476l) this._cur$internal).mo10245b();
    }

    /* renamed from: c */
    public final E mo10242c() {
        E e;
        E e2;
        while (true) {
            C3476l lVar = (C3476l) this._cur$internal;
            while (true) {
                long j = lVar._state$internal;
                e = null;
                if ((1152921504606846976L & j) == 0) {
                    C3476l.C3477a aVar = C3476l.f8185h;
                    int i = (int) ((1073741823 & j) >> 0);
                    if ((lVar.f8186a & ((int) ((1152921503533105152L & j) >> 30))) == (lVar.f8186a & i)) {
                        break;
                    }
                    e2 = lVar.f8187b.get(lVar.f8186a & i);
                    if (e2 != null) {
                        if (!(e2 instanceof C3476l.C3478b)) {
                            int i2 = (i + 1) & 1073741823;
                            if (!C3476l.f8183f.compareAndSet(lVar, j, C3476l.f8185h.mo10250a(j, i2))) {
                                if (lVar.f8189d) {
                                    C3476l lVar2 = lVar;
                                    do {
                                        lVar2 = lVar2.m12536a(i, i2);
                                    } while (lVar2 != null);
                                    break;
                                }
                            } else {
                                lVar.f8187b.set(lVar.f8186a & i, (Object) null);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (lVar.f8189d) {
                        break;
                    }
                } else {
                    e = C3476l.f8184g;
                    break;
                }
            }
            e = e2;
            if (e != C3476l.f8184g) {
                return e;
            }
            f8181a.compareAndSet(this, lVar, lVar.mo10247d());
        }
    }
}
