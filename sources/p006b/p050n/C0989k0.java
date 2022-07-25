package p006b.p050n;

import android.view.View;
import android.view.WindowId;

/* renamed from: b.n.k0 */
class C0989k0 implements C0991l0 {

    /* renamed from: a */
    private final WindowId f3510a;

    C0989k0(View view) {
        this.f3510a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0989k0) && ((C0989k0) obj).f3510a.equals(this.f3510a);
    }

    public int hashCode() {
        return this.f3510a.hashCode();
    }
}
