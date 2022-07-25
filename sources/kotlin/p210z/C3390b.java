package kotlin.p210z;

import kotlin.p192b0.C3208i;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.z.b */
final class C3390b<T> implements C3391c<Object, T> {

    /* renamed from: a */
    private T f8052a;

    /* renamed from: a */
    public T mo10092a(Object obj, C3208i<?> iVar) {
        C3370k.m12227b(iVar, "property");
        T t = this.f8052a;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + iVar.mo6062b() + " should be initialized before get.");
    }

    /* renamed from: a */
    public void mo10093a(Object obj, C3208i<?> iVar, T t) {
        C3370k.m12227b(iVar, "property");
        C3370k.m12227b(t, "value");
        this.f8052a = t;
    }
}
