package p054c.p083e.p104c.p111y;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import p054c.p083e.p104c.p106w.C1325f;
import p054c.p083e.p104c.p106w.p107n.C1353e;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: c.e.c.y.a */
public class C1418a implements Closeable {

    /* renamed from: u */
    private static final char[] f4354u = ")]}'\n".toCharArray();

    /* renamed from: f */
    private final Reader f4355f;

    /* renamed from: g */
    private boolean f4356g = false;

    /* renamed from: h */
    private final char[] f4357h = new char[PropertyFlags.VIRTUAL];

    /* renamed from: i */
    private int f4358i = 0;

    /* renamed from: j */
    private int f4359j = 0;

    /* renamed from: k */
    private int f4360k = 0;

    /* renamed from: l */
    private int f4361l = 0;

    /* renamed from: m */
    int f4362m = 0;

    /* renamed from: n */
    private long f4363n;

    /* renamed from: o */
    private int f4364o;

    /* renamed from: p */
    private String f4365p;

    /* renamed from: q */
    private int[] f4366q = new int[32];

    /* renamed from: r */
    private int f4367r = 0;

    /* renamed from: s */
    private String[] f4368s;

    /* renamed from: t */
    private int[] f4369t;

    /* renamed from: c.e.c.y.a$a */
    static class C1419a extends C1325f {
        C1419a() {
        }

