package com.p131fb.fluid.services.p145e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.p131fb.fluid.data.Trigger;
import com.p131fb.fluid.p148ui.views.C2513b;
import com.p131fb.fluid.services.p145e.p146g.C1966c;
import com.p131fb.fluid.services.p145e.p146g.C1973f;
import com.p131fb.fluid.services.p145e.p147h.C1988a;
import com.p131fb.fluid.utils.preferences.C2527h;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.p192b0.C3204e;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3368i;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3384y;

@SuppressLint({"RtlHardcoded"})
/* renamed from: com.fb.fluid.services.e.b */
public final class C1920b extends C1917a implements C1988a {

    /* renamed from: k */
    private boolean f5349k;

    /* renamed from: l */
    private boolean f5350l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f5351m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f5352n;

    /* renamed from: o */
    private int f5353o;

    /* renamed from: p */
    private C1966c f5354p = new C1973f();

    /* renamed from: q */
    private C1966c f5355q = new C1973f();

    /* renamed from: com.fb.fluid.services.e.b$a */
    static final class C1921a implements View.OnTouchListener {

        /* renamed from: f */
        final /* synthetic */ C1920b f5356f;

        C1921a(C1920b bVar) {
            this.f5356f = bVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C3370k.m12223a((Object) motionEvent, "event");
            if (motionEvent.getAction() != 0) {
                return false;
            }
            this.f5356f.dismiss();
            return false;
        }
    }

    /* renamed from: com.fb.fluid.services.e.b$b */
    static final class C1922b extends C3371l implements C3350b<Canvas, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1920b f5357g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1922b(C1920b bVar) {
            super(1);
            this.f5357g = bVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6724a((Canvas) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6724a(Canvas canvas) {
            C3370k.m12227b(canvas, "it");
            if (this.f5357g.f5352n) {
                this.f5357g.m7845q().mo6791a(canvas);
            }
        }
    }

    /* renamed from: com.fb.fluid.services.e.b$c */
    static final /* synthetic */ class C1923c extends C3368i implements C3349a<Unit> {
        C1923c(C1920b bVar) {
            super(0, bVar);
        }

        /* renamed from: b */
        public final String mo6062b() {
            return "onDraw";
        }

        /* renamed from: h */
        public final C3204e mo6063h() {
            return C3384y.m12254a(C1920b.class);
        }

        public final void invoke() {
            ((C1920b) this.f8030g).m7847s();
        }

        /* renamed from: j */
        public final String mo6064j() {
            return "onDraw()V";
        }
    }

    /* renamed from: com.fb.fluid.services.e.b$d */
    static final /* synthetic */ class C1924d extends C3368i implements C3349a<Unit> {
        C1924d(C1920b bVar) {
            super(0, bVar);
        }

        /* renamed from: b */
        public final String mo6062b() {
            return "onDismissed";
        }

        /* renamed from: h */
        public final C3204e mo6063h() {
            return C3384y.m12254a(C1920b.class);
        }

        public final void invoke() {
            ((C1920b) this.f8030g).m7846r();
        }

        /* renamed from: j */
        public final String mo6064j() {
            return "onDismissed()V";
        }
    }

    /* renamed from: com.fb.fluid.services.e.b$e */
    public static final class C1925e implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ C1920b f5358a;

