package androidx.databinding.p003m;

import android.text.Spanned;
import android.widget.TextView;

/* renamed from: androidx.databinding.m.a */
public class C0386a {
    /* renamed from: a */
    public static void m1867a(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence == text) {
            return;
        }
        if (charSequence != null || text.length() != 0) {
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else if (!m1868a(charSequence, text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    private static boolean m1868a(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null) != (charSequence2 == null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
