package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0328a;
import androidx.core.widget.C0348i;
import p006b.p007a.C0654a;
import p006b.p007a.C0663j;
import p006b.p007a.p008k.p009a.C0664a;
import p006b.p007a.p013n.C0683a;
import p006b.p026g.p035k.C0890v;

public class SwitchCompat extends CompoundButton {

    /* renamed from: S */
    private static final Property<SwitchCompat, Float> f712S = new C0138a(Float.class, "thumbPos");

    /* renamed from: T */
    private static final int[] f713T = {16842912};

    /* renamed from: A */
    private VelocityTracker f714A;

    /* renamed from: B */
    private int f715B;

    /* renamed from: C */
    float f716C;

    /* renamed from: D */
    private int f717D;

    /* renamed from: E */
    private int f718E;

    /* renamed from: F */
    private int f719F;

    /* renamed from: G */
    private int f720G;

    /* renamed from: H */
    private int f721H;

    /* renamed from: I */
    private int f722I;

    /* renamed from: J */
    private int f723J;

    /* renamed from: K */
    private final TextPaint f724K;

    /* renamed from: L */
    private ColorStateList f725L;

    /* renamed from: M */
    private Layout f726M;

    /* renamed from: N */
    private Layout f727N;

    /* renamed from: O */
    private TransformationMethod f728O;

    /* renamed from: P */
    ObjectAnimator f729P;

    /* renamed from: Q */
    private final C0235u f730Q;

    /* renamed from: R */
    private final Rect f731R;

    /* renamed from: f */
    private Drawable f732f;

    /* renamed from: g */
    private ColorStateList f733g;

    /* renamed from: h */
    private PorterDuff.Mode f734h;

    /* renamed from: i */
    private boolean f735i;

    /* renamed from: j */
    private boolean f736j;

    /* renamed from: k */
    private Drawable f737k;

    /* renamed from: l */
    private ColorStateList f738l;

    /* renamed from: m */
    private PorterDuff.Mode f739m;

    /* renamed from: n */
    private boolean f740n;

    /* renamed from: o */
    private boolean f741o;

    /* renamed from: p */
    private int f742p;

    /* renamed from: q */
    private int f743q;

    /* renamed from: r */
    private int f744r;

    /* renamed from: s */
    private boolean f745s;

    /* renamed from: t */
    private CharSequence f746t;

    /* renamed from: u */
    private CharSequence f747u;

    /* renamed from: v */
    private boolean f748v;

    /* renamed from: w */
    private int f749w;

    /* renamed from: x */
    private int f750x;

    /* renamed from: y */
    private float f751y;

