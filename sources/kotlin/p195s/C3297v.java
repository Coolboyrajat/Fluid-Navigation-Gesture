package kotlin.p195s;

import java.util.Iterator;
import kotlin.p205x.p207d.p208c0.C3362a;

/* renamed from: kotlin.s.v */
public abstract class C3297v implements Iterator<Integer>, C3362a {
    /* renamed from: a */
    public abstract int mo9906a();

    public final Integer next() {
        return Integer.valueOf(mo9906a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
