package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.C2597a;
import com.google.android.material.internal.C2672g;
import com.google.android.material.internal.C2673h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p006b.p026g.p035k.C0838a;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.p036e0.C0857c;
import p006b.p039i.p041b.C0915a;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1176i;
import p054c.p083e.p084a.p085a.C1177j;
import p054c.p083e.p084a.p085a.C1178k;
import p054c.p083e.p084a.p085a.p087l.C1186h;
import p054c.p083e.p084a.p085a.p099w.C1218c;
import p054c.p083e.p084a.p085a.p099w.C1219d;
import p054c.p083e.p084a.p085a.p099w.C1223f;
import p054c.p083e.p084a.p085a.p100x.C1227b;
import p054c.p083e.p084a.p085a.p102z.C1233d;
import p054c.p083e.p084a.p085a.p102z.C1236e;
import p054c.p083e.p084a.p085a.p102z.C1238g;
import p054c.p083e.p084a.p085a.p102z.C1252j;
import p190io.objectbox.android.BuildConfig;

public class Chip extends AppCompatCheckBox implements C2597a.C2598a, C1252j {

    /* renamed from: A */
    private static final int[] f6719A = {16842911};
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final Rect f6720y = new Rect();

    /* renamed from: z */
    private static final int[] f6721z = {16842913};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C2597a f6722i;

    /* renamed from: j */
    private InsetDrawable f6723j;

    /* renamed from: k */
    private RippleDrawable f6724k;

    /* renamed from: l */
    private View.OnClickListener f6725l;

    /* renamed from: m */
    private CompoundButton.OnCheckedChangeListener f6726m;

    /* renamed from: n */
    private boolean f6727n;

    /* renamed from: o */
    private boolean f6728o;

    /* renamed from: p */
    private boolean f6729p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f6730q;

    /* renamed from: r */
    private boolean f6731r;

    /* renamed from: s */
    private int f6732s;

    /* renamed from: t */
    private int f6733t;

    /* renamed from: u */
    private final C2591c f6734u;

    /* renamed from: v */
    private final Rect f6735v;

    /* renamed from: w */
    private final RectF f6736w;

    /* renamed from: x */
    private final C1223f f6737x;

    /* renamed from: com.google.android.material.chip.Chip$a */
    class C2589a extends C1223f {
        C2589a() {
        }

        /* renamed from: a */
        public void mo5454a(int i) {
        }

