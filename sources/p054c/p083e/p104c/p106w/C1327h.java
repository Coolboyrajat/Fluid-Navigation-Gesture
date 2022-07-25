package p054c.p083e.p104c.p106w;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: c.e.c.w.h */
public final class C1327h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: m */
    private static final Comparator<Comparable> f4189m = new C1328a();

    /* renamed from: f */
    Comparator<? super K> f4190f;

    /* renamed from: g */
    C1334e<K, V> f4191g;

    /* renamed from: h */
    int f4192h;

    /* renamed from: i */
    int f4193i;

    /* renamed from: j */
    final C1334e<K, V> f4194j;

    /* renamed from: k */
    private C1327h<K, V>.b f4195k;

    /* renamed from: l */
    private C1327h<K, V>.c f4196l;

    /* renamed from: c.e.c.w.h$a */
    static class C1328a implements Comparator<Comparable> {
        C1328a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: c.e.c.w.h$b */
    class C1329b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: c.e.c.w.h$b$a */
        class C1330a extends C1327h<K, V>.d<Map.Entry<K, V>> {
            C1330a(C1329b bVar) {
                super();
            }

            public Map.Entry<K, V> next() {
                return mo5753a();
            }
        }

        C1329b() {
        }

        public void clear() {
            C1327h.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C1327h.this.mo5728a((Map.Entry<?, ?>) (Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C1330a(this);
        }

        public boolean remove(Object obj) {
            C1334e a;
            if (!(obj instanceof Map.Entry) || (a = C1327h.this.mo5728a((Map.Entry<?, ?>) (Map.Entry) obj)) == null) {
                return false;
            }
            C1327h.this.mo5729a(a, true);
            return true;
        }

        public int size() {
            return C1327h.this.f4192h;
        }
    }

    /* renamed from: c.e.c.w.h$c */
    final class C1331c extends AbstractSet<K> {

        /* renamed from: c.e.c.w.h$c$a */
        class C1332a extends C1327h<K, V>.d<K> {
            C1332a(C1331c cVar) {
                super();
            }

            public K next() {
                return mo5753a().f4208k;
            }
        }

        C1331c() {
        }

        public void clear() {
            C1327h.this.clear();
        }

        public boolean contains(Object obj) {
            return C1327h.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C1332a(this);
        }

        public boolean remove(Object obj) {
            return C1327h.this.mo5730b(obj) != null;
        }

        public int size() {
            return C1327h.this.f4192h;
        }
    }

    /* renamed from: c.e.c.w.h$d */
    private abstract class C1333d<T> implements Iterator<T> {

        /* renamed from: f */
        C1334e<K, V> f4199f;

        /* renamed from: g */
        C1334e<K, V> f4200g = null;

        /* renamed from: h */
        int f4201h;

        C1333d() {
            C1327h hVar = C1327h.this;
            this.f4199f = hVar.f4194j.f4206i;
            this.f4201h = hVar.f4193i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C1334e<K, V> mo5753a() {
            C1334e<K, V> eVar = this.f4199f;
            C1327h hVar = C1327h.this;
            if (eVar == hVar.f4194j) {
                throw new NoSuchElementException();
            } else if (hVar.f4193i == this.f4201h) {
                this.f4199f = eVar.f4206i;
                this.f4200g = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f4199f != C1327h.this.f4194j;
        }

        public final void remove() {
            C1334e<K, V> eVar = this.f4200g;
            if (eVar != null) {
                C1327h.this.mo5729a(eVar, true);
                this.f4200g = null;
                this.f4201h = C1327h.this.f4193i;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: c.e.c.w.h$e */
    static final class C1334e<K, V> implements Map.Entry<K, V> {

        /* renamed from: f */
        C1334e<K, V> f4203f;

        /* renamed from: g */
        C1334e<K, V> f4204g;

        /* renamed from: h */
        C1334e<K, V> f4205h;

        /* renamed from: i */
        C1334e<K, V> f4206i;

        /* renamed from: j */
        C1334e<K, V> f4207j;

        /* renamed from: k */
        final K f4208k;

        /* renamed from: l */
        V f4209l;

        /* renamed from: m */
        int f4210m;

        C1334e() {
            this.f4208k = null;
            this.f4207j = this;
            this.f4206i = this;
        }

        C1334e(C1334e<K, V> eVar, K k, C1334e<K, V> eVar2, C1334e<K, V> eVar3) {
            this.f4203f = eVar;
            this.f4208k = k;
            this.f4210m = 1;
            this.f4206i = eVar2;
            this.f4207j = eVar3;
            eVar3.f4206i = this;
            eVar2.f4207j = this;
        }

        /* renamed from: a */
        public C1334e<K, V> mo5756a() {
            C1334e<K, V> eVar = this;
            for (C1334e<K, V> eVar2 = this.f4204g; eVar2 != null; eVar2 = eVar2.f4204g) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public C1334e<K, V> mo5757b() {
            C1334e<K, V> eVar = this;
            for (C1334e<K, V> eVar2 = this.f4205h; eVar2 != null; eVar2 = eVar2.f4205h) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f4208k
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f4209l
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p054c.p083e.p104c.p106w.C1327h.C1334e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f4208k;
        }

        public V getValue() {
            return this.f4209l;
        }

        public int hashCode() {
            K k = this.f4208k;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f4209l;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f4209l;
            this.f4209l = v;
            return v2;
        }

        public String toString() {
            return this.f4208k + "=" + this.f4209l;
        }
    }

    static {
        Class<C1327h> cls = C1327h.class;
    }

    public C1327h() {
        this(f4189m);
    }

    public C1327h(Comparator<? super K> comparator) {
        this.f4192h = 0;
        this.f4193i = 0;
        this.f4194j = new C1334e<>();
        this.f4190f = comparator == null ? f4189m : comparator;
    }

    /* renamed from: a */
    private void m6264a(C1334e<K, V> eVar) {
        C1334e<K, V> eVar2 = eVar.f4204g;
        C1334e<K, V> eVar3 = eVar.f4205h;
        C1334e<K, V> eVar4 = eVar3.f4204g;
        C1334e<K, V> eVar5 = eVar3.f4205h;
        eVar.f4205h = eVar4;
        if (eVar4 != null) {
            eVar4.f4203f = eVar;
        }
        m6265a(eVar, eVar3);
        eVar3.f4204g = eVar;
        eVar.f4203f = eVar3;
        int i = 0;
        eVar.f4210m = Math.max(eVar2 != null ? eVar2.f4210m : 0, eVar4 != null ? eVar4.f4210m : 0) + 1;
        int i2 = eVar.f4210m;
        if (eVar5 != null) {
            i = eVar5.f4210m;
        }
        eVar3.f4210m = Math.max(i2, i) + 1;
    }

    /* renamed from: a */
    private void m6265a(C1334e<K, V> eVar, C1334e<K, V> eVar2) {
        C1334e<K, V> eVar3 = eVar.f4203f;
        eVar.f4203f = null;
        if (eVar2 != null) {
            eVar2.f4203f = eVar3;
        }
        if (eVar3 == null) {
            this.f4191g = eVar2;
        } else if (eVar3.f4204g == eVar) {
            eVar3.f4204g = eVar2;
        } else {
            eVar3.f4205h = eVar2;
        }
    }

    /* renamed from: a */
    private boolean m6266a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    private void m6267b(C1334e<K, V> eVar) {
        C1334e<K, V> eVar2 = eVar.f4204g;
        C1334e<K, V> eVar3 = eVar.f4205h;
        C1334e<K, V> eVar4 = eVar2.f4204g;
        C1334e<K, V> eVar5 = eVar2.f4205h;
        eVar.f4204g = eVar5;
        if (eVar5 != null) {
            eVar5.f4203f = eVar;
        }
        m6265a(eVar, eVar2);
        eVar2.f4205h = eVar;
        eVar.f4203f = eVar2;
        int i = 0;
        eVar.f4210m = Math.max(eVar3 != null ? eVar3.f4210m : 0, eVar5 != null ? eVar5.f4210m : 0) + 1;
        int i2 = eVar.f4210m;
        if (eVar4 != null) {
            i = eVar4.f4210m;
        }
        eVar2.f4210m = Math.max(i2, i) + 1;
    }

    /* renamed from: b */
    private void m6268b(C1334e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C1334e<K, V> eVar2 = eVar.f4204g;
            C1334e<K, V> eVar3 = eVar.f4205h;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f4210m : 0;
            int i3 = eVar3 != null ? eVar3.f4210m : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C1334e<K, V> eVar4 = eVar3.f4204g;
                C1334e<K, V> eVar5 = eVar3.f4205h;
                int i5 = eVar5 != null ? eVar5.f4210m : 0;
                if (eVar4 != null) {
                    i = eVar4.f4210m;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    m6267b(eVar3);
                }
                m6264a(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C1334e<K, V> eVar6 = eVar2.f4204g;
                C1334e<K, V> eVar7 = eVar2.f4205h;
                int i7 = eVar7 != null ? eVar7.f4210m : 0;
                if (eVar6 != null) {
                    i = eVar6.f4210m;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    m6264a(eVar2);
                }
                m6267b(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f4210m = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f4210m = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f4203f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1334e<K, V> mo5726a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo5727a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1334e<K, V> mo5727a(K k, boolean z) {
        int i;
        C1334e<K, V> eVar;
        Comparator<? super K> comparator = this.f4190f;
        C1334e<K, V> eVar2 = this.f4191g;
        if (eVar2 != null) {
            Comparable comparable = comparator == f4189m ? (Comparable) k : null;
            while (true) {
                K k2 = eVar2.f4208k;
                i = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (i == 0) {
                    return eVar2;
                }
                C1334e<K, V> eVar3 = i < 0 ? eVar2.f4204g : eVar2.f4205h;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C1334e<K, V> eVar4 = this.f4194j;
        if (eVar2 != null) {
            eVar = new C1334e<>(eVar2, k, eVar4, eVar4.f4207j);
            if (i < 0) {
                eVar2.f4204g = eVar;
            } else {
                eVar2.f4205h = eVar;
            }
            m6268b(eVar2, true);
        } else if (comparator != f4189m || (k instanceof Comparable)) {
            eVar = new C1334e<>(eVar2, k, eVar4, eVar4.f4207j);
            this.f4191g = eVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        this.f4192h++;
        this.f4193i++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1334e<K, V> mo5728a(Map.Entry<?, ?> entry) {
        C1334e<K, V> a = mo5726a((Object) entry.getKey());
        if (a != null && m6266a((Object) a.f4209l, (Object) entry.getValue())) {
            return a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5729a(C1334e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            C1334e<K, V> eVar2 = eVar.f4207j;
            eVar2.f4206i = eVar.f4206i;
            eVar.f4206i.f4207j = eVar2;
        }
        C1334e<K, V> eVar3 = eVar.f4204g;
        C1334e<K, V> eVar4 = eVar.f4205h;
        C1334e<K, V> eVar5 = eVar.f4203f;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m6265a(eVar, eVar3);
                eVar.f4204g = null;
            } else if (eVar4 != null) {
                m6265a(eVar, eVar4);
                eVar.f4205h = null;
            } else {
                m6265a(eVar, (C1334e<K, V>) null);
            }
            m6268b(eVar5, false);
            this.f4192h--;
            this.f4193i++;
            return;
        }
        C1334e<K, V> b = eVar3.f4210m > eVar4.f4210m ? eVar3.mo5757b() : eVar4.mo5756a();
        mo5729a(b, false);
        C1334e<K, V> eVar6 = eVar.f4204g;
        if (eVar6 != null) {
            i = eVar6.f4210m;
            b.f4204g = eVar6;
            eVar6.f4203f = b;
            eVar.f4204g = null;
        } else {
            i = 0;
        }
        C1334e<K, V> eVar7 = eVar.f4205h;
        if (eVar7 != null) {
            i2 = eVar7.f4210m;
            b.f4205h = eVar7;
            eVar7.f4203f = b;
            eVar.f4205h = null;
        }
        b.f4210m = Math.max(i, i2) + 1;
        m6265a(eVar, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1334e<K, V> mo5730b(Object obj) {
        C1334e<K, V> a = mo5726a(obj);
        if (a != null) {
            mo5729a(a, true);
        }
        return a;
    }

    public void clear() {
        this.f4191g = null;
        this.f4192h = 0;
        this.f4193i++;
        C1334e<K, V> eVar = this.f4194j;
        eVar.f4207j = eVar;
        eVar.f4206i = eVar;
    }

    public boolean containsKey(Object obj) {
        return mo5726a(obj) != null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C1327h<K, V>.b bVar = this.f4195k;
        if (bVar != null) {
            return bVar;
        }
        C1327h<K, V>.b bVar2 = new C1329b();
        this.f4195k = bVar2;
        return bVar2;
    }

    public V get(Object obj) {
        C1334e a = mo5726a(obj);
        if (a != null) {
            return a.f4209l;
        }
        return null;
    }

    public Set<K> keySet() {
        C1327h<K, V>.c cVar = this.f4196l;
        if (cVar != null) {
            return cVar;
        }
        C1327h<K, V>.c cVar2 = new C1331c();
        this.f4196l = cVar2;
        return cVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C1334e a = mo5727a(k, true);
            V v2 = a.f4209l;
            a.f4209l = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C1334e b = mo5730b(obj);
        if (b != null) {
            return b.f4209l;
        }
        return null;
    }

    public int size() {
        return this.f4192h;
    }
}
