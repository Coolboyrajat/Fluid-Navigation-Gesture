package p179e.p184b.p185a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import kotlin.C3269p;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;

/* renamed from: e.b.a.f0 */
abstract class C2997f0 {
    /* renamed from: a */
    public static /* synthetic */ String m11513a(C2997f0 f0Var, Type type, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            return f0Var.mo9120a(type, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispString");
    }

    /* renamed from: a */
    public abstract String mo9109a(Class<?> cls, boolean z);

    /* renamed from: a */
    public final String mo9120a(Type type, boolean z) {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String a;
        String str2;
        boolean z2;
        C3370k.m12227b(type, "type");
        Type b = C3004i0.m11533b(type);
        if (b instanceof Class) {
            return mo9109a((Class<?>) (Class) b, z);
        }
        if (b instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) b;
            Type rawType = parameterizedType.getRawType();
            if (rawType != null) {
                TypeVariable[] typeParameters = ((Class) rawType).getTypeParameters();
                C3370k.m12223a((Object) typeParameters, "cls.typeParameters");
                ArrayList arrayList = new ArrayList(typeParameters.length);
                int length = typeParameters.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    TypeVariable typeVariable = typeParameters[i];
                    int i3 = i2 + 1;
                    Type type2 = parameterizedType.getActualTypeArguments()[i2];
                    if (type2 instanceof WildcardType) {
                        C3370k.m12223a((Object) typeVariable, "variable");
                        Type[] bounds = typeVariable.getBounds();
                        C3370k.m12223a((Object) bounds, "variable.bounds");
                        int length2 = bounds.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length2) {
                                z2 = false;
                                break;
                            }
                            Type type3 = bounds[i4];
                            Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                            C3370k.m12223a((Object) upperBounds, "argument.upperBounds");
                            if (C3280f.m12022b((T[]) upperBounds, type3)) {
                                z2 = true;
                                break;
                            }
                            i4++;
                        }
                        if (z2) {
                            str2 = "*";
                            arrayList.add(str2);
                            i++;
                            i2 = i3;
                        }
                    }
                    C3370k.m12223a((Object) type2, "argument");
                    str2 = m11513a(this, type2, false, 2, (Object) null);
                    arrayList.add(str2);
                    i++;
                    i2 = i3;
                }
                sb2 = new StringBuilder();
                Type rawType2 = parameterizedType.getRawType();
                C3370k.m12223a((Object) rawType2, "jvmType.rawType");
                sb2.append(mo9120a(rawType2, true));
                sb2.append("<");
                str = C3292r.m12086a(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C3350b) null, 62, (Object) null);
            } else {
                throw new C3269p("null cannot be cast to non-null type java.lang.Class<*>");
            }
        } else if (b instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) b;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            C3370k.m12223a((Object) lowerBounds, "jvmType.lowerBounds");
            if (!(lowerBounds.length == 0)) {
                sb = new StringBuilder();
                sb.append("in ");
                Type type4 = wildcardType.getLowerBounds()[0];
                C3370k.m12223a((Object) type4, "jvmType.lowerBounds[0]");
                a = m11513a(this, type4, false, 2, (Object) null);
            } else {
                Type[] upperBounds2 = wildcardType.getUpperBounds();
                C3370k.m12223a((Object) upperBounds2, "jvmType.upperBounds");
                if (!(!(upperBounds2.length == 0)) || C3370k.m12225a((Object) wildcardType.getUpperBounds()[0], (Object) Object.class)) {
                    return "*";
                }
                sb = new StringBuilder();
                sb.append("out ");
                Type type5 = wildcardType.getUpperBounds()[0];
                C3370k.m12223a((Object) type5, "jvmType.upperBounds[0]");
                a = m11513a(this, type5, false, 2, (Object) null);
            }
            sb.append(a);
            return sb.toString();
        } else if (b instanceof GenericArrayType) {
            sb2 = new StringBuilder();
            sb2.append("Array<");
            Type genericComponentType = ((GenericArrayType) b).getGenericComponentType();
            C3370k.m12223a((Object) genericComponentType, "jvmType.genericComponentType");
            str = m11513a(this, genericComponentType, false, 2, (Object) null);
        } else if (b instanceof TypeVariable) {
            String name = ((TypeVariable) b).getName();
            C3370k.m12223a((Object) name, "jvmType.name");
            return name;
        } else {
            throw new IllegalStateException("Unknown type " + getClass());
        }
        sb.append(str);
        sb.append(">");
        return sb.toString();
    }
}
