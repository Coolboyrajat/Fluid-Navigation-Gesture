package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ProgressBar;
import androidx.fragment.app.C0401d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0498u;
import com.p131fb.fluid.C1718g;
import com.p131fb.fluid.CapacitiveKeysService;
import com.p131fb.fluid.data.C1706c;
import com.p131fb.fluid.data.Trigger;
import com.p131fb.fluid.p135l.C1741h;
import com.p131fb.fluid.p135l.p139p.C1764a;
import com.p131fb.fluid.p135l.p139p.C1770f;
import com.p131fb.fluid.p135l.p139p.C1775k;
import com.p131fb.fluid.p148ui.ActivitySettings;
import com.p131fb.fluid.p148ui.p149g.p150a.C2061a;
import com.p131fb.fluid.p148ui.p149g.p150a.C2062b;
import com.p131fb.fluid.p148ui.p149g.p150a.C2064c;
import com.p131fb.fluid.p148ui.p149g.p150a.C2065d;
import com.p131fb.fluid.p148ui.p149g.p150a.C2066e;
import com.p131fb.fluid.p148ui.p149g.p150a.C2067f;
import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;
import com.p131fb.fluid.p148ui.p149g.p152c.C2409b;
import com.p131fb.fluid.p148ui.p149g.p152c.C2422b0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2428c0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2430d0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2439g;
import com.p131fb.fluid.p148ui.p149g.p152c.C2441h;
import com.p131fb.fluid.p148ui.p149g.p152c.C2444h0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2453j;
import com.p131fb.fluid.p148ui.p149g.p152c.C2460l;
import com.p131fb.fluid.p148ui.p149g.p152c.C2464n;
import com.p131fb.fluid.p148ui.p149g.p152c.C2467q;
import com.p131fb.fluid.p148ui.p149g.p152c.C2479v;
import com.p131fb.fluid.p148ui.p149g.p152c.C2487y;
import com.p131fb.fluid.p148ui.views.ExtRecyclerView;
import com.p131fb.fluid.utils.preferences.C2527h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C3256e;
import kotlin.C3261j;
import kotlin.C3265l;
import kotlin.C3268o;
import kotlin.Unit;
import kotlin.p192b0.C3208i;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p197u.p199i.p200a.C3328b;
import kotlin.p197u.p199i.p200a.C3332f;
import kotlin.p197u.p199i.p200a.C3339l;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p206c.C3353e;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;
import kotlinx.coroutines.C3412d;
import kotlinx.coroutines.C3418e0;
import kotlinx.coroutines.C3422f0;
import kotlinx.coroutines.C3430h0;
import kotlinx.coroutines.C3499j1;
import kotlinx.coroutines.C3536t0;
import kotlinx.coroutines.C3556z;
import p054c.p055a.p056a.C1039a;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.p060q.C1068g;
import p054c.p055a.p067b.C1111d;
import p054c.p055a.p067b.C1114e;
import p054c.p055a.p067b.p068f.C1116a;
import p054c.p055a.p067b.p071i.C1139b;
import p054c.p079d.p080a.p081a.p082a.C1165a;
import p054c.p116g.p117a.p118a.C1428a;
import p054c.p116g.p117a.p118a.C1429b;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.b.k */
public abstract class C2240k extends Fragment {

    /* renamed from: d0 */
    static final /* synthetic */ C3208i[] f5912d0;

    /* renamed from: b0 */
    private final C3256e f5913b0 = C3258g.m11969a(new C2255f(this));

    /* renamed from: c0 */
    private HashMap f5914c0;

    /* renamed from: com.fb.fluid.ui.g.b.k$a */
    public static final class C2241a {
        private C2241a() {
        }

        public /* synthetic */ C2241a(C3366g gVar) {
            this();
        }
    }

    @C3332f(mo10052c = "com.fb.fluid.ui.preferences.fragments.BasePreferencesFragment$grantSecureSettingsRoot$1", mo10053f = "BasePreferencesFragment.kt", mo10054l = {231}, mo10055m = "invokeSuspend")
    /* renamed from: com.fb.fluid.ui.g.b.k$b */
    static final class C2242b extends C3339l implements C3351c<C3418e0, C3309c<? super Unit>, Object> {

