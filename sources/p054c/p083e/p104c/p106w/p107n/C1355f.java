package p054c.p083e.p104c.p106w.p107n;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import p054c.p083e.p104c.C1279g;
import p054c.p083e.p104c.C1282j;
import p054c.p083e.p104c.C1284l;
import p054c.p083e.p104c.C1285m;
import p054c.p083e.p104c.C1287o;
import p054c.p083e.p104c.p111y.C1421c;

/* renamed from: c.e.c.w.n.f */
public final class C1355f extends C1421c {

    /* renamed from: t */
    private static final Writer f4234t = new C1356a();

    /* renamed from: u */
    private static final C1287o f4235u = new C1287o("closed");

    /* renamed from: q */
    private final List<C1282j> f4236q = new ArrayList();

    /* renamed from: r */
    private String f4237r;

    /* renamed from: s */
    private C1282j f4238s = C1284l.f4147a;

    /* renamed from: c.e.c.w.n.f$a */
    static class C1356a extends Writer {
        C1356a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C1355f() {
        super(f4234t);
    }

    /* renamed from: a */
    private void m6332a(C1282j jVar) {
        if (this.f4237r != null) {
            if (!jVar.mo5662e() || mo5868e()) {
                ((C1285m) m6333j()).mo5668a(this.f4237r, jVar);
            }
            this.f4237r = null;
        } else if (this.f4236q.isEmpty()) {
            this.f4238s = jVar;
        } else {
            C1282j j = m6333j();
            if (j instanceof C1279g) {
                ((C1279g) j).mo5653a(jVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: j */
    private C1282j m6333j() {
        List<C1282j> list = this.f4236q;
        return list.get(list.size() - 1);
    }

    /* renamed from: a */
    public C1421c mo5795a() {
        C1279g gVar = new C1279g();
        m6332a((C1282j) gVar);
        this.f4236q.add(gVar);
        return this;
    }

    /* renamed from: a */
    public C1421c mo5796a(long j) {
        m6332a((C1282j) new C1287o((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: a */
    public C1421c mo5797a(Boolean bool) {
        if (bool == null) {
            mo5807h();
            return this;
        }
        m6332a((C1282j) new C1287o(bool));
        return this;
    }

    /* renamed from: a */
    public C1421c mo5798a(Number number) {
        if (number == null) {
            mo5807h();
            return this;
        }
        if (!mo5870g()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m6332a((C1282j) new C1287o(number));
        return this;
    }

    /* renamed from: a */
    public C1421c mo5799a(String str) {
        if (this.f4236q.isEmpty() || this.f4237r != null) {
            throw new IllegalStateException();
        } else if (m6333j() instanceof C1285m) {
            this.f4237r = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public C1421c mo5800b() {
        C1285m mVar = new C1285m();
        m6332a((C1282j) mVar);
        this.f4236q.add(mVar);
        return this;
    }

    /* renamed from: c */
    public C1421c mo5801c() {
        if (this.f4236q.isEmpty() || this.f4237r != null) {
            throw new IllegalStateException();
        } else if (m6333j() instanceof C1279g) {
            List<C1282j> list = this.f4236q;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: c */
    public C1421c mo5802c(String str) {
        if (str == null) {
            mo5807h();
            return this;
        }
        m6332a((C1282j) new C1287o(str));
        return this;
    }

    public void close() {
        if (this.f4236q.isEmpty()) {
            this.f4236q.add(f4235u);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public C1421c mo5804d() {
        if (this.f4236q.isEmpty() || this.f4237r != null) {
            throw new IllegalStateException();
        } else if (m6333j() instanceof C1285m) {
            List<C1282j> list = this.f4236q;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: d */
    public C1421c mo5805d(boolean z) {
        m6332a((C1282j) new C1287o(Boolean.valueOf(z)));
        return this;
    }

    public void flush() {
    }

    /* renamed from: h */
    public C1421c mo5807h() {
        m6332a((C1282j) C1284l.f4147a);
        return this;
    }

    /* renamed from: i */
    public C1282j mo5808i() {
        if (this.f4236q.isEmpty()) {
            return this.f4238s;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f4236q);
    }
}
