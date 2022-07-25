package com.p131fb.fluid.utils.preferences;

import com.p131fb.fluid.p148ui.p149g.p152c.C2459k0;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.utils.preferences.b */
public final class C2516b implements C2459k0<Boolean> {

    /* renamed from: a */
    private final C2518d f6381a;

    /* renamed from: b */
    private final String f6382b;

    /* renamed from: c */
    private final boolean f6383c;

    public C2516b(C2518d dVar, String str, boolean z) {
        C3370k.m12227b(dVar, "prefs");
        C3370k.m12227b(str, "key");
        this.f6381a = dVar;
        this.f6382b = str;
        this.f6383c = z;
    }

    /* renamed from: a */
    public Boolean m9382a() {
        return Boolean.valueOf(this.f6381a.mo7460a(this.f6382b, this.f6383c));
    }

    /* renamed from: a */
    public void mo7451a(boolean z) {
        this.f6381a.mo7464b(this.f6382b, z);
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        mo7451a(((Boolean) obj).booleanValue());
    }
}
