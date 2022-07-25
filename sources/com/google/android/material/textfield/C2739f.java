package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C0348i;
import java.util.ArrayList;
import java.util.List;
import p006b.p026g.p035k.C0890v;
import p054c.p083e.p084a.p085a.C1171d;
import p054c.p083e.p084a.p085a.C1173f;
import p054c.p083e.p084a.p085a.p087l.C1179a;
import p054c.p083e.p084a.p085a.p087l.C1180b;

/* renamed from: com.google.android.material.textfield.f */
final class C2739f {

    /* renamed from: a */
    private final Context f7274a;

    /* renamed from: b */
    private final TextInputLayout f7275b;

    /* renamed from: c */
    private LinearLayout f7276c;

    /* renamed from: d */
    private int f7277d;

    /* renamed from: e */
    private FrameLayout f7278e;

    /* renamed from: f */
    private int f7279f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Animator f7280g;

    /* renamed from: h */
    private final float f7281h = ((float) this.f7274a.getResources().getDimensionPixelSize(C1171d.design_textinput_caption_translate_y));
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f7282i;

    /* renamed from: j */
    private int f7283j;

    /* renamed from: k */
    private CharSequence f7284k;

    /* renamed from: l */
    private boolean f7285l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public TextView f7286m;

    /* renamed from: n */
    private int f7287n;

    /* renamed from: o */
    private ColorStateList f7288o;

    /* renamed from: p */
    private CharSequence f7289p;

    /* renamed from: q */
    private boolean f7290q;

    /* renamed from: r */
    private TextView f7291r;

    /* renamed from: s */
    private int f7292s;

    /* renamed from: t */
    private ColorStateList f7293t;

    /* renamed from: u */
    private Typeface f7294u;

    /* renamed from: com.google.android.material.textfield.f$a */
    class C2740a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f7295a;

        /* renamed from: b */
        final /* synthetic */ TextView f7296b;

        /* renamed from: c */
        final /* synthetic */ int f7297c;

        /* renamed from: d */
        final /* synthetic */ TextView f7298d;

        C2740a(int i, TextView textView, int i2, TextView textView2) {
            this.f7295a = i;
            this.f7296b = textView;
            this.f7297c = i2;
            this.f7298d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C2739f.this.f7282i = this.f7295a;
            Animator unused2 = C2739f.this.f7280g = null;
            TextView textView = this.f7296b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f7297c == 1 && C2739f.this.f7286m != null) {
                    C2739f.this.f7286m.setText((CharSequence) null);
                }
                TextView textView2 = this.f7298d;
                if (textView2 != null) {
                    textView2.setTranslationY(0.0f);
                    this.f7298d.setAlpha(1.0f);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f7298d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C2739f(TextInputLayout textInputLayout) {
        this.f7274a = textInputLayout.getContext();
        this.f7275b = textInputLayout;
    }

    /* renamed from: a */
    private ObjectAnimator m10811a(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f7281h, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C1179a.f3917d);
        return ofFloat;
    }

