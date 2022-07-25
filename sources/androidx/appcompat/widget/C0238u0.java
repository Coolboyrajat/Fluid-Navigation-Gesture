package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.C0899w;

/* renamed from: androidx.appcompat.widget.u0 */
class C0238u0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: o */
    private static C0238u0 f1137o;

    /* renamed from: p */
    private static C0238u0 f1138p;

    /* renamed from: f */
    private final View f1139f;

    /* renamed from: g */
    private final CharSequence f1140g;

    /* renamed from: h */
    private final int f1141h;

    /* renamed from: i */
    private final Runnable f1142i = new C0239a();

    /* renamed from: j */
    private final Runnable f1143j = new C0240b();

    /* renamed from: k */
    private int f1144k;

    /* renamed from: l */
    private int f1145l;

    /* renamed from: m */
    private C0242v0 f1146m;

    /* renamed from: n */
    private boolean f1147n;

    /* renamed from: androidx.appcompat.widget.u0$a */
    class C0239a implements Runnable {
        C0239a() {
        }

        public void run() {
            C0238u0.this.mo1675a(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.u0$b */
    class C0240b implements Runnable {
        C0240b() {
        }

        public void run() {
            C0238u0.this.mo1674a();
        }
    }

    private C0238u0(View view, CharSequence charSequence) {
        this.f1139f = view;
        this.f1140g = charSequence;
        this.f1141h = C0899w.m4840a(ViewConfiguration.get(this.f1139f.getContext()));
        m1187c();
        this.f1139f.setOnLongClickListener(this);
        this.f1139f.setOnHoverListener(this);
    }

    /* renamed from: a */
    public static void m1183a(View view, CharSequence charSequence) {
        C0238u0 u0Var = f1137o;
        if (u0Var != null && u0Var.f1139f == view) {
            m1184a((C0238u0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0238u0 u0Var2 = f1138p;
            if (u0Var2 != null && u0Var2.f1139f == view) {
                u0Var2.mo1674a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0238u0(view, charSequence);
    }

    /* renamed from: a */
    private static void m1184a(C0238u0 u0Var) {
        C0238u0 u0Var2 = f1137o;
        if (u0Var2 != null) {
            u0Var2.m1186b();
        }
        f1137o = u0Var;
        C0238u0 u0Var3 = f1137o;
        if (u0Var3 != null) {
            u0Var3.m1188d();
        }
    }

    /* renamed from: a */
    private boolean m1185a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1144k) <= this.f1141h && Math.abs(y - this.f1145l) <= this.f1141h) {
            return false;
        }
        this.f1144k = x;
        this.f1145l = y;
        return true;
    }

    /* renamed from: b */
    private void m1186b() {
        this.f1139f.removeCallbacks(this.f1142i);
    }

    /* renamed from: c */
    private void m1187c() {
        this.f1144k = Integer.MAX_VALUE;
        this.f1145l = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m1188d() {
        this.f1139f.postDelayed(this.f1142i, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1674a() {
        if (f1138p == this) {
            f1138p = null;
            C0242v0 v0Var = this.f1146m;
            if (v0Var != null) {
                v0Var.mo1696a();
                this.f1146m = null;
                m1187c();
                this.f1139f.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1137o == this) {
            m1184a((C0238u0) null);
        }
        this.f1139f.removeCallbacks(this.f1143j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1675a(boolean z) {
        long j;
        if (C0890v.m4731B(this.f1139f)) {
            m1184a((C0238u0) null);
            C0238u0 u0Var = f1138p;
            if (u0Var != null) {
                u0Var.mo1674a();
            }
            f1138p = this;
            this.f1147n = z;
            this.f1146m = new C0242v0(this.f1139f.getContext());
            this.f1146m.mo1697a(this.f1139f, this.f1144k, this.f1145l, this.f1147n, this.f1140g);
            this.f1139f.addOnAttachStateChangeListener(this);
            if (this.f1147n) {
                j = 2500;
            } else {
                j = ((C0890v.m4798v(this.f1139f) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f1139f.removeCallbacks(this.f1143j);
            this.f1139f.postDelayed(this.f1143j, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1146m != null && this.f1147n) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1139f.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1187c();
                mo1674a();
            }
        } else if (this.f1139f.isEnabled() && this.f1146m == null && m1185a(motionEvent)) {
            m1184a(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1144k = view.getWidth() / 2;
        this.f1145l = view.getHeight() / 2;
        mo1675a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo1674a();
    }
}
