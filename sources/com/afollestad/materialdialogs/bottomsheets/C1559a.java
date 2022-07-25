package com.afollestad.materialdialogs.bottomsheets;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.afollestad.materialdialogs.internal.button.C1594a;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.main.DialogScrollView;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3373n;
import kotlin.p205x.p207d.C3374o;
import kotlin.p205x.p207d.C3384y;
import kotlin.p210z.C3389a;
import kotlin.p210z.C3391c;
import p054c.p055a.p056a.C1039a;
import p054c.p055a.p056a.C1040b;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.p066v.C1103e;

/* renamed from: com.afollestad.materialdialogs.bottomsheets.a */
public final class C1559a implements C1039a {

    /* renamed from: i */
    static final /* synthetic */ C3208i[] f4593i;

    /* renamed from: a */
    private BottomSheetBehavior<?> f4594a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ViewGroup f4595b;

    /* renamed from: c */
    private CoordinatorLayout f4596c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public DialogActionButtonLayout f4597d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1041c f4598e;

    /* renamed from: f */
    private final C3391c f4599f;

    /* renamed from: g */
    private final C3391c f4600g;

    /* renamed from: h */
    private final C1040b f4601h;

    /* renamed from: com.afollestad.materialdialogs.bottomsheets.a$a */
    public static final class C1560a {
        private C1560a() {
        }

