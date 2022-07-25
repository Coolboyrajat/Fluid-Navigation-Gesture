package p179e.p184b.p185a;

import java.lang.reflect.Type;
import kotlin.p205x.p207d.C3370k;
import p179e.p184b.p185a.C2999g0;

/* renamed from: e.b.a.l */
public abstract class C3021l<T> implements C2999g0<T> {
    /* renamed from: a */
    public String mo9122a() {
        return C2993d0.m11494a(mo9119f());
    }

    /* renamed from: a */
    public boolean mo9115a(C2999g0<?> g0Var) {
        C3370k.m12227b(g0Var, "typeToken");
        return C2999g0.C3000a.m11524a(this, g0Var);
    }

    /* renamed from: d */
    public String mo9123d() {
        return C2993d0.m11497b(mo9119f());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3021l) && !(C3370k.m12225a((Object) mo9119f(), (Object) ((C3021l) obj).mo9119f()) ^ true);
    }

    /* renamed from: f */
    public abstract Type mo9119f();

    public int hashCode() {
        return mo9119f().hashCode();
    }
}
