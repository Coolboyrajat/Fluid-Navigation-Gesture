package p054c.p116g.p117a.p118a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p054c.p116g.p117a.p118a.C1450e;

/* renamed from: c.g.a.a.b */
public class C1429b {

    /* renamed from: a */
    static final String[] f4397a = {"echo -BOC-", "id"};

    /* renamed from: c.g.a.a.b$a */
    public static class C1430a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Map<String, String> f4398a = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public List<C1431b> f4399b = new LinkedList();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C1450e.C1451a f4400c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C1450e.C1451a f4401d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Handler f4402e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f4403f = true;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f4404g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public String f4405h = "sh";
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f4406i;

        /* renamed from: a */
        public C1430a mo5877a(int i) {
            this.f4406i = i;
            return this;
        }

        /* renamed from: a */
        public C1430a mo5878a(Handler handler) {
            this.f4402e = handler;
            return this;
        }

        /* renamed from: a */
        public C1430a mo5879a(C1450e.C1451a aVar) {
            this.f4401d = aVar;
            return this;
        }

        /* renamed from: a */
        public C1430a mo5880a(String str) {
            this.f4405h = str;
            return this;
        }

        /* renamed from: a */
        public C1430a mo5881a(Map<String, String> map) {
            this.f4398a.putAll(map);
            return this;
        }

        /* renamed from: a */
        public C1430a mo5882a(boolean z) {
            this.f4404g = z;
            return this;
        }

