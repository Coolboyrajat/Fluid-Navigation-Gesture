package kotlin.p205x.p207d;

import kotlin.p192b0.C3201b;
import kotlin.p192b0.C3205f;

/* renamed from: kotlin.x.d.i */
public class C3368i extends C3360c implements C3367h, C3205f {

    /* renamed from: i */
    private final int f8034i;

    public C3368i(int i) {
        this.f8034i = i;
    }

    public C3368i(int i, Object obj) {
        super(obj);
        this.f8034i = i;
    }

    /* renamed from: d */
    public int mo10058d() {
        return this.f8034i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3368i) {
            C3368i iVar = (C3368i) obj;
            if (mo6063h() != null ? mo6063h().equals(iVar.mo6063h()) : iVar.mo6063h() == null) {
                return mo6062b().equals(iVar.mo6062b()) && mo6064j().equals(iVar.mo6064j()) && C3370k.m12225a(mo10065g(), iVar.mo10065g());
            }
        } else if (obj instanceof C3205f) {
            return obj.equals(mo10063e());
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C3201b mo10064f() {
        C3384y.m12256a(this);
        return this;
    }

    public int hashCode() {
        return (((mo6063h() == null ? 0 : mo6063h().hashCode() * 31) + mo6062b().hashCode()) * 31) + mo6064j().hashCode();
    }

    public String toString() {
        C3201b e = mo10063e();
        if (e != this) {
            return e.toString();
        }
        if ("<init>".equals(mo6062b())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + mo6062b() + " (Kotlin reflection is not available)";
    }
}
