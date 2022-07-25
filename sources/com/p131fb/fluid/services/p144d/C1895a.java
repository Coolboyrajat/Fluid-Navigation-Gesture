package com.p131fb.fluid.services.p144d;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.p131fb.fluid.p135l.p139p.C1776l;
import com.p131fb.fluid.p135l.p143t.C1798b;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import kotlin.C3256e;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;
import p155d.p156a.C2790h;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p162q.C2827e;
import p155d.p156a.p162q.C2828f;
import p155d.p156a.p177v.C2964b;

/* renamed from: com.fb.fluid.services.d.a */
public final class C1895a {

    /* renamed from: e */
    static final /* synthetic */ C3208i[] f5290e;

    /* renamed from: a */
    private boolean f5291a;

    /* renamed from: b */
    private final C1798b<Integer> f5292b = new C1798b<>(0);

    /* renamed from: c */
    private final C3256e f5293c;

    /* renamed from: d */
    private C2810b f5294d;

    /* renamed from: com.fb.fluid.services.d.a$a */
    static final class C1896a extends C3371l implements C3349a<InputMethodManager> {

        /* renamed from: g */
        final /* synthetic */ Context f5295g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1896a(Context context) {
            super(0);
            this.f5295g = context;
        }

        public final InputMethodManager invoke() {
            Object systemService = this.f5295g.getSystemService("input_method");
            if (systemService != null) {
                return (InputMethodManager) systemService;
            }
            throw new C3269p("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* renamed from: com.fb.fluid.services.d.a$b */
    static final class C1897b<T, R> implements C2828f<T, R> {

        /* renamed from: a */
        final /* synthetic */ C1895a f5296a;

        C1897b(C1895a aVar) {
            this.f5296a = aVar;
        }

        /* renamed from: a */
        public final int mo6663a(Long l) {
            C3370k.m12227b(l, "it");
            return this.f5296a.mo6661b();
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
            return Integer.valueOf(mo6663a((Long) obj));
        }
    }

    /* renamed from: com.fb.fluid.services.d.a$c */
    static final class C1898c<T> implements C2827e<Integer> {

        /* renamed from: a */
        final /* synthetic */ C1895a f5297a;

        C1898c(C1895a aVar) {
            this.f5297a = aVar;
        }

        /* renamed from: a */
        public final void accept(Integer num) {
            C1798b b = this.f5297a.mo6661b();
            C3370k.m12223a((Object) num, "it");
            b.mo6588a(num);
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C1895a.class), "inputMethodManager", "getInputMethodManager()Landroid/view/inputmethod/InputMethodManager;");
        C3384y.m12259a((C3379t) uVar);
        f5290e = new C3208i[]{uVar};
    }

    public C1895a(Context context) {
        C3370k.m12227b(context, "context");
        this.f5293c = C3258g.m11969a(new C1896a(context));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final int mo6661b() {
        if (!this.f5291a) {
            return 0;
        }
        try {
            Method method = InputMethodManager.class.getMethod("getInputMethodWindowVisibleHeight", new Class[0]);
            C3370k.m12223a((Object) method, "InputMethodManager::clas…thodWindowVisibleHeight\")");
            Object invoke = method.invoke(m7763d(), new Object[0]);
            if (invoke != null) {
                return ((Integer) invoke).intValue();
            }
            throw new C3269p("null cannot be cast to non-null type kotlin.Int");
        } catch (Exception e) {
            C1776l.m7478a("kdh.gvkh.e: " + e.getMessage(), (String) null, 1, (Object) null);
            return 0;
        }
    }

    /* renamed from: d */
    private final InputMethodManager m7763d() {
        C3256e eVar = this.f5293c;
        C3208i iVar = f5290e[0];
        return (InputMethodManager) eVar.getValue();
    }

    /* renamed from: a */
    public final Unit mo6659a() {
        C2810b bVar = this.f5294d;
        if (bVar == null) {
            return null;
        }
        bVar.mo6027a();
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public final void mo6660a(boolean z) {
        this.f5291a = z;
    }

    /* renamed from: b */
    public final C1798b<Integer> m7766b() {
        return this.f5292b;
    }

    /* renamed from: c */
    public final void mo6662c() {
        if (this.f5291a) {
            this.f5294d = C2790h.m10993c(300, TimeUnit.MILLISECONDS, C2964b.m11437b()).mo8924b(new C1897b(this)).mo8926b(0).mo8901a().mo8927b(new C1898c(this));
        }
    }
}
