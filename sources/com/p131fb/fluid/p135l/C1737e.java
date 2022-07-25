package com.p131fb.fluid.p135l;

import android.os.Handler;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.e */
public final class C1737e {

    /* renamed from: a */
    private final Handler f5040a = new Handler();

    /* renamed from: b */
    private final long f5041b;

    public C1737e(long j) {
        this.f5041b = j;
    }

    /* renamed from: a */
    public final void mo6480a(C3349a<Unit> aVar) {
        C3370k.m12227b(aVar, "func");
        this.f5040a.removeCallbacksAndMessages((Object) null);
        this.f5040a.postDelayed(new C1736d(aVar), this.f5041b);
    }
}
