package p006b.p015b.p016a.p017a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: b.b.a.a.b */
public class C0701b extends C0703c {

    /* renamed from: a */
    private final Object f2758a = new Object();

    /* renamed from: b */
    private final ExecutorService f2759b = Executors.newFixedThreadPool(4, new C0702a(this));

    /* renamed from: c */
    private volatile Handler f2760c;

    /* renamed from: b.b.a.a.b$a */
    class C0702a implements ThreadFactory {

        /* renamed from: f */
        private final AtomicInteger f2761f = new AtomicInteger(0);

        C0702a(C0701b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f2761f.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: a */
    private static Handler m3851a(Looper looper) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Handler.createAsync(looper);
        }
        if (i >= 16) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, true});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    /* renamed from: a */
    public void mo3957a(Runnable runnable) {
        this.f2759b.execute(runnable);
    }

    /* renamed from: a */
    public boolean mo3958a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: b */
    public void mo3959b(Runnable runnable) {
        if (this.f2760c == null) {
            synchronized (this.f2758a) {
                if (this.f2760c == null) {
                    this.f2760c = m3851a(Looper.getMainLooper());
                }
            }
        }
        this.f2760c.post(runnable);
    }
}
