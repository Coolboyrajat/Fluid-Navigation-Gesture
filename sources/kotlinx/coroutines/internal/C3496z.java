package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3498j0;
import kotlinx.coroutines.internal.C3456a0;

/* renamed from: kotlinx.coroutines.internal.z */
public class C3496z<T extends C3456a0 & Comparable<? super T>> {
    private volatile int _size = 0;

    /* renamed from: a */
    private T[] f8209a;

    static {
        AtomicIntegerFieldUpdater.newUpdater(C3496z.class, "_size");
    }

    /* renamed from: a */
    private final void m12604a(int i, int i2) {
        T[] tArr = this.f8209a;
        if (tArr != null) {
            T t = tArr[i2];
            if (t != null) {
                T t2 = tArr[i];
                if (t2 != null) {
                    tArr[i] = t;
                    tArr[i2] = t2;
                    t.mo10208a(i);
                    t2.mo10208a(i2);
                    return;
                }
                C3370k.m12221a();
                throw null;
            }
            C3370k.m12221a();
            throw null;
        }
        C3370k.m12221a();
        throw null;
    }

    /* renamed from: b */
    private final void m12605b(int i) {
        this._size = i;
    }

    /* renamed from: c */
    private final void m12606c(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo10264b()) {
                T[] tArr = this.f8209a;
                if (tArr != null) {
                    int i3 = i2 + 1;
                    if (i3 < mo10264b()) {
                        T t = tArr[i3];
                        if (t != null) {
                            Comparable comparable = (Comparable) t;
                            T t2 = tArr[i2];
                            if (t2 == null) {
                                C3370k.m12221a();
                                throw null;
                            } else if (comparable.compareTo(t2) < 0) {
                                i2 = i3;
                            }
                        } else {
                            C3370k.m12221a();
                            throw null;
                        }
                    }
                    T t3 = tArr[i];
                    if (t3 != null) {
                        Comparable comparable2 = (Comparable) t3;
                        T t4 = tArr[i2];
                        if (t4 == null) {
                            C3370k.m12221a();
                            throw null;
                        } else if (comparable2.compareTo(t4) > 0) {
                            m12604a(i, i2);
                            i = i2;
                        } else {
                            return;
                        }
                    } else {
                        C3370k.m12221a();
                        throw null;
                    }
                } else {
                    C3370k.m12221a();
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private final void m12607d(int i) {
        while (i > 0) {
            T[] tArr = this.f8209a;
            if (tArr != null) {
                int i2 = (i - 1) / 2;
                T t = tArr[i2];
                if (t != null) {
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i];
                    if (t2 == null) {
                        C3370k.m12221a();
                        throw null;
                    } else if (comparable.compareTo(t2) > 0) {
                        m12604a(i, i2);
                        i = i2;
                    } else {
                        return;
                    }
                } else {
                    C3370k.m12221a();
                    throw null;
                }
            } else {
                C3370k.m12221a();
                throw null;
            }
        }
    }

    /* renamed from: f */
    private final T[] m12608f() {
        T[] tArr = this.f8209a;
        if (tArr == null) {
            T[] tArr2 = new C3456a0[4];
            this.f8209a = tArr2;
            return tArr2;
        } else if (mo10264b() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, mo10264b() * 2);
            C3370k.m12223a((Object) copyOf, "java.util.Arrays.copyOf(this, newSize)");
            T[] tArr3 = (C3456a0[]) copyOf;
            this.f8209a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: a */
    public final T mo10261a() {
        T[] tArr = this.f8209a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: a */
    public final T mo10262a(int i) {
        boolean z = false;
        if (C3498j0.m12618a()) {
            if (!(mo10264b() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f8209a;
        if (tArr != null) {
            m12605b(mo10264b() - 1);
            if (i < mo10264b()) {
                m12604a(i, mo10264b());
                int i2 = (i - 1) / 2;
                if (i > 0) {
                    T t = tArr[i];
                    if (t != null) {
                        Comparable comparable = (Comparable) t;
                        T t2 = tArr[i2];
                        if (t2 == null) {
                            C3370k.m12221a();
                            throw null;
                        } else if (comparable.compareTo(t2) < 0) {
                            m12604a(i, i2);
                            m12607d(i2);
                        }
                    } else {
                        C3370k.m12221a();
                        throw null;
                    }
                }
                m12606c(i);
            }
            T t3 = tArr[mo10264b()];
            if (t3 != null) {
                if (C3498j0.m12618a()) {
                    if (t3.mo10210b() == this) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                t3.mo10209a((C3496z<?>) null);
                t3.mo10208a(-1);
                tArr[mo10264b()] = null;
                return t3;
            }
            C3370k.m12221a();
            throw null;
        }
        C3370k.m12221a();
        throw null;
    }

    /* renamed from: a */
    public final void mo10263a(T t) {
        C3370k.m12227b(t, "node");
        if (C3498j0.m12618a()) {
            if (!(t.mo10210b() == null)) {
                throw new AssertionError();
            }
        }
        t.mo10209a((C3496z<?>) this);
        C3456a0[] f = m12608f();
        int b = mo10264b();
        m12605b(b + 1);
        f[b] = t;
        t.mo10208a(b);
        m12607d(b);
    }

    /* renamed from: b */
    public final int mo10264b() {
        return this._size;
    }

    /* renamed from: b */
    public final boolean mo10265b(T t) {
        boolean z;
        C3370k.m12227b(t, "node");
        synchronized (this) {
            z = true;
            boolean z2 = false;
            if (t.mo10210b() == null) {
                z = false;
            } else {
                int c = t.mo10211c();
                if (C3498j0.m12618a()) {
                    if (c >= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                mo10262a(c);
            }
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo10266c() {
        return mo10264b() == 0;
    }

    /* renamed from: d */
    public final T mo10267d() {
        T a;
        synchronized (this) {
            a = mo10261a();
        }
        return a;
    }

    /* renamed from: e */
    public final T mo10268e() {
        T a;
        synchronized (this) {
            a = mo10264b() > 0 ? mo10262a(0) : null;
        }
        return a;
    }
}
