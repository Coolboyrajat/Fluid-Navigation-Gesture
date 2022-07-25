package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.C0344e;
import p006b.p007a.C0663j;
import p006b.p007a.p008k.p009a.C0664a;

/* renamed from: androidx.appcompat.widget.m */
public class C0206m {

    /* renamed from: a */
    private final ImageView f1029a;

    /* renamed from: b */
    private C0213p0 f1030b;

    /* renamed from: c */
    private C0213p0 f1031c;

    /* renamed from: d */
    private C0213p0 f1032d;

    public C0206m(ImageView imageView) {
        this.f1029a = imageView;
    }

    /* renamed from: a */
    private boolean m1021a(Drawable drawable) {
        if (this.f1032d == null) {
            this.f1032d = new C0213p0();
        }
        C0213p0 p0Var = this.f1032d;
        p0Var.mo1521a();
        ColorStateList a = C0344e.m1723a(this.f1029a);
        if (a != null) {
            p0Var.f1055d = true;
            p0Var.f1052a = a;
        }
        PorterDuff.Mode b = C0344e.m1726b(this.f1029a);
        if (b != null) {
            p0Var.f1054c = true;
            p0Var.f1053b = b;
        }
        if (!p0Var.f1055d && !p0Var.f1054c) {
            return false;
        }
        C0192i.m962a(drawable, p0Var, this.f1029a.getDrawableState());
        return true;
    }

    /* renamed from: e */
    private boolean m1022e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1030b != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1496a() {
        Drawable drawable = this.f1029a.getDrawable();
        if (drawable != null) {
            C0249z.m1267b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m1022e() || !m1021a(drawable)) {
            C0213p0 p0Var = this.f1031c;
            if (p0Var != null) {
                C0192i.m962a(drawable, p0Var, this.f1029a.getDrawableState());
                return;
            }
            C0213p0 p0Var2 = this.f1030b;
            if (p0Var2 != null) {
                C0192i.m962a(drawable, p0Var2, this.f1029a.getDrawableState());
            }
        }
    }

    /* renamed from: a */
    public void mo1497a(int i) {
        if (i != 0) {
            Drawable c = C0664a.m3682c(this.f1029a.getContext(), i);
            if (c != null) {
                C0249z.m1267b(c);
            }
            this.f1029a.setImageDrawable(c);
        } else {
            this.f1029a.setImageDrawable((Drawable) null);
        }
        mo1496a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1498a(ColorStateList colorStateList) {
        if (this.f1031c == null) {
            this.f1031c = new C0213p0();
        }
        C0213p0 p0Var = this.f1031c;
        p0Var.f1052a = colorStateList;
        p0Var.f1055d = true;
        mo1496a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1499a(PorterDuff.Mode mode) {
        if (this.f1031c == null) {
            this.f1031c = new C0213p0();
        }
        C0213p0 p0Var = this.f1031c;
        p0Var.f1053b = mode;
        p0Var.f1054c = true;
        mo1496a();
    }

    /* renamed from: a */
    public void mo1500a(AttributeSet attributeSet, int i) {
        int g;
        C0217r0 a = C0217r0.m1054a(this.f1029a.getContext(), attributeSet, C0663j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f1029a.getDrawable();
            if (!(drawable != null || (g = a.mo1544g(C0663j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = C0664a.m3682c(this.f1029a.getContext(), g)) == null)) {
                this.f1029a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0249z.m1267b(drawable);
            }
            if (a.mo1545g(C0663j.AppCompatImageView_tint)) {
                C0344e.m1724a(this.f1029a, a.mo1529a(C0663j.AppCompatImageView_tint));
            }
            if (a.mo1545g(C0663j.AppCompatImageView_tintMode)) {
                C0344e.m1725a(this.f1029a, C0249z.m1265a(a.mo1538d(C0663j.AppCompatImageView_tintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.mo1531a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo1501b() {
        C0213p0 p0Var = this.f1031c;
        if (p0Var != null) {
            return p0Var.f1052a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode mo1502c() {
        C0213p0 p0Var = this.f1031c;
        if (p0Var != null) {
            return p0Var.f1053b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo1503d() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1029a.getBackground() instanceof RippleDrawable);
    }
}
