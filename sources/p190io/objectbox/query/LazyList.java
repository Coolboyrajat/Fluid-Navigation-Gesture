package p190io.objectbox.query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p190io.objectbox.Box;
import p190io.objectbox.exception.DbException;

/* renamed from: io.objectbox.query.LazyList */
public class LazyList<E> implements List<E> {
    private final Box<E> box;
    private final List<E> entities;
    private volatile int loadedCount;
    private final long[] objectIds;
    final int size;

    /* renamed from: io.objectbox.query.LazyList$LazyIterator */
    protected class LazyIterator implements ListIterator<E> {
        private int index;

        public LazyIterator(int i) {
            this.index = i;
        }

        public void add(E e) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.index < LazyList.this.size;
        }

        public boolean hasPrevious() {
            return this.index > 0;
        }

        public E next() {
            int i = this.index;
            LazyList lazyList = LazyList.this;
            if (i < lazyList.size) {
                E e = lazyList.get(i);
                this.index++;
                return e;
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.index;
        }

        public E previous() {
            int i = this.index;
            if (i > 0) {
                this.index = i - 1;
                return LazyList.this.get(this.index);
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.index - 1;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public void set(E e) {
            throw new UnsupportedOperationException();
        }
    }

    LazyList(Box<E> box2, long[] jArr, boolean z) {
        if (box2 == null || jArr == null) {
            throw new NullPointerException("Illegal null parameters passed");
        }
        this.box = box2;
        this.objectIds = jArr;
        this.size = jArr.length;
        if (z) {
            this.entities = new ArrayList(this.size);
            for (int i = 0; i < this.size; i++) {
                this.entities.add((Object) null);
            }
            return;
        }
        this.entities = null;
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    public void checkCached() {
        if (this.entities == null) {
            throw new DbException("This operation only works with cached lazy lists");
        }
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        loadRemaining();
        return this.entities.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        loadRemaining();
        return this.entities.containsAll(collection);
    }

    public E get(int i) {
        E e;
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException("Illegal cursor location " + i);
        }
        List<E> list = this.entities;
        if (list != null) {
            E e2 = list.get(i);
            if (e2 == null) {
                e2 = this.box.get(this.objectIds[i]);
                synchronized (this) {
                    E e3 = this.entities.get(i);
                    if (e3 == null) {
                        this.entities.set(i, e2);
                        this.loadedCount++;
                    } else {
                        e2 = e3;
                    }
                }
            }
            return e2;
        }
        synchronized (this) {
            e = this.box.get(this.objectIds[i]);
        }
        return e;
    }

    public int getLoadedCount() {
        return this.loadedCount;
    }

    public int indexOf(Object obj) {
        loadRemaining();
        return this.entities.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isLoadedCompletely() {
        return this.loadedCount == this.size;
    }

    public Iterator<E> iterator() {
        return new LazyIterator(0);
    }

    public int lastIndexOf(Object obj) {
        loadRemaining();
        return this.entities.lastIndexOf(obj);
    }

    public ListIterator<E> listIterator() {
        return new LazyIterator(0);
    }

    public ListIterator<E> listIterator(int i) {
        return new LazyIterator(i);
    }

    public void loadRemaining() {
        if (this.loadedCount != this.size) {
            checkCached();
            this.box.getStore().runInReadTx(new Runnable() {
                public void run() {
                    int i = 0;
                    while (true) {
                        LazyList lazyList = LazyList.this;
                        if (i < lazyList.size) {
                            lazyList.get(i);
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            });
        }
    }

    public E peek(int i) {
        List<E> list = this.entities;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    public E remove(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.size;
    }

    public List<E> subList(int i, int i2) {
        checkCached();
        for (int i3 = i; i3 < i2; i3++) {
            get(i3);
        }
        return this.entities.subList(i, i2);
    }

    public Object[] toArray() {
        loadRemaining();
        return this.entities.toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        loadRemaining();
        return this.entities.toArray(tArr);
    }
}
