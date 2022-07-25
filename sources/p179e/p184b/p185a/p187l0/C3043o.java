package p179e.p184b.p185a.p187l0;

import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;

/* renamed from: e.b.a.l0.o */
public final class C3043o<T> {

    /* renamed from: a */
    private final T f7787a;

    /* renamed from: b */
    private final C3349a<T> f7788b;

    public C3043o(T t, C3349a<? extends T> aVar) {
        C3370k.m12227b(t, "current");
        C3370k.m12227b(aVar, "next");
        this.f7787a = t;
        this.f7788b = aVar;
    }

    /* renamed from: a */
    public final T mo9150a() {
        return this.f7787a;
    }

    /* renamed from: b */
    public final C3349a<T> mo9151b() {
        return this.f7788b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3043o)) {
            return false;
        }
        C3043o oVar = (C3043o) obj;
        return C3370k.m12225a((Object) this.f7787a, (Object) oVar.f7787a) && C3370k.m12225a((Object) this.f7788b, (Object) oVar.f7788b);
    }

    public int hashCode() {
        T t = this.f7787a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        C3349a<T> aVar = this.f7788b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "Reference(current=" + this.f7787a + ", next=" + this.f7788b + ")";
    }
}
