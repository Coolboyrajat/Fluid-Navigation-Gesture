package p054c.p055a.p056a.p060q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.SeekBar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.afollestad.materialdialogs.color.view.ObservableSeekBar;
import com.afollestad.materialdialogs.color.view.PreviewFrameView;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.afollestad.viewpagerdots.DotsIndicator;
import java.util.Map;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.C1055m;
import p054c.p055a.p056a.p057n.C1057a;
import p054c.p055a.p056a.p060q.p061m.C1082b;
import p054c.p055a.p056a.p062r.C1084a;
import p054c.p055a.p056a.p066v.C1100b;
import p054c.p055a.p056a.p066v.C1103e;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: c.a.a.q.g */
public final class C1068g {

    /* renamed from: c.a.a.q.g$a */
    static final class C1069a extends C3371l implements C3350b<Integer, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1041c f3749g;

        /* renamed from: h */
        final /* synthetic */ boolean f3750h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1069a(C1041c cVar, boolean z) {
            super(1);
            this.f3749g = cVar;
            this.f3750h = z;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5147a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5147a(int i) {
            C1041c cVar = this.f3749g;
            C1057a.m5383a(cVar, C1055m.POSITIVE, C1068g.m5436b(cVar, this.f3750h) != null);
            View a = C1068g.m5435b(this.f3749g);
            if (a != null) {
                EditText editText = (EditText) a.findViewById(C1078j.hexValueView);
                if (i == 0) {
                    ((DialogRecyclerView) C1084a.m5467a(this.f3749g).findViewById(C1078j.colorPresetGrid)).mo6122a();
                    Object systemService = this.f3749g.getContext().getSystemService("input_method");
                    if (!(systemService instanceof InputMethodManager)) {
                        systemService = null;
                    }
                    InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                    if (inputMethodManager != null) {
                        C3370k.m12223a((Object) editText, "hexValueView");
                        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                        return;
                    }
                    return;
                }
                C1100b.m5508a(this.f3749g, false, false);
            }
        }
    }

    /* renamed from: c.a.a.q.g$b */
    static final class C1070b extends C3371l implements C3350b<C1041c, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1041c f3751g;

        /* renamed from: h */
        final /* synthetic */ boolean f3752h;

        /* renamed from: i */
        final /* synthetic */ C3351c f3753i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1070b(C1041c cVar, boolean z, C3351c cVar2) {
            super(1);
            this.f3751g = cVar;
            this.f3752h = z;
            this.f3753i = cVar2;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5148a((C1041c) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5148a(C1041c cVar) {
            C3370k.m12227b(cVar, "it");
            Integer a = C1068g.m5436b(this.f3751g, this.f3752h);
            if (a != null) {
                this.f3753i.mo6125a(this.f3751g, Integer.valueOf(a.intValue()));
            }
        }
    }

    /* renamed from: c.a.a.q.g$c */
    static final class C1071c extends C3371l implements C3350b<Integer, Boolean> {

        /* renamed from: g */
        final /* synthetic */ C1041c f3754g;

        /* renamed from: h */
        final /* synthetic */ C1066e f3755h;

        /* renamed from: i */
        final /* synthetic */ Integer f3756i;

        /* renamed from: j */
        final /* synthetic */ C3351c f3757j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1071c(C1041c cVar, C1066e eVar, Integer num, C3351c cVar2) {
            super(1);
            this.f3754g = cVar;
            this.f3755h = eVar;
            this.f3756i = num;
            this.f3757j = cVar2;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5149a(((Number) obj).intValue()));
        }

        /* renamed from: a */
        public final boolean mo5149a(int i) {
            Integer a = C1068g.m5436b(this.f3754g, true);
            boolean z = false;
            if (a != null && i == a.intValue()) {
                return false;
            }
            this.f3755h.mo5138b(i);
            C1041c cVar = this.f3754g;
            if (this.f3756i != null) {
                z = true;
            }
            C1068g.m5438b(cVar, z, this.f3757j);
            return true;
        }
    }

