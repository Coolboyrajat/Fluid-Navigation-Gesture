package p054c.p083e.p104c.p106w.p107n;

import java.sql.Time;
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

/* renamed from: c.e.c.w.n.k */
public final class C1368k extends C1294t<Time> {

    /* renamed from: b */
    public static final C1296u f4266b = new C1369a();

    /* renamed from: a */
    private final DateFormat f4267a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: c.e.c.w.n.k$a */
    static class C1369a implements C1296u {
        C1369a() {
        }

        /* renamed from: a */
        public <T> C1294t<T> mo5688a(C1271e eVar, C1417a<T> aVar) {
            if (aVar.mo5855a() == Time.class) {
                return new C1368k();
            }
            return null;
        }
    }

    /* renamed from: a */
    public synchronized Time m6376a(C1418a aVar) {
        if (aVar.mo5789q() == C1420b.NULL) {
            aVar.mo5787o();
            return null;
        }
        try {
            return new Time(this.f4267a.parse(aVar.mo5788p()).getTime());
        } catch (ParseException e) {
            throw new C1290r((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized void mo5646a(C1421c cVar, Time time) {
        cVar.mo5802c(time == null ? null : this.f4267a.format(time));
    }
}
