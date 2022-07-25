package p190io.objectbox.internal;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p190io.objectbox.BoxStore;
import p190io.objectbox.annotation.apihint.Internal;

@Internal
/* renamed from: io.objectbox.internal.ObjectBoxThreadPool */
public class ObjectBoxThreadPool extends ThreadPoolExecutor {
    private final BoxStore boxStore;

    /* renamed from: io.objectbox.internal.ObjectBoxThreadPool$ObjectBoxThreadFactory */
    static class ObjectBoxThreadFactory implements ThreadFactory {
        private static final AtomicInteger POOL_COUNT = new AtomicInteger();
        private final ThreadGroup group;
        private final String namePrefix = ("ObjectBox-" + POOL_COUNT.incrementAndGet() + "-Thread-");
        private final AtomicInteger threadCount = new AtomicInteger();

        ObjectBoxThreadFactory() {
            SecurityManager securityManager = System.getSecurityManager();
            this.group = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.group, runnable, this.namePrefix + this.threadCount.incrementAndGet());
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            return thread;
        }
    }

    public ObjectBoxThreadPool(BoxStore boxStore2) {
        super(0, Integer.MAX_VALUE, 20, TimeUnit.SECONDS, new SynchronousQueue(), new ObjectBoxThreadFactory());
        this.boxStore = boxStore2;
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        this.boxStore.closeThreadResources();
    }
}
