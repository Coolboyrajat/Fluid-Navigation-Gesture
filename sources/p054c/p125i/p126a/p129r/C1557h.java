package p054c.p125i.p126a.p129r;

import java.util.Comparator;
import p054c.p125i.p126a.C1535i;
import p054c.p125i.p126a.C1543o;
import p155d.p156a.C2783a;
import p155d.p156a.C2786d;
import p155d.p156a.C2790h;
import p155d.p156a.p162q.C2827e;

/* renamed from: c.i.a.r.h */
public final class C1557h {

    /* renamed from: a */
    private static final Comparator<Comparable<Object>> f4592a = C1552c.f4591f;

    /* renamed from: a */
    public static <E> C2786d m6856a(C1556g<E> gVar) {
        return m6857a(gVar, true);
    }

    /* renamed from: a */
    public static <E> C2786d m6857a(C1556g<E> gVar, boolean z) {
        E a = gVar.mo6045a();
        C1553d<E> c = gVar.mo6046c();
        if (a != null) {
            try {
                return m6858a(gVar.mo6047d(), c.mo6044a(a));
            } catch (Exception e) {
                if (!z || !(e instanceof C1554e)) {
                    return C2783a.m10978a((Throwable) e);
                }
                C2827e<? super C1543o> b = C1535i.m6828b();
                if (b != null) {
                    try {
                        b.accept((C1554e) e);
                        return C2783a.m10977a();
                    } catch (Exception e2) {
                        return C2783a.m10978a((Throwable) e2);
                    }
                } else {
                    throw e;
                }
            }
        } else {
            throw new C1555f();
        }
    }

    /* renamed from: a */
    public static <E> C2786d m6858a(C2790h<E> hVar, E e) {
        return m6859a(hVar, e, e instanceof Comparable ? f4592a : null);
    }

    /* renamed from: a */
    public static <E> C2786d m6859a(C2790h<E> hVar, E e, Comparator<E> comparator) {
        return hVar.mo8919b(1).mo8925b(comparator != null ? new C1550a(comparator, e) : new C1551b(e)).mo8918b();
    }

    /* renamed from: a */
    static /* synthetic */ boolean m6861a(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj2, obj) >= 0;
    }
}
