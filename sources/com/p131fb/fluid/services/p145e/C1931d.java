package com.p131fb.fluid.services.p145e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.p131fb.fluid.p135l.C1737e;
import com.p131fb.fluid.p135l.p139p.C1774j;
import com.p131fb.fluid.p135l.p139p.C1776l;
import com.p131fb.fluid.p135l.p143t.C1798b;
import com.p131fb.fluid.p148ui.views.C2513b;
import java.util.List;
import kotlin.C3265l;
import kotlin.Unit;
import kotlin.p192b0.C3204e;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p197u.p199i.p200a.C3332f;
import kotlin.p197u.p199i.p200a.C3339l;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3368i;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3384y;
import kotlinx.coroutines.C3418e0;
import kotlinx.coroutines.C3422f0;
import kotlinx.coroutines.C3430h0;
import kotlinx.coroutines.C3499j1;
import kotlinx.coroutines.C3516o0;
import kotlinx.coroutines.C3536t0;
import p054c.p079d.p080a.p081a.p082a.C1165a;
import p155d.p156a.p162q.C2827e;

@SuppressLint({"RtlHardcoded"})
/* renamed from: com.fb.fluid.services.e.d */
public final class C1931d extends C1917a {

    /* renamed from: k */
    private final C2827e<List<Integer>> f5371k = new C1934c(this);

    /* renamed from: l */
    private C1798b<Boolean> f5372l = new C1798b<>(false);

    /* renamed from: m */
    private int f5373m = -1;

    /* renamed from: n */
    private C3349a<Unit> f5374n;

    /* renamed from: o */
    private final C1737e f5375o = new C1737e(500);
    /* access modifiers changed from: private */

    /* renamed from: p */
    public List<Integer> f5376p = C3284j.m12070b((T[]) new Integer[]{0, 0, 0, 0});

    /* renamed from: com.fb.fluid.services.e.d$a */
    static final class C1932a implements View.OnTouchListener {

        /* renamed from: f */
        final /* synthetic */ C1931d f5377f;

        C1932a(C1931d dVar) {
            this.f5377f = dVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C3349a<Unit> p;
            C3370k.m12223a((Object) motionEvent, "event");
            if (motionEvent.getAction() != 4 || (p = this.f5377f.mo6738p()) == null) {
                return false;
            }
            Unit invoke = p.invoke();
            return false;
        }
    }

    /* renamed from: com.fb.fluid.services.e.d$b */
    static final /* synthetic */ class C1933b extends C3368i implements C3349a<Unit> {
        C1933b(C1931d dVar) {
            super(0, dVar);
        }

        /* renamed from: b */
        public final String mo6062b() {
            return "testFullscreen";
        }

        /* renamed from: h */
        public final C3204e mo6063h() {
            return C3384y.m12254a(C1931d.class);
        }

        public final void invoke() {
            ((C1931d) this.f8030g).m7886s();
        }

        /* renamed from: j */
        public final String mo6064j() {
            return "testFullscreen()V";
        }
    }

    /* renamed from: com.fb.fluid.services.e.d$c */
    static final class C1934c<T> implements C2827e<List<? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ C1931d f5378a;

        C1934c(C1931d dVar) {
            this.f5378a = dVar;
        }

