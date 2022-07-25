package p006b.p021d;

/* renamed from: b.d.d */
public class C0728d<E> implements Cloneable {

    /* renamed from: j */
    private static final Object f2828j = new Object();

    /* renamed from: f */
    private boolean f2829f;

    /* renamed from: g */
    private long[] f2830g;

    /* renamed from: h */
    private Object[] f2831h;

    /* renamed from: i */
    private int f2832i;

    public C0728d() {
        this(10);
    }

    public C0728d(int i) {
        this.f2829f = false;
        if (i == 0) {
            this.f2830g = C0727c.f2826b;
            this.f2831h = C0727c.f2827c;
            return;
        }
        int c = C0727c.m3993c(i);
        this.f2830g = new long[c];
        this.f2831h = new Object[c];
    }

    /* renamed from: c */
    private void m3994c() {
        int i = this.f2832i;
        long[] jArr = this.f2830g;
        Object[] objArr = this.f2831h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2828j) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2829f = false;
        this.f2832i = i2;
    }

    /* renamed from: a */
    public long mo4105a(int i) {
        if (this.f2829f) {
            m3994c();
        }
        return this.f2830g[i];
    }

    /* renamed from: a */
    public void mo4106a() {
        int i = this.f2832i;
        Object[] objArr = this.f2831h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2832i = 0;
        this.f2829f = false;
    }

    @Deprecated
    /* renamed from: a */
    public void mo4107a(long j) {
        mo4117d(j);
    }

    /* renamed from: a */
    public void mo4108a(long j, E e) {
        int i = this.f2832i;
        if (i == 0 || j > this.f2830g[i - 1]) {
            if (this.f2829f && this.f2832i >= this.f2830g.length) {
                m3994c();
            }
            int i2 = this.f2832i;
            if (i2 >= this.f2830g.length) {
                int c = C0727c.m3993c(i2 + 1);
                long[] jArr = new long[c];
                Object[] objArr = new Object[c];
                long[] jArr2 = this.f2830g;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f2831h;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f2830g = jArr;
                this.f2831h = objArr;
            }
            this.f2830g[i2] = j;
            this.f2831h[i2] = e;
            this.f2832i = i2 + 1;
            return;
        }
        mo4115c(j, e);
    }

    /* renamed from: b */
    public int mo4109b() {
        if (this.f2829f) {
            m3994c();
        }
        return this.f2832i;
    }

    /* renamed from: b */
    public E mo4110b(long j) {
        return mo4111b(j, (Object) null);
    }

    /* renamed from: b */
    public E mo4111b(long j, E e) {
        int a = C0727c.m3990a(this.f2830g, this.f2832i, j);
        if (a >= 0) {
            E[] eArr = this.f2831h;
            if (eArr[a] != f2828j) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: b */
    public void mo4112b(int i) {
        Object[] objArr = this.f2831h;
        Object obj = objArr[i];
        Object obj2 = f2828j;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f2829f = true;
        }
    }

    /* renamed from: c */
    public int mo4113c(long j) {
        if (this.f2829f) {
            m3994c();
        }
        return C0727c.m3990a(this.f2830g, this.f2832i, j);
    }

    /* renamed from: c */
    public E mo4114c(int i) {
        if (this.f2829f) {
            m3994c();
        }
        return this.f2831h[i];
    }

    /* renamed from: c */
    public void mo4115c(long j, E e) {
        int a = C0727c.m3990a(this.f2830g, this.f2832i, j);
        if (a >= 0) {
            this.f2831h[a] = e;
            return;
        }
        int i = ~a;
        if (i < this.f2832i) {
            Object[] objArr = this.f2831h;
            if (objArr[i] == f2828j) {
                this.f2830g[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f2829f && this.f2832i >= this.f2830g.length) {
            m3994c();
            i = ~C0727c.m3990a(this.f2830g, this.f2832i, j);
        }
        int i2 = this.f2832i;
        if (i2 >= this.f2830g.length) {
            int c = C0727c.m3993c(i2 + 1);
            long[] jArr = new long[c];
            Object[] objArr2 = new Object[c];
            long[] jArr2 = this.f2830g;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2831h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2830g = jArr;
            this.f2831h = objArr2;
        }
        int i3 = this.f2832i;
        if (i3 - i != 0) {
            long[] jArr3 = this.f2830g;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f2831h;
            System.arraycopy(objArr4, i, objArr4, i4, this.f2832i - i);
        }
        this.f2830g[i] = j;
        this.f2831h[i] = e;
        this.f2832i++;
    }

    public C0728d<E> clone() {
        try {
            C0728d<E> dVar = (C0728d) super.clone();
            dVar.f2830g = (long[]) this.f2830g.clone();
            dVar.f2831h = (Object[]) this.f2831h.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f2831h;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4117d(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f2830g
            int r1 = r2.f2832i
            int r3 = p006b.p021d.C0727c.m3990a((long[]) r0, (int) r1, (long) r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f2831h
            r0 = r4[r3]
            java.lang.Object r1 = f2828j
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f2829f = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p021d.C0728d.mo4117d(long):void");
    }

    public String toString() {
        if (mo4109b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2832i * 28);
        sb.append('{');
        for (int i = 0; i < this.f2832i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo4105a(i));
            sb.append('=');
            Object c = mo4114c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
