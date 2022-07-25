package com.p131fb.fluid.p148ui.p149g.p152c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
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

/* renamed from: com.fb.fluid.ui.g.c.l */
public final class C2460l {

    /* renamed from: com.fb.fluid.ui.g.c.l$a */
    static final /* synthetic */ class C2461a extends C3368i implements C3350b<View, C2463m> {

        /* renamed from: j */
        public static final C2461a f6207j = new C2461a();

        C2461a() {
            super(1);
        }

        /* renamed from: a */
        public final C2463m mo5146a(View view) {
            C3370k.m12227b(view, "p1");
            return new C2463m(view);
        }

        /* renamed from: b */
        public final String mo6062b() {
            return "<init>";
        }

        /* renamed from: h */
        public final C3204e mo6063h() {
            return C3384y.m12254a(C2463m.class);
        }

        /* renamed from: j */
        public final String mo6064j() {
            return "<init>(Landroid/view/View;)V";
        }
    }

    /* renamed from: com.fb.fluid.ui.g.c.l$b */
    static final class C2462b extends C3371l implements C3352d<C2463m, Integer, C2458k, Unit> {

        /* renamed from: g */
        public static final C2462b f6208g = new C2462b();

        C2462b() {
            super(3);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
            mo7307a((C2463m) obj, ((Number) obj2).intValue(), (C2458k) obj3);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7307a(C2463m mVar, int i, C2458k kVar) {
            C3370k.m12227b(mVar, "$receiver");
            C3370k.m12227b(kVar, "item");
            AppCompatTextView C = mVar.mo7308C();
            View view = mVar.f2168f;
            C3370k.m12223a((Object) view, "itemView");
            Context context = view.getContext();
            C3370k.m12223a((Object) context, "itemView.context");
            C.setText(kVar.mo7334c(context));
            C.setAlpha(kVar.mo7342k() ? 1.0f : 0.5f);
            CharSequence text = C.getText();
            int i2 = 0;
            C.setVisibility(text == null || text.length() == 0 ? 8 : 0);
            View B = mVar.mo3763B();
            if (i == 0) {
                i2 = 8;
            }
            B.setVisibility(i2);
        }
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: a */
    public static final C1108a<C2458k, C2463m> m9204a(C1114e eVar) {
        C3370k.m12227b(eVar, "$this$withHeader");
        String name = C2458k.class.getName();
        C3370k.m12223a((Object) name, "HeaderItem::class.java.name");
        C1139b bVar = new C1139b(eVar, name);
        bVar.mo5186a(C2461a.f6207j, C2462b.f6208g);
        eVar.mo5192a(bVar.mo5238f(), C3148R.layout.item_header, bVar);
        return bVar;
    }
}
