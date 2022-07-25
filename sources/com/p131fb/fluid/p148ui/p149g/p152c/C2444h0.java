package com.p131fb.fluid.p148ui.p149g.p152c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p131fb.fluid.data.Trigger;
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
import p054c.p055a.p067b.C1111d;
import p054c.p055a.p067b.C1114e;
import p054c.p055a.p067b.p068f.C1116a;
import p054c.p055a.p067b.p071i.C1139b;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.c.h0 */
public final class C2444h0 {

    /* renamed from: com.fb.fluid.ui.g.c.h0$a */
    static final class C2445a extends C3371l implements C3352d<C2457j0, Integer, C2440g0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C3351c f6190g;

        /* renamed from: com.fb.fluid.ui.g.c.h0$a$a */
        static final class C2446a extends C3371l implements C3350b<C1114e, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2445a f6191g;

            /* renamed from: h */
            final /* synthetic */ C2457j0 f6192h;

            /* renamed from: i */
            final /* synthetic */ C2440g0 f6193i;

            /* renamed from: com.fb.fluid.ui.g.c.h0$a$a$a */
            static final class C2447a extends C3371l implements C3350b<C1108a<? extends Trigger, C2438f0>, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2446a f6194g;

                /* renamed from: com.fb.fluid.ui.g.c.h0$a$a$a$a */
                static final class C2448a extends C3371l implements C3352d<C2438f0, Integer, Trigger, Unit> {

                    /* renamed from: g */
                    final /* synthetic */ C2447a f6195g;

                    /* renamed from: com.fb.fluid.ui.g.c.h0$a$a$a$a$a */
                    static final class C2449a implements View.OnClickListener {

                        /* renamed from: f */
                        final /* synthetic */ C2448a f6196f;

                        /* renamed from: g */
                        final /* synthetic */ Trigger f6197g;

                        /* renamed from: h */
                        final /* synthetic */ String f6198h;

                        C2449a(C2448a aVar, boolean z, Trigger trigger, String str) {
                            this.f6196f = aVar;
                            this.f6197g = trigger;
                            this.f6198h = str;
                        }

                        public final void onClick(View view) {
                            this.f6196f.f6195g.f6194g.f6191g.f6190g.mo6125a(this.f6197g, this.f6198h);
                        }
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C2448a(C2447a aVar) {
                        super(3);
                        this.f6195g = aVar;
                    }

                    /* renamed from: a */
                    public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
                        mo7294a((C2438f0) obj, ((Number) obj2).intValue(), (Trigger) obj3);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: a */
                    public final void mo7294a(C2438f0 f0Var, int i, Trigger trigger) {
                        C3370k.m12227b(f0Var, "$receiver");
                        C3370k.m12227b(trigger, "itemTrigger");
                        boolean k = this.f6195g.f6194g.f6193i.mo7342k();
                        View view = f0Var.f2168f;
                        C3370k.m12223a((Object) view, "itemView");
                        Context context = view.getContext();
                        int g = trigger.mo6388g();
                        String string = context.getString(g != 3 ? g != 5 ? g != 80 ? C3148R.string.pref_trigger_title_top : C3148R.string.pref_trigger_title_bottom : C3148R.string.pref_trigger_title_right : C3148R.string.pref_trigger_title_left);
                        C3370k.m12223a((Object) string, "itemView.context.getStri…                       })");
                        AppCompatImageView C = f0Var.mo7280C();
                        float f = 1.0f;
                        C.setAlpha(k ? 1.0f : 0.5f);
                        int g2 = trigger.mo6388g();
                        C.setImageResource(g2 != 3 ? g2 != 5 ? g2 != 80 ? 0 : C3148R.C3149drawable.ic_touch_handler_bottom_24px : C3148R.C3149drawable.ic_touch_handler_right_24px : C3148R.C3149drawable.ic_touch_handler_left_24px);
                        AppCompatTextView D = f0Var.mo7281D();
                        if (!k) {
                            f = 0.5f;
                        }
                        D.setAlpha(f);
                        D.setText(string);
                        View B = f0Var.mo3763B();
                        if (k) {
                            B.setOnClickListener(new C2449a(this, k, trigger, string));
                        } else {
                            B.setOnClickListener((View.OnClickListener) null);
                        }
                        B.setClickable(B.hasOnClickListeners());
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2447a(C2446a aVar) {
                    super(1);
                    this.f6194g = aVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                    mo7293a((C1108a<Trigger, C2438f0>) (C1108a) obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo7293a(C1108a<Trigger, C2438f0> aVar) {
                    C3370k.m12227b(aVar, "$receiver");
                    aVar.mo5186a(C2452i0.f6201j, new C2448a(this));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2446a(C2445a aVar, C2457j0 j0Var, C2440g0 g0Var) {
                super(1);
                this.f6191g = aVar;
                this.f6192h = j0Var;
                this.f6193i = g0Var;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                mo7292a((C1114e) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7292a(C1114e eVar) {
                C3370k.m12227b(eVar, "$receiver");
                View view = this.f6192h.f2168f;
                C3370k.m12223a((Object) view, "itemView");
                eVar.mo5189a((RecyclerView.C0538o) new GridLayoutManager(view.getContext(), 3));
                eVar.mo5190a((C1116a<?>) this.f6192h.mo3763B());
                C2447a aVar = new C2447a(this);
                String name = Trigger.class.getName();
                C3370k.m12223a((Object) name, "IT::class.java.name");
                C1139b bVar = new C1139b(eVar, name);
                aVar.mo5146a(bVar);
                eVar.mo5192a(bVar.mo5238f(), C3148R.layout.item_trigger, bVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2445a(C3351c cVar) {
            super(3);
            this.f6190g = cVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
            mo7291a((C2457j0) obj, ((Number) obj2).intValue(), (C2440g0) obj3);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7291a(C2457j0 j0Var, int i, C2440g0 g0Var) {
            C3370k.m12227b(j0Var, "$receiver");
            C3370k.m12227b(g0Var, "item");
            C1116a<Object> B = j0Var.mo3763B();
            B.clear();
            B.addAll(g0Var.mo7287m());
            C1111d.m5549a(j0Var.mo7303C(), new C2446a(this, j0Var, g0Var));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.c.h0$b */
    static final /* synthetic */ class C2450b extends C3368i implements C3350b<View, C2457j0> {

        /* renamed from: j */
        public static final C2450b f6199j = new C2450b();

        C2450b() {
            super(1);
        }

        /* renamed from: a */
        public final C2457j0 mo5146a(View view) {
            C3370k.m12227b(view, "p1");
            return new C2457j0(view);
        }

        /* renamed from: b */
        public final String mo6062b() {
            return "<init>";
        }

        /* renamed from: h */
        public final C3204e mo6063h() {
            return C3384y.m12254a(C2457j0.class);
        }

        /* renamed from: j */
        public final String mo6064j() {
            return "<init>(Landroid/view/View;)V";
        }
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: a */
    public static final C1108a<C2440g0, C2457j0> m9172a(C1114e eVar, C3351c<? super Trigger, ? super String, Unit> cVar) {
        C3370k.m12227b(eVar, "$this$withTriggerListItem");
        C3370k.m12227b(cVar, "onTapTrigger");
        String name = C2440g0.class.getName();
        C3370k.m12223a((Object) name, "TriggersList::class.java.name");
        C1139b bVar = new C1139b(eVar, name);
        bVar.mo5186a(C2450b.f6199j, new C2445a(cVar));
        eVar.mo5192a(bVar.mo5238f(), C3148R.layout.item_triggers_list, bVar);
        return bVar;
    }
}
