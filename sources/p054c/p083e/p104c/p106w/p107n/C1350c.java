package p054c.p083e.p104c.p106w.p107n;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p054c.p083e.p104c.C1271e;
import p054c.p083e.p104c.C1290r;
import p054c.p083e.p104c.C1294t;
import p054c.p083e.p104c.C1296u;
import p054c.p083e.p104c.p106w.C1324e;
import p054c.p083e.p104c.p106w.C1336j;
import p054c.p083e.p104c.p106w.p107n.p108o.C1413a;
import p054c.p083e.p104c.p110x.C1417a;
import p054c.p083e.p104c.p111y.C1418a;
import p054c.p083e.p104c.p111y.C1420b;
import p054c.p083e.p104c.p111y.C1421c;

/* renamed from: c.e.c.w.n.c */
public final class C1350c extends C1294t<Date> {

    /* renamed from: b */
    public static final C1296u f4226b = new C1351a();

    /* renamed from: a */
    private final List<DateFormat> f4227a = new ArrayList();

    /* renamed from: c.e.c.w.n.c$a */
    static class C1351a implements C1296u {
        C1351a() {
        }

        /* renamed from: a */
        public <T> C1294t<T> mo5688a(C1271e eVar, C1417a<T> aVar) {
            if (aVar.mo5855a() == Date.class) {
                return new C1350c();
            }
            return null;
        }
    }

    public C1350c() {
        this.f4227a.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f4227a.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C1324e.m6262c()) {
            this.f4227a.add(C1336j.m6280a(2, 2));
        }
    }

    /* renamed from: a */
    private synchronized Date m6303a(String str) {
        for (DateFormat parse : this.f4227a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C1413a.m6520a(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new C1290r(str, e);
        }
    }

    /* renamed from: a */
    public Date m6305a(C1418a aVar) {
        if (aVar.mo5789q() != C1420b.NULL) {
            return m6303a(aVar.mo5788p());
        }
        aVar.mo5787o();
        return null;
    }

    /* renamed from: a */
    public synchronized void mo5646a(C1421c cVar, Date date) {
        if (date == null) {
            cVar.mo5807h();
        } else {
            cVar.mo5802c(this.f4227a.get(0).format(date));
        }
    }
}
