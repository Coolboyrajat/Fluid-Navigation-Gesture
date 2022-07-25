package com.p131fb.fluid.services.p145e;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.WindowManager;
import com.p131fb.fluid.p135l.p139p.C1773i;
import com.p131fb.fluid.p135l.p139p.C1776l;
import com.p131fb.fluid.p135l.p143t.C1798b;
import com.p131fb.fluid.p148ui.views.C2513b;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p192b0.C3204e;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3368i;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3384y;
import p155d.p156a.p160o.C2809a;
import p155d.p156a.p162q.C2827e;

/* renamed from: com.fb.fluid.services.e.a */
public abstract class C1917a {

    /* renamed from: a */
    private WindowManager.LayoutParams f5338a = new WindowManager.LayoutParams();

    /* renamed from: b */
    private final WindowManager f5339b;

    /* renamed from: c */
    private Handler f5340c;

    /* renamed from: d */
    private int f5341d;

    /* renamed from: e */
    private final C2513b f5342e;

    /* renamed from: f */
    private final C2809a f5343f;

    /* renamed from: g */
    private final C1798b<Boolean> f5344g;

    /* renamed from: h */
    private final C1798b<Boolean> f5345h;

    /* renamed from: i */
    private final C2827e<Boolean> f5346i;

    /* renamed from: j */
    private final Context f5347j;

    /* renamed from: com.fb.fluid.services.e.a$a */
    static final /* synthetic */ class C1918a extends C3368i implements C3349a<Unit> {
        C1918a(C1917a aVar) {
            super(0, aVar);
        }

        /* renamed from: b */
        public final String mo6062b() {
            return "addToWindowManagerRun";
        }

        /* renamed from: h */
        public final C3204e mo6063h() {
            return C3384y.m12254a(C1917a.class);
        }

        public final void invoke() {
            ((C1917a) this.f8030g).mo6721o();
        }

        /* renamed from: j */
        public final String mo6064j() {
            return "addToWindowManagerRun()V";
        }
    }

    /* renamed from: com.fb.fluid.services.e.a$b */
    static final class C1919b<T> implements C2827e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C1917a f5348a;

        C1919b(C1917a aVar) {
            this.f5348a = aVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            if (!bool.booleanValue()) {
                this.f5348a.mo6698c();
            } else {
                this.f5348a.mo6709m();
            }
        }
    }

    public C1917a(Context context) {
        C3370k.m12227b(context, "context");
        this.f5347j = context;
        Object systemService = this.f5347j.getSystemService("window");
        if (systemService != null) {
            this.f5339b = (WindowManager) systemService;
            this.f5342e = new C2513b(this.f5347j, (AttributeSet) null, 0, 6, (C3366g) null);
            this.f5343f = new C2809a();
            this.f5344g = new C1798b<>(false);
            this.f5345h = new C1798b<>(false);
            this.f5346i = new C1919b(this);
            this.f5342e.setVisibility(8);
            return;
        }
        throw new C3269p("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void mo6721o() {
        boolean z = true;
        try {
            this.f5339b.addView(this.f5342e, mo6702g());
        } catch (IllegalStateException e) {
            C1776l.m7478a("atm.1 " + e.getMessage(), (String) null, 1, (Object) null);
        } catch (Exception e2) {
            mo6709m();
            C1776l.m7478a(this.f5341d + " atm.2 " + e2.getMessage(), (String) null, 1, (Object) null);
            this.f5341d = this.f5341d + 1;
            z = false;
        }
        this.f5345h.mo6588a(Boolean.valueOf(z));
        if (!z && this.f5341d < 5) {
            this.f5340c = C1773i.m7473a(1000, new C1918a(this));
        }
    }

    /* renamed from: c */
    public void mo6698c() {
        C1773i.m7474a(this.f5340c);
        this.f5341d = 0;
        if (!this.f5345h.mo6589b().booleanValue()) {
            mo6721o();
        }
    }

    /* renamed from: d */
    public final void mo6699d() {
        mo6708l();
    }

    /* renamed from: e */
    public final C2827e<Boolean> mo6700e() {
        return this.f5346i;
    }

    /* renamed from: f */
    public final Context mo6701f() {
        return this.f5347j;
    }

    /* renamed from: g */
    public abstract WindowManager.LayoutParams mo6702g();

    /* renamed from: h */
    public final C2513b mo6703h() {
        return this.f5342e;
    }

    /* renamed from: i */
    public final C2809a mo6704i() {
        return this.f5343f;
    }

    public final C1798b<Boolean> isVisible() {
        return this.f5344g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final WindowManager mo6706j() {
        return this.f5339b;
    }

    /* renamed from: k */
    public final C1798b<Boolean> mo6707k() {
        return this.f5345h;
    }

    /* renamed from: l */
    public void mo6708l() {
        mo6709m();
        this.f5343f.mo8948c();
    }

    /* renamed from: m */
    public void mo6709m() {
        try {
            this.f5339b.removeView(this.f5342e);
            this.f5345h.mo6588a(false);
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    public final void mo6710n() {
        try {
            this.f5338a = mo6702g();
            if (this.f5345h.mo6589b().booleanValue()) {
                this.f5339b.updateViewLayout(this.f5342e, this.f5338a);
            }
        } catch (Exception e) {
            C1776l.m7478a("fw.e.1 " + e.getMessage(), (String) null, 1, (Object) null);
        }
    }
}
