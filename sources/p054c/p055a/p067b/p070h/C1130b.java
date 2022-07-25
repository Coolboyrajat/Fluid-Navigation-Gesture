package p054c.p055a.p067b.p070h;

import android.view.View;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;

/* renamed from: c.a.b.h.b */
public final class C1130b {

    /* renamed from: c.a.b.h.b$a */
    static final class C1131a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C3350b f3828f;

        C1131a(C3350b bVar) {
            this.f3828f = bVar;
        }

        public final void onClick(View view) {
            C1128a aVar = C1128a.f3826c;
            C3370k.m12223a((Object) view, "it");
            if (aVar.mo5223a(view)) {
                this.f3828f.mo5146a(view);
            }
        }
    }

    /* renamed from: a */
    public static final <T extends View> void m5604a(T t, C3350b<? super T, Unit> bVar) {
        C3370k.m12227b(t, "$this$onClickDebounced");
        C3370k.m12227b(bVar, "click");
        t.setOnClickListener(new C1131a(bVar));
    }
}
