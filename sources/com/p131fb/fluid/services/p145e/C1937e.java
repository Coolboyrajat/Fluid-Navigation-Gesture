package com.p131fb.fluid.services.p145e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.p131fb.fluid.data.Trigger;
import com.p131fb.fluid.data.TriggerButton;
import com.p131fb.fluid.p135l.C1743i;
import com.p131fb.fluid.p135l.p139p.C1767c;
import com.p131fb.fluid.p135l.p139p.C1774j;
import com.p131fb.fluid.p135l.p139p.C1780p;
import com.p131fb.fluid.p135l.p143t.C1798b;
import com.p131fb.fluid.p148ui.views.C2513b;
import com.p131fb.fluid.p148ui.views.C2514c;
import com.p131fb.fluid.services.p145e.p147h.C1988a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.C3256e;
import kotlin.C3261j;
import kotlin.C3268o;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p192b0.C3204e;
import kotlin.p192b0.C3208i;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p197u.p199i.p200a.C3339l;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p206c.C3353e;
import kotlin.p205x.p206c.C3354f;
import kotlin.p205x.p206c.C3355g;
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
import p054c.p079d.p080a.p081a.p082a.C1165a;
import p155d.p156a.p160o.C2809a;
import p155d.p156a.p162q.C2827e;
import p155d.p156a.p162q.C2830h;
import p190io.objectbox.model.PropertyFlags;

@SuppressLint({"ClickableViewAccessibility", "RtlHardcoded"})
/* renamed from: com.fb.fluid.services.e.e */
public final class C1937e extends C1917a {

    /* renamed from: Q */
    static final /* synthetic */ C3208i[] f5384Q;

    /* renamed from: R */
    public static final C1949f f5385R = new C1949f((C3366g) null);
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final long f5386A;

    /* renamed from: B */
    private int f5387B;

    /* renamed from: C */
    private int f5388C;

    /* renamed from: D */
    private int f5389D;

    /* renamed from: E */
    private int f5390E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f5391F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public int f5392G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public final C1798b<C3261j<Integer, Boolean>> f5393H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final int[] f5394I;

    /* renamed from: J */
    private C2809a f5395J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final C2514c f5396K;

    /* renamed from: L */
    private Trigger f5397L;

    /* renamed from: M */
    private final C3354f<Integer, String, View, Integer, Integer, Unit> f5398M;

    /* renamed from: N */
    private final C3351c<Boolean, Boolean, Unit> f5399N;

    /* renamed from: O */
    private final C3351c<TriggerButton, Boolean, Drawable> f5400O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final C1988a f5401P;

    /* renamed from: k */
    private final C3256e f5402k;

    /* renamed from: l */
    private final C2827e<Integer> f5403l = new C1953j(this);

    /* renamed from: m */
    private final C2827e<Integer> f5404m = new C1955k(this);

    /* renamed from: n */
    private final C2827e<Boolean> f5405n = new C1951h(this);

    /* renamed from: o */
    private final C2827e<Boolean> f5406o = new C1950g(this);

    /* renamed from: p */
    private final C2827e<Boolean> f5407p = new C1952i(this);

    /* renamed from: q */
    private boolean f5408q;

    /* renamed from: r */
    private boolean f5409r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f5410s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f5411t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f5412u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f5413v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f5414w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public long f5415x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public long f5416y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final long f5417z;

    /* renamed from: com.fb.fluid.services.e.e$a */
    static final class C1938a<T> implements C2827e<C3261j<? extends Integer, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C1937e f5418a;

        /* renamed from: com.fb.fluid.services.e.e$a$a */
        static final class C1939a extends C3339l implements C3351c<C3418e0, C3309c<? super Unit>, Object> {

            /* renamed from: j */
            private C3418e0 f5419j;

            /* renamed from: k */
            int f5420k;

            /* renamed from: l */
            final /* synthetic */ C1938a f5421l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1939a(C1938a aVar, C3309c cVar) {
                super(2, cVar);
                this.f5421l = aVar;
            }

            /* renamed from: a */
            public final Object mo6125a(Object obj, Object obj2) {
                return ((C1939a) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
            }

            /* renamed from: a */
            public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
                C3370k.m12227b(cVar, "completion");
                C1939a aVar = new C1939a(this.f5421l, cVar);
                aVar.f5419j = (C3418e0) obj;
                return aVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
                r0 = r3.f5421l.f5418a.mo6756v().mo6125a(r0, ((kotlin.C3261j) com.p131fb.fluid.services.p145e.C1937e.m7938q(r3.f5421l.f5418a).mo6589b()).mo9937d());
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object mo6618b(java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object unused = kotlin.p197u.p198h.C3326d.m12146a()
                    int r0 = r3.f5420k
                    if (r0 != 0) goto L_0x005a
                    kotlin.C3265l.m11979a((java.lang.Object) r4)
                    com.fb.fluid.services.e.e$a r4 = r3.f5421l
                    com.fb.fluid.services.e.e r4 = r4.f5418a
                    com.fb.fluid.services.e.h.a r4 = r4.f5401P
                    com.fb.fluid.services.e.e$a r0 = r3.f5421l
                    com.fb.fluid.services.e.e r0 = r0.f5418a
                    int r0 = r0.m7907L()
                    r1 = -1
                    if (r0 == r1) goto L_0x0054
                    com.fb.fluid.services.e.e$a r0 = r3.f5421l
                    com.fb.fluid.services.e.e r0 = r0.f5418a
                    com.fb.fluid.data.TriggerButton r0 = r0.m7906K()
                    if (r0 == 0) goto L_0x004f
                    com.fb.fluid.services.e.e$a r1 = r3.f5421l
                    com.fb.fluid.services.e.e r1 = r1.f5418a
                    kotlin.x.c.c r1 = r1.mo6756v()
                    com.fb.fluid.services.e.e$a r2 = r3.f5421l
                    com.fb.fluid.services.e.e r2 = r2.f5418a
                    com.fb.fluid.l.t.b r2 = r2.f5393H
                    java.lang.Object r2 = r2.mo6589b()
                    kotlin.j r2 = (kotlin.C3261j) r2
                    java.lang.Object r2 = r2.mo9937d()
                    java.lang.Object r0 = r1.mo6125a(r0, r2)
                    android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
                    if (r0 == 0) goto L_0x004f
                    java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                    r1.<init>(r0)
                    goto L_0x0050
                L_0x004f:
                    r1 = 0
                L_0x0050:
                    r4.mo6716a((java.lang.ref.WeakReference<android.graphics.drawable.Drawable>) r1)
                    goto L_0x0057
                L_0x0054:
                    r4.mo6712a()
                L_0x0057:
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                L_0x005a:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.p145e.C1937e.C1938a.C1939a.mo6618b(java.lang.Object):java.lang.Object");
            }
        }

        C1938a(C1937e eVar, Context context) {
            this.f5418a = eVar;
        }

        /* renamed from: a */
        public final void accept(C3261j<Integer, Boolean> jVar) {
            if (this.f5418a.mo6744C().mo6391i()) {
                this.f5418a.f5401P.mo6712a();
            } else {
                C3499j1 unused = C3417e.m12335a(C3422f0.m12341a(C3536t0.m12776a()), (C3314f) null, (C3430h0) null, new C1939a(this, (C3309c) null), 3, (Object) null);
            }
        }
    }

    /* renamed from: com.fb.fluid.services.e.e$b */
    static final class C1940b<T> implements C2827e<C3261j<? extends Integer, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C1937e f5422a;

        C1940b(C1937e eVar, Context context) {
            this.f5422a = eVar;
        }

