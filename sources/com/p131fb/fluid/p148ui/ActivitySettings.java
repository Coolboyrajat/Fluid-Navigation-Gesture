package com.p131fb.fluid.p148ui;

import android.app.Activity;
import android.app.Application;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0401d;
import androidx.fragment.app.C0411l;
import androidx.fragment.app.C0438s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0472b0;
import androidx.lifecycle.C0490o;
import androidx.lifecycle.C0508z;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.bottomsheets.C1559a;
import com.android.billingclient.api.C1660h;
import com.android.billingclient.api.C1668l;
import com.android.billingclient.api.C1677s;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.p131fb.fluid.App;
import com.p131fb.fluid.C1718g;
import com.p131fb.fluid.MainAccessibilityService;
import com.p131fb.fluid.p135l.C1731b;
import com.p131fb.fluid.p135l.C1734c;
import com.p131fb.fluid.p135l.C1755l;
import com.p131fb.fluid.p135l.p137n.C1761a;
import com.p131fb.fluid.p135l.p139p.C1764a;
import com.p131fb.fluid.p135l.p139p.C1770f;
import com.p131fb.fluid.p135l.p139p.C1771g;
import com.p131fb.fluid.p135l.p140q.C1783a;
import com.p131fb.fluid.p135l.p143t.C1797a;
import com.p131fb.fluid.p148ui.C2030a;
import com.p131fb.fluid.p148ui.billing.C2037a;
import com.p131fb.fluid.p148ui.billing.C2048d;
import com.p131fb.fluid.p148ui.p149g.p151b.C2069a;
import com.p131fb.fluid.p148ui.p149g.p151b.C2077a0;
import com.p131fb.fluid.p148ui.p149g.p151b.C2108b0;
import com.p131fb.fluid.p148ui.p149g.p151b.C2123d0;
import com.p131fb.fluid.p148ui.p149g.p151b.C2127e;
import com.p131fb.fluid.p148ui.p149g.p151b.C2168g;
import com.p131fb.fluid.p148ui.p149g.p151b.C2169g0;
import com.p131fb.fluid.p148ui.p149g.p151b.C2316n0;
import com.p131fb.fluid.p148ui.p149g.p151b.C2328p;
import com.p131fb.fluid.p148ui.p149g.p151b.C2329p0;
import com.p131fb.fluid.p148ui.p149g.p151b.C2350q0;
import com.p131fb.fluid.p148ui.p149g.p151b.C2354r;
import com.p131fb.fluid.p148ui.p149g.p151b.C2379t;
import com.p131fb.fluid.p148ui.p149g.p151b.C2403y;
import com.p131fb.fluid.p148ui.p149g.p152c.C2408a0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2422b0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2458k;
import com.p131fb.fluid.p148ui.p149g.p152c.C2460l;
import com.p131fb.fluid.p148ui.p149g.p152c.C2471s;
import com.p131fb.fluid.p148ui.p149g.p152c.C2472t;
import com.p131fb.fluid.p148ui.p149g.p152c.C2479v;
import com.p131fb.fluid.p148ui.p153h.C2493a;
import com.p131fb.fluid.utils.preferences.C2527h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C3256e;
import kotlin.C3261j;
import kotlin.C3265l;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p192b0.C3208i;
import kotlin.p195s.C3282h;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p197u.p199i.p200a.C3339l;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3383x;
import kotlin.p205x.p207d.C3384y;
import kotlinx.coroutines.C3418e0;
import kotlinx.coroutines.C3422f0;
import kotlinx.coroutines.C3430h0;
import kotlinx.coroutines.C3499j1;
import kotlinx.coroutines.C3536t0;
import p054c.p055a.p056a.C1039a;
import p054c.p055a.p056a.C1040b;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.p058o.C1058a;
import p054c.p055a.p056a.p062r.C1084a;
import p054c.p055a.p056a.p064t.C1096a;
import p054c.p055a.p067b.C1111d;
import p054c.p055a.p067b.C1114e;
import p054c.p055a.p067b.p068f.C1116a;
import p054c.p055a.p067b.p068f.C1118b;
import p054c.p079d.p080a.p081a.p082a.C1165a;
import p155d.p156a.p162q.C2827e;
import p179e.p184b.p185a.C2995e0;
import p179e.p184b.p185a.C3004i0;
import p179e.p184b.p185a.C3059m;
import p179e.p184b.p185a.C3117n;
import p179e.p184b.p185a.C3119o;
import p179e.p184b.p185a.C3125q;
import p179e.p184b.p185a.C3134v;
import p179e.p184b.p185a.p186k0.C3014a;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.ActivitySettings */
public final class ActivitySettings extends C1761a implements C3117n {

    /* renamed from: D */
    static final /* synthetic */ C3208i[] f5562D;

    /* renamed from: E */
    public static final C1993b f5563E = new C1993b((C3366g) null);

    /* renamed from: A */
    private final C3256e f5564A = C3258g.m11969a(new C2000g(this));
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f5565B;

    /* renamed from: C */
    private HashMap f5566C;

    /* renamed from: y */
    private final C3256e f5567y = C3014a.m11539a().mo9126a(this, f5562D[0]);

    /* renamed from: z */
    private final C3256e f5568z = C3119o.m11767a(this, C3004i0.m11527a(new C1992a()), (Object) null).mo9243a(this, f5562D[1]);

    /* renamed from: com.fb.fluid.ui.ActivitySettings$a */
    public static final class C1992a extends C2995e0<C2493a> {
    }

    /* renamed from: com.fb.fluid.ui.ActivitySettings$b */
    public static final class C1993b {
        private C1993b() {
        }

