package kotlin.p195s;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.s.e */
class C3279e extends C3278d {
    /* renamed from: a */
    public static <T> List<T> m12009a(T[] tArr) {
        C3370k.m12227b(tArr, "$this$asList");
        List<T> a = C3281g.m12034a(tArr);
        C3370k.m12223a((Object) a, "ArraysUtilJVM.asList(this)");
        return a;
    }

    /* renamed from: a */
    public static final <T> void m12010a(T[] tArr, Comparator<? super T> comparator) {
        C3370k.m12227b(tArr, "$this$sortWith");
        C3370k.m12227b(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    /* renamed from: a */
    public static int[] m12011a(int[] iArr, int i) {
        C3370k.m12227b(iArr, "$this$plus");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i;
        C3370k.m12223a((Object) copyOf, "result");
        return copyOf;
    }

    /* renamed from: a */
    public static <T> T[] m12012a(T[] tArr, T t) {
        C3370k.m12227b(tArr, "$this$plus");
        int length = tArr.length;
        T[] copyOf = Arrays.copyOf(tArr, length + 1);
        copyOf[length] = t;
        C3370k.m12223a((Object) copyOf, "result");
        return copyOf;
    }

    /* renamed from: a */
    public static final <T> T[] m12013a(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        C3370k.m12227b(tArr, "$this$copyInto");
        C3370k.m12227b(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    /* renamed from: a */
    public static /* synthetic */ Object[] m12014a(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        m12013a(objArr, objArr2, i, i2, i3);
        return objArr2;
    }

    /* renamed from: b */
    public static final <T> void m12015b(T[] tArr) {
        C3370k.m12227b(tArr, "$this$sort");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }
}