        /* renamed from: j */
        private C3418e0 f5915j;

        /* renamed from: k */
        Object f5916k;

        /* renamed from: l */
        int f5917l;

        /* renamed from: m */
        final /* synthetic */ C2240k f5918m;

        /* renamed from: n */
        final /* synthetic */ boolean f5919n;

        @C3332f(mo10052c = "com.fb.fluid.ui.preferences.fragments.BasePreferencesFragment$grantSecureSettingsRoot$1$1", mo10053f = "BasePreferencesFragment.kt", mo10054l = {}, mo10055m = "invokeSuspend")
        /* renamed from: com.fb.fluid.ui.g.b.k$b$a */
        static final class C2243a extends C3339l implements C3351c<C3418e0, C3309c<? super Boolean>, Object> {

            /* renamed from: j */
            private C3418e0 f5920j;

            /* renamed from: k */
            int f5921k;

            /* renamed from: l */
            final /* synthetic */ C2242b f5922l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2243a(C2242b bVar, C3309c cVar) {
                super(2, cVar);
                this.f5922l = bVar;
            }

            /* renamed from: a */
            public final Object mo6125a(Object obj, Object obj2) {
                return ((C2243a) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
            }

            /* renamed from: a */
            public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
                C3370k.m12227b(cVar, "completion");
                C2243a aVar = new C2243a(this.f5922l, cVar);
                aVar.f5920j = (C3418e0) obj;
                return aVar;
            }

