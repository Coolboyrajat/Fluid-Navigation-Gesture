package p006b.p019c.p020a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p006b.p019c.p020a.C0721h;

/* renamed from: b.c.a.d */
class C0716d implements C0719f {

    /* renamed from: a */
    final RectF f2781a = new RectF();

    /* renamed from: b.c.a.d$a */
    class C0717a implements C0721h.C0722a {
        C0717a() {
        }

        /* renamed from: a */
        public void mo4014a(Canvas canvas, RectF rectF, float f, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C0716d.this.f2781a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                Paint paint2 = paint;
                canvas.drawArc(C0716d.this.f2781a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0716d.this.f2781a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0716d.this.f2781a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0716d.this.f2781a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f5 = rectF2.top;
                canvas.drawRect((rectF2.left + f3) - 1.0f, f5, (rectF2.right - f3) + 1.0f, f5 + f3, paint2);
                float f6 = rectF2.bottom;
                Canvas canvas3 = canvas;
                canvas3.drawRect((rectF2.left + f3) - 1.0f, f6 - f3, (rectF2.right - f3) + 1.0f, f6, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
        }
    }

    C0716d() {
    }

    /* renamed from: j */
    private C0721h m3895j(C0718e eVar) {
        return (C0721h) eVar.mo4033c();
    }

    /* renamed from: a */
    public float mo4015a(C0718e eVar) {
        return m3895j(eVar).mo4058c();
    }

    /* renamed from: a */
    public void mo4013a() {
        C0721h.f2795r = new C0717a();
    }

    /* renamed from: a */
    public void mo4016a(C0718e eVar, float f) {
        m3895j(eVar).mo4059c(f);
    }

    /* renamed from: a */
    public void mo4017a(C0718e eVar, ColorStateList colorStateList) {
        m3895j(eVar).mo4053a(colorStateList);
    }

    /* renamed from: b */
    public float mo4018b(C0718e eVar) {
        return m3895j(eVar).mo4056b();
    }

    /* renamed from: b */
    public void mo4019b(C0718e eVar, float f) {
        m3895j(eVar).mo4052a(f);
        mo4028i(eVar);
    }

    /* renamed from: c */
    public float mo4020c(C0718e eVar) {
        return m3895j(eVar).mo4060d();
    }

    /* renamed from: c */
    public void mo4021c(C0718e eVar, float f) {
        m3895j(eVar).mo4057b(f);
        mo4028i(eVar);
    }

    /* renamed from: d */
    public float mo4022d(C0718e eVar) {
        return m3895j(eVar).mo4062e();
    }

    /* renamed from: e */
    public void mo4023e(C0718e eVar) {
    }

    /* renamed from: f */
    public ColorStateList mo4024f(C0718e eVar) {
        return m3895j(eVar).mo4051a();
    }

    /* renamed from: g */
    public void mo4025g(C0718e eVar) {
        m3895j(eVar).mo4055a(eVar.mo4034d());
        mo4028i(eVar);
    }

    /* renamed from: h */
    public float mo4026h(C0718e eVar) {
        return m3895j(eVar).mo4063f();
    }

    /* renamed from: i */
    public void mo4028i(C0718e eVar) {
        Rect rect = new Rect();
        m3895j(eVar).mo4054a(rect);
        eVar.mo4030a((int) Math.ceil((double) mo4022d(eVar)), (int) Math.ceil((double) mo4020c(eVar)));
        eVar.mo4031a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
