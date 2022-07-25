package p006b.p015b.p016a.p018b;

import java.util.HashMap;
import java.util.Map;
import p006b.p015b.p016a.p018b.C0705b;

/* renamed from: b.b.a.b.a */
public class C0704a<K, V> extends C0705b<K, V> {

    /* renamed from: j */
    private HashMap<K, C0705b.C0708c<K, V>> f2762j = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0705b.C0708c<K, V> mo3963a(K k) {
        return this.f2762j.get(k);
    }

    /* renamed from: b */
    public V mo3964b(K k, V v) {
        C0705b.C0708c a = mo3963a(k);
        if (a != null) {
            return a.f2768g;
        }
        this.f2762j.put(k, mo3968a(k, v));
        return null;
    }

    /* renamed from: b */
    public Map.Entry<K, V> mo3965b(K k) {
        if (contains(k)) {
            return this.f2762j.get(k).f2770i;
        }
        return null;
    }

    public boolean contains(K k) {
        return this.f2762j.containsKey(k);
    }

    public V remove(K k) {
        V remove = super.remove(k);
        this.f2762j.remove(k);
        return remove;
    }
}
