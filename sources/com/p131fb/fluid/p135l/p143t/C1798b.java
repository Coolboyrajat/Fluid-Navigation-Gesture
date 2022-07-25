package com.p131fb.fluid.p135l.p143t;

import kotlin.p205x.p207d.C3370k;
import p155d.p156a.p178w.C2973a;

/* renamed from: com.fb.fluid.l.t.b */
public final class C1798b<T> {

    /* renamed from: a */
    private T f5112a;

    /* renamed from: b */
    private final C2973a<T> f5113b;

    public C1798b(T t) {
        this.f5112a = t;
        C2973a<T> f = C2973a.m11438f(this.f5112a);
        C3370k.m12223a((Object) f, "BehaviorSubject.createDefault<T>(value)");
        this.f5113b = f;
    }

    /* renamed from: a */
    public final C2973a<T> mo6587a() {
        return this.f5113b;
    }

    /* renamed from: a */
    public final void mo6588a(T t) {
        this.f5112a = t;
        this.f5113b.mo6032a(t);
    }

    /* renamed from: b */
    public final T mo6589b() {
        return this.f5112a;
    }
}
