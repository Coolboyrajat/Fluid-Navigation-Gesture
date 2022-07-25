package com.p131fb.fluid.p148ui.p149g.p152c;

import android.view.View;
import android.widget.FrameLayout;
import com.p131fb.fluid.C1718g;
import kotlin.Unit;
import kotlin.p192b0.C3204e;
import kotlin.p205x.p206c.C3349a;
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

/* renamed from: com.fb.fluid.ui.g.c.j */
public final class C2453j {

    /* renamed from: com.fb.fluid.ui.g.c.j$a */
    static final /* synthetic */ class C2454a extends C3368i implements C3350b<View, C2485w> {

        /* renamed from: j */
        public static final C2454a f6202j = new C2454a();

        C2454a() {
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

    /* renamed from: com.fb.fluid.ui.g.c.j$b */
    static final class C2455b extends C3371l implements C3352d<C2485w, Integer, C2451i, Unit> {

        /* renamed from: g */
        public static final C2455b f6203g = new C2455b();

        /* renamed from: com.fb.fluid.ui.g.c.j$b$a */
        static final class C2456a implements View.OnClickListener {

            /* renamed from: f */
            final /* synthetic */ C2451i f6204f;

            C2456a(boolean z, C2451i iVar) {
                this.f6204f = iVar;
            }

            public final void onClick(View view) {
                C3349a<Unit> m = this.f6204f.mo7298m();
                if (m != null) {
                    Unit invoke = m.invoke();
                }
            }
        }

        C2455b() {
            super(3);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
            mo7301a((C2485w) obj, ((Number) obj2).intValue(), (C2451i) obj3);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7301a(C2485w wVar, int i, C2451i iVar) {
            C3370k.m12227b(wVar, "$receiver");
            C3370k.m12227b(iVar, "item");
            C2479v.m9276a(wVar, (C3350b) null, i, iVar, 1, (Object) null);
            boolean k = iVar.mo7342k();
            FrameLayout frameLayout = (FrameLayout) wVar.mo7348C().mo7402b(C1718g.widget_config_button);
            frameLayout.setOnClickListener(k ? new C2456a(k, iVar) : null);
            frameLayout.setVisibility(iVar.mo7298m() != null ? 0 : 8);
            frameLayout.setClickable(frameLayout.hasOnClickListeners());
            frameLayout.setEnabled(k);
            frameLayout.setAlpha(k ? 1.0f : 0.5f);
        }
    }

    /* renamed from: a */
    public static final C1108a<C2451i, C2485w> m9193a(C1114e eVar) {
        C3370k.m12227b(eVar, "$this$withConfigButtonPreferenceItem");
        String name = C2451i.class.getName();
        C3370k.m12223a((Object) name, "ConfigButtonPreferenceItem::class.java.name");
        C1139b bVar = new C1139b(eVar, name);
        bVar.mo5186a(C2454a.f6202j, C2455b.f6203g);
        eVar.mo5192a(bVar.mo5238f(), C3148R.layout.item_preference_config, bVar);
        return bVar;
    }
}
