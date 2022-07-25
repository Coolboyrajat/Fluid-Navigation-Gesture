package p155d.p156a.p163r.p172g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d.a.r.g.m */
public final class C2937m {

    /* renamed from: a */
    public static final boolean f7649a;

    /* renamed from: b */
    public static final int f7650b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f7651c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f7652d = new ConcurrentHashMap();

    /* renamed from: d.a.r.g.m$a */
    static final class C2938a {

        /* renamed from: a */
        boolean f7653a;

        /* renamed from: b */
        int f7654b;

        C2938a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9043a(Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.f7653a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            } else {
                this.f7653a = true;
            }
            if (this.f7653a && properties.containsKey("rx2.purge-period-seconds")) {
                try {
                    this.f7654b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
                    return;
                } catch (NumberFormatException unused) {
                }
            }
            this.f7654b = 1;
        }
    }

    /* renamed from: d.a.r.g.m$b */
    static final class C2939b implements Runnable {
        C2939b() {
        }

        public void run() {
            Iterator it = new ArrayList(C2937m.f7652d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C2937m.f7652d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        C2938a aVar = new C2938a();
        aVar.mo9043a(properties);
        f7649a = aVar.f7653a;
        f7650b = aVar.f7654b;
        m11359a();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m11358a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m11361a(f7649a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    /* renamed from: a */
    public static void m11359a() {
        m11360a(f7649a);
    }

    /* renamed from: a */
    static void m11360a(boolean z) {
        if (z) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = f7651c.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new C2931h("RxSchedulerPurge"));
                    if (f7651c.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                        C2939b bVar = new C2939b();
                        int i = f7650b;
                        newScheduledThreadPool.scheduleAtFixedRate(bVar, (long) i, (long) i, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    static void m11361a(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f7652d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }
}
