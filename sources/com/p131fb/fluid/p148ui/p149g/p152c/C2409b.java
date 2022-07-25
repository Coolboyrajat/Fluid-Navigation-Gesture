package com.p131fb.fluid.p148ui.p149g.p152c;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.p131fb.fluid.C1718g;
import com.p131fb.fluid.data.C1706c;
import com.p131fb.fluid.p135l.p139p.C1770f;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.C3265l;
import kotlin.Unit;
import kotlin.p192b0.C3204e;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p197u.p199i.p200a.C3328b;
import kotlin.p197u.p199i.p200a.C3339l;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p206c.C3353e;
import kotlin.p205x.p207d.C3368i;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3384y;
import kotlinx.coroutines.C3418e0;
import kotlinx.coroutines.C3422f0;
import kotlinx.coroutines.C3430h0;
import kotlinx.coroutines.C3499j1;
import kotlinx.coroutines.C3536t0;
import p054c.p055a.p067b.C1108a;
import p054c.p055a.p067b.C1111d;
import p054c.p055a.p067b.C1114e;
import p054c.p055a.p067b.p068f.C1116a;
import p054c.p055a.p067b.p071i.C1139b;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.c.b */
public final class C2409b {

    /* renamed from: com.fb.fluid.ui.g.c.b$a */
    static final class C2410a extends C3371l implements C3352d<C2437f, Integer, C2407a, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1139b f6120g;

        /* renamed from: h */
        final /* synthetic */ C3353e f6121h;

        /* renamed from: com.fb.fluid.ui.g.c.b$a$a */
        static final class C2411a extends C3371l implements C3350b<Boolean, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2410a f6122g;

            /* renamed from: h */
            final /* synthetic */ C2437f f6123h;

