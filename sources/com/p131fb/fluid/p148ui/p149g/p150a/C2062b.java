package com.p131fb.fluid.p148ui.p149g.p150a;

/* renamed from: com.fb.fluid.ui.g.a.b */
public final class C2062b extends C2068g {

    /* renamed from: b */
    private final int f5664b;

    /* renamed from: com.fb.fluid.ui.g.a.b$a */
    public static final class C2063a {
        private C2063a() {
        }

        public /* synthetic */ C2063a(C3366g gVar) {
            this();
        }
    }

    static {
        new C2063a((C3366g) null);
    }

    public C2062b(int i) {
        this.f5664b = i;
    }

    /* renamed from: a */
    public final int mo6923a() {
        return this.f5664b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2062b) {
                if (this.f5664b == ((C2062b) obj).f5664b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Integer.valueOf(this.f5664b).hashCode();
    }

    public String toString() {
        return "LaunchSettingsEvent(dialogId=" + this.f5664b + ")";
    }
}
