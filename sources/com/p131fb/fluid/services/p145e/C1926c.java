package com.p131fb.fluid.services.p145e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import com.p131fb.fluid.data.Trigger;
import com.p131fb.fluid.data.TriggerButton;
import com.p131fb.fluid.p148ui.views.C2513b;
import com.p131fb.fluid.services.p145e.C1937e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.C3256e;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p206c.C3355g;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;
import p054c.p079d.p080a.p081a.p082a.C1165a;
import p190io.objectbox.android.C3148R;

@SuppressLint({"RtlHardcoded"})
/* renamed from: com.fb.fluid.services.e.c */
public final class C1926c extends C1917a {

    /* renamed from: p */
    static final /* synthetic */ C3208i[] f5359p;

    /* renamed from: k */
    private final C3256e f5360k;

    /* renamed from: l */
    private boolean f5361l;

    /* renamed from: m */
    private Trigger f5362m = new Trigger();

    /* renamed from: n */
    private C3351c<? super Trigger, ? super TriggerButton, Unit> f5363n;

    /* renamed from: o */
    private int f5364o;

    /* renamed from: com.fb.fluid.services.e.c$a */
    static final class C1927a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C1926c f5365f;

        /* renamed from: com.fb.fluid.services.e.c$a$a */
        public static final class C1928a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return C3303b.m12118a(Integer.valueOf(((TriggerButton) t).mo6415g()), Integer.valueOf(((TriggerButton) t2).mo6415g()));
            }
        }

        C1927a(C1926c cVar, Context context) {
            this.f5365f = cVar;
        }

        public final void onClick(View view) {
            C3351c<Trigger, TriggerButton, Unit> q;
            TriggerButton triggerButton = (TriggerButton) C3292r.m12084a(C3292r.m12088a(this.f5365f.mo6732r().mo6384e(), new C1928a()), this.f5365f.mo6721o());
            if (triggerButton != null && (q = this.f5365f.mo6731q()) != null) {
                Unit a = q.mo6125a(this.f5365f.mo6732r(), triggerButton);
            }
        }
    }

    /* renamed from: com.fb.fluid.services.e.c$b */
    static final class C1929b extends C3371l implements C3349a<DisplayManager> {

        /* renamed from: g */
        final /* synthetic */ Context f5366g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1929b(Context context) {
            super(0);
            this.f5366g = context;
        }

        public final DisplayManager invoke() {
            Object systemService = this.f5366g.getSystemService("display");
            if (systemService != null) {
                return (DisplayManager) systemService;
            }
            throw new C3269p("null cannot be cast to non-null type android.hardware.display.DisplayManager");
        }
    }

    /* renamed from: com.fb.fluid.services.e.c$c */
    static final class C1930c extends C3371l implements C3355g<Rect, Integer, Integer, Integer, Integer, int[], Boolean, Unit> {

        /* renamed from: g */
        final /* synthetic */ WindowManager.LayoutParams f5367g;

        /* renamed from: h */
        final /* synthetic */ int[] f5368h;

        /* renamed from: i */
        final /* synthetic */ boolean f5369i;

        /* renamed from: j */
        final /* synthetic */ C1926c f5370j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1930c(WindowManager.LayoutParams layoutParams, int[] iArr, boolean z, C1926c cVar) {
            super(7);
            this.f5367g = layoutParams;
            this.f5368h = iArr;
            this.f5369i = z;
            this.f5370j = cVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6735a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            mo6736a((Rect) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue(), ((Number) obj5).intValue(), (int[]) obj6, ((Boolean) obj7).booleanValue());
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6736a(Rect rect, int i, int i2, int i3, int i4, int[] iArr, boolean z) {
            C3370k.m12227b(rect, "rect");
            C3370k.m12227b(iArr, "<anonymous parameter 5>");
            List<TriggerButton> e = this.f5370j.mo6732r().mo6384e();
            ArrayList arrayList = new ArrayList();
            for (T next : e) {
                if (((TriggerButton) next).mo6413e()) {
                    arrayList.add(next);
                }
            }
            int size = i3 / arrayList.size();
            int a = C1165a.m5734a(36);
            Rect a2 = C1937e.f5385R.mo6773a(this.f5370j.mo6732r().mo6388g(), a, a, ((i4 + (this.f5370j.m7869t() * size)) + (size / 2)) - (a / 2), this.f5368h, this.f5369i);
            int i5 = 0;
            boolean z2 = rect.width() < rect.height();
            this.f5367g.width = a2.width();
            this.f5367g.height = a2.height();
            this.f5367g.x = a2.left + (z2 ? C1165a.m5734a(4) + i2 : 0);
            WindowManager.LayoutParams layoutParams = this.f5367g;
            int i6 = a2.top;
            if (!z2) {
                i5 = i2 + C1165a.m5734a(4);
            }
            layoutParams.y = i6 + i5;
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C1926c.class), "displayManager", "getDisplayManager()Landroid/hardware/display/DisplayManager;");
        C3384y.m12259a((C3379t) uVar);
        f5359p = new C3208i[]{uVar};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1926c(Context context) {
        super(context);
        C3370k.m12227b(context, "context");
        this.f5360k = C3258g.m11969a(new C1929b(context));
        C2513b h = mo6703h();
        View inflate = LayoutInflater.from(context).inflate(C3148R.layout.layout_button_config, h, true);
        inflate.setOnClickListener(new C1927a(this, context));
        C3370k.m12223a((Object) inflate, "LayoutInflater\n         …nvoke(trigger, it) }  } }");
        h.setVisibility(0);
        h.setClipToPadding(false);
        h.setClipChildren(false);
    }

    /* renamed from: s */
    private final DisplayManager m7868s() {
        C3256e eVar = this.f5360k;
        C3208i iVar = f5359p[0];
        return (DisplayManager) eVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final int m7869t() {
        C1937e.C1949f fVar = C1937e.f5385R;
        int i = this.f5364o;
        List<TriggerButton> e = this.f5362m.mo6384e();
        ArrayList arrayList = new ArrayList();
        for (T next : e) {
            if (((TriggerButton) next).mo6413e()) {
                arrayList.add(next);
            }
        }
        return fVar.mo6771a(i, arrayList.size(), mo6730p(), this.f5361l, this.f5362m.mo6388g());
    }

    /* renamed from: a */
    public final void mo6726a(int i) {
        this.f5364o = i;
    }

    /* renamed from: a */
    public final void mo6727a(C3351c<? super Trigger, ? super TriggerButton, Unit> cVar) {
        this.f5363n = cVar;
    }

    /* renamed from: a */
    public final void mo6728a(boolean z) {
        this.f5361l = z;
    }

    /* renamed from: b */
    public final void mo6729b(Trigger trigger) {
        C3370k.m12227b(trigger, "<set-?>");
        this.f5362m = trigger;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        r3 = mo6706j().getDefaultDisplay();
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.WindowManager.LayoutParams mo6702g() {
        /*
            r20 = this;
            r0 = r20
            android.view.WindowManager$LayoutParams r1 = new android.view.WindowManager$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            r3 = 65832(0x10128, float:9.225E-41)
            r1.flags = r3
            r3 = 1003(0x3eb, float:1.406E-42)
            r1.type = r3
            r1.format = r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.screenBrightness = r2
            r2 = 0
            r1.dimAmount = r2
            r2 = 16
            r1.softInputMode = r2
            r2 = 2
            r1.rotationAnimation = r2
            com.fb.fluid.ui.views.b r3 = r20.mo6703h()
            android.view.Display r3 = r3.getDisplay()
            if (r3 == 0) goto L_0x0034
        L_0x002b:
            int r3 = r3.getRotation()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0040
        L_0x0034:
            android.view.WindowManager r3 = r20.mo6706j()
            android.view.Display r3 = r3.getDefaultDisplay()
            if (r3 == 0) goto L_0x003f
            goto L_0x002b
        L_0x003f:
            r3 = 0
        L_0x0040:
            r4 = 0
            if (r3 == 0) goto L_0x0048
            int r3 = r3.intValue()
            goto L_0x0049
        L_0x0048:
            r3 = 0
        L_0x0049:
            com.fb.fluid.utils.preferences.h r5 = new com.fb.fluid.utils.preferences.h
            android.content.Context r6 = r20.mo6701f()
            r5.<init>(r6)
            boolean r5 = r5.mo7558z()
            r6 = 1
            if (r5 != 0) goto L_0x0061
            boolean r5 = com.p131fb.fluid.p135l.p139p.C1774j.m7475a(r3)
            if (r5 == 0) goto L_0x0061
            r5 = 1
            goto L_0x0062
        L_0x0061:
            r5 = 0
        L_0x0062:
            android.graphics.Point r7 = new android.graphics.Point
            r7.<init>()
            android.hardware.display.DisplayManager r8 = r20.m7868s()
            android.view.Display r8 = r8.getDisplay(r4)
            if (r8 == 0) goto L_0x0074
            r8.getRealSize(r7)
        L_0x0074:
            android.graphics.Rect r8 = new android.graphics.Rect
            int r9 = r7.x
            int r7 = r7.y
            r8.<init>(r4, r4, r9, r7)
            int[] r15 = new int[r2]
            r7 = 24
            int r7 = p054c.p079d.p080a.p081a.p082a.C1165a.m5734a((int) r7)
            r15[r4] = r7
            r7 = 48
            int r7 = p054c.p079d.p080a.p081a.p082a.C1165a.m5734a((int) r7)
            r15[r6] = r7
            int[] r13 = new int[r2]
            int r2 = r8.width()
            int r7 = r8.height()
            int r2 = java.lang.Math.min(r2, r7)
            float r2 = (float) r2
            if (r5 != 0) goto L_0x00aa
            boolean r7 = com.p131fb.fluid.p135l.p139p.C1774j.m7475a(r3)
            if (r7 == 0) goto L_0x00aa
            r7 = 1068708659(0x3fb33333, float:1.4)
            goto L_0x00ac
        L_0x00aa:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x00ac:
            float r2 = r2 * r7
            int r2 = (int) r2
            r13[r4] = r2
            int r2 = r8.width()
            int r4 = r8.height()
            int r2 = java.lang.Math.max(r2, r4)
            r13[r6] = r2
            if (r5 == 0) goto L_0x00c4
            com.p131fb.fluid.p135l.p139p.C1780p.m7485a(r8)
        L_0x00c4:
            com.fb.fluid.services.e.e$f r2 = com.p131fb.fluid.services.p145e.C1937e.f5385R
            com.fb.fluid.data.Trigger r4 = r0.f5362m
            int r2 = r2.mo6772a(r4, r3, r5)
            r1.gravity = r2
            com.fb.fluid.services.e.e$f r7 = com.p131fb.fluid.services.p145e.C1937e.f5385R
            com.fb.fluid.data.Trigger r2 = r0.f5362m
            int r9 = r2.mo6388g()
            com.fb.fluid.data.Trigger r2 = r0.f5362m
            int r10 = r2.mo6394l()
            com.fb.fluid.data.Trigger r2 = r0.f5362m
            int r11 = r2.mo6395m()
            com.fb.fluid.data.Trigger r2 = r0.f5362m
            int r12 = r2.mo6393k()
            r14 = 0
            com.fb.fluid.services.e.c$c r2 = new com.fb.fluid.services.e.c$c
            r2.<init>(r1, r15, r5, r0)
            r18 = 64
            r19 = 0
            r16 = r5
            r17 = r2
            com.p131fb.fluid.services.p145e.C1937e.C1949f.m7985a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.p145e.C1926c.mo6702g():android.view.WindowManager$LayoutParams");
    }

    /* renamed from: o */
    public final int mo6721o() {
        return this.f5364o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r0 = mo6706j().getDefaultDisplay();
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo6730p() {
        /*
            r1 = this;
            com.fb.fluid.ui.views.b r0 = r1.mo6703h()
            android.view.Display r0 = r0.getDisplay()
            if (r0 == 0) goto L_0x0013
        L_0x000a:
            int r0 = r0.getRotation()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x001f
        L_0x0013:
            android.view.WindowManager r0 = r1.mo6706j()
            android.view.Display r0 = r0.getDefaultDisplay()
            if (r0 == 0) goto L_0x001e
            goto L_0x000a
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 == 0) goto L_0x0026
            int r0 = r0.intValue()
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.p145e.C1926c.mo6730p():int");
    }

    /* renamed from: q */
    public final C3351c<Trigger, TriggerButton, Unit> mo6731q() {
        return this.f5363n;
    }

    /* renamed from: r */
    public final Trigger mo6732r() {
        return this.f5362m;
    }
}
