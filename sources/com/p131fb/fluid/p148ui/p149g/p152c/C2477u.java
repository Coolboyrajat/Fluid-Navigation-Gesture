package com.p131fb.fluid.p148ui.p149g.p152c;

import java.util.List;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p067b.p068f.C1116a;

/* renamed from: com.fb.fluid.ui.g.c.u */
public final class C2477u {

    /* renamed from: com.fb.fluid.ui.g.c.u$a */
    static final class C2478a extends C3371l implements C3350b<Object, Boolean> {

        /* renamed from: g */
        final /* synthetic */ String f6252g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2478a(String str) {
            super(1);
            this.f6252g = str;
        }

        /* renamed from: a */
        public final boolean m9272a(Object obj) {
            C3370k.m12227b(obj, "it");
            String str = null;
            if (!(obj instanceof C2472t)) {
                obj = null;
            }
            C2472t tVar = (C2472t) obj;
            if (tVar != null) {
                str = tVar.mo7337f();
            }
            return C3370k.m12225a((Object) str, (Object) this.f6252g);
        }
    }

    /* renamed from: a */
    public static final void m9269a(C1116a<?> aVar, String str) {
        C3370k.m12227b(aVar, "$this$notifyPreference");
        C3370k.m12227b(str, "key");
        aVar.mo5199a(aVar.mo5197a((C3350b<? super Object, Boolean>) new C2478a(str)));
    }

    /* renamed from: b */
    public static final void m9270b(C1116a<?> aVar, String str) {
        List<String> h;
        C3370k.m12227b(aVar, "$this$notifyWithKey");
        C3370k.m12227b(str, "key");
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            Object obj = aVar.get(i);
            if (!(obj instanceof C2472t)) {
                obj = null;
            }
            C2472t tVar = (C2472t) obj;
            if (!(tVar == null || (h = tVar.mo7339h()) == null || !h.contains(str))) {
                aVar.mo5199a(i);
            }
        }
    }
}
