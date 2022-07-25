package p054c.p083e.p084a.p085a.p101y;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p006b.p026g.p027d.C0780a;

/* renamed from: c.e.a.a.y.a */
public class C1228a {

    /* renamed from: h */
    private static final int[] f3996h = new int[3];

    /* renamed from: i */
    private static final float[] f3997i = {0.0f, 0.5f, 1.0f};

    /* renamed from: j */
    private static final int[] f3998j = new int[4];

    /* renamed from: k */
    private static final float[] f3999k = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f4000a;

    /* renamed from: b */
    private final Paint f4001b;

    /* renamed from: c */
    private final Paint f4002c;

    /* renamed from: d */
    private int f4003d;

    /* renamed from: e */
    private int f4004e;

    /* renamed from: f */
    private int f4005f;

    /* renamed from: g */
    private final Path f4006g;

    public C1228a() {
        this(-16777216);
    }

    public C1228a(int i) {
        this.f4006g = new Path();
        mo5476a(i);
        this.f4001b = new Paint(4);
        this.f4001b.setStyle(Paint.Style.FILL);
        this.f4000a = new Paint();
        this.f4000a.setColor(this.f4003d);
        this.f4002c = new Paint(this.f4001b);
    }

    /* renamed from: a */
    public Paint mo5475a() {
        return this.f4000a;
    }

    /* renamed from: a */
    public void mo5476a(int i) {
        this.f4003d = C0780a.m4354c(i, 68);
        this.f4004e = C0780a.m4354c(i, 20);
        this.f4005f = C0780a.m4354c(i, 0);
    }

    /* renamed from: a */
    public void mo5477a(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(0.0f, (float) (-i));
        int[] iArr = f3996h;
        iArr[0] = this.f4005f;
        iArr[1] = this.f4004e;
        iArr[2] = this.f4003d;
        Paint paint = this.f4002c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f3997i, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f4002c);
        canvas.restore();
    }

    /* renamed from: a */
    public void mo5478a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        RectF rectF2 = rectF;
        int i2 = i;
        float f3 = f2;
        boolean z = f3 < 0.0f;
        Path path = this.f4006g;
        if (z) {
            int[] iArr = f3998j;
            iArr[0] = 0;
            iArr[1] = this.f4005f;
            iArr[2] = this.f4004e;
            iArr[3] = this.f4003d;
            float f4 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f, f3);
            path.close();
            float f5 = (float) (-i2);
            rectF2.inset(f5, f5);
            int[] iArr2 = f3998j;
            iArr2[0] = 0;
            iArr2[1] = this.f4003d;
            iArr2[2] = this.f4004e;
            iArr2[3] = this.f4005f;
        }
        float width = 1.0f - (((float) i2) / (rectF.width() / 2.0f));
        float[] fArr = f3999k;
        fArr[1] = width;
        fArr[2] = ((1.0f - width) / 2.0f) + width;
        this.f4001b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, f3998j, f3999k, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        } else {
            Canvas canvas2 = canvas;
        }
        canvas.drawArc(rectF, f, f2, true, this.f4001b);
        canvas.restore();
    }
}
