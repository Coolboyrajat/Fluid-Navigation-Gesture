package kotlin.p197u;

import java.io.Serializable;
import kotlin.p197u.C3314f;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.u.g */
public final class C3320g implements C3314f, Serializable {

    /* renamed from: f */
    public static final C3320g f8003f = new C3320g();

    private C3320g() {
    }

    public <R> R fold(R r, C3351c<? super R, ? super C3314f.C3317b, ? extends R> cVar) {
        C3370k.m12227b(cVar, "operation");
        return r;
    }

    public <E extends C3314f.C3317b> E get(C3314f.C3319c<E> cVar) {
        C3370k.m12227b(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C3314f minusKey(C3314f.C3319c<?> cVar) {
        C3370k.m12227b(cVar, "key");
        return this;
    }

    public C3314f plus(C3314f fVar) {
        C3370k.m12227b(fVar, "context");
        return fVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
