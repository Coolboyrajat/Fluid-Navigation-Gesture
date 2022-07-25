package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.core.widget.C0348i;
import p006b.p007a.p008k.p009a.C0664a;

/* renamed from: androidx.appcompat.widget.g */
public class C0181g extends CheckedTextView {

    /* renamed from: g */
    private static final int[] f944g = {16843016};

    /* renamed from: f */
    private final C0235u f945f;

    public C0181g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C0181g(Context context, AttributeSet attributeSet, int i) {
        super(C0211o0.m1039b(context), attributeSet, i);
        this.f945f = new C0235u(this);
        this.f945f.mo1656a(attributeSet, i);
        this.f945f.mo1648a();
        C0217r0 a = C0217r0.m1054a(getContext(), attributeSet, f944g, i, 0);
        setCheckMarkDrawable(a.mo1535b(0));
        a.mo1531a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0235u uVar = this.f945f;
        if (uVar != null) {
            uVar.mo1648a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0197k.m988a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0664a.m3682c(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0348i.m1735a((TextView) this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0235u uVar = this.f945f;
        if (uVar != null) {
            uVar.mo1652a(context, i);
        }
    }
}
