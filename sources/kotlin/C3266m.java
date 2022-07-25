package kotlin;

import java.io.Serializable;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.m */
final class C3266m<T> implements C3256e<T>, Serializable {

    /* renamed from: f */
    private C3349a<? extends T> f7984f;

    /* renamed from: g */
    private volatile Object f7985g;

    /* renamed from: h */
    private final Object f7986h;

    public C3266m(C3349a<? extends T> aVar, Object obj) {
        C3370k.m12227b(aVar, "initializer");
        this.f7984f = aVar;
        this.f7985g = C3270q.f7990a;
        this.f7986h = obj == null ? this : obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3266m(C3349a aVar, Object obj, int i, C3366g gVar) {
        this(aVar, (i & 2) != 0 ? null : obj);
    }

    /* renamed from: a */
    public boolean mo9944a() {
        return this.f7985g != C3270q.f7990a;
    }

    public T getValue() {
        T t;
        T t2 = this.f7985g;
        if (t2 != C3270q.f7990a) {
            return t2;
        }
        synchronized (this.f7986h) {
            t = this.f7985g;
            if (t == C3270q.f7990a) {
                C3349a aVar = this.f7984f;
                if (aVar != null) {
                    t = aVar.invoke();
                    this.f7985g = t;
                    this.f7984f = null;
                } else {
                    C3370k.m12221a();
                    throw null;
                }
            }
        }
        return t;
    }

    public String toString() {
        return mo9944a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
