package kotlin.p201v.p202d;

import kotlin.p201v.C3340a;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.v.d.a */
public class C3344a extends C3340a {
    /* renamed from: a */
    public void mo10059a(Throwable th, Throwable th2) {
        C3370k.m12227b(th, "cause");
        C3370k.m12227b(th2, "exception");
        th.addSuppressed(th2);
    }
}
