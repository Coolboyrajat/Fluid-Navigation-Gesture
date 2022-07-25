package p054c.p125i.p126a;

import java.util.concurrent.Callable;
import p155d.p156a.C2783a;
import p155d.p156a.C2786d;
import p155d.p156a.C2790h;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p162q.C2827e;

/* renamed from: c.i.a.e */
public final class C1529e {

    /* renamed from: c.i.a.e$a */
    class C1530a implements C1532f<T> {

        /* renamed from: a */
        final /* synthetic */ C2786d f4569a;

        /* renamed from: c.i.a.e$a$a */
        class C1531a implements C1542n<T> {

            /* renamed from: a */
            final /* synthetic */ C2790h f4570a;

            C1531a(C2790h hVar) {
                this.f4570a = hVar;
            }

            /* renamed from: a */
            public C2810b mo6030a(C2827e<? super T> eVar) {
                return new C1534h(this.f4570a, C1530a.this.f4569a).mo8927b(eVar);
            }
        }

        C1530a(C2786d dVar) {
            this.f4569a = dVar;
        }

        /* renamed from: a */
        public C1542n<T> m6821a(C2790h<T> hVar) {
            return new C1531a(hVar);
        }
    }

    /* renamed from: a */
    public static <T> C1532f<T> m6817a(C1544p pVar) {
        C1536j.m6829a(pVar, "provider == null");
        return m6818a((C2786d) C2783a.m10979a((Callable<? extends C2786d>) new C1526b(pVar)));
    }

    /* renamed from: a */
    public static <T> C1532f<T> m6818a(C2786d dVar) {
        C1536j.m6829a(dVar, "scope == null");
        return new C1530a(dVar);
    }

    /* renamed from: b */
    static /* synthetic */ C2786d m6819b(C1544p pVar) {
        try {
            return pVar.mo6023b();
        } catch (C1543o e) {
            C2827e<? super C1543o> b = C1535i.m6828b();
            if (b == null) {
                return C2783a.m10978a((Throwable) e);
            }
            b.accept(e);
            return C2783a.m10977a();
        }
    }
}
