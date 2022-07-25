package com.joaomgcd.taskerpluginlibrary.condition;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.Unit;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import net.dinglisch.android.tasker.C3559a;
import p054c.p119h.p120a.p124k.C1507b;

public final class IntentServiceCondition extends C1507b {

    /* renamed from: com.joaomgcd.taskerpluginlibrary.condition.IntentServiceCondition$a */
    static final class C2761a extends C3371l implements C3351c<Integer, Bundle, Unit> {

        /* renamed from: g */
        final /* synthetic */ ResultReceiver f7338g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2761a(ResultReceiver resultReceiver) {
            super(2);
            this.f7338g = resultReceiver;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
            mo8838a(((Number) obj).intValue(), (Bundle) obj2);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo8838a(int i, Bundle bundle) {
            this.f7338g.send(i, bundle);
        }
    }

    public IntentServiceCondition() {
        super("IntentServiceTaskerCondition");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5985a(Intent intent) {
        C3370k.m12227b(intent, "intent");
        mo5986b();
        ResultReceiver a = C3559a.C3561b.m12851a(intent);
        if (a != null) {
            C2764a.m10914b(this, intent, new Bundle(), new C2761a(a));
        }
    }
}
