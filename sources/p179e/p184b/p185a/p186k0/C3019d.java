package p179e.p184b.p185a.p186k0;

import android.content.Context;
import kotlin.C3256e;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p179e.p184b.p185a.C3059m;

/* renamed from: e.b.a.k0.d */
final class C3019d implements C3018c<Object> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3349a<Context> f7772a;

    /* renamed from: e.b.a.k0.d$a */
    static final class C3020a extends C3371l implements C3349a<C3059m> {

        /* renamed from: g */
        final /* synthetic */ C3019d f7773g;

        /* renamed from: h */
        final /* synthetic */ Object f7774h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3020a(C3019d dVar, Object obj) {
            super(0);
            this.f7773g = dVar;
            this.f7774h = obj;
        }

        public final C3059m invoke() {
            return C3014a.m11545b(this.f7774h, (Context) this.f7773g.f7772a.invoke());
        }
    }

    public C3019d(C3349a<? extends Context> aVar) {
        C3370k.m12227b(aVar, "getContext");
        this.f7772a = aVar;
    }

    /* renamed from: a */
    public C3256e<C3059m> mo9126a(Object obj, C3208i<?> iVar) {
        return C3258g.m11969a(new C3020a(this, obj));
    }
}
