package p179e.p180a.p181a.p182a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: e.a.a.a.a */
public abstract class C2976a<K, V, C extends Collection<V>> implements Map<K, C> {

    /* renamed from: f */
    protected Map<K, C> f7731f;

    protected C2976a(Map<K, C> map) {
        this.f7731f = map;
    }

    /* renamed from: a */
    public synchronized int mo9081a(K k, V v) {
        Collection collection;
        collection = (Collection) this.f7731f.get(k);
        if (collection == null) {
            collection = mo9082a();
            this.f7731f.put(k, collection);
        }
        collection.add(v);
        return collection.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C mo9082a();

    /* renamed from: a */
    public synchronized C put(K k, C c) {
        return (Collection) this.f7731f.put(k, c);
    }

    public synchronized void clear() {
        this.f7731f.clear();
    }

    public synchronized boolean containsKey(Object obj) {
        return this.f7731f.containsKey(obj);
    }

    public synchronized boolean containsValue(Object obj) {
        return this.f7731f.containsValue(obj);
    }

    public synchronized Set<Map.Entry<K, C>> entrySet() {
        return this.f7731f.entrySet();
    }

    public synchronized boolean equals(Object obj) {
        return this.f7731f.equals(obj);
    }

    public synchronized C get(Object obj) {
        return (Collection) this.f7731f.get(obj);
    }

    public synchronized int hashCode() {
        return this.f7731f.hashCode();
    }

    public synchronized boolean isEmpty() {
        return this.f7731f.isEmpty();
    }

    public synchronized Set<K> keySet() {
        return this.f7731f.keySet();
    }

    public void putAll(Map<? extends K, ? extends C> map) {
        this.f7731f.putAll(map);
    }

    public synchronized C remove(Object obj) {
        return (Collection) this.f7731f.remove(obj);
    }

    public synchronized int size() {
        return this.f7731f.size();
    }

    public synchronized Collection<C> values() {
        return this.f7731f.values();
    }
}
