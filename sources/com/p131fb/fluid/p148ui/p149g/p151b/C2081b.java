package com.p131fb.fluid.p148ui.p149g.p151b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import androidx.lifecycle.C0497t;
import com.p131fb.fluid.App;
import com.p131fb.fluid.data.C1706c;
import com.p131fb.fluid.data.TriggerButton;
import com.p131fb.fluid.p135l.C1734c;
import com.p131fb.fluid.p135l.C1755l;
import com.p131fb.fluid.p135l.p139p.C1770f;
import com.p131fb.fluid.p135l.p140q.C1783a;
import com.p131fb.fluid.p148ui.p149g.p150a.C2065d;
import com.p131fb.fluid.p148ui.p149g.p150a.C2067f;
import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;
import com.p131fb.fluid.p148ui.p149g.p152c.C2408a0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2428c0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2458k;
import com.p131fb.fluid.p148ui.p149g.p152c.C2471s;
import com.p131fb.fluid.p148ui.p149g.p152c.C2472t;
import com.p131fb.fluid.utils.preferences.C2527h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.C3256e;
import kotlin.C3265l;
import kotlin.Unit;
import kotlin.p192b0.C3208i;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p197u.p199i.p200a.C3332f;
import kotlin.p197u.p199i.p200a.C3339l;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
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
import p054c.p055a.p067b.p068f.C1116a;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p162q.C2827e;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.android.C3148R;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: com.fb.fluid.ui.g.b.b */
public final class C2081b extends C2317o {

    /* renamed from: r */
    static final /* synthetic */ C3208i[] f5688r;

    /* renamed from: i */
    private final C0497t<C2068g> f5689i = new C0497t<>();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C2527h f5690j = new C2527h(this.f5693m);

    /* renamed from: k */
    private C2810b f5691k = this.f5693m.mo6352f().mo6587a().mo8927b(new C2082a(this));

    /* renamed from: l */
    private final C3256e f5692l = C3258g.m11969a(new C2083b(this));

    /* renamed from: m */
    private final App f5693m;

    /* renamed from: n */
    private final int f5694n;

    /* renamed from: o */
    private final boolean f5695o;

    /* renamed from: p */
    private final boolean f5696p;

    /* renamed from: q */
    private final ArrayList<String> f5697q;

    /* renamed from: com.fb.fluid.ui.g.b.b$a */
    static final class C2082a<T> implements C2827e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C2081b f5698a;

