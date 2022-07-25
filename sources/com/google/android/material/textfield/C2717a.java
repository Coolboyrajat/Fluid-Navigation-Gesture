package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p006b.p007a.p008k.p009a.C0664a;
import p054c.p083e.p084a.p085a.C1172e;
import p054c.p083e.p084a.p085a.C1176i;
import p054c.p083e.p084a.p085a.p087l.C1179a;

/* renamed from: com.google.android.material.textfield.a */
class C2717a extends C2738e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f7233d = new C2718a();

    /* renamed from: e */
    private final TextInputLayout.C2713e f7234e = new C2719b();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AnimatorSet f7235f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ValueAnimator f7236g;

    /* renamed from: com.google.android.material.textfield.a$a */
    class C2718a implements TextWatcher {
        C2718a() {
        }

        public void afterTextChanged(Editable editable) {
            if (!C2717a.m10758b(editable)) {
                C2717a.this.f7235f.cancel();
                C2717a.this.f7236g.start();
            } else if (!C2717a.this.f7271a.mo8642a()) {
                C2717a.this.f7236g.cancel();
                C2717a.this.f7235f.start();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    class C2719b implements TextInputLayout.C2713e {
        C2719b() {
        }

        /* renamed from: a */
        public void mo8756a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(C2717a.m10758b(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.removeTextChangedListener(C2717a.this.f7233d);
            editText.addTextChangedListener(C2717a.this.f7233d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    class C2720c implements View.OnClickListener {
        C2720c() {
        }

        public void onClick(View view) {
            C2717a.this.f7271a.getEditText().setText((CharSequence) null);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    class C2721d extends AnimatorListenerAdapter {
        C2721d() {
        }

        public void onAnimationStart(Animator animator) {
            C2717a.this.f7271a.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    class C2722e extends AnimatorListenerAdapter {
        C2722e() {
        }

        public void onAnimationEnd(Animator animator) {
            C2717a.this.f7271a.setEndIconVisible(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$f */
    class C2723f implements ValueAnimator.AnimatorUpdateListener {
        C2723f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2717a.this.f7273c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$g */
    class C2724g implements ValueAnimator.AnimatorUpdateListener {
        C2724g() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C2717a.this.f7273c.setScaleX(floatValue);
            C2717a.this.f7273c.setScaleY(floatValue);
        }
    }

    C2717a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: a */
    private ValueAnimator m10755a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1179a.f3914a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new C2723f());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m10758b(Editable editable) {
        return editable.length() > 0;
    }

    /* renamed from: c */
    private ValueAnimator m10759c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C1179a.f3917d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C2724g());
        return ofFloat;
    }

    /* renamed from: d */
    private void m10761d() {
        ValueAnimator c = m10759c();
        ValueAnimator a = m10755a(0.0f, 1.0f);
        this.f7235f = new AnimatorSet();
        this.f7235f.playTogether(new Animator[]{c, a});
        this.f7235f.addListener(new C2721d());
        this.f7236g = m10755a(1.0f, 0.0f);
        this.f7236g.addListener(new C2722e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8762a() {
        this.f7271a.setEndIconDrawable(C0664a.m3682c(this.f7272b, C1172e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f7271a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C1176i.clear_text_end_icon_content_description));
        this.f7271a.setEndIconOnClickListener(new C2720c());
        this.f7271a.mo8639a(this.f7234e);
        m10761d();
    }
}
