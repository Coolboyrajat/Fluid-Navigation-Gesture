package com.p131fb.fluid.p148ui.billing;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.C0401d;
import androidx.lifecycle.C0490o;
import com.android.billingclient.api.C1615a;
import com.android.billingclient.api.C1618b;
import com.android.billingclient.api.C1622d;
import com.android.billingclient.api.C1656f;
import com.android.billingclient.api.C1657g;
import com.android.billingclient.api.C1660h;
import com.android.billingclient.api.C1664j;
import com.android.billingclient.api.C1667k;
import com.android.billingclient.api.C1668l;
import com.android.billingclient.api.C1671n;
import com.android.billingclient.api.C1672o;
import com.android.billingclient.api.C1673p;
import com.android.billingclient.api.C1674q;
import com.android.billingclient.api.C1676r;
import com.android.billingclient.api.C1677s;
import com.android.billingclient.api.C1679t;
import com.android.billingclient.api.C1682u;
import com.p131fb.fluid.p135l.p139p.C1776l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;

/* renamed from: com.fb.fluid.ui.billing.BillingHelperImpl */
public final class BillingHelperImpl implements C2048d, C1673p {

    /* renamed from: a */
    private C1622d f5619a;

    /* renamed from: b */
    private C3352d<? super Integer, ? super C1660h, ? super List<C1668l>, Unit> f5620b = C2033a.f5623g;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f5621c;

    /* renamed from: d */
    private final Application f5622d;

    /* renamed from: com.fb.fluid.ui.billing.BillingHelperImpl$a */
    static final class C2033a extends C3371l implements C3352d<Integer, C1660h, List<C1668l>, Unit> {

        /* renamed from: g */
        public static final C2033a f5623g = new C2033a();

        C2033a() {
            super(3);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
            mo6895a(((Number) obj).intValue(), (C1660h) obj2, (List<C1668l>) (List) obj3);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6895a(int i, C1660h hVar, List<C1668l> list) {
        }
    }

    /* renamed from: com.fb.fluid.ui.billing.BillingHelperImpl$b */
    static final class C2034b implements C1672o {

        /* renamed from: a */
        final /* synthetic */ BillingHelperImpl f5624a;

        C2034b(BillingHelperImpl billingHelperImpl) {
            this.f5624a = billingHelperImpl;
        }

        /* renamed from: a */
        public final void mo6305a(C1660h hVar, List<C1671n> list) {
            if (list == null) {
                C1776l.m7478a("Purchases list must not be null", (String) null, 1, (Object) null);
                return;
            }
            C3352d<Integer, C1660h, List<C1668l>, Unit> c = this.f5624a.mo6892c();
            ArrayList arrayList = new ArrayList(C3285k.m12075a(list, 10));
            for (C1671n nVar : list) {
                C3370k.m12223a((Object) nVar, "it");
                arrayList.add(new C1668l(nVar.mo6299a(), nVar.mo6301c()));
            }
            c.mo6842a(1, hVar, C3292r.m12094b(arrayList));
        }
    }

    /* renamed from: com.fb.fluid.ui.billing.BillingHelperImpl$c */
    public static final class C2035c implements C1656f {

        /* renamed from: a */
        final /* synthetic */ BillingHelperImpl f5625a;

        C2035c(BillingHelperImpl billingHelperImpl) {
            this.f5625a = billingHelperImpl;
        }

        /* renamed from: a */
        public void mo6266a() {
        }

        /* renamed from: a */
        public void mo6267a(C1660h hVar) {
            C3370k.m12227b(hVar, "billingResult");
            if (hVar.mo6279a() == 0) {
                this.f5625a.mo6882a();
            }
        }
    }

    public BillingHelperImpl(Application application) {
        C3370k.m12227b(application, "app");
        this.f5622d = application;
        C1622d.C1624b a = C1622d.m7043a((Context) this.f5622d);
        a.mo6231b();
        a.mo6229a(this);
        C1622d a2 = a.mo6230a();
        C3370k.m12223a((Object) a2, "BillingClient\n          …his)\n            .build()");
        this.f5619a = a2;
    }

    /* renamed from: e */
    private final void m8311e() {
        this.f5619a.mo6223a((C1656f) new C2035c(this));
    }

