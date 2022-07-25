package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.i */
public abstract class C0481i {

    /* renamed from: androidx.lifecycle.i$a */
    public enum C0482a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: androidx.lifecycle.i$b */
    public enum C0483b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean mo2703a(C0483b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public C0481i() {
        new AtomicReference();
    }

    /* renamed from: a */
    public abstract C0483b mo2700a();

    /* renamed from: a */
    public abstract void mo2701a(C0489n nVar);

    /* renamed from: b */
    public abstract void mo2702b(C0489n nVar);
}
