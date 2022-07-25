package p054c.p055a.p056a.p062r;

import android.view.View;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.p066v.C1103e;

/* renamed from: c.a.a.r.a */
public final class C1084a {

    /* renamed from: c.a.a.r.a$a */
    static final class C1085a extends C3371l implements C3350b<View, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1041c f3772g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1085a(C1041c cVar, boolean z) {
            super(1);
            this.f3772g = cVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5154a((View) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5154a(View view) {
            C3370k.m12227b(view, "$receiver");
            C1041c.m5350a(this.f3772g, (Integer) null, Integer.valueOf(view.getMeasuredWidth()), 1, (Object) null);
        }
    }

    /* renamed from: a */
    public static final View m5467a(C1041c cVar) {
        C3370k.m12227b(cVar, "$this$getCustomView");
        View customView = cVar.mo5116h().getContentLayout().getCustomView();
        if (customView != null) {
            return customView;
        }
        throw new IllegalStateException("You have not setup this dialog as a customView dialog.");
    }

    /* renamed from: a */
    public static final C1041c m5468a(C1041c cVar, Integer num, View view, boolean z, boolean z2, boolean z3, boolean z4) {
        C3370k.m12227b(cVar, "$this$customView");
        C1103e.f3789a.mo5174a("customView", (Object) view, num);
        cVar.mo5111d().put("md.custom_view_no_vertical_padding", Boolean.valueOf(z2));
        if (z4) {
            C1041c.m5350a(cVar, (Integer) null, (Integer) 0, 1, (Object) null);
        }
        View a = cVar.mo5116h().getContentLayout().mo6187a(num, view, z, z3);
        if (z4) {
            C1103e.f3789a.mo5180b(a, new C1085a(cVar, z4));
        }
        return cVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C1041c m5469a(C1041c cVar, Integer num, View view, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        View view2 = null;
        Integer num2 = (i & 1) != 0 ? null : num;
        if ((i & 2) == 0) {
            view2 = view;
        }
        m5468a(cVar, num2, view2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
        return cVar;
    }
}
