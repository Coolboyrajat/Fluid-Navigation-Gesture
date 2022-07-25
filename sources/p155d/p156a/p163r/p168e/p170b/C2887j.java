package p155d.p156a.p163r.p168e.p170b;

import java.util.concurrent.Callable;
import p155d.p156a.C2790h;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p161p.C2819b;
import p155d.p156a.p163r.p165b.C2849b;
import p155d.p156a.p163r.p167d.C2860c;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.r.e.b.j */
public final class C2887j<T> extends C2790h<T> implements Callable<T> {

    /* renamed from: f */
    final Callable<? extends T> f7507f;

    public C2887j(Callable<? extends T> callable) {
        this.f7507f = callable;
    }

    /* renamed from: b */
    public void mo5871b(C2793k<? super T> kVar) {
        C2860c cVar = new C2860c(kVar);
        kVar.mo6031a((C2810b) cVar);
        if (!cVar.mo6028b()) {
            try {
                Object call = this.f7507f.call();
                C2849b.m11138a(call, "Callable returned null");
                cVar.mo8986c(call);
            } catch (Throwable th) {
                C2819b.m11088b(th);
                if (!cVar.mo6028b()) {
                    kVar.onError(th);
                } else {
                    C2962a.m11431b(th);
                }
            }
        }
    }

    public T call() {
        T call = this.f7507f.call();
        C2849b.m11138a(call, "The callable returned a null value");
        return call;
    }
}
