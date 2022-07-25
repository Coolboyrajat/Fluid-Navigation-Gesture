package com.p131fb.fluid.services;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import android.service.quicksettings.TileService;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.app.C0281b;
import androidx.lifecycle.C0490o;
import com.p131fb.fluid.data.C1712e;
import com.p131fb.fluid.data.Trigger;
import com.p131fb.fluid.data.TriggerButton;
import com.p131fb.fluid.p135l.C1734c;
import com.p131fb.fluid.p135l.C1737e;
import com.p131fb.fluid.p135l.C1738f;
import com.p131fb.fluid.p135l.C1740g;
import com.p131fb.fluid.p135l.C1752j;
import com.p131fb.fluid.p135l.p136m.C1757a;
import com.p131fb.fluid.p135l.p138o.C1762a;
import com.p131fb.fluid.p135l.p139p.C1765b;
import com.p131fb.fluid.p135l.p139p.C1769e;
import com.p131fb.fluid.p135l.p139p.C1770f;
import com.p131fb.fluid.p135l.p139p.C1776l;
import com.p131fb.fluid.p135l.p139p.C1779o;
import com.p131fb.fluid.p135l.p140q.C1783a;
import com.p131fb.fluid.p135l.p140q.C1785b;
import com.p131fb.fluid.p135l.p140q.C1787c;
import com.p131fb.fluid.p135l.p140q.C1789d;
import com.p131fb.fluid.p135l.p140q.C1791e;
import com.p131fb.fluid.p135l.p141r.C1793a;
import com.p131fb.fluid.p135l.p143t.C1797a;
import com.p131fb.fluid.p135l.p143t.C1798b;
import com.p131fb.fluid.services.p144d.C1895a;
import com.p131fb.fluid.services.p144d.C1899b;
import com.p131fb.fluid.services.p144d.C1913c;
import com.p131fb.fluid.services.p145e.C1920b;
import com.p131fb.fluid.services.p145e.C1931d;
import com.p131fb.fluid.services.p145e.C1937e;
import com.p131fb.fluid.utils.preferences.C2521f;
import com.p131fb.fluid.utils.preferences.C2526g;
import com.p131fb.fluid.utils.preferences.C2527h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.C3256e;
import kotlin.C3265l;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p192b0.C3204e;
import kotlin.p192b0.C3208i;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p197u.p199i.p200a.C3328b;
import kotlin.p197u.p199i.p200a.C3332f;
import kotlin.p197u.p199i.p200a.C3339l;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p206c.C3354f;
import kotlin.p205x.p207d.C3368i;
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
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p162q.C2823a;
import p155d.p156a.p162q.C2827e;
import p155d.p156a.p162q.C2828f;
import p155d.p156a.p177v.C2964b;
import p155d.p156a.p178w.C2973a;
import p179e.p184b.p185a.C3059m;
import p179e.p184b.p185a.C3117n;
import p179e.p184b.p185a.C3125q;
import p179e.p184b.p185a.C3134v;
import p179e.p184b.p185a.p186k0.C3014a;
import p190io.objectbox.android.AndroidScheduler;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.android.C3148R;
import p190io.objectbox.reactive.DataObserver;
import p190io.objectbox.reactive.DataSubscription;
import p190io.objectbox.reactive.DataSubscriptionList;

@SuppressLint({"RtlHardcoded", "AutoDispose"})
/* renamed from: com.fb.fluid.services.b */
public abstract class C1802b extends C1762a implements C3117n {

    /* renamed from: b0 */
    static final /* synthetic */ C3208i[] f5120b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public static boolean f5121c0;

    /* renamed from: d0 */
    public static final C1803a f5122d0 = new C1803a((C3366g) null);

    /* renamed from: A */
    private final C1752j f5123A = new C1752j(250);

    /* renamed from: B */
    private final C3256e f5124B = C3258g.m11969a(new C1807b(this));

    /* renamed from: C */
    private final C3256e f5125C = C3258g.m11969a(new C1864s(this));

    /* renamed from: D */
    private final C3256e f5126D = C3258g.m11969a(C1866t.f5234g);

    /* renamed from: E */
    private final C3256e f5127E = C3258g.m11969a(new C1820e(this));

    /* renamed from: F */
    private final C3256e f5128F = C3258g.m11969a(new C1869u0(this));

    /* renamed from: G */
    private final C3256e f5129G = C3258g.m11969a(new C1830h(this));

    /* renamed from: H */
    private final C3256e f5130H = C3258g.m11969a(new C1827g(this));
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final C1798b<Boolean> f5131I = new C1798b<>(false);

    /* renamed from: J */
    private final C3256e f5132J = C3258g.m11969a(new C1891z0(this));

    /* renamed from: K */
    private final C3256e f5133K = C3258g.m11969a(new C1846m(this));

    /* renamed from: L */
    private final C3256e f5134L = C3258g.m11969a(new C1844l(this));

    /* renamed from: M */
    private final C1798b<List<Integer>> f5135M = new C1798b<>(C3284j.m12070b((T[]) new Integer[]{0, 0, 0, 0}));

    /* renamed from: N */
    private final C3256e f5136N = C3258g.m11969a(new C1835j(this));

    /* renamed from: O */
    private final C3256e f5137O = C3258g.m11969a(new C1832i(this));

    /* renamed from: P */
    private final C3256e f5138P = C3258g.m11969a(new C1848n(this));

    /* renamed from: Q */
    private final C3256e f5139Q = C3258g.m11969a(new C1853o(this));

    /* renamed from: R */
    private final C3256e f5140R = C3258g.m11969a(new C1856p(this));

    /* renamed from: S */
    private final C3256e f5141S = C3258g.m11969a(new C1839k(this));
    /* access modifiers changed from: private */

    /* renamed from: T */
    public long f5142T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public boolean f5143U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public boolean f5144V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f5145W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public boolean f5146X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public int f5147Y = -1;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public String f5148Z = BuildConfig.FLAVOR;

    /* renamed from: a0 */
    private SharedPreferences.OnSharedPreferenceChangeListener f5149a0 = new C1887x0(this);

    /* renamed from: h */
    private final C3256e f5150h = C3014a.m11539a().mo9126a(this, f5120b0[0]);

    /* renamed from: i */
    private final C3256e f5151i = C3258g.m11969a(new C1889y0(this));

    /* renamed from: j */
    private final C3256e f5152j = C3258g.m11969a(new C1814c(this));

    /* renamed from: k */
    private final C3256e f5153k = C3258g.m11969a(new C1826f1(this));

    /* renamed from: l */
    private final C3256e f5154l = C3258g.m11969a(new C1862r(this));

    /* renamed from: m */
    private final C3256e f5155m = C3258g.m11969a(new C1823f(this));
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1913c f5156n = new C1913c();

    /* renamed from: o */
    private final C3256e f5157o = C3258g.m11969a(new C1860q(this));

    /* renamed from: p */
    private final C3256e f5158p = C3258g.m11969a(new C1867t0(this));

    /* renamed from: q */
    private ContentObserver f5159q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C1737e f5160r = new C1737e(100);

    /* renamed from: s */
    private final DataSubscriptionList f5161s = new DataSubscriptionList();

    /* renamed from: t */
    private DataSubscription f5162t;

    /* renamed from: u */
    private BroadcastReceiver f5163u;

    /* renamed from: v */
    private final C3256e f5164v = C3258g.m11969a(new C1822e1(this));

    /* renamed from: w */
    private final C3256e f5165w = C3258g.m11969a(new C1829g1(this));
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final List<C1937e> f5166x = new ArrayList();

    /* renamed from: y */
    private final C3256e f5167y = C3258g.m11969a(new C1816c1(this));

    /* renamed from: z */
    private final C3256e f5168z = C3258g.m11969a(new C1817d(this));

    /* renamed from: com.fb.fluid.services.b$a */
    public static final class C1803a {
        private C1803a() {
        }

        public /* synthetic */ C1803a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo6603a(boolean z) {
            C1802b.f5121c0 = z;
        }

        /* renamed from: a */
        public final boolean mo6604a() {
            return C1802b.f5121c0;
        }
    }

    /* renamed from: com.fb.fluid.services.b$a0 */
    static final class C1804a0<T> implements C2827e<Object[]> {

        /* renamed from: a */
        final /* synthetic */ C1802b f5169a;

        C1804a0(C1802b bVar) {
            this.f5169a = bVar;
        }

        /* renamed from: a */
        public final void accept(Object[] objArr) {
            C3370k.m12227b(objArr, "it");
            int i = 0;
            Boolean bool = objArr[0];
            if (!(bool instanceof Boolean)) {
                bool = null;
            }
            Boolean bool2 = bool;
            if (!(bool2 != null ? bool2.booleanValue() : false)) {
                Integer num = objArr[1];
                if (!(num instanceof Integer)) {
                    num = null;
                }
                Integer num2 = num;
                if (num2 != null) {
                    i = num2.intValue();
                }
            }
            this.f5169a.m7594a(i);
        }
    }

    /* renamed from: com.fb.fluid.services.b$a1 */
    public static final class C1805a1 extends ContentObserver {

        /* renamed from: a */
        final /* synthetic */ C1802b f5170a;

        /* renamed from: com.fb.fluid.services.b$a1$a */
        static final class C1806a extends C3371l implements C3349a<Unit> {

            /* renamed from: g */
            final /* synthetic */ C1805a1 f5171g;

            /* renamed from: h */
            final /* synthetic */ Uri f5172h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1806a(C1805a1 a1Var, Uri uri) {
                super(0);
                this.f5171g = a1Var;
                this.f5172h = uri;
            }

            public final void invoke() {
                if (C3251o.m11953a((CharSequence) String.valueOf(this.f5172h), (CharSequence) "navigation_bar_gesture_disabled_by_policy", false, 2, (Object) null) && !((Boolean) this.f5171g.f5170a.m7575F().mo6589b()).booleanValue()) {
                    C1791e.C1792a aVar = C1791e.f5093a;
                    Context baseContext = this.f5171g.f5170a.getBaseContext();
                    C3370k.m12223a((Object) baseContext, "baseContext");
                    if (!aVar.mo6561a(baseContext)) {
                        this.f5171g.f5170a.f5131I.mo6588a(true);
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1805a1(C1802b bVar, Handler handler) {
            super(handler);
            this.f5170a = bVar;
        }

        public void onChange(boolean z, Uri uri) {
            super.onChange(z, uri);
            this.f5170a.f5160r.mo6480a(new C1806a(this, uri));
        }
    }

    /* renamed from: com.fb.fluid.services.b$b */
    static final class C1807b extends C3371l implements C3349a<int[]> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5173g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1807b(C1802b bVar) {
            super(0);
            this.f5173g = bVar;
        }

        public final int[] invoke() {
            Context baseContext = this.f5173g.getBaseContext();
            C3370k.m12223a((Object) baseContext, "baseContext");
            return baseContext.getResources().getIntArray(C3148R.array.actions_pro);
        }
    }

    /* renamed from: com.fb.fluid.services.b$b0 */
    static final class C1808b0<T, R> implements C2828f<T, R> {

        /* renamed from: a */
        public static final C1808b0 f5174a = new C1808b0();

        C1808b0() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
            return Boolean.valueOf(mo6607a((Integer) obj));
        }

        /* renamed from: a */
        public final boolean mo6607a(Integer num) {
            C3370k.m12227b(num, "it");
            return num.intValue() != -1;
        }
    }

    /* renamed from: com.fb.fluid.services.b$b1 */
    static final class C1809b1<T> implements DataObserver<List<Trigger>> {

        /* renamed from: a */
        final /* synthetic */ C1802b f5175a;

        /* renamed from: com.fb.fluid.services.b$b1$a */
        static final class C1810a extends C3371l implements C3351c<TriggerButton, Boolean, Drawable> {

            /* renamed from: g */
            final /* synthetic */ C1809b1 f5176g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1810a(Trigger trigger, C1809b1 b1Var) {
                super(2);
                this.f5176g = b1Var;
            }

