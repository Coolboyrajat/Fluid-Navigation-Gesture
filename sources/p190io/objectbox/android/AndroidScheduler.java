package p190io.objectbox.android;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Deque;
import p190io.objectbox.reactive.RunWithParam;
import p190io.objectbox.reactive.Scheduler;

/* renamed from: io.objectbox.android.AndroidScheduler */
public class AndroidScheduler extends Handler implements Scheduler {
    private static AndroidScheduler MAIN_THREAD;
    /* access modifiers changed from: private */
    public final Deque<Runner> freeRunners = new ArrayDeque();

    /* renamed from: io.objectbox.android.AndroidScheduler$Runner */
    class Runner implements Runnable {
        Object param;
        RunWithParam runWithParam;

        Runner() {
        }

        public void run() {
            this.runWithParam.run(this.param);
            this.runWithParam = null;
            this.param = null;
            synchronized (AndroidScheduler.this.freeRunners) {
                if (AndroidScheduler.this.freeRunners.size() < 20) {
                    AndroidScheduler.this.freeRunners.add(this);
                }
            }
        }
    }

    public AndroidScheduler(Looper looper) {
        super(looper);
    }

    public static synchronized Scheduler mainThread() {
        AndroidScheduler androidScheduler;
        synchronized (AndroidScheduler.class) {
            if (MAIN_THREAD == null) {
                MAIN_THREAD = new AndroidScheduler(Looper.getMainLooper());
            }
            androidScheduler = MAIN_THREAD;
        }
        return androidScheduler;
    }

    public <T> void run(RunWithParam runWithParam, T t) {
        Runner poll;
        synchronized (this.freeRunners) {
            poll = this.freeRunners.poll();
        }
        if (poll == null) {
            poll = new Runner();
        }
        poll.runWithParam = runWithParam;
        poll.param = t;
        post(poll);
    }
}
