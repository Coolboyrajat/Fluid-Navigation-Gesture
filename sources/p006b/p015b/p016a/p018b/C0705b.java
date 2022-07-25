package p006b.p015b.p016a.p018b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: b.b.a.b.b */
public class C0705b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: f */
    C0708c<K, V> f2763f;

    /* renamed from: g */
    private C0708c<K, V> f2764g;

    /* renamed from: h */
    private WeakHashMap<C0711f<K, V>, Boolean> f2765h = new WeakHashMap<>();

    /* renamed from: i */
    private int f2766i = 0;

    /* renamed from: b.b.a.b.b$a */
    static class C0706a<K, V> extends C0710e<K, V> {
        C0706a(C0708c<K, V> cVar, C0708c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0708c<K, V> mo3978b(C0708c<K, V> cVar) {
            return cVar.f2770i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0708c<K, V> mo3979c(C0708c<K, V> cVar) {
            return cVar.f2769h;
        }
    }

    /* renamed from: b.b.a.b.b$b */
    private static class C0707b<K, V> extends C0710e<K, V> {
        C0707b(C0708c<K, V> cVar, C0708c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0708c<K, V> mo3978b(C0708c<K, V> cVar) {
            return cVar.f2769h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0708c<K, V> mo3979c(C0708c<K, V> cVar) {
            return cVar.f2770i;
        }
    }

    /* renamed from: b.b.a.b.b$c */
    static class C0708c<K, V> implements Map.Entry<K, V> {

        /* renamed from: f */
        final K f2767f;

        /* renamed from: g */
        final V f2768g;

        /* renamed from: h */
        C0708c<K, V> f2769h;

        /* renamed from: i */
        C0708c<K, V> f2770i;

        C0708c(K k, V v) {
            this.f2767f = k;
            this.f2768g = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0708c)) {
                return false;
            }
            C0708c cVar = (C0708c) obj;
            return this.f2767f.equals(cVar.f2767f) && this.f2768g.equals(cVar.f2768g);
        }

        public K getKey() {
            return this.f2767f;
        }

        public V getValue() {
            return this.f2768g;
        }

        public int hashCode() {
            return this.f2767f.hashCode() ^ this.f2768g.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f2767f + "=" + this.f2768g;
        }
    }

    /* renamed from: b.b.a.b.b$d */
    private class C0709d implements Iterator<Map.Entry<K, V>>, C0711f<K, V> {

        /* renamed from: f */
        private C0708c<K, V> f2771f;

        /* renamed from: g */
        private boolean f2772g = true;

        C0709d() {
        }

        /* renamed from: a */
        public void mo3986a(C0708c<K, V> cVar) {
            C0708c<K, V> cVar2 = this.f2771f;
            if (cVar == cVar2) {
                this.f2771f = cVar2.f2770i;
                this.f2772g = this.f2771f == null;
            }
        }

        public boolean hasNext() {
            if (this.f2772g) {
                return C0705b.this.f2763f != null;
            }
            C0708c<K, V> cVar = this.f2771f;
            return (cVar == null || cVar.f2769h == null) ? false : true;
        }

        public Map.Entry<K, V> next() {
            C0708c<K, V> cVar;
            if (this.f2772g) {
                this.f2772g = false;
                cVar = C0705b.this.f2763f;
            } else {
                C0708c<K, V> cVar2 = this.f2771f;
                cVar = cVar2 != null ? cVar2.f2769h : null;
            }
            this.f2771f = cVar;
            return this.f2771f;
        }
    }

    /* renamed from: b.b.a.b.b$e */
    private static abstract class C0710e<K, V> implements Iterator<Map.Entry<K, V>>, C0711f<K, V> {

        /* renamed from: f */
        C0708c<K, V> f2774f;

        /* renamed from: g */
        C0708c<K, V> f2775g;

        C0710e(C0708c<K, V> cVar, C0708c<K, V> cVar2) {
            this.f2774f = cVar2;
            this.f2775g = cVar;
        }

        /* renamed from: a */
        private C0708c<K, V> m3873a() {
            C0708c<K, V> cVar = this.f2775g;
            C0708c<K, V> cVar2 = this.f2774f;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo3979c(cVar);
        }

        /* renamed from: a */
        public void mo3986a(C0708c<K, V> cVar) {
            if (this.f2774f == cVar && cVar == this.f2775g) {
                this.f2775g = null;
                this.f2774f = null;
            }
            C0708c<K, V> cVar2 = this.f2774f;
            if (cVar2 == cVar) {
                this.f2774f = mo3978b(cVar2);
            }
            if (this.f2775g == cVar) {
                this.f2775g = m3873a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C0708c<K, V> mo3978b(C0708c<K, V> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C0708c<K, V> mo3979c(C0708c<K, V> cVar);

        public boolean hasNext() {
            return this.f2775g != null;
        }

        public Map.Entry<K, V> next() {
            C0708c<K, V> cVar = this.f2775g;
            this.f2775g = m3873a();
            return cVar;
        }
    }

    /* renamed from: b.b.a.b.b$f */
    interface C0711f<K, V> {
        /* renamed from: a */
        void mo3986a(C0708c<K, V> cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0708c<K, V> mo3963a(K k) {
        C0708c<K, V> cVar = this.f2763f;
        while (cVar != null && !cVar.f2767f.equals(k)) {
            cVar = cVar.f2769h;
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0708c<K, V> mo3968a(K k, V v) {
        C0708c<K, V> cVar = new C0708c<>(k, v);
        this.f2766i++;
        C0708c<K, V> cVar2 = this.f2764g;
        if (cVar2 == null) {
            this.f2763f = cVar;
            this.f2764g = this.f2763f;
            return cVar;
        }
        cVar2.f2769h = cVar;
        cVar.f2770i = cVar2;
        this.f2764g = cVar;
        return cVar;
    }

    /* renamed from: a */
    public Iterator<Map.Entry<K, V>> mo3969a() {
        C0707b bVar = new C0707b(this.f2764g, this.f2763f);
        this.f2765h.put(bVar, false);
        return bVar;
    }

    /* renamed from: b */
    public V mo3964b(K k, V v) {
        C0708c a = mo3963a(k);
        if (a != null) {
            return a.f2768g;
        }
        mo3968a(k, v);
        return null;
    }

    /* renamed from: b */
    public Map.Entry<K, V> mo3970b() {
        return this.f2763f;
    }

    /* renamed from: c */
    public C0705b<K, V>.d mo3971c() {
        C0705b<K, V>.d dVar = new C0709d();
        this.f2765h.put(dVar, false);
        return dVar;
    }

    /* renamed from: d */
    public Map.Entry<K, V> mo3972d() {
        return this.f2764g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0705b)) {
            return false;
        }
        C0705b bVar = (C0705b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C0706a aVar = new C0706a(this.f2763f, this.f2764g);
        this.f2765h.put(aVar, false);
        return aVar;
    }

    public V remove(K k) {
        C0708c a = mo3963a(k);
        if (a == null) {
            return null;
        }
        this.f2766i--;
        if (!this.f2765h.isEmpty()) {
            for (C0711f<K, V> a2 : this.f2765h.keySet()) {
                a2.mo3986a(a);
            }
        }
        C0708c<K, V> cVar = a.f2770i;
        if (cVar != null) {
            cVar.f2769h = a.f2769h;
        } else {
            this.f2763f = a.f2769h;
        }
        C0708c<K, V> cVar2 = a.f2769h;
        if (cVar2 != null) {
            cVar2.f2770i = a.f2770i;
        } else {
            this.f2764g = a.f2770i;
        }
        a.f2769h = null;
        a.f2770i = null;
        return a.f2768g;
    }

    public int size() {
        return this.f2766i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
