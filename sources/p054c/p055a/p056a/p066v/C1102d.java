package p054c.p055a.p056a.p066v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.core.content.p002c.C0323f;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1041c;

/* renamed from: c.a.a.v.d */
public final class C1102d {
    /* renamed from: a */
    private static final Typeface m5511a(Context context, int i) {
        try {
            return C0323f.m1580a(context, i);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static final Typeface m5512a(C1041c cVar, Integer num, Integer num2) {
        C3370k.m12227b(cVar, "$this$font");
        C1103e.f3789a.mo5174a("font", (Object) num2, num);
        if (num != null) {
            return m5511a(cVar.mo5117i(), num.intValue());
        }
        if (num2 != null) {
            TypedArray obtainStyledAttributes = cVar.mo5117i().getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
            try {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId == 0) {
                    return null;
                }
                Typeface a = m5511a(cVar.mo5117i(), resourceId);
                obtainStyledAttributes.recycle();
                return a;
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Typeface m5513a(C1041c cVar, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        return m5512a(cVar, num, num2);
    }
}