        /* renamed from: a */
        public void mo5718a(C1418a aVar) {
            int i;
            if (aVar instanceof C1353e) {
                ((C1353e) aVar).mo5791s();
                return;
            }
            int i2 = aVar.f4362m;
            if (i2 == 0) {
                i2 = aVar.mo5861c();
            }
            if (i2 == 13) {
                i = 9;
            } else if (i2 == 12) {
                i = 8;
            } else if (i2 == 14) {
                i = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.mo5789q() + aVar.mo5863i());
            }
            aVar.f4362m = i;
        }
    }

    static {
        C1325f.f4187a = new C1419a();
    }

    public C1418a(Reader reader) {
        int[] iArr = this.f4366q;
        int i = this.f4367r;
        this.f4367r = i + 1;
        iArr[i] = 6;
        this.f4368s = new String[32];
        this.f4369t = new int[32];
        if (reader != null) {
            this.f4355f = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: a */
    private boolean m6534a(char c) {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        mo5791s();
        return false;
    }

    /* renamed from: a */
    private boolean m6535a(int i) {
        int i2;
        char[] cArr = this.f4357h;
        int i3 = this.f4361l;
        int i4 = this.f4358i;
        this.f4361l = i3 - i4;
        int i5 = this.f4359j;
        if (i5 != i4) {
            this.f4359j = i5 - i4;
            System.arraycopy(cArr, i4, cArr, 0, this.f4359j);
        } else {
            this.f4359j = 0;
        }
        this.f4358i = 0;
        do {
            Reader reader = this.f4355f;
            int i6 = this.f4359j;
            int read = reader.read(cArr, i6, cArr.length - i6);
            if (read == -1) {
                return false;
            }
            this.f4359j += read;
            if (this.f4360k == 0 && (i2 = this.f4361l) == 0 && this.f4359j > 0 && cArr[0] == 65279) {
                this.f4358i++;
                this.f4361l = i2 + 1;
                i++;
            }
        } while (this.f4359j < i);
        return true;
    }

    /* renamed from: a */
    private boolean m6536a(String str) {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f4358i + length > this.f4359j && !m6535a(length)) {
                return false;
            }
            char[] cArr = this.f4357h;
            int i2 = this.f4358i;
            if (cArr[i2] == 10) {
                this.f4360k++;
                this.f4361l = i2 + 1;
            } else {
                while (i < length) {
                    if (this.f4357h[this.f4358i + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f4358i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r1 != '/') goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r7.f4358i = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r4 != r2) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r7.f4358i--;
        r2 = m6535a(2);
        r7.f4358i++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (r2 != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
        mo5791s();
        r2 = r7.f4358i;
        r3 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r3 == '*') goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if (r3 == '/') goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        r7.f4358i = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        r7.f4358i = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        if (m6536a("*/") == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0092, code lost:
        m6538b("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0099, code lost:
        r7.f4358i = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009d, code lost:
        if (r1 != '#') goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009f, code lost:
        mo5791s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a3, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m6537b(boolean r8) {
        /*
            r7 = this;
            char[] r0 = r7.f4357h
        L_0x0002:
            int r1 = r7.f4358i
        L_0x0004:
            int r2 = r7.f4359j
        L_0x0006:
            r3 = 1
            if (r1 != r2) goto L_0x0034
            r7.f4358i = r1
            boolean r1 = r7.m6535a((int) r3)
            if (r1 != 0) goto L_0x0030
            if (r8 != 0) goto L_0x0015
            r8 = -1
            return r8
        L_0x0015:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r7.mo5863i()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0030:
            int r1 = r7.f4358i
            int r2 = r7.f4359j
        L_0x0034:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L_0x0044
            int r1 = r7.f4360k
            int r1 = r1 + r3
            r7.f4360k = r1
            r7.f4361l = r4
            goto L_0x00a4
        L_0x0044:
            r5 = 32
            if (r1 == r5) goto L_0x00a4
            r5 = 13
            if (r1 == r5) goto L_0x00a4
            r5 = 9
            if (r1 != r5) goto L_0x0051
            goto L_0x00a4
        L_0x0051:
            r5 = 47
            if (r1 != r5) goto L_0x0099
            r7.f4358i = r4
            r6 = 2
            if (r4 != r2) goto L_0x006b
            int r2 = r7.f4358i
            int r2 = r2 - r3
            r7.f4358i = r2
            boolean r2 = r7.m6535a((int) r6)
            int r4 = r7.f4358i
            int r4 = r4 + r3
            r7.f4358i = r4
            if (r2 != 0) goto L_0x006b
            return r1
        L_0x006b:
            r7.mo5791s()
            int r2 = r7.f4358i
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L_0x0081
            if (r3 == r5) goto L_0x0079
            return r1
        L_0x0079:
            int r2 = r2 + 1
            r7.f4358i = r2
        L_0x007d:
            r7.m6548y()
            goto L_0x0002
        L_0x0081:
            int r2 = r2 + 1
            r7.f4358i = r2
            java.lang.String r1 = "*/"
            boolean r1 = r7.m6536a((java.lang.String) r1)
            if (r1 == 0) goto L_0x0092
            int r1 = r7.f4358i
            int r1 = r1 + r6
            goto L_0x0004
        L_0x0092:
            java.lang.String r8 = "Unterminated comment"
            r7.m6538b((java.lang.String) r8)
            r8 = 0
            throw r8
        L_0x0099:
            r2 = 35
            r7.f4358i = r4
            if (r1 != r2) goto L_0x00a3
            r7.mo5791s()
            goto L_0x007d
        L_0x00a3:
            return r1
        L_0x00a4:
            r1 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: p054c.p083e.p104c.p111y.C1418a.m6537b(boolean):int");
    }

    /* renamed from: b */
    private IOException m6538b(String str) {
        throw new C1422d(str + mo5863i());
    }

    /* renamed from: b */
    private String m6539b(char c) {
        char[] cArr = this.f4357h;
        StringBuilder sb = null;
        while (true) {
            int i = this.f4358i;
            int i2 = this.f4359j;
            int i3 = i;
            while (true) {
                if (i < i2) {
                    int i4 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f4358i = i4;
                        int i5 = (i4 - i3) - 1;
                        if (sb == null) {
                            return new String(cArr, i3, i5);
                        }
                        sb.append(cArr, i3, i5);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.f4358i = i4;
                        int i6 = (i4 - i3) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i3, i6);
                        sb.append(m6547x());
                    } else {
                        if (c2 == 10) {
                            this.f4360k++;
                            this.f4361l = i4;
                        }
                        i = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i - i3) * 2, 16));
                    }
                    sb.append(cArr, i3, i - i3);
                    this.f4358i = i;
                    if (!m6535a(1)) {
                        m6538b("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m6540b(int i) {
        int i2 = this.f4367r;
        int[] iArr = this.f4366q;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            int[] iArr3 = new int[(i2 * 2)];
            String[] strArr = new String[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f4369t, 0, iArr3, 0, this.f4367r);
            System.arraycopy(this.f4368s, 0, strArr, 0, this.f4367r);
            this.f4366q = iArr2;
            this.f4369t = iArr3;
            this.f4368s = strArr;
        }
        int[] iArr4 = this.f4366q;
        int i3 = this.f4367r;
        this.f4367r = i3 + 1;
        iArr4[i3] = i;
    }

    /* renamed from: c */
    private void m6541c(char c) {
        char[] cArr = this.f4357h;
        while (true) {
            int i = this.f4358i;
            int i2 = this.f4359j;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f4358i = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.f4358i = i3;
                        m6547x();
                        break;
                    } else {
                        if (c2 == 10) {
                            this.f4360k++;
                            this.f4361l = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f4358i = i;
                    if (!m6535a(1)) {
                        m6538b("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: s */
    private void mo5791s() {
        if (!this.f4356g) {
            m6538b("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* renamed from: t */
    private void m6543t() {
        m6537b(true);
        this.f4358i--;
        int i = this.f4358i;
        char[] cArr = f4354u;
        if (i + cArr.length <= this.f4359j || m6535a(cArr.length)) {
            int i2 = 0;
            while (true) {
                char[] cArr2 = f4354u;
                if (i2 >= cArr2.length) {
                    this.f4358i += cArr2.length;
                    return;
                } else if (this.f4357h[this.f4358i + i2] == cArr2[i2]) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004b, code lost:
        mo5791s();
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m6544u() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = r1
        L_0x0003:
            r1 = 0
        L_0x0004:
            int r3 = r6.f4358i
            int r4 = r3 + r1
            int r5 = r6.f4359j
            if (r4 >= r5) goto L_0x004f
            char[] r4 = r6.f4357h
            int r3 = r3 + r1
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005d
            r4 = 10
            if (r3 == r4) goto L_0x005d
            r4 = 12
            if (r3 == r4) goto L_0x005d
            r4 = 13
            if (r3 == r4) goto L_0x005d
            r4 = 32
            if (r3 == r4) goto L_0x005d
            r4 = 35
            if (r3 == r4) goto L_0x004b
            r4 = 44
            if (r3 == r4) goto L_0x005d
            r4 = 47
            if (r3 == r4) goto L_0x004b
            r4 = 61
            if (r3 == r4) goto L_0x004b
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005d
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005d
            r4 = 58
            if (r3 == r4) goto L_0x005d
            r4 = 59
            if (r3 == r4) goto L_0x004b
            switch(r3) {
                case 91: goto L_0x005d;
                case 92: goto L_0x004b;
                case 93: goto L_0x005d;
                default: goto L_0x0048;
            }
        L_0x0048:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x004b:
            r6.mo5791s()
            goto L_0x005d
        L_0x004f:
            char[] r3 = r6.f4357h
            int r3 = r3.length
            if (r1 >= r3) goto L_0x005f
            int r3 = r1 + 1
            boolean r3 = r6.m6535a((int) r3)
            if (r3 == 0) goto L_0x005d
            goto L_0x0004
        L_0x005d:
            r0 = r1
            goto L_0x007f
        L_0x005f:
            if (r2 != 0) goto L_0x006c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r1, r3)
            r2.<init>(r3)
        L_0x006c:
            char[] r3 = r6.f4357h
            int r4 = r6.f4358i
            r2.append(r3, r4, r1)
            int r3 = r6.f4358i
            int r3 = r3 + r1
            r6.f4358i = r3
            r1 = 1
            boolean r1 = r6.m6535a((int) r1)
            if (r1 != 0) goto L_0x0003
        L_0x007f:
            if (r2 != 0) goto L_0x008b
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f4357h
            int r3 = r6.f4358i
            r1.<init>(r2, r3, r0)
            goto L_0x0096
        L_0x008b:
            char[] r1 = r6.f4357h
            int r3 = r6.f4358i
            r2.append(r1, r3, r0)
            java.lang.String r1 = r2.toString()
        L_0x0096:
            int r2 = r6.f4358i
            int r2 = r2 + r0
            r6.f4358i = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p054c.p083e.p104c.p111y.C1418a.m6544u():java.lang.String");
    }

    /* renamed from: v */
    private int m6545v() {
        String str;
        String str2;
        int i;
        char c = this.f4357h[this.f4358i];
        if (c == 't' || c == 'T') {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f4358i + i2 >= this.f4359j && !m6535a(i2 + 1)) {
                return 0;
            }
            char c2 = this.f4357h[this.f4358i + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f4358i + length < this.f4359j || m6535a(length + 1)) && m6534a(this.f4357h[this.f4358i + length])) {
            return 0;
        }
        this.f4358i += length;
        this.f4362m = i;
        return i;
    }

    /* renamed from: w */
    private int m6546w() {
        int i;
        char c;
        char[] cArr = this.f4357h;
        int i2 = this.f4358i;
        int i3 = 0;
        int i4 = this.f4359j;
        int i5 = 0;
        char c2 = 0;
        boolean z = true;
        long j = 0;
        boolean z2 = false;
        while (true) {
            if (i2 + i5 == i4) {
                if (i5 == cArr.length) {
                    return i3;
                }
                if (!m6535a(i5 + 1)) {
                    break;
                }
                i2 = this.f4358i;
                i4 = this.f4359j;
            }
            c = cArr[i2 + i5];
            if (c == '+') {
                i3 = 0;
                if (c2 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i3 = 0;
                if (c2 != 2 && c2 != 4) {
                    return 0;
                }
                c2 = 5;
                i5++;
            } else {
                if (c == '-') {
                    i3 = 0;
                    if (c2 == 0) {
                        c2 = 1;
                        z2 = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (c == '.') {
                    i3 = 0;
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                } else if (c >= '0' && c <= '9') {
                    if (c2 == 1 || c2 == 0) {
                        j = (long) (-(c - '0'));
                        i3 = 0;
                        c2 = 2;
                    } else {
                        if (c2 == 2) {
                            if (j == 0) {
                                return 0;
                            }
                            long j2 = (10 * j) - ((long) (c - '0'));
                            int i6 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                            boolean z3 = i6 > 0 || (i6 == 0 && j2 < j);
                            j = j2;
                            z = z3 & z;
                        } else if (c2 == 3) {
                            i3 = 0;
                            c2 = 4;
                        } else if (c2 == 5 || c2 == 6) {
                            i3 = 0;
                            c2 = 7;
                        }
                        i3 = 0;
                    }
                }
                i5++;
            }
            c2 = 6;
            i5++;
        }
        if (m6534a(c)) {
            return 0;
        }
        if (c2 == 2 && z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.f4363n = j;
            this.f4358i += i5;
            i = 15;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f4364o = i5;
            i = 16;
        }
        this.f4362m = i;
        return i;
    }

    /* renamed from: x */
    private char m6547x() {
        int i;
        int i2;
        if (this.f4358i != this.f4359j || m6535a(1)) {
            char[] cArr = this.f4357h;
            int i3 = this.f4358i;
            this.f4358i = i3 + 1;
            char c = cArr[i3];
            if (c == 10) {
                this.f4360k++;
                this.f4361l = this.f4358i;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    m6538b("Invalid escape sequence");
                    throw null;
                } else if (this.f4358i + 4 <= this.f4359j || m6535a(4)) {
                    char c2 = 0;
                    int i4 = this.f4358i;
                    int i5 = i4 + 4;
                    while (i4 < i5) {
                        char c3 = this.f4357h[i4];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f4357h, this.f4358i, 4));
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i4++;
                    }
                    this.f4358i += 4;
                    return c2;
                } else {
                    m6538b("Unterminated escape sequence");
                    throw null;
                }
            }
            return c;
        }
        m6538b("Unterminated escape sequence");
        throw null;
    }

    /* renamed from: y */
    private void m6548y() {
        char c;
        do {
            if (this.f4358i < this.f4359j || m6535a(1)) {
                char[] cArr = this.f4357h;
                int i = this.f4358i;
                this.f4358i = i + 1;
                c = cArr[i];
                if (c == 10) {
                    this.f4360k++;
                    this.f4361l = this.f4358i;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        mo5791s();
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6549z() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f4358i
            int r2 = r1 + r0
            int r3 = r4.f4359j
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f4357h
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.mo5791s()
        L_0x004b:
            int r1 = r4.f4358i
            int r1 = r1 + r0
            r4.f4358i = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f4358i = r1
            r0 = 1
            boolean r0 = r4.m6535a((int) r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p054c.p083e.p104c.p111y.C1418a.m6549z():void");
    }

    /* renamed from: a */
    public void mo5775a() {
        int i = this.f4362m;
        if (i == 0) {
            i = mo5861c();
        }
        if (i == 3) {
            m6540b(1);
            this.f4369t[this.f4367r - 1] = 0;
            this.f4362m = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo5789q() + mo5863i());
    }

    /* renamed from: a */
    public final void mo5860a(boolean z) {
        this.f4356g = z;
    }

    /* renamed from: b */
    public void mo5776b() {
        int i = this.f4362m;
        if (i == 0) {
            i = mo5861c();
        }
        if (i == 1) {
            m6540b(3);
            this.f4362m = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo5789q() + mo5863i());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x010c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo5861c() {
        /*
            r16 = this;
            r0 = r16
            int[] r1 = r0.f4366q
            int r2 = r0.f4367r
            int r3 = r2 + -1
            r3 = r1[r3]
            r4 = 8
            r5 = 39
            r6 = 34
            r7 = 93
            r8 = 3
            r9 = 7
            r10 = 59
            r11 = 44
            r12 = 4
            r13 = 2
            r14 = 0
            r15 = 1
            if (r3 != r15) goto L_0x0023
            int r2 = r2 - r15
            r1[r2] = r13
            goto L_0x00a3
        L_0x0023:
            if (r3 != r13) goto L_0x003c
            int r1 = r0.m6537b((boolean) r15)
            if (r1 == r11) goto L_0x00a3
            if (r1 == r10) goto L_0x0038
            if (r1 != r7) goto L_0x0032
            r0.f4362m = r12
            return r12
        L_0x0032:
            java.lang.String r1 = "Unterminated array"
            r0.m6538b((java.lang.String) r1)
            throw r14
        L_0x0038:
            r16.mo5791s()
            goto L_0x00a3
        L_0x003c:
            r13 = 5
            if (r3 == r8) goto L_0x0117
            if (r3 != r13) goto L_0x0043
            goto L_0x0117
        L_0x0043:
            if (r3 != r12) goto L_0x0077
            int r2 = r2 - r15
            r1[r2] = r13
            int r1 = r0.m6537b((boolean) r15)
            r2 = 58
            if (r1 == r2) goto L_0x00a3
            r2 = 61
            if (r1 != r2) goto L_0x0071
            r16.mo5791s()
            int r1 = r0.f4358i
            int r2 = r0.f4359j
            if (r1 < r2) goto L_0x0063
            boolean r1 = r0.m6535a((int) r15)
            if (r1 == 0) goto L_0x00a3
        L_0x0063:
            char[] r1 = r0.f4357h
            int r2 = r0.f4358i
            char r1 = r1[r2]
            r13 = 62
            if (r1 != r13) goto L_0x00a3
            int r2 = r2 + r15
            r0.f4358i = r2
            goto L_0x00a3
        L_0x0071:
            java.lang.String r1 = "Expected ':'"
            r0.m6538b((java.lang.String) r1)
            throw r14
        L_0x0077:
            r1 = 6
            if (r3 != r1) goto L_0x0089
            boolean r1 = r0.f4356g
            if (r1 == 0) goto L_0x0081
            r16.m6543t()
        L_0x0081:
            int[] r1 = r0.f4366q
            int r2 = r0.f4367r
            int r2 = r2 - r15
            r1[r2] = r9
            goto L_0x00a3
        L_0x0089:
            if (r3 != r9) goto L_0x00a1
            r1 = 0
            int r1 = r0.m6537b((boolean) r1)
            r2 = -1
            if (r1 != r2) goto L_0x0098
            r1 = 17
        L_0x0095:
            r0.f4362m = r1
            return r1
        L_0x0098:
            r16.mo5791s()
            int r1 = r0.f4358i
            int r1 = r1 - r15
            r0.f4358i = r1
            goto L_0x00a3
        L_0x00a1:
            if (r3 == r4) goto L_0x010f
        L_0x00a3:
            int r1 = r0.m6537b((boolean) r15)
            if (r1 == r6) goto L_0x010c
            if (r1 == r5) goto L_0x0106
            if (r1 == r11) goto L_0x00ef
            if (r1 == r10) goto L_0x00ef
            r2 = 91
            if (r1 == r2) goto L_0x00ec
            if (r1 == r7) goto L_0x00e7
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x00e4
            int r1 = r0.f4358i
            int r1 = r1 - r15
            r0.f4358i = r1
            int r1 = r16.m6545v()
            if (r1 == 0) goto L_0x00c5
            return r1
        L_0x00c5:
            int r1 = r16.m6546w()
            if (r1 == 0) goto L_0x00cc
            return r1
        L_0x00cc:
            char[] r1 = r0.f4357h
            int r2 = r0.f4358i
            char r1 = r1[r2]
            boolean r1 = r0.m6534a((char) r1)
            if (r1 == 0) goto L_0x00de
            r16.mo5791s()
            r1 = 10
            goto L_0x0095
        L_0x00de:
            java.lang.String r1 = "Expected value"
            r0.m6538b((java.lang.String) r1)
            throw r14
        L_0x00e4:
            r0.f4362m = r15
            return r15
        L_0x00e7:
            if (r3 != r15) goto L_0x00ef
            r0.f4362m = r12
            return r12
        L_0x00ec:
            r0.f4362m = r8
            return r8
        L_0x00ef:
            if (r3 == r15) goto L_0x00fb
            r1 = 2
            if (r3 != r1) goto L_0x00f5
            goto L_0x00fb
        L_0x00f5:
            java.lang.String r1 = "Unexpected value"
            r0.m6538b((java.lang.String) r1)
            throw r14
        L_0x00fb:
            r16.mo5791s()
            int r1 = r0.f4358i
            int r1 = r1 - r15
            r0.f4358i = r1
            r0.f4362m = r9
            return r9
        L_0x0106:
            r16.mo5791s()
            r0.f4362m = r4
            return r4
        L_0x010c:
            r1 = 9
            goto L_0x0095
        L_0x010f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x0117:
            int[] r1 = r0.f4366q
            int r2 = r0.f4367r
            int r2 = r2 - r15
            r1[r2] = r12
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r13) goto L_0x0138
            int r2 = r0.m6537b((boolean) r15)
            if (r2 == r11) goto L_0x0138
            if (r2 == r10) goto L_0x0135
            if (r2 != r1) goto L_0x012f
        L_0x012c:
            r1 = 2
            goto L_0x0095
        L_0x012f:
            java.lang.String r1 = "Unterminated object"
            r0.m6538b((java.lang.String) r1)
            throw r14
        L_0x0135:
            r16.mo5791s()
        L_0x0138:
            int r2 = r0.m6537b((boolean) r15)
            if (r2 == r6) goto L_0x0169
            if (r2 == r5) goto L_0x0162
            java.lang.String r4 = "Expected name"
            if (r2 == r1) goto L_0x015b
            r16.mo5791s()
            int r1 = r0.f4358i
            int r1 = r1 - r15
            r0.f4358i = r1
            char r1 = (char) r2
            boolean r1 = r0.m6534a((char) r1)
            if (r1 == 0) goto L_0x0157
            r1 = 14
            goto L_0x0095
        L_0x0157:
            r0.m6538b((java.lang.String) r4)
            throw r14
        L_0x015b:
            if (r3 == r13) goto L_0x015e
            goto L_0x012c
        L_0x015e:
            r0.m6538b((java.lang.String) r4)
            throw r14
        L_0x0162:
            r16.mo5791s()
            r1 = 12
            goto L_0x0095
        L_0x0169:
            r1 = 13
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: p054c.p083e.p104c.p111y.C1418a.mo5861c():int");
    }

    public void close() {
        this.f4362m = 0;
        this.f4366q[0] = 8;
        this.f4367r = 1;
        this.f4355f.close();
    }

    /* renamed from: d */
    public void mo5778d() {
        int i = this.f4362m;
        if (i == 0) {
            i = mo5861c();
        }
        if (i == 4) {
            this.f4367r--;
            int[] iArr = this.f4369t;
            int i2 = this.f4367r - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f4362m = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + mo5789q() + mo5863i());
    }

    /* renamed from: e */
    public void mo5779e() {
        int i = this.f4362m;
        if (i == 0) {
            i = mo5861c();
        }
        if (i == 2) {
            this.f4367r--;
            String[] strArr = this.f4368s;
            int i2 = this.f4367r;
            strArr[i2] = null;
            int[] iArr = this.f4369t;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f4362m = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + mo5789q() + mo5863i());
    }

    /* renamed from: f */
    public String mo5780f() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.f4367r;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f4366q[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f4369t[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f4368s;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: g */
    public boolean mo5781g() {
        int i = this.f4362m;
        if (i == 0) {
            i = mo5861c();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: h */
    public final boolean mo5862h() {
        return this.f4356g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public String mo5863i() {
        return " at line " + (this.f4360k + 1) + " column " + ((this.f4358i - this.f4361l) + 1) + " path " + mo5780f();
    }

    /* renamed from: j */
    public boolean mo5782j() {
        int i = this.f4362m;
        if (i == 0) {
            i = mo5861c();
        }
        if (i == 5) {
            this.f4362m = 0;
            int[] iArr = this.f4369t;
            int i2 = this.f4367r - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f4362m = 0;
            int[] iArr2 = this.f4369t;
            int i3 = this.f4367r - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + mo5789q() + mo5863i());
        }
    }

    /* renamed from: k */
    public double mo5783k() {
        String str;
        int i = this.f4362m;
        if (i == 0) {
            i = mo5861c();
        }
        if (i == 15) {
            this.f4362m = 0;
            int[] iArr = this.f4369t;
            int i2 = this.f4367r - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f4363n;
        }
        if (i == 16) {
            this.f4365p = new String(this.f4357h, this.f4358i, this.f4364o);
            this.f4358i += this.f4364o;
        } else {
            if (i == 8 || i == 9) {
                str = m6539b(i == 8 ? '\'' : '\"');
            } else if (i == 10) {
                str = m6544u();
            } else if (i != 11) {
                throw new IllegalStateException("Expected a double but was " + mo5789q() + mo5863i());
            }
            this.f4365p = str;
        }
        this.f4362m = 11;
        double parseDouble = Double.parseDouble(this.f4365p);
        if (this.f4356g || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f4365p = null;
            this.f4362m = 0;
            int[] iArr2 = this.f4369t;
            int i3 = this.f4367r - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        throw new C1422d("JSON forbids NaN and infinities: " + parseDouble + mo5863i());
    }

    /* renamed from: l */
    public int mo5784l() {
        String b;
        int i = this.f4362m;
        if (i == 0) {
            i = mo5861c();
        }
        if (i == 15) {
            long j = this.f4363n;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f4362m = 0;
                int[] iArr = this.f4369t;
                int i3 = this.f4367r - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f4363n + mo5863i());
        }
        if (i == 16) {
            this.f4365p = new String(this.f4357h, this.f4358i, this.f4364o);
            this.f4358i += this.f4364o;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                b = m6544u();
            } else {
                b = m6539b(i == 8 ? '\'' : '\"');
            }
            this.f4365p = b;
            try {
                int parseInt = Integer.parseInt(this.f4365p);
                this.f4362m = 0;
                int[] iArr2 = this.f4369t;
                int i4 = this.f4367r - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + mo5789q() + mo5863i());
        }
        this.f4362m = 11;
        double parseDouble = Double.parseDouble(this.f4365p);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f4365p = null;
            this.f4362m = 0;
            int[] iArr3 = this.f4369t;
            int i6 = this.f4367r - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f4365p + mo5863i());
    }

    /* renamed from: m */
    public long mo5785m() {
        String b;
        int i = this.f4362m;
        if (i == 0) {
            i = mo5861c();
        }
        if (i == 15) {
            this.f4362m = 0;
            int[] iArr = this.f4369t;
            int i2 = this.f4367r - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f4363n;
        }
        if (i == 16) {
            this.f4365p = new String(this.f4357h, this.f4358i, this.f4364o);
            this.f4358i += this.f4364o;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                b = m6544u();
            } else {
                b = m6539b(i == 8 ? '\'' : '\"');
            }
            this.f4365p = b;
            try {
                long parseLong = Long.parseLong(this.f4365p);
                this.f4362m = 0;
                int[] iArr2 = this.f4369t;
                int i3 = this.f4367r - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + mo5789q() + mo5863i());
        }
        this.f4362m = 11;
        double parseDouble = Double.parseDouble(this.f4365p);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f4365p = null;
            this.f4362m = 0;
            int[] iArr3 = this.f4369t;
            int i4 = this.f4367r - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f4365p + mo5863i());
    }

    /* renamed from: n */
    public String mo5786n() {
        String str;
        char c;
        int i = this.f4362m;
        if (i == 0) {
            i = mo5861c();
        }
        if (i == 14) {
            str = m6544u();
        } else {
            if (i == 12) {
                c = '\'';
            } else if (i == 13) {
                c = '\"';
            } else {
                throw new IllegalStateException("Expected a name but was " + mo5789q() + mo5863i());
            }
            str = m6539b(c);
        }
        this.f4362m = 0;
        this.f4368s[this.f4367r - 1] = str;
        return str;
    }

    /* renamed from: o */
    public void mo5787o() {
        int i = this.f4362m;
        if (i == 0) {
            i = mo5861c();
        }
        if (i == 7) {
            this.f4362m = 0;
            int[] iArr = this.f4369t;
            int i2 = this.f4367r - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo5789q() + mo5863i());
    }

    /* renamed from: p */
    public String mo5788p() {
        String str;
        char c;
        int i = this.f4362m;
        if (i == 0) {
            i = mo5861c();
        }
        if (i == 10) {
            str = m6544u();
        } else {
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = '\"';
            } else if (i == 11) {
                str = this.f4365p;
                this.f4365p = null;
            } else if (i == 15) {
                str = Long.toString(this.f4363n);
            } else if (i == 16) {
                str = new String(this.f4357h, this.f4358i, this.f4364o);
                this.f4358i += this.f4364o;
            } else {
                throw new IllegalStateException("Expected a string but was " + mo5789q() + mo5863i());
            }
            str = m6539b(c);
        }
        this.f4362m = 0;
        int[] iArr = this.f4369t;
        int i2 = this.f4367r - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: q */
    public C1420b mo5789q() {
        int i = this.f4362m;
        if (i == 0) {
            i = mo5861c();
        }
        switch (i) {
            case 1:
                return C1420b.BEGIN_OBJECT;
            case 2:
                return C1420b.END_OBJECT;
            case 3:
                return C1420b.BEGIN_ARRAY;
            case 4:
                return C1420b.END_ARRAY;
            case 5:
            case 6:
                return C1420b.BOOLEAN;
            case 7:
                return C1420b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C1420b.STRING;
            case 12:
            case 13:
            case 14:
                return C1420b.NAME;
            case 15:
            case 16:
                return C1420b.NUMBER;
            case 17:
                return C1420b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: r */
    public void mo5790r() {
        char c;
        int i = 0;
        do {
            int i2 = this.f4362m;
            if (i2 == 0) {
                i2 = mo5861c();
            }
            if (i2 == 3) {
                m6540b(1);
            } else if (i2 == 1) {
                m6540b(3);
            } else if (i2 == 4 || i2 == 2) {
                this.f4367r--;
                i--;
                this.f4362m = 0;
            } else if (i2 == 14 || i2 == 10) {
                m6549z();
                this.f4362m = 0;
            } else {
                if (i2 == 8 || i2 == 12) {
                    c = '\'';
                } else if (i2 == 9 || i2 == 13) {
                    c = '\"';
                } else {
                    if (i2 == 16) {
                        this.f4358i += this.f4364o;
                    }
                    this.f4362m = 0;
                }
                m6541c(c);
                this.f4362m = 0;
            }
            i++;
            this.f4362m = 0;
        } while (i != 0);
        int[] iArr = this.f4369t;
        int i3 = this.f4367r;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f4368s[i3 - 1] = "null";
    }

    public String toString() {
        return getClass().getSimpleName() + mo5863i();
    }
}