        /* renamed from: a */
        public void mo5455a(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f6722i.mo8129W() ? Chip.this.f6722i.mo8120N() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    class C2590b extends ViewOutlineProvider {
        C2590b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f6722i != null) {
                Chip.this.f6722i.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    private class C2591c extends C0915a {
        C2591c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo4729a(float f, float f2) {
            return (!Chip.this.m10078i() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4731a(int i, C0857c cVar) {
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C1176i.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (TextUtils.isEmpty(text)) {
                        text = BuildConfig.FLAVOR;
                    }
                    objArr[0] = text;
                    closeIconContentDescription = context.getString(i2, objArr).trim();
                }
                cVar.mo4593b(closeIconContentDescription);
                cVar.mo4597c(Chip.this.getCloseIconTouchBoundsInt());
                cVar.mo4584a(C0857c.C0858a.f3294e);
                cVar.mo4614g(Chip.this.isEnabled());
                return;
            }
            cVar.mo4593b((CharSequence) BuildConfig.FLAVOR);
            cVar.mo4597c(Chip.f6720y);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4732a(int i, boolean z) {
            if (i == 1) {
                boolean unused = Chip.this.f6730q = z;
                Chip.this.refreshDrawableState();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4734a(C0857c cVar) {
            cVar.mo4595b(Chip.this.mo7934b());
            cVar.mo4604d(Chip.this.isClickable());
            cVar.mo4585a((CharSequence) (Chip.this.mo7934b() || Chip.this.isClickable()) ? Chip.this.mo7934b() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.mo4613g(text);
            } else {
                cVar.mo4593b(text);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4735a(List<Integer> list) {
            list.add(0);
            if (Chip.this.m10078i() && Chip.this.mo7935c()) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo4739a(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.mo7936d();
            }
            return false;
        }
    }

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1169b.chipStyle);
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6735v = new Rect();
        this.f6736w = new RectF();
        this.f6737x = new C2589a();
        m10067a(attributeSet);
        C2597a a = C2597a.m10114a(context, attributeSet, i, C1177j.Widget_MaterialComponents_Chip_Action);
        m10066a(context, attributeSet, i);
        setChipDrawable(a);
        a.mo5486a(C0890v.m4787k(this));
        TypedArray c = C2672g.m10589c(context, attributeSet, C1178k.Chip, i, C1177j.Widget_MaterialComponents_Chip_Action, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(C1218c.m5861a(context, c, C1178k.Chip_android_textColor));
        }
        boolean hasValue = c.hasValue(C1178k.Chip_shapeAppearance);
        c.recycle();
        this.f6734u = new C2591c(this);
        if (Build.VERSION.SDK_INT >= 24) {
            C0890v.m4752a((View) this, (C0838a) this.f6734u);
        } else {
            m10081l();
        }
        if (!hasValue) {
            m10079j();
        }
        setChecked(this.f6727n);
        setText(a.mo8120N());
        setEllipsize(a.mo8114H());
        setIncludeFontPadding(false);
        m10085p();
        if (!this.f6722i.mo8129W()) {
            setSingleLine();
        }
        setGravity(8388627);
        m10084o();
        if (mo7939e()) {
            setMinHeight(this.f6733t);
        }
        this.f6732s = C0890v.m4791o(this);
    }

    /* renamed from: a */
    private void m10065a(int i, int i2, int i3, int i4) {
        this.f6723j = new InsetDrawable(this.f6722i, i, i2, i3, i4);
    }

    /* renamed from: a */
    private void m10066a(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray c = C2672g.m10589c(context, attributeSet, C1178k.Chip, i, C1177j.Widget_MaterialComponents_Chip_Action, new int[0]);
            this.f6731r = c.getBoolean(C1178k.Chip_ensureMinTouchTargetSize, false);
            this.f6733t = (int) Math.ceil((double) c.getDimension(C1178k.Chip_chipMinTouchTargetSize, (float) Math.ceil((double) C2673h.m10591a(getContext(), 48))));
            c.recycle();
        }
    }

    /* renamed from: a */
    private void m10067a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* renamed from: a */
    private void m10068a(C2597a aVar) {
        aVar.mo8137a((C2597a.C2598a) this);
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private boolean m10069a(MotionEvent motionEvent) {
        Class<C0915a> cls = C0915a.class;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f6734u)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("i", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f6734u, new Object[]{Integer.valueOf(RecyclerView.UNDEFINED_DURATION)});
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m10071b(C2597a aVar) {
        if (aVar != null) {
            aVar.mo8137a((C2597a.C2598a) null);
        }
    }

    /* renamed from: g */
    private int[] m10076g() {
        int i = 0;
        int i2 = isEnabled() ? 1 : 0;
        if (this.f6730q) {
            i2++;
        }
        if (this.f6729p) {
            i2++;
        }
        if (this.f6728o) {
            i2++;
        }
        if (isChecked()) {
            i2++;
        }
        int[] iArr = new int[i2];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f6730q) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f6729p) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f6728o) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f6736w.setEmpty();
        if (m10078i()) {
            this.f6722i.mo8132a(this.f6736w);
        }
        return this.f6736w;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f6735v.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f6735v;
    }

    private C1219d getTextAppearance() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8121O();
        }
        return null;
    }

    /* renamed from: h */
    private void m10077h() {
        if (getBackgroundDrawable() == this.f6723j && this.f6722i.getCallback() == null) {
            this.f6722i.setCallback(this.f6723j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public boolean m10078i() {
        C2597a aVar = this.f6722i;
        return (aVar == null || aVar.mo8103A() == null) ? false : true;
    }

    /* renamed from: j */
    private void m10079j() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C2590b());
        }
    }

    /* renamed from: k */
    private void m10080k() {
        if (this.f6723j != null) {
            this.f6723j = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m10082m();
        }
    }

    /* renamed from: l */
    private void m10081l() {
        if (Build.VERSION.SDK_INT < 24) {
            C0890v.m4752a((View) this, (C0838a) (!m10078i() || !mo7935c()) ? null : this.f6734u);
        }
    }

    /* renamed from: m */
    private void m10082m() {
        if (C1227b.f3993a) {
            m10083n();
            return;
        }
        this.f6722i.mo8159f(true);
        C0890v.m4751a((View) this, getBackgroundDrawable());
        m10077h();
    }

