package com.p131fb.fluid.p148ui.p149g.p151b;

import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.ui.g.b.k0 */
public final class C2256k0 extends C2068g {

    /* renamed from: b */
    private final String f5938b;

    public C2256k0(String str) {
        C3370k.m12227b(str, "key");
        this.f5938b = str;
    }

    /* renamed from: a */
    public final String mo7105a() {
        return this.f5938b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C2256k0) && C3370k.m12225a((Object) this.f5938b, (Object) ((C2256k0) obj).f5938b);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f5938b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "PickActionEvent(key=" + this.f5938b + ")";
    }
}
