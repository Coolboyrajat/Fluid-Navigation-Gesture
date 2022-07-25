package kotlin.p195s;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.s.j */
class C3284j extends C3283i {
    /* renamed from: a */
    public static final <T> int m12066a(List<? extends T> list) {
        C3370k.m12227b(list, "$this$lastIndex");
        return list.size() - 1;
    }

    /* renamed from: a */
    public static final <T> Collection<T> m12067a(T[] tArr) {
        C3370k.m12227b(tArr, "$this$asCollection");
        return new C3272a(tArr, false);
    }

    /* renamed from: a */
    public static <T> List<T> m12068a() {
        return C3295t.f7995f;
    }

    /* renamed from: b */
    public static <T> List<T> m12069b(List<? extends T> list) {
        C3370k.m12227b(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C3283i.m12064a(list.get(0)) : m12068a();
    }

    /* renamed from: b */
    public static <T> List<T> m12070b(T... tArr) {
        C3370k.m12227b(tArr, "elements");
        return tArr.length > 0 ? C3279e.m12009a(tArr) : m12068a();
    }

    /* renamed from: b */
    public static void m12071b() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: c */
    public static <T> List<T> m12072c(T... tArr) {
        C3370k.m12227b(tArr, "elements");
        return C3280f.m12026c(tArr);
    }

    /* renamed from: c */
    public static void m12073c() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* renamed from: d */
    public static <T> List<T> m12074d(T... tArr) {
        C3370k.m12227b(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C3272a(tArr, true));
    }
}
