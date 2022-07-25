package p179e.p184b.p185a;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.p205x.p207d.C3370k;

/* renamed from: e.b.a.e0 */
public abstract class C2995e0<T> {

    /* renamed from: a */
    private final Type f7760a;

    public C2995e0() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) (!(genericSuperclass instanceof ParameterizedType) ? null : genericSuperclass);
        if (parameterizedType != null) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            C3370k.m12223a((Object) type, "(javaClass.genericSuperc…)).actualTypeArguments[0]");
            this.f7760a = type;
            return;
        }
        throw new RuntimeException("Invalid TypeToken; must specify type parameters");
    }

    /* renamed from: a */
    public final Type mo9113a() {
        return this.f7760a;
    }
}
