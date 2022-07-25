package kotlinx.coroutines.p212i2;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C3488v;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: kotlinx.coroutines.i2.m */
public final class C3452m {

    /* renamed from: a */
    public static final long f8146a = C3490x.m12591a("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b */
    public static final int f8147b = C3490x.m12589a("kotlinx.coroutines.scheduler.offload.threshold", 96, 0, (int) PropertyFlags.ID_SELF_ASSIGNABLE, 4, (Object) null);

    /* renamed from: c */
    public static final int f8148c = C3490x.m12589a("kotlinx.coroutines.scheduler.core.pool.size", C3198h.m11846a(C3488v.m12579a(), 2), 1, 0, 8, (Object) null);

    /* renamed from: d */
    public static final int f8149d = C3490x.m12589a("kotlinx.coroutines.scheduler.max.pool.size", C3198h.m11847a(C3488v.m12579a() * PropertyFlags.ID_SELF_ASSIGNABLE, f8148c, 2097150), 0, 2097150, 4, (Object) null);

    /* renamed from: e */
    public static final long f8150e = TimeUnit.SECONDS.toNanos(C3490x.m12591a("kotlinx.coroutines.scheduler.keep.alive.sec", 5, 0, 0, 12, (Object) null));

    /* renamed from: f */
    public static C3453n f8151f = C3446g.f8137a;

    static {
        int unused = C3490x.m12589a("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);
    }
}
