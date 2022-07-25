package p179e.p184b.p185a;

import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p179e.p184b.p185a.C3059m;

/* renamed from: e.b.a.p */
public interface C3121p {

    /* renamed from: e.b.a.p$a */
    public interface C3122a {
    }

    /* renamed from: e.b.a.p$b */
    public static final class C3123b {

        /* renamed from: e.b.a.p$b$a */
        public static final class C3124a extends C3371l implements C3349a<T> {

            /* renamed from: g */
            final /* synthetic */ C3350b f7884g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3124a(C3350b bVar) {
                super(0);
                this.f7884g = bVar;
            }

            public final T invoke() {
                return this.f7884g.mo5146a(Unit.INSTANCE);
            }
        }

        /* renamed from: a */
        public static <C, T> C3349a<T> m11772a(C3121p pVar, C3059m.C3069f<? super C, ? super Unit, ? extends T> fVar, C c, int i) {
            C3370k.m12227b(fVar, "key");
            return new C3124a(m11773a(pVar, fVar, c, 0, 4, (Object) null));
        }

        /* renamed from: a */
        public static /* synthetic */ C3350b m11773a(C3121p pVar, C3059m.C3069f fVar, Object obj, int i, int i2, Object obj2) {
            if (obj2 == null) {
                if ((i2 & 4) != 0) {
                    i = 0;
                }
                return pVar.mo9196a(fVar, obj, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: factory");
        }

        /* renamed from: b */
        public static /* synthetic */ C3349a m11774b(C3121p pVar, C3059m.C3069f fVar, Object obj, int i, int i2, Object obj2) {
            if (obj2 == null) {
                if ((i2 & 4) != 0) {
                    i = 0;
                }
                return pVar.mo9198b(fVar, obj, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: provider");
        }
    }

    /* renamed from: a */
    <C, A, T> C3350b<A, T> mo9196a(C3059m.C3069f<? super C, ? super A, ? extends T> fVar, C c, int i);

    /* renamed from: b */
    <C, T> C3349a<T> mo9198b(C3059m.C3069f<? super C, ? super Unit, ? extends T> fVar, C c, int i);
}
