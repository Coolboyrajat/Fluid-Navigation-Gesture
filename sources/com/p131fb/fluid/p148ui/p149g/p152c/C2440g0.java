package com.p131fb.fluid.p148ui.p149g.p152c;

import com.p131fb.fluid.data.Trigger;
import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.ui.g.c.g0 */
public final class C2440g0 extends C2472t<Object> {

    /* renamed from: p */
    private final List<Trigger> f6186p;

    /* renamed from: q */
    private final C3350b<C2440g0, Unit> f6187q;

    public C2440g0(List<Trigger> list, C3350b<? super C2440g0, Unit> bVar) {
        C3370k.m12227b(list, "data");
        C3370k.m12227b(bVar, "func");
        this.f6186p = list;
        this.f6187q = bVar;
        this.f6187q.mo5146a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2440g0)) {
            return false;
        }
        C2440g0 g0Var = (C2440g0) obj;
        return C3370k.m12225a((Object) this.f6186p, (Object) g0Var.f6186p) && C3370k.m12225a((Object) this.f6187q, (Object) g0Var.f6187q);
    }

    public int hashCode() {
        List<Trigger> list = this.f6186p;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C3350b<C2440g0, Unit> bVar = this.f6187q;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: m */
    public final List<Trigger> mo7287m() {
        return this.f6186p;
    }

    public String toString() {
        return "TriggersList(data=" + this.f6186p + ", func=" + this.f6187q + ")";
    }
}
