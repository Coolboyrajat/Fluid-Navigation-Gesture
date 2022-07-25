package com.p131fb.fluid.p148ui.p149g.p150a;

/* renamed from: com.fb.fluid.ui.g.a.a */
public final class C2061a extends C2068g {

    /* renamed from: b */
    private final int f5663b;

    public C2061a(int i) {
        this.f5663b = i;
    }

    /* renamed from: a */
    public final int mo6919a() {
        return this.f5663b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2061a) {
                if (this.f5663b == ((C2061a) obj).f5663b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Integer.valueOf(this.f5663b).hashCode();
    }

    public String toString() {
        return "LaunchPageEvent(page=" + this.f5663b + ")";
    }
}
