package com.p131fb.fluid.services.p144d;

import android.accessibilityservice.AccessibilityService;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.pm.LauncherActivityInfo;
import android.content.pm.LauncherApps;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.Process;
import android.os.UserHandle;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityWindowInfo;
import com.p131fb.fluid.p135l.C1734c;
import com.p131fb.fluid.p135l.p139p.C1768d;
import com.p131fb.fluid.p135l.p139p.C1773i;
import com.p131fb.fluid.p135l.p139p.C1776l;
import com.p131fb.fluid.p135l.p140q.C1783a;
import com.p131fb.fluid.p135l.p141r.C1793a;
import com.p131fb.fluid.p135l.p143t.C1797a;
import com.p131fb.fluid.p135l.p143t.C1798b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C3256e;
import kotlin.C3265l;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p192b0.C3208i;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p197u.p199i.p200a.C3332f;
import kotlin.p197u.p199i.p200a.C3339l;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;
import kotlinx.coroutines.C3418e0;
import kotlinx.coroutines.C3422f0;
import kotlinx.coroutines.C3430h0;
import kotlinx.coroutines.C3499j1;
import kotlinx.coroutines.C3536t0;
import p155d.p156a.C2790h;
import p155d.p156a.p157n.p159c.C2803a;
import p155d.p156a.p160o.C2809a;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p162q.C2827e;
import p155d.p156a.p162q.C2828f;
import p155d.p156a.p177v.C2964b;
import p190io.objectbox.android.BuildConfig;

/* renamed from: com.fb.fluid.services.d.b */
public final class C1899b {

    /* renamed from: u */
    static final /* synthetic */ C3208i[] f5298u;

    /* renamed from: a */
    private final C3256e f5299a = C3258g.m11969a(new C1912k(this));

    /* renamed from: b */
    private final C3256e f5300b = C3258g.m11969a(new C1900a(this));

    /* renamed from: c */
    private final C1798b<Boolean> f5301c = new C1798b<>(false);

    /* renamed from: d */
    private final C1798b<Integer> f5302d = new C1798b<>(-1);

    /* renamed from: e */
    private final C1798b<ComponentName> f5303e = new C1798b<>(new ComponentName(BuildConfig.FLAVOR, BuildConfig.FLAVOR));
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1798b<String> f5304f = new C1798b<>(BuildConfig.FLAVOR);

    /* renamed from: g */
    private boolean f5305g;

    /* renamed from: h */
    private boolean f5306h;

    /* renamed from: i */
    private List<String> f5307i = C3284j.m12068a();

    /* renamed from: j */
    private C2809a f5308j = new C2809a();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C2810b f5309k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Map<String, Long> f5310l = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f5311m;

    /* renamed from: n */
    private Handler f5312n;

    /* renamed from: o */
    private String f5313o;

    /* renamed from: p */
    private int f5314p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final List<String> f5315q = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final List<String> f5316r = new ArrayList();

    /* renamed from: s */
    private final LauncherApps.Callback f5317s = new C1901b(this);
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final AccessibilityService f5318t;

    /* renamed from: com.fb.fluid.services.d.b$a */
    static final class C1900a extends C3371l implements C3349a<LauncherApps> {

        /* renamed from: g */
        final /* synthetic */ C1899b f5319g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1900a(C1899b bVar) {
            super(0);
            this.f5319g = bVar;
        }

        public final LauncherApps invoke() {
            Object systemService = this.f5319g.f5318t.getSystemService("launcherapps");
            if (systemService != null) {
                return (LauncherApps) systemService;
            }
            throw new C3269p("null cannot be cast to non-null type android.content.pm.LauncherApps");
        }
    }

    /* renamed from: com.fb.fluid.services.d.b$b */
    public static final class C1901b extends LauncherApps.Callback {

        /* renamed from: a */
        final /* synthetic */ C1899b f5320a;

