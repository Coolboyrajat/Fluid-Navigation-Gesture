package p054c.p055a.p056a.p066v;

import android.graphics.Color;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1041c;

/* renamed from: c.a.a.v.a */
public final class C1099a {
    /* renamed from: a */
    public static final int m5500a(int i, float f) {
        return Color.argb((int) (((float) 255) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: a */
    public static final int m5501a(C1041c cVar, Integer num, Integer num2, C3349a<Integer> aVar) {
        C3370k.m12227b(cVar, "$this$resolveColor");
        return C1103e.f3789a.mo5162a(cVar.mo5117i(), num, num2, aVar);
    }

    /* renamed from: a */
    public static /* synthetic */ int m5502a(C1041c cVar, Integer num, Integer num2, C3349a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            aVar = null;
        }
        return m5501a(cVar, num, num2, aVar);
    }

    /* renamed from: a */
    public static final int[] m5503a(C1041c cVar, int[] iArr, C3350b<? super Integer, Integer> bVar) {
        C3370k.m12227b(cVar, "$this$resolveColors");
        C3370k.m12227b(iArr, "attrs");
        return C1103e.f3789a.mo5177a(cVar.mo5117i(), iArr, bVar);
    }

    /* renamed from: a */
    public static /* synthetic */ int[] m5504a(C1041c cVar, int[] iArr, C3350b bVar, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        return m5503a(cVar, iArr, bVar);
    }
}
