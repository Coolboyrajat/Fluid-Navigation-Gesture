package p155d.p156a.p163r.p172g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: d.a.r.g.h */
public final class C2931h extends AtomicLong implements ThreadFactory {

    /* renamed from: f */
    final String f7641f;

    /* renamed from: g */
    final int f7642g;

    /* renamed from: h */
    final boolean f7643h;

    /* renamed from: d.a.r.g.h$a */
    static final class C2932a extends Thread implements C2930g {
        C2932a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public C2931h(String str) {
        this(str, 5, false);
    }

    public C2931h(String str, int i) {
        this(str, i, false);
    }

    public C2931h(String str, int i, boolean z) {
        this.f7641f = str;
        this.f7642g = i;
        this.f7643h = z;
    }

    public Thread newThread(Runnable runnable) {
        String str = this.f7641f + '-' + incrementAndGet();
        Thread aVar = this.f7643h ? new C2932a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f7642g);
        aVar.setDaemon(true);
        return aVar;
    }

    public String toString() {
        return "RxThreadFactory[" + this.f7641f + "]";
    }
}
