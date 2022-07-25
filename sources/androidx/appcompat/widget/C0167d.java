package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.core.widget.C0348i;
import p006b.p007a.C0654a;
import p006b.p007a.p008k.p009a.C0664a;
import p006b.p026g.p035k.C0889u;

/* renamed from: androidx.appcompat.widget.d */
public class C0167d extends AutoCompleteTextView implements C0889u {

    /* renamed from: h */
    private static final int[] f875h = {16843126};

    /* renamed from: f */
    private final C0170e f876f;

    /* renamed from: g */
    private final C0235u f877g;

    public C0167d(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0167d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0654a.autoCompleteTextViewStyle);
    }

    public C0167d(Context context, AttributeSet attributeSet, int i) {
        super(C0211o0.m1039b(context), attributeSet, i);
        C0217r0 a = C0217r0.m1054a(getContext(), attributeSet, f875h, i, 0);
        if (a.mo1545g(0)) {
            setDropDownBackgroundDrawable(a.mo1535b(0));
        }
        a.mo1531a();
        this.f876f = new C0170e(this);
        this.f876f.mo1292a(attributeSet, i);
        this.f877g = new C0235u(this);
        this.f877g.mo1656a(attributeSet, i);
        this.f877g.mo1648a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0170e eVar = this.f876f;
        if (eVar != null) {
            eVar.mo1287a();
        }
        C0235u uVar = this.f877g;
        if (uVar != null) {
            uVar.mo1648a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0170e eVar = this.f876f;
        if (eVar != null) {
            return eVar.mo1293b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0170e eVar = this.f876f;
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
        C0170e eVar = this.f876f;
        if (eVar != null) {
            eVar.mo1291a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0170e eVar = this.f876f;
        if (eVar != null) {
            eVar.mo1288a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0348i.m1735a((TextView) this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0664a.m3682c(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0170e eVar = this.f876f;
        if (eVar != null) {
            eVar.mo1294b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0170e eVar = this.f876f;
        if (eVar != null) {
            eVar.mo1290a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0235u uVar = this.f877g;
        if (uVar != null) {
            uVar.mo1652a(context, i);
        }
    }
}
