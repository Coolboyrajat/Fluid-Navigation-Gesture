package com.p131fb.fluid.p148ui.p149g.p151b;

import android.content.Intent;
import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.ui.g.b.l0 */
public final class C2258l0 extends C2068g {

    /* renamed from: b */
    private final Intent f5940b;

    public C2258l0(Intent intent) {
        C3370k.m12227b(intent, "intent");
        this.f5940b = intent;
    }

    /* renamed from: a */
    public final Intent mo7110a() {
        return this.f5940b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C2258l0) && C3370k.m12225a((Object) this.f5940b, (Object) ((C2258l0) obj).f5940b);
        }
        return true;
    }

    public int hashCode() {
        Intent intent = this.f5940b;
        if (intent != null) {
            return intent.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ShortcutsEvent(intent=" + this.f5940b + ")";
    }
}
