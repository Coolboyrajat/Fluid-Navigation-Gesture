package com.p131fb.fluid;

import android.content.Context;
import android.content.Intent;
import com.p131fb.fluid.p135l.C1738f;
import com.p131fb.fluid.utils.preferences.C2527h;
import java.lang.Thread;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.d */
public final class C1697d implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f4918a = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: b */
    private final C2527h f4919b;

    public C1697d(Context context, C2527h hVar) {
        C3370k.m12227b(context, "context");
        C3370k.m12227b(hVar, "prefs");
        this.f4919b = hVar;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        C3370k.m12227b(thread, "t");
        C3370k.m12227b(th, "e");
        C1738f.f5044c.mo6483a(0, 0, 0, 0, 0);
        C2527h hVar = this.f4919b;
        if (hVar.mo7538l() + ((long) 300000) < System.currentTimeMillis()) {
            hVar.mo7515d(false);
        } else {
            hVar.mo7526h().startService(new Intent(hVar.mo7526h(), MainAccessibilityService.class));
        }
        hVar.mo7510c(System.currentTimeMillis());
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f4918a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
