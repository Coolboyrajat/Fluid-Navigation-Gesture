package p054c.p055a.p056a;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.list.C1599b;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p056a.p057n.C1057a;
import p054c.p055a.p056a.p058o.C1058a;
import p054c.p055a.p056a.p064t.C1096a;
import p054c.p055a.p056a.p065u.C1098a;
import p054c.p055a.p056a.p066v.C1099a;
import p054c.p055a.p056a.p066v.C1100b;
import p054c.p055a.p056a.p066v.C1102d;
import p054c.p055a.p056a.p066v.C1103e;
import p054c.p055a.p056a.p066v.C1107f;

/* renamed from: c.a.a.c */
public final class C1041c extends Dialog {

    /* renamed from: w */
    private static C1039a f3687w = C1045e.f3707a;

    /* renamed from: f */
    private final Map<String, Object> f3688f;

    /* renamed from: g */
    private boolean f3689g;

    /* renamed from: h */
    private Typeface f3690h;

    /* renamed from: i */
    private Typeface f3691i;

    /* renamed from: j */
    private Typeface f3692j;

    /* renamed from: k */
    private boolean f3693k;

    /* renamed from: l */
    private Float f3694l;

    /* renamed from: m */
    private Integer f3695m;

    /* renamed from: n */
    private final DialogLayout f3696n;

    /* renamed from: o */
    private final List<C3350b<C1041c, Unit>> f3697o;

    /* renamed from: p */
    private final List<C3350b<C1041c, Unit>> f3698p;

    /* renamed from: q */
    private final List<C3350b<C1041c, Unit>> f3699q;

    /* renamed from: r */
    private final List<C3350b<C1041c, Unit>> f3700r;

    /* renamed from: s */
    private final List<C3350b<C1041c, Unit>> f3701s;

    /* renamed from: t */
    private final List<C3350b<C1041c, Unit>> f3702t;

    /* renamed from: u */
    private final Context f3703u;

    /* renamed from: v */
    private final C1039a f3704v;

    /* renamed from: c.a.a.c$a */
    public static final class C1042a {
        private C1042a() {
        }

        public /* synthetic */ C1042a(C3366g gVar) {
            this();
        }
    }

    /* renamed from: c.a.a.c$b */
    static final class C1043b extends C3371l implements C3349a<Integer> {

        /* renamed from: g */
        final /* synthetic */ C1041c f3705g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1043b(C1041c cVar) {
            super(0);
            this.f3705g = cVar;
        }

        public final int invoke() {
            return C1099a.m5502a(this.f3705g, (Integer) null, Integer.valueOf(C1048f.colorBackgroundFloating), (C3349a) null, 5, (Object) null);
        }
    }

