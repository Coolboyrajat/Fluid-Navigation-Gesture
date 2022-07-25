package com.p131fb.fluid.p135l.p139p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Unit;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.p.b */
public final class C1765b {

    /* renamed from: com.fb.fluid.l.p.b$a */
    public static final class C1766a extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ C3351c f5086a;

        C1766a(C3351c cVar) {
            this.f5086a = cVar;
        }

        public void onReceive(Context context, Intent intent) {
            C3370k.m12227b(context, "context");
            C3370k.m12227b(intent, "intent");
            this.f5086a.mo6125a(context, intent);
        }
    }

    /* renamed from: a */
    public static final BroadcastReceiver m7442a(BroadcastReceiver broadcastReceiver, Context context) {
        C3370k.m12227b(broadcastReceiver, "$this$dispose");
        C3370k.m12227b(context, "context");
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Exception unused) {
        }
        return broadcastReceiver;
    }

    /* renamed from: a */
    public static final BroadcastReceiver m7443a(Context context, String[] strArr, C3351c<? super Context, ? super Intent, Unit> cVar) {
        C3370k.m12227b(context, "context");
        C3370k.m12227b(strArr, "types");
        C3370k.m12227b(cVar, "callback");
        C1766a aVar = new C1766a(cVar);
        try {
            IntentFilter intentFilter = new IntentFilter();
            for (String addAction : strArr) {
                intentFilter.addAction(addAction);
            }
            context.registerReceiver(aVar, intentFilter);
        } catch (Exception unused) {
        }
        return aVar;
    }
}
