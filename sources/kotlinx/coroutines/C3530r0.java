package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C3262k;
import kotlin.C3265l;
import kotlin.Unit;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.internal.C3486t;
import kotlinx.coroutines.internal.C3487u;
import kotlinx.coroutines.internal.C3491y;

/* renamed from: kotlinx.coroutines.r0 */
public final class C3530r0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C3487u f8246a = new C3487u("UNDEFINED");

    /* renamed from: a */
    public static final <T> void m12756a(C3309c<? super T> cVar, T t) {
        boolean z;
        C3314f a;
        Object b;
        C3370k.m12227b(cVar, "$this$resumeCancellable");
        if (cVar instanceof C3521p0) {
            C3521p0 p0Var = (C3521p0) cVar;
            if (p0Var.f8232l.mo10113b(p0Var.mo10038a())) {
                p0Var.f8229i = t;
                p0Var.f8250h = 1;
                p0Var.f8232l.mo10112a(p0Var.mo10038a(), p0Var);
                return;
            }
            C3548x0 a2 = C3406b2.f8069b.mo10120a();
            if (a2.mo10328i()) {
                p0Var.f8229i = t;
                p0Var.f8250h = 1;
                a2.mo10324a((C3533s0<?>) p0Var);
                return;
            }
            a2.mo10326b(true);
            try {
                C3499j1 j1Var = (C3499j1) p0Var.mo10038a().get(C3499j1.f8214d);
                if (j1Var == null || j1Var.mo10097b()) {
                    z = false;
                } else {
                    CancellationException d = j1Var.mo10272d();
                    C3262k.C3263a aVar = C3262k.f7982f;
                    Object a3 = C3265l.m11978a((Throwable) d);
                    C3262k.m11974a(a3);
                    p0Var.mo10039a(a3);
                    z = true;
                }
                if (!z) {
                    a = p0Var.mo10038a();
                    b = C3491y.m12595b(a, p0Var.f8231k);
                    C3309c<T> cVar2 = p0Var.f8233m;
                    C3262k.C3263a aVar2 = C3262k.f7982f;
                    C3262k.m11974a(t);
                    cVar2.mo10039a(t);
                    Unit unit = Unit.INSTANCE;
                    C3491y.m12594a(a, b);
                }
                do {
                } while (a2.mo10330k());
            } catch (Throwable th) {
                try {
                    p0Var.mo10315a(th, (Throwable) null);
                } catch (Throwable th2) {
                    a2.mo10325a(true);
                    throw th2;
                }
            }
            a2.mo10325a(true);
            return;
        }
        C3262k.C3263a aVar3 = C3262k.f7982f;
        C3262k.m11974a(t);
        cVar.mo10039a(t);
    }

    /* renamed from: a */
    public static final <T> void m12757a(C3309c<? super T> cVar, Throwable th) {
        C3314f a;
        Object b;
        C3370k.m12227b(cVar, "$this$resumeCancellableWithException");
        C3370k.m12227b(th, "exception");
        if (cVar instanceof C3521p0) {
            C3521p0 p0Var = (C3521p0) cVar;
            C3314f a2 = p0Var.f8233m.mo10038a();
            boolean z = false;
            C3529r rVar = new C3529r(th, false, 2, (C3366g) null);
            if (p0Var.f8232l.mo10113b(a2)) {
                p0Var.f8229i = new C3529r(th, false, 2, (C3366g) null);
                p0Var.f8250h = 1;
                p0Var.f8232l.mo10112a(a2, p0Var);
                return;
            }
            C3548x0 a3 = C3406b2.f8069b.mo10120a();
            if (a3.mo10328i()) {
                p0Var.f8229i = rVar;
                p0Var.f8250h = 1;
                a3.mo10324a((C3533s0<?>) p0Var);
                return;
            }
            a3.mo10326b(true);
            try {
                C3499j1 j1Var = (C3499j1) p0Var.mo10038a().get(C3499j1.f8214d);
                if (j1Var != null && !j1Var.mo10097b()) {
                    CancellationException d = j1Var.mo10272d();
                    C3262k.C3263a aVar = C3262k.f7982f;
                    Object a4 = C3265l.m11978a((Throwable) d);
                    C3262k.m11974a(a4);
                    p0Var.mo10039a(a4);
                    z = true;
                }
                if (!z) {
                    a = p0Var.mo10038a();
                    b = C3491y.m12595b(a, p0Var.f8231k);
                    C3309c<T> cVar2 = p0Var.f8233m;
                    C3262k.C3263a aVar2 = C3262k.f7982f;
                    Object a5 = C3265l.m11978a(C3486t.m12571a(th, (C3309c<?>) cVar2));
                    C3262k.m11974a(a5);
                    cVar2.mo10039a(a5);
                    Unit unit = Unit.INSTANCE;
                    C3491y.m12594a(a, b);
                }
                do {
                } while (a3.mo10330k());
            } catch (Throwable th2) {
                try {
                    p0Var.mo10315a(th2, (Throwable) null);
                } catch (Throwable th3) {
                    a3.mo10325a(true);
                    throw th3;
                }
            }
            a3.mo10325a(true);
            return;
        }
        C3262k.C3263a aVar3 = C3262k.f7982f;
        Object a6 = C3265l.m11978a(C3486t.m12571a(th, (C3309c<?>) cVar));
        C3262k.m11974a(a6);
        cVar.mo10039a(a6);
    }

    /* renamed from: a */
    private static final void m12758a(C3533s0<?> s0Var) {
        C3548x0 a = C3406b2.f8069b.mo10120a();
        if (a.mo10328i()) {
            a.mo10324a(s0Var);
            return;
        }
        a.mo10326b(true);
        try {
            m12760a(s0Var, s0Var.mo10156d(), 3);
            do {
            } while (a.mo10330k());
        } catch (Throwable th) {
            a.mo10325a(true);
            throw th;
        }
        a.mo10325a(true);
    }

    /* renamed from: a */
    public static final <T> void m12759a(C3533s0<? super T> s0Var, int i) {
        C3370k.m12227b(s0Var, "$this$dispatch");
        C3309c<? super T> d = s0Var.mo10156d();
        if (!C3555y1.m12832b(i) || !(d instanceof C3521p0) || C3555y1.m12829a(i) != C3555y1.m12829a(s0Var.f8250h)) {
            m12760a(s0Var, d, i);
            return;
        }
        C3556z zVar = ((C3521p0) d).f8232l;
        C3314f a = d.mo10038a();
        if (zVar.mo10113b(a)) {
            zVar.mo10112a(a, s0Var);
        } else {
            m12758a(s0Var);
        }
    }

    /* renamed from: a */
    public static final <T> void m12760a(C3533s0<? super T> s0Var, C3309c<? super T> cVar, int i) {
        C3370k.m12227b(s0Var, "$this$resume");
        C3370k.m12227b(cVar, "delegate");
        Object e = s0Var.mo10157e();
        Throwable b = s0Var.mo10316b(e);
        if (b != null) {
            if (!(cVar instanceof C3533s0)) {
                b = C3486t.m12571a(b, (C3309c<?>) cVar);
            }
            C3555y1.m12831b(cVar, b, i);
            return;
        }
        C3555y1.m12827a(cVar, s0Var.mo10155c(e), i);
    }

    /* renamed from: b */
    public static final <T> void m12761b(C3309c<? super T> cVar, T t) {
        C3370k.m12227b(cVar, "$this$resumeDirect");
        boolean z = cVar instanceof C3521p0;
        C3309c<T> cVar2 = cVar;
        if (z) {
            cVar2 = ((C3521p0) cVar).f8233m;
        }
        C3262k.C3263a aVar = C3262k.f7982f;
        C3262k.m11974a(t);
        cVar2.mo10039a(t);
    }

    /* renamed from: b */
    public static final <T> void m12762b(C3309c<? super T> cVar, Throwable th) {
        C3370k.m12227b(cVar, "$this$resumeDirectWithException");
        C3370k.m12227b(th, "exception");
        boolean z = cVar instanceof C3521p0;
        C3309c<T> cVar2 = cVar;
        if (z) {
            cVar2 = ((C3521p0) cVar).f8233m;
        }
        C3262k.C3263a aVar = C3262k.f7982f;
        Object a = C3265l.m11978a(C3486t.m12571a(th, (C3309c<?>) cVar2));
        C3262k.m11974a(a);
        cVar2.mo10039a(a);
    }
}
