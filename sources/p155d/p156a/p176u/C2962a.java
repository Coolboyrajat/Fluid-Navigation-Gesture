package p155d.p156a.p176u;

import java.util.concurrent.Callable;
import p155d.p156a.C2783a;
import p155d.p156a.C2785c;
import p155d.p156a.C2790h;
import p155d.p156a.C2793k;
import p155d.p156a.C2794l;
import p155d.p156a.p161p.C2814a;
import p155d.p156a.p161p.C2820c;
import p155d.p156a.p161p.C2822e;
import p155d.p156a.p162q.C2824b;
import p155d.p156a.p162q.C2827e;
import p155d.p156a.p162q.C2828f;
import p155d.p156a.p163r.p165b.C2849b;
import p155d.p156a.p163r.p173h.C2951d;

/* renamed from: d.a.u.a */
public final class C2962a {

    /* renamed from: a */
    static volatile C2827e<? super Throwable> f7696a;

    /* renamed from: b */
    static volatile C2828f<? super Runnable, ? extends Runnable> f7697b;

    /* renamed from: c */
    static volatile C2828f<? super Callable<C2794l>, ? extends C2794l> f7698c;

    /* renamed from: d */
    static volatile C2828f<? super Callable<C2794l>, ? extends C2794l> f7699d;

    /* renamed from: e */
    static volatile C2828f<? super Callable<C2794l>, ? extends C2794l> f7700e;

    /* renamed from: f */
    static volatile C2828f<? super Callable<C2794l>, ? extends C2794l> f7701f;

    /* renamed from: g */
    static volatile C2828f<? super C2794l, ? extends C2794l> f7702g;

    /* renamed from: h */
    static volatile C2828f<? super C2794l, ? extends C2794l> f7703h;

    /* renamed from: i */
    static volatile C2828f<? super C2790h, ? extends C2790h> f7704i;

    /* renamed from: j */
    static volatile C2828f<? super C2783a, ? extends C2783a> f7705j;

    /* renamed from: k */
    static volatile C2824b<? super C2790h, ? super C2793k, ? extends C2793k> f7706k;

    /* renamed from: l */
    static volatile C2824b<? super C2783a, ? super C2785c, ? extends C2785c> f7707l;

    /* renamed from: a */
    public static C2783a m11418a(C2783a aVar) {
        C2828f<? super C2783a, ? extends C2783a> fVar = f7705j;
        return fVar != null ? (C2783a) m11426a(fVar, aVar) : aVar;
    }

    /* renamed from: a */
    public static C2785c m11419a(C2783a aVar, C2785c cVar) {
        C2824b<? super C2783a, ? super C2785c, ? extends C2785c> bVar = f7707l;
        return bVar != null ? (C2785c) m11425a(bVar, aVar, cVar) : cVar;
    }

    /* renamed from: a */
    public static <T> C2790h<T> m11420a(C2790h<T> hVar) {
        C2828f<? super C2790h, ? extends C2790h> fVar = f7704i;
        return fVar != null ? (C2790h) m11426a(fVar, hVar) : hVar;
    }

    /* renamed from: a */
    public static <T> C2793k<? super T> m11421a(C2790h<T> hVar, C2793k<? super T> kVar) {
        C2824b<? super C2790h, ? super C2793k, ? extends C2793k> bVar = f7706k;
        return bVar != null ? (C2793k) m11425a(bVar, hVar, kVar) : kVar;
    }

    /* renamed from: a */
    public static C2794l m11422a(C2794l lVar) {
        C2828f<? super C2794l, ? extends C2794l> fVar = f7702g;
        return fVar == null ? lVar : (C2794l) m11426a(fVar, lVar);
    }

    /* renamed from: a */
    static C2794l m11423a(C2828f<? super Callable<C2794l>, ? extends C2794l> fVar, Callable<C2794l> callable) {
        Object a = m11426a(fVar, callable);
        C2849b.m11138a(a, "Scheduler Callable result can't be null");
        return (C2794l) a;
    }

    /* renamed from: a */
    static C2794l m11424a(Callable<C2794l> callable) {
        try {
            C2794l call = callable.call();
            C2849b.m11138a(call, "Scheduler Callable result can't be null");
            return call;
        } catch (Throwable th) {
            throw C2951d.m11390a(th);
        }
    }

    /* renamed from: a */
    static <T, U, R> R m11425a(C2824b<T, U, R> bVar, T t, U u) {
        try {
            return bVar.mo8962a(t, u);
        } catch (Throwable th) {
            throw C2951d.m11390a(th);
        }
    }

    /* renamed from: a */
    static <T, R> R m11426a(C2828f<T, R> fVar, T t) {
        try {
            return fVar.mo6044a(t);
        } catch (Throwable th) {
            throw C2951d.m11390a(th);
        }
    }

    /* renamed from: a */
    public static Runnable m11427a(Runnable runnable) {
        C2849b.m11138a(runnable, "run is null");
        C2828f<? super Runnable, ? extends Runnable> fVar = f7697b;
        return fVar == null ? runnable : (Runnable) m11426a(fVar, runnable);
    }

    /* renamed from: a */
    static boolean m11428a(Throwable th) {
        return (th instanceof C2820c) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof C2814a);
    }

    /* renamed from: b */
    public static C2794l m11429b(C2794l lVar) {
        C2828f<? super C2794l, ? extends C2794l> fVar = f7703h;
        return fVar == null ? lVar : (C2794l) m11426a(fVar, lVar);
    }

    /* renamed from: b */
    public static C2794l m11430b(Callable<C2794l> callable) {
        C2849b.m11138a(callable, "Scheduler Callable can't be null");
        C2828f<? super Callable<C2794l>, ? extends C2794l> fVar = f7698c;
        return fVar == null ? m11424a(callable) : m11423a(fVar, callable);
    }

    /* renamed from: b */
    public static void m11431b(Throwable th) {
        C2827e<? super Throwable> eVar = f7696a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m11428a(th)) {
            th = new C2822e(th);
        }
        if (eVar != null) {
            try {
                eVar.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m11433c(th2);
            }
        }
        th.printStackTrace();
        m11433c(th);
    }

    /* renamed from: c */
    public static C2794l m11432c(Callable<C2794l> callable) {
        C2849b.m11138a(callable, "Scheduler Callable can't be null");
        C2828f<? super Callable<C2794l>, ? extends C2794l> fVar = f7700e;
        return fVar == null ? m11424a(callable) : m11423a(fVar, callable);
    }

    /* renamed from: c */
    static void m11433c(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: d */
    public static C2794l m11434d(Callable<C2794l> callable) {
        C2849b.m11138a(callable, "Scheduler Callable can't be null");
        C2828f<? super Callable<C2794l>, ? extends C2794l> fVar = f7701f;
        return fVar == null ? m11424a(callable) : m11423a(fVar, callable);
    }

    /* renamed from: e */
    public static C2794l m11435e(Callable<C2794l> callable) {
        C2849b.m11138a(callable, "Scheduler Callable can't be null");
        C2828f<? super Callable<C2794l>, ? extends C2794l> fVar = f7699d;
        return fVar == null ? m11424a(callable) : m11423a(fVar, callable);
    }
}
