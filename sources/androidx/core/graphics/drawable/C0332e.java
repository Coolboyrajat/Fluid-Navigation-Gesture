package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.drawable.e */
class C0332e extends C0331d {

    /* renamed from: m */
    private static Method f1582m;

    C0332e(Drawable drawable) {
        super(drawable);
        m1635c();
    }

    C0332e(C0333f fVar, Resources resources) {
        super(fVar, resources);
        m1635c();
    }

    /* renamed from: c */
    private void m1635c() {
        if (f1582m == null) {
            try {
                f1582m = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1990b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f1581k;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public Rect getDirtyBounds() {
        return this.f1581k.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f1581k.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f1581k;
        if (!(drawable == null || (method = f1582m) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    public void setHotspot(float f, float f2) {
        this.f1581k.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f1581k.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo1990b()) {
            super.setTint(i);
        } else {
            this.f1581k.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo1990b()) {
            super.setTintList(colorStateList);
        } else {
            this.f1581k.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (mo1990b()) {
            super.setTintMode(mode);
        } else {
            this.f1581k.setTintMode(mode);
        }
    }
}
