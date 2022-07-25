package com.p131fb.fluid.p135l.p138o;

import android.accessibilityservice.AccessibilityService;
import android.content.Intent;
import androidx.lifecycle.C0481i;
import androidx.lifecycle.C0490o;
import androidx.lifecycle.C0506y;
import kotlin.C3256e;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;

/* renamed from: com.fb.fluid.l.o.a */
public abstract class C1762a extends AccessibilityService implements C0490o {

    /* renamed from: g */
    static final /* synthetic */ C3208i[] f5083g;

    /* renamed from: f */
    private final C3256e f5084f = C3258g.m11969a(new C1763a(this));

    /* renamed from: com.fb.fluid.l.o.a$a */
    static final class C1763a extends C3371l implements C3349a<C0506y> {

        /* renamed from: g */
        final /* synthetic */ C1762a f5085g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1763a(C1762a aVar) {
            super(0);
            this.f5085g = aVar;
        }

        public final C0506y invoke() {
            return new C0506y(this.f5085g);
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C1762a.class), "dispatcher", "getDispatcher()Landroidx/lifecycle/ServiceLifecycleDispatcher;");
        C3384y.m12259a((C3379t) uVar);
        f5083g = new C3208i[]{uVar};
    }

    /* renamed from: h */
    private final C0506y m7430h() {
        C3256e eVar = this.f5084f;
        C3208i iVar = f5083g[0];
        return (C0506y) eVar.getValue();
    }

    /* renamed from: a */
    public C0481i mo5a() {
        C0481i a = m7430h().mo2733a();
        C3370k.m12223a((Object) a, "dispatcher.lifecycle");
        return a;
    }

    public void onCreate() {
        m7430h().mo2734b();
        super.onCreate();
    }

    public void onDestroy() {
        m7430h().mo2735c();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        m7430h().mo2736d();
        return super.onStartCommand(intent, i, i2);
    }
}