        public /* synthetic */ C1560a(C3366g gVar) {
            this();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.bottomsheets.a$b */
    static final class C1561b extends C3371l implements C3350b<DialogActionButtonLayout, Unit> {

        /* renamed from: g */
        final /* synthetic */ Animator f4602g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1561b(Animator animator) {
            super(1);
            this.f4602g = animator;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6052a((DialogActionButtonLayout) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6052a(DialogActionButtonLayout dialogActionButtonLayout) {
            C3370k.m12227b(dialogActionButtonLayout, "$receiver");
            this.f4602g.cancel();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.bottomsheets.a$c */
    static final class C1562c extends C3371l implements C3350b<Integer, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1559a f4603g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1562c(C1559a aVar) {
            super(1);
            this.f4603g = aVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6053a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6053a(int i) {
            DialogActionButtonLayout c = this.f4603g.f4597d;
            if (c != null) {
                c.setTranslationY((float) i);
            }
        }
    }

    /* renamed from: com.afollestad.materialdialogs.bottomsheets.a$d */
    static final class C1563d implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C1559a f4604f;

        C1563d(C1559a aVar) {
            this.f4604f = aVar;
        }

        public final void onClick(View view) {
            C1041c d = this.f4604f.f4598e;
            if (d != null) {
                d.dismiss();
            }
        }
    }

    /* renamed from: com.afollestad.materialdialogs.bottomsheets.a$e */
    static final class C1564e extends C3371l implements C3350b<ViewGroup, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1559a f4605g;

        /* renamed from: com.afollestad.materialdialogs.bottomsheets.a$e$a */
        static final class C1565a extends C3371l implements C3349a<Unit> {

            /* renamed from: g */
            final /* synthetic */ C1564e f4606g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1565a(C1564e eVar) {
                super(0);
                this.f4606g = eVar;
            }

            public final void invoke() {
                C1559a aVar = this.f4606g.f4605g;
                aVar.m6866b(aVar.m6868c());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1564e(C1559a aVar) {
            super(1);
            this.f4605g = aVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6055a((ViewGroup) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6055a(ViewGroup viewGroup) {
            C3370k.m12227b(viewGroup, "$receiver");
            BottomSheetBehavior<?> a = this.f4605g.mo6049a();
            if (a != null) {
                a.mo7848c(0);
            }
            BottomSheetBehavior<?> a2 = this.f4605g.mo6049a();
            if (a2 != null) {
                a2.mo7851e(4);
            }
            BottomSheetBehavior<?> a3 = this.f4605g.mo6049a();
            if (a3 != null) {
                ViewGroup b = this.f4605g.f4595b;
                if (b != null) {
                    C1574e.m6903a(a3, b, 0, this.f4605g.m6868c(), 250, new C1565a(this));
                } else {
                    C3370k.m12221a();
                    throw null;
                }
            }
            this.f4605g.m6875f();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.bottomsheets.a$f */
    static final class C1566f extends C3371l implements C3350b<Integer, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1559a f4607g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1566f(C1559a aVar) {
            super(1);
            this.f4607g = aVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6056a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6056a(int i) {
            DialogActionButtonLayout c;
            DialogActionButtonLayout c2 = this.f4607g.f4597d;
            int measuredHeight = c2 != null ? c2.getMeasuredHeight() : i + 1;
            if (1 <= i && measuredHeight >= i) {
                int i2 = measuredHeight - i;
                DialogActionButtonLayout c3 = this.f4607g.f4597d;
                if (c3 != null) {
                    c3.setTranslationY((float) i2);
                }
            } else if (i > 0 && (c = this.f4607g.f4597d) != null) {
                c.setTranslationY(0.0f);
            }
            this.f4607g.m6866b(i);
        }
    }

    /* renamed from: com.afollestad.materialdialogs.bottomsheets.a$g */
    static final class C1567g extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        final /* synthetic */ C1559a f4608g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1567g(C1559a aVar) {
            super(0);
            this.f4608g = aVar;
        }

        public final void invoke() {
            DialogActionButtonLayout c = this.f4608g.f4597d;
            if (c != null) {
                c.setVisibility(8);
            }
            C1041c d = this.f4608g.f4598e;
            if (d != null) {
                d.dismiss();
            }
        }
    }

    /* renamed from: com.afollestad.materialdialogs.bottomsheets.a$h */
    static final class C1568h extends C3371l implements C3350b<ViewGroup, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1559a f4609g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1568h(C1559a aVar) {
            super(1);
            this.f4609g = aVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6057a((ViewGroup) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6057a(ViewGroup viewGroup) {
            C3370k.m12227b(viewGroup, "$receiver");
            C1559a aVar = this.f4609g;
            aVar.m6870c(Math.min(aVar.mo6051b(), Math.min(viewGroup.getMeasuredHeight(), this.f4609g.mo6051b())));
        }
    }

    /* renamed from: com.afollestad.materialdialogs.bottomsheets.a$i */
    static final class C1569i extends C3371l implements C3350b<DialogActionButtonLayout, Unit> {

        /* renamed from: g */
        final /* synthetic */ Animator f4610g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1569i(Animator animator) {
            super(1);
            this.f4610g = animator;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6058a((DialogActionButtonLayout) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6058a(DialogActionButtonLayout dialogActionButtonLayout) {
            C3370k.m12227b(dialogActionButtonLayout, "$receiver");
            this.f4610g.cancel();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.bottomsheets.a$j */
    static final class C1570j extends C3371l implements C3350b<Integer, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1559a f4611g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1570j(C1559a aVar) {
            super(1);
            this.f4611g = aVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6059a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6059a(int i) {
            DialogActionButtonLayout c = this.f4611g.f4597d;
            if (c != null) {
                c.setTranslationY((float) i);
            }
        }
    }

    static {
        Class<C1559a> cls = C1559a.class;
        C3374o oVar = new C3374o(C3384y.m12254a((Class) cls), "defaultPeekHeight", "getDefaultPeekHeight$com_afollestad_material_dialogs_bottomsheets()I");
        C3384y.m12257a((C3373n) oVar);
        C3374o oVar2 = new C3374o(C3384y.m12254a((Class) cls), "actualPeekHeight", "getActualPeekHeight()I");
        C3384y.m12257a((C3373n) oVar2);
        f4593i = new C3208i[]{oVar, oVar2};
        new C1560a((C3366g) null);
    }

    public C1559a() {
        this((C1040b) null, 1, (C3366g) null);
    }

    public C1559a(C1040b bVar) {
        C3370k.m12227b(bVar, "layoutMode");
        this.f4601h = bVar;
        this.f4599f = C3389a.f8051a.mo10091a();
        this.f4600g = C3389a.f8051a.mo10091a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1559a(C1040b bVar, int i, C3366g gVar) {
        this((i & 1) != 0 ? C1040b.MATCH_PARENT : bVar);
    }

    /* renamed from: a */
    private final void m6863a(Window window, Activity activity) {
        Window window2 = activity.getWindow();
        if (window2 == null) {
            C3370k.m12221a();
            throw null;
        } else if (Build.VERSION.SDK_INT >= 21) {
            window.setNavigationBarColor(window2.getNavigationBarColor());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m6866b(int i) {
        DialogLayout h;
        DialogContentLayout contentLayout;
        C1041c cVar;
        DialogLayout h2;
        DialogActionButtonLayout dialogActionButtonLayout;
        boolean z;
        C1041c cVar2 = this.f4598e;
        if (cVar2 != null && (h = cVar2.mo5116h()) != null && (contentLayout = h.getContentLayout()) != null && (cVar = this.f4598e) != null && (h2 = cVar.mo5116h()) != null) {
            int measuredHeight = h2.getMeasuredHeight();
            DialogScrollView scrollView = contentLayout.getScrollView();
            DialogRecyclerView recyclerView = contentLayout.getRecyclerView();
            if (i < measuredHeight) {
                dialogActionButtonLayout = this.f4597d;
                if (dialogActionButtonLayout != null) {
                    z = true;
                } else {
                    return;
                }
            } else if (scrollView != null) {
                scrollView.mo6166a();
                return;
            } else if (recyclerView != null) {
                recyclerView.mo6122a();
                return;
            } else {
                dialogActionButtonLayout = this.f4597d;
                if (dialogActionButtonLayout != null) {
                    z = false;
                } else {
                    return;
                }
            }
            dialogActionButtonLayout.setDrawDivider(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final int m6868c() {
        return ((Number) this.f4600g.mo10092a(this, f4593i[1])).intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m6870c(int i) {
        this.f4600g.mo10093a(this, f4593i[1], Integer.valueOf(i));
    }

    /* renamed from: d */
    private final void m6872d() {
        if (C1594a.m6942a(this.f4597d)) {
            DialogActionButtonLayout dialogActionButtonLayout = this.f4597d;
            if (dialogActionButtonLayout != null) {
                Animator a = C1574e.m6901a(0, dialogActionButtonLayout.getMeasuredHeight(), 250, new C1562c(this), (C3349a) null, 16, (Object) null);
                DialogActionButtonLayout dialogActionButtonLayout2 = this.f4597d;
                if (dialogActionButtonLayout2 != null) {
                    C1574e.m6902a(dialogActionButtonLayout2, new C1561b(a));
                }
                a.start();
                return;
            }
            C3370k.m12221a();
            throw null;
        }
    }

    /* renamed from: e */
    private final void m6873e() {
        BottomSheetBehavior<?> b = BottomSheetBehavior.m9971b(this.f4595b);
        b.mo7846b(true);
        b.mo7848c(0);
        this.f4594a = b;
        BottomSheetBehavior<?> bottomSheetBehavior = this.f4594a;
        if (bottomSheetBehavior != null) {
            C1574e.m6904a(bottomSheetBehavior, new C1566f(this), new C1567g(this));
            C1103e eVar = C1103e.f3789a;
            ViewGroup viewGroup = this.f4595b;
            if (viewGroup != null) {
                eVar.mo5171a(viewGroup, new C1568h(this));
            } else {
                C3370k.m12221a();
                throw null;
            }
        } else {
            C3370k.m12221a();
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m6875f() {
        if (C1594a.m6942a(this.f4597d)) {
            DialogActionButtonLayout dialogActionButtonLayout = this.f4597d;
            if (dialogActionButtonLayout != null) {
                int measuredHeight = dialogActionButtonLayout.getMeasuredHeight();
                DialogActionButtonLayout dialogActionButtonLayout2 = this.f4597d;
                if (dialogActionButtonLayout2 != null) {
                    dialogActionButtonLayout2.setTranslationY((float) measuredHeight);
                }
                DialogActionButtonLayout dialogActionButtonLayout3 = this.f4597d;
                if (dialogActionButtonLayout3 != null) {
                    dialogActionButtonLayout3.setVisibility(0);
                }
                Animator a = C1574e.m6901a(measuredHeight, 0, 180, new C1570j(this), (C3349a) null, 16, (Object) null);
                DialogActionButtonLayout dialogActionButtonLayout4 = this.f4597d;
                if (dialogActionButtonLayout4 != null) {
                    C1574e.m6902a(dialogActionButtonLayout4, new C1569i(a));
                }
                a.setStartDelay(100);
                a.start();
                return;
            }
            C3370k.m12221a();
            throw null;
        }
    }

    /* renamed from: a */
    public int mo5094a(boolean z) {
        return z ? C1573d.MD_Dark_BottomSheet : C1573d.MD_Light_BottomSheet;
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: a */
    public ViewGroup mo5095a(Context context, Window window, LayoutInflater layoutInflater, C1041c cVar) {
        C3370k.m12227b(context, "creatingContext");
        C3370k.m12227b(window, "dialogWindow");
        C3370k.m12227b(layoutInflater, "layoutInflater");
        C3370k.m12227b(cVar, "dialog");
        View inflate = layoutInflater.inflate(C1572c.md_dialog_base_bottomsheet, (ViewGroup) null, false);
        if (inflate != null) {
            this.f4596c = (CoordinatorLayout) inflate;
            this.f4598e = cVar;
            CoordinatorLayout coordinatorLayout = this.f4596c;
            if (coordinatorLayout != null) {
                this.f4595b = (ViewGroup) coordinatorLayout.findViewById(C1571b.md_root_bottom_sheet);
                CoordinatorLayout coordinatorLayout2 = this.f4596c;
                if (coordinatorLayout2 != null) {
                    this.f4597d = (DialogActionButtonLayout) coordinatorLayout2.findViewById(C1571b.md_button_layout);
                    C1103e eVar = C1103e.f3789a;
                    WindowManager windowManager = window.getWindowManager();
                    C3370k.m12223a((Object) windowManager, "dialogWindow.windowManager");
                    mo6050a((int) (((float) eVar.mo5169a(windowManager).mo9935b().intValue()) * 0.6f));
                    m6870c(mo6051b());
                    m6873e();
                    if (context instanceof Activity) {
                        m6863a(window, (Activity) context);
                    }
                    CoordinatorLayout coordinatorLayout3 = this.f4596c;
                    if (coordinatorLayout3 != null) {
                        return coordinatorLayout3;
                    }
                    C3370k.m12221a();
                    throw null;
                }
                C3370k.m12221a();
                throw null;
            }
            C3370k.m12221a();
            throw null;
        }
        throw new C3269p("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
    }

    /* renamed from: a */
    public DialogLayout mo5096a(ViewGroup viewGroup) {
        C3370k.m12227b(viewGroup, "root");
        View findViewById = viewGroup.findViewById(C1571b.md_root);
        if (findViewById != null) {
            DialogLayout dialogLayout = (DialogLayout) findViewById;
            dialogLayout.setLayoutMode(this.f4601h);
            DialogActionButtonLayout dialogActionButtonLayout = this.f4597d;
            if (dialogActionButtonLayout != null) {
                dialogLayout.mo6143a(dialogActionButtonLayout);
                return dialogLayout;
            }
            C3370k.m12221a();
            throw null;
        }
        throw new C3269p("null cannot be cast to non-null type com.afollestad.materialdialogs.internal.main.DialogLayout");
    }

    /* renamed from: a */
    public final BottomSheetBehavior<?> mo6049a() {
        return this.f4594a;
    }

    /* renamed from: a */
    public final void mo6050a(int i) {
        this.f4599f.mo10093a(this, f4593i[0], Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo5097a(Context context, Window window, DialogLayout dialogLayout, Integer num) {
        C3370k.m12227b(context, "context");
        C3370k.m12227b(window, "window");
        C3370k.m12227b(dialogLayout, "view");
        if (num == null || num.intValue() != 0) {
            window.setSoftInputMode(16);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -1;
            window.setAttributes(layoutParams);
        }
    }

    /* renamed from: a */
    public void mo5098a(C1041c cVar) {
        CoordinatorLayout coordinatorLayout;
        C3370k.m12227b(cVar, "dialog");
        if (cVar.mo5110c() && (coordinatorLayout = this.f4596c) != null) {
            coordinatorLayout.setOnClickListener(new C1563d(this));
        }
        C1103e eVar = C1103e.f3789a;
        ViewGroup viewGroup = this.f4595b;
        if (viewGroup != null) {
            eVar.mo5171a(viewGroup, new C1564e(this));
        } else {
            C3370k.m12221a();
            throw null;
        }
    }

    /* renamed from: a */
    public void mo5099a(DialogLayout dialogLayout, int i, float f) {
        C3370k.m12227b(dialogLayout, "view");
        ViewGroup viewGroup = this.f4595b;
        if (viewGroup != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
            gradientDrawable.setColor(i);
            viewGroup.setBackground(gradientDrawable);
        }
        DialogActionButtonLayout dialogActionButtonLayout = this.f4597d;
        if (dialogActionButtonLayout != null) {
            dialogActionButtonLayout.setBackgroundColor(i);
        }
    }

    /* renamed from: b */
    public final int mo6051b() {
        return ((Number) this.f4599f.mo10092a(this, f4593i[0])).intValue();
    }

    /* renamed from: b */
    public void mo5100b(C1041c cVar) {
        C3370k.m12227b(cVar, "dialog");
    }

    public boolean onDismiss() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        if (this.f4598e == null || (bottomSheetBehavior = this.f4594a) == null) {
            return false;
        }
        if (bottomSheetBehavior == null) {
            C3370k.m12221a();
            throw null;
        } else if (bottomSheetBehavior.mo7847c() == 5) {
            return false;
        } else {
            BottomSheetBehavior<?> bottomSheetBehavior2 = this.f4594a;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.mo7851e(5);
                m6872d();
                return true;
            }
            C3370k.m12221a();
            throw null;
        }
    }
}
