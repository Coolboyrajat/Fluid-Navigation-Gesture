package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.t0 */
public class C0234t0 {
    /* renamed from: a */
    public static void m1151a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C0238u0.m1183a(view, charSequence);
        }
    }
}
