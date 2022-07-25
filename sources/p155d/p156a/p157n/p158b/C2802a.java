package p155d.p156a.p157n.p158b;

import java.util.concurrent.Callable;
import p155d.p156a.C2794l;
import p155d.p156a.p161p.C2819b;
import p155d.p156a.p162q.C2828f;

/* renamed from: d.a.n.b.a */
public final class C2802a {

    /* renamed from: a */
    private static volatile C2828f<Callable<C2794l>, C2794l> f7393a;

    /* renamed from: b */
    private static volatile C2828f<C2794l, C2794l> f7394b;

    /* renamed from: a */
    public static C2794l m11049a(C2794l lVar) {
        if (lVar != null) {
            C2828f fVar = f7394b;
            return fVar == null ? lVar : (C2794l) m11052a(fVar, lVar);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [d.a.q.f<java.util.concurrent.Callable<d.a.l>, d.a.l>, d.a.q.f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p155d.p156a.C2794l m11050a(p155d.p156a.p162q.C2828f<java.util.concurrent.Callable<p155d.p156a.C2794l>, p155d.p156a.C2794l> r0, java.util.concurrent.Callable<p155d.p156a.C2794l> r1) {
        /*
            java.lang.Object r0 = m11052a(r0, r1)
            d.a.l r0 = (p155d.p156a.C2794l) r0
            if (r0 == 0) goto L_0x0009
            return r0
        L_0x0009:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Scheduler Callable returned null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p155d.p156a.p157n.p158b.C2802a.m11050a(d.a.q.f, java.util.concurrent.Callable):d.a.l");
    }

    /* renamed from: a */
    static C2794l m11051a(Callable<C2794l> callable) {
        try {
            C2794l call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            C2819b.m11087a(th);
            throw null;
        }
    }

    /* renamed from: a */
    static <T, R> R m11052a(C2828f<T, R> fVar, T t) {
        try {
            return fVar.mo6044a(t);
        } catch (Throwable th) {
            C2819b.m11087a(th);
            throw null;
        }
    }

    /* renamed from: b */
    public static C2794l m11053b(Callable<C2794l> callable) {
        if (callable != null) {
            C2828f<Callable<C2794l>, C2794l> fVar = f7393a;
            return fVar == null ? m11051a(callable) : m11050a(fVar, callable);
        }
        throw new NullPointerException("scheduler == null");
    }
}
