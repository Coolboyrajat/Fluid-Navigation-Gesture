package kotlin;

import java.io.Serializable;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.j */
public final class C3261j<A, B> implements Serializable {

    /* renamed from: f */
    private final A f7980f;

    /* renamed from: g */
    private final B f7981g;

    public C3261j(A a, B b) {
        this.f7980f = a;
        this.f7981g = b;
    }

    /* renamed from: a */
    public final A mo9934a() {
        return this.f7980f;
    }

    /* renamed from: b */
    public final B mo9935b() {
        return this.f7981g;
    }

    /* renamed from: c */
    public final A mo9936c() {
        return this.f7980f;
    }

    /* renamed from: d */
    public final B mo9937d() {
        return this.f7981g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3261j)) {
            return false;
        }
        C3261j jVar = (C3261j) obj;
        return C3370k.m12225a((Object) this.f7980f, (Object) jVar.f7980f) && C3370k.m12225a((Object) this.f7981g, (Object) jVar.f7981g);
    }

    public int hashCode() {
        A a = this.f7980f;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f7981g;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return '(' + this.f7980f + ", " + this.f7981g + ')';
    }
}