        public /* synthetic */ C1993b(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ void m8225a(C1993b bVar, Activity activity, int i, int i2, C3261j[] jVarArr, C3351c cVar, int i3, Object obj) {
            int i4 = (i3 & 2) != 0 ? 16 : i;
            int i5 = (i3 & 4) != 0 ? -1 : i2;
            if ((i3 & 16) != 0) {
                cVar = null;
            }
            bVar.mo6841a(activity, i4, i5, jVarArr, cVar);
        }

        /* renamed from: a */
        public final void mo6841a(Activity activity, int i, int i2, C3261j<String, ? extends Object>[] jVarArr, C3351c<? super Integer, ? super Intent, Unit> cVar) {
            Intent putExtra;
            C3370k.m12227b(activity, "activity");
            C3370k.m12227b(jVarArr, "extras");
            Intent putExtra2 = new Intent(activity.getBaseContext(), ActivitySettings.class).putExtra("page", i);
            for (C3261j<String, ? extends Object> jVar : jVarArr) {
                Object d = jVar.mo9937d();
                if (d instanceof String) {
                    putExtra = putExtra2.putExtra(jVar.mo9936c(), (String) d);
                } else if (d instanceof Integer) {
                    putExtra = putExtra2.putExtra(jVar.mo9936c(), ((Number) d).intValue());
                } else if (d instanceof Long) {
                    putExtra = putExtra2.putExtra(jVar.mo9936c(), ((Number) d).longValue());
                } else if (d instanceof Boolean) {
                    putExtra = putExtra2.putExtra(jVar.mo9936c(), ((Boolean) d).booleanValue());
                } else if (d instanceof Bundle) {
                    putExtra = putExtra2.putExtra(jVar.mo9936c(), (Bundle) d);
                } else if (d instanceof ArrayList) {
                    putExtra = putExtra2.putExtra(jVar.mo9936c(), (Serializable) d);
                } else {
                    Unit unit = Unit.INSTANCE;
                }
                C3370k.m12223a((Object) putExtra, "this.putExtra(it.first, param)");
            }
            if (cVar == null || !(activity instanceof C1761a)) {
                activity.startActivity(putExtra2);
                return;
            }
            C3370k.m12223a((Object) putExtra2, "this");
            ((C1761a) activity).mo6530a(putExtra2, i2, cVar);
        }
    }

    /* renamed from: com.fb.fluid.ui.ActivitySettings$c */
    static final class C1994c implements Toolbar.C0144f {

        /* renamed from: a */
        final /* synthetic */ ActivitySettings f5569a;

        C1994c(ActivitySettings activitySettings) {
            this.f5569a = activitySettings;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            C3370k.m12223a((Object) menuItem, "it");
            switch (menuItem.getItemId()) {
                case C3148R.C3151id.action_about /*2131361837*/:
                    this.f5569a.m8217w();
                    return true;
                case C3148R.C3151id.action_app_theme /*2131361838*/:
                    this.f5569a.m8197A();
                    return true;
                case C3148R.C3151id.action_backup /*2131361839*/:
                    this.f5569a.m8218x();
                    return true;
                case C3148R.C3151id.action_billing_pro /*2131361847*/:
                case C3148R.C3151id.action_billing_reward /*2131361848*/:
                    this.f5569a.m8219y();
                    return true;
                case C3148R.C3151id.action_help /*2131361852*/:
                    this.f5569a.m8220z();
                    return true;
                case C3148R.C3151id.action_permissions /*2131361859*/:
                    C1993b.m8225a(ActivitySettings.f5563E, this.f5569a, 18, 0, new C3261j[0], (C3351c) null, 20, (Object) null);
                    return true;
                default:
                    return true;
            }
        }
    }

    /* renamed from: com.fb.fluid.ui.ActivitySettings$d */
    static final class C1995d extends C3371l implements C3352d<Integer, C1660h, List<C1668l>, Unit> {

        /* renamed from: g */
        final /* synthetic */ ActivitySettings f5570g;

        /* renamed from: h */
        final /* synthetic */ C2048d f5571h;

        /* renamed from: com.fb.fluid.ui.ActivitySettings$d$a */
        static final class C1996a extends C3371l implements C3351c<C1660h, List<? extends C1677s>, Unit> {

            /* renamed from: g */
            final /* synthetic */ C1995d f5572g;

            /* renamed from: com.fb.fluid.ui.ActivitySettings$d$a$a */
            static final class C1997a extends C3371l implements C3350b<C1660h, Unit> {

