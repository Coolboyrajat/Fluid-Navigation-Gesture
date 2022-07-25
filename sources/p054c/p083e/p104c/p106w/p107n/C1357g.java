package p054c.p083e.p104c.p106w.p107n;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import p054c.p083e.p104c.C1271e;
import p054c.p083e.p104c.C1282j;
import p054c.p083e.p104c.C1287o;
import p054c.p083e.p104c.C1290r;
import p054c.p083e.p104c.C1294t;
import p054c.p083e.p104c.C1296u;
import p054c.p083e.p104c.p106w.C1303b;
import p054c.p083e.p104c.p106w.C1307c;
import p054c.p083e.p104c.p106w.C1325f;
import p054c.p083e.p104c.p106w.C1335i;
import p054c.p083e.p104c.p106w.C1338l;
import p054c.p083e.p104c.p110x.C1417a;
import p054c.p083e.p104c.p111y.C1418a;
import p054c.p083e.p104c.p111y.C1420b;
import p054c.p083e.p104c.p111y.C1421c;

/* renamed from: c.e.c.w.n.g */
public final class C1357g implements C1296u {

    /* renamed from: f */
    private final C1307c f4239f;

    /* renamed from: g */
    final boolean f4240g;

    /* renamed from: c.e.c.w.n.g$a */
    private final class C1358a<K, V> extends C1294t<Map<K, V>> {

        /* renamed from: a */
        private final C1294t<K> f4241a;

        /* renamed from: b */
        private final C1294t<V> f4242b;

        /* renamed from: c */
        private final C1335i<? extends Map<K, V>> f4243c;

        public C1358a(C1271e eVar, Type type, C1294t<K> tVar, Type type2, C1294t<V> tVar2, C1335i<? extends Map<K, V>> iVar) {
            this.f4241a = new C1373m(eVar, tVar, type);
            this.f4242b = new C1373m(eVar, tVar2, type2);
            this.f4243c = iVar;
        }

        /* renamed from: a */
        private String m6348a(C1282j jVar) {
            if (jVar.mo5664g()) {
                C1287o c = jVar.mo5660c();
                if (c.mo5683p()) {
                    return String.valueOf(c.mo5680m());
                }
                if (c.mo5682o()) {
                    return Boolean.toString(c.mo5674h());
                }
                if (c.mo5684q()) {
                    return c.mo5681n();
                }
                throw new AssertionError();
            } else if (jVar.mo5662e()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        public Map<K, V> m6350a(C1418a aVar) {
            C1420b q = aVar.mo5789q();
            if (q == C1420b.NULL) {
                aVar.mo5787o();
                return null;
            }
            Map<K, V> map = (Map) this.f4243c.mo5714a();
            if (q == C1420b.BEGIN_ARRAY) {
                aVar.mo5775a();
                while (aVar.mo5781g()) {
                    aVar.mo5775a();
                    K a = this.f4241a.mo5644a(aVar);
                    if (map.put(a, this.f4242b.mo5644a(aVar)) == null) {
                        aVar.mo5778d();
                    } else {
                        throw new C1290r("duplicate key: " + a);
                    }
                }
                aVar.mo5778d();
            } else {
                aVar.mo5776b();
                while (aVar.mo5781g()) {
                    C1325f.f4187a.mo5718a(aVar);
                    K a2 = this.f4241a.mo5644a(aVar);
                    if (map.put(a2, this.f4242b.mo5644a(aVar)) != null) {
                        throw new C1290r("duplicate key: " + a2);
                    }
                }
                aVar.mo5779e();
            }
            return map;
        }

        /* renamed from: a */
        public void mo5646a(C1421c cVar, Map<K, V> map) {
            if (map == null) {
                cVar.mo5807h();
            } else if (!C1357g.this.f4240g) {
                cVar.mo5800b();
                for (Map.Entry next : map.entrySet()) {
                    cVar.mo5799a(String.valueOf(next.getKey()));
                    this.f4242b.mo5646a(cVar, next.getValue());
                }
                cVar.mo5804d();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry next2 : map.entrySet()) {
                    C1282j a = this.f4241a.mo5686a(next2.getKey());
                    arrayList.add(a);
                    arrayList2.add(next2.getValue());
                    z |= a.mo5661d() || a.mo5663f();
                }
                if (z) {
                    cVar.mo5795a();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.mo5795a();
                        C1338l.m6287a((C1282j) arrayList.get(i), cVar);
                        this.f4242b.mo5646a(cVar, arrayList2.get(i));
                        cVar.mo5801c();
                        i++;
                    }
                    cVar.mo5801c();
                    return;
                }
                cVar.mo5800b();
                int size2 = arrayList.size();
                while (i < size2) {
                    cVar.mo5799a(m6348a((C1282j) arrayList.get(i)));
                    this.f4242b.mo5646a(cVar, arrayList2.get(i));
                    i++;
                }
                cVar.mo5804d();
            }
        }
    }

    public C1357g(C1307c cVar, boolean z) {
        this.f4239f = cVar;
        this.f4240g = z;
    }

    /* renamed from: a */
    private C1294t<?> m6346a(C1271e eVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? C1374n.f4309f : eVar.mo5628a(C1417a.m6530a(type));
    }

    /* renamed from: a */
    public <T> C1294t<T> mo5688a(C1271e eVar, C1417a<T> aVar) {
        Type b = aVar.mo5856b();
        if (!Map.class.isAssignableFrom(aVar.mo5855a())) {
            return null;
        }
        Type[] b2 = C1303b.m6218b(b, C1303b.m6221e(b));
        return new C1358a(eVar, b2[0], m6346a(eVar, b2[0]), b2[1], eVar.mo5628a(C1417a.m6530a(b2[1])), this.f4239f.mo5712a(aVar));
    }
}
