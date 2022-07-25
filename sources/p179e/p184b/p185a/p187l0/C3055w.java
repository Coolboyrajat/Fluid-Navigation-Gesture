package p179e.p184b.p185a.p187l0;

import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;

/* renamed from: e.b.a.l0.w */
public final class C3055w implements C3042n {

    /* renamed from: a */
    public static final C3055w f7804a = new C3055w();

    /* renamed from: e.b.a.l0.w$a */
    static final class C3056a extends C3371l implements C3349a<T> {

        /* renamed from: g */
        final /* synthetic */ Object f7805g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3056a(Object obj) {
            super(0);
            this.f7805g = obj;
        }

        public final T invoke() {
            return this.f7805g;
        }
    }

    private C3055w() {
    }

    /* renamed from: a */
    public <T> C3043o<T> mo9149a(C3349a<? extends T> aVar) {
        C3370k.m12227b(aVar, "creator");
        Object invoke = aVar.invoke();
        return new C3043o<>(invoke, new C3056a(invoke));
    }
}