                /* renamed from: g */
                final /* synthetic */ C1996a f5573g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C1997a(C1996a aVar) {
                    super(1);
                    this.f5573g = aVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                    mo6845a((C1660h) obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo6845a(C1660h hVar) {
                    MenuItem findItem;
                    C3370k.m12227b(hVar, "result");
                    if (hVar.mo6279a() == 0) {
                        this.f5573g.f5572g.f5570g.f5565B = false;
                        BottomAppBar bottomAppBar = (BottomAppBar) this.f5573g.f5572g.f5570g.mo6840d(C1718g.app_bar);
                        C3370k.m12223a((Object) bottomAppBar, "app_bar");
                        Menu menu = bottomAppBar.getMenu();
                        if (menu != null && (findItem = menu.findItem(C3148R.C3151id.action_billing_reward)) != null) {
                            findItem.setVisible(false);
                        }
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1996a(C1995d dVar) {
                super(2);
                this.f5572g = dVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo6844a((C1660h) obj, (List<? extends C1677s>) (List) obj2);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6844a(C1660h hVar, List<? extends C1677s> list) {
                C1677s sVar;
                C3370k.m12227b(hVar, "<anonymous parameter 0>");
                if (list != null && (sVar = (C1677s) C3292r.m12102f(list)) != null) {
                    this.f5572g.f5571h.mo6887a(sVar, (C3350b<? super C1660h, Unit>) new C1997a(this));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1995d(ActivitySettings activitySettings, C2048d dVar) {
            super(3);
            this.f5570g = activitySettings;
            this.f5571h = dVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
            mo6843a(((Number) obj).intValue(), (C1660h) obj2, (List<C1668l>) (List) obj3);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6843a(int i, C1660h hVar, List<C1668l> list) {
            boolean z;
            if (i == 0 && !C1770f.m7463a((C0401d) this.f5570g).mo6348a()) {
                C2527h b = this.f5570g.m8214t();
                T t = null;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        C1668l lVar = (C1668l) next;
                        if (!C3370k.m12225a((Object) lVar.mo6292e(), (Object) "fluid_pro") || lVar.mo6289b() != 1) {
                            z = false;
                            continue;
                        } else {
                            z = true;
                            continue;
                        }
                        if (z) {
                            t = next;
                            break;
                        }
                    }
                    t = (C1668l) t;
                }
                b.mo7514d(t != null ? C1771g.m7472b(new Date(), 1).getTime() : 0);
                C1770f.m7463a((C0401d) this.f5570g).mo6354h();
                ActivitySettings activitySettings = this.f5570g;
                activitySettings.startService(new Intent(activitySettings, MainAccessibilityService.class).putExtra("update_ui", true));
                if (!this.f5570g.f5565B) {
                    this.f5571h.mo6888a(C3283i.m12064a("fluid_day"), "inapp", new C1996a(this));
                }
            }
        }
    }

    /* renamed from: com.fb.fluid.ui.ActivitySettings$e */
    static final class C1998e implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ BottomAppBar f5574a;

        C1998e(BottomAppBar bottomAppBar) {
            this.f5574a = bottomAppBar;
        }

        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            BottomAppBar bottomAppBar = this.f5574a;
            C3370k.m12223a((Object) windowInsets, "windowInsets");
            bottomAppBar.setPadding(bottomAppBar.getPaddingLeft(), bottomAppBar.getPaddingTop(), bottomAppBar.getPaddingRight(), windowInsets.getSystemWindowInsetBottom());
            return windowInsets;
        }
    }

    /* renamed from: com.fb.fluid.ui.ActivitySettings$f */
    static final class C1999f<T> implements C2827e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ActivitySettings f5575a;

        C1999f(ActivitySettings activitySettings) {
            this.f5575a = activitySettings;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
            if (r4 != 16) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
            if (0 != 0) goto L_0x006a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void accept(java.lang.Boolean r9) {
            /*
                r8 = this;
                com.fb.fluid.ui.ActivitySettings r0 = r8.f5575a
                int r1 = com.p131fb.fluid.C1718g.app_bar
                android.view.View r0 = r0.mo6840d((int) r1)
                com.google.android.material.bottomappbar.BottomAppBar r0 = (com.google.android.material.bottomappbar.BottomAppBar) r0
                com.fb.fluid.ui.ActivitySettings r1 = r8.f5575a
                int r1 = r1.m8213s()
                java.lang.String r2 = "showBilling"
                r3 = 16
                if (r1 != r3) goto L_0x0022
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r9, (java.lang.String) r2)
                r9.booleanValue()
                r1 = 0
                if (r1 == 0) goto L_0x0022
                r1 = 2131623936(0x7f0e0000, float:1.8875038E38)
                goto L_0x0031
            L_0x0022:
                com.fb.fluid.ui.ActivitySettings r1 = r8.f5575a
                int r1 = r1.m8213s()
                if (r1 != r3) goto L_0x002e
                r1 = 2131623937(0x7f0e0001, float:1.887504E38)
                goto L_0x0031
            L_0x002e:
                r1 = 2131623938(0x7f0e0002, float:1.8875042E38)
            L_0x0031:
                r0.mo7786b((int) r1)
                com.fb.fluid.ui.ActivitySettings r0 = r8.f5575a
                int r1 = com.p131fb.fluid.C1718g.app_bar
                android.view.View r0 = r0.mo6840d((int) r1)
                com.google.android.material.bottomappbar.BottomAppBar r0 = (com.google.android.material.bottomappbar.BottomAppBar) r0
                java.lang.String r1 = "app_bar"
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r1)
                com.fb.fluid.ui.ActivitySettings r4 = r8.f5575a
                int r4 = r4.m8213s()
                r5 = 2
                r6 = 0
                r7 = 8
                if (r4 == r5) goto L_0x0060
                r5 = 10
                if (r4 == r5) goto L_0x0060
                r5 = 13
                if (r4 == r5) goto L_0x0060
                r5 = 15
                if (r4 == r5) goto L_0x0060
                if (r4 == r3) goto L_0x006a
            L_0x005d:
                r6 = 8
                goto L_0x006a
            L_0x0060:
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r9, (java.lang.String) r2)
                boolean r9 = r9.booleanValue()
                r9 = 0
                if (r9 == 0) goto L_0x005d
            L_0x006a:
                r0.setVisibility(r6)
                com.fb.fluid.ui.ActivitySettings r9 = r8.f5575a
                int r0 = com.p131fb.fluid.C1718g.app_bar
                android.view.View r9 = r9.mo6840d((int) r0)
                com.google.android.material.bottomappbar.BottomAppBar r9 = (com.google.android.material.bottomappbar.BottomAppBar) r9
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r9, (java.lang.String) r1)
                android.view.Menu r9 = r9.getMenu()
                if (r9 == 0) goto L_0x0092
                r0 = 2131361848(0x7f0a0038, float:1.834346E38)
                android.view.MenuItem r9 = r9.findItem(r0)
                if (r9 == 0) goto L_0x0092
                com.fb.fluid.ui.ActivitySettings r0 = r8.f5575a
                boolean r0 = r0.f5565B
                r9.setVisible(r0)
            L_0x0092:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.p148ui.ActivitySettings.C1999f.accept(java.lang.Boolean):void");
        }
    }

    /* renamed from: com.fb.fluid.ui.ActivitySettings$g */
    static final class C2000g extends C3371l implements C3349a<C2527h> {

        /* renamed from: g */
        final /* synthetic */ ActivitySettings f5576g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2000g(ActivitySettings activitySettings) {
            super(0);
            this.f5576g = activitySettings;
        }

        public final C2527h invoke() {
            Context baseContext = this.f5576g.getBaseContext();
            C3370k.m12223a((Object) baseContext, "baseContext");
            return new C2527h(baseContext);
        }
    }

    /* renamed from: com.fb.fluid.ui.ActivitySettings$h */
    static final class C2001h extends C3371l implements C3350b<C1114e, Unit> {

        /* renamed from: g */
        final /* synthetic */ ActivitySettings f5577g;

        /* renamed from: com.fb.fluid.ui.ActivitySettings$h$a */
        static final class C2002a extends C3371l implements C3350b<C2471s, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2001h f5578g;

            /* renamed from: com.fb.fluid.ui.ActivitySettings$h$a$a */
            static final class C2003a extends C3371l implements C3351c<C2471s, Integer, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2002a f5579g;

                /* renamed from: com.fb.fluid.ui.ActivitySettings$h$a$a$a */
                static final class C2004a extends C3339l implements C3351c<C3418e0, C3309c<? super Unit>, Object> {

                    /* renamed from: j */
                    private C3418e0 f5580j;

                    /* renamed from: k */
                    int f5581k;

                    /* renamed from: l */
                    final /* synthetic */ C2003a f5582l;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C2004a(C2003a aVar, C3309c cVar) {
                        super(2, cVar);
                        this.f5582l = aVar;
                    }

                    /* renamed from: a */
                    public final Object mo6125a(Object obj, Object obj2) {
                        return ((C2004a) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
                    }

                    /* renamed from: a */
                    public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
                        C3370k.m12227b(cVar, "completion");
                        C2004a aVar = new C2004a(this.f5582l, cVar);
                        aVar.f5580j = (C3418e0) obj;
                        return aVar;
                    }

                    /* renamed from: b */
                    public final Object mo6618b(Object obj) {
                        Object unused = C3326d.m12146a();
                        if (this.f5581k == 0) {
                            C3265l.m11979a(obj);
                            Application application = this.f5582l.f5579g.f5578g.f5577g.getApplication();
                            if (application != null) {
                                Uri a = new C1731b((App) application).mo6470a();
                                if (a instanceof Uri) {
                                    ActivitySettings activitySettings = this.f5582l.f5579g.f5578g.f5577g;
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.putExtra("android.intent.extra.STREAM", a);
                                    intent.setFlags(1);
                                    intent.setType("application/zip");
                                    intent.setClipData(new ClipData("fluidng_backup", new String[]{"application/zip"}, new ClipData.Item(a)));
                                    activitySettings.startActivity(Intent.createChooser(intent, BuildConfig.FLAVOR));
                                } else {
                                    C1770f.m7465a((Context) this.f5582l.f5579g.f5578g.f5577g, (int) C3148R.string.msg_backup_error, 0, 2, (Object) null);
                                }
                                return Unit.INSTANCE;
                            }
                            throw new C3269p("null cannot be cast to non-null type com.fb.fluid.App");
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2003a(C2002a aVar) {
                    super(2);
                    this.f5579g = aVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    mo6850a((C2471s) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo6850a(C2471s sVar, int i) {
                    C3370k.m12227b(sVar, "<anonymous parameter 0>");
                    C3499j1 unused = C3417e.m12335a(C3422f0.m12341a(C3536t0.m12778c()), (C3314f) null, (C3430h0) null, new C2004a(this, (C3309c) null), 3, (Object) null);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2002a(C2001h hVar) {
                super(1);
                this.f5578g = hVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                mo6849a((C2471s) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6849a(C2471s sVar) {
                C3370k.m12227b(sVar, "$receiver");
                C2471s sVar2 = sVar;
                C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_backup_export_24px), true, (Integer) null, (C3351c) null, 25, (Object) null);
                C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.header_export), (C3349a) null, 5, (Object) null);
                sVar.mo7315a(new C2003a(this));
            }
        }

        /* renamed from: com.fb.fluid.ui.ActivitySettings$h$b */
        static final class C2005b extends C3371l implements C3350b<C2471s, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2001h f5583g;

            /* renamed from: com.fb.fluid.ui.ActivitySettings$h$b$a */
            static final class C2006a extends C3371l implements C3351c<C2471s, Integer, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2005b f5584g;

                /* renamed from: com.fb.fluid.ui.ActivitySettings$h$b$a$a */
                static final class C2007a extends C3371l implements C3351c<Integer, Intent, Object> {

                    /* renamed from: g */
                    final /* synthetic */ C2006a f5585g;

                    /* renamed from: com.fb.fluid.ui.ActivitySettings$h$b$a$a$a */
                    static final class C2008a extends C3339l implements C3351c<C3418e0, C3309c<? super Unit>, Object> {

                        /* renamed from: j */
                        private C3418e0 f5586j;

                        /* renamed from: k */
                        int f5587k;

                        /* renamed from: l */
                        final /* synthetic */ Uri f5588l;

                        /* renamed from: m */
                        final /* synthetic */ C2007a f5589m;

                        /* renamed from: com.fb.fluid.ui.ActivitySettings$h$b$a$a$a$a */
                        static final class C2009a extends C3371l implements C3349a<Unit> {

                            /* renamed from: g */
                            final /* synthetic */ C2008a f5590g;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C2009a(C2008a aVar) {
                                super(0);
                                this.f5590g = aVar;
                            }

                            public final void invoke() {
                                ActivitySettings activitySettings = this.f5590g.f5589m.f5585g.f5584g.f5583g.f5577g;
                                activitySettings.startService(new Intent(activitySettings, MainAccessibilityService.class).putExtra("asjlasfka", true));
                                this.f5590g.f5589m.f5585g.f5584g.f5583g.f5577g.m8201a(true);
                            }
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C2008a(Uri uri, C3309c cVar, C2007a aVar) {
                            super(2, cVar);
                            this.f5588l = uri;
                            this.f5589m = aVar;
                        }

                        /* renamed from: a */
                        public final Object mo6125a(Object obj, Object obj2) {
                            return ((C2008a) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
                        }

                        /* renamed from: a */
                        public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
                            C3370k.m12227b(cVar, "completion");
                            C2008a aVar = new C2008a(this.f5588l, cVar, this.f5589m);
                            aVar.f5586j = (C3418e0) obj;
                            return aVar;
                        }

                        /* renamed from: b */
                        public final Object mo6618b(Object obj) {
                            Object unused = C3326d.m12146a();
                            if (this.f5587k == 0) {
                                C3265l.m11979a(obj);
                                C1731b bVar = new C1731b(C1770f.m7463a((C0401d) this.f5589m.f5585g.f5584g.f5583g.f5577g));
                                Uri uri = this.f5588l;
                                C3370k.m12223a((Object) uri, "data");
                                if (bVar.mo6471a(uri)) {
                                    C1770f.m7465a((Context) this.f5589m.f5585g.f5584g.f5583g.f5577g, (int) C3148R.string.msg_import_sucess, 0, 2, (Object) null);
                                    C1770f.m7463a((C0401d) this.f5589m.f5585g.f5584g.f5583g.f5577g).mo6347a((C3349a<Unit>) new C2009a(this));
                                } else {
                                    C1770f.m7465a((Context) this.f5589m.f5585g.f5584g.f5583g.f5577g, (int) C3148R.string.msg_backup_error, 0, 2, (Object) null);
                                }
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C2007a(C2006a aVar) {
                        super(2);
                        this.f5585g = aVar;
                    }

                    /* renamed from: a */
                    public final Object mo6853a(int i, Intent intent) {
                        Uri data;
                        C3499j1 a;
                        if (intent != null && (data = intent.getData()) != null && (a = C3417e.m12335a(C3422f0.m12341a(C3536t0.m12778c()), (C3314f) null, (C3430h0) null, new C2008a(data, (C3309c) null, this), 3, (Object) null)) != null) {
                            return a;
                        }
                        C1770f.m7465a((Context) this.f5585g.f5584g.f5583g.f5577g, (int) C3148R.string.msg_backup_error, 0, 2, (Object) null);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: a */
                    public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                        return mo6853a(((Number) obj).intValue(), (Intent) obj2);
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2006a(C2005b bVar) {
                    super(2);
                    this.f5584g = bVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    mo6852a((C2471s) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo6852a(C2471s sVar, int i) {
                    C3370k.m12227b(sVar, "<anonymous parameter 0>");
                    ActivitySettings activitySettings = this.f5584g.f5583g.f5577g;
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("application/zip");
                    activitySettings.mo6530a(intent, 444, new C2007a(this));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2005b(C2001h hVar) {
                super(1);
                this.f5583g = hVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                mo6851a((C2471s) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6851a(C2471s sVar) {
                C3370k.m12227b(sVar, "$receiver");
                C2471s sVar2 = sVar;
                C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_backup_import_24px), true, (Integer) null, (C3351c) null, 25, (Object) null);
                C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.header_import), (C3349a) null, 5, (Object) null);
                sVar.mo7315a(new C2006a(this));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2001h(ActivitySettings activitySettings) {
            super(1);
            this.f5577g = activitySettings;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6848a((C1114e) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6848a(C1114e eVar) {
            C3370k.m12227b(eVar, "$receiver");
            C1116a<Object> a = C1118b.m5571a(new Object[0]);
            C1116a.C1117a.m5570a(a, C3284j.m12072c(new C2471s(new C2002a(this)), new C2471s(new C2005b(this))), (C3351c) null, (C3351c) null, 6, (Object) null);
            eVar.mo5190a((C1116a<?>) a);
            C2460l.m9204a(eVar);
            C2479v.m9274a(eVar, (C3350b) null, 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.ActivitySettings$i */
    static final class C2010i extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        final /* synthetic */ ActivitySettings f5591g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2010i(ActivitySettings activitySettings) {
            super(0);
            this.f5591g = activitySettings;
        }

        public final void invoke() {
            this.f5591g.m8216v().mo6918g().mo6882a();
        }
    }

    /* renamed from: com.fb.fluid.ui.ActivitySettings$j */
    static final class C2011j extends C3371l implements C3350b<C1114e, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1041c f5592g;

        /* renamed from: h */
        final /* synthetic */ ActivitySettings f5593h;

        /* renamed from: com.fb.fluid.ui.ActivitySettings$j$a */
        static final class C2012a extends C3371l implements C3350b<C2471s, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2011j f5594g;

            /* renamed from: com.fb.fluid.ui.ActivitySettings$j$a$a */
            static final class C2013a extends C3371l implements C3351c<C2471s, Integer, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2012a f5595g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2013a(C2012a aVar) {
                    super(2);
                    this.f5595g = aVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    mo6856a((C2471s) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo6856a(C2471s sVar, int i) {
                    C3370k.m12227b(sVar, "<anonymous parameter 0>");
                    ActivityIntro.f5556A.mo6839a(this.f5595g.f5594g.f5593h);
                    this.f5595g.f5594g.f5592g.dismiss();
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2012a(C2011j jVar) {
                super(1);
                this.f5594g = jVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                mo6855a((C2471s) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6855a(C2471s sVar) {
                C3370k.m12227b(sVar, "$receiver");
                C2471s sVar2 = sVar;
                C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.header_how_to), (C3349a) null, 5, (Object) null);
                C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_helptip_24dp), true, (Integer) null, (C3351c) null, 25, (Object) null);
                sVar.mo7315a(new C2013a(this));
            }
        }

        /* renamed from: com.fb.fluid.ui.ActivitySettings$j$b */
        static final class C2014b extends C3371l implements C3350b<C2471s, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2011j f5596g;

            /* renamed from: com.fb.fluid.ui.ActivitySettings$j$b$a */
            static final class C2015a extends C3371l implements C3351c<C2471s, Integer, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2014b f5597g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2015a(C2014b bVar) {
                    super(2);
                    this.f5597g = bVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    mo6858a((C2471s) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo6858a(C2471s sVar, int i) {
                    C3370k.m12227b(sVar, "<anonymous parameter 0>");
                    if (C1783a.f5089a.mo6547j()) {
                        C1764a.m7438d(this.f5597g.f5596g.f5593h);
                    } else {
                        C1764a.m7436b(this.f5597g.f5596g.f5593h);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2014b(C2011j jVar) {
                super(1);
                this.f5596g = jVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                mo6857a((C2471s) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6857a(C2471s sVar) {
                C3370k.m12227b(sVar, "$receiver");
                C2471s sVar2 = sVar;
                C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_helptip_24dp), false, (Integer) null, (C3351c) null, 29, (Object) null);
                C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.help_autostart_sum), (C3349a) null, 5, (Object) null);
                C2472t.m9228a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.help_autostart_desc), (C3350b) null, 5, (Object) null);
                sVar.mo7315a(new C2015a(this));
            }
        }

        /* renamed from: com.fb.fluid.ui.ActivitySettings$j$c */
        static final class C2016c extends C3371l implements C3350b<C2471s, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2011j f5598g;

            /* renamed from: com.fb.fluid.ui.ActivitySettings$j$c$a */
            static final class C2017a extends C3371l implements C3351c<C2471s, Integer, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2016c f5599g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2017a(C2016c cVar) {
                    super(2);
                    this.f5599g = cVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    mo6860a((C2471s) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo6860a(C2471s sVar, int i) {
                    C3370k.m12227b(sVar, "<anonymous parameter 0>");
                    if (Build.VERSION.SDK_INT >= 23) {
                        C1764a.m7439e(this.f5599g.f5598g.f5593h);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2016c(C2011j jVar) {
                super(1);
                this.f5598g = jVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                mo6859a((C2471s) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6859a(C2471s sVar) {
                C3370k.m12227b(sVar, "$receiver");
                C2471s sVar2 = sVar;
                C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_helptip_24dp), false, (Integer) null, (C3351c) null, 29, (Object) null);
                C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.help_app_optimization_sum), (C3349a) null, 5, (Object) null);
                C2472t.m9228a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.help_app_optimization_desc), (C3350b) null, 5, (Object) null);
                sVar.mo7315a(new C2017a(this));
            }
        }

        /* renamed from: com.fb.fluid.ui.ActivitySettings$j$d */
        static final class C2018d extends C3371l implements C3350b<C2471s, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2011j f5600g;

            /* renamed from: com.fb.fluid.ui.ActivitySettings$j$d$a */
            static final class C2019a extends C3371l implements C3351c<C2471s, Integer, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2018d f5601g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2019a(C2018d dVar) {
                    super(2);
                    this.f5601g = dVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    mo6862a((C2471s) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo6862a(C2471s sVar, int i) {
                    C3370k.m12227b(sVar, "<anonymous parameter 0>");
                    C1764a.m7435a(this.f5601g.f5600g.f5593h, (String) null, C3148R.string.url_dontkillmyapp, 1, (Object) null);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2018d(C2011j jVar) {
                super(1);
                this.f5600g = jVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                mo6861a((C2471s) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6861a(C2471s sVar) {
                C3370k.m12227b(sVar, "$receiver");
                C2471s sVar2 = sVar;
                C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_helptip_24dp), false, (Integer) null, (C3351c) null, 29, (Object) null);
                C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.help_dontkillmyapp), (C3349a) null, 5, (Object) null);
                C2472t.m9228a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.help_dontkillmyapp_desc), (C3350b) null, 5, (Object) null);
                sVar.mo7315a(new C2019a(this));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2011j(C1041c cVar, ActivitySettings activitySettings) {
            super(1);
            this.f5592g = cVar;
            this.f5593h = activitySettings;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6854a((C1114e) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6854a(C1114e eVar) {
            C3370k.m12227b(eVar, "$receiver");
            C1116a<Object> a = C1118b.m5571a(new Object[0]);
            C2472t[] tVarArr = new C2472t[6];
            tVarArr[0] = new C2471s(new C2012a(this));
            tVarArr[1] = new C2458k(Integer.valueOf(C3148R.string.help_app_not_working), (C3350b) null, 2, (C3366g) null);
            tVarArr[2] = C1783a.f5089a.mo6548k() ? new C2471s(new C2014b(this)) : null;
            tVarArr[3] = Build.VERSION.SDK_INT < 23 ? null : new C2471s(new C2016c(this));
            tVarArr[4] = new C2471s(C2057d.f5658g);
            tVarArr[5] = new C2471s(new C2018d(this));
            C1116a.C1117a.m5570a(a, C3284j.m12072c(tVarArr), (C3351c) null, (C3351c) null, 6, (Object) null);
            if (C1783a.f5089a.mo6543f()) {
                a.addAll(C3284j.m12070b((T[]) new C2472t[]{new C2458k(Integer.valueOf(C3148R.string.help_actions_fail_oneplus), (C3350b) null, 2, (C3366g) null), new C2471s(C2058e.f5659g)}));
            }
            eVar.mo5190a((C1116a<?>) a);
            C2460l.m9204a(eVar);
            C2479v.m9274a(eVar, (C3350b) null, 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.ActivitySettings$k */
    static final class C2020k extends C3371l implements C3350b<C1041c, Unit> {

        /* renamed from: g */
        final /* synthetic */ ActivitySettings f5602g;

        /* renamed from: com.fb.fluid.ui.ActivitySettings$k$a */
        static final class C2021a extends C3371l implements C3352d<C1041c, Integer, String, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2020k f5603g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2021a(C2020k kVar) {
                super(3);
                this.f5603g = kVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
                mo6864a((C1041c) obj, ((Number) obj2).intValue(), (String) obj3);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6864a(C1041c cVar, int i, String str) {
                C3370k.m12227b(cVar, "<anonymous parameter 0>");
                C3370k.m12227b(str, "<anonymous parameter 2>");
                if (i == 0) {
                    ActivitySettings activitySettings = this.f5603g.f5602g;
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/html");
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"fbarrosoapps@gmail.com"});
                    intent.putExtra("android.intent.extra.SUBJECT", '[' + this.f5603g.f5602g.getPackageName() + "] " + this.f5603g.f5602g.getString(C3148R.string.contact_email_title_subject));
                    StringBuilder sb = new StringBuilder();
                    sb.append("Hello,\n\n");
                    C1755l.C1756a aVar = C1755l.f5077b;
                    Context baseContext = this.f5603g.f5602g.getBaseContext();
                    C3370k.m12223a((Object) baseContext, "baseContext");
                    sb.append(aVar.mo6523a(baseContext));
                    intent.putExtra("android.intent.extra.TEXT", sb.toString());
                    activitySettings.startActivity(Intent.createChooser(intent, this.f5603g.f5602g.getString(C3148R.string.contact_email_title)));
                } else if (i == 1) {
                    C1764a.m7435a(this.f5603g.f5602g, (String) null, C3148R.string.url_dev_telegram, 1, (Object) null);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2020k(ActivitySettings activitySettings) {
            super(1);
            this.f5602g = activitySettings;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6863a((C1041c) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6863a(C1041c cVar) {
            C3370k.m12227b(cVar, "it");
            C1041c cVar2 = new C1041c(this.f5602g, (C1039a) null, 2, (C3366g) null);
            C1041c.m5351a(cVar2, Integer.valueOf(C3148R.string.header_contact), (String) null, 2, (Object) null);
            C1041c cVar3 = cVar2;
            C1096a.m5494a(cVar3, (Integer) null, C3284j.m12070b((T[]) new String[]{this.f5602g.getString(C3148R.string.contact_email), this.f5602g.getString(C3148R.string.contact_telegram)}), (int[]) null, false, new C2021a(this), 13, (Object) null);
            cVar2.show();
        }
    }

    /* renamed from: com.fb.fluid.ui.ActivitySettings$l */
    static final class C2022l extends C3371l implements C3350b<C1114e, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1041c f5604g;

        /* renamed from: h */
        final /* synthetic */ ActivitySettings f5605h;

        /* renamed from: i */
        final /* synthetic */ C3383x f5606i;

        /* renamed from: j */
        final /* synthetic */ C3383x f5607j;

        /* renamed from: com.fb.fluid.ui.ActivitySettings$l$a */
        static final class C2023a extends C3371l implements C3350b<C2471s, Unit> {

            /* renamed from: g */
            final /* synthetic */ int f5608g;

            /* renamed from: h */
            final /* synthetic */ int f5609h;

            /* renamed from: i */
            final /* synthetic */ C2022l f5610i;

            /* renamed from: com.fb.fluid.ui.ActivitySettings$l$a$a */
            static final class C2024a extends C3371l implements C3351c<C2471s, Integer, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2023a f5611g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2024a(C2023a aVar) {
                    super(2);
                    this.f5611g = aVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    mo6867a((C2471s) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo6867a(C2471s sVar, int i) {
                    C3370k.m12227b(sVar, "<anonymous parameter 0>");
                    this.f5611g.f5610i.f5604g.dismiss();
                    if (this.f5611g.f5610i.f5605h.m8215u().mo7366c() != this.f5611g.f5610i.f5605h.m8215u().mo7367d().get(this.f5611g.f5609h).intValue()) {
                        C2022l lVar = this.f5611g.f5610i;
                        lVar.f5606i.f8049f = (Integer) lVar.f5605h.m8215u().mo7367d().get(this.f5611g.f5609h);
                    }
                }
            }

            /* renamed from: com.fb.fluid.ui.ActivitySettings$l$a$b */
            static final class C2025b extends C3371l implements C3351c<Context, C2472t<Object>, Drawable> {

                /* renamed from: g */
                final /* synthetic */ C2023a f5612g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2025b(C2023a aVar) {
                    super(2);
                    this.f5612g = aVar;
                }

                /* renamed from: a */
                public final Drawable mo6125a(Context context, C2472t<Object> tVar) {
                    C3370k.m12227b(context, "context");
                    C3370k.m12227b(tVar, "<anonymous parameter 1>");
                    return context.getDrawable(this.f5612g.f5610i.f5605h.m8215u().mo7367d().get(this.f5612g.f5609h).intValue() == this.f5612g.f5610i.f5605h.m8215u().mo7366c() ? C3148R.C3149drawable.ic_menu_check_circle : C3148R.C3149drawable.ic_menu_check_circle_outline);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2023a(int i, int i2, C2022l lVar) {
                super(1);
                this.f5608g = i;
                this.f5609h = i2;
                this.f5610i = lVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                mo6866a((C2471s) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6866a(C2471s sVar) {
                C3370k.m12227b(sVar, "$receiver");
                sVar.mo7330b(true);
                C2471s sVar2 = sVar;
                C2472t.m9231b(sVar2, (String) null, Integer.valueOf(this.f5608g), (C3349a) null, 5, (Object) null);
                sVar.mo7315a(new C2024a(this));
                C2472t.m9225a(sVar2, (Drawable) null, (Integer) null, true, (Integer) null, new C2025b(this), 11, (Object) null);
            }
        }

        /* renamed from: com.fb.fluid.ui.ActivitySettings$l$b */
        static final class C2026b extends C3371l implements C3350b<C2408a0, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2022l f5613g;

            /* renamed from: com.fb.fluid.ui.ActivitySettings$l$b$a */
            static final class C2027a extends C3371l implements C3350b<C2472t<Boolean>, Boolean> {

                /* renamed from: g */
                final /* synthetic */ C2026b f5614g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2027a(C2026b bVar) {
                    super(1);
                    this.f5614g = bVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                    return Boolean.valueOf(mo6870a((C2472t<Boolean>) (C2472t) obj));
                }

                /* renamed from: a */
                public final boolean mo6870a(C2472t<Boolean> tVar) {
                    C3370k.m12227b(tVar, "it");
                    return this.f5614g.f5613g.f5605h.m8215u().mo7364a();
                }
            }

            /* renamed from: com.fb.fluid.ui.ActivitySettings$l$b$b */
            static final class C2028b extends C3371l implements C3351c<C2472t<Boolean>, Boolean, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2026b f5615g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2028b(C2026b bVar) {
                    super(2);
                    this.f5615g = bVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    mo6871a((C2472t<Boolean>) (C2472t) obj, ((Boolean) obj2).booleanValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo6871a(C2472t<Boolean> tVar, boolean z) {
                    C3370k.m12227b(tVar, "<anonymous parameter 0>");
                    this.f5615g.f5613g.f5604g.dismiss();
                    this.f5615g.f5613g.f5607j.f8049f = Boolean.valueOf(z);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2026b(C2022l lVar) {
                super(1);
                this.f5613g = lVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                mo6869a((C2408a0) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6869a(C2408a0 a0Var) {
                C3370k.m12227b(a0Var, "$receiver");
                a0Var.mo7330b(true);
                C2472t.m9231b(a0Var, (String) null, Integer.valueOf(C3148R.string.theme_mode_night_black), (C3349a) null, 5, (Object) null);
                a0Var.mo7322a(new C2027a(this), new C2028b(this));
            }
        }

        /* renamed from: com.fb.fluid.ui.ActivitySettings$l$c */
        static final class C2029c extends C3371l implements C3350b<C1041c, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2022l f5616g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2029c(C2022l lVar) {
                super(1);
                this.f5616g = lVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                mo6872a((C1041c) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6872a(C1041c cVar) {
                C3370k.m12227b(cVar, "it");
                Integer num = (Integer) this.f5616g.f5606i.f8049f;
                if (num != null) {
                    this.f5616g.f5605h.m8215u().mo7361a(num.intValue());
                }
                Boolean bool = (Boolean) this.f5616g.f5607j.f8049f;
                if (bool != null) {
                    this.f5616g.f5605h.m8215u().mo7363a(bool.booleanValue());
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2022l(C1041c cVar, ActivitySettings activitySettings, C3383x xVar, C3383x xVar2) {
            super(1);
            this.f5604g = cVar;
            this.f5605h = activitySettings;
            this.f5606i = xVar;
            this.f5607j = xVar2;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6865a((C1114e) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6865a(C1114e eVar) {
            C3370k.m12227b(eVar, "$receiver");
            C1116a<Object> a = C1118b.m5571a(new Object[0]);
            List<Integer> b = this.f5605h.m8215u().mo7365b();
            ArrayList arrayList = new ArrayList(C3285k.m12075a(b, 10));
            int i = 0;
            for (T next : b) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(new C2471s(new C2023a(((Number) next).intValue(), i, this)));
                    i = i2;
                } else {
                    C3282h.m12055c();
                    throw null;
                }
            }
            C1116a.C1117a.m5570a(a, arrayList, (C3351c) null, (C3351c) null, 6, (Object) null);
            a.addAll(C3284j.m12070b((T[]) new C2472t[]{new C2458k((Object) null, (C3350b) null, 3, (C3366g) null), new C2408a0(new C2026b(this))}));
            eVar.mo5190a((C1116a<?>) a);
            C1058a.m5386a(this.f5604g, (C3350b<? super C1041c, Unit>) new C2029c(this));
            C2460l.m9204a(eVar);
            C2479v.m9274a(eVar, (C3350b) null, 1, (Object) null);
            C2422b0.m9117a(eVar, (C3351c) null, 1, (Object) null);
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(ActivitySettings.class), "kodein", "getKodein()Lorg/kodein/di/Kodein;");
        C3384y.m12259a((C3379t) uVar);
        C3380u uVar2 = new C3380u(C3384y.m12254a(ActivitySettings.class), "themeHelper", "getThemeHelper()Lcom/fb/fluid/ui/theme/ThemeHelper;");
        C3384y.m12259a((C3379t) uVar2);
        C3380u uVar3 = new C3380u(C3384y.m12254a(ActivitySettings.class), "prefHelper", "getPrefHelper()Lcom/fb/fluid/utils/preferences/SharedPrefHelper;");
        C3384y.m12259a((C3379t) uVar3);
        f5562D = new C3208i[]{uVar, uVar2, uVar3};
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m8197A() {
        C3383x xVar = new C3383x();
        xVar.f8049f = null;
        C3383x xVar2 = new C3383x();
        xVar2.f8049f = null;
        C1041c cVar = new C1041c(this, (C1039a) null, 2, (C3366g) null);
        C1041c.m5351a(cVar, Integer.valueOf(C3148R.string.header_app_theme), (String) null, 2, (Object) null);
        RecyclerView recyclerView = new RecyclerView(getBaseContext());
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), C1165a.m5734a(8));
        C1111d.m5549a(recyclerView, new C2022l(cVar, this, xVar, xVar2));
        C1084a.m5469a(cVar, (Integer) null, recyclerView, false, false, false, false, 61, (Object) null);
        cVar.show();
    }

    /* renamed from: a */
    static /* synthetic */ void m8200a(ActivitySettings activitySettings, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        activitySettings.m8201a(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8201a(boolean z) {
        Fragment r = m8212r();
        Fragment a = mo2364k().mo2453a((int) C3148R.C3151id.container);
        if (!r.getClass().isInstance(a) || z) {
            C0411l k = mo2364k();
            C3370k.m12223a((Object) k, "supportFragmentManager");
            C0438s b = k.mo2475b();
            C3370k.m12223a((Object) b, "beginTransaction()");
            b.mo2591a((int) C3148R.C3151id.container, r);
            b.mo2340d(r);
            if (a != null) {
                b.mo2590a(4097);
            }
            b.mo2322a();
        }
    }

    /* renamed from: r */
    private final Fragment m8212r() {
        int s = m8213s();
        if (s == 2) {
            return new C2123d0();
        }
        if (s == 8) {
            return new C2403y();
        }
        if (s == 10) {
            return new C2168g();
        }
        if (s == 13) {
            return new C2316n0();
        }
        Bundle bundle = null;
        switch (s) {
            case 15:
                return new C2077a0();
            case 16:
                return new C2379t();
            case 17:
                return new C2350q0();
            case 18:
            case 19:
                C2169g0.C2170a aVar = C2169g0.f5834h0;
                Intent intent = getIntent();
                if (intent != null) {
                    bundle = intent.getExtras();
                }
                return aVar.mo7024a(bundle);
            case 20:
                return new C2329p0();
            case 21:
                return new C2328p();
            default:
                switch (s) {
                    case 24:
                        C2069a.C2070a aVar2 = C2069a.f5670f0;
                        Intent intent2 = getIntent();
                        if (intent2 != null) {
                            bundle = intent2.getExtras();
                        }
                        return aVar2.mo6946a(bundle);
                    case 25:
                        C2127e.C2128a aVar3 = C2127e.f5767q0;
                        Intent intent3 = getIntent();
                        if (intent3 != null) {
                            bundle = intent3.getExtras();
                        }
                        return aVar3.mo6995a(bundle);
                    case 26:
                        return new C2354r();
                    case 27:
                        return new C2108b0();
                    default:
                        return new C2379t();
                }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final int m8213s() {
        Bundle extras;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return 16;
        }
        return extras.getInt("page", 16);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final C2527h m8214t() {
        C3256e eVar = this.f5564A;
        C3208i iVar = f5562D[2];
        return (C2527h) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final C2493a m8215u() {
        C3256e eVar = this.f5568z;
        C3208i iVar = f5562D[1];
        return (C2493a) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final C2059f m8216v() {
        C0508z a = C0472b0.m2418a((C0401d) this).mo2674a(C2059f.class);
        C3370k.m12223a((Object) a, "ViewModelProviders.of(th…ngsViewModel::class.java)");
        return (C2059f) a;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m8217w() {
        C2030a.C2031a.m8300a(C2030a.f5617n0, this, (Bundle) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final void m8218x() {
        C1041c cVar = new C1041c(this, (C1039a) null, 2, (C3366g) null);
        C1041c.m5351a(cVar, Integer.valueOf(C3148R.string.header_backup), (String) null, 2, (Object) null);
        RecyclerView recyclerView = new RecyclerView(getBaseContext());
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), C1165a.m5734a(8));
        C1111d.m5549a(recyclerView, new C2001h(this));
        C1084a.m5469a(cVar, (Integer) null, recyclerView, false, false, false, false, 61, (Object) null);
        cVar.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m8219y() {
        C2037a.C2039b.m8351a(C2037a.f5629s0, this, (List) null, new C2010i(this), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m8220z() {
        C1041c cVar = new C1041c(this, new C1559a(C1040b.WRAP_CONTENT));
        C1041c.m5351a(cVar, Integer.valueOf(C3148R.string.header_help), (String) null, 2, (Object) null);
        RecyclerView recyclerView = new RecyclerView(getBaseContext());
        C1111d.m5549a(recyclerView, new C2011j(cVar, this));
        C1084a.m5469a(cVar, (Integer) null, recyclerView, false, false, false, false, 61, (Object) null);
        C1041c.m5352b(cVar, Integer.valueOf(C3148R.string.header_contact), (CharSequence) null, new C2020k(this), 2, (Object) null);
        cVar.show();
    }

    /* renamed from: c */
    public C3134v mo6349c() {
        return C3117n.C3118a.m11765b(this);
    }

    /* renamed from: d */
    public View mo6840d(int i) {
        if (this.f5566C == null) {
            this.f5566C = new HashMap();
        }
        View view = (View) this.f5566C.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f5566C.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public C3125q<?> mo6350d() {
        return C3117n.C3118a.m11764a(this);
    }

    /* renamed from: e */
    public C3059m mo6351e() {
        C3256e eVar = this.f5567y;
        C3208i iVar = f5562D[0];
        return (C3059m) eVar.getValue();
    }

    public void onBackPressed() {
        if (m8213s() != 16 || !C1734c.f5038h.mo6478g()) {
            super.onBackPressed();
        } else {
            finishAfterTransition();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        m8215u().mo7362a((C0401d) this);
        super.onCreate(bundle);
        setContentView((int) C3148R.layout.activity_main);
        C2048d g = m8216v().mo6918g();
        g.mo6884a((C0490o) this, (C3352d<? super Integer, ? super C1660h, ? super List<C1668l>, Unit>) new C1995d(this, g));
        BottomAppBar bottomAppBar = (BottomAppBar) mo6840d(C1718g.app_bar);
        bottomAppBar.setOnApplyWindowInsetsListener(new C1998e(bottomAppBar));
        bottomAppBar.setOnMenuItemClickListener(new C1994c(this));
        m8200a(this, false, 1, (Object) null);
        C1797a.m7557a(C1770f.m7463a((C0401d) this).mo6352f().mo6587a(), (C0490o) this).mo6030a(new C1999f(this));
        if (!m8214t().mo7549q()) {
            ActivityIntro.f5556A.mo6839a(this);
        }
    }
}