    static {
        new C1042a((C3366g) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1041c(Context context, C1039a aVar) {
        super(context, C1054l.m5378a(context, aVar));
        C3370k.m12227b(context, "windowContext");
        C3370k.m12227b(aVar, "dialogBehavior");
        this.f3703u = context;
        this.f3704v = aVar;
        this.f3688f = new LinkedHashMap();
        this.f3689g = true;
        this.f3693k = true;
        this.f3697o = new ArrayList();
        this.f3698p = new ArrayList();
        this.f3699q = new ArrayList();
        new ArrayList();
        this.f3700r = new ArrayList();
        this.f3701s = new ArrayList();
        this.f3702t = new ArrayList();
        LayoutInflater from = LayoutInflater.from(this.f3703u);
        C1039a aVar2 = this.f3704v;
        Context context2 = this.f3703u;
        Window window = getWindow();
        if (window != null) {
            C3370k.m12223a((Object) window, "window!!");
            C3370k.m12223a((Object) from, "layoutInflater");
            ViewGroup a = aVar2.mo5095a(context2, window, from, this);
            setContentView(a);
            DialogLayout a2 = this.f3704v.mo5096a(a);
            a2.mo6142a(this);
            this.f3696n = a2;
            this.f3690h = C1102d.m5513a(this, (Integer) null, Integer.valueOf(C1048f.md_font_title), 1, (Object) null);
            this.f3691i = C1102d.m5513a(this, (Integer) null, Integer.valueOf(C1048f.md_font_body), 1, (Object) null);
            this.f3692j = C1102d.m5513a(this, (Integer) null, Integer.valueOf(C1048f.md_font_button), 1, (Object) null);
            m5353k();
            return;
        }
        C3370k.m12221a();
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1041c(Context context, C1039a aVar, int i, C3366g gVar) {
        this(context, (i & 2) != 0 ? f3687w : aVar);
    }

    /* renamed from: a */
    public static /* synthetic */ C1041c m5349a(C1041c cVar, Integer num, CharSequence charSequence, C3350b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            charSequence = null;
        }
        if ((i & 4) != 0) {
            bVar = null;
        }
        cVar.mo5102a(num, charSequence, bVar);
        return cVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C1041c m5350a(C1041c cVar, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        cVar.mo5103a(num, num2);
        return cVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C1041c m5351a(C1041c cVar, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        cVar.mo5104a(num, str);
        return cVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C1041c m5352b(C1041c cVar, Integer num, CharSequence charSequence, C3350b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            charSequence = null;
        }
        if ((i & 4) != 0) {
            bVar = null;
        }
        cVar.mo5109b(num, charSequence, bVar);
        return cVar;
    }

    /* renamed from: k */
    private final void m5353k() {
        int a = C1099a.m5502a(this, (Integer) null, Integer.valueOf(C1048f.md_background_color), new C1043b(this), 1, (Object) null);
        Float f = this.f3694l;
        float floatValue = f != null ? f.floatValue() : C1103e.m5514a(C1103e.f3789a, this.f3703u, C1048f.md_corner_radius, 0.0f, 4, (Object) null);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        this.f3704v.mo5099a(this.f3696n, a, floatValue);
    }

    /* renamed from: l */
    private final void m5354l() {
        C1039a aVar = this.f3704v;
        Context context = this.f3703u;
        Integer num = this.f3695m;
        Window window = getWindow();
        if (window != null) {
            C3370k.m12223a((Object) window, "window!!");
            aVar.mo5097a(context, window, this.f3696n, num);
            return;
        }
        C3370k.m12221a();
        throw null;
    }

    /* renamed from: a */
    public final C1041c mo5102a(Integer num, CharSequence charSequence, C3350b<? super C1098a, Unit> bVar) {
        C1103e.f3789a.mo5174a("message", (Object) charSequence, num);
        this.f3696n.getContentLayout().mo6190a(this, num, charSequence, this.f3691i, bVar);
        return this;
    }

    /* renamed from: a */
    public final C1041c mo5103a(Integer num, Integer num2) {
        C1103e.f3789a.mo5174a("maxWidth", (Object) num, num2);
        Integer num3 = this.f3695m;
        boolean z = (num3 == null || num3 == null || num3.intValue() != 0) ? false : true;
        if (num != null) {
            num2 = Integer.valueOf(this.f3703u.getResources().getDimensionPixelSize(num.intValue()));
        } else if (num2 == null) {
            C3370k.m12221a();
            throw null;
        }
        this.f3695m = num2;
        if (z) {
            m5354l();
        }
        return this;
    }

    /* renamed from: a */
    public final C1041c mo5104a(Integer num, String str) {
        C1103e.f3789a.mo5174a("title", (Object) str, num);
        C1100b.m5507a(this, this.f3696n.getTitleLayout().getTitleView$com_afollestad_material_dialogs_core(), num, str, 0, this.f3690h, Integer.valueOf(C1048f.md_color_title), 8, (Object) null);
        return this;
    }

    /* renamed from: a */
    public final <T> T mo5105a(String str) {
        C3370k.m12227b(str, "key");
        return this.f3688f.get(str);
    }

    /* renamed from: a */
    public final void mo5106a(C1055m mVar) {
        List<C3350b<C1041c, Unit>> list;
        C3370k.m12227b(mVar, "which");
        int i = C1044d.f3706a[mVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                list = this.f3701s;
            } else if (i == 3) {
                list = this.f3702t;
            }
            C1058a.m5387a(list, this);
        } else {
            C1058a.m5387a(this.f3700r, this);
            RecyclerView.C0527g<?> b = C1096a.m5495b(this);
            if (!(b instanceof C1599b)) {
                b = null;
            }
            C1599b bVar = (C1599b) b;
            if (bVar != null) {
                bVar.mo6128a();
            }
        }
        if (this.f3689g) {
            dismiss();
        }
    }

    /* renamed from: a */
    public final boolean mo5107a() {
        return this.f3689g;
    }

    /* renamed from: b */
    public final Typeface mo5108b() {
        return this.f3691i;
    }

    /* renamed from: b */
    public final C1041c mo5109b(Integer num, CharSequence charSequence, C3350b<? super C1041c, Unit> bVar) {
        if (bVar != null) {
            this.f3700r.add(bVar);
        }
        DialogActionButton a = C1057a.m5382a(this, C1055m.POSITIVE);
        if (num == null && charSequence == null && C1107f.m5547c(a)) {
            return this;
        }
        C1100b.m5506a(this, a, num, charSequence, 17039370, this.f3692j, Integer.valueOf(C1048f.md_color_button_text));
        return this;
    }

    /* renamed from: c */
    public final boolean mo5110c() {
        return this.f3693k;
    }

    /* renamed from: d */
    public final Map<String, Object> mo5111d() {
        return this.f3688f;
    }

    public void dismiss() {
        if (!this.f3704v.onDismiss()) {
            C1100b.m5505a(this);
            super.dismiss();
        }
    }

    /* renamed from: e */
    public final List<C3350b<C1041c, Unit>> mo5113e() {
        return this.f3699q;
    }

    /* renamed from: f */
    public final List<C3350b<C1041c, Unit>> mo5114f() {
        return this.f3697o;
    }

    /* renamed from: g */
    public final List<C3350b<C1041c, Unit>> mo5115g() {
        return this.f3698p;
    }

    /* renamed from: h */
    public final DialogLayout mo5116h() {
        return this.f3696n;
    }

    /* renamed from: i */
    public final Context mo5117i() {
        return this.f3703u;
    }

    /* renamed from: j */
    public final C1041c mo5118j() {
        this.f3689g = false;
        return this;
    }

    public void show() {
        m5354l();
        C1100b.m5509b(this);
        this.f3704v.mo5098a(this);
        super.show();
        this.f3704v.mo5100b(this);
    }
}
