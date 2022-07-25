package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.l0 */
public final class C3507l0 extends C3551y0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: k */
    private static final long f8219k;

    /* renamed from: l */
    public static final C3507l0 f8220l;

    static {
        Long l;
        C3507l0 l0Var = new C3507l0();
        f8220l = l0Var;
        C3548x0.m12791a(l0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        C3370k.m12223a((Object) l, "try {\n            java.l…AULT_KEEP_ALIVE\n        }");
        f8219k = timeUnit.toNanos(l.longValue());
    }

    private C3507l0() {
    }

    /* renamed from: q */
    private final synchronized void m12641q() {
        if (m12643s()) {
            debugStatus = 3;
            mo10336p();
            notifyAll();
        }
    }

    /* renamed from: r */
    private final synchronized Thread m12642r() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: s */
    private final boolean m12643s() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: t */
    private final synchronized boolean m12644t() {
        if (m12643s()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Thread mo10123l() {
        Thread thread = _thread;
        return thread != null ? thread : m12642r();
    }

    public void run() {
        boolean n;
        long j;
        C3406b2.f8069b.mo10121a(this);
        C3411c2 a = C3416d2.m12332a();
        if (a != null) {
            a.mo10133b();
        }
        if (!m12644t()) {
            _thread = null;
            m12641q();
            C3411c2 a2 = C3416d2.m12332a();
            if (a2 != null) {
                a2.mo10130a();
            }
            if (!mo10334n()) {
                mo10123l();
                return;
            }
            return;
        }
        long j2 = Long.MAX_VALUE;
        while (true) {
            try {
                Thread.interrupted();
                long o = mo10335o();
                if (o == Long.MAX_VALUE) {
                    int i = (j2 > Long.MAX_VALUE ? 1 : (j2 == Long.MAX_VALUE ? 0 : -1));
                    if (i == 0) {
                        C3411c2 a3 = C3416d2.m12332a();
                        long e = a3 != null ? a3.mo10136e() : System.nanoTime();
                        if (i == 0) {
                            j2 = f8219k + e;
                        }
                        j = j2 - e;
                        if (j <= 0) {
                            _thread = null;
                            m12641q();
                            C3411c2 a4 = C3416d2.m12332a();
                            if (a4 != null) {
                                a4.mo10130a();
                            }
                            if (!mo10334n()) {
                                mo10123l();
                                return;
                            }
                            return;
                        }
                    } else {
                        j = f8219k;
                    }
                    o = C3198h.m11850b(o, j);
                }
                if (o > 0) {
                    if (!m12643s()) {
                        C3411c2 a5 = C3416d2.m12332a();
                        if (a5 != null) {
                            a5.mo10131a(this, o);
                        } else {
                            LockSupport.parkNanos(this, o);
                        }
                    } else if (n) {
                        return;
                    } else {
                        return;
                    }
                }
            } finally {
                _thread = null;
                m12641q();
                C3411c2 a6 = C3416d2.m12332a();
                if (a6 != null) {
                    a6.mo10130a();
                }
                if (!mo10334n()) {
                    mo10123l();
                }
            }
        }
    }
}