    /* renamed from: a */
    public void mo6882a() {
        if (mo6894d()) {
            C1668l.C1669a a = this.f5619a.mo6220a("inapp");
            C3370k.m12223a((Object) a, "billingClient.queryPurch…lingClient.SkuType.INAPP)");
            mo6892c().mo6842a(0, a.mo6297a(), a.mo6298b());
        }
    }

    /* renamed from: a */
    public void mo6883a(C0401d dVar, C1677s sVar) {
        C3370k.m12227b(dVar, "activity");
        C3370k.m12227b(sVar, "skuDetails");
        C1657g.C1659b j = C1657g.m7110j();
        j.mo6277a(sVar);
        this.f5619a.mo6219a((Activity) dVar, j.mo6278a());
        this.f5621c = true;
    }

    /* renamed from: a */
    public void mo6884a(C0490o oVar, C3352d<? super Integer, ? super C1660h, ? super List<C1668l>, Unit> dVar) {
        C3370k.m12227b(oVar, "activity");
        C3370k.m12227b(dVar, "onPurchasesUpdated");
        mo6889a(dVar);
        oVar.mo5a().mo2701a(new BillingHelperImpl$init$1(this));
        m8311e();
    }

    /* renamed from: a */
    public void mo6306a(C1660h hVar, List<C1668l> list) {
        mo6892c().mo6842a(2, hVar, list);
    }

    /* renamed from: a */
    public void mo6885a(C1668l lVar, C3350b<? super C1660h, Unit> bVar) {
        C3370k.m12227b(lVar, "purchase");
        C3370k.m12227b(bVar, "listener");
        if (!lVar.mo6294f()) {
            C1615a.C1617b c = C1615a.m7030c();
            c.mo6210a(lVar.mo6290c());
            this.f5619a.mo6222a(c.mo6211a(), (C1618b) new C2050e(bVar));
        }
    }

    /* renamed from: a */
    public void mo6886a(C1668l lVar, C3351c<? super C1660h, ? super String, Unit> cVar) {
        C3370k.m12227b(lVar, "purchase");
        C3370k.m12227b(cVar, "listener");
        C1664j.C1666b c = C1664j.m7131c();
        c.mo6285a(lVar.mo6290c());
        this.f5619a.mo6224a(c.mo6286a(), (C1667k) new C2051f(cVar));
    }

    /* renamed from: a */
    public void mo6887a(C1677s sVar, C3350b<? super C1660h, Unit> bVar) {
        C3370k.m12227b(sVar, "skuDetails");
        C3370k.m12227b(bVar, "callback");
        if (sVar.mo6315e()) {
            C1674q.C1675a aVar = new C1674q.C1675a();
            aVar.mo6308a(sVar);
            this.f5619a.mo6225a(aVar.mo6309a(), (C1676r) new C2052g(bVar));
        }
    }

    /* renamed from: a */
    public void mo6888a(List<String> list, String str, C3351c<? super C1660h, ? super List<? extends C1677s>, Unit> cVar) {
        C3370k.m12227b(list, "skuList");
        C3370k.m12227b(str, "type");
        C3370k.m12227b(cVar, "listener");
        C1679t.C1681b c = C1679t.m7167c();
        c.mo6326a(list);
        c.mo6325a(str);
        this.f5619a.mo6226a(c.mo6327a(), (C1682u) new C2053h(cVar));
    }

    /* renamed from: a */
    public void mo6889a(C3352d<? super Integer, ? super C1660h, ? super List<C1668l>, Unit> dVar) {
        C3370k.m12227b(dVar, "<set-?>");
        this.f5620b = dVar;
    }

    /* renamed from: b */
    public void mo6890b() {
        if (mo6894d()) {
            this.f5619a.mo6227a("inapp", (C1672o) new C2034b(this));
        }
    }

    /* renamed from: b */
    public void mo6891b(C0401d dVar, C1677s sVar) {
        C3370k.m12227b(dVar, "activity");
        C3370k.m12227b(sVar, "skuDetails");
        C1657g.C1659b j = C1657g.m7110j();
        j.mo6277a(sVar);
        this.f5619a.mo6219a((Activity) dVar, j.mo6278a());
        this.f5621c = true;
    }

    /* renamed from: c */
    public C3352d<Integer, C1660h, List<C1668l>, Unit> mo6892c() {
        return this.f5620b;
    }

    public void clear() {
        if (mo6894d()) {
            this.f5619a.mo6221a();
        }
    }

    /* renamed from: d */
    public boolean mo6894d() {
        return this.f5619a.mo6228b();
    }
}
