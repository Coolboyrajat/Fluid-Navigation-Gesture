package kotlin.p195s;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.p205x.p207d.p208c0.C3362a;

/* renamed from: kotlin.s.s */
public final class C3294s implements ListIterator, C3362a {

    /* renamed from: f */
    public static final C3294s f7994f = new C3294s();

    private C3294s() {
    }

    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public Void next() {
        throw new NoSuchElementException();
    }

    public int nextIndex() {
        return 0;
    }

    public Void previous() {
        throw new NoSuchElementException();
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
