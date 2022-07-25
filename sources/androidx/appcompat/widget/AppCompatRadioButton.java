package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.C0350j;
import p006b.p007a.C0654a;
import p006b.p007a.p008k.p009a.C0664a;
import p006b.p026g.p035k.C0889u;

public class AppCompatRadioButton extends RadioButton implements C0350j, C0889u {

    /* renamed from: f */
    private final C0184h f615f;

    /* renamed from: g */
    private final C0170e f616g;

    /* renamed from: h */
    private final C0235u f617h;

    public AppCompatRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0654a.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(C0211o0.m1039b(context), attributeSet, i);
        this.f615f = new C0184h(this);
        this.f615f.mo1366a(attributeSet, i);
        this.f616g = new C0170e(this);
        this.f616g.mo1292a(attributeSet, i);
        this.f617h = new C0235u(this);
        this.f617h.mo1656a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0170e eVar = this.f616g;
        if (eVar != null) {
            eVar.mo1287a();
        }
        C0235u uVar = this.f617h;
        if (uVar != null) {
            uVar.mo1648a();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0184h hVar = this.f615f;
        return hVar != null ? hVar.mo1362a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0170e eVar = this.f616g;
        if (eVar != null) {
            return eVar.mo1293b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0170e eVar = this.f616g;
        if (eVar != null) {
            return eVar.mo1295c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0184h hVar = this.f615f;
        if (hVar != null) {
            return hVar.mo1367b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0184h hVar = this.f615f;
        if (hVar != null) {
            return hVar.mo1368c();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0170e eVar = this.f616g;
        if (eVar != null) {
            eVar.mo1291a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0170e eVar = this.f616g;
        if (eVar != null) {
            eVar.mo1288a(i);
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0664a.m3682c(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0184h hVar = this.f615f;
        if (hVar != null) {
            hVar.mo1369d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0170e eVar = this.f616g;
        if (eVar != null) {
            eVar.mo1294b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0170e eVar = this.f616g;
        if (eVar != null) {
            eVar.mo1290a(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0184h hVar = this.f615f;
        if (hVar != null) {
            hVar.mo1364a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0184h hVar = this.f615f;
        if (hVar != null) {
            hVar.mo1365a(mode);
        }
    }
}
