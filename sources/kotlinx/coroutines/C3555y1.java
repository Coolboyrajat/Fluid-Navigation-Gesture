package kotlinx.coroutines;

import kotlin.C3262k;
import kotlin.C3265l;
import kotlin.Unit;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.internal.C3486t;
import kotlinx.coroutines.internal.C3491y;

/* renamed from: kotlinx.coroutines.y1 */
public final class C3555y1 {
    /* renamed from: a */
    public static final <T> void m12827a(C3309c<? super T> cVar, T t, int i) {
        C3370k.m12227b(cVar, "$this$resumeMode");
        if (i == 0) {
            C3262k.C3263a aVar = C3262k.f7982f;
            C3262k.m11974a(t);
            cVar.mo10039a(t);
        } else if (i == 1) {
            C3530r0.m12756a(cVar, t);
        } else if (i == 2) {
            C3530r0.m12761b(cVar, t);
        } else if (i == 3) {
            C3521p0 p0Var = (C3521p0) cVar;
            C3314f a = p0Var.mo10038a();
            Object b = C3491y.m12595b(a, p0Var.f8231k);
            try {
                C3309c<T> cVar2 = p0Var.f8233m;
                C3262k.C3263a aVar2 = C3262k.f7982f;
                C3262k.m11974a(t);
                cVar2.mo10039a(t);
                Unit unit = Unit.INSTANCE;
            } finally {
                C3491y.m12594a(a, b);
            }
        } else if (i != 4) {
            throw new IllegalStateException(("Invalid mode " + i).toString());
        }
    }

    /* renamed from: a */
    public static final <T> void m12828a(C3309c<? super T> cVar, Throwable th, int i) {
        C3370k.m12227b(cVar, "$this$resumeUninterceptedWithExceptionMode");
        C3370k.m12227b(th, "exception");
        if (i == 0) {
            cVar = C3323c.m12142a(cVar);
        } else if (i == 1) {
            C3530r0.m12757a(C3323c.m12142a(cVar), th);
            return;
        } else if (i != 2) {
            if (i == 3) {
                C3314f a = cVar.mo10038a();
                Object b = C3491y.m12595b(a, (Object) null);
                try {
                    C3262k.C3263a aVar = C3262k.f7982f;
                    Object a2 = C3265l.m11978a(th);
                    C3262k.m11974a(a2);
                    cVar.mo10039a(a2);
                    Unit unit = Unit.INSTANCE;
                    return;
                } finally {
                    C3491y.m12594a(a, b);
                }
            } else if (i != 4) {
                throw new IllegalStateException(("Invalid mode " + i).toString());
            } else {
                return;
            }
        }
        C3262k.C3263a aVar2 = C3262k.f7982f;
        Object a3 = C3265l.m11978a(th);
        C3262k.m11974a(a3);
        cVar.mo10039a(a3);
    }

    /* renamed from: a */
    public static final boolean m12829a(int i) {
        return i == 1;
    }

    /* renamed from: b */
    public static final <T> void m12830b(C3309c<? super T> cVar, T t, int i) {
        C3370k.m12227b(cVar, "$this$resumeUninterceptedMode");
        if (i == 0) {
            cVar = C3323c.m12142a(cVar);
        } else if (i == 1) {
            C3530r0.m12756a(C3323c.m12142a(cVar), t);
            return;
        } else if (i != 2) {
            if (i == 3) {
                C3314f a = cVar.mo10038a();
                Object b = C3491y.m12595b(a, (Object) null);
                try {
                    C3262k.C3263a aVar = C3262k.f7982f;
                    C3262k.m11974a(t);
                    cVar.mo10039a(t);
                    Unit unit = Unit.INSTANCE;
                    return;
                } finally {
                    C3491y.m12594a(a, b);
                }
            } else if (i != 4) {
                throw new IllegalStateException(("Invalid mode " + i).toString());
            } else {
                return;
            }
        }
        C3262k.C3263a aVar2 = C3262k.f7982f;
        C3262k.m11974a(t);
        cVar.mo10039a(t);
    }

    /* renamed from: b */
    public static final <T> void m12831b(C3309c<? super T> cVar, Throwable th, int i) {
        C3370k.m12227b(cVar, "$this$resumeWithExceptionMode");
        C3370k.m12227b(th, "exception");
        if (i == 0) {
            C3262k.C3263a aVar = C3262k.f7982f;
            Object a = C3265l.m11978a(th);
            C3262k.m11974a(a);
            cVar.mo10039a(a);
        } else if (i == 1) {
            C3530r0.m12757a(cVar, th);
        } else if (i == 2) {
            C3530r0.m12762b(cVar, th);
        } else if (i == 3) {
            C3521p0 p0Var = (C3521p0) cVar;
            C3314f a2 = p0Var.mo10038a();
            Object b = C3491y.m12595b(a2, p0Var.f8231k);
            try {
                C3309c<T> cVar2 = p0Var.f8233m;
                C3262k.C3263a aVar2 = C3262k.f7982f;
                Object a3 = C3265l.m11978a(C3486t.m12571a(th, (C3309c<?>) cVar2));
                C3262k.m11974a(a3);
                cVar2.mo10039a(a3);
                Unit unit = Unit.INSTANCE;
            } finally {
                C3491y.m12594a(a2, b);
            }
        } else if (i != 4) {
            throw new IllegalStateException(("Invalid mode " + i).toString());
        }
    }

    /* renamed from: b */
    public static final boolean m12832b(int i) {
        return i == 0 || i == 1;
    }
}
