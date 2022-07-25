package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.C0348i;
import p006b.p007a.C0654a;
import p006b.p026g.p035k.C0889u;

/* renamed from: androidx.appcompat.widget.j */
public class C0195j extends EditText implements C0889u {

    /* renamed from: f */
    private final C0170e f978f;

    /* renamed from: g */
    private final C0235u f979g;

    /* renamed from: h */
    private final C0233t f980h;

    public C0195j(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0195j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0654a.editTextStyle);
    }

    public C0195j(Context context, AttributeSet attributeSet, int i) {
        super(C0211o0.m1039b(context), attributeSet, i);
        this.f978f = new C0170e(this);
        this.f978f.mo1292a(attributeSet, i);
        this.f979g = new C0235u(this);
        this.f979g.mo1656a(attributeSet, i);
        this.f979g.mo1648a();
        this.f980h = new C0233t(this);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0170e eVar = this.f978f;
        if (eVar != null) {
            eVar.mo1287a();
        }
        C0235u uVar = this.f979g;
        if (uVar != null) {
            uVar.mo1648a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0170e eVar = this.f978f;
        if (eVar != null) {
            return eVar.mo1293b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0170e eVar = this.f978f;
        if (eVar != null) {
            return eVar.mo1295c();
        }
        return null;
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f980h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.t r0 = r2.f980h
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.mo1646a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0195j.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0197k.m988a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0170e eVar = this.f978f;
        if (eVar != null) {
            eVar.mo1291a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0170e eVar = this.f978f;
        if (eVar != null) {
            eVar.mo1288a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0348i.m1735a((TextView) this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0170e eVar = this.f978f;
        if (eVar != null) {
            eVar.mo1294b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0170e eVar = this.f978f;
        if (eVar != null) {
            eVar.mo1290a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0235u uVar = this.f979g;
        if (uVar != null) {
            uVar.mo1652a(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0233t tVar;
        if (Build.VERSION.SDK_INT >= 28 || (tVar = this.f980h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            tVar.mo1647a(textClassifier);
        }
    }
}
