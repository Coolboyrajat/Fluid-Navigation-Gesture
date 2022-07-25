package kotlin.p197u.p198h;

import kotlin.C3265l;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p197u.C3320g;
import kotlin.p197u.p199i.p200a.C3327a;
import kotlin.p197u.p199i.p200a.C3330d;
import kotlin.p197u.p199i.p200a.C3334h;
import kotlin.p197u.p199i.p200a.C3337j;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3359b0;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.u.h.c */
class C3323c {

    /* renamed from: kotlin.u.h.c$a */
    public static final class C3324a extends C3337j {

        /* renamed from: g */
        private int f8006g;

        /* renamed from: h */
        final /* synthetic */ C3351c f8007h;

        /* renamed from: i */
        final /* synthetic */ Object f8008i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3324a(C3309c cVar, C3309c cVar2, C3351c cVar3, Object obj) {
            super(cVar2);
            this.f8007h = cVar3;
            this.f8008i = obj;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo6618b(Object obj) {
            int i = this.f8006g;
            if (i == 0) {
                this.f8006g = 1;
                C3265l.m11979a(obj);
                C3351c cVar = this.f8007h;
                if (cVar != null) {
                    C3359b0.m12198a((Object) cVar, 2);
                    return cVar.mo6125a(this.f8008i, this);
                }
                throw new C3269p("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f8006g = 2;
                C3265l.m11979a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: kotlin.u.h.c$b */
    public static final class C3325b extends C3330d {

        /* renamed from: i */
        private int f8009i;

        /* renamed from: j */
        final /* synthetic */ C3351c f8010j;

        /* renamed from: k */
        final /* synthetic */ Object f8011k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3325b(C3309c cVar, C3314f fVar, C3309c cVar2, C3314f fVar2, C3351c cVar3, Object obj) {
            super(cVar2, fVar2);
            this.f8010j = cVar3;
            this.f8011k = obj;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo6618b(Object obj) {
            int i = this.f8009i;
            if (i == 0) {
                this.f8009i = 1;
                C3265l.m11979a(obj);
                C3351c cVar = this.f8010j;
                if (cVar != null) {
                    C3359b0.m12198a((Object) cVar, 2);
                    return cVar.mo6125a(this.f8011k, this);
                }
                throw new C3269p("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f8009i = 2;
                C3265l.m11979a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: a */
    public static <T> C3309c<T> m12142a(C3309c<? super T> cVar) {
        C3309c<Object> f;
        C3370k.m12227b(cVar, "$this$intercepted");
        C3330d dVar = (C3330d) (!(cVar instanceof C3330d) ? null : cVar);
        return (dVar == null || (f = dVar.mo10051f()) == null) ? cVar : f;
    }

    /* renamed from: a */
    public static <R, T> C3309c<Unit> m12143a(C3351c<? super R, ? super C3309c<? super T>, ? extends Object> cVar, R r, C3309c<? super T> cVar2) {
        C3370k.m12227b(cVar, "$this$createCoroutineUnintercepted");
        C3370k.m12227b(cVar2, "completion");
        C3334h.m12172a(cVar2);
        if (cVar instanceof C3327a) {
            return ((C3327a) cVar).mo6617a(r, cVar2);
        }
        C3314f a = cVar2.mo10038a();
        if (a == C3320g.f8003f) {
            if (cVar2 != null) {
                return new C3324a(cVar2, cVar2, cVar, r);
            }
            throw new C3269p("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        } else if (cVar2 != null) {
            return new C3325b(cVar2, a, cVar2, a, cVar, r);
        } else {
            throw new C3269p("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }
    }
}
