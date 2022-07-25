package com.p131fb.fluid.p135l;

import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.j */
public final class C1752j {

    /* renamed from: a */
    private long f5070a;

    /* renamed from: b */
    private final long f5071b;

    public C1752j(long j) {
        this.f5071b = j;
    }

    /* renamed from: a */
    public final void mo6520a(C3349a<Unit> aVar) {
        C3370k.m12227b(aVar, "func");
        if (this.f5070a + this.f5071b < System.currentTimeMillis()) {
            this.f5070a = System.currentTimeMillis();
            aVar.invoke();
        }
    }
}