    /* renamed from: c.a.a.q.g$d */
    static final class C1072d extends C3371l implements C3350b<Integer, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1041c f3758g;

        /* renamed from: h */
        final /* synthetic */ Integer f3759h;

        /* renamed from: i */
        final /* synthetic */ C3351c f3760i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1072d(C1041c cVar, Integer num, C3351c cVar2) {
            super(1);
            this.f3758g = cVar;
            this.f3759h = num;
            this.f3760i = cVar2;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5150a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5150a(int i) {
            C1068g.m5438b(this.f3758g, this.f3759h != null, this.f3760i);
        }
    }

    /* renamed from: c.a.a.q.g$e */
    static final class C1073e extends C3371l implements C3350b<Integer, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1041c f3761g;

        /* renamed from: h */
        final /* synthetic */ Integer f3762h;

        /* renamed from: i */
        final /* synthetic */ C3351c f3763i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1073e(C1041c cVar, Integer num, C3351c cVar2) {
            super(1);
            this.f3761g = cVar;
            this.f3762h = num;
            this.f3763i = cVar2;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5151a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5151a(int i) {
            C1068g.m5438b(this.f3761g, this.f3762h != null, this.f3763i);
        }
    }

    /* renamed from: c.a.a.q.g$f */
    static final class C1074f extends C3371l implements C3350b<Integer, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1041c f3764g;

        /* renamed from: h */
        final /* synthetic */ Integer f3765h;

        /* renamed from: i */
        final /* synthetic */ C3351c f3766i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1074f(C1041c cVar, Integer num, C3351c cVar2) {
            super(1);
            this.f3764g = cVar;
            this.f3765h = num;
            this.f3766i = cVar2;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5152a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5152a(int i) {
            C1068g.m5438b(this.f3764g, this.f3765h != null, this.f3766i);
        }
    }

    /* renamed from: c.a.a.q.g$g */
    static final class C1075g extends C3371l implements C3350b<Integer, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1041c f3767g;

        /* renamed from: h */
        final /* synthetic */ Integer f3768h;

