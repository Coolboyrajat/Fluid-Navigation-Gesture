package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.e */
abstract class C2738e {

    /* renamed from: a */
    TextInputLayout f7271a;

    /* renamed from: b */
    Context f7272b;

    /* renamed from: c */
    CheckableImageButton f7273c;

    C2738e(TextInputLayout textInputLayout) {
        this.f7271a = textInputLayout;
        this.f7272b = textInputLayout.getContext();
        this.f7273c = textInputLayout.getEndIconView();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo8762a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo8773a(int i) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo8774b() {
        return false;
    }
}
