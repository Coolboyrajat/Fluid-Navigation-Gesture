package p155d.p156a.p163r.p172g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p164a.C2831a;

/* renamed from: d.a.r.g.k */
public final class C2935k extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, C2810b {

    /* renamed from: g */
    static final Object f7644g = new Object();

    /* renamed from: h */
    static final Object f7645h = new Object();

    /* renamed from: i */
    static final Object f7646i = new Object();

    /* renamed from: j */
    static final Object f7647j = new Object();

    /* renamed from: f */
    final Runnable f7648f;

    public C2935k(Runnable runnable, C2831a aVar) {
        super(3);
        this.f7648f = runnable;
        lazySet(0, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6027a() {
        /*
            r5 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r5.get(r0)
            java.lang.Object r2 = f7647j
            r3 = 0
            if (r1 == r2) goto L_0x0035
            java.lang.Object r2 = f7645h
            if (r1 == r2) goto L_0x0035
            java.lang.Object r2 = f7646i
            if (r1 != r2) goto L_0x0013
            goto L_0x0035
        L_0x0013:
            r2 = 2
            java.lang.Object r2 = r5.get(r2)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r2 == r4) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            if (r2 == 0) goto L_0x0026
            java.lang.Object r4 = f7646i
            goto L_0x0028
        L_0x0026:
            java.lang.Object r4 = f7645h
        L_0x0028:
            boolean r0 = r5.compareAndSet(r0, r1, r4)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0035
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r2)
        L_0x0035:
            java.lang.Object r0 = r5.get(r3)
            java.lang.Object r1 = f7647j
            if (r0 == r1) goto L_0x004f
            java.lang.Object r1 = f7644g
            if (r0 == r1) goto L_0x004f
            if (r0 != 0) goto L_0x0044
            goto L_0x004f
        L_0x0044:
            boolean r1 = r5.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0035
            d.a.r.a.a r0 = (p155d.p156a.p163r.p164a.C2831a) r0
            r0.mo8946a(r5)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p155d.p156a.p163r.p172g.C2935k.mo6027a():void");
    }

    /* renamed from: a */
    public void mo9040a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f7647j) {
                if (obj == f7645h) {
                    future.cancel(false);
                    return;
                } else if (obj == f7646i) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    /* renamed from: b */
    public boolean mo6028b() {
        Object obj = get(0);
        return obj == f7644g || obj == f7647j;
    }

    public Object call() {
        run();
        return null;
    }

    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f7648f.run();
        } catch (Throwable th) {
            lazySet(2, (Object) null);
            Object obj3 = get(0);
            if (!(obj3 == f7644g || !compareAndSet(0, obj3, f7647j) || obj3 == null)) {
                ((C2831a) obj3).mo8946a(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f7645h || obj2 == f7646i || compareAndSet(1, obj2, f7647j)) {
                    throw th;
                }
                obj2 = get(1);
                break;
            } while (compareAndSet(1, obj2, f7647j));
            throw th;
        }
        lazySet(2, (Object) null);
        Object obj4 = get(0);
        if (!(obj4 == f7644g || !compareAndSet(0, obj4, f7647j) || obj4 == null)) {
            ((C2831a) obj4).mo8946a(this);
        }
        do {
            obj = get(1);
            if (obj == f7645h || obj == f7646i || compareAndSet(1, obj, f7647j)) {
            }
            obj = get(1);
            return;
        } while (compareAndSet(1, obj, f7647j));
    }
}
