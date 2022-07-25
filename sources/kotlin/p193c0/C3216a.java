package kotlin.p193c0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.c0.a */
public final class C3216a<T> implements C3221d<T> {

    /* renamed from: a */
    private final AtomicReference<C3221d<T>> f7943a;

    public C3216a(C3221d<? extends T> dVar) {
        C3370k.m12227b(dVar, "sequence");
        this.f7943a = new AtomicReference<>(dVar);
    }

    public Iterator<T> iterator() {
        C3221d andSet = this.f7943a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
