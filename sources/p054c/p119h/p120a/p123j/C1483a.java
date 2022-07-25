package p054c.p119h.p120a.p123j;

import kotlin.p205x.p207d.C3370k;

/* renamed from: c.h.a.j.a */
public final class C1483a<TInput> {

    /* renamed from: a */
    private final TInput f4507a;

    /* renamed from: b */
    private final C1499f f4508b;

    public C1483a(TInput tinput, C1499f fVar) {
        C3370k.m12227b(tinput, "regular");
        C3370k.m12227b(fVar, "dynamic");
        this.f4507a = tinput;
        this.f4508b = fVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1483a(Object obj, C1499f fVar, int i, C3366g gVar) {
        this(obj, (i & 2) != 0 ? new C1499f() : fVar);
    }

    /* renamed from: a */
    public final C1499f mo5944a() {
        return this.f4508b;
    }

    /* renamed from: b */
    public final TInput mo5945b() {
        return this.f4507a;
    }
}
