package p054c.p055a.p056a.p066v;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import kotlin.p205x.p207d.C3370k;

/* renamed from: c.a.a.v.c */
public final class C1101c {
    /* renamed from: a */
    public static final float m5510a(View view, int i) {
        C3370k.m12227b(view, "$this$dp");
        Resources resources = view.getResources();
        C3370k.m12223a((Object) resources, "resources");
        return TypedValue.applyDimension(1, (float) i, resources.getDisplayMetrics());
    }
}
