package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0078e;
import androidx.appcompat.view.menu.C0081g;
import androidx.appcompat.view.menu.C0097n;
import androidx.appcompat.view.menu.C0099o;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0154b0;
import androidx.appcompat.widget.C0192i;
import androidx.appcompat.widget.C0217r0;
import androidx.appcompat.widget.C0244w0;
import androidx.appcompat.widget.C0245x;
import androidx.appcompat.widget.C0246x0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.core.app.C0276a;
import androidx.core.app.C0290f;
import androidx.lifecycle.C0481i;
import androidx.lifecycle.C0490o;
import java.lang.Thread;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import p006b.p007a.C0654a;
import p006b.p007a.C0656c;
import p006b.p007a.C0659f;
import p006b.p007a.C0660g;
import p006b.p007a.C0662i;
import p006b.p007a.C0663j;
import p006b.p007a.p008k.p009a.C0664a;
import p006b.p007a.p014o.C0685b;
import p006b.p007a.p014o.C0688d;
import p006b.p007a.p014o.C0690f;
import p006b.p007a.p014o.C0692g;
import p006b.p007a.p014o.C0697i;
import p006b.p021d.C0723a;
import p006b.p026g.p035k.C0840a0;
import p006b.p026g.p035k.C0844b0;
import p006b.p026g.p035k.C0852d0;
import p006b.p026g.p035k.C0853e;
import p006b.p026g.p035k.C0874f;
import p006b.p026g.p035k.C0886r;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.C0902z;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: androidx.appcompat.app.g */
class C0036g extends C0035f implements C0081g.C0082a, LayoutInflater.Factory2 {

    /* renamed from: f0 */
    private static final Map<Class<?>, Integer> f150f0 = new C0723a();

    /* renamed from: g0 */
    private static final boolean f151g0 = (Build.VERSION.SDK_INT < 21);

    /* renamed from: h0 */
    private static final int[] f152h0 = {16842836};

    /* renamed from: i0 */
    private static boolean f153i0 = true;

    /* renamed from: j0 */
    private static final boolean f154j0;

    /* renamed from: A */
    private ViewGroup f155A;

    /* renamed from: B */
    private TextView f156B;

    /* renamed from: C */
    private View f157C;

    /* renamed from: D */
    private boolean f158D;

    /* renamed from: E */
    private boolean f159E;

    /* renamed from: F */
    boolean f160F;

    /* renamed from: G */
    boolean f161G;

    /* renamed from: H */
    boolean f162H;

    /* renamed from: I */
    boolean f163I;

    /* renamed from: J */
    boolean f164J;

    /* renamed from: K */
    private boolean f165K;

    /* renamed from: L */
    private C0054o[] f166L;

    /* renamed from: M */
    private C0054o f167M;

    /* renamed from: N */
    private boolean f168N;

    /* renamed from: O */
    private boolean f169O;

    /* renamed from: P */
    private boolean f170P;

    /* renamed from: Q */
    private boolean f171Q;

    /* renamed from: R */
    boolean f172R;

    /* renamed from: S */
    private int f173S;

    /* renamed from: T */
    private int f174T;

    /* renamed from: U */
    private boolean f175U;

    /* renamed from: V */
    private boolean f176V;

    /* renamed from: W */
    private C0050l f177W;

    /* renamed from: X */
    private C0050l f178X;

    /* renamed from: Y */
    boolean f179Y;

    /* renamed from: Z */
    int f180Z;

    /* renamed from: a0 */
    private final Runnable f181a0;

    /* renamed from: b0 */
    private boolean f182b0;

    /* renamed from: c0 */
    private Rect f183c0;

    /* renamed from: d0 */
    private Rect f184d0;

    /* renamed from: e0 */
    private AppCompatViewInflater f185e0;

    /* renamed from: i */
    final Object f186i;

    /* renamed from: j */
    final Context f187j;

    /* renamed from: k */
    Window f188k;

    /* renamed from: l */
    private C0048j f189l;

    /* renamed from: m */
    final C0034e f190m;

    /* renamed from: n */
    C0026a f191n;

    /* renamed from: o */
    MenuInflater f192o;

    /* renamed from: p */
    private CharSequence f193p;

    /* renamed from: q */
    private C0245x f194q;

    /* renamed from: r */
    private C0045h f195r;

    /* renamed from: s */
    private C0055p f196s;

    /* renamed from: t */
    C0685b f197t;

    /* renamed from: u */
    ActionBarContextView f198u;

    /* renamed from: v */
    PopupWindow f199v;

    /* renamed from: w */
    Runnable f200w;

    /* renamed from: x */
    C0902z f201x;

    /* renamed from: y */
    private boolean f202y;

    /* renamed from: z */
    private boolean f203z;

    /* renamed from: androidx.appcompat.app.g$a */
    static class C0037a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f204a;

