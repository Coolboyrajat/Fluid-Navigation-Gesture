package com.p131fb.fluid.p148ui.p149g.p150a;

/* renamed from: com.fb.fluid.ui.g.a.d */
public final class C2065d extends C2068g {

    /* renamed from: b */
    private final boolean f5666b;

    public C2065d(boolean z) {
        this.f5666b = z;
    }

    /* renamed from: a */
    public final boolean mo6931a() {
        return this.f5666b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2065d) {
                if (this.f5666b == ((C2065d) obj).f5666b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f5666b;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "ProgressIndicatorEvent(loading=" + this.f5666b + ")";
    }
}