    /* renamed from: n */
    private void m10083n() {
        this.f6724k = new RippleDrawable(C1227b.m5883a(this.f6722i.mo8118L()), getBackgroundDrawable(), (Drawable) null);
        this.f6722i.mo8159f(false);
        C0890v.m4751a((View) this, (Drawable) this.f6724k);
    }

    /* renamed from: o */
    private void m10084o() {
        C2597a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f6722i) != null) {
            C0890v.m4747a(this, (int) (this.f6722i.mo8209x() + this.f6722i.mo8123Q() + this.f6722i.mo8180n()), getPaddingTop(), (int) (aVar.mo8196s() + this.f6722i.mo8122P() + this.f6722i.mo8183o()), getPaddingBottom());
        }
    }

    /* renamed from: p */
    private void m10085p() {
        TextPaint paint = getPaint();
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C1219d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo5462b(getContext(), paint, this.f6737x);
        }
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f6729p != z) {
            this.f6729p = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f6728o != z) {
            this.f6728o = z;
            refreshDrawableState();
        }
    }

    /* renamed from: a */
    public void mo7932a() {
        mo7933a(this.f6733t);
        m10082m();
        m10084o();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        if (getMinWidth() != r6) goto L_0x0070;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7933a(int r6) {
        /*
            r5 = this;
            r5.f6733t = r6
            boolean r0 = r5.mo7939e()
            r1 = 0
            if (r0 != 0) goto L_0x000d
            r5.m10080k()
            return r1
        L_0x000d:
            com.google.android.material.chip.a r0 = r5.f6722i
            int r0 = r0.getIntrinsicHeight()
            int r0 = r6 - r0
            int r0 = java.lang.Math.max(r1, r0)
            com.google.android.material.chip.a r2 = r5.f6722i
            int r2 = r2.getIntrinsicWidth()
            int r2 = r6 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L_0x002d
            if (r0 > 0) goto L_0x002d
            r5.m10080k()
            return r1
        L_0x002d:
            if (r2 <= 0) goto L_0x0032
            int r2 = r2 / 2
            goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            if (r0 <= 0) goto L_0x0037
            int r1 = r0 / 2
        L_0x0037:
            android.graphics.drawable.InsetDrawable r0 = r5.f6723j
            r3 = 1
            if (r0 == 0) goto L_0x0057
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r4 = r5.f6723j
            r4.getPadding(r0)
            int r4 = r0.top
            if (r4 != r1) goto L_0x0057
            int r4 = r0.bottom
            if (r4 != r1) goto L_0x0057
            int r4 = r0.left
            if (r4 != r2) goto L_0x0057
            int r0 = r0.right
            if (r0 != r2) goto L_0x0057
            return r3
        L_0x0057:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 16
            if (r0 < r4) goto L_0x006d
            int r0 = r5.getMinHeight()
            if (r0 == r6) goto L_0x0066
            r5.setMinHeight(r6)
        L_0x0066:
            int r0 = r5.getMinWidth()
            if (r0 == r6) goto L_0x0073
            goto L_0x0070
        L_0x006d:
            r5.setMinHeight(r6)
        L_0x0070:
            r5.setMinWidth(r6)
        L_0x0073:
            r5.m10065a(r2, r1, r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.mo7933a(int):boolean");
    }

    /* renamed from: b */
    public boolean mo7934b() {
        C2597a aVar = this.f6722i;
        return aVar != null && aVar.mo8125S();
    }

    /* renamed from: c */
    public boolean mo7935c() {
        C2597a aVar = this.f6722i;
        return aVar != null && aVar.mo8127U();
    }

    /* renamed from: d */
    public boolean mo7936d() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f6725l;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f6734u.mo4738a(1, 1);
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m10069a(motionEvent) || this.f6734u.mo4741a(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f6734u.mo4740a(keyEvent) || this.f6734u.mo4745c() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2597a aVar = this.f6722i;
        if ((aVar == null || !aVar.mo8126T()) ? false : this.f6722i.mo8140a(m10076g())) {
            invalidate();
        }
    }

    /* renamed from: e */
    public boolean mo7939e() {
        return this.f6731r;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f6723j;
        return insetDrawable == null ? this.f6722i : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8188p();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8191q();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8194r();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f6722i;
    }

    public float getChipEndPadding() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8196s();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8200t();
        }
        return null;
    }

    public float getChipIconSize() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8202u();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8205v();
        }
        return null;
    }

    public float getChipMinHeight() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8207w();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8209x();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8211y();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8213z();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8103A();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8105B();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8107C();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8109D();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8111E();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8113G();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8114H();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f6734u.mo4745c() == 1 || this.f6734u.mo4742b() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C1186h getHideMotionSpec() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8115I();
        }
        return null;
    }

    public float getIconEndPadding() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8116J();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8117K();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8118L();
        }
        return null;
    }

    public C1238g getShapeAppearanceModel() {
        return this.f6722i.mo5514i();
    }

    public C1186h getShowMotionSpec() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8119M();
        }
        return null;
    }

    public float getTextEndPadding() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8122P();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            return aVar.mo8123Q();
        }
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1236e.m5960a((View) this, (C1233d) this.f6722i);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f6721z);
        }
        if (mo7934b()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f6719A);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f6734u.mo4736a(z, i, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z);
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((mo7934b() || isClickable()) ? mo7934b() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(mo7934b());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f6732s != i) {
            this.f6732s = i;
            m10084o();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f6728o
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f6728o
            if (r0 == 0) goto L_0x0034
            r5.mo7936d()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6724k) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6724k) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8139a(z);
        }
    }

    public void setCheckableResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8145c(i);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C2597a aVar = this.f6722i;
        if (aVar == null) {
            this.f6727n = z;
        } else if (aVar.mo8125S()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.f6726m) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8133a(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8149d(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8153e(i);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8144b(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8146c(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8157f(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8152e(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8161g(i);
        }
    }

    public void setChipDrawable(C2597a aVar) {
        C2597a aVar2 = this.f6722i;
        if (aVar2 != aVar) {
            m10071b(aVar2);
            this.f6722i = aVar;
            this.f6722i.mo8155e(false);
            m10068a(this.f6722i);
            mo7933a(this.f6733t);
            m10082m();
        }
    }

    public void setChipEndPadding(float f) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8156f(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8168h(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8141b(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8170i(i);
        }
    }

    public void setChipIconSize(float f) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8160g(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8173j(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8150d(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8175k(i);
        }
    }

    public void setChipIconVisible(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8177l(i);
        }
    }

    public void setChipIconVisible(boolean z) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8148c(z);
        }
    }

    public void setChipMinHeight(float f) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8167h(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8179m(i);
        }
    }

    public void setChipStartPadding(float f) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8169i(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8182n(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8154e(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8185o(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8172j(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8190p(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8147c(drawable);
        }
        m10081l();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8138a(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8174k(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8193q(i);
        }
    }

    public void setCloseIconResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8195r(i);
        }
        m10081l();
    }

    public void setCloseIconSize(float f) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8176l(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8197s(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8178m(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8201t(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8158f(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8203u(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8151d(z);
        }
        m10081l();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo5486a(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f6722i != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C2597a aVar = this.f6722i;
                if (aVar != null) {
                    aVar.mo8134a(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f6731r = z;
        mo7933a(this.f6733t);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C1186h hVar) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8135a(hVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8206v(i);
        }
    }

    public void setIconEndPadding(float f) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8181n(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8208w(i);
        }
    }

    public void setIconStartPadding(float f) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8184o(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8210x(i);
        }
    }

    public void setLayoutDirection(int i) {
        if (this.f6722i != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8212y(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f6726m = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f6725l = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8162g(colorStateList);
        }
        if (!this.f6722i.mo8124R()) {
            m10083n();
        }
    }

    public void setRippleColorResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8214z(i);
            if (!this.f6722i.mo8124R()) {
                m10083n();
            }
        }
    }

    public void setShapeAppearanceModel(C1238g gVar) {
        this.f6722i.setShapeAppearanceModel(gVar);
    }

    public void setShowMotionSpec(C1186h hVar) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8142b(hVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8104A(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.f6722i != null) {
            if (charSequence == null) {
                charSequence = BuildConfig.FLAVOR;
            }
            super.setText(this.f6722i.mo8129W() ? null : charSequence, bufferType);
            C2597a aVar = this.f6722i;
            if (aVar != null) {
                aVar.mo8143b(charSequence);
            }
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8106B(i);
        }
        m10085p();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8106B(i);
        }
        m10085p();
    }

    public void setTextAppearance(C1219d dVar) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8136a(dVar);
        }
        m10085p();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8189p(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8108C(i);
        }
    }

    public void setTextStartPadding(float f) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8192q(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C2597a aVar = this.f6722i;
        if (aVar != null) {
            aVar.mo8110D(i);
        }
    }
}
