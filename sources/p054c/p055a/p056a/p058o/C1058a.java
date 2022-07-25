package p054c.p055a.p056a.p058o;

import android.content.DialogInterface;
import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1041c;

/* renamed from: c.a.a.o.a */
public final class C1058a {

    /* renamed from: c.a.a.o.a$a */
    static final class C1059a implements DialogInterface.OnDismissListener {

        /* renamed from: f */
        final /* synthetic */ C1041c f3717f;

        C1059a(C1041c cVar) {
            this.f3717f = cVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C1058a.m5387a(this.f3717f.mo5113e(), this.f3717f);
        }
    }

    /* renamed from: c.a.a.o.a$b */
    static final class C1060b implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C1041c f3718a;

        C1060b(C1041c cVar) {
            this.f3718a = cVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            C1058a.m5387a(this.f3718a.mo5115g(), this.f3718a);
        }
    }

    /* renamed from: a */
    public static final C1041c m5386a(C1041c cVar, C3350b<? super C1041c, Unit> bVar) {
        C3370k.m12227b(cVar, "$this$onDismiss");
        C3370k.m12227b(bVar, "callback");
        cVar.mo5113e().add(bVar);
        cVar.setOnDismissListener(new C1059a(cVar));
        return cVar;
    }

    /* renamed from: a */
    public static final void m5387a(List<C3350b<C1041c, Unit>> list, C1041c cVar) {
        C3370k.m12227b(list, "$this$invokeAll");
        C3370k.m12227b(cVar, "dialog");
        for (C3350b<C1041c, Unit> a : list) {
            a.mo5146a(cVar);
        }
    }

    /* renamed from: b */
    public static final C1041c m5388b(C1041c cVar, C3350b<? super C1041c, Unit> bVar) {
        C3370k.m12227b(cVar, "$this$onPreShow");
        C3370k.m12227b(bVar, "callback");
        cVar.mo5114f().add(bVar);
        return cVar;
    }

    /* renamed from: c */
    public static final C1041c m5389c(C1041c cVar, C3350b<? super C1041c, Unit> bVar) {
        C3370k.m12227b(cVar, "$this$onShow");
        C3370k.m12227b(bVar, "callback");
        cVar.mo5115g().add(bVar);
        if (cVar.isShowing()) {
            m5387a(cVar.mo5115g(), cVar);
        }
        cVar.setOnShowListener(new C1060b(cVar));
        return cVar;
    }
}
