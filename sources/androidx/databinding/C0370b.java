package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.databinding.b */
public class C0370b<C, T, A> implements Cloneable {

    /* renamed from: f */
    private List<C> f1695f = new ArrayList();

    /* renamed from: g */
    private long f1696g = 0;

    /* renamed from: h */
    private long[] f1697h;

    /* renamed from: i */
    private int f1698i;

    /* renamed from: j */
    private final C0371a<C, T, A> f1699j;

    /* renamed from: androidx.databinding.b$a */
    public static abstract class C0371a<C, T, A> {
        /* renamed from: a */
        public abstract void mo2146a(C c, T t, int i, A a);
    }

    public C0370b(C0371a<C, T, A> aVar) {
        this.f1699j = aVar;
    }

    /* renamed from: a */
    private void m1832a(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = (i + 64) - 1; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.f1695f.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    /* renamed from: a */
    private void m1833a(T t, int i, A a, int i2) {
        if (i2 < 0) {
            m1837b(t, i, a);
            return;
        }
        long j = this.f1697h[i2];
        int i3 = (i2 + 1) * 64;
        int min = Math.min(this.f1695f.size(), i3 + 64);
        m1833a(t, i, a, i2 - 1);
        m1834a(t, i, a, i3, min, j);
    }

    /* renamed from: a */
    private void m1834a(T t, int i, A a, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.f1699j.mo2146a(this.f1695f.get(i2), t, i, a);
            }
            j2 <<= 1;
            i2++;
        }
    }

    /* renamed from: a */
    private boolean m1835a(int i) {
        int i2;
        if (i < 64) {
            return ((1 << i) & this.f1696g) != 0;
        }
        long[] jArr = this.f1697h;
        if (jArr == null || (i2 = (i / 64) - 1) >= jArr.length) {
            return false;
        }
        return ((1 << (i % 64)) & jArr[i2]) != 0;
    }

    /* renamed from: b */
    private void m1836b(int i) {
        if (i < 64) {
            this.f1696g = (1 << i) | this.f1696g;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.f1697h;
        if (jArr == null) {
            this.f1697h = new long[(this.f1695f.size() / 64)];
        } else if (jArr.length <= i2) {
            long[] jArr2 = new long[(this.f1695f.size() / 64)];
            long[] jArr3 = this.f1697h;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f1697h = jArr2;
        }
        long j = 1 << (i % 64);
        long[] jArr4 = this.f1697h;
        jArr4[i2] = j | jArr4[i2];
    }

    /* renamed from: b */
    private void m1837b(T t, int i, A a) {
        m1834a(t, i, a, 0, Math.min(64, this.f1695f.size()), this.f1696g);
    }

    /* renamed from: c */
    private void m1838c(T t, int i, A a) {
        int size = this.f1695f.size();
        long[] jArr = this.f1697h;
        int length = jArr == null ? -1 : jArr.length - 1;
        m1833a(t, i, a, length);
        m1834a(t, i, a, (length + 2) * 64, size, 0);
    }

    /* renamed from: a */
    public synchronized void mo2176a(C c) {
        if (c != null) {
            int lastIndexOf = this.f1695f.lastIndexOf(c);
            if (lastIndexOf < 0 || m1835a(lastIndexOf)) {
                this.f1695f.add(c);
            }
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    /* renamed from: a */
    public synchronized void mo2177a(T t, int i, A a) {
        this.f1698i++;
        m1838c(t, i, a);
        this.f1698i--;
        if (this.f1698i == 0) {
            if (this.f1697h != null) {
                for (int length = this.f1697h.length - 1; length >= 0; length--) {
                    long j = this.f1697h[length];
                    if (j != 0) {
                        m1832a((length + 1) * 64, j);
                        this.f1697h[length] = 0;
                    }
                }
            }
            if (this.f1696g != 0) {
                m1832a(0, this.f1696g);
                this.f1696g = 0;
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo2178b(C c) {
        if (this.f1698i == 0) {
            this.f1695f.remove(c);
        } else {
            int lastIndexOf = this.f1695f.lastIndexOf(c);
            if (lastIndexOf >= 0) {
                m1836b(lastIndexOf);
            }
        }
    }

    public synchronized C0370b<C, T, A> clone() {
        C0370b<C, T, A> bVar;
        CloneNotSupportedException e;
        try {
            bVar = (C0370b) super.clone();
            try {
                bVar.f1696g = 0;
                bVar.f1697h = null;
                bVar.f1698i = 0;
                bVar.f1695f = new ArrayList();
                int size = this.f1695f.size();
                for (int i = 0; i < size; i++) {
                    if (!m1835a(i)) {
                        bVar.f1695f.add(this.f1695f.get(i));
                    }
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                e.printStackTrace();
                return bVar;
            }
        } catch (CloneNotSupportedException e3) {
            CloneNotSupportedException cloneNotSupportedException = e3;
            bVar = null;
            e = cloneNotSupportedException;
            e.printStackTrace();
            return bVar;
        }
        return bVar;
    }
}
