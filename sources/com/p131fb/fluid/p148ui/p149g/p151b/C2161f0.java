package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.C0497t;
import com.p131fb.fluid.p135l.C1734c;
import com.p131fb.fluid.p135l.p139p.C1770f;
import com.p131fb.fluid.p135l.p140q.C1785b;
import com.p131fb.fluid.p135l.p140q.C1787c;
import com.p131fb.fluid.p135l.p142s.C1795a;
import com.p131fb.fluid.p148ui.p149g.p150a.C2061a;
import com.p131fb.fluid.p148ui.p149g.p150a.C2062b;
import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;
import com.p131fb.fluid.p148ui.p149g.p152c.C2451i;
import com.p131fb.fluid.p148ui.p149g.p152c.C2471s;
import com.p131fb.fluid.p148ui.p149g.p152c.C2472t;
import com.p131fb.fluid.p148ui.p149g.p152c.C2477u;
import com.p131fb.fluid.utils.preferences.C2526g;
import com.p131fb.fluid.utils.preferences.C2527h;
import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.b.f0 */
public final class C2161f0 extends C2317o {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2527h f5821i;

    /* renamed from: j */
    private final SharedPreferences.OnSharedPreferenceChangeListener f5822j;

    /* renamed from: k */
    private final C0497t<C2068g> f5823k = new C0497t<>();

    /* renamed from: l */
    private final Application f5824l;

    /* renamed from: com.fb.fluid.ui.g.b.f0$a */
    static final class C2162a extends C3371l implements C3350b<C2451i, Unit> {

        /* renamed from: g */
        final /* synthetic */ int f5825g;

        /* renamed from: h */
        final /* synthetic */ C2161f0 f5826h;

        /* renamed from: com.fb.fluid.ui.g.b.f0$a$a */
        static final class C2163a extends C3371l implements C3351c<Context, C2472t<Object>, Drawable> {

            /* renamed from: g */
            final /* synthetic */ C2162a f5827g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2163a(C2162a aVar) {
                super(2);
                this.f5827g = aVar;
            }

