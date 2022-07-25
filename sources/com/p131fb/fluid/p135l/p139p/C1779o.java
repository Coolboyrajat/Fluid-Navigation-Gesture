package com.p131fb.fluid.p135l.p139p;

import android.app.PendingIntent;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.p.o */
public final class C1779o {
    /* renamed from: a */
    public static final void m7484a(PendingIntent pendingIntent) {
        C3370k.m12227b(pendingIntent, "$this$sendSafe");
        try {
            pendingIntent.send();
        } catch (PendingIntent.CanceledException unused) {
        }
    }
}
