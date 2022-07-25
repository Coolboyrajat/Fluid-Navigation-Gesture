package kotlin.p195s;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.s.k */
class C3285k extends C3284j {
    /* renamed from: a */
    public static <T> int m12075a(Iterable<? extends T> iterable, int i) {
        C3370k.m12227b(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    /* renamed from: a */
    public static <T> List<T> m12076a(Iterable<? extends Iterable<? extends T>> iterable) {
        C3370k.m12227b(iterable, "$this$flatten");
        ArrayList arrayList = new ArrayList();
        for (Iterable a : iterable) {
            boolean unused = C3289o.m12079a(arrayList, a);
        }
        return arrayList;
    }
}
