package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Application;
import androidx.lifecycle.C0464a0;
import androidx.lifecycle.C0508z;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.ui.g.b.x */
public final class C2402x implements C0464a0.C0466b {

    /* renamed from: a */
    private final Application f6107a;

    /* renamed from: b */
    private final int f6108b;

    public C2402x(Application application, int i) {
        C3370k.m12227b(application, "app");
        this.f6107a = application;
        this.f6108b = i;
    }

    /* renamed from: a */
    public <T extends C0508z> T mo2570a(Class<T> cls) {
        C3370k.m12227b(cls, "modelClass");
        return new C2398w(this.f6107a, this.f6108b);
    }
}
