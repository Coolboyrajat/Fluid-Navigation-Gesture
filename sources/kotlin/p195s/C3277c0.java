package kotlin.p195s;

import java.util.Set;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.s.c0 */
class C3277c0 extends C3275b0 {
    /* renamed from: a */
    public static final <T> Set<T> m12007a() {
        return C3296u.f7996f;
    }

    /* renamed from: a */
    public static final <T> Set<T> m12008a(Set<? extends T> set) {
        C3370k.m12227b(set, "$this$optimizeReadOnlySet");
        int size = set.size();
        return size != 0 ? size != 1 ? set : C3275b0.m12006a(set.iterator().next()) : m12007a();
    }
}
