package kotlinx.coroutines;

import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.w */
public final class C3544w extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3544w(String str, Throwable th) {
        super(str, th);
        C3370k.m12227b(str, "message");
        C3370k.m12227b(th, "cause");
    }
}
