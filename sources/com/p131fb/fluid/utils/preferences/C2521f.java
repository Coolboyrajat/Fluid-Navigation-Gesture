package com.p131fb.fluid.utils.preferences;

import android.content.Context;
import com.p131fb.fluid.data.Trigger;
import com.p131fb.fluid.p135l.p139p.C1776l;
import java.util.ArrayList;
import java.util.List;
import kotlin.p195s.C3282h;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p079d.p080a.p081a.p082a.C1165a;
import p190io.objectbox.Box;
import p190io.objectbox.BoxStore;

/* renamed from: com.fb.fluid.utils.preferences.f */
public final class C2521f {

    /* renamed from: a */
    private static BoxStore f6388a;

    /* renamed from: b */
    public static final C2521f f6389b = new C2521f();

    /* renamed from: com.fb.fluid.utils.preferences.f$a */
    static final class C2522a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2519e f6390f;

        /* renamed from: g */
        final /* synthetic */ Box f6391g;

        C2522a(C2519e eVar, Box box) {
            this.f6390f = eVar;
            this.f6391g = box;
        }

        public final void run() {
            this.f6391g.put(this.f6390f.mo7469f().toActionEvent(-1));
            this.f6391g.put(this.f6390f.mo7470g().toActionEvent(-2));
            ArrayList arrayList = new ArrayList();
            C2515a b = this.f6390f.mo7465b();
            if (!(b.getB() == -1 && b.getC() == -1)) {
                arrayList.add(b);
            }
            C2515a c = this.f6390f.mo7466c();
            if (!(c.getB() == -1 && c.getC() == -1)) {
                arrayList.add(c);
            }
            C2515a d = this.f6390f.mo7467d();
            if (!(d.getB() == -1 && d.getC() == -1)) {
                arrayList.add(d);
            }
            C2515a e = this.f6390f.mo7468e();
            if (!(e.getB() == -1 && e.getC() == -1)) {
                arrayList.add(e);
            }
            int i = 0;
            for (Object next : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    this.f6391g.put(((C2515a) next).toActionEvent(i));
                    i = i2;
                } else {
                    C3282h.m12055c();
                    throw null;
                }
            }
        }
    }

    /* renamed from: com.fb.fluid.utils.preferences.f$b */
    static final class C2523b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Box f6392f;

        /* renamed from: g */
        final /* synthetic */ Trigger f6393g;

        /* renamed from: h */
        final /* synthetic */ Trigger f6394h;

        /* renamed from: i */
        final /* synthetic */ Trigger f6395i;

        /* renamed from: j */
        final /* synthetic */ Box f6396j;

        /* renamed from: k */
        final /* synthetic */ List f6397k;

        C2523b(Box box, Trigger trigger, Trigger trigger2, Trigger trigger3, Box box2, List list) {
            this.f6392f = box;
            this.f6393g = trigger;
            this.f6394h = trigger2;
            this.f6395i = trigger3;
            this.f6396j = box2;
            this.f6397k = list;
        }

        public final void run() {
            this.f6392f.put((T[]) new Trigger[]{this.f6393g, this.f6394h, this.f6395i});
            this.f6396j.put(this.f6397k);
        }
    }

    /* renamed from: com.fb.fluid.utils.preferences.f$c */
    static final class C2524c extends C3371l implements C3350b<Integer, Integer> {

        /* renamed from: g */
        public static final C2524c f6398g = new C2524c();

        C2524c() {
            super(1);
        }

        /* renamed from: a */
        public final int mo7486a(int i) {
            int i2;
            if (i == 0) {
                i2 = 6;
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        i2 = 14;
                    } else if (i == 4) {
                        i2 = 20;
                    }
                }
                return C1165a.m5734a(12);
            } else {
                i2 = 10;
            }
            return C1165a.m5734a(i2);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Integer.valueOf(mo7486a(((Number) obj).intValue()));
        }
    }

    /* renamed from: com.fb.fluid.utils.preferences.f$d */
    static final class C2525d extends C3371l implements C3350b<Integer, Integer> {

        /* renamed from: g */
        public static final C2525d f6399g = new C2525d();

        C2525d() {
            super(1);
        }

        /* renamed from: a */
        public final int mo7487a(int i) {
            if (i == 0) {
                return 40;
            }
            if (i == 1) {
                return 50;
            }
            if (i == 2) {
                return 60;
            }
            if (i != 3) {
                return i != 4 ? 60 : 100;
            }
            return 80;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Integer.valueOf(mo7487a(((Number) obj).intValue()));
        }
    }

    private C2521f() {
    }

    /* renamed from: a */
    public final BoxStore mo7481a() {
        BoxStore boxStore = f6388a;
        if (boxStore != null) {
            return boxStore;
        }
        C3370k.m12230d("boxStore");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c7, code lost:
        if (r13 != 2) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015d A[EDGE_INSN: B:57:0x015d->B:36:0x015d ?: BREAK  , SYNTHETIC] */
    @android.annotation.SuppressLint({"RtlHardcoded"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7482a(android.content.Context r15) {
        /*
            r14 = this;
            java.lang.String r0 = "context"
            kotlin.p205x.p207d.C3370k.m12227b(r15, r0)
            io.objectbox.BoxStoreBuilder r0 = com.p131fb.fluid.data.C1705b.m7303a()
            android.content.Context r1 = r15.getApplicationContext()
            io.objectbox.BoxStoreBuilder r0 = r0.androidContext(r1)
            io.objectbox.BoxStore r0 = r0.build()
            java.lang.String r1 = "MyObjectBox.builder().an…plicationContext).build()"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r1)
            f6388a = r0
            io.objectbox.BoxStore r0 = f6388a
            r1 = 0
            java.lang.String r2 = "boxStore"
            if (r0 == 0) goto L_0x01ab
            java.lang.Class<com.fb.fluid.data.Trigger> r3 = com.p131fb.fluid.data.Trigger.class
            io.objectbox.Box r5 = r0.boxFor(r3)
            io.objectbox.BoxStore r0 = f6388a
            if (r0 == 0) goto L_0x01a7
            java.lang.Class<com.fb.fluid.data.TriggerButton> r3 = com.p131fb.fluid.data.TriggerButton.class
            io.objectbox.Box r9 = r0.boxFor(r3)
            com.fb.fluid.utils.preferences.e r0 = new com.fb.fluid.utils.preferences.e
            r0.<init>(r15)
            long r3 = r9.count()
            r6 = 0
            int r15 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r15 != 0) goto L_0x0053
            io.objectbox.BoxStore r15 = f6388a
            if (r15 == 0) goto L_0x004f
            com.fb.fluid.utils.preferences.f$a r3 = new com.fb.fluid.utils.preferences.f$a
            r3.<init>(r0, r9)
            r15.runInTx(r3)
            goto L_0x0053
        L_0x004f:
            kotlin.p205x.p207d.C3370k.m12230d(r2)
            throw r1
        L_0x0053:
            long r3 = r5.count()
            int r15 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r15 > 0) goto L_0x01a6
            com.fb.fluid.utils.preferences.f$c r15 = com.p131fb.fluid.utils.preferences.C2521f.C2524c.f6398g
            com.fb.fluid.utils.preferences.f$d r3 = com.p131fb.fluid.utils.preferences.C2521f.C2525d.f6399g
            com.fb.fluid.data.Trigger r6 = new com.fb.fluid.data.Trigger
            r6.<init>()
            r4 = 1
            r6.mo6374a((boolean) r4)
            r7 = 3
            r6.mo6380c((int) r7)
            int r7 = r0.mo7474k()
            r8 = 2
            r10 = 20
            r11 = 100
            r12 = 50
            if (r7 == 0) goto L_0x0084
            if (r7 == r4) goto L_0x0081
            if (r7 == r8) goto L_0x007e
            goto L_0x0084
        L_0x007e:
            r7 = 20
            goto L_0x0086
        L_0x0081:
            r7 = 50
            goto L_0x0086
        L_0x0084:
            r7 = 100
        L_0x0086:
            r6.mo6383d(r7)
            int r7 = r0.mo7477n()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r15.mo5146a(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r6.mo6385e(r7)
            int r7 = r0.mo7479p()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r3.mo5146a(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r6.mo6386f(r7)
            com.fb.fluid.data.Trigger r7 = new com.fb.fluid.data.Trigger
            r7.<init>()
            r7.mo6374a((boolean) r4)
            r13 = 5
            r7.mo6380c((int) r13)
            int r13 = r0.mo7475l()
            if (r13 == 0) goto L_0x00cd
            if (r13 == r4) goto L_0x00ca
            if (r13 == r8) goto L_0x00cf
            goto L_0x00cd
        L_0x00ca:
            r10 = 50
            goto L_0x00cf
        L_0x00cd:
            r10 = 100
        L_0x00cf:
            r7.mo6383d(r10)
            int r8 = r0.mo7478o()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r15.mo5146a(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r7.mo6385e(r8)
            int r8 = r0.mo7480q()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r3 = r3.mo5146a(r8)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r7.mo6386f(r3)
            com.fb.fluid.data.Trigger r8 = new com.fb.fluid.data.Trigger
            r8.<init>()
            r8.mo6374a((boolean) r4)
            r3 = 80
            r8.mo6380c((int) r3)
            r8.mo6383d(r12)
            int r0 = r0.mo7476m()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r15 = r15.mo5146a(r0)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            r8.mo6385e(r15)
            r8.mo6386f(r11)
            java.lang.String r15 = "boxTriggerButtons"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r9, (java.lang.String) r15)
            java.util.List r15 = r9.getAll()
            java.lang.String r0 = "boxTriggerButtons\n                    .all"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r15, (java.lang.String) r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r15 = r15.iterator()
        L_0x013b:
            boolean r0 = r15.hasNext()
            r3 = 0
            r11 = -1
            if (r0 == 0) goto L_0x015d
            java.lang.Object r0 = r15.next()
            r12 = r0
            com.fb.fluid.data.TriggerButton r12 = (com.p131fb.fluid.data.TriggerButton) r12
            int r13 = r12.mo6412d()
            if (r13 != r11) goto L_0x0156
            int r12 = r12.mo6410c()
            if (r12 == r11) goto L_0x0157
        L_0x0156:
            r3 = 1
        L_0x0157:
            if (r3 == 0) goto L_0x013b
            r10.add(r0)
            goto L_0x013b
        L_0x015d:
            java.util.Iterator r15 = r10.iterator()
        L_0x0161:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0194
            java.lang.Object r0 = r15.next()
            com.fb.fluid.data.TriggerButton r0 = (com.p131fb.fluid.data.TriggerButton) r0
            int r12 = r0.mo6415g()
            r13 = -2
            if (r12 == r13) goto L_0x0186
            if (r12 == r11) goto L_0x017e
            io.objectbox.relation.ToOne r12 = r0.mo6416h()
            r12.setTarget(r8)
            goto L_0x0190
        L_0x017e:
            io.objectbox.relation.ToOne r12 = r0.mo6416h()
            r12.setTarget(r6)
            goto L_0x018d
        L_0x0186:
            io.objectbox.relation.ToOne r12 = r0.mo6416h()
            r12.setTarget(r7)
        L_0x018d:
            r0.mo6411c(r3)
        L_0x0190:
            r0.mo6405a((boolean) r4)
            goto L_0x0161
        L_0x0194:
            io.objectbox.BoxStore r15 = f6388a
            if (r15 == 0) goto L_0x01a2
            com.fb.fluid.utils.preferences.f$b r0 = new com.fb.fluid.utils.preferences.f$b
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r15.runInTx(r0)
            goto L_0x01a6
        L_0x01a2:
            kotlin.p205x.p207d.C3370k.m12230d(r2)
            throw r1
        L_0x01a6:
            return
        L_0x01a7:
            kotlin.p205x.p207d.C3370k.m12230d(r2)
            throw r1
        L_0x01ab:
            kotlin.p205x.p207d.C3370k.m12230d(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.utils.preferences.C2521f.mo7482a(android.content.Context):void");
    }

    /* renamed from: b */
    public final void mo7483b(Context context) {
        C3370k.m12227b(context, "context");
        try {
            BoxStore boxStore = f6388a;
            if (boxStore != null) {
                if (!boxStore.isClosed()) {
                    BoxStore boxStore2 = f6388a;
                    if (boxStore2 != null) {
                        boxStore2.close();
                    } else {
                        C3370k.m12230d("boxStore");
                        throw null;
                    }
                }
                mo7482a(context);
                return;
            }
            C3370k.m12230d("boxStore");
            throw null;
        } catch (Exception e) {
            C1776l.m7478a("ob.rload.e: " + e.getMessage(), (String) null, 1, (Object) null);
        }
    }
}
