package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import p006b.p007a.p008k.p009a.C0664a;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.p036e0.C0857c;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1171d;
import p054c.p083e.p084a.p085a.C1172e;
import p054c.p083e.p084a.p085a.C1176i;
import p054c.p083e.p084a.p085a.p087l.C1179a;
import p054c.p083e.p084a.p085a.p093q.C1207a;
import p054c.p083e.p084a.p085a.p102z.C1233d;
import p054c.p083e.p084a.p085a.p102z.C1238g;

/* renamed from: com.google.android.material.textfield.d */
class C2727d extends C2738e {

    /* renamed from: o */
    private static final boolean f7247o = (Build.VERSION.SDK_INT >= 21);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f7248d = new C2728a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final TextInputLayout.C2712d f7249e = new C2730b(this.f7271a);

    /* renamed from: f */
    private final TextInputLayout.C2713e f7250f = new C2731c();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f7251g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f7252h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f7253i = Long.MAX_VALUE;

    /* renamed from: j */
    private StateListDrawable f7254j;

    /* renamed from: k */
    private C1233d f7255k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public AccessibilityManager f7256l;

    /* renamed from: m */
    private ValueAnimator f7257m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ValueAnimator f7258n;

    /* renamed from: com.google.android.material.textfield.d$a */
    class C2728a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a */
        class C2729a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ AutoCompleteTextView f7260f;

