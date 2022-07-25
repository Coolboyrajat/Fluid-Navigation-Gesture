package com.p131fb.fluid.p135l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p206c.C3353e;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p006b.p026g.p035k.C0845c;
import p054c.p079d.p080a.p081a.p082a.C1165a;

@SuppressLint({"ClickableViewAccessibility", "RtlHardcoded"})
/* renamed from: com.fb.fluid.l.i */
public final class C1743i implements View.OnTouchListener {

    /* renamed from: f */
    private final C0845c f5049f = new C0845c(this.f5061r, new C1744a(this));

    /* renamed from: g */
    private C3350b<? super MotionEvent, Unit> f5050g = C1746c.f5064g;

    /* renamed from: h */
    private C3350b<? super MotionEvent, Unit> f5051h = C1750g.f5068g;

    /* renamed from: i */
    private C3350b<? super MotionEvent, Unit> f5052i = C1745b.f5063g;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C3350b<? super MotionEvent, Boolean> f5053j = C1751h.f5069g;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C3353e<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> f5054k = C1749f.f5067g;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C3353e<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> f5055l = C1747d.f5065g;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C3351c<? super MotionEvent, ? super Integer, Unit> f5056m = C1748e.f5066g;

    /* renamed from: n */
    private int f5057n = C1165a.m5734a(4);

    /* renamed from: o */
    private float f5058o;

    /* renamed from: p */
    private float f5059p;

    /* renamed from: q */
    private int f5060q;

    /* renamed from: r */
    private final Context f5061r;

    /* renamed from: com.fb.fluid.l.i$a */
    public static final class C1744a implements GestureDetector.OnGestureListener {

        /* renamed from: f */
        final /* synthetic */ C1743i f5062f;

        C1744a(C1743i iVar) {
            this.f5062f = iVar;
        }

        public boolean onDown(MotionEvent motionEvent) {
            this.f5062f.m7386e();
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C3370k.m12227b(motionEvent, "eventDown");
            C3370k.m12227b(motionEvent2, "eventLast");
            C3353e b = this.f5062f.f5055l;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            C3370k.m12223a((Object) obtain, "MotionEvent.obtain(eventDown)");
            MotionEvent obtain2 = MotionEvent.obtain(motionEvent2);
            C3370k.m12223a((Object) obtain2, "MotionEvent.obtain(eventLast)");
            return ((Boolean) b.mo6514a(obtain, obtain2, Float.valueOf(f), Float.valueOf(f2))).booleanValue();
        }

        public void onLongPress(MotionEvent motionEvent) {
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C3370k.m12227b(motionEvent, "eventDown");
            C3370k.m12227b(motionEvent2, "eventLast");
            this.f5062f.mo6495a(motionEvent2.getX() - motionEvent.getX());
            this.f5062f.mo6499b(motionEvent2.getY() - motionEvent.getY());
            boolean z = false;
            boolean z2 = motionEvent.getX() > motionEvent2.getX();
            if (motionEvent.getY() > motionEvent2.getY()) {
                z = true;
            }
            int i = 48;
            int i2 = 3;
            this.f5062f.mo6496a((Math.abs(f) <= Math.abs(f2) || !z2) ? Math.abs(f) > Math.abs(f2) ? 5 : z ? 48 : 80 : 3);
            if (this.f5062f.mo6501c() != 0 || Math.abs(this.f5062f.mo6491a()) <= ((float) this.f5062f.mo6504d())) {
                if (this.f5062f.mo6501c() == 0 && Math.abs(this.f5062f.mo6497b()) > ((float) this.f5062f.mo6504d())) {
                    C1743i iVar = this.f5062f;
                    if (!z) {
                        i = 80;
                    }
                    iVar.mo6500b(i);
                }
                C3353e d = this.f5062f.f5054k;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                C3370k.m12223a((Object) obtain, "MotionEvent.obtain(eventDown)");
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent2);
                C3370k.m12223a((Object) obtain2, "MotionEvent.obtain(eventLast)");
                d.mo6514a(obtain, obtain2, Float.valueOf(f), Float.valueOf(f2));
                return true;
            }
            C1743i iVar2 = this.f5062f;
            if (!z2) {
                i2 = 5;
            }
            iVar2.mo6500b(i2);
            C3351c c = this.f5062f.f5056m;
            MotionEvent obtain3 = MotionEvent.obtain(motionEvent2);
            C3370k.m12223a((Object) obtain3, "MotionEvent.obtain(eventLast)");
            c.mo6125a(obtain3, Integer.valueOf(this.f5062f.mo6501c()));
            C3353e d2 = this.f5062f.f5054k;
            MotionEvent obtain4 = MotionEvent.obtain(motionEvent);
            C3370k.m12223a((Object) obtain4, "MotionEvent.obtain(eventDown)");
            MotionEvent obtain22 = MotionEvent.obtain(motionEvent2);
            C3370k.m12223a((Object) obtain22, "MotionEvent.obtain(eventLast)");
            d2.mo6514a(obtain4, obtain22, Float.valueOf(f), Float.valueOf(f2));
            return true;
        }

