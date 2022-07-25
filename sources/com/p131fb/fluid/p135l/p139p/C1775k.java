package com.p131fb.fluid.p135l.p139p;

import android.content.Context;
import android.content.Intent;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.p.k */
public final class C1775k {
    /* renamed from: a */
    public static final boolean m7476a(Intent intent, Context context) {
        C3370k.m12227b(intent, "$this$isCallable");
        C3370k.m12227b(context, "context");
        return context.getPackageManager().resolveActivity(intent, 0) != null;
    }
}
