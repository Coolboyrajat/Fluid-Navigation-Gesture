package p054c.p055a.p056a.p060q;

import android.graphics.PorterDuff;
import android.view.View;
import android.widget.SeekBar;
import p054c.p055a.p056a.C1041c;

/* renamed from: c.a.a.q.f */
public final class C1067f {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final View m5425b(C1041c cVar) {
        return cVar.findViewById(C1078j.colorArgbPage);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m5426b(SeekBar seekBar, int i) {
        seekBar.getProgressDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
        seekBar.getThumb().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}
