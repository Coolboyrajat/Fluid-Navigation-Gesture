package com.p131fb.fluid.p148ui.p149g.p152c;

/* renamed from: com.fb.fluid.ui.g.c.p */
public final class C2466p {

    /* renamed from: a */
    private final int f6211a;

    public C2466p(int i) {
        this.f6211a = i;
    }

    /* renamed from: a */
    public final int mo7309a() {
        return this.f6211a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2466p) {
                if (this.f6211a == ((C2466p) obj).f6211a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Integer.valueOf(this.f6211a).hashCode();
    }

    public String toString() {
        return "ImageItem(img=" + this.f6211a + ")";
    }
}
