package p054c.p083e.p104c.p106w.p107n;

import p054c.p083e.p104c.C1271e;
import p054c.p083e.p104c.C1280h;
import p054c.p083e.p104c.C1281i;
import p054c.p083e.p104c.C1282j;
import p054c.p083e.p104c.C1288p;
import p054c.p083e.p104c.C1289q;
import p054c.p083e.p104c.C1294t;
import p054c.p083e.p104c.C1296u;
import p054c.p083e.p104c.p106w.C1338l;
import p054c.p083e.p104c.p110x.C1417a;
import p054c.p083e.p104c.p111y.C1418a;
import p054c.p083e.p104c.p111y.C1421c;

/* renamed from: c.e.c.w.n.l */
public final class C1370l<T> extends C1294t<T> {

    /* renamed from: a */
    private final C1289q<T> f4268a;

    /* renamed from: b */
    private final C1281i<T> f4269b;

    /* renamed from: c */
    final C1271e f4270c;

    /* renamed from: d */
    private final C1417a<T> f4271d;

    /* renamed from: e */
    private final C1296u f4272e;

    /* renamed from: f */
    private final C1370l<T>.b f4273f = new C1372b();

    /* renamed from: g */
    private C1294t<T> f4274g;

    /* renamed from: c.e.c.w.n.l$b */
    private final class C1372b implements C1288p, C1280h {
        private C1372b(C1370l lVar) {
        }
    }

    public C1370l(C1289q<T> qVar, C1281i<T> iVar, C1271e eVar, C1417a<T> aVar, C1296u uVar) {
        this.f4268a = qVar;
        this.f4269b = iVar;
        this.f4270c = eVar;
        this.f4271d = aVar;
        this.f4272e = uVar;
    }

    /* renamed from: b */
    private C1294t<T> m6380b() {
        C1294t<T> tVar = this.f4274g;
        if (tVar != null) {
            return tVar;
        }
        C1294t<T> a = this.f4270c.mo5627a(this.f4272e, this.f4271d);
        this.f4274g = a;
        return a;
    }

    /* renamed from: a */
    public T mo5644a(C1418a aVar) {
        if (this.f4269b == null) {
            return m6380b().mo5644a(aVar);
        }
        C1282j a = C1338l.m6285a(aVar);
        if (a.mo5662e()) {
            return null;
        }
        return this.f4269b.mo5657a(a, this.f4271d.mo5856b(), this.f4273f);
    }

    /* renamed from: a */
    public void mo5646a(C1421c cVar, T t) {
        C1289q<T> qVar = this.f4268a;
        if (qVar == null) {
            m6380b().mo5646a(cVar, t);
        } else if (t == null) {
            cVar.mo5807h();
        } else {
            C1338l.m6287a(qVar.mo5685a(t, this.f4271d.mo5856b(), this.f4273f), cVar);
        }
    }
}
