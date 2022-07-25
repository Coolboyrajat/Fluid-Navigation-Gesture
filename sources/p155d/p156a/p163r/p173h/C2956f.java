package p155d.p156a.p163r.p173h;

/* renamed from: d.a.r.h.f */
public final class C2956f<T> {

    /* renamed from: a */
    final float f7684a;

    /* renamed from: b */
    int f7685b;

    /* renamed from: c */
    int f7686c;

    /* renamed from: d */
    int f7687d;

    /* renamed from: e */
    T[] f7688e;

    public C2956f() {
        this(16, 0.75f);
    }

    public C2956f(int i, float f) {
        this.f7684a = f;
        int a = C2957g.m11407a(i);
        this.f7685b = a - 1;
        this.f7687d = (int) (f * ((float) a));
        this.f7688e = new Object[a];
    }

    /* renamed from: a */
    static int m11401a(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9062a(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f7686c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int a = m11401a(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a || a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    /* renamed from: a */
    public boolean mo9063a(T t) {
        T t2;
        T[] tArr = this.f7688e;
        int i = this.f7685b;
        int a = m11401a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                a = (a + 1) & i;
                t2 = tArr[a];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[a] = t;
        int i2 = this.f7686c + 1;
        this.f7686c = i2;
        if (i2 >= this.f7687d) {
            mo9065b();
        }
        return true;
    }

    /* renamed from: a */
    public Object[] mo9064a() {
        return this.f7688e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9065b() {
        T[] tArr = this.f7688e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = new Object[i];
        int i3 = this.f7686c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int a = m11401a(tArr[length].hashCode()) & i2;
                if (tArr2[a] != null) {
                    do {
                        a = (a + 1) & i2;
                    } while (tArr2[a] != null);
                }
                tArr2[a] = tArr[length];
                i3 = i4;
            } else {
                this.f7685b = i2;
                this.f7687d = (int) (((float) i) * this.f7684a);
                this.f7688e = tArr2;
                return;
            }
        }
    }

    /* renamed from: b */
    public boolean mo9066b(T t) {
        T t2;
        T[] tArr = this.f7688e;
        int i = this.f7685b;
        int a = m11401a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return mo9062a(a, tArr, i);
        }
        do {
            a = (a + 1) & i;
            t2 = tArr[a];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return mo9062a(a, tArr, i);
    }
}
