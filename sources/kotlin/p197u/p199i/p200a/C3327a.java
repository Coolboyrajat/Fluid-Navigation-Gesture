package kotlin.p197u.p199i.p200a;

import java.io.Serializable;
import kotlin.C3262k;
import kotlin.C3265l;
import kotlin.Unit;
import kotlin.p197u.C3309c;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.u.i.a.a */
public abstract class C3327a implements C3309c<Object>, C3331e, Serializable {

    /* renamed from: f */
    private final C3309c<Object> f8012f;

    public C3327a(C3309c<Object> cVar) {
        this.f8012f = cVar;
    }

    /* renamed from: a */
    public C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
        C3370k.m12227b(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* renamed from: a */
    public final void mo10039a(Object obj) {
        Object obj2 = obj;
        C3327a aVar = this;
        while (true) {
            C3334h.m12173b(aVar);
            C3309c cVar = aVar.f8012f;
            if (cVar != null) {
                try {
                    obj2 = aVar.mo6618b(obj2);
                    if (obj2 != C3326d.m12146a()) {
                        C3262k.C3263a aVar2 = C3262k.f7982f;
                        C3262k.m11974a(obj2);
                        aVar.mo10047e();
                        if (cVar instanceof C3327a) {
                            aVar = (C3327a) cVar;
                        } else {
                            cVar.mo10039a(obj2);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    C3262k.C3263a aVar3 = C3262k.f7982f;
                    obj2 = C3265l.m11978a(th);
                    C3262k.m11974a(obj2);
                }
            } else {
                C3370k.m12221a();
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo6618b(Object obj);

    /* renamed from: b */
    public final C3309c<Object> mo10045b() {
        return this.f8012f;
    }

    /* renamed from: c */
    public C3331e mo10046c() {
        C3309c<Object> cVar = this.f8012f;
        if (!(cVar instanceof C3331e)) {
            cVar = null;
        }
        return (C3331e) cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo10047e() {
    }

    /* renamed from: g */
    public StackTraceElement mo10048g() {
        return C3333g.m12171c(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object g = mo10048g();
        if (g == null) {
            g = getClass().getName();
        }
        sb.append(g);
        return sb.toString();
    }
}
