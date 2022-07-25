package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.w0 */
final class C3545w0 implements C3419e1 {

    /* renamed from: f */
    private final boolean f8259f;

    public C3545w0(boolean z) {
        this.f8259f = z;
    }

    /* renamed from: b */
    public boolean mo10141b() {
        return this.f8259f;
    }

    /* renamed from: d */
    public C3540u1 mo10142d() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(mo10141b() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
