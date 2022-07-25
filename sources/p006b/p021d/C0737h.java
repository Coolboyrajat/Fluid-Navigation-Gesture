package p006b.p021d;

/* renamed from: b.d.h */
public class C0737h<E> implements Cloneable {

    /* renamed from: j */
    private static final Object f2863j = new Object();

    /* renamed from: f */
    private boolean f2864f;

    /* renamed from: g */
    private int[] f2865g;

    /* renamed from: h */
    private Object[] f2866h;

    /* renamed from: i */
    private int f2867i;

    public C0737h() {
        this(10);
    }

    public C0737h(int i) {
        this.f2864f = false;
        if (i == 0) {
            this.f2865g = C0727c.f2825a;
            this.f2866h = C0727c.f2827c;
            return;
        }
        int b = C0727c.m3992b(i);
        this.f2865g = new int[b];
        this.f2866h = new Object[b];
    }

    /* renamed from: c */
    private void m4046c() {
        int i = this.f2867i;
        int[] iArr = this.f2865g;
        Object[] objArr = this.f2866h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2863j) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2864f = false;
        this.f2867i = i2;
    }

    /* renamed from: a */
    public int mo4213a(E e) {
        if (this.f2864f) {
            m4046c();
        }
        for (int i = 0; i < this.f2867i; i++) {
            if (this.f2866h[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public E mo4214a(int i) {
        return mo4219b(i, (Object) null);
    }

    /* renamed from: a */
    public void mo4215a() {
        int i = this.f2867i;
        Object[] objArr = this.f2866h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2867i = 0;
        this.f2864f = false;
    }

    /* renamed from: a */
    public void mo4216a(int i, E e) {
        int i2 = this.f2867i;
        if (i2 == 0 || i > this.f2865g[i2 - 1]) {
            if (this.f2864f && this.f2867i >= this.f2865g.length) {
                m4046c();
            }
            int i3 = this.f2867i;
            if (i3 >= this.f2865g.length) {
                int b = C0727c.m3992b(i3 + 1);
                int[] iArr = new int[b];
                Object[] objArr = new Object[b];
                int[] iArr2 = this.f2865g;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f2866h;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f2865g = iArr;
                this.f2866h = objArr;
            }
            this.f2865g[i3] = i;
            this.f2866h[i3] = e;
            this.f2867i = i3 + 1;
            return;
        }
        mo4221c(i, e);
    }

    /* renamed from: b */
    public int mo4217b() {
        if (this.f2864f) {
            m4046c();
        }
        return this.f2867i;
    }

    /* renamed from: b */
    public int mo4218b(int i) {
        if (this.f2864f) {
            m4046c();
        }
        return C0727c.m3989a(this.f2865g, this.f2867i, i);
    }

    /* renamed from: b */
    public E mo4219b(int i, E e) {
        int a = C0727c.m3989a(this.f2865g, this.f2867i, i);
        if (a >= 0) {
            E[] eArr = this.f2866h;
            if (eArr[a] != f2863j) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: c */
    public int mo4220c(int i) {
        if (this.f2864f) {
            m4046c();
        }
        return this.f2865g[i];
    }

    /* renamed from: c */
    public void mo4221c(int i, E e) {
        int a = C0727c.m3989a(this.f2865g, this.f2867i, i);
        if (a >= 0) {
            this.f2866h[a] = e;
            return;
        }
        int i2 = ~a;
        if (i2 < this.f2867i) {
            Object[] objArr = this.f2866h;
            if (objArr[i2] == f2863j) {
                this.f2865g[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f2864f && this.f2867i >= this.f2865g.length) {
            m4046c();
            i2 = ~C0727c.m3989a(this.f2865g, this.f2867i, i);
        }
        int i3 = this.f2867i;
        if (i3 >= this.f2865g.length) {
            int b = C0727c.m3992b(i3 + 1);
            int[] iArr = new int[b];
            Object[] objArr2 = new Object[b];
            int[] iArr2 = this.f2865g;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2866h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2865g = iArr;
            this.f2866h = objArr2;
        }
        int i4 = this.f2867i;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f2865g;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f2866h;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f2867i - i2);
        }
        this.f2865g[i2] = i;
        this.f2866h[i2] = e;
        this.f2867i++;
    }

    public C0737h<E> clone() {
        try {
            C0737h<E> hVar = (C0737h) super.clone();
            hVar.f2865g = (int[]) this.f2865g.clone();
            hVar.f2866h = (Object[]) this.f2866h.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f2866h;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4223d(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f2865g
            int r1 = r3.f2867i
            int r4 = p006b.p021d.C0727c.m3989a((int[]) r0, (int) r1, (int) r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f2866h
            r1 = r0[r4]
            java.lang.Object r2 = f2863j
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f2864f = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p021d.C0737h.mo4223d(int):void");
    }

    /* renamed from: e */
    public E mo4224e(int i) {
        if (this.f2864f) {
            m4046c();
        }
        return this.f2866h[i];
    }

    public String toString() {
        if (mo4217b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2867i * 28);
        sb.append('{');
        for (int i = 0; i < this.f2867i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo4220c(i));
            sb.append('=');
            Object e = mo4224e(i);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
