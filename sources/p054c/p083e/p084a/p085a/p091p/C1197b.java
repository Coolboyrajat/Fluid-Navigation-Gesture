package p054c.p083e.p084a.p085a.p091p;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import p054c.p083e.p084a.p085a.p091p.C1200d;

/* renamed from: c.e.a.a.p.b */
public class C1197b extends FrameLayout implements C1200d {

    /* renamed from: f */
    private final C1198c f3951f;

    /* renamed from: a */
    public void mo5404a() {
        this.f3951f.mo5414a();
        throw null;
    }

    /* renamed from: b */
    public void mo5405b() {
        this.f3951f.mo5419b();
        throw null;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        C1198c cVar = this.f3951f;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.mo5416a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f3951f.mo5420c();
        throw null;
    }

    public int getCircularRevealScrimColor() {
        this.f3951f.mo5421d();
        throw null;
    }

    public C1200d.C1205e getRevealInfo() {
        this.f3951f.mo5422e();
        throw null;
    }

    public boolean isOpaque() {
        C1198c cVar = this.f3951f;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.mo5423f();
        throw null;
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f3951f.mo5417a(drawable);
        throw null;
    }

    public void setCircularRevealScrimColor(int i) {
        this.f3951f.mo5415a(i);
        throw null;
    }

    public void setRevealInfo(C1200d.C1205e eVar) {
        this.f3951f.mo5418a(eVar);
        throw null;
    }
}