            C2729a(AutoCompleteTextView autoCompleteTextView) {
                this.f7260f = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f7260f.isPopupShowing();
                C2727d.this.m10783a(isPopupShowing);
                boolean unused = C2727d.this.f7251g = isPopupShowing;
            }
        }

        C2728a() {
        }

        public void afterTextChanged(Editable editable) {
            C2727d dVar = C2727d.this;
            AutoCompleteTextView a = dVar.m10776a(dVar.f7271a.getEditText());
            a.post(new C2729a(a));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.d$b */
    class C2730b extends TextInputLayout.C2712d {
        C2730b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        /* renamed from: a */
        public void mo2093a(View view, C0857c cVar) {
            super.mo2093a(view, cVar);
            cVar.mo4585a((CharSequence) Spinner.class.getName());
            if (cVar.mo4634s()) {
                cVar.mo4603d((CharSequence) null);
            }
        }

        /* renamed from: c */
        public void mo4550c(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4550c(view, accessibilityEvent);
            C2727d dVar = C2727d.this;
            AutoCompleteTextView a = dVar.m10776a(dVar.f7271a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C2727d.this.f7256l.isTouchExplorationEnabled()) {
                C2727d.this.m10795d(a);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$c */
    class C2731c implements TextInputLayout.C2713e {
        C2731c() {
        }

        /* renamed from: a */
        public void mo8756a(TextInputLayout textInputLayout) {
            AutoCompleteTextView a = C2727d.this.m10776a(textInputLayout.getEditText());
            C2727d.this.m10785b(a);
            C2727d.this.m10779a(a);
            C2727d.this.m10792c(a);
            a.setThreshold(0);
            a.removeTextChangedListener(C2727d.this.f7248d);
            a.addTextChangedListener(C2727d.this.f7248d);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(C2727d.this.f7249e);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d */
    class C2732d implements View.OnClickListener {
        C2732d() {
        }

        public void onClick(View view) {
            C2727d.this.m10795d((AutoCompleteTextView) C2727d.this.f7271a.getEditText());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$e */
    class C2733e implements View.OnTouchListener {

        /* renamed from: f */
        final /* synthetic */ AutoCompleteTextView f7265f;

        C2733e(AutoCompleteTextView autoCompleteTextView) {
            this.f7265f = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C2727d.this.m10797d()) {
                    boolean unused = C2727d.this.f7251g = false;
                }
                C2727d.this.m10795d(this.f7265f);
                view.performClick();
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.textfield.d$f */
    class C2734f implements View.OnFocusChangeListener {
        C2734f() {
        }

        public void onFocusChange(View view, boolean z) {
            C2727d.this.f7271a.setEndIconActivated(z);
            if (!z) {
                C2727d.this.m10783a(false);
                boolean unused = C2727d.this.f7251g = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$g */
    class C2735g implements AutoCompleteTextView.OnDismissListener {
        C2735g() {
        }

        public void onDismiss() {
            boolean unused = C2727d.this.f7251g = true;
            long unused2 = C2727d.this.f7253i = System.currentTimeMillis();
            C2727d.this.m10783a(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$h */
    class C2736h extends AnimatorListenerAdapter {
        C2736h() {
        }

        public void onAnimationEnd(Animator animator) {
            C2727d dVar = C2727d.this;
            dVar.f7273c.setChecked(dVar.f7252h);
            C2727d.this.f7258n.start();
        }
    }

    /* renamed from: com.google.android.material.textfield.d$i */
    class C2737i implements ValueAnimator.AnimatorUpdateListener {
        C2737i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2727d.this.f7273c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    C2727d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: a */
    private ValueAnimator m10775a(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1179a.f3914a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new C2737i());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public AutoCompleteTextView m10776a(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: a */
    private C1233d m10778a(float f, float f2, float f3, int i) {
        C1238g.C1240b l = C1238g.m5969l();
        l.mo5557e(f);
        l.mo5558f(f);
        l.mo5548b(f2);
        l.mo5551c(f2);
        C1238g a = l.mo5547a();
        C1233d a2 = C1233d.m5904a(this.f7272b, f3);
        a2.setShapeAppearanceModel(a);
        a2.mo5490a(0, i, 0, i);
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10779a(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() == null) {
            int boxBackgroundMode = this.f7271a.getBoxBackgroundMode();
            C1233d boxBackground = this.f7271a.getBoxBackground();
            int a = C1207a.m5828a((View) autoCompleteTextView, C1169b.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                m10786b(autoCompleteTextView, a, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                m10780a(autoCompleteTextView, a, iArr, boxBackground);
            }
        }
    }

    /* renamed from: a */
    private void m10780a(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C1233d dVar) {
        int boxBackgroundColor = this.f7271a.getBoxBackgroundColor();
        int[] iArr2 = {C1207a.m5825a(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f7247o) {
            C0890v.m4751a((View) autoCompleteTextView, (Drawable) new RippleDrawable(new ColorStateList(iArr, iArr2), dVar, dVar));
            return;
        }
        C1233d dVar2 = new C1233d(dVar.mo5514i());
        dVar2.mo5492a(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{dVar, dVar2});
        int t = C0890v.m4796t(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int s = C0890v.m4795s(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C0890v.m4751a((View) autoCompleteTextView, (Drawable) layerDrawable);
        C0890v.m4747a(autoCompleteTextView, t, paddingTop, s, paddingBottom);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10783a(boolean z) {
        if (this.f7252h != z) {
            this.f7252h = z;
            this.f7258n.cancel();
            this.f7257m.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10785b(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (f7247o) {
            int boxBackgroundMode = this.f7271a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.f7255k;
            } else if (boxBackgroundMode == 1) {
                drawable = this.f7254j;
            } else {
                return;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    /* renamed from: b */
    private void m10786b(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C1233d dVar) {
        LayerDrawable layerDrawable;
        int a = C1207a.m5828a((View) autoCompleteTextView, C1169b.colorSurface);
        C1233d dVar2 = new C1233d(dVar.mo5514i());
        int a2 = C1207a.m5825a(i, a, 0.1f);
        dVar2.mo5492a(new ColorStateList(iArr, new int[]{a2, 0}));
        if (f7247o) {
            dVar2.setTint(a);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{a2, a});
            C1233d dVar3 = new C1233d(dVar.mo5514i());
            dVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, dVar2, dVar3), dVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{dVar2, dVar});
        }
        C0890v.m4751a((View) autoCompleteTextView, (Drawable) layerDrawable);
    }

    /* renamed from: c */
    private void m10791c() {
        this.f7258n = m10775a(67, 0.0f, 1.0f);
        this.f7257m = m10775a(50, 1.0f, 0.0f);
        this.f7257m.addListener(new C2736h());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m10792c(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new C2733e(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(new C2734f());
        if (f7247o) {
            autoCompleteTextView.setOnDismissListener(new C2735g());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m10795d(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (m10797d()) {
                this.f7251g = false;
            }
            if (!this.f7251g) {
                if (f7247o) {
                    m10783a(!this.f7252h);
                } else {
                    this.f7252h = !this.f7252h;
                    this.f7273c.toggle();
                }
                if (this.f7252h) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f7251g = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m10797d() {
        long currentTimeMillis = System.currentTimeMillis() - this.f7253i;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8762a() {
        float dimensionPixelOffset = (float) this.f7272b.getResources().getDimensionPixelOffset(C1171d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f7272b.getResources().getDimensionPixelOffset(C1171d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f7272b.getResources().getDimensionPixelOffset(C1171d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C1233d a = m10778a(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C1233d a2 = m10778a(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f7255k = a;
        this.f7254j = new StateListDrawable();
        this.f7254j.addState(new int[]{16842922}, a);
        this.f7254j.addState(new int[0], a2);
        this.f7271a.setEndIconDrawable(C0664a.m3682c(this.f7272b, f7247o ? C1172e.mtrl_dropdown_arrow : C1172e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f7271a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C1176i.exposed_dropdown_menu_content_description));
        this.f7271a.setEndIconOnClickListener(new C2732d());
        this.f7271a.mo8639a(this.f7250f);
        m10791c();
        C0890v.m4783h(this.f7273c, 2);
        this.f7256l = (AccessibilityManager) this.f7272b.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo8773a(int i) {
        return i != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo8774b() {
        return true;
    }
}
