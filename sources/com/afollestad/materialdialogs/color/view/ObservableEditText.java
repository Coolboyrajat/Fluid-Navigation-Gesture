package com.afollestad.materialdialogs.color.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0195j;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.BuildConfig;

public final class ObservableEditText extends C0195j {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C3350b<? super String, Unit> f4630i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f4631j;

    /* renamed from: k */
    private final C1582a f4632k;

    /* renamed from: com.afollestad.materialdialogs.color.view.ObservableEditText$a */
    public static final class C1582a implements TextWatcher {

        /* renamed from: f */
        final /* synthetic */ ObservableEditText f4633f;

        C1582a(ObservableEditText observableEditText) {
            this.f4633f = observableEditText;
        }

        public void afterTextChanged(Editable editable) {
            this.f4633f.f4631j = false;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C3350b a;
            C3370k.m12227b(charSequence, "s");
            if (!this.f4633f.f4631j && (a = this.f4633f.f4630i) != null) {
                Unit unit = (Unit) a.mo5146a(charSequence.toString());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ObservableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3370k.m12227b(context, "context");
        this.f4632k = new C1582a(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ObservableEditText(Context context, AttributeSet attributeSet, int i, C3366g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: a */
    public final void mo6078a(CharSequence charSequence) {
        C3370k.m12227b(charSequence, "text");
        this.f4631j = true;
        setText(charSequence);
    }

    /* renamed from: a */
    public final void mo6079a(C3350b<? super String, Unit> bVar) {
        this.f4630i = bVar;
    }

    public final int getTextLength() {
        return getTextOrEmpty().length();
    }

    public final String getTextOrEmpty() {
        String obj;
        Editable text = getText();
        if (!(text == null || (obj = text.toString()) == null)) {
            if (obj != null) {
                String obj2 = C3251o.m11963d(obj).toString();
                if (obj2 != null) {
                    return obj2;
                }
            } else {
                throw new C3269p("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        return BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addTextChangedListener(this.f4632k);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeTextChangedListener(this.f4632k);
    }
}
