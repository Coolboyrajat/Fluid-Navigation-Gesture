package p054c.p083e.p104c.p106w.p107n;

import java.lang.reflect.Type;
import java.util.Collection;
import p054c.p083e.p104c.C1271e;
import p054c.p083e.p104c.C1294t;
import p054c.p083e.p104c.C1296u;
import p054c.p083e.p104c.p106w.C1303b;
import p054c.p083e.p104c.p106w.C1307c;
import p054c.p083e.p104c.p106w.C1335i;
import p054c.p083e.p104c.p110x.C1417a;
import p054c.p083e.p104c.p111y.C1418a;
import p054c.p083e.p104c.p111y.C1420b;
import p054c.p083e.p104c.p111y.C1421c;

/* renamed from: c.e.c.w.n.b */
public final class C1348b implements C1296u {

    /* renamed from: f */
    private final C1307c f4223f;

    /* renamed from: c.e.c.w.n.b$a */
    private static final class C1349a<E> extends C1294t<Collection<E>> {

        /* renamed from: a */
        private final C1294t<E> f4224a;

        /* renamed from: b */
        private final C1335i<? extends Collection<E>> f4225b;

        public C1349a(C1271e eVar, Type type, C1294t<E> tVar, C1335i<? extends Collection<E>> iVar) {
            this.f4224a = new C1373m(eVar, tVar, type);
            this.f4225b = iVar;
        }

        /* renamed from: a */
        public Collection<E> m6300a(C1418a aVar) {
            if (aVar.mo5789q() == C1420b.NULL) {
                aVar.mo5787o();
                return null;
            }
            Collection<E> collection = (Collection) this.f4225b.mo5714a();
            aVar.mo5775a();
            while (aVar.mo5781g()) {
                collection.add(this.f4224a.mo5644a(aVar));
            }
            aVar.mo5778d();
            return collection;
        }

        /* renamed from: a */
        public void mo5646a(C1421c cVar, Collection<E> collection) {
            if (collection == null) {
                cVar.mo5807h();
                return;
            }
            cVar.mo5795a();
            for (E a : collection) {
                this.f4224a.mo5646a(cVar, a);
            }
            cVar.mo5801c();
        }
    }

    public C1348b(C1307c cVar) {
        this.f4223f = cVar;
    }

    /* renamed from: a */
    public <T> C1294t<T> mo5688a(C1271e eVar, C1417a<T> aVar) {
        Type b = aVar.mo5856b();
        Class<? super T> a = aVar.mo5855a();
        if (!Collection.class.isAssignableFrom(a)) {
            return null;
        }
        Type a2 = C1303b.m6209a(b, (Class<?>) a);
        return new C1349a(eVar, a2, eVar.mo5628a(C1417a.m6530a(a2)), this.f4223f.mo5712a(aVar));
    }
}
