package com.joaomgcd.taskerpluginlibrary.condition;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;

public final class BroadcastReceiverCondition extends BroadcastReceiver {

    /* renamed from: com.joaomgcd.taskerpluginlibrary.condition.BroadcastReceiverCondition$a */
    static final class C2760a extends C3371l implements C3351c<Integer, Bundle, Unit> {

        /* renamed from: g */
        final /* synthetic */ BroadcastReceiverCondition f7337g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2760a(BroadcastReceiverCondition broadcastReceiverCondition) {
            super(2);
            this.f7337g = broadcastReceiverCondition;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
            mo8837a(((Number) obj).intValue(), (Bundle) obj2);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo8837a(int i, Bundle bundle) {
            this.f7337g.setResultCode(i);
        }
    }

    public void onReceive(Context context, Intent intent) {
        C3370k.m12227b(context, "context");
        Bundle resultExtras = getResultExtras(true);
        C3370k.m12223a((Object) resultExtras, "getResultExtras(true)");
        C2764a.m10914b(context, intent, resultExtras, new C2760a(this));
    }
}
