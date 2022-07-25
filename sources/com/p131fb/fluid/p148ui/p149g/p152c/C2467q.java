package com.p131fb.fluid.p148ui.p149g.p152c;

import android.annotation.SuppressLint;
import android.view.View;
import kotlin.Unit;
import kotlin.p192b0.C3204e;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3368i;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3384y;
import p054c.p055a.p067b.C1108a;
import p054c.p055a.p067b.C1114e;
import p054c.p055a.p067b.p071i.C1139b;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.c.q */
public final class C2467q {

    /* renamed from: com.fb.fluid.ui.g.c.q$a */
    static final /* synthetic */ class C2468a extends C3368i implements C3350b<View, C2470r> {

        /* renamed from: j */
        public static final C2468a f6212j = new C2468a();

        C2468a() {
            super(1);
        }

        /* renamed from: a */
        public final C2470r mo5146a(View view) {
            C3370k.m12227b(view, "p1");
            return new C2470r(view);
        }

        /* renamed from: b */
        public final String mo6062b() {
            return "<init>";
        }

        /* renamed from: h */
        public final C3204e mo6063h() {
            return C3384y.m12254a(C2470r.class);
        }

        /* renamed from: j */
        public final String mo6064j() {
            return "<init>(Landroid/view/View;)V";
        }
    }

    /* renamed from: com.fb.fluid.ui.g.c.q$b */
    static final class C2469b extends C3371l implements C3352d<C2470r, Integer, C2466p, Unit> {

        /* renamed from: g */
        public static final C2469b f6213g = new C2469b();

        C2469b() {
            super(3);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
            mo7314a((C2470r) obj, ((Number) obj2).intValue(), (C2466p) obj3);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7314a(C2470r rVar, int i, C2466p pVar) {
            C3370k.m12227b(rVar, "$receiver");
            C3370k.m12227b(pVar, "item");
            rVar.mo3763B().setImageResource(pVar.mo7309a());
        }
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: a */
    public static final C1108a<C2466p, C2470r> m9215a(C1114e eVar) {
        C3370k.m12227b(eVar, "$this$withImage");
        String name = C2466p.class.getName();
        C3370k.m12223a((Object) name, "ImageItem::class.java.name");
        C1139b bVar = new C1139b(eVar, name);
        bVar.mo5186a(C2468a.f6212j, C2469b.f6213g);
        eVar.mo5192a(bVar.mo5238f(), C3148R.layout.item_image, bVar);
        return bVar;
    }
}
