package com.p131fb.fluid.p135l.p139p;

import android.content.pm.PackageInfo;
import android.os.Build;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.p.n */
public final class C1778n {
    /* renamed from: a */
    public static final long m7483a(PackageInfo packageInfo) {
        C3370k.m12227b(packageInfo, "$this$versionCodeLong");
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : (long) packageInfo.versionCode;
    }
}
