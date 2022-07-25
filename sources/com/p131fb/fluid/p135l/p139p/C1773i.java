package com.p131fb.fluid.p135l.p139p;

import android.os.Handler;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.p.i */
public final class C1773i {
    /* renamed from: a */
    public static final Handler m7473a(long j, C3349a<Unit> aVar) {
        C3370k.m12227b(aVar, "r");
        Handler handler = new Handler();
        handler.postDelayed(new C1772h(aVar), j);
        return handler;
    }

    /* renamed from: a */
    public static final void m7474a(Handler handler) {
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }
}
