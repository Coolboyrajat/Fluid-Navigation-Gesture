package com.p131fb.fluid.p148ui.p149g.p150a;

import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.ui.g.a.c */
public final class C2064c extends C2068g {

    /* renamed from: b */
    private final String f5665b;

    public C2064c(String str) {
        C3370k.m12227b(str, "url");
        this.f5665b = str;
    }

    /* renamed from: a */
    public final String mo6927a() {
        return this.f5665b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C2064c) && C3370k.m12225a((Object) this.f5665b, (Object) ((C2064c) obj).f5665b);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f5665b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "LaunchUrlEvent(url=" + this.f5665b + ")";
    }
}
