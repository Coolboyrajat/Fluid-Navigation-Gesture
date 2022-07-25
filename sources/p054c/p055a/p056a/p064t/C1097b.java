package p054c.p055a.p056a.p064t;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.list.C1602e;
import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.C1055m;
import p054c.p055a.p056a.p057n.C1057a;
import p054c.p055a.p056a.p066v.C1103e;

/* renamed from: c.a.a.t.b */
public final class C1097b {
    /* renamed from: a */
    public static final C1041c m5496a(C1041c cVar, Integer num, List<String> list, int[] iArr, int i, boolean z, C3352d<? super C1041c, ? super Integer, ? super String, Unit> dVar) {
        C3370k.m12227b(cVar, "$this$listItemsSingleChoice");
        C1103e.f3789a.mo5174a("listItemsSingleChoice", (Object) list, num);
        List<String> h = list != null ? list : C3280f.m12032h(C1103e.f3789a.mo5178a(cVar.mo5117i(), num));
        boolean z2 = false;
        if (!(i >= -1 || i < h.size())) {
            throw new IllegalArgumentException(("Initial selection " + i + " must be between -1 and " + "the size of your items array " + h.size()).toString());
        } else if (C1096a.m5495b(cVar) != null) {
            Log.w("MaterialDialogs", "Prefer calling updateListItemsSingleChoice(...) over listItemsSingleChoice(...) again.");
            m5498a(cVar, num, list, iArr, dVar);
            return cVar;
        } else {
            C1055m mVar = C1055m.POSITIVE;
            if (i > -1) {
                z2 = true;
            }
            C1057a.m5383a(cVar, mVar, z2);
            C1096a.m5491a(cVar, (RecyclerView.C0527g) new C1602e(cVar, h, iArr, i, z, dVar), (RecyclerView.C0538o) null, 2, (Object) null);
            return cVar;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C1041c m5497a(C1041c cVar, Integer num, List list, int[] iArr, int i, boolean z, C3352d dVar, int i2, Object obj) {
        m5496a(cVar, (i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : iArr, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? true : z, (i2 & 32) != 0 ? null : dVar);
        return cVar;
    }

    /* renamed from: a */
    public static final C1041c m5498a(C1041c cVar, Integer num, List<String> list, int[] iArr, C3352d<? super C1041c, ? super Integer, ? super String, Unit> dVar) {
        C3370k.m12227b(cVar, "$this$updateListItemsSingleChoice");
        C1103e.f3789a.mo5174a("updateListItemsSingleChoice", (Object) list, num);
        if (list == null) {
            list = C3280f.m12032h(C1103e.f3789a.mo5178a(cVar.mo5117i(), num));
        }
        RecyclerView.C0527g<?> b = C1096a.m5495b(cVar);
        if (b instanceof C1602e) {
            C1602e eVar = (C1602e) b;
            eVar.mo6136a(list, dVar);
            if (iArr != null) {
                eVar.mo6137a(iArr);
            }
            return cVar;
        }
        throw new IllegalStateException("updateListItemsSingleChoice(...) can't be used before you've created a single choice list dialog.".toString());
    }
}
