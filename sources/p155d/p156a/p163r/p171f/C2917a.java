package p155d.p156a.p163r.p171f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p155d.p156a.p163r.p166c.C2856f;
import p155d.p156a.p163r.p173h.C2957g;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: d.a.r.f.a */
public final class C2917a<T> implements C2856f<T> {

    /* renamed from: n */
    static final int f7584n = Integer.getInteger("jctools.spsc.max.lookahead.step", PropertyFlags.INDEX_HASH64).intValue();

    /* renamed from: o */
    private static final Object f7585o = new Object();

    /* renamed from: f */
    final AtomicLong f7586f = new AtomicLong();

    /* renamed from: g */
    int f7587g;

    /* renamed from: h */
    long f7588h;

    /* renamed from: i */
    final int f7589i;

    /* renamed from: j */
    AtomicReferenceArray<Object> f7590j;

    /* renamed from: k */
    final int f7591k;

    /* renamed from: l */
    AtomicReferenceArray<Object> f7592l;

    /* renamed from: m */
    final AtomicLong f7593m = new AtomicLong();

    public C2917a(int i) {
        int a = C2957g.m11407a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a + 1);
        this.f7590j = atomicReferenceArray;
        this.f7589i = i2;
        m11302a(a);
        this.f7592l = atomicReferenceArray;
        this.f7591k = i2;
        this.f7588h = (long) (i2 - 1);
        m11311b(0);
    }

    /* renamed from: a */
    private static int m11298a(long j, int i) {
        int i2 = ((int) j) & i;
        m11308b(i2);
        return i2;
    }

    /* renamed from: a */
    private long m11299a() {
        return this.f7593m.get();
    }

    /* renamed from: a */
    private static <E> Object m11300a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: a */
    private T m11301a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f7592l = atomicReferenceArray;
        int a = m11298a(j, i);
        T a2 = m11300a(atomicReferenceArray, a);
        if (a2 != null) {
            m11304a(atomicReferenceArray, a, (Object) null);
            m11303a(j + 1);
        }
        return a2;
    }

    /* renamed from: a */
    private void m11302a(int i) {
        this.f7587g = Math.min(i / 4, f7584n);
    }

    /* renamed from: a */
    private void m11303a(long j) {
        this.f7593m.lazySet(j);
    }

    /* renamed from: a */
    private static void m11304a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    private void m11305a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f7590j = atomicReferenceArray2;
        this.f7588h = (j2 + j) - 1;
        m11304a(atomicReferenceArray2, i, (Object) t);
        m11306a(atomicReferenceArray, atomicReferenceArray2);
        m11304a(atomicReferenceArray, i, f7585o);
        m11311b(j + 1);
    }

    /* renamed from: a */
    private void m11306a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        int length = atomicReferenceArray.length() - 1;
        m11308b(length);
        m11304a(atomicReferenceArray, length, (Object) atomicReferenceArray2);
    }

    /* renamed from: a */
    private boolean m11307a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m11304a(atomicReferenceArray, i, (Object) t);
        m11311b(j + 1);
        return true;
    }

    /* renamed from: b */
    private static int m11308b(int i) {
        return i;
    }

    /* renamed from: b */
    private long m11309b() {
        return this.f7586f.get();
    }

    /* renamed from: b */
    private AtomicReferenceArray<Object> m11310b(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        m11308b(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m11300a(atomicReferenceArray, i);
        m11304a(atomicReferenceArray, i, (Object) null);
        return atomicReferenceArray2;
    }

    /* renamed from: b */
    private void m11311b(long j) {
        this.f7586f.lazySet(j);
    }

    /* renamed from: c */
    private long m11312c() {
        return this.f7593m.get();
    }

    /* renamed from: e */
    private long m11313e() {
        return this.f7586f.get();
    }

    /* renamed from: b */
    public boolean mo8965b(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f7590j;
            long b = m11309b();
            int i = this.f7589i;
            int a = m11298a(b, i);
            if (b < this.f7588h) {
                return m11307a(atomicReferenceArray, t, b, a);
            }
            long j = ((long) this.f7587g) + b;
            if (m11300a(atomicReferenceArray, m11298a(j, i)) == null) {
                this.f7588h = j - 1;
                return m11307a(atomicReferenceArray, t, b, a);
            } else if (m11300a(atomicReferenceArray, m11298a(1 + b, i)) == null) {
                return m11307a(atomicReferenceArray, t, b, a);
            } else {
                m11305a(atomicReferenceArray, b, a, t, (long) i);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    public void clear() {
        while (true) {
            if (mo8967d() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: d */
    public T mo8967d() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f7592l;
        long a = m11299a();
        int i = this.f7591k;
        int a2 = m11298a(a, i);
        T a3 = m11300a(atomicReferenceArray, a2);
        boolean z = a3 == f7585o;
        if (a3 != null && !z) {
            m11304a(atomicReferenceArray, a2, (Object) null);
            m11303a(a + 1);
            return a3;
        } else if (z) {
            return m11301a(m11310b(atomicReferenceArray, i + 1), a, i);
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return m11313e() == m11312c();
    }
}
