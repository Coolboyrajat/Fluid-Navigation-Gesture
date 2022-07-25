package com.p131fb.fluid.p148ui.p149g.p152c;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.p191a0.C3193d;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.ui.g.c.x */
public final class C2486x<T> extends C2472t<T> {

    /* renamed from: p */
    private List<Object> f6274p = new ArrayList();

    /* renamed from: q */
    private C3352d<? super C2486x<T>, ? super Boolean, ? super T, Unit> f6275q;

    /* renamed from: r */
    private boolean f6276r;

    /* renamed from: s */
    private boolean f6277s;

    public C2486x(C3350b<? super C2486x<T>, Unit> bVar) {
        C3370k.m12227b(bVar, "func");
        bVar.mo5146a(this);
    }

    /* renamed from: a */
    public static /* synthetic */ C2486x m9294a(C2486x xVar, Object[] objArr, List list, C3193d dVar, Boolean bool, boolean z, boolean z2, C3352d dVar2, int i, Object obj) {
        C3352d dVar3 = null;
        List list2 = (i & 2) != 0 ? null : list;
        C3193d dVar4 = (i & 4) != 0 ? null : dVar;
        Boolean bool2 = (i & 8) != 0 ? null : bool;
        boolean z3 = false;
        boolean z4 = (i & 16) != 0 ? false : z;
        if ((i & 32) == 0) {
            z3 = z2;
        }
        if ((i & 64) == 0) {
            dVar3 = dVar2;
        }
        xVar.mo7350a(objArr, list2, dVar4, bool2, z4, z3, dVar3);
        return xVar;
    }

    /* renamed from: a */
    public final C2486x<T> mo7350a(Object[] objArr, List<? extends Object> list, C3193d dVar, Boolean bool, boolean z, boolean z2, C3352d<? super C2486x<T>, ? super Boolean, ? super T, Unit> dVar2) {
        C3370k.m12227b(objArr, "args");
        this.f6274p.clear();
        if (list != null) {
            this.f6274p.addAll(list);
        }
        if (dVar != null) {
            this.f6274p.addAll(C3292r.m12104g(dVar));
        }
        boolean unused = C3289o.m12080a(this.f6274p, (T[]) objArr);
        this.f6277s = z2;
        this.f6276r = bool != null ? bool.booleanValue() : this.f6274p.size() < 10;
        this.f6275q = dVar2;
        return this;
    }

    /* renamed from: m */
    public final boolean mo7351m() {
        return this.f6276r;
    }

    /* renamed from: n */
    public final C3352d<C2486x<T>, Boolean, T, Unit> mo7352n() {
        return this.f6275q;
    }

    /* renamed from: o */
    public final boolean mo7353o() {
        return this.f6277s;
    }

    /* renamed from: p */
    public final List<Object> mo7354p() {
        return this.f6274p;
    }
}
