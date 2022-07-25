package com.google.android.material.appbar;

import android.view.View;
import p006b.p026g.p035k.C0890v;

/* renamed from: com.google.android.material.appbar.d */
class C2558d {

    /* renamed from: a */
    private final View f6565a;

    /* renamed from: b */
    private int f6566b;

    /* renamed from: c */
    private int f6567c;

    /* renamed from: d */
    private int f6568d;

    /* renamed from: e */
    private int f6569e;

    /* renamed from: f */
    private boolean f6570f = true;

    /* renamed from: g */
    private boolean f6571g = true;

    public C2558d(View view) {
        this.f6565a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7767a() {
        View view = this.f6565a;
        C0890v.m4777e(view, this.f6568d - (view.getTop() - this.f6566b));
        View view2 = this.f6565a;
        C0890v.m4775d(view2, this.f6569e - (view2.getLeft() - this.f6567c));
    }

    /* renamed from: a */
    public boolean mo7768a(int i) {
        if (!this.f6571g || this.f6569e == i) {
            return false;
        }
        this.f6569e = i;
        mo7767a();
        return true;
    }

    /* renamed from: b */
    public int mo7769b() {
        return this.f6568d;
    }

    /* renamed from: b */
    public boolean mo7770b(int i) {
        if (!this.f6570f || this.f6568d == i) {
            return false;
        }
        this.f6568d = i;
        mo7767a();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7771c() {
        this.f6566b = this.f6565a.getTop();
        this.f6567c = this.f6565a.getLeft();
    }
}