        public void onShowPress(MotionEvent motionEvent) {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            Boolean bool;
            if (motionEvent == null || (bool = (Boolean) this.f5062f.f5053j.mo5146a(motionEvent)) == null) {
                return false;
            }
            return bool.booleanValue();
        }
    }

    /* renamed from: com.fb.fluid.l.i$b */
    static final class C1745b extends C3371l implements C3350b<MotionEvent, Unit> {

        /* renamed from: g */
        public static final C1745b f5063g = new C1745b();

        C1745b() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6512a((MotionEvent) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6512a(MotionEvent motionEvent) {
            C3370k.m12227b(motionEvent, "it");
        }
    }

    /* renamed from: com.fb.fluid.l.i$c */
    static final class C1746c extends C3371l implements C3350b<MotionEvent, Unit> {

        /* renamed from: g */
        public static final C1746c f5064g = new C1746c();

        C1746c() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6513a((MotionEvent) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6513a(MotionEvent motionEvent) {
            C3370k.m12227b(motionEvent, "it");
        }
    }

    /* renamed from: com.fb.fluid.l.i$d */
    static final class C1747d extends C3371l implements C3353e<MotionEvent, MotionEvent, Float, Float, Boolean> {

        /* renamed from: g */
        public static final C1747d f5065g = new C1747d();

        C1747d() {
            super(4);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6514a(Object obj, Object obj2, Object obj3, Object obj4) {
            return Boolean.valueOf(mo6515a((MotionEvent) obj, (MotionEvent) obj2, ((Number) obj3).floatValue(), ((Number) obj4).floatValue()));
        }

        /* renamed from: a */
        public final boolean mo6515a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C3370k.m12227b(motionEvent, "<anonymous parameter 0>");
            C3370k.m12227b(motionEvent2, "<anonymous parameter 1>");
            return false;
        }
    }

    /* renamed from: com.fb.fluid.l.i$e */
    static final class C1748e extends C3371l implements C3351c<MotionEvent, Integer, Unit> {

        /* renamed from: g */
        public static final C1748e f5066g = new C1748e();

        C1748e() {
            super(2);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
            mo6516a((MotionEvent) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6516a(MotionEvent motionEvent, int i) {
            C3370k.m12227b(motionEvent, "<anonymous parameter 0>");
        }
    }

    /* renamed from: com.fb.fluid.l.i$f */
    static final class C1749f extends C3371l implements C3353e<MotionEvent, MotionEvent, Float, Float, Boolean> {

        /* renamed from: g */
        public static final C1749f f5067g = new C1749f();

        C1749f() {
            super(4);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6514a(Object obj, Object obj2, Object obj3, Object obj4) {
            return Boolean.valueOf(mo6517a((MotionEvent) obj, (MotionEvent) obj2, ((Number) obj3).floatValue(), ((Number) obj4).floatValue()));
        }

        /* renamed from: a */
        public final boolean mo6517a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C3370k.m12227b(motionEvent, "<anonymous parameter 0>");
            C3370k.m12227b(motionEvent2, "<anonymous parameter 1>");
            return false;
        }
    }

    /* renamed from: com.fb.fluid.l.i$g */
    static final class C1750g extends C3371l implements C3350b<MotionEvent, Unit> {

        /* renamed from: g */
        public static final C1750g f5068g = new C1750g();

        C1750g() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6518a((MotionEvent) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6518a(MotionEvent motionEvent) {
            C3370k.m12227b(motionEvent, "it");
        }
    }

    /* renamed from: com.fb.fluid.l.i$h */
    static final class C1751h extends C3371l implements C3350b<MotionEvent, Boolean> {

        /* renamed from: g */
        public static final C1751h f5069g = new C1751h();

        C1751h() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo6519a((MotionEvent) obj));
        }

        /* renamed from: a */
        public final boolean mo6519a(MotionEvent motionEvent) {
            C3370k.m12227b(motionEvent, "it");
            return false;
        }
    }

    public C1743i(Context context, C3350b<? super C1743i, Unit> bVar) {
        C3370k.m12227b(context, "context");
        this.f5061r = context;
        this.f5049f.mo4563a(false);
        if (bVar != null) {
            bVar.mo5146a(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m7386e() {
        this.f5060q = 0;
    }

    /* renamed from: a */
    public final float mo6491a() {
        return this.f5058o;
    }

    /* renamed from: a */
    public final C1743i mo6492a(C3350b<? super MotionEvent, Unit> bVar) {
        C3370k.m12227b(bVar, "onCancel");
        this.f5052i = bVar;
        return this;
    }

    /* renamed from: a */
    public final C1743i mo6493a(C3351c<? super MotionEvent, ? super Integer, Unit> cVar) {
        C3370k.m12227b(cVar, "onInitDirection");
        this.f5056m = cVar;
        return this;
    }

    /* renamed from: a */
    public final C1743i mo6494a(C3353e<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> eVar) {
        C3370k.m12227b(eVar, "onSwipe");
        this.f5054k = eVar;
        return this;
    }

    /* renamed from: a */
    public final void mo6495a(float f) {
        this.f5058o = f;
    }

    /* renamed from: a */
    public final void mo6496a(int i) {
    }

    /* renamed from: b */
    public final float mo6497b() {
        return this.f5059p;
    }

    /* renamed from: b */
    public final C1743i mo6498b(C3350b<? super MotionEvent, Unit> bVar) {
        C3370k.m12227b(bVar, "onDown");
        this.f5050g = bVar;
        return this;
    }

    /* renamed from: b */
    public final void mo6499b(float f) {
        this.f5059p = f;
    }

    /* renamed from: b */
    public final void mo6500b(int i) {
        this.f5060q = i;
    }

    /* renamed from: c */
    public final int mo6501c() {
        return this.f5060q;
    }

    /* renamed from: c */
    public final C1743i mo6502c(C3350b<? super MotionEvent, Unit> bVar) {
        C3370k.m12227b(bVar, "onUp");
        this.f5051h = bVar;
        return this;
    }

    /* renamed from: c */
    public final void mo6503c(int i) {
        this.f5057n = i;
    }

    /* renamed from: d */
    public final int mo6504d() {
        return this.f5057n;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C3350b<? super MotionEvent, Unit> bVar;
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    bVar = this.f5051h;
                } else if (action == 3) {
                    bVar = this.f5052i;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                C3370k.m12223a((Object) obtain, "MotionEvent.obtain(this)");
                bVar.mo5146a(obtain);
                m7386e();
            } else {
                C3350b<? super MotionEvent, Unit> bVar2 = this.f5050g;
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                C3370k.m12223a((Object) obtain2, "MotionEvent.obtain(this)");
                bVar2.mo5146a(obtain2);
            }
            try {
                this.f5049f.mo4564a(motionEvent);
            } catch (IllegalArgumentException unused) {
            }
        }
        return true;
    }
}
