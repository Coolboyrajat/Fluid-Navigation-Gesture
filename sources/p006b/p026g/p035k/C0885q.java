package p006b.p026g.p035k;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: b.g.k.q */
public class C0885q {

    /* renamed from: a */
    private int f3313a;

    /* renamed from: b */
    private int f3314b;

    public C0885q(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int mo4667a() {
        return this.f3313a | this.f3314b;
    }

    /* renamed from: a */
    public void mo4668a(View view, int i) {
        if (i == 1) {
            this.f3314b = 0;
        } else {
            this.f3313a = 0;
        }
    }

    /* renamed from: a */
    public void mo4669a(View view, View view2, int i) {
        mo4670a(view, view2, i, 0);
    }

    /* renamed from: a */
    public void mo4670a(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f3314b = i;
        } else {
            this.f3313a = i;
        }
    }
}
