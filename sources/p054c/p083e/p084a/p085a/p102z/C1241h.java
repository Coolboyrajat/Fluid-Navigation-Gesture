package p054c.p083e.p084a.p085a.p102z;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: c.e.a.a.z.h */
public class C1241h {

    /* renamed from: a */
    private final C1244i[] f4068a = new C1244i[4];

    /* renamed from: b */
    private final Matrix[] f4069b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f4070c = new Matrix[4];

    /* renamed from: d */
    private final PointF f4071d = new PointF();

    /* renamed from: e */
    private final C1244i f4072e = new C1244i();

    /* renamed from: f */
    private final float[] f4073f = new float[2];

    /* renamed from: g */
    private final float[] f4074g = new float[2];

    /* renamed from: c.e.a.a.z.h$a */
    public interface C1242a {
        /* renamed from: a */
        void mo5526a(C1244i iVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo5527b(C1244i iVar, Matrix matrix, int i);
    }

    /* renamed from: c.e.a.a.z.h$b */
    static final class C1243b {

        /* renamed from: a */
        public final C1238g f4075a;

        /* renamed from: b */
        public final Path f4076b;

        /* renamed from: c */
        public final RectF f4077c;

        /* renamed from: d */
        public final C1242a f4078d;

        /* renamed from: e */
        public final float f4079e;

        C1243b(C1238g gVar, float f, RectF rectF, C1242a aVar, Path path) {
            this.f4078d = aVar;
            this.f4075a = gVar;
            this.f4079e = f;
            this.f4077c = rectF;
            this.f4076b = path;
        }
    }

    public C1241h() {
        for (int i = 0; i < 4; i++) {
            this.f4068a[i] = new C1244i();
            this.f4069b[i] = new Matrix();
            this.f4070c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m6008a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: a */
    private float m6009a(RectF rectF, int i) {
        float centerX;
        float f;
        float[] fArr = this.f4073f;
        C1244i[] iVarArr = this.f4068a;
        fArr[0] = iVarArr[i].f4082c;
        fArr[1] = iVarArr[i].f4083d;
        this.f4069b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            centerX = rectF.centerX();
            f = this.f4073f[0];
        } else {
            centerX = rectF.centerY();
            f = this.f4073f[1];
        }
        return Math.abs(centerX - f);
    }

    /* renamed from: a */
    private C1230a m6010a(int i, C1238g gVar) {
        return i != 1 ? i != 2 ? i != 3 ? gVar.mo5539h() : gVar.mo5538g() : gVar.mo5532b() : gVar.mo5534c();
    }

    /* renamed from: a */
    private void m6011a(int i, RectF rectF, PointF pointF) {
        float f;
        float f2;
        float f3;
        if (i == 1) {
            f3 = rectF.right;
            f2 = rectF.bottom;
        } else if (i != 2) {
            f = i != 3 ? rectF.right : rectF.left;
            f2 = rectF.top;
        } else {
            f3 = rectF.left;
            f2 = rectF.bottom;
        }
        pointF.set(f, f2);
    }

    /* renamed from: a */
    private void m6012a(C1243b bVar, int i) {
        this.f4073f[0] = this.f4068a[i].mo5569c();
        this.f4073f[1] = this.f4068a[i].mo5570d();
        this.f4069b[i].mapPoints(this.f4073f);
        Path path = bVar.f4076b;
        float[] fArr = this.f4073f;
        if (i == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f4068a[i].mo5566a(this.f4069b[i], bVar.f4076b);
        C1242a aVar = bVar.f4078d;
        if (aVar != null) {
            aVar.mo5527b(this.f4068a[i], this.f4069b[i], i);
        }
    }

    /* renamed from: b */
    private C1232c m6013b(int i, C1238g gVar) {
        return i != 1 ? i != 2 ? i != 3 ? gVar.mo5536e() : gVar.mo5537f() : gVar.mo5535d() : gVar.mo5530a();
    }

    /* renamed from: b */
    private void m6014b(int i) {
        this.f4073f[0] = this.f4068a[i].mo5561a();
        this.f4073f[1] = this.f4068a[i].mo5567b();
        this.f4069b[i].mapPoints(this.f4073f);
        float a = m6008a(i);
        this.f4070c[i].reset();
        Matrix matrix = this.f4070c[i];
        float[] fArr = this.f4073f;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f4070c[i].preRotate(a);
    }

    /* renamed from: b */
    private void m6015b(C1243b bVar, int i) {
        int i2 = (i + 1) % 4;
        this.f4073f[0] = this.f4068a[i].mo5561a();
        this.f4073f[1] = this.f4068a[i].mo5567b();
        this.f4069b[i].mapPoints(this.f4073f);
        this.f4074g[0] = this.f4068a[i2].mo5569c();
        this.f4074g[1] = this.f4068a[i2].mo5570d();
        this.f4069b[i2].mapPoints(this.f4074g);
        float[] fArr = this.f4073f;
        float f = fArr[0];
        float[] fArr2 = this.f4074g;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float a = m6009a(bVar.f4077c, i);
        this.f4072e.mo5568b(0.0f, 0.0f);
        m6013b(i, bVar.f4075a).mo5485a(max, a, bVar.f4079e, this.f4072e);
        this.f4072e.mo5566a(this.f4070c[i], bVar.f4076b);
        C1242a aVar = bVar.f4078d;
        if (aVar != null) {
            aVar.mo5526a(this.f4072e, this.f4070c[i], i);
        }
    }

    /* renamed from: c */
    private void m6016c(C1243b bVar, int i) {
        m6010a(i, bVar.f4075a).mo5484a(90.0f, bVar.f4079e, this.f4068a[i]);
        float a = m6008a(i);
        this.f4069b[i].reset();
        m6011a(i, bVar.f4077c, this.f4071d);
        Matrix matrix = this.f4069b[i];
        PointF pointF = this.f4071d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f4069b[i].preRotate(a);
    }

    /* renamed from: a */
    public void mo5559a(C1238g gVar, float f, RectF rectF, Path path) {
        mo5560a(gVar, f, rectF, (C1242a) null, path);
    }

    /* renamed from: a */
    public void mo5560a(C1238g gVar, float f, RectF rectF, C1242a aVar, Path path) {
        path.rewind();
        C1243b bVar = new C1243b(gVar, f, rectF, aVar, path);
        for (int i = 0; i < 4; i++) {
            m6016c(bVar, i);
            m6014b(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m6012a(bVar, i2);
            m6015b(bVar, i2);
        }
        path.close();
    }
}
