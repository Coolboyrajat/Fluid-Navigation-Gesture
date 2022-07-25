package com.p131fb.fluid.p148ui.p149g.p152c;

import android.content.Context;
import android.view.View;
import com.p131fb.fluid.p148ui.views.PreferenceView;
import kotlin.C3265l;
import kotlin.Unit;
import kotlin.p192b0.C3204e;
import kotlin.p197u.C3309c;
import kotlin.p197u.p199i.p200a.C3339l;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3368i;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3383x;
import kotlin.p205x.p207d.C3384y;
import kotlinx.coroutines.C3418e0;
import p054c.p055a.p067b.C1108a;
import p054c.p055a.p067b.C1114e;
import p054c.p055a.p067b.p071i.C1139b;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.c.v */
public final class C2479v {

    /* renamed from: com.fb.fluid.ui.g.c.v$a */
    static final class C2480a extends C3339l implements C3351c<C3418e0, C3309c<? super Unit>, Object> {

        /* renamed from: j */
        private C3418e0 f6253j;

        /* renamed from: k */
        Object f6254k;

        /* renamed from: l */
        int f6255l;

        /* renamed from: m */
        final /* synthetic */ PreferenceView f6256m;

        /* renamed from: n */
        final /* synthetic */ C2485w f6257n;

        /* renamed from: o */
        final /* synthetic */ C2472t f6258o;

        /* renamed from: p */
        final /* synthetic */ boolean f6259p;

        /* renamed from: q */
        final /* synthetic */ Context f6260q;

        /* renamed from: r */
        final /* synthetic */ C3383x f6261r;

        /* renamed from: s */
        final /* synthetic */ C3350b f6262s;

        /* renamed from: t */
        final /* synthetic */ int f6263t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2480a(PreferenceView preferenceView, C3309c cVar, C2485w wVar, C2472t tVar, boolean z, Context context, C3383x xVar, C3350b bVar, int i) {
            super(2, cVar);
            this.f6256m = preferenceView;
            this.f6257n = wVar;
            this.f6258o = tVar;
            this.f6259p = z;
            this.f6260q = context;
            this.f6261r = xVar;
            this.f6262s = bVar;
            this.f6263t = i;
        }

        /* renamed from: a */
        public final Object mo6125a(Object obj, Object obj2) {
            return ((C2480a) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
        }

        /* renamed from: a */
        public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
            C3370k.m12227b(cVar, "completion");
            C2480a aVar = new C2480a(this.f6256m, cVar, this.f6257n, this.f6258o, this.f6259p, this.f6260q, this.f6261r, this.f6262s, this.f6263t);
            aVar.f6253j = (C3418e0) obj;
            return aVar;
        }

