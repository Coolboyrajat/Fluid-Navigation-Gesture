package kotlin.p195s;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.p205x.p207d.C3365f;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.p208c0.C3362a;

/* renamed from: kotlin.s.u */
public final class C3296u implements Set, Serializable, C3362a {

    /* renamed from: f */
    public static final C3296u f7996f = new C3296u();

    private C3296u() {
    }

    /* renamed from: a */
    public int mo10009a() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo10010a(Void voidR) {
        C3370k.m12227b(voidR, "element");
        return false;
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo10010a((Void) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        C3370k.m12227b(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C3294s.f7994f;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo10009a();
    }

    public Object[] toArray() {
        return C3365f.m12213a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C3365f.m12214a(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
