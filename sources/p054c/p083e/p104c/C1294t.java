package p054c.p083e.p104c;

import java.io.IOException;
import p054c.p083e.p104c.p106w.p107n.C1355f;
import p054c.p083e.p104c.p111y.C1418a;
import p054c.p083e.p104c.p111y.C1420b;
import p054c.p083e.p104c.p111y.C1421c;

/* renamed from: c.e.c.t */
public abstract class C1294t<T> {

    /* renamed from: c.e.c.t$a */
    class C1295a extends C1294t<T> {
        C1295a() {
        }

        /* renamed from: a */
        public T mo5644a(C1418a aVar) {
            if (aVar.mo5789q() != C1420b.NULL) {
                return C1294t.this.mo5644a(aVar);
            }
            aVar.mo5787o();
            return null;
        }

        /* renamed from: a */
        public void mo5646a(C1421c cVar, T t) {
            if (t == null) {
                cVar.mo5807h();
            } else {
                C1294t.this.mo5646a(cVar, t);
            }
        }
    }

    /* renamed from: a */
    public final C1282j mo5686a(T t) {
        try {
            C1355f fVar = new C1355f();
            mo5646a(fVar, t);
            return fVar.mo5808i();
        } catch (IOException e) {
            throw new C1283k((Throwable) e);
        }
    }

    /* renamed from: a */
    public final C1294t<T> mo5687a() {
        return new C1295a();
    }

    /* renamed from: a */
    public abstract T mo5644a(C1418a aVar);

    /* renamed from: a */
    public abstract void mo5646a(C1421c cVar, T t);
}
