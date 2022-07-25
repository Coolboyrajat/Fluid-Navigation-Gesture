package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Application;
import androidx.lifecycle.C0464a0;
import androidx.lifecycle.C0508z;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.ui.g.b.f */
public final class C2160f implements C0464a0.C0466b {

    /* renamed from: a */
    private final Application f5818a;

    /* renamed from: b */
    private final long f5819b;

    /* renamed from: c */
    private final String f5820c;

    public C2160f(Application application, long j, String str) {
        C3370k.m12227b(application, "app");
        C3370k.m12227b(str, "title");
        this.f5818a = application;
        this.f5819b = j;
        this.f5820c = str;
    }

    /* renamed from: a */
    public <T extends C0508z> T mo2570a(Class<T> cls) {
        C3370k.m12227b(cls, "modelClass");
        return new C2262m0(this.f5818a, this.f5819b, this.f5820c);
    }
}
