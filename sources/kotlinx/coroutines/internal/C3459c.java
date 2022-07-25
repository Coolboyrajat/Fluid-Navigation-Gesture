package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C3498j0;

/* renamed from: kotlinx.coroutines.internal.c */
public abstract class C3459c<T> extends C3482p {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f8163a = AtomicReferenceFieldUpdater.newUpdater(C3459c.class, Object.class, "_consensus");
    private volatile Object _consensus = C3457b.f8159a;

    /* renamed from: d */
    private final Object m12482d(Object obj) {
        return mo10219c(obj) ? obj : this._consensus;
    }

    /* renamed from: a */
    public final Object mo10216a(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C3457b.f8159a) {
            obj2 = m12482d(mo10218b(obj));
        }
        mo10217a(obj, obj2);
        return obj2;
    }

    /* renamed from: a */
    public abstract void mo10217a(T t, Object obj);

    /* renamed from: b */
    public abstract Object mo10218b(T t);

    /* renamed from: c */
    public final boolean mo10219c(Object obj) {
        if (C3498j0.m12618a()) {
            if (!(obj != C3457b.f8159a)) {
                throw new AssertionError();
            }
        }
        return f8163a.compareAndSet(this, C3457b.f8159a, obj);
    }
}
