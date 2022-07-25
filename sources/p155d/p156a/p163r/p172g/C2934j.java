package p155d.p156a.p163r.p172g;

import java.util.concurrent.Callable;

/* renamed from: d.a.r.g.j */
public final class C2934j extends C2918a implements Callable<Void> {
    public C2934j(Runnable runnable) {
        super(runnable);
    }

    public Void call() {
        this.f7597g = Thread.currentThread();
        try {
            this.f7596f.run();
            return null;
        } finally {
            lazySet(C2918a.f7594h);
            this.f7597g = null;
        }
    }
}
