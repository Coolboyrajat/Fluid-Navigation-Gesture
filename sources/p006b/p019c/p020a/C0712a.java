package p006b.p019c.p020a;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: b.c.a.a */
public class C0712a extends FrameLayout {

    /* renamed from: j */
    private static final C0719f f2776j;

    /* renamed from: f */
    private boolean f2777f;

    /* renamed from: g */
    private boolean f2778g;

    /* renamed from: h */
    final Rect f2779h;

    /* renamed from: i */
    private final C0718e f2780i;

    static {
        new int[1][0] = 16842801;
        int i = Build.VERSION.SDK_INT;
        f2776j = i >= 21 ? new C0715c() : i >= 17 ? new C0713b() : new C0716d();
        f2776j.mo4013a();
    }

    public ColorStateList getCardBackgroundColor() {
        return f2776j.mo4024f(this.f2780i);
    }

    public float getCardElevation() {
        return f2776j.mo4026h(this.f2780i);
    }

    public int getContentPaddingBottom() {
        return this.f2779h.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f2779h.left;
    }

    public int getContentPaddingRight() {
        return this.f2779h.right;
    }

    public int getContentPaddingTop() {
        return this.f2779h.top;
    }

    public float getMaxCardElevation() {
        return f2776j.mo4015a(this.f2780i);
    }

    public boolean getPreventCornerOverlap() {
        return this.f2778g;
    }

    public float getRadius() {
        return f2776j.mo4018b(this.f2780i);
    }

    public boolean getUseCompatPadding() {
        return this.f2777f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!(f2776j instanceof C0715c)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f2776j.mo4022d(this.f2780i)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f2776j.mo4020c(this.f2780i)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f2776j.mo4017a(this.f2780i, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f2776j.mo4017a(this.f2780i, colorStateList);
    }

    public void setCardElevation(float f) {
        f2776j.mo4016a(this.f2780i, f);
    }

    public void setMaxCardElevation(float f) {
        f2776j.mo4021c(this.f2780i, f);
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f2778g) {
            this.f2778g = z;
            f2776j.mo4025g(this.f2780i);
        }
    }

    public void setRadius(float f) {
        f2776j.mo4019b(this.f2780i, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f2777f != z) {
            this.f2777f = z;
            f2776j.mo4023e(this.f2780i);
        }
    }
}
