package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0097n;
import androidx.appcompat.widget.C0182g0;
import p006b.p007a.C0657d;
import p006b.p007a.C0660g;
import p006b.p026g.p035k.C0890v;

/* renamed from: androidx.appcompat.view.menu.r */
final class C0103r extends C0094l implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, C0097n, View.OnKeyListener {

    /* renamed from: A */
    private static final int f511A = C0660g.abc_popup_menu_item_layout;

    /* renamed from: g */
    private final Context f512g;

    /* renamed from: h */
    private final C0081g f513h;

    /* renamed from: i */
    private final C0080f f514i;

    /* renamed from: j */
    private final boolean f515j;

    /* renamed from: k */
    private final int f516k;

    /* renamed from: l */
    private final int f517l;

    /* renamed from: m */
    private final int f518m;

    /* renamed from: n */
    final C0182g0 f519n;

    /* renamed from: o */
    final ViewTreeObserver.OnGlobalLayoutListener f520o = new C0104a();

    /* renamed from: p */
    private final View.OnAttachStateChangeListener f521p = new C0105b();

    /* renamed from: q */
    private PopupWindow.OnDismissListener f522q;

    /* renamed from: r */
    private View f523r;

    /* renamed from: s */
    View f524s;

    /* renamed from: t */
    private C0097n.C0098a f525t;

    /* renamed from: u */
    ViewTreeObserver f526u;

    /* renamed from: v */
    private boolean f527v;

    /* renamed from: w */
    private boolean f528w;

    /* renamed from: x */
    private int f529x;

    /* renamed from: y */
    private int f530y = 0;

    /* renamed from: z */
    private boolean f531z;

    /* renamed from: androidx.appcompat.view.menu.r$a */
    class C0104a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0104a() {
        }

        public void onGlobalLayout() {
            if (C0103r.this.mo413c() && !C0103r.this.f519n.mo1321l()) {
                View view = C0103r.this.f524s;
                if (view == null || !view.isShown()) {
                    C0103r.this.dismiss();
                } else {
                    C0103r.this.f519n.mo403a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.r$b */
    class C0105b implements View.OnAttachStateChangeListener {
        C0105b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0103r.this.f526u;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0103r.this.f526u = view.getViewTreeObserver();
                }
                C0103r rVar = C0103r.this;
                rVar.f526u.removeGlobalOnLayoutListener(rVar.f520o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0103r(Context context, C0081g gVar, View view, int i, int i2, boolean z) {
        this.f512g = context;
        this.f513h = gVar;
        this.f515j = z;
        this.f514i = new C0080f(gVar, LayoutInflater.from(context), this.f515j, f511A);
        this.f517l = i;
        this.f518m = i2;
        Resources resources = context.getResources();
        this.f516k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0657d.abc_config_prefDialogWidth));
        this.f523r = view;
        this.f519n = new C0182g0(this.f512g, (AttributeSet) null, this.f517l, this.f518m);
        gVar.mo455a((C0097n) this, context);
    }

    /* renamed from: f */
    private boolean m563f() {
        View view;
        if (mo413c()) {
            return true;
        }
        if (this.f527v || (view = this.f523r) == null) {
            return false;
        }
        this.f524s = view;
        this.f519n.mo1303a((PopupWindow.OnDismissListener) this);
        this.f519n.mo1301a((AdapterView.OnItemClickListener) this);
        this.f519n.mo1304a(true);
        View view2 = this.f524s;
        boolean z = this.f526u == null;
        this.f526u = view2.getViewTreeObserver();
        if (z) {
            this.f526u.addOnGlobalLayoutListener(this.f520o);
        }
        view2.addOnAttachStateChangeListener(this.f521p);
        this.f519n.mo1300a(view2);
        this.f519n.mo1312f(this.f530y);
        if (!this.f528w) {
            this.f529x = C0094l.m516a(this.f514i, (ViewGroup) null, this.f512g, this.f516k);
            this.f528w = true;
        }
        this.f519n.mo1311e(this.f529x);
        this.f519n.mo1313g(2);
        this.f519n.mo1298a(mo649e());
        this.f519n.mo403a();
        ListView g = this.f519n.mo416g();
        g.setOnKeyListener(this);
        if (this.f531z && this.f513h.mo493h() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f512g).inflate(C0660g.abc_popup_menu_header_item_layout, g, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f513h.mo493h());
            }
            frameLayout.setEnabled(false);
            g.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f519n.mo1302a((ListAdapter) this.f514i);
        this.f519n.mo403a();
        return true;
    }

    /* renamed from: a */
    public void mo403a() {
        if (!m563f()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: a */
    public void mo404a(int i) {
        this.f530y = i;
    }

    /* renamed from: a */
    public void mo405a(View view) {
        this.f523r = view;
    }

    /* renamed from: a */
    public void mo406a(PopupWindow.OnDismissListener onDismissListener) {
        this.f522q = onDismissListener;
    }

    /* renamed from: a */
    public void mo407a(C0081g gVar) {
    }

    /* renamed from: a */
    public void mo388a(C0081g gVar, boolean z) {
        if (gVar == this.f513h) {
            dismiss();
            C0097n.C0098a aVar = this.f525t;
            if (aVar != null) {
                aVar.mo212a(gVar, z);
            }
        }
    }

    /* renamed from: a */
    public void mo390a(C0097n.C0098a aVar) {
        this.f525t = aVar;
    }

    /* renamed from: a */
    public void mo391a(boolean z) {
        this.f528w = false;
        C0080f fVar = this.f514i;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo395a(C0106s sVar) {
        if (sVar.hasVisibleItems()) {
            C0095m mVar = new C0095m(this.f512g, sVar, this.f524s, this.f515j, this.f517l, this.f518m);
            mVar.mo655a(this.f525t);
            mVar.mo656a(C0094l.m518b((C0081g) sVar));
            mVar.mo654a(this.f522q);
            this.f522q = null;
            this.f513h.mo457a(false);
            int b = this.f519n.mo1305b();
            int d = this.f519n.mo1308d();
            if ((Gravity.getAbsoluteGravity(this.f530y, C0890v.m4791o(this.f523r)) & 7) == 5) {
                b += this.f523r.getWidth();
            }
            if (mVar.mo657a(b, d)) {
                C0097n.C0098a aVar = this.f525t;
                if (aVar == null) {
                    return true;
                }
                aVar.mo213a(sVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo408b(int i) {
        this.f519n.mo1297a(i);
    }

    /* renamed from: b */
    public void mo409b(boolean z) {
        this.f514i.mo436a(z);
    }

    /* renamed from: b */
    public boolean mo410b() {
        return false;
    }

    /* renamed from: c */
    public void mo411c(int i) {
        this.f519n.mo1306b(i);
    }

    /* renamed from: c */
    public void mo412c(boolean z) {
        this.f531z = z;
    }

    /* renamed from: c */
    public boolean mo413c() {
        return !this.f527v && this.f519n.mo413c();
    }

    public void dismiss() {
        if (mo413c()) {
            this.f519n.dismiss();
        }
    }

    /* renamed from: g */
    public ListView mo416g() {
        return this.f519n.mo416g();
    }

    public void onDismiss() {
        this.f527v = true;
        this.f513h.close();
        ViewTreeObserver viewTreeObserver = this.f526u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f526u = this.f524s.getViewTreeObserver();
            }
            this.f526u.removeGlobalOnLayoutListener(this.f520o);
            this.f526u = null;
        }
        this.f524s.removeOnAttachStateChangeListener(this.f521p);
        PopupWindow.OnDismissListener onDismissListener = this.f522q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
