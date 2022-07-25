package p006b.p022e.p023a;

/* renamed from: b.e.a.h */
class C0746h<T> implements C0745g<T> {

    /* renamed from: a */
    private final Object[] f2931a;

    /* renamed from: b */
    private int f2932b;

    C0746h(int i) {
        if (i > 0) {
            this.f2931a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public T mo4289a() {
        int i = this.f2932b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f2931a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f2932b = i - 1;
        return t;
    }

    /* renamed from: a */
    public void mo4290a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f2932b;
            Object[] objArr = this.f2931a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f2932b = i3 + 1;
            }
        }
    }

    /* renamed from: a */
    public boolean mo4291a(T t) {
        int i = this.f2932b;
        Object[] objArr = this.f2931a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f2932b = i + 1;
        return true;
    }
}
