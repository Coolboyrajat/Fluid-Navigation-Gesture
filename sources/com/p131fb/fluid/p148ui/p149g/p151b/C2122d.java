package com.p131fb.fluid.p148ui.p149g.p151b;

import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;

/* renamed from: com.fb.fluid.ui.g.b.d */
public final class C2122d extends C2068g {

    /* renamed from: b */
    private final int f5757b;

    public C2122d(int i) {
        this.f5757b = i;
    }

    /* renamed from: a */
    public final int mo6989a() {
        return this.f5757b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2122d) {
                if (this.f5757b == ((C2122d) obj).f5757b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Integer.valueOf(this.f5757b).hashCode();
    }

    public String toString() {
        return "ActionsEvent(actionType=" + this.f5757b + ")";
    }
}
