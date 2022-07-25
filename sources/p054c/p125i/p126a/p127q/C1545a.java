package p054c.p125i.p126a.p127q;

import p155d.p156a.p161p.C2819b;
import p155d.p156a.p162q.C2826d;

/* renamed from: c.i.a.q.a */
public final class C1545a {

    /* renamed from: a */
    private static volatile C2826d f4583a;

    /* renamed from: a */
    public static boolean m6843a(C2826d dVar) {
        if (dVar != null) {
            C2826d dVar2 = f4583a;
            if (dVar2 != null) {
                return dVar2.mo6039a();
            }
            try {
                return dVar.mo6039a();
            } catch (Exception e) {
                C2819b.m11087a(e);
                throw null;
            }
        } else {
            throw new NullPointerException("defaultChecker == null");
        }
    }
}
