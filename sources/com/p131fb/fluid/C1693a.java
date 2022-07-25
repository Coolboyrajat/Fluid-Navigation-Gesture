package com.p131fb.fluid;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import com.p131fb.fluid.p135l.p139p.C1776l;
import kotlin.C3256e;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;
import p054c.p119h.p120a.C1455d;
import p054c.p119h.p120a.C1457e;
import p054c.p119h.p120a.p121h.C1464e;
import p054c.p119h.p120a.p121h.C1465f;
import p054c.p119h.p120a.p124k.C1522k;

/* renamed from: com.fb.fluid.a */
public abstract class C1693a<TInput, TOutput, TActionRunner extends C1522k<TInput, TOutput>, THelper extends C1465f<TInput, TOutput, TActionRunner>> extends Activity implements C1464e<TInput> {

    /* renamed from: h */
    static final /* synthetic */ C3208i[] f4911h;

    /* renamed from: f */
    private final C3256e f4912f = C3258g.m11969a(new C1694a(this));

    /* renamed from: g */
    private final boolean f4913g = true;

    /* renamed from: com.fb.fluid.a$a */
    static final class C1694a extends C3371l implements C3349a<THelper> {

        /* renamed from: g */
        final /* synthetic */ C1693a f4914g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1694a(C1693a aVar) {
            super(0);
            this.f4914g = aVar;
        }

        public final THelper invoke() {
            C1693a aVar = this.f4914g;
            return aVar.mo6361a(aVar);
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C1693a.class), "taskerHelper", "getTaskerHelper()Lcom/joaomgcd/taskerpluginlibrary/config/TaskerPluginConfigHelper;");
        C3384y.m12259a((C3379t) uVar);
        f4911h = new C3208i[]{uVar};
    }

    /* renamed from: a */
    public Context mo5912a() {
        return getApplicationContext();
    }

    /* renamed from: a */
    public abstract THelper mo6361a(C1464e<TInput> eVar);

    /* renamed from: c */
    public abstract int mo6363c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final THelper mo6364d() {
        C3256e eVar = this.f4912f;
        C3208i iVar = f4911h[0];
        return (C1465f) eVar.getValue();
    }

    /* renamed from: e */
    public boolean mo6365e() {
        return this.f4913g;
    }

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!mo6365e()) {
            mo6364d().mo5918a();
            return;
        }
        setContentView(mo6363c());
        mo6364d().mo5933l();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C3370k.m12227b(keyEvent, "event");
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        C1455d k = mo6364d().mo5932k();
        if (k instanceof C1457e) {
            C1776l.m7478a("Settings are not valid:\n\n" + ((C1457e) k).mo5911b(), (String) null, 1, (Object) null);
        }
        return k.mo5910a();
    }
}
