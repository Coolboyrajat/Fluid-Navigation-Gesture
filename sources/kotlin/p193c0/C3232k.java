package kotlin.p193c0;

import java.util.Iterator;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.p208c0.C3362a;

/* renamed from: kotlin.c0.k */
public final class C3232k<T, R> implements C3221d<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3221d<T> f7961a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3350b<T, R> f7962b;

    /* renamed from: kotlin.c0.k$a */
    public static final class C3233a implements Iterator<R>, C3362a {

        /* renamed from: f */
        private final Iterator<T> f7963f;

        /* renamed from: g */
        final /* synthetic */ C3232k f7964g;

        C3233a(C3232k kVar) {
            this.f7964g = kVar;
            this.f7963f = kVar.f7961a.iterator();
        }

        public boolean hasNext() {
            return this.f7963f.hasNext();
        }

        public R next() {
            return this.f7964g.f7962b.mo5146a(this.f7963f.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3232k(C3221d<? extends T> dVar, C3350b<? super T, ? extends R> bVar) {
        C3370k.m12227b(dVar, "sequence");
        C3370k.m12227b(bVar, "transformer");
        this.f7961a = dVar;
        this.f7962b = bVar;
    }

    public Iterator<R> iterator() {
        return new C3233a(this);
    }
}
