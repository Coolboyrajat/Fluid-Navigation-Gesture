package com.p131fb.fluid.p148ui.p149g.p151b;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C0401d;
import androidx.lifecycle.C0472b0;
import androidx.lifecycle.C0498u;
import androidx.lifecycle.C0508z;
import com.p131fb.fluid.p135l.p139p.C1770f;
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

/* renamed from: com.fb.fluid.ui.g.b.a0 */
public final class C2077a0 extends C2240k {

    /* renamed from: e0 */
    private HashMap f5679e0;

    /* renamed from: com.fb.fluid.ui.g.b.a0$a */
    static final class C2078a<T> implements C0498u<C2068g> {

        /* renamed from: a */
        final /* synthetic */ C2201j0 f5680a;

        /* renamed from: b */
        final /* synthetic */ C2077a0 f5681b;

        /* renamed from: com.fb.fluid.ui.g.b.a0$a$a */
        static final class C2079a extends C3371l implements C3349a<Unit> {

            /* renamed from: g */
            final /* synthetic */ C2078a f5682g;

            /* renamed from: h */
            final /* synthetic */ C2068g f5683h;

            /* renamed from: com.fb.fluid.ui.g.b.a0$a$a$a */
            static final class C2080a extends C3371l implements C3352d<C1041c, Integer, String, Unit> {

                /* renamed from: g */
                final /* synthetic */ C1041c f5684g;

                /* renamed from: h */
                final /* synthetic */ C0401d f5685h;

                /* renamed from: i */
                final /* synthetic */ C2079a f5686i;

                /* renamed from: j */
                final /* synthetic */ List f5687j;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2080a(C1041c cVar, C0401d dVar, C2079a aVar, List list) {
                    super(3);
                    this.f5684g = cVar;
                    this.f5685h = dVar;
                    this.f5686i = aVar;
                    this.f5687j = list;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
                    mo6953a((C1041c) obj, ((Number) obj2).intValue(), (String) obj3);
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo6953a(C1041c cVar, int i, String str) {
                    C3370k.m12227b(cVar, "<anonymous parameter 0>");
                    C3370k.m12227b(str, "<anonymous parameter 2>");
                    String a = ((C2198i) this.f5686i.f5683h).mo7050a();
                    int i2 = (a.hashCode() == 255877710 && a.equals("anim_sides")) ? 2 : 1;
                    int intValue = ((Number) this.f5687j.get(i)).intValue();
                    C0401d dVar = this.f5685h;
                    C3370k.m12223a((Object) dVar, "activity");
                    C1770f.m7463a(dVar).mo6352f().mo6589b().booleanValue();
                    if (0 == 0 || intValue == i2) {
                        String a2 = ((C2198i) this.f5686i.f5683h).mo7050a();
                        if (a2.hashCode() == 255877710 && a2.equals("anim_sides")) {
                            this.f5686i.f5682g.f5681b.mo6873D0().mo7500a(intValue);
                        } else {
                            this.f5686i.f5682g.f5681b.mo6873D0().mo7505b(intValue);
                        }
                        C2477u.m9269a(this.f5686i.f5682g.f5680a.mo7159g(), ((C2198i) this.f5686i.f5683h).mo7050a());
                        return;
                    }
                    Context context = this.f5684g.getContext();
                    C3370k.m12223a((Object) context, "context");
                    C1770f.m7465a(context, (int) C3148R.string.billing_pro_required, 0, 2, (Object) null);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2079a(C2078a aVar, C2068g gVar) {
                super(0);
                this.f5682g = aVar;
                this.f5683h = gVar;
            }

            public final void invoke() {
                List b = C3284j.m12070b((T[]) new Integer[]{3, 2, 4, 5, 1});
                C0401d u = this.f5682g.f5681b.mo2304u();
                if (u != null) {
                    C3370k.m12223a((Object) u, "activity");
                    C1041c cVar = new C1041c(u, (C1039a) null, 2, (C3366g) null);
                    String a = ((C2198i) this.f5683h).mo7050a();
                    C1041c.m5351a(cVar, Integer.valueOf((a.hashCode() == 255877710 && a.equals("anim_sides")) ? C3148R.string.pref_anim_sides : C3148R.string.pref_anim_bottom), (String) null, 2, (Object) null);
                    String a2 = ((C2198i) this.f5683h).mo7050a();
                    C1097b.m5497a(cVar, (Integer) null, C3284j.m12070b((T[]) new String[]{this.f5682g.f5680a.mo7058i().getString(C3148R.string.anim_none), this.f5682g.f5680a.mo7058i().getString(C3148R.string.anim_bubble), this.f5682g.f5680a.mo7058i().getString(C3148R.string.anim_teardrop), this.f5682g.f5680a.mo7058i().getString(C3148R.string.anim_plain_icon), this.f5682g.f5680a.mo7058i().getString(C3148R.string.anim_fluid)}), (int[]) null, b.indexOf(Integer.valueOf((a2.hashCode() == 255877710 && a2.equals("anim_sides")) ? this.f5682g.f5681b.mo6873D0().mo7504b() : this.f5682g.f5681b.mo6873D0().mo7508c())), false, new C2080a(cVar, u, this, b), 21, (Object) null);
                    cVar.show();
                }
            }
        }

        C2078a(C2201j0 j0Var, C2077a0 a0Var) {
            this.f5680a = j0Var;
            this.f5681b = a0Var;
        }

        /* renamed from: a */
        public final void mo2154a(C2068g gVar) {
            C2198i iVar = (C2198i) (!(gVar instanceof C2198i) ? null : gVar);
            if (iVar != null) {
                iVar.mo6943a(new C2079a(this, gVar));
            }
        }
    }

    /* renamed from: C0 */
    public void mo2351C0() {
        HashMap hashMap = this.f5679e0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: E0 */
    public C2201j0 m8430E0() {
        C0508z a = C0472b0.m2420b(this).mo2674a(C2201j0.class);
        C3370k.m12223a((Object) a, "ViewModelProviders.of(th…nalizationVM::class.java)");
        return (C2201j0) a;
    }

    /* renamed from: b */
    public void mo2248b(Bundle bundle) {
        super.mo2248b(bundle);
        C2201j0 E0 = m8430E0();
        E0.mo7059j().observe(this, new C2078a(E0, this));
    }

    /* renamed from: e */
    public View mo6945e(int i) {
        if (this.f5679e0 == null) {
            this.f5679e0 = new HashMap();
        }
        View view = (View) this.f5679e0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View T = mo2213T();
        if (T == null) {
            return null;
        }
        View findViewById = T.findViewById(i);
        this.f5679e0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo2279h0() {
        super.mo2279h0();
        mo2351C0();
    }
}
