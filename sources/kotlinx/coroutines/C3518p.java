package kotlinx.coroutines;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.p */
public final class C3518p extends C3410c1 {

    /* renamed from: f */
    private static final int f8224f;

    /* renamed from: g */
    private static boolean f8225g;

    /* renamed from: h */
    public static final C3518p f8226h = new C3518p();
    private static volatile Executor pool;

    /* renamed from: kotlinx.coroutines.p$a */
    static final class C3519a implements ThreadFactory {

        /* renamed from: f */
        final /* synthetic */ AtomicInteger f8227f;

        C3519a(AtomicInteger atomicInteger) {
            this.f8227f = atomicInteger;
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "CommonPool-worker-" + this.f8227f.incrementAndGet());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* renamed from: kotlinx.coroutines.p$b */
    static final class C3520b implements Runnable {

        /* renamed from: f */
        public static final C3520b f8228f = new C3520b();

        C3520b() {
        }

        public final void run() {
        }
    }

    static {
        String str;
        int i;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            Integer a = C3249m.m11922a(str);
            if (a == null || a.intValue() < 1) {
                throw new IllegalStateException(("Expected positive number in kotlinx.coroutines.default.parallelism, but has " + str).toString());
            }
            i = a.intValue();
        } else {
            i = -1;
        }
        f8224f = i;
    }

    private C3518p() {
    }

    /* renamed from: h */
    private final ExecutorService m12666h() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(m12669k(), new C3519a(new AtomicInteger()));
        C3370k.m12223a((Object) newFixedThreadPool, "Executors.newFixedThread…Daemon = true }\n        }");
        return newFixedThreadPool;
    }

    /* renamed from: i */
    private final ExecutorService m12667i() {
        Class<?> cls;
        ExecutorService executorService;
        ExecutorService executorService2;
        if (System.getSecurityManager() != null) {
            return m12666h();
        }
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return m12666h();
        }
        if (!f8225g && f8224f < 0) {
            try {
                Method method = cls.getMethod("commonPool", new Class[0]);
                Object invoke = method != null ? method.invoke((Object) null, new Object[0]) : null;
                if (!(invoke instanceof ExecutorService)) {
                    invoke = null;
                }
                executorService2 = (ExecutorService) invoke;
            } catch (Throwable unused2) {
                executorService2 = null;
            }
            if (executorService2 != null) {
                if (!f8226h.mo10285a(cls, executorService2)) {
                    executorService2 = null;
                }
                if (executorService2 != null) {
                    return executorService2;
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{Integer.valueOf(f8226h.m12669k())});
            if (!(newInstance instanceof ExecutorService)) {
                newInstance = null;
            }
            executorService = (ExecutorService) newInstance;
        } catch (Throwable unused3) {
            executorService = null;
        }
        return executorService != null ? executorService : m12666h();
    }

    /* renamed from: j */
    private final synchronized Executor m12668j() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = m12667i();
            pool = executor;
        }
        return executor;
    }

    /* renamed from: k */
    private final int m12669k() {
        Integer valueOf = Integer.valueOf(f8224f);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : C3198h.m11846a(Runtime.getRuntime().availableProcessors() - 1, 1);
    }

    /* renamed from: a */
    public void mo10112a(C3314f fVar, Runnable runnable) {
        Runnable runnable2;
        C3370k.m12227b(fVar, "context");
        C3370k.m12227b(runnable, "block");
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = m12668j();
            }
            C3411c2 a = C3416d2.m12332a();
            if (a == null || (runnable2 = a.mo10129a(runnable)) == null) {
                runnable2 = runnable;
            }
            executor.execute(runnable2);
        } catch (RejectedExecutionException unused) {
            C3411c2 a2 = C3416d2.m12332a();
            if (a2 != null) {
                a2.mo10134c();
            }
            C3507l0.f8220l.mo10332a(runnable);
        }
    }

    /* renamed from: a */
    public final boolean mo10285a(Class<?> cls, ExecutorService executorService) {
        Integer num;
        C3370k.m12227b(cls, "fjpClass");
        C3370k.m12227b(executorService, "executor");
        executorService.submit(C3520b.f8228f);
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (!(invoke instanceof Integer)) {
                invoke = null;
            }
            num = (Integer) invoke;
        } catch (Throwable unused) {
            num = null;
        }
        return num != null && num.intValue() >= 1;
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    public String toString() {
        return "CommonPool";
    }
}
