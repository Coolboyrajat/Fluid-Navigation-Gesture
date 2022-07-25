package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.C0341b;
import androidx.core.widget.C0348i;
import p006b.p007a.C0654a;
import p006b.p026g.p035k.C0889u;

/* renamed from: androidx.appcompat.widget.f */
public class C0179f extends Button implements C0889u, C0341b {

    /* renamed from: f */
    private final C0170e f942f;

    /* renamed from: g */
    private final C0235u f943g;

    public C0179f(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0179f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0654a.buttonStyle);
    }

    public C0179f(Context context, AttributeSet attributeSet, int i) {
        super(C0211o0.m1039b(context), attributeSet, i);
        this.f942f = new C0170e(this);
        this.f942f.mo1292a(attributeSet, i);
        this.f943g = new C0235u(this);
        this.f943g.mo1656a(attributeSet, i);
        this.f943g.mo1648a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0170e eVar = this.f942f;
        if (eVar != null) {
            eVar.mo1287a();
        }
        C0235u uVar = this.f943g;
        if (uVar != null) {
            uVar.mo1648a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0341b.f1646a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0235u uVar = this.f943g;
        if (uVar != null) {
            return uVar.mo1662c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0341b.f1646a) {
            return super.getAutoSizeMinTextSize();
        }
        C0235u uVar = this.f943g;
        if (uVar != null) {
            return uVar.mo1663d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0341b.f1646a) {
            return super.getAutoSizeStepGranularity();
        }
        C0235u uVar = this.f943g;
        if (uVar != null) {
            return uVar.mo1664e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0341b.f1646a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0235u uVar = this.f943g;
        return uVar != null ? uVar.mo1665f() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C0341b.f1646a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0235u uVar = this.f943g;
        if (uVar != null) {
            return uVar.mo1666g();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0170e eVar = this.f942f;
        if (eVar != null) {
            return eVar.mo1293b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0170e eVar = this.f942f;
        if (eVar != null) {
            return eVar.mo1295c();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0235u uVar = this.f943g;
        if (uVar != null) {
            uVar.mo1659a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0235u uVar = this.f943g;
        if (uVar != null && !C0341b.f1646a && uVar.mo1669j()) {
            this.f943g.mo1661b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C0341b.f1646a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0235u uVar = this.f943g;
        if (uVar != null) {
            uVar.mo1651a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C0341b.f1646a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0235u uVar = this.f943g;
        if (uVar != null) {
            uVar.mo1660a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0341b.f1646a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0235u uVar = this.f943g;
        if (uVar != null) {
            uVar.mo1649a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0170e eVar = this.f942f;
        if (eVar != null) {
            eVar.mo1291a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0170e eVar = this.f942f;
        if (eVar != null) {
            eVar.mo1288a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0348i.m1735a((TextView) this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0235u uVar = this.f943g;
        if (uVar != null) {
            uVar.mo1658a(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0170e eVar = this.f942f;
        if (eVar != null) {
            eVar.mo1294b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0170e eVar = this.f942f;
        if (eVar != null) {
            eVar.mo1290a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0235u uVar = this.f943g;
        if (uVar != null) {
            uVar.mo1652a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C0341b.f1646a) {
            super.setTextSize(i, f);
            return;
        }
        C0235u uVar = this.f943g;
        if (uVar != null) {
            uVar.mo1650a(i, f);
        }
    }
}
