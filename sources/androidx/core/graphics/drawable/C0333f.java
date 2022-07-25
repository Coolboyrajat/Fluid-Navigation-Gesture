package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: androidx.core.graphics.drawable.f */
final class C0333f extends Drawable.ConstantState {

    /* renamed from: a */
    int f1583a;

    /* renamed from: b */
    Drawable.ConstantState f1584b;

    /* renamed from: c */
    ColorStateList f1585c = null;

    /* renamed from: d */
    PorterDuff.Mode f1586d = C0331d.f1575l;

    C0333f(C0333f fVar) {
        if (fVar != null) {
            this.f1583a = fVar.f1583a;
            this.f1584b = fVar.f1584b;
            this.f1585c = fVar.f1585c;
            this.f1586d = fVar.f1586d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2025a() {
        return this.f1584b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f1583a;
        Drawable.ConstantState constantState = this.f1584b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new C0332e(this, resources) : new C0331d(this, resources);
    }
}