            /* renamed from: b */
            public final Object mo6618b(Object obj) {
                String str;
                Object unused = C3326d.m12146a();
                if (this.f5921k == 0) {
                    C3265l.m11979a(obj);
                    String[] strArr = new String[1];
                    C1741h.C1742a aVar = C1741h.f5048a;
                    Context B = this.f5922l.f5918m.mo2194B();
                    if (B == null || (str = B.getPackageName()) == null) {
                        str = "com.fb.fluid";
                    }
                    strArr[0] = aVar.mo6490b(str);
                    C1428a a = C1429b.C1447h.m6662a(strArr);
                    C3370k.m12223a((Object) a, "Shell.SU.run(SuUtils.gra…packageName ?: PKG_NAME))");
                    return C3328b.m12154a(a.mo5875b());
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2242b(C2240k kVar, boolean z, C3309c cVar) {
            super(2, cVar);
            this.f5918m = kVar;
            this.f5919n = z;
        }

        /* renamed from: a */
        public final Object mo6125a(Object obj, Object obj2) {
            return ((C2242b) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
        }

        /* renamed from: a */
        public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
            C3370k.m12227b(cVar, "completion");
            C2242b bVar = new C2242b(this.f5918m, this.f5919n, cVar);
            bVar.f5915j = (C3418e0) obj;
            return bVar;
        }

        /* renamed from: b */
        public final Object mo6618b(Object obj) {
            Context B;
            Object a = C3326d.m12146a();
            int i = this.f5917l;
            if (i == 0) {
                C3265l.m11979a(obj);
                C3418e0 e0Var = this.f5915j;
                C3556z a2 = C3536t0.m12776a();
                C2243a aVar = new C2243a(this, (C3309c) null);
                this.f5916k = e0Var;
                this.f5917l = 1;
                obj = C3412d.m12326a(a2, aVar, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                C3418e0 e0Var2 = (C3418e0) this.f5916k;
                C3265l.m11979a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (booleanValue && this.f5919n) {
                C0401d u = this.f5918m.mo2304u();
                if (u != null) {
                    u.finish();
                }
            } else if (!booleanValue && (B = this.f5918m.mo2194B()) != null) {
                C1770f.m7465a(B, (int) C3148R.string.toast_root_rights_fail, 0, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.k$c */
    static final class C2244c<T> implements C0498u<C2068g> {

        /* renamed from: a */
        final /* synthetic */ C2240k f5923a;

        /* renamed from: com.fb.fluid.ui.g.b.k$c$a */
        static final class C2245a extends C3371l implements C3349a<Unit> {

            /* renamed from: g */
            final /* synthetic */ C2244c f5924g;

            /* renamed from: h */
            final /* synthetic */ C2068g f5925h;

            /* renamed from: com.fb.fluid.ui.g.b.k$c$a$a */
            static final class C2246a extends C3371l implements C3350b<C1041c, Unit> {

                /* renamed from: g */
                final /* synthetic */ C1041c f5926g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2246a(C1041c cVar) {
                    super(1);
                    this.f5926g = cVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                    mo7096a((C1041c) obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo7096a(C1041c cVar) {
                    C3370k.m12227b(cVar, "it");
                    Context context = this.f5926g.getContext();
                    C3370k.m12223a((Object) context, "context");
                    context.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f5926g.getContext(), CapacitiveKeysService.class), 1, 1);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2245a(C2244c cVar, C2068g gVar) {
                super(0);
                this.f5924g = cVar;
                this.f5925h = gVar;
            }

            public final void invoke() {
                C0401d u;
                C2068g gVar = this.f5925h;
                int i = 0;
                if (gVar instanceof C2067f) {
                    Context B = this.f5924g.f5923a.mo2194B();
                    if (B != null) {
                        C1770f.m7465a(B, ((C2067f) this.f5925h).mo6939a(), 0, 2, (Object) null);
                    }
                } else if (gVar instanceof C2061a) {
                    ActivitySettings.C1993b bVar = ActivitySettings.f5563E;
                    C0401d x0 = this.f5924g.f5923a.mo2311x0();
                    C3370k.m12223a((Object) x0, "requireActivity()");
                    ActivitySettings.C1993b.m8225a(bVar, x0, ((C2061a) this.f5925h).mo6919a(), 0, new C3261j[0], (C3351c) null, 20, (Object) null);
                } else if (gVar instanceof C2064c) {
                    C0401d x02 = this.f5924g.f5923a.mo2311x0();
                    C3370k.m12223a((Object) x02, "requireActivity()");
                    C1764a.m7435a(x02, ((C2064c) this.f5925h).mo6927a(), 0, 2, (Object) null);
                } else if (gVar instanceof C2062b) {
                    int a = ((C2062b) gVar).mo6923a();
                    boolean z = true;
                    if (a != 1) {
                        switch (a) {
                            case 4:
                                C0401d u2 = this.f5924g.f5923a.mo2304u();
                                if (u2 != null) {
                                    C1764a.m7440f(u2);
                                    return;
                                }
                                return;
                            case 5:
                                C0401d u3 = this.f5924g.f5923a.mo2304u();
                                if (u3 != null) {
                                    C1764a.m7438d(u3);
                                    return;
                                }
                                return;
                            case 6:
                                try {
                                    ComponentName componentName = new ComponentName(this.f5924g.f5923a.mo2313y0(), CapacitiveKeysService.class);
                                    Context y0 = this.f5924g.f5923a.mo2313y0();
                                    C3370k.m12223a((Object) y0, "requireContext()");
                                    int componentEnabledSetting = y0.getPackageManager().getComponentEnabledSetting(componentName);
                                    if (componentEnabledSetting != 2) {
                                        if (componentEnabledSetting != 0) {
                                            z = false;
                                        }
                                    }
                                    if (z) {
                                        C0401d x03 = this.f5924g.f5923a.mo2311x0();
                                        C3370k.m12223a((Object) x03, "requireActivity()");
                                        C1041c cVar = new C1041c(x03, (C1039a) null, 2, (C3366g) null);
                                        C1041c.m5351a(cVar, Integer.valueOf(C3148R.string.pref_block_capacitive_keys_restart_title), (String) null, 2, (Object) null);
                                        C1041c.m5349a(cVar, Integer.valueOf(C3148R.string.pref_block_capacitive_keys_restart_sum), (CharSequence) null, (C3350b) null, 6, (Object) null);
                                        C1041c.m5352b(cVar, Integer.valueOf(C3148R.string.f7910ok), (CharSequence) null, new C2246a(cVar), 2, (Object) null);
                                        cVar.show();
                                        return;
                                    }
                                    C0401d u4 = this.f5924g.f5923a.mo2304u();
                                    if (u4 != null) {
                                        C1764a.m7432a((Activity) u4);
                                        return;
                                    }
                                    return;
                                } catch (Exception unused) {
                                    return;
                                }
                            case 7:
                                C0401d u5 = this.f5924g.f5923a.mo2304u();
                                if (u5 != null) {
                                    C1764a.m7437c(u5);
                                    return;
                                }
                                return;
                            case 8:
                                if (Build.VERSION.SDK_INT >= 23 && (u = this.f5924g.f5923a.mo2304u()) != null) {
                                    Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("package:");
                                    C3370k.m12223a((Object) u, "parent");
                                    sb.append(u.getPackageName());
                                    intent.setData(Uri.parse(sb.toString()));
                                    if (C1775k.m7476a(intent, u)) {
                                        this.f5924g.f5923a.mo2233a(intent);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    } else {
                        C0401d u6 = this.f5924g.f5923a.mo2304u();
                        if (u6 != null) {
                            C1764a.m7432a((Activity) u6);
                        }
                    }
                } else if (gVar instanceof C2065d) {
                    ProgressBar progressBar = (ProgressBar) this.f5924g.f5923a.mo6945e(C1718g.indicator);
                    C3370k.m12223a((Object) progressBar, "indicator");
                    if (!((C2065d) this.f5925h).mo6931a()) {
                        i = 8;
                    }
                    progressBar.setVisibility(i);
                } else if (gVar instanceof C2066e) {
                    this.f5924g.f5923a.m8768j(((C2066e) gVar).mo6935a());
                }
            }
        }

        C2244c(C2240k kVar) {
            this.f5923a = kVar;
        }

        /* renamed from: a */
        public final void mo2154a(C2068g gVar) {
            gVar.mo6943a(new C2245a(this, gVar));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.k$d */
    static final class C2247d extends C3371l implements C3350b<C1114e, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2240k f5927g;

        /* renamed from: h */
        final /* synthetic */ C2317o f5928h;

        /* renamed from: com.fb.fluid.ui.g.b.k$d$a */
        static final class C2248a extends C3371l implements C3350b<C2428c0, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2247d f5929g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2248a(C2247d dVar) {
                super(1);
                this.f5929g = dVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7098a((C2428c0) obj));
            }

            /* renamed from: a */
            public final boolean mo7098a(C2428c0 c0Var) {
                C3370k.m12227b(c0Var, "it");
                C0401d u = this.f5929g.f5927g.mo2304u();
                if (u == null) {
                    return true;
                }
                u.finish();
                return true;
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.k$d$b */
        static final class C2249b extends C3371l implements C3350b<C2439g, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2247d f5930g;

            /* renamed from: com.fb.fluid.ui.g.b.k$d$b$a */
            static final class C2250a extends C3371l implements C3351c<C1041c, Integer, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2249b f5931g;

                /* renamed from: h */
                final /* synthetic */ C2439g f5932h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2250a(C2249b bVar, C2439g gVar) {
                    super(2);
                    this.f5931g = bVar;
                    this.f5932h = gVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    mo7100a((C1041c) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo7100a(C1041c cVar, int i) {
                    C3370k.m12227b(cVar, "<anonymous parameter 0>");
                    this.f5932h.mo7327a(Integer.valueOf(i), (C1116a<?>) this.f5931g.f5930g.f5928h.mo7159g(), true);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2249b(C2247d dVar) {
                super(1);
                this.f5930g = dVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                return Boolean.valueOf(mo7099a((C2439g) obj));
            }

            /* renamed from: a */
            public final boolean mo7099a(C2439g gVar) {
                C3370k.m12227b(gVar, "it");
                C0401d x0 = this.f5930g.f5927g.mo2311x0();
                C3370k.m12223a((Object) x0, "requireActivity()");
                C1041c cVar = new C1041c(x0, (C1039a) null, 2, (C3366g) null);
                C1041c.m5351a(cVar, Integer.valueOf(C3148R.string.pref_color_primary), (String) null, 2, (Object) null);
                C1041c cVar2 = cVar;
                C1068g.m5429a(cVar2, gVar.mo7282m(), gVar.mo7284o(), Integer.valueOf(gVar.mo7283n()), false, true, true, false, new C2250a(this, gVar), 72, (Object) null);
                C1041c.m5352b(cVar2, Integer.valueOf(C3148R.string.select_color), (CharSequence) null, (C3350b) null, 6, (Object) null);
                cVar.show();
                return true;
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.k$d$c */
        static final class C2251c extends C3371l implements C3351c<Trigger, String, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2247d f5933g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2251c(C2247d dVar) {
                super(2);
                this.f5933g = dVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7101a((Trigger) obj, (String) obj2);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7101a(Trigger trigger, String str) {
                C3370k.m12227b(trigger, "it");
                C3370k.m12227b(str, "title");
                ActivitySettings.C1993b bVar = ActivitySettings.f5563E;
                C0401d x0 = this.f5933g.f5927g.mo2311x0();
                C3370k.m12223a((Object) x0, "requireActivity()");
                ActivitySettings.C1993b.m8225a(bVar, x0, 25, 10, new C3261j[]{C3268o.m11989a("trigger_id", Long.valueOf(trigger.mo6390h())), C3268o.m11989a("title", str)}, (C3351c) null, 16, (Object) null);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.k$d$d */
        static final class C2252d extends C3371l implements C3353e<Boolean, Boolean, List<? extends String>, C3350b<? super C1706c, ? extends Unit>, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2247d f5934g;

            /* renamed from: com.fb.fluid.ui.g.b.k$d$d$a */
            static final class C2253a extends C3371l implements C3351c<Integer, Intent, Unit> {

                /* renamed from: g */
                final /* synthetic */ C3350b f5935g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2253a(C3350b bVar) {
                    super(2);
                    this.f5935g = bVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    mo7103a(((Number) obj).intValue(), (Intent) obj2);
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo7103a(int i, Intent intent) {
                    C1706c cVar = intent != null ? (C1706c) intent.getParcelableExtra("pkg_name") : null;
                    if (!(cVar instanceof C1706c)) {
                        cVar = null;
                    }
                    if (i == -1 && (cVar instanceof C1706c)) {
                        this.f5935g.mo5146a(cVar);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2252d(C2247d dVar) {
                super(4);
                this.f5934g = dVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6514a(Object obj, Object obj2, Object obj3, Object obj4) {
                mo7102a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (List<String>) (List) obj3, (C3350b<? super C1706c, Unit>) (C3350b) obj4);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7102a(boolean z, boolean z2, List<String> list, C3350b<? super C1706c, Unit> bVar) {
                C3370k.m12227b(list, "filteredList");
                C3370k.m12227b(bVar, "resultHandler");
                ActivitySettings.C1993b bVar2 = ActivitySettings.f5563E;
                C0401d x0 = this.f5934g.f5927g.mo2311x0();
                C3370k.m12223a((Object) x0, "requireActivity()");
                bVar2.mo6841a(x0, 24, 4400, new C3261j[]{C3268o.m11989a("type", 1), C3268o.m11989a("all_apps", Boolean.valueOf(z)), C3268o.m11989a("app_show_all", Boolean.valueOf(z2)), C3268o.m11989a("filter_out_pkg", new ArrayList(list))}, new C2253a(bVar));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2247d(C2240k kVar, C2317o oVar) {
            super(1);
            this.f5927g = kVar;
            this.f5928h = oVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7097a((C1114e) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7097a(C1114e eVar) {
            C3370k.m12227b(eVar, "$receiver");
            eVar.mo5190a((C1116a<?>) this.f5928h.mo7159g());
            C2430d0.m9138a(eVar, new C2248a(this), C2257l.f5939g);
            C2460l.m9204a(eVar);
            C2479v.m9274a(eVar, (C3350b) null, 1, (Object) null);
            C2487y.m9300a(eVar);
            C2422b0.m9117a(eVar, (C3351c) null, 1, (Object) null);
            C2453j.m9193a(eVar);
            C2441h.m9164a(eVar, new C2249b(this));
            C2444h0.m9172a(eVar, new C2251c(this));
            C2409b.m9095a(eVar, new C2252d(this));
            C2259m mVar = C2259m.f5941g;
            String name = Rect.class.getName();
            C3370k.m12223a((Object) name, "IT::class.java.name");
            C1139b bVar = new C1139b(eVar, name);
            mVar.mo5146a(bVar);
            eVar.mo5192a(bVar.mo5238f(), C3148R.layout.item_space, bVar);
            C2313n nVar = C2313n.f6005g;
            String name2 = C2464n.class.getName();
            C3370k.m12223a((Object) name2, "IT::class.java.name");
            C1139b bVar2 = new C1139b(eVar, name2);
            nVar.mo5146a(bVar2);
            eVar.mo5192a(bVar2.mo5238f(), C3148R.layout.item_home_header, bVar2);
            C2467q.m9215a(eVar);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.k$e */
    static final class C2254e implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ ExtRecyclerView f5936a;

        C2254e(ExtRecyclerView extRecyclerView) {
            this.f5936a = extRecyclerView;
        }

        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ExtRecyclerView extRecyclerView = this.f5936a;
            C3370k.m12223a((Object) windowInsets, "windowInsets");
            int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom() + C1165a.m5734a(64);
            extRecyclerView.setPadding(extRecyclerView.getPaddingLeft(), windowInsets.getSystemWindowInsetTop(), extRecyclerView.getPaddingRight(), systemWindowInsetBottom);
            return windowInsets;
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.k$f */
    static final class C2255f extends C3371l implements C3349a<C2527h> {

        /* renamed from: g */
        final /* synthetic */ C2240k f5937g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2255f(C2240k kVar) {
            super(0);
            this.f5937g = kVar;
        }

        public final C2527h invoke() {
            Context y0 = this.f5937g.mo2313y0();
            C3370k.m12223a((Object) y0, "requireContext()");
            return new C2527h(y0);
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C2240k.class), "prefHelper", "getPrefHelper()Lcom/fb/fluid/utils/preferences/SharedPrefHelper;");
        C3384y.m12259a((C3379t) uVar);
        f5912d0 = new C3208i[]{uVar};
        new C2241a((C3366g) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m8768j(boolean z) {
        C3499j1 unused = C3417e.m12335a(C3422f0.m12341a(C3536t0.m12778c()), (C3314f) null, (C3430h0) null, new C2242b(this, z, (C3309c) null), 3, (Object) null);
    }

    /* renamed from: C0 */
    public void mo2351C0() {
        HashMap hashMap = this.f5914c0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public final C2527h mo6873D0() {
        C3256e eVar = this.f5913b0;
        C3208i iVar = f5912d0[0];
        return (C2527h) eVar.getValue();
    }

    /* renamed from: E0 */
    public abstract C2317o mo6944E0();

    /* renamed from: a */
    public View mo2221a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C3370k.m12227b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C3148R.layout.fragment_main, viewGroup, false);
        C3370k.m12223a((Object) inflate, "inflater.inflate(R.layou…t_main, container, false)");
        return inflate;
    }

    /* renamed from: b */
    public void mo2248b(Bundle bundle) {
        super.mo2248b(bundle);
        C2317o E0 = mo6944E0();
        E0.mo7160h().observe(this, new C2244c(this));
        ExtRecyclerView extRecyclerView = (ExtRecyclerView) mo6945e(C1718g.recycler_view);
        extRecyclerView.setOnApplyWindowInsetsListener(new C2254e(extRecyclerView));
        extRecyclerView.setItemViewCacheSize(10);
        C1111d.m5549a(extRecyclerView, new C2247d(this, E0));
    }

    /* renamed from: e */
    public View mo6945e(int i) {
        if (this.f5914c0 == null) {
            this.f5914c0 = new HashMap();
        }
        View view = (View) this.f5914c0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View T = mo2213T();
        if (T == null) {
            return null;
        }
        View findViewById = T.findViewById(i);
        this.f5914c0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo2279h0() {
        super.mo2279h0();
        mo2351C0();
    }
}
