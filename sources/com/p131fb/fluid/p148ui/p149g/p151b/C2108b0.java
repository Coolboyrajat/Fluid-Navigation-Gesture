package com.p131fb.fluid.p148ui.p149g.p151b;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C0401d;
import androidx.lifecycle.C0472b0;
import androidx.lifecycle.C0498u;
import androidx.lifecycle.C0508z;
import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;
import com.p131fb.fluid.p148ui.p149g.p152c.C2477u;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p056a.C1039a;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.p064t.C1097b;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.b.b0 */
public final class C2108b0 extends C2240k {

    /* renamed from: e0 */
    private HashMap f5734e0;

    /* renamed from: com.fb.fluid.ui.g.b.b0$a */
    static final class C2109a<T> implements C0498u<C2068g> {

        /* renamed from: a */
        final /* synthetic */ C2113c0 f5735a;

        /* renamed from: b */
        final /* synthetic */ C2108b0 f5736b;

        /* renamed from: com.fb.fluid.ui.g.b.b0$a$a */
        static final class C2110a extends C3371l implements C3349a<Unit> {

            /* renamed from: g */
            final /* synthetic */ C2109a f5737g;

            /* renamed from: h */
            final /* synthetic */ C2068g f5738h;

            /* renamed from: com.fb.fluid.ui.g.b.b0$a$a$a */
            static final class C2111a extends C3371l implements C3352d<C1041c, Integer, String, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2110a f5739g;

                /* renamed from: h */
                final /* synthetic */ List f5740h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2111a(C2110a aVar, List list) {
                    super(3);
                    this.f5739g = aVar;
                    this.f5740h = list;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
                    mo6980a((C1041c) obj, ((Number) obj2).intValue(), (String) obj3);
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo6980a(C1041c cVar, int i, String str) {
                    C3370k.m12227b(cVar, "<anonymous parameter 0>");
                    C3370k.m12227b(str, "<anonymous parameter 2>");
                    this.f5739g.f5737g.f5736b.mo6873D0().mo7527h(((Number) this.f5740h.get(i)).intValue());
                    C2477u.m9269a(this.f5739g.f5737g.f5735a.mo7159g(), "navbar_rotation_mode");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2110a(C2109a aVar, C2068g gVar) {
                super(0);
                this.f5737g = aVar;
                this.f5738h = gVar;
            }

            public final void invoke() {
                if (this.f5738h instanceof C2159e0) {
                    List b = C3284j.m12070b((T[]) new Integer[]{2, 0, 1});
                    C0401d x0 = this.f5737g.f5736b.mo2311x0();
                    C3370k.m12223a((Object) x0, "requireActivity()");
                    C1041c cVar = new C1041c(x0, (C1039a) null, 2, (C3366g) null);
                    C1041c.m5351a(cVar, Integer.valueOf(C3148R.string.pref_navbar_rotation_mode), (String) null, 2, (Object) null);
                    C1041c cVar2 = cVar;
                    C1097b.m5497a(cVar2, (Integer) null, C3284j.m12070b((T[]) new String[]{this.f5737g.f5736b.mo2224a((int) C3148R.string.pref_navbar_mode_tablet), this.f5737g.f5736b.mo2224a((int) C3148R.string.pref_navbar_mode_m), this.f5737g.f5736b.mo2224a((int) C3148R.string.pref_navbar_mode_n)}), (int[]) null, b.indexOf(Integer.valueOf(this.f5737g.f5736b.mo6873D0().mo7552t())), false, new C2111a(this, b), 21, (Object) null);
                    cVar.show();
                }
            }
        }

        C2109a(C2113c0 c0Var, C2108b0 b0Var) {
            this.f5735a = c0Var;
            this.f5736b = b0Var;
        }

        /* renamed from: a */
        public final void mo2154a(C2068g gVar) {
            gVar.mo6943a(new C2110a(this, gVar));
        }
    }

    /* renamed from: C0 */
    public void mo2351C0() {
        HashMap hashMap = this.f5734e0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: E0 */
    public C2113c0 m8503E0() {
        C0508z a = C0472b0.m2420b(this).mo2674a(C2113c0.class);
        C3370k.m12223a((Object) a, "ViewModelProviders.of(th…Bar3ButtonVM::class.java)");
        return (C2113c0) a;
    }

    /* renamed from: b */
    public void mo2248b(Bundle bundle) {
        super.mo2248b(bundle);
        C2113c0 E0 = m8503E0();
        E0.mo6982j().observe(this, new C2109a(E0, this));
    }

    /* renamed from: e */
    public View mo6945e(int i) {
        if (this.f5734e0 == null) {
            this.f5734e0 = new HashMap();
        }
        View view = (View) this.f5734e0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View T = mo2213T();
        if (T == null) {
            return null;
        }
        View findViewById = T.findViewById(i);
        this.f5734e0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo2279h0() {
        super.mo2279h0();
        mo2351C0();
    }
}
