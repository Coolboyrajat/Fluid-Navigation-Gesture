package kotlinx.coroutines;

import kotlin.p197u.C3306a;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3310d;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.z */
public abstract class C3556z extends C3306a implements C3310d {
    public C3556z() {
        super(C3310d.f8000b);
    }

    /* renamed from: a */
    public void mo10040a(C3309c<?> cVar) {
        C3370k.m12227b(cVar, "continuation");
        C3310d.C3311a.m12129a((C3310d) this, cVar);
    }

    /* renamed from: a */
    public abstract void mo10112a(C3314f fVar, Runnable runnable);

    /* renamed from: b */
    public final <T> C3309c<T> mo10041b(C3309c<? super T> cVar) {
        C3370k.m12227b(cVar, "continuation");
        return new C3521p0(this, cVar);
    }

    /* renamed from: b */
    public boolean mo10113b(C3314f fVar) {
        C3370k.m12227b(fVar, "context");
        return true;
    }

    public <E extends C3314f.C3317b> E get(C3314f.C3319c<E> cVar) {
        C3370k.m12227b(cVar, "key");
        return C3310d.C3311a.m12128a((C3310d) this, cVar);
    }

    public C3314f minusKey(C3314f.C3319c<?> cVar) {
        C3370k.m12227b(cVar, "key");
        return C3310d.C3311a.m12130b(this, cVar);
    }

    public String toString() {
        return C3504k0.m12634a((Object) this) + '@' + C3504k0.m12636b(this);
    }
}
