package p179e.p184b.p185a.p187l0;

import kotlin.p205x.p207d.C3370k;
import p179e.p184b.p185a.C2999g0;

/* renamed from: e.b.a.l0.d */
public final class C3025d<C, I, S> implements C3026e<C, S> {

    /* renamed from: a */
    private final C3026e<C, I> f7776a;

    /* renamed from: b */
    private final C3026e<I, S> f7777b;

    public C3025d(C3026e<? super C, I> eVar, C3026e<? super I, S> eVar2) {
        C3370k.m12227b(eVar, "src");
        C3370k.m12227b(eVar2, "dst");
        this.f7776a = eVar;
        this.f7777b = eVar2;
    }

    /* renamed from: a */
    public C2999g0<? super C> mo9131a() {
        return this.f7776a.mo9131a();
    }

    /* renamed from: a */
    public S mo9132a(C c) {
        return this.f7777b.mo9132a(this.f7776a.mo9132a(c));
    }

    /* renamed from: b */
    public C2999g0<? super S> mo9133b() {
        return this.f7777b.mo9133b();
    }

    public String toString() {
        return '(' + this.f7776a + " -> " + this.f7777b + ')';
    }
}
