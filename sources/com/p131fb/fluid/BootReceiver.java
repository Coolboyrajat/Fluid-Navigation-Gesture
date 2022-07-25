package com.p131fb.fluid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.BootReceiver */
public final class BootReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C3370k.m12227b(context, "context");
        C3370k.m12227b(intent, "intent");
        if (C3370k.m12225a((Object) intent.getAction(), (Object) "android.intent.action.BOOT_COMPLETED")) {
            try {
                context.startService(new Intent(context, MainAccessibilityService.class));
            } catch (IllegalStateException unused) {
            }
        }
    }
}
