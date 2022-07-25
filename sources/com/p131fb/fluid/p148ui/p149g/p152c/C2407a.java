package com.p131fb.fluid.p148ui.p149g.p152c;

import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.ui.g.c.a */
public final class C2407a extends C2472t<List<? extends String>> {

    /* renamed from: p */
    private boolean f6116p;

    /* renamed from: q */
    private boolean f6117q;

    /* renamed from: r */
    private final C3350b<C2407a, Unit> f6118r;

    public C2407a(C3350b<? super C2407a, Unit> bVar) {
        C3370k.m12227b(bVar, "func");
        this.f6118r = bVar;
        this.f6118r.mo5146a(this);
    }

    /* renamed from: c */
    public final C2407a mo7232c(boolean z) {
        this.f6116p = z;
        return this;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C2407a) && C3370k.m12225a((Object) this.f6118r, (Object) ((C2407a) obj).f6118r);
        }
        return true;
    }

    public int hashCode() {
        C3350b<C2407a, Unit> bVar = this.f6118r;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    /* renamed from: m */
    public final boolean mo7235m() {
        return this.f6117q;
    }

    /* renamed from: n */
    public final boolean mo7236n() {
        return this.f6116p;
    }

    public String toString() {
        return "AppSelectorItem(func=" + this.f6118r + ")";
    }
}
