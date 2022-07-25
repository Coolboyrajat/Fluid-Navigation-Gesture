package kotlinx.coroutines.p212i2;

import kotlinx.coroutines.p212i2.C3437a;

/* renamed from: kotlinx.coroutines.i2.b */
public final /* synthetic */ class C3441b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f8124a = new int[C3437a.C3440c.values().length];

    static {
        f8124a[C3437a.C3440c.PARKING.ordinal()] = 1;
        f8124a[C3437a.C3440c.BLOCKING.ordinal()] = 2;
        f8124a[C3437a.C3440c.CPU_ACQUIRED.ordinal()] = 3;
        f8124a[C3437a.C3440c.RETIRING.ordinal()] = 4;
        f8124a[C3437a.C3440c.TERMINATED.ordinal()] = 5;
    }
}
