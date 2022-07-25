package p006b.p021d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: b.d.f */
abstract class C0730f<K, V> {

    /* renamed from: a */
    C0730f<K, V>.b f2841a;

    /* renamed from: b */
    C0730f<K, V>.c f2842b;

    /* renamed from: c */
    C0730f<K, V>.e f2843c;

    /* renamed from: b.d.f$a */
    final class C0731a<T> implements Iterator<T> {

        /* renamed from: f */
        final int f2844f;

        /* renamed from: g */
        int f2845g;

        /* renamed from: h */
        int f2846h;

        /* renamed from: i */
        boolean f2847i = false;

        C0731a(int i) {
            this.f2844f = i;
            this.f2845g = C0730f.this.mo4084c();
        }

        public boolean hasNext() {
            return this.f2846h < this.f2845g;
        }

        public T next() {
            if (hasNext()) {
                T a = C0730f.this.mo4077a(this.f2846h, this.f2844f);
                this.f2846h++;
                this.f2847i = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f2847i) {
                this.f2846h--;
                this.f2845g--;
                this.f2847i = false;
                C0730f.this.mo4080a(this.f2846h);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: b.d.f$b */
    final class C0732b implements Set<Map.Entry<K, V>> {
        C0732b() {
        }

        /* renamed from: a */
        public boolean mo4134a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            mo4134a((Map.Entry) obj);
            throw null;
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int c = C0730f.this.mo4084c();
            for (Map.Entry entry : collection) {
                C0730f.this.mo4081a(entry.getKey(), entry.getValue());
            }
            return c != C0730f.this.mo4084c();
        }

        public void clear() {
            C0730f.this.mo4079a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a = C0730f.this.mo4076a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C0727c.m3991a(C0730f.this.mo4077a(a, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C0730f.m4015a(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int c = C0730f.this.mo4084c() - 1; c >= 0; c--) {
                Object a = C0730f.this.mo4077a(c, 0);
                Object a2 = C0730f.this.mo4077a(c, 1);
                i += (a == null ? 0 : a.hashCode()) ^ (a2 == null ? 0 : a2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return C0730f.this.mo4084c() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0734d();
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

        public int size() {
            return C0730f.this.mo4084c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b.d.f$c */
    final class C0733c implements Set<K> {
        C0733c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0730f.this.mo4079a();
        }

        public boolean contains(Object obj) {
            return C0730f.this.mo4076a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C0730f.m4014a(C0730f.this.mo4083b(), collection);
        }

        public boolean equals(Object obj) {
            return C0730f.m4015a(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int c = C0730f.this.mo4084c() - 1; c >= 0; c--) {
                Object a = C0730f.this.mo4077a(c, 0);
                i += a == null ? 0 : a.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C0730f.this.mo4084c() == 0;
        }

        public Iterator<K> iterator() {
            return new C0731a(0);
        }

        public boolean remove(Object obj) {
            int a = C0730f.this.mo4076a(obj);
            if (a < 0) {
                return false;
            }
            C0730f.this.mo4080a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C0730f.m4016b(C0730f.this.mo4083b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C0730f.m4017c(C0730f.this.mo4083b(), collection);
        }

        public int size() {
            return C0730f.this.mo4084c();
        }

        public Object[] toArray() {
            return C0730f.this.mo4127b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0730f.this.mo4126a(tArr, 0);
        }
    }

    /* renamed from: b.d.f$d */
    final class C0734d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: f */
        int f2851f;

        /* renamed from: g */
        int f2852g;

        /* renamed from: h */
        boolean f2853h = false;

        C0734d() {
            this.f2851f = C0730f.this.mo4084c() - 1;
            this.f2852g = -1;
        }

        public boolean equals(Object obj) {
            if (!this.f2853h) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return C0727c.m3991a(entry.getKey(), C0730f.this.mo4077a(this.f2852g, 0)) && C0727c.m3991a(entry.getValue(), C0730f.this.mo4077a(this.f2852g, 1));
            }
        }

        public K getKey() {
            if (this.f2853h) {
                return C0730f.this.mo4077a(this.f2852g, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f2853h) {
                return C0730f.this.mo4077a(this.f2852g, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f2852g < this.f2851f;
        }

        public int hashCode() {
            if (this.f2853h) {
                int i = 0;
                Object a = C0730f.this.mo4077a(this.f2852g, 0);
                Object a2 = C0730f.this.mo4077a(this.f2852g, 1);
                int hashCode = a == null ? 0 : a.hashCode();
                if (a2 != null) {
                    i = a2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f2852g++;
                this.f2853h = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f2853h) {
                C0730f.this.mo4080a(this.f2852g);
                this.f2852g--;
                this.f2851f--;
                this.f2853h = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f2853h) {
                return C0730f.this.mo4078a(this.f2852g, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: b.d.f$e */
    final class C0735e implements Collection<V> {
        C0735e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0730f.this.mo4079a();
        }

        public boolean contains(Object obj) {
            return C0730f.this.mo4082b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C0730f.this.mo4084c() == 0;
        }

        public Iterator<V> iterator() {
            return new C0731a(1);
        }

        public boolean remove(Object obj) {
            int b = C0730f.this.mo4082b(obj);
            if (b < 0) {
                return false;
            }
            C0730f.this.mo4080a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int c = C0730f.this.mo4084c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (collection.contains(C0730f.this.mo4077a(i, 1))) {
                    C0730f.this.mo4080a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int c = C0730f.this.mo4084c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (!collection.contains(C0730f.this.mo4077a(i, 1))) {
                    C0730f.this.mo4080a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C0730f.this.mo4084c();
        }

        public Object[] toArray() {
            return C0730f.this.mo4127b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0730f.this.mo4126a(tArr, 1);
        }
    }

    C0730f() {
    }

    /* renamed from: a */
    public static <K, V> boolean m4014a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static <T> boolean m4015a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> boolean m4016b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m4017c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo4076a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo4077a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo4078a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4079a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4080a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4081a(K k, V v);

    /* renamed from: a */
    public <T> T[] mo4126a(T[] tArr, int i) {
        int c = mo4084c();
        if (tArr.length < c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), c);
        }
        for (int i2 = 0; i2 < c; i2++) {
            tArr[i2] = mo4077a(i2, i);
        }
        if (tArr.length > c) {
            tArr[c] = null;
        }
        return tArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo4082b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo4083b();

    /* renamed from: b */
    public Object[] mo4127b(int i) {
        int c = mo4084c();
        Object[] objArr = new Object[c];
        for (int i2 = 0; i2 < c; i2++) {
            objArr[i2] = mo4077a(i2, i);
        }
        return objArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo4084c();

    /* renamed from: d */
    public Set<Map.Entry<K, V>> mo4128d() {
        if (this.f2841a == null) {
            this.f2841a = new C0732b();
        }
        return this.f2841a;
    }

    /* renamed from: e */
    public Set<K> mo4129e() {
        if (this.f2842b == null) {
            this.f2842b = new C0733c();
        }
        return this.f2842b;
    }

    /* renamed from: f */
    public Collection<V> mo4130f() {
        if (this.f2843c == null) {
            this.f2843c = new C0735e();
        }
        return this.f2843c;
    }
}
