package com.p131fb.fluid.p148ui.p149g.p152c;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.p131fb.fluid.C1718g;
import kotlin.C3269p;
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

/* renamed from: com.fb.fluid.ui.g.c.h */
public final class C2441h {

    /* renamed from: com.fb.fluid.ui.g.c.h$a */
    static final class C2442a extends C3371l implements C3352d<C2485w, Integer, C2439g, Unit> {

        /* renamed from: g */
        final /* synthetic */ C3350b f6188g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2442a(C3350b bVar) {
            super(3);
            this.f6188g = bVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
            mo7289a((C2485w) obj, ((Number) obj2).intValue(), (C2439g) obj3);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7289a(C2485w wVar, int i, C2439g gVar) {
            C3370k.m12227b(wVar, "$receiver");
            C3370k.m12227b(gVar, "item");
            C2479v.m9275a(wVar, this.f6188g, i, gVar);
            boolean k = gVar.mo7342k();
            AppCompatImageView appCompatImageView = (AppCompatImageView) wVar.mo7348C().mo7402b(C1718g.widget_color);
            appCompatImageView.setEnabled(k);
            appCompatImageView.setAlpha(k ? 1.0f : 0.5f);
            Drawable drawable = appCompatImageView.getDrawable();
            if (drawable != null) {
                ((GradientDrawable) drawable).setColor(gVar.mo7283n());
                return;
            }
            throw new C3269p("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
    }

    /* renamed from: com.fb.fluid.ui.g.c.h$b */
    static final /* synthetic */ class C2443b extends C3368i implements C3350b<View, C2485w> {

        /* renamed from: j */
        public static final C2443b f6189j = new C2443b();

        C2443b() {
            super(1);
        }

        /* renamed from: a */
        public final C2485w mo5146a(View view) {
            C3370k.m12227b(view, "p1");
            return new C2485w(view);
        }

        /* renamed from: b */
        public final String mo6062b() {
            return "<init>";
        }

        /* renamed from: h */
        public final C3204e mo6063h() {
            return C3384y.m12254a(C2485w.class);
        }

        /* renamed from: j */
        public final String mo6064j() {
            return "<init>(Landroid/view/View;)V";
        }
    }

    /* renamed from: a */
    public static final C1108a<C2439g, C2485w> m9164a(C1114e eVar, C3350b<? super C2439g, Boolean> bVar) {
        C3370k.m12227b(eVar, "$this$withColorPreferenceItem");
        String name = C2439g.class.getName();
        C3370k.m12223a((Object) name, "ColorPreferenceItem::class.java.name");
        C1139b bVar2 = new C1139b(eVar, name);
        bVar2.mo5186a(C2443b.f6189j, new C2442a(bVar));
        eVar.mo5192a(bVar2.mo5238f(), C3148R.layout.item_preference_color, bVar2);
        return bVar2;
    }
}
