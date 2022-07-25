package kotlin.p195s;

import java.util.Collection;
import java.util.Iterator;
import kotlin.p205x.p207d.C3358b;
import kotlin.p205x.p207d.C3365f;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.p208c0.C3362a;

/* renamed from: kotlin.s.a */
final class C3272a<T> implements Collection<T>, C3362a {

    /* renamed from: f */
    private final T[] f7991f;

    /* renamed from: g */
    private final boolean f7992g;

    public C3272a(T[] tArr, boolean z) {
        C3370k.m12227b(tArr, "values");
        this.f7991f = tArr;
        this.f7992g = z;
    }

    /* renamed from: a */
    public int mo9956a() {
        return this.f7991f.length;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return C3280f.m12022b(this.f7991f, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C3370k.m12227b(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f7991f.length == 0;
    }

    public Iterator<T> iterator() {
        return C3358b.m12195a(this.f7991f);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo9956a();
    }

    public final Object[] toArray() {
        return C3283i.m12065a(this.f7991f, this.f7992g);
    }

    public <T> T[] toArray(T[] tArr) {
        return C3365f.m12214a(this, tArr);
    }
}