        /* renamed from: a */
        public C1437d mo5883a(C1445f fVar) {
            return new C1437d(this, fVar);
        }
    }

    /* renamed from: c.g.a.a.b$b */
    private static class C1431b {

        /* renamed from: f */
        private static int f4407f;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String[] f4408a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f4409b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C1445f f4410c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C1444e f4411d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f4412e;

        public C1431b(String[] strArr, int i, C1445f fVar, C1444e eVar) {
            this.f4408a = strArr;
            this.f4409b = i;
            this.f4410c = fVar;
            this.f4411d = eVar;
            StringBuilder sb = new StringBuilder();
            sb.append(UUID.randomUUID().toString());
            int i2 = f4407f + 1;
            f4407f = i2;
            sb.append(String.format("-%08x", new Object[]{Integer.valueOf(i2)}));
            this.f4412e = sb.toString();
        }
    }

    /* renamed from: c.g.a.a.b$c */
    public static class C1432c implements Closeable {

        /* renamed from: f */
        private final C1436d f4413f;

        /* renamed from: g */
        private final C1437d f4414g;

        /* renamed from: h */
        final HandlerThread f4415h;

        /* renamed from: i */
        private final boolean f4416i;

        /* renamed from: j */
        List<String> f4417j;

        /* renamed from: k */
        List<String> f4418k;

        /* renamed from: l */
        int f4419l;

        /* renamed from: m */
        boolean f4420m;

        /* renamed from: n */
        private boolean f4421n;

        /* renamed from: o */
        private final C1445f f4422o = new C1433a();

        /* renamed from: c.g.a.a.b$c$a */
        class C1433a implements C1445f {
            C1433a() {
            }

            /* renamed from: a */
            public void mo5887a(int i, int i2, List<String> list) {
                C1432c cVar = C1432c.this;
                cVar.f4419l = i2;
                cVar.f4417j = list;
                synchronized (cVar.f4415h) {
                    C1432c.this.f4420m = false;
                    C1432c.this.f4415h.notifyAll();
                }
            }
        }

        /* renamed from: c.g.a.a.b$c$b */
        class C1434b implements C1450e.C1451a {
            C1434b() {
            }

            /* renamed from: a */
            public void mo5888a(String str) {
                List<String> list = C1432c.this.f4418k;
                if (list != null) {
                    list.add(str);
                }
            }
        }

        /* renamed from: c.g.a.a.b$c$c */
        public static class C1435c {

            /* renamed from: a */
            C1436d f4425a;

            /* renamed from: b */
            Map<String, String> f4426b = new HashMap();

            /* renamed from: c */
            String f4427c = "sh";

            /* renamed from: d */
            boolean f4428d = true;

            /* renamed from: e */
            int f4429e;

            /* renamed from: a */
            public C1435c mo5889a(int i) {
                this.f4429e = i;
                return this;
            }

            /* renamed from: a */
            public C1435c mo5890a(String str) {
                this.f4427c = str;
                return this;
            }

            /* renamed from: a */
            public C1432c mo5891a() {
                return new C1432c(this);
            }

            /* renamed from: b */
            public C1435c mo5892b() {
                mo5890a("su");
                return this;
            }
        }

        /* renamed from: c.g.a.a.b$c$d */
        public interface C1436d {
            /* renamed from: a */
            void mo5893a(C1432c cVar);
        }

        C1432c(C1435c cVar) {
            try {
                this.f4413f = cVar.f4425a;
                this.f4416i = cVar.f4428d;
                this.f4415h = new HandlerThread("Shell Callback");
                this.f4415h.start();
                this.f4420m = true;
                C1430a aVar = new C1430a();
                aVar.mo5880a(cVar.f4427c);
                aVar.mo5878a(new Handler(this.f4415h.getLooper()));
                aVar.mo5877a(cVar.f4429e);
                aVar.mo5881a(cVar.f4426b);
                aVar.mo5882a(false);
                if (cVar.f4428d) {
                    aVar.mo5879a((C1450e.C1451a) new C1434b());
                }
                this.f4414g = aVar.mo5883a(this.f4422o);
                m6629b();
                if (this.f4419l != 0) {
                    close();
                    throw new C1449d("Access was denied or this is not a shell");
                }
            } catch (Exception e) {
                throw new C1449d("Error opening shell '" + cVar.f4427c + "'", e);
            }
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
        /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A[LOOP:0: B:2:0x0003->B:18:0x0003, LOOP_START, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m6629b() {
            /*
                r2 = this;
                android.os.HandlerThread r0 = r2.f4415h
                monitor-enter(r0)
            L_0x0003:
                boolean r1 = r2.f4420m     // Catch:{ all -> 0x001a }
                if (r1 == 0) goto L_0x000d
                android.os.HandlerThread r1 = r2.f4415h     // Catch:{ InterruptedException -> 0x0003 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0003 }
                goto L_0x0003
            L_0x000d:
                monitor-exit(r0)     // Catch:{ all -> 0x001a }
                int r0 = r2.f4419l
                r1 = -1
                if (r0 == r1) goto L_0x0016
                r1 = -2
                if (r0 != r1) goto L_0x0019
            L_0x0016:
                r2.close()
            L_0x0019:
                return
            L_0x001a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x001a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p054c.p116g.p117a.p118a.C1429b.C1432c.m6629b():void");
        }

        /* renamed from: a */
        public synchronized C1428a mo5884a(String... strArr) {
            C1428a aVar;
            this.f4420m = true;
            this.f4418k = this.f4416i ? Collections.synchronizedList(new ArrayList()) : Collections.emptyList();
            this.f4414g.mo5897a(strArr, 0, this.f4422o);
            m6629b();
            aVar = new C1428a(this.f4417j, this.f4418k, this.f4419l);
            this.f4418k = null;
            this.f4417j = null;
            return aVar;
        }

        /* renamed from: a */
        public boolean mo5885a() {
            return this.f4421n;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
            */
        public synchronized void close() {
            /*
                r2 = this;
                monitor-enter(r2)
                c.g.a.a.b$d r0 = r2.f4414g     // Catch:{ Exception -> 0x0009 }
                r0.mo5894a()     // Catch:{ Exception -> 0x0009 }
                goto L_0x0009
            L_0x0007:
                r0 = move-exception
                goto L_0x002d
            L_0x0009:
                android.os.HandlerThread r0 = r2.f4415h     // Catch:{ all -> 0x0007 }
                monitor-enter(r0)     // Catch:{ all -> 0x0007 }
                android.os.HandlerThread r1 = r2.f4415h     // Catch:{ all -> 0x002a }
                r1.notifyAll()     // Catch:{ all -> 0x002a }
                monitor-exit(r0)     // Catch:{ all -> 0x002a }
                android.os.HandlerThread r0 = r2.f4415h     // Catch:{ all -> 0x0007 }
                r0.interrupt()     // Catch:{ all -> 0x0007 }
                android.os.HandlerThread r0 = r2.f4415h     // Catch:{ all -> 0x0007 }
                r0.quit()     // Catch:{ all -> 0x0007 }
                r0 = 1
                r2.f4421n = r0     // Catch:{ all -> 0x0007 }
                c.g.a.a.b$c$d r0 = r2.f4413f     // Catch:{ all -> 0x0007 }
                if (r0 == 0) goto L_0x0028
                c.g.a.a.b$c$d r0 = r2.f4413f     // Catch:{ all -> 0x0007 }
                r0.mo5893a(r2)     // Catch:{ all -> 0x0007 }
            L_0x0028:
                monitor-exit(r2)
                return
            L_0x002a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002a }
                throw r1     // Catch:{ all -> 0x0007 }
            L_0x002d:
                monitor-exit(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p054c.p116g.p117a.p118a.C1429b.C1432c.close():void");
        }
    }

    /* renamed from: c.g.a.a.b$d */
    public static class C1437d {

        /* renamed from: a */
        private final Handler f4430a;

        /* renamed from: b */
        private final boolean f4431b;

        /* renamed from: c */
        final String f4432c;

        /* renamed from: d */
        final boolean f4433d;

        /* renamed from: e */
        private final List<C1431b> f4434e;

        /* renamed from: f */
        private final Map<String, String> f4435f;

        /* renamed from: g */
        final C1450e.C1451a f4436g;

        /* renamed from: h */
        final C1450e.C1451a f4437h;

        /* renamed from: i */
        private final Object f4438i = new Object();

        /* renamed from: j */
        private final Object f4439j = new Object();

        /* renamed from: k */
        volatile String f4440k;

        /* renamed from: l */
        volatile String f4441l;

        /* renamed from: m */
        volatile C1431b f4442m;

        /* renamed from: n */
        private volatile List<String> f4443n;

        /* renamed from: o */
        private volatile boolean f4444o;

        /* renamed from: p */
        private volatile boolean f4445p = true;

        /* renamed from: q */
        private volatile int f4446q;

        /* renamed from: r */
        private volatile int f4447r;

        /* renamed from: s */
        volatile int f4448s;

        /* renamed from: t */
        private Process f4449t;

        /* renamed from: u */
        private DataOutputStream f4450u;

        /* renamed from: v */
        private C1450e f4451v;

        /* renamed from: w */
        private C1450e f4452w;

        /* renamed from: x */
        private ScheduledThreadPoolExecutor f4453x;

        /* renamed from: y */
        int f4454y;

        /* renamed from: c.g.a.a.b$d$a */
        class C1438a implements C1445f {

            /* renamed from: a */
            final /* synthetic */ C1430a f4455a;

            /* renamed from: b */
            final /* synthetic */ C1445f f4456b;

            C1438a(C1430a aVar, C1445f fVar) {
                this.f4455a = aVar;
                this.f4456b = fVar;
            }

            /* renamed from: a */
            public void mo5887a(int i, int i2, List<String> list) {
                if (i2 == 0 && !C1429b.m6607a(list, C1447h.m6664a(C1437d.this.f4432c))) {
                    i2 = -3;
                }
                C1437d.this.f4454y = this.f4455a.f4406i;
                this.f4456b.mo5887a(0, i2, list);
            }
        }

        /* renamed from: c.g.a.a.b$d$b */
        class C1439b implements Runnable {
            C1439b() {
            }

            public void run() {
                C1437d.this.mo5899c();
            }
        }

        /* renamed from: c.g.a.a.b$d$c */
        class C1440c implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C1450e.C1451a f4459f;

            /* renamed from: g */
            final /* synthetic */ String f4460g;

            C1440c(C1450e.C1451a aVar, String str) {
                this.f4459f = aVar;
                this.f4460g = str;
            }

            public void run() {
                try {
                    this.f4459f.mo5888a(this.f4460g);
                } finally {
                    C1437d.this.mo5898b();
                }
            }
        }

        /* renamed from: c.g.a.a.b$d$d */
        class C1441d implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C1431b f4462f;

            /* renamed from: g */
            final /* synthetic */ List f4463g;

            /* renamed from: h */
            final /* synthetic */ int f4464h;

            C1441d(C1431b bVar, List list, int i) {
                this.f4462f = bVar;
                this.f4463g = list;
                this.f4464h = i;
            }

            public void run() {
                try {
                    if (!(this.f4462f.f4410c == null || this.f4463g == null)) {
                        this.f4462f.f4410c.mo5887a(this.f4462f.f4409b, this.f4464h, this.f4463g);
                    }
                    if (this.f4462f.f4411d != null) {
                        this.f4462f.f4411d.mo5908a(this.f4462f.f4409b, this.f4464h);
                    }
                } finally {
                    C1437d.this.mo5898b();
                }
            }
        }

        /* renamed from: c.g.a.a.b$d$e */
        class C1442e implements C1450e.C1451a {
            C1442e() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
                return;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo5888a(java.lang.String r6) {
                /*
                    r5 = this;
                    c.g.a.a.b$d r0 = p054c.p116g.p117a.p118a.C1429b.C1437d.this
                    monitor-enter(r0)
                    c.g.a.a.b$d r1 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x0081 }
                    c.g.a.a.b$b r1 = r1.f4442m     // Catch:{ all -> 0x0081 }
                    if (r1 != 0) goto L_0x000b
                    monitor-exit(r0)     // Catch:{ all -> 0x0081 }
                    return
                L_0x000b:
                    c.g.a.a.b$d r1 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x0081 }
                    c.g.a.a.b$b r1 = r1.f4442m     // Catch:{ all -> 0x0081 }
                    java.lang.String r1 = r1.f4412e     // Catch:{ all -> 0x0081 }
                    int r1 = r6.indexOf(r1)     // Catch:{ all -> 0x0081 }
                    r2 = 0
                    if (r1 != 0) goto L_0x001b
                    goto L_0x002a
                L_0x001b:
                    if (r1 <= 0) goto L_0x0027
                    r2 = 0
                    java.lang.String r2 = r6.substring(r2, r1)     // Catch:{ all -> 0x0081 }
                    java.lang.String r6 = r6.substring(r1)     // Catch:{ all -> 0x0081 }
                    goto L_0x002a
                L_0x0027:
                    r4 = r2
                    r2 = r6
                    r6 = r4
                L_0x002a:
                    if (r2 == 0) goto L_0x0047
                    c.g.a.a.b$d r1 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x0081 }
                    r1.mo5895a((java.lang.String) r2)     // Catch:{ all -> 0x0081 }
                    c.g.a.a.b$d r1 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x0081 }
                    c.g.a.a.b$d r3 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x0081 }
                    c.g.a.a.e$a r3 = r3.f4436g     // Catch:{ all -> 0x0081 }
                    r1.mo5896a(r2, r3)     // Catch:{ all -> 0x0081 }
                    c.g.a.a.b$d r1 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x0081 }
                    c.g.a.a.b$d r3 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x0081 }
                    c.g.a.a.b$b r3 = r3.f4442m     // Catch:{ all -> 0x0081 }
                    c.g.a.a.b$e r3 = r3.f4411d     // Catch:{ all -> 0x0081 }
                    r1.mo5896a(r2, r3)     // Catch:{ all -> 0x0081 }
                L_0x0047:
                    if (r6 == 0) goto L_0x007f
                    c.g.a.a.b$d r1 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ Exception -> 0x006a }
                    c.g.a.a.b$d r2 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ Exception -> 0x006a }
                    c.g.a.a.b$b r2 = r2.f4442m     // Catch:{ Exception -> 0x006a }
                    java.lang.String r2 = r2.f4412e     // Catch:{ Exception -> 0x006a }
                    int r2 = r2.length()     // Catch:{ Exception -> 0x006a }
                    int r2 = r2 + 1
                    java.lang.String r6 = r6.substring(r2)     // Catch:{ Exception -> 0x006a }
                    r2 = 10
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6, r2)     // Catch:{ Exception -> 0x006a }
                    int r6 = r6.intValue()     // Catch:{ Exception -> 0x006a }
                    r1.f4448s = r6     // Catch:{ Exception -> 0x006a }
                    goto L_0x006e
                L_0x006a:
                    r6 = move-exception
                    r6.printStackTrace()     // Catch:{ all -> 0x0081 }
                L_0x006e:
                    c.g.a.a.b$d r6 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x0081 }
                    c.g.a.a.b$d r1 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x0081 }
                    c.g.a.a.b$b r1 = r1.f4442m     // Catch:{ all -> 0x0081 }
                    java.lang.String r1 = r1.f4412e     // Catch:{ all -> 0x0081 }
                    r6.f4440k = r1     // Catch:{ all -> 0x0081 }
                    c.g.a.a.b$d r6 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x0081 }
                    r6.mo5903g()     // Catch:{ all -> 0x0081 }
                L_0x007f:
                    monitor-exit(r0)     // Catch:{ all -> 0x0081 }
                    return
                L_0x0081:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0081 }
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p054c.p116g.p117a.p118a.C1429b.C1437d.C1442e.mo5888a(java.lang.String):void");
            }
        }

        /* renamed from: c.g.a.a.b$d$f */
        class C1443f implements C1450e.C1451a {
            C1443f() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
                return;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo5888a(java.lang.String r5) {
                /*
                    r4 = this;
                    c.g.a.a.b$d r0 = p054c.p116g.p117a.p118a.C1429b.C1437d.this
                    monitor-enter(r0)
                    c.g.a.a.b$d r1 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x004d }
                    c.g.a.a.b$b r1 = r1.f4442m     // Catch:{ all -> 0x004d }
                    if (r1 != 0) goto L_0x000b
                    monitor-exit(r0)     // Catch:{ all -> 0x004d }
                    return
                L_0x000b:
                    c.g.a.a.b$d r1 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x004d }
                    c.g.a.a.b$b r1 = r1.f4442m     // Catch:{ all -> 0x004d }
                    java.lang.String r1 = r1.f4412e     // Catch:{ all -> 0x004d }
                    int r1 = r5.indexOf(r1)     // Catch:{ all -> 0x004d }
                    if (r1 != 0) goto L_0x001b
                    r5 = 0
                    goto L_0x0022
                L_0x001b:
                    if (r1 <= 0) goto L_0x0022
                    r2 = 0
                    java.lang.String r5 = r5.substring(r2, r1)     // Catch:{ all -> 0x004d }
                L_0x0022:
                    if (r5 == 0) goto L_0x0038
                    c.g.a.a.b$d r2 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x004d }
                    boolean r2 = r2.f4433d     // Catch:{ all -> 0x004d }
                    if (r2 == 0) goto L_0x002f
                    c.g.a.a.b$d r2 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x004d }
                    r2.mo5895a((java.lang.String) r5)     // Catch:{ all -> 0x004d }
                L_0x002f:
                    c.g.a.a.b$d r2 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x004d }
                    c.g.a.a.b$d r3 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x004d }
                    c.g.a.a.e$a r3 = r3.f4437h     // Catch:{ all -> 0x004d }
                    r2.mo5896a(r5, r3)     // Catch:{ all -> 0x004d }
                L_0x0038:
                    if (r1 < 0) goto L_0x004b
                    c.g.a.a.b$d r5 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x004d }
                    c.g.a.a.b$d r1 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x004d }
                    c.g.a.a.b$b r1 = r1.f4442m     // Catch:{ all -> 0x004d }
                    java.lang.String r1 = r1.f4412e     // Catch:{ all -> 0x004d }
                    r5.f4441l = r1     // Catch:{ all -> 0x004d }
                    c.g.a.a.b$d r5 = p054c.p116g.p117a.p118a.C1429b.C1437d.this     // Catch:{ all -> 0x004d }
                    r5.mo5903g()     // Catch:{ all -> 0x004d }
                L_0x004b:
                    monitor-exit(r0)     // Catch:{ all -> 0x004d }
                    return
                L_0x004d:
                    r5 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x004d }
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p054c.p116g.p117a.p118a.C1429b.C1437d.C1443f.mo5888a(java.lang.String):void");
            }
        }

        C1437d(C1430a aVar, C1445f fVar) {
            this.f4431b = aVar.f4403f;
            this.f4432c = aVar.f4405h;
            this.f4433d = aVar.f4404g;
            this.f4434e = aVar.f4399b;
            this.f4435f = aVar.f4398a;
            this.f4436g = aVar.f4400c;
            this.f4437h = aVar.f4401d;
            this.f4454y = aVar.f4406i;
            this.f4430a = (Looper.myLooper() == null || aVar.f4402e != null || !this.f4431b) ? aVar.f4402e : new Handler();
            if (fVar != null) {
                this.f4454y = 60;
                this.f4434e.add(0, new C1431b(C1429b.f4397a, 0, new C1438a(aVar, fVar), (C1444e) null));
            }
            if (!m6641i() && fVar != null) {
                fVar.mo5887a(0, -4, (List<String>) null);
            }
        }

        /* renamed from: a */
        private void m6639a(C1431b bVar, int i, List<String> list) {
            if (bVar.f4410c != null || bVar.f4411d != null) {
                if (this.f4430a == null) {
                    if (!(bVar.f4410c == null || list == null)) {
                        bVar.f4410c.mo5887a(bVar.f4409b, i, list);
                    }
                    if (bVar.f4411d != null) {
                        bVar.f4411d.mo5908a(bVar.f4409b, i);
                        return;
                    }
                    return;
                }
                m6643k();
                this.f4430a.post(new C1441d(bVar, list, i));
            }
        }

        /* renamed from: a */
        private void m6640a(boolean z) {
            boolean e = mo5901e();
            if (!e) {
                this.f4445p = true;
            }
            if (e && this.f4445p && this.f4434e.size() > 0) {
                C1431b bVar = this.f4434e.get(0);
                this.f4434e.remove(0);
                this.f4443n = null;
                this.f4448s = 0;
                this.f4440k = null;
                this.f4441l = null;
                if (bVar.f4408a.length > 0) {
                    try {
                        if (bVar.f4410c != null) {
                            this.f4443n = Collections.synchronizedList(new ArrayList());
                        }
                        this.f4445p = false;
                        this.f4442m = bVar;
                        m6644l();
                        for (String str : bVar.f4408a) {
                            DataOutputStream dataOutputStream = this.f4450u;
                            dataOutputStream.write((str + "\n").getBytes("UTF-8"));
                        }
                        this.f4450u.write(("echo " + bVar.f4412e + " $?\n").getBytes("UTF-8"));
                        this.f4450u.write(("echo " + bVar.f4412e + " >&2\n").getBytes("UTF-8"));
                        this.f4450u.flush();
                    } catch (IOException unused) {
                    }
                } else {
                    m6640a(false);
                }
            } else if (!e) {
                while (this.f4434e.size() > 0) {
                    m6639a(this.f4434e.remove(0), -2, (List<String>) null);
                }
            }
            if (this.f4445p && z) {
                synchronized (this.f4438i) {
                    this.f4438i.notifyAll();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
            return false;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized boolean m6641i() {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.String r0 = r3.f4432c     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                java.util.Map<java.lang.String, java.lang.String> r1 = r3.f4435f     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                java.lang.Process r0 = p054c.p116g.p117a.p118a.C1429b.m6606a((java.lang.String) r0, (java.util.Map<java.lang.String, java.lang.String>) r1)     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                r3.f4449t = r0     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                java.lang.Process r1 = r3.f4449t     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                java.io.OutputStream r1 = r1.getOutputStream()     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                r0.<init>(r1)     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                r3.f4450u = r0     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                c.g.a.a.e r0 = new c.g.a.a.e     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                java.lang.Process r1 = r3.f4449t     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                c.g.a.a.b$d$e r2 = new c.g.a.a.b$d$e     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                r2.<init>()     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                r0.<init>(r1, r2)     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                r3.f4451v = r0     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                c.g.a.a.e r0 = new c.g.a.a.e     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                java.lang.Process r1 = r3.f4449t     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                java.io.InputStream r1 = r1.getErrorStream()     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                c.g.a.a.b$d$f r2 = new c.g.a.a.b$d$f     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                r2.<init>()     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                r0.<init>(r1, r2)     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                r3.f4452w = r0     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                c.g.a.a.e r0 = r3.f4451v     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                r0.start()     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                c.g.a.a.e r0 = r3.f4452w     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                r0.start()     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                r0 = 1
                r3.f4444o = r0     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                r3.m6642j()     // Catch:{ IOException -> 0x0051, all -> 0x004e }
                monitor-exit(r3)
                return r0
            L_0x004e:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            L_0x0051:
                r0 = 0
                monitor-exit(r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p054c.p116g.p117a.p118a.C1429b.C1437d.m6641i():boolean");
        }

        /* renamed from: j */
        private void m6642j() {
            m6640a(true);
        }

        /* renamed from: k */
        private void m6643k() {
            synchronized (this.f4439j) {
                this.f4446q++;
            }
        }

        /* renamed from: l */
        private void m6644l() {
            if (this.f4454y != 0) {
                this.f4447r = 0;
                this.f4453x = new ScheduledThreadPoolExecutor(1);
                this.f4453x.scheduleAtFixedRate(new C1439b(), 1, 1, TimeUnit.SECONDS);
            }
        }

        /* renamed from: m */
        private void m6645m() {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f4453x;
            if (scheduledThreadPoolExecutor != null) {
                scheduledThreadPoolExecutor.shutdownNow();
                this.f4453x = null;
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:20|21|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            mo5904h();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r3.f4450u.write("exit\n".getBytes("UTF-8"));
            r3.f4450u.flush();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
            if (r0.getMessage().contains("EPIPE") == false) goto L_0x0051;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
            r3.f4449t.waitFor();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r3.f4450u.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            r3.f4451v.join();
            r3.f4452w.join();
            m6645m();
            r3.f4449t.destroy();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r0 != false) goto L_0x0014;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003e */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[ExcHandler: InterruptedException (unused java.lang.InterruptedException), SYNTHETIC, Splitter:B:14:0x0028] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo5894a() {
            /*
                r3 = this;
                boolean r0 = r3.mo5900d()
                monitor-enter(r3)
                boolean r1 = r3.f4444o     // Catch:{ all -> 0x0053 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r3)     // Catch:{ all -> 0x0053 }
                return
            L_0x000b:
                r1 = 0
                r3.f4444o = r1     // Catch:{ all -> 0x0053 }
                monitor-exit(r3)     // Catch:{ all -> 0x0053 }
                if (r0 != 0) goto L_0x0014
                r3.mo5904h()
            L_0x0014:
                java.io.DataOutputStream r0 = r3.f4450u     // Catch:{ IOException -> 0x0027 }
                java.lang.String r1 = "exit\n"
                java.lang.String r2 = "UTF-8"
                byte[] r1 = r1.getBytes(r2)     // Catch:{ IOException -> 0x0027 }
                r0.write(r1)     // Catch:{ IOException -> 0x0027 }
                java.io.DataOutputStream r0 = r3.f4450u     // Catch:{ IOException -> 0x0027 }
                r0.flush()     // Catch:{ IOException -> 0x0027 }
                goto L_0x0034
            L_0x0027:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()     // Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
                java.lang.String r2 = "EPIPE"
                boolean r1 = r1.contains(r2)     // Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
                if (r1 == 0) goto L_0x0051
            L_0x0034:
                java.lang.Process r0 = r3.f4449t     // Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
                r0.waitFor()     // Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
                java.io.DataOutputStream r0 = r3.f4450u     // Catch:{ IOException -> 0x003e }
                r0.close()     // Catch:{ IOException -> 0x003e }
            L_0x003e:
                c.g.a.a.e r0 = r3.f4451v     // Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
                r0.join()     // Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
                c.g.a.a.e r0 = r3.f4452w     // Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
                r0.join()     // Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
                r3.m6645m()     // Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
                java.lang.Process r0 = r3.f4449t     // Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
                r0.destroy()     // Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
                goto L_0x0052
            L_0x0051:
                throw r0     // Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
            L_0x0052:
                return
            L_0x0053:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0053 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p054c.p116g.p117a.p118a.C1429b.C1437d.mo5894a():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo5895a(String str) {
            if (this.f4443n != null) {
                this.f4443n.add(str);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo5896a(String str, C1450e.C1451a aVar) {
            if (aVar != null) {
                if (this.f4430a != null) {
                    m6643k();
                    this.f4430a.post(new C1440c(aVar, str));
                } else {
                    aVar.mo5888a(str);
                }
            }
        }

        /* renamed from: a */
        public synchronized void mo5897a(String[] strArr, int i, C1445f fVar) {
            this.f4434e.add(new C1431b(strArr, i, fVar, (C1444e) null));
            m6642j();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5898b() {
            synchronized (this.f4439j) {
                this.f4446q--;
                if (this.f4446q == 0) {
                    this.f4439j.notifyAll();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized void mo5899c() {
            int i;
            if (this.f4453x != null) {
                if (this.f4454y != 0) {
                    if (!mo5901e()) {
                        i = -2;
                    } else {
                        int i2 = this.f4447r;
                        this.f4447r = i2 + 1;
                        if (i2 >= this.f4454y) {
                            i = -1;
                        } else {
                            return;
                        }
                    }
                    if (this.f4430a != null) {
                        m6639a(this.f4442m, i, this.f4443n);
                    }
                    this.f4442m = null;
                    this.f4443n = null;
                    this.f4445p = true;
                    this.f4453x.shutdown();
                    this.f4453x = null;
                    mo5902f();
                }
            }
        }

        /* renamed from: d */
        public synchronized boolean mo5900d() {
            if (!mo5901e()) {
                this.f4445p = true;
                synchronized (this.f4438i) {
                    this.f4438i.notifyAll();
                }
            }
            return this.f4445p;
        }

        /* renamed from: e */
        public boolean mo5901e() {
            Process process = this.f4449t;
            if (process == null) {
                return false;
            }
            try {
                process.exitValue();
                return false;
            } catch (IllegalThreadStateException unused) {
                return true;
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0009 */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void mo5902f() {
            /*
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.f4444o = r0     // Catch:{ all -> 0x0010 }
                java.io.DataOutputStream r0 = r1.f4450u     // Catch:{ IOException -> 0x0009 }
                r0.close()     // Catch:{ IOException -> 0x0009 }
            L_0x0009:
                java.lang.Process r0 = r1.f4449t     // Catch:{ Exception -> 0x000e }
                r0.destroy()     // Catch:{ Exception -> 0x000e }
            L_0x000e:
                monitor-exit(r1)
                return
            L_0x0010:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p054c.p116g.p117a.p118a.C1429b.C1437d.mo5902f():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public synchronized void mo5903g() {
            if (this.f4442m.f4412e.equals(this.f4440k) && this.f4442m.f4412e.equals(this.f4441l)) {
                m6639a(this.f4442m, this.f4448s, this.f4443n);
                m6645m();
                this.f4442m = null;
                this.f4443n = null;
                this.f4445p = true;
                m6642j();
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:8|9|10|11|12|5|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0017, code lost:
            r0 = r3.f4430a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0019, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
            if (r0.getLooper() == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
            if (r3.f4430a.getLooper() == android.os.Looper.myLooper()) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
            r0 = r3.f4439j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
            if (r3.f4446q <= 0) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            r3.f4439j.wait();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x003b, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x003c, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            return true;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x003a */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo5904h() {
            /*
                r3 = this;
                boolean r0 = r3.mo5901e()
                if (r0 == 0) goto L_0x0044
                java.lang.Object r0 = r3.f4438i
                monitor-enter(r0)
            L_0x0009:
                boolean r1 = r3.f4445p     // Catch:{ all -> 0x0041 }
                r2 = 0
                if (r1 != 0) goto L_0x0016
                java.lang.Object r1 = r3.f4438i     // Catch:{ InterruptedException -> 0x0014 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0014 }
                goto L_0x0009
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0041 }
                return r2
            L_0x0016:
                monitor-exit(r0)     // Catch:{ all -> 0x0041 }
                android.os.Handler r0 = r3.f4430a
                if (r0 == 0) goto L_0x0044
                android.os.Looper r0 = r0.getLooper()
                if (r0 == 0) goto L_0x0044
                android.os.Handler r0 = r3.f4430a
                android.os.Looper r0 = r0.getLooper()
                android.os.Looper r1 = android.os.Looper.myLooper()
                if (r0 == r1) goto L_0x0044
                java.lang.Object r0 = r3.f4439j
                monitor-enter(r0)
            L_0x0030:
                int r1 = r3.f4446q     // Catch:{ all -> 0x003e }
                if (r1 <= 0) goto L_0x003c
                java.lang.Object r1 = r3.f4439j     // Catch:{ InterruptedException -> 0x003a }
                r1.wait()     // Catch:{ InterruptedException -> 0x003a }
                goto L_0x0030
            L_0x003a:
                monitor-exit(r0)     // Catch:{ all -> 0x003e }
                return r2
            L_0x003c:
                monitor-exit(r0)     // Catch:{ all -> 0x003e }
                goto L_0x0044
            L_0x003e:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x003e }
                throw r1
            L_0x0041:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0041 }
                throw r1
            L_0x0044:
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p054c.p116g.p117a.p118a.C1429b.C1437d.mo5904h():boolean");
        }
    }

    /* renamed from: c.g.a.a.b$e */
    public interface C1444e extends C1448c, C1450e.C1451a {
        /* renamed from: a */
        void mo5908a(int i, int i2);
    }

    /* renamed from: c.g.a.a.b$f */
    public interface C1445f extends C1448c {
        /* renamed from: a */
        void mo5887a(int i, int i2, List<String> list);
    }

    /* renamed from: c.g.a.a.b$g */
    public static class C1446g {
    }

    /* renamed from: c.g.a.a.b$h */
    public static class C1447h {

        /* renamed from: a */
        private static volatile C1432c f4468a;

        static {
            new String[]{null, null};
        }

        /* renamed from: a */
        public static C1428a m6662a(String... strArr) {
            try {
                return m6663a().mo5884a(strArr);
            } catch (C1449d unused) {
                return new C1428a(Collections.emptyList(), Collections.emptyList(), -5);
            }
        }

        /* renamed from: a */
        public static C1432c m6663a() {
            if (f4468a == null || f4468a.mo5885a()) {
                synchronized (C1446g.class) {
                    if (f4468a == null || f4468a.mo5885a()) {
                        C1432c.C1435c cVar = new C1432c.C1435c();
                        cVar.mo5892b();
                        cVar.mo5889a(30);
                        f4468a = cVar.mo5891a();
                    }
                }
            }
            return f4468a;
        }

        /* renamed from: a */
        public static boolean m6664a(String str) {
            int indexOf = str.indexOf(32);
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
            int lastIndexOf = str.lastIndexOf(47);
            if (lastIndexOf >= 0) {
                str = str.substring(lastIndexOf + 1);
            }
            return str.equals("su");
        }
    }

    /* renamed from: a */
    public static Process m6606a(String str, Map<String, String> map) {
        String[] strArr;
        if (map == null || map.size() == 0) {
            strArr = null;
        } else {
            HashMap hashMap = new HashMap();
            hashMap.putAll(System.getenv());
            hashMap.putAll(map);
            int i = 0;
            strArr = new String[hashMap.size()];
            for (Map.Entry entry : hashMap.entrySet()) {
                strArr[i] = ((String) entry.getKey()) + "=" + ((String) entry.getValue());
                i++;
            }
        }
        return Runtime.getRuntime().exec(str, strArr);
    }

    /* renamed from: a */
    static boolean m6607a(List<String> list, boolean z) {
        if (list == null) {
            return false;
        }
        boolean z2 = false;
        for (String next : list) {
            if (next.contains("uid=")) {
                return !z || next.contains("uid=0");
            }
            if (next.contains("-BOC-")) {
                z2 = true;
            }
        }
        return z2;
    }
}
