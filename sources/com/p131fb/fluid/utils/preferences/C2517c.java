package com.p131fb.fluid.utils.preferences;

import com.p131fb.fluid.data.C1702a;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.BuildConfig;

/* renamed from: com.fb.fluid.utils.preferences.c */
public final class C2517c {

    /* renamed from: b */
    private final String f6384b;

    /* renamed from: c */
    private final String f6385c;

    /* renamed from: d */
    private final String f6386d;

    public C2517c() {
        this((String) null, (String) null, (String) null, 7, (C3366g) null);
    }

    public C2517c(String str, String str2, String str3) {
        C3370k.m12227b(str, "b");
        C3370k.m12227b(str2, "c");
        C3370k.m12227b(str3, "d");
        this.f6384b = str;
        this.f6385c = str2;
        this.f6386d = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2517c(String str, String str2, String str3, int i, C3366g gVar) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? BuildConfig.FLAVOR : str3);
    }

    public final String getB() {
        return this.f6384b;
    }

    public final String getC() {
        return this.f6385c;
    }

    public final String getD() {
        return this.f6386d;
    }

    public final C1702a toActionShortcut() {
        return new C1702a(this.f6384b, this.f6385c, this.f6386d);
    }
}
