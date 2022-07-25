package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.c */
public class C0571c implements C0606m {

    /* renamed from: a */
    final C0606m f2328a;

    /* renamed from: b */
    int f2329b = 0;

    /* renamed from: c */
    int f2330c = -1;

    /* renamed from: d */
    int f2331d = -1;

    /* renamed from: e */
    Object f2332e = null;

    public C0571c(C0606m mVar) {
        this.f2328a = mVar;
    }

    /* renamed from: a */
    public void mo3463a() {
        int i = this.f2329b;
        if (i != 0) {
            if (i == 1) {
                this.f2328a.mo3461b(this.f2330c, this.f2331d);
            } else if (i == 2) {
                this.f2328a.mo3459a(this.f2330c, this.f2331d);
            } else if (i == 3) {
                this.f2328a.mo3460a(this.f2330c, this.f2331d, this.f2332e);
            }
            this.f2332e = null;
            this.f2329b = 0;
        }
    }

    /* renamed from: a */
    public void mo3459a(int i, int i2) {
        int i3;
        if (this.f2329b != 2 || (i3 = this.f2330c) < i || i3 > i + i2) {
            mo3463a();
            this.f2330c = i;
            this.f2331d = i2;
            this.f2329b = 2;
            return;
        }
        this.f2331d += i2;
        this.f2330c = i;
    }

    /* renamed from: a */
    public void mo3460a(int i, int i2, Object obj) {
        int i3;
        if (this.f2329b == 3) {
            int i4 = this.f2330c;
            int i5 = this.f2331d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f2332e == obj) {
                this.f2330c = Math.min(i, i4);
                this.f2331d = Math.max(i5 + i4, i3) - this.f2330c;
                return;
            }
        }
        mo3463a();
        this.f2330c = i;
        this.f2331d = i2;
        this.f2332e = obj;
        this.f2329b = 3;
    }

    /* renamed from: b */
    public void mo3461b(int i, int i2) {
        int i3;
        if (this.f2329b == 1 && i >= (i3 = this.f2330c)) {
            int i4 = this.f2331d;
            if (i <= i3 + i4) {
                this.f2331d = i4 + i2;
                this.f2330c = Math.min(i, i3);
                return;
            }
        }
        mo3463a();
        this.f2330c = i;
        this.f2331d = i2;
        this.f2329b = 1;
    }

    /* renamed from: c */
    public void mo3462c(int i, int i2) {
        mo3463a();
        this.f2328a.mo3462c(i, i2);
    }
}