            /* renamed from: a */
            public final Drawable mo6125a(Context context, C2472t<Object> tVar) {
                C3370k.m12227b(context, "context");
                C3370k.m12227b(tVar, "<anonymous parameter 1>");
                C2162a aVar = this.f5827g;
                return context.getDrawable(aVar.f5825g == aVar.f5826h.f5821i.mo7543n() ? C3148R.C3149drawable.ic_menu_check_circle : C3148R.C3149drawable.ic_menu_check_circle_outline);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.f0$a$b */
        static final class C2164b extends C3371l implements C3351c<C2472t<Object>, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2162a f5828g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2164b(C2162a aVar) {
                super(2);
                this.f5828g = aVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7021a((C2472t<Object>) (C2472t) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7021a(C2472t<Object> tVar, int i) {
                Object obj;
                C0497t<C2068g> tVar2;
                C3370k.m12227b(tVar, "<anonymous parameter 0>");
                C2162a aVar = this.f5828g;
                int i2 = aVar.f5825g;
                if (i2 != 0) {
                    if (i2 == 1) {
                        if (!aVar.f5826h.m8604k()) {
                            tVar2 = this.f5828g.f5826h.mo7160h();
                            obj = new C2061a(20);
                        }
                        aVar = this.f5828g;
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            if (!C1787c.f5091a.mo6556a(aVar.f5826h.mo7017i())) {
                                tVar2 = this.f5828g.f5826h.mo7160h();
                                obj = new C2062b(7);
                            }
                            aVar = this.f5828g;
                        }
                        this.f5828g.f5826h.f5821i.mo7523g(-1);
                    } else {
                        if (!aVar.f5826h.m8604k()) {
                            tVar2 = this.f5828g.f5826h.mo7160h();
                            obj = new C2061a(20);
                        }
                        aVar = this.f5828g;
                    }
                    tVar2.setValue(obj);
                    this.f5828g.f5826h.f5821i.mo7521f(0);
                    this.f5828g.f5826h.f5821i.mo7523g(-1);
                }
                aVar.f5826h.f5821i.mo7521f(this.f5828g.f5825g);
                this.f5828g.f5826h.f5821i.mo7523g(-1);
            }
        }

        /* renamed from: com.fb.fluid.ui.g.b.f0$a$c */
        static final class C2165c extends C3371l implements C3349a<Unit> {

            /* renamed from: g */
            final /* synthetic */ C2162a f5829g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2165c(C2162a aVar) {
                super(0);
                this.f5829g = aVar;
            }

            public final void invoke() {
                if (!this.f5829g.f5826h.m8604k()) {
                    this.f5829g.f5826h.mo7160h().setValue(new C2061a(20));
                    this.f5829g.f5826h.f5821i.mo7521f(0);
                } else if (!C1734c.f5038h.mo6472a() || C1785b.f5090a.mo6554b(this.f5829g.f5826h.mo7017i())) {
                    this.f5829g.f5826h.mo7160h().setValue(new C2061a(27));
                } else {
                    this.f5829g.f5826h.mo7160h().setValue(new C2062b(7));
                    this.f5829g.f5826h.f5821i.mo7521f(0);
                    C1770f.m7464a((Context) this.f5829g.f5826h.mo7017i(), (int) C3148R.string.pref_threebutton_android_settings, 1);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2162a(int i, C2161f0 f0Var, List list) {
            super(1);
            this.f5825g = i;
            this.f5826h = f0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7019a((C2451i) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0088  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo7019a(com.p131fb.fluid.p148ui.p149g.p152c.C2451i r11) {
            /*
                r10 = this;
                java.lang.String r0 = "$receiver"
                kotlin.p205x.p207d.C3370k.m12227b(r11, r0)
                int r0 = r10.f5825g
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r11.mo7319a((java.lang.String) r0)
                java.lang.String r0 = "hide_navbar_mode"
                java.lang.String[] r0 = new java.lang.String[]{r0}
                r11.mo7324a((java.lang.String[]) r0)
                int r0 = r10.f5825g
                r6 = 3
                r7 = 2
                r8 = 0
                r9 = 1
                if (r0 == 0) goto L_0x0033
                if (r0 == r9) goto L_0x002f
                if (r0 == r7) goto L_0x002b
                if (r0 == r6) goto L_0x0027
                r2 = r8
                goto L_0x003b
            L_0x0027:
                r0 = 2131886437(0x7f120165, float:1.9407453E38)
                goto L_0x0036
            L_0x002b:
                r0 = 2131886439(0x7f120167, float:1.9407457E38)
                goto L_0x0036
            L_0x002f:
                r0 = 2131886441(0x7f120169, float:1.940746E38)
                goto L_0x0036
            L_0x0033:
                r0 = 2131886436(0x7f120164, float:1.940745E38)
            L_0x0036:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2 = r0
            L_0x003b:
                r3 = 0
                r4 = 5
                r5 = 0
                r1 = 0
                r0 = r11
                com.p131fb.fluid.p148ui.p149g.p152c.C2472t.m9231b(r0, r1, r2, r3, r4, r5)
                int r0 = r10.f5825g
                if (r0 == 0) goto L_0x004d
                if (r0 == r9) goto L_0x0057
                if (r0 == r7) goto L_0x0053
                if (r0 == r6) goto L_0x004f
            L_0x004d:
                r2 = r8
                goto L_0x005f
            L_0x004f:
                r0 = 2131886438(0x7f120166, float:1.9407455E38)
                goto L_0x005a
            L_0x0053:
                r0 = 2131886440(0x7f120168, float:1.9407459E38)
                goto L_0x005a
            L_0x0057:
                r0 = 2131886442(0x7f12016a, float:1.9407463E38)
            L_0x005a:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2 = r0
            L_0x005f:
                r3 = 0
                r4 = 5
                r5 = 0
                r0 = r11
                com.p131fb.fluid.p148ui.p149g.p152c.C2472t.m9227a((com.p131fb.fluid.p148ui.p149g.p152c.C2472t) r0, (java.lang.String) r1, (java.lang.Integer) r2, (kotlin.p205x.p206c.C3349a) r3, (int) r4, (java.lang.Object) r5)
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                com.fb.fluid.ui.g.b.f0$a$a r5 = new com.fb.fluid.ui.g.b.f0$a$a
                r5.<init>(r10)
                r6 = 11
                r7 = 0
                com.p131fb.fluid.p148ui.p149g.p152c.C2472t.m9225a(r0, r1, r2, r3, r4, r5, r6, r7)
                r11.mo7323a((boolean) r9)
                com.fb.fluid.ui.g.b.f0$a$b r0 = new com.fb.fluid.ui.g.b.f0$a$b
                r0.<init>(r10)
                r11.mo7315a(r0)
                int r0 = r10.f5825g
                if (r0 == r9) goto L_0x0088
                r11.mo7297a(r8)
                goto L_0x0090
            L_0x0088:
                com.fb.fluid.ui.g.b.f0$a$c r0 = new com.fb.fluid.ui.g.b.f0$a$c
                r0.<init>(r10)
                r11.mo7297a(r0)
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.p148ui.p149g.p151b.C2161f0.C2162a.mo7019a(com.fb.fluid.ui.g.c.i):void");
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.f0$b */
    static final class C2166b implements SharedPreferences.OnSharedPreferenceChangeListener {

        /* renamed from: a */
        final /* synthetic */ C2161f0 f5830a;

        C2166b(C2161f0 f0Var) {
            this.f5830a = f0Var;
        }

        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (str != null && str.hashCode() == 646662389 && str.equals("hide_navbar_mode")) {
                C2477u.m9270b(this.f5830a.mo7159g(), "hide_navbar_mode");
            }
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.f0$c */
    static final class C2167c extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        public static final C2167c f5831g = new C2167c();

        C2167c() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7023a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7023a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9228a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.header_navbar_sum), (C3350b) null, 5, (Object) null);
            C2472t.m9225a(sVar2, (Drawable) null, Integer.valueOf(C3148R.C3149drawable.ic_main_info_24px), false, (Integer) null, (C3351c) null, 29, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cc A[LOOP:0: B:20:0x00c6->B:22:0x00cc, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2161f0(android.app.Application r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            java.lang.String r2 = "app"
            kotlin.p205x.p207d.C3370k.m12227b(r1, r2)
            r25.<init>(r26)
            r0.f5824l = r1
            com.fb.fluid.utils.preferences.h r1 = new com.fb.fluid.utils.preferences.h
            android.app.Application r2 = r0.f5824l
            android.content.Context r2 = r2.getBaseContext()
            java.lang.String r3 = "app.baseContext"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r2, (java.lang.String) r3)
            r1.<init>(r2)
            r0.f5821i = r1
            androidx.lifecycle.t r1 = new androidx.lifecycle.t
            r1.<init>()
            r0.f5823k = r1
            r1 = 2
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2[r3] = r4
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2[r4] = r5
            java.util.List r2 = kotlin.p195s.C3284j.m12074d(r2)
            com.fb.fluid.l.q.a$a r5 = com.p131fb.fluid.p135l.p140q.C1783a.f5089a
            boolean r5 = r5.mo6545h()
            r6 = 3
            if (r5 == 0) goto L_0x0055
            com.fb.fluid.l.c$a r5 = com.p131fb.fluid.p135l.C1734c.f5038h
            boolean r5 = r5.mo6477f()
            if (r5 == 0) goto L_0x0055
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
        L_0x0051:
            r2.add(r5)
            goto L_0x0072
        L_0x0055:
            com.fb.fluid.l.q.a$a r5 = com.p131fb.fluid.p135l.p140q.C1783a.f5089a
            boolean r5 = r5.mo6540c()
            if (r5 != 0) goto L_0x0065
            com.fb.fluid.l.q.a$a r5 = com.p131fb.fluid.p135l.p140q.C1783a.f5089a
            boolean r5 = r5.mo6539b()
            if (r5 == 0) goto L_0x0072
        L_0x0065:
            com.fb.fluid.l.c$a r5 = com.p131fb.fluid.p135l.C1734c.f5038h
            boolean r5 = r5.mo6477f()
            if (r5 == 0) goto L_0x0072
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            goto L_0x0051
        L_0x0072:
            com.fb.fluid.ui.g.b.f0$b r5 = new com.fb.fluid.ui.g.b.f0$b
            r5.<init>(r0)
            r0.f5822j = r5
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r5 = r0.f5822j
            com.fb.fluid.utils.preferences.h r7 = r0.f5821i
            com.p131fb.fluid.utils.preferences.C2526g.m9416a(r5, r7)
            com.fb.fluid.utils.preferences.h r5 = r0.f5821i
            int r5 = r5.mo7543n()
            if (r5 == r4) goto L_0x008b
            if (r5 == r1) goto L_0x008b
            goto L_0x0096
        L_0x008b:
            boolean r5 = r25.m8604k()
            if (r5 != 0) goto L_0x0096
            com.fb.fluid.utils.preferences.h r5 = r0.f5821i
            r5.mo7521f((int) r3)
        L_0x0096:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.fb.fluid.ui.g.c.c0 r18 = new com.fb.fluid.ui.g.c.c0
            r8 = 0
            r7 = 2131886245(0x7f1200a5, float:1.9407063E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r10 = 0
            r13 = 1
            r12 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            r16 = 197(0xc5, float:2.76E-43)
            r17 = 0
            r7 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r5[r3] = r18
            java.util.List r5 = kotlin.p195s.C3284j.m12074d(r5)
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = kotlin.p195s.C3285k.m12075a(r2, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r2.iterator()
        L_0x00c6:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00e4
            java.lang.Object r9 = r8.next()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            com.fb.fluid.ui.g.c.i r10 = new com.fb.fluid.ui.g.c.i
            com.fb.fluid.ui.g.b.f0$a r11 = new com.fb.fluid.ui.g.b.f0$a
            r11.<init>(r9, r0, r2)
            r10.<init>(r11)
            r7.add(r10)
            goto L_0x00c6
        L_0x00e4:
            r5.addAll(r7)
            com.fb.fluid.ui.g.c.t[] r1 = new com.p131fb.fluid.p148ui.p149g.p152c.C2472t[r1]
            com.fb.fluid.ui.g.c.k r2 = new com.fb.fluid.ui.g.c.k
            r7 = 0
            r2.<init>(r7, r7, r6, r7)
            r1[r3] = r2
            com.fb.fluid.ui.g.c.s r2 = new com.fb.fluid.ui.g.c.s
            com.fb.fluid.ui.g.b.f0$c r3 = com.p131fb.fluid.p148ui.p149g.p151b.C2161f0.C2167c.f5831g
            r2.<init>(r3)
            r1[r4] = r2
            java.util.List r1 = kotlin.p195s.C3284j.m12072c(r1)
            r5.addAll(r1)
            c.a.b.f.a r19 = r25.mo7159g()
            r21 = 0
            r22 = 0
            r23 = 6
            r24 = 0
            r20 = r5
            p054c.p055a.p067b.p068f.C1116a.C1117a.m5570a(r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.p148ui.p149g.p151b.C2161f0.<init>(android.app.Application):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final boolean m8604k() {
        return C1795a.f5111a.mo6586c(this.f5824l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo2564f() {
        super.mo2564f();
        C2526g.m9417b(this.f5822j, this.f5821i);
    }

    /* renamed from: i */
    public final Application mo7017i() {
        return this.f5824l;
    }

    /* renamed from: j */
    public final C0497t<C2068g> mo7018j() {
        return this.f5823k;
    }
}
