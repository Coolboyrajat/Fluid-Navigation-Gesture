package p155d.p156a.p163r.p165b;

import p155d.p156a.p162q.C2825c;

/* renamed from: d.a.r.b.b */
public final class C2849b {

    /* renamed from: a */
    static final C2825c<Object, Object> f7424a = new C2850a();

    /* renamed from: d.a.r.b.b$a */
    static final class C2850a implements C2825c<Object, Object> {
        C2850a() {
        }

        /* renamed from: a */
        public boolean mo8963a(Object obj, Object obj2) {
            return C2849b.m11139a(obj, obj2);
        }
    }

    /* renamed from: a */
    public static int m11134a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m11135a(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }

    /* renamed from: a */
    public static int m11136a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: a */
    public static <T> C2825c<T, T> m11137a() {
        return f7424a;
    }

    /* renamed from: a */
    public static <T> T m11138a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static boolean m11139a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