        /* renamed from: a */
        public final void accept(C3261j<Integer, Boolean> jVar) {
            this.f5422a.mo6743B().mo6125a(true, Boolean.valueOf(true ^ this.f5422a.m7904I()));
        }
    }

    /* renamed from: com.fb.fluid.services.e.e$c */
    static final class C1941c extends C3371l implements C3350b<C1743i, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1937e f5423g;

        /* renamed from: com.fb.fluid.services.e.e$c$a */
        static final class C1942a extends C3371l implements C3350b<MotionEvent, Unit> {

            /* renamed from: g */
            final /* synthetic */ C1941c f5424g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1942a(C1941c cVar) {
                super(1);
                this.f5424g = cVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                mo6764a((MotionEvent) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6764a(MotionEvent motionEvent) {
                C3370k.m12227b(motionEvent, "it");
                this.f5424g.f5423g.m7908M();
                this.f5424g.f5423g.f5401P.mo6718a(this.f5424g.f5423g.mo6744C());
            }
        }

        /* renamed from: com.fb.fluid.services.e.e$c$b */
        static final class C1943b extends C3371l implements C3350b<MotionEvent, Unit> {

            /* renamed from: g */
            final /* synthetic */ C1941c f5425g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1943b(C1941c cVar) {
                super(1);
                this.f5425g = cVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                mo6765a((MotionEvent) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6765a(MotionEvent motionEvent) {
                TriggerButton p;
                C3370k.m12227b(motionEvent, "event");
                if (this.f5425g.f5423g.f5401P.isVisible() && !this.f5425g.f5423g.f5414w && ((Number) ((C3261j) this.f5425g.f5423g.f5393H.mo6589b()).mo9936c()).intValue() != -1 && (p = this.f5425g.f5423g.m7906K()) != null) {
                    this.f5425g.f5423g.mo6721o().mo6612a(Integer.valueOf(((Boolean) ((C3261j) this.f5425g.f5423g.f5393H.mo6589b()).mo9937d()).booleanValue() ? p.mo6410c() : p.mo6412d()), ((Boolean) ((C3261j) this.f5425g.f5423g.f5393H.mo6589b()).mo9937d()).booleanValue() ? p.mo6406b() : p.mo6400a(), this.f5425g.f5423g.mo6703h(), Integer.valueOf((int) motionEvent.getRawX()), Integer.valueOf((int) motionEvent.getRawY()));
                }
                this.f5425g.f5423g.f5401P.dismiss();
                this.f5425g.f5423g.m7908M();
            }
        }

        /* renamed from: com.fb.fluid.services.e.e$c$c */
        static final class C1944c extends C3371l implements C3350b<MotionEvent, Unit> {

            /* renamed from: g */
            final /* synthetic */ C1941c f5426g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1944c(C1941c cVar) {
                super(1);
                this.f5426g = cVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                mo6766a((MotionEvent) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6766a(MotionEvent motionEvent) {
                C3370k.m12227b(motionEvent, "it");
                this.f5426g.f5423g.f5401P.dismiss();
                this.f5426g.f5423g.m7908M();
            }
        }

        /* renamed from: com.fb.fluid.services.e.e$c$d */
        static final class C1945d extends C3371l implements C3351c<MotionEvent, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C1941c f5427g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1945d(C1941c cVar) {
                super(2);
                this.f5427g = cVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo6767a((MotionEvent) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo6767a(MotionEvent motionEvent, int i) {
                int i2;
                C3370k.m12227b(motionEvent, "event");
                if (!this.f5427g.f5423g.f5401P.mo6719b()) {
                    this.f5427g.f5423g.f5401P.mo6718a(this.f5427g.f5423g.mo6744C());
                }
                C1988a d = this.f5427g.f5423g.f5401P;
                int[] k = this.f5427g.f5423g.f5394I;
                int i3 = 0;
                k[0] = this.f5427g.f5423g.mo6757w();
                k[1] = this.f5427g.f5423g.mo6758x();
                float x = motionEvent.getX() + ((float) this.f5427g.f5423g.f5394I[0]);
                float y = motionEvent.getY() + ((float) this.f5427g.f5423g.f5394I[1]);
                int o = this.f5427g.f5423g.m7905J();
                if (o == 3) {
                    i2 = (int) motionEvent.getRawY();
                } else if (o != 5) {
                    if (o == 48) {
                        i3 = (int) motionEvent.getRawX();
                    } else if (o == 80) {
                        i3 = (int) motionEvent.getRawX();
                        i2 = -1;
                    }
                    i2 = 0;
                } else {
                    i2 = (int) motionEvent.getRawY();
                    i3 = -1;
                }
                if (this.f5427g.f5423g.m7903H()) {
                    d.mo6713a(this.f5427g.f5423g.m7905J(), Integer.valueOf(i3), Integer.valueOf(i2), Float.valueOf(x), Float.valueOf(y));
                }
            }
        }

        /* renamed from: com.fb.fluid.services.e.e$c$e */
        static final class C1946e extends C3371l implements C3353e<MotionEvent, MotionEvent, Float, Float, Boolean> {

            /* renamed from: g */
            final /* synthetic */ C1941c f5428g;

            /* renamed from: h */
            final /* synthetic */ C1743i f5429h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1946e(C1941c cVar, C1743i iVar) {
                super(4);
                this.f5428g = cVar;
                this.f5429h = iVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6514a(Object obj, Object obj2, Object obj3, Object obj4) {
                return Boolean.valueOf(mo6768a((MotionEvent) obj, (MotionEvent) obj2, ((Number) obj3).floatValue(), ((Number) obj4).floatValue()));
            }

            /* JADX WARNING: Code restructure failed: missing block: B:116:0x0264, code lost:
                if (true == (!r1 && !r0.f5428g.f5423g.mo6745D() && com.p131fb.fluid.services.p145e.C1937e.m7940s(r0.f5428g.f5423g) == 5 && r0.f5428g.f5423g.mo6744C().mo6397o())) goto L_0x03ba;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0077, code lost:
                r11 = 48;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a4, code lost:
                if (r0.f5429h.mo6491a() > ((float) 0)) goto L_0x00ca;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:196:0x03b8, code lost:
                if (true == (!r1 && !r0.f5428g.f5423g.mo6745D() && com.p131fb.fluid.services.p145e.C1937e.m7940s(r0.f5428g.f5423g) == 5 && r0.f5428g.f5423g.mo6744C().mo6397o())) goto L_0x03ba;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:198:0x03be, code lost:
                r1 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c8, code lost:
                if (r0.f5429h.mo6491a() > ((float) 0)) goto L_0x00ca;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:238:0x05d0, code lost:
                if (com.p131fb.fluid.services.p145e.C1937e.m7924c(r0.f5428g.f5423g, r20.getRawX(), r20.getRawY(), r21.getRawX(), r21.getRawY()) == false) goto L_0x05d2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:239:0x05d2, code lost:
                r13 = -1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cc, code lost:
                r11 = 3;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:240:0x05d5, code lost:
                r13 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:255:0x06a9, code lost:
                if (com.p131fb.fluid.services.p145e.C1937e.m7924c(r0.f5428g.f5423g, r20.getRawX(), r20.getRawY(), r21.getRawX(), r21.getRawY()) == false) goto L_0x05d2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d7, code lost:
                if (r0.f5429h.mo6497b() > ((float) 0)) goto L_0x0074;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0072, code lost:
                if (r0.f5429h.mo6497b() > ((float) 0)) goto L_0x0074;
             */
            /* JADX WARNING: Removed duplicated region for block: B:124:0x028c  */
            /* JADX WARNING: Removed duplicated region for block: B:125:0x028e  */
            /* JADX WARNING: Removed duplicated region for block: B:127:0x0293  */
            /* JADX WARNING: Removed duplicated region for block: B:200:0x03c1  */
            /* JADX WARNING: Removed duplicated region for block: B:202:0x03e9  */
            /* JADX WARNING: Removed duplicated region for block: B:265:0x06f3  */
            /* JADX WARNING: Removed duplicated region for block: B:266:0x06f5  */
            /* JADX WARNING: Removed duplicated region for block: B:280:0x0773  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x00fa  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x00fc  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean mo6768a(android.view.MotionEvent r20, android.view.MotionEvent r21, float r22, float r23) {
                /*
                    r19 = this;
                    r0 = r19
                    java.lang.String r1 = "eventDown"
                    r2 = r20
                    kotlin.p205x.p207d.C3370k.m12227b(r2, r1)
                    java.lang.String r1 = "event"
                    r3 = r21
                    kotlin.p205x.p207d.C3370k.m12227b(r3, r1)
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    int r1 = r1.f5412u
                    r4 = 2
                    r5 = 80
                    r6 = 48
                    r7 = 5
                    r8 = 3
                    r9 = 0
                    r10 = 1
                    if (r1 != 0) goto L_0x0431
                    com.fb.fluid.l.i r1 = r0.f5429h
                    float r1 = r1.mo6491a()
                    float r1 = java.lang.Math.abs(r1)
                    com.fb.fluid.l.i r11 = r0.f5429h
                    float r11 = r11.mo6497b()
                    float r11 = java.lang.Math.abs(r11)
                    float r1 = java.lang.Math.max(r1, r11)
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    int r11 = r11.f5391F
                    float r11 = (float) r11
                    int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                    if (r1 <= 0) goto L_0x0431
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    boolean r11 = r1.mo6745D()
                    if (r11 != 0) goto L_0x007a
                    com.fb.fluid.l.i r11 = r0.f5429h
                    float r11 = r11.mo6497b()
                    float r11 = java.lang.Math.abs(r11)
                    com.fb.fluid.services.e.e$c r12 = r0.f5428g
                    com.fb.fluid.services.e.e r12 = r12.f5423g
                    int r12 = r12.f5392G
                    float r12 = (float) r12
                    int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
                    if (r11 <= 0) goto L_0x007a
                    com.fb.fluid.l.i r11 = r0.f5429h
                    float r11 = r11.mo6497b()
                    float r12 = (float) r9
                    int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
                    if (r11 <= 0) goto L_0x0077
                L_0x0074:
                    r11 = 80
                    goto L_0x00da
                L_0x0077:
                    r11 = 48
                    goto L_0x00da
                L_0x007a:
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    boolean r11 = r11.mo6745D()
                    if (r11 == 0) goto L_0x00a7
                    com.fb.fluid.l.i r11 = r0.f5429h
                    float r11 = r11.mo6491a()
                    float r11 = java.lang.Math.abs(r11)
                    com.fb.fluid.services.e.e$c r12 = r0.f5428g
                    com.fb.fluid.services.e.e r12 = r12.f5423g
                    int r12 = r12.f5392G
                    float r12 = (float) r12
                    int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
                    if (r11 <= 0) goto L_0x00a7
                    com.fb.fluid.l.i r11 = r0.f5429h
                    float r11 = r11.mo6491a()
                    float r12 = (float) r9
                    int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
                    if (r11 <= 0) goto L_0x00cc
                    goto L_0x00ca
                L_0x00a7:
                    com.fb.fluid.l.i r11 = r0.f5429h
                    float r11 = r11.mo6491a()
                    float r11 = java.lang.Math.abs(r11)
                    com.fb.fluid.l.i r12 = r0.f5429h
                    float r12 = r12.mo6497b()
                    float r12 = java.lang.Math.abs(r12)
                    int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
                    if (r11 <= 0) goto L_0x00ce
                    com.fb.fluid.l.i r11 = r0.f5429h
                    float r11 = r11.mo6491a()
                    float r12 = (float) r9
                    int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
                    if (r11 <= 0) goto L_0x00cc
                L_0x00ca:
                    r11 = 5
                    goto L_0x00da
                L_0x00cc:
                    r11 = 3
                    goto L_0x00da
                L_0x00ce:
                    com.fb.fluid.l.i r11 = r0.f5429h
                    float r11 = r11.mo6497b()
                    float r12 = (float) r9
                    int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
                    if (r11 <= 0) goto L_0x0077
                    goto L_0x0074
                L_0x00da:
                    r1.f5412u = r11
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    com.fb.fluid.data.Trigger r1 = r1.mo6744C()
                    int r1 = r1.mo6388g()
                    if (r1 == r8) goto L_0x00fc
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    com.fb.fluid.data.Trigger r1 = r1.mo6744C()
                    int r1 = r1.mo6388g()
                    if (r1 != r7) goto L_0x00fa
                    goto L_0x00fc
                L_0x00fa:
                    r1 = 0
                    goto L_0x00fd
                L_0x00fc:
                    r1 = 1
                L_0x00fd:
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    int r11 = r11.f5411t
                    r12 = 8388613(0x800005, float:1.175495E-38)
                    r13 = 8388611(0x800003, float:1.1754948E-38)
                    if (r11 == 0) goto L_0x0268
                    if (r11 == r10) goto L_0x0268
                    if (r11 == r4) goto L_0x0268
                    if (r1 == 0) goto L_0x0137
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    boolean r11 = r11.mo6745D()
                    if (r11 == 0) goto L_0x0137
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    int r11 = r11.f5412u
                    if (r11 != r6) goto L_0x0137
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    com.fb.fluid.data.Trigger r11 = r11.mo6744C()
                    boolean r11 = r11.mo6398p()
                    if (r11 == 0) goto L_0x0137
                    r11 = 1
                    goto L_0x0138
                L_0x0137:
                    r11 = 0
                L_0x0138:
                    if (r10 != r11) goto L_0x013c
                    goto L_0x01b9
                L_0x013c:
                    if (r1 == 0) goto L_0x0162
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    boolean r11 = r11.mo6745D()
                    if (r11 != 0) goto L_0x0162
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    int r11 = r11.f5412u
                    if (r11 != r7) goto L_0x0162
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    com.fb.fluid.data.Trigger r11 = r11.mo6744C()
                    boolean r11 = r11.mo6398p()
                    if (r11 == 0) goto L_0x0162
                    r11 = 1
                    goto L_0x0163
                L_0x0162:
                    r11 = 0
                L_0x0163:
                    if (r10 != r11) goto L_0x0166
                    goto L_0x01b9
                L_0x0166:
                    if (r1 != 0) goto L_0x018c
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    boolean r11 = r11.mo6745D()
                    if (r11 == 0) goto L_0x018c
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    int r11 = r11.f5412u
                    if (r11 != r6) goto L_0x018c
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    com.fb.fluid.data.Trigger r11 = r11.mo6744C()
                    boolean r11 = r11.mo6398p()
                    if (r11 == 0) goto L_0x018c
                    r11 = 1
                    goto L_0x018d
                L_0x018c:
                    r11 = 0
                L_0x018d:
                    if (r10 != r11) goto L_0x0190
                    goto L_0x01b9
                L_0x0190:
                    if (r1 != 0) goto L_0x01b6
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    boolean r11 = r11.mo6745D()
                    if (r11 != 0) goto L_0x01b6
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    int r11 = r11.f5412u
                    if (r11 != r8) goto L_0x01b6
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    com.fb.fluid.data.Trigger r11 = r11.mo6744C()
                    boolean r11 = r11.mo6398p()
                    if (r11 == 0) goto L_0x01b6
                    r11 = 1
                    goto L_0x01b7
                L_0x01b6:
                    r11 = 0
                L_0x01b7:
                    if (r10 != r11) goto L_0x01be
                L_0x01b9:
                    r1 = 8388611(0x800003, float:1.1754948E-38)
                    goto L_0x03bf
                L_0x01be:
                    if (r1 == 0) goto L_0x01e4
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    boolean r11 = r11.mo6745D()
                    if (r11 == 0) goto L_0x01e4
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    int r11 = r11.f5412u
                    if (r11 != r5) goto L_0x01e4
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    com.fb.fluid.data.Trigger r11 = r11.mo6744C()
                    boolean r11 = r11.mo6397o()
                    if (r11 == 0) goto L_0x01e4
                    r11 = 1
                    goto L_0x01e5
                L_0x01e4:
                    r11 = 0
                L_0x01e5:
                    if (r10 != r11) goto L_0x01e9
                    goto L_0x0266
                L_0x01e9:
                    if (r1 == 0) goto L_0x020f
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    boolean r11 = r11.mo6745D()
                    if (r11 != 0) goto L_0x020f
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    int r11 = r11.f5412u
                    if (r11 != r8) goto L_0x020f
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    com.fb.fluid.data.Trigger r11 = r11.mo6744C()
                    boolean r11 = r11.mo6397o()
                    if (r11 == 0) goto L_0x020f
                    r11 = 1
                    goto L_0x0210
                L_0x020f:
                    r11 = 0
                L_0x0210:
                    if (r10 != r11) goto L_0x0213
                    goto L_0x0266
                L_0x0213:
                    if (r1 != 0) goto L_0x0239
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    boolean r11 = r11.mo6745D()
                    if (r11 == 0) goto L_0x0239
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    int r11 = r11.f5412u
                    if (r11 != r5) goto L_0x0239
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    com.fb.fluid.data.Trigger r11 = r11.mo6744C()
                    boolean r11 = r11.mo6397o()
                    if (r11 == 0) goto L_0x0239
                    r11 = 1
                    goto L_0x023a
                L_0x0239:
                    r11 = 0
                L_0x023a:
                    if (r10 != r11) goto L_0x023d
                    goto L_0x0266
                L_0x023d:
                    if (r1 != 0) goto L_0x0263
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    boolean r1 = r1.mo6745D()
                    if (r1 != 0) goto L_0x0263
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    int r1 = r1.f5412u
                    if (r1 != r7) goto L_0x0263
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    com.fb.fluid.data.Trigger r1 = r1.mo6744C()
                    boolean r1 = r1.mo6397o()
                    if (r1 == 0) goto L_0x0263
                    r1 = 1
                    goto L_0x0264
                L_0x0263:
                    r1 = 0
                L_0x0264:
                    if (r10 != r1) goto L_0x03be
                L_0x0266:
                    goto L_0x03ba
                L_0x0268:
                    if (r1 == 0) goto L_0x028e
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    boolean r11 = r11.mo6745D()
                    if (r11 == 0) goto L_0x028e
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    int r11 = r11.f5412u
                    if (r11 != r6) goto L_0x028e
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    com.fb.fluid.data.Trigger r11 = r11.mo6744C()
                    boolean r11 = r11.mo6398p()
                    if (r11 == 0) goto L_0x028e
                    r11 = 1
                    goto L_0x028f
                L_0x028e:
                    r11 = 0
                L_0x028f:
                    if (r10 != r11) goto L_0x0293
                    goto L_0x0310
                L_0x0293:
                    if (r1 == 0) goto L_0x02b9
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    boolean r11 = r11.mo6745D()
                    if (r11 != 0) goto L_0x02b9
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    int r11 = r11.f5412u
                    if (r11 != r8) goto L_0x02b9
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    com.fb.fluid.data.Trigger r11 = r11.mo6744C()
                    boolean r11 = r11.mo6398p()
                    if (r11 == 0) goto L_0x02b9
                    r11 = 1
                    goto L_0x02ba
                L_0x02b9:
                    r11 = 0
                L_0x02ba:
                    if (r10 != r11) goto L_0x02bd
                    goto L_0x0310
                L_0x02bd:
                    if (r1 != 0) goto L_0x02e3
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    boolean r11 = r11.mo6745D()
                    if (r11 == 0) goto L_0x02e3
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    int r11 = r11.f5412u
                    if (r11 != r6) goto L_0x02e3
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    com.fb.fluid.data.Trigger r11 = r11.mo6744C()
                    boolean r11 = r11.mo6398p()
                    if (r11 == 0) goto L_0x02e3
                    r11 = 1
                    goto L_0x02e4
                L_0x02e3:
                    r11 = 0
                L_0x02e4:
                    if (r10 != r11) goto L_0x02e7
                    goto L_0x0310
                L_0x02e7:
                    if (r1 != 0) goto L_0x030d
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    boolean r11 = r11.mo6745D()
                    if (r11 != 0) goto L_0x030d
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    int r11 = r11.f5412u
                    if (r11 != r8) goto L_0x030d
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    com.fb.fluid.data.Trigger r11 = r11.mo6744C()
                    boolean r11 = r11.mo6398p()
                    if (r11 == 0) goto L_0x030d
                    r11 = 1
                    goto L_0x030e
                L_0x030d:
                    r11 = 0
                L_0x030e:
                    if (r10 != r11) goto L_0x0312
                L_0x0310:
                    goto L_0x01b9
                L_0x0312:
                    if (r1 == 0) goto L_0x0338
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    boolean r11 = r11.mo6745D()
                    if (r11 == 0) goto L_0x0338
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    int r11 = r11.f5412u
                    if (r11 != r5) goto L_0x0338
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    com.fb.fluid.data.Trigger r11 = r11.mo6744C()
                    boolean r11 = r11.mo6397o()
                    if (r11 == 0) goto L_0x0338
                    r11 = 1
                    goto L_0x0339
                L_0x0338:
                    r11 = 0
                L_0x0339:
                    if (r10 != r11) goto L_0x033d
                    goto L_0x03ba
                L_0x033d:
                    if (r1 == 0) goto L_0x0363
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    boolean r11 = r11.mo6745D()
                    if (r11 != 0) goto L_0x0363
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    int r11 = r11.f5412u
                    if (r11 != r7) goto L_0x0363
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    com.fb.fluid.data.Trigger r11 = r11.mo6744C()
                    boolean r11 = r11.mo6397o()
                    if (r11 == 0) goto L_0x0363
                    r11 = 1
                    goto L_0x0364
                L_0x0363:
                    r11 = 0
                L_0x0364:
                    if (r10 != r11) goto L_0x0367
                    goto L_0x03ba
                L_0x0367:
                    if (r1 != 0) goto L_0x038d
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    boolean r11 = r11.mo6745D()
                    if (r11 == 0) goto L_0x038d
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    int r11 = r11.f5412u
                    if (r11 != r5) goto L_0x038d
                    com.fb.fluid.services.e.e$c r11 = r0.f5428g
                    com.fb.fluid.services.e.e r11 = r11.f5423g
                    com.fb.fluid.data.Trigger r11 = r11.mo6744C()
                    boolean r11 = r11.mo6397o()
                    if (r11 == 0) goto L_0x038d
                    r11 = 1
                    goto L_0x038e
                L_0x038d:
                    r11 = 0
                L_0x038e:
                    if (r10 != r11) goto L_0x0391
                    goto L_0x03ba
                L_0x0391:
                    if (r1 != 0) goto L_0x03b7
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    boolean r1 = r1.mo6745D()
                    if (r1 != 0) goto L_0x03b7
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    int r1 = r1.f5412u
                    if (r1 != r7) goto L_0x03b7
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    com.fb.fluid.data.Trigger r1 = r1.mo6744C()
                    boolean r1 = r1.mo6397o()
                    if (r1 == 0) goto L_0x03b7
                    r1 = 1
                    goto L_0x03b8
                L_0x03b7:
                    r1 = 0
                L_0x03b8:
                    if (r10 != r1) goto L_0x03be
                L_0x03ba:
                    r1 = 8388613(0x800005, float:1.175495E-38)
                    goto L_0x03bf
                L_0x03be:
                    r1 = 0
                L_0x03bf:
                    if (r1 == r13) goto L_0x03e9
                    if (r1 == r12) goto L_0x03c4
                    goto L_0x0431
                L_0x03c4:
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    kotlin.x.c.f r11 = r1.mo6721o()
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    com.fb.fluid.data.Trigger r1 = r1.mo6744C()
                    int r1 = r1.mo6379c()
                    java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    com.fb.fluid.data.Trigger r1 = r1.mo6744C()
                    java.lang.String r13 = r1.mo6370a()
                    goto L_0x040d
                L_0x03e9:
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    kotlin.x.c.f r11 = r1.mo6721o()
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    com.fb.fluid.data.Trigger r1 = r1.mo6744C()
                    int r1 = r1.mo6382d()
                    java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    com.fb.fluid.data.Trigger r1 = r1.mo6744C()
                    java.lang.String r13 = r1.mo6375b()
                L_0x040d:
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    com.fb.fluid.ui.views.b r14 = r1.mo6703h()
                    float r1 = r21.getRawX()
                    int r1 = (int) r1
                    java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
                    float r1 = r21.getRawY()
                    int r1 = (int) r1
                    java.lang.Integer r16 = java.lang.Integer.valueOf(r1)
                    r11.mo6612a(r12, r13, r14, r15, r16)
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    r1.m7900E()
                L_0x0431:
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    boolean r1 = r1.mo6742A()
                    if (r1 == 0) goto L_0x0493
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    boolean r1 = r1.f5413v
                    if (r1 == 0) goto L_0x0493
                    com.fb.fluid.l.i r1 = r0.f5429h
                    float r1 = r1.mo6491a()
                    float r1 = java.lang.Math.abs(r1)
                    com.fb.fluid.l.i r11 = r0.f5429h
                    float r11 = r11.mo6497b()
                    float r11 = java.lang.Math.abs(r11)
                    float r1 = java.lang.Math.max(r1, r11)
                    r11 = 16
                    int r11 = p054c.p079d.p080a.p081a.p082a.C1165a.m5734a((int) r11)
                    float r11 = (float) r11
                    int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                    if (r1 <= 0) goto L_0x0493
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    long r11 = r1.f5415x
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    long r13 = r1.f5417z
                    long r11 = r11 + r13
                    long r13 = java.lang.System.currentTimeMillis()
                    int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                    if (r1 >= 0) goto L_0x0493
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    long r11 = java.lang.System.currentTimeMillis()
                    r1.f5415x = r11
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    r1.m7900E()
                L_0x0493:
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    com.fb.fluid.services.e.h.a r1 = r1.f5401P
                    boolean r1 = r1.isVisible()
                    if (r1 == 0) goto L_0x07e8
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    boolean r1 = r1.f5414w
                    if (r1 != 0) goto L_0x07e8
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    com.fb.fluid.services.e.h.a r1 = r1.f5401P
                    float r11 = r21.getX()
                    com.fb.fluid.services.e.e$c r12 = r0.f5428g
                    com.fb.fluid.services.e.e r12 = r12.f5423g
                    int[] r12 = r12.f5394I
                    r12 = r12[r9]
                    float r12 = (float) r12
                    float r11 = r11 + r12
                    float r12 = r21.getY()
                    com.fb.fluid.services.e.e$c r13 = r0.f5428g
                    com.fb.fluid.services.e.e r13 = r13.f5423g
                    int[] r13 = r13.f5394I
                    r13 = r13[r10]
                    float r13 = (float) r13
                    float r12 = r12 + r13
                    com.fb.fluid.services.e.e$c r13 = r0.f5428g
                    com.fb.fluid.services.e.e r13 = r13.f5423g
                    com.fb.fluid.l.t.b r13 = r13.f5393H
                    java.lang.Object r13 = r13.mo6589b()
                    kotlin.j r13 = (kotlin.C3261j) r13
                    java.lang.Object r13 = r13.mo9936c()
                    java.lang.Number r13 = (java.lang.Number) r13
                    int r13 = r13.intValue()
                    com.fb.fluid.services.e.e$c r14 = r0.f5428g
                    com.fb.fluid.services.e.e r14 = r14.f5423g
                    int r14 = r14.m7905J()
                    r15 = -1
                    if (r14 == r8) goto L_0x05d8
                    if (r14 == r7) goto L_0x05d8
                    if (r14 == r6) goto L_0x0500
                    if (r14 == r5) goto L_0x0500
                L_0x04fc:
                    r4 = 0
                L_0x04fd:
                    r5 = 0
                    goto L_0x06ad
                L_0x0500:
                    com.fb.fluid.services.e.e$c r5 = r0.f5428g
                    com.fb.fluid.services.e.e r5 = r5.f5423g
                    int r5 = r5.m7901F()
                    if (r5 <= r10) goto L_0x05b8
                    com.fb.fluid.services.e.e$c r5 = r0.f5428g
                    com.fb.fluid.services.e.e r5 = r5.f5423g
                    int r5 = r5.mo6760z()
                    com.fb.fluid.services.e.e$c r6 = r0.f5428g
                    com.fb.fluid.services.e.e r6 = r6.f5423g
                    int r6 = r6.m7901F()
                    int r5 = r5 / r6
                    float r6 = r21.getRawX()
                    com.fb.fluid.services.e.e$c r7 = r0.f5428g
                    com.fb.fluid.services.e.e r7 = r7.f5423g
                    int r7 = r7.mo6757w()
                    float r7 = (float) r7
                    float r6 = r6 - r7
                    int r6 = (int) r6
                    int r6 = r6 / r5
                    com.fb.fluid.services.e.e$c r7 = r0.f5428g
                    com.fb.fluid.services.e.e r7 = r7.f5423g
                    int r7 = r7.m7901F()
                    int r7 = r7 - r10
                    int r6 = com.p131fb.fluid.p135l.p139p.C1777m.m7482a((int) r6, (int) r9, (int) r7)
                    com.fb.fluid.services.e.e$c r7 = r0.f5428g
                    com.fb.fluid.services.e.e r7 = r7.f5423g
                    float r8 = r20.getRawX()
                    float r14 = r20.getRawY()
                    float r9 = r21.getRawX()
                    float r10 = r21.getRawY()
                    boolean r7 = r7.m7923c(r8, r14, r9, r10)
                    if (r7 != 0) goto L_0x0554
                    r13 = -1
                    goto L_0x0589
                L_0x0554:
                    com.fb.fluid.services.e.e$c r7 = r0.f5428g
                    com.fb.fluid.services.e.e r7 = r7.f5423g
                    com.fb.fluid.l.t.b r7 = r7.f5393H
                    java.lang.Object r7 = r7.mo6589b()
                    kotlin.j r7 = (kotlin.C3261j) r7
                    java.lang.Object r7 = r7.mo9936c()
                    java.lang.Number r7 = (java.lang.Number) r7
                    int r7 = r7.intValue()
                    if (r7 == r15) goto L_0x0588
                    com.fb.fluid.services.e.e$c r7 = r0.f5428g
                    com.fb.fluid.services.e.e r7 = r7.f5423g
                    float r8 = r20.getRawX()
                    float r9 = r20.getRawY()
                    float r10 = r21.getRawX()
                    float r14 = r21.getRawY()
                    boolean r7 = r7.m7913a(r8, r9, r10, r14)
                    if (r7 == 0) goto L_0x0589
                L_0x0588:
                    r13 = r6
                L_0x0589:
                    com.fb.fluid.services.e.e$c r7 = r0.f5428g
                    com.fb.fluid.services.e.e r7 = r7.f5423g
                    float r8 = r20.getRawX()
                    float r9 = r20.getRawY()
                    float r10 = r21.getRawX()
                    float r14 = r21.getRawY()
                    boolean r7 = r7.m7913a(r8, r9, r10, r14)
                    if (r7 == 0) goto L_0x04fc
                    com.fb.fluid.services.e.e$c r7 = r0.f5428g
                    com.fb.fluid.services.e.e r7 = r7.f5423g
                    int r7 = r7.mo6757w()
                    int r6 = r6 * r5
                    int r5 = r5 / r4
                    int r6 = r6 + r5
                    int r7 = r7 + r6
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
                    r5 = r4
                    r4 = 0
                    goto L_0x06ad
                L_0x05b8:
                    com.fb.fluid.services.e.e$c r4 = r0.f5428g
                    com.fb.fluid.services.e.e r4 = r4.f5423g
                    float r5 = r20.getRawX()
                    float r6 = r20.getRawY()
                    float r7 = r21.getRawX()
                    float r8 = r21.getRawY()
                    boolean r4 = r4.m7923c(r5, r6, r7, r8)
                    if (r4 != 0) goto L_0x05d5
                L_0x05d2:
                    r13 = -1
                    goto L_0x04fc
                L_0x05d5:
                    r13 = 0
                    goto L_0x04fc
                L_0x05d8:
                    com.fb.fluid.services.e.e$c r5 = r0.f5428g
                    com.fb.fluid.services.e.e r5 = r5.f5423g
                    int r5 = r5.m7901F()
                    r6 = 1
                    if (r5 <= r6) goto L_0x0691
                    com.fb.fluid.services.e.e$c r5 = r0.f5428g
                    com.fb.fluid.services.e.e r5 = r5.f5423g
                    int r5 = r5.mo6760z()
                    com.fb.fluid.services.e.e$c r6 = r0.f5428g
                    com.fb.fluid.services.e.e r6 = r6.f5423g
                    int r6 = r6.m7901F()
                    int r5 = r5 / r6
                    float r6 = r21.getRawY()
                    com.fb.fluid.services.e.e$c r7 = r0.f5428g
                    com.fb.fluid.services.e.e r7 = r7.f5423g
                    int r7 = r7.mo6758x()
                    float r7 = (float) r7
                    float r6 = r6 - r7
                    int r6 = (int) r6
                    int r6 = r6 / r5
                    com.fb.fluid.services.e.e$c r7 = r0.f5428g
                    com.fb.fluid.services.e.e r7 = r7.f5423g
                    int r7 = r7.m7901F()
                    r8 = 1
                    int r7 = r7 - r8
                    r8 = 0
                    int r6 = com.p131fb.fluid.p135l.p139p.C1777m.m7482a((int) r6, (int) r8, (int) r7)
                    com.fb.fluid.services.e.e$c r7 = r0.f5428g
                    com.fb.fluid.services.e.e r7 = r7.f5423g
                    float r9 = r20.getRawX()
                    float r10 = r20.getRawY()
                    float r14 = r21.getRawX()
                    float r8 = r21.getRawY()
                    boolean r7 = r7.m7923c(r9, r10, r14, r8)
                    if (r7 != 0) goto L_0x062f
                    r13 = -1
                    goto L_0x0664
                L_0x062f:
                    com.fb.fluid.services.e.e$c r7 = r0.f5428g
                    com.fb.fluid.services.e.e r7 = r7.f5423g
                    com.fb.fluid.l.t.b r7 = r7.f5393H
                    java.lang.Object r7 = r7.mo6589b()
                    kotlin.j r7 = (kotlin.C3261j) r7
                    java.lang.Object r7 = r7.mo9936c()
                    java.lang.Number r7 = (java.lang.Number) r7
                    int r7 = r7.intValue()
                    if (r7 == r15) goto L_0x0663
                    com.fb.fluid.services.e.e$c r7 = r0.f5428g
                    com.fb.fluid.services.e.e r7 = r7.f5423g
                    float r8 = r20.getRawX()
                    float r9 = r20.getRawY()
                    float r10 = r21.getRawX()
                    float r14 = r21.getRawY()
                    boolean r7 = r7.m7913a(r8, r9, r10, r14)
                    if (r7 == 0) goto L_0x0664
                L_0x0663:
                    r13 = r6
                L_0x0664:
                    com.fb.fluid.services.e.e$c r7 = r0.f5428g
                    com.fb.fluid.services.e.e r7 = r7.f5423g
                    float r8 = r20.getRawX()
                    float r9 = r20.getRawY()
                    float r10 = r21.getRawX()
                    float r14 = r21.getRawY()
                    boolean r7 = r7.m7913a(r8, r9, r10, r14)
                    if (r7 == 0) goto L_0x04fc
                    com.fb.fluid.services.e.e$c r7 = r0.f5428g
                    com.fb.fluid.services.e.e r7 = r7.f5423g
                    int r7 = r7.mo6758x()
                    int r6 = r6 * r5
                    int r5 = r5 / r4
                    int r6 = r6 + r5
                    int r7 = r7 + r6
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
                    goto L_0x04fd
                L_0x0691:
                    com.fb.fluid.services.e.e$c r4 = r0.f5428g
                    com.fb.fluid.services.e.e r4 = r4.f5423g
                    float r5 = r20.getRawX()
                    float r6 = r20.getRawY()
                    float r7 = r21.getRawX()
                    float r8 = r21.getRawY()
                    boolean r4 = r4.m7923c(r5, r6, r7, r8)
                    if (r4 != 0) goto L_0x05d5
                    goto L_0x05d2
                L_0x06ad:
                    if (r13 == r15) goto L_0x06f5
                    com.fb.fluid.services.e.e$c r6 = r0.f5428g
                    com.fb.fluid.services.e.e r6 = r6.f5423g
                    float r7 = r20.getRawX()
                    float r2 = r20.getRawY()
                    float r8 = r21.getRawX()
                    float r9 = r21.getRawY()
                    boolean r2 = r6.m7918b(r7, r2, r8, r9)
                    if (r2 == 0) goto L_0x06f5
                    com.fb.fluid.services.e.e$c r2 = r0.f5428g
                    com.fb.fluid.services.e.e r2 = r2.f5423g
                    long r6 = r2.f5416y
                    com.fb.fluid.services.e.e$c r2 = r0.f5428g
                    com.fb.fluid.services.e.e r2 = r2.f5423g
                    long r8 = r2.f5386A
                    long r6 = r6 + r8
                    long r8 = java.lang.System.currentTimeMillis()
                    int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    if (r2 >= 0) goto L_0x06f5
                    com.fb.fluid.services.e.e$c r2 = r0.f5428g
                    com.fb.fluid.services.e.e r2 = r2.f5423g
                    com.fb.fluid.data.TriggerButton r2 = r2.m7906K()
                    if (r2 == 0) goto L_0x06f5
                    boolean r2 = r2.mo6419k()
                    r6 = 1
                    if (r2 != r6) goto L_0x06f5
                    r9 = 1
                    goto L_0x06f6
                L_0x06f5:
                    r9 = 0
                L_0x06f6:
                    if (r9 == 0) goto L_0x0712
                    com.fb.fluid.services.e.e$c r2 = r0.f5428g
                    com.fb.fluid.services.e.e r2 = r2.f5423g
                    long r6 = r2.f5416y
                    r17 = -1
                    int r2 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
                    if (r2 != 0) goto L_0x0712
                    com.fb.fluid.services.e.e$c r2 = r0.f5428g
                    com.fb.fluid.services.e.e r2 = r2.f5423g
                    long r6 = java.lang.System.currentTimeMillis()
                    r2.f5416y = r6
                    r9 = 0
                L_0x0712:
                    com.fb.fluid.services.e.e$c r2 = r0.f5428g
                    com.fb.fluid.services.e.e r2 = r2.f5423g
                    com.fb.fluid.l.t.b r2 = r2.f5393H
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
                    java.lang.Boolean r7 = java.lang.Boolean.valueOf(r9)
                    kotlin.j r6 = kotlin.C3268o.m11989a(r6, r7)
                    r2.mo6588a(r6)
                    java.lang.Float r2 = java.lang.Float.valueOf(r11)
                    java.lang.Float r6 = java.lang.Float.valueOf(r12)
                    r1.mo6715a(r5, r4, r2, r6)
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    com.fb.fluid.data.Trigger r1 = r1.mo6744C()
                    boolean r1 = r1.mo6391i()
                    if (r1 == 0) goto L_0x0744
                    if (r13 != r15) goto L_0x0756
                L_0x0744:
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    com.fb.fluid.data.Trigger r1 = r1.mo6744C()
                    boolean r1 = r1.mo6392j()
                    if (r1 == 0) goto L_0x07e6
                    if (r13 == r15) goto L_0x07e6
                    if (r9 == 0) goto L_0x07e6
                L_0x0756:
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    r2 = 1
                    r1.f5414w = r2
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    com.fb.fluid.services.e.h.a r1 = r1.f5401P
                    r1.dismiss()
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    com.fb.fluid.data.TriggerButton r1 = r1.m7906K()
                    if (r1 == 0) goto L_0x07e6
                    com.fb.fluid.services.e.e$c r2 = r0.f5428g
                    com.fb.fluid.services.e.e r2 = r2.f5423g
                    kotlin.x.c.f r2 = r2.mo6721o()
                    com.fb.fluid.services.e.e$c r4 = r0.f5428g
                    com.fb.fluid.services.e.e r4 = r4.f5423g
                    com.fb.fluid.l.t.b r4 = r4.f5393H
                    java.lang.Object r4 = r4.mo6589b()
                    kotlin.j r4 = (kotlin.C3261j) r4
                    java.lang.Object r4 = r4.mo9937d()
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 == 0) goto L_0x079a
                    int r4 = r1.mo6410c()
                    goto L_0x079e
                L_0x079a:
                    int r4 = r1.mo6412d()
                L_0x079e:
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    com.fb.fluid.services.e.e$c r5 = r0.f5428g
                    com.fb.fluid.services.e.e r5 = r5.f5423g
                    com.fb.fluid.l.t.b r5 = r5.f5393H
                    java.lang.Object r5 = r5.mo6589b()
                    kotlin.j r5 = (kotlin.C3261j) r5
                    java.lang.Object r5 = r5.mo9937d()
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    boolean r5 = r5.booleanValue()
                    if (r5 == 0) goto L_0x07c1
                    java.lang.String r1 = r1.mo6406b()
                    goto L_0x07c5
                L_0x07c1:
                    java.lang.String r1 = r1.mo6400a()
                L_0x07c5:
                    r5 = r1
                    com.fb.fluid.services.e.e$c r1 = r0.f5428g
                    com.fb.fluid.services.e.e r1 = r1.f5423g
                    com.fb.fluid.ui.views.b r6 = r1.mo6703h()
                    float r1 = r21.getRawX()
                    int r1 = (int) r1
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                    float r1 = r21.getRawY()
                    int r1 = (int) r1
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
                    r3 = r2
                    r3.mo6612a(r4, r5, r6, r7, r8)
                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                L_0x07e6:
                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                L_0x07e8:
                    r1 = 1
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.p145e.C1937e.C1941c.C1946e.mo6768a(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1941c(C1937e eVar, Context context) {
            super(1);
            this.f5423g = eVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6763a((C1743i) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6763a(C1743i iVar) {
            C3370k.m12227b(iVar, "$receiver");
            iVar.mo6503c(C1165a.m5734a(8));
            iVar.mo6498b((C3350b<? super MotionEvent, Unit>) new C1942a(this));
            iVar.mo6502c((C3350b<? super MotionEvent, Unit>) new C1943b(this));
            iVar.mo6492a((C3350b<? super MotionEvent, Unit>) new C1944c(this));
            iVar.mo6493a((C3351c<? super MotionEvent, ? super Integer, Unit>) new C1945d(this));
            iVar.mo6494a((C3353e<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean>) new C1946e(this, iVar));
        }
    }

    /* renamed from: com.fb.fluid.services.e.e$d */
    static final class C1947d<T> implements C2830h<C3261j<? extends Integer, ? extends Boolean>> {

        /* renamed from: f */
        public static final C1947d f5430f = new C1947d();

        C1947d() {
        }

        /* renamed from: a */
        public final boolean mo6042a(C3261j<Integer, Boolean> jVar) {
            C3370k.m12227b(jVar, "it");
            return jVar.mo9936c().intValue() != -1;
        }
    }

    /* renamed from: com.fb.fluid.services.e.e$e */
    static final class C1948e implements View.OnTouchListener {

        /* renamed from: f */
        final /* synthetic */ C1743i f5431f;

        C1948e(C1743i iVar) {
            this.f5431f = iVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f5431f.onTouch(view, motionEvent);
            return true;
        }
    }

    /* renamed from: com.fb.fluid.services.e.e$f */
    public static final class C1949f {
        private C1949f() {
        }

        public /* synthetic */ C1949f(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ Rect m7985a(C1949f fVar, Rect rect, int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2, boolean z, C3355g gVar, int i6, Object obj) {
            int i7 = i6;
            return fVar.mo6774a(rect, i, i2, i3, i4, (i7 & 32) != 0 ? new int[]{-1, -1} : iArr, (i7 & 64) != 0 ? -1 : i5, (i7 & PropertyFlags.ID_SELF_ASSIGNABLE) != 0 ? new int[]{0, 0} : iArr2, (i7 & PropertyFlags.INDEX_PARTIAL_SKIP_NULL) != 0 ? false : z, (i7 & PropertyFlags.INDEX_PARTIAL_SKIP_ZERO) != 0 ? null : gVar);
        }

        /* renamed from: a */
        public final int mo6771a(int i, int i2, int i3, boolean z, int i4) {
            return (!z && i3 == 1 && i4 == 80) ? (i2 - 1) - i : i;
        }

        /* renamed from: a */
        public final int mo6772a(Trigger trigger, int i, boolean z) {
            C3370k.m12227b(trigger, "trigger");
            int g = trigger.mo6388g();
            if (g == 3) {
                if (!z || i != 1) {
                    if (!z || i != 3) {
                        return 51;
                    }
                }
            } else if (g != 5) {
                if (g == 48) {
                    return ((!z || i != 1) && z && i == 3) ? 53 : 51;
                }
                if (g != 80) {
                    return 0;
                }
                if (!z || i != 1) {
                    return (!z || i != 3) ? 83 : 51;
                }
            } else if (z && i == 1) {
                return 51;
            } else {
                if (z && i == 3) {
                    return 85;
                }
            }
        }

        /* renamed from: a */
        public final Rect mo6773a(int i, int i2, int i3, int i4, int[] iArr, boolean z) {
            C3370k.m12227b(iArr, "margins");
            Rect rect = new Rect(0, 0, 0, 0);
            if (i == 3 || i == 5) {
                rect.right = i2;
                rect.bottom = i3;
                rect.offset(0, iArr[1] + i4);
            } else if (i == 48 || i == 80) {
                rect.right = i3;
                rect.bottom = i2;
                rect.offset(iArr[0] + i4, 0);
            }
            if (z) {
                C1780p.m7485a(rect);
            }
            return rect;
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.graphics.Rect mo6774a(android.graphics.Rect r14, int r15, int r16, int r17, int r18, int[] r19, int r20, int[] r21, boolean r22, kotlin.p205x.p206c.C3355g<? super android.graphics.Rect, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super int[], ? super java.lang.Boolean, kotlin.Unit> r23) {
            /*
                r13 = this;
                r7 = r15
                r0 = r19
                r1 = r20
                r8 = r21
                java.lang.String r2 = "display"
                r3 = r14
                kotlin.p205x.p207d.C3370k.m12227b(r14, r2)
                java.lang.String r2 = "maxSize"
                kotlin.p205x.p207d.C3370k.m12227b(r0, r2)
                java.lang.String r2 = "margins"
                kotlin.p205x.p207d.C3370k.m12227b(r8, r2)
                r2 = -1
                r4 = r16
                if (r1 == r2) goto L_0x0022
                int r1 = java.lang.Math.min(r4, r1)
                r9 = r1
                goto L_0x0023
            L_0x0022:
                r9 = r4
            L_0x0023:
                r1 = 2
                int[] r4 = new int[r1]
                int r5 = r14.width()
                r6 = 0
                r10 = r0[r6]
                if (r10 != r2) goto L_0x0033
                int r10 = r14.width()
            L_0x0033:
                int r5 = java.lang.Math.min(r5, r10)
                r10 = r8[r6]
                int r10 = r10 * 2
                int r5 = r5 - r10
                r4[r6] = r5
                int r5 = r14.height()
                r10 = 1
                r0 = r0[r10]
                if (r0 != r2) goto L_0x004b
                int r0 = r14.height()
            L_0x004b:
                int r0 = java.lang.Math.min(r5, r0)
                r2 = r8[r10]
                int r2 = r2 * 2
                int r0 = r0 - r2
                r4[r10] = r0
                r0 = 80
                r2 = 48
                r5 = 5
                r11 = 3
                if (r7 == r11) goto L_0x0069
                if (r7 == r5) goto L_0x0069
                if (r7 == r2) goto L_0x0066
                if (r7 == r0) goto L_0x0066
                r12 = 0
                goto L_0x0070
            L_0x0066:
                r4 = r4[r6]
                goto L_0x006b
            L_0x0069:
                r4 = r4[r10]
            L_0x006b:
                int r4 = r4 * r17
                int r4 = r4 / 100
                r12 = r4
            L_0x0070:
                if (r7 == r11) goto L_0x0081
                if (r7 == r5) goto L_0x0081
                if (r7 == r2) goto L_0x007a
                if (r7 == r0) goto L_0x007a
                r10 = 0
                goto L_0x0094
            L_0x007a:
                int r0 = r14.width()
                r2 = r8[r6]
                goto L_0x0087
            L_0x0081:
                int r0 = r14.height()
                r2 = r8[r10]
            L_0x0087:
                int r2 = r2 * 2
                int r0 = r0 - r2
                int r0 = r0 - r12
                int r0 = java.lang.Math.max(r6, r0)
                int r0 = r0 * r18
                int r0 = r0 / 100
                r10 = r0
            L_0x0094:
                r0 = r13
                r1 = r15
                r2 = r9
                r3 = r12
                r4 = r10
                r5 = r21
                r6 = r22
                android.graphics.Rect r11 = r0.mo6773a(r1, r2, r3, r4, r5, r6)
                if (r23 == 0) goto L_0x00c2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r22)
                r0 = r23
                r1 = r11
                r6 = r21
                java.lang.Object r0 = r0.mo6735a(r1, r2, r3, r4, r5, r6, r7)
                kotlin.Unit r0 = (kotlin.Unit) r0
            L_0x00c2:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.p145e.C1937e.C1949f.mo6774a(android.graphics.Rect, int, int, int, int, int[], int, int[], boolean, kotlin.x.c.g):android.graphics.Rect");
        }
    }

    /* renamed from: com.fb.fluid.services.e.e$g */
    static final class C1950g<T> implements C2827e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C1937e f5432a;

        C1950g(C1937e eVar) {
            this.f5432a = eVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C2513b bVar;
            int i;
            C3370k.m12223a((Object) bool, "it");
            if (bool.booleanValue()) {
                bVar = this.f5432a.mo6703h();
                i = C1767c.m7447b(-65536, 0.5f);
            } else {
                bVar = this.f5432a.mo6703h();
                i = 0;
            }
            bVar.setBackgroundColor(i);
        }
    }

    /* renamed from: com.fb.fluid.services.e.e$h */
    static final class C1951h<T> implements C2827e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C1937e f5433a;

        C1951h(C1937e eVar) {
            this.f5433a = eVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C1937e eVar = this.f5433a;
            C3370k.m12223a((Object) bool, "it");
            eVar.f5413v = bool.booleanValue();
        }
    }

    /* renamed from: com.fb.fluid.services.e.e$i */
    static final class C1952i<T> implements C2827e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C1937e f5434a;

        C1952i(C1937e eVar) {
            this.f5434a = eVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f5434a.f5396K.setVisibility(!bool.booleanValue() ? 0 : 8);
        }
    }

    /* renamed from: com.fb.fluid.services.e.e$j */
    static final class C1953j<T> implements C2827e<Integer> {

        /* renamed from: a */
        final /* synthetic */ C1937e f5435a;

        /* renamed from: com.fb.fluid.services.e.e$j$a */
        public static final class C1954a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C1953j f5436f;

            public C1954a(C1953j jVar) {
                this.f5436f = jVar;
            }

            public final void run() {
                this.f5436f.f5435a.mo6710n();
            }
        }

        C1953j(C1937e eVar) {
            this.f5435a = eVar;
        }

        /* renamed from: a */
        public final void accept(Integer num) {
            C1937e eVar = this.f5435a;
            C3370k.m12223a((Object) num, "it");
            eVar.f5410s = num.intValue();
            if (this.f5435a.mo6707k().mo6589b().booleanValue()) {
                new Handler().postDelayed(new C1954a(this), 200);
            }
        }
    }

    /* renamed from: com.fb.fluid.services.e.e$k */
    static final class C1955k<T> implements C2827e<Integer> {

        /* renamed from: a */
        final /* synthetic */ C1937e f5437a;

        /* renamed from: com.fb.fluid.services.e.e$k$a */
        static final /* synthetic */ class C1956a extends C3368i implements C3349a<Unit> {
            C1956a(C1937e eVar) {
                super(0, eVar);
            }

            /* renamed from: b */
            public final String mo6062b() {
                return "updateParams";
            }

            /* renamed from: h */
            public final C3204e mo6063h() {
                return C3384y.m12254a(C1937e.class);
            }

            public final void invoke() {
                ((C1937e) this.f8030g).mo6710n();
            }

            /* renamed from: j */
            public final String mo6064j() {
                return "updateParams()V";
            }
        }

        C1955k(C1937e eVar) {
            this.f5437a = eVar;
        }

        /* renamed from: a */
        public final void accept(Integer num) {
            C1937e eVar = this.f5437a;
            C3370k.m12223a((Object) num, "it");
            eVar.f5411t = num.intValue();
            new Handler().postDelayed(new C1959f(new C1956a(this.f5437a)), 700);
        }
    }

    /* renamed from: com.fb.fluid.services.e.e$l */
    static final class C1957l extends C3371l implements C3349a<DisplayManager> {

        /* renamed from: g */
        final /* synthetic */ Context f5438g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1957l(Context context) {
            super(0);
            this.f5438g = context;
        }

        public final DisplayManager invoke() {
            Object systemService = this.f5438g.getSystemService("display");
            if (systemService != null) {
                return (DisplayManager) systemService;
            }
            throw new C3269p("null cannot be cast to non-null type android.hardware.display.DisplayManager");
        }
    }

    /* renamed from: com.fb.fluid.services.e.e$m */
    public static final class C1958m<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C3303b.m12118a(Integer.valueOf(((TriggerButton) t).mo6415g()), Integer.valueOf(((TriggerButton) t2).mo6415g()));
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C1937e.class), "displayManager", "getDisplayManager()Landroid/hardware/display/DisplayManager;");
        C3384y.m12259a((C3379t) uVar);
        f5384Q = new C3208i[]{uVar};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0064, code lost:
        r8 = mo6706j().getDefaultDisplay();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1937e(android.content.Context r7, com.p131fb.fluid.data.Trigger r8, kotlin.p205x.p206c.C3354f<? super java.lang.Integer, ? super java.lang.String, ? super android.view.View, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r9, kotlin.p205x.p206c.C3351c<? super java.lang.Boolean, ? super java.lang.Boolean, kotlin.Unit> r10, kotlin.p205x.p206c.C3351c<? super com.p131fb.fluid.data.TriggerButton, ? super java.lang.Boolean, ? extends android.graphics.drawable.Drawable> r11, com.p131fb.fluid.services.p145e.p147h.C1988a r12) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.p205x.p207d.C3370k.m12227b(r7, r0)
            java.lang.String r0 = "trigger"
            kotlin.p205x.p207d.C3370k.m12227b(r8, r0)
            java.lang.String r0 = "actionCallback"
            kotlin.p205x.p207d.C3370k.m12227b(r9, r0)
            java.lang.String r0 = "touchFeedbackCallback"
            kotlin.p205x.p207d.C3370k.m12227b(r10, r0)
            java.lang.String r0 = "iconActionLoader"
            kotlin.p205x.p207d.C3370k.m12227b(r11, r0)
            java.lang.String r0 = "attachment"
            kotlin.p205x.p207d.C3370k.m12227b(r12, r0)
            r6.<init>(r7)
            r6.f5397L = r8
            r6.f5398M = r9
            r6.f5399N = r10
            r6.f5400O = r11
            r6.f5401P = r12
            com.fb.fluid.services.e.e$l r8 = new com.fb.fluid.services.e.e$l
            r8.<init>(r7)
            kotlin.e r8 = kotlin.C3258g.m11969a(r8)
            r6.f5402k = r8
            com.fb.fluid.services.e.e$j r8 = new com.fb.fluid.services.e.e$j
            r8.<init>(r6)
            r6.f5403l = r8
            com.fb.fluid.services.e.e$k r8 = new com.fb.fluid.services.e.e$k
            r8.<init>(r6)
            r6.f5404m = r8
            com.fb.fluid.services.e.e$h r8 = new com.fb.fluid.services.e.e$h
            r8.<init>(r6)
            r6.f5405n = r8
            com.fb.fluid.services.e.e$g r8 = new com.fb.fluid.services.e.e$g
            r8.<init>(r6)
            r6.f5406o = r8
            com.fb.fluid.services.e.e$i r8 = new com.fb.fluid.services.e.e$i
            r8.<init>(r6)
            r6.f5407p = r8
            com.fb.fluid.ui.views.b r8 = r6.mo6703h()
            android.view.Display r8 = r8.getDisplay()
            if (r8 == 0) goto L_0x0064
            goto L_0x006e
        L_0x0064:
            android.view.WindowManager r8 = r6.mo6706j()
            android.view.Display r8 = r8.getDefaultDisplay()
            if (r8 == 0) goto L_0x0077
        L_0x006e:
            int r8 = r8.getRotation()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0078
        L_0x0077:
            r8 = 0
        L_0x0078:
            r9 = 0
            if (r8 == 0) goto L_0x0080
            int r8 = r8.intValue()
            goto L_0x0081
        L_0x0080:
            r8 = 0
        L_0x0081:
            r6.f5411t = r8
            r10 = 2500(0x9c4, double:1.235E-320)
            r6.f5417z = r10
            r10 = 130(0x82, double:6.4E-322)
            r6.f5386A = r10
            r8 = 24
            int r8 = p054c.p079d.p080a.p081a.p082a.C1165a.m5734a((int) r8)
            r6.f5387B = r8
            r8 = 16
            int r8 = p054c.p079d.p080a.p081a.p082a.C1165a.m5734a((int) r8)
            r6.f5388C = r8
            r8 = 56
            int r8 = p054c.p079d.p080a.p081a.p082a.C1165a.m5734a((int) r8)
            r6.f5389D = r8
            r8 = 102(0x66, float:1.43E-43)
            int r8 = p054c.p079d.p080a.p081a.p082a.C1165a.m5734a((int) r8)
            r6.f5390E = r8
            r8 = 40
            int r8 = p054c.p079d.p080a.p081a.p082a.C1165a.m5734a((int) r8)
            r6.f5391F = r8
            r8 = 14
            int r8 = p054c.p079d.p080a.p081a.p082a.C1165a.m5734a((int) r8)
            r6.f5392G = r8
            com.fb.fluid.l.t.b r8 = new com.fb.fluid.l.t.b
            r10 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r9)
            kotlin.j r10 = kotlin.C3268o.m11989a(r10, r11)
            r8.<init>(r10)
            r6.f5393H = r8
            r8 = 2
            int[] r8 = new int[r8]
            r8 = {0, 0} // fill-array
            r6.f5394I = r8
            d.a.o.a r8 = new d.a.o.a
            r8.<init>()
            r6.f5395J = r8
            com.fb.fluid.ui.views.c r8 = new com.fb.fluid.ui.views.c
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r8
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f5396K = r8
            com.fb.fluid.ui.views.b r8 = r6.mo6703h()
            r8.setVisibility(r9)
            com.fb.fluid.ui.views.c r9 = r6.f5396K
            r8.addView(r9)
            com.fb.fluid.l.t.b<kotlin.j<java.lang.Integer, java.lang.Boolean>> r9 = r6.f5393H
            d.a.w.a r9 = r9.mo6587a()
            d.a.h r9 = r9.mo8901a()
            com.fb.fluid.services.e.e$a r10 = new com.fb.fluid.services.e.e$a
            r10.<init>(r6, r7)
            d.a.o.b r9 = r9.mo8927b(r10)
            java.lang.String r10 = "selectedIndex.observable… }\n\n                    }"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r9, (java.lang.String) r10)
            d.a.o.a r10 = r6.f5395J
            com.p131fb.fluid.p135l.p143t.C1797a.m7558a((p155d.p156a.p160o.C2810b) r9, (p155d.p156a.p160o.C2809a) r10)
            com.fb.fluid.l.t.b<kotlin.j<java.lang.Integer, java.lang.Boolean>> r9 = r6.f5393H
            d.a.w.a r9 = r9.mo6587a()
            d.a.h r9 = r9.mo8901a()
            com.fb.fluid.services.e.e$d r10 = com.p131fb.fluid.services.p145e.C1937e.C1947d.f5430f
            d.a.h r9 = r9.mo8914a(r10)
            d.a.l r10 = p155d.p156a.p177v.C2964b.m11437b()
            d.a.h r9 = r9.mo8923b((p155d.p156a.C2794l) r10)
            com.fb.fluid.services.e.e$b r10 = new com.fb.fluid.services.e.e$b
            r10.<init>(r6, r7)
            d.a.o.b r9 = r9.mo8927b(r10)
            java.lang.String r10 = "selectedIndex.observable…HapticForCurrentAction) }"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r9, (java.lang.String) r10)
            d.a.o.a r10 = r6.f5395J
            com.p131fb.fluid.p135l.p143t.C1797a.m7558a((p155d.p156a.p160o.C2810b) r9, (p155d.p156a.p160o.C2809a) r10)
            com.fb.fluid.l.i r9 = new com.fb.fluid.l.i
            com.fb.fluid.services.e.e$c r10 = new com.fb.fluid.services.e.e$c
            r10.<init>(r6, r7)
            r9.<init>(r7, r10)
            com.fb.fluid.services.e.e$e r7 = new com.fb.fluid.services.e.e$e
            r7.<init>(r9)
            r8.setOnTouchListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.p145e.C1937e.<init>(android.content.Context, com.fb.fluid.data.Trigger, kotlin.x.c.f, kotlin.x.c.c, kotlin.x.c.c, com.fb.fluid.services.e.h.a):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m7900E() {
        this.f5414w = true;
        this.f5401P.dismiss();
        this.f5399N.mo6125a(true, Boolean.valueOf(true ^ m7904I()));
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final int m7901F() {
        List<TriggerButton> e = this.f5397L.mo6384e();
        ArrayList arrayList = new ArrayList();
        for (T next : e) {
            if (((TriggerButton) next).mo6413e()) {
                arrayList.add(next);
            }
        }
        return arrayList.size();
    }

    /* renamed from: G */
    private final DisplayManager m7902G() {
        C3256e eVar = this.f5402k;
        C3208i iVar = f5384Q[0];
        return (DisplayManager) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public final boolean m7903H() {
        boolean z;
        List<TriggerButton> e = this.f5397L.mo6384e();
        if ((e instanceof Collection) && e.isEmpty()) {
            return false;
        }
        for (TriggerButton triggerButton : e) {
            if (!triggerButton.mo6413e() || (!triggerButton.mo6418j() && !triggerButton.mo6419k())) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040 A[RETURN, SYNTHETIC] */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m7904I() {
        /*
            r2 = this;
            com.fb.fluid.l.q.a$a r0 = com.p131fb.fluid.p135l.p140q.C1783a.f5089a
            boolean r0 = r0.mo6543f()
            if (r0 == 0) goto L_0x0042
            com.fb.fluid.l.t.b<kotlin.j<java.lang.Integer, java.lang.Boolean>> r0 = r2.f5393H
            java.lang.Object r0 = r0.mo6589b()
            kotlin.j r0 = (kotlin.C3261j) r0
            java.lang.Object r0 = r0.mo9937d()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0028
            com.fb.fluid.data.TriggerButton r0 = r2.m7906K()
            if (r0 == 0) goto L_0x0036
            int r0 = r0.mo6410c()
            goto L_0x0032
        L_0x0028:
            com.fb.fluid.data.TriggerButton r0 = r2.m7906K()
            if (r0 == 0) goto L_0x0036
            int r0 = r0.mo6412d()
        L_0x0032:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0036:
            r0 = 2
            if (r1 != 0) goto L_0x003a
            goto L_0x0042
        L_0x003a:
            int r1 = r1.intValue()
            if (r1 != r0) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.p145e.C1937e.m7904I():boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030 A[RETURN, SYNTHETIC] */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int m7905J() {
        /*
            r5 = this;
            com.fb.fluid.data.Trigger r0 = r5.f5397L
            int r0 = r0.mo6388g()
            r1 = 5
            r2 = 80
            r3 = 48
            r4 = 3
            if (r0 == r4) goto L_0x006c
            if (r0 == r3) goto L_0x004f
            if (r0 == r2) goto L_0x0033
            boolean r0 = r5.mo6745D()
            if (r0 != 0) goto L_0x0023
            int r0 = r5.mo6755u()
            r0 = r0 & r3
            if (r0 != r3) goto L_0x0023
        L_0x001f:
            r1 = 48
            goto L_0x0088
        L_0x0023:
            boolean r0 = r5.mo6745D()
            if (r0 != 0) goto L_0x0088
            int r0 = r5.mo6755u()
            r0 = r0 & r2
            if (r0 != r2) goto L_0x0088
        L_0x0030:
            r1 = 80
            goto L_0x0088
        L_0x0033:
            boolean r0 = r5.mo6745D()
            if (r0 == 0) goto L_0x0041
            int r0 = r5.mo6755u()
            r0 = r0 & r4
            if (r0 != r4) goto L_0x0041
            goto L_0x005c
        L_0x0041:
            boolean r0 = r5.mo6745D()
            if (r0 == 0) goto L_0x0030
            int r0 = r5.mo6755u()
            r0 = r0 & r1
            if (r0 != r1) goto L_0x0030
            goto L_0x0088
        L_0x004f:
            boolean r0 = r5.mo6745D()
            if (r0 == 0) goto L_0x005e
            int r0 = r5.mo6755u()
            r0 = r0 & r4
            if (r0 != r4) goto L_0x005e
        L_0x005c:
            r1 = 3
            goto L_0x0088
        L_0x005e:
            boolean r0 = r5.mo6745D()
            if (r0 == 0) goto L_0x001f
            int r0 = r5.mo6755u()
            r0 = r0 & r1
            if (r0 != r1) goto L_0x001f
            goto L_0x0088
        L_0x006c:
            boolean r0 = r5.mo6745D()
            if (r0 != 0) goto L_0x007a
            int r0 = r5.mo6755u()
            r0 = r0 & r3
            if (r0 != r3) goto L_0x007a
            goto L_0x001f
        L_0x007a:
            boolean r0 = r5.mo6745D()
            if (r0 != 0) goto L_0x005c
            int r0 = r5.mo6755u()
            r0 = r0 & r2
            if (r0 != r2) goto L_0x005c
            goto L_0x0030
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.p145e.C1937e.m7905J():int");
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final TriggerButton m7906K() {
        return (TriggerButton) C3292r.m12084a(C3292r.m12088a(this.f5397L.mo6384e(), new C1958m()), m7907L());
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public final int m7907L() {
        C1949f fVar = f5385R;
        int intValue = ((Number) this.f5393H.mo6589b().mo9936c()).intValue();
        List<TriggerButton> e = this.f5397L.mo6384e();
        ArrayList arrayList = new ArrayList();
        for (T next : e) {
            if (((TriggerButton) next).mo6413e()) {
                arrayList.add(next);
            }
        }
        return fVar.mo6771a(intValue, arrayList.size(), this.f5411t, this.f5408q, this.f5397L.mo6388g());
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public final void m7908M() {
        this.f5393H.mo6588a(C3268o.m11989a(-1, false));
        this.f5416y = -1;
        this.f5414w = false;
        this.f5412u = 0;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m7913a(float r5, float r6, float r7, float r8) {
        /*
            r4 = this;
            int r0 = r4.m7905J()
            r1 = 3
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x003c
            r1 = 5
            if (r0 == r1) goto L_0x002f
            r5 = 48
            if (r0 == r5) goto L_0x0022
            r5 = 80
            if (r0 == r5) goto L_0x0015
            goto L_0x0049
        L_0x0015:
            float r6 = r6 - r8
            float r5 = java.lang.Math.abs(r6)
            int r6 = r4.f5389D
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0049
            goto L_0x0048
        L_0x0022:
            float r6 = r6 - r8
            float r5 = java.lang.Math.abs(r6)
            int r6 = r4.f5389D
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0049
            goto L_0x0048
        L_0x002f:
            float r5 = r5 - r7
            float r5 = java.lang.Math.abs(r5)
            int r6 = r4.f5389D
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0049
            goto L_0x0048
        L_0x003c:
            float r5 = r5 - r7
            float r5 = java.lang.Math.abs(r5)
            int r6 = r4.f5389D
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0049
        L_0x0048:
            r3 = 1
        L_0x0049:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.p145e.C1937e.m7913a(float, float, float, float):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m7918b(float r5, float r6, float r7, float r8) {
        /*
            r4 = this;
            int r0 = r4.m7905J()
            r1 = 3
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0030
            r1 = 5
            if (r0 == r1) goto L_0x0027
            r5 = 48
            if (r0 == r5) goto L_0x001e
            r5 = 80
            if (r0 == r5) goto L_0x0015
            goto L_0x0039
        L_0x0015:
            float r6 = r6 - r8
            int r5 = r4.f5390E
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0039
            goto L_0x0038
        L_0x001e:
            float r8 = r8 - r6
            int r5 = r4.f5390E
            float r5 = (float) r5
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0039
            goto L_0x0038
        L_0x0027:
            float r5 = r5 - r7
            int r6 = r4.f5390E
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0039
            goto L_0x0038
        L_0x0030:
            float r7 = r7 - r5
            int r5 = r4.f5390E
            float r5 = (float) r5
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0039
        L_0x0038:
            r3 = 1
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.p145e.C1937e.m7918b(float, float, float, float):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m7923c(float r6, float r7, float r8, float r9) {
        /*
            r5 = this;
            com.fb.fluid.data.Trigger r0 = r5.f5397L
            boolean r0 = r0.mo6391i()
            if (r0 != 0) goto L_0x000b
            int r0 = r5.f5387B
            goto L_0x000d
        L_0x000b:
            int r0 = r5.f5388C
        L_0x000d:
            int r1 = r5.m7905J()
            r2 = 3
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L_0x0037
            r2 = 5
            if (r1 == r2) goto L_0x0030
            r6 = 48
            if (r1 == r6) goto L_0x0029
            r6 = 80
            if (r1 == r6) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            float r7 = r7 - r9
            float r6 = (float) r0
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x003e
            goto L_0x003d
        L_0x0029:
            float r9 = r9 - r7
            float r6 = (float) r0
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x003e
            goto L_0x003d
        L_0x0030:
            float r6 = r6 - r8
            float r7 = (float) r0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x003e
            goto L_0x003d
        L_0x0037:
            float r8 = r8 - r6
            float r6 = (float) r0
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x003e
        L_0x003d:
            r4 = 1
        L_0x003e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.p145e.C1937e.m7923c(float, float, float, float):boolean");
    }

    /* renamed from: A */
    public final boolean mo6742A() {
        return this.f5409r;
    }

    /* renamed from: B */
    public final C3351c<Boolean, Boolean, Unit> mo6743B() {
        return this.f5399N;
    }

    /* renamed from: C */
    public final Trigger mo6744C() {
        return this.f5397L;
    }

    /* renamed from: D */
    public final boolean mo6745D() {
        ViewGroup.LayoutParams layoutParams = mo6703h().getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams)) {
            layoutParams = null;
        }
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
        return layoutParams2 != null && layoutParams2.width < layoutParams2.height;
    }

    /* renamed from: a */
    public final void mo6746a(boolean z) {
        this.f5396K.setDebug(z);
    }

    /* renamed from: b */
    public final void mo6747b(Trigger trigger) {
        C3370k.m12227b(trigger, "<set-?>");
        this.f5397L = trigger;
    }

    /* renamed from: b */
    public final void mo6748b(boolean z) {
        this.f5408q = z;
    }

    /* renamed from: c */
    public final void mo6749c(boolean z) {
        this.f5409r = z;
    }

    /* renamed from: g */
    public WindowManager.LayoutParams mo6702g() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.flags = 65832;
        layoutParams.type = 2032;
        layoutParams.format = -2;
        layoutParams.screenBrightness = -1.0f;
        layoutParams.dimAmount = 0.0f;
        layoutParams.softInputMode = 16;
        boolean z = !this.f5408q && C1774j.m7475a(this.f5411t);
        Point point = new Point();
        Display display = m7902G().getDisplay(0);
        if (display != null) {
            display.getRealSize(point);
        }
        Rect rect = new Rect(0, 0, point.x, point.y);
        int[] iArr = {C1165a.m5734a(24), C1165a.m5734a(48)};
        int[] iArr2 = new int[2];
        iArr2[0] = (int) (((float) Math.min(rect.width(), rect.height())) * ((z || !C1774j.m7475a(this.f5411t)) ? 1.0f : 1.4f));
        iArr2[1] = Math.max(rect.width(), rect.height());
        int g = this.f5397L.mo6388g();
        if (g == 3 || g == 5) {
            C1780p.m7487a(rect, 0, 0, 0, rect.bottom - this.f5410s, 7, (Object) null);
        }
        if (z) {
            C1780p.m7485a(rect);
        }
        layoutParams.gravity = f5385R.mo6772a(this.f5397L, this.f5411t, z);
        Rect a = C1949f.m7985a(f5385R, rect, this.f5397L.mo6388g(), this.f5397L.mo6394l(), this.f5397L.mo6395m(), this.f5397L.mo6393k(), iArr2, 0, iArr, z, (C3355g) null, 576, (Object) null);
        layoutParams.width = a.width();
        layoutParams.height = a.height();
        layoutParams.x = a.left;
        layoutParams.y = a.top;
        C2514c cVar = this.f5396K;
        cVar.setGravity(f5385R.mo6772a(this.f5397L, this.f5411t, z));
        List<TriggerButton> e = this.f5397L.mo6384e();
        ArrayList arrayList = new ArrayList();
        for (T next : e) {
            if (((TriggerButton) next).mo6413e()) {
                arrayList.add(next);
            }
        }
        cVar.setTriggerCount(arrayList.size());
        cVar.setTransparency(this.f5397L.mo6396n());
        cVar.setIndicatorSensitivity(Math.min((float) a.height(), (float) a.width()));
        float f = 3.0f;
        if (cVar.getIndicatorSensitivity() < C1165a.m5733a(3.0f)) {
            f = 1.0f;
        }
        cVar.setIndicatorStrokeWidth(f);
        cVar.mo7421b();
        cVar.mo7420a();
        return layoutParams;
    }

    /* renamed from: l */
    public void mo6708l() {
        super.mo6708l();
        this.f5395J.mo8948c();
    }

    /* renamed from: o */
    public final C3354f<Integer, String, View, Integer, Integer, Unit> mo6721o() {
        return this.f5398M;
    }

    /* renamed from: p */
    public final C2827e<Boolean> mo6750p() {
        return this.f5406o;
    }

    /* renamed from: q */
    public final C2827e<Boolean> mo6751q() {
        return this.f5405n;
    }

    /* renamed from: r */
    public final C2827e<Boolean> mo6752r() {
        return this.f5407p;
    }

    /* renamed from: s */
    public final C2827e<Integer> mo6753s() {
        return this.f5403l;
    }

    /* renamed from: t */
    public final C2827e<Integer> mo6754t() {
        return this.f5404m;
    }

    /* renamed from: u */
    public final int mo6755u() {
        ViewGroup.LayoutParams layoutParams = mo6703h().getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams)) {
            layoutParams = null;
        }
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            return layoutParams2.gravity;
        }
        return 0;
    }

    /* renamed from: v */
    public final C3351c<TriggerButton, Boolean, Drawable> mo6756v() {
        return this.f5400O;
    }

    /* renamed from: w */
    public final int mo6757w() {
        int i;
        int i2 = 0;
        if (this.f5408q || this.f5411t != 3) {
            ViewGroup.LayoutParams layoutParams = mo6703h().getLayoutParams();
            if (!(layoutParams instanceof WindowManager.LayoutParams)) {
                layoutParams = null;
            }
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                i = layoutParams2.x;
                if (mo6745D() && (mo6755u() & 5) == 5) {
                    i2 = mo6759y();
                }
                return i - i2;
            }
        }
        i = 0;
        i2 = mo6759y();
        return i - i2;
    }

    /* renamed from: x */
    public final int mo6758x() {
        ViewGroup.LayoutParams layoutParams = mo6703h().getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams)) {
            layoutParams = null;
        }
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
        int i = 0;
        int i2 = layoutParams2 != null ? layoutParams2.y : 0;
        if (!mo6745D() && (mo6755u() & 80) == 80) {
            i = mo6759y();
        }
        return i2 - i;
    }

    /* renamed from: y */
    public final int mo6759y() {
        ViewGroup.LayoutParams layoutParams = mo6703h().getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams)) {
            layoutParams = null;
        }
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            return Math.min(layoutParams2.width, layoutParams2.height);
        }
        return 0;
    }

    /* renamed from: z */
    public final int mo6760z() {
        ViewGroup.LayoutParams layoutParams = mo6703h().getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams)) {
            layoutParams = null;
        }
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            return Math.max(layoutParams2.width, layoutParams2.height);
        }
        return 0;
    }
}
