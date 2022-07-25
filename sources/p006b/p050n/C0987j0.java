package p006b.p050n;

import android.os.IBinder;

/* renamed from: b.n.j0 */
class C0987j0 implements C0991l0 {

    /* renamed from: a */
    private final IBinder f3508a;

    C0987j0(IBinder iBinder) {
        this.f3508a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0987j0) && ((C0987j0) obj).f3508a.equals(this.f3508a);
    }

    public int hashCode() {
        return this.f3508a.hashCode();
    }
}
