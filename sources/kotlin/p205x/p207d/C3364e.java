package kotlin.p205x.p207d;

import kotlin.p192b0.C3202c;
import kotlin.p205x.C3347a;

/* renamed from: kotlin.x.d.e */
public final class C3364e implements C3202c<Object>, C3363d {

    /* renamed from: f */
    private final Class<?> f8032f;

    public C3364e(Class<?> cls) {
        C3370k.m12227b(cls, "jClass");
        this.f8032f = cls;
    }

    /* renamed from: a */
    public Class<?> mo10067a() {
        return this.f8032f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3364e) && C3370k.m12225a((Object) C3347a.m12188b(this), (Object) C3347a.m12188b((C3202c) obj));
    }

    public int hashCode() {
        return C3347a.m12188b(this).hashCode();
    }

    public String toString() {
        return mo10067a().toString() + " (Kotlin reflection is not available)";
    }
}
