package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.C0341b;
import androidx.core.widget.C0348i;
import androidx.core.widget.C0351k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p006b.p007a.p008k.p009a.C0664a;
import p006b.p026g.p027d.C0784c;
import p006b.p026g.p033i.C0818c;
import p006b.p026g.p035k.C0889u;

public class AppCompatTextView extends TextView implements C0889u, C0351k, C0341b {

    /* renamed from: f */
    private final C0170e f619f;

    /* renamed from: g */
    private final C0235u f620g;

    /* renamed from: h */
    private final C0233t f621h;

    /* renamed from: i */
    private Future<C0818c> f622i;

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0211o0.m1039b(context), attributeSet, i);
        this.f619f = new C0170e(this);
        this.f619f.mo1292a(attributeSet, i);
        this.f620g = new C0235u(this);
        this.f620g.mo1656a(attributeSet, i);
        this.f620g.mo1648a();
        this.f621h = new C0233t(this);
    }

    /* renamed from: d */
    private void mo293d() {
        Future<C0818c> future = this.f622i;
        if (future != null) {
            try {
                this.f622i = null;
                C0348i.m1741a((TextView) this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0170e eVar = this.f619f;
        if (eVar != null) {
            eVar.mo1287a();
        }
        C0235u uVar = this.f620g;
        if (uVar != null) {
            uVar.mo1648a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0341b.f1646a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0235u uVar = this.f620g;
        if (uVar != null) {
            return uVar.mo1662c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0341b.f1646a) {
            return super.getAutoSizeMinTextSize();
        }
        C0235u uVar = this.f620g;
        if (uVar != null) {
            return uVar.mo1663d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0341b.f1646a) {
            return super.getAutoSizeStepGranularity();
        }
        C0235u uVar = this.f620g;
        if (uVar != null) {
            return uVar.mo1664e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0341b.f1646a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0235u uVar = this.f620g;
        return uVar != null ? uVar.mo1665f() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C0341b.f1646a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0235u uVar = this.f620g;
        if (uVar != null) {
            return uVar.mo1666g();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return C0348i.m1743b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0348i.m1745c(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0170e eVar = this.f619f;
        if (eVar != null) {
            return eVar.mo1293b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0170e eVar = this.f619f;
        if (eVar != null) {
            return eVar.mo1295c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f620g.mo1667h();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f620g.mo1668i();
    }

    public CharSequence getText() {
        mo293d();
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f621h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.t r0 = r2.f621h
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.mo1646a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public C0818c.C0819a getTextMetricsParamsCompat() {
        return C0348i.m1749e(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0197k.m988a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0235u uVar = this.f620g;
        if (uVar != null) {
            uVar.mo1659a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo293d();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0235u uVar = this.f620g;
        if (uVar != null && !C0341b.f1646a && uVar.mo1669j()) {
            this.f620g.mo1661b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C0341b.f1646a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0235u uVar = this.f620g;
        if (uVar != null) {
            uVar.mo1651a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C0341b.f1646a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0235u uVar = this.f620g;
        if (uVar != null) {
            uVar.mo1660a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0341b.f1646a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0235u uVar = this.f620g;
        if (uVar != null) {
            uVar.mo1649a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0170e eVar = this.f619f;
        if (eVar != null) {
            eVar.mo1291a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0170e eVar = this.f619f;
        if (eVar != null) {
            eVar.mo1288a(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0235u uVar = this.f620g;
        if (uVar != null) {
            uVar.mo1670k();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0235u uVar = this.f620g;
        if (uVar != null) {
            uVar.mo1670k();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i != 0 ? C0664a.m3682c(context, i) : null;
        Drawable c2 = i2 != 0 ? C0664a.m3682c(context, i2) : null;
        Drawable c3 = i3 != 0 ? C0664a.m3682c(context, i3) : null;
        if (i4 != 0) {
            drawable = C0664a.m3682c(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(c, c2, c3, drawable);
        C0235u uVar = this.f620g;
        if (uVar != null) {
            uVar.mo1670k();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0235u uVar = this.f620g;
        if (uVar != null) {
            uVar.mo1670k();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i != 0 ? C0664a.m3682c(context, i) : null;
        Drawable c2 = i2 != 0 ? C0664a.m3682c(context, i2) : null;
        Drawable c3 = i3 != 0 ? C0664a.m3682c(context, i3) : null;
        if (i4 != 0) {
            drawable = C0664a.m3682c(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(c, c2, c3, drawable);
        C0235u uVar = this.f620g;
        if (uVar != null) {
            uVar.mo1670k();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0235u uVar = this.f620g;
        if (uVar != null) {
            uVar.mo1670k();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0348i.m1735a((TextView) this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0348i.m1736a((TextView) this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0348i.m1744b(this, i);
        }
    }

    public void setLineHeight(int i) {
        C0348i.m1746c(this, i);
    }

    public void setPrecomputedText(C0818c cVar) {
        C0348i.m1741a((TextView) this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0170e eVar = this.f619f;
        if (eVar != null) {
            eVar.mo1294b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0170e eVar = this.f619f;
        if (eVar != null) {
            eVar.mo1290a(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f620g.mo1653a(colorStateList);
        this.f620g.mo1648a();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f620g.mo1654a(mode);
        this.f620g.mo1648a();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0235u uVar = this.f620g;
        if (uVar != null) {
            uVar.mo1652a(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0233t tVar;
        if (Build.VERSION.SDK_INT >= 28 || (tVar = this.f621h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            tVar.mo1647a(textClassifier);
        }
    }

    public void setTextFuture(Future<C0818c> future) {
        this.f622i = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0818c.C0819a aVar) {
        C0348i.m1740a((TextView) this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (C0341b.f1646a) {
            super.setTextSize(i, f);
            return;
        }
        C0235u uVar = this.f620g;
        if (uVar != null) {
            uVar.mo1650a(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface a = (typeface == null || i <= 0) ? null : C0784c.m4371a(getContext(), typeface, i);
        if (a != null) {
            typeface = a;
        }
        super.setTypeface(typeface, i);
    }
}
