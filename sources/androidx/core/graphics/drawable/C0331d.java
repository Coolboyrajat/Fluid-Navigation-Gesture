package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.core.graphics.drawable.d */
class C0331d extends Drawable implements Drawable.Callback, C0330c, C0329b {

    /* renamed from: l */
    static final PorterDuff.Mode f1575l = PorterDuff.Mode.SRC_IN;

    /* renamed from: f */
    private int f1576f;

    /* renamed from: g */
    private PorterDuff.Mode f1577g;

    /* renamed from: h */
    private boolean f1578h;

    /* renamed from: i */
    C0333f f1579i;

    /* renamed from: j */
    private boolean f1580j;

    /* renamed from: k */
    Drawable f1581k;

    C0331d(Drawable drawable) {
        this.f1579i = m1631c();
        mo1989a(drawable);
    }

    C0331d(C0333f fVar, Resources resources) {
        this.f1579i = fVar;
        m1629a(resources);
    }

    /* renamed from: a */
    private void m1629a(Resources resources) {
        Drawable.ConstantState constantState;
        C0333f fVar = this.f1579i;
        if (fVar != null && (constantState = fVar.f1584b) != null) {
            mo1989a(constantState.newDrawable(resources));
        }
    }

    /* renamed from: a */
    private boolean m1630a(int[] iArr) {
        if (!mo1990b()) {
            return false;
        }
        C0333f fVar = this.f1579i;
        ColorStateList colorStateList = fVar.f1585c;
        PorterDuff.Mode mode = fVar.f1586d;
        if (colorStateList == null || mode == null) {
            this.f1578h = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f1578h && colorForState == this.f1576f && mode == this.f1577g)) {
                setColorFilter(colorForState, mode);
                this.f1576f = colorForState;
                this.f1577g = mode;
                this.f1578h = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private C0333f m1631c() {
        return new C0333f(this.f1579i);
    }

    /* renamed from: a */
    public final Drawable mo1988a() {
        return this.f1581k;
    }

    /* renamed from: a */
    public final void mo1989a(Drawable drawable) {
        Drawable drawable2 = this.f1581k;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1581k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0333f fVar = this.f1579i;
            if (fVar != null) {
                fVar.f1584b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1990b() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f1581k.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0333f fVar = this.f1579i;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f1581k.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        C0333f fVar = this.f1579i;
        if (fVar == null || !fVar.mo2025a()) {
            return null;
        }
        this.f1579i.f1583a = getChangingConfigurations();
        return this.f1579i;
    }

    public Drawable getCurrent() {
        return this.f1581k.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1581k.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1581k.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f1581k.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1581k.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1581k.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1581k.getPadding(rect);
    }

    public int[] getState() {
        return this.f1581k.getState();
    }

    public Region getTransparentRegion() {
        return this.f1581k.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f1581k.isAutoMirrored();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1579i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.mo1990b()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.f r0 = r1.f1579i
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f1585c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f1581k
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.C0331d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f1581k.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f1580j && super.mutate() == this) {
            this.f1579i = m1631c();
            Drawable drawable = this.f1581k;
            if (drawable != null) {
                drawable.mutate();
            }
            C0333f fVar = this.f1579i;
            if (fVar != null) {
                Drawable drawable2 = this.f1581k;
                fVar.f1584b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f1580j = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1581k;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f1581k.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f1581k.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f1581k.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f1581k.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1581k.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1581k.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1581k.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m1630a(iArr) || this.f1581k.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1579i.f1585c = colorStateList;
        m1630a(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1579i.f1586d = mode;
        m1630a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1581k.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
