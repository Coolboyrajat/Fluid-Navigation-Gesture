package p054c.p055a.p056a.p063s;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.C1055m;
import p054c.p055a.p056a.p057n.C1057a;

/* renamed from: c.a.a.s.b */
public final class C1091b {

    /* renamed from: c.a.a.s.b$a */
    public static final class C1092a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f3783f;

        /* renamed from: g */
        final /* synthetic */ C1041c f3784g;

        public C1092a(View view, C1041c cVar) {
            this.f3783f = view;
            this.f3784g = cVar;
        }

        public final void run() {
            EditText editText = (EditText) this.f3783f;
            editText.requestFocus();
            Object systemService = this.f3784g.mo5117i().getSystemService("input_method");
            if (systemService != null) {
                ((InputMethodManager) systemService).showSoftInput(editText, 1);
                return;
            }
            throw new C3269p("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* renamed from: a */
    public static final void m5487a(C1041c cVar) {
        C3370k.m12227b(cVar, "$this$showKeyboardIfApplicable");
        EditText a = C1086a.m5472a(cVar);
        a.post(new C1092a(a, cVar));
    }

    /* renamed from: a */
    public static final void m5488a(C1041c cVar, boolean z) {
        int counterMaxLength;
        C3370k.m12227b(cVar, "$this$invalidateInputMaxLength");
        Editable text = C1086a.m5472a(cVar).getText();
        boolean z2 = false;
        int length = text != null ? text.length() : 0;
        if ((z || length != 0) && (counterMaxLength = C1086a.m5477b(cVar).getCounterMaxLength()) > 0) {
            C1055m mVar = C1055m.POSITIVE;
            if (length <= counterMaxLength) {
                z2 = true;
            }
            C1057a.m5383a(cVar, mVar, z2);
        }
    }
}
