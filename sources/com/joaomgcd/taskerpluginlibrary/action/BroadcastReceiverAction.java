package com.joaomgcd.taskerpluginlibrary.action;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import p054c.p119h.p120a.p122i.C1472a;

public final class BroadcastReceiverAction extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        setResultCode(3);
        if (intent != null && context != null) {
            intent.setComponent(new ComponentName(context, IntentServiceAction.class));
            C1472a.m6700a(context, intent);
        }
    }
}
