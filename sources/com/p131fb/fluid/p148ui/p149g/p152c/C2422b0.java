package com.p131fb.fluid.p148ui.p149g.p152c;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.p131fb.fluid.C1718g;
import com.p131fb.fluid.p148ui.views.PreferenceView;
import kotlin.Unit;
import kotlin.p192b0.C3204e;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3368i;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3384y;
import p054c.p055a.p067b.C1108a;
import p054c.p055a.p067b.C1114e;
import p054c.p055a.p067b.p068f.C1116a;
import p054c.p055a.p067b.p071i.C1139b;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.c.b0 */
public final class C2422b0 {

    /* renamed from: com.fb.fluid.ui.g.c.b0$a */
    static final class C2423a extends C3371l implements C3352d<C2485w, Integer, C2408a0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1139b f6148g;

        /* renamed from: h */
        final /* synthetic */ C3351c f6149h;

        /* renamed from: com.fb.fluid.ui.g.c.b0$a$a */
        static final class C2424a implements CompoundButton.OnCheckedChangeListener {

            /* renamed from: a */
            final /* synthetic */ C2423a f6150a;

            /* renamed from: b */
            final /* synthetic */ C2408a0 f6151b;

            C2424a(C2423a aVar, C2408a0 a0Var, boolean z) {
                this.f6150a = aVar;
                this.f6151b = a0Var;
            }

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C3350b<Boolean, Boolean> m;
                C3351c cVar = this.f6150a.f6149h;
                if ((cVar == null || ((Boolean) cVar.mo6125a(this.f6151b, Boolean.valueOf(z))).booleanValue()) && ((m = this.f6151b.mo7239m()) == null || m.mo5146a(Boolean.valueOf(z)).booleanValue())) {
                    C2472t.m9230a((C2472t) this.f6151b, (Object) Boolean.valueOf(z), (C1116a) this.f6150a.f6148g.mo5236d(), false, 4, (Object) null);
                    return;
                }
                C3370k.m12223a((Object) compoundButton, "me");
                compoundButton.setChecked(!z);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.c.b0$a$b */
        static final class C2425b implements View.OnClickListener {

            /* renamed from: f */
            final /* synthetic */ C2485w f6152f;

            C2425b(C2485w wVar, boolean z) {
                this.f6152f = wVar;
            }

            public final void onClick(View view) {
                ((SwitchCompat) this.f6152f.mo7348C().mo7402b(C1718g.widget_switch)).toggle();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2423a(C1139b bVar, C3351c cVar) {
            super(3);
            this.f6148g = bVar;
            this.f6149h = cVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
            mo7251a((C2485w) obj, ((Number) obj2).intValue(), (C2408a0) obj3);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7251a(C2485w wVar, int i, C2408a0 a0Var) {
            C3370k.m12227b(wVar, "$receiver");
            C3370k.m12227b(a0Var, "item");
            C2479v.m9276a(wVar, (C3350b) null, i, a0Var, 1, (Object) null);
            boolean k = a0Var.mo7342k();
            SwitchCompat switchCompat = (SwitchCompat) wVar.mo7348C().mo7402b(C1718g.widget_switch);
            switchCompat.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            switchCompat.setOnClickListener((View.OnClickListener) null);
            switchCompat.setChecked(C3370k.m12225a((Object) (Boolean) a0Var.mo7333c(), (Object) true));
            switchCompat.setEnabled(k);
            switchCompat.setAlpha(k ? 1.0f : 0.5f);
            switchCompat.setOnCheckedChangeListener(new C2424a(this, a0Var, k));
            PreferenceView C = wVar.mo7348C();
            if (k) {
                C.setOnClickListener(new C2425b(wVar, k));
            }
            C.setClickable(C.hasOnClickListeners());
        }
    }

    /* renamed from: com.fb.fluid.ui.g.c.b0$b */
    static final /* synthetic */ class C2426b extends C3368i implements C3350b<View, C2485w> {

        /* renamed from: j */
        public static final C2426b f6153j = new C2426b();

        C2426b() {
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
    public static final C1108a<C2408a0, C2485w> m9116a(C1114e eVar, C3351c<? super C2408a0, ? super Boolean, Boolean> cVar) {
        C3370k.m12227b(eVar, "$this$withSwitchPreferenceItem");
        String name = C2408a0.class.getName();
        C3370k.m12223a((Object) name, "SwitchPreferenceItem::class.java.name");
        C1139b bVar = new C1139b(eVar, name);
        bVar.mo5186a(C2426b.f6153j, new C2423a(bVar, cVar));
        eVar.mo5192a(bVar.mo5238f(), C3148R.layout.item_preference_switch, bVar);
        return bVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C1108a m9117a(C1114e eVar, C3351c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = null;
        }
        return m9116a(eVar, cVar);
    }
}
