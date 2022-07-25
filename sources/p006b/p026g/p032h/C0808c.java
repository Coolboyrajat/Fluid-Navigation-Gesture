package p006b.p026g.p032h;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: b.g.h.c */
public class C0808c {

    /* renamed from: a */
    private final Object f3183a = new Object();

    /* renamed from: b */
    private HandlerThread f3184b;

    /* renamed from: c */
    private Handler f3185c;

    /* renamed from: d */
    private int f3186d;

    /* renamed from: e */
    private Handler.Callback f3187e = new C0809a();

    /* renamed from: f */
    private final int f3188f;

    /* renamed from: g */
    private final int f3189g;

    /* renamed from: h */
    private final String f3190h;

    /* renamed from: b.g.h.c$a */
    class C0809a implements Handler.Callback {
        C0809a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C0808c.this.mo4495a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                C0808c.this.mo4496a((Runnable) message.obj);
                return true;
            }
        }
    }

    /* renamed from: b.g.h.c$b */
    class C0810b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Callable f3192f;

        /* renamed from: g */
        final /* synthetic */ Handler f3193g;

        /* renamed from: h */
        final /* synthetic */ C0813d f3194h;

        /* renamed from: b.g.h.c$b$a */
        class C0811a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Object f3195f;

            C0811a(Object obj) {
                this.f3195f = obj;
            }

            public void run() {
                C0810b.this.f3194h.mo4483a(this.f3195f);
            }
        }

        C0810b(C0808c cVar, Callable callable, Handler handler, C0813d dVar) {
            this.f3192f = callable;
            this.f3193g = handler;
            this.f3194h = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f3192f.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f3193g.post(new C0811a(obj));
        }
    }

    /* renamed from: b.g.h.c$c */
    class C0812c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ AtomicReference f3197f;

        /* renamed from: g */
        final /* synthetic */ Callable f3198g;

        /* renamed from: h */
        final /* synthetic */ ReentrantLock f3199h;

        /* renamed from: i */
        final /* synthetic */ AtomicBoolean f3200i;

        /* renamed from: j */
        final /* synthetic */ Condition f3201j;

        C0812c(C0808c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f3197f = atomicReference;
            this.f3198g = callable;
            this.f3199h = reentrantLock;
            this.f3200i = atomicBoolean;
            this.f3201j = condition;
        }

        public void run() {
            try {
                this.f3197f.set(this.f3198g.call());
            } catch (Exception unused) {
            }
            this.f3199h.lock();
            try {
                this.f3200i.set(false);
                this.f3201j.signal();
            } finally {
                this.f3199h.unlock();
            }
        }
    }

    /* renamed from: b.g.h.c$d */
    public interface C0813d<T> {
        /* renamed from: a */
        void mo4483a(T t);
    }

    public C0808c(String str, int i, int i2) {
        this.f3190h = str;
        this.f3189g = i;
        this.f3188f = i2;
        this.f3186d = 0;
    }

    /* renamed from: b */
    private void m4469b(Runnable runnable) {
        synchronized (this.f3183a) {
            if (this.f3184b == null) {
                this.f3184b = new HandlerThread(this.f3190h, this.f3189g);
                this.f3184b.start();
                this.f3185c = new Handler(this.f3184b.getLooper(), this.f3187e);
                this.f3186d++;
            }
            this.f3185c.removeMessages(0);
            this.f3185c.sendMessage(this.f3185c.obtainMessage(1, runnable));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo4494a(java.util.concurrent.Callable<T> r13, int r14) {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            b.g.h.c$c r11 = new b.g.h.c$c
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.m4469b(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p026g.p032h.C0808c.mo4494a(java.util.concurrent.Callable, int):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4495a() {
        synchronized (this.f3183a) {
            if (!this.f3185c.hasMessages(1)) {
                this.f3184b.quit();
                this.f3184b = null;
                this.f3185c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4496a(Runnable runnable) {
        runnable.run();
        synchronized (this.f3183a) {
            this.f3185c.removeMessages(0);
            this.f3185c.sendMessageDelayed(this.f3185c.obtainMessage(0), (long) this.f3188f);
        }
    }

    /* renamed from: a */
    public <T> void mo4497a(Callable<T> callable, C0813d<T> dVar) {
        m4469b(new C0810b(this, callable, new Handler(), dVar));
    }
}