    /* renamed from: z */
    private float f752z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    static class C0138a extends Property<SwitchCompat, Float> {
        C0138a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f716C);
        }

        /* renamed from: a */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public SwitchCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0654a.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f733g = null;
        this.f734h = null;
        this.f735i = false;
        this.f736j = false;
        this.f738l = null;
        this.f739m = null;
        this.f740n = false;
        this.f741o = false;
        this.f714A = VelocityTracker.obtain();
        this.f731R = new Rect();
        this.f724K = new TextPaint(1);
        Resources resources = getResources();
        this.f724K.density = resources.getDisplayMetrics().density;
        C0217r0 a = C0217r0.m1054a(context, attributeSet, C0663j.SwitchCompat, i, 0);
        this.f732f = a.mo1535b(C0663j.SwitchCompat_android_thumb);
        Drawable drawable = this.f732f;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.f737k = a.mo1535b(C0663j.SwitchCompat_track);
        Drawable drawable2 = this.f737k;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        this.f746t = a.mo1541e(C0663j.SwitchCompat_android_textOn);
        this.f747u = a.mo1541e(C0663j.SwitchCompat_android_textOff);
        this.f748v = a.mo1532a(C0663j.SwitchCompat_showText, true);
        this.f742p = a.mo1536c(C0663j.SwitchCompat_thumbTextPadding, 0);
        this.f743q = a.mo1536c(C0663j.SwitchCompat_switchMinWidth, 0);
        this.f744r = a.mo1536c(C0663j.SwitchCompat_switchPadding, 0);
        this.f745s = a.mo1532a(C0663j.SwitchCompat_splitTrack, false);
        ColorStateList a2 = a.mo1529a(C0663j.SwitchCompat_thumbTint);
        if (a2 != null) {
            this.f733g = a2;
            this.f735i = true;
        }
        PorterDuff.Mode a3 = C0249z.m1265a(a.mo1538d(C0663j.SwitchCompat_thumbTintMode, -1), (PorterDuff.Mode) null);
        if (this.f734h != a3) {
            this.f734h = a3;
            this.f736j = true;
        }
        if (this.f735i || this.f736j) {
            m712a();
        }
        ColorStateList a4 = a.mo1529a(C0663j.SwitchCompat_trackTint);
        if (a4 != null) {
            this.f738l = a4;
            this.f740n = true;
        }
        PorterDuff.Mode a5 = C0249z.m1265a(a.mo1538d(C0663j.SwitchCompat_trackTintMode, -1), (PorterDuff.Mode) null);
        if (this.f739m != a5) {
            this.f739m = a5;
            this.f741o = true;
        }
        if (this.f740n || this.f741o) {
            m717b();
        }
        int g = a.mo1544g(C0663j.SwitchCompat_switchTextAppearance, 0);
        if (g != 0) {
            mo1021a(context, g);
        }
        this.f730Q = new C0235u(this);
        this.f730Q.mo1656a(attributeSet, i);
        a.mo1531a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f750x = viewConfiguration.getScaledTouchSlop();
        this.f715B = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: a */
    private static float m710a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: a */
    private Layout m711a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f728O;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f724K;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: a */
    private void m712a() {
        if (this.f732f == null) {
            return;
        }
        if (this.f735i || this.f736j) {
            this.f732f = C0328a.m1626i(this.f732f).mutate();
            if (this.f735i) {
                C0328a.m1611a(this.f732f, this.f733g);
            }
            if (this.f736j) {
                C0328a.m1614a(this.f732f, this.f734h);
            }
            if (this.f732f.isStateful()) {
                this.f732f.setState(getDrawableState());
            }
        }
    }

    /* renamed from: a */
    private void m713a(int i, int i2) {
        mo1022a(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    /* renamed from: a */
    private void m714a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    private void m715a(boolean z) {
        this.f729P = ObjectAnimator.ofFloat(this, f712S, new float[]{z ? 1.0f : 0.0f});
        this.f729P.setDuration(250);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f729P.setAutoCancel(true);
        }
        this.f729P.start();
    }

    /* renamed from: a */
    private boolean m716a(float f, float f2) {
        if (this.f732f == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f732f.getPadding(this.f731R);
        int i = this.f721H;
        int i2 = this.f750x;
        int i3 = i - i2;
        int i4 = (this.f720G + thumbOffset) - i2;
        Rect rect = this.f731R;
        return f > ((float) i4) && f < ((float) ((((this.f719F + i4) + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.f723J + i2));
    }

    /* renamed from: b */
    private void m717b() {
        if (this.f737k == null) {
            return;
        }
        if (this.f740n || this.f741o) {
            this.f737k = C0328a.m1626i(this.f737k).mutate();
            if (this.f740n) {
                C0328a.m1611a(this.f737k, this.f738l);
            }
            if (this.f741o) {
                C0328a.m1614a(this.f737k, this.f739m);
            }
            if (this.f737k.isStateful()) {
                this.f737k.setState(getDrawableState());
            }
        }
    }

    /* renamed from: b */
    private void m718b(MotionEvent motionEvent) {
        boolean z;
        this.f749w = 0;
        boolean z2 = true;
        boolean z3 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z3) {
            this.f714A.computeCurrentVelocity(1000);
            float xVelocity = this.f714A.getXVelocity();
            if (Math.abs(xVelocity) > ((float) this.f715B)) {
                if (!C0246x0.m1240a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z2 = false;
                }
                z = z2;
            } else {
                z = getTargetCheckedState();
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m714a(motionEvent);
    }

    /* renamed from: c */
    private void m719c() {
        ObjectAnimator objectAnimator = this.f729P;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        return this.f716C > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C0246x0.m1240a(this) ? 1.0f - this.f716C : this.f716C) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f737k;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f731R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f732f;
        Rect d = drawable2 != null ? C0249z.m1269d(drawable2) : C0249z.f1176c;
        return ((((this.f717D - this.f719F) - rect.left) - rect.right) - d.left) - d.right;
    }

    /* renamed from: a */
    public void mo1021a(Context context, int i) {
        C0217r0 a = C0217r0.m1052a(context, i, C0663j.TextAppearance);
        ColorStateList a2 = a.mo1529a(C0663j.TextAppearance_android_textColor);
        if (a2 == null) {
            a2 = getTextColors();
        }
        this.f725L = a2;
        int c = a.mo1536c(C0663j.TextAppearance_android_textSize, 0);
        if (c != 0) {
            float f = (float) c;
            if (f != this.f724K.getTextSize()) {
                this.f724K.setTextSize(f);
                requestLayout();
            }
        }
        m713a(a.mo1538d(C0663j.TextAppearance_android_typeface, -1), a.mo1538d(C0663j.TextAppearance_android_textStyle, -1));
        this.f728O = a.mo1532a(C0663j.TextAppearance_textAllCaps, false) ? new C0683a(getContext()) : null;
        a.mo1531a();
    }

    /* renamed from: a */
    public void mo1022a(Typeface typeface, int i) {
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int i2 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i;
            TextPaint textPaint = this.f724K;
            if ((i2 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f724K;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f724K.setFakeBoldText(false);
        this.f724K.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f731R;
        int i3 = this.f720G;
        int i4 = this.f721H;
        int i5 = this.f722I;
        int i6 = this.f723J;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f732f;
        Rect d = drawable != null ? C0249z.m1269d(drawable) : C0249z.f1176c;
        Drawable drawable2 = this.f737k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (d != null) {
                int i8 = d.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = d.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = d.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = d.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f737k.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f737k.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f732f;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f719F + rect.right;
            this.f732f.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0328a.m1610a(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f732f;
        if (drawable != null) {
            C0328a.m1609a(drawable, f, f2);
        }
        Drawable drawable2 = this.f737k;
        if (drawable2 != null) {
            C0328a.m1609a(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f732f;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f737k;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C0246x0.m1240a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f717D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f744r : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0246x0.m1240a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f717D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f744r : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f748v;
    }

    public boolean getSplitTrack() {
        return this.f745s;
    }

    public int getSwitchMinWidth() {
        return this.f743q;
    }

    public int getSwitchPadding() {
        return this.f744r;
    }

    public CharSequence getTextOff() {
        return this.f747u;
    }

    public CharSequence getTextOn() {
        return this.f746t;
    }

    public Drawable getThumbDrawable() {
        return this.f732f;
    }

    public int getThumbTextPadding() {
        return this.f742p;
    }

    public ColorStateList getThumbTintList() {
        return this.f733g;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f734h;
    }

    public Drawable getTrackDrawable() {
        return this.f737k;
    }

    public ColorStateList getTrackTintList() {
        return this.f738l;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f739m;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f732f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f737k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f729P;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f729P.end();
            this.f729P = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f713T);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f731R;
        Drawable drawable = this.f737k;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f721H;
        int i3 = this.f723J;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f732f;
        if (drawable != null) {
            if (!this.f745s || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = C0249z.m1269d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f726M : this.f727N;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f725L;
            if (colorStateList != null) {
                this.f724K.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f724K.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f746t : this.f747u;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f732f != null) {
            Rect rect = this.f731R;
            Drawable drawable = this.f737k;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = C0249z.m1269d(this.f732f);
            i5 = Math.max(0, d.left - rect.left);
            i11 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0246x0.m1240a(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f717D + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f717D) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i10 = this.f718E;
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f718E;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f718E;
            this.f720G = i7;
            this.f721H = i9;
            this.f723J = i8;
            this.f722I = i6;
        }
        i8 = i10 + i9;
        this.f720G = i7;
        this.f721H = i9;
        this.f723J = i8;
        this.f722I = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f748v) {
            if (this.f726M == null) {
                this.f726M = m711a(this.f746t);
            }
            if (this.f727N == null) {
                this.f727N = m711a(this.f747u);
            }
        }
        Rect rect = this.f731R;
        Drawable drawable = this.f732f;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f732f.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f732f.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f719F = Math.max(this.f748v ? Math.max(this.f726M.getWidth(), this.f727N.getWidth()) + (this.f742p * 2) : 0, i4);
        Drawable drawable2 = this.f737k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f737k.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f732f;
        if (drawable3 != null) {
            Rect d = C0249z.m1269d(drawable3);
            i6 = Math.max(i6, d.left);
            i7 = Math.max(i7, d.right);
        }
        int max = Math.max(this.f743q, (this.f719F * 2) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f717D = max;
        this.f718E = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f746t : this.f747u;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f714A
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x00a1
            r2 = 2
            if (r0 == r1) goto L_0x008d
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x008d
            goto L_0x00bb
        L_0x0016:
            int r0 = r6.f749w
            if (r0 == 0) goto L_0x00bb
            if (r0 == r1) goto L_0x0059
            if (r0 == r2) goto L_0x0020
            goto L_0x00bb
        L_0x0020:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f751y
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0034
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003f
        L_0x0034:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003f
        L_0x003b:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003f:
            boolean r0 = androidx.appcompat.widget.C0246x0.m1240a(r6)
            if (r0 == 0) goto L_0x0046
            float r2 = -r2
        L_0x0046:
            float r0 = r6.f716C
            float r0 = r0 + r2
            float r0 = m710a(r0, r4, r3)
            float r2 = r6.f716C
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            r6.f751y = r7
            r6.setThumbPosition(r0)
        L_0x0058:
            return r1
        L_0x0059:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f751y
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f750x
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007f
            float r4 = r6.f752z
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f750x
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00bb
        L_0x007f:
            r6.f749w = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f751y = r0
            r6.f752z = r3
            return r1
        L_0x008d:
            int r0 = r6.f749w
            if (r0 != r2) goto L_0x0098
            r6.m718b(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0098:
            r0 = 0
            r6.f749w = r0
            android.view.VelocityTracker r0 = r6.f714A
            r0.clear()
            goto L_0x00bb
        L_0x00a1:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00bb
            boolean r3 = r6.m716a((float) r0, (float) r2)
            if (r3 == 0) goto L_0x00bb
            r6.f749w = r1
            r6.f751y = r0
            r6.f752z = r2
        L_0x00bb:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C0890v.m4732C(this)) {
            m719c();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        m715a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0348i.m1735a((TextView) this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f748v != z) {
            this.f748v = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f745s = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f743q = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f744r = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f724K.getTypeface() != null && !this.f724K.getTypeface().equals(typeface)) || (this.f724K.getTypeface() == null && typeface != null)) {
            this.f724K.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f747u = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f746t = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f732f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f732f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f) {
        this.f716C = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0664a.m3682c(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f742p = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f733g = colorStateList;
        this.f735i = true;
        m712a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f734h = mode;
        this.f736j = true;
        m712a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f737k;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f737k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0664a.m3682c(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f738l = colorStateList;
        this.f740n = true;
        m717b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f739m = mode;
        this.f741o = true;
        m717b();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f732f || drawable == this.f737k;
    }
}
