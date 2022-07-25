package p054c.p083e.p084a.p085a.p100x;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0329b;
import p054c.p083e.p084a.p085a.p102z.C1233d;
import p054c.p083e.p084a.p085a.p102z.C1238g;
import p054c.p083e.p084a.p085a.p102z.C1252j;

/* renamed from: c.e.a.a.x.a */
public class C1224a extends Drawable implements C1252j, C0329b {

    /* renamed from: f */
    private C1226b f3990f;

    /* renamed from: c.e.a.a.x.a$b */
    static final class C1226b extends Drawable.ConstantState {

        /* renamed from: a */
        C1233d f3991a;

        /* renamed from: b */
        boolean f3992b;

        public C1226b(C1226b bVar) {
            this.f3991a = (C1233d) bVar.f3991a.getConstantState().newDrawable();
            this.f3992b = bVar.f3992b;
        }

        public C1226b(C1233d dVar) {
            this.f3991a = dVar;
            this.f3992b = false;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public C1224a newDrawable() {
            return new C1224a(new C1226b(this));
        }
    }

    private C1224a(C1226b bVar) {
        this.f3990f = bVar;
    }

    public C1224a(C1238g gVar) {
        this(new C1226b(new C1233d(gVar)));
    }

    public void draw(Canvas canvas) {
        C1226b bVar = this.f3990f;
        if (bVar.f3992b) {
            bVar.f3991a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f3990f;
    }

    public int getOpacity() {
        return this.f3990f.f3991a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    public C1224a mutate() {
        this.f3990f = new C1226b(this.f3990f);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3990f.f3991a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f3990f.f3991a.setState(iArr)) {
            onStateChange = true;
        }
        boolean a = C1227b.m5884a(iArr);
        C1226b bVar = this.f3990f;
        if (bVar.f3992b == a) {
            return onStateChange;
        }
        bVar.f3992b = a;
        return true;
    }

    public void setAlpha(int i) {
        this.f3990f.f3991a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3990f.f3991a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(C1238g gVar) {
        this.f3990f.f3991a.setShapeAppearanceModel(gVar);
    }

    public void setTint(int i) {
        this.f3990f.f3991a.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f3990f.f3991a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f3990f.f3991a.setTintMode(mode);
    }
}
