package kotlin.p205x.p207d;

import kotlin.C3215c;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p206c.C3353e;
import kotlin.p205x.p206c.C3354f;
import kotlin.p205x.p206c.C3355g;

/* renamed from: kotlin.x.d.b0 */
public class C3359b0 {
    /* renamed from: a */
    public static int m12196a(Object obj) {
        if (obj instanceof C3367h) {
            return ((C3367h) obj).mo10058d();
        }
        if (obj instanceof C3349a) {
            return 0;
        }
        if (obj instanceof C3350b) {
            return 1;
        }
        if (obj instanceof C3351c) {
            return 2;
        }
        if (obj instanceof C3352d) {
            return 3;
        }
        if (obj instanceof C3353e) {
            return 4;
        }
        if (obj instanceof C3354f) {
            return 5;
        }
        return obj instanceof C3355g ? 7 : -1;
    }

    /* renamed from: a */
    public static ClassCastException m12197a(ClassCastException classCastException) {
        m12199a(classCastException);
        throw classCastException;
    }

    /* renamed from: a */
    public static Object m12198a(Object obj, int i) {
        if (obj == null || m12202b(obj, i)) {
            return obj;
        }
        m12200a(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    /* renamed from: a */
    private static <T extends Throwable> T m12199a(T t) {
        C3370k.m12220a(t, C3359b0.class.getName());
        return t;
    }

    /* renamed from: a */
    public static void m12200a(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m12201a(name + " cannot be cast to " + str);
        throw null;
    }

    /* renamed from: a */
    public static void m12201a(String str) {
        m12197a(new ClassCastException(str));
        throw null;
    }

    /* renamed from: b */
    public static boolean m12202b(Object obj, int i) {
        return (obj instanceof C3215c) && m12196a(obj) == i;
    }
}
