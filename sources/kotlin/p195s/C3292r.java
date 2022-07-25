package kotlin.p195s;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.C3269p;
import kotlin.p193c0.C3221d;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.BuildConfig;

/* renamed from: kotlin.s.r */
class C3292r extends C3291q {

    /* renamed from: kotlin.s.r$a */
    public static final class C3293a implements C3221d<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f7993a;

        public C3293a(Iterable iterable) {
            this.f7993a = iterable;
        }

        public Iterator<T> iterator() {
            return this.f7993a.iterator();
        }
    }

    /* renamed from: a */
    public static <T> int m12082a(List<? extends T> list, T t) {
        C3370k.m12227b(list, "$this$indexOf");
        return list.indexOf(t);
    }

    /* renamed from: a */
    public static final <T, A extends Appendable> A m12083a(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3350b<? super T, ? extends CharSequence> bVar) {
        C3370k.m12227b(iterable, "$this$joinTo");
        C3370k.m12227b(a, "buffer");
        C3370k.m12227b(charSequence, "separator");
        C3370k.m12227b(charSequence2, "prefix");
        C3370k.m12227b(charSequence3, "postfix");
        C3370k.m12227b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C3247k.m11921a(a, next, bVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: a */
    public static <T> T m12084a(List<? extends T> list, int i) {
        C3370k.m12227b(list, "$this$getOrNull");
        if (i < 0 || i > C3284j.m12066a(list)) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: a */
    public static final <T> String m12085a(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3350b<? super T, ? extends CharSequence> bVar) {
        C3370k.m12227b(iterable, "$this$joinToString");
        C3370k.m12227b(charSequence, "separator");
        C3370k.m12227b(charSequence2, "prefix");
        C3370k.m12227b(charSequence3, "postfix");
        C3370k.m12227b(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        m12083a(iterable, sb, charSequence, charSequence2, charSequence3, i, charSequence4, bVar);
        String sb2 = sb.toString();
        C3370k.m12223a((Object) sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: a */
    public static /* synthetic */ String m12086a(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3350b bVar, int i2, Object obj) {
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
        return m12085a(iterable, charSequence, charSequence6, charSequence5, i4, charSequence7, bVar);
    }

    /* renamed from: a */
    public static final <C extends Collection<? super T>, T> C m12087a(Iterable<? extends T> iterable, C c) {
        C3370k.m12227b(iterable, "$this$filterNotNullTo");
        C3370k.m12227b(c, "destination");
        for (Object next : iterable) {
            if (next != null) {
                c.add(next);
            }
        }
        return c;
    }

    /* renamed from: a */
    public static <T> List<T> m12088a(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C3370k.m12227b(iterable, "$this$sortedWith");
        C3370k.m12227b(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m12104g(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            if (array == null) {
                throw new C3269p("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (array != null) {
                C3279e.m12010a((T[]) array, comparator);
                return C3279e.m12009a(array);
            } else {
                throw new C3269p("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            List<T> h = m12105h(iterable);
            C3288n.m12077a(h, comparator);
            return h;
        }
    }

    /* renamed from: a */
    public static <T> List<T> m12089a(Collection<? extends T> collection, T t) {
        C3370k.m12227b(collection, "$this$plus");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: a */
    public static <T> boolean m12090a(Iterable<? extends T> iterable, T t) {
        C3370k.m12227b(iterable, "$this$contains");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t) : m12092b(iterable, t) >= 0;
    }

    /* renamed from: a */
    public static int[] m12091a(Collection<Integer> collection) {
        C3370k.m12227b(collection, "$this$toIntArray");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer intValue : collection) {
            iArr[i] = intValue.intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: b */
    public static final <T> int m12092b(Iterable<? extends T> iterable, T t) {
        C3370k.m12227b(iterable, "$this$indexOf");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (Object next : iterable) {
            if (i < 0) {
                C3282h.m12055c();
                throw null;
            } else if (C3370k.m12225a((Object) t, (Object) next)) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static final <T, C extends Collection<? super T>> C m12093b(Iterable<? extends T> iterable, C c) {
        C3370k.m12227b(iterable, "$this$toCollection");
        C3370k.m12227b(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: b */
    public static <T> List<T> m12094b(Collection<? extends T> collection) {
        C3370k.m12227b(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }

    /* renamed from: b */
    public static <T> List<T> m12095b(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C3370k.m12227b(collection, "$this$plus");
        C3370k.m12227b(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        boolean unused = C3289o.m12079a(arrayList2, iterable);
        return arrayList2;
    }

    /* renamed from: b */
    public static final <T> C3221d<T> m12096b(Iterable<? extends T> iterable) {
        C3370k.m12227b(iterable, "$this$asSequence");
        return new C3293a(iterable);
    }

    /* renamed from: c */
    public static <T> List<T> m12097c(Iterable<? extends T> iterable) {
        C3370k.m12227b(iterable, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        m12087a(iterable, arrayList);
        return arrayList;
    }

    /* renamed from: d */
    public static <T> T m12098d(Iterable<? extends T> iterable) {
        C3370k.m12227b(iterable, "$this$single");
        if (iterable instanceof List) {
            return m12103g((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: e */
    public static <T> T m12099e(List<? extends T> list) {
        C3370k.m12227b(list, "$this$first");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: e */
    public static <T extends Comparable<? super T>> List<T> m12100e(Iterable<? extends T> iterable) {
        C3370k.m12227b(iterable, "$this$sorted");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m12104g(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            if (array == null) {
                throw new C3269p("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (array != null) {
                Comparable[] comparableArr = (Comparable[]) array;
                if (comparableArr != null) {
                    C3279e.m12015b(comparableArr);
                    return C3279e.m12009a(comparableArr);
                }
                throw new C3269p("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            } else {
                throw new C3269p("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            List<T> h = m12105h(iterable);
            C3288n.m12078c(h);
            return h;
        }
    }

    /* renamed from: f */
    public static int m12101f(Iterable<Integer> iterable) {
        C3370k.m12227b(iterable, "$this$sum");
        int i = 0;
        for (Integer intValue : iterable) {
            i += intValue.intValue();
        }
        return i;
    }

    /* renamed from: f */
    public static <T> T m12102f(List<? extends T> list) {
        C3370k.m12227b(list, "$this$firstOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: g */
    public static final <T> T m12103g(List<? extends T> list) {
        C3370k.m12227b(list, "$this$single");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* renamed from: g */
    public static <T> List<T> m12104g(Iterable<? extends T> iterable) {
        C3370k.m12227b(iterable, "$this$toList");
        if (!(iterable instanceof Collection)) {
            return C3284j.m12069b(m12105h(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C3284j.m12068a();
        }
        if (size != 1) {
            return m12094b(collection);
        }
        return C3283i.m12064a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: h */
    public static final <T> List<T> m12105h(Iterable<? extends T> iterable) {
        C3370k.m12227b(iterable, "$this$toMutableList");
        if (iterable instanceof Collection) {
            return m12094b((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m12093b(iterable, arrayList);
        return arrayList;
    }

    /* renamed from: i */
    public static <T> Set<T> m12106i(Iterable<? extends T> iterable) {
        C3370k.m12227b(iterable, "$this$toSet");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return C3277c0.m12007a();
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(C3301z.m12116a(collection.size()));
                m12093b(iterable, linkedHashSet);
                return linkedHashSet;
            }
            return C3275b0.m12006a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        m12093b(iterable, linkedHashSet2);
        return C3277c0.m12008a(linkedHashSet2);
    }
}
