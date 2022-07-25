package p179e.p184b.p185a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;

/* renamed from: e.b.a.z */
public final class C3139z<T> extends C3021l<T> {

    /* renamed from: a */
    private Type f7903a;

    /* renamed from: b */
    private final Type f7904b;

    /* renamed from: c */
    private final Type f7905c;

    public C3139z(Type type) {
        C3135w wVar;
        C3370k.m12227b(type, "trueType");
        this.f7905c = type;
        Type type2 = this.f7903a;
        if (type2 == null) {
            if (C3004i0.m11536d() || C3004i0.m11535c()) {
                type2 = this.f7905c;
                if (!(type2 instanceof Class)) {
                    if (C3004i0.m11536d()) {
                        Type type3 = this.f7905c;
                        if (type3 instanceof ParameterizedType) {
                            wVar = new C3135w(type3);
                            type2 = wVar;
                        }
                    }
                    if (C3004i0.m11535c()) {
                        Type type4 = this.f7905c;
                        if (type4 instanceof GenericArrayType) {
                            wVar = new C3135w(type4);
                            type2 = wVar;
                        }
                    }
                }
                this.f7903a = type2;
            }
            type2 = this.f7905c;
            this.f7903a = type2;
        }
        this.f7904b = type2;
    }

    /* renamed from: a */
    private final void m11800a(Type type, Object obj) {
        Type b = C3004i0.m11533b(type);
        if (!(b instanceof Class)) {
            int i = 0;
            if (b instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) b).getActualTypeArguments();
                int length = actualTypeArguments.length;
                while (i < length) {
                    Type type2 = actualTypeArguments[i];
                    C3370k.m12223a((Object) type2, "arg");
                    m11800a(type2, obj);
                    i++;
                }
            } else if (b instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) b).getGenericComponentType();
                C3370k.m12223a((Object) genericComponentType, "jvmType.genericComponentType");
                m11800a(genericComponentType, obj);
            } else if (b instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) b;
                for (Type type3 : wildcardType.getLowerBounds()) {
                    C3370k.m12223a((Object) type3, "arg");
                    m11800a(type3, obj);
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                int length2 = upperBounds.length;
                while (i < length2) {
                    Type type4 = upperBounds[i];
                    C3370k.m12223a((Object) type4, "arg");
                    m11800a(type4, obj);
                    i++;
                }
            } else if (b instanceof TypeVariable) {
                throw new IllegalArgumentException(obj + " uses a type variable named " + ((TypeVariable) b).getName() + ", therefore, the bound value can never be retrieved.");
            } else {
                throw new IllegalArgumentException("Unknown type " + b.getClass() + ' ' + b);
            }
        }
    }

    /* renamed from: g */
    private final Class<?> m11801g() {
        Type type = this.f7905c;
        if (!(type instanceof Class)) {
            if (!(type instanceof ParameterizedType)) {
                return null;
            }
            type = ((ParameterizedType) type).getRawType();
            if (type == null) {
                throw new C3269p("null cannot be cast to non-null type java.lang.Class<*>");
            }
        }
        return (Class) type;
    }

    /* renamed from: a */
    public void mo9114a(Object obj) {
        C3370k.m12227b(obj, "disp");
        m11800a(mo9119f(), obj);
    }

    /* renamed from: b */
    public C2999g0<?>[] mo9116b() {
        TypeVariable[] typeParameters;
        Type type = this.f7903a;
        if (!(type instanceof ParameterizedType)) {
            type = null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType != null) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            C3370k.m12223a((Object) actualTypeArguments, "type.actualTypeArguments");
            ArrayList arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                    C3370k.m12223a((Object) type2, "it.upperBounds[0]");
                } else {
                    C3370k.m12223a((Object) type2, "it");
                }
                arrayList.add(C3004i0.m11530a(type2));
            }
            Object[] array = arrayList.toArray(new C2999g0[0]);
            if (array != null) {
                return (C2999g0[]) array;
            }
            throw new C3269p("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Class<?> g = m11801g();
        if (!(g == null || (typeParameters = g.getTypeParameters()) == null)) {
            ArrayList arrayList2 = new ArrayList(typeParameters.length);
            for (TypeVariable typeVariable : typeParameters) {
                C3370k.m12223a((Object) typeVariable, "it");
                Type type3 = typeVariable.getBounds()[0];
                C3370k.m12223a((Object) type3, "it.bounds[0]");
                arrayList2.add(C3004i0.m11530a(type3));
            }
            Object[] array2 = arrayList2.toArray(new C2999g0[0]);
            if (array2 != null) {
                C2999g0<?>[] g0VarArr = (C2999g0[]) array2;
                if (g0VarArr != null) {
                    return g0VarArr;
                }
            } else {
                throw new C3269p("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return new C2999g0[0];
    }

    /* renamed from: c */
    public C2999g0<T> mo9117c() {
        Class<?> g = m11801g();
        if (g == null) {
            return null;
        }
        if (g != null) {
            return new C2996f(g);
        }
        throw new C3269p("null cannot be cast to non-null type java.lang.Class<T>");
    }

    /* renamed from: e */
    public List<C2999g0<?>> mo9118e() {
        C2999g0 g0Var;
        List list;
        List list2;
        Type[] genericInterfaces;
        Type f = mo9119f();
        if (f instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) f).getRawType();
            if (rawType != null) {
                g0Var = C3004i0.m11528a((Class) rawType);
            } else {
                throw new C3269p("null cannot be cast to non-null type java.lang.Class<T>");
            }
        } else {
            g0Var = null;
        }
        Class<?> g = m11801g();
        if (g == null || (genericInterfaces = g.getGenericInterfaces()) == null) {
            list = C3284j.m12068a();
        } else {
            list = new ArrayList(genericInterfaces.length);
            for (Type type : genericInterfaces) {
                C3370k.m12223a((Object) type, "it");
                list.add(C3004i0.m11530a(type));
            }
        }
        if (g0Var == null || (list2 = C3283i.m12064a(g0Var)) == null) {
            list2 = C3284j.m12068a();
        }
        return C3292r.m12095b(list2, list);
    }

    /* renamed from: f */
    public Type mo9119f() {
        return this.f7904b;
    }
}
