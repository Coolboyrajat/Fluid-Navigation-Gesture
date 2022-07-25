package kotlin.p197u.p199i.p200a;

import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p197u.C3320g;

/* renamed from: kotlin.u.i.a.j */
public abstract class C3337j extends C3327a {
    public C3337j(C3309c<Object> cVar) {
        super(cVar);
        if (cVar != null) {
            if (!(cVar.mo10038a() == C3320g.f8003f)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    /* renamed from: a */
    public C3314f mo10038a() {
        return C3320g.f8003f;
    }
}
