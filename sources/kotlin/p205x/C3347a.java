package kotlin.p205x;

import kotlin.C3269p;
import kotlin.p192b0.C3202c;
import kotlin.p205x.p207d.C3363d;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3384y;

/* renamed from: kotlin.x.a */
public final class C3347a {
    /* renamed from: a */
    public static final <T> Class<T> m12186a(C3202c<T> cVar) {
        C3370k.m12227b(cVar, "$this$java");
        Class<?> a = ((C3363d) cVar).mo10067a();
        if (a != null) {
            return a;
        }
        throw new C3269p("null cannot be cast to non-null type java.lang.Class<T>");
    }

    /* renamed from: a */
    public static final <T> C3202c<T> m12187a(Class<T> cls) {
        C3370k.m12227b(cls, "$this$kotlin");
        return C3384y.m12254a((Class) cls);
    }

    /* renamed from: b */
    public static final <T> Class<T> m12188b(C3202c<T> cVar) {
        C3370k.m12227b(cVar, "$this$javaObjectType");
        Class a = ((C3363d) cVar).mo10067a();
        if (a.isPrimitive()) {
            String name = a.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            a = Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            a = Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            a = Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            a = Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            a = Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            a = Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            a = Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            a = Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            a = Short.class;
                            break;
                        }
                        break;
                }
            }
            if (a != null) {
                return a;
            }
            throw new C3269p("null cannot be cast to non-null type java.lang.Class<T>");
        } else if (a != null) {
            return a;
        } else {
            throw new C3269p("null cannot be cast to non-null type java.lang.Class<T>");
        }
    }
}
