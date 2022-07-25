package p179e.p184b.p185a.p187l0;

import kotlin.p205x.p207d.C3370k;

/* renamed from: e.b.a.l0.r */
final class C3046r<A> {

    /* renamed from: a */
    private final Object f7789a;

    /* renamed from: b */
    private final A f7790b;

    public C3046r(Object obj, A a) {
        C3370k.m12227b(obj, "scopeId");
        this.f7789a = obj;
        this.f7790b = a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3046r)) {
            return false;
        }
        C3046r rVar = (C3046r) obj;
        return C3370k.m12225a(this.f7789a, rVar.f7789a) && C3370k.m12225a((Object) this.f7790b, (Object) rVar.f7790b);
    }

    public int hashCode() {
        Object obj = this.f7789a;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        A a = this.f7790b;
        if (a != null) {
            i = a.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ScopeKey(scopeId=" + this.f7789a + ", arg=" + this.f7790b + ")";
    }
}
