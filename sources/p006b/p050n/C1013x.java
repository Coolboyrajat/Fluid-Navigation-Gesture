package p006b.p050n;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: b.n.x */
class C1013x {
    /* renamed from: a */
    static C1012w m5261a(ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new C1011v(viewGroup) : C1010u.m5252a(viewGroup);
    }

    /* renamed from: a */
    static void m5262a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 18) {
            C1016z.m5266a(viewGroup, z);
        } else {
            C1014y.m5264a(viewGroup, z);
        }
    }
}
