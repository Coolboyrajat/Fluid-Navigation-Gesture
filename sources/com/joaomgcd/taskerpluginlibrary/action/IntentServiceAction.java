package com.joaomgcd.taskerpluginlibrary.action;

import android.content.Intent;
import kotlin.p205x.p207d.C3370k;
import p054c.p119h.p120a.p124k.C1507b;

public final class IntentServiceAction extends C1507b {
    public IntentServiceAction() {
        super("IntentServiceTaskerAction");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5985a(Intent intent) {
        C3370k.m12227b(intent, "intent");
        mo5986b();
        if (!TaskerPluginRunnerAction.Companion.mo8833a(this, intent).mo8834a()) {
            mo5986b();
        }
    }
}
