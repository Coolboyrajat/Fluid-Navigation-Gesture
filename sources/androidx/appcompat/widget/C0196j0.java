package androidx.appcompat.widget;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.appcompat.widget.j0 */
class C0196j0 {

    /* renamed from: a */
    private int f981a = 0;

    /* renamed from: b */
    private int f982b = 0;

    /* renamed from: c */
    private int f983c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d */
    private int f984d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: e */
    private int f985e = 0;

    /* renamed from: f */
    private int f986f = 0;

    /* renamed from: g */
    private boolean f987g = false;

    /* renamed from: h */
    private boolean f988h = false;

    C0196j0() {
    }

    /* renamed from: a */
    public int mo1443a() {
        return this.f987g ? this.f981a : this.f982b;
    }

    /* renamed from: a */
    public void mo1444a(int i, int i2) {
        this.f988h = false;
        if (i != Integer.MIN_VALUE) {
            this.f985e = i;
            this.f981a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f986f = i2;
            this.f982b = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1445a(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f987g
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f987g = r2
            boolean r0 = r1.f988h
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f984d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f985e
        L_0x0016:
            r1.f981a = r2
            int r2 = r1.f983c
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.f983c
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.f985e
        L_0x0024:
            r1.f981a = r2
            int r2 = r1.f984d
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.f985e
            r1.f981a = r2
        L_0x002f:
            int r2 = r1.f986f
        L_0x0031:
            r1.f982b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0196j0.mo1445a(boolean):void");
    }

    /* renamed from: b */
    public int mo1446b() {
        return this.f981a;
    }

    /* renamed from: b */
    public void mo1447b(int i, int i2) {
        this.f983c = i;
        this.f984d = i2;
        this.f988h = true;
        if (this.f987g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f981a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f982b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f981a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f982b = i2;
        }
    }

    /* renamed from: c */
    public int mo1448c() {
        return this.f982b;
    }

    /* renamed from: d */
    public int mo1449d() {
        return this.f987g ? this.f982b : this.f981a;
    }
}
