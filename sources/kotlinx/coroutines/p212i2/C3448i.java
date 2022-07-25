package kotlinx.coroutines.p212i2;

import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.i2.i */
public abstract class C3448i implements Runnable {

    /* renamed from: f */
    public long f8140f;

    /* renamed from: g */
    public C3449j f8141g;

    public C3448i() {
        this(0, C3447h.f8139g);
    }

    public C3448i(long j, C3449j jVar) {
        C3370k.m12227b(jVar, "taskContext");
        this.f8140f = j;
        this.f8141g = jVar;
    }

    /* renamed from: b */
    public final C3451l mo10195b() {
        return this.f8141g.mo10192f();
    }
}
