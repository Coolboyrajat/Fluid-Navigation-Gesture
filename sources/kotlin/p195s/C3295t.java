package kotlin.p195s;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.p205x.p207d.C3365f;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.p208c0.C3362a;

/* renamed from: kotlin.s.t */
public final class C3295t implements List, Serializable, RandomAccess, C3362a {

    /* renamed from: f */
    public static final C3295t f7995f = new C3295t();

    private C3295t() {
    }

    /* renamed from: a */
    public int mo9979a() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo9980a(Void voidR) {
        C3370k.m12227b(voidR, "element");
        return false;
    }

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo9985b(Void voidR) {
        C3370k.m12227b(voidR, "element");
        return -1;
    }

    /* renamed from: c */
    public int mo9986c(Void voidR) {
        C3370k.m12227b(voidR, "element");
        return -1;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo9980a((Void) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        C3370k.m12227b(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public Void get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return mo9985b((Void) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C3294s.f7994f;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return mo9986c((Void) obj);
        }
        return -1;
    }

    public ListIterator listIterator() {
        return C3294s.f7994f;
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C3294s.f7994f;
        }
        throw new IndexOutOfBoundsException("Index: " + i);
    }

    public /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo9979a();
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
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
