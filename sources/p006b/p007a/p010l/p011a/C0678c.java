package p006b.p007a.p010l.p011a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0328a;

/* renamed from: b.a.l.a.c */
public class C0678c extends Drawable implements Drawable.Callback {

    /* renamed from: f */
    private Drawable f2679f;

    public C0678c(Drawable drawable) {
        mo3854a(drawable);
    }

    /* renamed from: a */
    public Drawable mo3853a() {
        return this.f2679f;
    }

    /* renamed from: a */
    public void mo3854a(Drawable drawable) {
        Drawable drawable2 = this.f2679f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2679f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f2679f.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f2679f.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f2679f.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2679f.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2679f.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f2679f.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2679f.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2679f.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2679f.getPadding(rect);
    }

    public int[] getState() {
        return this.f2679f.getState();
    }

    public Region getTransparentRegion() {
        return this.f2679f.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0328a.m1623f(this.f2679f);
    }

    public boolean isStateful() {
        return this.f2679f.isStateful();
    }

    public void jumpToCurrentState() {
        C0328a.m1624g(this.f2679f);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f2679f.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f2679f.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f2679f.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0328a.m1615a(this.f2679f, z);
    }

    public void setChangingConfigurations(int i) {
        this.f2679f.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2679f.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2679f.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2679f.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0328a.m1609a(this.f2679f, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0328a.m1610a(this.f2679f, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f2679f.setState(iArr);
    }

    public void setTint(int i) {
        C0328a.m1619b(this.f2679f, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0328a.m1611a(this.f2679f, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0328a.m1614a(this.f2679f, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2679f.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
