package p006b.p021d;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: b.d.a */
public class C0723a<K, V> extends C0736g<K, V> implements Map<K, V> {

    /* renamed from: m */
    C0730f<K, V> f2812m;

    /* renamed from: b.d.a$a */
    class C0724a extends C0730f<K, V> {
        C0724a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo4076a(Object obj) {
            return C0723a.this.mo4188a(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo4077a(int i, int i2) {
            return C0723a.this.f2861g[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public V mo4078a(int i, V v) {
            return C0723a.this.mo4190a(i, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4079a() {
            C0723a.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4080a(int i) {
            C0723a.this.mo4195c(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4081a(K k, V v) {
            C0723a.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo4082b(Object obj) {
            return C0723a.this.mo4193b(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<K, V> mo4083b() {
            return C0723a.this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo4084c() {
            return C0723a.this.f2862h;
        }
    }

    public C0723a() {
    }

    public C0723a(int i) {
        super(i);
    }

    public C0723a(C0736g gVar) {
        super(gVar);
    }

    /* renamed from: b */
    private C0730f<K, V> m3960b() {
        if (this.f2812m == null) {
            this.f2812m = new C0724a();
        }
        return this.f2812m;
    }

    /* renamed from: a */
    public boolean mo4071a(Collection<?> collection) {
        return C0730f.m4017c(this, collection);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m3960b().mo4128d();
    }

    public Set<K> keySet() {
        return m3960b().mo4129e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo4191a(this.f2862h + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return m3960b().mo4130f();
    }
}
