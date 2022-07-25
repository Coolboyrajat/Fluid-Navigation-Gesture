package kotlin.p205x.p207d;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.p205x.p207d.p208c0.C3362a;

/* renamed from: kotlin.x.d.a */
final class C3356a<T> implements Iterator<T>, C3362a {

    /* renamed from: f */
    private int f8025f;

    /* renamed from: g */
    private final T[] f8026g;

    public C3356a(T[] tArr) {
        C3370k.m12227b(tArr, "array");
        this.f8026g = tArr;
    }

    public boolean hasNext() {
        return this.f8025f < this.f8026g.length;
    }

    public T next() {
        try {
            T[] tArr = this.f8026g;
            int i = this.f8025f;
            this.f8025f = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f8025f--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
