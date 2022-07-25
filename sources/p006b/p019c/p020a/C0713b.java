package p006b.p019c.p020a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import p006b.p019c.p020a.C0721h;

/* renamed from: b.c.a.b */
class C0713b extends C0716d {

    /* renamed from: b.c.a.b$a */
    class C0714a implements C0721h.C0722a {
        C0714a(C0713b bVar) {
        }

        /* renamed from: a */
        public void mo4014a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    C0713b() {
    }

    /* renamed from: a */
    public void mo4013a() {
        C0721h.f2795r = new C0714a(this);
    }
}
