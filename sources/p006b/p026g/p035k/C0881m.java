package p006b.p026g.p035k;

import android.view.View;
import android.view.ViewParent;

/* renamed from: b.g.k.m */
public class C0881m {

    /* renamed from: a */
    private ViewParent f3308a;

    /* renamed from: b */
    private ViewParent f3309b;

    /* renamed from: c */
    private final View f3310c;

    /* renamed from: d */
    private boolean f3311d;

    /* renamed from: e */
    private int[] f3312e;

    public C0881m(View view) {
        this.f3310c = view;
    }

    /* renamed from: a */
    private void m4698a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f3308a = viewParent;
        } else if (i == 1) {
            this.f3309b = viewParent;
        }
    }

    /* renamed from: b */
    private boolean m4699b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent d;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!mo4663b() || (d = m4700d(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f3310c.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] d2 = m4701d();
            d2[0] = 0;
            d2[1] = 0;
            iArr3 = d2;
        } else {
            iArr3 = iArr2;
        }
        C0901y.m4846a(d, this.f3310c, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f3310c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    /* renamed from: d */
    private ViewParent m4700d(int i) {
        if (i == 0) {
            return this.f3308a;
        }
        if (i != 1) {
            return null;
        }
        return this.f3309b;
    }

    /* renamed from: d */
    private int[] m4701d() {
        if (this.f3312e == null) {
            this.f3312e = new int[2];
        }
        return this.f3312e;
    }

    /* renamed from: a */
    public void mo4652a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m4699b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: a */
    public void mo4653a(boolean z) {
        if (this.f3311d) {
            C0890v.m4738I(this.f3310c);
        }
        this.f3311d = z;
    }

    /* renamed from: a */
    public boolean mo4654a() {
        return mo4657a(0);
    }

    /* renamed from: a */
    public boolean mo4655a(float f, float f2) {
        ViewParent d;
        if (!mo4663b() || (d = m4700d(0)) == null) {
            return false;
        }
        return C0901y.m4849a(d, this.f3310c, f, f2);
    }

    /* renamed from: a */
    public boolean mo4656a(float f, float f2, boolean z) {
        ViewParent d;
        if (!mo4663b() || (d = m4700d(0)) == null) {
            return false;
        }
        return C0901y.m4850a(d, this.f3310c, f, f2, z);
    }

    /* renamed from: a */
    public boolean mo4657a(int i) {
        return m4700d(i) != null;
    }

    /* renamed from: a */
    public boolean mo4658a(int i, int i2) {
        if (mo4657a(i2)) {
            return true;
        }
        if (!mo4663b()) {
            return false;
        }
        View view = this.f3310c;
        for (ViewParent parent = this.f3310c.getParent(); parent != null; parent = parent.getParent()) {
            if (C0901y.m4852b(parent, view, this.f3310c, i, i2)) {
                m4698a(i2, parent);
                C0901y.m4848a(parent, view, this.f3310c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo4659a(int i, int i2, int i3, int i4, int[] iArr) {
        return m4699b(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: a */
    public boolean mo4660a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m4699b(i, i2, i3, i4, iArr, i5, (int[]) null);
    }

    /* renamed from: a */
    public boolean mo4661a(int i, int i2, int[] iArr, int[] iArr2) {
        return mo4662a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean mo4662a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent d;
        int i4;
        int i5;
        if (!mo4663b() || (d = m4700d(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f3310c.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i4 = iArr2[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            iArr = m4701d();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C0901y.m4847a(d, this.f3310c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f3310c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i4;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: b */
    public boolean mo4663b() {
        return this.f3311d;
    }

    /* renamed from: b */
    public boolean mo4664b(int i) {
        return mo4658a(i, 0);
    }

    /* renamed from: c */
    public void mo4665c() {
        mo4666c(0);
    }

    /* renamed from: c */
    public void mo4666c(int i) {
        ViewParent d = m4700d(i);
        if (d != null) {
            C0901y.m4845a(d, this.f3310c, i);
            m4698a(i, (ViewParent) null);
        }
    }
}
