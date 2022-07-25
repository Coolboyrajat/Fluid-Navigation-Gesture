package p006b.p026g.p034j;

/* renamed from: b.g.j.d */
public class C0833d<F, S> {

    /* renamed from: a */
    public final F f3245a;

    /* renamed from: b */
    public final S f3246b;

    public boolean equals(Object obj) {
        if (!(obj instanceof C0833d)) {
            return false;
        }
        C0833d dVar = (C0833d) obj;
        return C0832c.m4525a(dVar.f3245a, this.f3245a) && C0832c.m4525a(dVar.f3246b, this.f3246b);
    }

    public int hashCode() {
        F f = this.f3245a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f3246b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f3245a) + " " + String.valueOf(this.f3246b) + "}";
    }
}
