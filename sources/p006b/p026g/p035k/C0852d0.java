package p006b.p026g.p035k;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: b.g.k.d0 */
public class C0852d0 {

    /* renamed from: a */
    private final Object f3282a;

    private C0852d0(Object obj) {
        this.f3282a = obj;
    }

    /* renamed from: a */
    static C0852d0 m4582a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0852d0(obj);
    }

    /* renamed from: a */
    static Object m4583a(C0852d0 d0Var) {
        if (d0Var == null) {
            return null;
        }
        return d0Var.f3282a;
    }

    /* renamed from: a */
    public int mo4570a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f3282a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: a */
    public C0852d0 mo4571a(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0852d0(((WindowInsets) this.f3282a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    /* renamed from: b */
    public int mo4572b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f3282a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo4573c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f3282a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo4574d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f3282a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: e */
    public boolean mo4575e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f3282a).isConsumed();
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0852d0.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f3282a;
        Object obj3 = ((C0852d0) obj).f3282a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f3282a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
