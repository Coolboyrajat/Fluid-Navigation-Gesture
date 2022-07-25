package kotlin.p193c0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.p208c0.C3362a;

/* renamed from: kotlin.c0.c */
public final class C3219c<T, R, E> implements C3221d<E> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3221d<T> f7951a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3350b<T, R> f7952b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3350b<R, Iterator<E>> f7953c;

    /* renamed from: kotlin.c0.c$a */
    public static final class C3220a implements Iterator<E>, C3362a {

        /* renamed from: f */
        private final Iterator<T> f7954f;

        /* renamed from: g */
        private Iterator<? extends E> f7955g;

        /* renamed from: h */
        final /* synthetic */ C3219c f7956h;

        C3220a(C3219c cVar) {
            this.f7956h = cVar;
            this.f7954f = cVar.f7951a.iterator();
        }

        /* renamed from: a */
        private final boolean m11866a() {
            Iterator<? extends E> it = this.f7955g;
            if (it != null && !it.hasNext()) {
                this.f7955g = null;
            }
            while (true) {
                if (this.f7955g == null) {
                    if (this.f7954f.hasNext()) {
                        Iterator<? extends E> it2 = (Iterator) this.f7956h.f7953c.mo5146a(this.f7956h.f7952b.mo5146a(this.f7954f.next()));
                        if (it2.hasNext()) {
                            this.f7955g = it2;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        public boolean hasNext() {
            return m11866a();
        }

        public E next() {
            if (m11866a()) {
                Iterator<? extends E> it = this.f7955g;
                if (it != null) {
                    return it.next();
                }
                C3370k.m12221a();
                throw null;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3219c(C3221d<? extends T> dVar, C3350b<? super T, ? extends R> bVar, C3350b<? super R, ? extends Iterator<? extends E>> bVar2) {
        C3370k.m12227b(dVar, "sequence");
        C3370k.m12227b(bVar, "transformer");
        C3370k.m12227b(bVar2, "iterator");
        this.f7951a = dVar;
        this.f7952b = bVar;
        this.f7953c = bVar2;
    }

    public Iterator<E> iterator() {
        return new C3220a(this);
    }
}
