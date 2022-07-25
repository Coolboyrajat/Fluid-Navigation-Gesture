package com.p131fb.fluid.p148ui.p149g.p152c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import com.p131fb.fluid.p135l.p139p.C1770f;
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
import p054c.p055a.p067b.p071i.C1139b;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.c.d0 */
public final class C2430d0 {

    /* renamed from: com.fb.fluid.ui.g.c.d0$a */
    static final class C2431a extends C3371l implements C3352d<C2436e0, Integer, C2428c0, Unit> {

        /* renamed from: g */
        final /* synthetic */ C3350b f6164g;

        /* renamed from: h */
        final /* synthetic */ C3351c f6165h;

        /* renamed from: com.fb.fluid.ui.g.c.d0$a$a */
        static final class C2432a implements View.OnClickListener {

            /* renamed from: f */
            final /* synthetic */ C2431a f6166f;

            /* renamed from: g */
            final /* synthetic */ C2428c0 f6167g;

            C2432a(C2431a aVar, C2428c0 c0Var) {
                this.f6166f = aVar;
                this.f6167g = c0Var;
            }

            public final void onClick(View view) {
                C3350b bVar = this.f6166f.f6164g;
                if (bVar != null) {
                    Boolean bool = (Boolean) bVar.mo5146a(this.f6167g);
                }
            }
        }

        /* renamed from: com.fb.fluid.ui.g.c.d0$a$b */
        static final class C2433b implements Toolbar.C0144f {

            /* renamed from: a */
            final /* synthetic */ C2431a f6168a;

            /* renamed from: b */
            final /* synthetic */ C2428c0 f6169b;

            C2433b(C2431a aVar, C2428c0 c0Var) {
                this.f6168a = aVar;
                this.f6169b = c0Var;
            }

            public final boolean onMenuItemClick(MenuItem menuItem) {
                C3351c cVar = this.f6168a.f6165h;
                if (cVar != null) {
                    C2428c0 c0Var = this.f6169b;
                    C3370k.m12223a((Object) menuItem, "it");
                    if (((Boolean) cVar.mo6125a(c0Var, menuItem)).booleanValue()) {
                        return true;
                    }
                }
                C3350b<MenuItem, Boolean> b = this.f6169b.mo7257b();
                if (b != null) {
                    C3370k.m12223a((Object) menuItem, "it");
                    if (b.mo5146a(menuItem).booleanValue()) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2431a(C3350b bVar, C3351c cVar) {
            super(3);
            this.f6164g = bVar;
            this.f6165h = cVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
            mo7268a((C2436e0) obj, ((Number) obj2).intValue(), (C2428c0) obj3);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7268a(C2436e0 e0Var, int i, C2428c0 c0Var) {
            int i2;
            C3370k.m12227b(e0Var, "$receiver");
            C3370k.m12227b(c0Var, "item");
            Toolbar C = e0Var.mo7275C();
            if (c0Var.mo7256a() > 0) {
                C.mo1076a(c0Var.mo7256a());
            } else {
                try {
                    Menu menu = C.getMenu();
                    C3370k.m12223a((Object) menu, "menu");
                    int size = menu.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        MenuItem item = menu.getItem(i3);
                        C3370k.m12223a((Object) item, "getItem(index)");
                        C.getMenu().removeItem(item.getItemId());
                    }
                } catch (Exception unused) {
                }
            }
            String str = null;
            if (c0Var.mo7258c()) {
                C.setNavigationIcon((int) C3148R.C3149drawable.ic_toolbar_back_24px);
                C.setNavigationOnClickListener(new C2432a(this, c0Var));
            } else {
                C.setNavigationOnClickListener((View.OnClickListener) null);
            }
            C.setOnMenuItemClickListener(new C2433b(this, c0Var));
            AppCompatTextView B = e0Var.mo3763B();
            ViewGroup.LayoutParams layoutParams = B.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                if (c0Var.mo7264h()) {
                    View view = e0Var.f2168f;
                    C3370k.m12223a((Object) view, "itemView");
                    Context context = view.getContext();
                    C3370k.m12223a((Object) context, "itemView.context");
                    i2 = C1770f.m7469b(context, 16843499);
                } else {
                    i2 = 0;
                }
                marginLayoutParams.topMargin = i2;
            }
            String d = c0Var.mo7259d();
            if (d == null) {
                Integer g = c0Var.mo7263g();
                if (g != null) {
                    int intValue = g.intValue();
                    View view2 = e0Var.f2168f;
                    C3370k.m12223a((Object) view2, "itemView");
                    str = view2.getContext().getString(intValue);
                }
                d = str;
            }
            if (d == null) {
                d = BuildConfig.FLAVOR;
            }
            B.setText(d);
            CharSequence text = B.getText();
            B.setVisibility(text == null || text.length() == 0 ? 8 : 0);
            B.setGravity(c0Var.mo7260e() ? 17 : 0);
            View view3 = e0Var.f2168f;
            C3370k.m12223a((Object) view3, "itemView");
            B.setTextSize(0, view3.getResources().getDimension(c0Var.mo7262f() ? C3148R.dimen.font_xlarger : C3148R.dimen.font_larger));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.c.d0$b */
    static final /* synthetic */ class C2434b extends C3368i implements C3350b<View, C2436e0> {

        /* renamed from: j */
        public static final C2434b f6170j = new C2434b();

        C2434b() {
            super(1);
        }

        /* renamed from: a */
        public final C2436e0 mo5146a(View view) {
            C3370k.m12227b(view, "p1");
            return new C2436e0(view);
        }

        /* renamed from: b */
        public final String mo6062b() {
            return "<init>";
        }

        /* renamed from: h */
        public final C3204e mo6063h() {
            return C3384y.m12254a(C2436e0.class);
        }

        /* renamed from: j */
        public final String mo6064j() {
            return "<init>(Landroid/view/View;)V";
        }
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: a */
    public static final C1108a<C2428c0, C2436e0> m9138a(C1114e eVar, C3350b<? super C2428c0, Boolean> bVar, C3351c<? super C2428c0, ? super MenuItem, Boolean> cVar) {
        C3370k.m12227b(eVar, "$this$withToolbar");
        String name = C2428c0.class.getName();
        C3370k.m12223a((Object) name, "ToolbarItem::class.java.name");
        C1139b bVar2 = new C1139b(eVar, name);
        bVar2.mo5186a(C2434b.f6170j, new C2431a(bVar, cVar));
        eVar.mo5192a(bVar2.mo5238f(), C3148R.layout.item_toolbar, bVar2);
        return bVar2;
    }
}
