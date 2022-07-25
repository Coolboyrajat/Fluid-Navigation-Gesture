package kotlin.p195s;

import java.util.Collection;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.s.o */
class C3289o extends C3288n {
    /* renamed from: a */
    public static <T> boolean m12079a(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C3370k.m12227b(collection, "$this$addAll");
        C3370k.m12227b(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static <T> boolean m12080a(Collection<? super T> collection, T[] tArr) {
        C3370k.m12227b(collection, "$this$addAll");
        C3370k.m12227b(tArr, "elements");
        return collection.addAll(C3279e.m12009a(tArr));
    }
}
