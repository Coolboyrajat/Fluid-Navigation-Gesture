package p155d.p156a.p163r.p168e.p170b;

import java.util.concurrent.atomic.AtomicInteger;
import p155d.p156a.C2793k;
import p155d.p156a.p163r.p166c.C2853c;

/* renamed from: d.a.r.e.b.r */
public final class C2901r<T> extends AtomicInteger implements C2853c<T>, Runnable {

    /* renamed from: f */
    final C2793k<? super T> f7544f;

    /* renamed from: g */
    final T f7545g;

    public C2901r(C2793k<? super T> kVar, T t) {
        this.f7544f = kVar;
        this.f7545g = t;
    }

    /* renamed from: a */
    public int mo8964a(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        lazySet(1);
        return 1;
    }

    /* renamed from: a */
    public void mo6027a() {
        set(3);
    }

    /* renamed from: b */
    public boolean mo6028b() {
        return get() == 3;
    }

    /* renamed from: b */
    public boolean mo8965b(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void clear() {
        lazySet(3);
    }

    /* renamed from: d */
    public T mo8967d() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f7545g;
    }

    public boolean isEmpty() {
        return get() != 1;
    }

    public void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.f7544f.mo6032a(this.f7545g);
            if (get() == 2) {
                lazySet(3);
                this.f7544f.mo6033c();
            }
        }
    }
}