        C2082a(C2081b bVar) {
            this.f5698a = bVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f5698a.mo7159g().mo5205c();
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.b$b */
    static final class C2083b extends C3371l implements C3349a<int[]> {

        /* renamed from: g */
        final /* synthetic */ C2081b f5699g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2083b(C2081b bVar) {
            super(0);
            this.f5699g = bVar;
        }

        public final int[] invoke() {
            return this.f5699g.mo6955j().getResources().getIntArray(C3148R.array.actions_pro);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.b$c */
    static final class C2084c extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ int f5700g;

        /* renamed from: h */
        final /* synthetic */ C2081b f5701h;

        /* renamed from: com.fb.fluid.ui.g.b.b$c$a */
        static final class C2085a extends C3371l implements C3349a<String> {

            /* renamed from: g */
            final /* synthetic */ C2084c f5702g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2085a(C2084c cVar) {
                super(0);
                this.f5702g = cVar;
            }

            public final String invoke() {
                int i;
                App app;
                C2084c cVar = this.f5702g;
                switch (cVar.f5700g) {
                    case 17:
                    case 18:
                        return cVar.f5701h.mo6955j().getString(C3148R.string.action_root_android_pie);
                    case 20:
                        app = cVar.f5701h.mo6955j();
                        i = C3148R.string.action_rotation_app_sum;
                        break;
                    case 22:
                        app = cVar.f5701h.mo6955j();
                        i = C3148R.string.action_one_hand_mode_sum;
                        break;
                    case 24:
                        app = cVar.f5701h.mo6955j();
                        i = C3148R.string.action_rotation_pie_sum;
                        break;
                    case 25:
                    case 27:
                    case 28:
                        app = cVar.f5701h.mo6955j();
                        i = C3148R.string.action_root;
                        break;
                    default:
                        return BuildConfig.FLAVOR;
                }
                return app.getString(i);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.b$c$b */
        static final class C2086b extends C3371l implements C3351c<Context, C2472t<Object>, Drawable> {

            /* renamed from: g */
            final /* synthetic */ C2084c f5703g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2086b(C2084c cVar) {
                super(2);
                this.f5703g = cVar;
            }

            /* renamed from: a */
            public final Drawable mo6125a(Context context, C2472t<Object> tVar) {
                C3370k.m12227b(context, "context");
                C3370k.m12227b(tVar, "<anonymous parameter 1>");
                Drawable a = TriggerButton.C1698a.m7286a(TriggerButton.Companion, context, this.f5703g.f5700g, 0, 4, (Object) null);
                if (a == null) {
                    a = context.getDrawable(C3148R.C3149drawable.empty);
                }
                if (a == null) {
                    return null;
                }
                a.setTint(C1770f.m7461a(context, 16842808));
                return a;
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.b$c$c */
        static final class C2087c extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2084c f5704g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2087c(C2084c cVar) {
                super(2);
                this.f5704g = cVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo6961a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6961a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                this.f5704g.f5701h.mo6956k().setValue(new C2122d(this.f5704g.f5700g));
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.b$c$d */
        static final class C2088d extends C3371l implements C3351c<C2472t<Object>, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2084c f5705g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2088d(C2084c cVar) {
                super(2);
                this.f5705g = cVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo6962a((C2472t<Object>) (C2472t) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6962a(C2472t<Object> tVar, int i) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                this.f5705g.f5701h.mo7160h().setValue(new C2067f(C3148R.string.billing_pro_required));
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.b$c$e */
        static final class C2089e extends C3371l implements C3349a<Boolean> {

            /* renamed from: g */
            final /* synthetic */ C2084c f5706g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2089e(C2084c cVar) {
                super(0);
                this.f5706g = cVar;
            }

            public final boolean invoke() {
                this.f5706g.f5701h.mo6955j().mo6352f().mo6589b().booleanValue();
                if (0 != 0) {
                    int[] b = this.f5706g.f5701h.m8445n();
                    C3370k.m12223a((Object) b, "actionsPro");
                    return !C3280f.m12021b(b, this.f5706g.f5700g) ? true : true;
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2084c(int i, C2081b bVar) {
            super(1);
            this.f5700g = i;
            this.f5701h = bVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6959a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6959a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9231b(sVar2, TriggerButton.Companion.mo6422a(this.f5701h.mo6955j(), this.f5700g), (Integer) null, (C3349a) null, 6, (Object) null);
            C2472t.m9227a((C2472t) sVar2, (String) null, (Integer) null, (C3349a) new C2085a(this), 3, (Object) null);
            C2472t.m9225a(sVar2, (Drawable) null, (Integer) null, false, (Integer) null, new C2086b(this), 15, (Object) null);
            sVar.mo7315a(new C2087c(this));
            sVar.mo7329b(new C2088d(this));
            C2472t.m9226a((C2472t) sVar, (Boolean) null, (C3349a) new C2089e(this), 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.b$d */
    static final class C2090d extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2081b f5707g;

        /* renamed from: com.fb.fluid.ui.g.b.b$d$a */
        static final class C2091a extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2090d f5708g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2091a(C2090d dVar) {
                super(2);
                this.f5708g = dVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo6964a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6964a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                C0497t<C2068g> k = this.f5708g.f5707g.mo6956k();
                PackageItemInfo packageItemInfo = new PackageItemInfo();
                packageItemInfo.packageName = "*";
                k.setValue(new C2200j(new C1706c(packageItemInfo)));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2090d(C2081b bVar) {
            super(1);
            this.f5707g = bVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6963a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6963a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.pref_select_all_apps), (C3349a) null, 5, (Object) null);
            C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_android), false, (Integer) null, (C3351c) null, 29, (Object) null);
            sVar.mo7315a(new C2091a(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.b$e */
    static final class C2092e extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ Parcelable f5709g;

        /* renamed from: h */
        final /* synthetic */ C2081b f5710h;

        /* renamed from: com.fb.fluid.ui.g.b.b$e$a */
        static final class C2093a extends C3371l implements C3351c<Context, C2472t<Object>, Drawable> {

            /* renamed from: g */
            final /* synthetic */ C2092e f5711g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2093a(C2092e eVar) {
                super(2);
                this.f5711g = eVar;
            }

            /* renamed from: a */
            public final Drawable mo6125a(Context context, C2472t<Object> tVar) {
                C3370k.m12227b(context, "<anonymous parameter 0>");
                C3370k.m12227b(tVar, "<anonymous parameter 1>");
                C2092e eVar = this.f5711g;
                return ((ApplicationInfo) eVar.f5709g).loadIcon(eVar.f5710h.mo6955j().getPackageManager());
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.b$e$b */
        static final class C2094b extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2092e f5712g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2094b(C2092e eVar) {
                super(2);
                this.f5712g = eVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo6967a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6967a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                this.f5712g.f5710h.mo6956k().setValue(new C2200j(new C1706c((PackageItemInfo) this.f5712g.f5709g)));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2092e(Parcelable parcelable, C2081b bVar) {
            super(1);
            this.f5709g = parcelable;
            this.f5710h = bVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6965a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6965a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2472t.m9231b(sVar, ((ApplicationInfo) this.f5709g).loadLabel(this.f5710h.mo6955j().getPackageManager()).toString(), (Integer) null, (C3349a) null, 6, (Object) null);
            C2471s sVar2 = sVar;
            C2472t.m9227a((C2472t) sVar2, ((ApplicationInfo) this.f5709g).packageName, (Integer) null, (C3349a) null, 6, (Object) null);
            C2472t.m9225a(sVar2, (Drawable) null, (Integer) null, false, (Integer) null, new C2093a(this), 15, (Object) null);
            sVar.mo7315a(new C2094b(this));
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.b$f */
    static final class C2095f extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ Parcelable f5713g;

        /* renamed from: h */
        final /* synthetic */ C2081b f5714h;

        /* renamed from: com.fb.fluid.ui.g.b.b$f$a */
        static final class C2096a extends C3371l implements C3351c<Context, C2472t<Object>, Drawable> {

            /* renamed from: g */
            final /* synthetic */ C2095f f5715g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2096a(C2095f fVar) {
                super(2);
                this.f5715g = fVar;
            }

            /* renamed from: a */
            public final Drawable mo6125a(Context context, C2472t<Object> tVar) {
                C3370k.m12227b(context, "<anonymous parameter 0>");
                C3370k.m12227b(tVar, "<anonymous parameter 1>");
                C2095f fVar = this.f5715g;
                return ((ResolveInfo) fVar.f5713g).loadIcon(fVar.f5714h.mo6955j().getPackageManager());
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.b$f$b */
        static final class C2097b extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2095f f5716g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2097b(C2095f fVar) {
                super(2);
                this.f5716g = fVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo6970a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6970a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                C0497t<C2068g> k = this.f5716g.f5714h.mo6956k();
                ActivityInfo activityInfo = ((ResolveInfo) this.f5716g.f5713g).activityInfo;
                C3370k.m12223a((Object) activityInfo, "info.activityInfo");
                k.setValue(new C2200j(new C1706c((PackageItemInfo) activityInfo)));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2095f(Parcelable parcelable, C2081b bVar) {
            super(1);
            this.f5713g = parcelable;
            this.f5714h = bVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6968a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6968a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9231b(sVar2, ((ResolveInfo) this.f5713g).loadLabel(this.f5714h.mo6955j().getPackageManager()).toString(), (Integer) null, (C3349a) null, 6, (Object) null);
            C2472t.m9225a(sVar2, (Drawable) null, (Integer) null, false, (Integer) null, new C2096a(this), 15, (Object) null);
            sVar.mo7315a(new C2097b(this));
            if (this.f5714h.mo6954i()) {
                ActivityInfo activityInfo = ((ResolveInfo) this.f5713g).activityInfo;
                C2472t.m9227a((C2472t) sVar, activityInfo != null ? activityInfo.packageName : null, (Integer) null, (C3349a) null, 6, (Object) null);
            }
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.b$g */
    static final class C2098g extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ ResolveInfo f5717g;

        /* renamed from: h */
        final /* synthetic */ C2081b f5718h;

        /* renamed from: com.fb.fluid.ui.g.b.b$g$a */
        static final class C2099a extends C3371l implements C3351c<C2472t<Object>, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2098g f5719g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2099a(C2098g gVar) {
                super(2);
                this.f5719g = gVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo6972a((C2472t<Object>) (C2472t) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6972a(C2472t<Object> tVar, int i) {
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                C1770f.m7465a((Context) this.f5719g.f5718h.mo6955j(), (int) C3148R.string.billing_pro_required, 0, 2, (Object) null);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.b$g$b */
        static final class C2100b extends C3371l implements C3351c<Context, C2472t<Object>, Drawable> {

            /* renamed from: g */
            final /* synthetic */ C2098g f5720g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2100b(C2098g gVar) {
                super(2);
                this.f5720g = gVar;
            }

            /* renamed from: a */
            public final Drawable mo6125a(Context context, C2472t<Object> tVar) {
                C3370k.m12227b(context, "<anonymous parameter 0>");
                C3370k.m12227b(tVar, "<anonymous parameter 1>");
                C2098g gVar = this.f5720g;
                return gVar.f5717g.loadIcon(gVar.f5718h.mo6955j().getPackageManager());
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.b$g$c */
        static final class C2101c extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2098g f5721g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2101c(C2098g gVar) {
                super(2);
                this.f5721g = gVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo6974a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6974a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                Intent intent = new Intent("android.intent.action.CREATE_SHORTCUT");
                intent.setComponent(new ComponentName(this.f5721g.f5717g.activityInfo.applicationInfo.packageName, this.f5721g.f5717g.activityInfo.name));
                this.f5721g.f5718h.mo6956k().setValue(new C2258l0(intent));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2098g(ResolveInfo resolveInfo, C2081b bVar) {
            super(1);
            this.f5717g = resolveInfo;
            this.f5718h = bVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6971a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6971a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9231b(sVar2, this.f5717g.loadLabel(this.f5718h.mo6955j().getPackageManager()).toString(), (Integer) null, (C3349a) null, 6, (Object) null);
            C2472t.m9225a(sVar2, (Drawable) null, (Integer) null, false, (Integer) null, new C2100b(this), 15, (Object) null);
            sVar.mo7315a(new C2101c(this));
        }
    }

    @C3332f(mo10052c = "com.fb.fluid.ui.preferences.fragments.ActionPickerVM$setupDataSource$1", mo10053f = "ActionPickerFragment.kt", mo10054l = {305}, mo10055m = "invokeSuspend")
    /* renamed from: com.fb.fluid.ui.g.b.b$h */
    static final class C2102h extends C3339l implements C3351c<C3418e0, C3309c<? super Unit>, Object> {

        /* renamed from: j */
        private C3418e0 f5722j;

        /* renamed from: k */
        Object f5723k;

        /* renamed from: l */
        Object f5724l;

        /* renamed from: m */
        int f5725m;

        /* renamed from: n */
        final /* synthetic */ C2081b f5726n;

        /* renamed from: com.fb.fluid.ui.g.b.b$h$a */
        static final class C2103a extends C3371l implements C3350b<C2408a0, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2102h f5727g;

            /* renamed from: com.fb.fluid.ui.g.b.b$h$a$a */
            static final class C2104a extends C3371l implements C3350b<C2472t<Boolean>, Boolean> {

                /* renamed from: g */
                final /* synthetic */ C2103a f5728g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2104a(C2103a aVar) {
                    super(1);
                    this.f5728g = aVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                    return Boolean.valueOf(mo6976a((C2472t<Boolean>) (C2472t) obj));
                }

                /* renamed from: a */
                public final boolean mo6976a(C2472t<Boolean> tVar) {
                    C3370k.m12227b(tVar, "it");
                    return this.f5728g.f5727g.f5726n.f5690j.mo7490C();
                }
            }

            /* renamed from: com.fb.fluid.ui.g.b.b$h$a$b */
            static final class C2105b extends C3371l implements C3351c<C2472t<Boolean>, Boolean, Unit> {

                /* renamed from: g */
                final /* synthetic */ C2103a f5729g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2105b(C2103a aVar) {
                    super(2);
                    this.f5729g = aVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                    mo6977a((C2472t<Boolean>) (C2472t) obj, ((Boolean) obj2).booleanValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo6977a(C2472t<Boolean> tVar, boolean z) {
                    C3370k.m12227b(tVar, "<anonymous parameter 0>");
                    this.f5729g.f5727g.f5726n.f5690j.mo7540l(z);
                }
            }

            /* renamed from: com.fb.fluid.ui.g.b.b$h$a$c */
            static final class C2106c extends C3371l implements C3350b<Boolean, Boolean> {

                /* renamed from: g */
                final /* synthetic */ C2103a f5730g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2106c(C2103a aVar) {
                    super(1);
                    this.f5730g = aVar;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                    return Boolean.valueOf(mo6978a(((Boolean) obj).booleanValue()));
                }

                /* renamed from: a */
                public final boolean mo6978a(boolean z) {
                    this.f5730g.f5727g.f5726n.m8448q();
                    return true;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2103a(C2102h hVar) {
                super(1);
                this.f5727g = hVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                mo6975a((C2408a0) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6975a(C2408a0 a0Var) {
                C3370k.m12227b(a0Var, "$receiver");
                a0Var.mo7319a("show_all_pkgs");
                a0Var.mo7322a(new C2104a(this), new C2105b(this));
                C2472t.m9227a((C2472t) a0Var, (String) null, Integer.valueOf(C3148R.string.pref_show_all_pkgs), (C3349a) null, 5, (Object) null);
                a0Var.mo7238a(new C2106c(this));
            }
        }

        @C3332f(mo10052c = "com.fb.fluid.ui.preferences.fragments.ActionPickerVM$setupDataSource$1$2", mo10053f = "ActionPickerFragment.kt", mo10054l = {}, mo10055m = "invokeSuspend")
        /* renamed from: com.fb.fluid.ui.g.b.b$h$b */
        static final class C2107b extends C3339l implements C3351c<C3418e0, C3309c<? super List<? extends C2472t<? extends Object>>>, Object> {

            /* renamed from: j */
            private C3418e0 f5731j;

            /* renamed from: k */
            int f5732k;

            /* renamed from: l */
            final /* synthetic */ C2102h f5733l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2107b(C2102h hVar, C3309c cVar) {
                super(2, cVar);
                this.f5733l = hVar;
            }

            /* renamed from: a */
            public final Object mo6125a(Object obj, Object obj2) {
                return ((C2107b) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
            }

            /* renamed from: a */
            public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
                C3370k.m12227b(cVar, "completion");
                C2107b bVar = new C2107b(this.f5733l, cVar);
                bVar.f5731j = (C3418e0) obj;
                return bVar;
            }

            /* renamed from: b */
            public final Object mo6618b(Object obj) {
                Object unused = C3326d.m12146a();
                if (this.f5732k == 0) {
                    C3265l.m11979a(obj);
                    int l = this.f5733l.f5726n.mo6957l();
                    return l != 0 ? l != 1 ? this.f5733l.f5726n.m8447p() : this.f5733l.f5726n.m8446o() : this.f5733l.f5726n.m8444m();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2102h(C2081b bVar, C3309c cVar) {
            super(2, cVar);
            this.f5726n = bVar;
        }

        /* renamed from: a */
        public final Object mo6125a(Object obj, Object obj2) {
            return ((C2102h) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
        }

        /* renamed from: a */
        public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
            C3370k.m12227b(cVar, "completion");
            C2102h hVar = new C2102h(this.f5726n, cVar);
            hVar.f5722j = (C3418e0) obj;
            return hVar;
        }

        /* renamed from: b */
        public final Object mo6618b(Object obj) {
            Object obj2;
            C1116a<Object> aVar;
            Object a = C3326d.m12146a();
            int i = this.f5725m;
            if (i == 0) {
                C3265l.m11979a(obj);
                C3418e0 e0Var = this.f5722j;
                this.f5726n.mo7160h().setValue(new C2065d(true));
                C1116a.C1117a.m5570a(this.f5726n.mo7159g(), C3283i.m12064a(new C2428c0((String) null, (Integer) null, false, false, false, true, 0, (C3350b) null, 199, (C3366g) null)), (C3351c) null, (C3351c) null, 6, (Object) null);
                if (this.f5726n.mo6957l() == 1) {
                    C1116a<Object> g = this.f5726n.mo7159g();
                    Object[] objArr = new Object[2];
                    objArr[0] = !this.f5726n.mo6954i() ? null : new C2408a0(new C2103a(this));
                    objArr[1] = !this.f5726n.mo6954i() ? null : new C2458k((Object) null, (C3350b) null, 3, (C3366g) null);
                    g.addAll(C3284j.m12072c(objArr));
                }
                C1116a<Object> g2 = this.f5726n.mo7159g();
                C3556z a2 = C3536t0.m12776a();
                C2107b bVar = new C2107b(this, (C3309c) null);
                this.f5723k = e0Var;
                this.f5724l = g2;
                this.f5725m = 1;
                obj2 = C3412d.m12326a(a2, bVar, this);
                if (obj2 == a) {
                    return a;
                }
                aVar = g2;
            } else if (i == 1) {
                aVar = (C1116a) this.f5724l;
                C3418e0 e0Var2 = (C3418e0) this.f5723k;
                C3265l.m11979a(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar.addAll((Collection) obj2);
            this.f5726n.mo7160h().setValue(new C2065d(false));
            return Unit.INSTANCE;
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C2081b.class), "actionsPro", "getActionsPro()[I");
        C3384y.m12259a((C3379t) uVar);
        f5688r = new C3208i[]{uVar};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2081b(App app, int i, boolean z, boolean z2, ArrayList<String> arrayList) {
        super(app);
        C3370k.m12227b(app, "app");
        C3370k.m12227b(arrayList, "filteredOutPkgs");
        this.f5693m = app;
        this.f5694n = i;
        this.f5695o = z;
        this.f5696p = z2;
        this.f5697q = arrayList;
        m8448q();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final List<C2471s> m8444m() {
        List<Integer> a = C1755l.f5077b.mo6524a();
        ArrayList<Number> arrayList = new ArrayList<>();
        for (T next : a) {
            int intValue = ((Number) next).intValue();
            boolean z = false;
            if (intValue == 7 ? !C1734c.f5038h.mo6474c() : !(intValue == 21 ? C1734c.f5038h.mo6474c() : intValue != 22 || C1783a.f5089a.mo6539b() || C1783a.f5089a.mo6540c() || C1783a.f5089a.mo6547j())) {
                z = true;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C3285k.m12075a(arrayList, 10));
        for (Number intValue2 : arrayList) {
            arrayList2.add(new C2471s(new C2084c(intValue2.intValue(), this)));
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final int[] m8445n() {
        C3256e eVar = this.f5692l;
        C3208i iVar = f5688r[0];
        return (int[]) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final List<C2472t<?>> m8446o() {
        ArrayList<Parcelable> arrayList;
        Comparator comparator;
        String str;
        ActivityInfo activityInfo;
        ArrayList arrayList2 = new ArrayList();
        if (this.f5695o) {
            arrayList2.addAll(C3284j.m12070b((T[]) new C2472t[]{new C2471s(new C2090d(this)), new C2458k((Object) null, (C3350b) null, 3, (C3366g) null)}));
        }
        PackageManager packageManager = this.f5693m.getPackageManager();
        if (this.f5696p && this.f5690j.mo7490C()) {
            List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(PropertyFlags.ID_SELF_ASSIGNABLE);
            C3370k.m12223a((Object) installedApplications, "pm.getInstalledApplicati…ageManager.GET_META_DATA)");
            arrayList = new ArrayList<>();
            for (T next : installedApplications) {
                ApplicationInfo applicationInfo = (ApplicationInfo) next;
                if (!C3292r.m12090a(this.f5697q, applicationInfo != null ? applicationInfo.packageName : null)) {
                    arrayList.add(next);
                }
            }
            comparator = new ApplicationInfo.DisplayNameComparator(packageManager);
        } else {
            Intent addCategory = new Intent("android.intent.action.MAIN", (Uri) null).addCategory("android.intent.category.LAUNCHER");
            C3370k.m12223a((Object) addCategory, "Intent(Intent.ACTION_MAI…Intent.CATEGORY_LAUNCHER)");
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(addCategory, 0);
            C3370k.m12223a((Object) queryIntentActivities, "pm.queryIntentActivities(mainIntent, 0)");
            arrayList = new ArrayList<>();
            for (T next2 : queryIntentActivities) {
                ResolveInfo resolveInfo = (ResolveInfo) next2;
                ArrayList<String> arrayList3 = this.f5697q;
                if (resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null || (str = activityInfo.packageName) == null) {
                    str = BuildConfig.FLAVOR;
                }
                if (!arrayList3.contains(str)) {
                    arrayList.add(next2);
                }
            }
            comparator = new ResolveInfo.DisplayNameComparator(packageManager);
        }
        Collections.sort(arrayList, comparator);
        ArrayList arrayList4 = new ArrayList();
        for (Parcelable parcelable : arrayList) {
            C2471s sVar = parcelable instanceof ApplicationInfo ? new C2471s(new C2092e(parcelable, this)) : parcelable instanceof ResolveInfo ? new C2471s(new C2095f(parcelable, this)) : null;
            if (sVar != null) {
                arrayList4.add(sVar);
            }
        }
        arrayList2.addAll(arrayList4);
        return C3292r.m12104g(arrayList2);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final List<C2471s> m8447p() {
        List<ResolveInfo> queryIntentActivities = this.f5693m.getPackageManager().queryIntentActivities(new Intent("android.intent.action.CREATE_SHORTCUT"), 0);
        C3370k.m12223a((Object) queryIntentActivities, "app.packageManager.query…TION_CREATE_SHORTCUT), 0)");
        ArrayList arrayList = new ArrayList(C3285k.m12075a(queryIntentActivities, 10));
        for (ResolveInfo gVar : queryIntentActivities) {
            arrayList.add(new C2471s(new C2098g(gVar, this)));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m8448q() {
        C3499j1 unused = C3417e.m12335a(C3422f0.m12341a(C3536t0.m12778c()), (C3314f) null, (C3430h0) null, new C2102h(this, (C3309c) null), 3, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo2564f() {
        super.mo2564f();
        C2810b bVar = this.f5691k;
        if (bVar != null) {
            bVar.mo6027a();
        }
    }

    /* renamed from: i */
    public final boolean mo6954i() {
        return this.f5696p;
    }

    /* renamed from: j */
    public final App mo6955j() {
        return this.f5693m;
    }

    /* renamed from: k */
    public final C0497t<C2068g> mo6956k() {
        return this.f5689i;
    }

    /* renamed from: l */
    public final int mo6957l() {
        return this.f5694n;
    }
}
