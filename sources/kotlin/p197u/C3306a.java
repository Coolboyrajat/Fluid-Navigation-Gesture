package kotlin.p197u;

import kotlin.p197u.C3314f;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.u.a */
public abstract class C3306a implements C3314f.C3317b {
    private final C3314f.C3319c<?> key;

    public C3306a(C3314f.C3319c<?> cVar) {
        C3370k.m12227b(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r, C3351c<? super R, ? super C3314f.C3317b, ? extends R> cVar) {
        C3370k.m12227b(cVar, "operation");
        return C3314f.C3317b.C3318a.m12135a(this, r, cVar);
    }

    public <E extends C3314f.C3317b> E get(C3314f.C3319c<E> cVar) {
        C3370k.m12227b(cVar, "key");
        return C3314f.C3317b.C3318a.m12136a((C3314f.C3317b) this, cVar);
    }

    public C3314f.C3319c<?> getKey() {
        return this.key;
    }

    public C3314f minusKey(C3314f.C3319c<?> cVar) {
        C3370k.m12227b(cVar, "key");
        return C3314f.C3317b.C3318a.m12138b(this, cVar);
    }

    public C3314f plus(C3314f fVar) {
        C3370k.m12227b(fVar, "context");
        return C3314f.C3317b.C3318a.m12137a((C3314f.C3317b) this, fVar);
    }
}