        /* renamed from: i */
        final /* synthetic */ C3351c f3769i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1075g(C1041c cVar, Integer num, C3351c cVar2) {
            super(1);
            this.f3767g = cVar;
            this.f3768h = num;
            this.f3769i = cVar2;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5153a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5153a(int i) {
            C1068g.m5438b(this.f3767g, this.f3768h != null, this.f3769i);
        }
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    public static final C1041c m5428a(C1041c cVar, int[] iArr, int[][] iArr2, Integer num, boolean z, boolean z2, boolean z3, boolean z4, C3351c<? super C1041c, ? super Integer, Unit> cVar2) {
        C1041c cVar3 = cVar;
        boolean z5 = z2;
        C3351c<? super C1041c, ? super Integer, Unit> cVar4 = cVar2;
        C3370k.m12227b(cVar, "$this$colorChooser");
        int[] iArr3 = iArr;
        C3370k.m12227b(iArr, "colors");
        Map<String, Object> d = cVar.mo5111d();
        d.put("color_wait_for_positive", Boolean.valueOf(z));
        d.put("color_custom_argb", Boolean.valueOf(z2));
        d.put("color_show_alpha", Boolean.valueOf(z3));
        d.put("color_change_action_button_color", Boolean.valueOf(z4));
        if (!z5) {
            C1041c cVar5 = cVar;
            C1084a.m5469a(cVar5, Integer.valueOf(C1080l.md_color_chooser_base_grid), (View) null, false, false, false, false, 62, (Object) null);
            m5434a(cVar5, iArr, iArr2, num, z, cVar2, z2);
        } else {
            C1084a.m5469a(cVar, Integer.valueOf(C1080l.md_color_chooser_base_pager), (View) null, false, true, false, false, 54, (Object) null);
            ViewPager e = m5442e(cVar);
            C3370k.m12223a((Object) e, "viewPager");
            e.setAdapter(new C1064c());
            C1082b.m5462a(e, (C3350b<? super Integer, Unit>) new C1069a(cVar, z5));
            DotsIndicator d2 = m5441d(cVar);
            if (d2 != null) {
                d2.mo6201a(e);
                d2.setDotTint(C1103e.m5515a(C1103e.f3789a, cVar.mo5117i(), (Integer) null, (Integer) 16842806, (C3349a) null, 10, (Object) null));
            }
            m5434a(cVar, iArr, iArr2, num, z, cVar2, z2);
            m5432a(cVar, z3, num, cVar4);
        }
        if (z && cVar4 != null) {
            C1057a.m5383a(cVar, C1055m.POSITIVE, false);
            C1041c.m5352b(cVar, (Integer) null, (CharSequence) null, new C1070b(cVar, z5, cVar4), 3, (Object) null);
        }
        return cVar3;
    }

    /* renamed from: a */
    public static /* synthetic */ C1041c m5429a(C1041c cVar, int[] iArr, int[][] iArr2, Integer num, boolean z, boolean z2, boolean z3, boolean z4, C3351c cVar2, int i, Object obj) {
        int i2 = i;
        C3351c cVar3 = null;
        int[][] iArr3 = (i2 & 2) != 0 ? null : iArr2;
        Integer num2 = (i2 & 4) != 0 ? null : num;
        boolean z5 = (i2 & 8) != 0 ? true : z;
        boolean z6 = false;
        boolean z7 = (i2 & 16) != 0 ? false : z2;
        boolean z8 = (i2 & 32) != 0 ? false : z3;
        if ((i2 & 64) == 0) {
            z6 = z4;
        }
        if ((i2 & PropertyFlags.ID_SELF_ASSIGNABLE) == 0) {
            cVar3 = cVar2;
        }
        m5428a(cVar, iArr, iArr3, num2, z5, z7, z8, z6, cVar3);
        return cVar;
    }

    /* renamed from: a */
    public static final void m5431a(C1041c cVar, int i) {
        C3370k.m12227b(cVar, "$this$setArgbColor");
        View b = m5435b(cVar);
        if (b != null) {
            ((PreviewFrameView) b.findViewById(C1078j.preview_frame)).setColor(i);
            View findViewById = b.findViewById(C1078j.alpha_seeker);
            C3370k.m12223a((Object) findViewById, "customPage.findViewById<…ekBar>(R.id.alpha_seeker)");
            ((SeekBar) findViewById).setProgress(Color.alpha(i));
            View findViewById2 = b.findViewById(C1078j.red_seeker);
            C3370k.m12223a((Object) findViewById2, "customPage.findViewById<SeekBar>(R.id.red_seeker)");
            ((SeekBar) findViewById2).setProgress(Color.red(i));
            View findViewById3 = b.findViewById(C1078j.green_seeker);
            C3370k.m12223a((Object) findViewById3, "customPage.findViewById<…ekBar>(R.id.green_seeker)");
            ((SeekBar) findViewById3).setProgress(Color.green(i));
            View findViewById4 = b.findViewById(C1078j.blue_seeker);
            C3370k.m12223a((Object) findViewById4, "customPage.findViewById<SeekBar>(R.id.blue_seeker)");
            ((SeekBar) findViewById4).setProgress(Color.blue(i));
        }
    }

    /* renamed from: a */
    private static final void m5432a(C1041c cVar, boolean z, Integer num, C3351c<? super C1041c, ? super Integer, Unit> cVar2) {
        C1066e eVar = new C1066e(cVar);
        eVar.mo5145i();
        cVar.mo5111d().put("color_custom_page_view_set", eVar);
        if (num != null) {
            eVar.mo5138b(num.intValue());
        } else {
            eVar.mo5136a(255);
        }
        C1103e eVar2 = C1103e.f3789a;
        Context context = cVar.getContext();
        C3370k.m12223a((Object) context, "context");
        boolean a = eVar2.mo5176a(context);
        boolean z2 = false;
        if (!z) {
            C1082b.m5463b(eVar.mo5135a(), 0);
            C1082b.m5463b(eVar.mo5137b(), 0);
            C1082b.m5463b(eVar.mo5139c(), 0);
            if (!a) {
                C1082b.m5460a((View) eVar.mo5143g(), C1078j.preview_frame);
            }
        }
        if (a) {
            C1082b.m5459a(!z ? eVar.mo5143g() : eVar.mo5135a());
        }
        eVar.mo5142f().setOnHexChanged(new C1071c(cVar, eVar, num, cVar2));
        ObservableSeekBar.m6922a(eVar.mo5137b(), false, (C3350b) new C1072d(cVar, num, cVar2), 1, (Object) null);
        ObservableSeekBar.m6922a(eVar.mo5144h(), false, (C3350b) new C1073e(cVar, num, cVar2), 1, (Object) null);
        ObservableSeekBar.m6922a(eVar.mo5141e(), false, (C3350b) new C1074f(cVar, num, cVar2), 1, (Object) null);
        ObservableSeekBar.m6922a(eVar.mo5140d(), false, (C3350b) new C1075g(cVar, num, cVar2), 1, (Object) null);
        if (num != null) {
            z2 = true;
        }
        m5438b(cVar, z2, cVar2);
    }

    /* renamed from: a */
    private static final void m5434a(C1041c cVar, int[] iArr, int[][] iArr2, Integer num, boolean z, C3351c<? super C1041c, ? super Integer, Unit> cVar2, boolean z2) {
        boolean z3;
        int[][] iArr3 = iArr2;
        if (iArr3 == null || iArr.length == iArr3.length) {
            DialogRecyclerView dialogRecyclerView = (DialogRecyclerView) C1084a.m5467a(cVar).findViewById(C1078j.colorPresetGrid);
            int integer = cVar.mo5117i().getResources().getInteger(C1079k.color_grid_column_count);
            C3370k.m12223a((Object) dialogRecyclerView, "gridRecyclerView");
            dialogRecyclerView.setLayoutManager(new GridLayoutManager(cVar.mo5117i(), integer));
            C1041c cVar3 = cVar;
            dialogRecyclerView.mo6123a(cVar);
            if (z2) {
                C1103e eVar = C1103e.f3789a;
                Context context = cVar.getContext();
                C3370k.m12223a((Object) context, "context");
                if (eVar.mo5176a(context)) {
                    z3 = true;
                    dialogRecyclerView.setAdapter(new C1062a(cVar, iArr, iArr2, num, z, cVar2, z3));
                    return;
                }
            }
            z3 = false;
            dialogRecyclerView.setAdapter(new C1062a(cVar, iArr, iArr2, num, z, cVar2, z3));
            return;
        }
        throw new IllegalArgumentException("Sub-colors array size should match the colors array size.".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final View m5435b(C1041c cVar) {
        return cVar.findViewById(C1078j.colorArgbPage);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final Integer m5436b(C1041c cVar, boolean z) {
        if (z) {
            ViewPager e = m5442e(cVar);
            C3370k.m12223a((Object) e, "viewPager");
            if (e.getCurrentItem() == 1) {
                return ((C1066e) cVar.mo5105a("color_custom_page_view_set")).mo5142f().getColor();
            }
        }
        RecyclerView c = m5439c(cVar);
        C3370k.m12223a((Object) c, "getPageGridView()");
        RecyclerView.C0527g adapter = c.getAdapter();
        if (adapter != null) {
            return ((C1062a) adapter).mo5130f();
        }
        throw new C3269p("null cannot be cast to non-null type com.afollestad.materialdialogs.color.ColorGridAdapter");
    }

    /* renamed from: b */
    public static final void m5437b(C1041c cVar, int i) {
        C3370k.m12227b(cVar, "$this$setPage");
        m5442e(cVar).mo3682a(i, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m5438b(C1041c cVar, boolean z, C3351c<? super C1041c, ? super Integer, Unit> cVar2) {
        C1066e eVar = (C1066e) cVar.mo5105a("color_custom_page_view_set");
        boolean booleanValue = ((Boolean) cVar.mo5105a("color_show_alpha")).booleanValue();
        boolean booleanValue2 = ((Boolean) cVar.mo5105a("color_wait_for_positive")).booleanValue();
        int argb = Color.argb(booleanValue ? eVar.mo5137b().getProgress() : 255, eVar.mo5144h().getProgress(), eVar.mo5141e().getProgress(), eVar.mo5140d().getProgress());
        eVar.mo5142f().setSupportCustomAlpha(booleanValue);
        eVar.mo5142f().setColor(argb);
        eVar.mo5138b(argb);
        if (z) {
            C1057a.m5383a(cVar, C1055m.POSITIVE, true);
            if (!booleanValue2 && cVar2 != null) {
                Unit a = cVar2.mo6125a(cVar, Integer.valueOf(argb));
            }
        }
        m5440c(cVar, argb);
        DialogRecyclerView dialogRecyclerView = (DialogRecyclerView) C1084a.m5467a(cVar).findViewById(C1078j.colorPresetGrid);
        if (dialogRecyclerView != null) {
            RecyclerView.C0527g adapter = dialogRecyclerView.getAdapter();
            if (adapter != null) {
                ((C1062a) adapter).mo5129e(argb);
                return;
            }
            throw new C3269p("null cannot be cast to non-null type com.afollestad.materialdialogs.color.ColorGridAdapter");
        }
    }

    /* renamed from: c */
    private static final RecyclerView m5439c(C1041c cVar) {
        return (RecyclerView) cVar.findViewById(C1078j.colorPresetGrid);
    }

    /* renamed from: c */
    public static final void m5440c(C1041c cVar, int i) {
        C3370k.m12227b(cVar, "$this$updateActionButtonsColor");
        if (((Boolean) cVar.mo5105a("color_change_action_button_color")).booleanValue()) {
            int rgb = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
            boolean a = C1103e.f3789a.mo5175a(rgb, 0.25d);
            C1103e eVar = C1103e.f3789a;
            Context context = cVar.getContext();
            C3370k.m12223a((Object) context, "context");
            C1103e eVar2 = eVar;
            boolean a2 = C1103e.m5520a(eVar2, C1103e.m5515a(eVar2, context, (Integer) null, (Integer) 16842806, (C3349a) null, 10, (Object) null), 0.0d, 1, (Object) null);
            if (a2 && !a) {
                C1103e eVar3 = C1103e.f3789a;
                Context context2 = cVar.getContext();
                C3370k.m12223a((Object) context2, "context");
                rgb = C1103e.m5515a(eVar3, context2, (Integer) null, (Integer) 16842806, (C3349a) null, 10, (Object) null);
            } else if (!a2 && a) {
                C1103e eVar4 = C1103e.f3789a;
                Context context3 = cVar.getContext();
                C3370k.m12223a((Object) context3, "context");
                rgb = C1103e.m5515a(eVar4, context3, (Integer) null, (Integer) 16842809, (C3349a) null, 10, (Object) null);
            }
            C1057a.m5382a(cVar, C1055m.POSITIVE).mo6107a(rgb);
            C1057a.m5382a(cVar, C1055m.NEGATIVE).mo6107a(rgb);
        }
    }

    /* renamed from: d */
    private static final DotsIndicator m5441d(C1041c cVar) {
        return (DotsIndicator) cVar.findViewById(C1078j.colorChooserPagerDots);
    }

    /* renamed from: e */
    private static final ViewPager m5442e(C1041c cVar) {
        return (ViewPager) cVar.findViewById(C1078j.colorChooserPager);
    }
}
