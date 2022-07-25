package p179e.p184b.p185a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Iterator;
import kotlin.C3269p;
import kotlin.p191a0.C3193d;
import kotlin.p195s.C3297v;
import kotlin.p205x.p207d.C3370k;

/* renamed from: e.b.a.w */
public final class C3135w implements Type {

    /* renamed from: f */
    private int f7898f;

    /* renamed from: g */
    private final Type f7899g;

    /* renamed from: e.b.a.w$a */
    private static final class C3136a {

        /* renamed from: a */
        public static final C3136a f7900a = new C3136a();

        private C3136a() {
        }

        /* renamed from: a */
        public final int mo9249a(Type type) {
            C3370k.m12227b(type, "type");
            if (!(type instanceof Class)) {
                int i = 0;
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    Type rawType = parameterizedType.getRawType();
                    C3370k.m12223a((Object) rawType, "type.rawType");
                    int a = mo9249a(rawType);
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type type2 = actualTypeArguments[i];
                        C3370k.m12223a((Object) type2, "arg");
                        a = (a * 31) + mo9249a(type2);
                        i++;
                    }
                    return a;
                } else if (type instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type;
                    int i2 = 0;
                    for (Type type3 : wildcardType.getUpperBounds()) {
                        C3370k.m12223a((Object) type3, "arg");
                        i2 = (i2 * 19) + mo9249a(type3);
                    }
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    int length2 = lowerBounds.length;
                    while (i < length2) {
                        Type type4 = lowerBounds[i];
                        C3370k.m12223a((Object) type4, "arg");
                        i2 = (i2 * 17) + mo9249a(type4);
                        i++;
                    }
                    return i2;
                } else if (type instanceof GenericArrayType) {
                    Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                    C3370k.m12223a((Object) genericComponentType, "type.genericComponentType");
                    return mo9249a(genericComponentType) + 53;
                } else if (type instanceof TypeVariable) {
                    Type[] bounds = ((TypeVariable) type).getBounds();
                    int length3 = bounds.length;
                    int i3 = 0;
                    while (i < length3) {
                        Type type5 = bounds[i];
                        int i4 = i3 * 29;
                        C3370k.m12223a((Object) type5, "arg");
                        i3 = i4 + mo9249a(type5);
                        i++;
                    }
                    return i3;
                }
            }
            return type.hashCode();
        }

        /* renamed from: a */
        public final boolean mo9250a(Type type, Type type2) {
            C3370k.m12227b(type, "l");
            C3370k.m12227b(type2, "r");
            Type b = C3004i0.m11533b(type);
            Type b2 = C3004i0.m11533b(type2);
            if (!C3370k.m12225a((Object) b.getClass(), (Object) b2.getClass())) {
                return false;
            }
            if (!(b instanceof Class)) {
                if (b instanceof ParameterizedType) {
                    if (b2 != null) {
                        ParameterizedType parameterizedType = (ParameterizedType) b2;
                        ParameterizedType parameterizedType2 = (ParameterizedType) b;
                        Type rawType = parameterizedType2.getRawType();
                        C3370k.m12223a((Object) rawType, "left.rawType");
                        Type rawType2 = parameterizedType.getRawType();
                        C3370k.m12223a((Object) rawType2, "right.rawType");
                        if (mo9250a(rawType, rawType2)) {
                            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                            C3370k.m12223a((Object) actualTypeArguments, "left.actualTypeArguments");
                            Type[] actualTypeArguments2 = parameterizedType.getActualTypeArguments();
                            C3370k.m12223a((Object) actualTypeArguments2, "right.actualTypeArguments");
                            if (mo9251a(actualTypeArguments, actualTypeArguments2)) {
                                return true;
                            }
                        }
                    } else {
                        throw new C3269p("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                    }
                } else if (b instanceof WildcardType) {
                    if (b2 != null) {
                        WildcardType wildcardType = (WildcardType) b2;
                        WildcardType wildcardType2 = (WildcardType) b;
                        Type[] lowerBounds = wildcardType2.getLowerBounds();
                        C3370k.m12223a((Object) lowerBounds, "left.lowerBounds");
                        Type[] lowerBounds2 = wildcardType.getLowerBounds();
                        C3370k.m12223a((Object) lowerBounds2, "right.lowerBounds");
                        if (mo9251a(lowerBounds, lowerBounds2)) {
                            Type[] upperBounds = wildcardType2.getUpperBounds();
                            C3370k.m12223a((Object) upperBounds, "left.upperBounds");
                            Type[] upperBounds2 = wildcardType.getUpperBounds();
                            C3370k.m12223a((Object) upperBounds2, "right.upperBounds");
                            if (mo9251a(upperBounds, upperBounds2)) {
                                return true;
                            }
                        }
                    } else {
                        throw new C3269p("null cannot be cast to non-null type java.lang.reflect.WildcardType");
                    }
                } else if (b instanceof GenericArrayType) {
                    if (b2 != null) {
                        Type genericComponentType = ((GenericArrayType) b).getGenericComponentType();
                        C3370k.m12223a((Object) genericComponentType, "left.genericComponentType");
                        Type genericComponentType2 = ((GenericArrayType) b2).getGenericComponentType();
                        C3370k.m12223a((Object) genericComponentType2, "right.genericComponentType");
                        return mo9250a(genericComponentType, genericComponentType2);
                    }
                    throw new C3269p("null cannot be cast to non-null type java.lang.reflect.GenericArrayType");
                } else if (b instanceof TypeVariable) {
                    if (b2 != null) {
                        Type[] bounds = ((TypeVariable) b).getBounds();
                        C3370k.m12223a((Object) bounds, "left.bounds");
                        Type[] bounds2 = ((TypeVariable) b2).getBounds();
                        C3370k.m12223a((Object) bounds2, "right.bounds");
                        return mo9251a(bounds, bounds2);
                    }
                    throw new C3269p("null cannot be cast to non-null type java.lang.reflect.TypeVariable<*>");
                }
                return false;
            }
            return C3370k.m12225a((Object) b, (Object) b2);
        }

        /* renamed from: a */
        public final boolean mo9251a(Type[] typeArr, Type[] typeArr2) {
            C3370k.m12227b(typeArr, "left");
            C3370k.m12227b(typeArr2, "right");
            if (typeArr.length != typeArr2.length) {
                return false;
            }
            C3193d d = C3280f.m12028d(typeArr);
            if ((d instanceof Collection) && ((Collection) d).isEmpty()) {
                return true;
            }
            Iterator it = d.iterator();
            while (it.hasNext()) {
                int a = ((C3297v) it).mo9906a();
                if (!f7900a.mo9250a(typeArr[a], typeArr2[a])) {
                    return false;
                }
            }
            return true;
        }
    }

    public C3135w(Type type) {
        C3370k.m12227b(type, "type");
        this.f7899g = type;
    }

    /* renamed from: a */
    public final Type mo9245a() {
        return this.f7899g;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Type) || hashCode() != obj.hashCode()) {
            return false;
        }
        return C3136a.f7900a.mo9250a(this.f7899g, (Type) obj);
    }

    public int hashCode() {
        if (this.f7898f == 0) {
            this.f7898f = C3136a.f7900a.mo9249a(this.f7899g);
        }
        return this.f7898f;
    }

    public String toString() {
        return "KodeinWrappedType{" + this.f7899g + '}';
    }
}
