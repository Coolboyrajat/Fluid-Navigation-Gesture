package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0069a;
import androidx.appcompat.view.menu.C0081g;
import androidx.appcompat.view.menu.C0097n;
import androidx.appcompat.widget.Toolbar;
import p006b.p007a.C0654a;
import p006b.p007a.C0658e;
import p006b.p007a.C0659f;
import p006b.p007a.C0661h;
import p006b.p007a.C0663j;
import p006b.p007a.p008k.p009a.C0664a;
import p006b.p026g.p035k.C0840a0;
import p006b.p026g.p035k.C0844b0;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.C0902z;

/* renamed from: androidx.appcompat.widget.s0 */
public class C0230s0 implements C0247y {

    /* renamed from: a */
    Toolbar f1095a;

    /* renamed from: b */
    private int f1096b;

    /* renamed from: c */
    private View f1097c;

    /* renamed from: d */
    private View f1098d;

    /* renamed from: e */
    private Drawable f1099e;

    /* renamed from: f */
    private Drawable f1100f;

    /* renamed from: g */
    private Drawable f1101g;

    /* renamed from: h */
    private boolean f1102h;

    /* renamed from: i */
    CharSequence f1103i;

    /* renamed from: j */
    private CharSequence f1104j;

    /* renamed from: k */
    private CharSequence f1105k;

    /* renamed from: l */
    Window.Callback f1106l;

    /* renamed from: m */
    boolean f1107m;

    /* renamed from: n */
    private C0156c f1108n;

    /* renamed from: o */
    private int f1109o;

    /* renamed from: p */
    private int f1110p;

    /* renamed from: q */
    private Drawable f1111q;

    /* renamed from: androidx.appcompat.widget.s0$a */
    class C0231a implements View.OnClickListener {

        /* renamed from: f */
        final C0069a f1112f = new C0069a(C0230s0.this.f1095a.getContext(), 0, 16908332, 0, 0, C0230s0.this.f1103i);

        C0231a() {
        }

        public void onClick(View view) {
            C0230s0 s0Var = C0230s0.this;
            Window.Callback callback = s0Var.f1106l;
            if (callback != null && s0Var.f1107m) {
                callback.onMenuItemSelected(0, this.f1112f);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.s0$b */
    class C0232b extends C0844b0 {

        /* renamed from: a */
        private boolean f1114a = false;

        /* renamed from: b */
        final /* synthetic */ int f1115b;

        C0232b(int i) {
            this.f1115b = i;
        }

        /* renamed from: a */
        public void mo210a(View view) {
            if (!this.f1114a) {
                C0230s0.this.f1095a.setVisibility(this.f1115b);
            }
        }

        /* renamed from: b */
        public void mo211b(View view) {
            C0230s0.this.f1095a.setVisibility(0);
        }

        /* renamed from: c */
        public void mo1191c(View view) {
            this.f1114a = true;
        }
    }

    public C0230s0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0661h.abc_action_bar_up_description, C0658e.abc_ic_ab_back_material);
    }

