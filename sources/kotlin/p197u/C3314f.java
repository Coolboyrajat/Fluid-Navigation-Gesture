package kotlin.p197u;

import kotlin.C3269p;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;

/* renamed from: kotlin.u.f */
public interface C3314f {

    /* renamed from: kotlin.u.f$a */
    public static final class C3315a {

        /* renamed from: kotlin.u.f$a$a */
        static final class C3316a extends C3371l implements C3351c<C3314f, C3317b, C3314f> {

            /* renamed from: g */
            public static final C3316a f8002g = new C3316a();

            C3316a() {
                super(2);
            }

            /* renamed from: a */
            public final C3314f mo6125a(C3314f fVar, C3317b bVar) {
                C3370k.m12227b(fVar, "acc");
                C3370k.m12227b(bVar, "element");
                C3314f minusKey = fVar.minusKey(bVar.getKey());
                if (minusKey == C3320g.f8003f) {
                    return bVar;
                }
                C3310d dVar = (C3310d) minusKey.get(C3310d.f8000b);
                if (dVar == null) {
                    return new C3307b(minusKey, bVar);
                }
                C3314f minusKey2 = minusKey.minusKey(C3310d.f8000b);
                return minusKey2 == C3320g.f8003f ? new C3307b(bVar, dVar) : new C3307b(new C3307b(minusKey2, bVar), dVar);
            }
        }

        /* renamed from: a */
        public static C3314f m12132a(C3314f fVar, C3314f fVar2) {
            C3370k.m12227b(fVar2, "context");
            return fVar2 == C3320g.f8003f ? fVar : (C3314f) fVar2.fold(fVar, C3316a.f8002g);
        }
    }

    /* renamed from: kotlin.u.f$b */
    public interface C3317b extends C3314f {

        /* renamed from: kotlin.u.f$b$a */
        public static final class C3318a {
            /* renamed from: a */
            public static <R> R m12135a(C3317b bVar, R r, C3351c<? super R, ? super C3317b, ? extends R> cVar) {
                C3370k.m12227b(cVar, "operation");
                return cVar.mo6125a(r, bVar);
            }

            /* renamed from: a */
            public static <E extends C3317b> E m12136a(C3317b bVar, C3319c<E> cVar) {
                C3370k.m12227b(cVar, "key");
                if (!C3370k.m12225a((Object) bVar.getKey(), (Object) cVar)) {
                    return null;
                }
                if (bVar != null) {
                    return bVar;
                }
                throw new C3269p("null cannot be cast to non-null type E");
            }

            /* renamed from: a */
            public static C3314f m12137a(C3317b bVar, C3314f fVar) {
                C3370k.m12227b(fVar, "context");
                return C3315a.m12132a(bVar, fVar);
            }

            /* renamed from: b */
            public static C3314f m12138b(C3317b bVar, C3319c<?> cVar) {
                C3370k.m12227b(cVar, "key");
                return C3370k.m12225a((Object) bVar.getKey(), (Object) cVar) ? C3320g.f8003f : bVar;
            }
        }

        <E extends C3317b> E get(C3319c<E> cVar);

        C3319c<?> getKey();
    }

    /* renamed from: kotlin.u.f$c */
    public interface C3319c<E extends C3317b> {
    }

    <R> R fold(R r, C3351c<? super R, ? super C3317b, ? extends R> cVar);

    <E extends C3317b> E get(C3319c<E> cVar);

    C3314f minusKey(C3319c<?> cVar);

    C3314f plus(C3314f fVar);
}
