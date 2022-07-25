package p054c.p083e.p104c.p106w.p107n;

import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import p054c.p083e.p104c.C1279g;
import p054c.p083e.p104c.C1284l;
import p054c.p083e.p104c.C1285m;
import p054c.p083e.p104c.C1287o;
import p054c.p083e.p104c.p111y.C1418a;
import p054c.p083e.p104c.p111y.C1420b;

/* renamed from: c.e.c.w.n.e */
public final class C1353e extends C1418a {

    /* renamed from: z */
    private static final Object f4229z = new Object();

    /* renamed from: v */
    private Object[] f4230v;

    /* renamed from: w */
    private int f4231w;

    /* renamed from: x */
    private String[] f4232x;

    /* renamed from: y */
    private int[] f4233y;

    /* renamed from: c.e.c.w.n.e$a */
    static class C1354a extends Reader {
        C1354a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    static {
        new C1354a();
    }

    /* renamed from: a */
    private void m6311a(C1420b bVar) {
        if (mo5789q() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + mo5789q() + m6313i());
        }
    }

    /* renamed from: a */
    private void m6312a(Object obj) {
        int i = this.f4231w;
        Object[] objArr = this.f4230v;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i * 2)];
            int[] iArr = new int[(i * 2)];
            String[] strArr = new String[(i * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f4233y, 0, iArr, 0, this.f4231w);
            System.arraycopy(this.f4232x, 0, strArr, 0, this.f4231w);
            this.f4230v = objArr2;
            this.f4233y = iArr;
            this.f4232x = strArr;
        }
        Object[] objArr3 = this.f4230v;
        int i2 = this.f4231w;
        this.f4231w = i2 + 1;
        objArr3[i2] = obj;
    }

    /* renamed from: i */
    private String m6313i() {
        return " at path " + mo5780f();
    }

    /* renamed from: t */
    private Object m6314t() {
        return this.f4230v[this.f4231w - 1];
    }

    /* renamed from: u */
    private Object m6315u() {
        Object[] objArr = this.f4230v;
        int i = this.f4231w - 1;
        this.f4231w = i;
        Object obj = objArr[i];
        objArr[this.f4231w] = null;
        return obj;
    }

    /* renamed from: a */
    public void mo5775a() {
        m6311a(C1420b.BEGIN_ARRAY);
        m6312a((Object) ((C1279g) m6314t()).iterator());
        this.f4233y[this.f4231w - 1] = 0;
    }

    /* renamed from: b */
    public void mo5776b() {
        m6311a(C1420b.BEGIN_OBJECT);
        m6312a((Object) ((C1285m) m6314t()).mo5670h().iterator());
    }

    public void close() {
        this.f4230v = new Object[]{f4229z};
        this.f4231w = 1;
    }

    /* renamed from: d */
    public void mo5778d() {
        m6311a(C1420b.END_ARRAY);
        m6315u();
        m6315u();
        int i = this.f4231w;
        if (i > 0) {
            int[] iArr = this.f4233y;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: e */
    public void mo5779e() {
        m6311a(C1420b.END_OBJECT);
        m6315u();
        m6315u();
        int i = this.f4231w;
        if (i > 0) {
            int[] iArr = this.f4233y;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: f */
    public String mo5780f() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f4231w) {
            Object[] objArr = this.f4230v;
            if (objArr[i] instanceof C1279g) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f4233y[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof C1285m) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f4232x;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: g */
    public boolean mo5781g() {
        C1420b q = mo5789q();
        return (q == C1420b.END_OBJECT || q == C1420b.END_ARRAY) ? false : true;
    }

    /* renamed from: j */
    public boolean mo5782j() {
        m6311a(C1420b.BOOLEAN);
        boolean h = ((C1287o) m6315u()).mo5674h();
        int i = this.f4231w;
        if (i > 0) {
            int[] iArr = this.f4233y;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return h;
    }

    /* renamed from: k */
    public double mo5783k() {
        C1420b q = mo5789q();
        if (q == C1420b.NUMBER || q == C1420b.STRING) {
            double j = ((C1287o) m6314t()).mo5677j();
            if (mo5862h() || (!Double.isNaN(j) && !Double.isInfinite(j))) {
                m6315u();
                int i = this.f4231w;
                if (i > 0) {
                    int[] iArr = this.f4233y;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return j;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + j);
        }
        throw new IllegalStateException("Expected " + C1420b.NUMBER + " but was " + q + m6313i());
    }

    /* renamed from: l */
    public int mo5784l() {
        C1420b q = mo5789q();
        if (q == C1420b.NUMBER || q == C1420b.STRING) {
            int k = ((C1287o) m6314t()).mo5678k();
            m6315u();
            int i = this.f4231w;
            if (i > 0) {
                int[] iArr = this.f4233y;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return k;
        }
        throw new IllegalStateException("Expected " + C1420b.NUMBER + " but was " + q + m6313i());
    }

    /* renamed from: m */
    public long mo5785m() {
        C1420b q = mo5789q();
        if (q == C1420b.NUMBER || q == C1420b.STRING) {
            long l = ((C1287o) m6314t()).mo5679l();
            m6315u();
            int i = this.f4231w;
            if (i > 0) {
                int[] iArr = this.f4233y;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return l;
        }
        throw new IllegalStateException("Expected " + C1420b.NUMBER + " but was " + q + m6313i());
    }

    /* renamed from: n */
    public String mo5786n() {
        m6311a(C1420b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m6314t()).next();
        String str = (String) entry.getKey();
        this.f4232x[this.f4231w - 1] = str;
        m6312a(entry.getValue());
        return str;
    }

    /* renamed from: o */
    public void mo5787o() {
        m6311a(C1420b.NULL);
        m6315u();
        int i = this.f4231w;
        if (i > 0) {
            int[] iArr = this.f4233y;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: p */
    public String mo5788p() {
        C1420b q = mo5789q();
        if (q == C1420b.STRING || q == C1420b.NUMBER) {
            String n = ((C1287o) m6315u()).mo5681n();
            int i = this.f4231w;
            if (i > 0) {
                int[] iArr = this.f4233y;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return n;
        }
        throw new IllegalStateException("Expected " + C1420b.STRING + " but was " + q + m6313i());
    }

    /* renamed from: q */
    public C1420b mo5789q() {
        if (this.f4231w == 0) {
            return C1420b.END_DOCUMENT;
        }
        Object t = m6314t();
        if (t instanceof Iterator) {
            boolean z = this.f4230v[this.f4231w - 2] instanceof C1285m;
            Iterator it = (Iterator) t;
            if (!it.hasNext()) {
                return z ? C1420b.END_OBJECT : C1420b.END_ARRAY;
            }
            if (z) {
                return C1420b.NAME;
            }
            m6312a(it.next());
            return mo5789q();
        } else if (t instanceof C1285m) {
            return C1420b.BEGIN_OBJECT;
        } else {
            if (t instanceof C1279g) {
                return C1420b.BEGIN_ARRAY;
            }
            if (t instanceof C1287o) {
                C1287o oVar = (C1287o) t;
                if (oVar.mo5684q()) {
                    return C1420b.STRING;
                }
                if (oVar.mo5682o()) {
                    return C1420b.BOOLEAN;
                }
                if (oVar.mo5683p()) {
                    return C1420b.NUMBER;
                }
                throw new AssertionError();
            } else if (t instanceof C1284l) {
                return C1420b.NULL;
            } else {
                if (t == f4229z) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    /* renamed from: r */
    public void mo5790r() {
        if (mo5789q() == C1420b.NAME) {
            mo5786n();
            this.f4232x[this.f4231w - 2] = "null";
        } else {
            m6315u();
            int i = this.f4231w;
            if (i > 0) {
                this.f4232x[i - 1] = "null";
            }
        }
        int i2 = this.f4231w;
        if (i2 > 0) {
            int[] iArr = this.f4233y;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: s */
    public void mo5791s() {
        m6311a(C1420b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m6314t()).next();
        m6312a(entry.getValue());
        m6312a((Object) new C1287o((String) entry.getKey()));
    }

    public String toString() {
        return C1353e.class.getSimpleName();
    }
}
