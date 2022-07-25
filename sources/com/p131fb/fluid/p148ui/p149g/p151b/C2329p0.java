package com.p131fb.fluid.p148ui.p149g.p151b;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.C0401d;
import androidx.lifecycle.C0472b0;
import androidx.lifecycle.C0490o;
import androidx.lifecycle.C0508z;
import com.p131fb.fluid.p135l.p139p.C1770f;
import com.p131fb.fluid.p135l.p142s.C1795a;
import com.p131fb.fluid.p135l.p143t.C1797a;
import java.util.HashMap;
import java.util.Timer;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.p205x.p207d.C3370k;
import p155d.p156a.C2790h;
import p155d.p156a.p157n.p159c.C2803a;
import p155d.p156a.p162q.C2827e;
import p155d.p156a.p162q.C2830h;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.b.p0 */
public final class C2329p0 extends C2240k {
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public Timer f6023e0;

    /* renamed from: f0 */
    private HashMap f6024f0;

    /* renamed from: com.fb.fluid.ui.g.b.p0$a */
    static final class C2330a<V> implements Callable<T> {

        /* renamed from: f */
        final /* synthetic */ C2329p0 f6025f;

        C2330a(C2329p0 p0Var) {
            this.f6025f = p0Var;
        }

        public final boolean call() {
            C1795a.C1796a aVar = C1795a.f5111a;
            Context y0 = this.f6025f.mo2313y0();
            C3370k.m12223a((Object) y0, "requireContext()");
            return aVar.mo6586c(y0);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.p0$b */
    static final class C2331b<T> implements C2830h<Boolean> {

        /* renamed from: f */
        public static final C2331b f6026f = new C2331b();

        C2331b() {
        }

        /* renamed from: a */
        public final Boolean mo7171a(Boolean bool) {
            C3370k.m12227b(bool, "it");
            return bool;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo6042a(Object obj) {
            Boolean bool = (Boolean) obj;
            mo7171a(bool);
            return bool.booleanValue();
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.p0$c */
    static final class C2332c<T> implements C2827e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C2329p0 f6027a;

        C2332c(C2329p0 p0Var) {
            this.f6027a = p0Var;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C3370k.m12223a((Object) bool, "it");
            if (bool.booleanValue()) {
                Timer a = this.f6027a.f6023e0;
                if (a != null) {
                    a.cancel();
                }
                Context B = this.f6027a.mo2194B();
                if (B != null) {
                    C1770f.m7465a(B, (int) C3148R.string.toast_permission_granted, 0, 2, (Object) null);
                }
                C0401d u = this.f6027a.mo2304u();
                if (u != null) {
                    u.finish();
                }
            }
        }
    }

    /* renamed from: C0 */
    public void mo2351C0() {
        HashMap hashMap = this.f6024f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: E0 */
    public C2372s0 m8934E0() {
        C0508z a = C0472b0.m2420b(this).mo2674a(C2372s0.class);
        C3370k.m12223a((Object) a, "ViewModelProviders.of(this).get(WSSVM::class.java)");
        return (C2372s0) a;
    }

    /* renamed from: e */
    public View mo6945e(int i) {
        if (this.f6024f0 == null) {
            this.f6024f0 = new HashMap();
        }
        View view = (View) this.f6024f0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View T = mo2213T();
        if (T == null) {
            return null;
        }
        View findViewById = T.findViewById(i);
        this.f6024f0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo2279h0() {
        super.mo2279h0();
        mo2351C0();
    }

    /* renamed from: j0 */
    public void mo2285j0() {
        super.mo2285j0();
        Timer timer = this.f6023e0;
        if (timer != null) {
            timer.cancel();
        }
    }

    /* renamed from: l0 */
    public void mo2289l0() {
        super.mo2289l0();
        C2790h a = C2790h.m10992a(new C2330a(this)).mo8903a(700, TimeUnit.MILLISECONDS).mo8930d().mo8925b(C2331b.f6026f).mo8907a(C2803a.m11054a());
        C3370k.m12223a((Object) a, "Observable\n             …dSchedulers.mainThread())");
        C1797a.m7557a(a, (C0490o) this).mo6030a(new C2332c(this));
    }
}
