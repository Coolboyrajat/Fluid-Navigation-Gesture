package p054c.p083e.p104c.p106w.p107n;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p054c.p083e.p104c.C1271e;
import p054c.p083e.p104c.C1294t;
import p054c.p083e.p104c.p106w.p107n.C1362i;
import p054c.p083e.p104c.p110x.C1417a;
import p054c.p083e.p104c.p111y.C1418a;
import p054c.p083e.p104c.p111y.C1421c;

/* renamed from: c.e.c.w.n.m */
final class C1373m<T> extends C1294t<T> {

    /* renamed from: a */
    private final C1271e f4275a;

    /* renamed from: b */
    private final C1294t<T> f4276b;

    /* renamed from: c */
    private final Type f4277c;

    C1373m(C1271e eVar, C1294t<T> tVar, Type type) {
        this.f4275a = eVar;
        this.f4276b = tVar;
        this.f4277c = type;
    }

    /* renamed from: a */
    private Type m6383a(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    /* renamed from: a */
    public T mo5644a(C1418a aVar) {
        return this.f4276b.mo5644a(aVar);
    }

    /* renamed from: a */
    public void mo5646a(C1421c cVar, T t) {
        C1294t<T> tVar = this.f4276b;
        Type a = m6383a(this.f4277c, (Object) t);
        if (a != this.f4277c) {
            tVar = this.f4275a.mo5628a(C1417a.m6530a(a));
            if (tVar instanceof C1362i.C1364b) {
                C1294t<T> tVar2 = this.f4276b;
                if (!(tVar2 instanceof C1362i.C1364b)) {
                    tVar = tVar2;
                }
            }
        }
        tVar.mo5646a(cVar, t);
    }
}
