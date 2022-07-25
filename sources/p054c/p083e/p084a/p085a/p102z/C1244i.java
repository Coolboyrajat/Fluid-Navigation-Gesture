package p054c.p083e.p084a.p085a.p102z;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p054c.p083e.p084a.p085a.p101y.C1228a;

/* renamed from: c.e.a.a.z.i */
public class C1244i {
    @Deprecated

    /* renamed from: a */
    public float f4080a;
    @Deprecated

    /* renamed from: b */
    public float f4081b;
    @Deprecated

    /* renamed from: c */
    public float f4082c;
    @Deprecated

    /* renamed from: d */
    public float f4083d;
    @Deprecated

    /* renamed from: e */
    public float f4084e;
    @Deprecated

    /* renamed from: f */
    public float f4085f;

    /* renamed from: g */
    private final List<C1250f> f4086g = new ArrayList();

    /* renamed from: h */
    private final List<C1251g> f4087h = new ArrayList();

    /* renamed from: c.e.a.a.z.i$a */
    class C1245a extends C1251g {

        /* renamed from: b */
        final /* synthetic */ List f4088b;

        /* renamed from: c */
        final /* synthetic */ Matrix f4089c;

        C1245a(C1244i iVar, List list, Matrix matrix) {
            this.f4088b = list;
            this.f4089c = matrix;
        }

        /* renamed from: a */
        public void mo5571a(Matrix matrix, C1228a aVar, int i, Canvas canvas) {
            for (C1251g a : this.f4088b) {
                a.mo5571a(this.f4089c, aVar, i, canvas);
            }
        }
    }

    /* renamed from: c.e.a.a.z.i$b */
    static class C1246b extends C1251g {

        /* renamed from: b */
        private final C1248d f4090b;

        public C1246b(C1248d dVar) {
            this.f4090b = dVar;
        }

        /* renamed from: a */
        public void mo5571a(Matrix matrix, C1228a aVar, int i, Canvas canvas) {
            float e = this.f4090b.m6056d();
            float f = this.f4090b.m6059e();
            aVar.mo5478a(canvas, matrix, new RectF(this.f4090b.m6049b(), this.f4090b.m6062f(), this.f4090b.m6053c(), this.f4090b.m6045a()), i, e, f);
        }
    }

    /* renamed from: c.e.a.a.z.i$c */
    static class C1247c extends C1251g {

        /* renamed from: b */
        private final C1249e f4091b;

        /* renamed from: c */
        private final float f4092c;

        /* renamed from: d */
        private final float f4093d;

