package kotlinx.coroutines.internal;

import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.internal.x */
final /* synthetic */ class C3490x {
    /* renamed from: a */
    public static final int m12588a(String str, int i, int i2, int i3) {
        C3370k.m12227b(str, "propertyName");
        return (int) C3488v.m12582a(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: a */
    public static /* synthetic */ int m12589a(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C3488v.m12580a(str, i, i2, i3);
    }

    /* renamed from: a */
    public static final long m12590a(String str, long j, long j2, long j3) {
        C3370k.m12227b(str, "propertyName");
        String a = C3488v.m12584a(str);
        if (a == null) {
            return j;
        }
        Long b = C3249m.m11924b(a);
        if (b != null) {
            long longValue = b.longValue();
            if (j2 <= longValue && j3 >= longValue) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + a + '\'').toString());
    }

    /* renamed from: a */
    public static /* synthetic */ long m12591a(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C3488v.m12582a(str, j, j4, j3);
    }

    /* renamed from: a */
    public static final boolean m12592a(String str, boolean z) {
        C3370k.m12227b(str, "propertyName");
        String a = C3488v.m12584a(str);
        return a != null ? Boolean.parseBoolean(a) : z;
    }
}
