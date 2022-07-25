package kotlin;

import java.io.Serializable;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.n */
public final class C3267n<A, B, C> implements Serializable {

    /* renamed from: f */
    private final A f7987f;

    /* renamed from: g */
    private final B f7988g;

    /* renamed from: h */
    private final C f7989h;

    public C3267n(A a, B b, C c) {
        this.f7987f = a;
        this.f7988g = b;
        this.f7989h = c;
    }

    /* renamed from: a */
    public static /* synthetic */ C3267n m11981a(C3267n nVar, A a, B b, C c, int i, Object obj) {
        if ((i & 1) != 0) {
            a = nVar.f7987f;
        }
        if ((i & 2) != 0) {
            b = nVar.f7988g;
        }
        if ((i & 4) != 0) {
            c = nVar.f7989h;
        }
        return nVar.mo9947a(a, b, c);
    }

    /* renamed from: a */
    public final A mo9946a() {
        return this.f7987f;
    }

    /* renamed from: a */
    public final C3267n<A, B, C> mo9947a(A a, B b, C c) {
        return new C3267n<>(a, b, c);
    }

    /* renamed from: b */
    public final B mo9948b() {
        return this.f7988g;
    }

    /* renamed from: c */
    public final C mo9949c() {
        return this.f7989h;
    }

    /* renamed from: d */
    public final A mo9950d() {
        return this.f7987f;
    }

    /* renamed from: e */
    public final B mo9951e() {
        return this.f7988g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3267n)) {
            return false;
        }
        C3267n nVar = (C3267n) obj;
        return C3370k.m12225a((Object) this.f7987f, (Object) nVar.f7987f) && C3370k.m12225a((Object) this.f7988g, (Object) nVar.f7988g) && C3370k.m12225a((Object) this.f7989h, (Object) nVar.f7989h);
    }

    /* renamed from: f */
    public final C mo9953f() {
        return this.f7989h;
    }

    public int hashCode() {
        A a = this.f7987f;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f7988g;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f7989h;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return '(' + this.f7987f + ", " + this.f7988g + ", " + this.f7989h + ')';
    }
}
