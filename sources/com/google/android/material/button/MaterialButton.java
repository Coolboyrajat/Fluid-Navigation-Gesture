package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0179f;
import androidx.core.graphics.drawable.C0328a;
import androidx.core.widget.C0348i;
import com.google.android.material.internal.C2672g;
import com.google.android.material.internal.C2673h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p006b.p007a.p008k.p009a.C0664a;
import p006b.p026g.p035k.C0890v;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1177j;
import p054c.p083e.p084a.p085a.C1178k;
import p054c.p083e.p084a.p085a.p099w.C1218c;
import p054c.p083e.p084a.p085a.p102z.C1236e;
import p054c.p083e.p084a.p085a.p102z.C1238g;
import p054c.p083e.p084a.p085a.p102z.C1252j;

public class MaterialButton extends C0179f implements Checkable, C1252j {

    /* renamed from: t */
    private static final int[] f6685t = {16842911};

    /* renamed from: u */
    private static final int[] f6686u = {16842912};

    /* renamed from: v */
    private static final int f6687v = C1177j.Widget_MaterialComponents_Button;

    /* renamed from: h */
    private final C2588a f6688h;

    /* renamed from: i */
    private final LinkedHashSet<C2586a> f6689i;

    /* renamed from: j */
    private C2587b f6690j;

    /* renamed from: k */
    private PorterDuff.Mode f6691k;

    /* renamed from: l */
    private ColorStateList f6692l;

    /* renamed from: m */
    private Drawable f6693m;

    /* renamed from: n */
    private int f6694n;

    /* renamed from: o */
    private int f6695o;

    /* renamed from: p */
    private int f6696p;

    /* renamed from: q */
    private boolean f6697q;

    /* renamed from: r */
    private boolean f6698r;

