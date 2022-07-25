package kotlinx.coroutines.p212i2;

import kotlinx.coroutines.C3556z;
import kotlinx.coroutines.internal.C3488v;

/* renamed from: kotlinx.coroutines.i2.c */
public final class C3442c extends C3443d {

    /* renamed from: k */
    private static final C3556z f8125k;

    /* renamed from: l */
    public static final C3442c f8126l;

    static {
        C3442c cVar = new C3442c();
        f8126l = cVar;
        f8125k = cVar.mo10187a(C3490x.m12589a("kotlinx.coroutines.io.parallelism", C3198h.m11846a(64, C3488v.m12579a()), 0, 0, 12, (Object) null));
    }

    private C3442c() {
        super(0, 0, (String) null, 7, (C3366g) null);
    }

    public void close() {
        throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }

    /* renamed from: h */
    public final C3556z mo10186h() {
        return f8125k;
    }

    public String toString() {
        return "DefaultDispatcher";
    }
}
