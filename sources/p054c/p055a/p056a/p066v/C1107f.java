package p054c.p055a.p056a.p066v;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.p205x.p207d.C3370k;

/* renamed from: c.a.a.v.f */
public final class C1107f {
    /* renamed from: a */
    public static final <T> T m5541a(ViewGroup viewGroup, int i, ViewGroup viewGroup2) {
        C3370k.m12227b(viewGroup, "$this$inflate");
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, false);
    }

    /* renamed from: a */
    public static /* synthetic */ Object m5542a(ViewGroup viewGroup, int i, ViewGroup viewGroup2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            viewGroup2 = viewGroup;
        }
        return m5541a(viewGroup, i, viewGroup2);
    }

    /* renamed from: a */
    public static final void m5543a(TextView textView) {
        C3370k.m12227b(textView, "$this$setGravityEndCompat");
        if (Build.VERSION.SDK_INT >= 17) {
            textView.setTextAlignment(6);
        }
        textView.setGravity(8388629);
    }

    /* renamed from: a */
    public static final <T extends View> boolean m5544a(T t) {
        C3370k.m12227b(t, "$this$isNotVisible");
        return !m5547c(t);
    }

    /* renamed from: b */
    public static final void m5545b(TextView textView) {
        C3370k.m12227b(textView, "$this$setGravityStartCompat");
        if (Build.VERSION.SDK_INT >= 17) {
            textView.setTextAlignment(5);
        }
        textView.setGravity(8388627);
    }

    /* renamed from: b */
    public static final <T extends View> boolean m5546b(T t) {
        C3370k.m12227b(t, "$this$isRtl");
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        Resources resources = t.getResources();
        C3370k.m12223a((Object) resources, "resources");
        Configuration configuration = resources.getConfiguration();
        C3370k.m12223a((Object) configuration, "resources.configuration");
        return configuration.getLayoutDirection() == 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends android.view.View> boolean m5547c(T r3) {
        /*
            java.lang.String r0 = "$this$isVisible"
            kotlin.p205x.p207d.C3370k.m12227b(r3, r0)
            boolean r0 = r3 instanceof android.widget.Button
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0028
            android.widget.Button r3 = (android.widget.Button) r3
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x002f
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r0 = "this.text"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r3, (java.lang.String) r0)
            java.lang.CharSequence r3 = kotlin.p194d0.C3242f.m11920d(r3)
            boolean r3 = kotlin.p194d0.C3242f.m11914a((java.lang.CharSequence) r3)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x002f
            goto L_0x002e
        L_0x0028:
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x002f
        L_0x002e:
            r1 = 1
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p054c.p055a.p056a.p066v.C1107f.m5547c(android.view.View):boolean");
    }
}
