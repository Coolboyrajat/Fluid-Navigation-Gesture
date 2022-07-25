package p179e.p184b.p185a;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.BuildConfig;

/* renamed from: e.b.a.d0 */
public final class C2993d0 {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final String m11493a(String str) {
        if (!C3250n.m11932a(str, "java.", false, 2, (Object) null)) {
            return str;
        }
        switch (str.hashCode()) {
            case -2050985813:
                return str.equals("java.lang.RuntimeException") ? "kotlin.RuntimeException" : str;
            case -1624170886:
                return str.equals("java.lang.AssertionError") ? "kotlin.AssertionError" : str;
            case -1427677637:
                return str.equals("java.util.NoSuchElementException") ? "kotlin.NoSuchElementException" : str;
            case -1402722386:
                return str.equals("java.util.HashMap") ? "kotlin.collections.HashMap" : str;
            case -1402716492:
                return str.equals("java.util.HashSet") ? "kotlin.collections.HashSet" : str;
            case -1383349348:
                return str.equals("java.util.Map") ? "kotlin.collections.Map" : str;
            case -1383343454:
                return str.equals("java.util.Set") ? "kotlin.collections.Set" : str;
            case -1282923287:
                return str.equals("java.lang.UnsupportedOperationException") ? "kotlin.UnsupportedOperationException" : str;
            case -1114099497:
                return str.equals("java.util.ArrayList") ? "kotlin.collections.ArrayList" : str;
            case -528621260:
                return str.equals("java.lang.Error") ? "kotlin.Error" : str;
            case -310638960:
                return str.equals("java.lang.IllegalArgumentException") ? "kotlin.IllegalArgumentException" : str;
            case -37663348:
                return str.equals("java.lang.ClassCastException") ? "kotlin.ClassCastException" : str;
            case 65821278:
                return str.equals("java.util.List") ? "kotlin.collections.List" : str;
            case 72706427:
                return str.equals("java.lang.Exception") ? "kotlin.Exception" : str;
            case 75599616:
                return str.equals("java.lang.IllegalStateException") ? "kotlin.IllegalStateException" : str;
            case 208316054:
                return str.equals("java.util.Comparator") ? "kotlin.Comparator" : str;
            case 1063877011:
                return str.equals("java.lang.Object") ? "kotlin.Any" : str;
            case 1195259493:
                return str.equals("java.lang.String") ? "kotlin.String" : str;
            case 1258621781:
                return str.equals("java.util.LinkedHashMap") ? "kotlin.collections.LinkedHashMap" : str;
            case 1258627675:
                return str.equals("java.util.LinkedHashSet") ? "kotlin.collections.LinkedHashSet" : str;
            case 1270017459:
                return str.equals("java.lang.IndexOutOfBoundsException") ? "kotlin.IndexOutOfBoundsException" : str;
            case 1630335596:
                return str.equals("java.lang.Throwable") ? "kotlin.Throwable" : str;
            case 1641150139:
                return str.equals("java.lang.NumberFormatException") ? "kotlin.NumberFormatException" : str;
            case 1879291277:
                return str.equals("java.lang.NullPointerException") ? "kotlin.NullPointerException" : str;
            default:
                return str;
        }
    }

    /* renamed from: a */
    public static final String m11494a(Type type) {
        C3370k.m12227b(type, "$this$fullDispString");
        return C2997f0.m11513a(C3013k.f7769a, type, false, 2, (Object) null);
    }

    /* renamed from: b */
    public static final String m11497b(Type type) {
        C3370k.m12227b(type, "$this$simpleDispString");
        return C2997f0.m11513a(C2988b0.f7751a, type, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final String m11498c(Class<?> cls) {
        if (C3370k.m12225a((Object) cls, (Object) Boolean.TYPE) || C3370k.m12225a((Object) cls, (Object) Boolean.class)) {
            return "Boolean";
        }
        if (C3370k.m12225a((Object) cls, (Object) Byte.TYPE) || C3370k.m12225a((Object) cls, (Object) Byte.class)) {
            return "Byte";
        }
        if (C3370k.m12225a((Object) cls, (Object) Character.TYPE) || C3370k.m12225a((Object) cls, (Object) Character.class)) {
            return "Char";
        }
        if (C3370k.m12225a((Object) cls, (Object) Short.TYPE) || C3370k.m12225a((Object) cls, (Object) Short.class)) {
            return "Short";
        }
        if (C3370k.m12225a((Object) cls, (Object) Integer.TYPE) || C3370k.m12225a((Object) cls, (Object) Integer.class)) {
            return "Int";
        }
        if (C3370k.m12225a((Object) cls, (Object) Long.TYPE) || C3370k.m12225a((Object) cls, (Object) Long.class)) {
            return "Long";
        }
        if (C3370k.m12225a((Object) cls, (Object) Float.TYPE) || C3370k.m12225a((Object) cls, (Object) Float.class)) {
            return "Float";
        }
        if (C3370k.m12225a((Object) cls, (Object) Double.TYPE) || C3370k.m12225a((Object) cls, (Object) Double.class)) {
            return "Double";
        }
        if (C3370k.m12225a((Object) cls, (Object) Object.class)) {
            return "Any";
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        if (r1 != null) goto L_0x0036;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m11499c(java.lang.reflect.Type r3) {
        /*
            java.lang.String r0 = "$this$simpleErasedName"
            kotlin.p205x.p207d.C3370k.m12227b(r3, r0)
            java.lang.reflect.Type r0 = p179e.p184b.p185a.C3004i0.m11533b((java.lang.reflect.Type) r3)
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L_0x0045
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class r1 = r0.getEnclosingClass()
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = m11499c((java.lang.reflect.Type) r1)
            if (r1 == 0) goto L_0x0034
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            java.lang.String r1 = ""
        L_0x0036:
            r3.append(r1)
            java.lang.String r0 = r0.getSimpleName()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            goto L_0x007c
        L_0x0045:
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x0059
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r3 = r0.getRawType()
            java.lang.String r0 = "jvmType.rawType"
        L_0x0051:
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r3, (java.lang.String) r0)
            java.lang.String r3 = m11499c((java.lang.reflect.Type) r3)
            goto L_0x007c
        L_0x0059:
            boolean r1 = r0 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L_0x0066
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r3 = r0.getGenericComponentType()
            java.lang.String r0 = "jvmType.genericComponentType"
            goto L_0x0051
        L_0x0066:
            boolean r1 = r0 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L_0x006d
            java.lang.String r3 = "*"
            goto L_0x007c
        L_0x006d:
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L_0x007d
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            java.lang.String r3 = r0.getName()
            java.lang.String r0 = "jvmType.name"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r3, (java.lang.String) r0)
        L_0x007c:
            return r3
        L_0x007d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown type "
            r1.append(r2)
            java.lang.Class r2 = r3.getClass()
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p179e.p184b.p185a.C2993d0.m11499c(java.lang.reflect.Type):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final String m11500d(Class<?> cls) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        C3370k.m12223a((Object) typeParameters, "typeParameters");
        if (typeParameters.length == 0) {
            return BuildConfig.FLAVOR;
        }
        int length = cls.getTypeParameters().length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = "*";
        }
        return C3280f.m12019a(strArr, ", ", "<", ">", 0, (CharSequence) null, (C3350b) null, 56, (Object) null);
    }
}