    /* renamed from: a */
    private ObjectAnimator m10812a(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C1179a.f3914a);
        return ofFloat;
    }

    /* renamed from: a */
    private void m10814a(int i, int i2) {
        TextView d;
        TextView d2;
        if (i != i2) {
            if (!(i2 == 0 || (d2 = m10820d(i2)) == null)) {
                d2.setVisibility(0);
                d2.setAlpha(1.0f);
            }
            if (!(i == 0 || (d = m10820d(i)) == null)) {
                d.setVisibility(4);
                if (i == 1) {
                    d.setText((CharSequence) null);
                }
            }
            this.f7282i = i2;
        }
    }

    /* renamed from: a */
    private void m10815a(int i, int i2, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f7280g = animatorSet;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            int i3 = i;
            int i4 = i2;
            m10818a(arrayList2, this.f7290q, this.f7291r, 2, i3, i4);
            m10818a(arrayList2, this.f7285l, this.f7286m, 1, i3, i4);
            C1180b.m5736a(animatorSet, arrayList);
            animatorSet.addListener(new C2740a(i2, m10820d(i), i, m10820d(i2)));
            animatorSet.start();
        } else {
            m10814a(i, i2);
        }
        this.f7275b.mo8651e();
        this.f7275b.mo8641a(z);
        this.f7275b.mo8652f();
    }

    /* renamed from: a */
    private void m10816a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m10817a(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: a */
    private void m10818a(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(m10812a(textView, i3 == i));
                if (i3 == i) {
                    list.add(m10811a(textView));
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m10819a(TextView textView, CharSequence charSequence) {
        return C0890v.m4732C(this.f7275b) && this.f7275b.isEnabled() && (this.f7283j != this.f7282i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: d */
    private TextView m10820d(int i) {
        if (i == 1) {
            return this.f7286m;
        }
        if (i != 2) {
            return null;
        }
        return this.f7291r;
    }

    /* renamed from: e */
    private boolean m10821e(int i) {
        return i == 1 && this.f7286m != null && !TextUtils.isEmpty(this.f7284k);
    }

    /* renamed from: m */
    private boolean m10822m() {
        return (this.f7276c == null || this.f7275b.getEditText() == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8785a() {
        if (m10822m()) {
            C0890v.m4747a(this.f7276c, C0890v.m4796t(this.f7275b.getEditText()), 0, C0890v.m4795s(this.f7275b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8786a(ColorStateList colorStateList) {
        this.f7288o = colorStateList;
        TextView textView = this.f7286m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8787a(Typeface typeface) {
        if (typeface != this.f7294u) {
            this.f7294u = typeface;
            m10817a(this.f7286m, typeface);
            m10817a(this.f7291r, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8788a(TextView textView, int i) {
        if (this.f7276c == null && this.f7278e == null) {
            this.f7276c = new LinearLayout(this.f7274a);
            this.f7276c.setOrientation(0);
            this.f7275b.addView(this.f7276c, -1, -2);
            this.f7278e = new FrameLayout(this.f7274a);
            this.f7276c.addView(this.f7278e, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f7276c.addView(new Space(this.f7274a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f7275b.getEditText() != null) {
                mo8785a();
            }
        }
        if (mo8791a(i)) {
            this.f7278e.setVisibility(0);
            this.f7278e.addView(textView);
            this.f7279f++;
        } else {
            this.f7276c.addView(textView, i);
        }
        this.f7276c.setVisibility(0);
        this.f7277d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8789a(CharSequence charSequence) {
        mo8792b();
        this.f7284k = charSequence;
        this.f7286m.setText(charSequence);
        if (this.f7282i != 1) {
            this.f7283j = 1;
        }
        m10815a(this.f7282i, this.f7283j, m10819a(this.f7286m, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8790a(boolean z) {
        if (this.f7285l != z) {
            mo8792b();
            if (z) {
                this.f7286m = new AppCompatTextView(this.f7274a);
                this.f7286m.setId(C1173f.textinput_error);
                Typeface typeface = this.f7294u;
                if (typeface != null) {
                    this.f7286m.setTypeface(typeface);
                }
                mo8793b(this.f7287n);
                mo8786a(this.f7288o);
                this.f7286m.setVisibility(4);
                C0890v.m4781g(this.f7286m, 1);
                mo8788a(this.f7286m, 0);
            } else {
                mo8805i();
                mo8795b(this.f7286m, 0);
                this.f7286m = null;
                this.f7275b.mo8651e();
                this.f7275b.mo8652f();
            }
            this.f7285l = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo8791a(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8792b() {
        Animator animator = this.f7280g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8793b(int i) {
        this.f7287n = i;
        TextView textView = this.f7286m;
        if (textView != null) {
            this.f7275b.mo8638a(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8794b(ColorStateList colorStateList) {
        this.f7293t = colorStateList;
        TextView textView = this.f7291r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8795b(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f7276c != null) {
            if (!mo8791a(i) || (frameLayout = this.f7278e) == null) {
                this.f7276c.removeView(textView);
            } else {
                this.f7279f--;
                m10816a((ViewGroup) frameLayout, this.f7279f);
                this.f7278e.removeView(textView);
            }
            this.f7277d--;
            m10816a((ViewGroup) this.f7276c, this.f7277d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8796b(CharSequence charSequence) {
        mo8792b();
        this.f7289p = charSequence;
        this.f7291r.setText(charSequence);
        if (this.f7282i != 2) {
            this.f7283j = 2;
        }
        m10815a(this.f7282i, this.f7283j, m10819a(this.f7291r, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8797b(boolean z) {
        if (this.f7290q != z) {
            mo8792b();
            if (z) {
                this.f7291r = new AppCompatTextView(this.f7274a);
                this.f7291r.setId(C1173f.textinput_helper_text);
                Typeface typeface = this.f7294u;
                if (typeface != null) {
                    this.f7291r.setTypeface(typeface);
                }
                this.f7291r.setVisibility(4);
                C0890v.m4781g(this.f7291r, 1);
                mo8798c(this.f7292s);
                mo8794b(this.f7293t);
                mo8788a(this.f7291r, 1);
            } else {
                mo8806j();
                mo8795b(this.f7291r, 1);
                this.f7291r = null;
                this.f7275b.mo8651e();
                this.f7275b.mo8652f();
            }
            this.f7290q = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8798c(int i) {
        this.f7292s = i;
        TextView textView = this.f7291r;
        if (textView != null) {
            C0348i.m1748d(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo8799c() {
        return m10821e(this.f7283j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public CharSequence mo8800d() {
        return this.f7284k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo8801e() {
        TextView textView = this.f7286m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo8802f() {
        TextView textView = this.f7286m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public CharSequence mo8803g() {
        return this.f7289p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo8804h() {
        TextView textView = this.f7291r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo8805i() {
        this.f7284k = null;
        mo8792b();
        if (this.f7282i == 1) {
            this.f7283j = (!this.f7290q || TextUtils.isEmpty(this.f7289p)) ? 0 : 2;
        }
        m10815a(this.f7282i, this.f7283j, m10819a(this.f7286m, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo8806j() {
        mo8792b();
        if (this.f7282i == 2) {
            this.f7283j = 0;
        }
        m10815a(this.f7282i, this.f7283j, m10819a(this.f7291r, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo8807k() {
        return this.f7285l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo8808l() {
        return this.f7290q;
    }
}
