package com.p131fb.fluid.p148ui.p149g.p150a;

/* renamed from: com.fb.fluid.ui.g.a.f */
public final class C2067f extends C2068g {

    /* renamed from: b */
    private final int f5668b;

    public C2067f(int i) {
        this.f5668b = i;
    }

    /* renamed from: a */
    public final int mo6939a() {
        return this.f5668b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2067f) {
                if (this.f5668b == ((C2067f) obj).f5668b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Integer.valueOf(this.f5668b).hashCode();
    }

    public String toString() {
        return "ToastEvent(res=" + this.f5668b + ")";
    }
}
