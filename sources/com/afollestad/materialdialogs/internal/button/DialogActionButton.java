package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.C0179f;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p056a.C1048f;
import p054c.p055a.p056a.C1049g;
import p054c.p055a.p056a.C1054l;
import p054c.p055a.p056a.p066v.C1099a;
import p054c.p055a.p056a.p066v.C1103e;
import p054c.p055a.p056a.p066v.C1107f;

public final class DialogActionButton extends C0179f {

    /* renamed from: h */
    private int f4653h;

    /* renamed from: i */
    private int f4654i;

    /* renamed from: com.afollestad.materialdialogs.internal.button.DialogActionButton$a */
    public static final class C1589a {
        private C1589a() {
        }

        public /* synthetic */ C1589a(C3366g gVar) {
            this();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.internal.button.DialogActionButton$b */
    static final class C1590b extends C3371l implements C3349a<Integer> {

        /* renamed from: g */
        final /* synthetic */ Context f4655g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1590b(Context context) {
            super(0);
            this.f4655g = context;
        }

        public final int invoke() {
            return C1103e.m5515a(C1103e.f3789a, this.f4655g, (Integer) null, Integer.valueOf(C1048f.colorPrimary), (C3349a) null, 10, (Object) null);
        }
    }

    /* renamed from: com.afollestad.materialdialogs.internal.button.DialogActionButton$c */
    static final class C1591c extends C3371l implements C3349a<Integer> {

        /* renamed from: g */
        final /* synthetic */ Context f4656g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1591c(Context context) {
            super(0);
            this.f4656g = context;
        }

        public final int invoke() {
            return C1099a.m5500a(C1103e.m5515a(C1103e.f3789a, this.f4656g, (Integer) null, Integer.valueOf(C1048f.colorPrimary), (C3349a) null, 10, (Object) null), 0.12f);
        }
    }

    static {
        new C1589a((C3366g) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3370k.m12227b(context, "context");
        setClickable(true);
        setFocusable(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogActionButton(Context context, AttributeSet attributeSet, int i, C3366g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: a */
    public final void mo6107a(int i) {
        this.f4653h = i;
        setEnabled(isEnabled());
    }

    /* renamed from: a */
    public final void mo6108a(Context context, Context context2, boolean z) {
        int a;
        C3370k.m12227b(context, "baseContext");
        C3370k.m12227b(context2, "appContext");
        boolean z2 = true;
        if (C1103e.f3789a.mo5179b(context2, C1048f.md_button_casing, 1) != 1) {
            z2 = false;
        }
        setSupportAllCaps(z2);
        boolean a2 = C1054l.m5379a(context2);
        this.f4653h = C1103e.m5515a(C1103e.f3789a, context2, (Integer) null, Integer.valueOf(C1048f.md_color_button_text), (C3349a) new C1590b(context2), 2, (Object) null);
        this.f4654i = C1103e.m5515a(C1103e.f3789a, context, Integer.valueOf(a2 ? C1049g.md_disabled_text_light_theme : C1049g.md_disabled_text_dark_theme), (Integer) null, (C3349a) null, 12, (Object) null);
        setTextColor(this.f4653h);
        Drawable a3 = C1103e.m5516a(C1103e.f3789a, context, (Integer) null, Integer.valueOf(C1048f.md_button_selector), (Drawable) null, 10, (Object) null);
        if (Build.VERSION.SDK_INT >= 21 && (a3 instanceof RippleDrawable) && (a = C1103e.m5515a(C1103e.f3789a, context, (Integer) null, Integer.valueOf(C1048f.md_ripple_color), (C3349a) new C1591c(context2), 2, (Object) null)) != 0) {
            ((RippleDrawable) a3).setColor(ColorStateList.valueOf(a));
        }
        setBackground(a3);
        if (z) {
            C1107f.m5543a((TextView) this);
        } else {
            setGravity(17);
        }
        setEnabled(isEnabled());
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setTextColor(z ? this.f4653h : this.f4654i);
    }
}
