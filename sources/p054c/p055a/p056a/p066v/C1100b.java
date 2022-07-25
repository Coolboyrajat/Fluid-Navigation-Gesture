package p054c.p055a.p056a.p066v;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.p058o.C1058a;
import p054c.p055a.p056a.p059p.C1061a;

/* renamed from: c.a.a.v.b */
public final class C1100b {
    /* renamed from: a */
    public static final void m5505a(C1041c cVar) {
        C3370k.m12227b(cVar, "$this$hideKeyboard");
        Object systemService = cVar.mo5117i().getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            View currentFocus = cVar.getCurrentFocus();
            inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : cVar.mo5116h().getWindowToken(), 0);
            return;
        }
        throw new C3269p("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: a */
    public static final void m5506a(C1041c cVar, TextView textView, Integer num, CharSequence charSequence, int i, Typeface typeface, Integer num2) {
        C3370k.m12227b(cVar, "$this$populateText");
        C3370k.m12227b(textView, "textView");
        if (charSequence == null) {
            charSequence = C1103e.m5517a(C1103e.f3789a, cVar, num, Integer.valueOf(i), false, 8, (Object) null);
        }
        if (charSequence != null) {
            ViewParent parent = textView.getParent();
            if (parent != null) {
                ((View) parent).setVisibility(0);
                textView.setVisibility(0);
                textView.setText(charSequence);
                if (typeface != null) {
                    textView.setTypeface(typeface);
                }
                C1103e.m5519a(C1103e.f3789a, textView, cVar.mo5117i(), num2, (Integer) null, 4, (Object) null);
                return;
            }
            throw new C3269p("null cannot be cast to non-null type android.view.View");
        }
        textView.setVisibility(8);
    }

    /* renamed from: a */
    public static /* synthetic */ void m5507a(C1041c cVar, TextView textView, Integer num, CharSequence charSequence, int i, Typeface typeface, Integer num2, int i2, Object obj) {
        m5506a(cVar, textView, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : charSequence, (i2 & 8) != 0 ? 0 : i, typeface, (i2 & 32) != 0 ? null : num2);
    }

    /* renamed from: a */
    public static final void m5508a(C1041c cVar, boolean z, boolean z2) {
        C3370k.m12227b(cVar, "$this$invalidateDividers");
        cVar.mo5116h().mo6144a(z, z2);
    }

    /* renamed from: b */
    public static final void m5509b(C1041c cVar) {
        C3370k.m12227b(cVar, "$this$preShow");
        Object obj = cVar.mo5111d().get("md.custom_view_no_vertical_padding");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        boolean a = C3370k.m12225a((Object) (Boolean) obj, (Object) true);
        C1058a.m5387a(cVar.mo5114f(), cVar);
        DialogLayout h = cVar.mo5116h();
        if (h.getTitleLayout().mo6172b() && !a) {
            h.getContentLayout().mo6188a(h.getFrameMarginVertical$com_afollestad_material_dialogs_core(), h.getFrameMarginVertical$com_afollestad_material_dialogs_core());
        }
        if (C1107f.m5547c(C1061a.m5390a(cVar))) {
            DialogContentLayout.m7003a(h.getContentLayout(), 0, 0, 1, (Object) null);
        } else if (h.getContentLayout().mo6191a()) {
            DialogContentLayout.m7005b(h.getContentLayout(), 0, h.getFrameMarginVerticalLess$com_afollestad_material_dialogs_core(), 1, (Object) null);
        }
    }
}
