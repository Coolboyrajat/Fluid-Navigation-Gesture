package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p006b.p007a.C0663j;
import p006b.p026g.p035k.C0890v;

/* renamed from: androidx.appcompat.widget.e */
class C0170e {

    /* renamed from: a */
    private final View f895a;

    /* renamed from: b */
    private final C0192i f896b;

    /* renamed from: c */
    private int f897c = -1;

    /* renamed from: d */
    private C0213p0 f898d;

    /* renamed from: e */
    private C0213p0 f899e;

    /* renamed from: f */
    private C0213p0 f900f;

    C0170e(View view) {
        this.f895a = view;
        this.f896b = C0192i.m963b();
    }

    /* renamed from: b */
    private boolean m863b(Drawable drawable) {
        if (this.f900f == null) {
            this.f900f = new C0213p0();
        }
        C0213p0 p0Var = this.f900f;
        p0Var.mo1521a();
        ColorStateList g = C0890v.m4780g(this.f895a);
        if (g != null) {
            p0Var.f1055d = true;
            p0Var.f1052a = g;
        }
        PorterDuff.Mode h = C0890v.m4782h(this.f895a);
        if (h != null) {
            p0Var.f1054c = true;
            p0Var.f1053b = h;
        }
        if (!p0Var.f1055d && !p0Var.f1054c) {
            return false;
        }
        C0192i.m962a(drawable, p0Var, this.f895a.getDrawableState());
        return true;
    }

    /* renamed from: d */
    private boolean m864d() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f898d != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1287a() {
        Drawable background = this.f895a.getBackground();
        if (background == null) {
            return;
        }
        if (!m864d() || !m863b(background)) {
            C0213p0 p0Var = this.f899e;
            if (p0Var != null) {
                C0192i.m962a(background, p0Var, this.f895a.getDrawableState());
                return;
            }
            C0213p0 p0Var2 = this.f898d;
            if (p0Var2 != null) {
                C0192i.m962a(background, p0Var2, this.f895a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1288a(int i) {
        this.f897c = i;
        C0192i iVar = this.f896b;
        mo1289a(iVar != null ? iVar.mo1389b(this.f895a.getContext(), i) : null);
        mo1287a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1289a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f898d == null) {
                this.f898d = new C0213p0();
            }
            C0213p0 p0Var = this.f898d;
            p0Var.f1052a = colorStateList;
            p0Var.f1055d = true;
        } else {
            this.f898d = null;
        }
        mo1287a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1290a(PorterDuff.Mode mode) {
        if (this.f899e == null) {
            this.f899e = new C0213p0();
        }
        C0213p0 p0Var = this.f899e;
        p0Var.f1053b = mode;
        p0Var.f1054c = true;
        mo1287a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1291a(Drawable drawable) {
        this.f897c = -1;
        mo1289a((ColorStateList) null);
        mo1287a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1292a(AttributeSet attributeSet, int i) {
        C0217r0 a = C0217r0.m1054a(this.f895a.getContext(), attributeSet, C0663j.ViewBackgroundHelper, i, 0);
        try {
            if (a.mo1545g(C0663j.ViewBackgroundHelper_android_background)) {
                this.f897c = a.mo1544g(C0663j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f896b.mo1389b(this.f895a.getContext(), this.f897c);
                if (b != null) {
                    mo1289a(b);
                }
            }
            if (a.mo1545g(C0663j.ViewBackgroundHelper_backgroundTint)) {
                C0890v.m4748a(this.f895a, a.mo1529a(C0663j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.mo1545g(C0663j.ViewBackgroundHelper_backgroundTintMode)) {
                C0890v.m4749a(this.f895a, C0249z.m1265a(a.mo1538d(C0663j.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.mo1531a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo1293b() {
        C0213p0 p0Var = this.f899e;
        if (p0Var != null) {
            return p0Var.f1052a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1294b(ColorStateList colorStateList) {
        if (this.f899e == null) {
            this.f899e = new C0213p0();
        }
        C0213p0 p0Var = this.f899e;
        p0Var.f1052a = colorStateList;
        p0Var.f1055d = true;
        mo1287a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode mo1295c() {
        C0213p0 p0Var = this.f899e;
        if (p0Var != null) {
            return p0Var.f1053b;
        }
        return null;
    }
}
