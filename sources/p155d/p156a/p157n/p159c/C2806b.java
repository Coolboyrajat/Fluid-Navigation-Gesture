package p155d.p156a.p157n.p159c;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p155d.p156a.C2794l;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p160o.C2811c;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.n.c.b */
final class C2806b extends C2794l {

    /* renamed from: b */
    private final Handler f7397b;

    /* renamed from: c */
    private final boolean f7398c;

    /* renamed from: d.a.n.c.b$a */
    private static final class C2807a extends C2794l.C2797c {

        /* renamed from: f */
        private final Handler f7399f;

        /* renamed from: g */
        private final boolean f7400g;

        /* renamed from: h */
        private volatile boolean f7401h;

        C2807a(Handler handler, boolean z) {
            this.f7399f = handler;
            this.f7400g = z;
        }

        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public C2810b mo8940a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f7401h) {
                return C2811c.m11071a();
            } else {
                C2808b bVar = new C2808b(this.f7399f, C2962a.m11427a(runnable));
                Message obtain = Message.obtain(this.f7399f, bVar);
                obtain.obj = this;
                if (this.f7400g) {
                    obtain.setAsynchronous(true);
                }
                this.f7399f.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.f7401h) {
                    return bVar;
                }
                this.f7399f.removeCallbacks(bVar);
                return C2811c.m11071a();
            }
        }

        /* renamed from: a */
        public void mo6027a() {
            this.f7401h = true;
            this.f7399f.removeCallbacksAndMessages(this);
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7401h;
        }
    }

    /* renamed from: d.a.n.c.b$b */
    private static final class C2808b implements Runnable, C2810b {

        /* renamed from: f */
        private final Handler f7402f;

        /* renamed from: g */
        private final Runnable f7403g;

        /* renamed from: h */
        private volatile boolean f7404h;

        C2808b(Handler handler, Runnable runnable) {
            this.f7402f = handler;
            this.f7403g = runnable;
        }

        /* renamed from: a */
        public void mo6027a() {
            this.f7402f.removeCallbacks(this);
            this.f7404h = true;
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7404h;
        }

        public void run() {
            try {
                this.f7403g.run();
            } catch (Throwable th) {
                C2962a.m11431b(th);
            }
        }
    }

    C2806b(Handler handler, boolean z) {
        this.f7397b = handler;
        this.f7398c = z;
    }

    /* renamed from: a */
    public C2794l.C2797c mo8931a() {
        return new C2807a(this.f7397b, this.f7398c);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public C2810b mo8934a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            C2808b bVar = new C2808b(this.f7397b, C2962a.m11427a(runnable));
            Message obtain = Message.obtain(this.f7397b, bVar);
            if (this.f7398c) {
                obtain.setAsynchronous(true);
            }
            this.f7397b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
