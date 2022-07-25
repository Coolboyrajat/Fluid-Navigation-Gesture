package com.p131fb.fluid.services.p145e.p146g;

import android.os.SystemClock;
import p054c.p077c.p078a.C1156e;
import p054c.p077c.p078a.C1157f;

/* renamed from: com.fb.fluid.services.e.g.d */
public class C1969d extends C1156e {

    /* renamed from: a */
    private long f5468a;

    /* renamed from: b */
    private final long f5469b;

    public C1969d(long j) {
        this.f5469b = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1969d(long j, int i, C3366g gVar) {
        this((i & 1) != 0 ? 7 : j);
    }

    /* renamed from: c */
    public void mo5270c(C1157f fVar) {
        super.mo5270c(fVar);
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z = uptimeMillis - this.f5468a <= this.f5469b;
        this.f5468a = uptimeMillis;
        if (!z) {
            mo6815e(fVar);
        }
    }

    /* renamed from: e */
    public void mo6815e(C1157f fVar) {
        throw null;
    }
}
