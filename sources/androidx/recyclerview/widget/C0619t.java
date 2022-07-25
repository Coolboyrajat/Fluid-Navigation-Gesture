package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.t */
class C0619t {

    /* renamed from: a */
    final C0621b f2493a;

    /* renamed from: b */
    C0620a f2494b = new C0620a();

    /* renamed from: androidx.recyclerview.widget.t$a */
    static class C0620a {

        /* renamed from: a */
        int f2495a = 0;

        /* renamed from: b */
        int f2496b;

        /* renamed from: c */
        int f2497c;

        /* renamed from: d */
        int f2498d;

        /* renamed from: e */
        int f2499e;

        C0620a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3607a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3608a(int i) {
            this.f2495a = i | this.f2495a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3609a(int i, int i2, int i3, int i4) {
            this.f2496b = i;
            this.f2497c = i2;
            this.f2498d = i3;
            this.f2499e = i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3610a() {
            int i = this.f2495a;
            if ((i & 7) != 0 && (i & (mo3607a(this.f2498d, this.f2496b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f2495a;
            if ((i2 & 112) != 0 && (i2 & (mo3607a(this.f2498d, this.f2497c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f2495a;
            if ((i3 & 1792) != 0 && (i3 & (mo3607a(this.f2499e, this.f2496b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f2495a;
            return (i4 & 28672) == 0 || (i4 & (mo3607a(this.f2499e, this.f2497c) << 12)) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3611b() {
            this.f2495a = 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.t$b */
    interface C0621b {
        /* renamed from: a */
        int mo3273a();

        /* renamed from: a */
        int mo3274a(View view);

        /* renamed from: a */
        View mo3275a(int i);

        /* renamed from: b */
        int mo3276b();

        /* renamed from: b */
        int mo3277b(View view);
    }

    C0619t(C0621b bVar) {
        this.f2493a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo3605a(int i, int i2, int i3, int i4) {
        int b = this.f2493a.mo3276b();
        int a = this.f2493a.mo3273a();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f2493a.mo3275a(i);
            this.f2494b.mo3609a(b, a, this.f2493a.mo3277b(a2), this.f2493a.mo3274a(a2));
            if (i3 != 0) {
                this.f2494b.mo3611b();
                this.f2494b.mo3608a(i3);
                if (this.f2494b.mo3610a()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f2494b.mo3611b();
                this.f2494b.mo3608a(i4);
                if (this.f2494b.mo3610a()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3606a(View view, int i) {
        this.f2494b.mo3609a(this.f2493a.mo3276b(), this.f2493a.mo3273a(), this.f2493a.mo3277b(view), this.f2493a.mo3274a(view));
        if (i == 0) {
            return false;
        }
        this.f2494b.mo3611b();
        this.f2494b.mo3608a(i);
        return this.f2494b.mo3610a();
    }
}
