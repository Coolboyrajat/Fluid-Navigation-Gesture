package com.p131fb.fluid.p148ui.p149g.p151b;

import com.p131fb.fluid.data.C1706c;
import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.ui.g.b.j */
public final class C2200j extends C2068g {

    /* renamed from: b */
    private final C1706c f5870b;

    public C2200j(C1706c cVar) {
        C3370k.m12227b(cVar, "info");
        this.f5870b = cVar;
    }

    /* renamed from: a */
    public final C1706c mo7054a() {
        return this.f5870b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C2200j) && C3370k.m12225a((Object) this.f5870b, (Object) ((C2200j) obj).f5870b);
        }
        return true;
    }

    public int hashCode() {
        C1706c cVar = this.f5870b;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AppsEvent(info=" + this.f5870b + ")";
    }
}
