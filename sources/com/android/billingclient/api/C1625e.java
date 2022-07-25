package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.android.billingclient.api.C1660h;
import com.android.billingclient.api.C1668l;
import com.android.billingclient.api.C1677s;
import com.android.vending.billing.IInAppBillingService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import p054c.p074b.p075a.p076a.C1147a;
import p190io.objectbox.android.BuildConfig;

/* renamed from: com.android.billingclient.api.e */
class C1625e extends C1622d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f4756a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f4757b;

    /* renamed from: c */
    private final Handler f4758c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1619c f4759d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Context f4760e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final int f4761f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final int f4762g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public IInAppBillingService f4763h;

    /* renamed from: i */
    private C1651t f4764i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f4765j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f4766k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f4767l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f4768m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f4769n;

    /* renamed from: o */
    private final boolean f4770o;

    /* renamed from: p */
    private ExecutorService f4771p;

    /* renamed from: q */
    private final ResultReceiver f4772q;

    /* renamed from: com.android.billingclient.api.e$a */
    class C1626a implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ String f4773f;

        /* renamed from: g */
        final /* synthetic */ List f4774g;

        /* renamed from: h */
        final /* synthetic */ C1682u f4775h;

        /* renamed from: com.android.billingclient.api.e$a$a */
        class C1627a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C1677s.C1678a f4777f;

            C1627a(C1677s.C1678a aVar) {
                this.f4777f = aVar;
            }

            public void run() {
                C1682u uVar = C1626a.this.f4775h;
                C1660h.C1662b b = C1660h.m7124b();
                b.mo6280a(this.f4777f.mo6321b());
                b.mo6281a(this.f4777f.mo6320a());
                uVar.mo6328a(b.mo6282a(), this.f4777f.mo6322c());
            }
        }

        C1626a(String str, List list, C1682u uVar) {
            this.f4773f = str;
            this.f4774g = list;
            this.f4775h = uVar;
        }

        public Void call() {
            C1625e.this.m7066a((Runnable) new C1627a(C1625e.this.mo6232a(this.f4773f, (List<String>) this.f4774g)));
            return null;
        }
    }

    /* renamed from: com.android.billingclient.api.e$b */
    class C1628b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1682u f4779f;

        C1628b(C1625e eVar, C1682u uVar) {
            this.f4779f = uVar;
        }

        public void run() {
            this.f4779f.mo6328a(C1663i.f4873p, (List<C1677s>) null);
        }
    }

    /* renamed from: com.android.billingclient.api.e$c */
    class C1629c implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ C1664j f4780f;

        /* renamed from: g */
        final /* synthetic */ C1667k f4781g;

        C1629c(C1664j jVar, C1667k kVar) {
            this.f4780f = jVar;
            this.f4781g = kVar;
        }

        public Void call() {
            C1625e.this.m7071b(this.f4780f, this.f4781g);
            return null;
        }
    }

    /* renamed from: com.android.billingclient.api.e$d */
    class C1630d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1667k f4783f;

        C1630d(C1625e eVar, C1667k kVar) {
            this.f4783f = kVar;
        }

        public void run() {
            this.f4783f.mo6287a(C1663i.f4873p, (String) null);
        }
    }

    /* renamed from: com.android.billingclient.api.e$e */
    class C1631e implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ String f4784f;

        /* renamed from: g */
        final /* synthetic */ C1672o f4785g;

        /* renamed from: com.android.billingclient.api.e$e$a */
        class C1632a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C1655u f4787f;

            C1632a(C1655u uVar) {
                this.f4787f = uVar;
            }

            public void run() {
                C1631e.this.f4785g.mo6305a(this.f4787f.mo6264a(), this.f4787f.mo6265b());
            }
        }

        C1631e(String str, C1672o oVar) {
            this.f4784f = str;
            this.f4785g = oVar;
        }

        public Void call() {
            C1625e.this.m7066a((Runnable) new C1632a(C1625e.this.m7069b(this.f4784f)));
            return null;
        }
    }

    /* renamed from: com.android.billingclient.api.e$f */
    class C1633f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1672o f4789f;

        C1633f(C1625e eVar, C1672o oVar) {
            this.f4789f = oVar;
        }

        public void run() {
            this.f4789f.mo6305a(C1663i.f4873p, (List<C1671n>) null);
        }
    }

    /* renamed from: com.android.billingclient.api.e$g */
    class C1634g implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ C1674q f4790f;

        /* renamed from: g */
        final /* synthetic */ C1676r f4791g;

        /* renamed from: com.android.billingclient.api.e$g$a */
        class C1635a implements Runnable {
            C1635a() {
            }

            public void run() {
                C1634g.this.f4791g.mo6310a(C1663i.f4867j);
            }
        }

        /* renamed from: com.android.billingclient.api.e$g$b */
        class C1636b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C1660h f4794f;

            C1636b(C1660h hVar) {
                this.f4794f = hVar;
            }

            public void run() {
                C1634g.this.f4791g.mo6310a(this.f4794f);
            }
        }

        C1634g(C1674q qVar, C1676r rVar) {
            this.f4790f = qVar;
            this.f4791g = rVar;
        }

        public Void call() {
            try {
                Bundle a = C1625e.this.f4763h.mo6335a(6, C1625e.this.f4760e.getPackageName(), this.f4790f.mo6307a().mo6312b(), this.f4790f.mo6307a().mo6314d(), (String) null, C1147a.m5654a(this.f4790f.mo6307a().mo6317f(), C1625e.this.f4761f, C1625e.this.f4762g, C1625e.this.f4757b));
                C1660h.C1662b b = C1660h.m7124b();
                b.mo6280a(C1147a.m5661b(a, "BillingClient"));
                b.mo6281a(C1147a.m5658a(a, "BillingClient"));
                C1625e.this.m7066a((Runnable) new C1636b(b.mo6282a()));
                return null;
            } catch (Exception unused) {
                C1625e.this.m7066a((Runnable) new C1635a());
                return null;
            }
        }
    }

    /* renamed from: com.android.billingclient.api.e$h */
    class C1637h implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1676r f4796f;

        C1637h(C1625e eVar, C1676r rVar) {
            this.f4796f = rVar;
        }

        public void run() {
            this.f4796f.mo6310a(C1663i.f4873p);
        }
    }

    /* renamed from: com.android.billingclient.api.e$i */
    class C1638i implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ C1615a f4797f;

        /* renamed from: g */
        final /* synthetic */ C1618b f4798g;

        /* renamed from: com.android.billingclient.api.e$i$a */
        class C1639a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Exception f4800f;

            C1639a(Exception exc) {
                this.f4800f = exc;
            }

            public void run() {
                C1147a.m5664c("BillingClient", "Error acknowledge purchase; ex: " + this.f4800f);
                C1638i.this.f4798g.mo6212a(C1663i.f4872o);
            }
        }

        /* renamed from: com.android.billingclient.api.e$i$b */
        class C1640b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f4802f;

            /* renamed from: g */
            final /* synthetic */ String f4803g;

            C1640b(int i, String str) {
                this.f4802f = i;
                this.f4803g = str;
            }

            public void run() {
                C1618b bVar = C1638i.this.f4798g;
                C1660h.C1662b b = C1660h.m7124b();
                b.mo6280a(this.f4802f);
                b.mo6281a(this.f4803g);
                bVar.mo6212a(b.mo6282a());
            }
        }

        C1638i(C1615a aVar, C1618b bVar) {
            this.f4797f = aVar;
            this.f4798g = bVar;
        }

        public Void call() {
            try {
                Bundle a = C1625e.this.f4763h.mo6330a(9, C1625e.this.f4760e.getPackageName(), this.f4797f.mo6209b(), C1147a.m5651a(this.f4797f, C1625e.this.f4757b));
                C1625e.this.m7066a((Runnable) new C1640b(C1147a.m5661b(a, "BillingClient"), C1147a.m5658a(a, "BillingClient")));
                return null;
            } catch (Exception e) {
                C1625e.this.m7066a((Runnable) new C1639a(e));
                return null;
            }
        }
    }

    /* renamed from: com.android.billingclient.api.e$j */
    class C1641j implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1618b f4805f;

        C1641j(C1625e eVar, C1618b bVar) {
            this.f4805f = bVar;
        }

        public void run() {
            this.f4805f.mo6212a(C1663i.f4873p);
        }
    }

    /* renamed from: com.android.billingclient.api.e$k */
    class C1642k extends ResultReceiver {
        C1642k(Handler handler) {
            super(handler);
        }

        public void onReceiveResult(int i, Bundle bundle) {
            C1673p b = C1625e.this.f4759d.mo6214b();
            if (b == null) {
                C1147a.m5664c("BillingClient", "PurchasesUpdatedListener is null - no way to return the response.");
                return;
            }
            List<C1668l> a = C1147a.m5659a(bundle);
            C1660h.C1662b b2 = C1660h.m7124b();
            b2.mo6280a(i);
            b2.mo6281a(C1147a.m5658a(bundle, "BillingClient"));
            b.mo6306a(b2.mo6282a(), a);
        }
    }

    /* renamed from: com.android.billingclient.api.e$l */
    class C1643l implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Future f4807f;

        /* renamed from: g */
        final /* synthetic */ Runnable f4808g;

        C1643l(C1625e eVar, Future future, Runnable runnable) {
            this.f4807f = future;
            this.f4808g = runnable;
        }

        public void run() {
            if (!this.f4807f.isDone() && !this.f4807f.isCancelled()) {
                this.f4807f.cancel(true);
                C1147a.m5664c("BillingClient", "Async task is taking too long, cancel it!");
                Runnable runnable = this.f4808g;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    /* renamed from: com.android.billingclient.api.e$m */
    class C1644m implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1667k f4809f;

        /* renamed from: g */
        final /* synthetic */ C1660h f4810g;

        /* renamed from: h */
        final /* synthetic */ String f4811h;

        C1644m(C1625e eVar, C1667k kVar, C1660h hVar, String str) {
            this.f4809f = kVar;
            this.f4810g = hVar;
            this.f4811h = str;
        }

        public void run() {
            C1147a.m5663b("BillingClient", "Successfully consumed purchase.");
            this.f4809f.mo6287a(this.f4810g, this.f4811h);
        }
    }

    /* renamed from: com.android.billingclient.api.e$n */
    class C1645n implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f4812f;

        /* renamed from: g */
        final /* synthetic */ C1667k f4813g;

        /* renamed from: h */
        final /* synthetic */ C1660h f4814h;

        /* renamed from: i */
        final /* synthetic */ String f4815i;

        C1645n(C1625e eVar, int i, C1667k kVar, C1660h hVar, String str) {
            this.f4812f = i;
            this.f4813g = kVar;
            this.f4814h = hVar;
            this.f4815i = str;
        }

        public void run() {
            C1147a.m5664c("BillingClient", "Error consuming purchase with token. Response code: " + this.f4812f);
            this.f4813g.mo6287a(this.f4814h, this.f4815i);
        }
    }

    /* renamed from: com.android.billingclient.api.e$o */
    class C1646o implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Exception f4816f;

        /* renamed from: g */
        final /* synthetic */ C1667k f4817g;

        /* renamed from: h */
        final /* synthetic */ String f4818h;

        C1646o(C1625e eVar, Exception exc, C1667k kVar, String str) {
            this.f4816f = exc;
            this.f4817g = kVar;
            this.f4818h = str;
        }

        public void run() {
            C1147a.m5664c("BillingClient", "Error consuming purchase; ex: " + this.f4816f);
            this.f4817g.mo6287a(C1663i.f4872o, this.f4818h);
        }
    }

    /* renamed from: com.android.billingclient.api.e$p */
    class C1647p implements Callable<Bundle> {

        /* renamed from: f */
        final /* synthetic */ int f4819f;

        /* renamed from: g */
        final /* synthetic */ String f4820g;

        /* renamed from: h */
        final /* synthetic */ String f4821h;

        /* renamed from: i */
        final /* synthetic */ Bundle f4822i;

        C1647p(int i, String str, String str2, Bundle bundle) {
            this.f4819f = i;
            this.f4820g = str;
            this.f4821h = str2;
            this.f4822i = bundle;
        }

        public Bundle call() {
            return C1625e.this.f4763h.mo6335a(this.f4819f, C1625e.this.f4760e.getPackageName(), this.f4820g, this.f4821h, (String) null, this.f4822i);
        }
    }

    /* renamed from: com.android.billingclient.api.e$q */
    class C1648q implements Callable<Bundle> {

        /* renamed from: f */
        final /* synthetic */ C1657g f4824f;

        /* renamed from: g */
        final /* synthetic */ String f4825g;

        C1648q(C1657g gVar, String str) {
            this.f4824f = gVar;
            this.f4825g = str;
        }

        public Bundle call() {
            return C1625e.this.f4763h.mo6336a(5, C1625e.this.f4760e.getPackageName(), (List<String>) Arrays.asList(new String[]{this.f4824f.mo6270c()}), this.f4825g, "subs", (String) null);
        }
    }

    /* renamed from: com.android.billingclient.api.e$r */
    class C1649r implements Callable<Bundle> {

        /* renamed from: f */
        final /* synthetic */ String f4827f;

        /* renamed from: g */
        final /* synthetic */ String f4828g;

        C1649r(String str, String str2) {
            this.f4827f = str;
            this.f4828g = str2;
        }

        public Bundle call() {
            return C1625e.this.f4763h.mo6334a(3, C1625e.this.f4760e.getPackageName(), this.f4827f, this.f4828g, (String) null);
        }
    }

    /* renamed from: com.android.billingclient.api.e$s */
    class C1650s implements Callable<C1668l.C1669a> {

        /* renamed from: f */
        final /* synthetic */ String f4830f;

        C1650s(String str) {
            this.f4830f = str;
        }

        public C1668l.C1669a call() {
            return C1625e.this.m7075c(this.f4830f);
        }
    }

    /* renamed from: com.android.billingclient.api.e$t */
    private final class C1651t implements ServiceConnection {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Object f4832a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f4833b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C1656f f4834c;

        /* renamed from: com.android.billingclient.api.e$t$a */
        class C1652a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C1660h f4836f;

            C1652a(C1660h hVar) {
                this.f4836f = hVar;
            }

            public void run() {
                synchronized (C1651t.this.f4832a) {
                    if (C1651t.this.f4834c != null) {
                        C1651t.this.f4834c.mo6267a(this.f4836f);
                    }
                }
            }
        }

        /* renamed from: com.android.billingclient.api.e$t$b */
        class C1653b implements Callable<Void> {
            C1653b() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
                r3 = com.android.billingclient.api.C1625e.m7073c(r10.f4838f.f4835d).getPackageName();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
                r5 = 9;
                r6 = 3;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
                if (r5 < 3) goto L_0x003c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
                r6 = com.android.billingclient.api.C1625e.m7079e(r10.f4838f.f4835d).mo6329a(r5, r3, "subs");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
                if (r6 != 0) goto L_0x0039;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
                r5 = r5 - 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
                r5 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
                r7 = r10.f4838f.f4835d;
                r9 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
                if (r5 < 5) goto L_0x0047;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
                r8 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
                r8 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
                com.android.billingclient.api.C1625e.m7067a(r7, r8);
                r7 = r10.f4838f.f4835d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
                if (r5 < 3) goto L_0x0053;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
                r8 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
                r8 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
                com.android.billingclient.api.C1625e.m7072b(r7, r8);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
                if (r5 >= 3) goto L_0x0060;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
                p054c.p074b.p075a.p076a.C1147a.m5663b("BillingClient", "In-app billing API does not support subscription on this device.");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
                r5 = 9;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
                if (r5 < 3) goto L_0x0078;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
                r6 = com.android.billingclient.api.C1625e.m7079e(r10.f4838f.f4835d).mo6329a(r5, r3, "inapp");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
                if (r6 != 0) goto L_0x0075;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
                r5 = r5 - 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
                r5 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:37:0x0079, code lost:
                r3 = r10.f4838f.f4835d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
                if (r5 < 9) goto L_0x0081;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
                r4 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x0081, code lost:
                r4 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x0082, code lost:
                com.android.billingclient.api.C1625e.m7076c(r3, r4);
                r3 = r10.f4838f.f4835d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x008b, code lost:
                if (r5 < 8) goto L_0x008f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:43:0x008d, code lost:
                r4 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:44:0x008f, code lost:
                r4 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x0090, code lost:
                com.android.billingclient.api.C1625e.m7078d(r3, r4);
                r3 = r10.f4838f.f4835d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:46:0x0098, code lost:
                if (r5 < 6) goto L_0x009b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x009b, code lost:
                r9 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:49:0x009c, code lost:
                com.android.billingclient.api.C1625e.m7080e(r3, r9);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:50:0x009f, code lost:
                if (r5 >= 3) goto L_0x00a8;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a1, code lost:
                p054c.p074b.p075a.p076a.C1147a.m5664c("BillingClient", "In-app billing API version 3 is not supported on this device.");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a8, code lost:
                if (r6 != 0) goto L_0x00b3;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:53:0x00aa, code lost:
                com.android.billingclient.api.C1625e.m7057a(r10.f4838f.f4835d, 2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b3, code lost:
                com.android.billingclient.api.C1625e.m7057a(r10.f4838f.f4835d, 0);
                com.android.billingclient.api.C1625e.m7061a(r10.f4838f.f4835d, (com.android.vending.billing.IInAppBillingService) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c2, code lost:
                r6 = 3;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c3, code lost:
                p054c.p074b.p075a.p076a.C1147a.m5664c("BillingClient", "Exception while checking if billing is supported; try to reconnect");
                com.android.billingclient.api.C1625e.m7057a(r10.f4838f.f4835d, 0);
                com.android.billingclient.api.C1625e.m7061a(r10.f4838f.f4835d, (com.android.vending.billing.IInAppBillingService) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d8, code lost:
                r0 = r10.f4838f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:60:0x00da, code lost:
                if (r6 != 0) goto L_0x00df;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:61:0x00dc, code lost:
                r1 = com.android.billingclient.api.C1663i.f4871n;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:62:0x00df, code lost:
                r1 = com.android.billingclient.api.C1663i.f4858a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e1, code lost:
                com.android.billingclient.api.C1625e.C1651t.m7095a(r0, r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e4, code lost:
                return null;
             */
            /* JADX WARNING: Removed duplicated region for block: B:61:0x00dc  */
            /* JADX WARNING: Removed duplicated region for block: B:62:0x00df  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Void call() {
                /*
                    r10 = this;
                    com.android.billingclient.api.e$t r0 = com.android.billingclient.api.C1625e.C1651t.this
                    java.lang.Object r0 = r0.f4832a
                    monitor-enter(r0)
                    com.android.billingclient.api.e$t r1 = com.android.billingclient.api.C1625e.C1651t.this     // Catch:{ all -> 0x00e5 }
                    boolean r1 = r1.f4833b     // Catch:{ all -> 0x00e5 }
                    r2 = 0
                    if (r1 == 0) goto L_0x0012
                    monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
                    return r2
                L_0x0012:
                    monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
                    r0 = 3
                    r1 = 0
                    com.android.billingclient.api.e$t r3 = com.android.billingclient.api.C1625e.C1651t.this     // Catch:{ Exception -> 0x00c2 }
                    com.android.billingclient.api.e r3 = com.android.billingclient.api.C1625e.this     // Catch:{ Exception -> 0x00c2 }
                    android.content.Context r3 = r3.f4760e     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r3 = r3.getPackageName()     // Catch:{ Exception -> 0x00c2 }
                    r4 = 9
                    r5 = 9
                    r6 = 3
                L_0x0026:
                    if (r5 < r0) goto L_0x003c
                    com.android.billingclient.api.e$t r7 = com.android.billingclient.api.C1625e.C1651t.this     // Catch:{ Exception -> 0x00c3 }
                    com.android.billingclient.api.e r7 = com.android.billingclient.api.C1625e.this     // Catch:{ Exception -> 0x00c3 }
                    com.android.vending.billing.IInAppBillingService r7 = r7.f4763h     // Catch:{ Exception -> 0x00c3 }
                    java.lang.String r8 = "subs"
                    int r6 = r7.mo6329a(r5, r3, r8)     // Catch:{ Exception -> 0x00c3 }
                    if (r6 != 0) goto L_0x0039
                    goto L_0x003d
                L_0x0039:
                    int r5 = r5 + -1
                    goto L_0x0026
                L_0x003c:
                    r5 = 0
                L_0x003d:
                    com.android.billingclient.api.e$t r7 = com.android.billingclient.api.C1625e.C1651t.this     // Catch:{ Exception -> 0x00c3 }
                    com.android.billingclient.api.e r7 = com.android.billingclient.api.C1625e.this     // Catch:{ Exception -> 0x00c3 }
                    r8 = 5
                    r9 = 1
                    if (r5 < r8) goto L_0x0047
                    r8 = 1
                    goto L_0x0048
                L_0x0047:
                    r8 = 0
                L_0x0048:
                    boolean unused = r7.f4766k = r8     // Catch:{ Exception -> 0x00c3 }
                    com.android.billingclient.api.e$t r7 = com.android.billingclient.api.C1625e.C1651t.this     // Catch:{ Exception -> 0x00c3 }
                    com.android.billingclient.api.e r7 = com.android.billingclient.api.C1625e.this     // Catch:{ Exception -> 0x00c3 }
                    if (r5 < r0) goto L_0x0053
                    r8 = 1
                    goto L_0x0054
                L_0x0053:
                    r8 = 0
                L_0x0054:
                    boolean unused = r7.f4765j = r8     // Catch:{ Exception -> 0x00c3 }
                    if (r5 >= r0) goto L_0x0060
                    java.lang.String r5 = "BillingClient"
                    java.lang.String r7 = "In-app billing API does not support subscription on this device."
                    p054c.p074b.p075a.p076a.C1147a.m5663b((java.lang.String) r5, (java.lang.String) r7)     // Catch:{ Exception -> 0x00c3 }
                L_0x0060:
                    r5 = 9
                L_0x0062:
                    if (r5 < r0) goto L_0x0078
                    com.android.billingclient.api.e$t r7 = com.android.billingclient.api.C1625e.C1651t.this     // Catch:{ Exception -> 0x00c3 }
                    com.android.billingclient.api.e r7 = com.android.billingclient.api.C1625e.this     // Catch:{ Exception -> 0x00c3 }
                    com.android.vending.billing.IInAppBillingService r7 = r7.f4763h     // Catch:{ Exception -> 0x00c3 }
                    java.lang.String r8 = "inapp"
                    int r6 = r7.mo6329a(r5, r3, r8)     // Catch:{ Exception -> 0x00c3 }
                    if (r6 != 0) goto L_0x0075
                    goto L_0x0079
                L_0x0075:
                    int r5 = r5 + -1
                    goto L_0x0062
                L_0x0078:
                    r5 = 0
                L_0x0079:
                    com.android.billingclient.api.e$t r3 = com.android.billingclient.api.C1625e.C1651t.this     // Catch:{ Exception -> 0x00c3 }
                    com.android.billingclient.api.e r3 = com.android.billingclient.api.C1625e.this     // Catch:{ Exception -> 0x00c3 }
                    if (r5 < r4) goto L_0x0081
                    r4 = 1
                    goto L_0x0082
                L_0x0081:
                    r4 = 0
                L_0x0082:
                    boolean unused = r3.f4769n = r4     // Catch:{ Exception -> 0x00c3 }
                    com.android.billingclient.api.e$t r3 = com.android.billingclient.api.C1625e.C1651t.this     // Catch:{ Exception -> 0x00c3 }
                    com.android.billingclient.api.e r3 = com.android.billingclient.api.C1625e.this     // Catch:{ Exception -> 0x00c3 }
                    r4 = 8
                    if (r5 < r4) goto L_0x008f
                    r4 = 1
                    goto L_0x0090
                L_0x008f:
                    r4 = 0
                L_0x0090:
                    boolean unused = r3.f4768m = r4     // Catch:{ Exception -> 0x00c3 }
                    com.android.billingclient.api.e$t r3 = com.android.billingclient.api.C1625e.C1651t.this     // Catch:{ Exception -> 0x00c3 }
                    com.android.billingclient.api.e r3 = com.android.billingclient.api.C1625e.this     // Catch:{ Exception -> 0x00c3 }
                    r4 = 6
                    if (r5 < r4) goto L_0x009b
                    goto L_0x009c
                L_0x009b:
                    r9 = 0
                L_0x009c:
                    boolean unused = r3.f4767l = r9     // Catch:{ Exception -> 0x00c3 }
                    if (r5 >= r0) goto L_0x00a8
                    java.lang.String r0 = "BillingClient"
                    java.lang.String r3 = "In-app billing API version 3 is not supported on this device."
                    p054c.p074b.p075a.p076a.C1147a.m5664c(r0, r3)     // Catch:{ Exception -> 0x00c3 }
                L_0x00a8:
                    if (r6 != 0) goto L_0x00b3
                    com.android.billingclient.api.e$t r0 = com.android.billingclient.api.C1625e.C1651t.this     // Catch:{ Exception -> 0x00c3 }
                    com.android.billingclient.api.e r0 = com.android.billingclient.api.C1625e.this     // Catch:{ Exception -> 0x00c3 }
                    r3 = 2
                    int unused = r0.f4756a = r3     // Catch:{ Exception -> 0x00c3 }
                    goto L_0x00d8
                L_0x00b3:
                    com.android.billingclient.api.e$t r0 = com.android.billingclient.api.C1625e.C1651t.this     // Catch:{ Exception -> 0x00c3 }
                    com.android.billingclient.api.e r0 = com.android.billingclient.api.C1625e.this     // Catch:{ Exception -> 0x00c3 }
                    int unused = r0.f4756a = r1     // Catch:{ Exception -> 0x00c3 }
                    com.android.billingclient.api.e$t r0 = com.android.billingclient.api.C1625e.C1651t.this     // Catch:{ Exception -> 0x00c3 }
                    com.android.billingclient.api.e r0 = com.android.billingclient.api.C1625e.this     // Catch:{ Exception -> 0x00c3 }
                    com.android.vending.billing.IInAppBillingService unused = r0.f4763h = r2     // Catch:{ Exception -> 0x00c3 }
                    goto L_0x00d8
                L_0x00c2:
                    r6 = 3
                L_0x00c3:
                    java.lang.String r0 = "BillingClient"
                    java.lang.String r3 = "Exception while checking if billing is supported; try to reconnect"
                    p054c.p074b.p075a.p076a.C1147a.m5664c(r0, r3)
                    com.android.billingclient.api.e$t r0 = com.android.billingclient.api.C1625e.C1651t.this
                    com.android.billingclient.api.e r0 = com.android.billingclient.api.C1625e.this
                    int unused = r0.f4756a = r1
                    com.android.billingclient.api.e$t r0 = com.android.billingclient.api.C1625e.C1651t.this
                    com.android.billingclient.api.e r0 = com.android.billingclient.api.C1625e.this
                    com.android.vending.billing.IInAppBillingService unused = r0.f4763h = r2
                L_0x00d8:
                    com.android.billingclient.api.e$t r0 = com.android.billingclient.api.C1625e.C1651t.this
                    if (r6 != 0) goto L_0x00df
                    com.android.billingclient.api.h r1 = com.android.billingclient.api.C1663i.f4871n
                    goto L_0x00e1
                L_0x00df:
                    com.android.billingclient.api.h r1 = com.android.billingclient.api.C1663i.f4858a
                L_0x00e1:
                    r0.m7096a((com.android.billingclient.api.C1660h) r1)
                    return r2
                L_0x00e5:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C1625e.C1651t.C1653b.call():java.lang.Void");
            }
        }

        /* renamed from: com.android.billingclient.api.e$t$c */
        class C1654c implements Runnable {
            C1654c() {
            }

            public void run() {
                int unused = C1625e.this.f4756a = 0;
                IInAppBillingService unused2 = C1625e.this.f4763h = null;
                C1651t.this.m7096a(C1663i.f4873p);
            }
        }

        private C1651t(C1656f fVar) {
            this.f4832a = new Object();
            this.f4833b = false;
            this.f4834c = fVar;
        }

        /* synthetic */ C1651t(C1625e eVar, C1656f fVar, C1642k kVar) {
            this(fVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m7096a(C1660h hVar) {
            C1625e.this.m7066a((Runnable) new C1652a(hVar));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6258a() {
            synchronized (this.f4832a) {
                this.f4834c = null;
                this.f4833b = true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1147a.m5663b("BillingClient", "Billing service connected.");
            IInAppBillingService unused = C1625e.this.f4763h = IInAppBillingService.Stub.m7189a(iBinder);
            if (C1625e.this.m7063a(new C1653b(), 30000, (Runnable) new C1654c()) == null) {
                m7096a(C1625e.this.m7074c());
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C1147a.m5664c("BillingClient", "Billing service disconnected.");
            IInAppBillingService unused = C1625e.this.f4763h = null;
            int unused2 = C1625e.this.f4756a = 0;
            synchronized (this.f4832a) {
                if (this.f4834c != null) {
                    this.f4834c.mo6266a();
                }
            }
        }
    }

    /* renamed from: com.android.billingclient.api.e$u */
    private static class C1655u {

        /* renamed from: a */
        private List<C1671n> f4840a;

        /* renamed from: b */
        private C1660h f4841b;

        C1655u(C1660h hVar, List<C1671n> list) {
            this.f4840a = list;
            this.f4841b = hVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1660h mo6264a() {
            return this.f4841b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public List<C1671n> mo6265b() {
            return this.f4840a;
        }
    }

    C1625e(Context context, int i, int i2, boolean z, C1673p pVar) {
        this(context, i, i2, z, pVar, "2.0.1");
    }

    private C1625e(Context context, int i, int i2, boolean z, C1673p pVar, String str) {
        this.f4756a = 0;
        this.f4758c = new Handler(Looper.getMainLooper());
        this.f4772q = new C1642k(this.f4758c);
        this.f4760e = context.getApplicationContext();
        this.f4761f = i;
        this.f4762g = i2;
        this.f4770o = z;
        this.f4759d = new C1619c(this.f4760e, pVar);
        this.f4757b = str;
    }

    /* renamed from: a */
    private C1660h m7059a(C1660h hVar) {
        this.f4759d.mo6214b().mo6306a(hVar, (List<C1668l>) null);
        return hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T> Future<T> m7063a(Callable<T> callable, long j, Runnable runnable) {
        long j2 = (long) (((double) j) * 0.95d);
        if (this.f4771p == null) {
            this.f4771p = Executors.newFixedThreadPool(C1147a.f3856a);
        }
        try {
            Future<T> submit = this.f4771p.submit(callable);
            this.f4758c.postDelayed(new C1643l(this, submit, runnable), j2);
            return submit;
        } catch (Exception e) {
            C1147a.m5664c("BillingClient", "Async task throws exception " + e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7066a(Runnable runnable) {
        if (!Thread.interrupted()) {
            this.f4758c.post(runnable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C1655u m7069b(String str) {
        C1147a.m5663b("BillingClient", "Querying purchase history, item type: " + str);
        ArrayList arrayList = new ArrayList();
        Bundle b = C1147a.m5662b(this.f4769n, this.f4770o, this.f4757b);
        String str2 = null;
        do {
            try {
                if (!this.f4767l) {
                    C1147a.m5664c("BillingClient", "getPurchaseHistory is not supported on current device");
                    return new C1655u(C1663i.f4865h, (List<C1671n>) null);
                }
                Bundle b2 = this.f4763h.mo6339b(6, this.f4760e.getPackageName(), str, str2, b);
                C1660h a = C1670m.m7145a(b2, "BillingClient", "getPurchaseHistory()");
                if (a != C1663i.f4871n) {
                    return new C1655u(a, (List<C1671n>) null);
                }
                ArrayList<String> stringArrayList = b2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = b2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = b2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i = 0;
                while (i < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    C1147a.m5663b("BillingClient", "Purchase record found for sku : " + stringArrayList.get(i));
                    try {
                        C1671n nVar = new C1671n(str3, str4);
                        if (TextUtils.isEmpty(nVar.mo6300b())) {
                            C1147a.m5664c("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(nVar);
                        i++;
                    } catch (JSONException e) {
                        C1147a.m5664c("BillingClient", "Got an exception trying to decode the purchase: " + e);
                        return new C1655u(C1663i.f4867j, (List<C1671n>) null);
                    }
                }
                str2 = b2.getString("INAPP_CONTINUATION_TOKEN");
                C1147a.m5663b("BillingClient", "Continuation token: " + str2);
            } catch (RemoteException e2) {
                C1147a.m5664c("BillingClient", "Got exception trying to get purchase history: " + e2 + "; try to reconnect");
                return new C1655u(C1663i.f4872o, (List<C1671n>) null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new C1655u(C1663i.f4871n, arrayList);
    }

    /* JADX WARNING: type inference failed for: r9v5, types: [com.android.billingclient.api.e$m] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m7071b(com.android.billingclient.api.C1664j r9, com.android.billingclient.api.C1667k r10) {
        /*
            r8 = this;
            java.lang.String r0 = "BillingClient"
            java.lang.String r7 = r9.mo6284b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0074 }
            r1.<init>()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r2 = "Consuming purchase with token: "
            r1.append(r2)     // Catch:{ Exception -> 0x0074 }
            r1.append(r7)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0074 }
            p054c.p074b.p075a.p076a.C1147a.m5663b((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x0074 }
            boolean r1 = r8.f4769n     // Catch:{ Exception -> 0x0074 }
            if (r1 == 0) goto L_0x0040
            com.android.vending.billing.IInAppBillingService r1 = r8.f4763h     // Catch:{ Exception -> 0x0074 }
            r2 = 9
            android.content.Context r3 = r8.f4760e     // Catch:{ Exception -> 0x0074 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Exception -> 0x0074 }
            boolean r4 = r8.f4769n     // Catch:{ Exception -> 0x0074 }
            java.lang.String r5 = r8.f4757b     // Catch:{ Exception -> 0x0074 }
            android.os.Bundle r9 = p054c.p074b.p075a.p076a.C1147a.m5653a((com.android.billingclient.api.C1664j) r9, (boolean) r4, (java.lang.String) r5)     // Catch:{ Exception -> 0x0074 }
            android.os.Bundle r9 = r1.mo6343d(r2, r3, r7, r9)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r1 = "RESPONSE_CODE"
            int r1 = r9.getInt(r1)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r9 = p054c.p074b.p075a.p076a.C1147a.m5658a((android.os.Bundle) r9, (java.lang.String) r0)     // Catch:{ Exception -> 0x0074 }
            r3 = r1
            goto L_0x0051
        L_0x0040:
            com.android.vending.billing.IInAppBillingService r9 = r8.f4763h     // Catch:{ Exception -> 0x0074 }
            r0 = 3
            android.content.Context r1 = r8.f4760e     // Catch:{ Exception -> 0x0074 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x0074 }
            int r9 = r9.mo6337b(r0, r1, r7)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r0 = ""
            r3 = r9
            r9 = r0
        L_0x0051:
            com.android.billingclient.api.h$b r0 = com.android.billingclient.api.C1660h.m7124b()     // Catch:{ Exception -> 0x0074 }
            r0.mo6280a((int) r3)     // Catch:{ Exception -> 0x0074 }
            r0.mo6281a((java.lang.String) r9)     // Catch:{ Exception -> 0x0074 }
            com.android.billingclient.api.h r5 = r0.mo6282a()     // Catch:{ Exception -> 0x0074 }
            if (r3 != 0) goto L_0x006a
            com.android.billingclient.api.e$m r9 = new com.android.billingclient.api.e$m     // Catch:{ Exception -> 0x0074 }
            r9.<init>(r8, r10, r5, r7)     // Catch:{ Exception -> 0x0074 }
        L_0x0066:
            r8.m7066a((java.lang.Runnable) r9)     // Catch:{ Exception -> 0x0074 }
            goto L_0x007d
        L_0x006a:
            com.android.billingclient.api.e$n r9 = new com.android.billingclient.api.e$n     // Catch:{ Exception -> 0x0074 }
            r1 = r9
            r2 = r8
            r4 = r10
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0066
        L_0x0074:
            r9 = move-exception
            com.android.billingclient.api.e$o r0 = new com.android.billingclient.api.e$o
            r0.<init>(r8, r9, r10, r7)
            r8.m7066a((java.lang.Runnable) r0)
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C1625e.m7071b(com.android.billingclient.api.j, com.android.billingclient.api.k):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C1660h m7074c() {
        int i = this.f4756a;
        return (i == 0 || i == 3) ? C1663i.f4872o : C1663i.f4867j;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C1668l.C1669a m7075c(String str) {
        C1147a.m5663b("BillingClient", "Querying owned items, item type: " + str);
        ArrayList arrayList = new ArrayList();
        Bundle b = C1147a.m5662b(this.f4769n, this.f4770o, this.f4757b);
        String str2 = null;
        do {
            try {
                Bundle a = this.f4769n ? this.f4763h.mo6333a(9, this.f4760e.getPackageName(), str, str2, b) : this.f4763h.mo6332a(3, this.f4760e.getPackageName(), str, str2);
                C1660h a2 = C1670m.m7145a(a, "BillingClient", "getPurchase()");
                if (a2 != C1663i.f4871n) {
                    return new C1668l.C1669a(a2, (List<C1668l>) null);
                }
                ArrayList<String> stringArrayList = a.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = a.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = a.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i = 0;
                while (i < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    C1147a.m5663b("BillingClient", "Sku is owned: " + stringArrayList.get(i));
                    try {
                        C1668l lVar = new C1668l(str3, str4);
                        if (TextUtils.isEmpty(lVar.mo6290c())) {
                            C1147a.m5664c("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(lVar);
                        i++;
                    } catch (JSONException e) {
                        C1147a.m5664c("BillingClient", "Got an exception trying to decode the purchase: " + e);
                        return new C1668l.C1669a(C1663i.f4867j, (List<C1668l>) null);
                    }
                }
                str2 = a.getString("INAPP_CONTINUATION_TOKEN");
                C1147a.m5663b("BillingClient", "Continuation token: " + str2);
            } catch (Exception e2) {
                C1147a.m5664c("BillingClient", "Got exception trying to get purchases: " + e2 + "; try to reconnect");
                return new C1668l.C1669a(C1663i.f4872o, (List<C1668l>) null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new C1668l.C1669a(C1663i.f4871n, arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: com.android.billingclient.api.e$r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: com.android.billingclient.api.e$p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.android.billingclient.api.e$p} */
    /* JADX WARNING: type inference failed for: r15v9, types: [java.util.concurrent.Callable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0123 A[Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0149 A[Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.android.billingclient.api.C1660h mo6219a(android.app.Activity r14, com.android.billingclient.api.C1657g r15) {
        /*
            r13 = this;
            java.lang.String r0 = "BUY_INTENT"
            java.lang.String r1 = "; try to reconnect"
            boolean r2 = r13.mo6228b()
            if (r2 != 0) goto L_0x0010
        L_0x000a:
            com.android.billingclient.api.h r14 = com.android.billingclient.api.C1663i.f4872o
        L_0x000c:
            r13.m7059a((com.android.billingclient.api.C1660h) r14)
            return r14
        L_0x0010:
            java.lang.String r6 = r15.mo6274g()
            java.lang.String r8 = r15.mo6272e()
            com.android.billingclient.api.s r2 = r15.mo6273f()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0028
            boolean r5 = r2.mo6315e()
            if (r5 == 0) goto L_0x0028
            r5 = 1
            goto L_0x0029
        L_0x0028:
            r5 = 0
        L_0x0029:
            java.lang.String r9 = "BillingClient"
            if (r8 != 0) goto L_0x0035
            java.lang.String r14 = "Please fix the input params. SKU can't be null."
            p054c.p074b.p075a.p076a.C1147a.m5664c(r9, r14)
            com.android.billingclient.api.h r14 = com.android.billingclient.api.C1663i.f4869l
            goto L_0x000c
        L_0x0035:
            if (r6 != 0) goto L_0x003f
            java.lang.String r14 = "Please fix the input params. SkuType can't be null."
            p054c.p074b.p075a.p076a.C1147a.m5664c(r9, r14)
            com.android.billingclient.api.h r14 = com.android.billingclient.api.C1663i.f4870m
            goto L_0x000c
        L_0x003f:
            java.lang.String r7 = "subs"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0053
            boolean r7 = r13.f4765j
            if (r7 != 0) goto L_0x0053
            java.lang.String r14 = "Current client doesn't support subscriptions."
            p054c.p074b.p075a.p076a.C1147a.m5664c(r9, r14)
            com.android.billingclient.api.h r14 = com.android.billingclient.api.C1663i.f4874q
            goto L_0x000c
        L_0x0053:
            java.lang.String r7 = r15.mo6270c()
            if (r7 == 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r3 = 0
        L_0x005b:
            if (r3 == 0) goto L_0x0069
            boolean r4 = r13.f4766k
            if (r4 != 0) goto L_0x0069
            java.lang.String r14 = "Current client doesn't support subscriptions update."
            p054c.p074b.p075a.p076a.C1147a.m5664c(r9, r14)
            com.android.billingclient.api.h r14 = com.android.billingclient.api.C1663i.f4875r
            goto L_0x000c
        L_0x0069:
            boolean r4 = r15.mo6276i()
            java.lang.String r7 = "Current client doesn't support extra params for buy intent."
            if (r4 == 0) goto L_0x007b
            boolean r4 = r13.f4767l
            if (r4 != 0) goto L_0x007b
        L_0x0075:
            p054c.p074b.p075a.p076a.C1147a.m5664c(r9, r7)
            com.android.billingclient.api.h r14 = com.android.billingclient.api.C1663i.f4864g
            goto L_0x000c
        L_0x007b:
            if (r5 == 0) goto L_0x0082
            boolean r4 = r13.f4767l
            if (r4 != 0) goto L_0x0082
            goto L_0x0075
        L_0x0082:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Constructing buy intent for "
            r4.append(r7)
            r4.append(r8)
            java.lang.String r7 = ", item type: "
            r4.append(r7)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            p054c.p074b.p075a.p076a.C1147a.m5663b((java.lang.String) r9, (java.lang.String) r4)
            boolean r4 = r13.f4767l
            r10 = 0
            r11 = 5000(0x1388, double:2.4703E-320)
            if (r4 == 0) goto L_0x00fc
            boolean r3 = r13.f4769n
            boolean r4 = r13.f4770o
            java.lang.String r7 = r13.f4757b
            android.os.Bundle r7 = p054c.p074b.p075a.p076a.C1147a.m5652a((com.android.billingclient.api.C1657g) r15, (boolean) r3, (boolean) r4, (java.lang.String) r7)
            java.lang.String r3 = r2.mo6313c()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x00c2
            java.lang.String r3 = r2.mo6313c()
            java.lang.String r4 = "skuDetailsToken"
            r7.putString(r4, r3)
        L_0x00c2:
            if (r5 == 0) goto L_0x00df
            java.lang.String r2 = r2.mo6317f()
            java.lang.String r3 = "rewardToken"
            r7.putString(r3, r2)
            int r2 = r13.f4761f
            if (r2 == 0) goto L_0x00d6
            java.lang.String r3 = "childDirected"
            r7.putInt(r3, r2)
        L_0x00d6:
            int r2 = r13.f4762g
            if (r2 == 0) goto L_0x00df
            java.lang.String r3 = "underAgeOfConsent"
            r7.putInt(r3, r2)
        L_0x00df:
            r2 = 6
            boolean r3 = r13.f4769n
            if (r3 == 0) goto L_0x00e9
            r15 = 9
            r4 = 9
            goto L_0x00f3
        L_0x00e9:
            boolean r15 = r15.mo6275h()
            if (r15 == 0) goto L_0x00f2
            r15 = 7
            r4 = 7
            goto L_0x00f3
        L_0x00f2:
            r4 = 6
        L_0x00f3:
            com.android.billingclient.api.e$p r15 = new com.android.billingclient.api.e$p
            r2 = r15
            r3 = r13
            r5 = r8
            r2.<init>(r4, r5, r6, r7)
            goto L_0x010d
        L_0x00fc:
            if (r3 == 0) goto L_0x0108
            com.android.billingclient.api.e$q r2 = new com.android.billingclient.api.e$q
            r2.<init>(r15, r8)
            java.util.concurrent.Future r15 = r13.m7063a(r2, (long) r11, (java.lang.Runnable) r10)
            goto L_0x0111
        L_0x0108:
            com.android.billingclient.api.e$r r15 = new com.android.billingclient.api.e$r
            r15.<init>(r8, r6)
        L_0x010d:
            java.util.concurrent.Future r15 = r13.m7063a(r15, (long) r11, (java.lang.Runnable) r10)
        L_0x0111:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            java.lang.Object r15 = r15.get(r11, r2)     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            android.os.Bundle r15 = (android.os.Bundle) r15     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            int r2 = p054c.p074b.p075a.p076a.C1147a.m5661b((android.os.Bundle) r15, (java.lang.String) r9)     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            java.lang.String r3 = p054c.p074b.p075a.p076a.C1147a.m5658a((android.os.Bundle) r15, (java.lang.String) r9)     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            if (r2 == 0) goto L_0x0149
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            r14.<init>()     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            java.lang.String r15 = "Unable to buy item, Error response code: "
            r14.append(r15)     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            r14.append(r2)     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            java.lang.String r14 = r14.toString()     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            p054c.p074b.p075a.p076a.C1147a.m5664c(r9, r14)     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            com.android.billingclient.api.h$b r14 = com.android.billingclient.api.C1660h.m7124b()     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            r14.mo6280a((int) r2)     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            r14.mo6281a((java.lang.String) r3)     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            com.android.billingclient.api.h r14 = r14.mo6282a()     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            r13.m7059a((com.android.billingclient.api.C1660h) r14)     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            return r14
        L_0x0149:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            java.lang.Class<com.android.billingclient.api.ProxyBillingActivity> r3 = com.android.billingclient.api.ProxyBillingActivity.class
            r2.<init>(r14, r3)     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            java.lang.String r3 = "result_receiver"
            android.os.ResultReceiver r4 = r13.f4772q     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            r2.putExtra(r3, r4)     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            android.os.Parcelable r15 = r15.getParcelable(r0)     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            android.app.PendingIntent r15 = (android.app.PendingIntent) r15     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            r2.putExtra(r0, r15)     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            r14.startActivity(r2)     // Catch:{ CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166 }
            com.android.billingclient.api.h r14 = com.android.billingclient.api.C1663i.f4871n
            return r14
        L_0x0166:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Exception while launching billing flow: ; for sku: "
            r14.append(r15)
            r14.append(r8)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            p054c.p074b.p075a.p076a.C1147a.m5664c(r9, r14)
            goto L_0x000a
        L_0x017f:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Time out while launching billing flow: ; for sku: "
            r14.append(r15)
            r14.append(r8)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            p054c.p074b.p075a.p076a.C1147a.m5664c(r9, r14)
            com.android.billingclient.api.h r14 = com.android.billingclient.api.C1663i.f4873p
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C1625e.mo6219a(android.app.Activity, com.android.billingclient.api.g):com.android.billingclient.api.h");
    }

    /* renamed from: a */
    public C1668l.C1669a mo6220a(String str) {
        if (!mo6228b()) {
            return new C1668l.C1669a(C1663i.f4872o, (List<C1668l>) null);
        }
        if (TextUtils.isEmpty(str)) {
            C1147a.m5664c("BillingClient", "Please provide a valid SKU type.");
            return new C1668l.C1669a(C1663i.f4863f, (List<C1668l>) null);
        }
        try {
            return (C1668l.C1669a) m7063a(new C1650s(str), 5000, (Runnable) null).get(5000, TimeUnit.MILLISECONDS);
        } catch (CancellationException | TimeoutException unused) {
            return new C1668l.C1669a(C1663i.f4873p, (List<C1668l>) null);
        } catch (Exception unused2) {
            return new C1668l.C1669a(C1663i.f4867j, (List<C1668l>) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1677s.C1678a mo6232a(String str, List<String> list) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 20;
            ArrayList arrayList2 = new ArrayList(list.subList(i, i2 > size ? size : i2));
            Bundle bundle2 = new Bundle();
            bundle2.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle2.putString("playBillingLibraryVersion", this.f4757b);
            try {
                if (this.f4769n) {
                    bundle = this.f4763h.mo6331a(9, this.f4760e.getPackageName(), str, bundle2, C1147a.m5655a(this.f4769n, this.f4770o, this.f4757b));
                    String str2 = str;
                } else {
                    bundle = this.f4763h.mo6341c(3, this.f4760e.getPackageName(), str, bundle2);
                }
                if (bundle == null) {
                    C1147a.m5664c("BillingClient", "querySkuDetailsAsync got null sku details list");
                    return new C1677s.C1678a(4, "Null sku details list", (List<C1677s>) null);
                } else if (!bundle.containsKey("DETAILS_LIST")) {
                    int b = C1147a.m5661b(bundle, "BillingClient");
                    String a = C1147a.m5658a(bundle, "BillingClient");
                    if (b != 0) {
                        C1147a.m5664c("BillingClient", "getSkuDetails() failed. Response code: " + b);
                        return new C1677s.C1678a(b, a, arrayList);
                    }
                    C1147a.m5664c("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                    return new C1677s.C1678a(6, a, arrayList);
                } else {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        C1147a.m5664c("BillingClient", "querySkuDetailsAsync got null response list");
                        return new C1677s.C1678a(4, "querySkuDetailsAsync got null response list", (List<C1677s>) null);
                    }
                    int i3 = 0;
                    while (i3 < stringArrayList.size()) {
                        try {
                            C1677s sVar = new C1677s(stringArrayList.get(i3));
                            C1147a.m5663b("BillingClient", "Got sku details: " + sVar);
                            arrayList.add(sVar);
                            i3++;
                        } catch (JSONException unused) {
                            C1147a.m5664c("BillingClient", "Got a JSON exception trying to decode SkuDetails.");
                            return new C1677s.C1678a(6, "Error trying to decode SkuDetails.", (List<C1677s>) null);
                        }
                    }
                    i = i2;
                }
            } catch (Exception e) {
                C1147a.m5664c("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect)." + e);
                return new C1677s.C1678a(-1, "Service connection is disconnected.", (List<C1677s>) null);
            }
        }
        return new C1677s.C1678a(0, BuildConfig.FLAVOR, arrayList);
    }

    /* renamed from: a */
    public void mo6221a() {
        try {
            this.f4759d.mo6213a();
            if (this.f4764i != null) {
                this.f4764i.mo6258a();
            }
            if (!(this.f4764i == null || this.f4763h == null)) {
                C1147a.m5663b("BillingClient", "Unbinding from service.");
                this.f4760e.unbindService(this.f4764i);
                this.f4764i = null;
            }
            this.f4763h = null;
            if (this.f4771p != null) {
                this.f4771p.shutdownNow();
                this.f4771p = null;
            }
        } catch (Exception e) {
            C1147a.m5664c("BillingClient", "There was an exception while ending connection: " + e);
        } catch (Throwable th) {
            this.f4756a = 3;
            throw th;
        }
        this.f4756a = 3;
    }

    /* renamed from: a */
    public void mo6222a(C1615a aVar, C1618b bVar) {
        C1660h hVar;
        if (!mo6228b()) {
            hVar = C1663i.f4872o;
        } else if (TextUtils.isEmpty(aVar.mo6209b())) {
            C1147a.m5664c("BillingClient", "Please provide a valid purchase token.");
            hVar = C1663i.f4866i;
        } else if (!this.f4769n) {
            hVar = C1663i.f4859b;
        } else if (m7063a(new C1638i(aVar, bVar), 30000, (Runnable) new C1641j(this, bVar)) == null) {
            bVar.mo6212a(m7074c());
            return;
        } else {
            return;
        }
        bVar.mo6212a(hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        r4 = r4.get(0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6223a(com.android.billingclient.api.C1656f r8) {
        /*
            r7 = this;
            boolean r0 = r7.mo6228b()
            java.lang.String r1 = "BillingClient"
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "Service connection is valid. No need to re-initialize."
            p054c.p074b.p075a.p076a.C1147a.m5663b((java.lang.String) r1, (java.lang.String) r0)
            com.android.billingclient.api.h r0 = com.android.billingclient.api.C1663i.f4871n
            r8.mo6267a(r0)
            return
        L_0x0013:
            int r0 = r7.f4756a
            r2 = 1
            if (r0 != r2) goto L_0x0023
            java.lang.String r0 = "Client is already in the process of connecting to billing service."
            p054c.p074b.p075a.p076a.C1147a.m5664c(r1, r0)
            com.android.billingclient.api.h r0 = com.android.billingclient.api.C1663i.f4861d
            r8.mo6267a(r0)
            return
        L_0x0023:
            r3 = 3
            if (r0 != r3) goto L_0x0031
            java.lang.String r0 = "Client was already closed and can't be reused. Please create another instance."
            p054c.p074b.p075a.p076a.C1147a.m5664c(r1, r0)
            com.android.billingclient.api.h r0 = com.android.billingclient.api.C1663i.f4872o
            r8.mo6267a(r0)
            return
        L_0x0031:
            r7.f4756a = r2
            com.android.billingclient.api.c r0 = r7.f4759d
            r0.mo6215c()
            java.lang.String r0 = "Starting in-app billing setup."
            p054c.p074b.p075a.p076a.C1147a.m5663b((java.lang.String) r1, (java.lang.String) r0)
            com.android.billingclient.api.e$t r0 = new com.android.billingclient.api.e$t
            r3 = 0
            r0.<init>(r7, r8, r3)
            r7.f4764i = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "com.android.vending.billing.InAppBillingService.BIND"
            r0.<init>(r3)
            java.lang.String r3 = "com.android.vending"
            r0.setPackage(r3)
            android.content.Context r4 = r7.f4760e
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r5 = 0
            java.util.List r4 = r4.queryIntentServices(r0, r5)
            if (r4 == 0) goto L_0x00a8
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L_0x00a8
            java.lang.Object r4 = r4.get(r5)
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ServiceInfo r6 = r4.serviceInfo
            if (r6 == 0) goto L_0x00a8
            java.lang.String r6 = r6.packageName
            android.content.pm.ServiceInfo r4 = r4.serviceInfo
            java.lang.String r4 = r4.name
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x00a3
            if (r4 == 0) goto L_0x00a3
            android.content.ComponentName r3 = new android.content.ComponentName
            r3.<init>(r6, r4)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0)
            r4.setComponent(r3)
            java.lang.String r0 = r7.f4757b
            java.lang.String r3 = "playBillingLibraryVersion"
            r4.putExtra(r3, r0)
            android.content.Context r0 = r7.f4760e
            com.android.billingclient.api.e$t r3 = r7.f4764i
            boolean r0 = r0.bindService(r4, r3, r2)
            if (r0 == 0) goto L_0x00a0
            java.lang.String r8 = "Service was bonded successfully."
            p054c.p074b.p075a.p076a.C1147a.m5663b((java.lang.String) r1, (java.lang.String) r8)
            return
        L_0x00a0:
            java.lang.String r0 = "Connection to Billing service is blocked."
            goto L_0x00a5
        L_0x00a3:
            java.lang.String r0 = "The device doesn't have valid Play Store."
        L_0x00a5:
            p054c.p074b.p075a.p076a.C1147a.m5664c(r1, r0)
        L_0x00a8:
            r7.f4756a = r5
            java.lang.String r0 = "Billing service unavailable on device."
            p054c.p074b.p075a.p076a.C1147a.m5663b((java.lang.String) r1, (java.lang.String) r0)
            com.android.billingclient.api.h r0 = com.android.billingclient.api.C1663i.f4860c
            r8.mo6267a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C1625e.mo6223a(com.android.billingclient.api.f):void");
    }

    /* renamed from: a */
    public void mo6224a(C1664j jVar, C1667k kVar) {
        if (!mo6228b()) {
            kVar.mo6287a(C1663i.f4872o, (String) null);
        } else if (m7063a(new C1629c(jVar, kVar), 30000, (Runnable) new C1630d(this, kVar)) == null) {
            kVar.mo6287a(m7074c(), (String) null);
        }
    }

    /* renamed from: a */
    public void mo6225a(C1674q qVar, C1676r rVar) {
        if (!this.f4767l) {
            rVar.mo6310a(C1663i.f4868k);
        } else if (m7063a(new C1634g(qVar, rVar), 30000, (Runnable) new C1637h(this, rVar)) == null) {
            rVar.mo6310a(m7074c());
        }
    }

    /* renamed from: a */
    public void mo6226a(C1679t tVar, C1682u uVar) {
        C1660h hVar;
        if (!mo6228b()) {
            hVar = C1663i.f4872o;
        } else {
            String a = tVar.mo6323a();
            List<String> b = tVar.mo6324b();
            if (TextUtils.isEmpty(a)) {
                C1147a.m5664c("BillingClient", "Please fix the input params. SKU type can't be empty.");
                hVar = C1663i.f4863f;
            } else if (b == null) {
                C1147a.m5664c("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
                hVar = C1663i.f4862e;
            } else if (m7063a(new C1626a(a, b, uVar), 30000, (Runnable) new C1628b(this, uVar)) == null) {
                uVar.mo6328a(m7074c(), (List<C1677s>) null);
                return;
            } else {
                return;
            }
        }
        uVar.mo6328a(hVar, (List<C1677s>) null);
    }

    /* renamed from: a */
    public void mo6227a(String str, C1672o oVar) {
        if (!mo6228b()) {
            oVar.mo6305a(C1663i.f4872o, (List<C1671n>) null);
        } else if (m7063a(new C1631e(str, oVar), 30000, (Runnable) new C1633f(this, oVar)) == null) {
            oVar.mo6305a(m7074c(), (List<C1671n>) null);
        }
    }

    /* renamed from: b */
    public boolean mo6228b() {
        return (this.f4756a != 2 || this.f4763h == null || this.f4764i == null) ? false : true;
    }
}
