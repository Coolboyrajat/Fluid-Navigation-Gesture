package p155d.p156a;

import java.util.concurrent.Callable;
import p155d.p156a.p161p.C2819b;
import p155d.p156a.p163r.p165b.C2849b;
import p155d.p156a.p163r.p168e.p169a.C2863a;
import p155d.p156a.p163r.p168e.p169a.C2864b;
import p155d.p156a.p163r.p168e.p169a.C2865c;
import p155d.p156a.p163r.p168e.p169a.C2866d;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.a */
public abstract class C2783a implements C2786d {
    /* renamed from: a */
    public static C2783a m10977a() {
        return C2962a.m11418a(C2864b.f7441a);
    }

    /* renamed from: a */
    public static C2783a m10978a(Throwable th) {
        C2849b.m11138a(th, "error is null");
        return C2962a.m11418a((C2783a) new C2865c(th));
    }

    /* renamed from: a */
    public static C2783a m10979a(Callable<? extends C2786d> callable) {
        C2849b.m11138a(callable, "completableSupplier");
        return C2962a.m11418a((C2783a) new C2863a(callable));
    }

    /* renamed from: b */
    public static C2783a m10980b() {
        return C2962a.m11418a(C2866d.f7443a);
    }

    /* renamed from: b */
    private static NullPointerException m10981b(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    /* renamed from: a */
    public final void mo8898a(C2785c cVar) {
        C2849b.m11138a(cVar, "observer is null");
        try {
            C2785c a = C2962a.m11419a(this, cVar);
            C2849b.m11138a(a, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo8899b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C2819b.m11088b(th);
            C2962a.m11431b(th);
            throw m10981b(th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo8899b(C2785c cVar);
}
