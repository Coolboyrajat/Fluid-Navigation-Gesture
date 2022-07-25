package kotlin.p195s;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.s.n */
class C3288n extends C3287m {
    /* renamed from: a */
    public static final <T> void m12077a(List<T> list, Comparator<? super T> comparator) {
        C3370k.m12227b(list, "$this$sortWith");
        C3370k.m12227b(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: c */
    public static final <T extends Comparable<? super T>> void m12078c(List<T> list) {
        C3370k.m12227b(list, "$this$sort");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