    /* renamed from: s */
    private int f6699s;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface C2586a {
        /* renamed from: a */
        void mo7906a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    interface C2587b {
        /* renamed from: a */
        void mo7907a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1169b.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(C2672g.m10585b(context, attributeSet, i, f6687v), attributeSet, i);
        this.f6689i = new LinkedHashSet<>();
        this.f6697q = false;
        this.f6698r = false;
        Context context2 = getContext();
        TypedArray c = C2672g.m10589c(context2, attributeSet, C1178k.MaterialButton, i, f6687v, new int[0]);
        this.f6696p = c.getDimensionPixelSize(C1178k.MaterialButton_iconPadding, 0);
        this.f6691k = C2673h.m10593a(c.getInt(C1178k.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f6692l = C1218c.m5861a(getContext(), c, C1178k.MaterialButton_iconTint);
        this.f6693m = C1218c.m5863b(getContext(), c, C1178k.MaterialButton_icon);
        this.f6699s = c.getInteger(C1178k.MaterialButton_iconGravity, 1);
        this.f6694n = c.getDimensionPixelSize(C1178k.MaterialButton_iconSize, 0);
        this.f6688h = new C2588a(this, C1238g.m5967a(context2, attributeSet, i, f6687v).mo5547a());
        this.f6688h.mo7912a(c);
        c.recycle();
        setCompoundDrawablePadding(this.f6696p);
        m10028d();
    }

    /* renamed from: b */
    private boolean m10026b() {
        return C0890v.m4791o(this) == 1;
    }

    /* renamed from: c */
    private boolean m10027c() {
        C2588a aVar = this.f6688h;
        return aVar != null && !aVar.mo7929j();
    }

    /* renamed from: d */
    private void m10028d() {
        Drawable drawable = this.f6693m;
        if (drawable != null) {
            this.f6693m = C0328a.m1626i(drawable).mutate();
            C0328a.m1611a(this.f6693m, this.f6692l);
            PorterDuff.Mode mode = this.f6691k;
            if (mode != null) {
                C0328a.m1614a(this.f6693m, mode);
            }
            int i = this.f6694n;
            if (i == 0) {
                i = this.f6693m.getIntrinsicWidth();
            }
            int i2 = this.f6694n;
            if (i2 == 0) {
                i2 = this.f6693m.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f6693m;
            int i3 = this.f6695o;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.f6699s;
        if (i4 == 1 || i4 == 2) {
            C0348i.m1739a(this, this.f6693m, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            C0348i.m1739a(this, (Drawable) null, (Drawable) null, this.f6693m, (Drawable) null);
        }
    }

    /* renamed from: e */
    private void m10029e() {
        if (this.f6693m != null && getLayout() != null) {
            int i = this.f6699s;
            boolean z = false;
            if (i == 1 || i == 3) {
                this.f6695o = 0;
                m10028d();
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i2 = this.f6694n;
            if (i2 == 0) {
                i2 = this.f6693m.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - C0890v.m4795s(this)) - i2) - this.f6696p) - C0890v.m4796t(this)) / 2;
            boolean b = m10026b();
            if (this.f6699s == 4) {
                z = true;
            }
            if (b != z) {
                measuredWidth = -measuredWidth;
            }
            if (this.f6695o != measuredWidth) {
                this.f6695o = measuredWidth;
                m10028d();
            }
        }
    }

    private String getA11yClassName() {
        return (mo7859a() ? CompoundButton.class : Button.class).getName();
    }

    /* renamed from: a */
    public boolean mo7859a() {
        C2588a aVar = this.f6688h;
        return aVar != null && aVar.mo7930k();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m10027c()) {
            return this.f6688h.mo7908a();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f6693m;
    }

    public int getIconGravity() {
        return this.f6699s;
    }

    public int getIconPadding() {
        return this.f6696p;
    }

    public int getIconSize() {
        return this.f6694n;
    }

    public ColorStateList getIconTint() {
        return this.f6692l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f6691k;
    }

    public ColorStateList getRippleColor() {
        if (m10027c()) {
            return this.f6688h.mo7923d();
        }
        return null;
    }

    public C1238g getShapeAppearanceModel() {
        if (m10027c()) {
            return this.f6688h.mo7924e();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m10027c()) {
            return this.f6688h.mo7925f();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m10027c()) {
            return this.f6688h.mo7926g();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return m10027c() ? this.f6688h.mo7927h() : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m10027c() ? this.f6688h.mo7928i() : super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f6697q;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1236e.m5960a((View) this, this.f6688h.mo7920c());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo7859a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f6685t);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f6686u);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo7859a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C2588a aVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f6688h) != null) {
            aVar.mo7910a(i4 - i2, i3 - i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m10029e();
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m10029e();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (m10027c()) {
            this.f6688h.mo7909a(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (m10027c()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
                this.f6688h.mo7931l();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C0664a.m3682c(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m10027c()) {
            this.f6688h.mo7915a(z);
        }
    }

    public void setChecked(boolean z) {
        if (mo7859a() && isEnabled() && this.f6697q != z) {
            this.f6697q = z;
            refreshDrawableState();
            if (!this.f6698r) {
                this.f6698r = true;
                Iterator it = this.f6689i.iterator();
                while (it.hasNext()) {
                    ((C2586a) it.next()).mo7906a(this, this.f6697q);
                }
                this.f6698r = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (m10027c()) {
            this.f6688h.mo7917b(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m10027c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (m10027c()) {
            this.f6688h.mo7920c().mo5486a(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f6693m != drawable) {
            this.f6693m = drawable;
            m10028d();
        }
    }

    public void setIconGravity(int i) {
        if (this.f6699s != i) {
            this.f6699s = i;
            m10029e();
        }
    }

    public void setIconPadding(int i) {
        if (this.f6696p != i) {
            this.f6696p = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C0664a.m3682c(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f6694n != i) {
            this.f6694n = i;
            m10028d();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f6692l != colorStateList) {
            this.f6692l = colorStateList;
            m10028d();
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f6691k != mode) {
            this.f6691k = mode;
            m10028d();
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C0664a.m3681b(getContext(), i));
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(C2587b bVar) {
        this.f6690j = bVar;
    }

    public void setPressed(boolean z) {
        C2587b bVar = this.f6690j;
        if (bVar != null) {
            bVar.mo7907a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m10027c()) {
            this.f6688h.mo7911a(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m10027c()) {
            setRippleColor(C0664a.m3681b(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(C1238g gVar) {
        if (m10027c()) {
            this.f6688h.mo7914a(gVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m10027c()) {
            this.f6688h.mo7919b(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m10027c()) {
            this.f6688h.mo7918b(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m10027c()) {
            setStrokeColor(C0664a.m3681b(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m10027c()) {
            this.f6688h.mo7921c(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m10027c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m10027c()) {
            this.f6688h.mo7922c(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m10027c()) {
            this.f6688h.mo7913a(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.f6697q);
    }
}
