package kotlin.p195s;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.s.i */
class C3283i {
    /* renamed from: a */
    public static <T> List<T> m12064a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C3370k.m12223a((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    /* renamed from: a */
    public static final <T> Object[] m12065a(T[] tArr, boolean z) {
        Class<Object[]> cls = Object[].class;
        C3370k.m12227b(tArr, "$this$copyToArrayOfAny");
        if (z && C3370k.m12225a((Object) tArr.getClass(), (Object) cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        C3370k.m12223a((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }
}
