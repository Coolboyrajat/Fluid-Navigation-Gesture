package com.p131fb.fluid.services.p145e.p146g;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.p131fb.fluid.services.p145e.p146g.C1966c;
import java.util.List;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.services.e.g.a */
public abstract class C1960a implements C1966c {

    /* renamed from: b */
    private final Path f5440b = new Path();

    public C1960a() {
        new Paint();
    }

    /* renamed from: a */
    public static /* synthetic */ void m7998a(C1960a aVar, Canvas canvas, Paint paint, List list, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                z = false;
            }
            aVar.mo6783a(canvas, paint, list, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCubicBezier");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6783a(Canvas canvas, Paint paint, List<? extends PointF> list, boolean z) {
        C3370k.m12227b(canvas, "canvas");
        C3370k.m12227b(paint, "paint");
        C3370k.m12227b(list, "points");
        Path path = this.f5440b;
        path.reset();
        path.moveTo(((PointF) list.get(0)).x, ((PointF) list.get(0)).y);
        path.cubicTo(((PointF) list.get(1)).x, ((PointF) list.get(1)).y, ((PointF) list.get(2)).x, ((PointF) list.get(2)).y, ((PointF) list.get(3)).x, ((PointF) list.get(3)).y);
        path.cubicTo(((PointF) list.get(4)).x, ((PointF) list.get(4)).y, ((PointF) list.get(5)).x, ((PointF) list.get(5)).y, ((PointF) list.get(6)).x, ((PointF) list.get(6)).y);
        canvas.drawPath(path, paint);
        if (z) {
            mo6785a(canvas, list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6784a(Canvas canvas, Drawable drawable, int i, int i2, int i3, float f) {
        C3370k.m12227b(canvas, "canvas");
        if (drawable != null) {
            int i4 = i3 / 2;
            drawable.setBounds(new Rect(i - i4, i2 - i4, i + i4, i2 + i4));
            drawable.setAlpha((int) (((float) 255) * f));
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6785a(Canvas canvas, List<? extends PointF> list) {
        C3370k.m12227b(canvas, "canvas");
        C3370k.m12227b(list, "points");
    }

    /* renamed from: g */
    public int mo6786g() {
        return C1966c.C1968b.m8058a(this);
    }

    /* renamed from: h */
    public int mo6787h() {
        return C1966c.C1968b.m8059b(this);
    }
}
