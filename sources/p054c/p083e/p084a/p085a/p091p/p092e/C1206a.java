package p054c.p083e.p084a.p085a.p091p.p092e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import p054c.p083e.p084a.p085a.p089n.C1191a;
import p054c.p083e.p084a.p085a.p091p.C1198c;
import p054c.p083e.p084a.p085a.p091p.C1200d;

/* renamed from: c.e.a.a.p.e.a */
public class C1206a extends C1191a implements C1200d {

    /* renamed from: t */
    private final C1198c f3960t;

    /* renamed from: a */
    public void mo5404a() {
        this.f3960t.mo5414a();
        throw null;
    }

    /* renamed from: b */
    public void mo5405b() {
        this.f3960t.mo5419b();
        throw null;
    }

    public void draw(Canvas canvas) {
        C1198c cVar = this.f3960t;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.mo5416a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f3960t.mo5420c();
        throw null;
    }

    public int getCircularRevealScrimColor() {
        this.f3960t.mo5421d();
        throw null;
    }

    public C1200d.C1205e getRevealInfo() {
        this.f3960t.mo5422e();
        throw null;
    }

    public boolean isOpaque() {
        C1198c cVar = this.f3960t;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.mo5423f();
        throw null;
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f3960t.mo5417a(drawable);
        throw null;
    }

    public void setCircularRevealScrimColor(int i) {
        this.f3960t.mo5415a(i);
        throw null;
    }

    public void setRevealInfo(C1200d.C1205e eVar) {
        this.f3960t.mo5418a(eVar);
        throw null;
    }
}
