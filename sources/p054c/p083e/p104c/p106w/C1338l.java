package p054c.p083e.p104c.p106w;

import java.io.Writer;
import p054c.p083e.p104c.C1282j;
import p054c.p083e.p104c.p106w.p107n.C1374n;
import p054c.p083e.p104c.p111y.C1421c;

/* renamed from: c.e.c.w.l */
public final class C1338l {

    /* renamed from: c.e.c.w.l$a */
    private static final class C1339a extends Writer {

        /* renamed from: f */
        private final Appendable f4212f;

        /* renamed from: g */
        private final C1340a f4213g = new C1340a();

        /* renamed from: c.e.c.w.l$a$a */
        static class C1340a implements CharSequence {

            /* renamed from: f */
            char[] f4214f;

            C1340a() {
            }

            public char charAt(int i) {
                return this.f4214f[i];
            }

            public int length() {
                return this.f4214f.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f4214f, i, i2 - i);
            }
        }

        C1339a(Appendable appendable) {
            this.f4212f = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int i) {
            this.f4212f.append((char) i);
        }

        public void write(char[] cArr, int i, int i2) {
            C1340a aVar = this.f4213g;
            aVar.f4214f = cArr;
            this.f4212f.append(aVar, i, i2 + i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new p054c.p083e.p104c.C1283k((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new p054c.p083e.p104c.C1290r((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return p054c.p083e.p104c.C1284l.f4147a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new p054c.p083e.p104c.C1290r((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new p054c.p083e.p104c.C1290r((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: d (r2v4 'e' c.e.c.y.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p054c.p083e.p104c.C1282j m6285a(p054c.p083e.p104c.p111y.C1418a r2) {
        /*
            r2.mo5789q()     // Catch:{ EOFException -> 0x0024, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            c.e.c.t<c.e.c.j> r1 = p054c.p083e.p104c.p106w.p107n.C1374n.f4301X     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.mo5644a((p054c.p083e.p104c.p111y.C1418a) r2)     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            c.e.c.j r2 = (p054c.p083e.p104c.C1282j) r2     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            c.e.c.r r0 = new c.e.c.r
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            c.e.c.k r0 = new c.e.c.k
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            c.e.c.r r0 = new c.e.c.r
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            c.e.c.l r2 = p054c.p083e.p104c.C1284l.f4147a
            return r2
        L_0x002b:
            c.e.c.r r0 = new c.e.c.r
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p054c.p083e.p104c.p106w.C1338l.m6285a(c.e.c.y.a):c.e.c.j");
    }

    /* renamed from: a */
    public static Writer m6286a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C1339a(appendable);
    }

    /* renamed from: a */
    public static void m6287a(C1282j jVar, C1421c cVar) {
        C1374n.f4301X.mo5646a(cVar, jVar);
    }
}
