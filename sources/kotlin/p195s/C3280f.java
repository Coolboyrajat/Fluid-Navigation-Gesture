package kotlin.p195s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.p191a0.C3193d;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.BuildConfig;

/* renamed from: kotlin.s.f */
class C3280f extends C3279e {
    /* renamed from: a */
    public static char m12016a(char[] cArr) {
        C3370k.m12227b(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: a */
    public static final <T, A extends Appendable> A m12017a(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3350b<? super T, ? extends CharSequence> bVar) {
        C3370k.m12227b(tArr, "$this$joinTo");
        C3370k.m12227b(a, "buffer");
        C3370k.m12227b(charSequence, "separator");
        C3370k.m12227b(charSequence2, "prefix");
        C3370k.m12227b(charSequence3, "postfix");
        C3370k.m12227b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C3247k.m11921a(a, t, bVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: a */
    public static final <T> String m12018a(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3350b<? super T, ? extends CharSequence> bVar) {
        C3370k.m12227b(tArr, "$this$joinToString");
        C3370k.m12227b(charSequence, "separator");
        C3370k.m12227b(charSequence2, "prefix");
        C3370k.m12227b(charSequence3, "postfix");
        C3370k.m12227b(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        m12017a(tArr, sb, charSequence, charSequence2, charSequence3, i, charSequence4, bVar);
        String sb2 = sb.toString();
        C3370k.m12223a((Object) sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: a */
    public static /* synthetic */ String m12019a(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3350b bVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        int i3 = i2 & 2;
        CharSequence charSequence5 = BuildConfig.FLAVOR;
        CharSequence charSequence6 = i3 != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i4 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            bVar = null;
        }
        return m12018a(objArr, charSequence, charSequence6, charSequence5, i4, charSequence7, bVar);
    }

    /* renamed from: a */
    public static final <C extends Collection<? super T>, T> C m12020a(T[] tArr, C c) {
        C3370k.m12227b(tArr, "$this$filterNotNullTo");
        C3370k.m12227b(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    /* renamed from: b */
    public static boolean m12021b(int[] iArr, int i) {
        C3370k.m12227b(iArr, "$this$contains");
        return m12024c(iArr, i) >= 0;
    }

    /* renamed from: b */
    public static <T> boolean m12022b(T[] tArr, T t) {
        C3370k.m12227b(tArr, "$this$contains");
        return m12025c(tArr, t) >= 0;
    }

    /* renamed from: b */
    public static final <T> T[] m12023b(T[] tArr, Comparator<? super T> comparator) {
        C3370k.m12227b(tArr, "$this$sortedArrayWith");
        C3370k.m12227b(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        C3370k.m12223a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        C3279e.m12010a(copyOf, comparator);
        return copyOf;
    }

    /* renamed from: c */
    public static final int m12024c(int[] iArr, int i) {
        C3370k.m12227b(iArr, "$this$indexOf");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static final <T> int m12025c(T[] tArr, T t) {
        C3370k.m12227b(tArr, "$this$indexOf");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (C3370k.m12225a((Object) t, (Object) tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: c */
    public static final <T> List<T> m12026c(T[] tArr) {
        C3370k.m12227b(tArr, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        m12020a(tArr, arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static <T> List<T> m12027c(T[] tArr, Comparator<? super T> comparator) {
        C3370k.m12227b(tArr, "$this$sortedWith");
        C3370k.m12227b(comparator, "comparator");
        return C3279e.m12009a(m12023b(tArr, comparator));
    }

    /* renamed from: d */
    public static <T> C3193d m12028d(T[] tArr) {
        C3370k.m12227b(tArr, "$this$indices");
        return new C3193d(0, m12029e(tArr));
    }

    /* renamed from: e */
    public static final <T> int m12029e(T[] tArr) {
        C3370k.m12227b(tArr, "$this$lastIndex");
        return tArr.length - 1;
    }

    /* renamed from: f */
    public static <T> List<T> m12030f(T[] tArr) {
        C3370k.m12227b(tArr, "$this$reversed");
        if (tArr.length == 0) {
            return C3284j.m12068a();
        }
        List<T> i = m12033i(tArr);
        C3291q.m12081d(i);
        return i;
    }

    /* renamed from: g */
    public static <T> T m12031g(T[] tArr) {
        C3370k.m12227b(tArr, "$this$singleOrNull");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: h */
    public static <T> List<T> m12032h(T[] tArr) {
        C3370k.m12227b(tArr, "$this$toList");
        int length = tArr.length;
        return length != 0 ? length != 1 ? m12033i(tArr) : C3283i.m12064a(tArr[0]) : C3284j.m12068a();
    }

    /* renamed from: i */
    public static <T> List<T> m12033i(T[] tArr) {
        C3370k.m12227b(tArr, "$this$toMutableList");
        return new ArrayList(C3284j.m12067a(tArr));
    }
}
