package p054c.p055a.p056a.p059p;

import android.widget.CheckBox;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1041c;

/* renamed from: c.a.a.p.a */
public final class C1061a {
    /* renamed from: a */
    public static final CheckBox m5390a(C1041c cVar) {
        AppCompatCheckBox checkBoxPrompt;
        C3370k.m12227b(cVar, "$this$getCheckBoxPrompt");
        DialogActionButtonLayout buttonsLayout = cVar.mo5116h().getButtonsLayout();
        if (buttonsLayout != null && (checkBoxPrompt = buttonsLayout.getCheckBoxPrompt()) != null) {
            return checkBoxPrompt;
        }
        throw new IllegalStateException("The dialog does not have an attached buttons layout.");
    }
}
