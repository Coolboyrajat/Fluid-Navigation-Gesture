package com.p131fb.fluid.p148ui.billing;

import androidx.lifecycle.C0481i;
import androidx.lifecycle.C0489n;
import androidx.lifecycle.C0490o;
import androidx.lifecycle.C0499v;
import com.android.billingclient.api.C1660h;
import com.android.billingclient.api.C1668l;
import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;

/* renamed from: com.fb.fluid.ui.billing.BillingHelperImpl$init$1 */
public final class BillingHelperImpl$init$1 implements C0489n {

    /* renamed from: f */
    final /* synthetic */ BillingHelperImpl f5626f;

    /* renamed from: com.fb.fluid.ui.billing.BillingHelperImpl$init$1$a */
    static final class C2036a extends C3371l implements C3352d<Integer, C1660h, List<C1668l>, Unit> {

        /* renamed from: g */
        public static final C2036a f5627g = new C2036a();

        C2036a() {
            super(3);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
            mo6898a(((Number) obj).intValue(), (C1660h) obj2, (List<C1668l>) (List) obj3);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6898a(int i, C1660h hVar, List<C1668l> list) {
        }
    }

    BillingHelperImpl$init$1(BillingHelperImpl billingHelperImpl) {
        this.f5626f = billingHelperImpl;
    }

    @C0499v(C0481i.C0482a.ON_DESTROY)
    public final void onDestroy(C0490o oVar) {
        C3370k.m12227b(oVar, "owner");
        this.f5626f.mo6889a((C3352d<? super Integer, ? super C1660h, ? super List<C1668l>, Unit>) C2036a.f5627g);
    }

    @C0499v(C0481i.C0482a.ON_RESUME)
    public final void onResume(C0490o oVar) {
        C3370k.m12227b(oVar, "owner");
        if (this.f5626f.mo6894d() && !this.f5626f.f5621c) {
            this.f5626f.mo6882a();
        }
        this.f5626f.f5621c = false;
    }
}