        /* renamed from: a */
        public final void accept(List<Integer> list) {
            C1931d dVar = this.f5378a;
            C3370k.m12223a((Object) list, "it");
            dVar.f5376p = list;
        }
    }

    /* renamed from: com.fb.fluid.services.e.d$d */
    static final class C1935d extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        final /* synthetic */ C1931d f5379g;

        @C3332f(mo10052c = "com.fb.fluid.services.windows.WindowSystemEventsDetector$testFullscreen$1$1", mo10053f = "WindowSystemEventsDetector.kt", mo10054l = {115}, mo10055m = "invokeSuspend")
        /* renamed from: com.fb.fluid.services.e.d$d$a */
        static final class C1936a extends C3339l implements C3351c<C3418e0, C3309c<? super Unit>, Object> {

            /* renamed from: j */
            private C3418e0 f5380j;

            /* renamed from: k */
            Object f5381k;

            /* renamed from: l */
            int f5382l;

            /* renamed from: m */
            final /* synthetic */ C1935d f5383m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1936a(C1935d dVar, C3309c cVar) {
                super(2, cVar);
                this.f5383m = dVar;
            }

            /* renamed from: a */
            public final Object mo6125a(Object obj, Object obj2) {
                return ((C1936a) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
            }

            /* renamed from: a */
            public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
                C3370k.m12227b(cVar, "completion");
                C1936a aVar = new C1936a(this.f5383m, cVar);
                aVar.f5380j = (C3418e0) obj;
                return aVar;
            }

            /* renamed from: b */
            public final Object mo6618b(Object obj) {
                Object a = C3326d.m12146a();
                int i = this.f5382l;
                if (i == 0) {
                    C3265l.m11979a(obj);
                    C3418e0 e0Var = this.f5380j;
                    this.f5383m.f5379g.m7887t();
                    if (C1774j.m7475a(this.f5383m.f5379g.m7885r())) {
                        this.f5381k = e0Var;
                        this.f5382l = 1;
                        if (C3516o0.m12660a(1000, this) == a) {
                            return a;
                        }
                    }
                    return Unit.INSTANCE;
                } else if (i == 1) {
                    C3418e0 e0Var2 = (C3418e0) this.f5381k;
                    C3265l.m11979a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f5383m.f5379g.m7887t();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1935d(C1931d dVar) {
            super(0);
            this.f5379g = dVar;
        }

        public final void invoke() {
            C3499j1 unused = C3417e.m12335a(C3422f0.m12341a(C3536t0.m12776a()), (C3314f) null, (C3430h0) null, new C1936a(this, (C3309c) null), 3, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1931d(Context context) {
        super(context);
        C3370k.m12227b(context, "context");
        C2513b h = mo6703h();
        h.setClipToPadding(false);
        h.setClipChildren(false);
        h.setVisibility(0);
        h.setOnLayoutChanged(new C1933b(this));
        h.setOnTouchListener(new C1932a(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r0 = mo6706j().getDefaultDisplay();
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int m7885r() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.services.p145e.C1931d.m7885r():int");
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final void m7886s() {
        this.f5375o.mo6480a(new C1935d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final void m7887t() {
        try {
            Point point = new Point();
            Display display = mo6703h().getDisplay();
            if (display != null) {
                display.getRealSize(point);
            }
            Rect rect = new Rect();
            mo6703h().getWindowVisibleDisplayFrame(rect);
            this.f5372l.mo6588a(Boolean.valueOf(mo6707k().mo6589b().booleanValue() && ((point.x + point.y) - (rect.width() + rect.height())) - C3292r.m12101f((Iterable<Integer>) this.f5376p) == 0));
        } catch (Exception e) {
            C1776l.m7478a("wsed.e.1 " + e.getMessage(), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: a */
    public final void mo6737a(C3349a<Unit> aVar) {
        this.f5374n = aVar;
    }

    /* renamed from: g */
    public WindowManager.LayoutParams mo6702g() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.flags = 262184;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        layoutParams.type = 2032;
        layoutParams.format = -2;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.width = C1165a.m5734a(1);
        layoutParams.height = C1165a.m5734a(1);
        layoutParams.softInputMode = 16;
        layoutParams.gravity = 49;
        layoutParams.screenBrightness = -1.0f;
        layoutParams.dimAmount = 0.0f;
        layoutParams.screenOrientation = this.f5373m;
        return layoutParams;
    }

    /* renamed from: o */
    public final C2827e<List<Integer>> mo6721o() {
        return this.f5371k;
    }

    /* renamed from: p */
    public final C3349a<Unit> mo6738p() {
        return this.f5374n;
    }

    /* renamed from: q */
    public final C1798b<Boolean> mo6739q() {
        return this.f5372l;
    }
}