    public C0230s0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1109o = 0;
        this.f1110p = 0;
        this.f1095a = toolbar;
        this.f1103i = toolbar.getTitle();
        this.f1104j = toolbar.getSubtitle();
        this.f1102h = this.f1103i != null;
        this.f1101g = toolbar.getNavigationIcon();
        C0217r0 a = C0217r0.m1054a(toolbar.getContext(), (AttributeSet) null, C0663j.ActionBar, C0654a.actionBarStyle, 0);
        this.f1111q = a.mo1535b(C0663j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e = a.mo1541e(C0663j.ActionBar_title);
            if (!TextUtils.isEmpty(e)) {
                mo1624c(e);
            }
            CharSequence e2 = a.mo1541e(C0663j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e2)) {
                mo1620b(e2);
            }
            Drawable b = a.mo1535b(C0663j.ActionBar_logo);
            if (b != null) {
                mo1612a(b);
            }
            Drawable b2 = a.mo1535b(C0663j.ActionBar_icon);
            if (b2 != null) {
                setIcon(b2);
            }
            if (this.f1101g == null && (drawable = this.f1111q) != null) {
                mo1619b(drawable);
            }
            mo1623c(a.mo1538d(C0663j.ActionBar_displayOptions, 0));
            int g = a.mo1544g(C0663j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                mo1614a(LayoutInflater.from(this.f1095a.getContext()).inflate(g, this.f1095a, false));
                mo1623c(this.f1096b | 16);
            }
            int f = a.mo1542f(C0663j.ActionBar_height, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1095a.getLayoutParams();
                layoutParams.height = f;
                this.f1095a.setLayoutParams(layoutParams);
            }
            int b3 = a.mo1534b(C0663j.ActionBar_contentInsetStart, -1);
            int b4 = a.mo1534b(C0663j.ActionBar_contentInsetEnd, -1);
            if (b3 >= 0 || b4 >= 0) {
                this.f1095a.mo1077a(Math.max(b3, 0), Math.max(b4, 0));
            }
            int g2 = a.mo1544g(C0663j.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                Toolbar toolbar2 = this.f1095a;
                toolbar2.mo1080b(toolbar2.getContext(), g2);
            }
            int g3 = a.mo1544g(C0663j.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar3 = this.f1095a;
                toolbar3.mo1078a(toolbar3.getContext(), g3);
            }
            int g4 = a.mo1544g(C0663j.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.f1095a.setPopupTheme(g4);
            }
        } else {
            this.f1096b = m1112o();
        }
        a.mo1531a();
        mo1627d(i);
        this.f1105k = this.f1095a.getNavigationContentDescription();
        this.f1095a.setNavigationOnClickListener(new C0231a());
    }

    /* renamed from: d */
    private void m1111d(CharSequence charSequence) {
        this.f1103i = charSequence;
        if ((this.f1096b & 8) != 0) {
            this.f1095a.setTitle(charSequence);
        }
    }

    /* renamed from: o */
    private int m1112o() {
        if (this.f1095a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1111q = this.f1095a.getNavigationIcon();
        return 15;
    }

    /* renamed from: p */
    private void m1113p() {
        if ((this.f1096b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1105k)) {
            this.f1095a.setNavigationContentDescription(this.f1110p);
        } else {
            this.f1095a.setNavigationContentDescription(this.f1105k);
        }
    }

    /* renamed from: q */
    private void m1114q() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f1096b & 4) != 0) {
            toolbar = this.f1095a;
            drawable = this.f1101g;
            if (drawable == null) {
                drawable = this.f1111q;
            }
        } else {
            toolbar = this.f1095a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: r */
    private void m1115r() {
        Drawable drawable;
        int i = this.f1096b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f1100f) == null) {
            drawable = this.f1099e;
        }
        this.f1095a.setLogo(drawable);
    }

    /* renamed from: a */
    public Context mo1609a() {
        return this.f1095a.getContext();
    }

    /* renamed from: a */
    public C0902z mo1610a(int i, long j) {
        C0902z a = C0890v.m4742a(this.f1095a);
        a.mo4694a(i == 0 ? 1.0f : 0.0f);
        a.mo4695a(j);
        a.mo4697a((C0840a0) new C0232b(i));
        return a;
    }

    /* renamed from: a */
    public void mo1611a(int i) {
        this.f1095a.setVisibility(i);
    }

    /* renamed from: a */
    public void mo1612a(Drawable drawable) {
        this.f1100f = drawable;
        m1115r();
    }

    /* renamed from: a */
    public void mo1613a(Menu menu, C0097n.C0098a aVar) {
        if (this.f1108n == null) {
            this.f1108n = new C0156c(this.f1095a.getContext());
            this.f1108n.mo385a(C0659f.action_menu_presenter);
        }
        this.f1108n.mo390a(aVar);
        this.f1095a.mo1079a((C0081g) menu, this.f1108n);
    }

    /* renamed from: a */
    public void mo1614a(View view) {
        View view2 = this.f1098d;
        if (!(view2 == null || (this.f1096b & 16) == 0)) {
            this.f1095a.removeView(view2);
        }
        this.f1098d = view;
        if (view != null && (this.f1096b & 16) != 0) {
            this.f1095a.addView(this.f1098d);
        }
    }

    /* renamed from: a */
    public void mo1615a(C0198k0 k0Var) {
        Toolbar toolbar;
        View view = this.f1097c;
        if (view != null && view.getParent() == (toolbar = this.f1095a)) {
            toolbar.removeView(this.f1097c);
        }
        this.f1097c = k0Var;
        if (k0Var != null && this.f1109o == 2) {
            this.f1095a.addView(this.f1097c, 0);
            Toolbar.C0143e eVar = (Toolbar.C0143e) this.f1097c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f141a = 8388691;
            k0Var.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public void mo1616a(CharSequence charSequence) {
        this.f1105k = charSequence;
        m1113p();
    }

    /* renamed from: a */
    public void mo1617a(boolean z) {
    }

    /* renamed from: b */
    public void mo1618b(int i) {
        mo1612a(i != 0 ? C0664a.m3682c(mo1609a(), i) : null);
    }

    /* renamed from: b */
    public void mo1619b(Drawable drawable) {
        this.f1101g = drawable;
        m1114q();
    }

    /* renamed from: b */
    public void mo1620b(CharSequence charSequence) {
        this.f1104j = charSequence;
        if ((this.f1096b & 8) != 0) {
            this.f1095a.setSubtitle(charSequence);
        }
    }

    /* renamed from: b */
    public void mo1621b(boolean z) {
        this.f1095a.setCollapsible(z);
    }

    /* renamed from: b */
    public boolean mo1622b() {
        return this.f1095a.mo1121h();
    }

    /* renamed from: c */
    public void mo1623c(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1096b ^ i;
        this.f1096b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1113p();
                }
                m1114q();
            }
            if ((i2 & 3) != 0) {
                m1115r();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1095a.setTitle(this.f1103i);
                    toolbar = this.f1095a;
                    charSequence = this.f1104j;
                } else {
                    charSequence = null;
                    this.f1095a.setTitle((CharSequence) null);
                    toolbar = this.f1095a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.f1098d) != null) {
                if ((i & 16) != 0) {
                    this.f1095a.addView(view);
                } else {
                    this.f1095a.removeView(view);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo1624c(CharSequence charSequence) {
        this.f1102h = true;
        m1111d(charSequence);
    }

    /* renamed from: c */
    public boolean mo1625c() {
        return this.f1095a.mo1122i();
    }

    public void collapseActionView() {
        this.f1095a.mo1082c();
    }

    /* renamed from: d */
    public void mo1627d(int i) {
        if (i != this.f1110p) {
            this.f1110p = i;
            if (TextUtils.isEmpty(this.f1095a.getNavigationContentDescription())) {
                mo1629e(this.f1110p);
            }
        }
    }

    /* renamed from: d */
    public boolean mo1628d() {
        return this.f1095a.mo1087g();
    }

    /* renamed from: e */
    public void mo1629e(int i) {
        mo1616a((CharSequence) i == 0 ? null : mo1609a().getString(i));
    }

    /* renamed from: e */
    public boolean mo1630e() {
        return this.f1095a.mo1124k();
    }

    /* renamed from: f */
    public void mo1631f() {
        this.f1107m = true;
    }

    /* renamed from: g */
    public boolean mo1632g() {
        return this.f1095a.mo1081b();
    }

    public CharSequence getTitle() {
        return this.f1095a.getTitle();
    }

    /* renamed from: h */
    public void mo1634h() {
        this.f1095a.mo1084d();
    }

    /* renamed from: i */
    public int mo1635i() {
        return this.f1096b;
    }

    /* renamed from: j */
    public ViewGroup mo1636j() {
        return this.f1095a;
    }

    /* renamed from: k */
    public int mo1637k() {
        return this.f1109o;
    }

    /* renamed from: l */
    public void mo1638l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: m */
    public boolean mo1639m() {
        return this.f1095a.mo1086f();
    }

    /* renamed from: n */
    public void mo1640n() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C0664a.m3682c(mo1609a(), i) : null);
    }

    public void setIcon(Drawable drawable) {
        this.f1099e = drawable;
        m1115r();
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1106l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1102h) {
            m1111d(charSequence);
        }
    }
}
