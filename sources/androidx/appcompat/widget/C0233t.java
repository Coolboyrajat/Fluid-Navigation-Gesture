package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p006b.p026g.p034j.C0837h;

/* renamed from: androidx.appcompat.widget.t */
final class C0233t {

    /* renamed from: a */
    private TextView f1117a;

    /* renamed from: b */
    private TextClassifier f1118b;

    C0233t(TextView textView) {
        C0837h.m4534a(textView);
        this.f1117a = textView;
    }

    /* renamed from: a */
    public TextClassifier mo1646a() {
        TextClassifier textClassifier = this.f1118b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1117a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    /* renamed from: a */
    public void mo1647a(TextClassifier textClassifier) {
        this.f1118b = textClassifier;
    }
}
