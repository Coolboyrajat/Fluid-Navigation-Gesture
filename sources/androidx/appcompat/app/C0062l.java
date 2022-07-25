package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.C0026a;
import androidx.appcompat.view.menu.C0081g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0198k0;
import androidx.appcompat.widget.C0247y;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p006b.p007a.C0654a;
import p006b.p007a.C0659f;
import p006b.p007a.C0663j;
import p006b.p007a.p014o.C0684a;
import p006b.p007a.p014o.C0685b;
import p006b.p007a.p014o.C0692g;
import p006b.p007a.p014o.C0695h;
import p006b.p026g.p035k.C0840a0;
import p006b.p026g.p035k.C0844b0;
import p006b.p026g.p035k.C0850c0;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.C0902z;

/* renamed from: androidx.appcompat.app.l */
public class C0062l extends C0026a implements ActionBarOverlayLayout.C0112d {

    /* renamed from: B */
    private static final Interpolator f270B = new AccelerateInterpolator();

    /* renamed from: C */
    private static final Interpolator f271C = new DecelerateInterpolator();

    /* renamed from: A */
    final C0850c0 f272A = new C0065c();

    /* renamed from: a */
    Context f273a;

    /* renamed from: b */
    private Context f274b;

    /* renamed from: c */
    ActionBarOverlayLayout f275c;

    /* renamed from: d */
    ActionBarContainer f276d;

    /* renamed from: e */
    C0247y f277e;

    /* renamed from: f */
    ActionBarContextView f278f;

    /* renamed from: g */
    View f279g;

    /* renamed from: h */
    C0198k0 f280h;

    /* renamed from: i */
    private boolean f281i;

    /* renamed from: j */
    C0066d f282j;

    /* renamed from: k */
    C0685b f283k;

    /* renamed from: l */
    C0685b.C0686a f284l;

    /* renamed from: m */
    private boolean f285m;

    /* renamed from: n */
    private ArrayList<C0026a.C0028b> f286n = new ArrayList<>();

    /* renamed from: o */
    private boolean f287o;

    /* renamed from: p */
    private int f288p = 0;

    /* renamed from: q */
    boolean f289q = true;

    /* renamed from: r */
    boolean f290r;

    /* renamed from: s */
    boolean f291s;

    /* renamed from: t */
    private boolean f292t;

    /* renamed from: u */
    private boolean f293u = true;

    /* renamed from: v */
    C0695h f294v;

    /* renamed from: w */
    private boolean f295w;

    /* renamed from: x */
    boolean f296x;

    /* renamed from: y */
    final C0840a0 f297y = new C0063a();

    /* renamed from: z */
    final C0840a0 f298z = new C0064b();

    /* renamed from: androidx.appcompat.app.l$a */
    class C0063a extends C0844b0 {
        C0063a() {
        }