        C0037a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f204a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m222a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (m222a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f204a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f204a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.g$b */
    class C0038b implements Runnable {
        C0038b() {
        }

        public void run() {
            C0036g gVar = C0036g.this;
            if ((gVar.f180Z & 1) != 0) {
                gVar.mo186g(0);
            }
            C0036g gVar2 = C0036g.this;
            if ((gVar2.f180Z & PropertyFlags.INDEX_HASH64) != 0) {
                gVar2.mo186g(108);
            }
            C0036g gVar3 = C0036g.this;
            gVar3.f179Y = false;
            gVar3.f180Z = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.g$c */
    class C0039c implements C0886r {
        C0039c() {
        }

        /* renamed from: a */
        public C0852d0 mo205a(View view, C0852d0 d0Var) {
            int d = d0Var.mo4574d();
            int k = C0036g.this.mo190k(d);
            if (d != k) {
                d0Var = d0Var.mo4571a(d0Var.mo4572b(), k, d0Var.mo4573c(), d0Var.mo4570a());
            }
            return C0890v.m4765b(view, d0Var);
        }
    }

    /* renamed from: androidx.appcompat.app.g$d */
    class C0040d implements C0154b0.C0155a {
        C0040d() {
        }

        /* renamed from: a */
        public void mo206a(Rect rect) {
            rect.top = C0036g.this.mo190k(rect.top);
        }
    }

    /* renamed from: androidx.appcompat.app.g$e */
    class C0041e implements ContentFrameLayout.C0119a {
        C0041e() {
        }

        /* renamed from: a */
        public void mo207a() {
        }

        public void onDetachedFromWindow() {
            C0036g.this.mo191k();
        }
    }

    /* renamed from: androidx.appcompat.app.g$f */
    class C0042f implements Runnable {

        /* renamed from: androidx.appcompat.app.g$f$a */
        class C0043a extends C0844b0 {
            C0043a() {
            }

            /* renamed from: a */
            public void mo210a(View view) {
                C0036g.this.f198u.setAlpha(1.0f);
                C0036g.this.f201x.mo4697a((C0840a0) null);
                C0036g.this.f201x = null;
            }

            /* renamed from: b */
            public void mo211b(View view) {
                C0036g.this.f198u.setVisibility(0);
            }
        }

        C0042f() {
        }

        public void run() {
            C0036g gVar = C0036g.this;
            gVar.f199v.showAtLocation(gVar.f198u, 55, 0, 0);
            C0036g.this.mo192m();
            if (C0036g.this.mo202u()) {
                C0036g.this.f198u.setAlpha(0.0f);
                C0036g gVar2 = C0036g.this;
                C0902z a = C0890v.m4742a(gVar2.f198u);
                a.mo4694a(1.0f);
                gVar2.f201x = a;
                C0036g.this.f201x.mo4697a((C0840a0) new C0043a());
                return;
            }
            C0036g.this.f198u.setAlpha(1.0f);
            C0036g.this.f198u.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.g$g */
    class C0044g extends C0844b0 {
        C0044g() {
        }

        /* renamed from: a */
        public void mo210a(View view) {
            C0036g.this.f198u.setAlpha(1.0f);
            C0036g.this.f201x.mo4697a((C0840a0) null);
            C0036g.this.f201x = null;
        }

        /* renamed from: b */
        public void mo211b(View view) {
            C0036g.this.f198u.setVisibility(0);
            C0036g.this.f198u.sendAccessibilityEvent(32);
            if (C0036g.this.f198u.getParent() instanceof View) {
                C0890v.m4737H((View) C0036g.this.f198u.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$h */
    private final class C0045h implements C0097n.C0098a {
        C0045h() {
        }

        /* renamed from: a */
        public void mo212a(C0081g gVar, boolean z) {
            C0036g.this.mo182b(gVar);
        }

        /* renamed from: a */
        public boolean mo213a(C0081g gVar) {
            Window.Callback q = C0036g.this.mo198q();
            if (q == null) {
                return true;
            }
            q.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.g$i */
    class C0046i implements C0685b.C0686a {

        /* renamed from: a */
        private C0685b.C0686a f213a;

        /* renamed from: androidx.appcompat.app.g$i$a */
        class C0047a extends C0844b0 {
            C0047a() {
            }

            /* renamed from: a */
            public void mo210a(View view) {
                C0036g.this.f198u.setVisibility(8);
                C0036g gVar = C0036g.this;
                PopupWindow popupWindow = gVar.f199v;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.f198u.getParent() instanceof View) {
                    C0890v.m4737H((View) C0036g.this.f198u.getParent());
                }
                C0036g.this.f198u.removeAllViews();
                C0036g.this.f201x.mo4697a((C0840a0) null);
                C0036g.this.f201x = null;
            }
        }

        public C0046i(C0685b.C0686a aVar) {
            this.f213a = aVar;
        }

        /* renamed from: a */
        public void mo214a(C0685b bVar) {
            this.f213a.mo214a(bVar);
            C0036g gVar = C0036g.this;
            if (gVar.f199v != null) {
                gVar.f188k.getDecorView().removeCallbacks(C0036g.this.f200w);
            }
            C0036g gVar2 = C0036g.this;
            if (gVar2.f198u != null) {
                gVar2.mo192m();
                C0036g gVar3 = C0036g.this;
                C0902z a = C0890v.m4742a(gVar3.f198u);
                a.mo4694a(0.0f);
                gVar3.f201x = a;
                C0036g.this.f201x.mo4697a((C0840a0) new C0047a());
            }
            C0036g gVar4 = C0036g.this;
            C0034e eVar = gVar4.f190m;
            if (eVar != null) {
                eVar.mo115b(gVar4.f197t);
            }
            C0036g.this.f197t = null;
        }

        /* renamed from: a */
        public boolean mo215a(C0685b bVar, Menu menu) {
            return this.f213a.mo215a(bVar, menu);
        }

        /* renamed from: a */
        public boolean mo216a(C0685b bVar, MenuItem menuItem) {
            return this.f213a.mo216a(bVar, menuItem);
        }

        /* renamed from: b */
        public boolean mo217b(C0685b bVar, Menu menu) {
            return this.f213a.mo217b(bVar, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.g$j */
    class C0048j extends C0697i {
        C0048j(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final ActionMode mo218a(ActionMode.Callback callback) {
            C0690f.C0691a aVar = new C0690f.C0691a(C0036g.this.f187j, callback);
            C0685b a = C0036g.this.mo173a((C0685b.C0686a) aVar);
            if (a != null) {
                return aVar.mo3922b(a);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0036g.this.mo179a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0036g.this.mo183b(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0081g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0036g.this.mo188i(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            C0036g.this.mo189j(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0081g gVar = menu instanceof C0081g ? (C0081g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.mo480c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.mo480c(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0081g gVar;
            C0054o a = C0036g.this.mo171a(0, true);
            if (a == null || (gVar = a.f234j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return C0036g.this.mo199r() ? mo218a(callback) : super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!C0036g.this.mo199r() || i != 0) ? super.onWindowStartingActionMode(callback, i) : mo218a(callback);
        }
    }

    /* renamed from: androidx.appcompat.app.g$k */
    private class C0049k extends C0050l {

        /* renamed from: c */
        private final PowerManager f217c;

        C0049k(Context context) {
            super();
            this.f217c = (PowerManager) context.getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo229b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo230c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f217c.isPowerSaveMode()) ? 1 : 2;
        }

        /* renamed from: d */
        public void mo231d() {
            C0036g.this.mo154a();
        }
    }

    /* renamed from: androidx.appcompat.app.g$l */
    abstract class C0050l {

        /* renamed from: a */
        private BroadcastReceiver f219a;

        /* renamed from: androidx.appcompat.app.g$l$a */
        class C0051a extends BroadcastReceiver {
            C0051a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0050l.this.mo231d();
            }
        }

        C0050l() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo232a() {
            BroadcastReceiver broadcastReceiver = this.f219a;
            if (broadcastReceiver != null) {
                try {
                    C0036g.this.f187j.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f219a = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract IntentFilter mo229b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo230c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo231d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo233e() {
            mo232a();
            IntentFilter b = mo229b();
            if (b != null && b.countActions() != 0) {
                if (this.f219a == null) {
                    this.f219a = new C0051a();
                }
                C0036g.this.f187j.registerReceiver(this.f219a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$m */
    private class C0052m extends C0050l {

        /* renamed from: c */
        private final C0060k f222c;

        C0052m(C0060k kVar) {
            super();
            this.f222c = kVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo229b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo230c() {
            return this.f222c.mo256a() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo231d() {
            C0036g.this.mo154a();
        }
    }

    /* renamed from: androidx.appcompat.app.g$n */
    private class C0053n extends ContentFrameLayout {
        public C0053n(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m249a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0036g.this.mo179a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m249a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0036g.this.mo185f(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0664a.m3682c(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.g$o */
    protected static final class C0054o {

        /* renamed from: a */
        int f225a;

        /* renamed from: b */
        int f226b;

        /* renamed from: c */
        int f227c;

        /* renamed from: d */
        int f228d;

        /* renamed from: e */
        int f229e;

        /* renamed from: f */
        int f230f;

        /* renamed from: g */
        ViewGroup f231g;

        /* renamed from: h */
        View f232h;

        /* renamed from: i */
        View f233i;

        /* renamed from: j */
        C0081g f234j;

        /* renamed from: k */
        C0078e f235k;

        /* renamed from: l */
        Context f236l;

        /* renamed from: m */
        boolean f237m;

        /* renamed from: n */
        boolean f238n;

        /* renamed from: o */
        boolean f239o;

        /* renamed from: p */
        public boolean f240p;

        /* renamed from: q */
        boolean f241q = false;

        /* renamed from: r */
        boolean f242r;

        /* renamed from: s */
        Bundle f243s;

        C0054o(int i) {
            this.f225a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0099o mo238a(C0097n.C0098a aVar) {
            if (this.f234j == null) {
                return null;
            }
            if (this.f235k == null) {
                this.f235k = new C0078e(this.f236l, C0660g.abc_list_menu_item_layout);
                this.f235k.mo390a(aVar);
                this.f234j.mo454a((C0097n) this.f235k);
            }
            return this.f235k.mo427a(this.f231g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo239a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0654a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C0654a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = C0662i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            C0688d dVar = new C0688d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f236l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C0663j.AppCompatTheme);
            this.f226b = obtainStyledAttributes.getResourceId(C0663j.AppCompatTheme_panelBackground, 0);
            this.f230f = obtainStyledAttributes.getResourceId(C0663j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo240a(C0081g gVar) {
            C0078e eVar;
            C0081g gVar2 = this.f234j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo474b((C0097n) this.f235k);
                }
                this.f234j = gVar;
                if (gVar != null && (eVar = this.f235k) != null) {
                    gVar.mo454a((C0097n) eVar);
                }
            }
        }

        /* renamed from: a */
        public boolean mo241a() {
            if (this.f232h == null) {
                return false;
            }
            return this.f233i != null || this.f235k.mo426a().getCount() > 0;
        }
    }

    /* renamed from: androidx.appcompat.app.g$p */
    private final class C0055p implements C0097n.C0098a {
        C0055p() {
        }

        /* renamed from: a */
        public void mo212a(C0081g gVar, boolean z) {
            C0081g m = gVar.mo500m();
            boolean z2 = m != gVar;
            C0036g gVar2 = C0036g.this;
            if (z2) {
                gVar = m;
            }
            C0054o a = gVar2.mo172a((Menu) gVar);
            if (a == null) {
                return;
            }
            if (z2) {
                C0036g.this.mo174a(a.f225a, a, m);
                C0036g.this.mo176a(a, true);
                return;
            }
            C0036g.this.mo176a(a, z);
        }

        /* renamed from: a */
        public boolean mo213a(C0081g gVar) {
            Window.Callback q;
            if (gVar != null) {
                return true;
            }
            C0036g gVar2 = C0036g.this;
            if (!gVar2.f160F || (q = gVar2.mo198q()) == null || C0036g.this.f172R) {
                return true;
            }
            q.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        boolean z = false;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21 && i <= 25) {
            z = true;
        }
        f154j0 = z;
        if (f151g0 && !f153i0) {
            Thread.setDefaultUncaughtExceptionHandler(new C0037a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    C0036g(Activity activity, C0034e eVar) {
        this(activity, (Window) null, eVar, activity);
    }

    C0036g(Dialog dialog, C0034e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    private C0036g(Context context, Window window, C0034e eVar, Object obj) {
        Integer num;
        C0033d F;
        this.f201x = null;
        this.f202y = true;
        this.f173S = -100;
        this.f181a0 = new C0038b();
        this.f187j = context;
        this.f190m = eVar;
        this.f186i = obj;
        if (this.f173S == -100 && (this.f186i instanceof Dialog) && (F = m146F()) != null) {
            this.f173S = F.mo126n().mo155b();
        }
        if (this.f173S == -100 && (num = f150f0.get(this.f186i.getClass())) != null) {
            this.f173S = num.intValue();
            f150f0.remove(this.f186i.getClass());
        }
        if (window != null) {
            m147a(window);
        }
        C0192i.m964c();
    }

    /* renamed from: A */
    private void m141A() {
        if (this.f188k == null) {
            Object obj = this.f186i;
            if (obj instanceof Activity) {
                m147a(((Activity) obj).getWindow());
            }
        }
        if (this.f188k == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: B */
    private C0050l m142B() {
        if (this.f178X == null) {
            this.f178X = new C0049k(this.f187j);
        }
        return this.f178X;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m143C() {
        /*
            r3 = this;
            r3.m167z()
            boolean r0 = r3.f160F
            if (r0 == 0) goto L_0x0033
            androidx.appcompat.app.a r0 = r3.f191n
            if (r0 == 0) goto L_0x000c
            goto L_0x0033
        L_0x000c:
            java.lang.Object r0 = r3.f186i
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x001e
            androidx.appcompat.app.l r1 = new androidx.appcompat.app.l
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.f161G
            r1.<init>(r0, r2)
        L_0x001b:
            r3.f191n = r1
            goto L_0x002a
        L_0x001e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x002a
            androidx.appcompat.app.l r1 = new androidx.appcompat.app.l
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            goto L_0x001b
        L_0x002a:
            androidx.appcompat.app.a r0 = r3.f191n
            if (r0 == 0) goto L_0x0033
            boolean r1 = r3.f182b0
            r0.mo80c(r1)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0036g.m143C():void");
    }

    /* renamed from: D */
    private boolean m144D() {
        if (!this.f176V && (this.f186i instanceof Activity)) {
            PackageManager packageManager = this.f187j.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f187j, this.f186i.getClass()), 0);
                this.f175U = (activityInfo == null || (activityInfo.configChanges & PropertyFlags.INDEX_PARTIAL_SKIP_ZERO) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f175U = false;
            }
        }
        this.f176V = true;
        return this.f175U;
    }

    /* renamed from: E */
    private void m145E() {
        if (this.f203z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: F */
    private C0033d m146F() {
        Context context = this.f187j;
        while (context != null) {
            if (!(context instanceof C0033d)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (C0033d) context;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m147a(Window window) {
        if (this.f188k == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0048j)) {
                this.f189l = new C0048j(callback);
                window.setCallback(this.f189l);
                C0217r0 a = C0217r0.m1053a(this.f187j, (AttributeSet) null, f152h0);
                Drawable c = a.mo1537c(0);
                if (c != null) {
                    window.setBackgroundDrawable(c);
                }
                a.mo1531a();
                this.f188k = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: a */
    private void m148a(C0054o oVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!oVar.f239o && !this.f172R) {
            if (oVar.f225a == 0) {
                if ((this.f187j.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback q = mo198q();
            if (q == null || q.onMenuOpened(oVar.f225a, oVar.f234j)) {
                WindowManager windowManager = (WindowManager) this.f187j.getSystemService("window");
                if (windowManager != null && m156b(oVar, keyEvent)) {
                    if (oVar.f231g == null || oVar.f241q) {
                        ViewGroup viewGroup = oVar.f231g;
                        if (viewGroup == null) {
                            if (!m155b(oVar) || oVar.f231g == null) {
                                return;
                            }
                        } else if (oVar.f241q && viewGroup.getChildCount() > 0) {
                            oVar.f231g.removeAllViews();
                        }
                        if (m151a(oVar) && oVar.mo241a()) {
                            ViewGroup.LayoutParams layoutParams2 = oVar.f232h.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            oVar.f231g.setBackgroundResource(oVar.f226b);
                            ViewParent parent = oVar.f232h.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(oVar.f232h);
                            }
                            oVar.f231g.addView(oVar.f232h, layoutParams2);
                            if (!oVar.f232h.hasFocus()) {
                                oVar.f232h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = oVar.f233i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            oVar.f238n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, oVar.f228d, oVar.f229e, 1002, 8519680, -3);
                            layoutParams3.gravity = oVar.f227c;
                            layoutParams3.windowAnimations = oVar.f230f;
                            windowManager.addView(oVar.f231g, layoutParams3);
                            oVar.f239o = true;
                            return;
                        }
                    }
                    i = -2;
                    oVar.f238n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, oVar.f228d, oVar.f229e, 1002, 8519680, -3);
                    layoutParams32.gravity = oVar.f227c;
                    layoutParams32.windowAnimations = oVar.f230f;
                    windowManager.addView(oVar.f231g, layoutParams32);
                    oVar.f239o = true;
                    return;
                }
                return;
            }
            mo176a(oVar, true);
        }
    }

    /* renamed from: a */
    private void m149a(C0081g gVar, boolean z) {
        C0245x xVar = this.f194q;
        if (xVar == null || !xVar.mo769g() || (ViewConfiguration.get(this.f187j).hasPermanentMenuKey() && !this.f194q.mo760b())) {
            C0054o a = mo171a(0, true);
            a.f241q = true;
            mo176a(a, false);
            m148a(a, (KeyEvent) null);
            return;
        }
        Window.Callback q = mo198q();
        if (this.f194q.mo762c() && z) {
            this.f194q.mo764d();
            if (!this.f172R) {
                q.onPanelClosed(108, mo171a(0, true).f234j);
            }
        } else if (q != null && !this.f172R) {
            if (this.f179Y && (this.f180Z & 1) != 0) {
                this.f188k.getDecorView().removeCallbacks(this.f181a0);
                this.f181a0.run();
            }
            C0054o a2 = mo171a(0, true);
            C0081g gVar2 = a2.f234j;
            if (gVar2 != null && !a2.f242r && q.onPreparePanel(0, a2.f233i, gVar2)) {
                q.onMenuOpened(108, a2.f234j);
                this.f194q.mo766e();
            }
        }
    }

    /* renamed from: a */
    private boolean m150a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f188k.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0890v.m4731B((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: a */
    private boolean m151a(C0054o oVar) {
        View view = oVar.f233i;
        if (view != null) {
            oVar.f232h = view;
            return true;
        } else if (oVar.f234j == null) {
            return false;
        } else {
            if (this.f196s == null) {
                this.f196s = new C0055p();
            }
            oVar.f232h = (View) oVar.mo238a((C0097n.C0098a) this.f196s);
            return oVar.f232h != null;
        }
    }

    /* renamed from: a */
    private boolean m152a(C0054o oVar, int i, KeyEvent keyEvent, int i2) {
        C0081g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((oVar.f237m || m156b(oVar, keyEvent)) && (gVar = oVar.f234j) != null) {
            z = gVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f194q == null) {
            mo176a(oVar, true);
        }
        return z;
    }

    /* renamed from: a */
    private boolean m153a(boolean z) {
        if (this.f172R) {
            return false;
        }
        int w = m164w();
        boolean b = m154b(mo187h(w), z);
        if (w == 0) {
            mo194o().mo233e();
        } else {
            C0050l lVar = this.f177W;
            if (lVar != null) {
                lVar.mo232a();
            }
        }
        if (w == 3) {
            m142B().mo233e();
        } else {
            C0050l lVar2 = this.f178X;
            if (lVar2 != null) {
                lVar2.mo232a();
            }
        }
        return b;
    }

    /* renamed from: b */
    private boolean m154b(int i, boolean z) {
        int i2 = this.f187j.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z2 = true;
        int i3 = i != 1 ? i != 2 ? i2 : 32 : 16;
        boolean D = m144D();
        boolean z3 = false;
        if ((f154j0 || i3 != i2) && !D && Build.VERSION.SDK_INT >= 17 && !this.f169O && (this.f186i instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & -49) | i3;
            try {
                ((ContextThemeWrapper) this.f186i).applyOverrideConfiguration(configuration);
                z3 = true;
            } catch (IllegalStateException e) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e);
            }
        }
        int i4 = this.f187j.getResources().getConfiguration().uiMode & 48;
        if (!z3 && i4 != i3 && z && !D && this.f169O && (Build.VERSION.SDK_INT >= 17 || this.f170P)) {
            Object obj = this.f186i;
            if (obj instanceof Activity) {
                C0276a.m1425b((Activity) obj);
                z3 = true;
            }
        }
        if (z3 || i4 == i3) {
            z2 = z3;
        } else {
            m157c(i3, D);
        }
        if (z2) {
            Object obj2 = this.f186i;
            if (obj2 instanceof C0033d) {
                ((C0033d) obj2).mo117c(i);
            }
        }
        return z2;
    }

    /* renamed from: b */
    private boolean m155b(C0054o oVar) {
        oVar.mo239a(mo193n());
        oVar.f231g = new C0053n(oVar.f236l);
        oVar.f227c = 81;
        return true;
    }

    /* renamed from: b */
    private boolean m156b(C0054o oVar, KeyEvent keyEvent) {
        C0245x xVar;
        C0245x xVar2;
        C0245x xVar3;
        if (this.f172R) {
            return false;
        }
        if (oVar.f237m) {
            return true;
        }
        C0054o oVar2 = this.f167M;
        if (!(oVar2 == null || oVar2 == oVar)) {
            mo176a(oVar2, false);
        }
        Window.Callback q = mo198q();
        if (q != null) {
            oVar.f233i = q.onCreatePanelView(oVar.f225a);
        }
        int i = oVar.f225a;
        boolean z = i == 0 || i == 108;
        if (z && (xVar3 = this.f194q) != null) {
            xVar3.mo767f();
        }
        if (oVar.f233i == null) {
            if (z) {
                mo201t();
            }
            if (oVar.f234j == null || oVar.f242r) {
                if (oVar.f234j == null && (!m158c(oVar) || oVar.f234j == null)) {
                    return false;
                }
                if (z && this.f194q != null) {
                    if (this.f195r == null) {
                        this.f195r = new C0045h();
                    }
                    this.f194q.mo754a(oVar.f234j, this.f195r);
                }
                oVar.f234j.mo510s();
                if (!q.onCreatePanelMenu(oVar.f225a, oVar.f234j)) {
                    oVar.mo240a((C0081g) null);
                    if (z && (xVar2 = this.f194q) != null) {
                        xVar2.mo754a((Menu) null, this.f195r);
                    }
                    return false;
                }
                oVar.f242r = false;
            }
            oVar.f234j.mo510s();
            Bundle bundle = oVar.f243s;
            if (bundle != null) {
                oVar.f234j.mo451a(bundle);
                oVar.f243s = null;
            }
            if (!q.onPreparePanel(0, oVar.f233i, oVar.f234j)) {
                if (z && (xVar = this.f194q) != null) {
                    xVar.mo754a((Menu) null, this.f195r);
                }
                oVar.f234j.mo507r();
                return false;
            }
            oVar.f240p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            oVar.f234j.setQwertyMode(oVar.f240p);
            oVar.f234j.mo507r();
        }
        oVar.f237m = true;
        oVar.f238n = false;
        this.f167M = oVar;
        return true;
    }

    /* renamed from: c */
    private void m157c(int i, boolean z) {
        Resources resources = this.f187j.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration, (DisplayMetrics) null);
        if (Build.VERSION.SDK_INT < 26) {
            C0058i.m264a(resources);
        }
        int i2 = this.f174T;
        if (i2 != 0) {
            this.f187j.setTheme(i2);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f187j.getTheme().applyStyle(this.f174T, true);
            }
        }
        if (z) {
            Object obj = this.f186i;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof C0490o) {
                    if (!((C0490o) activity).mo5a().mo2700a().mo2703a(C0481i.C0483b.STARTED)) {
                        return;
                    }
                } else if (!this.f171Q) {
                    return;
                }
                activity.onConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: c */
    private boolean m158c(C0054o oVar) {
        Context context = this.f187j;
        int i = oVar.f225a;
        if ((i == 0 || i == 108) && this.f194q != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C0654a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0654a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0654a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C0688d dVar = new C0688d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0081g gVar = new C0081g(context);
        gVar.mo453a((C0081g.C0082a) this);
        oVar.mo240a(gVar);
        return true;
    }

    /* renamed from: d */
    private boolean m159d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C0054o a = mo171a(i, true);
        if (!a.f239o) {
            return m156b(a, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m160e(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            b.a.o.b r0 = r3.f197t
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.g$o r2 = r3.mo171a((int) r4, (boolean) r0)
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.x r4 = r3.f194q
            if (r4 == 0) goto L_0x0043
            boolean r4 = r4.mo769g()
            if (r4 == 0) goto L_0x0043
            android.content.Context r4 = r3.f187j
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.x r4 = r3.f194q
            boolean r4 = r4.mo762c()
            if (r4 != 0) goto L_0x003c
            boolean r4 = r3.f172R
            if (r4 != 0) goto L_0x0063
            boolean r4 = r3.m156b((androidx.appcompat.app.C0036g.C0054o) r2, (android.view.KeyEvent) r5)
            if (r4 == 0) goto L_0x0063
            androidx.appcompat.widget.x r4 = r3.f194q
            boolean r4 = r4.mo766e()
            goto L_0x006a
        L_0x003c:
            androidx.appcompat.widget.x r4 = r3.f194q
            boolean r4 = r4.mo764d()
            goto L_0x006a
        L_0x0043:
            boolean r4 = r2.f239o
            if (r4 != 0) goto L_0x0065
            boolean r4 = r2.f238n
            if (r4 == 0) goto L_0x004c
            goto L_0x0065
        L_0x004c:
            boolean r4 = r2.f237m
            if (r4 == 0) goto L_0x0063
            boolean r4 = r2.f242r
            if (r4 == 0) goto L_0x005b
            r2.f237m = r1
            boolean r4 = r3.m156b((androidx.appcompat.app.C0036g.C0054o) r2, (android.view.KeyEvent) r5)
            goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            if (r4 == 0) goto L_0x0063
            r3.m148a((androidx.appcompat.app.C0036g.C0054o) r2, (android.view.KeyEvent) r5)
            r4 = 1
            goto L_0x006a
        L_0x0063:
            r4 = 0
            goto L_0x006a
        L_0x0065:
            boolean r4 = r2.f239o
            r3.mo176a((androidx.appcompat.app.C0036g.C0054o) r2, (boolean) r0)
        L_0x006a:
            if (r4 == 0) goto L_0x0083
            android.content.Context r5 = r3.f187j
            java.lang.String r0 = "audio"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007c
            r5.playSoundEffect(r1)
            goto L_0x0083
        L_0x007c:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r5, r0)
        L_0x0083:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0036g.m160e(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: l */
    private void m161l(int i) {
        this.f180Z = (1 << i) | this.f180Z;
        if (!this.f179Y) {
            C0890v.m4757a(this.f188k.getDecorView(), this.f181a0);
            this.f179Y = true;
        }
    }

    /* renamed from: m */
    private int m162m(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: v */
    private void m163v() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f155A.findViewById(16908290);
        View decorView = this.f188k.getDecorView();
        contentFrameLayout.mo918a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f187j.obtainStyledAttributes(C0663j.AppCompatTheme);
        obtainStyledAttributes.getValue(C0663j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0663j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0663j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0663j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0663j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0663j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0663j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0663j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0663j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0663j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: w */
    private int m164w() {
        int i = this.f173S;
        return i != -100 ? i : C0035f.m117l();
    }

    /* renamed from: x */
    private void m165x() {
        C0050l lVar = this.f177W;
        if (lVar != null) {
            lVar.mo232a();
        }
        C0050l lVar2 = this.f178X;
        if (lVar2 != null) {
            lVar2.mo232a();
        }
    }

    /* renamed from: y */
    private ViewGroup m166y() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f187j.obtainStyledAttributes(C0663j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C0663j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(C0663j.AppCompatTheme_windowNoTitle, false)) {
                mo158b(1);
            } else if (obtainStyledAttributes.getBoolean(C0663j.AppCompatTheme_windowActionBar, false)) {
                mo158b(108);
            }
            if (obtainStyledAttributes.getBoolean(C0663j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo158b(109);
            }
            if (obtainStyledAttributes.getBoolean(C0663j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo158b(10);
            }
            this.f163I = obtainStyledAttributes.getBoolean(C0663j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            m141A();
            this.f188k.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f187j);
            if (this.f164J) {
                viewGroup = (ViewGroup) from.inflate(this.f162H ? C0660g.abc_screen_simple_overlay_action_mode : C0660g.abc_screen_simple, (ViewGroup) null);
                if (Build.VERSION.SDK_INT >= 21) {
                    C0890v.m4756a((View) viewGroup, (C0886r) new C0039c());
                } else {
                    ((C0154b0) viewGroup).setOnFitSystemWindowsListener(new C0040d());
                }
            } else if (this.f163I) {
                viewGroup = (ViewGroup) from.inflate(C0660g.abc_dialog_title_material, (ViewGroup) null);
                this.f161G = false;
                this.f160F = false;
            } else if (this.f160F) {
                TypedValue typedValue = new TypedValue();
                this.f187j.getTheme().resolveAttribute(C0654a.actionBarTheme, typedValue, true);
                int i = typedValue.resourceId;
                viewGroup = (ViewGroup) LayoutInflater.from(i != 0 ? new C0688d(this.f187j, i) : this.f187j).inflate(C0660g.abc_screen_toolbar, (ViewGroup) null);
                this.f194q = (C0245x) viewGroup.findViewById(C0659f.decor_content_parent);
                this.f194q.setWindowCallback(mo198q());
                if (this.f161G) {
                    this.f194q.mo753a(109);
                }
                if (this.f158D) {
                    this.f194q.mo753a(2);
                }
                if (this.f159E) {
                    this.f194q.mo753a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.f194q == null) {
                    this.f156B = (TextView) viewGroup.findViewById(C0659f.title);
                }
                C0246x0.m1241b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0659f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f188k.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f188k.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0041e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f160F + ", windowActionBarOverlay: " + this.f161G + ", android:windowIsFloating: " + this.f163I + ", windowActionModeOverlay: " + this.f162H + ", windowNoTitle: " + this.f164J + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: z */
    private void m167z() {
        if (!this.f203z) {
            this.f155A = m166y();
            CharSequence p = mo197p();
            if (!TextUtils.isEmpty(p)) {
                C0245x xVar = this.f194q;
                if (xVar != null) {
                    xVar.setWindowTitle(p);
                } else if (mo201t() != null) {
                    mo201t().mo76a(p);
                } else {
                    TextView textView = this.f156B;
                    if (textView != null) {
                        textView.setText(p);
                    }
                }
            }
            m163v();
            mo175a(this.f155A);
            this.f203z = true;
            C0054o a = mo171a(0, false);
            if (this.f172R) {
                return;
            }
            if (a == null || a.f234j == null) {
                m161l(108);
            }
        }
    }

    /* renamed from: a */
    public <T extends View> T mo147a(int i) {
        m167z();
        return this.f188k.findViewById(i);
    }

    /* renamed from: a */
    public View mo170a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        AppCompatViewInflater appCompatViewInflater;
        boolean z2 = false;
        if (this.f185e0 == null) {
            String string = this.f187j.obtainStyledAttributes(C0663j.AppCompatTheme).getString(C0663j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.f185e0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.f185e0 = appCompatViewInflater;
        }
        if (f151g0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m150a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f185e0.createView(view, str, context, attributeSet, z, f151g0, true, C0244w0.m1228b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0054o mo171a(int i, boolean z) {
        C0054o[] oVarArr = this.f166L;
        if (oVarArr == null || oVarArr.length <= i) {
            C0054o[] oVarArr2 = new C0054o[(i + 1)];
            if (oVarArr != null) {
                System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
            }
            this.f166L = oVarArr2;
            oVarArr = oVarArr2;
        }
        C0054o oVar = oVarArr[i];
        if (oVar != null) {
            return oVar;
        }
        C0054o oVar2 = new C0054o(i);
        oVarArr[i] = oVar2;
        return oVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0054o mo172a(Menu menu) {
        C0054o[] oVarArr = this.f166L;
        int length = oVarArr != null ? oVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0054o oVar = oVarArr[i];
            if (oVar != null && oVar.f234j == menu) {
                return oVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0685b mo173a(C0685b.C0686a aVar) {
        C0034e eVar;
        if (aVar != null) {
            C0685b bVar = this.f197t;
            if (bVar != null) {
                bVar.mo274a();
            }
            C0046i iVar = new C0046i(aVar);
            C0026a d = mo162d();
            if (d != null) {
                this.f197t = d.mo74a((C0685b.C0686a) iVar);
                C0685b bVar2 = this.f197t;
                if (!(bVar2 == null || (eVar = this.f190m) == null)) {
                    eVar.mo111a(bVar2);
                }
            }
            if (this.f197t == null) {
                this.f197t = mo181b((C0685b.C0686a) iVar);
            }
            return this.f197t;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo174a(int i, C0054o oVar, Menu menu) {
        if (menu == null) {
            if (oVar == null && i >= 0) {
                C0054o[] oVarArr = this.f166L;
                if (i < oVarArr.length) {
                    oVar = oVarArr[i];
                }
            }
            if (oVar != null) {
                menu = oVar.f234j;
            }
        }
        if ((oVar == null || oVar.f239o) && !this.f172R) {
            this.f189l.mo3941a().onPanelClosed(i, menu);
        }
    }

    /* renamed from: a */
    public void mo148a(Context context) {
        m153a(false);
        this.f169O = true;
    }

    /* renamed from: a */
    public void mo149a(Configuration configuration) {
        C0026a d;
        if (this.f160F && this.f203z && (d = mo162d()) != null) {
            d.mo75a(configuration);
        }
        C0192i.m963b().mo1388a(this.f187j);
        m153a(false);
    }

    /* renamed from: a */
    public void mo150a(Bundle bundle) {
        this.f169O = true;
        m153a(false);
        m141A();
        Object obj = this.f186i;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0290f.m1448b((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0026a t = mo201t();
                if (t == null) {
                    this.f182b0 = true;
                } else {
                    t.mo80c(true);
                }
            }
        }
        this.f170P = true;
    }

    /* renamed from: a */
    public void mo151a(View view) {
        m167z();
        ViewGroup viewGroup = (ViewGroup) this.f155A.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f189l.mo3941a().onContentChanged();
    }

    /* renamed from: a */
    public void mo152a(View view, ViewGroup.LayoutParams layoutParams) {
        m167z();
        ((ViewGroup) this.f155A.findViewById(16908290)).addView(view, layoutParams);
        this.f189l.mo3941a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo175a(ViewGroup viewGroup) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo176a(C0054o oVar, boolean z) {
        ViewGroup viewGroup;
        C0245x xVar;
        if (!z || oVar.f225a != 0 || (xVar = this.f194q) == null || !xVar.mo762c()) {
            WindowManager windowManager = (WindowManager) this.f187j.getSystemService("window");
            if (!(windowManager == null || !oVar.f239o || (viewGroup = oVar.f231g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo174a(oVar.f225a, oVar, (Menu) null);
                }
            }
            oVar.f237m = false;
            oVar.f238n = false;
            oVar.f239o = false;
            oVar.f232h = null;
            oVar.f241q = true;
            if (this.f167M == oVar) {
                this.f167M = null;
                return;
            }
            return;
        }
        mo182b(oVar.f234j);
    }

    /* renamed from: a */
    public void mo177a(C0081g gVar) {
        m149a(gVar, true);
    }

    /* renamed from: a */
    public final void mo153a(CharSequence charSequence) {
        this.f193p = charSequence;
        C0245x xVar = this.f194q;
        if (xVar != null) {
            xVar.setWindowTitle(charSequence);
        } else if (mo201t() != null) {
            mo201t().mo76a(charSequence);
        } else {
            TextView textView = this.f156B;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: a */
    public boolean mo154a() {
        return m153a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo178a(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & PropertyFlags.ID_SELF_ASSIGNABLE) == 0) {
                z = false;
            }
            this.f168N = z;
        } else if (i == 82) {
            m159d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo179a(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f186i;
        boolean z = true;
        if (((obj instanceof C0853e.C0854a) || (obj instanceof C0056h)) && (decorView = this.f188k.getDecorView()) != null && C0853e.m4594a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f189l.mo3941a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo178a(keyCode, keyEvent) : mo184c(keyCode, keyEvent);
    }

    /* renamed from: a */
    public boolean mo180a(C0081g gVar, MenuItem menuItem) {
        C0054o a;
        Window.Callback q = mo198q();
        if (q == null || this.f172R || (a = mo172a((Menu) gVar.mo500m())) == null) {
            return false;
        }
        return q.onMenuItemSelected(a.f225a, menuItem);
    }

    /* renamed from: b */
    public int mo155b() {
        return this.f173S;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p006b.p007a.p014o.C0685b mo181b(p006b.p007a.p014o.C0685b.C0686a r8) {
        /*
            r7 = this;
            r7.mo192m()
            b.a.o.b r0 = r7.f197t
            if (r0 == 0) goto L_0x000a
            r0.mo274a()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.C0036g.C0046i
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.g$i r0 = new androidx.appcompat.app.g$i
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.e r0 = r7.f190m
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f172R
            if (r2 != 0) goto L_0x0022
            b.a.o.b r0 = r0.mo108a((p006b.p007a.p014o.C0685b.C0686a) r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f197t = r0
            goto L_0x0165
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f198u
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d6
            boolean r0 = r7.f163I
            if (r0 == 0) goto L_0x00b7
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f187j
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p006b.p007a.C0654a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f187j
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            b.a.o.d r4 = new b.a.o.d
            android.content.Context r6 = r7.f187j
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f187j
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f198u = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p006b.p007a.C0654a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f199v = r5
            android.widget.PopupWindow r5 = r7.f199v
            r6 = 2
            androidx.core.widget.C0347h.m1731a((android.widget.PopupWindow) r5, (int) r6)
            android.widget.PopupWindow r5 = r7.f199v
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f198u
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f199v
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p006b.p007a.C0654a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f198u
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f199v
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.g$f r0 = new androidx.appcompat.app.g$f
            r0.<init>()
            r7.f200w = r0
            goto L_0x00d6
        L_0x00b7:
            android.view.ViewGroup r0 = r7.f155A
            int r4 = p006b.p007a.C0659f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d6
            android.content.Context r4 = r7.mo193n()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo1171a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f198u = r0
        L_0x00d6:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f198u
            if (r0 == 0) goto L_0x0165
            r7.mo192m()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f198u
            r0.mo732c()
            b.a.o.e r0 = new b.a.o.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f198u
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f198u
            android.widget.PopupWindow r6 = r7.f199v
            if (r6 != 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r3 = 0
        L_0x00f2:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo282c()
            boolean r8 = r8.mo217b(r0, r3)
            if (r8 == 0) goto L_0x0163
            r0.mo286i()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f198u
            r8.mo730a(r0)
            r7.f197t = r0
            boolean r8 = r7.mo202u()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012d
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f198u
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f198u
            b.g.k.z r8 = p006b.p026g.p035k.C0890v.m4742a(r8)
            r8.mo4694a((float) r0)
            r7.f201x = r8
            b.g.k.z r8 = r7.f201x
            androidx.appcompat.app.g$g r0 = new androidx.appcompat.app.g$g
            r0.<init>()
            r8.mo4697a((p006b.p026g.p035k.C0840a0) r0)
            goto L_0x0153
        L_0x012d:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f198u
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f198u
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f198u
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f198u
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0153
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f198u
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            p006b.p026g.p035k.C0890v.m4737H(r8)
        L_0x0153:
            android.widget.PopupWindow r8 = r7.f199v
            if (r8 == 0) goto L_0x0165
            android.view.Window r8 = r7.f188k
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f200w
            r8.post(r0)
            goto L_0x0165
        L_0x0163:
            r7.f197t = r1
        L_0x0165:
            b.a.o.b r8 = r7.f197t
            if (r8 == 0) goto L_0x0170
            androidx.appcompat.app.e r0 = r7.f190m
            if (r0 == 0) goto L_0x0170
            r0.mo111a((p006b.p007a.p014o.C0685b) r8)
        L_0x0170:
            b.a.o.b r8 = r7.f197t
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0036g.mo181b(b.a.o.b$a):b.a.o.b");
    }

    /* renamed from: b */
    public void mo156b(Bundle bundle) {
        m167z();
    }

    /* renamed from: b */
    public void mo157b(View view, ViewGroup.LayoutParams layoutParams) {
        m167z();
        ViewGroup viewGroup = (ViewGroup) this.f155A.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f189l.mo3941a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo182b(C0081g gVar) {
        if (!this.f165K) {
            this.f165K = true;
            this.f194q.mo776h();
            Window.Callback q = mo198q();
            if (q != null && !this.f172R) {
                q.onPanelClosed(108, gVar);
            }
            this.f165K = false;
        }
    }

    /* renamed from: b */
    public boolean mo158b(int i) {
        int m = m162m(i);
        if (this.f164J && m == 108) {
            return false;
        }
        if (this.f160F && m == 1) {
            this.f160F = false;
        }
        if (m == 1) {
            m145E();
            this.f164J = true;
            return true;
        } else if (m == 2) {
            m145E();
            this.f158D = true;
            return true;
        } else if (m == 5) {
            m145E();
            this.f159E = true;
            return true;
        } else if (m == 10) {
            m145E();
            this.f162H = true;
            return true;
        } else if (m == 108) {
            m145E();
            this.f160F = true;
            return true;
        } else if (m != 109) {
            return this.f188k.requestFeature(m);
        } else {
            m145E();
            this.f161G = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo183b(int i, KeyEvent keyEvent) {
        C0026a d = mo162d();
        if (d != null && d.mo77a(i, keyEvent)) {
            return true;
        }
        C0054o oVar = this.f167M;
        if (oVar == null || !m152a(oVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f167M == null) {
                C0054o a = mo171a(0, true);
                m156b(a, keyEvent);
                boolean a2 = m152a(a, keyEvent.getKeyCode(), keyEvent, 1);
                a.f237m = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        }
        C0054o oVar2 = this.f167M;
        if (oVar2 != null) {
            oVar2.f238n = true;
        }
        return true;
    }

    /* renamed from: c */
    public MenuInflater mo159c() {
        if (this.f192o == null) {
            m143C();
            C0026a aVar = this.f191n;
            this.f192o = new C0692g(aVar != null ? aVar.mo85h() : this.f187j);
        }
        return this.f192o;
    }

    /* renamed from: c */
    public void mo160c(int i) {
        m167z();
        ViewGroup viewGroup = (ViewGroup) this.f155A.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f187j).inflate(i, viewGroup);
        this.f189l.mo3941a().onContentChanged();
    }

    /* renamed from: c */
    public void mo161c(Bundle bundle) {
        if (this.f173S != -100) {
            f150f0.put(this.f186i.getClass(), Integer.valueOf(this.f173S));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo184c(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f168N;
            this.f168N = false;
            C0054o a = mo171a(0, false);
            if (a != null && a.f239o) {
                if (!z) {
                    mo176a(a, true);
                }
                return true;
            } else if (mo200s()) {
                return true;
            }
        } else if (i == 82) {
            m160e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public C0026a mo162d() {
        m143C();
        return this.f191n;
    }

    /* renamed from: d */
    public void mo163d(int i) {
        this.f174T = i;
    }

    /* renamed from: e */
    public void mo164e() {
        LayoutInflater from = LayoutInflater.from(this.f187j);
        if (from.getFactory() == null) {
            C0874f.m4687b(from, this);
        } else if (!(from.getFactory2() instanceof C0036g)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: f */
    public void mo165f() {
        C0026a d = mo162d();
        if (d == null || !d.mo86i()) {
            m161l(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo185f(int i) {
        mo176a(mo171a(i, true), true);
    }

    /* renamed from: g */
    public void mo166g() {
        C0035f.m113b((C0035f) this);
        if (this.f179Y) {
            this.f188k.getDecorView().removeCallbacks(this.f181a0);
        }
        this.f171Q = false;
        this.f172R = true;
        C0026a aVar = this.f191n;
        if (aVar != null) {
            aVar.mo87j();
        }
        m165x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo186g(int i) {
        C0054o a;
        C0054o a2 = mo171a(i, true);
        if (a2.f234j != null) {
            Bundle bundle = new Bundle();
            a2.f234j.mo473b(bundle);
            if (bundle.size() > 0) {
                a2.f243s = bundle;
            }
            a2.f234j.mo510s();
            a2.f234j.clear();
        }
        a2.f242r = true;
        a2.f241q = true;
        if ((i == 108 || i == 0) && this.f194q != null && (a = mo171a(0, false)) != null) {
            a.f237m = false;
            m156b(a, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo187h(int i) {
        C0050l o;
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        o = m142B();
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f187j.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                o = mo194o();
            }
            return o.mo230c();
        }
        return i;
    }

    /* renamed from: h */
    public void mo167h() {
        C0026a d = mo162d();
        if (d != null) {
            d.mo81d(true);
        }
    }

    /* renamed from: i */
    public void mo168i() {
        this.f171Q = true;
        mo154a();
        C0035f.m112a((C0035f) this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo188i(int i) {
        C0026a d;
        if (i == 108 && (d = mo162d()) != null) {
            d.mo79b(true);
        }
    }

    /* renamed from: j */
    public void mo169j() {
        this.f171Q = false;
        C0035f.m113b((C0035f) this);
        C0026a d = mo162d();
        if (d != null) {
            d.mo81d(false);
        }
        if (this.f186i instanceof Dialog) {
            m165x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo189j(int i) {
        if (i == 108) {
            C0026a d = mo162d();
            if (d != null) {
                d.mo79b(false);
            }
        } else if (i == 0) {
            C0054o a = mo171a(i, true);
            if (a.f239o) {
                mo176a(a, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo190k(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        ActionBarContextView actionBarContextView = this.f198u;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f198u.getLayoutParams();
            z = true;
            if (this.f198u.isShown()) {
                if (this.f183c0 == null) {
                    this.f183c0 = new Rect();
                    this.f184d0 = new Rect();
                }
                Rect rect = this.f183c0;
                Rect rect2 = this.f184d0;
                rect.set(0, i, 0, 0);
                C0246x0.m1239a(this.f155A, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f157C;
                    if (view == null) {
                        this.f157C = new View(this.f187j);
                        this.f157C.setBackgroundColor(this.f187j.getResources().getColor(C0656c.abc_input_method_navigation_guard));
                        this.f155A.addView(this.f157C, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f157C.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f157C == null) {
                    z = false;
                }
                if (!this.f162H && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = false;
            }
            if (z2) {
                this.f198u.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.f157C;
        if (view2 != null) {
            if (!z) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo191k() {
        C0081g gVar;
        C0245x xVar = this.f194q;
        if (xVar != null) {
            xVar.mo776h();
        }
        if (this.f199v != null) {
            this.f188k.getDecorView().removeCallbacks(this.f200w);
            if (this.f199v.isShowing()) {
                try {
                    this.f199v.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f199v = null;
        }
        mo192m();
        C0054o a = mo171a(0, false);
        if (a != null && (gVar = a.f234j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo192m() {
        C0902z zVar = this.f201x;
        if (zVar != null) {
            zVar.mo4699a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Context mo193n() {
        C0026a d = mo162d();
        Context h = d != null ? d.mo85h() : null;
        return h == null ? this.f187j : h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final C0050l mo194o() {
        if (this.f177W == null) {
            this.f177W = new C0052m(C0060k.m272a(this.f187j));
        }
        return this.f177W;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo170a(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final CharSequence mo197p() {
        Object obj = this.f186i;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f193p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Window.Callback mo198q() {
        return this.f188k.getCallback();
    }

    /* renamed from: r */
    public boolean mo199r() {
        return this.f202y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo200s() {
        C0685b bVar = this.f197t;
        if (bVar != null) {
            bVar.mo274a();
            return true;
        }
        C0026a d = mo162d();
        return d != null && d.mo83f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final C0026a mo201t() {
        return this.f191n;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f155A;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo202u() {
        /*
            r1 = this;
            boolean r0 = r1.f203z
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f155A
            if (r0 == 0) goto L_0x0010
            boolean r0 = p006b.p026g.p035k.C0890v.m4732C(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0036g.mo202u():boolean");
    }
}
