package p054c.p083e.p104c.p106w.p107n;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p054c.p083e.p104c.C1271e;
import p054c.p083e.p104c.C1294t;
import p054c.p083e.p104c.C1296u;
import p054c.p083e.p104c.p106w.C1303b;
import p054c.p083e.p104c.p110x.C1417a;
import p054c.p083e.p104c.p111y.C1418a;
import p054c.p083e.p104c.p111y.C1420b;
import p054c.p083e.p104c.p111y.C1421c;

/* renamed from: c.e.c.w.n.a */
public final class C1346a<E> extends C1294t<Object> {

    /* renamed from: c */
    public static final C1296u f4220c = new C1347a();

    /* renamed from: a */
    private final Class<E> f4221a;

    /* renamed from: b */
    private final C1294t<E> f4222b;

    /* renamed from: c.e.c.w.n.a$a */
    static class C1347a implements C1296u {
        C1347a() {
        }

        /* renamed from: a */
        public <T> C1294t<T> mo5688a(C1271e eVar, C1417a<T> aVar) {
            Type b = aVar.mo5856b();
            if (!(b instanceof GenericArrayType) && (!(b instanceof Class) || !((Class) b).isArray())) {
                return null;
            }
            Type d = C1303b.m6220d(b);
            return new C1346a(eVar, eVar.mo5628a(C1417a.m6530a(d)), C1303b.m6221e(d));
        }
    }

    public C1346a(C1271e eVar, C1294t<E> tVar, Class<E> cls) {
        this.f4222b = new C1373m(eVar, tVar, cls);
        this.f4221a = cls;
    }

    /* renamed from: a */
    public Object mo5644a(C1418a aVar) {
        if (aVar.mo5789q() == C1420b.NULL) {
            aVar.mo5787o();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo5775a();
        while (aVar.mo5781g()) {
            arrayList.add(this.f4222b.mo5644a(aVar));
        }
        aVar.mo5778d();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f4221a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: a */
    public void mo5646a(C1421c cVar, Object obj) {
        if (obj == null) {
            cVar.mo5807h();
            return;
        }
        cVar.mo5795a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f4222b.mo5646a(cVar, Array.get(obj, i));
        }
        cVar.mo5801c();
    }
}
