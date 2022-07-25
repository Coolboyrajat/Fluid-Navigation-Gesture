package com.p131fb.fluid.p148ui.p149g.p151b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C0401d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0464a0;
import androidx.lifecycle.C0472b0;
import androidx.lifecycle.C0498u;
import androidx.lifecycle.C0508z;
import com.p131fb.fluid.data.C1702a;
import com.p131fb.fluid.data.C1706c;
import com.p131fb.fluid.p135l.C1729a;
import com.p131fb.fluid.p135l.p137n.C1761a;
import com.p131fb.fluid.p135l.p139p.C1770f;
import com.p131fb.fluid.p135l.p139p.C1776l;
import com.p131fb.fluid.p148ui.ActivitySettings;
import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;
import java.util.HashMap;
import kotlin.C3261j;
import kotlin.C3268o;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p056a.C1039a;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.p063s.C1086a;
import p054c.p083e.p104c.C1271e;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.b.a */
public final class C2069a extends C2240k {

    /* renamed from: f0 */
    public static final C2070a f5670f0 = new C2070a((C3366g) null);

    /* renamed from: e0 */
    private HashMap f5671e0;

    /* renamed from: com.fb.fluid.ui.g.b.a$a */
    public static final class C2070a {
        private C2070a() {
        }

        public /* synthetic */ C2070a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2069a mo6946a(Bundle bundle) {
            C2069a aVar = new C2069a();
            aVar.mo2290m(bundle);
            return aVar;
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.a$b */
    static final class C2071b<T> implements C0498u<C2068g> {

        /* renamed from: a */
        final /* synthetic */ C2069a f5672a;

        /* renamed from: com.fb.fluid.ui.g.b.a$b$a */
        static final class C2072a extends C3371l implements C3349a<Unit> {

            /* renamed from: g */
            final /* synthetic */ C2071b f5673g;

            /* renamed from: h */
            final /* synthetic */ C2068g f5674h;

            /* renamed from: com.fb.fluid.ui.g.b.a$b$a$a */
            static final class C2073a extends C3371l implements C3351c<Integer, Intent, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2072a f5675g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2073a(C2072a aVar) {
                    super(2);
                    this.f5675g = aVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    mo6948a(((Number) obj).intValue(), (Intent) obj2);
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo6948a(int i, Intent intent) {
                    if (i == -1) {
                        C1706c cVar = null;
                        C1706c cVar2 = intent != null ? (C1706c) intent.getParcelableExtra("pkg_name") : null;
                        if (cVar2 instanceof C1706c) {
                            cVar = cVar2;
                        }
                        if (cVar != null) {
                            this.f5675g.f5673g.f5672a.mo2311x0().setResult(-1, new Intent().putExtra("action_type", ((C2122d) this.f5675g.f5674h).mo6989a()).putExtra("action_data", cVar.packageName));
                            this.f5675g.f5673g.f5672a.mo2311x0().finish();
                        }
                    }
                }
            }

            /* renamed from: com.fb.fluid.ui.g.b.a$b$a$b */
            static final class C2074b extends C3371l implements C3351c<Integer, Intent, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2072a f5676g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2074b(C2072a aVar) {
                    super(2);
                    this.f5676g = aVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    mo6949a(((Number) obj).intValue(), (Intent) obj2);
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo6949a(int i, Intent intent) {
                    String str;
                    if (i == -1) {
                        C1702a aVar = null;
                        C1702a aVar2 = intent != null ? (C1702a) intent.getParcelableExtra("shortcut_data") : null;
                        if (aVar2 instanceof C1702a) {
                            aVar = aVar2;
                        }
                        if (aVar != null) {
                            C0401d x0 = this.f5676g.f5673g.f5672a.mo2311x0();
                            Intent putExtra = new Intent().putExtra("action_type", ((C2122d) this.f5676g.f5674h).mo6989a());
                            try {
                                str = new C1271e().mo5637a((Object) aVar);
                            } catch (Exception unused) {
                                str = BuildConfig.FLAVOR;
                            }
                            x0.setResult(-1, putExtra.putExtra("action_data", str));
                            this.f5676g.f5673g.f5672a.mo2311x0().finish();
                        }
                    }
                }
            }

            /* renamed from: com.fb.fluid.ui.g.b.a$b$a$c */
            static final class C2075c extends C3371l implements C3351c<C1041c, CharSequence, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2072a f5677g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2075c(C2072a aVar) {
                    super(2);
                    this.f5677g = aVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    mo6950a((C1041c) obj, (CharSequence) obj2);
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo6950a(C1041c cVar, CharSequence charSequence) {
                    C3370k.m12227b(cVar, "<anonymous parameter 0>");
                    C3370k.m12227b(charSequence, "txt");
                    this.f5677g.f5673g.f5672a.mo2311x0().setResult(-1, new Intent().putExtra("action_type", ((C2122d) this.f5677g.f5674h).mo6989a()).putExtra("action_data", charSequence.toString()));
                    this.f5677g.f5673g.f5672a.mo2311x0().finish();
                }
            }

            /* renamed from: com.fb.fluid.ui.g.b.a$b$a$d */
            static final class C2076d extends C3371l implements C3351c<Integer, Intent, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2072a f5678g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2076d(C2072a aVar) {
                    super(2);
                    this.f5678g = aVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    return mo6951a(((Number) obj).intValue(), (Intent) obj2);
                }

                /* renamed from: a */
                public final Unit mo6951a(int i, Intent intent) {
                    if (i == -1) {
                        if (intent == null || !intent.hasExtra("android.intent.extra.shortcut.INTENT")) {
                            Context B = this.f5678g.f5673g.f5672a.mo2194B();
                            if (B != null) {
                                C1770f.m7465a(B, (int) C3148R.string.unsupported_shortcut_oreo, 0, 2, (Object) null);
                            }
                        } else {
                            C1729a.C1730a aVar = C1729a.f5027a;
                            Context y0 = this.f5678g.f5673g.f5672a.mo2313y0();
                            C3370k.m12223a((Object) y0, "requireContext()");
                            C1702a a = aVar.mo6465a(y0, intent);
                            if (a != null) {
                                this.f5678g.f5673g.f5672a.mo2311x0().setResult(-1, new Intent().putExtra("shortcut_data", a));
                            }
                        }
                    }
                    C0401d u = this.f5678g.f5673g.f5672a.mo2304u();
                    if (u == null) {
                        return null;
                    }
                    u.finish();
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2072a(C2071b bVar, C2068g gVar) {
                super(0);
                this.f5673g = bVar;
                this.f5674h = gVar;
            }

            public final void invoke() {
                C0401d dVar;
                C2068g gVar = this.f5674h;
                if (gVar instanceof C2122d) {
                    int a = ((C2122d) gVar).mo6989a();
                    if (a == 14) {
                        ActivitySettings.C1993b bVar = ActivitySettings.f5563E;
                        C0401d x0 = this.f5673g.f5672a.mo2311x0();
                        C3370k.m12223a((Object) x0, "requireActivity()");
                        bVar.mo6841a(x0, 24, 422, new C3261j[]{C3268o.m11989a("type", 1), C3268o.m11989a("app_show_all", false), C3268o.m11989a("res_title", Integer.valueOf(C3148R.string.tab_app))}, new C2073a(this));
                        return;
                    } else if (a == 15) {
                        ActivitySettings.C1993b bVar2 = ActivitySettings.f5563E;
                        C0401d x02 = this.f5673g.f5672a.mo2311x0();
                        C3370k.m12223a((Object) x02, "requireActivity()");
                        bVar2.mo6841a(x02, 24, 431, new C3261j[]{C3268o.m11989a("type", 2), C3268o.m11989a("res_title", Integer.valueOf(C3148R.string.tab_shortcut))}, new C2074b(this));
                        return;
                    } else if (a != 28) {
                        this.f5673g.f5672a.mo2311x0().setResult(-1, new Intent().putExtra("action_type", ((C2122d) this.f5674h).mo6989a()));
                        dVar = this.f5673g.f5672a.mo2311x0();
                    } else {
                        C0401d x03 = this.f5673g.f5672a.mo2311x0();
                        C3370k.m12223a((Object) x03, "requireActivity()");
                        C1041c cVar = new C1041c(x03, (C1039a) null, 2, (C3366g) null);
                        C1086a.m5474a(cVar, (String) null, (Integer) null, (CharSequence) null, (Integer) null, 2, (Integer) null, false, false, new C2075c(this), 239, (Object) null);
                        C1041c.m5351a(cVar, Integer.valueOf(C3148R.string.action_keycode), (String) null, 2, (Object) null);
                        cVar.show();
                        return;
                    }
                } else if (gVar instanceof C2200j) {
                    dVar = this.f5673g.f5672a.mo2311x0();
                    dVar.setResult(-1, new Intent().putExtra("pkg_name", ((C2200j) this.f5674h).mo7054a()));
                } else if (gVar instanceof C2258l0) {
                    try {
                        C0401d x04 = this.f5673g.f5672a.mo2311x0();
                        if (!(x04 instanceof C1761a)) {
                            x04 = null;
                        }
                        C1761a aVar = (C1761a) x04;
                        if (aVar != null) {
                            aVar.mo6530a(((C2258l0) this.f5674h).mo7110a(), 123, new C2076d(this));
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        C1776l.m7478a("apf.se.e1 " + e.getMessage(), (String) null, 1, (Object) null);
                        Context B = this.f5673g.f5672a.mo2194B();
                        if (B != null) {
                            C1770f.m7465a(B, (int) C3148R.string.unsupported_shortcut_oreo, 0, 2, (Object) null);
                        }
                        dVar = this.f5673g.f5672a.mo2304u();
                        if (dVar == null) {
                            return;
                        }
                    }
                } else {
                    return;
                }
                dVar.finish();
            }
        }

        C2071b(C2069a aVar) {
            this.f5672a = aVar;
        }

        /* renamed from: a */
        public final void mo2154a(C2068g gVar) {
            gVar.mo6943a(new C2072a(this, gVar));
        }
    }

    /* renamed from: F0 */
    private final boolean m8407F0() {
        Bundle z = mo2314z();
        if (z != null) {
            return z.getBoolean("all_apps");
        }
        return true;
    }

    /* renamed from: G0 */
    private final boolean m8408G0() {
        Bundle z = mo2314z();
        if (z != null) {
            return z.getBoolean("app_show_all");
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getStringArrayList("filter_out_pkg");
     */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList<java.lang.String> m8409H0() {
        /*
            r2 = this;
            android.os.Bundle r0 = r2.mo2314z()
            if (r0 == 0) goto L_0x000f
            java.lang.String r1 = "filter_out_pkg"
            java.util.ArrayList r0 = r0.getStringArrayList(r1)
            if (r0 == 0) goto L_0x000f
            goto L_0x0014
        L_0x000f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.p148ui.p149g.p151b.C2069a.m8409H0():java.util.ArrayList");
    }

    /* renamed from: I0 */
    private final int m8410I0() {
        Bundle z = mo2314z();
        if (z != null) {
            return z.getInt("type");
        }
        return 0;
    }

    /* renamed from: C0 */
    public void mo2351C0() {
        HashMap hashMap = this.f5671e0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: E0 */
    public C2081b m8413E0() {
        C0401d x0 = mo2311x0();
        C3370k.m12223a((Object) x0, "requireActivity()");
        C0508z a = C0472b0.m2417a((Fragment) this, (C0464a0.C0466b) new C2112c(C1770f.m7463a(x0), m8410I0(), m8407F0(), m8408G0(), m8409H0())).mo2674a(C2081b.class);
        C3370k.m12223a((Object) a, "ViewModelProviders.of(th…tionPickerVM::class.java)");
        return (C2081b) a;
    }

    /* renamed from: b */
    public void mo2248b(Bundle bundle) {
        super.mo2248b(bundle);
        m8413E0().mo6956k().observe(this, new C2071b(this));
    }

    /* renamed from: e */
    public View mo6945e(int i) {
        if (this.f5671e0 == null) {
            this.f5671e0 = new HashMap();
        }
        View view = (View) this.f5671e0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View T = mo2213T();
        if (T == null) {
            return null;
        }
        View findViewById = T.findViewById(i);
        this.f5671e0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo2279h0() {
        super.mo2279h0();
        mo2351C0();
    }
}