        /* renamed from: b */
        public final Object mo6618b(Object obj) {
            Object a = C3326d.m12146a();
            int i = this.f6255l;
            if (i == 0) {
                C3265l.m11979a(obj);
                C3418e0 e0Var = this.f6253j;
                C2472t tVar = this.f6258o;
                PreferenceView preferenceView = this.f6256m;
                boolean z = this.f6259p;
                this.f6254k = e0Var;
                this.f6255l = 1;
                if (tVar.mo7325a(preferenceView, z, (C3309c<? super Unit>) this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C3418e0 e0Var2 = (C3418e0) this.f6254k;
                C3265l.m11979a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.fb.fluid.ui.g.c.v$b */
    static final class C2481b extends C3371l implements C3350b<Unit, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2472t f6264g;

        /* renamed from: h */
        final /* synthetic */ C3350b f6265h;

        /* renamed from: i */
        final /* synthetic */ int f6266i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2481b(C2485w wVar, C2472t tVar, boolean z, Context context, C3383x xVar, C3350b bVar, int i) {
            super(1);
            this.f6264g = tVar;
            this.f6265h = bVar;
            this.f6266i = i;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7344a((Unit) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7344a(Unit unit) {
            C3351c i;
            C3370k.m12227b(unit, "it");
            C3350b bVar = this.f6265h;
            if ((bVar == null || !((Boolean) bVar.mo5146a(this.f6264g)).booleanValue()) && (i = this.f6264g.mo7340i()) != null) {
                i.mo6125a(this.f6264g, Integer.valueOf(this.f6266i));
            }
        }
    }

    /* renamed from: com.fb.fluid.ui.g.c.v$c */
    static final class C2482c extends C3371l implements C3350b<Unit, Unit> {

        /* renamed from: g */
        final /* synthetic */ C2472t f6267g;

        /* renamed from: h */
        final /* synthetic */ C3350b f6268h;

        /* renamed from: i */
        final /* synthetic */ int f6269i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2482c(C2485w wVar, C2472t tVar, boolean z, Context context, C3383x xVar, C3350b bVar, int i) {
            super(1);
            this.f6267g = tVar;
            this.f6268h = bVar;
            this.f6269i = i;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7345a((Unit) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7345a(Unit unit) {
            C3351c j;
            C3370k.m12227b(unit, "it");
            C3350b bVar = this.f6268h;
            if ((bVar == null || ((Boolean) bVar.mo5146a(this.f6267g)).booleanValue()) && (j = this.f6267g.mo7341j()) != null) {
                j.mo6125a(this.f6267g, Integer.valueOf(this.f6269i));
            }
        }
    }

    /* renamed from: com.fb.fluid.ui.g.c.v$d */
    static final class C2483d extends C3371l implements C3352d<C2485w, Integer, C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ C3350b f6270g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2483d(C3350b bVar) {
            super(3);
            this.f6270g = bVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
            mo7346a((C2485w) obj, ((Number) obj2).intValue(), (C2471s) obj3);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7346a(C2485w wVar, int i, C2471s sVar) {
            C3370k.m12227b(wVar, "$receiver");
            C3370k.m12227b(sVar, "item");
            C2479v.m9275a(wVar, this.f6270g, i, sVar);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.c.v$e */
    static final /* synthetic */ class C2484e extends C3368i implements C3350b<View, C2485w> {

        /* renamed from: j */
        public static final C2484e f6271j = new C2484e();

        C2484e() {
            super(1);
        }

        /* renamed from: a */
        public final C2485w mo5146a(View view) {
            C3370k.m12227b(view, "p1");
            return new C2485w(view);
        }

        /* renamed from: b */
        public final String mo6062b() {
            return "<init>";
        }

        /* renamed from: h */
        public final C3204e mo6063h() {
            return C3384y.m12254a(C2485w.class);
        }

        /* renamed from: j */
        public final String mo6064j() {
            return "<init>(Landroid/view/View;)V";
        }
    }

    /* renamed from: a */
    public static final C1108a<C2471s, C2485w> m9273a(C1114e eVar, C3350b<? super C2471s, Boolean> bVar) {
        C3370k.m12227b(eVar, "$this$withPreferenceItem");
        String name = C2471s.class.getName();
        C3370k.m12223a((Object) name, "PreferenceItem::class.java.name");
        C1139b bVar2 = new C1139b(eVar, name);
        bVar2.mo5186a(C2484e.f6271j, new C2483d(bVar));
        eVar.mo5192a(bVar2.mo5238f(), C3148R.layout.item_preference, bVar2);
        return bVar2;
    }

    /* renamed from: a */
    public static /* synthetic */ C1108a m9274a(C1114e eVar, C3350b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = null;
        }
        return m9273a(eVar, bVar);
    }

    /* JADX WARNING: type inference failed for: r8v4, types: [kotlin.x.c.b] */
    /* JADX WARNING: type inference failed for: r0v22, types: [com.fb.fluid.ui.g.c.v$c] */
    /* JADX WARNING: type inference failed for: r0v23, types: [com.fb.fluid.ui.g.c.v$b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <IT, T extends com.p131fb.fluid.p148ui.p149g.p152c.C2472t<IT>> void m9275a(com.p131fb.fluid.p148ui.p149g.p152c.C2485w r23, kotlin.p205x.p206c.C3350b<? super T, java.lang.Boolean> r24, int r25, T r26) {
        /*
            r10 = r23
            r11 = r26
            java.lang.String r0 = "$this$onDefaultPreferenceBind"
            kotlin.p205x.p207d.C3370k.m12227b(r10, r0)
            java.lang.String r0 = "item"
            kotlin.p205x.p207d.C3370k.m12227b(r11, r0)
            boolean r12 = r26.mo7342k()
            android.view.View r0 = r10.f2168f
            java.lang.String r1 = "itemView"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r1)
            android.content.Context r13 = r0.getContext()
            kotlin.x.d.x r14 = new kotlin.x.d.x
            r14.<init>()
            r15 = 0
            r14.f8049f = r15
            com.fb.fluid.ui.views.PreferenceView r9 = r23.mo7348C()
            boolean r0 = r26.mo7335d()
            r16 = 0
            r8 = 1
            if (r0 != 0) goto L_0x0041
            java.lang.Object r0 = r26.mo7336e()
            if (r0 == 0) goto L_0x003f
            boolean r0 = r26.mo7343l()
            if (r0 != 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r0 = 0
            goto L_0x0042
        L_0x0041:
            r0 = 1
        L_0x0042:
            r9.setForceStartSpacing(r0)
            kotlinx.coroutines.j1 r0 = r23.mo3763B()
            if (r0 == 0) goto L_0x004e
            kotlinx.coroutines.C3499j1.C3500a.m12631a(r0, r15, r8, r15)
        L_0x004e:
            kotlinx.coroutines.t1 r0 = kotlinx.coroutines.C3536t0.m12778c()
            kotlinx.coroutines.e0 r17 = kotlinx.coroutines.C3422f0.m12341a(r0)
            r18 = 0
            r19 = 0
            com.fb.fluid.ui.g.c.v$a r20 = new com.fb.fluid.ui.g.c.v$a
            r2 = 0
            r0 = r20
            r1 = r9
            r3 = r23
            r4 = r26
            r5 = r12
            r6 = r13
            r7 = r14
            r21 = 1
            r8 = r24
            r22 = r9
            r9 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r5 = 3
            r0 = 0
            r6 = 0
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            kotlinx.coroutines.j1 r1 = kotlinx.coroutines.C3417e.m12335a(r1, r2, r3, r4, r5, r6)
            r10.mo7349a(r1)
            java.lang.String r1 = "context"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r13, (java.lang.String) r1)
            java.lang.String r2 = r11.mo7334c(r13)
            r7 = 0
            r8 = 2
            r3 = 0
            r5 = 2
            r1 = r22
            r4 = r12
            com.p131fb.fluid.p148ui.views.PreferenceView.m9370c(r1, r2, r3, r4, r5, r6)
            java.lang.String r2 = r11.mo7332b((android.content.Context) r13)
            com.p131fb.fluid.p148ui.views.PreferenceView.m9369b(r1, r2, r3, r4, r5, r6)
            java.lang.String r2 = r11.mo7326a((android.content.Context) r13)
            r3 = r7
            r5 = r8
            r6 = r0
            com.p131fb.fluid.p148ui.views.PreferenceView.m9367a(r1, r2, r3, r4, r5, r6)
            T r0 = r14.f8049f
            d.a.o.b r0 = (p155d.p156a.p160o.C2810b) r0
            if (r0 == 0) goto L_0x00b1
            r0.mo6027a()
        L_0x00b1:
            if (r12 == 0) goto L_0x00cf
            kotlin.x.c.c r0 = r26.mo7340i()
            if (r0 != 0) goto L_0x00bb
            if (r24 != 0) goto L_0x00cf
        L_0x00bb:
            com.fb.fluid.ui.g.c.v$b r8 = new com.fb.fluid.ui.g.c.v$b
            r0 = r8
            r1 = r23
            r2 = r26
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x00cc:
            r0 = r22
            goto L_0x00eb
        L_0x00cf:
            if (r12 != 0) goto L_0x00f0
            kotlin.x.c.c r0 = r26.mo7341j()
            if (r0 != 0) goto L_0x00d9
            if (r24 != 0) goto L_0x00f0
        L_0x00d9:
            com.fb.fluid.ui.g.c.v$c r8 = new com.fb.fluid.ui.g.c.v$c
            r0 = r8
            r1 = r23
            r2 = r26
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00cc
        L_0x00eb:
            d.a.o.b r15 = com.p131fb.fluid.p135l.p139p.C1782r.m7488a(r0, r8)
            goto L_0x00f5
        L_0x00f0:
            r0 = r22
            r0.setOnClickListener(r15)
        L_0x00f5:
            r14.f8049f = r15
            boolean r1 = r0.hasOnClickListeners()
            r0.setClickable(r1)
            java.lang.Integer r1 = r26.mo7331b()
            if (r1 == 0) goto L_0x010b
            int r16 = r1.intValue()
            r1 = r16
            goto L_0x010c
        L_0x010b:
            r1 = 0
        L_0x010c:
            r0.setBackgroundColor(r1)
            boolean r1 = r26.mo7338g()
            r1 = r1 ^ 1
            r0.setMinHeightMode(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.p148ui.p149g.p152c.C2479v.m9275a(com.fb.fluid.ui.g.c.w, kotlin.x.c.b, int, com.fb.fluid.ui.g.c.t):void");
    }

    /* renamed from: a */
    public static /* synthetic */ void m9276a(C2485w wVar, C3350b bVar, int i, C2472t tVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bVar = null;
        }
        m9275a(wVar, bVar, i, tVar);
    }
}