        C1901b(C1899b bVar) {
            this.f5320a = bVar;
        }

        public void onPackageAdded(String str, UserHandle userHandle) {
            if (str != null && !this.f5320a.f5315q.contains(str)) {
                this.f5320a.f5315q.add(str);
            }
            this.f5320a.m7787o();
        }

        public void onPackageChanged(String str, UserHandle userHandle) {
        }

        public void onPackageRemoved(String str, UserHandle userHandle) {
            Iterator it = this.f5320a.f5315q.iterator();
            while (it.hasNext()) {
                if (C3370k.m12225a((Object) str, (Object) (String) it.next())) {
                    it.remove();
                }
            }
        }

        public void onPackagesAvailable(String[] strArr, UserHandle userHandle, boolean z) {
        }

        public void onPackagesUnavailable(String[] strArr, UserHandle userHandle, boolean z) {
        }
    }

    /* renamed from: com.fb.fluid.services.d.b$c */
    public static final class C1902c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C3303b.m12118a(Long.valueOf(((Number) ((Map.Entry) t).getValue()).longValue()), Long.valueOf(((Number) ((Map.Entry) t2).getValue()).longValue()));
        }
    }

    /* renamed from: com.fb.fluid.services.d.b$d */
    public static final class C1903d<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C3303b.m12118a(Long.valueOf(((Number) ((Map.Entry) t).getValue()).longValue()), Long.valueOf(((Number) ((Map.Entry) t2).getValue()).longValue()));
        }
    }

    /* renamed from: com.fb.fluid.services.d.b$e */
    static final class C1904e<T> implements C2827e<Throwable> {

        /* renamed from: a */
        public static final C1904e f5321a = new C1904e();

        C1904e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C1776l.m7478a("ph.1.e " + th.getMessage(), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.services.d.b$f */
    static final class C1905f<T> implements C2827e<Integer> {

        /* renamed from: a */
        final /* synthetic */ C1899b f5322a;

        /* renamed from: com.fb.fluid.services.d.b$f$a */
        static final class C1906a<T, R> implements C2828f<T, R> {

            /* renamed from: a */
            final /* synthetic */ C1905f f5323a;

            /* renamed from: b */
            final /* synthetic */ Integer f5324b;

            C1906a(C1905f fVar, Integer num) {
                this.f5323a = fVar;
                this.f5324b = num;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
                return Boolean.valueOf(mo6690a((Long) obj));
            }

            /* renamed from: a */
            public final boolean mo6690a(Long l) {
                List<AccessibilityWindowInfo> list;
                boolean z;
                C3370k.m12227b(l, "it");
                T t = null;
                try {
                    list = this.f5323a.f5322a.f5318t.getWindows();
                } catch (Exception unused) {
                    list = null;
                }
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        AccessibilityWindowInfo accessibilityWindowInfo = (AccessibilityWindowInfo) next;
                        C3370k.m12223a((Object) accessibilityWindowInfo, "it");
                        int id = accessibilityWindowInfo.getId();
                        Integer num = this.f5324b;
                        if (num == null || id != num.intValue() || accessibilityWindowInfo.getRoot() == null) {
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
                    t = (AccessibilityWindowInfo) t;
                }
                return t != null;
            }
        }

        /* renamed from: com.fb.fluid.services.d.b$f$b */
        static final class C1907b<T> implements C2827e<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C1905f f5325a;

            C1907b(C1905f fVar) {
                this.f5325a = fVar;
            }

            /* renamed from: a */
            public final void accept(Boolean bool) {
                if (!bool.booleanValue()) {
                    this.f5325a.f5322a.mo6677h().mo6588a(-1);
                }
            }
        }

        C1905f(C1899b bVar) {
            this.f5322a = bVar;
        }

        /* renamed from: a */
        public final void accept(Integer num) {
            C2810b d = this.f5322a.f5309k;
            if (d != null) {
                d.mo6027a();
            }
            if (num == null || num.intValue() != -1) {
                this.f5322a.f5309k = C2790h.m10993c(200, TimeUnit.MILLISECONDS, C2964b.m11437b()).mo8903a(200, TimeUnit.MILLISECONDS).mo8924b(new C1906a(this, num)).mo8927b(new C1907b(this));
            }
        }
    }

    /* renamed from: com.fb.fluid.services.d.b$g */
    static final class C1908g<T> implements C2827e<Throwable> {

        /* renamed from: a */
        public static final C1908g f5326a = new C1908g();

        C1908g() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C1776l.m7478a("ph.2.e " + th.getMessage(), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.services.d.b$h */
    static final class C1909h<T> implements C2827e<ComponentName> {

        /* renamed from: a */
        final /* synthetic */ C1899b f5327a;

        C1909h(C1899b bVar) {
            this.f5327a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b3, code lost:
            if ((r0 == null || r0.length() == 0) == false) goto L_0x00b5;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void accept(android.content.ComponentName r10) {
            /*
                r9 = this;
                java.lang.String r0 = "activeApp"
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r10, (java.lang.String) r0)
                java.lang.String r0 = r10.getPackageName()
                com.fb.fluid.services.d.b r1 = r9.f5327a
                com.fb.fluid.l.t.b r1 = r1.f5304f
                java.lang.Object r1 = r1.mo6589b()
                java.lang.String r1 = (java.lang.String) r1
                boolean r0 = kotlin.p205x.p207d.C3370k.m12225a((java.lang.Object) r0, (java.lang.Object) r1)
                r1 = 1
                r0 = r0 ^ r1
                r2 = 0
                java.lang.String r3 = "activeApp.packageName"
                if (r0 == 0) goto L_0x0042
                com.fb.fluid.services.d.b r0 = r9.f5327a
                java.util.List r0 = r0.mo6674e()
                java.lang.String r4 = r10.getPackageName()
                boolean r0 = r0.contains(r4)
                if (r0 == 0) goto L_0x0042
            L_0x0030:
                com.fb.fluid.services.d.b r0 = r9.f5327a
                com.fb.fluid.l.t.b r0 = r0.f5304f
                java.lang.String r4 = r10.getPackageName()
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r4, (java.lang.String) r3)
                r0.mo6588a(r4)
                goto L_0x00e6
            L_0x0042:
                com.fb.fluid.services.d.b r0 = r9.f5327a
                boolean r0 = r0.mo6672c()
                if (r0 == 0) goto L_0x0057
                boolean r0 = com.p131fb.fluid.p135l.p139p.C1768d.m7454g(r10)
                if (r0 == 0) goto L_0x0057
                boolean r0 = com.p131fb.fluid.p135l.p139p.C1768d.m7450c(r10)
                if (r0 != 0) goto L_0x0057
                goto L_0x0030
            L_0x0057:
                com.fb.fluid.services.d.b r0 = r9.f5327a
                boolean r0 = r0.mo6673d()
                if (r0 == 0) goto L_0x006c
                boolean r0 = com.p131fb.fluid.p135l.p139p.C1768d.m7450c(r10)
                if (r0 != 0) goto L_0x0030
                boolean r0 = com.p131fb.fluid.p135l.p139p.C1768d.m7449b(r10)
                if (r0 == 0) goto L_0x006c
                goto L_0x0030
            L_0x006c:
                com.fb.fluid.services.d.b r0 = r9.f5327a
                com.fb.fluid.l.t.b r0 = r0.f5304f
                java.lang.Object r0 = r0.mo6589b()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0080
                r0 = 1
                goto L_0x0081
            L_0x0080:
                r0 = 0
            L_0x0081:
                if (r0 == 0) goto L_0x00e6
                com.fb.fluid.services.d.b r0 = r9.f5327a
                java.util.List r0 = r0.f5316r
                com.fb.fluid.services.d.b r4 = r9.f5327a
                com.fb.fluid.l.t.b r4 = r4.f5304f
                java.lang.Object r4 = r4.mo6589b()
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r5 = ""
                if (r4 == 0) goto L_0x009a
                goto L_0x009b
            L_0x009a:
                r4 = r5
            L_0x009b:
                boolean r0 = r0.contains(r4)
                if (r0 == 0) goto L_0x00b5
                com.fb.fluid.services.d.b r0 = r9.f5327a
                java.lang.String r0 = r0.f5311m
                if (r0 == 0) goto L_0x00b2
                int r0 = r0.length()
                if (r0 != 0) goto L_0x00b0
                goto L_0x00b2
            L_0x00b0:
                r0 = 0
                goto L_0x00b3
            L_0x00b2:
                r0 = 1
            L_0x00b3:
                if (r0 != 0) goto L_0x00e6
            L_0x00b5:
                java.lang.String r0 = r10.getPackageName()
                com.fb.fluid.l.r.a$a r4 = com.p131fb.fluid.p135l.p141r.C1793a.f5110q
                java.lang.String r4 = r4.mo6583p()
                boolean r0 = kotlin.p205x.p207d.C3370k.m12225a((java.lang.Object) r0, (java.lang.Object) r4)
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x00e6
                java.lang.String r0 = r10.getPackageName()
                com.fb.fluid.services.d.b r4 = r9.f5327a
                com.fb.fluid.l.t.b r4 = r4.f5304f
                java.lang.Object r4 = r4.mo6589b()
                java.lang.String r4 = (java.lang.String) r4
                boolean r0 = kotlin.p205x.p207d.C3370k.m12225a((java.lang.Object) r0, (java.lang.Object) r4)
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x00e6
                com.fb.fluid.services.d.b r0 = r9.f5327a
                com.fb.fluid.l.t.b r0 = r0.f5304f
                r0.mo6588a(r5)
            L_0x00e6:
                com.fb.fluid.services.d.b r0 = r9.f5327a
                com.fb.fluid.l.t.b r0 = r0.mo6678i()
                com.fb.fluid.services.d.b r4 = r9.f5327a
                com.fb.fluid.l.t.b r4 = r4.f5304f
                java.lang.Object r4 = r4.mo6589b()
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                int r4 = r4.length()
                if (r4 <= 0) goto L_0x0100
                r4 = 1
                goto L_0x0101
            L_0x0100:
                r4 = 0
            L_0x0101:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                r0.mo6588a(r4)
                com.fb.fluid.services.d.b r0 = r9.f5327a
                java.util.Map r0 = r0.f5310l
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L_0x0116:
                com.fb.fluid.services.d.b r4 = r9.f5327a
                java.util.Map r4 = r4.f5310l
                int r4 = r4.size()
                r5 = 10
                if (r4 <= r5) goto L_0x0151
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L_0x0151
                java.lang.Object r4 = r0.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r4 = r4.getValue()
                java.lang.Number r4 = (java.lang.Number) r4
                long r4 = r4.longValue()
                java.util.Date r6 = new java.util.Date
                r6.<init>()
                r7 = 60
                java.util.Date r6 = com.p131fb.fluid.p135l.p139p.C1771g.m7471a(r6, r7)
                long r6 = r6.getTime()
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 <= 0) goto L_0x0116
                r0.remove()
                goto L_0x0116
            L_0x0151:
                java.lang.String r0 = r10.getPackageName()
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r3)
                int r0 = r0.length()
                if (r0 != 0) goto L_0x015f
                goto L_0x0160
            L_0x015f:
                r1 = 0
            L_0x0160:
                if (r1 == 0) goto L_0x0171
                com.fb.fluid.services.d.b r0 = r9.f5327a
                java.lang.String r0 = r0.mo6676g()
                if (r0 == 0) goto L_0x0171
                com.fb.fluid.services.d.b r10 = r9.f5327a
                r0 = 0
                r10.mo6667a((java.lang.String) r0)
                goto L_0x0199
            L_0x0171:
                com.fb.fluid.services.d.b r0 = r9.f5327a
                boolean r0 = r0.m7773a((android.content.ComponentName) r10)
                if (r0 != 0) goto L_0x0199
                com.fb.fluid.services.d.b r0 = r9.f5327a
                java.lang.String r0 = r0.mo6676g()
                if (r0 != 0) goto L_0x0199
                com.fb.fluid.services.d.b r0 = r9.f5327a
                java.util.Map r0 = r0.f5310l
                java.lang.String r10 = r10.getPackageName()
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r10, (java.lang.String) r3)
                long r1 = java.lang.System.currentTimeMillis()
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.put(r10, r1)
            L_0x0199:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.p144d.C1899b.C1909h.accept(android.content.ComponentName):void");
        }
    }

    @C3332f(mo10052c = "com.fb.fluid.services.utils.PackageHelper$start$5", mo10053f = "PackageHelper.kt", mo10054l = {}, mo10055m = "invokeSuspend")
    /* renamed from: com.fb.fluid.services.d.b$i */
    static final class C1910i extends C3339l implements C3351c<C3418e0, C3309c<? super Unit>, Object> {

        /* renamed from: j */
        private C3418e0 f5328j;

        /* renamed from: k */
        int f5329k;

        /* renamed from: l */
        final /* synthetic */ C1899b f5330l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1910i(C1899b bVar, C3309c cVar) {
            super(2, cVar);
            this.f5330l = bVar;
        }

        /* renamed from: a */
        public final Object mo6125a(Object obj, Object obj2) {
            return ((C1910i) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
        }

        /* renamed from: a */
        public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
            C3370k.m12227b(cVar, "completion");
            C1910i iVar = new C1910i(this.f5330l, cVar);
            iVar.f5328j = (C3418e0) obj;
            return iVar;
        }

        /* renamed from: b */
        public final Object mo6618b(Object obj) {
            Object unused = C3326d.m12146a();
            if (this.f5329k == 0) {
                C3265l.m11979a(obj);
                try {
                    this.f5330l.m7787o();
                    this.f5330l.m7788p();
                } catch (Exception e) {
                    C1776l.m7478a("ph.s.e " + e.getMessage(), (String) null, 1, (Object) null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.fb.fluid.services.d.b$j */
    static final class C1911j extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        final /* synthetic */ C1899b f5331g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1911j(C1899b bVar) {
            super(0);
            this.f5331g = bVar;
        }

        public final void invoke() {
            this.f5331g.mo6667a((String) null);
        }
    }

    /* renamed from: com.fb.fluid.services.d.b$k */
    static final class C1912k extends C3371l implements C3349a<WindowManager> {

        /* renamed from: g */
        final /* synthetic */ C1899b f5332g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1912k(C1899b bVar) {
            super(0);
            this.f5332g = bVar;
        }

        public final WindowManager invoke() {
            Object systemService = this.f5332g.f5318t.getSystemService("window");
            if (systemService != null) {
                return (WindowManager) systemService;
            }
            throw new C3269p("null cannot be cast to non-null type android.view.WindowManager");
        }
    }

    static {
        Class<C1899b> cls = C1899b.class;
        C3380u uVar = new C3380u(C3384y.m12254a((Class) cls), "windowManager", "getWindowManager()Landroid/view/WindowManager;");
        C3384y.m12259a((C3379t) uVar);
        C3380u uVar2 = new C3380u(C3384y.m12254a((Class) cls), "launcherApps", "getLauncherApps()Landroid/content/pm/LauncherApps;");
        C3384y.m12259a((C3379t) uVar2);
        f5298u = new C3208i[]{uVar, uVar2};
    }

    public C1899b(AccessibilityService accessibilityService) {
        C3370k.m12227b(accessibilityService, "parent");
        this.f5318t = accessibilityService;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m7773a(ComponentName componentName) {
        String packageName = componentName.getPackageName();
        C3370k.m12223a((Object) packageName, "packageName");
        return (packageName.length() == 0) || C3370k.m12225a((Object) componentName.getPackageName(), (Object) "android") || C3370k.m12225a((Object) componentName.getPackageName(), (Object) C1793a.f5110q.mo6583p()) || C3370k.m12225a((Object) componentName.getPackageName(), (Object) C1793a.f5110q.mo6576i()) || C3370k.m12225a((Object) componentName.getPackageName(), (Object) C1793a.f5110q.mo6572e()) || C3370k.m12225a((Object) componentName.getPackageName(), (Object) C1793a.f5110q.mo6575h()) || C3370k.m12225a((Object) componentName.getPackageName(), (Object) C1793a.f5110q.mo6574g()) || C3370k.m12225a((Object) componentName.getPackageName(), (Object) C1793a.f5110q.mo6573f()) || C3370k.m12225a((Object) componentName.getPackageName(), (Object) C1793a.f5110q.mo6571d()) || C3370k.m12225a((Object) componentName.getPackageName(), (Object) C1793a.f5110q.mo6572e()) || C1768d.m7448a(componentName) || C1768d.m7449b(componentName) || C1768d.m7450c(componentName) || C3370k.m12225a((Object) componentName.getPackageName(), (Object) C1793a.f5110q.mo6577j()) || C3370k.m12225a((Object) componentName.getPackageName(), (Object) C1793a.f5110q.mo6578k()) || C3370k.m12225a((Object) componentName.getPackageName(), (Object) C1793a.f5110q.mo6581n()) || C3370k.m12225a((Object) componentName.getPackageName(), (Object) C1793a.f5110q.mo6580m()) || C3370k.m12225a((Object) componentName.getPackageName(), (Object) C1793a.f5110q.mo6582o());
    }

    /* renamed from: b */
    private final boolean m7776b(ComponentName componentName) {
        return !C1768d.m7456i(componentName) && (C3370k.m12225a((Object) componentName.getClassName(), (Object) "android.view.View") ^ true) && (C3370k.m12225a((Object) componentName.getClassName(), (Object) "android.view.ViewGroup") ^ true) && (C3370k.m12225a((Object) componentName.getClassName(), (Object) "android.widget.LinearLayout") ^ true) && (C3370k.m12225a((Object) componentName.getClassName(), (Object) "android.widget.ListView") ^ true) && (C3370k.m12225a((Object) componentName.getPackageName(), (Object) C1793a.f5110q.mo6583p()) ^ true) && !C1768d.m7453f(componentName) && (this.f5315q.contains(componentName.getPackageName()) || this.f5316r.contains(componentName.getPackageName()) || C1768d.m7454g(componentName) || C1768d.m7450c(componentName) || C1768d.m7449b(componentName));
    }

    /* renamed from: l */
    private final int m7784l() {
        try {
            Display defaultDisplay = m7786n().getDefaultDisplay();
            if (defaultDisplay != null) {
                return defaultDisplay.getRotation();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: m */
    private final LauncherApps m7785m() {
        C3256e eVar = this.f5300b;
        C3208i iVar = f5298u[1];
        return (LauncherApps) eVar.getValue();
    }

    /* renamed from: n */
    private final WindowManager m7786n() {
        C3256e eVar = this.f5299a;
        C3208i iVar = f5298u[0];
        return (WindowManager) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m7787o() {
        List<String> list = this.f5316r;
        list.clear();
        List<ResolveInfo> a = C1793a.f5110q.mo6567a(this.f5318t);
        if (a != null) {
            ArrayList<ResolveInfo> arrayList = new ArrayList<>();
            for (T next : a) {
                if (!C3370k.m12225a((Object) ((ResolveInfo) next).activityInfo.packageName, (Object) C1793a.f5110q.mo6569b())) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (ResolveInfo resolveInfo : arrayList) {
                String str = resolveInfo.activityInfo.packageName;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            list.addAll(arrayList2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m7788p() {
        List<String> list = this.f5315q;
        try {
            list.clear();
            String packageName = this.f5318t.getPackageName();
            List<LauncherActivityInfo> activityList = m7785m().getActivityList((String) null, Process.myUserHandle());
            C3370k.m12223a((Object) activityList, "launcherApps.getActivity…, Process.myUserHandle())");
            ArrayList<LauncherActivityInfo> arrayList = new ArrayList<>();
            for (T next : activityList) {
                LauncherActivityInfo launcherActivityInfo = (LauncherActivityInfo) next;
                C3370k.m12223a((Object) launcherActivityInfo, "it");
                ComponentName componentName = launcherActivityInfo.getComponentName();
                if (!C3370k.m12225a((Object) componentName != null ? componentName.getPackageName() : null, (Object) packageName)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (LauncherActivityInfo launcherActivityInfo2 : arrayList) {
                C3370k.m12223a((Object) launcherActivityInfo2, "it");
                ComponentName componentName2 = launcherActivityInfo2.getComponentName();
                String packageName2 = componentName2 != null ? componentName2.getPackageName() : null;
                if (packageName2 != null) {
                    arrayList2.add(packageName2);
                }
            }
            list.addAll(arrayList2);
        } catch (Exception e) {
            C1776l.m7478a("ph.alp.e: " + e.getMessage(), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: a */
    public final C1798b<ComponentName> mo6665a() {
        return this.f5303e;
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    public final void mo6666a(AccessibilityEvent accessibilityEvent) {
        String str;
        String str2;
        Integer valueOf = accessibilityEvent != null ? Integer.valueOf(accessibilityEvent.getEventType()) : null;
        if (valueOf != null && valueOf.intValue() == 32) {
            CharSequence packageName = accessibilityEvent.getPackageName();
            if (packageName == null || (str = packageName.toString()) == null) {
                str = BuildConfig.FLAVOR;
            }
            CharSequence className = accessibilityEvent.getClassName();
            if (className == null || (str2 = className.toString()) == null) {
                str2 = BuildConfig.FLAVOR;
            }
            ComponentName componentName = new ComponentName(str, str2);
            String packageName2 = componentName.getPackageName();
            C3370k.m12223a((Object) packageName2, "eventComponent.packageName");
            boolean b = m7776b(componentName);
            if (((C1734c.f5038h.mo6477f() && (!C1783a.f5089a.mo6545h())) || (C1734c.f5038h.mo6476e() && C1783a.f5089a.mo6547j())) && C1768d.m7457j(componentName) && m7784l() == 1 && this.f5302d.mo6589b().intValue() == -1) {
                this.f5302d.mo6588a(Integer.valueOf(accessibilityEvent.getWindowId()));
            }
            boolean z = C3370k.m12225a((Object) componentName.getPackageName(), (Object) this.f5318t.getPackageName()) || C1768d.m7452e(componentName) || C1768d.m7451d(componentName) || C1768d.m7455h(componentName);
            if (!z && b && (!C3370k.m12225a((Object) this.f5311m, (Object) packageName2)) && !this.f5316r.contains(packageName2)) {
                this.f5303e.mo6588a(componentName);
                this.f5314p = 0;
            } else if (!z && b && this.f5316r.contains(packageName2)) {
                if (this.f5314p != 0 || !C1734c.f5038h.mo6477f() || C1768d.m7454g(this.f5303e.mo6589b())) {
                    this.f5303e.mo6588a(new ComponentName(BuildConfig.FLAVOR, BuildConfig.FLAVOR));
                } else {
                    this.f5314p++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6667a(String str) {
        C1773i.m7474a(this.f5312n);
        if (str != null) {
            this.f5312n = C1773i.m7473a(3000, new C1911j(this));
        } else {
            String str2 = this.f5313o;
            if (str2 != null) {
                this.f5310l.put(str2, Long.valueOf(System.currentTimeMillis()));
            }
        }
        this.f5313o = str;
    }

    /* renamed from: a */
    public final void mo6668a(List<String> list) {
        C3370k.m12227b(list, "<set-?>");
        this.f5307i = list;
    }

    /* renamed from: a */
    public final void mo6669a(boolean z) {
        this.f5305g = z;
    }

    /* renamed from: b */
    public final String mo6670b() {
        List<T> a = C3292r.m12088a(this.f5310l.entrySet(), new C1902c());
        ArrayList arrayList = new ArrayList(C3285k.m12075a(a, 10));
        for (T key : a) {
            arrayList.add((String) key.getKey());
        }
        int a2 = C3292r.m12082a(arrayList, this.f5313o);
        if (a2 <= -1 || a2 >= arrayList.size() - 1) {
            return null;
        }
        return (String) arrayList.get(a2 + 1);
    }

    /* renamed from: b */
    public final void mo6671b(boolean z) {
        this.f5306h = z;
    }

    /* renamed from: c */
    public final boolean mo6672c() {
        return this.f5305g;
    }

    /* renamed from: d */
    public final boolean mo6673d() {
        return this.f5306h;
    }

    /* renamed from: e */
    public final List<String> mo6674e() {
        return this.f5307i;
    }

    /* renamed from: f */
    public final String mo6675f() {
        Object obj;
        List<T> a = C3292r.m12088a(this.f5310l.entrySet(), new C1903d());
        ArrayList arrayList = new ArrayList(C3285k.m12075a(a, 10));
        for (T key : a) {
            arrayList.add((String) key.getKey());
        }
        int a2 = C3292r.m12082a(arrayList, this.f5313o);
        if (a2 > 0) {
            return (String) arrayList.get(a2 - 1);
        }
        if (this.f5313o != null) {
            return null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (!C3370k.m12225a((Object) (String) obj, (Object) this.f5303e.mo6589b().getPackageName())) {
                break;
            }
        }
        return (String) obj;
    }

    /* renamed from: g */
    public final String mo6676g() {
        return this.f5313o;
    }

    /* renamed from: h */
    public final C1798b<Integer> mo6677h() {
        return this.f5302d;
    }

    /* renamed from: i */
    public final C1798b<Boolean> mo6678i() {
        return this.f5301c;
    }

    /* renamed from: j */
    public final void mo6679j() {
        C2810b b = this.f5302d.mo6587a().mo8901a().mo8923b(C2964b.m11437b()).mo8907a(C2803a.m11054a()).mo8911a((C2827e<? super Throwable>) C1904e.f5321a).mo8927b(new C1905f(this));
        C3370k.m12223a((Object) b, "volumeDialogWindowId.obs…= -1 }\n\n                }");
        C1797a.m7558a(b, this.f5308j);
        C2810b b2 = this.f5303e.mo6587a().mo8901a().mo8923b(C2964b.m11437b()).mo8907a(C2803a.m11054a()).mo8911a((C2827e<? super Throwable>) C1908g.f5326a).mo8927b(new C1909h(this));
        C3370k.m12223a((Object) b2, "activeApp.observable\n   …\".ld()\n\n                }");
        C1797a.m7558a(b2, this.f5308j);
        C3499j1 unused = C3417e.m12335a(C3422f0.m12341a(C3536t0.m12776a()), (C3314f) null, (C3430h0) null, new C1910i(this, (C3309c) null), 3, (Object) null);
        try {
            m7785m().registerCallback(this.f5317s);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: k */
    public final void mo6680k() {
        try {
            this.f5308j.mo8948c();
            m7785m().unregisterCallback(this.f5317s);
        } catch (Exception unused) {
        }
    }
}
