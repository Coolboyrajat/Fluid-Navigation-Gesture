package p054c.p083e.p104c.p111y;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: c.e.c.y.c */
public class C1421c implements Closeable, Flushable {

    /* renamed from: o */
    private static final String[] f4381o = new String[PropertyFlags.ID_SELF_ASSIGNABLE];

    /* renamed from: p */
    private static final String[] f4382p;

    /* renamed from: f */
    private final Writer f4383f;

    /* renamed from: g */
    private int[] f4384g = new int[32];

    /* renamed from: h */
    private int f4385h = 0;

    /* renamed from: i */
    private String f4386i;

    /* renamed from: j */
    private String f4387j;

    /* renamed from: k */
    private boolean f4388k;

    /* renamed from: l */
    private boolean f4389l;

    /* renamed from: m */
    private String f4390m;

    /* renamed from: n */
    private boolean f4391n;

    static {
        for (int i = 0; i <= 31; i++) {
            f4381o[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f4381o;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f4382p = (String[]) strArr.clone();
        String[] strArr2 = f4382p;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C1421c(Writer writer) {
        m6572a(6);
        this.f4387j = ":";
        this.f4391n = true;
        if (writer != null) {
            this.f4383f = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: a */
    private C1421c m6570a(int i, int i2, String str) {
        int l = m6578l();
        if (l != i2 && l != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f4390m == null) {
            this.f4385h--;
            if (l == i2) {
                m6577k();
            }
            this.f4383f.write(str);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f4390m);
        }
    }

    /* renamed from: a */
    private C1421c m6571a(int i, String str) {
        m6576j();
        m6572a(i);
        this.f4383f.write(str);
        return this;
    }

    /* renamed from: a */
    private void m6572a(int i) {
        int i2 = this.f4385h;
        int[] iArr = this.f4384g;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f4384g = iArr2;
        }
        int[] iArr3 = this.f4384g;
        int i3 = this.f4385h;
        this.f4385h = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: b */
    private void m6573b(int i) {
        this.f4384g[this.f4385h - 1] = i;
    }

    /* renamed from: d */
    private void m6574d(String str) {
        String str2;
        String[] strArr = this.f4389l ? f4382p : f4381o;
        this.f4383f.write("\"");
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.f4383f.write(str, i, i2 - i);
            }
            this.f4383f.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f4383f.write(str, i, length - i);
        }
        this.f4383f.write("\"");
    }

    /* renamed from: i */
    private void mo5808i() {
        int l = m6578l();
        if (l == 5) {
            this.f4383f.write(44);
        } else if (l != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m6577k();
        m6573b(4);
    }

    /* renamed from: j */
    private void m6576j() {
        int l = m6578l();
        if (l == 1) {
            m6573b(2);
        } else if (l == 2) {
            this.f4383f.append(',');
        } else if (l != 4) {
            if (l != 6) {
                if (l != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f4388k) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m6573b(7);
            return;
        } else {
            this.f4383f.append(this.f4387j);
            m6573b(5);
            return;
        }
        m6577k();
    }

    /* renamed from: k */
    private void m6577k() {
        if (this.f4386i != null) {
            this.f4383f.write("\n");
            int i = this.f4385h;
            for (int i2 = 1; i2 < i; i2++) {
                this.f4383f.write(this.f4386i);
            }
        }
    }

    /* renamed from: l */
    private int m6578l() {
        int i = this.f4385h;
        if (i != 0) {
            return this.f4384g[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: m */
    private void m6579m() {
        if (this.f4390m != null) {
            mo5808i();
            m6574d(this.f4390m);
            this.f4390m = null;
        }
    }

    /* renamed from: a */
    public C1421c mo5795a() {
        m6579m();
        m6571a(1, "[");
        return this;
    }

    /* renamed from: a */
    public C1421c mo5796a(long j) {
        m6579m();
        m6576j();
        this.f4383f.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public C1421c mo5797a(Boolean bool) {
        if (bool == null) {
            return mo5807h();
        }
        m6579m();
        m6576j();
        this.f4383f.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: a */
    public C1421c mo5798a(Number number) {
        if (number == null) {
            return mo5807h();
        }
        m6579m();
        String obj = number.toString();
        if (this.f4388k || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m6576j();
            this.f4383f.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    /* renamed from: a */
    public C1421c mo5799a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f4390m != null) {
            throw new IllegalStateException();
        } else if (this.f4385h != 0) {
            this.f4390m = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: a */
    public final void mo5864a(boolean z) {
        this.f4389l = z;
    }

    /* renamed from: b */
    public C1421c mo5800b() {
        m6579m();
        m6571a(3, "{");
        return this;
    }

    /* renamed from: b */
    public final void mo5865b(String str) {
        String str2;
        if (str.length() == 0) {
            this.f4386i = null;
            str2 = ":";
        } else {
            this.f4386i = str;
            str2 = ": ";
        }
        this.f4387j = str2;
    }

    /* renamed from: b */
    public final void mo5866b(boolean z) {
        this.f4388k = z;
    }

    /* renamed from: c */
    public C1421c mo5801c() {
        m6570a(1, 2, "]");
        return this;
    }

    /* renamed from: c */
    public C1421c mo5802c(String str) {
        if (str == null) {
            return mo5807h();
        }
        m6579m();
        m6576j();
        m6574d(str);
        return this;
    }

    /* renamed from: c */
    public final void mo5867c(boolean z) {
        this.f4391n = z;
    }

    public void close() {
        this.f4383f.close();
        int i = this.f4385h;
        if (i > 1 || (i == 1 && this.f4384g[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4385h = 0;
    }

    /* renamed from: d */
    public C1421c mo5804d() {
        m6570a(3, 5, "}");
        return this;
    }

    /* renamed from: d */
    public C1421c mo5805d(boolean z) {
        m6579m();
        m6576j();
        this.f4383f.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: e */
    public final boolean mo5868e() {
        return this.f4391n;
    }

    /* renamed from: f */
    public final boolean mo5869f() {
        return this.f4389l;
    }

    public void flush() {
        if (this.f4385h != 0) {
            this.f4383f.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public boolean mo5870g() {
        return this.f4388k;
    }

    /* renamed from: h */
    public C1421c mo5807h() {
        if (this.f4390m != null) {
            if (this.f4391n) {
                m6579m();
            } else {
                this.f4390m = null;
                return this;
            }
        }
        m6576j();
        this.f4383f.write("null");
        return this;
    }
}
