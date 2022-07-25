package p054c.p055a.p056a.p064t;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.list.C1600c;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.C1048f;
import p054c.p055a.p056a.p066v.C1099a;
import p054c.p055a.p056a.p066v.C1103e;

/* renamed from: c.a.a.t.a */
public final class C1096a {
    /* renamed from: a */
    public static final Drawable m5489a(C1041c cVar) {
        C3370k.m12227b(cVar, "$this$getItemSelector");
        C1103e eVar = C1103e.f3789a;
        Context context = cVar.getContext();
        C3370k.m12223a((Object) context, "context");
        Drawable a = C1103e.m5516a(eVar, context, (Integer) null, Integer.valueOf(C1048f.md_item_selector), (Drawable) null, 10, (Object) null);
        if (Build.VERSION.SDK_INT >= 21 && (a instanceof RippleDrawable)) {
            C1103e eVar2 = C1103e.f3789a;
            int a2 = C1099a.m5502a(cVar, (Integer) null, Integer.valueOf(C1048f.md_ripple_color), (C3349a) null, 5, (Object) null);
            if (a2 != 0) {
                ((RippleDrawable) a).setColor(ColorStateList.valueOf(a2));
            }
        }
        return a;
    }

    /* renamed from: a */
    public static final C1041c m5490a(C1041c cVar, RecyclerView.C0527g<?> gVar, RecyclerView.C0538o oVar) {
        C3370k.m12227b(cVar, "$this$customListAdapter");
        C3370k.m12227b(gVar, "adapter");
        cVar.mo5116h().getContentLayout().mo6189a(cVar, gVar, oVar);
        return cVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C1041c m5491a(C1041c cVar, RecyclerView.C0527g gVar, RecyclerView.C0538o oVar, int i, Object obj) {
        if ((i & 2) != 0) {
            oVar = null;
        }
        m5490a(cVar, gVar, oVar);
        return cVar;
    }

    /* renamed from: a */
    public static final C1041c m5492a(C1041c cVar, Integer num, List<String> list, int[] iArr, C3352d<? super C1041c, ? super Integer, ? super String, Unit> dVar) {
        C3370k.m12227b(cVar, "$this$updateListItems");
        C1103e.f3789a.mo5174a("updateListItems", (Object) list, num);
        if (list == null) {
            list = C3280f.m12032h(C1103e.f3789a.mo5178a(cVar.mo5117i(), num));
        }
        RecyclerView.C0527g<?> b = m5495b(cVar);
        if (b instanceof C1600c) {
            C1600c cVar2 = (C1600c) b;
            cVar2.mo6130a(list, dVar);
            if (iArr != null) {
                cVar2.mo6131a(iArr);
            }
            return cVar;
        }
        throw new IllegalStateException("updateListItems(...) can't be used before you've created a plain list dialog.".toString());
    }

    /* renamed from: a */
    public static final C1041c m5493a(C1041c cVar, Integer num, List<String> list, int[] iArr, boolean z, C3352d<? super C1041c, ? super Integer, ? super String, Unit> dVar) {
        C3370k.m12227b(cVar, "$this$listItems");
        C1103e.f3789a.mo5174a("listItems", (Object) list, num);
        List<String> h = list != null ? list : C3280f.m12032h(C1103e.f3789a.mo5178a(cVar.mo5117i(), num));
        if (m5495b(cVar) != null) {
            Log.w("MaterialDialogs", "Prefer calling updateListItems(...) over listItems(...) again.");
            m5492a(cVar, num, list, iArr, dVar);
            return cVar;
        }
        m5491a(cVar, (RecyclerView.C0527g) new C1600c(cVar, h, iArr, z, dVar), (RecyclerView.C0538o) null, 2, (Object) null);
        return cVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C1041c m5494a(C1041c cVar, Integer num, List list, int[] iArr, boolean z, C3352d dVar, int i, Object obj) {
        m5493a(cVar, (i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : iArr, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : dVar);
        return cVar;
    }

    /* renamed from: b */
    public static final RecyclerView.C0527g<?> m5495b(C1041c cVar) {
        C3370k.m12227b(cVar, "$this$getListAdapter");
        DialogRecyclerView recyclerView = cVar.mo5116h().getContentLayout().getRecyclerView();
        if (recyclerView != null) {
            return recyclerView.getAdapter();
        }
        return null;
    }
}
