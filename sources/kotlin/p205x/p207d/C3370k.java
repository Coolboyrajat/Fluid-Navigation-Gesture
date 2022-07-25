package kotlin.p205x.p207d;

import java.util.Arrays;
import kotlin.C3234d;
import kotlin.C3271r;

/* renamed from: kotlin.x.d.k */
public class C3370k {
    private C3370k() {
    }

    /* renamed from: a */
    public static int m12218a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: a */
    private static <T extends Throwable> T m12219a(T t) {
        m12220a(t, C3370k.class.getName());
        return t;
    }

    /* renamed from: a */
    static <T extends Throwable> T m12220a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: a */
    public static void m12221a() {
        C3234d dVar = new C3234d();
        m12219a(dVar);
        throw dVar;
    }

    /* renamed from: a */
    public static void m12222a(int i, String str) {
        m12226b();
        throw null;
    }

    /* renamed from: a */
    public static void m12223a(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(str + " must not be null");
            m12219a(illegalStateException);
            throw illegalStateException;
        }
    }

    /* renamed from: a */
    private static void m12224a(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
        m12219a(illegalArgumentException);
        throw illegalArgumentException;
    }

    /* renamed from: a */
    public static boolean m12225a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m12226b() {
        m12228b("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
        throw null;
    }

    /* renamed from: b */
    public static void m12227b(Object obj, String str) {
        if (obj == null) {
            m12224a(str);
            throw null;
        }
    }

    /* renamed from: b */
    public static void m12228b(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: c */
    public static void m12229c(String str) {
        C3271r rVar = new C3271r(str);
        m12219a(rVar);
        throw rVar;
    }

    /* renamed from: d */
    public static void m12230d(String str) {
        m12229c("lateinit property " + str + " has not been initialized");
        throw null;
    }
}
