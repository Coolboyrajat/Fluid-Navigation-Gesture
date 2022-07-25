package com.p131fb.fluid.p148ui.p149g.p151b;

import android.view.View;
import com.p131fb.fluid.p148ui.p149g.p152c.C2464n;
import com.p131fb.fluid.p148ui.p149g.p152c.C2465o;
import kotlin.Unit;
import kotlin.p192b0.C3204e;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3368i;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3384y;
import p054c.p055a.p067b.C1108a;

/* renamed from: com.fb.fluid.ui.g.b.n */
final class C2313n extends C3371l implements C3350b<C1108a<? extends C2464n, C2465o>, Unit> {

    /* renamed from: g */
    public static final C2313n f6005g = new C2313n();

    /* renamed from: com.fb.fluid.ui.g.b.n$a */
    static final /* synthetic */ class C2314a extends C3368i implements C3350b<View, C2465o> {

        /* renamed from: j */
        public static final C2314a f6006j = new C2314a();

        C2314a() {
            super(1);
        }

        /* renamed from: a */
        public final C2465o mo5146a(View view) {
            C3370k.m12227b(view, "p1");
            return new C2465o(view);
        }

        /* renamed from: b */
        public final String mo6062b() {
            return "<init>";
        }

        /* renamed from: h */
        public final C3204e mo6063h() {
            return C3384y.m12254a(C2465o.class);
        }

        /* renamed from: j */
        public final String mo6064j() {
            return "<init>(Landroid/view/View;)V";
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.n$b */
    static final class C2315b extends C3371l implements C3352d<C2465o, Integer, C2464n, Unit> {

        /* renamed from: g */
        public static final C2315b f6007g = new C2315b();

        C2315b() {
            super(3);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
            mo7158a((C2465o) obj, ((Number) obj2).intValue(), (C2464n) obj3);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7158a(C2465o oVar, int i, C2464n nVar) {
            C3370k.m12227b(oVar, "$receiver");
            C3370k.m12227b(nVar, "<anonymous parameter 1>");
        }
    }

    C2313n() {
        super(1);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
        mo7156a((C1108a<C2464n, C2465o>) (C1108a) obj);
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public final void mo7156a(C1108a<C2464n, C2465o> aVar) {
        C3370k.m12227b(aVar, "$receiver");
        aVar.mo5186a(C2314a.f6006j, C2315b.f6007g);
    }
}
