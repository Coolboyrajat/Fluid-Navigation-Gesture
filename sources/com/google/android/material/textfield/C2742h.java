package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p006b.p007a.p008k.p009a.C0664a;
import p054c.p083e.p084a.p085a.C1172e;
import p054c.p083e.p084a.p085a.C1176i;

/* renamed from: com.google.android.material.textfield.h */
class C2742h extends C2738e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f7300d = new C2743a();

    /* renamed from: e */
    private final TextInputLayout.C2713e f7301e = new C2744b();

    /* renamed from: f */
    private final TextInputLayout.C2714f f7302f = new C2745c(this);

    /* renamed from: com.google.android.material.textfield.h$a */
    class C2743a implements TextWatcher {
        C2743a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C2742h hVar = C2742h.this;
            hVar.f7273c.setChecked(!hVar.m10850c());
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.h$b */
    class C2744b implements TextInputLayout.C2713e {
        C2744b() {
        }

        /* renamed from: a */
        public void mo8756a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            C2742h hVar = C2742h.this;
            hVar.f7273c.setChecked(!hVar.m10850c());
            editText.removeTextChangedListener(C2742h.this.f7300d);
            editText.addTextChangedListener(C2742h.this.f7300d);
        }
    }

    /* renamed from: com.google.android.material.textfield.h$c */
    class C2745c implements TextInputLayout.C2714f {
        C2745c(C2742h hVar) {
        }

        /* renamed from: a */
        public void mo8757a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.h$d */
    class C2746d implements View.OnClickListener {
        C2746d() {
        }

        public void onClick(View view) {
            EditText editText = C2742h.this.f7271a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                editText.setTransformationMethod(C2742h.this.m10850c() ? null : PasswordTransformationMethod.getInstance());
                editText.setSelection(selectionEnd);
            }
        }
    }

    C2742h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m10850c() {
        EditText editText = this.f7271a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8762a() {
        this.f7271a.setEndIconDrawable(C0664a.m3682c(this.f7272b, C1172e.design_password_eye));
        TextInputLayout textInputLayout = this.f7271a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C1176i.password_toggle_content_description));
        this.f7271a.setEndIconOnClickListener(new C2746d());
        this.f7271a.mo8639a(this.f7301e);
        this.f7271a.mo8640a(this.f7302f);
    }
}
