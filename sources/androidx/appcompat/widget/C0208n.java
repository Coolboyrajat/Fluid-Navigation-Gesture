package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p006b.p007a.C0654a;
import p006b.p007a.p008k.p009a.C0664a;
import p006b.p026g.p035k.C0889u;

/* renamed from: androidx.appcompat.widget.n */
public class C0208n extends MultiAutoCompleteTextView implements C0889u {

    /* renamed from: h */
    private static final int[] f1040h = {16843126};

    /* renamed from: f */
    private final C0170e f1041f;

    /* renamed from: g */
    private final C0235u f1042g;

    public C0208n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0654a.autoCompleteTextViewStyle);
    }

    public C0208n(Context context, AttributeSet attributeSet, int i) {
        super(C0211o0.m1039b(context), attributeSet, i);
        C0217r0 a = C0217r0.m1054a(getContext(), attributeSet, f1040h, i, 0);
        if (a.mo1545g(0)) {
            setDropDownBackgroundDrawable(a.mo1535b(0));
        }
        a.mo1531a();
        this.f1041f = new C0170e(this);
        this.f1041f.mo1292a(attributeSet, i);
        this.f1042g = new C0235u(this);
        this.f1042g.mo1656a(attributeSet, i);
        this.f1042g.mo1648a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0170e eVar = this.f1041f;
        if (eVar != null) {
            eVar.mo1287a();
        }
        C0235u uVar = this.f1042g;
        if (uVar != null) {
            uVar.mo1648a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0170e eVar = this.f1041f;
        if (eVar != null) {
            return eVar.mo1293b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0170e eVar = this.f1041f;
        if (eVar != null) {
            return eVar.mo1295c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0197k.m988a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0170e eVar = this.f1041f;
        if (eVar != null) {
            eVar.mo1291a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0170e eVar = this.f1041f;
        if (eVar != null) {
            eVar.mo1288a(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0664a.m3682c(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0170e eVar = this.f1041f;
        if (eVar != null) {
            eVar.mo1294b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0170e eVar = this.f1041f;
        if (eVar != null) {
            eVar.mo1290a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0235u uVar = this.f1042g;
        if (uVar != null) {
            uVar.mo1652a(context, i);
        }
    }
}