        public C1925e(C1920b bVar) {
            this.f5358a = bVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C3370k.m12227b(view, "view");
            view.removeOnLayoutChangeListener(this);
            if (!this.f5358a.m7845q().mo6805e() && this.f5358a.mo6719b()) {
                this.f5358a.f5351m = true;
                C1966c a = this.f5358a.m7845q();
                a.mo6802d(this.f5358a.mo6703h().getWidth());
                a.mo6790a(this.f5358a.mo6703h().getHeight());
                if (this.f5358a.f5352n) {
                    a.mo6801d();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1920b(Context context) {
        super(context);
        C3370k.m12227b(context, "context");
        C2513b h = mo6703h();
        h.setVisibility(0);
        h.setOnTouchListener(new C1921a(this));
        h.setOnDispatchDraw(new C1922b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final C1966c m7845q() {
        int i = this.f5353o;
        C1966c cVar = (i == 3 || i == 5) ? this.f5354p : this.f5355q;
        cVar.mo6797b((C3349a<Unit>) new C1923c(this));
        cVar.mo6793a((C3349a<Unit>) new C1924d(this));
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m7846r() {
        mo6717a(false);
        this.f5352n = false;
        this.f5351m = false;
        mo6703h().invalidate();
        mo6709m();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final void m7847s() {
        mo6703h().invalidate();
    }

    /* renamed from: a */
    public void mo6712a() {
        m7845q().mo6792a((WeakReference<Drawable>) null);
    }

    /* renamed from: a */
    public void mo6713a(int i, Integer num, Integer num2, Float f, Float f2) {
        this.f5352n = true;
        C1966c q = m7845q();
        q.mo6802d(mo6703h().getWidth());
        q.mo6790a(mo6703h().getHeight());
        q.mo6800c(i);
        int b = q.mo6795b();
        int i2 = 0;
        int width = (b == 3 || b != 5) ? 0 : q.getWidth();
        int b2 = q.mo6795b();
        if (!(b2 == 3 || b2 == 5 || b2 == 48 || b2 != 80)) {
            i2 = q.getHeight();
        }
        PointF f3 = q.mo6806f();
        f3.x = f != null ? f.floatValue() + ((float) width) : f3.x;
        f3.y = f2 != null ? f2.floatValue() + ((float) i2) : f3.y;
        Point a = q.mo6788a();
        a.x = num != null ? num.intValue() : a.x;
        a.y = num2 != null ? num2.intValue() : a.y;
        if (this.f5351m) {
            q.mo6801d();
        }
    }

    /* renamed from: a */
    public final void mo6714a(C2527h hVar, boolean z) {
        C3370k.m12227b(hVar, "preferences");
        this.f5349k = z;
        C1966c b = C1966c.f5466a.mo6817b(z ? 2 : hVar.mo7504b());
        b.mo6789a(((float) hVar.mo7488A()) / 100.0f);
        b.mo6796b(hVar.mo7520f());
        b.mo6804e(hVar.mo7516e());
        b.mo6794a(hVar.mo7493F());
        this.f5354p = b;
        C1966c b2 = C1966c.f5466a.mo6817b(z ? 1 : hVar.mo7508c());
        b2.mo6789a(((float) hVar.mo7489B()) / 100.0f);
        b2.mo6796b(hVar.mo7520f());
        b2.mo6804e(hVar.mo7516e());
        b2.mo6794a(hVar.mo7493F());
        this.f5355q = b2;
    }

    /* renamed from: a */
    public void mo6715a(Integer num, Integer num2, Float f, Float f2) {
        if (this.f5351m) {
            C1966c q = m7845q();
            int b = q.mo6795b();
            int i = 0;
            int width = (b == 3 || b != 5) ? 0 : q.getWidth();
            int b2 = q.mo6795b();
            if (!(b2 == 3 || b2 == 5 || b2 == 48 || b2 != 80)) {
                i = q.getHeight();
            }
            PointF f3 = q.mo6806f();
            f3.x = f != null ? f.floatValue() + ((float) width) : f3.x;
            f3.y = f2 != null ? f2.floatValue() + ((float) i) : f3.y;
            Point a = q.mo6788a();
            a.x = num != null ? num.intValue() : a.x;
            a.y = num2 != null ? num2.intValue() : a.y;
            q.mo6799c();
        }
    }

    /* renamed from: a */
    public void mo6716a(WeakReference<Drawable> weakReference) {
        m7845q().mo6792a(weakReference);
    }

    /* renamed from: a */
    public void mo6717a(boolean z) {
        this.f5350l = z;
    }

    /* renamed from: a */
    public boolean mo6718a(Trigger trigger) {
        C3370k.m12227b(trigger, "trigger");
        this.f5351m = false;
        mo6717a(true);
        this.f5353o = trigger.mo6388g();
        mo6698c();
        mo6703h().addOnLayoutChangeListener(new C1925e(this));
        return true;
    }

    /* renamed from: b */
    public boolean mo6719b() {
        return this.f5350l;
    }

    public void dismiss() {
        m7845q().dismiss();
    }

    /* renamed from: g */
    public WindowManager.LayoutParams mo6702g() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.flags = 16843048;
        layoutParams.type = 2032;
        layoutParams.format = -2;
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.screenBrightness = -1.0f;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.gravity = 85;
        layoutParams.dimAmount = 0.0f;
        layoutParams.softInputMode = 48;
        return layoutParams;
    }

    public boolean isVisible() {
        return this.f5352n;
    }

    /* renamed from: o */
    public final void mo6721o() {
        m7845q().dismiss();
        m7846r();
    }

    /* renamed from: p */
    public final boolean mo6722p() {
        return this.f5349k;
    }
}
