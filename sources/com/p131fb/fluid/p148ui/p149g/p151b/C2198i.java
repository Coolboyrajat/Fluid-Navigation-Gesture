package com.p131fb.fluid.p148ui.p149g.p151b;

import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.ui.g.b.i */
public final class C2198i extends C2068g {

    /* renamed from: b */
    private final String f5867b;

    public C2198i(String str) {
        C3370k.m12227b(str, "key");
        this.f5867b = str;
    }

    /* renamed from: a */
    public final String mo7050a() {
        return this.f5867b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C2198i) && C3370k.m12225a((Object) this.f5867b, (Object) ((C2198i) obj).f5867b);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f5867b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AnimDialogEvent(key=" + this.f5867b + ")";
    }
}
