package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Application;
import androidx.lifecycle.C0464a0;
import androidx.lifecycle.C0508z;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.ui.g.b.i0 */
public final class C2199i0 implements C0464a0.C0466b {

    /* renamed from: a */
    private final Application f5868a;

    /* renamed from: b */
    private final boolean f5869b;

    public C2199i0(Application application, boolean z) {
        C3370k.m12227b(application, "app");
        this.f5868a = application;
        this.f5869b = z;
    }

    /* renamed from: a */
    public <T extends C0508z> T mo2570a(Class<T> cls) {
        C3370k.m12227b(cls, "modelClass");
        return new C2183h0(this.f5868a, this.f5869b);
    }
}
