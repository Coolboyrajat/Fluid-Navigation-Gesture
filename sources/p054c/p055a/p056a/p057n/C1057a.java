package p054c.p055a.p056a.p057n;

import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.C1055m;
import p054c.p055a.p056a.p066v.C1107f;

/* renamed from: c.a.a.n.a */
public final class C1057a {
    /* renamed from: a */
    public static final DialogActionButton m5382a(C1041c cVar, C1055m mVar) {
        DialogActionButton[] actionButtons;
        DialogActionButton dialogActionButton;
        C3370k.m12227b(cVar, "$this$getActionButton");
        C3370k.m12227b(mVar, "which");
        DialogActionButtonLayout buttonsLayout = cVar.mo5116h().getButtonsLayout();
        if (buttonsLayout != null && (actionButtons = buttonsLayout.getActionButtons()) != null && (dialogActionButton = actionButtons[mVar.mo5123a()]) != null) {
            return dialogActionButton;
        }
        throw new IllegalStateException("The dialog does not have an attached buttons layout.");
    }

    /* renamed from: a */
    public static final void m5383a(C1041c cVar, C1055m mVar, boolean z) {
        C3370k.m12227b(cVar, "$this$setActionButtonEnabled");
        C3370k.m12227b(mVar, "which");
        m5382a(cVar, mVar).setEnabled(z);
    }

    /* renamed from: a */
    public static final boolean m5384a(C1041c cVar) {
        DialogActionButton[] visibleButtons;
        C3370k.m12227b(cVar, "$this$hasActionButtons");
        DialogActionButtonLayout buttonsLayout = cVar.mo5116h().getButtonsLayout();
        boolean z = false;
        if (buttonsLayout == null || (visibleButtons = buttonsLayout.getVisibleButtons()) == null) {
            return false;
        }
        if (visibleButtons.length == 0) {
            z = true;
        }
        return !z;
    }

    /* renamed from: b */
    public static final boolean m5385b(C1041c cVar, C1055m mVar) {
        C3370k.m12227b(cVar, "$this$hasActionButton");
        C3370k.m12227b(mVar, "which");
        return C1107f.m5547c(m5382a(cVar, mVar));
    }
}