            /* renamed from: i */
            final /* synthetic */ C2407a f6124i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2411a(C2410a aVar, C2437f fVar, C2407a aVar2) {
                super(1);
                this.f6122g = aVar;
                this.f6123h = fVar;
                this.f6124i = aVar2;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                mo7241a(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7241a(boolean z) {
                C1116a<Object> D = this.f6123h.mo7276D();
                D.clear();
                if (this.f6123h.mo7277E().contains("*")) {
                    D.mo5202a((IT[]) new Object[]{"*"});
                } else {
                    D.addAll(this.f6123h.mo7277E());
                    D.mo5202a((IT[]) new Object[]{BuildConfig.FLAVOR});
                }
                if (z) {
                    C2472t.m9230a((C2472t) this.f6124i, (Object) this.f6123h.mo7277E(), (C1116a) this.f6122g.f6120g.mo5236d(), false, 4, (Object) null);
                }
            }
        }

        /* renamed from: com.fb.fluid.ui.g.c.b$a$b */
        static final class C2412b extends C3339l implements C3351c<C3418e0, C3309c<? super Unit>, Object> {

            /* renamed from: j */
            private C3418e0 f6125j;

            /* renamed from: k */
            int f6126k;

            /* renamed from: l */
            final /* synthetic */ C2437f f6127l;

            /* renamed from: m */
            final /* synthetic */ C2407a f6128m;

            /* renamed from: n */
            final /* synthetic */ C3350b f6129n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2412b(C2437f fVar, C2407a aVar, C3350b bVar, C3309c cVar) {
                super(2, cVar);
                this.f6127l = fVar;
                this.f6128m = aVar;
                this.f6129n = bVar;
            }

            /* renamed from: a */
            public final Object mo6125a(Object obj, Object obj2) {
                return ((C2412b) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
            }

            /* renamed from: a */
            public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
                C3370k.m12227b(cVar, "completion");
                C2412b bVar = new C2412b(this.f6127l, this.f6128m, this.f6129n, cVar);
                bVar.f6125j = (C3418e0) obj;
                return bVar;
            }

            /* renamed from: b */
            public final Object mo6618b(Object obj) {
                Object unused = C3326d.m12146a();
                if (this.f6126k == 0) {
                    C3265l.m11979a(obj);
                    List<String> E = this.f6127l.mo7277E();
                    E.clear();
                    List list = (List) this.f6128m.mo7333c();
                    if (list == null) {
                        list = C3284j.m12068a();
                    }
                    C3328b.m12154a(E.addAll(list));
                    this.f6129n.mo5146a(C3328b.m12154a(false));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.fb.fluid.ui.g.c.b$a$c */
        static final class C2413c extends C3371l implements C3350b<C1114e, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2410a f6130g;

            /* renamed from: h */
            final /* synthetic */ C2437f f6131h;

            /* renamed from: i */
            final /* synthetic */ boolean f6132i;

            /* renamed from: j */
            final /* synthetic */ C2407a f6133j;

            /* renamed from: k */
            final /* synthetic */ C3350b f6134k;

            /* renamed from: com.fb.fluid.ui.g.c.b$a$c$a */
            static final class C2414a extends C3371l implements C3350b<C1108a<? extends String, C2435e>, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2413c f6135g;

                /* renamed from: com.fb.fluid.ui.g.c.b$a$c$a$a */
                static final class C2415a extends C3371l implements C3352d<C2435e, Integer, String, Unit> {

                    /* renamed from: g */
                    final /* synthetic */ C2414a f6136g;

                    /* renamed from: com.fb.fluid.ui.g.c.b$a$c$a$a$a */
                    static final class C2416a implements View.OnClickListener {

                        /* renamed from: f */
                        final /* synthetic */ C2415a f6137f;

                        /* renamed from: com.fb.fluid.ui.g.c.b$a$c$a$a$a$a */
                        static final class C2417a extends C3371l implements C3350b<C1706c, Unit> {

                            /* renamed from: g */
                            final /* synthetic */ C2416a f6138g;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C2417a(C2416a aVar) {
                                super(1);
                                this.f6138g = aVar;
                            }

                            /* renamed from: a */
                            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                                mo7246a((C1706c) obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: a */
                            public final void mo7246a(C1706c cVar) {
                                C3370k.m12227b(cVar, "result");
                                List<String> E = this.f6138g.f6137f.f6136g.f6135g.f6131h.mo7277E();
                                String str = cVar.packageName;
                                C3370k.m12223a((Object) str, "result.packageName");
                                E.add(str);
                                this.f6138g.f6137f.f6136g.f6135g.f6134k.mo5146a(true);
                            }
                        }

                        C2416a(C2415a aVar) {
                            this.f6137f = aVar;
                        }

                        public final void onClick(View view) {
                            C2413c cVar = this.f6137f.f6136g.f6135g;
                            cVar.f6130g.f6121h.mo6514a(Boolean.valueOf(cVar.f6133j.mo7235m()), Boolean.valueOf(this.f6137f.f6136g.f6135g.f6133j.mo7236n()), C3292r.m12104g(this.f6137f.f6136g.f6135g.f6131h.mo7277E()), new C2417a(this));
                        }
                    }

                    /* renamed from: com.fb.fluid.ui.g.c.b$a$c$a$a$b */
                    static final class C2418b implements View.OnClickListener {

                        /* renamed from: f */
                        final /* synthetic */ View f6139f;

                        /* renamed from: g */
                        final /* synthetic */ C2415a f6140g;

                        /* renamed from: h */
                        final /* synthetic */ C2435e f6141h;

                        /* renamed from: i */
                        final /* synthetic */ String f6142i;

                        /* renamed from: j */
                        final /* synthetic */ int f6143j;

                        /* renamed from: com.fb.fluid.ui.g.c.b$a$c$a$a$b$a */
                        static final class C2419a implements View.OnClickListener {

                            /* renamed from: f */
                            final /* synthetic */ C2418b f6144f;

                            C2419a(C2418b bVar) {
                                this.f6144f = bVar;
                            }

                            public final void onClick(View view) {
                                List<String> E = this.f6144f.f6140g.f6136g.f6135g.f6131h.mo7277E();
                                C2418b bVar = this.f6144f;
                                E.add(bVar.f6143j, bVar.f6142i);
                                this.f6144f.f6140g.f6136g.f6135g.f6134k.mo5146a(true);
                            }
                        }

                        C2418b(View view, C2415a aVar, C2435e eVar, String str, int i) {
                            this.f6139f = view;
                            this.f6140g = aVar;
                            this.f6141h = eVar;
                            this.f6142i = str;
                            this.f6143j = i;
                        }

                        public final void onClick(View view) {
                            this.f6140g.f6136g.f6135g.f6131h.mo7277E().remove(this.f6142i);
                            this.f6140g.f6136g.f6135g.f6134k.mo5146a(true);
                            Snackbar a = Snackbar.m10663a(this.f6141h.f2168f, this.f6139f.getContext().getString(C3148R.string.pref_blacklist_removed, new Object[]{String.valueOf(this.f6141h.mo7274F().getText())}), 0);
                            a.mo8612a((int) C3148R.string.undo, (View.OnClickListener) new C2419a(this));
                            a.mo8575k();
                        }
                    }

                    /* renamed from: com.fb.fluid.ui.g.c.b$a$c$a$a$c */
                    static final class C2420c implements View.OnLongClickListener {

                        /* renamed from: f */
                        final /* synthetic */ View f6145f;

                        /* renamed from: g */
                        final /* synthetic */ C2435e f6146g;

                        C2420c(View view, C2415a aVar, C2435e eVar, String str, int i) {
                            this.f6145f = view;
                            this.f6146g = eVar;
                        }

                        public final boolean onLongClick(View view) {
                            Context context = this.f6145f.getContext();
                            C3370k.m12223a((Object) context, "context");
                            C1770f.m7467a(context, String.valueOf(this.f6146g.mo7274F().getText()), 0, 2, (Object) null);
                            return true;
                        }
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C2415a(C2414a aVar) {
                        super(3);
                        this.f6136g = aVar;
                    }

                    /* renamed from: a */
                    public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
                        mo7244a((C2435e) obj, ((Number) obj2).intValue(), (String) obj3);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: a */
                    public final void mo7244a(C2435e eVar, int i, String str) {
                        View view;
                        C2418b bVar;
                        C2435e eVar2 = eVar;
                        String str2 = str;
                        C3370k.m12227b(eVar2, "$receiver");
                        C3370k.m12227b(str2, "packageName");
                        Drawable drawable = null;
                        if (str.hashCode() == 0 && str2.equals(BuildConfig.FLAVOR)) {
                            View E = eVar.mo7273E();
                            E.setOnClickListener(this.f6136g.f6135g.f6132i ? new C2416a(this) : null);
                            E.setOnLongClickListener(C2429d.f6163f);
                            E.setClickable(E.hasOnClickListeners());
                            E.setEnabled(this.f6136g.f6135g.f6132i);
                            E.setAlpha(this.f6136g.f6135g.f6132i ? 1.0f : 0.5f);
                            eVar.mo7272D().setVisibility(8);
                            eVar.mo3763B().setVisibility(0);
                            AppCompatImageView C = eVar.mo7271C();
                            View view2 = eVar2.f2168f;
                            C3370k.m12223a((Object) view2, "itemView");
                            Drawable drawable2 = view2.getContext().getDrawable(C3148R.C3149drawable.ic_menu_plus_circle_outline);
                            if (drawable2 != null) {
                                View view3 = eVar2.f2168f;
                                C3370k.m12223a((Object) view3, "itemView");
                                Context context = view3.getContext();
                                C3370k.m12223a((Object) context, "itemView.context");
                                drawable2.setTint(C1770f.m7461a(context, 16842808));
                                drawable = drawable2;
                            }
                            C.setImageDrawable(drawable);
                            eVar.mo7274F().setText(BuildConfig.FLAVOR);
                            return;
                        }
                        View E2 = eVar.mo7273E();
                        if (this.f6136g.f6135g.f6132i) {
                            view = E2;
                            bVar = new C2418b(E2, this, eVar, str, i);
                        } else {
                            view = E2;
                            bVar = null;
                        }
                        view.setOnClickListener(bVar);
                        C2420c cVar = r0;
                        C2420c cVar2 = new C2420c(view, this, eVar, str, i);
                        view.setOnLongClickListener(cVar);
                        view.setClickable(view.hasOnClickListeners());
                        view.setEnabled(this.f6136g.f6135g.f6132i);
                        view.setAlpha(this.f6136g.f6135g.f6132i ? 1.0f : 0.5f);
                        eVar.mo7272D().setVisibility(0);
                        eVar.mo3763B().setVisibility(8);
                        eVar.mo7271C().setImageDrawable((Drawable) null);
                        if (str.hashCode() == 42 && str2.equals("*")) {
                            eVar.mo7274F().setText(eVar.mo7273E().getContext().getString(C3148R.string.pref_select_all_apps));
                            eVar.mo7271C().setImageResource(C3148R.C3149drawable.ic_android);
                            return;
                        }
                        try {
                            View view4 = eVar2.f2168f;
                            C3370k.m12223a((Object) view4, "itemView");
                            Context context2 = view4.getContext();
                            C3370k.m12223a((Object) context2, "itemView.context");
                            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(str2, 0);
                            AppCompatTextView F = eVar.mo7274F();
                            View view5 = eVar2.f2168f;
                            C3370k.m12223a((Object) view5, "itemView");
                            Context context3 = view5.getContext();
                            C3370k.m12223a((Object) context3, "itemView.context");
                            F.setText(applicationInfo.loadLabel(context3.getPackageManager()));
                            AppCompatImageView C2 = eVar.mo7271C();
                            View view6 = eVar2.f2168f;
                            C3370k.m12223a((Object) view6, "itemView");
                            Context context4 = view6.getContext();
                            C3370k.m12223a((Object) context4, "itemView.context");
                            C2.setImageDrawable(applicationInfo.loadIcon(context4.getPackageManager()));
                        } catch (Exception unused) {
                        }
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2414a(C2413c cVar) {
                    super(1);
                    this.f6135g = cVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                    mo7243a((C1108a<String, C2435e>) (C1108a) obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo7243a(C1108a<String, C2435e> aVar) {
                    C3370k.m12227b(aVar, "$receiver");
                    aVar.mo5186a(C2427c.f6154j, new C2415a(this));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2413c(C2410a aVar, C2437f fVar, boolean z, C2407a aVar2, C3350b bVar) {
                super(1);
                this.f6130g = aVar;
                this.f6131h = fVar;
                this.f6132i = z;
                this.f6133j = aVar2;
                this.f6134k = bVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                mo7242a((C1114e) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7242a(C1114e eVar) {
                C3370k.m12227b(eVar, "$receiver");
                View view = this.f6131h.f2168f;
                C3370k.m12223a((Object) view, "itemView");
                eVar.mo5189a((RecyclerView.C0538o) new GridLayoutManager(view.getContext(), 4, 1, false));
                eVar.mo5190a((C1116a<?>) this.f6131h.mo7276D());
                C2414a aVar = new C2414a(this);
                String name = String.class.getName();
                C3370k.m12223a((Object) name, "IT::class.java.name");
                C1139b bVar = new C1139b(eVar, name);
                aVar.mo5146a(bVar);
                eVar.mo5192a(bVar.mo5238f(), C3148R.layout.item_blacklist_app, bVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2410a(C1139b bVar, C3353e eVar) {
            super(3);
            this.f6120g = bVar;
            this.f6121h = eVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
            mo7240a((C2437f) obj, ((Number) obj2).intValue(), (C2407a) obj3);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7240a(C2437f fVar, int i, C2407a aVar) {
            C2437f fVar2 = fVar;
            C2407a aVar2 = aVar;
            C3370k.m12227b(fVar2, "$receiver");
            C3370k.m12227b(aVar2, "item");
            C2479v.m9276a(fVar, (C3350b) null, i, aVar, 1, (Object) null);
            boolean k = aVar.mo7342k();
            C2411a aVar3 = new C2411a(this, fVar2, aVar2);
            C3499j1 F = fVar.mo7278F();
            if (F != null) {
                C3499j1.C3500a.m12631a(F, (CancellationException) null, 1, (Object) null);
            }
            fVar2.mo7279b(C3417e.m12335a(C3422f0.m12341a(C3536t0.m12778c()), (C3314f) null, (C3430h0) null, new C2412b(fVar2, aVar2, aVar3, (C3309c) null), 3, (Object) null));
            RecyclerView recyclerView = (RecyclerView) fVar.mo7348C().mo7402b(C1718g.widget_recycler_view);
            C3370k.m12223a((Object) recyclerView, "root.widget_recycler_view");
            if (recyclerView.getAdapter() == null) {
                RecyclerView recyclerView2 = (RecyclerView) fVar.mo7348C().mo7402b(C1718g.widget_recycler_view);
                C3370k.m12223a((Object) recyclerView2, "root.widget_recycler_view");
                C1111d.m5549a(recyclerView2, new C2413c(this, fVar, k, aVar, aVar3));
            }
        }
    }

    /* renamed from: com.fb.fluid.ui.g.c.b$b */
    static final /* synthetic */ class C2421b extends C3368i implements C3350b<View, C2437f> {

        /* renamed from: j */
        public static final C2421b f6147j = new C2421b();

        C2421b() {
            super(1);
        }

        /* renamed from: a */
        public final C2437f mo5146a(View view) {
            C3370k.m12227b(view, "p1");
            return new C2437f(view);
        }

        /* renamed from: b */
        public final String mo6062b() {
            return "<init>";
        }

        /* renamed from: h */
        public final C3204e mo6063h() {
            return C3384y.m12254a(C2437f.class);
        }

        /* renamed from: j */
        public final String mo6064j() {
            return "<init>(Landroid/view/View;)V";
        }
    }

    /* renamed from: a */
    public static final C1108a<C2407a, C2437f> m9095a(C1114e eVar, C3353e<? super Boolean, ? super Boolean, ? super List<String>, ? super C3350b<? super C1706c, Unit>, Unit> eVar2) {
        C3370k.m12227b(eVar, "$this$withAppSelectorItem");
        C3370k.m12227b(eVar2, "onSelectApp");
        String name = C2407a.class.getName();
        C3370k.m12223a((Object) name, "AppSelectorItem::class.java.name");
        C1139b bVar = new C1139b(eVar, name);
        bVar.mo5186a(C2421b.f6147j, new C2410a(bVar, eVar2));
        eVar.mo5192a(bVar.mo5238f(), C3148R.layout.item_blacklist, bVar);
        return bVar;
    }
}
