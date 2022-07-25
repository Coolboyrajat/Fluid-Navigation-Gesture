package p155d.p156a.p163r.p168e.p169a;

import java.util.concurrent.Callable;
import p155d.p156a.C2783a;
import p155d.p156a.C2785c;
import p155d.p156a.C2786d;
import p155d.p156a.p161p.C2819b;
import p155d.p156a.p163r.p164a.C2833c;
import p155d.p156a.p163r.p165b.C2849b;

/* renamed from: d.a.r.e.a.a */
public final class C2863a extends C2783a {

    /* renamed from: a */
    final Callable<? extends C2786d> f7440a;

    public C2863a(Callable<? extends C2786d> callable) {
        this.f7440a = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8899b(C2785c cVar) {
        try {
            Object call = this.f7440a.call();
            C2849b.m11138a(call, "The completableSupplier returned a null CompletableSource");
            ((C2786d) call).mo8898a(cVar);
        } catch (Throwable th) {
            C2819b.m11088b(th);
            C2833c.m11109a(th, cVar);
        }
    }
}
