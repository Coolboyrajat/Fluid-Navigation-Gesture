package kotlin.p193c0;

import java.util.Iterator;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.c0.h */
class C3225h extends C3224g {

    /* renamed from: kotlin.c0.h$a */
    public static final class C3226a implements C3221d<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f7957a;

        public C3226a(Iterator it) {
            this.f7957a = it;
        }

        public Iterator<T> iterator() {
            return this.f7957a;
        }
    }

    /* renamed from: a */
    public static <T> C3221d<T> m11875a(Iterator<? extends T> it) {
        C3370k.m12227b(it, "$this$asSequence");
        return m11876a(new C3226a(it));
    }

    /* renamed from: a */
    public static final <T> C3221d<T> m11876a(C3221d<? extends T> dVar) {
        C3370k.m12227b(dVar, "$this$constrainOnce");
        return dVar instanceof C3216a ? dVar : new C3216a(dVar);
    }
}
