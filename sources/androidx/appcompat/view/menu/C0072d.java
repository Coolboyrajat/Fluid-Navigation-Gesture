package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0097n;
import androidx.appcompat.widget.C0180f0;
import androidx.appcompat.widget.C0182g0;
import java.util.ArrayList;
import java.util.List;
import p006b.p007a.C0657d;
import p006b.p007a.C0660g;
import p006b.p026g.p035k.C0851d;
import p006b.p026g.p035k.C0890v;

/* renamed from: androidx.appcompat.view.menu.d */
final class C0072d extends C0094l implements C0097n, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: G */
    private static final int f369G = C0660g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private boolean f370A;

    /* renamed from: B */
    private boolean f371B;

    /* renamed from: C */
    private C0097n.C0098a f372C;

    /* renamed from: D */
    ViewTreeObserver f373D;

    /* renamed from: E */
    private PopupWindow.OnDismissListener f374E;

    /* renamed from: F */
    boolean f375F;

    /* renamed from: g */
    private final Context f376g;

    /* renamed from: h */
    private final int f377h;

    /* renamed from: i */
    private final int f378i;

    /* renamed from: j */
    private final int f379j;

    /* renamed from: k */
    private final boolean f380k;

    /* renamed from: l */
    final Handler f381l;

    /* renamed from: m */
    private final List<C0081g> f382m = new ArrayList();

    /* renamed from: n */
    final List<C0077d> f383n = new ArrayList();

    /* renamed from: o */
    final ViewTreeObserver.OnGlobalLayoutListener f384o = new C0073a();

    /* renamed from: p */
    private final View.OnAttachStateChangeListener f385p = new C0074b();

    /* renamed from: q */
    private final C0180f0 f386q = new C0075c();

    /* renamed from: r */
    private int f387r = 0;

    /* renamed from: s */
    private int f388s = 0;

    /* renamed from: t */
    private View f389t;

    /* renamed from: u */
    View f390u;

    /* renamed from: v */
    private int f391v;

    /* renamed from: w */
    private boolean f392w;

    /* renamed from: x */
    private boolean f393x;

    /* renamed from: y */
    private int f394y;

    /* renamed from: z */
    private int f395z;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    class C0073a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0073a() {
        }

        public void onGlobalLayout() {
            if (C0072d.this.mo413c() && C0072d.this.f383n.size() > 0 && !C0072d.this.f383n.get(0).f403a.mo1321l()) {
                View view = C0072d.this.f390u;
                if (view == null || !view.isShown()) {
                    C0072d.this.dismiss();
                    return;
                }
                for (C0077d dVar : C0072d.this.f383n) {
                    dVar.f403a.mo403a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    class C0074b implements View.OnAttachStateChangeListener {
        C0074b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0072d.this.f373D;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0072d.this.f373D = view.getViewTreeObserver();
                }
                C0072d dVar = C0072d.this;
                dVar.f373D.removeGlobalOnLayoutListener(dVar.f384o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    class C0075c implements C0180f0 {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        class C0076a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C0077d f399f;

            /* renamed from: g */
            final /* synthetic */ MenuItem f400g;

            /* renamed from: h */
            final /* synthetic */ C0081g f401h;

            C0076a(C0077d dVar, MenuItem menuItem, C0081g gVar) {
                this.f399f = dVar;
                this.f400g = menuItem;
                this.f401h = gVar;
            }

            public void run() {
                C0077d dVar = this.f399f;
                if (dVar != null) {
                    C0072d.this.f375F = true;
                    dVar.f404b.mo457a(false);
                    C0072d.this.f375F = false;
                }
                if (this.f400g.isEnabled() && this.f400g.hasSubMenu()) {
                    this.f401h.mo458a(this.f400g, 4);
                }
            }
        }

        C0075c() {
        }

        /* renamed from: a */
        public void mo422a(C0081g gVar, MenuItem menuItem) {
            C0077d dVar = null;
            C0072d.this.f381l.removeCallbacksAndMessages((Object) null);
            int size = C0072d.this.f383n.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == C0072d.this.f383n.get(i).f404b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0072d.this.f383n.size()) {
                    dVar = C0072d.this.f383n.get(i2);
                }
                C0072d.this.f381l.postAtTime(new C0076a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: b */
        public void mo423b(C0081g gVar, MenuItem menuItem) {
            C0072d.this.f381l.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    private static class C0077d {

        /* renamed from: a */
        public final C0182g0 f403a;

        /* renamed from: b */
        public final C0081g f404b;

        /* renamed from: c */
        public final int f405c;

        public C0077d(C0182g0 g0Var, C0081g gVar, int i) {
            this.f403a = g0Var;
            this.f404b = gVar;
            this.f405c = i;
        }

        /* renamed from: a */
        public ListView mo425a() {
            return this.f403a.mo416g();
        }
    }

    public C0072d(Context context, View view, int i, int i2, boolean z) {
        this.f376g = context;
        this.f389t = view;
        this.f378i = i;
        this.f379j = i2;
        this.f380k = z;
        this.f370A = false;
        this.f391v = m381h();
        Resources resources = context.getResources();
        this.f377h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0657d.abc_config_prefDialogWidth));
        this.f381l = new Handler();
    }

    /* renamed from: a */
    private MenuItem m375a(C0081g gVar, C0081g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m376a(C0077d dVar, C0081g gVar) {
        int i;
        C0080f fVar;
        int firstVisiblePosition;
        MenuItem a = m375a(dVar.f404b, gVar);
        if (a == null) {
            return null;
        }
        ListView a2 = dVar.mo425a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (C0080f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (C0080f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: c */
    private int m377c(C0081g gVar) {
        int size = this.f383n.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.f383n.get(i).f404b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private int m378d(int i) {
        List<C0077d> list = this.f383n;
        ListView a = list.get(list.size() - 1).mo425a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f390u.getWindowVisibleDisplayFrame(rect);
        return this.f391v == 1 ? (iArr[0] + a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: d */
    private void m379d(C0081g gVar) {
        View view;
        C0077d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f376g);
        C0080f fVar = new C0080f(gVar, from, this.f380k, f369G);
        if (!mo413c() && this.f370A) {
            fVar.mo436a(true);
        } else if (mo413c()) {
            fVar.mo436a(C0094l.m518b(gVar));
        }
        int a = C0094l.m516a(fVar, (ViewGroup) null, this.f376g, this.f377h);
        C0182g0 f = m380f();
        f.mo1302a((ListAdapter) fVar);
        f.mo1311e(a);
        f.mo1312f(this.f388s);
        if (this.f383n.size() > 0) {
            List<C0077d> list = this.f383n;
            dVar = list.get(list.size() - 1);
            view = m376a(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            f.mo1359c(false);
            f.mo1357a((Object) null);
            int d = m378d(a);
            boolean z = d == 1;
            this.f391v = d;
            if (Build.VERSION.SDK_INT >= 26) {
                f.mo1300a(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f389t.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f388s & 7) == 5) {
                    iArr[0] = iArr[0] + this.f389t.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f388s & 5) != 5) {
                if (z) {
                    a = view.getWidth();
                }
                i3 = i - a;
                f.mo1297a(i3);
                f.mo1307b(true);
                f.mo1306b(i2);
            } else if (!z) {
                a = view.getWidth();
                i3 = i - a;
                f.mo1297a(i3);
                f.mo1307b(true);
                f.mo1306b(i2);
            }
            i3 = i + a;
            f.mo1297a(i3);
            f.mo1307b(true);
            f.mo1306b(i2);
        } else {
            if (this.f392w) {
                f.mo1297a(this.f394y);
            }
            if (this.f393x) {
                f.mo1306b(this.f395z);
            }
            f.mo1298a(mo649e());
        }
        this.f383n.add(new C0077d(f, gVar, this.f391v));
        f.mo403a();
        ListView g = f.mo416g();
        g.setOnKeyListener(this);
        if (dVar == null && this.f371B && gVar.mo493h() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0660g.abc_popup_menu_header_item_layout, g, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.mo493h());
            g.addHeaderView(frameLayout, (Object) null, false);
            f.mo403a();
        }
    }

    /* renamed from: f */
    private C0182g0 m380f() {
        C0182g0 g0Var = new C0182g0(this.f376g, (AttributeSet) null, this.f378i, this.f379j);
        g0Var.mo1356a(this.f386q);
        g0Var.mo1301a((AdapterView.OnItemClickListener) this);
        g0Var.mo1303a((PopupWindow.OnDismissListener) this);
        g0Var.mo1300a(this.f389t);
        g0Var.mo1312f(this.f388s);
        g0Var.mo1304a(true);
        g0Var.mo1313g(2);
        return g0Var;
    }

    /* renamed from: h */
    private int m381h() {
        return C0890v.m4791o(this.f389t) == 1 ? 0 : 1;
    }

    /* renamed from: a */
    public void mo403a() {
        if (!mo413c()) {
            for (C0081g d : this.f382m) {
                m379d(d);
            }
            this.f382m.clear();
            this.f390u = this.f389t;
            if (this.f390u != null) {
                boolean z = this.f373D == null;
                this.f373D = this.f390u.getViewTreeObserver();
                if (z) {
                    this.f373D.addOnGlobalLayoutListener(this.f384o);
                }
                this.f390u.addOnAttachStateChangeListener(this.f385p);
            }
        }
    }

    /* renamed from: a */
    public void mo404a(int i) {
        if (this.f387r != i) {
            this.f387r = i;
            this.f388s = C0851d.m4580a(i, C0890v.m4791o(this.f389t));
        }
    }

    /* renamed from: a */
    public void mo405a(View view) {
        if (this.f389t != view) {
            this.f389t = view;
            this.f388s = C0851d.m4580a(this.f387r, C0890v.m4791o(this.f389t));
        }
    }

    /* renamed from: a */
    public void mo406a(PopupWindow.OnDismissListener onDismissListener) {
        this.f374E = onDismissListener;
    }

    /* renamed from: a */
    public void mo407a(C0081g gVar) {
        gVar.mo455a((C0097n) this, this.f376g);
        if (mo413c()) {
            m379d(gVar);
        } else {
            this.f382m.add(gVar);
        }
    }

    /* renamed from: a */
    public void mo388a(C0081g gVar, boolean z) {
        int c = m377c(gVar);
        if (c >= 0) {
            int i = c + 1;
            if (i < this.f383n.size()) {
                this.f383n.get(i).f404b.mo457a(false);
            }
            C0077d remove = this.f383n.remove(c);
            remove.f404b.mo474b((C0097n) this);
            if (this.f375F) {
                remove.f403a.mo1358b((Object) null);
                remove.f403a.mo1309d(0);
            }
            remove.f403a.dismiss();
            int size = this.f383n.size();
            this.f391v = size > 0 ? this.f383n.get(size - 1).f405c : m381h();
            if (size == 0) {
                dismiss();
                C0097n.C0098a aVar = this.f372C;
                if (aVar != null) {
                    aVar.mo212a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f373D;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f373D.removeGlobalOnLayoutListener(this.f384o);
                    }
                    this.f373D = null;
                }
                this.f390u.removeOnAttachStateChangeListener(this.f385p);
                this.f374E.onDismiss();
            } else if (z) {
                this.f383n.get(0).f404b.mo457a(false);
            }
        }
    }

    /* renamed from: a */
    public void mo390a(C0097n.C0098a aVar) {
        this.f372C = aVar;
    }

    /* renamed from: a */
    public void mo391a(boolean z) {
        for (C0077d a : this.f383n) {
            C0094l.m517a(a.mo425a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo395a(C0106s sVar) {
        for (C0077d next : this.f383n) {
            if (sVar == next.f404b) {
                next.mo425a().requestFocus();
                return true;
            }
        }
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        mo407a((C0081g) sVar);
        C0097n.C0098a aVar = this.f372C;
        if (aVar != null) {
            aVar.mo213a(sVar);
        }
        return true;
    }

    /* renamed from: b */
    public void mo408b(int i) {
        this.f392w = true;
        this.f394y = i;
    }

    /* renamed from: b */
    public void mo409b(boolean z) {
        this.f370A = z;
    }

    /* renamed from: b */
    public boolean mo410b() {
        return false;
    }

    /* renamed from: c */
    public void mo411c(int i) {
        this.f393x = true;
        this.f395z = i;
    }

    /* renamed from: c */
    public void mo412c(boolean z) {
        this.f371B = z;
    }

    /* renamed from: c */
    public boolean mo413c() {
        return this.f383n.size() > 0 && this.f383n.get(0).f403a.mo413c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo414d() {
        return false;
    }

    public void dismiss() {
        int size = this.f383n.size();
        if (size > 0) {
            C0077d[] dVarArr = (C0077d[]) this.f383n.toArray(new C0077d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0077d dVar = dVarArr[i];
                if (dVar.f403a.mo413c()) {
                    dVar.f403a.dismiss();
                }
            }
        }
    }

    /* renamed from: g */
    public ListView mo416g() {
        if (this.f383n.isEmpty()) {
            return null;
        }
        List<C0077d> list = this.f383n;
        return list.get(list.size() - 1).mo425a();
    }

    public void onDismiss() {
        C0077d dVar;
        int size = this.f383n.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f383n.get(i);
            if (!dVar.f403a.mo413c()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f404b.mo457a(false);
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