        public C1247c(C1249e eVar, float f, float f2) {
            this.f4091b = eVar;
            this.f4092c = f;
            this.f4093d = f2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public float mo5572a() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f4091b.f4102c - this.f4093d) / (this.f4091b.f4101b - this.f4092c))));
        }

        /* renamed from: a */
        public void mo5571a(Matrix matrix, C1228a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f4091b.f4102c - this.f4093d), (double) (this.f4091b.f4101b - this.f4092c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f4092c, this.f4093d);
            matrix2.preRotate(mo5572a());
            aVar.mo5477a(canvas, matrix2, rectF, i);
        }
    }

    /* renamed from: c.e.a.a.z.i$d */
    public static class C1248d extends C1250f {

        /* renamed from: h */
        private static final RectF f4094h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f4095b;
        @Deprecated

        /* renamed from: c */
        public float f4096c;
        @Deprecated

        /* renamed from: d */
        public float f4097d;
        @Deprecated

        /* renamed from: e */
        public float f4098e;
        @Deprecated

        /* renamed from: f */
        public float f4099f;
        @Deprecated

        /* renamed from: g */
        public float f4100g;

        public C1248d(float f, float f2, float f3, float f4) {
            m6051b(f);
            m6064f(f2);
            m6055c(f3);
            m6047a(f4);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public float m6045a() {
            return this.f4098e;
        }

        /* renamed from: a */
        private void m6047a(float f) {
            this.f4098e = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public float m6049b() {
            return this.f4095b;
        }

        /* renamed from: b */
        private void m6051b(float f) {
            this.f4095b = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public float m6053c() {
            return this.f4097d;
        }

        /* renamed from: c */
        private void m6055c(float f) {
            this.f4097d = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public float m6056d() {
            return this.f4099f;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m6058d(float f) {
            this.f4099f = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public float m6059e() {
            return this.f4100g;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m6061e(float f) {
            this.f4100g = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public float m6062f() {
            return this.f4096c;
        }

        /* renamed from: f */
        private void m6064f(float f) {
            this.f4096c = f;
        }

        /* renamed from: a */
        public void mo5573a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4103a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            f4094h.set(m6049b(), m6062f(), m6053c(), m6045a());
            path.arcTo(f4094h, m6056d(), m6059e(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: c.e.a.a.z.i$e */
    public static class C1249e extends C1250f {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f4101b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f4102c;

        /* renamed from: a */
        public void mo5573a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4103a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f4101b, this.f4102c);
            path.transform(matrix);
        }
    }

    /* renamed from: c.e.a.a.z.i$f */
    public static abstract class C1250f {

        /* renamed from: a */
        protected final Matrix f4103a = new Matrix();

        /* renamed from: a */
        public abstract void mo5573a(Matrix matrix, Path path);
    }

    /* renamed from: c.e.a.a.z.i$g */
    static abstract class C1251g {

        /* renamed from: a */
        static final Matrix f4104a = new Matrix();

        C1251g() {
        }

        /* renamed from: a */
        public abstract void mo5571a(Matrix matrix, C1228a aVar, int i, Canvas canvas);

        /* renamed from: a */
        public final void mo5574a(C1228a aVar, int i, Canvas canvas) {
            mo5571a(f4104a, aVar, i, canvas);
        }
    }

    public C1244i() {
        mo5568b(0.0f, 0.0f);
    }

    /* renamed from: a */
    private void m6021a(float f) {
        if (m6026e() != f) {
            float e = ((f - m6026e()) + 360.0f) % 360.0f;
            if (e <= 180.0f) {
                C1248d dVar = new C1248d(mo5561a(), mo5567b(), mo5561a(), mo5567b());
                dVar.m6058d(m6026e());
                dVar.m6061e(e);
                this.f4087h.add(new C1246b(dVar));
                m6023b(f);
            }
        }
    }

    /* renamed from: a */
    private void m6022a(C1251g gVar, float f, float f2) {
        m6021a(f);
        this.f4087h.add(gVar);
        m6023b(f2);
    }

    /* renamed from: b */
    private void m6023b(float f) {
        this.f4084e = f;
    }

    /* renamed from: c */
    private void m6024c(float f) {
        this.f4085f = f;
    }

    /* renamed from: d */
    private void m6025d(float f) {
        this.f4082c = f;
    }

    /* renamed from: e */
    private float m6026e() {
        return this.f4084e;
    }

    /* renamed from: e */
    private void m6027e(float f) {
        this.f4083d = f;
    }

    /* renamed from: f */
    private float m6028f() {
        return this.f4085f;
    }

    /* renamed from: f */
    private void m6029f(float f) {
        this.f4080a = f;
    }

    /* renamed from: g */
    private void m6030g(float f) {
        this.f4081b = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo5561a() {
        return this.f4082c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1251g mo5562a(Matrix matrix) {
        m6021a(m6028f());
        return new C1245a(this, new ArrayList(this.f4087h), matrix);
    }

    /* renamed from: a */
    public void mo5563a(float f, float f2) {
        C1249e eVar = new C1249e();
        float unused = eVar.f4101b = f;
        float unused2 = eVar.f4102c = f2;
        this.f4086g.add(eVar);
        C1247c cVar = new C1247c(eVar, mo5561a(), mo5567b());
        m6022a(cVar, cVar.mo5572a() + 270.0f, cVar.mo5572a() + 270.0f);
        m6025d(f);
        m6027e(f2);
    }

    /* renamed from: a */
    public void mo5564a(float f, float f2, float f3, float f4) {
        m6029f(f);
        m6030g(f2);
        m6025d(f);
        m6027e(f2);
        m6023b(f3);
        m6024c((f3 + f4) % 360.0f);
        this.f4086g.clear();
        this.f4087h.clear();
    }

    /* renamed from: a */
    public void mo5565a(float f, float f2, float f3, float f4, float f5, float f6) {
        C1248d dVar = new C1248d(f, f2, f3, f4);
        dVar.m6058d(f5);
        dVar.m6061e(f6);
        this.f4086g.add(dVar);
        C1246b bVar = new C1246b(dVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m6022a(bVar, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = (double) f7;
        m6025d(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m6027e(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: a */
    public void mo5566a(Matrix matrix, Path path) {
        int size = this.f4086g.size();
        for (int i = 0; i < size; i++) {
            this.f4086g.get(i).mo5573a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo5567b() {
        return this.f4083d;
    }

    /* renamed from: b */
    public void mo5568b(float f, float f2) {
        mo5564a(f, f2, 270.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo5569c() {
        return this.f4080a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo5570d() {
        return this.f4081b;
    }
}
