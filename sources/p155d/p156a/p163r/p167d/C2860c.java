package p155d.p156a.p163r.p167d;

import p155d.p156a.C2793k;

/* renamed from: d.a.r.d.c */
public class C2860c<T> extends C2859b<T> {

    /* renamed from: f */
    protected final C2793k<? super T> f7430f;

    /* renamed from: g */
    protected T f7431g;

    public C2860c(C2793k<? super T> kVar) {
        this.f7430f = kVar;
    }

    /* renamed from: a */
    public final int mo8964a(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    /* renamed from: a */
    public void mo6027a() {
        set(4);
        this.f7431g = null;
    }

    /* renamed from: b */
    public final boolean mo6028b() {
        return get() == 4;
    }

    /* renamed from: c */
    public final void mo8986c(T t) {
        int i = get();
        if ((i & 54) == 0) {
            C2793k<? super T> kVar = this.f7430f;
            if (i == 8) {
                this.f7431g = t;
                lazySet(16);
                t = null;
            } else {
                lazySet(2);
            }
            kVar.mo6032a(t);
            if (get() != 4) {
                kVar.mo6033c();
            }
        }
    }

    public final void clear() {
        lazySet(32);
        this.f7431g = null;
    }

    /* renamed from: d */
    public final T mo8967d() {
        if (get() != 16) {
            return null;
        }
        T t = this.f7431g;
        this.f7431g = null;
        lazySet(32);
        return t;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }
}
