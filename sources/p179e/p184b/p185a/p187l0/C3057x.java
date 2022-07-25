package p179e.p184b.p185a.p187l0;

import java.util.List;
import java.util.Map;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import p179e.p184b.p185a.p188m0.C3113n;

/* renamed from: e.b.a.l0.x */
public final class C3057x extends C3047s {

    /* renamed from: a */
    private final Map<Object, C3349a<Object>> f7806a = C3113n.m11754a();

    /* renamed from: b */
    private final Object f7807b = new Object();

    public C3057x() {
        super((C3366g) null);
    }

    /* renamed from: a */
    public Object mo9159a(Object obj, boolean z, C3349a<? extends C3043o<? extends Object>> aVar) {
        C3370k.m12227b(obj, "key");
        C3370k.m12227b(aVar, "creator");
        Object obj2 = null;
        Object obj3 = z ? this.f7807b : null;
        C3349a aVar2 = this.f7806a.get(obj);
        Object invoke = aVar2 != null ? aVar2.invoke() : null;
        if (invoke != null) {
            return invoke;
        }
        if (obj3 == null) {
            C3349a aVar3 = this.f7806a.get(obj);
            if (aVar3 != null) {
                obj2 = aVar3.invoke();
            }
            if (obj2 == null) {
                C3043o oVar = (C3043o) aVar.invoke();
                Object a = oVar.mo9150a();
                this.f7806a.put(obj, oVar.mo9151b());
                return a;
            }
        } else {
            synchronized (obj3) {
                C3349a aVar4 = this.f7806a.get(obj);
                if (aVar4 != null) {
                    obj2 = aVar4.invoke();
                }
                if (obj2 == null) {
                    C3043o oVar2 = (C3043o) aVar.invoke();
                    Object a2 = oVar2.mo9150a();
                    this.f7806a.put(obj, oVar2.mo9151b());
                    return a2;
                }
            }
        }
        return obj2;
    }

    /* renamed from: a */
    public void mo9160a() {
        List<T> list;
        List<T> g;
        Object obj = this.f7807b;
        if (obj == null) {
            list = C3292r.m12104g(this.f7806a.values());
            this.f7806a.clear();
        } else {
            synchronized (obj) {
                g = C3292r.m12104g(this.f7806a.values());
                this.f7806a.clear();
            }
            list = g;
        }
        for (T invoke : list) {
            Object invoke2 = invoke.invoke();
            if (!(invoke2 instanceof C3045q)) {
                invoke2 = null;
            }
            C3045q qVar = (C3045q) invoke2;
            if (qVar != null) {
                qVar.close();
            }
        }
    }
}
