package com.p131fb.fluid.p148ui.p149g.p151b;

import androidx.lifecycle.C0464a0;
import androidx.lifecycle.C0508z;
import com.p131fb.fluid.App;
import java.util.ArrayList;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.ui.g.b.c */
public final class C2112c implements C0464a0.C0466b {

    /* renamed from: a */
    private final App f5741a;

    /* renamed from: b */
    private final int f5742b;

    /* renamed from: c */
    private final boolean f5743c;

    /* renamed from: d */
    private final boolean f5744d;

    /* renamed from: e */
    private final ArrayList<String> f5745e;

    public C2112c(App app, int i, boolean z, boolean z2, ArrayList<String> arrayList) {
        C3370k.m12227b(app, "app");
        C3370k.m12227b(arrayList, "filteredOutPkgs");
        this.f5741a = app;
        this.f5742b = i;
        this.f5743c = z;
        this.f5744d = z2;
        this.f5745e = arrayList;
    }

    /* renamed from: a */
    public <T extends C0508z> T mo2570a(Class<T> cls) {
        C3370k.m12227b(cls, "modelClass");
        return new C2081b(this.f5741a, this.f5742b, this.f5743c, this.f5744d, this.f5745e);
    }
}
