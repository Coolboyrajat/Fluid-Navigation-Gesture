package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0328a;
import p006b.p007a.C0663j;
import p006b.p026g.p035k.C0890v;

/* renamed from: androidx.appcompat.widget.r */
class C0216r extends C0212p {

    /* renamed from: d */
    private final SeekBar f1058d;

    /* renamed from: e */
    private Drawable f1059e;

    /* renamed from: f */
    private ColorStateList f1060f = null;

    /* renamed from: g */
    private PorterDuff.Mode f1061g = null;

    /* renamed from: h */
    private boolean f1062h = false;

    /* renamed from: i */
    private boolean f1063i = false;

    C0216r(SeekBar seekBar) {
        super(seekBar);
        this.f1058d = seekBar;
    }

    /* renamed from: d */
    private void m1046d() {
        if (this.f1059e == null) {
            return;
        }
        if (this.f1062h || this.f1063i) {
            this.f1059e = C0328a.m1626i(this.f1059e.mutate());
            if (this.f1062h) {
                C0328a.m1611a(this.f1059e, this.f1060f);
            }
            if (this.f1063i) {
                C0328a.m1614a(this.f1059e, this.f1061g);
            }
            if (this.f1059e.isStateful()) {
                this.f1059e.setState(this.f1058d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1523a(Canvas canvas) {
        if (this.f1059e != null) {
            int max = this.f1058d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1059e.getIntrinsicWidth();
                int intrinsicHeight = this.f1059e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1059e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f1058d.getWidth() - this.f1058d.getPaddingLeft()) - this.f1058d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1058d.getPaddingLeft(), (float) (this.f1058d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1059e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1524a(Drawable drawable) {
        Drawable drawable2 = this.f1059e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1059e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1058d);
            C0328a.m1617a(drawable, C0890v.m4791o(this.f1058d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1058d.getDrawableState());
            }
            m1046d();
        }
        this.f1058d.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1520a(AttributeSet attributeSet, int i) {
        super.mo1520a(attributeSet, i);
        C0217r0 a = C0217r0.m1054a(this.f1058d.getContext(), attributeSet, C0663j.AppCompatSeekBar, i, 0);
        Drawable c = a.mo1537c(C0663j.AppCompatSeekBar_android_thumb);
        if (c != null) {
            this.f1058d.setThumb(c);
        }
        mo1524a(a.mo1535b(C0663j.AppCompatSeekBar_tickMark));
        if (a.mo1545g(C0663j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f1061g = C0249z.m1265a(a.mo1538d(C0663j.AppCompatSeekBar_tickMarkTintMode, -1), this.f1061g);
            this.f1063i = true;
        }
        if (a.mo1545g(C0663j.AppCompatSeekBar_tickMarkTint)) {
            this.f1060f = a.mo1529a(C0663j.AppCompatSeekBar_tickMarkTint);
            this.f1062h = true;
        }
        a.mo1531a();
        m1046d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1525b() {
        Drawable drawable = this.f1059e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1058d.getDrawableState())) {
            this.f1058d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1526c() {
        Drawable drawable = this.f1059e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
