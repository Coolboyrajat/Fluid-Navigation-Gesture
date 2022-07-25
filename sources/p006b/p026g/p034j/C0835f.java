package p006b.p026g.p034j;

/* renamed from: b.g.j.f */
public class C0835f<T> implements C0834e<T> {

    /* renamed from: a */
    private final Object[] f3247a;

    /* renamed from: b */
    private int f3248b;

    public C0835f(int i) {
        if (i > 0) {
            this.f3247a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: b */
    private boolean m4528b(T t) {
        for (int i = 0; i < this.f3248b; i++) {
            if (this.f3247a[i] == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public T mo4543a() {
        int i = this.f3248b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f3247a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f3248b = i - 1;
        return t;
    }

    /* renamed from: a */
    public boolean mo4544a(T t) {
        if (!m4528b(t)) {
            int i = this.f3248b;
            Object[] objArr = this.f3247a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f3248b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
