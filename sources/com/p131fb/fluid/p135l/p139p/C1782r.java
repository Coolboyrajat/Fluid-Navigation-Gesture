package com.p131fb.fluid.p135l.p139p;

import android.view.View;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import p054c.p112f.p113a.p115b.C1424a;
import p155d.p156a.p157n.p159c.C2803a;
import p155d.p156a.p160o.C2810b;

/* renamed from: com.fb.fluid.l.p.r */
public final class C1782r {
    /* renamed from: a */
    public static final C2810b m7488a(View view, C3350b<? super Unit, Unit> bVar) {
        C3370k.m12227b(view, "$this$onClickDebounced");
        C3370k.m12227b(bVar, "callback");
        C2810b b = C1424a.m6599a(view).mo8929c(300, TimeUnit.MILLISECONDS).mo8907a(C2803a.m11054a()).mo8927b(new C1781q(bVar));
        C3370k.m12223a((Object) b, "clicks()\n            .th…     .subscribe(callback)");
        return b;
    }
}
