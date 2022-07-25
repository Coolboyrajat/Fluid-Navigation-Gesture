package p179e.p184b.p185a;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;

/* renamed from: e.b.a.j0 */
abstract class C3012j0<T> {
    /* renamed from: a */
    public final Type mo9124a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            C3370k.m12223a((Object) type, "(javaClass.genericSuperc…e).actualTypeArguments[0]");
            return type;
        }
        throw new C3269p("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
    }
}
