package p054c.p119h.p120a.p124k;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C3256e;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;
import p054c.p119h.p120a.p124k.C1522k;

/* renamed from: c.h.a.k.b */
public abstract class C1507b extends Service {

    /* renamed from: k */
    static final /* synthetic */ C3208i[] f4537k;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Handler f4538f = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: g */
    public AtomicInteger f4539g = new AtomicInteger(0);

    /* renamed from: h */
    private final C3256e f4540h = C3258g.m11969a(new C1508a(this));
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Integer f4541i;

    /* renamed from: j */
    private final String f4542j;

    /* renamed from: c.h.a.k.b$a */
    static final class C1508a extends C3371l implements C3349a<ExecutorService> {

        /* renamed from: g */
        final /* synthetic */ C1507b f4543g;

        /* renamed from: c.h.a.k.b$a$a */
        static final class C1509a implements ThreadFactory {

            /* renamed from: f */
            final /* synthetic */ C1508a f4544f;

            C1509a(C1508a aVar) {
                this.f4544f = aVar;
            }

            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "IntentServiceParallel" + this.f4544f.f4543g.mo5984a());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1508a(C1507b bVar) {
            super(0);
            this.f4543g = bVar;
        }

        public final ExecutorService invoke() {
            return Executors.newCachedThreadPool(new C1509a(this));
        }
    }

    /* renamed from: c.h.a.k.b$b */
    static final class C1510b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1507b f4545f;

        /* renamed from: g */
        final /* synthetic */ Intent f4546g;

        /* renamed from: c.h.a.k.b$b$a */
        static final class C1511a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ RuntimeException f4547f;

            C1511a(RuntimeException runtimeException) {
                this.f4547f = runtimeException;
            }

            public final void run() {
                throw this.f4547f;
            }
        }

        /* renamed from: c.h.a.k.b$b$b */
        static final class C1512b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C1510b f4548f;

            C1512b(C1510b bVar) {
                this.f4548f = bVar;
            }

            public final void run() {
                if (this.f4548f.f4545f.f4539g.decrementAndGet() <= 0) {
                    Integer c = this.f4548f.f4545f.f4541i;
                    if (c != null) {
                        this.f4548f.f4545f.stopSelf(c.intValue());
                    } else {
                        this.f4548f.f4545f.stopSelf();
                    }
                }
            }
        }

        C1510b(C1507b bVar, Intent intent) {
            this.f4545f = bVar;
            this.f4546g = intent;
        }

        public final void run() {
            C1512b bVar;
            Handler handler;
            try {
                this.f4545f.mo5985a(this.f4546g);
                handler = this.f4545f.f4538f;
                bVar = new C1512b(this);
            } catch (RuntimeException e) {
                this.f4545f.f4538f.post(new C1511a(e));
                handler = this.f4545f.f4538f;
                bVar = new C1512b(this);
            } catch (Throwable th) {
                this.f4545f.f4538f.post(new C1512b(this));
                throw th;
            }
            handler.post(bVar);
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C1507b.class), "executor", "getExecutor()Ljava/util/concurrent/ExecutorService;");
        C3384y.m12259a((C3379t) uVar);
        f4537k = new C3208i[]{uVar};
    }

    public C1507b(String str) {
        C3370k.m12227b(str, "name");
        this.f4542j = str;
    }

    /* renamed from: c */
    private final ExecutorService m6785c() {
        C3256e eVar = this.f4540h;
        C3208i iVar = f4537k[0];
        return (ExecutorService) eVar.getValue();
    }

    /* renamed from: a */
    public final String mo5984a() {
        return this.f4542j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5985a(Intent intent);

    /* renamed from: b */
    public final void mo5986b() {
        C1522k.C1523a.m6805a(C1522k.Companion, this, (C1522k.C1524b) null, 2, (Object) null);
    }

    public Void onBind(Intent intent) {
        C3370k.m12227b(intent, "intent");
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        m6785c().shutdown();
    }

    public void onStart(Intent intent, int i) {
        if (intent != null) {
            this.f4539g.addAndGet(1);
            this.f4541i = Integer.valueOf(i);
            m6785c().submit(new C1510b(this, intent));
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        onStart(intent, i2);
        return 2;
    }
}
