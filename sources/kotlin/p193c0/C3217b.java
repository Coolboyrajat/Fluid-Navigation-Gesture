package kotlin.p193c0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.p208c0.C3362a;

/* renamed from: kotlin.c0.b */
public final class C3217b<T> implements C3221d<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3221d<T> f7944a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f7945b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3350b<T, Boolean> f7946c;

    /* renamed from: kotlin.c0.b$a */
    public static final class C3218a implements Iterator<T>, C3362a {

        /* renamed from: f */
        private final Iterator<T> f7947f;

        /* renamed from: g */
        private int f7948g = -1;

        /* renamed from: h */
        private T f7949h;

        /* renamed from: i */
        final /* synthetic */ C3217b f7950i;

        C3218a(C3217b bVar) {
            this.f7950i = bVar;
            this.f7947f = bVar.f7944a.iterator();
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m11862a() {
            /*
                r3 = this;
            L_0x0000:
                java.util.Iterator<T> r0 = r3.f7947f
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L_0x002c
                java.util.Iterator<T> r0 = r3.f7947f
                java.lang.Object r0 = r0.next()
                kotlin.c0.b r1 = r3.f7950i
                kotlin.x.c.b r1 = r1.f7946c
                java.lang.Object r1 = r1.mo5146a(r0)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                kotlin.c0.b r2 = r3.f7950i
                boolean r2 = r2.f7945b
                if (r1 != r2) goto L_0x0000
                r3.f7949h = r0
                r0 = 1
            L_0x0029:
                r3.f7948g = r0
                return
            L_0x002c:
                r0 = 0
                goto L_0x0029
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p193c0.C3217b.C3218a.m11862a():void");
        }

        public boolean hasNext() {
            if (this.f7948g == -1) {
                m11862a();
            }
            return this.f7948g == 1;
        }

        public T next() {
            if (this.f7948g == -1) {
                m11862a();
            }
            if (this.f7948g != 0) {
                T t = this.f7949h;
                this.f7949h = null;
                this.f7948g = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3217b(C3221d<? extends T> dVar, boolean z, C3350b<? super T, Boolean> bVar) {
        C3370k.m12227b(dVar, "sequence");
        C3370k.m12227b(bVar, "predicate");
        this.f7944a = dVar;
        this.f7945b = z;
        this.f7946c = bVar;
    }

    public Iterator<T> iterator() {
        return new C3218a(this);
    }
}
