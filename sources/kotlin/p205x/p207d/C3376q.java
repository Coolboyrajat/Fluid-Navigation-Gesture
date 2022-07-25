package kotlin.p205x.p207d;

/* renamed from: kotlin.x.d.q */
public final class C3376q implements C3363d {

    /* renamed from: f */
    private final Class<?> f8041f;

    public C3376q(Class<?> cls, String str) {
        C3370k.m12227b(cls, "jClass");
        C3370k.m12227b(str, "moduleName");
        this.f8041f = cls;
    }

    /* renamed from: a */
    public Class<?> mo10067a() {
        return this.f8041f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3376q) && C3370k.m12225a((Object) mo10067a(), (Object) ((C3376q) obj).mo10067a());
    }

    public int hashCode() {
        return mo10067a().hashCode();
    }

    public String toString() {
        return mo10067a().toString() + " (Kotlin reflection is not available)";
    }
}
