package kotlinx.coroutines.internal;

import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.internal.a */
public class C3455a<T> {

    /* renamed from: a */
    private Object[] f8156a = new Object[16];

    /* renamed from: b */
    private int f8157b;

    /* renamed from: c */
    private int f8158c;

    /* renamed from: c */
    private final void m12469c() {
        Object[] objArr = this.f8156a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        Object[] unused = C3279e.m12014a(objArr, objArr3, 0, this.f8157b, 0, 10, (Object) null);
        Object[] objArr4 = this.f8156a;
        int length2 = objArr4.length;
        int i = this.f8157b;
        Object[] unused2 = C3279e.m12014a(objArr4, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.f8156a = objArr3;
        this.f8157b = 0;
        this.f8158c = length;
    }

    /* renamed from: a */
    public final void mo10205a(T t) {
        C3370k.m12227b(t, "element");
        Object[] objArr = this.f8156a;
        int i = this.f8158c;
        objArr[i] = t;
        this.f8158c = (objArr.length - 1) & (i + 1);
        if (this.f8158c == this.f8157b) {
            m12469c();
        }
    }

    /* renamed from: a */
    public final boolean mo10206a() {
        return this.f8157b == this.f8158c;
    }

    /* renamed from: b */
    public final T mo10207b() {
        int i = this.f8157b;
        if (i == this.f8158c) {
            return null;
        }
        T[] tArr = this.f8156a;
        T t = tArr[i];
        tArr[i] = null;
        this.f8157b = (i + 1) & (tArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new C3269p("null cannot be cast to non-null type T");
    }
}
