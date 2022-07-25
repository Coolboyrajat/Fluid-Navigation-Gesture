package com.p131fb.fluid.p148ui.p153h;

import android.app.Application;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.C0035f;
import androidx.fragment.app.C0401d;
import com.p131fb.fluid.p135l.C1734c;
import com.p131fb.fluid.utils.preferences.C2527h;
import java.util.List;
import kotlin.C3256e;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;
import p190io.objectbox.android.C3148R;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: com.fb.fluid.ui.h.b */
public final class C2494b implements C2493a {

    /* renamed from: b */
    static final /* synthetic */ C3208i[] f6287b;

    /* renamed from: a */
    private final C3256e f6288a;

    /* renamed from: com.fb.fluid.ui.h.b$a */
    static final class C2495a extends C3371l implements C3349a<C2527h> {

        /* renamed from: g */
        final /* synthetic */ Application f6289g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2495a(Application application) {
            super(0);
            this.f6289g = application;
        }

        public final C2527h invoke() {
            return new C2527h(this.f6289g);
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C2494b.class), "prefs", "getPrefs()Lcom/fb/fluid/utils/preferences/SharedPrefHelper;");
        C3384y.m12259a((C3379t) uVar);
        f6287b = new C3208i[]{uVar};
    }

    public C2494b(Application application) {
        C3370k.m12227b(application, "app");
        this.f6288a = C3258g.m11969a(new C2495a(application));
    }

    /* renamed from: e */
    private final C2527h m9318e() {
        C3256e eVar = this.f6288a;
        C3208i iVar = f6287b[0];
        return (C2527h) eVar.getValue();
    }

    /* renamed from: a */
    public void mo7361a(int i) {
        m9318e().mo7539l(i);
        C0035f.m115e(i);
    }

    /* renamed from: a */
    public void mo7362a(C0401d dVar) {
        C3370k.m12227b(dVar, "activity");
        dVar.setTheme(m9318e().mo7499L() ? C3148R.style.AppThemeBlack : C3148R.style.AppTheme);
        Window window = dVar.getWindow();
        C3370k.m12223a((Object) window, "window");
        View decorView = window.getDecorView();
        C3370k.m12223a((Object) decorView, "window.decorView");
        Window window2 = dVar.getWindow();
        C3370k.m12223a((Object) window2, "window");
        View decorView2 = window2.getDecorView();
        C3370k.m12223a((Object) decorView2, "window.decorView");
        decorView.setSystemUiVisibility(decorView2.getSystemUiVisibility() | PropertyFlags.INDEX_PARTIAL_SKIP_NULL | PropertyFlags.INDEX_PARTIAL_SKIP_ZERO | PropertyFlags.VIRTUAL);
    }

    /* renamed from: a */
    public void mo7363a(boolean z) {
        m9318e().mo7547p(z);
        int c = mo7366c();
        C0035f.m115e(1);
        C0035f.m115e(c);
    }

    /* renamed from: a */
    public boolean mo7364a() {
        return m9318e().mo7499L();
    }

    /* renamed from: b */
    public List<Integer> mo7365b() {
        boolean f = C1734c.f5038h.mo6477f();
        Integer valueOf = Integer.valueOf(C3148R.string.theme_mode_night);
        Integer valueOf2 = Integer.valueOf(C3148R.string.theme_mode_light);
        if (f) {
            return C3284j.m12074d(valueOf2, valueOf, Integer.valueOf(C3148R.string.theme_mode_system));
        }
        return C3284j.m12074d(valueOf2, valueOf);
    }

    /* renamed from: c */
    public int mo7366c() {
        return C0035f.m117l();
    }

    /* renamed from: d */
    public List<Integer> mo7367d() {
        if (C1734c.f5038h.mo6477f()) {
            return C3284j.m12074d(1, 2, -1);
        }
        return C3284j.m12074d(1, 2);
    }
}
