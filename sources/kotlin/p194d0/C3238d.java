package kotlin.p194d0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C3261j;
import kotlin.C3269p;
import kotlin.p191a0.C3193d;
import kotlin.p193c0.C3221d;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.p208c0.C3362a;

/* renamed from: kotlin.d0.d */
final class C3238d implements C3221d<C3193d> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f7966a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f7967b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f7968c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3351c<CharSequence, Integer, C3261j<Integer, Integer>> f7969d;

    /* renamed from: kotlin.d0.d$a */
    public static final class C3239a implements Iterator<C3193d>, C3362a {

        /* renamed from: f */
        private int f7970f = -1;

        /* renamed from: g */
        private int f7971g;

        /* renamed from: h */
        private int f7972h;

        /* renamed from: i */
        private C3193d f7973i;

        /* renamed from: j */
        private int f7974j;

        /* renamed from: k */
        final /* synthetic */ C3238d f7975k;

        C3239a(C3238d dVar) {
            this.f7975k = dVar;
            this.f7971g = C3198h.m11847a(dVar.f7967b, 0, dVar.f7966a.length());
            this.f7972h = this.f7971g;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
            if (r6.f7974j < kotlin.p194d0.C3238d.m11902c(r6.f7975k)) goto L_0x0025;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m11904a() {
            /*
                r6 = this;
                int r0 = r6.f7972h
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f7970f = r1
                r0 = 0
                r6.f7973i = r0
                goto L_0x009d
            L_0x000c:
                kotlin.d0.d r0 = r6.f7975k
                int r0 = r0.f7968c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0025
                int r0 = r6.f7974j
                int r0 = r0 + r3
                r6.f7974j = r0
                int r0 = r6.f7974j
                kotlin.d0.d r4 = r6.f7975k
                int r4 = r4.f7968c
                if (r0 >= r4) goto L_0x0033
            L_0x0025:
                int r0 = r6.f7972h
                kotlin.d0.d r4 = r6.f7975k
                java.lang.CharSequence r4 = r4.f7966a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0049
            L_0x0033:
                int r0 = r6.f7971g
                kotlin.a0.d r1 = new kotlin.a0.d
                kotlin.d0.d r4 = r6.f7975k
                java.lang.CharSequence r4 = r4.f7966a
                int r4 = kotlin.p194d0.C3251o.m11962c(r4)
                r1.<init>(r0, r4)
            L_0x0044:
                r6.f7973i = r1
            L_0x0046:
                r6.f7972h = r2
                goto L_0x009b
            L_0x0049:
                kotlin.d0.d r0 = r6.f7975k
                kotlin.x.c.c r0 = r0.f7969d
                kotlin.d0.d r4 = r6.f7975k
                java.lang.CharSequence r4 = r4.f7966a
                int r5 = r6.f7972h
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo6125a(r4, r5)
                kotlin.j r0 = (kotlin.C3261j) r0
                if (r0 != 0) goto L_0x0075
                int r0 = r6.f7971g
                kotlin.a0.d r1 = new kotlin.a0.d
                kotlin.d0.d r4 = r6.f7975k
                java.lang.CharSequence r4 = r4.f7966a
                int r4 = kotlin.p194d0.C3251o.m11962c(r4)
                r1.<init>(r0, r4)
                goto L_0x0044
            L_0x0075:
                java.lang.Object r2 = r0.mo9934a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo9935b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f7971g
                kotlin.a0.d r4 = kotlin.p191a0.C3198h.m11852d(r4, r2)
                r6.f7973i = r4
                int r2 = r2 + r0
                r6.f7971g = r2
                int r2 = r6.f7971g
                if (r0 != 0) goto L_0x0099
                r1 = 1
            L_0x0099:
                int r2 = r2 + r1
                goto L_0x0046
            L_0x009b:
                r6.f7970f = r3
            L_0x009d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p194d0.C3238d.C3239a.m11904a():void");
        }

        public boolean hasNext() {
            if (this.f7970f == -1) {
                m11904a();
            }
            return this.f7970f == 1;
        }

        public C3193d next() {
            if (this.f7970f == -1) {
                m11904a();
            }
            if (this.f7970f != 0) {
                C3193d dVar = this.f7973i;
                if (dVar != null) {
                    this.f7973i = null;
                    this.f7970f = -1;
                    return dVar;
                }
                throw new C3269p("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3238d(CharSequence charSequence, int i, int i2, C3351c<? super CharSequence, ? super Integer, C3261j<Integer, Integer>> cVar) {
        C3370k.m12227b(charSequence, "input");
        C3370k.m12227b(cVar, "getNextMatch");
        this.f7966a = charSequence;
        this.f7967b = i;
        this.f7968c = i2;
        this.f7969d = cVar;
    }

    public Iterator<C3193d> iterator() {
        return new C3239a(this);
    }
}
