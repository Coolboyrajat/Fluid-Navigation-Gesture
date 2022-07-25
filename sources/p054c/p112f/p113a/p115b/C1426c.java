package p054c.p112f.p113a.p115b;

import android.view.View;
import kotlin.Unit;
import kotlin.p205x.p207d.C3370k;
import p054c.p112f.p113a.p114a.C1423a;
import p155d.p156a.C2790h;
import p155d.p156a.C2793k;
import p155d.p156a.p157n.C2800a;
import p155d.p156a.p160o.C2810b;

/* renamed from: c.f.a.b.c */
final class C1426c extends C2790h<Unit> {

    /* renamed from: f */
    private final View f4392f;

    /* renamed from: c.f.a.b.c$a */
    private static final class C1427a extends C2800a implements View.OnClickListener {

        /* renamed from: g */
        private final View f4393g;

        /* renamed from: h */
        private final C2793k<? super Unit> f4394h;

        public C1427a(View view, C2793k<? super Unit> kVar) {
            C3370k.m12227b(view, "view");
            C3370k.m12227b(kVar, "observer");
            this.f4393g = view;
            this.f4394h = kVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo5872c() {
            this.f4393g.setOnClickListener((View.OnClickListener) null);
        }

        public void onClick(View view) {
            C3370k.m12227b(view, "v");
            if (!mo6028b()) {
                this.f4394h.mo6032a(Unit.INSTANCE);
            }
        }
    }

    public C1426c(View view) {
        C3370k.m12227b(view, "view");
        this.f4392f = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo5871b(C2793k<? super Unit> kVar) {
        C3370k.m12227b(kVar, "observer");
        if (C1423a.m6598a(kVar)) {
            C1427a aVar = new C1427a(this.f4392f, kVar);
            kVar.mo6031a((C2810b) aVar);
            this.f4392f.setOnClickListener(aVar);
        }
    }
}
