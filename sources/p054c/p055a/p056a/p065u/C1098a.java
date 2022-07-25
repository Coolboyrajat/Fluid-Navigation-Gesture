package p054c.p055a.p056a.p065u;

import android.widget.TextView;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.p066v.C1103e;

/* renamed from: c.a.a.u.a */
public final class C1098a {

    /* renamed from: a */
    private boolean f3786a;

    /* renamed from: b */
    private final C1041c f3787b;

    /* renamed from: c */
    private final TextView f3788c;

    public C1098a(C1041c cVar, TextView textView) {
        C3370k.m12227b(cVar, "dialog");
        C3370k.m12227b(textView, "messageTextView");
        this.f3787b = cVar;
        this.f3788c = textView;
    }

    /* renamed from: a */
    public final void mo5160a(Integer num, CharSequence charSequence) {
        TextView textView = this.f3788c;
        if (charSequence == null) {
            charSequence = C1103e.m5517a(C1103e.f3789a, this.f3787b, num, (Integer) null, this.f3786a, 4, (Object) null);
        }
        textView.setText(charSequence);
    }
}
