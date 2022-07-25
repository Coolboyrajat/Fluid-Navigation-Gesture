package p054c.p083e.p104c.p106w.p107n;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p054c.p083e.p104c.C1271e;
import p054c.p083e.p104c.C1290r;
import p054c.p083e.p104c.C1294t;
import p054c.p083e.p104c.C1296u;
import p054c.p083e.p104c.p110x.C1417a;
import p054c.p083e.p104c.p111y.C1418a;
import p054c.p083e.p104c.p111y.C1420b;
import p054c.p083e.p104c.p111y.C1421c;

/* renamed from: c.e.c.w.n.j */
public final class C1366j extends C1294t<Date> {

    /* renamed from: b */
    public static final C1296u f4264b = new C1367a();

    /* renamed from: a */
    private final DateFormat f4265a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: c.e.c.w.n.j$a */
    static class C1367a implements C1296u {
        C1367a() {
        }

        /* renamed from: a */
        public <T> C1294t<T> mo5688a(C1271e eVar, C1417a<T> aVar) {
            if (aVar.mo5855a() == Date.class) {
                return new C1366j();
            }
            return null;
        }
    }

    /* renamed from: a */
    public synchronized Date m6371a(C1418a aVar) {
        if (aVar.mo5789q() == C1420b.NULL) {
            aVar.mo5787o();
            return null;
        }
        try {
            return new Date(this.f4265a.parse(aVar.mo5788p()).getTime());
        } catch (ParseException e) {
            throw new C1290r((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized void mo5646a(C1421c cVar, Date date) {
        cVar.mo5802c(date == null ? null : this.f4265a.format(date));
    }
}
