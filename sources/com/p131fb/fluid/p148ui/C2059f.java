package com.p131fb.fluid.p148ui;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C0463a;
import com.p131fb.fluid.p148ui.billing.C2048d;
import kotlin.C3256e;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;
import p179e.p184b.p185a.C2995e0;
import p179e.p184b.p185a.C3004i0;
import p179e.p184b.p185a.C3059m;
import p179e.p184b.p185a.C3117n;
import p179e.p184b.p185a.C3119o;
import p179e.p184b.p185a.C3125q;
import p179e.p184b.p185a.C3134v;
import p179e.p184b.p185a.p186k0.C3014a;

/* renamed from: com.fb.fluid.ui.f */
public final class C2059f extends C0463a implements C3117n {

    /* renamed from: i */
    static final /* synthetic */ C3208i[] f5660i;

    /* renamed from: g */
    private final C3256e f5661g;

    /* renamed from: h */
    private final C3256e f5662h = C3119o.m11767a(this, C3004i0.m11527a(new C2060a()), (Object) null).mo9243a(this, f5660i[1]);

    /* renamed from: com.fb.fluid.ui.f$a */
    public static final class C2060a extends C2995e0<C2048d> {
    }

    static {
        Class<C2059f> cls = C2059f.class;
        C3380u uVar = new C3380u(C3384y.m12254a((Class) cls), "kodein", "getKodein()Lorg/kodein/di/Kodein;");
        C3384y.m12259a((C3379t) uVar);
        C3380u uVar2 = new C3380u(C3384y.m12254a((Class) cls), "billingHelper", "getBillingHelper()Lcom/fb/fluid/ui/billing/BillingHelper;");
        C3384y.m12259a((C3379t) uVar2);
        f5660i = new C3208i[]{uVar, uVar2};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2059f(Application application) {
        super(application);
        C3370k.m12227b(application, "app");
        this.f5661g = C3014a.m11540a((Context) application).mo9126a(this, f5660i[0]);
    }

    /* renamed from: c */
    public C3134v mo6349c() {
        return C3117n.C3118a.m11765b(this);
    }

    /* renamed from: d */
    public C3125q<?> mo6350d() {
        return C3117n.C3118a.m11764a(this);
    }

    /* renamed from: e */
    public C3059m mo6351e() {
        C3256e eVar = this.f5661g;
        C3208i iVar = f5660i[0];
        return (C3059m) eVar.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo2564f() {
        mo6918g().clear();
    }

    /* renamed from: g */
    public final C2048d mo6918g() {
        C3256e eVar = this.f5662h;
        C3208i iVar = f5660i[1];
        return (C2048d) eVar.getValue();
    }
}
