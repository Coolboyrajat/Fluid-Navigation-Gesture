package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.k1 */
public final class C3505k1 extends CancellationException implements C3547x<C3505k1> {

    /* renamed from: f */
    public final C3499j1 f8217f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3505k1(String str, Throwable th, C3499j1 j1Var) {
        super(str);
        C3370k.m12227b(str, "message");
        C3370k.m12227b(j1Var, "job");
        this.f8217f = j1Var;
        if (th != null) {
            initCause(th);
        }
    }

    /* renamed from: a */
    public C3505k1 m12638a() {
        if (!C3498j0.m12620c()) {
            return null;
        }
        String message = getMessage();
        if (message != null) {
            return new C3505k1(message, this, this.f8217f);
        }
        C3370k.m12221a();
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C3505k1) {
                C3505k1 k1Var = (C3505k1) obj;
                if (!C3370k.m12225a((Object) k1Var.getMessage(), (Object) getMessage()) || !C3370k.m12225a((Object) k1Var.f8217f, (Object) this.f8217f) || !C3370k.m12225a((Object) k1Var.getCause(), (Object) getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        if (!C3498j0.m12620c()) {
            return this;
        }
        Throwable fillInStackTrace = super.fillInStackTrace();
        C3370k.m12223a((Object) fillInStackTrace, "super.fillInStackTrace()");
        return fillInStackTrace;
    }

    public int hashCode() {
        String message = getMessage();
        if (message != null) {
            int hashCode = ((message.hashCode() * 31) + this.f8217f.hashCode()) * 31;
            Throwable cause = getCause();
            return hashCode + (cause != null ? cause.hashCode() : 0);
        }
        C3370k.m12221a();
        throw null;
    }

    public String toString() {
        return super.toString() + "; job=" + this.f8217f;
    }
}
