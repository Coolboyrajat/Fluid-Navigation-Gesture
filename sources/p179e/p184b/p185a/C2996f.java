package p179e.p184b.p185a;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;

/* renamed from: e.b.a.f */
public final class C2996f<T> extends C3021l<T> {

    /* renamed from: a */
    private final Class<T> f7761a;

    public C2996f(Class<T> cls) {
        C3370k.m12227b(cls, "jvmType");
        this.f7761a = cls;
    }

    /* renamed from: a */
    public void mo9114a(Object obj) {
        C3370k.m12227b(obj, "disp");
    }

    /* renamed from: a */
    public boolean mo9115a(C2999g0<?> g0Var) {
        C3370k.m12227b(g0Var, "typeToken");
        return g0Var instanceof C2996f ? m11512f().isAssignableFrom(((C2996f) g0Var).m11512f()) : super.mo9115a(g0Var);
    }

    /* renamed from: b */
    public C2999g0<?>[] mo9116b() {
        TypeVariable[] typeParameters = m11512f().getTypeParameters();
        C3370k.m12223a((Object) typeParameters, "jvmType.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            C3370k.m12223a((Object) typeVariable, "it");
            Type type = typeVariable.getBounds()[0];
            C3370k.m12223a((Object) type, "it.bounds[0]");
            arrayList.add(C3004i0.m11530a(type));
        }
        Object[] array = arrayList.toArray(new C2999g0[0]);
        if (array != null) {
            return (C2999g0[]) array;
        }
        throw new C3269p("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: c */
    public C2996f<T> mo9117c() {
        return this;
    }

    /* renamed from: e */
    public List<C2999g0<?>> mo9118e() {
        List list;
        C2999g0 b = C3004i0.m11528a(m11512f());
        if (b == null || (list = C3283i.m12064a(b)) == null) {
            list = C3284j.m12068a();
        }
        Type[] genericInterfaces = m11512f().getGenericInterfaces();
        C3370k.m12223a((Object) genericInterfaces, "jvmType.genericInterfaces");
        ArrayList arrayList = new ArrayList(genericInterfaces.length);
        for (Type type : genericInterfaces) {
            C3370k.m12223a((Object) type, "it");
            arrayList.add(C3004i0.m11530a(type));
        }
        return C3292r.m12095b(list, arrayList);
    }

    /* renamed from: f */
    public Class<T> m11512f() {
        return this.f7761a;
    }
}
