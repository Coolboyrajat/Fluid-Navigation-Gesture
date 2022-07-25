package com.joaomgcd.taskerpluginlibrary.condition;

import android.app.IntentService;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.p205x.p206c.C3351c;
import p054c.p119h.p120a.p124k.C1522k;

/* renamed from: com.joaomgcd.taskerpluginlibrary.condition.a */
public final class C2764a {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m10914b(Context context, Intent intent, Bundle bundle, C3351c<? super Integer, ? super Bundle, Unit> cVar) {
        if (context != null) {
            C2765b a = TaskerPluginRunnerCondition.Companion.mo8842a(context, intent);
            if ((context instanceof IntentService) && (a == null || !a.mo8846c())) {
                C1522k.C1523a.m6805a(C1522k.Companion, (Service) context, (C1522k.C1524b) null, 2, (Object) null);
            }
            int i = 18;
            if (a != null) {
                i = a.mo8845b();
                bundle.putBundle("net.dinglisch.android.tasker.extras.VARIABLES", a.mo8844a());
            }
            cVar.mo6125a(Integer.valueOf(i), bundle);
        }
    }
}
