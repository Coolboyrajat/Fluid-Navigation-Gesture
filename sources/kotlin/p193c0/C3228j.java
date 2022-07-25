package kotlin.p193c0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C3269p;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.p208c0.C3362a;
import p190io.objectbox.android.BuildConfig;

/* renamed from: kotlin.c0.j */
class C3228j extends C3227i {

    /* renamed from: kotlin.c0.j$a */
    public static final class C3229a implements Iterable<T>, C3362a {

        /* renamed from: f */
        final /* synthetic */ C3221d f7958f;

        public C3229a(C3221d dVar) {
            this.f7958f = dVar;
        }

        public Iterator<T> iterator() {
            return this.f7958f.iterator();
        }
    }

    /* renamed from: kotlin.c0.j$b */
    static final class C3230b extends C3371l implements C3350b<T, Boolean> {

        /* renamed from: g */
        public static final C3230b f7959g = new C3230b();

        C3230b() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m11891a(T t) {
            return t == null;
        }
    }

    /* renamed from: kotlin.c0.j$c */
    static final class C3231c extends C3371l implements C3350b<C3221d<? extends R>, Iterator<? extends R>> {

        /* renamed from: g */
        public static final C3231c f7960g = new C3231c();

        C3231c() {
            super(1);
        }

        /* renamed from: a */
        public final Iterator<R> mo5146a(C3221d<? extends R> dVar) {
            C3370k.m12227b(dVar, "it");
            return dVar.iterator();
        }
    }

    /* renamed from: a */
    public static final <T, A extends Appendable> A m11877a(C3221d<? extends T> dVar, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3350b<? super T, ? extends CharSequence> bVar) {
        C3370k.m12227b(dVar, "$this$joinTo");
        C3370k.m12227b(a, "buffer");
        C3370k.m12227b(charSequence, "separator");
        C3370k.m12227b(charSequence2, "prefix");
        C3370k.m12227b(charSequence3, "postfix");
        C3370k.m12227b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : dVar) {
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
    public static final <T> String m11878a(C3221d<? extends T> dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3350b<? super T, ? extends CharSequence> bVar) {
        C3370k.m12227b(dVar, "$this$joinToString");
        C3370k.m12227b(charSequence, "separator");
        C3370k.m12227b(charSequence2, "prefix");
        C3370k.m12227b(charSequence3, "postfix");
        C3370k.m12227b(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        m11877a(dVar, sb, charSequence, charSequence2, charSequence3, i, charSequence4, bVar);
        String sb2 = sb.toString();
        C3370k.m12223a((Object) sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: a */
    public static /* synthetic */ String m11879a(C3221d dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3350b bVar, int i2, Object obj) {
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
        return m11878a(dVar, charSequence, charSequence6, charSequence5, i4, charSequence7, bVar);
    }

    /* renamed from: a */
    public static final <T, C extends Collection<? super T>> C m11880a(C3221d<? extends T> dVar, C c) {
        C3370k.m12227b(dVar, "$this$toCollection");
        C3370k.m12227b(c, "destination");
        for (Object add : dVar) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: a */
    public static <T> C3221d<T> m11881a(C3221d<? extends T> dVar, C3350b<? super T, Boolean> bVar) {
        C3370k.m12227b(dVar, "$this$filter");
        C3370k.m12227b(bVar, "predicate");
        return new C3217b(dVar, true, bVar);
    }

    /* renamed from: b */
    public static <T> Iterable<T> m11882b(C3221d<? extends T> dVar) {
        C3370k.m12227b(dVar, "$this$asIterable");
        return new C3229a(dVar);
    }

    /* renamed from: b */
    public static final <T> C3221d<T> m11883b(C3221d<? extends T> dVar, C3350b<? super T, Boolean> bVar) {
        C3370k.m12227b(dVar, "$this$filterNot");
        C3370k.m12227b(bVar, "predicate");
        return new C3217b(dVar, false, bVar);
    }

    /* renamed from: c */
    public static final <T> C3221d<T> m11884c(C3221d<? extends T> dVar) {
        C3370k.m12227b(dVar, "$this$filterNotNull");
        C3221d<T> b = m11883b(dVar, C3230b.f7959g);
        if (b != null) {
            return b;
        }
        throw new C3269p("null cannot be cast to non-null type kotlin.sequences.Sequence<T>");
    }

    /* renamed from: c */
    public static <T, R> C3221d<R> m11885c(C3221d<? extends T> dVar, C3350b<? super T, ? extends C3221d<? extends R>> bVar) {
        C3370k.m12227b(dVar, "$this$flatMap");
        C3370k.m12227b(bVar, "transform");
        return new C3219c(dVar, bVar, C3231c.f7960g);
    }

    /* renamed from: d */
    public static <T> List<T> m11886d(C3221d<? extends T> dVar) {
        C3370k.m12227b(dVar, "$this$toList");
        return C3284j.m12069b(m11888e(dVar));
    }

    /* renamed from: d */
    public static <T, R> C3221d<R> m11887d(C3221d<? extends T> dVar, C3350b<? super T, ? extends R> bVar) {
        C3370k.m12227b(dVar, "$this$map");
        C3370k.m12227b(bVar, "transform");
        return new C3232k(dVar, bVar);
    }

    /* renamed from: e */
    public static final <T> List<T> m11888e(C3221d<? extends T> dVar) {
        C3370k.m12227b(dVar, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        m11880a(dVar, arrayList);
        return arrayList;
    }

    /* renamed from: e */
    public static <T, R> C3221d<R> m11889e(C3221d<? extends T> dVar, C3350b<? super T, ? extends R> bVar) {
        C3370k.m12227b(dVar, "$this$mapNotNull");
        C3370k.m12227b(bVar, "transform");
        return m11884c(new C3232k(dVar, bVar));
    }
}
