package p054c.p083e.p084a.p085a.p089n;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import p006b.p007a.p008k.p009a.C0664a;
import p006b.p019c.p020a.C0712a;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.p102z.C1238g;
import p054c.p083e.p084a.p085a.p102z.C1252j;

/* renamed from: c.e.a.a.n.a */
public class C1191a extends C0712a implements Checkable, C1252j {

    /* renamed from: q */
    private static final int[] f3937q = {16842911};

    /* renamed from: r */
    private static final int[] f3938r = {16842912};

    /* renamed from: s */
    private static final int[] f3939s = {C1169b.state_dragged};

    /* renamed from: k */
    private final C1193b f3940k;

    /* renamed from: l */
    private final FrameLayout f3941l;

    /* renamed from: m */
    private final boolean f3942m;

    /* renamed from: n */
    private boolean f3943n;

    /* renamed from: o */
    private boolean f3944o;

    /* renamed from: p */
    private C1192a f3945p;

    /* renamed from: c.e.a.a.n.a$a */
    public interface C1192a {
        /* renamed from: a */
        void mo5370a(C1191a aVar, boolean z);
    }

    /* renamed from: e */
    private void m5767e() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f3940k.mo5371a();
            throw null;
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.f3941l.addView(view, i, layoutParams);
    }

    /* renamed from: c */
    public boolean mo5328c() {
        C1193b bVar = this.f3940k;
        if (bVar == null) {
            return false;
        }
        bVar.mo5396o();
        throw null;
    }

    /* renamed from: d */
    public boolean mo5329d() {
        return this.f3944o;
    }

    public ColorStateList getCardBackgroundColor() {
        this.f3940k.mo5382c();
        throw null;
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        this.f3940k.mo5384d();
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        this.f3940k.mo5386e();
        throw null;
    }

    public int getContentPaddingBottom() {
        this.f3940k.mo5394m();
        throw null;
    }

    public int getContentPaddingLeft() {
        this.f3940k.mo5394m();
        throw null;
    }

    public int getContentPaddingRight() {
        this.f3940k.mo5394m();
        throw null;
    }

    public int getContentPaddingTop() {
        this.f3940k.mo5394m();
        throw null;
    }

    public float getProgress() {
        this.f3940k.mo5388g();
        throw null;
    }

    public float getRadius() {
        this.f3940k.mo5387f();
        throw null;
    }

    public ColorStateList getRippleColor() {
        this.f3940k.mo5389h();
        throw null;
    }

    public C1238g getShapeAppearanceModel() {
        this.f3940k.mo5390i();
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        this.f3940k.mo5391j();
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        this.f3940k.mo5392k();
        throw null;
    }

    public int getStrokeWidth() {
        this.f3940k.mo5393l();
        throw null;
    }

    public boolean isChecked() {
        return this.f3943n;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3940k.mo5379b();
        throw null;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo5328c()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f3937q);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f3938r);
        }
        if (mo5329d()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f3939s);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C1191a.class.getName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C1191a.class.getName());
        accessibilityNodeInfo.setCheckable(mo5328c());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f3940k.mo5374a(getMeasuredWidth(), getMeasuredHeight());
        throw null;
    }

    public void removeAllViews() {
        this.f3941l.removeAllViews();
    }

    public void removeView(View view) {
        this.f3941l.removeView(view);
    }

    public void removeViewAt(int i) {
        this.f3941l.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        this.f3941l.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        this.f3941l.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        this.f3941l.removeViewsInLayout(i, i2);
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f3942m) {
            this.f3940k.mo5395n();
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i) {
        this.f3940k.mo5375a(ColorStateList.valueOf(i));
        throw null;
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f3940k.mo5375a(colorStateList);
        throw null;
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f3940k.mo5398q();
        throw null;
    }

    public void setCheckable(boolean z) {
        this.f3940k.mo5378a(z);
        throw null;
    }

    public void setChecked(boolean z) {
        if (this.f3943n != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f3940k.mo5376a(drawable);
        throw null;
    }

    public void setCheckedIconResource(int i) {
        this.f3940k.mo5376a(C0664a.m3682c(getContext(), i));
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f3940k.mo5381b(colorStateList);
        throw null;
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        this.f3940k.mo5397p();
        throw null;
    }

    public void setDragged(boolean z) {
        if (this.f3944o != z) {
            this.f3944o = z;
            refreshDrawableState();
            m5767e();
            invalidate();
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f3941l.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams2.gravity = ((FrameLayout.LayoutParams) layoutParams).gravity;
            this.f3941l.requestLayout();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f3940k.mo5399r();
        throw null;
    }

    public void setOnCheckedChangeListener(C1192a aVar) {
        this.f3945p = aVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f3940k.mo5399r();
        throw null;
    }

    public void setProgress(float f) {
        this.f3940k.mo5380b(f);
        throw null;
    }

    public void setRadius(float f) {
        super.setRadius(f);
        this.f3940k.mo5372a(f);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f3940k.mo5383c(colorStateList);
        throw null;
    }

    public void setRippleColorResource(int i) {
        this.f3940k.mo5383c(C0664a.m3681b(getContext(), i));
        throw null;
    }

    public void setShapeAppearanceModel(C1238g gVar) {
        this.f3940k.mo5377a(gVar);
        throw null;
    }

    public void setStrokeColor(int i) {
        this.f3940k.mo5385d(ColorStateList.valueOf(i));
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f3940k.mo5385d(colorStateList);
        throw null;
    }

    public void setStrokeWidth(int i) {
        this.f3940k.mo5373a(i);
        throw null;
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f3940k.mo5399r();
        throw null;
    }

    public void toggle() {
        if (mo5328c() && isEnabled()) {
            this.f3943n = !this.f3943n;
            refreshDrawableState();
            m5767e();
            C1192a aVar = this.f3945p;
            if (aVar != null) {
                aVar.mo5370a(this, this.f3943n);
            }
        }
    }
}
