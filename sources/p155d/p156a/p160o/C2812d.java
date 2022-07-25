package p155d.p156a.p160o;

import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.p163r.p165b.C2849b;

/* renamed from: d.a.o.d */
abstract class C2812d<T> extends AtomicReference<T> implements C2810b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2812d(T t) {
        super(t);
        C2849b.m11138a(t, "value is null");
    }

    /* renamed from: a */
    public final void mo6027a() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            mo8950a(andSet);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8950a(T t);

    /* renamed from: b */
    public final boolean mo6028b() {
        return get() == null;
    }
}
