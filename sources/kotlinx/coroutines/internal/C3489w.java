package kotlinx.coroutines.internal;

import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.internal.w */
final /* synthetic */ class C3489w {

    /* renamed from: a */
    private static final int f8199a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m12586a() {
        return f8199a;
    }

    /* renamed from: a */
    public static final String m12587a(String str) {
        C3370k.m12227b(str, "propertyName");
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
