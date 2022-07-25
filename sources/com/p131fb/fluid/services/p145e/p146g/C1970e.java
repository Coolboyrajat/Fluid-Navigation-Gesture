package com.p131fb.fluid.services.p145e.p146g;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;

/* renamed from: com.fb.fluid.services.e.g.e */
public final class C1970e implements C1966c {

    /* renamed from: b */
    private int f5470b;

    /* renamed from: c */
    private int f5471c;

    /* renamed from: d */
    private int f5472d;

    /* renamed from: e */
    private final Point f5473e = new Point();

    /* renamed from: f */
    private final PointF f5474f = new PointF();

    /* renamed from: g */
    private boolean f5475g;

    /* renamed from: h */
    private C3349a<Unit> f5476h;

    /* renamed from: com.fb.fluid.services.e.g.e$a */
    static final class C1971a extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        public static final C1971a f5477g = new C1971a();

        C1971a() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: com.fb.fluid.services.e.g.e$b */
    static final class C1972b extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        public static final C1972b f5478g = new C1972b();

        C1972b() {
            super(0);
        }

        public final void invoke() {
        }
    }

    public C1970e() {
        C1972b bVar = C1972b.f5478g;
        this.f5476h = C1971a.f5477g;
    }

    /* renamed from: a */
    public Point mo6788a() {
        return this.f5473e;
    }

    /* renamed from: a */
    public void mo6789a(float f) {
    }

    /* renamed from: a */
    public void mo6790a(int i) {
        this.f5471c = i;
    }

    /* renamed from: a */
    public void mo6791a(Canvas canvas) {
        C3370k.m12227b(canvas, "canvas");
    }

    /* renamed from: a */
    public void mo6792a(WeakReference<Drawable> weakReference) {
    }

    /* renamed from: a */
    public void mo6793a(C3349a<Unit> aVar) {
        C3370k.m12227b(aVar, "<set-?>");
        this.f5476h = aVar;
    }

    /* renamed from: a */
    public void mo6794a(boolean z) {
    }

    /* renamed from: b */
    public int mo6795b() {
        return this.f5472d;
    }

    /* renamed from: b */
    public void mo6796b(int i) {
    }

    /* renamed from: b */
    public void mo6797b(C3349a<Unit> aVar) {
        C3370k.m12227b(aVar, "<set-?>");
    }

    /* renamed from: c */
    public void mo6799c() {
    }

    /* renamed from: c */
    public void mo6800c(int i) {
        this.f5472d = i;
    }

    /* renamed from: d */
    public void mo6801d() {
    }

    /* renamed from: d */
    public void mo6802d(int i) {
        this.f5470b = i;
    }

    public void dismiss() {
        mo6818g().invoke();
    }

    /* renamed from: e */
    public void mo6804e(int i) {
    }

    /* renamed from: e */
    public boolean mo6805e() {
        return this.f5475g;
    }

    /* renamed from: f */
    public PointF mo6806f() {
        return this.f5474f;
    }

    /* renamed from: g */
    public C3349a<Unit> mo6818g() {
        return this.f5476h;
    }

    public int getHeight() {
        return this.f5471c;
    }

    public int getWidth() {
        return this.f5470b;
    }
}
