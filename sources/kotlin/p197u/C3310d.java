package kotlin.p197u;

import kotlin.C3269p;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.u.d */
public interface C3310d extends C3314f.C3317b {

    /* renamed from: b */
    public static final C3312b f8000b = C3312b.f8001a;

    /* renamed from: kotlin.u.d$a */
    public static final class C3311a {
        /* renamed from: a */
        public static <E extends C3314f.C3317b> E m12128a(C3310d dVar, C3314f.C3319c<E> cVar) {
            C3370k.m12227b(cVar, "key");
            if (cVar != C3310d.f8000b) {
                return null;
            }
            if (dVar != null) {
                return dVar;
            }
            throw new C3269p("null cannot be cast to non-null type E");
        }

        /* renamed from: a */
        public static void m12129a(C3310d dVar, C3309c<?> cVar) {
            C3370k.m12227b(cVar, "continuation");
        }

        /* renamed from: b */
        public static C3314f m12130b(C3310d dVar, C3314f.C3319c<?> cVar) {
            C3370k.m12227b(cVar, "key");
            return cVar == C3310d.f8000b ? C3320g.f8003f : dVar;
        }
    }

    /* renamed from: kotlin.u.d$b */
    public static final class C3312b implements C3314f.C3319c<C3310d> {

        /* renamed from: a */
        static final /* synthetic */ C3312b f8001a = new C3312b();

        private C3312b() {
        }
    }

    /* renamed from: a */
    void mo10040a(C3309c<?> cVar);

    /* renamed from: b */
    <T> C3309c<T> mo10041b(C3309c<? super T> cVar);
}