        /* renamed from: a */
        public void mo210a(View view) {
            View view2;
            C0062l lVar = C0062l.this;
            if (lVar.f289q && (view2 = lVar.f279g) != null) {
                view2.setTranslationY(0.0f);
                C0062l.this.f276d.setTranslationY(0.0f);
            }
            C0062l.this.f276d.setVisibility(8);
            C0062l.this.f276d.setTransitioning(false);
            C0062l lVar2 = C0062l.this;
            lVar2.f294v = null;
            lVar2.mo271l();
            ActionBarOverlayLayout actionBarOverlayLayout = C0062l.this.f275c;
            if (actionBarOverlayLayout != null) {
                C0890v.m4737H(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.l$b */
    class C0064b extends C0844b0 {
        C0064b() {
        }

        /* renamed from: a */
        public void mo210a(View view) {
            C0062l lVar = C0062l.this;
            lVar.f294v = null;
            lVar.f276d.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.l$c */
    class C0065c implements C0850c0 {
        C0065c() {
        }

        /* renamed from: a */
        public void mo273a(View view) {
            ((View) C0062l.this.f276d.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.l$d */
    public class C0066d extends C0685b implements C0081g.C0082a {

        /* renamed from: h */
        private final Context f302h;

        /* renamed from: i */
        private final C0081g f303i;

        /* renamed from: j */
        private C0685b.C0686a f304j;

        /* renamed from: k */
        private WeakReference<View> f305k;

        public C0066d(Context context, C0685b.C0686a aVar) {
            this.f302h = context;
            this.f304j = aVar;
            C0081g gVar = new C0081g(context);
            gVar.mo477c(1);
            this.f303i = gVar;
            this.f303i.mo453a((C0081g.C0082a) this);
        }

        /* renamed from: a */
        public void mo274a() {
            C0062l lVar = C0062l.this;
            if (lVar.f282j == this) {
                if (!C0062l.m278a(lVar.f290r, lVar.f291s, false)) {
                    C0062l lVar2 = C0062l.this;
                    lVar2.f283k = this;
                    lVar2.f284l = this.f304j;
                } else {
                    this.f304j.mo214a(this);
                }
                this.f304j = null;
                C0062l.this.mo265e(false);
                C0062l.this.f278f.mo729a();
                C0062l.this.f277e.mo1636j().sendAccessibilityEvent(32);
                C0062l lVar3 = C0062l.this;
                lVar3.f275c.setHideOnContentScrollEnabled(lVar3.f296x);
                C0062l.this.f282j = null;
            }
        }

        /* renamed from: a */
        public void mo275a(int i) {
            mo277a((CharSequence) C0062l.this.f273a.getResources().getString(i));
        }

        /* renamed from: a */
        public void mo276a(View view) {
            C0062l.this.f278f.setCustomView(view);
            this.f305k = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo177a(C0081g gVar) {
            if (this.f304j != null) {
                mo286i();
                C0062l.this.f278f.mo733d();
            }
        }

        /* renamed from: a */
        public void mo277a(CharSequence charSequence) {
            C0062l.this.f278f.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public void mo278a(boolean z) {
            super.mo278a(z);
            C0062l.this.f278f.setTitleOptional(z);
        }

        /* renamed from: a */
        public boolean mo180a(C0081g gVar, MenuItem menuItem) {
            C0685b.C0686a aVar = this.f304j;
            if (aVar != null) {
                return aVar.mo216a((C0685b) this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public View mo279b() {
            WeakReference<View> weakReference = this.f305k;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: b */
        public void mo280b(int i) {
            mo281b((CharSequence) C0062l.this.f273a.getResources().getString(i));
        }

        /* renamed from: b */
        public void mo281b(CharSequence charSequence) {
            C0062l.this.f278f.setTitle(charSequence);
        }

        /* renamed from: c */
        public Menu mo282c() {
            return this.f303i;
        }

        /* renamed from: d */
        public MenuInflater mo283d() {
            return new C0692g(this.f302h);
        }

        /* renamed from: e */
        public CharSequence mo284e() {
            return C0062l.this.f278f.getSubtitle();
        }

        /* renamed from: g */
        public CharSequence mo285g() {
            return C0062l.this.f278f.getTitle();
        }

        /* renamed from: i */
        public void mo286i() {
            if (C0062l.this.f282j == this) {
                this.f303i.mo510s();
                try {
                    this.f304j.mo215a((C0685b) this, (Menu) this.f303i);
                } finally {
                    this.f303i.mo507r();
                }
            }
        }

        /* renamed from: j */
        public boolean mo287j() {
            return C0062l.this.f278f.mo731b();
        }

        /* renamed from: k */
        public boolean mo288k() {
            this.f303i.mo510s();
            try {
                return this.f304j.mo217b(this, this.f303i);
            } finally {
                this.f303i.mo507r();
            }
        }
    }

    public C0062l(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        m279b(decorView);
        if (!z) {
            this.f279g = decorView.findViewById(16908290);
        }
    }

    public C0062l(Dialog dialog) {
        new ArrayList();
        m279b(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    private C0247y m277a(View view) {
        if (view instanceof C0247y) {
            return (C0247y) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    static boolean m278a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: b */
    private void m279b(View view) {
        this.f275c = (ActionBarOverlayLayout) view.findViewById(C0659f.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f275c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f277e = m277a(view.findViewById(C0659f.action_bar));
        this.f278f = (ActionBarContextView) view.findViewById(C0659f.action_context_bar);
        this.f276d = (ActionBarContainer) view.findViewById(C0659f.action_bar_container);
        C0247y yVar = this.f277e;
        if (yVar == null || this.f278f == null || this.f276d == null) {
            throw new IllegalStateException(C0062l.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f273a = yVar.mo1609a();
        boolean z = (this.f277e.mo1635i() & 4) != 0;
        if (z) {
            this.f281i = true;
        }
        C0684a a = C0684a.m3766a(this.f273a);
        mo270j(a.mo3887a() || z);
        m280k(a.mo3892f());
        TypedArray obtainStyledAttributes = this.f273a.obtainStyledAttributes((AttributeSet) null, C0663j.ActionBar, C0654a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0663j.ActionBar_hideOnContentScroll, false)) {
            mo269i(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0663j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo258a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: k */
    private void m280k(boolean z) {
        this.f287o = z;
        if (!this.f287o) {
            this.f277e.mo1615a((C0198k0) null);
            this.f276d.setTabContainer(this.f280h);
        } else {
            this.f276d.setTabContainer((C0198k0) null);
            this.f277e.mo1615a(this.f280h);
        }
        boolean z2 = true;
        boolean z3 = mo272m() == 2;
        C0198k0 k0Var = this.f280h;
        if (k0Var != null) {
            if (z3) {
                k0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f275c;
                if (actionBarOverlayLayout != null) {
                    C0890v.m4737H(actionBarOverlayLayout);
                }
            } else {
                k0Var.setVisibility(8);
            }
        }
        this.f277e.mo1621b(!this.f287o && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f275c;
        if (this.f287o || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: l */
    private void m281l(boolean z) {
        if (m278a(this.f290r, this.f291s, this.f292t)) {
            if (!this.f293u) {
                this.f293u = true;
                mo267g(z);
            }
        } else if (this.f293u) {
            this.f293u = false;
            mo266f(z);
        }
    }

    /* renamed from: n */
    private void m282n() {
        if (this.f292t) {
            this.f292t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f275c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m281l(false);
        }
    }

    /* renamed from: o */
    private boolean m283o() {
        return C0890v.m4732C(this.f276d);
    }

    /* renamed from: p */
    private void m284p() {
        if (!this.f292t) {
            this.f292t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f275c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m281l(false);
        }
    }

    /* renamed from: a */
    public C0685b mo74a(C0685b.C0686a aVar) {
        C0066d dVar = this.f282j;
        if (dVar != null) {
            dVar.mo274a();
        }
        this.f275c.setHideOnContentScrollEnabled(false);
        this.f278f.mo732c();
        C0066d dVar2 = new C0066d(this.f278f.getContext(), aVar);
        if (!dVar2.mo288k()) {
            return null;
        }
        this.f282j = dVar2;
        dVar2.mo286i();
        this.f278f.mo730a(dVar2);
        mo265e(true);
        this.f278f.sendAccessibilityEvent(32);
        return dVar2;
    }

    /* renamed from: a */
    public void mo257a() {
        if (this.f291s) {
            this.f291s = false;
            m281l(true);
        }
    }

    /* renamed from: a */
    public void mo258a(float f) {
        C0890v.m4744a((View) this.f276d, f);
    }

    /* renamed from: a */
    public void mo259a(int i) {
        this.f288p = i;
    }

    /* renamed from: a */
    public void mo260a(int i, int i2) {
        int i3 = this.f277e.mo1635i();
        if ((i2 & 4) != 0) {
            this.f281i = true;
        }
        this.f277e.mo1623c((i & i2) | ((~i2) & i3));
    }

    /* renamed from: a */
    public void mo75a(Configuration configuration) {
        m280k(C0684a.m3766a(this.f273a).mo3892f());
    }

    /* renamed from: a */
    public void mo76a(CharSequence charSequence) {
        this.f277e.setWindowTitle(charSequence);
    }

    /* renamed from: a */
    public void mo261a(boolean z) {
        this.f289q = z;
    }

    /* renamed from: a */
    public boolean mo77a(int i, KeyEvent keyEvent) {
        Menu c;
        C0066d dVar = this.f282j;
        if (dVar == null || (c = dVar.mo282c()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        c.setQwertyMode(z);
        return c.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: b */
    public void mo262b() {
        C0695h hVar = this.f294v;
        if (hVar != null) {
            hVar.mo3937a();
            this.f294v = null;
        }
    }

    /* renamed from: b */
    public void mo79b(boolean z) {
        if (z != this.f285m) {
            this.f285m = z;
            int size = this.f286n.size();
            for (int i = 0; i < size; i++) {
                this.f286n.get(i).mo89a(z);
            }
        }
    }

    /* renamed from: c */
    public void mo263c() {
        if (!this.f291s) {
            this.f291s = true;
            m281l(true);
        }
    }

    /* renamed from: c */
    public void mo80c(boolean z) {
        if (!this.f281i) {
            mo268h(z);
        }
    }

    /* renamed from: d */
    public void mo264d() {
    }

    /* renamed from: d */
    public void mo81d(boolean z) {
        C0695h hVar;
        this.f295w = z;
        if (!z && (hVar = this.f294v) != null) {
            hVar.mo3937a();
        }
    }

    /* renamed from: e */
    public void mo265e(boolean z) {
        C0902z zVar;
        C0902z zVar2;
        if (z) {
            m284p();
        } else {
            m282n();
        }
        if (m283o()) {
            if (z) {
                zVar = this.f277e.mo1610a(4, 100);
                zVar2 = this.f278f.mo1186a(0, 200);
            } else {
                zVar2 = this.f277e.mo1610a(0, 200);
                zVar = this.f278f.mo1186a(8, 100);
            }
            C0695h hVar = new C0695h();
            hVar.mo3936a(zVar, zVar2);
            hVar.mo3939c();
        } else if (z) {
            this.f277e.mo1611a(4);
            this.f278f.setVisibility(0);
        } else {
            this.f277e.mo1611a(0);
            this.f278f.setVisibility(8);
        }
    }

    /* renamed from: f */
    public void mo266f(boolean z) {
        View view;
        C0695h hVar = this.f294v;
        if (hVar != null) {
            hVar.mo3937a();
        }
        if (this.f288p != 0 || (!this.f295w && !z)) {
            this.f297y.mo210a((View) null);
            return;
        }
        this.f276d.setAlpha(1.0f);
        this.f276d.setTransitioning(true);
        C0695h hVar2 = new C0695h();
        float f = (float) (-this.f276d.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f276d.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0902z a = C0890v.m4742a(this.f276d);
        a.mo4701b(f);
        a.mo4698a(this.f272A);
        hVar2.mo3935a(a);
        if (this.f289q && (view = this.f279g) != null) {
            C0902z a2 = C0890v.m4742a(view);
            a2.mo4701b(f);
            hVar2.mo3935a(a2);
        }
        hVar2.mo3933a(f270B);
        hVar2.mo3932a(250);
        hVar2.mo3934a(this.f297y);
        this.f294v = hVar2;
        hVar2.mo3939c();
    }

    /* renamed from: f */
    public boolean mo83f() {
        C0247y yVar = this.f277e;
        if (yVar == null || !yVar.mo1639m()) {
            return false;
        }
        this.f277e.collapseActionView();
        return true;
    }

    /* renamed from: g */
    public int mo84g() {
        return this.f277e.mo1635i();
    }

    /* renamed from: g */
    public void mo267g(boolean z) {
        View view;
        View view2;
        C0695h hVar = this.f294v;
        if (hVar != null) {
            hVar.mo3937a();
        }
        this.f276d.setVisibility(0);
        if (this.f288p != 0 || (!this.f295w && !z)) {
            this.f276d.setAlpha(1.0f);
            this.f276d.setTranslationY(0.0f);
            if (this.f289q && (view = this.f279g) != null) {
                view.setTranslationY(0.0f);
            }
            this.f298z.mo210a((View) null);
        } else {
            this.f276d.setTranslationY(0.0f);
            float f = (float) (-this.f276d.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f276d.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f276d.setTranslationY(f);
            C0695h hVar2 = new C0695h();
            C0902z a = C0890v.m4742a(this.f276d);
            a.mo4701b(0.0f);
            a.mo4698a(this.f272A);
            hVar2.mo3935a(a);
            if (this.f289q && (view2 = this.f279g) != null) {
                view2.setTranslationY(f);
                C0902z a2 = C0890v.m4742a(this.f279g);
                a2.mo4701b(0.0f);
                hVar2.mo3935a(a2);
            }
            hVar2.mo3933a(f271C);
            hVar2.mo3932a(250);
            hVar2.mo3934a(this.f298z);
            this.f294v = hVar2;
            hVar2.mo3939c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f275c;
        if (actionBarOverlayLayout != null) {
            C0890v.m4737H(actionBarOverlayLayout);
        }
    }

    /* renamed from: h */
    public Context mo85h() {
        if (this.f274b == null) {
            TypedValue typedValue = new TypedValue();
            this.f273a.getTheme().resolveAttribute(C0654a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f274b = new ContextThemeWrapper(this.f273a, i);
            } else {
                this.f274b = this.f273a;
            }
        }
        return this.f274b;
    }

    /* renamed from: h */
    public void mo268h(boolean z) {
        mo260a(z ? 4 : 0, 4);
    }

    /* renamed from: i */
    public void mo269i(boolean z) {
        if (!z || this.f275c.mo777i()) {
            this.f296x = z;
            this.f275c.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: j */
    public void mo270j(boolean z) {
        this.f277e.mo1617a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo271l() {
        C0685b.C0686a aVar = this.f284l;
        if (aVar != null) {
            aVar.mo214a(this.f283k);
            this.f283k = null;
            this.f284l = null;
        }
    }

    /* renamed from: m */
    public int mo272m() {
        return this.f277e.mo1637k();
    }
}
