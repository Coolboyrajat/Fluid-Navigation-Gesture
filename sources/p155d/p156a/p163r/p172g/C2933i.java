package p155d.p156a.p163r.p172g;

import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.r.g.i */
public final class C2933i extends C2918a implements Runnable {
    public C2933i(Runnable runnable) {
        super(runnable);
    }

    public void run() {
        this.f7597g = Thread.currentThread();
        try {
            this.f7596f.run();
            this.f7597g = null;
        } catch (Throwable th) {
            this.f7597g = null;
            lazySet(C2918a.f7594h);
            C2962a.m11431b(th);
        }
    }
}
