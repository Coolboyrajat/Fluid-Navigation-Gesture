package com.p131fb.fluid.p148ui.p149g.p150a;

/* renamed from: com.fb.fluid.ui.g.a.e */
public final class C2066e extends C2068g {

    /* renamed from: b */
    private final boolean f5667b;

    public C2066e(boolean z) {
        this.f5667b = z;
    }

    /* renamed from: a */
    public final boolean mo6935a() {
        return this.f5667b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2066e) {
                if (this.f5667b == ((C2066e) obj).f5667b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f5667b;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "RequestWSSWithRoot(exitUponGrant=" + this.f5667b + ")";
    }
}