            /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
            /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final android.graphics.drawable.Drawable mo6610a(com.p131fb.fluid.data.TriggerButton r11, boolean r12) {
                /*
                    r10 = this;
                    java.lang.String r0 = "button"
                    kotlin.p205x.p207d.C3370k.m12227b(r11, r0)
                    if (r12 == 0) goto L_0x000c
                    int r0 = r11.mo6410c()
                    goto L_0x0010
                L_0x000c:
                    int r0 = r11.mo6412d()
                L_0x0010:
                    r3 = r0
                    if (r12 == 0) goto L_0x0018
                    java.lang.String r11 = r11.mo6406b()
                    goto L_0x001c
                L_0x0018:
                    java.lang.String r11 = r11.mo6400a()
                L_0x001c:
                    r4 = r11
                    r11 = 11
                    r12 = 0
                    if (r3 == r11) goto L_0x0043
                    r11 = 26
                    if (r3 == r11) goto L_0x0028
                L_0x0026:
                    r11 = r12
                    goto L_0x0056
                L_0x0028:
                    com.fb.fluid.services.b$b1 r11 = r10.f5176g     // Catch:{ Exception -> 0x0058 }
                    com.fb.fluid.services.b r11 = r11.f5175a     // Catch:{ Exception -> 0x0058 }
                    com.fb.fluid.services.d.b r11 = r11.m7649x()     // Catch:{ Exception -> 0x0058 }
                    java.lang.String r11 = r11.mo6670b()     // Catch:{ Exception -> 0x0058 }
                    if (r11 == 0) goto L_0x0026
                    com.fb.fluid.services.b$b1 r0 = r10.f5176g     // Catch:{ Exception -> 0x0058 }
                    com.fb.fluid.services.b r0 = r0.f5175a     // Catch:{ Exception -> 0x0058 }
                L_0x003a:
                    android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ Exception -> 0x0058 }
                    android.content.Intent r11 = r0.getLaunchIntentForPackage(r11)     // Catch:{ Exception -> 0x0058 }
                    goto L_0x0056
                L_0x0043:
                    com.fb.fluid.services.b$b1 r11 = r10.f5176g     // Catch:{ Exception -> 0x0058 }
                    com.fb.fluid.services.b r11 = r11.f5175a     // Catch:{ Exception -> 0x0058 }
                    com.fb.fluid.services.d.b r11 = r11.m7649x()     // Catch:{ Exception -> 0x0058 }
                    java.lang.String r11 = r11.mo6675f()     // Catch:{ Exception -> 0x0058 }
                    if (r11 == 0) goto L_0x0026
                    com.fb.fluid.services.b$b1 r0 = r10.f5176g     // Catch:{ Exception -> 0x0058 }
                    com.fb.fluid.services.b r0 = r0.f5175a     // Catch:{ Exception -> 0x0058 }
                    goto L_0x003a
                L_0x0056:
                    r5 = r11
                    goto L_0x0059
                L_0x0058:
                    r5 = r12
                L_0x0059:
                    com.fb.fluid.data.TriggerButton$a r1 = com.p131fb.fluid.data.TriggerButton.Companion
                    com.fb.fluid.services.b$b1 r11 = r10.f5176g
                    com.fb.fluid.services.b r11 = r11.f5175a
                    android.content.Context r2 = r11.getBaseContext()
                    java.lang.String r11 = "baseContext"
                    kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r2, (java.lang.String) r11)
                    com.fb.fluid.services.b$b1 r11 = r10.f5176g
                    com.fb.fluid.services.b r11 = r11.f5175a
                    com.fb.fluid.utils.preferences.h r11 = r11.m7654z()
                    int r6 = r11.mo7516e()
                    r7 = 0
                    r8 = 32
                    r9 = 0
                    android.graphics.drawable.Drawable r11 = com.p131fb.fluid.data.TriggerButton.C1698a.m7287a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    if (r11 == 0) goto L_0x0082
                    android.graphics.drawable.Drawable r12 = r11.mutate()
                L_0x0082:
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.C1802b.C1809b1.C1810a.mo6610a(com.fb.fluid.data.TriggerButton, boolean):android.graphics.drawable.Drawable");
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                return mo6610a((TriggerButton) obj, ((Boolean) obj2).booleanValue());
            }
        }

        /* renamed from: com.fb.fluid.services.b$b1$b */
        static final /* synthetic */ class C1811b extends C3368i implements C3351c<Boolean, Boolean, Unit> {
            C1811b(C1802b bVar) {
                super(2, bVar);
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo6611a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6611a(boolean z, boolean z2) {
                ((C1802b) this.f8030g).m7606a(z, z2);
            }

            /* renamed from: b */
            public final String mo6062b() {
                return "performUserHapticFeedback";
            }

            /* renamed from: h */
            public final C3204e mo6063h() {
                return C3384y.m12254a(C1802b.class);
            }

            /* renamed from: j */
            public final String mo6064j() {
                return "performUserHapticFeedback(ZZ)V";
            }
        }

        /* renamed from: com.fb.fluid.services.b$b1$c */
        static final /* synthetic */ class C1812c extends C3368i implements C3354f<Integer, String, View, Integer, Integer, Unit> {
            C1812c(C1802b bVar) {
                super(5, bVar);
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6612a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                mo6613a(((Number) obj).intValue(), (String) obj2, (View) obj3, ((Number) obj4).intValue(), ((Number) obj5).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6613a(int i, String str, View view, int i2, int i3) {
                ((C1802b) this.f8030g).m7596a(i, str, view, i2, i3);
            }

            /* renamed from: b */
            public final String mo6062b() {
                return "performAction";
            }

            /* renamed from: h */
            public final C3204e mo6063h() {
                return C3384y.m12254a(C1802b.class);
            }

            /* renamed from: j */
            public final String mo6064j() {
                return "performAction(ILjava/lang/String;Landroid/view/View;II)V";
            }
        }

        /* renamed from: com.fb.fluid.services.b$b1$d */
        static final class C1813d<T, R> implements C2828f<Object[], R> {

            /* renamed from: a */
            public static final C1813d f5177a = new C1813d();

            C1813d() {
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
                return Boolean.valueOf(mo6614a((Object[]) obj));
            }

            /* renamed from: a */
            public final boolean mo6614a(Object[] objArr) {
                C3370k.m12227b(objArr, "it");
                return C3280f.m12022b((T[]) objArr, true);
            }
        }

        C1809b1(C1802b bVar) {
            this.f5175a = bVar;
        }

        /* renamed from: a */
        public final void onData(List<Trigger> list) {
            Object obj;
            boolean z;
            boolean z2;
            Iterator it = this.f5175a.f5166x.iterator();
            while (true) {
                T t = null;
                if (!it.hasNext()) {
                    break;
                }
                C1937e eVar = (C1937e) it.next();
                C3370k.m12223a((Object) list, "triggers");
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    if (((Trigger) next).mo6390h() == eVar.mo6744C().mo6390h()) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        t = next;
                        break;
                    }
                }
                if (t == null) {
                    eVar.mo6699d();
                    it.remove();
                }
            }
            C3370k.m12223a((Object) list, "triggers");
            for (T t2 : C3292r.m12097c(list)) {
                Iterator it3 = this.f5175a.f5166x.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (((C1937e) obj).mo6744C().mo6390h() == t2.mo6390h()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C1937e eVar2 = (C1937e) obj;
                if (eVar2 instanceof C1937e) {
                    eVar2.mo6747b((Trigger) t2);
                    eVar2.mo6710n();
                } else {
                    C1937e eVar3 = new C1937e(this.f5175a, t2, new C1812c(this.f5175a), new C1811b(this.f5175a), new C1810a(t2, this), this.f5175a.m7570C());
                    eVar3.mo6746a(this.f5175a.m7654z().mo7535k() == t2.mo6390h());
                    eVar3.mo6748b(this.f5175a.m7654z().mo7558z());
                    C2810b b = this.f5175a.m7641t().mo6661b().mo6587a().mo8901a().mo8923b(C2964b.m11437b()).mo8907a(C2803a.m11054a()).mo8927b(eVar3.mo6753s());
                    C3370k.m12223a((Object) b, "keyboardDetector.visible…e(consumerKeyboardHeight)");
                    C1797a.m7558a(b, eVar3.mo6704i());
                    C2810b b2 = this.f5175a.m7565A().mo6587a().mo8923b(C2964b.m11437b()).mo8907a(C2803a.m11054a()).mo8927b(eVar3.mo6754t());
                    C3370k.m12223a((Object) b2, "rotation.observable\n    …ribe(consumerOrientation)");
                    C1797a.m7558a(b2, eVar3.mo6704i());
                    C2810b b3 = this.f5175a.m7573E().mo6739q().mo6587a().mo8923b(C2964b.m11437b()).mo8907a(C2803a.m11054a()).mo8927b(eVar3.mo6751q());
                    C3370k.m12223a((Object) b3, "windowSystem.windowFulls…cribe(consumerFullscreen)");
                    C1797a.m7558a(b3, eVar3.mo6704i());
                    C2810b b4 = (t2.mo6388g() == 80 ? this.f5175a.m7591N() : this.f5175a.m7589M()).mo8923b(C2964b.m11437b()).mo8907a(C2803a.m11054a()).mo8927b(eVar3.mo6700e());
                    C3370k.m12223a((Object) b4, "(if (trigger.gravity == …nsumerWindowNotInManager)");
                    C1797a.m7558a(b4, eVar3.mo6704i());
                    C2810b b5 = this.f5175a.m7635q().mo6587a().mo8923b(C2964b.m11437b()).mo8907a(C2803a.m11054a()).mo8927b(eVar3.mo6750p());
                    C3370k.m12223a((Object) b5, "debugTriggers.observable…scribe(consumerDebugMode)");
                    C1797a.m7558a(b5, eVar3.mo6704i());
                    C2810b b6 = C2790h.m10990a(C3284j.m12070b((T[]) new C2973a[]{this.f5175a.m7583J().mo6587a(), this.f5175a.m7573E().mo6739q().mo6587a()}), C1813d.f5177a).mo8923b(C2964b.m11437b()).mo8907a(C2803a.m11054a()).mo8927b(eVar3.mo6752r());
                    C3370k.m12223a((Object) b6, "Observable\n             …onsumerIndicatorsVisible)");
                    C1797a.m7558a(b6, eVar3.mo6704i());
                    this.f5175a.f5166x.add(eVar3);
                }
            }
            C1757a.m7423a(this.f5175a.m7625l(), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.services.b$c */
    static final class C1814c extends C3371l implements C3349a<ActivityManager> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5178g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1814c(C1802b bVar) {
            super(0);
            this.f5178g = bVar;
        }

        public final ActivityManager invoke() {
            Object systemService = this.f5178g.getSystemService("activity");
            if (systemService != null) {
                return (ActivityManager) systemService;
            }
            throw new C3269p("null cannot be cast to non-null type android.app.ActivityManager");
        }
    }

    /* renamed from: com.fb.fluid.services.b$c0 */
    static final class C1815c0<T> implements C2827e<Throwable> {

        /* renamed from: a */
        public static final C1815c0 f5179a = new C1815c0();

        C1815c0() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C1776l.m7478a("error.4: " + th.getMessage(), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.services.b$c1 */
    static final class C1816c1 extends C3371l implements C3349a<C1740g> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5180g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1816c1(C1802b bVar) {
            super(0);
            this.f5180g = bVar;
        }

        public final C1740g invoke() {
            Context baseContext = this.f5180g.getBaseContext();
            C3370k.m12223a((Object) baseContext, "baseContext");
            return new C1740g(baseContext);
        }
    }

    /* renamed from: com.fb.fluid.services.b$d */
    static final class C1817d extends C3371l implements C3349a<C1757a> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5181g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1817d(C1802b bVar) {
            super(0);
            this.f5181g = bVar;
        }

        public final C1757a invoke() {
            return new C1757a(this.f5181g);
        }
    }

    /* renamed from: com.fb.fluid.services.b$d0 */
    static final class C1818d0<T> implements C2827e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C1802b f5182a;

        C1818d0(C1802b bVar) {
            this.f5182a = bVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            AccessibilityServiceInfo serviceInfo = this.f5182a.getServiceInfo();
            if (serviceInfo != null) {
                serviceInfo.eventTypes = 32;
                serviceInfo.feedbackType = 16;
                serviceInfo.notificationTimeout = 0;
                C3370k.m12223a((Object) bool, "it");
                serviceInfo.flags = bool.booleanValue() ? 64 : 0;
                this.f5182a.setServiceInfo(serviceInfo);
            }
        }
    }

    @C3332f(mo10052c = "com.fb.fluid.services.ServiceMain$updateScreenLockedState$1", mo10053f = "ServiceMain.kt", mo10054l = {}, mo10055m = "invokeSuspend")
    /* renamed from: com.fb.fluid.services.b$d1 */
    static final class C1819d1 extends C3339l implements C3351c<C3418e0, C3309c<? super Unit>, Object> {

        /* renamed from: j */
        private C3418e0 f5183j;

        /* renamed from: k */
        int f5184k;

        /* renamed from: l */
        final /* synthetic */ C1802b f5185l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1819d1(C1802b bVar, C3309c cVar) {
            super(2, cVar);
            this.f5185l = bVar;
        }

        /* renamed from: a */
        public final Object mo6125a(Object obj, Object obj2) {
            return ((C1819d1) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
        }

        /* renamed from: a */
        public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
            C3370k.m12227b(cVar, "completion");
            C1819d1 d1Var = new C1819d1(this.f5185l, cVar);
            d1Var.f5183j = (C3418e0) obj;
            return d1Var;
        }

        /* renamed from: b */
        public final Object mo6618b(Object obj) {
            Object unused = C3326d.m12146a();
            if (this.f5184k == 0) {
                C3265l.m11979a(obj);
                this.f5185l.m7583J().mo6588a(C3328b.m12154a(this.f5185l.m7630n() || !this.f5185l.m7632o()));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.fb.fluid.services.b$e */
    static final class C1820e extends C3371l implements C3349a<C1798b<Boolean>> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5186g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1820e(C1802b bVar) {
            super(0);
            this.f5186g = bVar;
        }

        public final C1798b<Boolean> invoke() {
            return new C1798b<>(Boolean.valueOf(this.f5186g.m7654z().mo7534j()));
        }
    }

    /* renamed from: com.fb.fluid.services.b$e0 */
    static final class C1821e0<T> implements C2827e<Throwable> {

        /* renamed from: a */
        public static final C1821e0 f5187a = new C1821e0();

        C1821e0() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C1776l.m7478a("error.9: " + th.getMessage(), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.services.b$e1 */
    static final class C1822e1 extends C3371l implements C3349a<C1920b> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5188g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1822e1(C1802b bVar) {
            super(0);
            this.f5188g = bVar;
        }

        public final C1920b invoke() {
            return new C1920b(this.f5188g);
        }
    }

    /* renamed from: com.fb.fluid.services.b$f */
    static final class C1823f extends C3371l implements C3349a<DisplayManager> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5189g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1823f(C1802b bVar) {
            super(0);
            this.f5189g = bVar;
        }

        public final DisplayManager invoke() {
            Object systemService = this.f5189g.getSystemService("display");
            if (systemService != null) {
                return (DisplayManager) systemService;
            }
            throw new C3269p("null cannot be cast to non-null type android.hardware.display.DisplayManager");
        }
    }

    /* renamed from: com.fb.fluid.services.b$f0 */
    static final class C1824f0<T> implements C2827e<ComponentName> {

        /* renamed from: a */
        final /* synthetic */ C1802b f5190a;

        /* renamed from: com.fb.fluid.services.b$f0$a */
        static final class C1825a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C1824f0 f5191f;

            C1825a(C1824f0 f0Var) {
                this.f5191f = f0Var;
            }

            public final void run() {
                this.f5191f.f5190a.performGlobalAction(3);
            }
        }

        C1824f0(C1802b bVar) {
            this.f5190a = bVar;
        }

        /* renamed from: a */
        public final void accept(ComponentName componentName) {
            this.f5190a.m7585K().mo6588a(Boolean.valueOf(this.f5190a.m7634p()));
            int i = 1;
            if ((this.f5190a.f5148Z.length() > 0) && (!C3370k.m12225a((Object) this.f5190a.f5148Z, (Object) this.f5190a.m7649x().mo6665a().mo6589b().getPackageName()))) {
                if (this.f5190a.f5147Y != -1) {
                    C1785b.C1786a aVar = C1785b.f5090a;
                    Context baseContext = this.f5190a.getBaseContext();
                    C3370k.m12223a((Object) baseContext, "baseContext");
                    aVar.mo6551a(baseContext, this.f5190a.f5147Y);
                    this.f5190a.f5147Y = -1;
                } else {
                    C1785b.C1786a aVar2 = C1785b.f5090a;
                    Context baseContext2 = this.f5190a.getBaseContext();
                    C3370k.m12223a((Object) baseContext2, "baseContext");
                    aVar2.mo6553a(baseContext2, false);
                }
                this.f5190a.f5148Z = BuildConfig.FLAVOR;
            }
            if (this.f5190a.f5144V) {
                this.f5190a.f5144V = false;
                new Handler().postDelayed(new C1825a(this), 100);
            }
            C1798b q = this.f5190a.m7648w();
            C3370k.m12223a((Object) componentName, "it");
            String packageName = componentName.getPackageName();
            C3370k.m12223a((Object) packageName, "it.packageName");
            if ((!(packageName.length() > 0) || !((List) this.f5190a.m7646v().mo6589b()).contains(componentName.getPackageName())) && !((List) this.f5190a.m7646v().mo6589b()).contains("*")) {
                i = 0;
            }
            q.mo6588a(Integer.valueOf(i));
        }
    }

    /* renamed from: com.fb.fluid.services.b$f1 */
    static final class C1826f1 extends C3371l implements C3349a<WindowManager> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5192g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1826f1(C1802b bVar) {
            super(0);
            this.f5192g = bVar;
        }

        public final WindowManager invoke() {
            Object systemService = this.f5192g.getSystemService("window");
            if (systemService != null) {
                return (WindowManager) systemService;
            }
            throw new C3269p("null cannot be cast to non-null type android.view.WindowManager");
        }
    }

    /* renamed from: com.fb.fluid.services.b$g */
    static final class C1827g extends C3371l implements C3349a<C1798b<Integer>> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5193g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1827g(C1802b bVar) {
            super(0);
            this.f5193g = bVar;
        }

        public final C1798b<Integer> invoke() {
            return new C1798b<>(Integer.valueOf(this.f5193g.m7654z().mo7543n()));
        }
    }

    /* renamed from: com.fb.fluid.services.b$g0 */
    static final class C1828g0<T> implements C2827e<Throwable> {

        /* renamed from: a */
        public static final C1828g0 f5194a = new C1828g0();

        C1828g0() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C1776l.m7478a("error.5: " + th.getMessage(), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.services.b$g1 */
    static final class C1829g1 extends C3371l implements C3349a<C1931d> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5195g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1829g1(C1802b bVar) {
            super(0);
            this.f5195g = bVar;
        }

        public final C1931d invoke() {
            return new C1931d(this.f5195g);
        }
    }

    /* renamed from: com.fb.fluid.services.b$h */
    static final class C1830h extends C3371l implements C3349a<C1798b<Boolean>> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5196g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1830h(C1802b bVar) {
            super(0);
            this.f5196g = bVar;
        }

        public final C1798b<Boolean> invoke() {
            return new C1798b<>(Boolean.valueOf(!this.f5196g.m7654z().mo7498K()));
        }
    }

    /* renamed from: com.fb.fluid.services.b$h0 */
    static final class C1831h0 implements C2823a {

        /* renamed from: a */
        final /* synthetic */ C1802b f5197a;

        C1831h0(C1802b bVar) {
            this.f5197a = bVar;
        }

        public final void run() {
            this.f5197a.m7595a(0, 0);
        }
    }

    /* renamed from: com.fb.fluid.services.b$i */
    static final class C1832i extends C3371l implements C3349a<C2790h<Boolean>> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5198g;

        /* renamed from: com.fb.fluid.services.b$i$a */
        static final class C1833a<T, R> implements C2828f<T, R> {

            /* renamed from: a */
            final /* synthetic */ C1832i f5199a;

            C1833a(C1832i iVar) {
                this.f5199a = iVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
                return Boolean.valueOf(mo6624a((Boolean) obj));
            }

            /* renamed from: a */
            public final boolean mo6624a(Boolean bool) {
                C3370k.m12227b(bool, "it");
                return bool.booleanValue() && this.f5199a.f5198g.m7654z().mo7553u();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1832i(C1802b bVar) {
            super(0);
            this.f5198g = bVar;
        }

        public final C2790h<Boolean> invoke() {
            return this.f5198g.m7573E().mo6739q().mo6587a().mo8924b(new C1833a(this));
        }
    }

    /* renamed from: com.fb.fluid.services.b$i0 */
    static final class C1834i0<T> implements C2827e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C1802b f5200a;

        C1834i0(C1802b bVar) {
            this.f5200a = bVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    TileService.requestListeningState(this.f5200a.getApplicationContext(), new ComponentName(this.f5200a.getApplicationContext(), MyTileService.class));
                }
            } catch (SecurityException e) {
                C1776l.m7478a("error.5.1: " + e.getMessage(), (String) null, 1, (Object) null);
            }
            if (this.f5200a.f5142T + ((long) 1500) < System.currentTimeMillis()) {
                C1802b bVar = this.f5200a;
                C3370k.m12223a((Object) bool, "it");
                C1770f.m7464a((Context) bVar, bool.booleanValue() ? C3148R.string.msg_fluid_paused : C3148R.string.msg_fluid_running, 0);
                this.f5200a.f5142T = System.currentTimeMillis();
            }
            C3370k.m12223a((Object) bool, "it");
            if (bool.booleanValue()) {
                this.f5200a.m7570C().mo6721o();
            }
            this.f5200a.m7649x().mo6665a().mo6588a(new ComponentName(BuildConfig.FLAVOR, BuildConfig.FLAVOR));
        }
    }

    /* renamed from: com.fb.fluid.services.b$j */
    static final class C1835j extends C3371l implements C3349a<C2790h<Boolean>> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5201g;

        /* renamed from: com.fb.fluid.services.b$j$a */
        static final class C1836a<T, R> implements C2828f<T, R> {

            /* renamed from: a */
            public static final C1836a f5202a = new C1836a();

            C1836a() {
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
                return Boolean.valueOf(mo6626a((Boolean) obj));
            }

            /* renamed from: a */
            public final boolean mo6626a(Boolean bool) {
                C3370k.m12227b(bool, "it");
                return !bool.booleanValue();
            }
        }

        /* renamed from: com.fb.fluid.services.b$j$b */
        static final class C1837b<T, R> implements C2828f<Object[], R> {

            /* renamed from: a */
            public static final C1837b f5203a = new C1837b();

            C1837b() {
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
                return Boolean.valueOf(mo6627a((Object[]) obj));
            }

