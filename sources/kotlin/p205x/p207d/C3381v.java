package kotlin.p205x.p207d;

import kotlin.p192b0.C3201b;
import kotlin.p192b0.C3208i;

/* renamed from: kotlin.x.d.v */
public abstract class C3381v extends C3360c implements C3208i {
    public C3381v() {
    }

    public C3381v(Object obj) {
        super(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3381v) {
            C3381v vVar = (C3381v) obj;
            return mo6063h().equals(vVar.mo6063h()) && mo6062b().equals(vVar.mo6062b()) && mo6064j().equals(vVar.mo6064j()) && C3370k.m12225a(mo10065g(), vVar.mo10065g());
        } else if (obj instanceof C3208i) {
            return obj.equals(mo10063e());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((mo6063h().hashCode() * 31) + mo6062b().hashCode()) * 31) + mo6064j().hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C3208i mo10066i() {
        return (C3208i) super.mo10066i();
    }

    public String toString() {
        C3201b e = mo10063e();
        if (e != this) {
            return e.toString();
        }
        return "property " + mo6062b() + " (Kotlin reflection is not available)";
    }
}
