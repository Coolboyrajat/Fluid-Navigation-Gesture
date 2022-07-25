package com.p131fb.fluid.p135l.p143t;

import androidx.lifecycle.C0490o;
import com.uber.autodispose.android.lifecycle.C2781b;
import kotlin.p205x.p207d.C3370k;
import p054c.p125i.p126a.C1529e;
import p054c.p125i.p126a.C1542n;
import p054c.p125i.p126a.C1544p;
import p155d.p156a.C2790h;
import p155d.p156a.C2791i;
import p155d.p156a.p160o.C2809a;
import p155d.p156a.p160o.C2810b;

/* renamed from: com.fb.fluid.l.t.a */
public final class C1797a {
    /* renamed from: a */
    public static final <T> C1542n<T> m7557a(C2790h<T> hVar, C0490o oVar) {
        C3370k.m12227b(hVar, "$this$withAutoDispose");
        C3370k.m12227b(oVar, "lifecycleOwner");
        Object a = hVar.mo8916a((C2791i<T, ? extends R>) C1529e.m6817a((C1544p) C2781b.m10971a(oVar)));
        C3370k.m12223a(a, "`as`(AutoDispose.autoDis…er.from(lifecycleOwner)))");
        return (C1542n) a;
    }

    /* renamed from: a */
    public static final C2810b m7558a(C2810b bVar, C2809a aVar) {
        C3370k.m12227b(bVar, "$this$with");
        C3370k.m12227b(aVar, "manager");
        aVar.mo8949c(bVar);
        return bVar;
    }
}