            /* renamed from: a */
            public final boolean mo6627a(Object[] objArr) {
                C3370k.m12227b(objArr, "it");
                return !C3280f.m12022b((T[]) objArr, false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1835j(C1802b bVar) {
            super(0);
            this.f5201g = bVar;
        }

        public final C2790h<Boolean> invoke() {
            return C2790h.m10990a(C3284j.m12070b((T[]) new C2790h[]{this.f5201g.m7575F().mo6587a().mo8901a().mo8924b(C1836a.f5202a), this.f5201g.m7583J().mo6587a().mo8901a(), this.f5201g.m7651y().mo6587a().mo8901a()}), C1837b.f5203a);
        }
    }

    /* renamed from: com.fb.fluid.services.b$j0 */
    static final class C1838j0<T> implements C2827e<Throwable> {

        /* renamed from: a */
        public static final C1838j0 f5204a = new C1838j0();

        C1838j0() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C1776l.m7478a("error.8: " + th.getMessage(), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.services.b$k */
    static final class C1839k extends C3371l implements C3349a<C2790h<Boolean>> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5205g;

        /* renamed from: com.fb.fluid.services.b$k$a */
        static final class C1840a<T, R> implements C2828f<T, R> {

            /* renamed from: a */
            public static final C1840a f5206a = new C1840a();

            C1840a() {
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
                return Boolean.valueOf(mo6629a((Boolean) obj));
            }

            /* renamed from: a */
            public final boolean mo6629a(Boolean bool) {
                C3370k.m12227b(bool, "it");
                return !bool.booleanValue();
            }
        }

        /* renamed from: com.fb.fluid.services.b$k$b */
        static final class C1841b<T, R> implements C2828f<T, R> {

            /* renamed from: a */
            public static final C1841b f5207a = new C1841b();

            C1841b() {
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
                return Boolean.valueOf(mo6630a((Integer) obj));
            }

            /* renamed from: a */
            public final boolean mo6630a(Integer num) {
                C3370k.m12227b(num, "it");
                return num.intValue() != -1;
            }
        }

        /* renamed from: com.fb.fluid.services.b$k$c */
        static final class C1842c<T, R> implements C2828f<Object[], R> {

            /* renamed from: a */
            public static final C1842c f5208a = new C1842c();

            C1842c() {
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
                return Boolean.valueOf(mo6631a((Object[]) obj));
            }

            /* renamed from: a */
            public final boolean mo6631a(Object[] objArr) {
                C3370k.m12227b(objArr, "it");
                return !C3280f.m12022b((T[]) objArr, false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1839k(C1802b bVar) {
            super(0);
            this.f5205g = bVar;
        }

        public final C2790h<Boolean> invoke() {
            return C2790h.m10990a(C3284j.m12070b((T[]) new C2790h[]{this.f5205g.m7570C().isVisible().mo6587a().mo8901a().mo8924b(C1840a.f5206a), this.f5205g.m7649x().mo6677h().mo6587a().mo8901a().mo8924b(C1841b.f5207a), this.f5205g.m7573E().mo6739q().mo6587a().mo8901a()}), C1842c.f5208a);
        }
    }

    /* renamed from: com.fb.fluid.services.b$k0 */
    static final class C1843k0<T> implements C2827e<Integer> {

        /* renamed from: a */
        final /* synthetic */ C1802b f5209a;

        C1843k0(C1802b bVar) {
            this.f5209a = bVar;
        }

        /* renamed from: a */
        public final void accept(Integer num) {
            this.f5209a.m7570C().mo6721o();
            if (this.f5209a.f5146X) {
                this.f5209a.f5146X = false;
                C1785b.C1786a aVar = C1785b.f5090a;
                Context baseContext = this.f5209a.getBaseContext();
                C3370k.m12223a((Object) baseContext, "baseContext");
                aVar.mo6553a(baseContext, false);
                C1785b.C1786a aVar2 = C1785b.f5090a;
                Context baseContext2 = this.f5209a.getBaseContext();
                C3370k.m12223a((Object) baseContext2, "baseContext");
                C3370k.m12223a((Object) num, "it");
                aVar2.mo6551a(baseContext2, num.intValue());
            }
        }
    }

    /* renamed from: com.fb.fluid.services.b$l */
    static final class C1844l extends C3371l implements C3349a<C1798b<Boolean>> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5210g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1844l(C1802b bVar) {
            super(0);
            this.f5210g = bVar;
        }

        public final C1798b<Boolean> invoke() {
            return new C1798b<>(Boolean.valueOf(this.f5210g.m7630n()));
        }
    }

    /* renamed from: com.fb.fluid.services.b$l0 */
    static final class C1845l0<T> implements C2827e<Throwable> {

        /* renamed from: a */
        public static final C1845l0 f5211a = new C1845l0();

        C1845l0() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C1776l.m7478a("error.7: " + th.getMessage(), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.services.b$m */
    static final class C1846m extends C3371l implements C3349a<C1798b<Boolean>> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5212g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1846m(C1802b bVar) {
            super(0);
            this.f5212g = bVar;
        }

        public final C1798b<Boolean> invoke() {
            return new C1798b<>(Boolean.valueOf(this.f5212g.m7634p()));
        }
    }

    @C3332f(mo10052c = "com.fb.fluid.services.ServiceMain$onCreate$3", mo10053f = "ServiceMain.kt", mo10054l = {}, mo10055m = "invokeSuspend")
    /* renamed from: com.fb.fluid.services.b$m0 */
    static final class C1847m0 extends C3339l implements C3351c<C3418e0, C3309c<? super Unit>, Object> {

        /* renamed from: j */
        private C3418e0 f5213j;

        /* renamed from: k */
        int f5214k;

        /* renamed from: l */
        final /* synthetic */ C1802b f5215l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1847m0(C1802b bVar, C3309c cVar) {
            super(2, cVar);
            this.f5215l = bVar;
        }

        /* renamed from: a */
        public final Object mo6125a(Object obj, Object obj2) {
            return ((C1847m0) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
        }

        /* renamed from: a */
        public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
            C3370k.m12227b(cVar, "completion");
            C1847m0 m0Var = new C1847m0(this.f5215l, cVar);
            m0Var.f5213j = (C3418e0) obj;
            return m0Var;
        }

        /* renamed from: b */
        public final Object mo6618b(Object obj) {
            Object unused = C3326d.m12146a();
            if (this.f5214k == 0) {
                C3265l.m11979a(obj);
                C1740g v = this.f5215l.m7567B();
                v.mo6486b();
                v.mo6485a(this.f5215l.m7654z().mo7494G());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.fb.fluid.services.b$n */
    static final class C1848n extends C3371l implements C3349a<C2790h<Boolean>> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5216g;

        /* renamed from: com.fb.fluid.services.b$n$a */
        static final class C1849a<T, R> implements C2828f<Object[], R> {

            /* renamed from: a */
            public static final C1849a f5217a = new C1849a();

            C1849a() {
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
                return Boolean.valueOf(mo6634a((Object[]) obj));
            }

            /* renamed from: a */
            public final boolean mo6634a(Object[] objArr) {
                C3370k.m12227b(objArr, "it");
                return C3280f.m12022b((T[]) objArr, true);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1848n(C1802b bVar) {
            super(0);
            this.f5216g = bVar;
        }

        public final C2790h<Boolean> invoke() {
            return C2790h.m10990a(C3284j.m12070b((T[]) new C2790h[]{this.f5216g.m7575F().mo6587a().mo8901a(), this.f5216g.m7585K().mo6587a().mo8901a(), this.f5216g.m7580H().mo8901a(), this.f5216g.m7649x().mo6678i().mo6587a().mo8901a()}), C1849a.f5217a);
        }
    }

    /* renamed from: com.fb.fluid.services.b$n0 */
    static final class C1850n0 extends C3371l implements C3351c<Context, Intent, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5218g;

        /* renamed from: com.fb.fluid.services.b$n0$a */
        static final class C1851a<V> implements Callable<T> {

            /* renamed from: f */
            public static final C1851a f5219f = new C1851a();

            C1851a() {
            }

            public final void call() {
            }
        }

        /* renamed from: com.fb.fluid.services.b$n0$b */
        static final class C1852b<T> implements C2827e<Unit> {

            /* renamed from: a */
            final /* synthetic */ C1850n0 f5220a;

            C1852b(C1850n0 n0Var) {
                this.f5220a = n0Var;
            }

            /* renamed from: a */
            public final void accept(Unit unit) {
                this.f5220a.f5218g.m7593P();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1850n0(C1802b bVar) {
            super(2);
            this.f5218g = bVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
            mo6635a((Context) obj, (Intent) obj2);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6635a(Context context, Intent intent) {
            C3370k.m12227b(context, "<anonymous parameter 0>");
            C3370k.m12227b(intent, "intent");
            String action = intent.getAction();
            if (action != null) {
                switch (action.hashCode()) {
                    case -2128145023:
                        if (!action.equals("android.intent.action.SCREEN_OFF")) {
                            return;
                        }
                        break;
                    case -1454123155:
                        if (!action.equals("android.intent.action.SCREEN_ON")) {
                            return;
                        }
                        break;
                    case 823795052:
                        if (!action.equals("android.intent.action.USER_PRESENT")) {
                            return;
                        }
                        if (((Boolean) this.f5218g.m7583J().mo6589b()).booleanValue() && !((Boolean) this.f5218g.m7575F().mo6589b()).booleanValue() && ((Boolean) this.f5218g.m7651y().mo6589b()).booleanValue() && ((Number) this.f5218g.m7639s().mo6589b()).intValue() == 1 && !this.f5218g.m7649x().mo6678i().mo6589b().booleanValue()) {
                            C1738f.C1739a aVar = C1738f.f5044c;
                            Context baseContext = this.f5218g.getBaseContext();
                            C3370k.m12223a((Object) baseContext, "baseContext");
                            List<Integer> a = aVar.mo6482a((aVar.mo6481a(baseContext, 0) * -1) + ((Number) this.f5218g.m7648w().mo6589b()).intValue(), this.f5218g.m7627m(), this.f5218g.m7654z().mo7552t());
                            C1738f.f5044c.mo6483a(0, a.get(0).intValue(), a.get(1).intValue(), a.get(2).intValue(), a.get(3).intValue());
                            this.f5218g.m7583J().mo6588a(false);
                            C2790h.m10992a(C1851a.f5219f).mo8903a(250, TimeUnit.MILLISECONDS).mo8928c(1).mo8927b(new C1852b(this));
                            return;
                        }
                    case 1947666138:
                        if (action.equals("android.intent.action.ACTION_SHUTDOWN")) {
                            this.f5218g.m7595a(0, 0);
                            this.f5218g.m7620i();
                            return;
                        }
                        return;
                    default:
                        return;
                }
                this.f5218g.m7593P();
            }
        }
    }

    /* renamed from: com.fb.fluid.services.b$o */
    static final class C1853o extends C3371l implements C3349a<C2790h<Boolean>> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5221g;

        /* renamed from: com.fb.fluid.services.b$o$a */
        static final class C1854a<T, R> implements C2828f<Object[], R> {

            /* renamed from: a */
            public static final C1854a f5222a = new C1854a();

            C1854a() {
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
                return Boolean.valueOf(mo6638a((Object[]) obj));
            }

            /* renamed from: a */
            public final boolean mo6638a(Object[] objArr) {
                C3370k.m12227b(objArr, "it");
                return C3280f.m12022b((T[]) objArr, true);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1853o(C1802b bVar) {
            super(0);
            this.f5221g = bVar;
        }

        public final C2790h<Boolean> invoke() {
            return C2790h.m10990a(C3284j.m12070b((T[]) new C2790h[]{this.f5221g.m7587L(), this.f5221g.m7577G()}), C1854a.f5222a);
        }
    }

    /* renamed from: com.fb.fluid.services.b$o0 */
    static final class C1855o0<T> implements C2827e<Throwable> {

        /* renamed from: a */
        public static final C1855o0 f5223a = new C1855o0();

        C1855o0() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C1776l.m7478a("error.0: " + th.getMessage(), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.services.b$p */
    static final class C1856p extends C3371l implements C3349a<C2790h<Boolean>> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5224g;

        /* renamed from: com.fb.fluid.services.b$p$a */
        static final class C1857a<T, R> implements C2828f<T, R> {

            /* renamed from: a */
            final /* synthetic */ C1856p f5225a;

            C1857a(C1856p pVar) {
                this.f5225a = pVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
                return Boolean.valueOf(mo6640a((Integer) obj));
            }

            /* renamed from: a */
            public final boolean mo6640a(Integer num) {
                C3370k.m12227b(num, "it");
                return C3370k.m12218a(num.intValue(), 0) > 0 && this.f5225a.f5224g.m7654z().mo7492E() && ((Number) this.f5225a.f5224g.m7639s().mo6589b()).intValue() == 1;
            }
        }

        /* renamed from: com.fb.fluid.services.b$p$b */
        static final class C1858b<T, R> implements C2828f<Object[], R> {

            /* renamed from: a */
            public static final C1858b f5226a = new C1858b();

            C1858b() {
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
                return Boolean.valueOf(mo6641a((Object[]) obj));
            }

            /* renamed from: a */
            public final boolean mo6641a(Object[] objArr) {
                C3370k.m12227b(objArr, "it");
                return C3280f.m12022b((T[]) objArr, true);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1856p(C1802b bVar) {
            super(0);
            this.f5224g = bVar;
        }

        public final C2790h<Boolean> invoke() {
            return C2790h.m10990a(C3284j.m12070b((T[]) new C2790h[]{this.f5224g.m7587L(), this.f5224g.m7577G(), this.f5224g.m7641t().mo6661b().mo6587a().mo8924b(new C1857a(this)).mo8901a()}), C1858b.f5226a);
        }
    }

    /* renamed from: com.fb.fluid.services.b$p0 */
    static final class C1859p0<T> implements C2827e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C1802b f5227a;

        C1859p0(C1802b bVar) {
            this.f5227a = bVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C3370k.m12223a((Object) bool, "userIsActive");
            if (bool.booleanValue()) {
                this.f5227a.m7641t().mo6662c();
            } else {
                this.f5227a.m7641t().mo6659a();
            }
        }
    }

    /* renamed from: com.fb.fluid.services.b$q */
    static final class C1860q extends C3371l implements C3349a<C1895a> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5228g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1860q(C1802b bVar) {
            super(0);
            this.f5228g = bVar;
        }

        public final C1895a invoke() {
            Context baseContext = this.f5228g.getBaseContext();
            C3370k.m12223a((Object) baseContext, "baseContext");
            return new C1895a(baseContext);
        }
    }

    /* renamed from: com.fb.fluid.services.b$q0 */
    static final class C1861q0<T> implements C2827e<Throwable> {

        /* renamed from: a */
        public static final C1861q0 f5229a = new C1861q0();

        C1861q0() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C1776l.m7478a("error.1: " + th.getMessage(), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.services.b$r */
    static final class C1862r extends C3371l implements C3349a<KeyguardManager> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5230g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1862r(C1802b bVar) {
            super(0);
            this.f5230g = bVar;
        }

        public final KeyguardManager invoke() {
            Object systemService = this.f5230g.getSystemService("keyguard");
            if (systemService != null) {
                return (KeyguardManager) systemService;
            }
            throw new C3269p("null cannot be cast to non-null type android.app.KeyguardManager");
        }
    }

    /* renamed from: com.fb.fluid.services.b$r0 */
    static final class C1863r0<T> implements C2827e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C1802b f5231a;

        C1863r0(C1802b bVar) {
            this.f5231a = bVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            if (!bool.booleanValue()) {
                this.f5231a.m7649x().mo6679j();
            } else {
                this.f5231a.m7649x().mo6680k();
            }
            C3370k.m12223a((Object) bool, "isPausedOnLockScreen");
            if (bool.booleanValue()) {
                this.f5231a.f5156n.mo6696c();
            }
        }
    }

    /* renamed from: com.fb.fluid.services.b$s */
    static final class C1864s extends C3371l implements C3349a<C1798b<List<? extends String>>> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5232g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1864s(C1802b bVar) {
            super(0);
            this.f5232g = bVar;
        }

        public final C1798b<List<String>> invoke() {
            return new C1798b<>(this.f5232g.m7654z().mo7551s());
        }
    }

    /* renamed from: com.fb.fluid.services.b$s0 */
    static final class C1865s0<T, R> implements C2828f<Object[], R> {

        /* renamed from: a */
        public static final C1865s0 f5233a = new C1865s0();

        C1865s0() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
            Object[] objArr = (Object[]) obj;
            mo6645a(objArr);
            return objArr;
        }

        /* renamed from: a */
        public final Object[] mo6645a(Object[] objArr) {
            C3370k.m12227b(objArr, "it");
            return objArr;
        }
    }

    /* renamed from: com.fb.fluid.services.b$t */
    static final class C1866t extends C3371l implements C3349a<C1798b<Integer>> {

        /* renamed from: g */
        public static final C1866t f5234g = new C1866t();

        C1866t() {
            super(0);
        }

        public final C1798b<Integer> invoke() {
            return new C1798b<>(0);
        }
    }

    /* renamed from: com.fb.fluid.services.b$t0 */
    static final class C1867t0 extends C3371l implements C3349a<C1899b> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5235g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1867t0(C1802b bVar) {
            super(0);
            this.f5235g = bVar;
        }

        public final C1899b invoke() {
            return new C1899b(this.f5235g);
        }
    }

    /* renamed from: com.fb.fluid.services.b$u */
    static final class C1868u<T> implements C2827e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C1920b f5236a;

        /* renamed from: b */
        final /* synthetic */ C1802b f5237b;

        C1868u(C1920b bVar, C1802b bVar2) {
            this.f5236a = bVar;
            this.f5237b = bVar2;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            if (!bool.booleanValue() && this.f5237b.f5145W) {
                this.f5237b.f5145W = false;
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f5237b.performGlobalAction(9);
                }
            }
            if (!bool.booleanValue()) {
                this.f5237b.f5156n.mo6695b();
            }
            if (!bool.booleanValue() && C1770f.m7462a((Service) this.f5237b).mo6353g() && !this.f5236a.mo6722p()) {
                this.f5236a.mo6714a(this.f5237b.m7654z(), true);
            }
        }
    }

    /* renamed from: com.fb.fluid.services.b$u0 */
    static final class C1869u0 extends C3371l implements C3349a<C1798b<Boolean>> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5238g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1869u0(C1802b bVar) {
            super(0);
            this.f5238g = bVar;
        }

        public final C1798b<Boolean> invoke() {
            return new C1798b<>(Boolean.valueOf(this.f5238g.m7654z().mo7556x()));
        }
    }

    /* renamed from: com.fb.fluid.services.b$v */
    static final class C1870v extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5239g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1870v(C1802b bVar) {
            super(0);
            this.f5239g = bVar;
        }

        public final void invoke() {
            this.f5239g.f5156n.mo6695b();
            this.f5239g.m7565A().mo6588a(Integer.valueOf(this.f5239g.m7627m()));
        }
    }

    @C3332f(mo10052c = "com.fb.fluid.services.ServiceMain$performAction$1", mo10053f = "ServiceMain.kt", mo10054l = {1331, 1434, 1457, 1473, 1489, 1550, 1586, 1603}, mo10055m = "invokeSuspend")
    /* renamed from: com.fb.fluid.services.b$v0 */
    static final class C1871v0 extends C3339l implements C3351c<C3418e0, C3309c<? super Unit>, Object> {

        /* renamed from: j */
        private C3418e0 f5240j;

        /* renamed from: k */
        Object f5241k;

        /* renamed from: l */
        Object f5242l;

        /* renamed from: m */
        Object f5243m;

        /* renamed from: n */
        int f5244n;

        /* renamed from: o */
        final /* synthetic */ C1802b f5245o;

        /* renamed from: p */
        final /* synthetic */ int f5246p;

        /* renamed from: q */
        final /* synthetic */ String f5247q;

        /* renamed from: r */
        final /* synthetic */ View f5248r;

        /* renamed from: s */
        final /* synthetic */ int f5249s;

        /* renamed from: t */
        final /* synthetic */ int f5250t;

        @C3332f(mo10052c = "com.fb.fluid.services.ServiceMain$performAction$1$10", mo10053f = "ServiceMain.kt", mo10054l = {}, mo10055m = "invokeSuspend")
        /* renamed from: com.fb.fluid.services.b$v0$a */
        static final class C1872a extends C3339l implements C3351c<C3418e0, C3309c<? super Runnable>, Object> {

            /* renamed from: j */
            private C3418e0 f5251j;

            /* renamed from: k */
            int f5252k;

            /* renamed from: l */
            final /* synthetic */ C1871v0 f5253l;

            /* renamed from: com.fb.fluid.services.b$v0$a$a */
            public static final class C1873a implements Runnable {

                /* renamed from: f */
                final /* synthetic */ C1872a f5254f;

                public C1873a(C1872a aVar) {
                    this.f5254f = aVar;
                }

                public final void run() {
                    if (this.f5254f.f5253l.f5245o.f5146X) {
                        this.f5254f.f5253l.f5245o.f5146X = false;
                        this.f5254f.f5253l.f5245o.f5147Y = -1;
                        C1785b.C1786a aVar = C1785b.f5090a;
                        Context baseContext = this.f5254f.f5253l.f5245o.getBaseContext();
                        C3370k.m12223a((Object) baseContext, "baseContext");
                        aVar.mo6553a(baseContext, false);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1872a(C1871v0 v0Var, C3309c cVar) {
                super(2, cVar);
                this.f5253l = v0Var;
            }

            /* renamed from: a */
            public final Object mo6125a(Object obj, Object obj2) {
                return ((C1872a) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
            }

            /* renamed from: a */
            public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
                C3370k.m12227b(cVar, "completion");
                C1872a aVar = new C1872a(this.f5253l, cVar);
                aVar.f5251j = (C3418e0) obj;
                return aVar;
            }

            /* renamed from: b */
            public final Object mo6618b(Object obj) {
                Object unused = C3326d.m12146a();
                if (this.f5252k == 0) {
                    C3265l.m11979a(obj);
                    Handler handler = new Handler();
                    C1873a aVar = new C1873a(this);
                    handler.postDelayed(aVar, 1000);
                    return aVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @C3332f(mo10052c = "com.fb.fluid.services.ServiceMain$performAction$1$11", mo10053f = "ServiceMain.kt", mo10054l = {}, mo10055m = "invokeSuspend")
        /* renamed from: com.fb.fluid.services.b$v0$b */
        static final class C1874b extends C3339l implements C3351c<C3418e0, C3309c<? super Runnable>, Object> {

            /* renamed from: j */
            private C3418e0 f5255j;

            /* renamed from: k */
            int f5256k;

            /* renamed from: l */
            final /* synthetic */ C1871v0 f5257l;

            /* renamed from: com.fb.fluid.services.b$v0$b$a */
            public static final class C1875a implements Runnable {

                /* renamed from: f */
                final /* synthetic */ C1874b f5258f;

                public C1875a(C1874b bVar) {
                    this.f5258f = bVar;
                }

                public final void run() {
                    if (this.f5258f.f5257l.f5245o.f5144V) {
                        this.f5258f.f5257l.f5245o.f5144V = false;
                        this.f5258f.f5257l.f5245o.performGlobalAction(3);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1874b(C1871v0 v0Var, C3309c cVar) {
                super(2, cVar);
                this.f5257l = v0Var;
            }

            /* renamed from: a */
            public final Object mo6125a(Object obj, Object obj2) {
                return ((C1874b) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
            }

            /* renamed from: a */
            public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
                C3370k.m12227b(cVar, "completion");
                C1874b bVar = new C1874b(this.f5257l, cVar);
                bVar.f5255j = (C3418e0) obj;
                return bVar;
            }

            /* renamed from: b */
            public final Object mo6618b(Object obj) {
                Object unused = C3326d.m12146a();
                if (this.f5256k == 0) {
                    C3265l.m11979a(obj);
                    Handler handler = new Handler();
                    C1875a aVar = new C1875a(this);
                    handler.postDelayed(aVar, 350);
                    return aVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @C3332f(mo10052c = "com.fb.fluid.services.ServiceMain$performAction$1$12", mo10053f = "ServiceMain.kt", mo10054l = {}, mo10055m = "invokeSuspend")
        /* renamed from: com.fb.fluid.services.b$v0$c */
        static final class C1876c extends C3339l implements C3351c<C3418e0, C3309c<? super Unit>, Object> {

            /* renamed from: j */
            private C3418e0 f5259j;

            /* renamed from: k */
            int f5260k;

            /* renamed from: l */
            final /* synthetic */ C1871v0 f5261l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1876c(C1871v0 v0Var, C3309c cVar) {
                super(2, cVar);
                this.f5261l = v0Var;
            }

            /* renamed from: a */
            public final Object mo6125a(Object obj, Object obj2) {
                return ((C1876c) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
            }

            /* renamed from: a */
            public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
                C3370k.m12227b(cVar, "completion");
                C1876c cVar2 = new C1876c(this.f5261l, cVar);
                cVar2.f5259j = (C3418e0) obj;
                return cVar2;
            }

            /* renamed from: b */
            public final Object mo6618b(Object obj) {
                Object unused = C3326d.m12146a();
                if (this.f5260k == 0) {
                    C3265l.m11979a(obj);
                    C1770f.m7465a((Context) this.f5261l.f5245o, (int) C3148R.string.action_kill_app_failed, 0, 2, (Object) null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @C3332f(mo10052c = "com.fb.fluid.services.ServiceMain$performAction$1$13", mo10053f = "ServiceMain.kt", mo10054l = {}, mo10055m = "invokeSuspend")
        /* renamed from: com.fb.fluid.services.b$v0$d */
        static final class C1877d extends C3339l implements C3351c<C3418e0, C3309c<? super Unit>, Object> {

            /* renamed from: j */
            private C3418e0 f5262j;

            /* renamed from: k */
            int f5263k;

            /* renamed from: l */
            final /* synthetic */ C1871v0 f5264l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1877d(C1871v0 v0Var, C3309c cVar) {
                super(2, cVar);
                this.f5264l = v0Var;
            }

            /* renamed from: a */
            public final Object mo6125a(Object obj, Object obj2) {
                return ((C1877d) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
            }

            /* renamed from: a */
            public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
                C3370k.m12227b(cVar, "completion");
                C1877d dVar = new C1877d(this.f5264l, cVar);
                dVar.f5262j = (C3418e0) obj;
                return dVar;
            }

            /* renamed from: b */
            public final Object mo6618b(Object obj) {
                Object unused = C3326d.m12146a();
                if (this.f5263k == 0) {
                    C3265l.m11979a(obj);
                    C1770f.m7465a((Context) this.f5264l.f5245o, (int) C3148R.string.action_kill_app_failed, 0, 2, (Object) null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @C3332f(mo10052c = "com.fb.fluid.services.ServiceMain$performAction$1$15", mo10053f = "ServiceMain.kt", mo10054l = {}, mo10055m = "invokeSuspend")
        /* renamed from: com.fb.fluid.services.b$v0$e */
        static final class C1878e extends C3339l implements C3351c<C3418e0, C3309c<? super Unit>, Object> {

            /* renamed from: j */
            private C3418e0 f5265j;

            /* renamed from: k */
            int f5266k;

            /* renamed from: l */
            final /* synthetic */ C1871v0 f5267l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1878e(C1871v0 v0Var, C3309c cVar) {
                super(2, cVar);
                this.f5267l = v0Var;
            }

            /* renamed from: a */
            public final Object mo6125a(Object obj, Object obj2) {
                return ((C1878e) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
            }

            /* renamed from: a */
            public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
                C3370k.m12227b(cVar, "completion");
                C1878e eVar = new C1878e(this.f5267l, cVar);
                eVar.f5265j = (C3418e0) obj;
                return eVar;
            }

            /* renamed from: b */
            public final Object mo6618b(Object obj) {
                Object unused = C3326d.m12146a();
                if (this.f5266k == 0) {
                    C3265l.m11979a(obj);
                    C1770f.m7465a((Context) this.f5267l.f5245o, (int) C3148R.string.msg_action_requires_hide_navbar, 0, 2, (Object) null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @C3332f(mo10052c = "com.fb.fluid.services.ServiceMain$performAction$1$17", mo10053f = "ServiceMain.kt", mo10054l = {}, mo10055m = "invokeSuspend")
        /* renamed from: com.fb.fluid.services.b$v0$f */
        static final class C1879f extends C3339l implements C3351c<C3418e0, C3309c<? super String>, Object> {

            /* renamed from: j */
            private C3418e0 f5268j;

            /* renamed from: k */
            int f5269k;

            /* renamed from: l */
            final /* synthetic */ C1871v0 f5270l;

            /* renamed from: m */
            final /* synthetic */ C1881h f5271m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1879f(C1871v0 v0Var, C1881h hVar, C3309c cVar) {
                super(2, cVar);
                this.f5270l = v0Var;
                this.f5271m = hVar;
            }

            /* renamed from: a */
            public final Object mo6125a(Object obj, Object obj2) {
                return ((C1879f) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
            }

            /* renamed from: a */
            public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
                C3370k.m12227b(cVar, "completion");
                C1879f fVar = new C1879f(this.f5270l, this.f5271m, cVar);
                fVar.f5268j = (C3418e0) obj;
                return fVar;
            }

            /* renamed from: b */
            public final Object mo6618b(Object obj) {
                Object unused = C3326d.m12146a();
                if (this.f5269k == 0) {
                    C3265l.m11979a(obj);
                    String f = this.f5270l.f5245o.m7649x().mo6675f();
                    if (f == null) {
                        return null;
                    }
                    Bundle a = C0281b.m1429a(this.f5270l.f5245o.getBaseContext(), C3148R.anim.anim_slide_right_in, C3148R.anim.anim_slide_right_out).mo1894a();
                    this.f5270l.f5245o.m7649x().mo6667a(f);
                    Intent a2 = C1882i.f5277g.mo6650a(this.f5270l.f5245o.getPackageManager().getLaunchIntentForPackage(f), true);
                    if (a2 == null) {
                        return f;
                    }
                    this.f5271m.mo6649a(a2, a);
                    return f;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @C3332f(mo10052c = "com.fb.fluid.services.ServiceMain$performAction$1$18", mo10053f = "ServiceMain.kt", mo10054l = {}, mo10055m = "invokeSuspend")
        /* renamed from: com.fb.fluid.services.b$v0$g */
        static final class C1880g extends C3339l implements C3351c<C3418e0, C3309c<? super String>, Object> {

            /* renamed from: j */
            private C3418e0 f5272j;

            /* renamed from: k */
            int f5273k;

            /* renamed from: l */
            final /* synthetic */ C1871v0 f5274l;

            /* renamed from: m */
            final /* synthetic */ C1881h f5275m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1880g(C1871v0 v0Var, C1881h hVar, C3309c cVar) {
                super(2, cVar);
                this.f5274l = v0Var;
                this.f5275m = hVar;
            }

            /* renamed from: a */
            public final Object mo6125a(Object obj, Object obj2) {
                return ((C1880g) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
            }

            /* renamed from: a */
            public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
                C3370k.m12227b(cVar, "completion");
                C1880g gVar = new C1880g(this.f5274l, this.f5275m, cVar);
                gVar.f5272j = (C3418e0) obj;
                return gVar;
            }

            /* renamed from: b */
            public final Object mo6618b(Object obj) {
                Object unused = C3326d.m12146a();
                if (this.f5273k == 0) {
                    C3265l.m11979a(obj);
                    String b = this.f5274l.f5245o.m7649x().mo6670b();
                    if (b == null) {
                        return null;
                    }
                    Bundle a = C0281b.m1429a(this.f5274l.f5245o.getBaseContext(), C3148R.anim.anim_slide_left_in, C3148R.anim.anim_slide_left_out).mo1894a();
                    this.f5274l.f5245o.m7649x().mo6667a(b);
                    Intent a2 = C1882i.f5277g.mo6650a(this.f5274l.f5245o.getPackageManager().getLaunchIntentForPackage(b), true);
                    if (a2 == null) {
                        return b;
                    }
                    this.f5275m.mo6649a(a2, a);
                    return b;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.fb.fluid.services.b$v0$h */
        static final class C1881h extends C3371l implements C3351c<Intent, Bundle, Unit> {

            /* renamed from: g */
            final /* synthetic */ C1871v0 f5276g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1881h(C1871v0 v0Var) {
                super(2);
                this.f5276g = v0Var;
            }

            /* renamed from: a */
            public static /* synthetic */ void m7747a(C1881h hVar, Intent intent, Bundle bundle, int i, Object obj) {
                if ((i & 1) != 0) {
                    bundle = null;
                }
                hVar.mo6649a(intent, bundle);
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo6649a((Intent) obj, (Bundle) obj2);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6649a(Intent intent, Bundle bundle) {
                C3370k.m12227b(intent, "$this$launchAsPending");
                PendingIntent activity = PendingIntent.getActivity(this.f5276g.f5245o.getBaseContext(), 0, intent, 1073741824, bundle);
                C3370k.m12223a((Object) activity, "PendingIntent\n          …t.FLAG_ONE_SHOT, options)");
                C1779o.m7484a(activity);
            }
        }

        /* renamed from: com.fb.fluid.services.b$v0$i */
        static final class C1882i extends C3371l implements C3351c<Intent, Boolean, Intent> {

            /* renamed from: g */
            public static final C1882i f5277g = new C1882i();

            C1882i() {
                super(2);
            }

            /* renamed from: a */
            public final Intent mo6650a(Intent intent, boolean z) {
                if (intent == null || intent.getComponent() == null) {
                    return null;
                }
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.setFlags(270532608);
                if (z) {
                    intent2.setFlags(intent2.getFlags() | 16384);
                }
                intent2.setComponent(intent.getComponent());
                intent2.addCategory("android.intent.category.LAUNCHER");
                return intent2;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                return mo6650a((Intent) obj, ((Boolean) obj2).booleanValue());
            }
        }

        @C3332f(mo10052c = "com.fb.fluid.services.ServiceMain$performAction$1$9", mo10053f = "ServiceMain.kt", mo10054l = {}, mo10055m = "invokeSuspend")
        /* renamed from: com.fb.fluid.services.b$v0$j */
        static final class C1883j extends C3339l implements C3351c<C3418e0, C3309c<? super Boolean>, Object> {

            /* renamed from: j */
            private C3418e0 f5278j;

            /* renamed from: k */
            int f5279k;

            /* renamed from: l */
            final /* synthetic */ C1871v0 f5280l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1883j(C1871v0 v0Var, C3309c cVar) {
                super(2, cVar);
                this.f5280l = v0Var;
            }

            /* renamed from: a */
            public final Object mo6125a(Object obj, Object obj2) {
                return ((C1883j) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
            }

            /* renamed from: a */
            public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
                C3370k.m12227b(cVar, "completion");
                C1883j jVar = new C1883j(this.f5280l, cVar);
                jVar.f5278j = (C3418e0) obj;
                return jVar;
            }

            /* renamed from: b */
            public final Object mo6618b(Object obj) {
                Object unused = C3326d.m12146a();
                if (this.f5279k == 0) {
                    C3265l.m11979a(obj);
                    boolean z = true;
                    if (C1783a.f5089a.mo6541d()) {
                        int i = this.f5280l.f5249s;
                        Point point = new Point();
                        Display display = this.f5280l.f5245o.m7573E().mo6703h().getDisplay();
                        if (display != null) {
                            display.getSize(point);
                        }
                        String str = i < point.x / 2 ? "left" : "right";
                        C1787c.C1788a aVar = C1787c.f5091a;
                        Context baseContext = this.f5280l.f5245o.getBaseContext();
                        C3370k.m12223a((Object) baseContext, "baseContext");
                        aVar.mo6559c(baseContext, str);
                    } else if (C1783a.f5089a.mo6547j()) {
                        int i2 = this.f5280l.f5249s;
                        Point point2 = new Point();
                        Display display2 = this.f5280l.f5245o.m7573E().mo6703h().getDisplay();
                        if (display2 != null) {
                            display2.getSize(point2);
                        }
                        int i3 = i2 < point2.x / 2 ? 1 : 2;
                        C1802b bVar = this.f5280l.f5245o;
                        Intent intent = new Intent("miui.action.handymode.changemode");
                        intent.putExtra("mode", i3);
                        intent.setFlags(16);
                        bVar.sendBroadcast(intent);
                    } else {
                        z = false;
                    }
                    Boolean a = C3328b.m12154a(z);
                    if (!a.booleanValue()) {
                        C1770f.m7465a((Context) this.f5280l.f5245o, (int) C3148R.string.action_not_supported, 0, 2, (Object) null);
                    }
                    return a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1871v0(C1802b bVar, int i, String str, View view, int i2, int i3, C3309c cVar) {
            super(2, cVar);
            this.f5245o = bVar;
            this.f5246p = i;
            this.f5247q = str;
            this.f5248r = view;
            this.f5249s = i2;
            this.f5250t = i3;
        }

        /* renamed from: a */
        public final Object mo6125a(Object obj, Object obj2) {
            return ((C1871v0) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
        }

        /* renamed from: a */
        public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
            C3370k.m12227b(cVar, "completion");
            C1871v0 v0Var = new C1871v0(this.f5245o, this.f5246p, this.f5247q, this.f5248r, this.f5249s, this.f5250t, cVar);
            v0Var.f5240j = (C3418e0) obj;
            return v0Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x056a, code lost:
            r0 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x05e6, code lost:
            r0.performGlobalAction(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x0669, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x066a, code lost:
            r2 = r0.getMessage();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x0676, code lost:
            r2 = com.p131fb.fluid.p148ui.C2054c.f5653A;
            r4 = r1.f5245o.getBaseContext();
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r4, "baseContext");
            r2.mo6915a(r4, 0, "android.permission.CALL_PHONE");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x0684, code lost:
            com.p131fb.fluid.p135l.p139p.C1776l.m7478a("sm.pa.e: " + r0.getMessage(), (java.lang.String) null, 1, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x018e, code lost:
            com.p131fb.fluid.services.C1802b.C1871v0.C1881h.m7747a(r10, r0, (android.os.Bundle) null, 1, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
            kotlin.C3265l.m11979a(r19);
         */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x0502 A[Catch:{ Exception -> 0x0669 }] */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x0512 A[Catch:{ Exception -> 0x0669 }] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:5:0x0027=Splitter:B:5:0x0027, B:21:0x00c9=Splitter:B:21:0x00c9} */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo6618b(java.lang.Object r19) {
            /*
                r18 = this;
                r1 = r18
                java.lang.Object r2 = kotlin.p197u.p198h.C3326d.m12146a()
                int r0 = r1.f5244n
                java.lang.String r3 = "android.permission.CALL_PHONE"
                r4 = 2
                java.lang.String r5 = "baseContext"
                r6 = 0
                r7 = 1
                r8 = 0
                switch(r0) {
                    case 0: goto L_0x0087;
                    case 1: goto L_0x007a;
                    case 2: goto L_0x006d;
                    case 3: goto L_0x0060;
                    case 4: goto L_0x0053;
                    case 5: goto L_0x0046;
                    case 6: goto L_0x0039;
                    case 7: goto L_0x002c;
                    case 8: goto L_0x001b;
                    default: goto L_0x0013;
                }
            L_0x0013:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x001b:
                java.lang.Object r0 = r1.f5243m
                com.fb.fluid.services.b$v0$i r0 = (com.p131fb.fluid.services.C1802b.C1871v0.C1882i) r0
                java.lang.Object r0 = r1.f5242l
                com.fb.fluid.services.b$v0$h r0 = (com.p131fb.fluid.services.C1802b.C1871v0.C1881h) r0
                java.lang.Object r0 = r1.f5241k
                kotlinx.coroutines.e0 r0 = (kotlinx.coroutines.C3418e0) r0
            L_0x0027:
                kotlin.C3265l.m11979a((java.lang.Object) r19)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x002c:
                java.lang.Object r0 = r1.f5243m
                com.fb.fluid.services.b$v0$i r0 = (com.p131fb.fluid.services.C1802b.C1871v0.C1882i) r0
                java.lang.Object r0 = r1.f5242l
                com.fb.fluid.services.b$v0$h r0 = (com.p131fb.fluid.services.C1802b.C1871v0.C1881h) r0
                java.lang.Object r0 = r1.f5241k
                kotlinx.coroutines.e0 r0 = (kotlinx.coroutines.C3418e0) r0
                goto L_0x0027
            L_0x0039:
                java.lang.Object r0 = r1.f5243m
                com.fb.fluid.services.b$v0$i r0 = (com.p131fb.fluid.services.C1802b.C1871v0.C1882i) r0
                java.lang.Object r0 = r1.f5242l
                com.fb.fluid.services.b$v0$h r0 = (com.p131fb.fluid.services.C1802b.C1871v0.C1881h) r0
                java.lang.Object r0 = r1.f5241k
                kotlinx.coroutines.e0 r0 = (kotlinx.coroutines.C3418e0) r0
                goto L_0x0027
            L_0x0046:
                java.lang.Object r0 = r1.f5243m
                com.fb.fluid.services.b$v0$i r0 = (com.p131fb.fluid.services.C1802b.C1871v0.C1882i) r0
                java.lang.Object r0 = r1.f5242l
                com.fb.fluid.services.b$v0$h r0 = (com.p131fb.fluid.services.C1802b.C1871v0.C1881h) r0
                java.lang.Object r0 = r1.f5241k
                kotlinx.coroutines.e0 r0 = (kotlinx.coroutines.C3418e0) r0
                goto L_0x0027
            L_0x0053:
                java.lang.Object r0 = r1.f5243m
                com.fb.fluid.services.b$v0$i r0 = (com.p131fb.fluid.services.C1802b.C1871v0.C1882i) r0
                java.lang.Object r0 = r1.f5242l
                com.fb.fluid.services.b$v0$h r0 = (com.p131fb.fluid.services.C1802b.C1871v0.C1881h) r0
                java.lang.Object r0 = r1.f5241k
                kotlinx.coroutines.e0 r0 = (kotlinx.coroutines.C3418e0) r0
                goto L_0x0027
            L_0x0060:
                java.lang.Object r0 = r1.f5243m
                com.fb.fluid.services.b$v0$i r0 = (com.p131fb.fluid.services.C1802b.C1871v0.C1882i) r0
                java.lang.Object r0 = r1.f5242l
                com.fb.fluid.services.b$v0$h r0 = (com.p131fb.fluid.services.C1802b.C1871v0.C1881h) r0
                java.lang.Object r0 = r1.f5241k
                kotlinx.coroutines.e0 r0 = (kotlinx.coroutines.C3418e0) r0
                goto L_0x0027
            L_0x006d:
                java.lang.Object r0 = r1.f5243m
                com.fb.fluid.services.b$v0$i r0 = (com.p131fb.fluid.services.C1802b.C1871v0.C1882i) r0
                java.lang.Object r0 = r1.f5242l
                com.fb.fluid.services.b$v0$h r0 = (com.p131fb.fluid.services.C1802b.C1871v0.C1881h) r0
                java.lang.Object r0 = r1.f5241k
                kotlinx.coroutines.e0 r0 = (kotlinx.coroutines.C3418e0) r0
                goto L_0x0027
            L_0x007a:
                java.lang.Object r0 = r1.f5243m
                com.fb.fluid.services.b$v0$i r0 = (com.p131fb.fluid.services.C1802b.C1871v0.C1882i) r0
                java.lang.Object r0 = r1.f5242l
                com.fb.fluid.services.b$v0$h r0 = (com.p131fb.fluid.services.C1802b.C1871v0.C1881h) r0
                java.lang.Object r0 = r1.f5241k
                kotlinx.coroutines.e0 r0 = (kotlinx.coroutines.C3418e0) r0
                goto L_0x0027
            L_0x0087:
                kotlin.C3265l.m11979a((java.lang.Object) r19)
                kotlinx.coroutines.e0 r9 = r1.f5240j
                com.fb.fluid.services.b$v0$h r10 = new com.fb.fluid.services.b$v0$h
                r10.<init>(r1)
                com.fb.fluid.services.b$v0$i r11 = com.p131fb.fluid.services.C1802b.C1871v0.C1882i.f5277g
                com.fb.fluid.services.b r0 = r1.f5245o
                com.fb.fluid.App r0 = com.p131fb.fluid.p135l.p139p.C1770f.m7462a((android.app.Service) r0)
                boolean r0 = r0.mo6353g()
                if (r0 == 0) goto L_0x00c9
                com.fb.fluid.services.b r0 = r1.f5245o
                int[] r0 = r0.m7622j()
                java.lang.String r12 = "actionsPro"
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r12)
                int r12 = r1.f5246p
                boolean r0 = kotlin.p195s.C3280f.m12021b((int[]) r0, (int) r12)
                if (r0 == 0) goto L_0x00c9
                com.fb.fluid.ui.c$a r12 = com.p131fb.fluid.p148ui.C2054c.f5653A
                com.fb.fluid.services.b r0 = r1.f5245o
                android.content.Context r13 = r0.getBaseContext()
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r13, (java.lang.String) r5)
                r14 = 1
                r15 = 0
                r16 = 4
                r17 = 0
                com.p131fb.fluid.p148ui.C2054c.C2055a.m8389a(r12, r13, r14, r15, r16, r17)
            L_0x00c6:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L_0x00c9:
                int r0 = r1.f5246p     // Catch:{ Exception -> 0x0669 }
                java.lang.String r13 = "android.intent.action.MAIN"
                r12 = 6
                java.lang.String r14 = "packageHelper.activeApp.value.packageName"
                r15 = -1
                switch(r0) {
                    case 1: goto L_0x0601;
                    case 2: goto L_0x05fa;
                    case 3: goto L_0x05f6;
                    case 4: goto L_0x05ef;
                    case 5: goto L_0x05eb;
                    case 6: goto L_0x05e3;
                    case 7: goto L_0x05d5;
                    case 8: goto L_0x05bc;
                    case 9: goto L_0x05ae;
                    case 10: goto L_0x00d4;
                    case 11: goto L_0x0595;
                    case 12: goto L_0x0585;
                    case 13: goto L_0x056e;
                    case 14: goto L_0x0527;
                    case 15: goto L_0x04ad;
                    case 16: goto L_0x049d;
                    case 17: goto L_0x045c;
                    case 18: goto L_0x03fe;
                    case 19: goto L_0x03da;
                    case 20: goto L_0x0390;
                    case 21: goto L_0x036c;
                    case 22: goto L_0x0354;
                    case 23: goto L_0x0336;
                    case 24: goto L_0x02c1;
                    case 25: goto L_0x0225;
                    case 26: goto L_0x020b;
                    case 27: goto L_0x01da;
                    case 28: goto L_0x0193;
                    case 29: goto L_0x00d6;
                    default: goto L_0x00d4;
                }
            L_0x00d4:
                goto L_0x069c
            L_0x00d6:
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.utils.preferences.h r0 = r0.m7654z()     // Catch:{ Exception -> 0x0669 }
                int r0 = r0.mo7543n()     // Catch:{ Exception -> 0x0669 }
                if (r0 != 0) goto L_0x011d
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.utils.preferences.h r0 = r0.m7654z()     // Catch:{ Exception -> 0x0669 }
                int r0 = r0.mo7545o()     // Catch:{ Exception -> 0x0669 }
                if (r0 != r15) goto L_0x011d
                android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r13 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                android.content.Context r13 = r13.getBaseContext()     // Catch:{ Exception -> 0x0669 }
                java.lang.Class<com.fb.fluid.ui.ActivitySettings> r14 = com.p131fb.fluid.p148ui.ActivitySettings.class
                r0.<init>(r13, r14)     // Catch:{ Exception -> 0x0669 }
                java.lang.String r13 = "page"
                r0.putExtra(r13, r4)     // Catch:{ Exception -> 0x0669 }
                kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x0669 }
                com.p131fb.fluid.services.C1802b.C1871v0.C1881h.m7747a(r10, r0, r8, r7, r8)     // Catch:{ Exception -> 0x0669 }
                kotlinx.coroutines.t1 r0 = kotlinx.coroutines.C3536t0.m12778c()     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b$v0$e r13 = new com.fb.fluid.services.b$v0$e     // Catch:{ Exception -> 0x0669 }
                r13.<init>(r1, r8)     // Catch:{ Exception -> 0x0669 }
                r1.f5241k = r9     // Catch:{ Exception -> 0x0669 }
                r1.f5242l = r10     // Catch:{ Exception -> 0x0669 }
                r1.f5243m = r11     // Catch:{ Exception -> 0x0669 }
                r1.f5244n = r12     // Catch:{ Exception -> 0x0669 }
                java.lang.Object r0 = kotlinx.coroutines.C3412d.m12326a(r0, r13, r1)     // Catch:{ Exception -> 0x0669 }
                if (r0 != r2) goto L_0x069c
                return r2
            L_0x011d:
                com.fb.fluid.l.s.a$a r0 = com.p131fb.fluid.p135l.p142s.C1795a.f5111a     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r2 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                android.app.Application r2 = r2.getApplication()     // Catch:{ Exception -> 0x0669 }
                java.lang.String r9 = "application"
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r2, (java.lang.String) r9)     // Catch:{ Exception -> 0x0669 }
                boolean r0 = r0.mo6586c(r2)     // Catch:{ Exception -> 0x0669 }
                if (r0 == 0) goto L_0x0178
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.utils.preferences.h r0 = r0.m7654z()     // Catch:{ Exception -> 0x0669 }
                int r0 = r0.mo7545o()     // Catch:{ Exception -> 0x0669 }
                if (r0 == r15) goto L_0x015a
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.utils.preferences.h r0 = r0.m7654z()     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r2 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.utils.preferences.h r2 = r2.m7654z()     // Catch:{ Exception -> 0x0669 }
                int r2 = r2.mo7545o()     // Catch:{ Exception -> 0x0669 }
                r0.mo7521f((int) r2)     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.utils.preferences.h r0 = r0.m7654z()     // Catch:{ Exception -> 0x0669 }
                r0.mo7523g((int) r15)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x015a:
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.utils.preferences.h r0 = r0.m7654z()     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r2 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.utils.preferences.h r2 = r2.m7654z()     // Catch:{ Exception -> 0x0669 }
                int r2 = r2.mo7543n()     // Catch:{ Exception -> 0x0669 }
                r0.mo7523g((int) r2)     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.utils.preferences.h r0 = r0.m7654z()     // Catch:{ Exception -> 0x0669 }
                r0.mo7521f((int) r6)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x0178:
                android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r2 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                android.content.Context r2 = r2.getBaseContext()     // Catch:{ Exception -> 0x0669 }
                java.lang.Class<com.fb.fluid.ui.ActivitySettings> r9 = com.p131fb.fluid.p148ui.ActivitySettings.class
                r0.<init>(r2, r9)     // Catch:{ Exception -> 0x0669 }
                java.lang.String r2 = "page"
                r9 = 19
                r0.putExtra(r2, r9)     // Catch:{ Exception -> 0x0669 }
                kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x0669 }
            L_0x018e:
                com.p131fb.fluid.services.C1802b.C1871v0.C1881h.m7747a(r10, r0, r8, r7, r8)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x0193:
                java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ Exception -> 0x01bf }
                com.fb.fluid.l.h$a r2 = com.p131fb.fluid.p135l.C1741h.f5048a     // Catch:{ Exception -> 0x01bf }
                java.lang.String r9 = r1.f5247q     // Catch:{ Exception -> 0x01bf }
                if (r9 == 0) goto L_0x01aa
                int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ Exception -> 0x01bf }
                java.lang.Integer r9 = kotlin.p197u.p199i.p200a.C3328b.m12155a((int) r9)     // Catch:{ Exception -> 0x01bf }
                if (r9 == 0) goto L_0x01aa
                int r9 = r9.intValue()     // Catch:{ Exception -> 0x01bf }
                goto L_0x01ab
            L_0x01aa:
                r9 = 0
            L_0x01ab:
                java.lang.String r2 = r2.mo6488a((int) r9)     // Catch:{ Exception -> 0x01bf }
                r0[r6] = r2     // Catch:{ Exception -> 0x01bf }
                c.g.a.a.a r0 = p054c.p116g.p117a.p118a.C1429b.C1447h.m6662a((java.lang.String[]) r0)     // Catch:{ Exception -> 0x01bf }
                java.lang.String r2 = "Shell.SU.run(SuUtils.sen…eyEvent.KEYCODE_UNKNOWN))"
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x01bf }
                r0.mo5875b()     // Catch:{ Exception -> 0x01bf }
                goto L_0x069c
            L_0x01bf:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0669 }
                r2.<init>()     // Catch:{ Exception -> 0x0669 }
                java.lang.String r9 = "ms.pa.kcode.e: "
                r2.append(r9)     // Catch:{ Exception -> 0x0669 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0669 }
                r2.append(r0)     // Catch:{ Exception -> 0x0669 }
                java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0669 }
            L_0x01d5:
                com.p131fb.fluid.p135l.p139p.C1776l.m7478a(r0, r8, r7, r8)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x01da:
                java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ Exception -> 0x01f4 }
                com.fb.fluid.l.h$a r2 = com.p131fb.fluid.p135l.C1741h.f5048a     // Catch:{ Exception -> 0x01f4 }
                r9 = 82
                java.lang.String r2 = r2.mo6488a((int) r9)     // Catch:{ Exception -> 0x01f4 }
                r0[r6] = r2     // Catch:{ Exception -> 0x01f4 }
                c.g.a.a.a r0 = p054c.p116g.p117a.p118a.C1429b.C1447h.m6662a((java.lang.String[]) r0)     // Catch:{ Exception -> 0x01f4 }
                java.lang.String r2 = "Shell.SU.run(SuUtils.sen…t(KeyEvent.KEYCODE_MENU))"
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x01f4 }
                r0.mo5875b()     // Catch:{ Exception -> 0x01f4 }
                goto L_0x069c
            L_0x01f4:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0669 }
                r2.<init>()     // Catch:{ Exception -> 0x0669 }
                java.lang.String r9 = "ms.pa.menu.e: "
                r2.append(r9)     // Catch:{ Exception -> 0x0669 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0669 }
                r2.append(r0)     // Catch:{ Exception -> 0x0669 }
                java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0669 }
                goto L_0x01d5
            L_0x020b:
                kotlinx.coroutines.t1 r0 = kotlinx.coroutines.C3536t0.m12778c()     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b$v0$g r12 = new com.fb.fluid.services.b$v0$g     // Catch:{ Exception -> 0x0669 }
                r12.<init>(r1, r10, r8)     // Catch:{ Exception -> 0x0669 }
                r1.f5241k = r9     // Catch:{ Exception -> 0x0669 }
                r1.f5242l = r10     // Catch:{ Exception -> 0x0669 }
                r1.f5243m = r11     // Catch:{ Exception -> 0x0669 }
                r9 = 8
                r1.f5244n = r9     // Catch:{ Exception -> 0x0669 }
                java.lang.Object r0 = kotlinx.coroutines.C3412d.m12326a(r0, r12, r1)     // Catch:{ Exception -> 0x0669 }
                if (r0 != r2) goto L_0x069c
                return r2
            L_0x0225:
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.d.b r0 = r0.m7649x()     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.l.t.b r0 = r0.mo6665a()     // Catch:{ Exception -> 0x0669 }
                java.lang.Object r0 = r0.mo6589b()     // Catch:{ Exception -> 0x0669 }
                android.content.ComponentName r0 = (android.content.ComponentName) r0     // Catch:{ Exception -> 0x0669 }
                java.lang.String r0 = r0.getPackageName()     // Catch:{ Exception -> 0x0669 }
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r14)     // Catch:{ Exception -> 0x0669 }
                int r0 = r0.length()     // Catch:{ Exception -> 0x0669 }
                if (r0 != 0) goto L_0x0244
                r0 = 1
                goto L_0x0245
            L_0x0244:
                r0 = 0
            L_0x0245:
                if (r0 == 0) goto L_0x0260
                kotlinx.coroutines.t1 r0 = kotlinx.coroutines.C3536t0.m12778c()     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b$v0$c r12 = new com.fb.fluid.services.b$v0$c     // Catch:{ Exception -> 0x0669 }
                r12.<init>(r1, r8)     // Catch:{ Exception -> 0x0669 }
                r1.f5241k = r9     // Catch:{ Exception -> 0x0669 }
                r1.f5242l = r10     // Catch:{ Exception -> 0x0669 }
                r1.f5243m = r11     // Catch:{ Exception -> 0x0669 }
                r9 = 4
                r1.f5244n = r9     // Catch:{ Exception -> 0x0669 }
                java.lang.Object r0 = kotlinx.coroutines.C3412d.m12326a(r0, r12, r1)     // Catch:{ Exception -> 0x0669 }
                if (r0 != r2) goto L_0x069c
                return r2
            L_0x0260:
                java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ Exception -> 0x028c }
                com.fb.fluid.l.h$a r12 = com.p131fb.fluid.p135l.C1741h.f5048a     // Catch:{ Exception -> 0x028c }
                com.fb.fluid.services.b r13 = r1.f5245o     // Catch:{ Exception -> 0x028c }
                com.fb.fluid.services.d.b r13 = r13.m7649x()     // Catch:{ Exception -> 0x028c }
                com.fb.fluid.l.t.b r13 = r13.mo6665a()     // Catch:{ Exception -> 0x028c }
                java.lang.Object r13 = r13.mo6589b()     // Catch:{ Exception -> 0x028c }
                android.content.ComponentName r13 = (android.content.ComponentName) r13     // Catch:{ Exception -> 0x028c }
                java.lang.String r13 = r13.getPackageName()     // Catch:{ Exception -> 0x028c }
                java.lang.String r12 = r12.mo6489a((java.lang.String) r13)     // Catch:{ Exception -> 0x028c }
                r0[r6] = r12     // Catch:{ Exception -> 0x028c }
                c.g.a.a.a r0 = p054c.p116g.p117a.p118a.C1429b.C1447h.m6662a((java.lang.String[]) r0)     // Catch:{ Exception -> 0x028c }
                java.lang.String r12 = "Shell.SU.run(SuUtils.for…veApp.value.packageName))"
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r12)     // Catch:{ Exception -> 0x028c }
                boolean r0 = r0.mo5875b()     // Catch:{ Exception -> 0x028c }
                goto L_0x02a6
            L_0x028c:
                r0 = move-exception
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0669 }
                r12.<init>()     // Catch:{ Exception -> 0x0669 }
                java.lang.String r13 = "action.25 "
                r12.append(r13)     // Catch:{ Exception -> 0x0669 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0669 }
                r12.append(r0)     // Catch:{ Exception -> 0x0669 }
                java.lang.String r0 = r12.toString()     // Catch:{ Exception -> 0x0669 }
                com.p131fb.fluid.p135l.p139p.C1776l.m7478a(r0, r8, r7, r8)     // Catch:{ Exception -> 0x0669 }
                r0 = 0
            L_0x02a6:
                if (r0 != 0) goto L_0x069c
                kotlinx.coroutines.t1 r0 = kotlinx.coroutines.C3536t0.m12778c()     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b$v0$d r12 = new com.fb.fluid.services.b$v0$d     // Catch:{ Exception -> 0x0669 }
                r12.<init>(r1, r8)     // Catch:{ Exception -> 0x0669 }
                r1.f5241k = r9     // Catch:{ Exception -> 0x0669 }
                r1.f5242l = r10     // Catch:{ Exception -> 0x0669 }
                r1.f5243m = r11     // Catch:{ Exception -> 0x0669 }
                r9 = 5
                r1.f5244n = r9     // Catch:{ Exception -> 0x0669 }
                java.lang.Object r0 = kotlinx.coroutines.C3412d.m12326a(r0, r12, r1)     // Catch:{ Exception -> 0x0669 }
                if (r0 != r2) goto L_0x069c
                return r2
            L_0x02c1:
                com.fb.fluid.l.q.b$a r0 = com.p131fb.fluid.p135l.p140q.C1785b.f5090a     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r12 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                android.content.Context r12 = r12.getBaseContext()     // Catch:{ Exception -> 0x0669 }
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r12, (java.lang.String) r5)     // Catch:{ Exception -> 0x0669 }
                boolean r0 = r0.mo6550a(r12)     // Catch:{ Exception -> 0x0669 }
                if (r0 != 0) goto L_0x069c
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                r0.f5146X = r7     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                int r0 = r0.f5147Y     // Catch:{ Exception -> 0x0669 }
                if (r0 != r15) goto L_0x02f4
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r12 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.l.t.b r12 = r12.m7565A()     // Catch:{ Exception -> 0x0669 }
                java.lang.Object r12 = r12.mo6589b()     // Catch:{ Exception -> 0x0669 }
                java.lang.Number r12 = (java.lang.Number) r12     // Catch:{ Exception -> 0x0669 }
                int r12 = r12.intValue()     // Catch:{ Exception -> 0x0669 }
                r0.f5147Y = r12     // Catch:{ Exception -> 0x0669 }
            L_0x02f4:
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r12 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.d.b r12 = r12.m7649x()     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.l.t.b r12 = r12.mo6665a()     // Catch:{ Exception -> 0x0669 }
                java.lang.Object r12 = r12.mo6589b()     // Catch:{ Exception -> 0x0669 }
                android.content.ComponentName r12 = (android.content.ComponentName) r12     // Catch:{ Exception -> 0x0669 }
                java.lang.String r12 = r12.getPackageName()     // Catch:{ Exception -> 0x0669 }
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r12, (java.lang.String) r14)     // Catch:{ Exception -> 0x0669 }
                r0.f5148Z = r12     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.l.q.b$a r0 = com.p131fb.fluid.p135l.p140q.C1785b.f5090a     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r12 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                android.content.Context r12 = r12.getBaseContext()     // Catch:{ Exception -> 0x0669 }
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r12, (java.lang.String) r5)     // Catch:{ Exception -> 0x0669 }
                r0.mo6553a((android.content.Context) r12, (boolean) r7)     // Catch:{ Exception -> 0x0669 }
                kotlinx.coroutines.t1 r0 = kotlinx.coroutines.C3536t0.m12778c()     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b$v0$a r12 = new com.fb.fluid.services.b$v0$a     // Catch:{ Exception -> 0x0669 }
                r12.<init>(r1, r8)     // Catch:{ Exception -> 0x0669 }
                r1.f5241k = r9     // Catch:{ Exception -> 0x0669 }
                r1.f5242l = r10     // Catch:{ Exception -> 0x0669 }
                r1.f5243m = r11     // Catch:{ Exception -> 0x0669 }
                r1.f5244n = r4     // Catch:{ Exception -> 0x0669 }
                java.lang.Object r0 = kotlinx.coroutines.C3412d.m12326a(r0, r12, r1)     // Catch:{ Exception -> 0x0669 }
                if (r0 != r2) goto L_0x069c
                return r2
            L_0x0336:
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                android.content.Context r0 = r0.getBaseContext()     // Catch:{ Exception -> 0x0669 }
                java.lang.String r2 = "audio"
                java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ Exception -> 0x0669 }
                if (r0 == 0) goto L_0x034c
                android.media.AudioManager r0 = (android.media.AudioManager) r0     // Catch:{ Exception -> 0x0669 }
                r2 = 3
                r0.adjustStreamVolume(r2, r6, r7)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x034c:
                kotlin.p r0 = new kotlin.p     // Catch:{ Exception -> 0x0669 }
                java.lang.String r2 = "null cannot be cast to non-null type android.media.AudioManager"
                r0.<init>(r2)     // Catch:{ Exception -> 0x0669 }
                throw r0     // Catch:{ Exception -> 0x0669 }
            L_0x0354:
                kotlinx.coroutines.t1 r0 = kotlinx.coroutines.C3536t0.m12778c()     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b$v0$j r12 = new com.fb.fluid.services.b$v0$j     // Catch:{ Exception -> 0x0669 }
                r12.<init>(r1, r8)     // Catch:{ Exception -> 0x0669 }
                r1.f5241k = r9     // Catch:{ Exception -> 0x0669 }
                r1.f5242l = r10     // Catch:{ Exception -> 0x0669 }
                r1.f5243m = r11     // Catch:{ Exception -> 0x0669 }
                r1.f5244n = r7     // Catch:{ Exception -> 0x0669 }
                java.lang.Object r0 = kotlinx.coroutines.C3412d.m12326a(r0, r12, r1)     // Catch:{ Exception -> 0x0669 }
                if (r0 != r2) goto L_0x069c
                return r2
            L_0x036c:
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                r12 = 3
                r0.performGlobalAction(r12)     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                r0.f5144V = r7     // Catch:{ Exception -> 0x0669 }
                kotlinx.coroutines.t1 r0 = kotlinx.coroutines.C3536t0.m12778c()     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b$v0$b r12 = new com.fb.fluid.services.b$v0$b     // Catch:{ Exception -> 0x0669 }
                r12.<init>(r1, r8)     // Catch:{ Exception -> 0x0669 }
                r1.f5241k = r9     // Catch:{ Exception -> 0x0669 }
                r1.f5242l = r10     // Catch:{ Exception -> 0x0669 }
                r1.f5243m = r11     // Catch:{ Exception -> 0x0669 }
                r9 = 3
                r1.f5244n = r9     // Catch:{ Exception -> 0x0669 }
                java.lang.Object r0 = kotlinx.coroutines.C3412d.m12326a(r0, r12, r1)     // Catch:{ Exception -> 0x0669 }
                if (r0 != r2) goto L_0x069c
                return r2
            L_0x0390:
                com.fb.fluid.l.q.b$a r0 = com.p131fb.fluid.p135l.p140q.C1785b.f5090a     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r2 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                android.content.Context r2 = r2.getBaseContext()     // Catch:{ Exception -> 0x0669 }
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r2, (java.lang.String) r5)     // Catch:{ Exception -> 0x0669 }
                boolean r0 = r0.mo6550a(r2)     // Catch:{ Exception -> 0x0669 }
                if (r0 != 0) goto L_0x069c
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                boolean r0 = r0.f5146X     // Catch:{ Exception -> 0x0669 }
                if (r0 != 0) goto L_0x069c
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                r0.f5147Y = r15     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r2 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.d.b r2 = r2.m7649x()     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.l.t.b r2 = r2.mo6665a()     // Catch:{ Exception -> 0x0669 }
                java.lang.Object r2 = r2.mo6589b()     // Catch:{ Exception -> 0x0669 }
                android.content.ComponentName r2 = (android.content.ComponentName) r2     // Catch:{ Exception -> 0x0669 }
                java.lang.String r2 = r2.getPackageName()     // Catch:{ Exception -> 0x0669 }
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r2, (java.lang.String) r14)     // Catch:{ Exception -> 0x0669 }
                r0.f5148Z = r2     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.l.q.b$a r0 = com.p131fb.fluid.p135l.p140q.C1785b.f5090a     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r2 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                android.content.Context r2 = r2.getBaseContext()     // Catch:{ Exception -> 0x0669 }
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r2, (java.lang.String) r5)     // Catch:{ Exception -> 0x0669 }
                r0.mo6553a((android.content.Context) r2, (boolean) r7)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x03da:
                com.fb.fluid.l.q.b$a r0 = com.p131fb.fluid.p135l.p140q.C1785b.f5090a     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r2 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                android.content.Context r2 = r2.getBaseContext()     // Catch:{ Exception -> 0x0669 }
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r2, (java.lang.String) r5)     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.l.q.b$a r9 = com.p131fb.fluid.p135l.p140q.C1785b.f5090a     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r10 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                android.content.Context r10 = r10.getBaseContext()     // Catch:{ Exception -> 0x0669 }
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r10, (java.lang.String) r5)     // Catch:{ Exception -> 0x0669 }
                boolean r9 = r9.mo6550a(r10)     // Catch:{ Exception -> 0x0669 }
                if (r9 != 0) goto L_0x03f8
                r9 = 1
                goto L_0x03f9
            L_0x03f8:
                r9 = 0
            L_0x03f9:
                r0.mo6553a((android.content.Context) r2, (boolean) r9)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x03fe:
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0669 }
                r2 = 28
                if (r0 < r2) goto L_0x042a
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.e.b r0 = r0.m7570C()     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.l.t.b r0 = r0.mo6707k()     // Catch:{ Exception -> 0x0669 }
                java.lang.Object r0 = r0.mo6589b()     // Catch:{ Exception -> 0x0669 }
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0669 }
                boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0669 }
                if (r0 == 0) goto L_0x0421
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                r0.f5145W = r7     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x0421:
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                r2 = 9
                r0.performGlobalAction(r2)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x042a:
                java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ Exception -> 0x0444 }
                com.fb.fluid.l.h$a r2 = com.p131fb.fluid.p135l.C1741h.f5048a     // Catch:{ Exception -> 0x0444 }
                r9 = 120(0x78, float:1.68E-43)
                java.lang.String r2 = r2.mo6488a((int) r9)     // Catch:{ Exception -> 0x0444 }
                r0[r6] = r2     // Catch:{ Exception -> 0x0444 }
                c.g.a.a.a r0 = p054c.p116g.p117a.p118a.C1429b.C1447h.m6662a((java.lang.String[]) r0)     // Catch:{ Exception -> 0x0444 }
                java.lang.String r2 = "Shell.SU.run(SuUtils.sen…(KeyEvent.KEYCODE_SYSRQ))"
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0444 }
                r0.mo5875b()     // Catch:{ Exception -> 0x0444 }
                goto L_0x069c
            L_0x0444:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0669 }
                r2.<init>()     // Catch:{ Exception -> 0x0669 }
                java.lang.String r9 = "ms.pa.sshot.e: "
                r2.append(r9)     // Catch:{ Exception -> 0x0669 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0669 }
                r2.append(r0)     // Catch:{ Exception -> 0x0669 }
                java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0669 }
                goto L_0x01d5
            L_0x045c:
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0669 }
                r2 = 28
                if (r0 < r2) goto L_0x046b
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                r2 = 8
                r0.performGlobalAction(r2)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x046b:
                java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ Exception -> 0x0485 }
                com.fb.fluid.l.h$a r2 = com.p131fb.fluid.p135l.C1741h.f5048a     // Catch:{ Exception -> 0x0485 }
                r9 = 26
                java.lang.String r2 = r2.mo6488a((int) r9)     // Catch:{ Exception -> 0x0485 }
                r0[r6] = r2     // Catch:{ Exception -> 0x0485 }
                c.g.a.a.a r0 = p054c.p116g.p117a.p118a.C1429b.C1447h.m6662a((java.lang.String[]) r0)     // Catch:{ Exception -> 0x0485 }
                java.lang.String r2 = "Shell.SU.run(SuUtils.sen…(KeyEvent.KEYCODE_POWER))"
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0485 }
                r0.mo5875b()     // Catch:{ Exception -> 0x0485 }
                goto L_0x069c
            L_0x0485:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0669 }
                r2.<init>()     // Catch:{ Exception -> 0x0669 }
                java.lang.String r9 = "ms.pa.slock.e: "
                r2.append(r9)     // Catch:{ Exception -> 0x0669 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0669 }
                r2.append(r0)     // Catch:{ Exception -> 0x0669 }
                java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0669 }
                goto L_0x01d5
            L_0x049d:
                android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0669 }
                java.lang.String r2 = "android.intent.action.SEARCH_LONG_PRESS"
                r0.<init>(r2)     // Catch:{ Exception -> 0x0669 }
                r2 = 270532608(0x10200000, float:3.1554436E-29)
                r0.setFlags(r2)     // Catch:{ Exception -> 0x0669 }
                kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x0669 }
                goto L_0x018e
            L_0x04ad:
                c.e.c.e r0 = new c.e.c.e     // Catch:{ Exception -> 0x04bd }
                r0.<init>()     // Catch:{ Exception -> 0x04bd }
                java.lang.String r2 = r1.f5247q     // Catch:{ Exception -> 0x04bd }
                java.lang.Class<com.fb.fluid.data.a> r9 = com.p131fb.fluid.data.C1702a.class
                java.lang.Object r0 = r0.mo5634a((java.lang.String) r2, r9)     // Catch:{ Exception -> 0x04bd }
                com.fb.fluid.data.a r0 = (com.p131fb.fluid.data.C1702a) r0     // Catch:{ Exception -> 0x04bd }
                goto L_0x04be
            L_0x04bd:
                r0 = r8
            L_0x04be:
                if (r0 == 0) goto L_0x04d3
                java.lang.String r11 = r0.mo6434r()     // Catch:{ Exception -> 0x0669 }
                if (r11 == 0) goto L_0x04d3
                java.lang.String r12 = "CALL_PRIVILEGED"
                java.lang.String r13 = "CALL"
                r14 = 0
                r15 = 4
                r16 = 0
                java.lang.String r0 = kotlin.p194d0.C3250n.m11928a((java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (boolean) r14, (int) r15, (java.lang.Object) r16)     // Catch:{ Exception -> 0x0669 }
                goto L_0x04d4
            L_0x04d3:
                r0 = r8
            L_0x04d4:
                android.content.Intent r0 = android.content.Intent.parseUri(r0, r6)     // Catch:{ Exception -> 0x0669 }
                java.lang.String r2 = "shortcutIntent"
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0669 }
                android.net.Uri r2 = r0.getData()     // Catch:{ Exception -> 0x0669 }
                if (r2 == 0) goto L_0x018e
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0669 }
                if (r2 == 0) goto L_0x018e
                java.lang.String r9 = "tel:"
                boolean r2 = kotlin.p194d0.C3251o.m11953a((java.lang.CharSequence) r2, (java.lang.CharSequence) r9, (boolean) r6, (int) r4, (java.lang.Object) r8)     // Catch:{ Exception -> 0x0669 }
                if (r2 != r7) goto L_0x018e
                com.fb.fluid.l.s.a$a r2 = com.p131fb.fluid.p135l.p142s.C1795a.f5111a     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r9 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                android.content.Context r9 = r9.getBaseContext()     // Catch:{ Exception -> 0x0669 }
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r9, (java.lang.String) r5)     // Catch:{ Exception -> 0x0669 }
                boolean r2 = r2.mo6585b(r9)     // Catch:{ Exception -> 0x0669 }
                if (r2 != 0) goto L_0x0512
                com.fb.fluid.ui.c$a r0 = com.p131fb.fluid.p148ui.C2054c.f5653A     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r2 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                android.content.Context r2 = r2.getBaseContext()     // Catch:{ Exception -> 0x0669 }
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r2, (java.lang.String) r5)     // Catch:{ Exception -> 0x0669 }
                r0.mo6915a(r2, r6, r3)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x0512:
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0669 }
                java.lang.String r9 = "android.intent.action.CALL"
                r2.<init>(r9)     // Catch:{ Exception -> 0x0669 }
                android.net.Uri r0 = r0.getData()     // Catch:{ Exception -> 0x0669 }
                r2.setData(r0)     // Catch:{ Exception -> 0x0669 }
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x0669 }
                com.p131fb.fluid.services.C1802b.C1871v0.C1881h.m7747a(r10, r2, r8, r7, r8)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x0527:
                java.lang.String r0 = r1.f5247q     // Catch:{ Exception -> 0x0669 }
                if (r0 == 0) goto L_0x069c
                android.view.View r2 = r1.f5248r     // Catch:{ Exception -> 0x0669 }
                if (r2 == 0) goto L_0x0552
                int r2 = r1.f5249s     // Catch:{ Exception -> 0x0669 }
                if (r2 <= 0) goto L_0x0552
                int r2 = r1.f5250t     // Catch:{ Exception -> 0x0669 }
                if (r2 <= 0) goto L_0x0552
                android.view.View r2 = r1.f5248r     // Catch:{ Exception -> 0x0669 }
                int r9 = r1.f5249s     // Catch:{ Exception -> 0x0669 }
                int r11 = r1.f5250t     // Catch:{ Exception -> 0x0669 }
                r12 = 54
                int r12 = p054c.p079d.p080a.p081a.p082a.C1165a.m5734a((int) r12)     // Catch:{ Exception -> 0x0669 }
                r13 = 54
                int r13 = p054c.p079d.p080a.p081a.p082a.C1165a.m5734a((int) r13)     // Catch:{ Exception -> 0x0669 }
                androidx.core.app.b r2 = androidx.core.app.C0281b.m1430a(r2, r9, r11, r12, r13)     // Catch:{ Exception -> 0x0669 }
                android.os.Bundle r2 = r2.mo1894a()     // Catch:{ Exception -> 0x0669 }
                goto L_0x0553
            L_0x0552:
                r2 = r8
            L_0x0553:
                com.fb.fluid.services.b$v0$i r9 = com.p131fb.fluid.services.C1802b.C1871v0.C1882i.f5277g     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r11 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                android.content.pm.PackageManager r11 = r11.getPackageManager()     // Catch:{ Exception -> 0x0669 }
                android.content.Intent r0 = r11.getLaunchIntentForPackage(r0)     // Catch:{ Exception -> 0x0669 }
                android.content.Intent r0 = r9.mo6650a((android.content.Intent) r0, (boolean) r6)     // Catch:{ Exception -> 0x0669 }
                if (r0 == 0) goto L_0x056a
                r10.mo6649a((android.content.Intent) r0, (android.os.Bundle) r2)     // Catch:{ Exception -> 0x0669 }
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x0669 }
            L_0x056a:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x056e:
                android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0669 }
                r0.<init>(r13)     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.l.r.a$a r2 = com.p131fb.fluid.p135l.p141r.C1793a.f5110q     // Catch:{ Exception -> 0x0669 }
                android.content.ComponentName r2 = r2.mo6566a()     // Catch:{ Exception -> 0x0669 }
                r0.setComponent(r2)     // Catch:{ Exception -> 0x0669 }
                r2 = 270532608(0x10200000, float:3.1554436E-29)
                r0.setFlags(r2)     // Catch:{ Exception -> 0x0669 }
                kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x0669 }
                goto L_0x018e
            L_0x0585:
                android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0669 }
                java.lang.String r2 = "android.intent.action.VOICE_COMMAND"
                r0.<init>(r2)     // Catch:{ Exception -> 0x0669 }
                r2 = 270532608(0x10200000, float:3.1554436E-29)
                r0.setFlags(r2)     // Catch:{ Exception -> 0x0669 }
                kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x0669 }
                goto L_0x018e
            L_0x0595:
                kotlinx.coroutines.t1 r0 = kotlinx.coroutines.C3536t0.m12778c()     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b$v0$f r12 = new com.fb.fluid.services.b$v0$f     // Catch:{ Exception -> 0x0669 }
                r12.<init>(r1, r10, r8)     // Catch:{ Exception -> 0x0669 }
                r1.f5241k = r9     // Catch:{ Exception -> 0x0669 }
                r1.f5242l = r10     // Catch:{ Exception -> 0x0669 }
                r1.f5243m = r11     // Catch:{ Exception -> 0x0669 }
                r9 = 7
                r1.f5244n = r9     // Catch:{ Exception -> 0x0669 }
                java.lang.Object r0 = kotlinx.coroutines.C3412d.m12326a(r0, r12, r1)     // Catch:{ Exception -> 0x0669 }
                if (r0 != r2) goto L_0x069c
                return r2
            L_0x05ae:
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                android.content.Context r0 = r0.getBaseContext()     // Catch:{ Exception -> 0x0669 }
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r5)     // Catch:{ Exception -> 0x0669 }
                com.p131fb.fluid.p135l.p139p.C1764a.m7433a((android.content.Context) r0)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x05bc:
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                android.content.Context r0 = r0.getBaseContext()     // Catch:{ Exception -> 0x0669 }
                java.lang.String r2 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ Exception -> 0x0669 }
                boolean r2 = r0 instanceof android.view.inputmethod.InputMethodManager     // Catch:{ Exception -> 0x0669 }
                if (r2 != 0) goto L_0x05cd
                r0 = r8
            L_0x05cd:
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0     // Catch:{ Exception -> 0x0669 }
                if (r0 == 0) goto L_0x069c
                r0.showInputMethodPicker()     // Catch:{ Exception -> 0x0669 }
                goto L_0x056a
            L_0x05d5:
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0669 }
                r2 = 24
                if (r0 < r2) goto L_0x069c
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                r2 = 7
                r0.performGlobalAction(r2)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x05e3:
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                r2 = 5
            L_0x05e6:
                r0.performGlobalAction(r2)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x05eb:
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                r2 = 4
                goto L_0x05e6
            L_0x05ef:
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                r0.performGlobalAction(r12)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x05f6:
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                r2 = 3
                goto L_0x05e6
            L_0x05fa:
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                r0.performGlobalAction(r7)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x0601:
                com.fb.fluid.l.q.a$a r0 = com.p131fb.fluid.p135l.p140q.C1783a.f5089a     // Catch:{ Exception -> 0x0669 }
                boolean r0 = r0.mo6543f()     // Catch:{ Exception -> 0x0669 }
                if (r0 != 0) goto L_0x0620
                com.fb.fluid.l.q.a$a r0 = com.p131fb.fluid.p135l.p140q.C1783a.f5089a     // Catch:{ Exception -> 0x0669 }
                boolean r0 = r0.mo6547j()     // Catch:{ Exception -> 0x0669 }
                if (r0 != 0) goto L_0x0620
                com.fb.fluid.l.c$a r0 = com.p131fb.fluid.p135l.C1734c.f5038h     // Catch:{ Exception -> 0x0669 }
                boolean r0 = r0.mo6472a()     // Catch:{ Exception -> 0x0669 }
                if (r0 == 0) goto L_0x061a
                goto L_0x0620
            L_0x061a:
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
            L_0x061c:
                r0.performGlobalAction(r4)     // Catch:{ Exception -> 0x0669 }
                goto L_0x065f
            L_0x0620:
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0643 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0643 }
                r2.<init>(r13)     // Catch:{ Exception -> 0x0643 }
                java.lang.String r9 = "android.intent.category.HOME"
                r2.addCategory(r9)     // Catch:{ Exception -> 0x0643 }
                r9 = 270532608(0x10200000, float:3.1554436E-29)
                r2.setFlags(r9)     // Catch:{ Exception -> 0x0643 }
                kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x0643 }
                r0.startActivity(r2)     // Catch:{ Exception -> 0x0643 }
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0643 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0643 }
                java.lang.String r9 = "android.intent.action.CLOSE_SYSTEM_DIALOGS"
                r2.<init>(r9)     // Catch:{ Exception -> 0x0643 }
                r0.sendBroadcast(r2)     // Catch:{ Exception -> 0x0643 }
                goto L_0x065f
            L_0x0643:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0669 }
                r2.<init>()     // Catch:{ Exception -> 0x0669 }
                java.lang.String r9 = "sm.pa.a_h.e: "
                r2.append(r9)     // Catch:{ Exception -> 0x0669 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0669 }
                r2.append(r0)     // Catch:{ Exception -> 0x0669 }
                java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0669 }
                com.p131fb.fluid.p135l.p139p.C1776l.m7478a(r0, r8, r7, r8)     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                goto L_0x061c
            L_0x065f:
                com.fb.fluid.services.b r0 = r1.f5245o     // Catch:{ Exception -> 0x0669 }
                com.fb.fluid.services.d.b r0 = r0.m7649x()     // Catch:{ Exception -> 0x0669 }
                r0.mo6667a((java.lang.String) r8)     // Catch:{ Exception -> 0x0669 }
                goto L_0x069c
            L_0x0669:
                r0 = move-exception
                java.lang.String r2 = r0.getMessage()
                if (r2 == 0) goto L_0x0684
                boolean r2 = kotlin.p194d0.C3251o.m11953a((java.lang.CharSequence) r2, (java.lang.CharSequence) r3, (boolean) r6, (int) r4, (java.lang.Object) r8)
                if (r2 != r7) goto L_0x0684
                com.fb.fluid.ui.c$a r2 = com.p131fb.fluid.p148ui.C2054c.f5653A
                com.fb.fluid.services.b r4 = r1.f5245o
                android.content.Context r4 = r4.getBaseContext()
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r4, (java.lang.String) r5)
                r2.mo6915a(r4, r6, r3)
            L_0x0684:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "sm.pa.e: "
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.p131fb.fluid.p135l.p139p.C1776l.m7478a(r0, r8, r7, r8)
            L_0x069c:
                com.fb.fluid.services.b r0 = r1.f5245o
                com.fb.fluid.l.t.b r0 = r0.m7585K()
                com.fb.fluid.services.b r2 = r1.f5245o
                boolean r2 = r2.m7634p()
                java.lang.Boolean r2 = kotlin.p197u.p199i.p200a.C3328b.m12154a((boolean) r2)
                r0.mo6588a(r2)
                goto L_0x00c6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.C1802b.C1871v0.mo6618b(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.fb.fluid.services.b$w */
    static final class C1884w<T> implements C2827e<Throwable> {

        /* renamed from: a */
        public static final C1884w f5281a = new C1884w();

        C1884w() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C1776l.m7478a("error.2: " + th.getMessage(), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.services.b$w0 */
    static final class C1885w0 extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5282g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1885w0(C1802b bVar) {
            super(0);
            this.f5282g = bVar;
        }

        public final void invoke() {
            StringBuilder sb;
            String str;
            if (this.f5282g.m7654z().mo7495H()) {
                try {
                    this.f5282g.m7573E().mo6703h().performHapticFeedback(3, 2);
                } catch (Exception e) {
                    e = e;
                    sb = new StringBuilder();
                    str = "sm.phf.e: ";
                }
            } else {
                int m = this.f5282g.m7654z().mo7541m();
                if (m != 0) {
                    try {
                        Object systemService = this.f5282g.getBaseContext().getSystemService("vibrator");
                        if (systemService != null) {
                            Vibrator vibrator = (Vibrator) systemService;
                            long j = (long) ((((float) m) / 16.0f) * ((float) 80));
                            if (Build.VERSION.SDK_INT < 26 || !vibrator.hasAmplitudeControl()) {
                                vibrator.vibrate(new long[]{0, j}, -1);
                                return;
                            }
                            vibrator.vibrate(VibrationEffect.createOneShot(j, -1));
                            return;
                        }
                        throw new C3269p("null cannot be cast to non-null type android.os.Vibrator");
                    } catch (Exception e2) {
                        e = e2;
                        sb = new StringBuilder();
                        str = "sm.phf.e1: ";
                        sb.append(str);
                        sb.append(e.getMessage());
                        C1776l.m7478a(sb.toString(), (String) null, 1, (Object) null);
                    }
                }
            }
        }
    }

    /* renamed from: com.fb.fluid.services.b$x */
    static final class C1886x<T> implements C2827e<Object[]> {

        /* renamed from: a */
        final /* synthetic */ C1802b f5283a;

        C1886x(C1802b bVar) {
            this.f5283a = bVar;
        }

        /* renamed from: a */
        public final void accept(Object[] objArr) {
            C3370k.m12227b(objArr, "it");
            Integer num = objArr[3];
            if (!(num instanceof Integer)) {
                num = null;
            }
            Integer num2 = num;
            int i = 0;
            int intValue = num2 != null ? num2.intValue() : 0;
            Boolean bool = objArr[1];
            if (!(bool instanceof Boolean)) {
                bool = null;
            }
            Boolean bool2 = bool;
            boolean booleanValue = bool2 != null ? bool2.booleanValue() : false;
            Boolean bool3 = objArr[2];
            if (!(bool3 instanceof Boolean)) {
                bool3 = null;
            }
            Boolean bool4 = bool3;
            boolean booleanValue2 = bool4 != null ? bool4.booleanValue() : false;
            C1802b.f5122d0.mo6603a(!booleanValue);
            if (!booleanValue && !booleanValue2) {
                Integer num3 = objArr[0];
                if (!(num3 instanceof Integer)) {
                    num3 = null;
                }
                Integer num4 = num3;
                if (num4 != null) {
                    i = num4.intValue();
                }
            }
            this.f5283a.m7595a(i, intValue);
            if (((Number) this.f5283a.m7639s().mo6589b()).intValue() == 1 && !((Boolean) this.f5283a.m7575F().mo6589b()).booleanValue() && ((Boolean) this.f5283a.m7651y().mo6589b()).booleanValue()) {
                if (C1734c.f5038h.mo6477f() && C1783a.f5089a.mo6547j()) {
                    C1789d.C1790a aVar = C1789d.f5092a;
                    Context baseContext = this.f5283a.getBaseContext();
                    C3370k.m12223a((Object) baseContext, "baseContext");
                    aVar.mo6560a(baseContext, ((Boolean) this.f5283a.m7583J().mo6589b()).booleanValue());
                } else if (C1734c.f5038h.mo6477f() && C1783a.f5089a.mo6541d()) {
                    C1787c.C1788a aVar2 = C1787c.f5091a;
                    Context baseContext2 = this.f5283a.getBaseContext();
                    C3370k.m12223a((Object) baseContext2, "baseContext");
                    aVar2.mo6557a(baseContext2, !((Boolean) this.f5283a.m7583J().mo6589b()).booleanValue() ? "0" : "1");
                } else if ((!C1734c.f5038h.mo6472a() && !C1783a.f5089a.mo6543f()) || this.f5283a.f5143U) {
                } else {
                    if (((Boolean) this.f5283a.m7583J().mo6589b()).booleanValue()) {
                        C1785b.C1786a aVar3 = C1785b.f5090a;
                        Context baseContext3 = this.f5283a.getBaseContext();
                        C3370k.m12223a((Object) baseContext3, "baseContext");
                        C1785b.C1786a.m7501a(aVar3, baseContext3, (String) null, 2, (Object) null);
                        return;
                    }
                    C1785b.C1786a aVar4 = C1785b.f5090a;
                    Context baseContext4 = this.f5283a.getBaseContext();
                    C3370k.m12223a((Object) baseContext4, "baseContext");
                    aVar4.mo6555c(baseContext4);
                }
            }
        }
    }

    /* renamed from: com.fb.fluid.services.b$x0 */
    static final class C1887x0 implements SharedPreferences.OnSharedPreferenceChangeListener {

        /* renamed from: a */
        final /* synthetic */ C1802b f5284a;

        C1887x0(C1802b bVar) {
            this.f5284a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x017e, code lost:
            r9 = java.lang.Boolean.valueOf(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x01cb, code lost:
            r8.mo6588a(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d8, code lost:
            r8 = com.p131fb.fluid.services.C1802b.m7631o(r7.f5284a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x01e8, code lost:
            if (com.p131fb.fluid.services.C1802b.m7642t(r7.f5284a).mo7492E() != false) goto L_0x01f6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x01f4, code lost:
            if (com.p131fb.fluid.services.C1802b.m7642t(r7.f5284a).mo7550r() == false) goto L_0x01f7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x01f6, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x01f7, code lost:
            r8.mo6660a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0230, code lost:
            r8 = com.p131fb.fluid.services.C1802b.m7566A(r7.f5284a);
            r9 = com.p131fb.fluid.services.C1802b.m7642t(r7.f5284a);
            com.p131fb.fluid.p135l.p139p.C1770f.m7462a((android.app.Service) r7.f5284a).mo6352f().mo6589b().booleanValue();
            r8.mo6714a(r9, false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSharedPreferenceChanged(android.content.SharedPreferences r8, java.lang.String r9) {
            /*
                r7 = this;
                if (r9 != 0) goto L_0x0004
                goto L_0x0253
            L_0x0004:
                int r8 = r9.hashCode()
                r0 = 0
                r1 = 1
                switch(r8) {
                    case -1877600290: goto L_0x0228;
                    case -1658453556: goto L_0x020d;
                    case -1191245906: goto L_0x0204;
                    case -1138388967: goto L_0x01fb;
                    case -792502836: goto L_0x01d0;
                    case -679088530: goto L_0x01b3;
                    case -418044057: goto L_0x01aa;
                    case -317411885: goto L_0x018d;
                    case -196438298: goto L_0x0183;
                    case -77305305: goto L_0x0166;
                    case 255877710: goto L_0x015c;
                    case 335363328: goto L_0x0152;
                    case 411840861: goto L_0x013b;
                    case 481884026: goto L_0x011e;
                    case 646662389: goto L_0x0100;
                    case 1134709517: goto L_0x00e3;
                    case 1159204700: goto L_0x00a8;
                    case 1568646271: goto L_0x007c;
                    case 1582383641: goto L_0x0050;
                    case 1873344663: goto L_0x0033;
                    case 1887605579: goto L_0x0019;
                    case 1924340486: goto L_0x000f;
                    default: goto L_0x000d;
                }
            L_0x000d:
                goto L_0x0253
            L_0x000f:
                java.lang.String r8 = "scale_vert"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                goto L_0x0230
            L_0x0019:
                java.lang.String r8 = "keyguard_softkeys_mode"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                com.fb.fluid.services.b r8 = r7.f5284a
                com.fb.fluid.l.t.b r8 = r8.m7651y()
                com.fb.fluid.services.b r9 = r7.f5284a
                com.fb.fluid.utils.preferences.h r9 = r9.m7654z()
                boolean r9 = r9.mo7556x()
                goto L_0x017e
            L_0x0033:
                java.lang.String r8 = "pause_in_installer"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                com.fb.fluid.services.b r8 = r7.f5284a
                com.fb.fluid.services.d.b r8 = r8.m7649x()
                com.fb.fluid.services.b r9 = r7.f5284a
                com.fb.fluid.utils.preferences.h r9 = r9.m7654z()
                boolean r9 = r9.mo7554v()
                r8.mo6669a((boolean) r9)
                goto L_0x0253
            L_0x0050:
                java.lang.String r8 = "rotate_actions"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                com.fb.fluid.services.b r8 = r7.f5284a
                com.fb.fluid.utils.preferences.h r8 = r8.m7654z()
                boolean r8 = r8.mo7558z()
                com.fb.fluid.services.b r9 = r7.f5284a
                java.util.List r9 = r9.f5166x
                java.util.Iterator r9 = r9.iterator()
            L_0x006c:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r9.next()
                com.fb.fluid.services.e.e r0 = (com.p131fb.fluid.services.p145e.C1937e) r0
                r0.mo6748b((boolean) r8)
                goto L_0x006c
            L_0x007c:
                java.lang.String r8 = "swipe_exit_immersive"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                com.fb.fluid.services.b r8 = r7.f5284a
                com.fb.fluid.utils.preferences.h r8 = r8.m7654z()
                boolean r8 = r8.mo7525g()
                com.fb.fluid.services.b r9 = r7.f5284a
                java.util.List r9 = r9.f5166x
                java.util.Iterator r9 = r9.iterator()
            L_0x0098:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r9.next()
                com.fb.fluid.services.e.e r0 = (com.p131fb.fluid.services.p145e.C1937e) r0
                r0.mo6749c((boolean) r8)
                goto L_0x0098
            L_0x00a8:
                java.lang.String r8 = "debug_window"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                com.fb.fluid.services.b r8 = r7.f5284a
                com.fb.fluid.utils.preferences.h r8 = r8.m7654z()
                long r8 = r8.mo7535k()
                com.fb.fluid.services.b r2 = r7.f5284a
                java.util.List r2 = r2.f5166x
                java.util.Iterator r2 = r2.iterator()
            L_0x00c4:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0253
                java.lang.Object r3 = r2.next()
                com.fb.fluid.services.e.e r3 = (com.p131fb.fluid.services.p145e.C1937e) r3
                com.fb.fluid.data.Trigger r4 = r3.mo6744C()
                long r4 = r4.mo6390h()
                int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r6 != 0) goto L_0x00de
                r4 = 1
                goto L_0x00df
            L_0x00de:
                r4 = 0
            L_0x00df:
                r3.mo6746a((boolean) r4)
                goto L_0x00c4
            L_0x00e3:
                java.lang.String r8 = "pause_selected_apps"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                com.fb.fluid.services.b r8 = r7.f5284a
                com.fb.fluid.services.d.b r8 = r8.m7649x()
                com.fb.fluid.services.b r9 = r7.f5284a
                com.fb.fluid.utils.preferences.h r9 = r9.m7654z()
                java.util.List r9 = r9.mo7557y()
                r8.mo6668a((java.util.List<java.lang.String>) r9)
                goto L_0x0253
            L_0x0100:
                java.lang.String r8 = "hide_navbar_mode"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                com.fb.fluid.services.b r8 = r7.f5284a
                com.fb.fluid.l.t.b r8 = r8.m7639s()
                com.fb.fluid.services.b r9 = r7.f5284a
                com.fb.fluid.utils.preferences.h r9 = r9.m7654z()
                int r9 = r9.mo7543n()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                goto L_0x01cb
            L_0x011e:
                java.lang.String r8 = "sound_feedback_level"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                com.fb.fluid.services.b r8 = r7.f5284a
                com.fb.fluid.l.g r8 = r8.m7567B()
                com.fb.fluid.services.b r9 = r7.f5284a
                com.fb.fluid.utils.preferences.h r9 = r9.m7654z()
                int r9 = r9.mo7494G()
                r8.mo6485a(r9)
                goto L_0x0253
            L_0x013b:
                java.lang.String r8 = "ignore_policy_control"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                com.fb.fluid.services.b r8 = r7.f5284a
                com.fb.fluid.utils.preferences.h r9 = r8.m7654z()
                boolean r9 = r9.mo7548p()
                r8.f5143U = r9
                goto L_0x0253
            L_0x0152:
                java.lang.String r8 = "show_outline"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                goto L_0x0230
            L_0x015c:
                java.lang.String r8 = "anim_sides"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                goto L_0x0230
            L_0x0166:
                java.lang.String r8 = "debug_triggers"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                com.fb.fluid.services.b r8 = r7.f5284a
                com.fb.fluid.l.t.b r8 = r8.m7635q()
                com.fb.fluid.services.b r9 = r7.f5284a
                com.fb.fluid.utils.preferences.h r9 = r9.m7654z()
                boolean r9 = r9.mo7534j()
            L_0x017e:
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
                goto L_0x01cb
            L_0x0183:
                java.lang.String r8 = "primary_color"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                goto L_0x0230
            L_0x018d:
                java.lang.String r8 = "pause_in_permissions"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                com.fb.fluid.services.b r8 = r7.f5284a
                com.fb.fluid.services.d.b r8 = r8.m7649x()
                com.fb.fluid.services.b r9 = r7.f5284a
                com.fb.fluid.utils.preferences.h r9 = r9.m7654z()
                boolean r9 = r9.mo7555w()
                r8.mo6671b((boolean) r9)
                goto L_0x0253
            L_0x01aa:
                java.lang.String r8 = "side_triggers_away_from_keyboard"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                goto L_0x01d8
            L_0x01b3:
                java.lang.String r8 = "navbar_line_apps"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                com.fb.fluid.services.b r8 = r7.f5284a
                com.fb.fluid.l.t.b r8 = r8.m7646v()
                com.fb.fluid.services.b r9 = r7.f5284a
                com.fb.fluid.utils.preferences.h r9 = r9.m7654z()
                java.util.List r9 = r9.mo7551s()
            L_0x01cb:
                r8.mo6588a(r9)
                goto L_0x0253
            L_0x01d0:
                java.lang.String r8 = "keyboard_softkeys_mode"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
            L_0x01d8:
                com.fb.fluid.services.b r8 = r7.f5284a
                com.fb.fluid.services.d.a r8 = r8.m7641t()
                com.fb.fluid.services.b r9 = r7.f5284a
                com.fb.fluid.utils.preferences.h r9 = r9.m7654z()
                boolean r9 = r9.mo7492E()
                if (r9 != 0) goto L_0x01f6
                com.fb.fluid.services.b r9 = r7.f5284a
                com.fb.fluid.utils.preferences.h r9 = r9.m7654z()
                boolean r9 = r9.mo7550r()
                if (r9 == 0) goto L_0x01f7
            L_0x01f6:
                r0 = 1
            L_0x01f7:
                r8.mo6660a((boolean) r0)
                goto L_0x0253
            L_0x01fb:
                java.lang.String r8 = "anim_bottom"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                goto L_0x0230
            L_0x0204:
                java.lang.String r8 = "accent_color"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                goto L_0x0230
            L_0x020d:
                java.lang.String r8 = "fluid_enabled"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
                com.fb.fluid.services.b r8 = r7.f5284a
                com.fb.fluid.l.t.b r8 = r8.m7575F()
                com.fb.fluid.services.b r9 = r7.f5284a
                com.fb.fluid.utils.preferences.h r9 = r9.m7654z()
                boolean r9 = r9.mo7498K()
                r9 = r9 ^ r1
                goto L_0x017e
            L_0x0228:
                java.lang.String r8 = "scale_hoz"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x0253
            L_0x0230:
                com.fb.fluid.services.b r8 = r7.f5284a
                com.fb.fluid.services.e.b r8 = r8.m7570C()
                com.fb.fluid.services.b r9 = r7.f5284a
                com.fb.fluid.utils.preferences.h r9 = r9.m7654z()
                com.fb.fluid.services.b r0 = r7.f5284a
                com.fb.fluid.App r0 = com.p131fb.fluid.p135l.p139p.C1770f.m7462a((android.app.Service) r0)
                com.fb.fluid.l.t.b r0 = r0.mo6352f()
                java.lang.Object r0 = r0.mo6589b()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                r0.booleanValue()
                r0 = 0
                r8.mo6714a((com.p131fb.fluid.utils.preferences.C2527h) r9, (boolean) r0)
            L_0x0253:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.C1802b.C1887x0.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
        }
    }

    /* renamed from: com.fb.fluid.services.b$y */
    static final class C1888y<T, R> implements C2828f<Object[], R> {

        /* renamed from: a */
        public static final C1888y f5285a = new C1888y();

        C1888y() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6044a(Object obj) {
            Object[] objArr = (Object[]) obj;
            mo6654a(objArr);
            return objArr;
        }

        /* renamed from: a */
        public final Object[] mo6654a(Object[] objArr) {
            C3370k.m12227b(objArr, "it");
            return objArr;
        }
    }

    /* renamed from: com.fb.fluid.services.b$y0 */
    static final class C1889y0 extends C3371l implements C3349a<C2527h> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5286g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1889y0(C1802b bVar) {
            super(0);
            this.f5286g = bVar;
        }

        public final C2527h invoke() {
            Context baseContext = this.f5286g.getBaseContext();
            C3370k.m12223a((Object) baseContext, "baseContext");
            return new C2527h(baseContext);
        }
    }

    /* renamed from: com.fb.fluid.services.b$z */
    static final class C1890z<T> implements C2827e<Throwable> {

        /* renamed from: a */
        public static final C1890z f5287a = new C1890z();

        C1890z() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C1776l.m7478a("error.6: " + th.getMessage(), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.services.b$z0 */
    static final class C1891z0 extends C3371l implements C3349a<C1798b<Integer>> {

        /* renamed from: g */
        final /* synthetic */ C1802b f5288g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1891z0(C1802b bVar) {
            super(0);
            this.f5288g = bVar;
        }

        public final C1798b<Integer> invoke() {
            return new C1798b<>(Integer.valueOf(this.f5288g.m7627m()));
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C1802b.class), "kodein", "getKodein()Lorg/kodein/di/Kodein;");
        C3384y.m12259a((C3379t) uVar);
        C3380u uVar2 = new C3380u(C3384y.m12254a(C1802b.class), "preferences", "getPreferences()Lcom/fb/fluid/utils/preferences/SharedPrefHelper;");
        C3384y.m12259a((C3379t) uVar2);
        C3380u uVar3 = new C3380u(C3384y.m12254a(C1802b.class), "activityManager", "getActivityManager()Landroid/app/ActivityManager;");
        C3384y.m12259a((C3379t) uVar3);
        C3380u uVar4 = new C3380u(C3384y.m12254a(C1802b.class), "windowManager", "getWindowManager()Landroid/view/WindowManager;");
        C3384y.m12259a((C3379t) uVar4);
        C3380u uVar5 = new C3380u(C3384y.m12254a(C1802b.class), "keyguardManager", "getKeyguardManager()Landroid/app/KeyguardManager;");
        C3384y.m12259a((C3379t) uVar5);
        C3380u uVar6 = new C3380u(C3384y.m12254a(C1802b.class), "displayManager", "getDisplayManager()Landroid/hardware/display/DisplayManager;");
        C3384y.m12259a((C3379t) uVar6);
        C3380u uVar7 = new C3380u(C3384y.m12254a(C1802b.class), "keyboardDetector", "getKeyboardDetector()Lcom/fb/fluid/services/utils/KeyboardDetectHelper;");
        C3384y.m12259a((C3379t) uVar7);
        C3380u uVar8 = new C3380u(C3384y.m12254a(C1802b.class), "packageHelper", "getPackageHelper()Lcom/fb/fluid/services/utils/PackageHelper;");
        C3384y.m12259a((C3379t) uVar8);
        C3380u uVar9 = new C3380u(C3384y.m12254a(C1802b.class), "windowCanvas", "getWindowCanvas()Lcom/fb/fluid/services/windows/WindowCanvas2;");
        C3384y.m12259a((C3379t) uVar9);
        C3380u uVar10 = new C3380u(C3384y.m12254a(C1802b.class), "windowSystem", "getWindowSystem()Lcom/fb/fluid/services/windows/WindowSystemEventsDetector;");
        C3384y.m12259a((C3379t) uVar10);
        C3380u uVar11 = new C3380u(C3384y.m12254a(C1802b.class), "sounds", "getSounds()Lcom/fb/fluid/utils/Sounds;");
        C3384y.m12259a((C3379t) uVar11);
        C3380u uVar12 = new C3380u(C3384y.m12254a(C1802b.class), "cache", "getCache()Lcom/fb/fluid/utils/icon/IconCache;");
        C3384y.m12259a((C3379t) uVar12);
        C3380u uVar13 = new C3380u(C3384y.m12254a(C1802b.class), "actionsPro", "getActionsPro()[I");
        C3384y.m12259a((C3379t) uVar13);
        C3380u uVar14 = new C3380u(C3384y.m12254a(C1802b.class), "navbarLineApps", "getNavbarLineApps()Lcom/fb/fluid/utils/rx/Variable;");
        C3384y.m12259a((C3379t) uVar14);
        C3380u uVar15 = new C3380u(C3384y.m12254a(C1802b.class), "navbarLineSize", "getNavbarLineSize()Lcom/fb/fluid/utils/rx/Variable;");
        C3384y.m12259a((C3379t) uVar15);
        C3380u uVar16 = new C3380u(C3384y.m12254a(C1802b.class), "debugTriggers", "getDebugTriggers()Lcom/fb/fluid/utils/rx/Variable;");
        C3384y.m12259a((C3379t) uVar16);
        C3380u uVar17 = new C3380u(C3384y.m12254a(C1802b.class), "pauseOnLockscreen", "getPauseOnLockscreen()Lcom/fb/fluid/utils/rx/Variable;");
        C3384y.m12259a((C3379t) uVar17);
        C3380u uVar18 = new C3380u(C3384y.m12254a(C1802b.class), "isAppDisabled", "isAppDisabled()Lcom/fb/fluid/utils/rx/Variable;");
        C3384y.m12259a((C3379t) uVar18);
        C3380u uVar19 = new C3380u(C3384y.m12254a(C1802b.class), "hideNavigationBar", "getHideNavigationBar()Lcom/fb/fluid/utils/rx/Variable;");
        C3384y.m12259a((C3379t) uVar19);
        C3380u uVar20 = new C3380u(C3384y.m12254a(C1802b.class), "rotation", "getRotation()Lcom/fb/fluid/utils/rx/Variable;");
        C3384y.m12259a((C3379t) uVar20);
        C3380u uVar21 = new C3380u(C3384y.m12254a(C1802b.class), "isScreenPinned", "isScreenPinned()Lcom/fb/fluid/utils/rx/Variable;");
        C3384y.m12259a((C3379t) uVar21);
        C3380u uVar22 = new C3380u(C3384y.m12254a(C1802b.class), "isScreenLocked", "isScreenLocked()Lcom/fb/fluid/utils/rx/Variable;");
        C3384y.m12259a((C3379t) uVar22);
        C3380u uVar23 = new C3380u(C3384y.m12254a(C1802b.class), "isPausedOnLockScreen", "isPausedOnLockScreen()Lio/reactivex/Observable;");
        C3384y.m12259a((C3379t) uVar23);
        C3380u uVar24 = new C3380u(C3384y.m12254a(C1802b.class), "isPausedInFullscreen", "isPausedInFullscreen()Lio/reactivex/Observable;");
        C3384y.m12259a((C3379t) uVar24);
        C3380u uVar25 = new C3380u(C3384y.m12254a(C1802b.class), "isServicePausedBase", "isServicePausedBase()Lio/reactivex/Observable;");
        C3384y.m12259a((C3379t) uVar25);
        C3380u uVar26 = new C3380u(C3384y.m12254a(C1802b.class), "isServicePausedNoKeyboard", "isServicePausedNoKeyboard()Lio/reactivex/Observable;");
        C3384y.m12259a((C3379t) uVar26);
        C3380u uVar27 = new C3380u(C3384y.m12254a(C1802b.class), "isServicePausedWithKeyboard", "isServicePausedWithKeyboard()Lio/reactivex/Observable;");
        C3384y.m12259a((C3379t) uVar27);
        C3380u uVar28 = new C3380u(C3384y.m12254a(C1802b.class), "isPausedVolDialogPie", "isPausedVolDialogPie()Lio/reactivex/Observable;");
        C3384y.m12259a((C3379t) uVar28);
        f5120b0 = new C3208i[]{uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15, uVar16, uVar17, uVar18, uVar19, uVar20, uVar21, uVar22, uVar23, uVar24, uVar25, uVar26, uVar27, uVar28};
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final C1798b<Integer> m7565A() {
        C3256e eVar = this.f5132J;
        C3208i iVar = f5120b0[19];
        return (C1798b) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final C1740g m7567B() {
        C3256e eVar = this.f5167y;
        C3208i iVar = f5120b0[10];
        return (C1740g) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final C1920b m7570C() {
        C3256e eVar = this.f5164v;
        C3208i iVar = f5120b0[8];
        return (C1920b) eVar.getValue();
    }

    /* renamed from: D */
    private final WindowManager m7571D() {
        C3256e eVar = this.f5153k;
        C3208i iVar = f5120b0[3];
        return (WindowManager) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final C1931d m7573E() {
        C3256e eVar = this.f5165w;
        C3208i iVar = f5120b0[9];
        return (C1931d) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final C1798b<Boolean> m7575F() {
        C3256e eVar = this.f5129G;
        C3208i iVar = f5120b0[17];
        return (C1798b) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final C2790h<Boolean> m7577G() {
        C3256e eVar = this.f5137O;
        C3208i iVar = f5120b0[23];
        return (C2790h) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public final C2790h<Boolean> m7580H() {
        C3256e eVar = this.f5136N;
        C3208i iVar = f5120b0[22];
        return (C2790h) eVar.getValue();
    }

    /* renamed from: I */
    private final C2790h<Boolean> m7582I() {
        C3256e eVar = this.f5141S;
        C3208i iVar = f5120b0[27];
        return (C2790h) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final C1798b<Boolean> m7583J() {
        C3256e eVar = this.f5134L;
        C3208i iVar = f5120b0[21];
        return (C1798b) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final C1798b<Boolean> m7585K() {
        C3256e eVar = this.f5133K;
        C3208i iVar = f5120b0[20];
        return (C1798b) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public final C2790h<Boolean> m7587L() {
        C3256e eVar = this.f5138P;
        C3208i iVar = f5120b0[24];
        return (C2790h) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public final C2790h<Boolean> m7589M() {
        C3256e eVar = this.f5139Q;
        C3208i iVar = f5120b0[25];
        return (C2790h) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public final C2790h<Boolean> m7591N() {
        C3256e eVar = this.f5140R;
        C3208i iVar = f5120b0[26];
        return (C2790h) eVar.getValue();
    }

    /* renamed from: O */
    private final void m7592O() {
        DataSubscription dataSubscription = this.f5162t;
        if (dataSubscription != null) {
            dataSubscription.cancel();
        }
        this.f5162t = C2521f.f6389b.mo7481a().boxFor(Trigger.class).query().equal(C1712e.f4970k, true).build().subscribe().mo9819on(AndroidScheduler.mainThread()).observer(new C1809b1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public final void m7593P() {
        C3499j1 unused = C3417e.m12335a(C3422f0.m12341a(C3536t0.m12776a()), (C3314f) null, (C3430h0) null, new C1819d1(this, (C3309c) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m7594a(int i) {
        ContentObserver contentObserver;
        int i2 = i;
        if (i2 == 2 && C1783a.f5089a.mo6545h() && C1734c.f5038h.mo6477f()) {
            this.f5159q = new C1805a1(this, new Handler());
            ContentObserver contentObserver2 = this.f5159q;
            if (contentObserver2 != null) {
                Context baseContext = getBaseContext();
                C3370k.m12223a((Object) baseContext, "baseContext");
                Uri uri = Settings.Global.CONTENT_URI;
                C3370k.m12223a((Object) uri, "android.provider.Settings.Global.CONTENT_URI");
                C1769e.m7459a(contentObserver2, baseContext, uri, false, 4, (Object) null);
            }
            C1738f.f5044c.mo6483a(0, 0, 0, 0, 0);
            this.f5135M.mo6588a(C3284j.m12070b((T[]) new Integer[]{0, 0, 0, 0}));
        } else if (i2 != 3 || !C1783a.f5089a.mo6541d() || !C1734c.f5038h.mo6477f()) {
            if (i2 == 1) {
                if (C1783a.f5089a.mo6545h()) {
                    if (!C1734c.f5038h.mo6477f()) {
                        C1791e.f5093a.mo6562a(this, false);
                    }
                    if (C1734c.f5038h.mo6477f()) {
                        C1791e.f5093a.mo6564c(this);
                    }
                    ContentObserver contentObserver3 = this.f5159q;
                    if (contentObserver3 != null) {
                        Context baseContext2 = getBaseContext();
                        C3370k.m12223a((Object) baseContext2, "baseContext");
                        C1769e.m7460a(contentObserver3, baseContext2);
                    }
                }
                if (C1783a.f5089a.mo6547j()) {
                    C1789d.f5092a.mo6560a(this, false);
                }
                if (C1783a.f5089a.mo6541d()) {
                    C1787c.C1788a aVar = C1787c.f5091a;
                    Context baseContext3 = getBaseContext();
                    C3370k.m12223a((Object) baseContext3, "baseContext");
                    aVar.mo6558b(baseContext3, "0");
                    C1787c.C1788a aVar2 = C1787c.f5091a;
                    Context baseContext4 = getBaseContext();
                    C3370k.m12223a((Object) baseContext4, "baseContext");
                    aVar2.mo6557a(baseContext4, "0");
                }
                if (!C1783a.f5089a.mo6545h() || (contentObserver = this.f5159q) == null) {
                    return;
                }
            } else if (!C1783a.f5089a.mo6545h() || (contentObserver = this.f5159q) == null) {
                return;
            }
            Context baseContext5 = getBaseContext();
            C3370k.m12223a((Object) baseContext5, "baseContext");
            C1769e.m7460a(contentObserver, baseContext5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m7595a(int i, int i2) {
        if (i == 1) {
            C1738f.C1739a aVar = C1738f.f5044c;
            Context baseContext = getBaseContext();
            C3370k.m12223a((Object) baseContext, "baseContext");
            List<Integer> a = C1738f.f5044c.mo6482a((aVar.mo6481a(baseContext, 0) * -1) + m7648w().mo6589b().intValue(), i2, m7654z().mo7552t());
            C1738f.f5044c.mo6483a(0, a.get(0).intValue(), a.get(1).intValue(), a.get(2).intValue(), a.get(3).intValue());
            this.f5135M.mo6588a(a);
        } else if (i == 2 && C1783a.f5089a.mo6545h() && C1734c.f5038h.mo6477f()) {
            C1791e.f5093a.mo6563b(this);
        } else if (i == 3 || i == 0) {
            if (C1783a.f5089a.mo6545h()) {
                C1791e.f5093a.mo6565d(this);
            }
            C1738f.f5044c.mo6483a(0, 0, 0, 0, 0);
            this.f5135M.mo6588a(C3284j.m12070b((T[]) new Integer[]{0, 0, 0, 0}));
            if (C1734c.f5038h.mo6472a() && !this.f5143U) {
                C1785b.C1786a aVar2 = C1785b.f5090a;
                Context baseContext2 = getBaseContext();
                C3370k.m12223a((Object) baseContext2, "baseContext");
                aVar2.mo6555c(baseContext2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m7596a(int i, String str, View view, int i2, int i3) {
        C3499j1 unused = C3417e.m12335a(C3422f0.m12341a(C3536t0.m12777b()), (C3314f) null, (C3430h0) null, new C1871v0(this, i, str, view, i2, i3, (C3309c) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m7606a(boolean z, boolean z2) {
        if (z2) {
            this.f5123A.mo6520a(new C1885w0(this));
        }
        if (z) {
            m7567B().mo6487c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m7620i() {
        f5121c0 = false;
        m7570C().mo6699d();
        m7573E().mo6699d();
        for (C1937e d : this.f5166x) {
            d.mo6699d();
        }
        BroadcastReceiver broadcastReceiver = this.f5163u;
        if (broadcastReceiver != null) {
            C1765b.m7442a(broadcastReceiver, this);
        }
        C2526g.m9417b(this.f5149a0, m7654z());
        this.f5161s.cancel();
        DataSubscription dataSubscription = this.f5162t;
        if (dataSubscription != null) {
            dataSubscription.cancel();
        }
        m7649x().mo6680k();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final int[] m7622j() {
        C3256e eVar = this.f5124B;
        C3208i iVar = f5120b0[12];
        return (int[]) eVar.getValue();
    }

    /* renamed from: k */
    private final ActivityManager m7623k() {
        C3256e eVar = this.f5152j;
        C3208i iVar = f5120b0[2];
        return (ActivityManager) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final C1757a m7625l() {
        C3256e eVar = this.f5168z;
        C3208i iVar = f5120b0[11];
        return (C1757a) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final int m7627m() {
        try {
            Display defaultDisplay = m7571D().getDefaultDisplay();
            if (defaultDisplay != null) {
                return defaultDisplay.getRotation();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final boolean m7630n() {
        try {
            return m7643u().isKeyguardLocked();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final boolean m7632o() {
        Display display;
        try {
            Display[] displays = m7637r().getDisplays();
            C3370k.m12223a((Object) displays, "displayManager.displays");
            int length = displays.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    display = null;
                    break;
                }
                display = displays[i];
                C3370k.m12223a((Object) display, "it");
                if (display.getState() != 2) {
                    break;
                }
                i++;
            }
            return display == null;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final boolean m7634p() {
        try {
            return Build.VERSION.SDK_INT >= 23 ? m7623k().getLockTaskModeState() != 0 : m7623k().isInLockTaskMode();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final C1798b<Boolean> m7635q() {
        C3256e eVar = this.f5127E;
        C3208i iVar = f5120b0[15];
        return (C1798b) eVar.getValue();
    }

    /* renamed from: r */
    private final DisplayManager m7637r() {
        C3256e eVar = this.f5155m;
        C3208i iVar = f5120b0[5];
        return (DisplayManager) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final C1798b<Integer> m7639s() {
        C3256e eVar = this.f5130H;
        C3208i iVar = f5120b0[18];
        return (C1798b) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final C1895a m7641t() {
        C3256e eVar = this.f5157o;
        C3208i iVar = f5120b0[6];
        return (C1895a) eVar.getValue();
    }

    /* renamed from: u */
    private final KeyguardManager m7643u() {
        C3256e eVar = this.f5154l;
        C3208i iVar = f5120b0[4];
        return (KeyguardManager) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final C1798b<List<String>> m7646v() {
        C3256e eVar = this.f5125C;
        C3208i iVar = f5120b0[13];
        return (C1798b) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final C1798b<Integer> m7648w() {
        C3256e eVar = this.f5126D;
        C3208i iVar = f5120b0[14];
        return (C1798b) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final C1899b m7649x() {
        C3256e eVar = this.f5158p;
        C3208i iVar = f5120b0[7];
        return (C1899b) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final C1798b<Boolean> m7651y() {
        C3256e eVar = this.f5128F;
        C3208i iVar = f5120b0[16];
        return (C1798b) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final C2527h m7654z() {
        C3256e eVar = this.f5151i;
        C3208i iVar = f5120b0[1];
        return (C2527h) eVar.getValue();
    }

    /* renamed from: c */
    public C3134v mo6349c() {
        return C3117n.C3118a.m11765b(this);
    }

    /* renamed from: d */
    public C3125q<?> mo6350d() {
        return C3117n.C3118a.m11764a(this);
    }

    /* renamed from: e */
    public C3059m mo6351e() {
        C3256e eVar = this.f5150h;
        C3208i iVar = f5120b0[0];
        return (C3059m) eVar.getValue();
    }

    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!m7583J().mo6589b().booleanValue()) {
            m7649x().mo6666a(accessibilityEvent);
        }
        if (!m7583J().mo6589b().booleanValue()) {
            if (!C3370k.m12225a((Object) accessibilityEvent != null ? accessibilityEvent.getPackageName() : null, (Object) C1793a.f5110q.mo6583p())) {
                return;
            }
        }
        m7593P();
    }

    public void onConfigurationChanged(Configuration configuration) {
        C3370k.m12227b(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        m7565A().mo6588a(Integer.valueOf(m7627m()));
    }

    public void onCreate() {
        super.onCreate();
        f5121c0 = true;
        C1899b x = m7649x();
        x.mo6669a(m7654z().mo7554v());
        x.mo6671b(m7654z().mo7555w());
        x.mo6668a(m7654z().mo7557y());
        m7641t().mo6660a(m7654z().mo7492E() || m7654z().mo7550r());
        C3499j1 unused = C3417e.m12335a(C3422f0.m12341a(C3536t0.m12777b()), (C3314f) null, (C3430h0) null, new C1847m0(this, (C3309c) null), 3, (Object) null);
        C2526g.m9416a(this.f5149a0, m7654z());
        Context baseContext = getBaseContext();
        C3370k.m12223a((Object) baseContext, "baseContext");
        this.f5163u = C1765b.m7443a(baseContext, new String[]{"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.USER_PRESENT"}, new C1850n0(this));
        m7592O();
        C2790h<Boolean> a = this.f5156n.mo6694a().mo8911a((C2827e<? super Throwable>) C1855o0.f5223a);
        C3370k.m12223a((Object) a, "userActivityHelper\n     ….0: ${it.message}\".ld() }");
        C1797a.m7557a(a, (C0490o) this).mo6030a(new C1859p0(this));
        C2790h<Boolean> a2 = m7580H().mo8901a().mo8907a(C2803a.m11054a()).mo8911a((C2827e<? super Throwable>) C1861q0.f5229a);
        C3370k.m12223a((Object) a2, "isPausedOnLockScreen\n   ….1: ${it.message}\".ld() }");
        C1797a.m7557a(a2, (C0490o) this).mo6030a(new C1863r0(this));
        C2790h a3 = C2790h.m10990a(C3284j.m12070b((T[]) new C2790h[]{m7639s().mo6587a().mo8901a(), m7591N().mo8901a(), m7582I().mo8901a(), m7565A().mo6587a().mo8901a(), this.f5131I.mo6587a(), m7648w().mo6587a().mo8901a()}), C1865s0.f5233a).mo8923b(C2964b.m11437b()).mo8907a(C2803a.m11054a()).mo8911a((C2827e<? super Throwable>) C1884w.f5281a);
        C3370k.m12223a((Object) a3, "Observable\n             ….2: ${it.message}\".ld() }");
        C1797a.m7557a(a3, (C0490o) this).mo6030a(new C1886x(this));
        C2790h a4 = C2790h.m10990a(C3284j.m12070b((T[]) new C2973a[]{m7575F().mo6587a(), m7639s().mo6587a()}), C1888y.f5285a).mo8923b(C2964b.m11437b()).mo8907a(C2803a.m11054a()).mo8911a((C2827e<? super Throwable>) C1890z.f5287a);
        C3370k.m12223a((Object) a4, "Observable\n             ….6: ${it.message}\".ld() }");
        C1797a.m7557a(a4, (C0490o) this).mo6030a(new C1804a0(this));
        C2790h<R> a5 = m7649x().mo6677h().mo6587a().mo8924b(C1808b0.f5174a).mo8901a().mo8923b(C2964b.m11437b()).mo8907a(C2803a.m11054a()).mo8911a((C2827e<? super Throwable>) C1815c0.f5179a);
        C3370k.m12223a((Object) a5, "packageHelper.volumeDial….4: ${it.message}\".ld() }");
        C1797a.m7557a(a5, (C0490o) this).mo6030a(new C1818d0(this));
        C2790h<ComponentName> a6 = m7649x().mo6665a().mo6587a().mo8901a().mo8923b(C2964b.m11437b()).mo8907a(C2803a.m11054a()).mo8911a((C2827e<? super Throwable>) C1821e0.f5187a);
        C3370k.m12223a((Object) a6, "packageHelper.activeApp.….9: ${it.message}\".ld() }");
        C1797a.m7557a(a6, (C0490o) this).mo6030a(new C1824f0(this));
        C2790h<Boolean> a7 = m7575F().mo6587a().mo8911a((C2827e<? super Throwable>) C1828g0.f5194a).mo8907a(C2803a.m11054a()).mo8901a().mo8909a((C2823a) new C1831h0(this));
        C3370k.m12223a((Object) a7, "isAppDisabled.observable…ION_0)\n\n                }");
        C1797a.m7557a(a7, (C0490o) this).mo6030a(new C1834i0(this));
        C2790h<Integer> a8 = m7565A().mo6587a().mo8901a().mo8923b(C2964b.m11437b()).mo8907a(C2803a.m11054a()).mo8911a((C2827e<? super Throwable>) C1838j0.f5204a);
        C3370k.m12223a((Object) a8, "rotation.observable\n    ….8: ${it.message}\".ld() }");
        C1797a.m7557a(a8, (C0490o) this).mo6030a(new C1843k0(this));
        C1920b C = m7570C();
        C.mo6714a(m7654z(), false);
        C2790h<Boolean> a9 = C.mo6707k().mo6587a().mo8901a().mo8911a((C2827e<? super Throwable>) C1845l0.f5211a);
        C3370k.m12223a((Object) a9, "isInWindowManager.observ….7: ${it.message}\".ld() }");
        C1797a.m7557a(a9, (C0490o) this).mo6030a(new C1868u(C, this));
        C1931d E = m7573E();
        E.mo6737a((C3349a<Unit>) new C1870v(this));
        C2810b b = m7587L().mo8920b(500, TimeUnit.MILLISECONDS).mo8901a().mo8907a(C2803a.m11054a()).mo8927b(E.mo6700e());
        C3370k.m12223a((Object) b, "isServicePausedBase\n    …nsumerWindowNotInManager)");
        C1797a.m7558a(b, E.mo6704i());
        C2810b b2 = this.f5135M.mo6587a().mo8901a().mo8907a(C2803a.m11054a()).mo8927b(E.mo6721o());
        C3370k.m12223a((Object) b2, "overscanValue.observable…bscribe(consumerOverscan)");
        C1797a.m7558a(b2, E.mo6704i());
    }

    public void onDestroy() {
        super.onDestroy();
        m7620i();
    }

    public void onInterrupt() {
    }

    /* access modifiers changed from: protected */
    public void onServiceConnected() {
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand = super.onStartCommand(intent, i, i2);
        boolean z = false;
        if (intent != null ? intent.getBooleanExtra("asjlasfka", false) : false) {
            m7592O();
        }
        if (intent != null) {
            z = intent.getBooleanExtra("update_ui", false);
        }
        if (z) {
            C1920b C = m7570C();
            C2527h z2 = m7654z();
            C1770f.m7462a((Service) this).mo6352f().mo6589b().booleanValue();
            C.mo6714a(z2, false);
        }
        return onStartCommand;
    }
}
